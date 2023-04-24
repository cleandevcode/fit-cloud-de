package nj;

/* loaded from: classes2.dex */
public final class m extends mj.a {
    public m(byte[] bArr) {
        super(9, bArr);
    }

    public final int f() {
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

    public final int g() {
        byte[] bArr = this.f21878b;
        if (bArr == null) {
            return 0;
        }
        int i10 = (bArr[2] & 255) | ((bArr[1] & 255) << 8);
        if (i10 < 0) {
            return 0;
        }
        if (i10 > 1439) {
            return 1439;
        }
        return i10;
    }
}
