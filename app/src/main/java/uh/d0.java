package uh;

import com.topstep.fitcloud.pro.ui.device.bind.ScannerHelper;

/* loaded from: classes2.dex */
public final /* synthetic */ class d0 implements wk.a {

    /* renamed from: a */
    public final /* synthetic */ int f28745a;

    /* renamed from: b */
    public final /* synthetic */ Object f28746b;

    public /* synthetic */ d0(int i10, Object obj) {
        this.f28745a = i10;
        this.f28746b = obj;
    }

    @Override // wk.a
    public final void run() {
        switch (this.f28745a) {
            case 0:
                ScannerHelper scannerHelper = (ScannerHelper) this.f28746b;
                gm.l.f(scannerHelper, "this$0");
                ScannerHelper.a aVar = scannerHelper.f10861h;
                if (aVar != null) {
                    aVar.c();
                    return;
                }
                return;
            case 1:
                c4.g gVar = (c4.g) this.f28746b;
                gm.l.f(gVar, "$iSend2BtCallback");
                gVar.a();
                return;
            case 2:
                jj.d0 d0Var = (jj.d0) this.f28746b;
                gm.l.f(d0Var, "this$0");
                d0Var.f17884d = false;
                d0Var.f17885e.b(127);
                return;
            default:
                cj.a aVar2 = (cj.a) this.f28746b;
                gm.l.f(aVar2, "$fcProtocolQueue");
                ((cj.h) aVar2).f4898l = false;
                return;
        }
    }
}
