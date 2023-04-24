package g4;

import no.nordicsemi.android.dfu.DfuBaseService;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a */
    public int f14941a;

    /* renamed from: b */
    public int f14942b = 1;

    /* renamed from: c */
    public final j1.e f14943c = new j1.e();

    /* renamed from: d */
    public d[] f14944d = new d[DfuBaseService.ERROR_REMOTE_TYPE_LEGACY];

    /* renamed from: e */
    public int f14945e = (int) (((double) DfuBaseService.ERROR_REMOTE_TYPE_LEGACY) * 0.75d);

    /* renamed from: f */
    public final d f14946f = new d();

    /* renamed from: g */
    public final d f14947g = new d();

    /* renamed from: h */
    public final d f14948h = new d();

    /* renamed from: i */
    public int f14949i;

    /* renamed from: j */
    public int f14950j;

    /* renamed from: k */
    public int f14951k;

    /* renamed from: l */
    public int f14952l;

    /* renamed from: m */
    public int[] f14953m;

    /* renamed from: n */
    public c f14954n;

    /* renamed from: o */
    public c f14955o;

    /* renamed from: p */
    public h f14956p;

    /* renamed from: q */
    public h f14957q;

    /* JADX WARN: Code restructure failed: missing block: B:62:0x003f, code lost:
        if (r0.f14968g.equals(r9.f14968g) != false) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0046, code lost:
        if (r0.f14964c == r9.f14964c) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x005d, code lost:
        if (r0.f14967f.equals(r9.f14967f) != false) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0066, code lost:
        if (r0.f14965d == r9.f14965d) goto L20;
     */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0076 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0073 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final g4.d a(g4.d r9) {
        /*
            r8 = this;
            g4.d[] r0 = r8.f14944d
            int r1 = r9.f14969h
            int r2 = r0.length
            int r1 = r1 % r2
            r0 = r0[r1]
        L8:
            if (r0 == 0) goto L76
            int r1 = r0.f14963b
            int r2 = r9.f14963b
            if (r1 != r2) goto L73
            r1 = 1
            if (r2 == r1) goto L69
            r3 = 15
            r4 = 0
            if (r2 == r3) goto L60
            r3 = 12
            if (r2 == r3) goto L4b
            r3 = 13
            if (r2 == r3) goto L69
            switch(r2) {
                case 3: goto L42;
                case 4: goto L42;
                case 5: goto L60;
                case 6: goto L60;
                case 7: goto L69;
                case 8: goto L69;
                default: goto L23;
            }
        L23:
            java.lang.String r2 = r0.f14966e
            java.lang.String r3 = r9.f14966e
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L49
            java.lang.String r2 = r0.f14967f
            java.lang.String r3 = r9.f14967f
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L49
            java.lang.String r2 = r0.f14968g
            java.lang.String r3 = r9.f14968g
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L49
            goto L71
        L42:
            int r2 = r0.f14964c
            int r3 = r9.f14964c
            if (r2 != r3) goto L49
            goto L71
        L49:
            r1 = 0
            goto L71
        L4b:
            java.lang.String r2 = r0.f14966e
            java.lang.String r3 = r9.f14966e
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L49
            java.lang.String r2 = r0.f14967f
            java.lang.String r3 = r9.f14967f
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L49
            goto L71
        L60:
            long r2 = r0.f14965d
            long r5 = r9.f14965d
            int r7 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r7 != 0) goto L49
            goto L71
        L69:
            java.lang.String r1 = r0.f14966e
            java.lang.String r2 = r9.f14966e
            boolean r1 = r1.equals(r2)
        L71:
            if (r1 != 0) goto L76
        L73:
            g4.d r0 = r0.f14970i
            goto L8
        L76:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: g4.b.a(g4.d):g4.d");
    }

    public final d b(String str) {
        this.f14947g.a(str, 7, null, null);
        d a10 = a(this.f14947g);
        if (a10 == null) {
            this.f14943c.c(7, d(str));
            int i10 = this.f14942b;
            this.f14942b = i10 + 1;
            d dVar = new d(i10, this.f14947g);
            e(dVar);
            return dVar;
        }
        return a10;
    }

    public final d c(String str, String str2) {
        this.f14947g.a(str, 12, str2, null);
        d a10 = a(this.f14947g);
        if (a10 == null) {
            int d10 = d(str);
            int d11 = d(str2);
            j1.e eVar = this.f14943c;
            eVar.c(12, d10);
            eVar.g(d11);
            int i10 = this.f14942b;
            this.f14942b = i10 + 1;
            d dVar = new d(i10, this.f14947g);
            e(dVar);
            return dVar;
        }
        return a10;
    }

    public final int d(String str) {
        this.f14946f.a(str, 1, null, null);
        d a10 = a(this.f14946f);
        if (a10 == null) {
            j1.e eVar = this.f14943c;
            eVar.d(1);
            int length = str.length();
            int i10 = eVar.f17259a;
            if (i10 + 2 + length > ((byte[]) eVar.f17260b).length) {
                eVar.a(length + 2);
            }
            byte[] bArr = (byte[]) eVar.f17260b;
            int i11 = i10 + 1;
            bArr[i10] = (byte) (length >>> 8);
            int i12 = i11 + 1;
            bArr[i11] = (byte) length;
            int i13 = 0;
            while (i13 < length) {
                char charAt = str.charAt(i13);
                if ((charAt >= 1 && charAt <= 127) || (charAt >= 19968 && charAt <= 40959)) {
                    bArr[i12] = (byte) charAt;
                    i13++;
                    i12++;
                } else {
                    throw new UnsupportedOperationException();
                }
            }
            eVar.f17259a = i12;
            int i14 = this.f14942b;
            this.f14942b = i14 + 1;
            a10 = new d(i14, this.f14946f);
            e(a10);
        }
        return a10.f14962a;
    }

    public final void e(d dVar) {
        if (this.f14942b > this.f14945e) {
            int length = this.f14944d.length;
            int i10 = (length * 2) + 1;
            d[] dVarArr = new d[i10];
            while (true) {
                length--;
                if (length < 0) {
                    break;
                }
                d dVar2 = this.f14944d[length];
                while (dVar2 != null) {
                    int i11 = dVar2.f14969h % i10;
                    d dVar3 = dVar2.f14970i;
                    dVar2.f14970i = dVarArr[i11];
                    dVarArr[i11] = dVar2;
                    dVar2 = dVar3;
                }
            }
            this.f14944d = dVarArr;
            this.f14945e = (int) (i10 * 0.75d);
        }
        int i12 = dVar.f14969h;
        d[] dVarArr2 = this.f14944d;
        int length2 = i12 % dVarArr2.length;
        dVar.f14970i = dVarArr2[length2];
        dVarArr2[length2] = dVar;
    }

    public final byte[] f() {
        int i10;
        int i11;
        int i12 = (this.f14952l * 2) + 24;
        int i13 = 0;
        for (c cVar = this.f14954n; cVar != null; cVar = (c) cVar.f14961d) {
            i13++;
            i12 += 8;
        }
        int i14 = 0;
        for (h hVar = this.f14956p; hVar != null; hVar = hVar.f14980a) {
            i14++;
            if (hVar.f14986g.f17259a > 0) {
                hVar.f14981b.d("Code");
                i11 = hVar.f14986g.f17259a + 18 + 0 + 8;
            } else {
                i11 = 8;
            }
            if (hVar.f14984e > 0) {
                hVar.f14981b.d("Exceptions");
                i11 += (hVar.f14984e * 2) + 8;
            }
            i12 += i11;
        }
        j1.e eVar = new j1.e(i12 + this.f14943c.f17259a, 1);
        eVar.f(-889275714);
        eVar.f(this.f14941a);
        eVar.g(this.f14942b);
        j1.e eVar2 = this.f14943c;
        eVar.e((byte[]) eVar2.f17260b, eVar2.f17259a);
        eVar.g(this.f14949i & (-393217));
        eVar.g(this.f14950j);
        eVar.g(this.f14951k);
        eVar.g(this.f14952l);
        for (int i15 = 0; i15 < this.f14952l; i15++) {
            eVar.g(this.f14953m[i15]);
        }
        eVar.g(i13);
        for (c cVar2 = this.f14954n; cVar2 != null; cVar2 = (c) cVar2.f14961d) {
            eVar.g(cVar2.f14958a & (-393217));
            eVar.g(cVar2.f14959b);
            eVar.g(cVar2.f14960c);
            eVar.g(0);
        }
        eVar.g(i14);
        for (h hVar2 = this.f14956p; hVar2 != null; hVar2 = hVar2.f14980a) {
            eVar.g(1);
            eVar.g(hVar2.f14982c);
            eVar.g(hVar2.f14983d);
            if (hVar2.f14986g.f17259a > 0) {
                i10 = 1;
            } else {
                i10 = 0;
            }
            if (hVar2.f14984e > 0) {
                i10++;
            }
            eVar.g(i10);
            int i16 = hVar2.f14986g.f17259a;
            if (i16 > 0) {
                eVar.g(hVar2.f14981b.d("Code"));
                eVar.f(i16 + 12 + 0);
                eVar.g(hVar2.f14987h);
                eVar.g(hVar2.f14988i);
                eVar.f(hVar2.f14986g.f17259a);
                j1.e eVar3 = hVar2.f14986g;
                eVar.e((byte[]) eVar3.f17260b, eVar3.f17259a);
                eVar.g(0);
                eVar.g(0);
            }
            if (hVar2.f14984e > 0) {
                eVar.g(hVar2.f14981b.d("Exceptions"));
                eVar.f((hVar2.f14984e * 2) + 2);
                eVar.g(hVar2.f14984e);
                for (int i17 = 0; i17 < hVar2.f14984e; i17++) {
                    eVar.g(hVar2.f14985f[i17]);
                }
            }
        }
        eVar.g(0);
        return (byte[]) eVar.f17260b;
    }

    public final void g(String str, String str2, String[] strArr) {
        this.f14941a = 49;
        this.f14949i = 33;
        this.f14950j = b(str).f14962a;
        this.f14951k = str2 == null ? 0 : b(str2).f14962a;
        if (strArr == null || strArr.length <= 0) {
            return;
        }
        int length = strArr.length;
        this.f14952l = length;
        this.f14953m = new int[length];
        for (int i10 = 0; i10 < this.f14952l; i10++) {
            this.f14953m[i10] = b(strArr[i10]).f14962a;
        }
    }
}
