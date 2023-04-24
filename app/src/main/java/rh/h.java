package rh;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import bi.i0;
import com.topstep.fitcloud.pro.ui.sport.SportingActivity;
import ei.j0;
import rh.i;

/* loaded from: classes2.dex */
public final /* synthetic */ class h implements DialogInterface.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ int f25693a;

    /* renamed from: b */
    public final /* synthetic */ f.q f25694b;

    public /* synthetic */ h(f.q qVar, int i10) {
        this.f25693a = i10;
        this.f25694b = qVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i10) {
        int i11 = 0;
        i.a aVar = null;
        j0.a aVar2 = null;
        i0.a aVar3 = null;
        switch (this.f25693a) {
            case 0:
                i iVar = (i) this.f25694b;
                int i12 = i.B0;
                gm.l.f(iVar, "this$0");
                androidx.fragment.app.r rVar = iVar.f2537v;
                if (rVar instanceof i.a) {
                    aVar = (i.a) rVar;
                }
                if (aVar != null) {
                    aVar.N();
                    return;
                }
                return;
            case 1:
                bi.i0 i0Var = (bi.i0) this.f25694b;
                int i13 = bi.i0.B0;
                gm.l.f(i0Var, "this$0");
                androidx.fragment.app.r rVar2 = i0Var.f2537v;
                if (rVar2 instanceof i0.a) {
                    aVar3 = (i0.a) rVar2;
                }
                if (aVar3 != null) {
                    aVar3.O(i10);
                }
                i0Var.c1(false, false);
                return;
            case 2:
                com.topstep.fitcloud.pro.ui.dialog.j jVar = (com.topstep.fitcloud.pro.ui.dialog.j) this.f25694b;
                int i14 = com.topstep.fitcloud.pro.ui.dialog.j.B0;
                gm.l.f(jVar, "this$0");
                jVar.V0().startActivity(new Intent("android.settings.LOCATION_SOURCE_SETTINGS"));
                return;
            case 3:
                ei.j0 j0Var = (ei.j0) this.f25694b;
                int i15 = ei.j0.B0;
                gm.l.f(j0Var, "this$0");
                androidx.fragment.app.r rVar3 = j0Var.f2537v;
                if (rVar3 instanceof j0.a) {
                    aVar2 = (j0.a) rVar3;
                }
                if (aVar2 != null) {
                    aVar2.J();
                    return;
                }
                return;
            default:
                mi.b bVar = (mi.b) this.f25694b;
                int i16 = mi.b.B0;
                gm.l.f(bVar, "this$0");
                Bundle bundle = bVar.f2516f;
                if (bundle != null) {
                    i11 = bundle.getInt("sport_type");
                }
                SportingActivity.a aVar4 = SportingActivity.X;
                Context V0 = bVar.V0();
                aVar4.getClass();
                Intent intent = new Intent(V0, SportingActivity.class);
                intent.putExtra("sport_type", i11);
                intent.putExtra("from_main", true);
                V0.startActivity(intent);
                return;
        }
    }
}
