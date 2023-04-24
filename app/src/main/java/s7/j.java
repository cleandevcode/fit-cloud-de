package s7;

import android.graphics.Paint;
import android.util.DisplayMetrics;

/* loaded from: classes.dex */
public final class j extends s7.a {
    public a G;
    public boolean B = true;
    public boolean C = true;
    public float D = 10.0f;
    public float E = 10.0f;
    public int F = 1;
    public float H = Float.POSITIVE_INFINITY;

    /* loaded from: classes.dex */
    public enum a {
        LEFT,
        RIGHT
    }

    public j(a aVar) {
        this.G = aVar;
        this.f26658c = 0.0f;
    }

    @Override // s7.a
    public final void a(float f10, float f11) {
        float f12;
        float f13;
        if (Math.abs(f11 - f10) == 0.0f) {
            f11 += 1.0f;
            f10 -= 1.0f;
        }
        float abs = Math.abs(f11 - f10);
        if (this.f26652w) {
            f12 = this.f26655z;
        } else {
            f12 = f10 - ((abs / 100.0f) * this.E);
        }
        this.f26655z = f12;
        if (this.f26653x) {
            f13 = this.f26654y;
        } else {
            f13 = f11 + ((abs / 100.0f) * this.D);
        }
        this.f26654y = f13;
        this.A = Math.abs(f12 - f13);
    }

    public final float h(Paint paint) {
        paint.setTextSize(this.f26659d);
        String c10 = c();
        DisplayMetrics displayMetrics = a8.f.f387a;
        float measureText = (this.f26657b * 2.0f) + ((int) paint.measureText(c10));
        float f10 = this.H;
        if (f10 > 0.0f && f10 != Float.POSITIVE_INFINITY) {
            f10 = a8.f.c(f10);
        }
        if (f10 <= 0.0d) {
            f10 = measureText;
        }
        return Math.max(0.0f, Math.min(measureText, f10));
    }
}
