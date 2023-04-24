package mi;

import android.os.RemoteException;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import com.topstep.fitcloud.pro.databinding.LayoutSportingRootBinding;
import com.topstep.fitcloud.pro.ui.sport.SportingActivity;
import com.topstep.fitcloud.pro.ui.widget.LongPressTurnAroundLayout;
import com.topstep.fitcloudpro.R;

/* loaded from: classes2.dex */
public final class p0 extends gm.m implements fm.l<LongPressTurnAroundLayout, tl.l> {

    /* renamed from: b */
    public final /* synthetic */ SportingActivity f21856b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p0(SportingActivity sportingActivity) {
        super(1);
        this.f21856b = sportingActivity;
    }

    @Override // fm.l
    public final tl.l k(LongPressTurnAroundLayout longPressTurnAroundLayout) {
        gm.l.f(longPressTurnAroundLayout, "it");
        SportingActivity sportingActivity = this.f21856b;
        LayoutSportingRootBinding layoutSportingRootBinding = sportingActivity.D;
        if (layoutSportingRootBinding != null) {
            layoutSportingRootBinding.pauseView.setVisibility(4);
            layoutSportingRootBinding.resumeView.setVisibility(0);
            layoutSportingRootBinding.stopView.setVisibility(0);
            Animation loadAnimation = AnimationUtils.loadAnimation(sportingActivity, R.anim.resume_btn_in);
            Animation loadAnimation2 = AnimationUtils.loadAnimation(sportingActivity, R.anim.stop_btn_in);
            layoutSportingRootBinding.resumeView.startAnimation(loadAnimation);
            layoutSportingRootBinding.stopView.startAnimation(loadAnimation2);
            b7.b O = sportingActivity.O();
            O.getClass();
            try {
                x6.f fVar = O.f4028c;
                if (fVar != null) {
                    fVar.t();
                }
            } catch (RemoteException e10) {
                e10.printStackTrace();
            }
        }
        return tl.l.f28297a;
    }
}
