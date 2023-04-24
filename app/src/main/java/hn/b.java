package hn;

import android.annotation.SuppressLint;
import android.net.http.X509TrustManagerExtensions;
import android.os.Build;
import android.security.NetworkSecurityPolicy;
import androidx.fragment.app.a0;
import gm.l;
import hn.k;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.X509TrustManager;
import zm.v;

/* loaded from: classes2.dex */
public final class b extends k {

    /* renamed from: e */
    public static final boolean f16157e;

    /* renamed from: f */
    public static final a f16158f = new a();

    /* renamed from: d */
    public final ArrayList f16159d;

    /* loaded from: classes2.dex */
    public static final class a {
    }

    static {
        boolean z10;
        k.f16188c.getClass();
        if (k.a.c() && Build.VERSION.SDK_INT >= 29) {
            z10 = true;
        } else {
            z10 = false;
        }
        f16157e = z10;
    }

    public b() {
        boolean z10;
        in.a aVar;
        in.k[] kVarArr = new in.k[4];
        in.a.f17204a.getClass();
        k.f16188c.getClass();
        if (k.a.c() && Build.VERSION.SDK_INT >= 29) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            aVar = new in.a();
        } else {
            aVar = null;
        }
        kVarArr[0] = aVar;
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
        this.f16159d = arrayList;
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
    public final void d(SSLSocket sSLSocket, String str, List<? extends v> list) {
        Object obj;
        l.f(list, "protocols");
        Iterator it = this.f16159d.iterator();
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
    public final String f(SSLSocket sSLSocket) {
        Object obj;
        Iterator it = this.f16159d.iterator();
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
    @SuppressLint({"NewApi"})
    public final boolean h(String str) {
        boolean isCleartextTrafficPermitted;
        l.f(str, "hostname");
        isCleartextTrafficPermitted = NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted(str);
        return isCleartextTrafficPermitted;
    }
}
