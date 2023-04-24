package v2;

import android.view.animation.Animation;
import android.view.animation.Transformation;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

/* loaded from: classes.dex */
public final class e extends Animation {

    /* renamed from: a */
    public final /* synthetic */ SwipeRefreshLayout f29028a;

    public e(SwipeRefreshLayout swipeRefreshLayout) {
        this.f29028a = swipeRefreshLayout;
    }

    @Override // android.view.animation.Animation
    public final void applyTransformation(float f10, Transformation transformation) {
        this.f29028a.setAnimationProgress(f10);
    }
}
