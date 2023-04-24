package g4;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: a */
    public h f14980a;

    /* renamed from: b */
    public final b f14981b;

    /* renamed from: c */
    public final int f14982c;

    /* renamed from: d */
    public final int f14983d;

    /* renamed from: e */
    public int f14984e;

    /* renamed from: f */
    public int[] f14985f;

    /* renamed from: g */
    public j1.e f14986g = new j1.e();

    /* renamed from: h */
    public int f14987h;

    /* renamed from: i */
    public int f14988i;

    public h(b bVar, String str, String str2, String[] strArr) {
        if (bVar.f14956p == null) {
            bVar.f14956p = this;
        } else {
            bVar.f14957q.f14980a = this;
        }
        bVar.f14957q = this;
        this.f14981b = bVar;
        this.f14982c = bVar.d(str);
        this.f14983d = bVar.d(str2);
        if (strArr == null || strArr.length <= 0) {
            return;
        }
        int length = strArr.length;
        this.f14984e = length;
        this.f14985f = new int[length];
        for (int i10 = 0; i10 < this.f14984e; i10++) {
            this.f14985f[i10] = bVar.b(strArr[i10]).f14962a;
        }
    }

    public final void a(String str, int i10, String str2, String str3) {
        b bVar = this.f14981b;
        bVar.f14948h.a(str, 9, str2, str3);
        d a10 = bVar.a(bVar.f14948h);
        if (a10 == null) {
            int i11 = bVar.b(str).f14962a;
            int i12 = bVar.c(str2, str3).f14962a;
            j1.e eVar = bVar.f14943c;
            eVar.c(9, i11);
            eVar.g(i12);
            int i13 = bVar.f14942b;
            bVar.f14942b = i13 + 1;
            a10 = new d(i13, bVar.f14948h);
            bVar.e(a10);
        }
        this.f14986g.c(i10, a10.f14962a);
    }

    public final void b(int i10) {
        this.f14986g.d(i10);
    }

    public final void c(int i10, int i11) {
        this.f14986g.b(i10, i11);
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x0043, code lost:
        if (r6 != false) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void d(int r6, g4.e r7) {
        /*
            r5 = this;
            int r0 = r7.f14971a
            r0 = r0 & 2
            if (r0 == 0) goto L18
            int r0 = r7.f14972b
            j1.e r1 = r5.f14986g
            int r1 = r1.f17259a
            int r0 = r0 - r1
            r1 = -32768(0xffffffffffff8000, float:NaN)
            if (r0 < r1) goto L12
            goto L18
        L12:
            java.lang.UnsupportedOperationException r6 = new java.lang.UnsupportedOperationException
            r6.<init>()
            throw r6
        L18:
            j1.e r0 = r5.f14986g
            r0.d(r6)
            j1.e r0 = r5.f14986g
            int r1 = r0.f17259a
            int r2 = r1 + (-1)
            r3 = 200(0xc8, float:2.8E-43)
            if (r6 != r3) goto L29
            r6 = 1
            goto L2a
        L29:
            r6 = 0
        L2a:
            int r3 = r7.f14971a
            r3 = r3 & 2
            r4 = -1
            if (r3 != 0) goto L3f
            if (r6 == 0) goto L39
            r6 = 536870912(0x20000000, float:1.0842022E-19)
            r7.a(r2, r1, r6)
            goto L45
        L39:
            r6 = 268435456(0x10000000, float:2.524355E-29)
            r7.a(r2, r1, r6)
            goto L49
        L3f:
            int r7 = r7.f14972b
            int r4 = r7 - r2
            if (r6 == 0) goto L49
        L45:
            r0.f(r4)
            goto L4c
        L49:
            r0.g(r4)
        L4c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: g4.h.d(int, g4.e):void");
    }

    public final void e(e eVar) {
        j1.e eVar2 = this.f14986g;
        int i10 = eVar2.f17259a;
        byte[] bArr = (byte[]) eVar2.f17260b;
        eVar.f14971a |= 2;
        eVar.f14972b = i10;
        int i11 = 0;
        while (i11 < eVar.f14973c) {
            int[] iArr = eVar.f14974d;
            int i12 = i11 + 1;
            int i13 = iArr[i11];
            int i14 = i12 + 1;
            int i15 = iArr[i12];
            int i16 = 268435455 & i15;
            int i17 = i10 - i13;
            if ((i15 & (-268435456)) == 268435456) {
                bArr[i16] = (byte) (i17 >>> 8);
                bArr[i16 + 1] = (byte) i17;
            } else {
                int i18 = i16 + 1;
                bArr[i16] = (byte) (i17 >>> 24);
                int i19 = i18 + 1;
                bArr[i18] = (byte) (i17 >>> 16);
                bArr[i19] = (byte) (i17 >>> 8);
                bArr[i19 + 1] = (byte) i17;
            }
            i11 = i14;
        }
    }

    public final void f(Object obj) {
        String str;
        d b10;
        j1.e eVar;
        int i10;
        b bVar = this.f14981b;
        bVar.getClass();
        if (obj instanceof Integer) {
            int intValue = ((Integer) obj).intValue();
            d dVar = bVar.f14946f;
            dVar.f14963b = 3;
            dVar.f14964c = intValue;
            dVar.f14969h = (intValue + 3) & Integer.MAX_VALUE;
            b10 = bVar.a(dVar);
            if (b10 == null) {
                j1.e eVar2 = bVar.f14943c;
                eVar2.d(3);
                eVar2.f(intValue);
                int i11 = bVar.f14942b;
                bVar.f14942b = i11 + 1;
                b10 = new d(i11, bVar.f14946f);
                bVar.e(b10);
            }
        } else if (obj instanceof String) {
            String str2 = (String) obj;
            bVar.f14947g.a(str2, 8, null, null);
            b10 = bVar.a(bVar.f14947g);
            if (b10 == null) {
                bVar.f14943c.c(8, bVar.d(str2));
                int i12 = bVar.f14942b;
                bVar.f14942b = i12 + 1;
                b10 = new d(i12, bVar.f14947g);
                bVar.e(b10);
            }
        } else if (obj instanceof i) {
            i iVar = (i) obj;
            if (iVar.f14998a == 10) {
                str = new String(iVar.f14999b, iVar.f15000c, iVar.f15001d);
            } else {
                str = new String(iVar.f14999b, iVar.f15000c, iVar.f15001d);
            }
            b10 = bVar.b(str);
        } else {
            throw new IllegalArgumentException(g.a("value ", obj));
        }
        int i13 = b10.f14962a;
        int i14 = b10.f14963b;
        if (i14 != 5 && i14 != 6) {
            if (i13 >= 256) {
                eVar = this.f14986g;
                i10 = 19;
            } else {
                this.f14986g.b(18, i13);
                return;
            }
        } else {
            eVar = this.f14986g;
            i10 = 20;
        }
        eVar.c(i10, i13);
    }

    public final void g(String str, int i10, String str2, String str3) {
        boolean z10;
        int i11;
        int i12;
        int i13 = 1;
        if (i10 == 185) {
            z10 = true;
        } else {
            z10 = false;
        }
        b bVar = this.f14981b;
        if (z10) {
            i11 = 11;
        } else {
            i11 = 10;
        }
        bVar.f14948h.a(str, i11, str2, str3);
        d a10 = bVar.a(bVar.f14948h);
        if (a10 == null) {
            int i14 = bVar.b(str).f14962a;
            int i15 = bVar.c(str2, str3).f14962a;
            j1.e eVar = bVar.f14943c;
            eVar.c(i11, i14);
            eVar.g(i15);
            int i16 = bVar.f14942b;
            bVar.f14942b = i16 + 1;
            a10 = new d(i16, bVar.f14948h);
            bVar.e(a10);
        }
        int i17 = a10.f14964c;
        if (z10) {
            if (i17 == 0) {
                int i18 = 1;
                int i19 = 1;
                while (true) {
                    i12 = i18 + 1;
                    char charAt = str3.charAt(i18);
                    if (charAt == ')') {
                        break;
                    } else if (charAt == 'L') {
                        while (true) {
                            i18 = i12 + 1;
                            if (str3.charAt(i12) == ';') {
                                break;
                            }
                            i12 = i18;
                        }
                        i19++;
                    } else {
                        if (charAt != 'D' && charAt != 'J') {
                            i19++;
                        } else {
                            i19 += 2;
                        }
                        i18 = i12;
                    }
                }
                char charAt2 = str3.charAt(i12);
                int i20 = i19 << 2;
                if (charAt2 == 'V') {
                    i13 = 0;
                } else if (charAt2 == 'D' || charAt2 == 'J') {
                    i13 = 2;
                }
                i17 = i20 | i13;
                a10.f14964c = i17;
            }
            j1.e eVar2 = this.f14986g;
            eVar2.c(185, a10.f14962a);
            eVar2.b(i17 >> 2, 0);
            return;
        }
        this.f14986g.c(i10, a10.f14962a);
    }

    public final void h(int i10, String str) {
        this.f14986g.c(i10, this.f14981b.b(str).f14962a);
    }

    public final void i(int i10, int i11) {
        if (i11 < 4 && i10 != 169) {
            this.f14986g.d((i10 < 54 ? ((i10 - 21) << 2) + 26 : ((i10 - 54) << 2) + 59) + i11);
        } else if (i11 < 256) {
            this.f14986g.b(i10, i11);
        } else {
            j1.e eVar = this.f14986g;
            eVar.d(196);
            eVar.c(i10, i11);
        }
    }
}
