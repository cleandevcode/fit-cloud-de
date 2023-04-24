package nj;

import mj.a;

/* loaded from: classes2.dex */
public final class f extends mj.a {

    /* loaded from: classes2.dex */
    public static final class a extends a.AbstractC0386a {
        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public a(byte[] r5) {
            /*
                r4 = this;
                r0 = 0
                r1 = 7
                if (r5 != 0) goto L5
                goto L12
            L5:
                int r2 = r5.length
                r3 = 5
                if (r2 == r3) goto Ld
                if (r2 == r1) goto L11
                r5 = r0
                goto L11
            Ld:
                byte[] r5 = a0.m.c(r5)
            L11:
                r0 = r5
            L12:
                r4.<init>(r1, r0)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: nj.f.a.<init>(byte[]):void");
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public f(byte[] r5) {
        /*
            r4 = this;
            r0 = 0
            r1 = 7
            if (r5 != 0) goto L5
            goto L12
        L5:
            int r2 = r5.length
            r3 = 5
            if (r2 == r3) goto Ld
            if (r2 == r1) goto L11
            r5 = r0
            goto L11
        Ld:
            byte[] r5 = a0.m.c(r5)
        L11:
            r0 = r5
        L12:
            r4.<init>(r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: nj.f.<init>(byte[]):void");
    }

    @Override // mj.a
    public final byte[] c(c cVar) {
        gm.l.f(cVar, "deviceInfo");
        boolean g10 = cVar.g(274);
        byte[] bArr = this.f21878b;
        if (bArr == null) {
            if (g10) {
                return new byte[7];
            }
            return new byte[5];
        } else if (!g10) {
            byte[] bArr2 = new byte[5];
            System.arraycopy(bArr, 0, bArr2, 0, 5);
            return bArr2;
        } else {
            return bArr;
        }
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
