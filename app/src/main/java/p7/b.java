package p7;

import android.animation.TimeInterpolator;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a */
    public static final a f23954a = new a();

    /* loaded from: classes.dex */
    public static class a implements TimeInterpolator {
        @Override // android.animation.TimeInterpolator
        public final float getInterpolation(float f10) {
            return f10;
        }
    }

    /* renamed from: p7.b$b */
    /* loaded from: classes.dex */
    public static class C0432b implements TimeInterpolator {
        @Override // android.animation.TimeInterpolator
        public final float getInterpolation(float f10) {
            float f11;
            float f12;
            float f13;
            float f14 = 1.0f - f10;
            if (f14 < 0.36363637f) {
                f13 = 7.5625f * f14 * f14;
            } else {
                if (f14 < 0.72727275f) {
                    float f15 = f14 - 0.54545456f;
                    f11 = 7.5625f * f15 * f15;
                    f12 = 0.75f;
                } else if (f14 < 0.90909094f) {
                    float f16 = f14 - 0.8181818f;
                    f11 = 7.5625f * f16 * f16;
                    f12 = 0.9375f;
                } else {
                    float f17 = f14 - 0.95454544f;
                    f11 = 7.5625f * f17 * f17;
                    f12 = 0.984375f;
                }
                f13 = f11 + f12;
            }
            return 1.0f - f13;
        }
    }

    /* loaded from: classes.dex */
    public static class c implements TimeInterpolator {
        @Override // android.animation.TimeInterpolator
        public final float getInterpolation(float f10) {
            if (f10 < 0.36363637f) {
                return 7.5625f * f10 * f10;
            }
            if (f10 < 0.72727275f) {
                float f11 = f10 - 0.54545456f;
                return (7.5625f * f11 * f11) + 0.75f;
            } else if (f10 < 0.90909094f) {
                float f12 = f10 - 0.8181818f;
                return (7.5625f * f12 * f12) + 0.9375f;
            } else {
                float f13 = f10 - 0.95454544f;
                return (7.5625f * f13 * f13) + 0.984375f;
            }
        }
    }

    static {
        new C0432b();
        new c();
    }
}
