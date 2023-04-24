package mi;

import android.animation.Animator;
import android.view.ViewAnimationUtils;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.ImageView;
import com.topstep.fitcloud.pro.databinding.LayoutSportingMapContainerBinding;
import com.topstep.fitcloud.pro.databinding.LayoutSportingRootBinding;
import com.topstep.fitcloud.pro.ui.sport.SportingActivity;

/* loaded from: classes2.dex */
public final class s0 extends gm.m implements fm.l<ImageView, tl.l> {

    /* renamed from: b */
    public final /* synthetic */ SportingActivity f21864b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s0(SportingActivity sportingActivity) {
        super(1);
        this.f21864b = sportingActivity;
    }

    @Override // fm.l
    public final tl.l k(ImageView imageView) {
        LayoutSportingMapContainerBinding layoutSportingMapContainerBinding;
        gm.l.f(imageView, "it");
        SportingActivity sportingActivity = this.f21864b;
        LayoutSportingRootBinding layoutSportingRootBinding = sportingActivity.D;
        if (layoutSportingRootBinding != null && (layoutSportingMapContainerBinding = sportingActivity.E) != null) {
            int right = (layoutSportingRootBinding.imgChangeModeToMap.getRight() + layoutSportingRootBinding.imgChangeModeToMap.getLeft()) / 2;
            int bottom = (layoutSportingRootBinding.imgChangeModeToMap.getBottom() + layoutSportingRootBinding.imgChangeModeToMap.getTop()) / 2;
            Animator createCircularReveal = ViewAnimationUtils.createCircularReveal(layoutSportingMapContainerBinding.getRoot(), right, bottom, layoutSportingRootBinding.imgChangeModeToMap.getWidth() / 2.0f, (float) Math.hypot(right, bottom));
            gm.l.e(createCircularReveal, "createCircularReveal(\n  …      endRadius\n        )");
            createCircularReveal.setDuration(240L);
            createCircularReveal.setInterpolator(new AccelerateDecelerateInterpolator());
            createCircularReveal.addListener(new g0(layoutSportingMapContainerBinding));
            createCircularReveal.setStartDelay(40L);
            createCircularReveal.start();
        }
        return tl.l.f28297a;
    }
}
