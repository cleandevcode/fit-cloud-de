package com.huawei.hms.scankit.p;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class Sb extends Xb {

    /* renamed from: c */
    private final short f7715c;

    /* renamed from: d */
    private final short f7716d;

    public Sb(Xb xb2, int i10, int i11) {
        super(xb2);
        this.f7715c = (short) i10;
        this.f7716d = (short) i11;
    }

    @Override // com.huawei.hms.scankit.p.Xb
    public void a(C0732x c0732x, byte[] bArr) {
        int i10;
        int i11 = 0;
        while (true) {
            short s10 = this.f7716d;
            if (i11 >= s10) {
                return;
            }
            if (i11 == 0 || (i11 == 31 && s10 <= 62)) {
                int i12 = 5;
                c0732x.a(31, 5);
                short s11 = this.f7716d;
                if (s11 > 62) {
                    i10 = s11 - 31;
                    i12 = 16;
                } else if (i11 == 0) {
                    c0732x.a(Math.min((int) s11, 31), 5);
                } else {
                    i10 = s11 - 31;
                }
                c0732x.a(i10, i12);
            }
            c0732x.a(bArr[this.f7715c + i11], 8);
            i11++;
        }
    }

    public String toString() {
        StringBuilder a10 = android.support.v4.media.d.a("<");
        a10.append((int) this.f7715c);
        a10.append("::");
        a10.append((this.f7715c + this.f7716d) - 1);
        a10.append('>');
        return a10.toString();
    }
}
