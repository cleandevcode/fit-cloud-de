package hn;

import gm.l;
import hn.k;
import java.security.KeyStore;
import java.security.Provider;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import org.bouncycastle.jsse.BCSSLParameters;
import org.bouncycastle.jsse.BCSSLSocket;
import org.bouncycastle.jsse.provider.BouncyCastleJsseProvider;
import zm.v;

/* loaded from: classes2.dex */
public final class d extends k {

    /* renamed from: e */
    public static final boolean f16166e;

    /* renamed from: f */
    public static final a f16167f;

    /* renamed from: d */
    public final Provider f16168d = new BouncyCastleJsseProvider();

    /* loaded from: classes2.dex */
    public static final class a {
    }

    static {
        a aVar = new a();
        f16167f = aVar;
        boolean z10 = false;
        try {
            Class.forName("org.bouncycastle.jsse.provider.BouncyCastleJsseProvider", false, aVar.getClass().getClassLoader());
            z10 = true;
        } catch (ClassNotFoundException unused) {
        }
        f16166e = z10;
    }

    @Override // hn.k
    public final void d(SSLSocket sSLSocket, String str, List<v> list) {
        l.f(list, "protocols");
        if (!(sSLSocket instanceof BCSSLSocket)) {
            super.d(sSLSocket, str, list);
            return;
        }
        BCSSLSocket bCSSLSocket = (BCSSLSocket) sSLSocket;
        BCSSLParameters parameters = bCSSLSocket.getParameters();
        k.f16188c.getClass();
        ArrayList a10 = k.a.a(list);
        l.e(parameters, "sslParameters");
        Object[] array = a10.toArray(new String[0]);
        if (array == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
        }
        parameters.setApplicationProtocols((String[]) array);
        bCSSLSocket.setParameters(parameters);
    }

    @Override // hn.k
    public final String f(SSLSocket sSLSocket) {
        String applicationProtocol;
        if (!(sSLSocket instanceof BCSSLSocket) || (applicationProtocol = ((BCSSLSocket) sSLSocket).getApplicationProtocol()) == null || (applicationProtocol.hashCode() == 0 && applicationProtocol.equals(""))) {
            return null;
        }
        return applicationProtocol;
    }

    @Override // hn.k
    public final SSLContext k() {
        SSLContext sSLContext = SSLContext.getInstance("TLS", this.f16168d);
        l.e(sSLContext, "SSLContext.getInstance(\"TLS\", provider)");
        return sSLContext;
    }

    @Override // hn.k
    public final X509TrustManager m() {
        TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance("PKIX", "BCJSSE");
        trustManagerFactory.init((KeyStore) null);
        TrustManager[] trustManagers = trustManagerFactory.getTrustManagers();
        l.c(trustManagers);
        boolean z10 = true;
        if ((trustManagers.length == 1 && (trustManagers[0] instanceof X509TrustManager)) ? false : false) {
            TrustManager trustManager = trustManagers[0];
            if (trustManager != null) {
                return (X509TrustManager) trustManager;
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
