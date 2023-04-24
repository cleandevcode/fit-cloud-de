package j7;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.github.kilnn.tool.widget.bottomsheet.BottomSheetLayout;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

/* loaded from: classes.dex */
public final class c extends AnimatorListenerAdapter {

    /* renamed from: a */
    public final /* synthetic */ BottomSheetLayout f17515a;

    public c(BottomSheetLayout bottomSheetLayout) {
        this.f17515a = bottomSheetLayout;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        float fabTranslationX;
        FloatingActionButton c10 = this.f17515a.c();
        if (c10 != null) {
            fabTranslationX = this.f17515a.getFabTranslationX();
            c10.setTranslationX(fabTranslationX);
        }
    }
}
