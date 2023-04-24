package th;

import android.content.DialogInterface;
import android.os.Bundle;
import android.widget.Button;
import java.io.Serializable;
import th.p;

/* loaded from: classes2.dex */
public final /* synthetic */ class o implements DialogInterface.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ int f28209a;

    /* renamed from: b */
    public final /* synthetic */ androidx.fragment.app.o f28210b;

    /* renamed from: c */
    public final /* synthetic */ Serializable f28211c;

    public /* synthetic */ o(androidx.fragment.app.o oVar, Serializable serializable, int i10) {
        this.f28209a = i10;
        this.f28210b = oVar;
        this.f28211c = serializable;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i10) {
        p.a aVar;
        switch (this.f28209a) {
            case 0:
                p pVar = (p) this.f28210b;
                gm.z zVar = (gm.z) this.f28211c;
                int i11 = p.B0;
                gm.l.f(pVar, "this$0");
                gm.l.f(zVar, "$repeat");
                androidx.fragment.app.r rVar = pVar.f2537v;
                if (rVar instanceof p.a) {
                    aVar = (p.a) rVar;
                } else {
                    aVar = null;
                }
                if (aVar != null) {
                    aVar.u(zVar.f15508a);
                    return;
                }
                return;
            default:
                si.a aVar2 = (si.a) this.f28210b;
                String str = (String) this.f28211c;
                int i12 = si.a.D0;
                gm.l.f(aVar2, "this$0");
                Button i13 = aVar2.i1();
                if (i13 != null) {
                    i13.callOnClick();
                }
                gm.l.e(str, "disableRequestKey");
                tb.a.q(new Bundle(), aVar2, str);
                return;
        }
    }
}
