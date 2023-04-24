package mi;

import android.animation.Animator;
import android.view.ViewAnimationUtils;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.ImageView;
import com.topstep.fitcloud.pro.databinding.LayoutSportingMapContainerBinding;
import com.topstep.fitcloud.pro.ui.sport.SportingActivity;

/* loaded from: classes2.dex */
public final class i0 extends gm.m implements fm.l<ImageView, tl.l> {

    /* renamed from: b */
    public final /* synthetic */ SportingActivity f21828b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(SportingActivity sportingActivity) {
        super(1);
        this.f21828b = sportingActivity;
    }

    @Override // fm.l
    public final tl.l k(ImageView imageView) {
        gm.l.f(imageView, "it");
        LayoutSportingMapContainerBinding layoutSportingMapContainerBinding = this.f21828b.E;
        if (layoutSportingMapContainerBinding != null) {
            int right = (layoutSportingMapContainerBinding.imgChangeModeToNormal.getRight() + layoutSportingMapContainerBinding.imgChangeModeToNormal.getLeft()) / 2;
            int bottom = (layoutSportingMapContainerBinding.imgChangeModeToNormal.getBottom() + layoutSportingMapContainerBinding.imgChangeModeToNormal.getTop()) / 2;
            float hypot = (float) Math.hypot(right, bottom);
            Animator createCircularReveal = ViewAnimationUtils.createCircularReveal(layoutSportingMapContainerBinding.getRoot(), right, bottom, hypot, layoutSportingMapContainerBinding.imgChangeModeToNormal.getWidth() / 2.0f);
            createCircularReveal.setDuration(240L);
            createCircularReveal.setInterpolator(new AccelerateDecelerateInterpolator());
            createCircularReveal.addListener(new h0(layoutSportingMapContainerBinding));
            createCircularReveal.setStartDelay(40L);
            createCircularReveal.start();
        }
        return tl.l.f28297a;
    }
}
