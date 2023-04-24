package hn;

import android.net.http.X509TrustManagerExtensions;
import android.os.Build;
import android.security.NetworkSecurityPolicy;
import androidx.fragment.app.a0;
import cn.sharesdk.framework.InnerShareParams;
import com.huawei.hms.framework.common.hianalytics.CrashHianalyticsData;
import gm.l;
import hn.k;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.security.cert.TrustAnchor;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.X509TrustManager;
import zm.v;

/* loaded from: classes2.dex */
public final class c extends k {

    /* renamed from: f */
    public static final boolean f16160f;

    /* renamed from: g */
    public static final a f16161g = new a();

    /* renamed from: d */
    public final ArrayList f16162d;

    /* renamed from: e */
    public final in.h f16163e;

    /* loaded from: classes2.dex */
    public static final class a {
    }

    /* loaded from: classes2.dex */
    public static final class b implements kn.d {

        /* renamed from: a */
        public final X509TrustManager f16164a;

        /* renamed from: b */
        public final Method f16165b;

        public b(X509TrustManager x509TrustManager, Method method) {
            this.f16164a = x509TrustManager;
            this.f16165b = method;
        }

        @Override // kn.d
        public final X509Certificate a(X509Certificate x509Certificate) {
            try {
                Object invoke = this.f16165b.invoke(this.f16164a, x509Certificate);
                if (invoke != null) {
                    return ((TrustAnchor) invoke).getTrustedCert();
                }
                throw new NullPointerException("null cannot be cast to non-null type java.security.cert.TrustAnchor");
            } catch (IllegalAccessException e10) {
                throw new AssertionError("unable to get issues and signature", e10);
            } catch (InvocationTargetException unused) {
                return null;
            }
        }

