package bi;

import android.os.Bundle;
import com.topstep.fitcloud.pro.ui.device.settings.QrCodeSettingsFragment;

/* loaded from: classes2.dex */
public final class u0 extends gm.m implements fm.a<Bundle> {

    /* renamed from: b */
    public final /* synthetic */ androidx.fragment.app.r f4363b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u0(QrCodeSettingsFragment qrCodeSettingsFragment) {
        super(0);
        this.f4363b = qrCodeSettingsFragment;
    }

    @Override // fm.a
    public final Bundle m() {
        Bundle bundle = this.f4363b.f2516f;
        if (bundle != null) {
            return bundle;
        }
        throw new IllegalStateException(androidx.fragment.app.n.a(android.support.v4.media.d.a("Fragment "), this.f4363b, " has null arguments"));
    }
}
