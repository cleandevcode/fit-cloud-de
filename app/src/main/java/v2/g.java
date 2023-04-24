package v2;

import android.view.animation.Animation;
import android.view.animation.Transformation;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

/* loaded from: classes.dex */
public final class g extends Animation {

    /* renamed from: a */
    public final /* synthetic */ int f29030a;

    /* renamed from: b */
    public final /* synthetic */ int f29031b;

    /* renamed from: c */
    public final /* synthetic */ SwipeRefreshLayout f29032c;

    public g(SwipeRefreshLayout swipeRefreshLayout, int i10, int i11) {
        this.f29032c = swipeRefreshLayout;
        this.f29030a = i10;
        this.f29031b = i11;
    }

    @Override // android.view.animation.Animation
    public final void applyTransformation(float f10, Transformation transformation) {
        d dVar = this.f29032c.f3381z;
        int i10 = this.f29030a;
        dVar.setAlpha((int) (((this.f29031b - i10) * f10) + i10));
    }
}