        public final boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof b) {
                    b bVar = (b) obj;
                    return l.a(this.f16164a, bVar.f16164a) && l.a(this.f16165b, bVar.f16165b);
                }
                return false;
            }
            return true;
        }

        public final int hashCode() {
            X509TrustManager x509TrustManager = this.f16164a;
            int hashCode = (x509TrustManager != null ? x509TrustManager.hashCode() : 0) * 31;
            Method method = this.f16165b;
            return hashCode + (method != null ? method.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder a10 = android.support.v4.media.d.a("CustomTrustRootIndex(trustManager=");
            a10.append(this.f16164a);
            a10.append(", findByIssuerAndSignatureMethod=");
            a10.append(this.f16165b);
            a10.append(")");
            return a10.toString();
        }
    }

    static {
        boolean z10;
        k.f16188c.getClass();
        if (!k.a.c() || Build.VERSION.SDK_INT >= 30) {
            z10 = false;
        } else {
            z10 = true;
        }
        f16160f = z10;
    }

    public c() {
        in.l lVar;
        Method method;
        Method method2;
        in.k[] kVarArr = new in.k[4];
        Method method3 = null;
        try {
            lVar = new in.l(Class.forName("com.android.org.conscrypt.OpenSSLSocketImpl"), Class.forName("com.android.org.conscrypt.OpenSSLSocketFactoryImpl"), Class.forName("com.android.org.conscrypt.SSLParametersImpl"));
        } catch (Exception e10) {
            k.f16188c.getClass();
            k.f16186a.getClass();
            k.i(5, "unable to load android socket classes", e10);
            lVar = null;
        }
        kVarArr[0] = lVar;
        kVarArr[1] = new in.j(in.f.f17211f);
        kVarArr[2] = new in.j(in.i.f17221a);
        kVarArr[3] = new in.j(in.g.f17217a);
        ArrayList A = ul.i.A(kVarArr);
        ArrayList arrayList = new ArrayList();
        Iterator it = A.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (((in.k) next).b()) {
                arrayList.add(next);
            }
        }
        this.f16162d = arrayList;
        try {
            Class<?> cls = Class.forName("dalvik.system.CloseGuard");
            Method method4 = cls.getMethod("get", new Class[0]);
            method2 = cls.getMethod("open", String.class);
            method = cls.getMethod("warnIfOpen", new Class[0]);
            method3 = method4;
        } catch (Exception unused) {
            method = null;
            method2 = null;
        }
        this.f16163e = new in.h(method3, method2, method);
    }

    @Override // hn.k
    public final a0 b(X509TrustManager x509TrustManager) {
        X509TrustManagerExtensions x509TrustManagerExtensions;
        in.b bVar = null;
        try {
            x509TrustManagerExtensions = new X509TrustManagerExtensions(x509TrustManager);
        } catch (IllegalArgumentException unused) {
            x509TrustManagerExtensions = null;
        }
        if (x509TrustManagerExtensions != null) {
            bVar = new in.b(x509TrustManager, x509TrustManagerExtensions);
        }
        if (bVar == null) {
            return new kn.a(c(x509TrustManager));
        }
        return bVar;
    }

    @Override // hn.k
    public final kn.d c(X509TrustManager x509TrustManager) {
        try {
            Method declaredMethod = x509TrustManager.getClass().getDeclaredMethod("findTrustAnchorByIssuerAndSignature", X509Certificate.class);
            l.e(declaredMethod, "method");
            declaredMethod.setAccessible(true);
            return new b(x509TrustManager, declaredMethod);
        } catch (NoSuchMethodException unused) {
            return super.c(x509TrustManager);
        }
    }

    @Override // hn.k
    public final void d(SSLSocket sSLSocket, String str, List<v> list) {
        Object obj;
        l.f(list, "protocols");
        Iterator it = this.f16162d.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((in.k) obj).a(sSLSocket)) {
                break;
            }
        }
        in.k kVar = (in.k) obj;
        if (kVar != null) {
            kVar.d(sSLSocket, str, list);
        }
    }

    @Override // hn.k
    public final void e(Socket socket, InetSocketAddress inetSocketAddress, int i10) {
        l.f(inetSocketAddress, InnerShareParams.ADDRESS);
        try {
            socket.connect(inetSocketAddress, i10);
        } catch (ClassCastException e10) {
            if (Build.VERSION.SDK_INT != 26) {
                throw e10;
            }
            throw new IOException("Exception in connect", e10);
        }
    }

    @Override // hn.k
    public final String f(SSLSocket sSLSocket) {
        Object obj;
        Iterator it = this.f16162d.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((in.k) obj).a(sSLSocket)) {
                break;
            }
        }
        in.k kVar = (in.k) obj;
        if (kVar != null) {
            return kVar.c(sSLSocket);
        }
        return null;
    }

    @Override // hn.k
    public final Object g() {
        in.h hVar = this.f16163e;
        hVar.getClass();
        Method method = hVar.f17218a;
        if (method != null) {
            try {
                Object invoke = method.invoke(null, new Object[0]);
                Method method2 = hVar.f17219b;
                l.c(method2);
                method2.invoke(invoke, "response.body().close()");
                return invoke;
            } catch (Exception unused) {
                return null;
            }
        }
        return null;
    }

    @Override // hn.k
    public final boolean h(String str) {
        boolean isCleartextTrafficPermitted;
        l.f(str, "hostname");
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 24) {
            isCleartextTrafficPermitted = NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted(str);
            return isCleartextTrafficPermitted;
        } else if (i10 >= 23) {
            NetworkSecurityPolicy networkSecurityPolicy = NetworkSecurityPolicy.getInstance();
            l.e(networkSecurityPolicy, "NetworkSecurityPolicy.getInstance()");
            return networkSecurityPolicy.isCleartextTrafficPermitted();
        } else {
            return true;
        }
    }

    @Override // hn.k
    public final void j(Object obj, String str) {
        l.f(str, CrashHianalyticsData.MESSAGE);
        in.h hVar = this.f16163e;
        hVar.getClass();
        boolean z10 = false;
        if (obj != null) {
            try {
                Method method = hVar.f17220c;
                l.c(method);
                method.invoke(obj, new Object[0]);
                z10 = true;
            } catch (Exception unused) {
            }
        }
        if (!z10) {
            k.i(5, str, null);
        }
    }
}
