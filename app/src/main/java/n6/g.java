package n6;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.view.View;
import mi.d0;
import n6.p;
import p000do.a;
import rh.x;
import uh.h0;
import y3.k0;

/* loaded from: classes.dex */
public final /* synthetic */ class g implements DialogInterface.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ int f22081a;

    /* renamed from: b */
    public final /* synthetic */ androidx.fragment.app.o f22082b;

    public /* synthetic */ g(androidx.fragment.app.o oVar, int i10) {
        this.f22081a = i10;
        this.f22082b = oVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i10) {
        d0.b bVar = null;
        x.a aVar = null;
        switch (this.f22081a) {
            case 0:
                h hVar = (h) this.f22082b;
                int i11 = h.M0;
                gm.l.f(hVar, "this$0");
                View k12 = hVar.k1(false);
                Dialog dialog = hVar.f2477w0;
                if (dialog != null) {
                    dialog.setContentView(k12);
                }
                p.d dVar = hVar.L0;
                if (dVar != null) {
                    hVar.r1(dVar);
                    return;
                }
                return;
            case 1:
                rh.x xVar = (rh.x) this.f22082b;
                int i12 = rh.x.B0;
                gm.l.f(xVar, "this$0");
                androidx.fragment.app.r rVar = xVar.f2537v;
                if (rVar instanceof x.a) {
                    aVar = (x.a) rVar;
                }
                if (aVar != null) {
                    aVar.f();
                    return;
                }
                return;
            case 2:
                h0 h0Var = (h0) this.f22082b;
                mm.h<Object>[] hVarArr = h0.C0;
                gm.l.f(h0Var, "this$0");
                uh.m mVar = (uh.m) h0Var.B0.getValue();
                mVar.getClass();
                k0.a(mVar, new uh.n(mVar, null), uh.o.f28793b);
                return;
            case 3:
                mi.a aVar2 = (mi.a) this.f22082b;
                int i13 = mi.a.B0;
                gm.l.f(aVar2, "this$0");
                try {
                    aVar2.V0().startActivity(new Intent("android.settings.LOCATION_SOURCE_SETTINGS"));
                    return;
                } catch (Exception e10) {
                    a.b bVar2 = p000do.a.f13275a;
                    bVar2.t("SystemUtil");
                    bVar2.q(e10);
                    return;
                }
            default:
                d0 d0Var = (d0) this.f22082b;
                int i14 = d0.B0;
                gm.l.f(d0Var, "this$0");
                Context i02 = d0Var.i0();
                if (i02 instanceof d0.b) {
                    bVar = (d0.b) i02;
                }
                if (bVar != null) {
                    bVar.f();
                    return;
                }
                return;
        }
    }
}
