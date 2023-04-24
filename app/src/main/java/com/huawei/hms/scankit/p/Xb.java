package com.huawei.hms.scankit.p;

/* loaded from: classes.dex */
public abstract class Xb {

    /* renamed from: a */
    public static final Xb f7772a = new Vb(null, 0, 0);

    /* renamed from: b */
    private final Xb f7773b;

    public Xb(Xb xb2) {
        this.f7773b = xb2;
    }

    public final Xb a() {
        return this.f7773b;
    }

    public final Xb a(int i10, int i11) {
        return new Vb(this, i10, i11);
    }

    public abstract void a(C0732x c0732x, byte[] bArr);

    public final Xb b(int i10, int i11) {
        return new Sb(this, i10, i11);
    }
}
