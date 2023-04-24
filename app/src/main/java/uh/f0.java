package uh;

import com.topstep.fitcloud.pro.ui.device.bind.ScannerHelper;

/* loaded from: classes2.dex */
public final class f0 extends gm.m implements fm.l<dj.a, tl.l> {

    /* renamed from: b */
    public final /* synthetic */ ScannerHelper f28752b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(ScannerHelper scannerHelper) {
        super(1);
        this.f28752b = scannerHelper;
    }

    @Override // fm.l
    public final tl.l k(dj.a aVar) {
        dj.a aVar2 = aVar;
        ScannerHelper.a aVar3 = this.f28752b.f10861h;
        if (aVar3 != null) {
            gm.l.e(aVar2, "it");
            aVar3.b(aVar2);
        }
        return tl.l.f28297a;
    }
}
