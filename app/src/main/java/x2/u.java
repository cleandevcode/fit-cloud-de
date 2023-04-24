package x2;

import android.annotation.SuppressLint;
import android.os.Build;
import android.view.View;

/* loaded from: classes.dex */
public class u extends t {

    /* renamed from: i */
    public static boolean f30191i = true;

    @Override // androidx.transition.m
    @SuppressLint({"NewApi"})
    public void b(View view, int i10) {
        if (Build.VERSION.SDK_INT == 28) {
            super.b(view, i10);
        } else if (f30191i) {
            try {
                view.setTransitionVisibility(i10);
            } catch (NoSuchMethodError unused) {
                f30191i = false;
            }
        }
    }
}
