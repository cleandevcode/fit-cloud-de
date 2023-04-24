package cn.sharesdk.framework.utils;

import android.graphics.RectF;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;

/* loaded from: classes.dex */
public class l {
    public static ShapeDrawable a(float f10, int i10) {
        float[] fArr = new float[8];
        float[] fArr2 = new float[8];
        for (int i11 = 0; i11 < 8; i11++) {
            fArr[i11] = 0.0f + f10;
            fArr2[i11] = f10;
        }
        ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(fArr, new RectF(0.0f, 0.0f, 0.0f, 0.0f), fArr2));
        shapeDrawable.getPaint().setColor(i10);
        return shapeDrawable;
    }
}
