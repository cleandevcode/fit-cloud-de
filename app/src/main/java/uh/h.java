package uh;

import android.view.View;
import uh.i;

/* loaded from: classes2.dex */
public final /* synthetic */ class h implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ int f28754a;

    /* renamed from: b */
    public final /* synthetic */ i f28755b;

    public /* synthetic */ h(i iVar, int i10) {
        this.f28754a = i10;
        this.f28755b = iVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        i.a aVar = null;
        switch (this.f28754a) {
            case 0:
                i iVar = this.f28755b;
                mm.h<Object>[] hVarArr = i.O0;
                gm.l.f(iVar, "this$0");
                androidx.fragment.app.r rVar = iVar.f2537v;
                if (rVar instanceof i.a) {
                    aVar = (i.a) rVar;
                }
                if (aVar != null) {
                    aVar.L();
                    return;
                }
                return;
            default:
                i iVar2 = this.f28755b;
                gm.l.f(iVar2, "this$0");
                new h0().h1(iVar2.h0(), null);
                return;
        }
    }
}
