package hn;

import androidx.fragment.app.a0;
import cn.sharesdk.framework.InnerShareParams;
import com.huawei.hms.framework.common.hianalytics.CrashHianalyticsData;
import gm.l;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.security.GeneralSecurityException;
import java.security.KeyStore;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import zm.v;

/* loaded from: classes2.dex */
public class k {

    /* renamed from: a */
    public static volatile k f16186a;

    /* renamed from: b */
    public static final Logger f16187b;

    /* renamed from: c */
    public static final a f16188c = new a();

    /* loaded from: classes2.dex */
    public static final class a {
        public static ArrayList a(List list) {
            boolean z10;
            l.f(list, "protocols");
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                if (((v) obj) != v.HTTP_1_0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    arrayList.add(obj);
                }
            }
            ArrayList arrayList2 = new ArrayList(ul.l.B(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(((v) it.next()).f32749a);
            }
            return arrayList2;
        }

        public static byte[] b(List list) {
            l.f(list, "protocols");
            ln.e eVar = new ln.e();
            Iterator it = a(list).iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                eVar.b0(str.length());
                eVar.p0(str);
            }
            return eVar.F(eVar.f20098b);
        }

        public static boolean c() {
            return l.a("Dalvik", System.getProperty("java.vm.name"));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:116:0x00b3, code lost:
        if (r0 != null) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x00dc, code lost:
        if (r0 != null) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x0105, code lost:
        if (r0 != null) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x0130, code lost:
        if (java.lang.Integer.parseInt(r0) >= 9) goto L70;
     */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0199  */
    static {
        /*
            Method dump skipped, instructions count: 429
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: hn.k.<clinit>():void");
    }

    public static void i(int i10, String str, Throwable th2) {
        l.f(str, CrashHianalyticsData.MESSAGE);
        f16187b.log(i10 == 5 ? Level.WARNING : Level.INFO, str, th2);
    }

    public void a(SSLSocket sSLSocket) {
    }

    public a0 b(X509TrustManager x509TrustManager) {
        return new kn.a(c(x509TrustManager));
    }

    public kn.d c(X509TrustManager x509TrustManager) {
        X509Certificate[] acceptedIssuers = x509TrustManager.getAcceptedIssuers();
        l.e(acceptedIssuers, "trustManager.acceptedIssuers");
        return new kn.b((X509Certificate[]) Arrays.copyOf(acceptedIssuers, acceptedIssuers.length));
    }

    public void d(SSLSocket sSLSocket, String str, List<v> list) {
        l.f(list, "protocols");
    }

    public void e(Socket socket, InetSocketAddress inetSocketAddress, int i10) {
        l.f(inetSocketAddress, InnerShareParams.ADDRESS);
        socket.connect(inetSocketAddress, i10);
    }

    public String f(SSLSocket sSLSocket) {
        return null;
    }

    public Object g() {
        if (f16187b.isLoggable(Level.FINE)) {
            return new Throwable("response.body().close()");
        }
        return null;
    }

    public boolean h(String str) {
        l.f(str, "hostname");
        return true;
    }

    public void j(Object obj, String str) {
        l.f(str, CrashHianalyticsData.MESSAGE);
        if (obj == null) {
            str = a.b.b(str, " To see where this was allocated, set the OkHttpClient logger level to FINE: Logger.getLogger(OkHttpClient.class.getName()).setLevel(Level.FINE);");
        }
        i(5, str, (Throwable) obj);
    }

    public SSLContext k() {
        SSLContext sSLContext = SSLContext.getInstance("TLS");
        l.e(sSLContext, "SSLContext.getInstance(\"TLS\")");
        return sSLContext;
    }

    public SSLSocketFactory l(X509TrustManager x509TrustManager) {
        try {
            SSLContext k10 = k();
            k10.init(null, new TrustManager[]{x509TrustManager}, null);
            SSLSocketFactory socketFactory = k10.getSocketFactory();
            l.e(socketFactory, "newSSLContext().apply {\n…ll)\n      }.socketFactory");
            return socketFactory;
        } catch (GeneralSecurityException e10) {
            throw new AssertionError("No System TLS: " + e10, e10);
        }
    }

    public X509TrustManager m() {
        TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
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

    public final String toString() {
        return getClass().getSimpleName();
    }
}
