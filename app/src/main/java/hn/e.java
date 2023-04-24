package hn;

import gm.l;
import hn.k;
import java.security.KeyStore;
import java.security.Provider;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import org.conscrypt.Conscrypt;
import org.conscrypt.ConscryptHostnameVerifier;
import zm.v;

/* loaded from: classes2.dex */
public final class e extends k {

    /* renamed from: e */
    public static final boolean f16169e;

    /* renamed from: f */
    public static final a f16170f = new a(0);

    /* renamed from: d */
    public final Provider f16171d;

    /* loaded from: classes2.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(int i10) {
            this();
        }

        public static boolean a() {
            Conscrypt.Version version = Conscrypt.version();
            return version.major() != 2 ? version.major() > 2 : version.minor() != 1 ? version.minor() > 1 : version.patch() >= 0;
        }

        public static boolean b() {
            return e.f16169e;
        }
    }

    /* loaded from: classes2.dex */
    public static final class b implements ConscryptHostnameVerifier {

        /* renamed from: a */
        public static final b f16172a = new b();
    }

    static {
        boolean z10 = false;
        try {
            Class.forName("org.conscrypt.Conscrypt$Version", false, a.class.getClassLoader());
            if (Conscrypt.isAvailable()) {
                if (a.a()) {
                    z10 = true;
                }
            }
        } catch (ClassNotFoundException | NoClassDefFoundError unused) {
        }
        f16169e = z10;
    }

    public e() {
        Provider newProvider = Conscrypt.newProvider();
        l.e(newProvider, "Conscrypt.newProvider()");
        this.f16171d = newProvider;
    }

    @Override // hn.k
    public final void d(SSLSocket sSLSocket, String str, List<v> list) {
        l.f(list, "protocols");
        if (!Conscrypt.isConscrypt(sSLSocket)) {
            super.d(sSLSocket, str, list);
            return;
        }
        Conscrypt.setUseSessionTickets(sSLSocket, true);
        k.f16188c.getClass();
        Object[] array = k.a.a(list).toArray(new String[0]);
        if (array == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
        }
        Conscrypt.setApplicationProtocols(sSLSocket, (String[]) array);
    }

    @Override // hn.k
    public final String f(SSLSocket sSLSocket) {
        if (Conscrypt.isConscrypt(sSLSocket)) {
            return Conscrypt.getApplicationProtocol(sSLSocket);
        }
        return null;
    }

    @Override // hn.k
    public final SSLContext k() {
        SSLContext sSLContext = SSLContext.getInstance("TLS", this.f16171d);
        l.e(sSLContext, "SSLContext.getInstance(\"TLS\", provider)");
        return sSLContext;
    }

    @Override // hn.k
    public final SSLSocketFactory l(X509TrustManager x509TrustManager) {
        SSLContext k10 = k();
        k10.init(null, new TrustManager[]{x509TrustManager}, null);
        SSLSocketFactory socketFactory = k10.getSocketFactory();
        l.e(socketFactory, "newSSLContext().apply {\n…null)\n    }.socketFactory");
        return socketFactory;
    }

    @Override // hn.k
    public final X509TrustManager m() {
        TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
        trustManagerFactory.init((KeyStore) null);
        TrustManager[] trustManagers = trustManagerFactory.getTrustManagers();
        l.c(trustManagers);
        boolean z10 = true;
        if ((trustManagers.length == 1 && (trustManagers[0] instanceof X509TrustManager)) ? false : false) {
            TrustManager trustManager = trustManagers[0];
            if (trustManager != null) {
                X509TrustManager x509TrustManager = (X509TrustManager) trustManager;
                Conscrypt.setHostnameVerifier(x509TrustManager, b.f16172a);
                return x509TrustManager;
            }
            throw new NullPointerException("null cannot be cast to non-null type javax.net.ssl.X509TrustManager");
        }
        StringBuilder a10 = android.support.v4.media.d.a("Unexpected default trust managers: ");
        String arrays = Arrays.toString(trustManagers);
        l.e(arrays, "java.util.Arrays.toString(this)");
        a10.append(arrays);
        throw new IllegalStateException(a10.toString().toString());
    }
}
