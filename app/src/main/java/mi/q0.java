package mi;

import android.os.RemoteException;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;
import com.topstep.fitcloud.pro.databinding.LayoutSportingRootBinding;
import com.topstep.fitcloud.pro.ui.sport.SportingActivity;
import com.topstep.fitcloudpro.R;

/* loaded from: classes2.dex */
public final class q0 extends gm.m implements fm.l<TextView, tl.l> {

    /* renamed from: b */
    public final /* synthetic */ SportingActivity f21860b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q0(SportingActivity sportingActivity) {
        super(1);
        this.f21860b = sportingActivity;
    }

    @Override // fm.l
    public final tl.l k(TextView textView) {
        gm.l.f(textView, "it");
        SportingActivity sportingActivity = this.f21860b;
        LayoutSportingRootBinding layoutSportingRootBinding = sportingActivity.D;
        if (layoutSportingRootBinding != null) {
            Animation loadAnimation = AnimationUtils.loadAnimation(sportingActivity, R.anim.resume_btn_out);
            Animation loadAnimation2 = AnimationUtils.loadAnimation(sportingActivity, R.anim.stop_btn_out);
            loadAnimation2.setAnimationListener(new j0(layoutSportingRootBinding));
            layoutSportingRootBinding.resumeView.startAnimation(loadAnimation);
            layoutSportingRootBinding.stopView.startAnimation(loadAnimation2);
            b7.b O = sportingActivity.O();
            O.getClass();
            try {
                x6.f fVar = O.f4028c;
                if (fVar != null) {
                    fVar.W();
                }
            } catch (RemoteException e10) {
                e10.printStackTrace();
            }
        }
        return tl.l.f28297a;
    }
}
