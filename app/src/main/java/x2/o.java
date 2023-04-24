package x2;

import android.annotation.SuppressLint;
import android.view.View;

/* loaded from: classes.dex */
public class o extends androidx.transition.m {

    /* renamed from: e */
    public static boolean f30187e = true;

    @SuppressLint({"NewApi"})
    public float c(View view) {
        float transitionAlpha;
        if (f30187e) {
            try {
                transitionAlpha = view.getTransitionAlpha();
                return transitionAlpha;
            } catch (NoSuchMethodError unused) {
                f30187e = false;
            }
        }
        return view.getAlpha();
    }

    @SuppressLint({"NewApi"})
    public void d(View view, float f10) {
        if (f30187e) {
            try {
                view.setTransitionAlpha(f10);
                return;
            } catch (NoSuchMethodError unused) {
                f30187e = false;
            }
        }
        view.setAlpha(f10);
    }
}
