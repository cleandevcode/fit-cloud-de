package x2;

import android.annotation.SuppressLint;
import android.graphics.Matrix;
import android.view.View;

/* loaded from: classes.dex */
public class r extends o {

    /* renamed from: f */
    public static boolean f30188f = true;

    /* renamed from: g */
    public static boolean f30189g = true;

    @SuppressLint({"NewApi"})
    public void e(View view, Matrix matrix) {
        if (f30188f) {
            try {
                view.transformMatrixToGlobal(matrix);
            } catch (NoSuchMethodError unused) {
                f30188f = false;
            }
        }
    }

    @SuppressLint({"NewApi"})
    public void f(View view, Matrix matrix) {
        if (f30189g) {
            try {
                view.transformMatrixToLocal(matrix);
            } catch (NoSuchMethodError unused) {
                f30189g = false;
            }
        }
    }
}
