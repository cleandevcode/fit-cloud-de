package l9;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import androidx.appcompat.widget.ActionMenuView;
import com.google.android.material.bottomappbar.BottomAppBar;

/* loaded from: classes.dex */
public final class d extends AnimatorListenerAdapter {

    /* renamed from: a */
    public boolean f19410a;

    /* renamed from: b */
    public final /* synthetic */ ActionMenuView f19411b;

    /* renamed from: c */
    public final /* synthetic */ int f19412c;

    /* renamed from: d */
    public final /* synthetic */ boolean f19413d;

    /* renamed from: e */
    public final /* synthetic */ BottomAppBar f19414e;

    public d(BottomAppBar bottomAppBar, ActionMenuView actionMenuView, int i10, boolean z10) {
        this.f19414e = bottomAppBar;
        this.f19411b = actionMenuView;
        this.f19412c = i10;
        this.f19413d = z10;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.f19410a = true;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        boolean z10;
        if (!this.f19410a) {
            BottomAppBar bottomAppBar = this.f19414e;
            int i10 = bottomAppBar.f6269k0;
            if (i10 != 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (i10 != 0) {
                bottomAppBar.f6269k0 = 0;
                bottomAppBar.getMenu().clear();
                bottomAppBar.k(i10);
            }
            this.f19414e.C(this.f19411b, this.f19412c, this.f19413d, z10);
        }
    }
}
