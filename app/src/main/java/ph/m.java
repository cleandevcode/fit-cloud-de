package ph;

import com.topstep.fitcloud.pro.ui.device.bind.ScannerHelper;
import jj.k1;

/* loaded from: classes2.dex */
public final /* synthetic */ class m implements wk.a {

    /* renamed from: a */
    public final /* synthetic */ int f24181a;

    /* renamed from: b */
    public final /* synthetic */ Object f24182b;

    public /* synthetic */ m(int i10, Object obj) {
        this.f24181a = i10;
        this.f24182b = obj;
    }

    @Override // wk.a
    public final void run() {
        switch (this.f24181a) {
            case 0:
                u uVar = (u) this.f24182b;
                gm.l.f(uVar, "this$0");
                uk.c cVar = uVar.f24237s0;
                if (cVar != null) {
                    cVar.c();
                }
                uVar.k1();
                return;
            case 1:
                ScannerHelper scannerHelper = (ScannerHelper) this.f24182b;
                gm.l.f(scannerHelper, "this$0");
                scannerHelper.f10860g = 0;
                return;
            default:
                k1 k1Var = (k1) this.f24182b;
                gm.l.f(k1Var, "this$0");
                k1Var.f17924h = null;
                return;
        }
    }
}
