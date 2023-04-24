package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.material.floatingactionbutton.d;

/* loaded from: classes.dex */
public final class c extends AnimatorListenerAdapter {

    /* renamed from: a */
    public final /* synthetic */ boolean f6572a;

    /* renamed from: b */
    public final /* synthetic */ d.g f6573b;

    /* renamed from: c */
    public final /* synthetic */ d f6574c;

    public c(d dVar, boolean z10, a aVar) {
        this.f6574c = dVar;
        this.f6572a = z10;
        this.f6573b = aVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        d dVar = this.f6574c;
        dVar.f6592r = 0;
        dVar.f6586l = null;
        d.g gVar = this.f6573b;
        if (gVar != null) {
            ((a) gVar).f6566a.b();
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.f6574c.f6596v.b(0, this.f6572a);
        d dVar = this.f6574c;
        dVar.f6592r = 2;
        dVar.f6586l = animator;
    }
}
