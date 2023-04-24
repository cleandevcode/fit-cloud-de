package ed;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: a */
    public byte f13578a = 0;

    /* renamed from: b */
    public int f13579b = 0;

    /* renamed from: c */
    public byte[] f13580c = null;

    /* renamed from: d */
    public short f13581d = -1;

    /* renamed from: e */
    public byte[] f13582e = null;

    /* JADX WARN: Removed duplicated region for block: B:35:0x0084 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0085 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static ed.g a(byte[] r9) {
        /*
            ed.g r0 = new ed.g
            r0.<init>()
            int r1 = r9.length
            r2 = 1
            r3 = 4
            r4 = 0
            if (r1 >= r3) goto Le
            java.lang.String r9 = "LT_LENGTH_ERROR"
            goto L5c
        Le:
            r1 = r9[r4]
            r5 = r9[r2]
            r0.f13578a = r5
            r5 = 3
            r5 = r9[r5]
            int r5 = r5 << 8
            r6 = 2
            r7 = r9[r6]
            r7 = r7 & 255(0xff, float:3.57E-43)
            r5 = r5 | r7
            r7 = 65535(0xffff, float:9.1834E-41)
            r5 = r5 & r7
            r0.f13579b = r5
            r8 = -86
            if (r1 == r8) goto L38
            java.lang.Object[] r1 = new java.lang.Object[r2]
            java.lang.String r9 = he.a.a(r9)
            r1[r4] = r9
            java.lang.String r9 = "LT_SYNCWORD_ERROR: %s"
            java.lang.String r9 = java.lang.String.format(r9, r1)
            goto L5c
        L38:
            if (r5 >= r6) goto L49
            java.lang.Object[] r1 = new java.lang.Object[r2]
            java.lang.String r9 = he.a.a(r9)
            r1[r4] = r9
            java.lang.String r9 = "LT_PAYLOAD_OPCODE_LENGTH_ERROR: %s"
            java.lang.String r9 = java.lang.String.format(r9, r1)
            goto L5c
        L49:
            int r1 = r9.length
            int r8 = r5 + 4
            if (r1 >= r8) goto L61
            java.lang.Object[] r1 = new java.lang.Object[r2]
            java.lang.String r9 = he.a.a(r9)
            r1[r4] = r9
            java.lang.String r9 = "LT_PAYLOAD_LENGTH_ERROR: %s"
            java.lang.String r9 = java.lang.String.format(r9, r1)
        L5c:
            ge.b.p(r9)
            r2 = 0
            goto L82
        L61:
            byte[] r1 = new byte[r5]
            r0.f13580c = r1
            java.lang.System.arraycopy(r9, r3, r1, r4, r5)
            byte[] r1 = r0.f13580c
            r3 = r1[r2]
            int r3 = r3 << 8
            r1 = r1[r4]
            r1 = r1 & 255(0xff, float:3.57E-43)
            r1 = r1 | r3
            r1 = r1 & r7
            short r1 = (short) r1
            r0.f13581d = r1
            int r1 = r0.f13579b
            int r1 = r1 - r6
            byte[] r3 = new byte[r1]
            r0.f13582e = r3
            r5 = 6
            java.lang.System.arraycopy(r9, r5, r3, r4, r1)
        L82:
            if (r2 == 0) goto L85
            return r0
        L85:
            r9 = 0
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: ed.g.a(byte[]):ed.g");
    }

    public static byte[] b(int i10, byte[] bArr) {
        int length = bArr != null ? bArr.length : 0;
        byte[] bArr2 = new byte[length + 4];
        bArr2[0] = -86;
        bArr2[1] = (byte) i10;
        bArr2[2] = (byte) (length & 255);
        bArr2[3] = (byte) ((length >> 8) & 255);
        if (length > 0) {
            System.arraycopy(bArr, 0, bArr2, 4, length);
        }
        return bArr2;
    }
}
