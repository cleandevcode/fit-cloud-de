package um;

import java.util.concurrent.CancellationException;
import pm.c2;
import pm.g1;
import pm.g2;
import pm.u0;

/* loaded from: classes2.dex */
public final class h {

    /* renamed from: a */
    public static final x f28907a = new x("UNDEFINED");

    /* renamed from: b */
    public static final x f28908b = new x("REUSABLE_CLAIMED");

    public static final <T> void a(xl.d<? super T> dVar, Object obj, fm.l<? super Throwable, tl.l> lVar) {
        Object uVar;
        g2<?> g2Var;
        if (dVar instanceof g) {
            g gVar = (g) dVar;
            Throwable a10 = tl.g.a(obj);
            boolean z10 = false;
            if (a10 == null) {
                if (lVar != null) {
                    uVar = new pm.v(obj, lVar);
                } else {
                    uVar = obj;
                }
            } else {
                uVar = new pm.u(a10, false);
            }
            if (gVar.f28903d.p0(gVar.e())) {
                gVar.f28905f = uVar;
                gVar.f24369c = 1;
                gVar.f28903d.l0(gVar.e(), gVar);
                return;
            }
            u0 a11 = c2.a();
            if (a11.w0()) {
                gVar.f28905f = uVar;
                gVar.f24369c = 1;
                a11.t0(gVar);
                return;
            }
            a11.u0(true);
            try {
                g1 g1Var = (g1) gVar.e().b(g1.b.f24341a);
                if (g1Var != null && !g1Var.a()) {
                    CancellationException v10 = g1Var.v();
                    gVar.b(uVar, v10);
                    gVar.l(mf.a0.f(v10));
                    z10 = true;
                }
                if (!z10) {
                    xl.d<T> dVar2 = gVar.f28904e;
                    Object obj2 = gVar.f28906g;
                    xl.f e10 = dVar2.e();
                    Object c10 = z.c(e10, obj2);
                    if (c10 != z.f28944a) {
                        g2Var = pm.z.b(dVar2, e10, c10);
                    } else {
                        g2Var = null;
                    }
                    gVar.f28904e.l(obj);
                    tl.l lVar2 = tl.l.f28297a;
                    if (g2Var == null || g2Var.B0()) {
                        z.a(e10, c10);
                    }
                }
                do {
                } while (a11.y0());
            } finally {
                try {
                    return;
                } finally {
                }
            }
            return;
        }
        dVar.l(obj);
    }
}
