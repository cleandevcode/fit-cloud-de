package mi;

import com.topstep.fitcloud.pro.databinding.LayoutSportingRootBinding;
import com.topstep.fitcloud.pro.ui.sport.SportingActivity;
import com.topstep.fitcloud.pro.ui.widget.GpsSignalView;

/* loaded from: classes2.dex */
public final class t0 extends gm.m implements fm.l<Integer, tl.l> {

    /* renamed from: b */
    public final /* synthetic */ SportingActivity f21867b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t0(SportingActivity sportingActivity) {
        super(1);
        this.f21867b = sportingActivity;
    }

    @Override // fm.l
    public final tl.l k(Integer num) {
        LayoutSportingRootBinding layoutSportingRootBinding;
        GpsSignalView gpsSignalView;
        Integer num2 = num;
        if (num2 != null && (layoutSportingRootBinding = this.f21867b.D) != null && (gpsSignalView = layoutSportingRootBinding.gpsSignalView) != null) {
            gpsSignalView.setGpsSignal(num2.intValue());
        }
        return tl.l.f28297a;
    }
}
