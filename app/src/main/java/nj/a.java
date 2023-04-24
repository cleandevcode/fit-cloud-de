package nj;

import mj.a;

/* loaded from: classes2.dex */
public final class a extends mj.a {

    /* renamed from: nj.a$a */
    /* loaded from: classes2.dex */
    public static final class C0404a extends a.AbstractC0386a {
        public C0404a(byte[] bArr) {
            super(5, bArr);
        }
    }

    public a(byte[] bArr) {
        super(5, bArr);
    }

    public final int f() {
        byte[] bArr = this.f21878b;
        if (bArr == null) {
            return 0;
        }
        return bArr[4] & 255;
    }

    public final int g() {
        byte[] bArr = this.f21878b;
        if (bArr == null) {
            return 0;
        }
        return bArr[3] & 255;
    }

    public final int h() {
        byte[] bArr = this.f21878b;
        if (bArr == null) {
            return 0;
        }
        return bArr[2] & 255;
    }

    public final int i() {
        byte[] bArr = this.f21878b;
        if (bArr == null) {
            return 0;
        }
        return bArr[1] & 255;
    }

    public final boolean j() {
        byte[] bArr = this.f21878b;
        if (bArr == null || bArr[0] <= 0) {
            return false;
        }
        return true;
    }
}
