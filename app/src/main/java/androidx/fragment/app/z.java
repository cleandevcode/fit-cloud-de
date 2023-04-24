package androidx.fragment.app;

import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.Transformation;

/* loaded from: classes.dex */
public final class z extends AnimationSet implements Runnable {

    /* renamed from: a */
    public final ViewGroup f2624a;

    /* renamed from: b */
    public final View f2625b;

    /* renamed from: c */
    public boolean f2626c;

    /* renamed from: d */
    public boolean f2627d;

    /* renamed from: e */
    public boolean f2628e;

    public z(Animation animation, ViewGroup viewGroup, View view) {
        super(false);
        this.f2628e = true;
        this.f2624a = viewGroup;
        this.f2625b = view;
        addAnimation(animation);
        viewGroup.post(this);
    }

    @Override // android.view.animation.AnimationSet, android.view.animation.Animation
    public final boolean getTransformation(long j10, Transformation transformation) {
        this.f2628e = true;
        if (this.f2626c) {
            return !this.f2627d;
        }
        if (!super.getTransformation(j10, transformation)) {
            this.f2626c = true;
            k1.h0.a(this.f2624a, this);
        }
        return true;
    }

    @Override // android.view.animation.Animation
    public final boolean getTransformation(long j10, Transformation transformation, float f10) {
        this.f2628e = true;
        if (this.f2626c) {
            return !this.f2627d;
        }
        if (!super.getTransformation(j10, transformation, f10)) {
            this.f2626c = true;
            k1.h0.a(this.f2624a, this);
        }
        return true;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f2626c || !this.f2628e) {
            this.f2624a.endViewTransition(this.f2625b);
            this.f2627d = true;
            return;
        }
        this.f2628e = false;
        this.f2624a.post(this);
    }
}
