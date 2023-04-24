package j4;

import java.io.IOException;
import java.io.Writer;
import java.math.BigDecimal;
import no.nordicsemi.android.dfu.DfuBaseService;

/* loaded from: classes.dex */
public final class d1 extends Writer {

    /* renamed from: q */
    public static final ThreadLocal<char[]> f17350q = new ThreadLocal<>();

    /* renamed from: r */
    public static int f17351r;

    /* renamed from: s */
    public static final int f17352s;

    /* renamed from: a */
    public char[] f17353a;

    /* renamed from: b */
    public int f17354b;

    /* renamed from: c */
    public int f17355c;

    /* renamed from: d */
    public final Writer f17356d;

    /* renamed from: e */
    public boolean f17357e;

    /* renamed from: f */
    public boolean f17358f;

    /* renamed from: g */
    public boolean f17359g;

    /* renamed from: h */
    public boolean f17360h;

    /* renamed from: i */
    public boolean f17361i;

    /* renamed from: j */
    public boolean f17362j;

    /* renamed from: k */
    public boolean f17363k;

    /* renamed from: l */
    public boolean f17364l;

    /* renamed from: m */
    public char f17365m;

    /* renamed from: n */
    public int f17366n;

    /* renamed from: o */
    public boolean f17367o;

    /* renamed from: p */
    public long f17368p;

    static {
        int parseInt;
        new ThreadLocal();
        ":true".toCharArray();
        ":false".toCharArray();
        f17351r = 131072;
        try {
            String e10 = n4.g.e("fastjson.serializer_buffer_threshold");
            if (e10 != null && e10.length() > 0 && (parseInt = Integer.parseInt(e10)) >= 64 && parseInt <= 65536) {
                f17351r = parseInt * DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
            }
        } catch (Throwable unused) {
        }
        f17352s = e1.UseSingleQuotes.f17396a | 0 | e1.BrowserCompatible.f17396a | e1.PrettyFormat.f17396a | e1.WriteEnumUsingToString.f17396a | e1.WriteNonStringValueAsString.f17396a | e1.WriteSlashAsSpecial.f17396a | e1.IgnoreErrorGetter.f17396a | e1.WriteClassName.f17396a | e1.NotWriteDefaultValue.f17396a;
    }

    public d1() {
        this(e4.a.f13345g, e1.D);
    }

    public final void C(char c10, int i10, String str) {
        int i11;
        int i12;
        int i13;
        if (i10 != Integer.MIN_VALUE && this.f17358f) {
            if (i10 < 0) {
                int i14 = -i10;
                int i15 = 0;
                do {
                    i13 = n4.g.f21980n[i15];
                    i15++;
                } while (i14 > i13);
                i12 = i15 + 1;
            } else {
                int i16 = 0;
                do {
                    i11 = n4.g.f21980n[i16];
                    i16++;
                } while (i10 > i11);
                i12 = i16;
            }
            int length = str.length();
            int i17 = this.f17354b + length + 4 + i12;
            if (i17 > this.f17353a.length) {
                if (this.f17356d != null) {
                    write(c10);
                    y(str);
                    L(i10);
                    return;
                }
                j(i17);
            }
            int i18 = this.f17354b;
            this.f17354b = i17;
            char[] cArr = this.f17353a;
            cArr[i18] = c10;
            int i19 = i18 + length + 1;
            cArr[i18 + 1] = this.f17365m;
            str.getChars(0, length, cArr, i18 + 2);
            char[] cArr2 = this.f17353a;
            cArr2[i19 + 1] = this.f17365m;
            cArr2[i19 + 2] = ':';
            n4.g.d(cArr2, i10, this.f17354b);
            return;
        }
        write(c10);
        y(str);
        L(i10);
    }

