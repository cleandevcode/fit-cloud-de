package com.huawei.hms.scankit.p;

/* loaded from: classes.dex */
public final class Qa extends com.huawei.hms.scankit.aiscan.common.z {

    /* renamed from: e */
    private final float f7664e;

    /* renamed from: f */
    private final int f7665f;

    /* renamed from: g */
    private final boolean f7666g;

    public Qa(float f10, float f11, float f12, boolean z10) {
        this(f10, f11, f12, z10, 1);
    }

    public Qa(float f10, float f11, float f12, boolean z10, int i10) {
        super(f10, f11, i10);
        this.f7664e = f12;
        this.f7665f = i10;
        this.f7666g = z10;
    }

    public Qa a(float f10, float f11, float f12, boolean z10) {
        int i10 = this.f7665f;
        int i11 = i10 + 1;
        float b10 = (b() * i10) + f11;
        float f13 = i11;
        float f14 = b10 / f13;
        float c10 = ((c() * this.f7665f) + f10) / f13;
        float f15 = ((this.f7665f * this.f7664e) + f12) / f13;
        boolean z11 = this.f7666g;
        return new Qa(f14, c10, f15, z11 ? z10 : z11, i11);
    }

    public boolean a(float f10, float f11, float f12) {
        if (Math.abs(f11 - c()) > f10 || Math.abs(f12 - b()) > f10) {
            return false;
        }
        float abs = Math.abs(f10 - this.f7664e);
        return abs <= 1.0f || abs <= this.f7664e;
    }

    @Override // com.huawei.hms.scankit.aiscan.common.z
    public boolean d() {
        return this.f7666g;
    }

    public float e() {
        return this.f7664e;
    }
}
