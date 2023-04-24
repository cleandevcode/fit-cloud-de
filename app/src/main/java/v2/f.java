package v2;

import android.view.animation.Animation;
import android.view.animation.Transformation;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

/* loaded from: classes.dex */
public final class f extends Animation {

    /* renamed from: a */
    public final /* synthetic */ SwipeRefreshLayout f29029a;

    public f(SwipeRefreshLayout swipeRefreshLayout) {
        this.f29029a = swipeRefreshLayout;
    }

    @Override // android.view.animation.Animation
    public final void applyTransformation(float f10, Transformation transformation) {
        this.f29029a.setAnimationProgress(1.0f - f10);
    }
}
