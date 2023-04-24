package m2;

import android.os.CancellationSignal;
import bi.z0;
import java.util.concurrent.Callable;
import sm.u0;
import yb.p0;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a */
    public static p0 f20193a = new p0();

    public static void a(String str, String str2) {
        boolean z10;
        p0 p0Var = f20193a;
        if (p0Var.f31373a && 6 >= p0Var.f31374b) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10 && str2 != null) {
            p0.a(6, str, str2);
        }
    }

    public static void b(String str) {
        boolean z10;
        p0 p0Var = f20193a;
        if (p0Var.f31373a && 4 >= p0Var.f31374b) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10 && str != null) {
            p0.a(4, "hmsSdk", str);
        }
    }

    public static final u0 c(t tVar, String[] strArr, Callable callable) {
        gm.l.f(tVar, "db");
        return new u0(new b(false, tVar, strArr, callable, null));
    }

    public static void d(String str) {
        if (str != null) {
            p0.a(4, "hmsSdk", str);
        }
    }

    public static void e(String str, String str2) {
        if (str2 != null) {
            p0.a(5, str, str2);
        }
    }

    public static final Object f(t tVar, CancellationSignal cancellationSignal, Callable callable, xl.d dVar) {
        xl.f p10;
        if (tVar.n() && tVar.k()) {
            return callable.call();
        }
        b0 b0Var = (b0) dVar.e().b(b0.f20180d);
        if (b0Var == null || (p10 = b0Var.f20182b) == null) {
            p10 = p.b.p(tVar);
        }
        pm.j jVar = new pm.j(1, mf.a0.i(dVar));
        jVar.u();
        jVar.z(new d(cancellationSignal, z0.g(pm.z0.f24420a, p10, 0, new e(callable, jVar, null), 2)));
        return jVar.t();
    }

    public static final Object g(t tVar, Callable callable, xl.d dVar) {
        xl.f q10;
        if (tVar.n() && tVar.k()) {
            return callable.call();
        }
        b0 b0Var = (b0) dVar.e().b(b0.f20180d);
        if (b0Var == null || (q10 = b0Var.f20182b) == null) {
            q10 = p.b.q(tVar);
        }
        return z0.s(dVar, q10, new c(callable, null));
    }

    public static void h(String str, String str2) {
        boolean z10;
        p0 p0Var = f20193a;
        if (p0Var.f31373a && 5 >= p0Var.f31374b) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10 && str2 != null) {
            p0.a(5, str, str2);
        }
    }
}
