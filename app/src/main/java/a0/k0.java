package a0;

import a0.l0;
import android.hardware.camera2.TotalCaptureResult;
import android.os.Build;
import android.view.View;
import com.topstep.fitcloud.pro.ui.MainActivity;
import d6.s;
import k1.n2;
import kc.i0;
import of.k;
import p000do.a;
import z9.r;

/* loaded from: classes.dex */
public final /* synthetic */ class k0 implements o.a, s.a, i0.a, r.b {
    public static sl.a d(of.k kVar, int i10) {
        return mk.a.b(new k.a(kVar, i10));
    }

    public static n1 e(l0 l0Var, l0 l0Var2) {
        j1 B;
        if (l0Var == null && l0Var2 == null) {
            return n1.A;
        }
        if (l0Var2 != null) {
            B = j1.C(l0Var2);
        } else {
            B = j1.B();
        }
        if (l0Var != null) {
            for (l0.a<?> aVar : l0Var.d()) {
                B.D(aVar, l0Var.a(aVar), l0Var.c(aVar));
            }
        }
        return n1.A(B);
    }

    @Override // kc.i0.a
    public void a(int i10, String str, String str2) {
        mm.h<Object>[] hVarArr = of.o.f23206a;
        a.b bVar = p000do.a.f13275a;
        gm.l.e(str, "tag");
        bVar.t(str);
        bVar.l(i10, str2, new Object[0]);
    }

    @Override // o.a
    public Object apply(Object obj) {
        TotalCaptureResult totalCaptureResult = (TotalCaptureResult) obj;
        return Boolean.FALSE;
    }

    @Override // z9.r.b
    public n2 b(View view, n2 n2Var, r.c cVar) {
        n2.e bVar;
        int i10 = MainActivity.E;
        a1.c a10 = n2Var.a(7);
        gm.l.e(a10, "insets.getInsets(WindowI…Compat.Type.systemBars())");
        cVar.f32169d += a10.f217d;
        cVar.a(view);
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 30) {
            bVar = new n2.d(n2Var);
        } else if (i11 >= 29) {
            bVar = new n2.c(n2Var);
        } else {
            bVar = new n2.b(n2Var);
        }
        bVar.c(7, a1.c.b(a10.f214a, a10.f215b, a10.f216c, 0));
        return bVar.b();
    }

    @Override // d6.s.a
    public void c(boolean z10) {
        if (z10) {
            a6.a aVar = a6.a.f351a;
            if (!i6.a.b(a6.a.class)) {
                try {
                    a6.a.f352b = true;
                    a6.a.f351a.b();
                } catch (Throwable th2) {
                    i6.a.a(a6.a.class, th2);
                }
            }
        }
    }
}
