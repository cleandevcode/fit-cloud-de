package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.material.floatingactionbutton.d;

/* loaded from: classes.dex */
public final class b extends AnimatorListenerAdapter {

    /* renamed from: a */
    public boolean f6568a;

    /* renamed from: b */
    public final /* synthetic */ boolean f6569b;

    /* renamed from: c */
    public final /* synthetic */ d.g f6570c;

    /* renamed from: d */
    public final /* synthetic */ d f6571d;

    public b(d dVar, boolean z10, a aVar) {
        this.f6571d = dVar;
        this.f6569b = z10;
        this.f6570c = aVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.f6568a = true;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        int i10;
        d dVar = this.f6571d;
        dVar.f6592r = 0;
        dVar.f6586l = null;
        if (!this.f6568a) {
            FloatingActionButton floatingActionButton = dVar.f6596v;
            boolean z10 = this.f6569b;
            if (z10) {
                i10 = 8;
            } else {
                i10 = 4;
            }
            floatingActionButton.b(i10, z10);
            d.g gVar = this.f6570c;
            if (gVar != null) {
                a aVar = (a) gVar;
                aVar.f6566a.a(aVar.f6567b);
            }
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.f6571d.f6596v.b(0, this.f6569b);
        d dVar = this.f6571d;
        dVar.f6592r = 1;
        dVar.f6586l = animator;
        this.f6568a = false;
    }
}
