package x2;

import android.annotation.SuppressLint;
import android.view.View;

/* loaded from: classes.dex */
public class t extends r {

    /* renamed from: h */
    public static boolean f30190h = true;

    @Override // androidx.transition.m
    @SuppressLint({"NewApi"})
    public void a(View view, int i10, int i11, int i12, int i13) {
        if (f30190h) {
            try {
                view.setLeftTopRightBottom(i10, i11, i12, i13);
            } catch (NoSuchMethodError unused) {
                f30190h = false;
            }
        }
    }
}
