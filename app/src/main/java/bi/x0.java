package bi;

import com.topstep.fitcloud.pro.ui.device.settings.QrCodeSettingsViewModel;

@zl.e(c = "com.topstep.fitcloud.pro.ui.device.settings.QrCodeSettingsViewModel", f = "QrCodeSettingsFragment.kt", l = {270}, m = "queryQrCodeContent")
/* loaded from: classes2.dex */
public final class x0 extends zl.c {

    /* renamed from: d */
    public /* synthetic */ Object f4380d;

    /* renamed from: e */
    public final /* synthetic */ QrCodeSettingsViewModel f4381e;

    /* renamed from: f */
    public int f4382f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x0(QrCodeSettingsViewModel qrCodeSettingsViewModel, xl.d<? super x0> dVar) {
        super(dVar);
        this.f4381e = qrCodeSettingsViewModel;
    }

    @Override // zl.a
    public final Object t(Object obj) {
        this.f4380d = obj;
        this.f4382f |= Integer.MIN_VALUE;
        return this.f4381e.i(0, this);
    }
}
