package com.google.android.material.behavior;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import c2.d;

/* loaded from: classes.dex */
public class HideBottomViewOnScrollBehavior<V extends View> extends CoordinatorLayout.c<V> {

    /* renamed from: a */
    public int f6243a;

    /* renamed from: b */
    public int f6244b;

    /* renamed from: c */
    public int f6245c;

    /* renamed from: d */
    public ViewPropertyAnimator f6246d;

    public HideBottomViewOnScrollBehavior() {
        this.f6243a = 0;
        this.f6244b = 2;
        this.f6245c = 0;
    }

    public HideBottomViewOnScrollBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f6243a = 0;
        this.f6244b = 2;
        this.f6245c = 0;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean h(CoordinatorLayout coordinatorLayout, V v10, int i10) {
        this.f6243a = v10.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) v10.getLayoutParams()).bottomMargin;
        return false;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final void l(CoordinatorLayout coordinatorLayout, View view, int i10, int i11, int i12, int[] iArr) {
        boolean z10 = true;
        boolean z11 = false;
        if (i10 > 0) {
            if (this.f6244b == 1) {
                z11 = true;
            }
            if (!z11) {
                ViewPropertyAnimator viewPropertyAnimator = this.f6246d;
                if (viewPropertyAnimator != null) {
                    viewPropertyAnimator.cancel();
                    view.clearAnimation();
                }
                this.f6244b = 1;
                s(view, this.f6243a + this.f6245c, 175L, h9.a.f16045c);
            }
        } else if (i10 < 0) {
            if (this.f6244b != 2) {
                z10 = false;
            }
            if (!z10) {
                ViewPropertyAnimator viewPropertyAnimator2 = this.f6246d;
                if (viewPropertyAnimator2 != null) {
                    viewPropertyAnimator2.cancel();
                    view.clearAnimation();
                }
                this.f6244b = 2;
                s(view, 0, 225L, h9.a.f16046d);
            }
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean p(CoordinatorLayout coordinatorLayout, V v10, View view, View view2, int i10, int i11) {
        return i10 == 2;
    }

    public final void s(View view, int i10, long j10, d dVar) {
        this.f6246d = view.animate().translationY(i10).setInterpolator(dVar).setDuration(j10).setListener(new k9.a(this));
    }
}
