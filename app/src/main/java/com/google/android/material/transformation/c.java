package com.google.android.material.transformation;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.material.circularreveal.c;

/* loaded from: classes.dex */
public final class c extends AnimatorListenerAdapter {

    /* renamed from: a */
    public final /* synthetic */ com.google.android.material.circularreveal.c f6943a;

    public c(com.google.android.material.circularreveal.c cVar) {
        this.f6943a = cVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        c.d revealInfo = this.f6943a.getRevealInfo();
        revealInfo.f6433c = Float.MAX_VALUE;
        this.f6943a.setRevealInfo(revealInfo);
    }
}
