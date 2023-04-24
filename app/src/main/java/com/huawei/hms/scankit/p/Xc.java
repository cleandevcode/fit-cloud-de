package com.huawei.hms.scankit.p;

/* loaded from: classes.dex */
public class Xc implements Vc {

    /* renamed from: a */
    private final float f7774a;

    /* renamed from: b */
    private final float f7775b;

    public Xc(float f10, float f11) {
        this.f7775b = f10;
        this.f7774a = f11;
    }

    @Override // com.huawei.hms.scankit.p.Vc
    public void a(Pc pc2) {
        float f10 = this.f7774a;
        float f11 = this.f7775b;
        if (f10 != f11) {
            f10 = Yc.a(f10 - f11) + this.f7775b;
        }
        pc2.b(f10);
        pc2.a(f10);
    }
}
