package q7;

import t7.c;

/* loaded from: classes.dex */
public class a {

    /* renamed from: b */
    public final float[] f24630b;

    /* renamed from: e */
    public boolean f24633e;

    /* renamed from: c */
    public float f24631c = 1.0f;

    /* renamed from: d */
    public float f24632d = 1.0f;

    /* renamed from: a */
    public int f24629a = 0;

    /* renamed from: f */
    public boolean f24634f = false;

    /* renamed from: g */
    public float f24635g = 1.0f;

    public a(int i10, boolean z10) {
        this.f24630b = new float[i10];
        this.f24633e = z10;
    }

    public final void a(float f10, float f11, float f12, float f13) {
        float[] fArr = this.f24630b;
        int i10 = this.f24629a;
        int i11 = i10 + 1;
        fArr[i10] = f10;
        int i12 = i11 + 1;
        fArr[i11] = f11;
        int i13 = i12 + 1;
        fArr[i12] = f12;
        this.f24629a = i13 + 1;
        fArr[i13] = f13;
    }

    public void b(x7.a aVar) {
        float f10;
        float f11;
        float abs;
        float abs2;
        float f12;
        float f13;
        float Y = aVar.Y() * this.f24631c;
        float f14 = this.f24635g / 2.0f;
        for (int i10 = 0; i10 < Y; i10++) {
            c cVar = (c) aVar.x(i10);
            if (cVar != null) {
                float f15 = cVar.f27841c;
                float f16 = cVar.f27821a;
                float[] fArr = cVar.f27802d;
                if (this.f24633e && fArr != null) {
                    float f17 = -cVar.f27804f;
                    int i11 = 0;
                    float f18 = 0.0f;
                    while (i11 < fArr.length) {
                        float f19 = fArr[i11];
                        int i12 = (f19 > 0.0f ? 1 : (f19 == 0.0f ? 0 : -1));
                        if (i12 == 0 && (f18 == 0.0f || f17 == 0.0f)) {
                            abs = f19;
                            abs2 = f17;
                            f17 = abs;
                        } else if (i12 >= 0) {
                            abs = f19 + f18;
                            abs2 = f17;
                            f17 = f18;
                            f18 = abs;
                        } else {
                            abs = Math.abs(f19) + f17;
                            abs2 = Math.abs(f19) + f17;
                        }
                        float f20 = f15 - f14;
                        float f21 = f15 + f14;
                        if (this.f24634f) {
                            if (f17 >= abs) {
                                f13 = f17;
                            } else {
                                f13 = abs;
                            }
                            if (f17 > abs) {
                                f17 = abs;
                            }
                        } else {
                            if (f17 >= abs) {
                                f12 = f17;
                            } else {
                                f12 = abs;
                            }
                            if (f17 > abs) {
                                f17 = abs;
                            }
                            float f22 = f17;
                            f17 = f12;
                            f13 = f22;
                        }
                        float f23 = this.f24632d;
                        a(f20, f17 * f23, f21, f13 * f23);
                        i11++;
                        f17 = abs2;
                    }
                } else {
                    float f24 = f15 - f14;
                    float f25 = f15 + f14;
                    if (this.f24634f) {
                        if (f16 >= 0.0f) {
                            f11 = f16;
                        } else {
                            f11 = 0.0f;
                        }
                        if (f16 > 0.0f) {
                            f16 = 0.0f;
                        }
                    } else {
                        if (f16 >= 0.0f) {
                            f10 = f16;
                        } else {
                            f10 = 0.0f;
                        }
                        if (f16 > 0.0f) {
                            f16 = 0.0f;
                        }
                        float f26 = f16;
                        f16 = f10;
                        f11 = f26;
                    }
                    if (f16 > 0.0f) {
                        f16 *= this.f24632d;
                    } else {
                        f11 *= this.f24632d;
                    }
                    a(f24, f16, f25, f11);
                }
            }
        }
        this.f24629a = 0;
    }
}
