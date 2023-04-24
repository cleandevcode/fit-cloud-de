package uh;

import android.app.Dialog;
import android.os.Bundle;
import bi.m0;
import com.topstep.fitcloudpro.R;
import kotlin.Metadata;
import oc.g1;
import pm.z1;
import s.h1;
import y3.g0;
import y3.k0;

@Metadata
/* loaded from: classes2.dex */
public final class h0 extends f.q implements y3.g0 {
    public static final /* synthetic */ mm.h<Object>[] C0;
    public final tl.d B0;

    /* loaded from: classes2.dex */
    public static final class a extends gm.m implements fm.l<y3.c0<m, nh.d<tl.l>>, m> {

        /* renamed from: b */
        public final /* synthetic */ androidx.fragment.app.r f28756b;

        /* renamed from: c */
        public final /* synthetic */ mm.b f28757c;

        /* renamed from: d */
        public final /* synthetic */ mm.b f28758d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(androidx.fragment.app.r rVar, gm.e eVar, gm.e eVar2) {
            super(1);
            this.f28756b = rVar;
            this.f28757c = eVar;
            this.f28758d = eVar2;
        }

        /* JADX WARN: Type inference failed for: r14v12, types: [uh.m, y3.k0] */
        /* JADX WARN: Type inference failed for: r14v15, types: [uh.m, y3.k0] */
        @Override // fm.l
        public final m k(y3.c0<m, nh.d<tl.l>> c0Var) {
            androidx.fragment.app.r rVar;
            y3.c0<m, nh.d<tl.l>> c0Var2 = c0Var;
            gm.l.f(c0Var2, "stateFactory");
            androidx.fragment.app.r rVar2 = this.f28756b.f2537v;
            if (rVar2 != null) {
                String name = m0.p(this.f28758d).getName();
                while (rVar2 != null) {
                    try {
                        return h1.o(m0.p(this.f28757c), nh.d.class, new y3.o(this.f28756b.T0(), h1.c(this.f28756b), rVar2), name, true, null, 32);
                    } catch (y3.h1 unused) {
                        rVar2 = rVar2.f2537v;
                    }
                }
                androidx.fragment.app.r rVar3 = this.f28756b;
                do {
                    rVar3 = rVar3.f2537v;
                    if (rVar3 != null) {
                        rVar = rVar3.f2537v;
                        continue;
                    } else {
                        rVar = null;
                        continue;
                    }
                } while (rVar != null);
                androidx.fragment.app.x T0 = this.f28756b.T0();
                Object c10 = h1.c(this.f28756b);
                gm.l.c(rVar3);
                return h1.o(m0.p(this.f28757c), nh.d.class, new y3.o(T0, c10, rVar3), m0.p(this.f28758d).getName(), false, c0Var2, 16);
            }
            StringBuilder a10 = android.support.v4.media.d.a("There is no parent fragment for ");
            a10.append(this.f28756b.getClass().getSimpleName());
            a10.append(" so view model ");
            a10.append(this.f28757c.a());
            a10.append(" could not be found.");
            throw new y3.h1(a10.toString());
        }
    }

    /* loaded from: classes2.dex */
    public static final class b extends yb.y {

        /* renamed from: c */
        public final /* synthetic */ mm.b f28759c;

        /* renamed from: d */
        public final /* synthetic */ fm.l f28760d;

        /* renamed from: e */
        public final /* synthetic */ mm.b f28761e;

        public b(gm.e eVar, a aVar, gm.e eVar2) {
            this.f28759c = eVar;
            this.f28760d = aVar;
            this.f28761e = eVar2;
        }

        public final tl.d C(Object obj, mm.h hVar) {
            androidx.fragment.app.r rVar = (androidx.fragment.app.r) obj;
            gm.l.f(rVar, "thisRef");
            gm.l.f(hVar, "property");
            return g1.f22980a.b(rVar, hVar, this.f28759c, new i0(this.f28761e), gm.b0.a(nh.d.class), true, this.f28760d);
        }
    }

    static {
        gm.t tVar = new gm.t(h0.class, "viewModel", "getViewModel()Lcom/topstep/fitcloud/pro/ui/device/bind/DeviceConnectViewMode;", 0);
        gm.b0.f15488a.getClass();
        C0 = new mm.h[]{tVar};
    }

    public h0() {
        gm.e a10 = gm.b0.a(m.class);
        this.B0 = new b(a10, new a(this, a10, a10), a10).C(this, C0[0]);
    }

    @Override // y3.g0
    public final void X() {
        g0.a.g(this);
    }

    @Override // y3.g0
    public final z1 Y(k0 k0Var, gm.t tVar, y3.i iVar, fm.p pVar, fm.p pVar2) {
        return g0.a.c(this, k0Var, tVar, iVar, pVar, pVar2);
    }

    @Override // y3.g0
    public final z1 Z(xh.i iVar, gm.t tVar, y3.i iVar2, fm.p pVar) {
        return g0.a.e(this, iVar, tVar, iVar2, pVar);
    }

    @Override // y3.g0
    public final androidx.lifecycle.u a() {
        return g0.a.b(this);
    }

    @Override // f.q, androidx.fragment.app.o
    public final Dialog d1(Bundle bundle) {
        v9.b bVar = new v9.b(V0(), 0);
        bVar.k(R.string.tip_prompt);
        bVar.d(R.string.device_unbind_confirm_msg);
        bVar.f(null);
        bVar.h(17039370, new n6.g(this, 2));
        return bVar.a();
    }

    @Override // y3.g0
    public final String i() {
        return g0.a.a(this).f30958d;
    }

    @Override // y3.g0
    public final void invalidate() {
    }
}
