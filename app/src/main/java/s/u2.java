package s;

/* loaded from: classes.dex */
public final class u2 {

    /* renamed from: a */
    public float f26214a;

    /* renamed from: b */
    public final float f26215b;

    /* renamed from: c */
    public final float f26216c;

    /* renamed from: d */
    public float f26217d;

    public u2(float f10, float f11) {
        this.f26215b = f10;
        this.f26216c = f11;
    }

    public final void a() {
        float f10 = this.f26215b;
        float f11 = 1.0f;
        int i10 = (1.0f > f10 ? 1 : (1.0f == f10 ? 0 : -1));
        if (i10 <= 0) {
            float f12 = this.f26216c;
            if (1.0f >= f12) {
                this.f26214a = 1.0f;
                if (f10 != f12) {
                    if (i10 != 0) {
                        if (1.0f != f12) {
                            float f13 = 1.0f / f12;
                            f11 = (1.0f - f13) / ((1.0f / f10) - f13);
                        }
                    }
                    this.f26217d = f11;
                    return;
                }
                f11 = 0.0f;
                this.f26217d = f11;
                return;
            }
        }
        throw new IllegalArgumentException("Requested zoomRatio 1.0 is not within valid range [" + this.f26216c + " , " + this.f26215b + "]");
    }
}
