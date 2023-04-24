package com.huawei.hms.scankit.p;

/* renamed from: com.huawei.hms.scankit.p.ya */
/* loaded from: classes.dex */
public final class C0737ya extends com.huawei.hms.scankit.aiscan.common.z {

    /* renamed from: e */
    private final float f8115e;

    public C0737ya(float f10, float f11, float f12) {
        super(f10, f11);
        this.f8115e = f12;
    }

    public boolean a(float f10, float f11, float f12) {
        if (Math.abs(f11 - c()) > f10 || Math.abs(f12 - b()) > f10) {
            return false;
        }
        float abs = Math.abs(f10 - this.f8115e);
        return abs <= 1.0f || abs <= this.f8115e;
    }

    public C0737ya b(float f10, float f11, float f12) {
        return new C0737ya((b() + f11) / 2.0f, (c() + f10) / 2.0f, (this.f8115e + f12) / 2.0f);
    }
}
