package com.google.android.material.tabs;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.material.tabs.TabLayout;

/* loaded from: classes.dex */
public final class c extends AnimatorListenerAdapter {

    /* renamed from: a */
    public final /* synthetic */ int f6761a;

    /* renamed from: b */
    public final /* synthetic */ TabLayout.f f6762b;

    public c(TabLayout.f fVar, int i10) {
        this.f6762b = fVar;
        this.f6761a = i10;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.f6762b.f6729b = this.f6761a;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.f6762b.f6729b = this.f6761a;
    }
}
