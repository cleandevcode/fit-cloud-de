package mi;

import android.os.Bundle;
import android.widget.TextView;
import com.topstep.fitcloud.pro.ui.sport.SportingActivity;

/* loaded from: classes2.dex */
public final class r0 extends gm.m implements fm.l<TextView, tl.l> {

    /* renamed from: b */
    public final /* synthetic */ SportingActivity f21862b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r0(SportingActivity sportingActivity) {
        super(1);
        this.f21862b = sportingActivity;
    }

    @Override // fm.l
    public final tl.l k(TextView textView) {
        boolean z10;
        gm.l.f(textView, "it");
        SportingActivity sportingActivity = this.f21862b;
        SportingActivity.a aVar = SportingActivity.X;
        y6.e a10 = sportingActivity.O().a();
        if (a10 != null) {
            if (a10.f31184d < 0.1d) {
                int i10 = d0.B0;
                z10 = true;
            } else if (a10.f31183c < 300) {
                int i11 = d0.B0;
                z10 = false;
            }
            d0 d0Var = new d0();
            Bundle bundle = new Bundle();
            bundle.putBoolean("distance_error", z10);
            d0Var.Z0(bundle);
            d0Var.h1(sportingActivity.J(), null);
            return tl.l.f28297a;
        }
        sportingActivity.R();
        return tl.l.f28297a;
    }
}
