package com.huawei.hms.scankit.drawable;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* loaded from: classes.dex */
public class c extends AnimatorListenerAdapter {

    /* renamed from: a */
    public final /* synthetic */ ScanDrawable f7369a;

    public c(ScanDrawable scanDrawable) {
        this.f7369a = scanDrawable;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(Animator animator) {
        boolean z10;
        super.onAnimationRepeat(animator);
        ScanDrawable scanDrawable = this.f7369a;
        z10 = scanDrawable.f7353s;
        scanDrawable.f7353s = !z10;
    }
}
