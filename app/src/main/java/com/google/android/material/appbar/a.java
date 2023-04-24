package com.google.android.material.appbar;

import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;
import com.google.android.material.appbar.AppBarLayout;
import ga.f;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class a implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a */
    public final /* synthetic */ f f6231a;

    /* renamed from: b */
    public final /* synthetic */ AppBarLayout f6232b;

    public a(AppBarLayout appBarLayout, f fVar) {
        this.f6232b = appBarLayout;
        this.f6231a = fVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        this.f6231a.j(floatValue);
        Drawable drawable = this.f6232b.f6176r;
        if (drawable instanceof f) {
            ((f) drawable).j(floatValue);
        }
        Iterator it = this.f6232b.f6174p.iterator();
        while (it.hasNext()) {
            int i10 = this.f6231a.f15089u;
            ((AppBarLayout.e) it.next()).a();
        }
    }
}
