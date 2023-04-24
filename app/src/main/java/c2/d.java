package c2;

import android.view.animation.Interpolator;
import t0.e;

/* loaded from: classes.dex */
public abstract class d implements Interpolator {

    /* renamed from: a */
    public final float[] f4526a;

    /* renamed from: b */
    public final float f4527b;

    public d(float[] fArr) {
        this.f4526a = fArr;
        this.f4527b = 1.0f / (fArr.length - 1);
    }

    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f10) {
        if (f10 >= 1.0f) {
            return 1.0f;
        }
        if (f10 <= 0.0f) {
            return 0.0f;
        }
        float[] fArr = this.f4526a;
        int min = Math.min((int) ((fArr.length - 1) * f10), fArr.length - 2);
        float f11 = this.f4527b;
        float f12 = (f10 - (min * f11)) / f11;
        float[] fArr2 = this.f4526a;
        float f13 = fArr2[min];
        return e.a(fArr2[min + 1], f13, f12, f13);
    }
}