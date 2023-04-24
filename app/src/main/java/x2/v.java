package x2;

import android.graphics.Matrix;
import android.view.View;

/* loaded from: classes.dex */
public final class v extends u {
    @Override // x2.t, androidx.transition.m
    public final void a(View view, int i10, int i11, int i12, int i13) {
        view.setLeftTopRightBottom(i10, i11, i12, i13);
    }

    @Override // x2.u, androidx.transition.m
    public final void b(View view, int i10) {
        view.setTransitionVisibility(i10);
    }

    @Override // x2.o
    public final float c(View view) {
        float transitionAlpha;
        transitionAlpha = view.getTransitionAlpha();
        return transitionAlpha;
    }

    @Override // x2.o
    public final void d(View view, float f10) {
        view.setTransitionAlpha(f10);
    }

    @Override // x2.r
    public final void e(View view, Matrix matrix) {
        view.transformMatrixToGlobal(matrix);
    }

    @Override // x2.r
    public final void f(View view, Matrix matrix) {
        view.transformMatrixToLocal(matrix);
    }
}
