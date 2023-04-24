package b0;

import android.graphics.Matrix;
import android.graphics.RectF;
import androidx.appcompat.widget.u0;

/* loaded from: classes.dex */
public final class p {

    /* renamed from: a */
    public static final RectF f3976a = new RectF(-1.0f, -1.0f, 1.0f, 1.0f);

    public static Matrix a(int i10, RectF rectF, RectF rectF2, boolean z10) {
        Matrix matrix = new Matrix();
        RectF rectF3 = f3976a;
        matrix.setRectToRect(rectF, rectF3, Matrix.ScaleToFit.FILL);
        matrix.postRotate(i10);
        if (z10) {
            matrix.postScale(-1.0f, 1.0f);
        }
        Matrix matrix2 = new Matrix();
        matrix2.setRectToRect(rectF3, rectF2, Matrix.ScaleToFit.FILL);
        matrix.postConcat(matrix2);
        return matrix;
    }

    public static boolean b(int i10) {
        if (i10 != 90 && i10 != 270) {
            if (i10 != 0 && i10 != 180) {
                throw new IllegalArgumentException(u0.a("Invalid rotation degrees: ", i10));
            }
            return false;
        }
        return true;
    }
}
