package j7;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.github.kilnn.tool.widget.bottomsheet.BottomSheetLayout;

/* loaded from: classes.dex */
public final class a extends AnimatorListenerAdapter {

    /* renamed from: a */
    public final /* synthetic */ BottomSheetLayout f17511a;

    public a(BottomSheetLayout bottomSheetLayout) {
        this.f17511a = bottomSheetLayout;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.f17511a.getClass();
        this.f17511a.f5932c = null;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.f17511a.getClass();
    }
}
