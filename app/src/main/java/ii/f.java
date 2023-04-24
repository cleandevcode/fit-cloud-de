package ii;

import android.app.Dialog;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import com.topstep.fitcloud.pro.R;
import eh.a;
import kotlin.Metadata;
import oc.g1;
import pm.z1;
import s.h1;
import y3.g0;

@Metadata
/* loaded from: classes2.dex */
public final class f extends f.q implements y3.g0 {
    public static final a C0;
    public static final /* synthetic */ mm.h<Object>[] D0;
    public final tl.d B0;

    /* loaded from: classes2.dex */
    public static final class a {
    }

    /* loaded from: classes2.dex */
    public static final class b extends gm.m implements fm.l<y3.c0<j, i>, j> {

        /* renamed from: b */
        public final /* synthetic */ androidx.fragment.app.r f16921b;

        /* renamed from: c */
        public final /* synthetic */ mm.b f16922c;

        /* renamed from: d */
        public final /* synthetic */ mm.b f16923d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(androidx.fragment.app.r rVar, gm.e eVar, gm.e eVar2) {
            super(1);
            this.f16921b = rVar;
            this.f16922c = eVar;
            this.f16923d = eVar2;
        }

        /* JADX WARN: Type inference failed for: r14v12, types: [y3.k0, ii.j] */
        /* JADX WARN: Type inference failed for: r14v15, types: [y3.k0, ii.j] */
        @Override // fm.l
        public final j k(y3.c0<j, i> c0Var) {
            androidx.fragment.app.r rVar;
            y3.c0<j, i> c0Var2 = c0Var;
            gm.l.f(c0Var2, "stateFactory");
            androidx.fragment.app.r rVar2 = this.f16921b.f2537v;
            if (rVar2 != null) {
                String name = bi.m0.p(this.f16923d).getName();
                while (rVar2 != null) {
                    try {
                        return h1.o(bi.m0.p(this.f16922c), i.class, new y3.o(this.f16921b.T0(), h1.c(this.f16921b), rVar2), name, true, null, 32);
                    } catch (y3.h1 unused) {
                        rVar2 = rVar2.f2537v;
                    }
                }
                androidx.fragment.app.r rVar3 = this.f16921b;
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
                androidx.fragment.app.x T0 = this.f16921b.T0();
                Object c10 = h1.c(this.f16921b);
                gm.l.c(rVar3);
                return h1.o(bi.m0.p(this.f16922c), i.class, new y3.o(T0, c10, rVar3), bi.m0.p(this.f16923d).getName(), false, c0Var2, 16);
            }
            StringBuilder a10 = android.support.v4.media.d.a("There is no parent fragment for ");
            a10.append(this.f16921b.getClass().getSimpleName());
            a10.append(" so view model ");
            a10.append(this.f16922c.a());
            a10.append(" could not be found.");
            throw new y3.h1(a10.toString());
        }
    }

    /* loaded from: classes2.dex */
    public static final class c extends yb.y {

        /* renamed from: c */
        public final /* synthetic */ mm.b f16924c;

        /* renamed from: d */
        public final /* synthetic */ fm.l f16925d;

        /* renamed from: e */
        public final /* synthetic */ mm.b f16926e;

        public c(gm.e eVar, b bVar, gm.e eVar2) {
            this.f16924c = eVar;
            this.f16925d = bVar;
            this.f16926e = eVar2;
        }

        public final tl.d C(Object obj, mm.h hVar) {
            androidx.fragment.app.r rVar = (androidx.fragment.app.r) obj;
            gm.l.f(rVar, "thisRef");
            gm.l.f(hVar, "property");
            return g1.f22980a.b(rVar, hVar, this.f16924c, new g(this.f16926e), gm.b0.a(i.class), true, this.f16925d);
        }
    }

    static {
        gm.t tVar = new gm.t(f.class, "viewMode", "getViewMode()Lcom/topstep/fitcloud/pro/ui/settings/AccountDeleteViewModel;", 0);
        gm.b0.f15488a.getClass();
        D0 = new mm.h[]{tVar};
        C0 = new a();
    }

    public f() {
        gm.e a10 = gm.b0.a(j.class);
        this.B0 = new c(a10, new b(this, a10, a10), a10).C(this, D0[0]);
    }

    public static void i1(f fVar) {
        Parcelable parcelable;
        gm.l.f(fVar, "this$0");
        j jVar = (j) fVar.B0.getValue();
        Bundle U0 = fVar.U0();
        if (Build.VERSION.SDK_INT >= 33) {
            parcelable = (Parcelable) U0.getParcelable("parcelArgs", a.C0241a.class);
        } else {
            parcelable = U0.getParcelable("parcelArgs");
        }
        gm.l.c(parcelable);
        jVar.c((a.C0241a) parcelable);
    }

    @Override // y3.g0
    public final void X() {
        g0.a.g(this);
    }

    @Override // y3.g0
    public final z1 Y(y3.k0 k0Var, gm.t tVar, y3.i iVar, fm.p pVar, fm.p pVar2) {
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
        v9.b bVar = new v9.b(V0(), R.style.Theme_FitCloudPro_AlertDialog_Warning);
        bVar.k(com.topstep.fitcloudpro.R.string.tip_prompt);
        bVar.d(com.topstep.fitcloudpro.R.string.account_delete_dialog_msg2);
        bVar.f(null);
        bVar.h(17039370, new vh.l(this, 4));
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
