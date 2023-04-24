package nj;

import bi.m0;

/* loaded from: classes2.dex */
public final class c extends mj.a {
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public c(byte[] r4) {
        /*
            r3 = this;
            r0 = 38
            if (r4 != 0) goto L6
            r4 = 0
            goto L10
        L6:
            int r1 = r4.length
            if (r1 <= r0) goto L10
            byte[] r1 = new byte[r0]
            r2 = 0
            java.lang.System.arraycopy(r4, r2, r1, r2, r0)
            r4 = r1
        L10:
            r3.<init>(r0, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: nj.c.<init>(byte[]):void");
    }

    public final String f() {
        return b(0, 6);
    }

    public final boolean g(int i10) {
        boolean x10;
        if (i10 < 256) {
            int i11 = i10 + 0;
            byte[] bArr = this.f21878b;
            if (bArr != null) {
                x10 = m0.x(bArr, 9, i11);
            }
            x10 = false;
        } else {
            int i12 = i10 - 256;
            byte[] bArr2 = this.f21878b;
            if (bArr2 != null) {
                x10 = m0.x(bArr2, 37, i12);
            }
            x10 = false;
        }
        if (i10 != 18 && i10 != 256 && i10 != 294) {
            return x10;
        }
        if (x10) {
            return false;
        }
        return true;
    }

    public final boolean h(int i10) {
        byte[] bArr = this.f21878b;
        if (bArr == null) {
            return false;
        }
        return m0.x(bArr, 13, i10);
    }
}
