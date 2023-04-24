package nj;

import mj.a;

/* loaded from: classes2.dex */
public final class d extends mj.a {

    /* loaded from: classes2.dex */
    public static final class a extends a.AbstractC0386a {
        public a(byte[] bArr) {
            super(9, bArr);
        }
    }

    /* loaded from: classes2.dex */
    public static final class b {
    }

    static {
        new b();
    }

    public d(byte[] bArr) {
        super(9, bArr);
    }

    public final int f() {
        byte[] bArr = this.f21878b;
        if (bArr == null) {
            return 0;
        }
        int i10 = (bArr[6] & 255) | ((bArr[5] & 255) << 8);
        if (i10 < 0) {
            return 0;
        }
        if (i10 > 1439) {
            return 1439;
        }
        return i10;
    }

    public final int g() {
        byte[] bArr = this.f21878b;
        if (bArr == null) {
            return 0;
        }
        int i10 = (bArr[2] & 255) | ((bArr[1] & 255) << 8);
        if (i10 < 30) {
            return 30;
        }
        if (i10 > 180) {
            return 180;
        }
        return i10;
    }

    public final int h() {
        byte[] bArr = this.f21878b;
        if (bArr == null) {
            return 0;
        }
        int i10 = (bArr[4] & 255) | ((bArr[3] & 255) << 8);
        if (i10 < 0) {
            return 0;
        }
        if (i10 > 1439) {
            return 1439;
        }
        return i10;
    }
}
