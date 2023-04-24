package nj;

import mj.a;

/* loaded from: classes2.dex */
public final class b extends mj.a {

    /* loaded from: classes2.dex */
    public static final class a extends a.AbstractC0386a {
        public a(byte[] bArr) {
            super(10, bArr);
        }
    }

    public b(byte[] bArr) {
        super(10, bArr);
    }

    public final int f() {
        byte[] bArr = this.f21878b;
        if (bArr == null) {
            return 0;
        }
        return bArr[0] & 255;
    }

    public final int g() {
        byte[] bArr = this.f21878b;
        if (bArr == null) {
            return 0;
        }
        return bArr[1] & 255;
    }

    public final boolean h() {
        byte[] bArr = this.f21878b;
        if (bArr == null || bArr[2] <= 0) {
            return false;
        }
        return true;
    }
}
