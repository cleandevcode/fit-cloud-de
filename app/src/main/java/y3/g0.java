package y3;

import android.os.Handler;
import android.os.Message;
import androidx.lifecycle.v0;
import com.topstep.fitcloud.pro.ui.device.dial.component.DialComponentEditFragment;
import d2.a;
import pm.z1;

/* loaded from: classes.dex */
public interface g0 extends androidx.lifecycle.u {

    /* loaded from: classes.dex */
    public static final class a {
        public static h0 a(g0 g0Var) {
            v0.b bVar;
            d2.a aVar;
            if (g0Var instanceof androidx.lifecycle.y0) {
                androidx.lifecycle.y0 y0Var = (androidx.lifecycle.y0) g0Var;
                gm.l.f(y0Var, "owner");
                androidx.lifecycle.x0 z10 = y0Var.z();
                gm.l.e(z10, "owner.viewModelStore");
                boolean z11 = y0Var instanceof androidx.lifecycle.i;
                if (z11) {
                    bVar = ((androidx.lifecycle.i) y0Var).r();
                    gm.l.e(bVar, "owner.defaultViewModelProviderFactory");
                } else {
                    if (v0.c.f2804a == null) {
                        v0.c.f2804a = new v0.c();
                    }
                    bVar = v0.c.f2804a;
                    gm.l.c(bVar);
                }
                if (z11) {
                    aVar = ((androidx.lifecycle.i) y0Var).s();
                    gm.l.e(aVar, "{\n        owner.defaultV…ModelCreationExtras\n    }");
                } else {
                    aVar = a.C0214a.f12612b;
                }
                return (h0) new androidx.lifecycle.v0(z10, bVar, aVar).a(h0.class);
            }
            throw new IllegalStateException("If your MavericksView is not a ViewModelStoreOwner, you must implement mavericksViewInternalViewModel and return a MavericksViewInternalViewModel that is unique to this view and persistent across its entire lifecycle.".toString());
        }

        public static androidx.lifecycle.u b(g0 g0Var) {
            try {
                androidx.fragment.app.r rVar = g0Var instanceof androidx.fragment.app.r ? (androidx.fragment.app.r) g0Var : null;
                androidx.lifecycle.u q02 = rVar != null ? rVar.q0() : g0Var;
                gm.l.e(q02, "{\n            (this as? …leOwner ?: this\n        }");
                return q02;
            } catch (IllegalStateException unused) {
                return g0Var;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static z1 c(g0 g0Var, k0 k0Var, mm.f fVar, i iVar, fm.p pVar, fm.p pVar2) {
            gm.l.f(k0Var, "$receiver");
            gm.l.f(fVar, "asyncProp");
            gm.l.f(iVar, "deliveryMode");
            return pm.k.b(k0Var, g0Var.a(), fVar, iVar.a(fVar), new q0(pVar2, pVar, null));
        }

        public static /* synthetic */ void d(g0 g0Var, k0 k0Var, gm.t tVar, e1 e1Var, fm.p pVar, DialComponentEditFragment.d dVar, int i10) {
            z0 z0Var = e1Var;
            if ((i10 & 2) != 0) {
                z0Var = z0.f31104a;
            }
            g0Var.Y(k0Var, tVar, z0Var, (i10 & 4) != 0 ? null : pVar, (i10 & 8) != 0 ? null : dVar);
        }

        public static z1 e(g0 g0Var, k0 k0Var, mm.f fVar, i iVar, fm.p pVar) {
            gm.l.f(k0Var, "$receiver");
            gm.l.f(fVar, "prop1");
            gm.l.f(iVar, "deliveryMode");
            gm.l.f(pVar, "action");
            return pm.k.b(k0Var, g0Var.a(), fVar, iVar, pVar);
        }

        public static void g(g0 g0Var) {
            if (j0.f30963a.add(Integer.valueOf(System.identityHashCode(g0Var)))) {
                Handler handler = j0.f30964b;
                handler.sendMessage(Message.obtain(handler, System.identityHashCode(g0Var), g0Var));
            }
        }

        public static e1 h(g0 g0Var, String str) {
            return new e1(ul.q.M(ul.i.A(new String[]{g0Var.i(), gm.b0.a(e1.class).a(), str}), "_", null, null, null, 62));
        }
    }

    void X();

    z1 Y(k0 k0Var, gm.t tVar, i iVar, fm.p pVar, fm.p pVar2);

    z1 Z(xh.i iVar, gm.t tVar, i iVar2, fm.p pVar);

    androidx.lifecycle.u a();

    String i();

    void invalidate();
}