    public final void D(char c10, String str, long j10) {
        int f10;
        if (j10 != Long.MIN_VALUE && this.f17358f && !k(e1.BrowserCompatible.f17396a)) {
            if (j10 < 0) {
                f10 = n4.g.f(-j10) + 1;
            } else {
                f10 = n4.g.f(j10);
            }
            int length = str.length();
            int i10 = this.f17354b + length + 4 + f10;
            if (i10 > this.f17353a.length) {
                if (this.f17356d != null) {
                    write(c10);
                    y(str);
                    P(j10);
                    return;
                }
                j(i10);
            }
            int i11 = this.f17354b;
            this.f17354b = i10;
            char[] cArr = this.f17353a;
            cArr[i11] = c10;
            int i12 = i11 + length + 1;
            cArr[i11 + 1] = this.f17365m;
            str.getChars(0, length, cArr, i11 + 2);
            char[] cArr2 = this.f17353a;
            cArr2[i12 + 1] = this.f17365m;
            cArr2[i12 + 2] = ':';
            n4.g.c(j10, this.f17354b, cArr2);
            return;
        }
        write(c10);
        y(str);
        P(j10);
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x000e, code lost:
        if (r4 == null) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0030, code lost:
        if (r4 == null) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0032, code lost:
        R();
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0036, code lost:
        Z(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0039, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:?, code lost:
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void E(char r2, java.lang.String r3, java.lang.String r4) {
        /*
            r1 = this;
            boolean r0 = r1.f17358f
            if (r0 == 0) goto L2a
            boolean r0 = r1.f17357e
            if (r0 == 0) goto L11
            r1.write(r2)
            r1.y(r3)
            if (r4 != 0) goto L36
            goto L32
        L11:
            j4.e1 r0 = j4.e1.BrowserCompatible
            boolean r0 = r1.q(r0)
            if (r0 == 0) goto L26
            r1.write(r2)
            r2 = 58
            r1.b0(r3, r2)
            r2 = 0
            r1.b0(r4, r2)
            goto L39
        L26:
            r1.I(r2, r3, r4)
            goto L39
        L2a:
            r1.write(r2)
            r1.y(r3)
            if (r4 != 0) goto L36
        L32:
            r1.R()
            goto L39
        L36:
            r1.Z(r4)
        L39:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: j4.d1.E(char, java.lang.String, java.lang.String):void");
    }

    public final void F(BigDecimal bigDecimal) {
        String bigDecimal2;
        write(123);
        y("numberStripped");
        if (bigDecimal == null) {
            R();
            return;
        }
        int scale = bigDecimal.scale();
        if (q(e1.WriteBigDecimalAsPlain) && scale >= -100 && scale < 100) {
            bigDecimal2 = bigDecimal.toPlainString();
        } else {
            bigDecimal2 = bigDecimal.toString();
        }
        write(bigDecimal2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:186:0x00d7, code lost:
        if (r1[r7] == 4) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:231:0x021b, code lost:
        if (r3 != '>') goto L101;
     */
    /* JADX WARN: Removed duplicated region for block: B:190:0x00de  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void I(char r22, java.lang.String r23, java.lang.String r24) {
        /*
            Method dump skipped, instructions count: 781
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: j4.d1.I(char, java.lang.String, java.lang.String):void");
    }

    public final void J(byte[] bArr) {
        int length = (bArr.length * 2) + this.f17354b + 3;
        if (length > this.f17353a.length) {
            j(length);
        }
        char[] cArr = this.f17353a;
        int i10 = this.f17354b;
        int i11 = i10 + 1;
        cArr[i10] = 'x';
        this.f17354b = i11 + 1;
        cArr[i11] = '\'';
        for (byte b10 : bArr) {
            int i12 = b10 & 255;
            int i13 = i12 >> 4;
            int i14 = i12 & 15;
            char[] cArr2 = this.f17353a;
            int i15 = this.f17354b;
            int i16 = i15 + 1;
            this.f17354b = i16;
            int i17 = 48;
            cArr2[i15] = (char) (i13 + (i13 < 10 ? 48 : 55));
            this.f17354b = i16 + 1;
            if (i14 >= 10) {
                i17 = 55;
            }
            cArr2[i16] = (char) (i14 + i17);
        }
        char[] cArr3 = this.f17353a;
        int i18 = this.f17354b;
        this.f17354b = i18 + 1;
        cArr3[i18] = '\'';
    }

    public final void L(int i10) {
        int i11;
        int i12;
        int i13;
        if (i10 == Integer.MIN_VALUE) {
            write("-2147483648");
            return;
        }
        if (i10 < 0) {
            int i14 = -i10;
            int i15 = 0;
            do {
                i13 = n4.g.f21980n[i15];
                i15++;
            } while (i14 > i13);
            i12 = i15 + 1;
        } else {
            int i16 = 0;
            do {
                i11 = n4.g.f21980n[i16];
                i16++;
            } while (i10 > i11);
            i12 = i16;
        }
        int i17 = this.f17354b + i12;
        if (i17 > this.f17353a.length) {
            if (this.f17356d == null) {
                j(i17);
            } else {
                char[] cArr = new char[i12];
                n4.g.d(cArr, i10, i12);
                write(cArr, 0, i12);
                return;
            }
        }
        n4.g.d(this.f17353a, i10, i17);
        this.f17354b = i17;
    }

    public final void P(long j10) {
        boolean z10 = q(e1.BrowserCompatible) && !q(e1.WriteClassName) && (j10 > 9007199254740991L || j10 < -9007199254740991L);
        if (j10 == Long.MIN_VALUE) {
            write(z10 ? "\"-9223372036854775808\"" : "-9223372036854775808");
            return;
        }
        int f10 = j10 < 0 ? n4.g.f(-j10) + 1 : n4.g.f(j10);
        int i10 = this.f17354b + f10;
        if (z10) {
            i10 += 2;
        }
        if (i10 > this.f17353a.length) {
            if (this.f17356d != null) {
                char[] cArr = new char[f10];
                n4.g.c(j10, f10, cArr);
                if (!z10) {
                    write(cArr, 0, f10);
                    return;
                }
                write(34);
                write(cArr, 0, f10);
                write(34);
                return;
            }
            j(i10);
        }
        if (z10) {
            char[] cArr2 = this.f17353a;
            cArr2[this.f17354b] = '\"';
            int i11 = i10 - 1;
            n4.g.c(j10, i11, cArr2);
            this.f17353a[i11] = '\"';
        } else {
            n4.g.c(j10, i10, this.f17353a);
        }
        this.f17354b = i10;
    }

    public final void R() {
        write("null");
    }

    public final void W(int i10, int i11) {
        String str;
        if ((i10 & i11) == 0 && (this.f17355c & i11) == 0) {
            R();
            return;
        }
        int i12 = e1.WriteMapNullValue.f17396a;
        if ((i10 & i12) != 0 && (i10 & (~i12) & e1.E) == 0) {
            R();
            return;
        }
        if (i11 == e1.WriteNullListAsEmpty.f17396a) {
            str = "[]";
        } else if (i11 == e1.WriteNullStringAsEmpty.f17396a) {
            Z("");
            return;
        } else if (i11 != e1.WriteNullBooleanAsFalse.f17396a) {
            if (i11 == e1.WriteNullNumberAsZero.f17396a) {
                write(48);
                return;
            } else {
                R();
                return;
            }
        } else {
            str = "false";
        }
        write(str);
    }

    public final void X(e1 e1Var) {
        W(0, e1Var.f17396a);
    }

    public final void Z(String str) {
        if (this.f17357e) {
            e0(str);
        } else {
            b0(str, (char) 0);
        }
    }

    public final void a(char c10) {
        write(c10);
    }

    @Override // java.io.Writer, java.lang.Appendable
    public final Writer append(char c10) {
        write(c10);
        return this;
    }

    @Override // java.io.Writer, java.lang.Appendable
    public final /* bridge */ /* synthetic */ Writer append(CharSequence charSequence) {
        b(charSequence);
        return this;
    }

    @Override // java.io.Writer, java.lang.Appendable
    public final /* bridge */ /* synthetic */ Appendable append(CharSequence charSequence) {
        b(charSequence);
        return this;
    }

    public final void b(CharSequence charSequence) {
        String charSequence2 = charSequence == null ? "null" : charSequence.toString();
        write(charSequence2, 0, charSequence2.length());
    }

    /* JADX WARN: Code restructure failed: missing block: B:431:0x02d6, code lost:
        if (r8[r10] == 4) goto L177;
     */
    /* JADX WARN: Code restructure failed: missing block: B:478:0x041d, code lost:
        if (r4 != '>') goto L223;
     */
    /* JADX WARN: Removed duplicated region for block: B:435:0x02dd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b0(java.lang.String r23, char r24) {
        /*
            Method dump skipped, instructions count: 1317
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: j4.d1.b0(java.lang.String, char):void");
    }

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f17356d != null && this.f17354b > 0) {
            flush();
        }
        char[] cArr = this.f17353a;
        if (cArr.length <= f17351r) {
            f17350q.set(cArr);
        }
        this.f17353a = null;
    }

    public final void e0(String str) {
        int i10 = 0;
        if (str == null) {
            int i11 = this.f17354b + 4;
            if (i11 > this.f17353a.length) {
                j(i11);
            }
            "null".getChars(0, 4, this.f17353a, this.f17354b);
            this.f17354b = i11;
            return;
        }
        int length = str.length();
        int i12 = this.f17354b + length + 2;
        if (i12 > this.f17353a.length) {
            if (this.f17356d != null) {
                write(39);
                while (i10 < str.length()) {
                    char charAt = str.charAt(i10);
                    if (charAt <= '\r' || charAt == '\\' || charAt == '\'' || (charAt == '/' && q(e1.WriteSlashAsSpecial))) {
                        write(92);
                        charAt = n4.g.f21975i[charAt];
                    }
                    write(charAt);
                    i10++;
                }
                write(39);
                return;
            }
            j(i12);
        }
        int i13 = this.f17354b;
        int i14 = i13 + 1;
        int i15 = i14 + length;
        char[] cArr = this.f17353a;
        cArr[i13] = '\'';
        str.getChars(0, length, cArr, i14);
        this.f17354b = i12;
        int i16 = -1;
        char c10 = 0;
        for (int i17 = i14; i17 < i15; i17++) {
            char c11 = this.f17353a[i17];
            if (c11 <= '\r' || c11 == '\\' || c11 == '\'' || (c11 == '/' && q(e1.WriteSlashAsSpecial))) {
                i10++;
                i16 = i17;
                c10 = c11;
            }
        }
        int i18 = i12 + i10;
        if (i18 > this.f17353a.length) {
            j(i18);
        }
        this.f17354b = i18;
        if (i10 == 1) {
            char[] cArr2 = this.f17353a;
            int i19 = i16 + 1;
            System.arraycopy(cArr2, i19, cArr2, i16 + 2, (i15 - i16) - 1);
            char[] cArr3 = this.f17353a;
            cArr3[i16] = '\\';
            cArr3[i19] = n4.g.f21975i[c10];
        } else if (i10 > 1) {
            char[] cArr4 = this.f17353a;
            int i20 = i16 + 1;
            System.arraycopy(cArr4, i20, cArr4, i16 + 2, (i15 - i16) - 1);
            char[] cArr5 = this.f17353a;
            cArr5[i16] = '\\';
            cArr5[i20] = n4.g.f21975i[c10];
            int i21 = i15 + 1;
            for (int i22 = i20 - 2; i22 >= i14; i22--) {
                char c12 = this.f17353a[i22];
                if (c12 <= '\r' || c12 == '\\' || c12 == '\'' || (c12 == '/' && q(e1.WriteSlashAsSpecial))) {
                    char[] cArr6 = this.f17353a;
                    int i23 = i22 + 1;
                    System.arraycopy(cArr6, i23, cArr6, i22 + 2, (i21 - i22) - 1);
                    char[] cArr7 = this.f17353a;
                    cArr7[i22] = '\\';
                    cArr7[i23] = n4.g.f21975i[c12];
                    i21++;
                }
            }
        }
        this.f17353a[this.f17354b - 1] = '\'';
    }

    @Override // java.io.Writer, java.io.Flushable
    public final void flush() {
        Writer writer = this.f17356d;
        if (writer == null) {
            return;
        }
        try {
            writer.write(this.f17353a, 0, this.f17354b);
            this.f17356d.flush();
            this.f17354b = 0;
        } catch (IOException e10) {
            throw new e4.d(e10.getMessage(), e10);
        }
    }

    public final void h() {
        int i10 = this.f17355c;
        boolean z10 = (e1.QuoteFieldNames.f17396a & i10) != 0;
        this.f17358f = z10;
        boolean z11 = (e1.UseSingleQuotes.f17396a & i10) != 0;
        this.f17357e = z11;
        this.f17359g = (e1.SortField.f17396a & i10) != 0;
        this.f17360h = (e1.DisableCircularReferenceDetect.f17396a & i10) != 0;
        this.f17361i = (e1.BeanToArray.f17396a & i10) != 0;
        int i11 = e1.WriteNonStringValueAsString.f17396a;
        this.f17362j = (e1.NotWriteDefaultValue.f17396a & i10) != 0;
        this.f17363k = (e1.WriteEnumUsingName.f17396a & i10) != 0;
        this.f17364l = (e1.WriteEnumUsingToString.f17396a & i10) != 0;
        if (z10) {
            int i12 = f17352s & i10;
        }
        this.f17365m = z11 ? '\'' : '\"';
        boolean z12 = (e1.BrowserSecure.f17396a & i10) != 0;
        this.f17367o = z12;
        this.f17368p = z12 ? 5764610843043954687L : (i10 & e1.WriteSlashAsSpecial.f17396a) != 0 ? 140758963191807L : 21474836479L;
    }

    public final void j(int i10) {
        ThreadLocal<char[]> threadLocal;
        char[] cArr;
        int i11 = this.f17366n;
        if (i11 != -1 && i10 >= i11) {
            StringBuilder a10 = android.support.v4.media.d.a("serialize exceeded MAX_OUTPUT_LENGTH=");
            a10.append(this.f17366n);
            a10.append(", minimumCapacity=");
            a10.append(i10);
            throw new e4.d(a10.toString());
        }
        char[] cArr2 = this.f17353a;
        int length = cArr2.length + (cArr2.length >> 1) + 1;
        if (length >= i10) {
            i10 = length;
        }
        char[] cArr3 = new char[i10];
        System.arraycopy(cArr2, 0, cArr3, 0, this.f17354b);
        if (this.f17353a.length < f17351r && ((cArr = (threadLocal = f17350q).get()) == null || cArr.length < this.f17353a.length)) {
            threadLocal.set(this.f17353a);
        }
        this.f17353a = cArr3;
    }

    public final boolean k(int i10) {
        return (i10 & this.f17355c) != 0;
    }

    public final boolean q(e1 e1Var) {
        return (e1Var.f17396a & this.f17355c) != 0;
    }

    public final void s(byte[] bArr) {
        if (k(e1.WriteClassName.f17396a)) {
            J(bArr);
            return;
        }
        int length = bArr.length;
        boolean z10 = this.f17357e;
        char c10 = z10 ? '\'' : '\"';
        if (length == 0) {
            write(z10 ? "''" : "\"\"");
            return;
        }
        char[] cArr = n4.g.f21981o;
        int i10 = (length / 3) * 3;
        int i11 = length - 1;
        int i12 = this.f17354b;
        int i13 = (((i11 / 3) + 1) << 2) + i12 + 2;
        if (i13 > this.f17353a.length) {
            if (this.f17356d != null) {
                write(c10);
                int i14 = 0;
                while (i14 < i10) {
                    int i15 = i14 + 1;
                    int i16 = i15 + 1;
                    int i17 = ((bArr[i14] & 255) << 16) | ((bArr[i15] & 255) << 8) | (bArr[i16] & 255);
                    write(cArr[(i17 >>> 18) & 63]);
                    write(cArr[(i17 >>> 12) & 63]);
                    write(cArr[(i17 >>> 6) & 63]);
                    write(cArr[i17 & 63]);
                    i14 = i16 + 1;
                }
                int i18 = length - i10;
                if (i18 > 0) {
                    int i19 = ((bArr[i10] & 255) << 10) | (i18 == 2 ? (bArr[i11] & 255) << 2 : 0);
                    write(cArr[i19 >> 12]);
                    write(cArr[(i19 >>> 6) & 63]);
                    write(i18 == 2 ? cArr[i19 & 63] : '=');
                    write(61);
                }
                write(c10);
                return;
            }
            j(i13);
        }
        this.f17354b = i13;
        int i20 = i12 + 1;
        this.f17353a[i12] = c10;
        int i21 = 0;
        while (i21 < i10) {
            int i22 = i21 + 1;
            int i23 = i22 + 1;
            int i24 = ((bArr[i21] & 255) << 16) | ((bArr[i22] & 255) << 8);
            int i25 = i23 + 1;
            int i26 = i24 | (bArr[i23] & 255);
            char[] cArr2 = this.f17353a;
            int i27 = i20 + 1;
            cArr2[i20] = cArr[(i26 >>> 18) & 63];
            int i28 = i27 + 1;
            cArr2[i27] = cArr[(i26 >>> 12) & 63];
            int i29 = i28 + 1;
            cArr2[i28] = cArr[(i26 >>> 6) & 63];
            i20 = i29 + 1;
            cArr2[i29] = cArr[i26 & 63];
            i21 = i25;
        }
        int i30 = length - i10;
        if (i30 > 0) {
            int i31 = ((bArr[i10] & 255) << 10) | (i30 == 2 ? (bArr[i11] & 255) << 2 : 0);
            char[] cArr3 = this.f17353a;
            cArr3[i13 - 5] = cArr[i31 >> 12];
            cArr3[i13 - 4] = cArr[(i31 >>> 6) & 63];
            cArr3[i13 - 3] = i30 == 2 ? cArr[i31 & 63] : '=';
            cArr3[i13 - 2] = '=';
        }
        this.f17353a[i13 - 1] = c10;
    }

    public final String toString() {
        return new String(this.f17353a, 0, this.f17354b);
    }

    public final void v(double d10, boolean z10) {
        if (!Double.isNaN(d10) && !Double.isInfinite(d10)) {
            int i10 = this.f17354b + 24;
            if (i10 > this.f17353a.length) {
                if (this.f17356d == null) {
                    j(i10);
                } else {
                    char[] cArr = new char[24];
                    String str = new String(cArr, 0, n4.l.a(d10, cArr, 0));
                    write(str, 0, str.length());
                    if (z10 && q(e1.WriteClassName)) {
                        write(68);
                        return;
                    }
                    return;
                }
            }
            this.f17354b += n4.l.a(d10, this.f17353a, this.f17354b);
            if (z10 && q(e1.WriteClassName)) {
                write(68);
                return;
            }
            return;
        }
        R();
    }

    @Override // java.io.Writer
    public final void write(int i10) {
        int i11 = 1;
        int i12 = this.f17354b + 1;
        if (i12 > this.f17353a.length) {
            if (this.f17356d != null) {
                flush();
                this.f17353a[this.f17354b] = (char) i10;
                this.f17354b = i11;
            }
            j(i12);
        }
        i11 = i12;
        this.f17353a[this.f17354b] = (char) i10;
        this.f17354b = i11;
    }

    @Override // java.io.Writer
    public final void write(String str) {
        if (str == null) {
            R();
        } else {
            write(str, 0, str.length());
        }
    }

    @Override // java.io.Writer
    public final void write(String str, int i10, int i11) {
        int i12;
        int i13 = this.f17354b + i11;
        if (i13 > this.f17353a.length) {
            if (this.f17356d == null) {
                j(i13);
            } else {
                while (true) {
                    char[] cArr = this.f17353a;
                    int length = cArr.length;
                    int i14 = this.f17354b;
                    int i15 = length - i14;
                    i12 = i10 + i15;
                    str.getChars(i10, i12, cArr, i14);
                    this.f17354b = this.f17353a.length;
                    flush();
                    i11 -= i15;
                    if (i11 <= this.f17353a.length) {
                        break;
                    }
                    i10 = i12;
                }
                i13 = i11;
                i10 = i12;
            }
        }
        str.getChars(i10, i11 + i10, this.f17353a, this.f17354b);
        this.f17354b = i13;
    }

    @Override // java.io.Writer
    public final void write(char[] cArr, int i10, int i11) {
        int i12;
        if (i10 < 0 || i10 > cArr.length || i11 < 0 || (i12 = i10 + i11) > cArr.length || i12 < 0) {
            throw new IndexOutOfBoundsException();
        }
        if (i11 == 0) {
            return;
        }
        int i13 = this.f17354b + i11;
        if (i13 > this.f17353a.length) {
            if (this.f17356d == null) {
                j(i13);
            } else {
                do {
                    char[] cArr2 = this.f17353a;
                    int length = cArr2.length;
                    int i14 = this.f17354b;
                    int i15 = length - i14;
                    System.arraycopy(cArr, i10, cArr2, i14, i15);
                    this.f17354b = this.f17353a.length;
                    flush();
                    i11 -= i15;
                    i10 += i15;
                } while (i11 > this.f17353a.length);
                i13 = i11;
            }
        }
        System.arraycopy(cArr, i10, this.f17353a, this.f17354b, i11);
        this.f17354b = i13;
    }

    /* JADX WARN: Code restructure failed: missing block: B:142:0x006c, code lost:
        if (r6 != false) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void y(java.lang.String r17) {
        /*
            Method dump skipped, instructions count: 344
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: j4.d1.y(java.lang.String):void");
    }

    public d1(int i10, e1... e1VarArr) {
        this.f17366n = -1;
        this.f17356d = null;
        ThreadLocal<char[]> threadLocal = f17350q;
        char[] cArr = threadLocal.get();
        this.f17353a = cArr;
        if (cArr != null) {
            threadLocal.set(null);
        } else {
            this.f17353a = new char[2048];
        }
        for (e1 e1Var : e1VarArr) {
            i10 |= e1Var.f17396a;
        }
        this.f17355c = i10;
        h();
    }

    @Override // java.io.Writer, java.lang.Appendable
    public final Writer append(CharSequence charSequence, int i10, int i11) {
        if (charSequence == null) {
            charSequence = "null";
        }
        String charSequence2 = charSequence.subSequence(i10, i11).toString();
        write(charSequence2, 0, charSequence2.length());
        return this;
    }

    @Override // java.io.Writer, java.lang.Appendable
    public final Appendable append(char c10) {
        write(c10);
        return this;
    }

    @Override // java.io.Writer, java.lang.Appendable
    public final Appendable append(CharSequence charSequence, int i10, int i11) {
        if (charSequence == null) {
            charSequence = "null";
        }
        String charSequence2 = charSequence.subSequence(i10, i11).toString();
        write(charSequence2, 0, charSequence2.length());
        return this;
    }
}
