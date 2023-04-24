package e0;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.Rational;
import android.util.Size;
import androidx.appcompat.widget.u0;
import androidx.camera.core.t;
import java.util.HashMap;
import java.util.Map;
import s.h1;

/* loaded from: classes.dex */
public final class l {
    public static HashMap a(Rect rect, boolean z10, Rational rational, int i10, int i11, int i12, HashMap hashMap) {
        Matrix.ScaleToFit scaleToFit;
        boolean z11 = false;
        h1.e("Cannot compute viewport crop rects zero sized sensor rect.", rect.width() > 0 && rect.height() > 0);
        RectF rectF = new RectF(rect);
        HashMap hashMap2 = new HashMap();
        RectF rectF2 = new RectF(rect);
        for (Map.Entry entry : hashMap.entrySet()) {
            Matrix matrix = new Matrix();
            RectF rectF3 = new RectF(0.0f, 0.0f, ((Size) entry.getValue()).getWidth(), ((Size) entry.getValue()).getHeight());
            matrix.setRectToRect(rectF3, rectF, Matrix.ScaleToFit.CENTER);
            hashMap2.put((t) entry.getKey(), matrix);
            RectF rectF4 = new RectF();
            matrix.mapRect(rectF4, rectF3);
            rectF2.intersect(rectF4);
        }
        Rational a10 = i0.a.a(i10, rational);
        if (i11 != 3) {
            Matrix matrix2 = new Matrix();
            RectF rectF5 = new RectF(0.0f, 0.0f, a10.getNumerator(), a10.getDenominator());
            if (i11 == 0) {
                scaleToFit = Matrix.ScaleToFit.START;
            } else if (i11 == 1) {
                scaleToFit = Matrix.ScaleToFit.CENTER;
            } else if (i11 != 2) {
                throw new IllegalStateException(u0.a("Unexpected scale type: ", i11));
            } else {
                scaleToFit = Matrix.ScaleToFit.END;
            }
            matrix2.setRectToRect(rectF5, rectF2, scaleToFit);
            RectF rectF6 = new RectF();
            matrix2.mapRect(rectF6, rectF5);
            boolean z12 = (i12 == 1) ^ z10;
            boolean z13 = i10 == 0 && !z12;
            boolean z14 = i10 == 90 && z12;
            if (!z13 && !z14) {
                boolean z15 = i10 == 0 && z12;
                boolean z16 = i10 == 270 && !z12;
                if (!z15 && !z16) {
                    boolean z17 = i10 == 90 && !z12;
                    boolean z18 = i10 == 180 && z12;
                    if (!z17 && !z18) {
                        boolean z19 = i10 == 180 && !z12;
                        if (i10 == 270 && z12) {
                            z11 = true;
                        }
                        if (!z19 && !z11) {
                            throw new IllegalArgumentException("Invalid argument: mirrored " + z12 + " rotation " + i10);
                        }
                        float centerY = rectF2.centerY();
                        float f10 = centerY + centerY;
                        rectF6 = new RectF(rectF6.left, f10 - rectF6.bottom, rectF6.right, f10 - rectF6.top);
                    } else {
                        float centerY2 = rectF2.centerY();
                        float f11 = centerY2 + centerY2;
                        rectF2 = new RectF(rectF6.left, f11 - rectF6.bottom, rectF6.right, f11 - rectF6.top);
                    }
                }
                rectF6 = b(rectF6, rectF2.centerX());
            }
            rectF2 = rectF6;
        }
        HashMap hashMap3 = new HashMap();
        RectF rectF7 = new RectF();
        Matrix matrix3 = new Matrix();
        for (Map.Entry entry2 : hashMap2.entrySet()) {
            ((Matrix) entry2.getValue()).invert(matrix3);
            matrix3.mapRect(rectF7, rectF2);
            Rect rect2 = new Rect();
            rectF7.round(rect2);
            hashMap3.put((t) entry2.getKey(), rect2);
        }
        return hashMap3;
    }

    public static RectF b(RectF rectF, float f10) {
        float f11 = f10 + f10;
        return new RectF(f11 - rectF.right, rectF.top, f11 - rectF.left, rectF.bottom);
    }
}
