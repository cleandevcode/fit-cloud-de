package com.huawei.hms.scankit.p;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class Vb extends Xb {

    /* renamed from: c */
    private final short f7759c;

    /* renamed from: d */
    private final short f7760d;

    public Vb(Xb xb2, int i10, int i11) {
        super(xb2);
        this.f7759c = (short) i10;
        this.f7760d = (short) i11;
    }

    @Override // com.huawei.hms.scankit.p.Xb
    public void a(C0732x c0732x, byte[] bArr) {
        c0732x.a(this.f7759c, this.f7760d);
    }

    public String toString() {
        short s10 = this.f7759c;
        int i10 = 1 << this.f7760d;
        int i11 = (s10 & (i10 - 1)) | i10;
        return '<' + Integer.toBinaryString(i11 | (1 << this.f7760d)).substring(1) + '>';
    }
}
