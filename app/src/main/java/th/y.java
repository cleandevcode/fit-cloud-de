package th;

import android.content.DialogInterface;
import bi.z0;
import com.topstep.fitcloud.pro.ui.device.alarm.AlarmViewModel;
import com.topstep.fitcloud.pro.ui.dialog.a;
import ii.h;
import pm.z1;

/* loaded from: classes2.dex */
public final /* synthetic */ class y implements DialogInterface.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ int f28240a;

    /* renamed from: b */
    public final /* synthetic */ f.q f28241b;

    public /* synthetic */ y(f.q qVar, int i10) {
        this.f28240a = i10;
        this.f28241b = qVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i10) {
        h.a aVar = null;
        switch (this.f28240a) {
            case 0:
                z zVar = (z) this.f28241b;
                int i11 = z.C0;
                gm.l.f(zVar, "this$0");
                AlarmViewModel.a aVar2 = zVar.i1().f10787j;
                z1 z1Var = aVar2.f24879d;
                if (z1Var != null) {
                    z1Var.h(null);
                }
                z0.g(aVar2.f24876a, null, 0, new qi.q(aVar2, null), 3);
                return;
            case 1:
                com.topstep.fitcloud.pro.ui.dialog.a aVar3 = (com.topstep.fitcloud.pro.ui.dialog.a) this.f28241b;
                int i12 = com.topstep.fitcloud.pro.ui.dialog.a.I0;
                gm.l.f(aVar3, "this$0");
                try {
                    z0.n(new a.C0196a(null));
                    return;
                } catch (Exception e10) {
                    p000do.a.f13275a.q(e10);
                    return;
                }
            default:
                ii.h hVar = (ii.h) this.f28241b;
                int i13 = ii.h.B0;
                gm.l.f(hVar, "this$0");
                androidx.fragment.app.r rVar = hVar.f2537v;
                if (rVar instanceof h.a) {
                    aVar = (h.a) rVar;
                }
                if (aVar != null) {
                    aVar.R();
                    return;
                }
                return;
        }
    }
}
