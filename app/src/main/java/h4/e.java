package h4;

import java.io.Closeable;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;
import no.nordicsemi.android.dfu.DfuBaseService;

/* loaded from: classes.dex */
public abstract class e implements c, Closeable {

    /* renamed from: o */
    public static final ThreadLocal<char[]> f15813o = new ThreadLocal<>();

    /* renamed from: p */
    public static final int[] f15814p;

    /* renamed from: a */
    public int f15815a;

    /* renamed from: b */
    public int f15816b;

    /* renamed from: c */
    public int f15817c;

    /* renamed from: d */
    public char f15818d;

    /* renamed from: e */
    public int f15819e;

    /* renamed from: f */
    public char[] f15820f;

    /* renamed from: g */
    public int f15821g;

    /* renamed from: h */
    public int f15822h;

    /* renamed from: i */
    public boolean f15823i;

    /* renamed from: j */
    public Calendar f15824j = null;

    /* renamed from: k */
    public TimeZone f15825k = e4.a.f13339a;

    /* renamed from: l */
    public Locale f15826l = e4.a.f13340b;

    /* renamed from: m */
    public int f15827m = 0;

    /* renamed from: n */
    public String f15828n;

    static {
        StringBuilder a10 = android.support.v4.media.d.a("\"");
        a10.append(e4.a.f13341c);
        a10.append("\":\"");
        a10.toString().toCharArray();
        f15814p = new int[103];
        for (int i10 = 48; i10 <= 57; i10++) {
            f15814p[i10] = i10 - 48;
        }
        for (int i11 = 97; i11 <= 102; i11++) {
            f15814p[i11] = (i11 - 97) + 10;
        }
        for (int i12 = 65; i12 <= 70; i12++) {
            f15814p[i12] = (i12 - 65) + 10;
        }
    }

    public e(int i10) {
        this.f15828n = null;
        this.f15817c = i10;
        if ((i10 & b.InitStringFieldAsEmpty.f15812a) != 0) {
            this.f15828n = "";
        }
        char[] cArr = f15813o.get();
        this.f15820f = cArr;
        if (cArr == null) {
            this.f15820f = new char[DfuBaseService.ERROR_REMOTE_TYPE_SECURE];
        }
    }

    public static boolean S0(char c10) {
        return c10 <= ' ' && (c10 == ' ' || c10 == '\n' || c10 == '\r' || c10 == '\t' || c10 == '\f' || c10 == '\b');
    }

    public static String W0(char[] cArr, int i10) {
        int i11;
        char[] cArr2 = new char[i10];
        int i12 = 0;
        int i13 = 0;
        while (i12 < i10) {
            char c10 = cArr[i12];
            if (c10 != '\\') {
                cArr2[i13] = c10;
                i13++;
            } else {
                i12++;
                char c11 = cArr[i12];
                if (c11 == '\"') {
                    i11 = i13 + 1;
                    cArr2[i13] = '\"';
                } else if (c11 != '\'') {
                    if (c11 != 'F') {
                        if (c11 == '\\') {
                            i11 = i13 + 1;
                            cArr2[i13] = '\\';
                        } else if (c11 == 'b') {
                            i11 = i13 + 1;
                            cArr2[i13] = '\b';
                        } else if (c11 != 'f') {
                            if (c11 == 'n') {
                                i11 = i13 + 1;
                                cArr2[i13] = '\n';
                            } else if (c11 == 'r') {
                                i11 = i13 + 1;
                                cArr2[i13] = '\r';
                            } else if (c11 != 'x') {
                                switch (c11) {
                                    case '/':
                                        i11 = i13 + 1;
                                        cArr2[i13] = '/';
                                        break;
                                    case '0':
                                        i11 = i13 + 1;
                                        cArr2[i13] = 0;
                                        break;
                                    case '1':
                                        i11 = i13 + 1;
                                        cArr2[i13] = 1;
                                        break;
                                    case '2':
                                        i11 = i13 + 1;
                                        cArr2[i13] = 2;
                                        break;
                                    case '3':
                                        i11 = i13 + 1;
                                        cArr2[i13] = 3;
                                        break;
                                    case '4':
                                        i11 = i13 + 1;
                                        cArr2[i13] = 4;
                                        break;
                                    case '5':
                                        i11 = i13 + 1;
                                        cArr2[i13] = 5;
                                        break;
                                    case '6':
                                        i11 = i13 + 1;
                                        cArr2[i13] = 6;
                                        break;
                                    case '7':
                                        i11 = i13 + 1;
                                        cArr2[i13] = 7;
                                        break;
                                    default:
                                        switch (c11) {
                                            case 't':
                                                i11 = i13 + 1;
                                                cArr2[i13] = '\t';
                                                break;
                                            case 'u':
                                                i11 = i13 + 1;
                                                int i14 = i12 + 1;
                                                int i15 = i14 + 1;
                                                int i16 = i15 + 1;
                                                i12 = i16 + 1;
                                                cArr2[i13] = (char) Integer.parseInt(new String(new char[]{cArr[i14], cArr[i15], cArr[i16], cArr[i12]}), 16);
                                                break;
                                            case 'v':
                                                i11 = i13 + 1;
                                                cArr2[i13] = 11;
                                                break;
                                            default:
                                                throw new e4.d("unclosed.str.lit");
                                        }
                                }
                            } else {
                                i11 = i13 + 1;
                                int[] iArr = f15814p;
                                int i17 = i12 + 1;
                                i12 = i17 + 1;
                                cArr2[i13] = (char) ((iArr[cArr[i17]] * 16) + iArr[cArr[i12]]);
                            }
                        }
                    }
                    i11 = i13 + 1;
                    cArr2[i13] = '\f';
                } else {
                    i11 = i13 + 1;
                    cArr2[i13] = '\'';
                }
                i13 = i11;
            }
            i12++;
        }
        return new String(cArr2, 0, i13);
    }

    @Override // h4.c
    public final Number A0(boolean z10) {
        char N0 = N0((this.f15822h + this.f15821g) - 1);
        try {
            if (N0 == 'F') {
                return Float.valueOf(Float.parseFloat(I0()));
            }
            if (N0 == 'D') {
                return Double.valueOf(Double.parseDouble(I0()));
            }
            if (z10) {
                return L();
            }
            return Double.valueOf(Double.parseDouble(I0()));
        } catch (NumberFormatException e10) {
            throw new e4.d(e10.getMessage() + ", " + h());
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:217:0x0151, code lost:
        throw new e4.d("invalid escape character \\x" + r1 + r2);
     */
    @Override // h4.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void C() {
        /*
            Method dump skipped, instructions count: 418
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: h4.e.C():void");
    }

    @Override // h4.c
    public final void D() {
        U0();
    }

    @Override // h4.c
    public final int E() {
        int i10;
        boolean z10;
        int i11 = 0;
        if (this.f15822h == -1) {
            this.f15822h = 0;
        }
        int i12 = this.f15822h;
        int i13 = this.f15821g + i12;
        if (N0(i12) == '-') {
            i10 = Integer.MIN_VALUE;
            i12++;
            z10 = true;
        } else {
            i10 = -2147483647;
            z10 = false;
        }
        if (i12 < i13) {
            i11 = -(N0(i12) - '0');
            i12++;
        }
        while (i12 < i13) {
            int i14 = i12 + 1;
            char N0 = N0(i12);
            if (N0 == 'L' || N0 == 'S' || N0 == 'B') {
                i12 = i14;
                break;
            }
            int i15 = N0 - '0';
            if (i11 < -214748364) {
                throw new NumberFormatException(I0());
            }
            int i16 = i11 * 10;
            if (i16 < i10 + i15) {
                throw new NumberFormatException(I0());
            }
            i11 = i16 - i15;
            i12 = i14;
        }
        if (z10) {
            if (i12 > this.f15822h + 1) {
                return i11;
            }
            throw new NumberFormatException(I0());
        }
        return -i11;
    }

    @Override // h4.c
    public final Locale E0() {
        return this.f15826l;
    }

    /* JADX WARN: Code restructure failed: missing block: B:104:0x0078, code lost:
        if (r0 != '-') goto L46;
     */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0094  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:108:0x0086 -> B:105:0x007a). Please submit an issue!!! */
    @Override // h4.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void F() {
        /*
            r10 = this;
            int r0 = r10.f15819e
            r10.f15822h = r0
            char r0 = r10.f15818d
            r1 = 45
            r2 = 1
            if (r0 != r1) goto L13
        Lb:
            int r0 = r10.f15821g
            int r0 = r0 + r2
            r10.f15821g = r0
            r10.next()
        L13:
            char r0 = r10.f15818d
            r3 = 57
            r4 = 48
            if (r0 < r4) goto L1e
            if (r0 > r3) goto L1e
            goto Lb
        L1e:
            r5 = 0
            r6 = 46
            if (r0 != r6) goto L33
        L23:
            int r0 = r10.f15821g
            int r0 = r0 + r2
            r10.f15821g = r0
            r10.next()
            char r0 = r10.f15818d
            if (r0 < r4) goto L32
            if (r0 > r3) goto L32
            goto L23
        L32:
            r5 = 1
        L33:
            int r0 = r10.f15821g
            r6 = 65535(0xffff, float:9.1834E-41)
            if (r0 > r6) goto L98
            char r6 = r10.f15818d
            r7 = 76
            if (r6 != r7) goto L47
        L40:
            int r0 = r0 + r2
            r10.f15821g = r0
            r10.next()
            goto L6a
        L47:
            r7 = 83
            if (r6 != r7) goto L4c
            goto L40
        L4c:
            r7 = 66
            if (r6 != r7) goto L51
            goto L40
        L51:
            r7 = 70
            if (r6 != r7) goto L5c
        L55:
            int r0 = r0 + r2
            r10.f15821g = r0
            r10.next()
            goto L90
        L5c:
            r8 = 68
            if (r6 != r8) goto L61
            goto L55
        L61:
            r9 = 101(0x65, float:1.42E-43)
            if (r6 == r9) goto L6c
            r9 = 69
            if (r6 != r9) goto L6a
            goto L6c
        L6a:
            r2 = r5
            goto L90
        L6c:
            int r0 = r0 + r2
            r10.f15821g = r0
            r10.next()
            char r0 = r10.f15818d
            r5 = 43
            if (r0 == r5) goto L7a
            if (r0 != r1) goto L82
        L7a:
            int r0 = r10.f15821g
            int r0 = r0 + r2
            r10.f15821g = r0
            r10.next()
        L82:
            char r0 = r10.f15818d
            if (r0 < r4) goto L89
            if (r0 > r3) goto L89
            goto L7a
        L89:
            if (r0 == r8) goto L8d
            if (r0 != r7) goto L90
        L8d:
            int r0 = r10.f15821g
            goto L55
        L90:
            if (r2 == 0) goto L94
            r0 = 3
            goto L95
        L94:
            r0 = 2
        L95:
            r10.f15815a = r0
            return
        L98:
            e4.d r0 = new e4.d
            java.lang.String r1 = "scanNumber overflow"
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: h4.e.F():void");
    }

    @Override // h4.c
    public final boolean G0() {
        return this.f15821g == 4 && N0(this.f15822h + 1) == '$' && N0(this.f15822h + 2) == 'r' && N0(this.f15822h + 3) == 'e' && N0(this.f15822h + 4) == 'f';
    }

    @Override // h4.c
    public final boolean I(b bVar) {
        return isEnabled(bVar.f15812a);
    }

    @Override // h4.c
    public abstract String I0();

    @Override // h4.c
    public final void J(int i10) {
        this.f15821g = 0;
        while (true) {
            if (i10 != 2) {
                if (i10 != 4) {
                    if (i10 != 12) {
                        if (i10 != 18) {
                            if (i10 != 20) {
                                switch (i10) {
                                    case 14:
                                        char c10 = this.f15818d;
                                        if (c10 == '[') {
                                            this.f15815a = 14;
                                            next();
                                            return;
                                        } else if (c10 == '{') {
                                            this.f15815a = 12;
                                            next();
                                            return;
                                        }
                                        break;
                                    case 15:
                                        if (this.f15818d == ']') {
                                            this.f15815a = 15;
                                            next();
                                            return;
                                        }
                                        break;
                                    case 16:
                                        char c11 = this.f15818d;
                                        if (c11 == ',') {
                                            this.f15815a = 16;
                                            next();
                                            return;
                                        } else if (c11 == '}') {
                                            this.f15815a = 13;
                                            next();
                                            return;
                                        } else if (c11 == ']') {
                                            this.f15815a = 15;
                                            next();
                                            return;
                                        } else if (c11 == 26) {
                                            this.f15815a = 20;
                                            return;
                                        } else if (c11 == 'n') {
                                            k1(false);
                                            return;
                                        }
                                        break;
                                }
                            }
                            if (this.f15818d == 26) {
                                this.f15815a = 20;
                                return;
                            }
                        } else {
                            while (S0(this.f15818d)) {
                                next();
                            }
                            char c12 = this.f15818d;
                            if (c12 != '_' && c12 != '$' && !Character.isLetter(c12)) {
                                nextToken();
                                return;
                            } else {
                                j1();
                                return;
                            }
                        }
                    } else {
                        char c13 = this.f15818d;
                        if (c13 == '{') {
                            this.f15815a = 12;
                            next();
                            return;
                        } else if (c13 == '[') {
                            this.f15815a = 14;
                            next();
                            return;
                        }
                    }
                } else {
                    char c14 = this.f15818d;
                    if (c14 == '\"') {
                        this.f15816b = this.f15819e;
                        C();
                        return;
                    } else if (c14 >= '0' && c14 <= '9') {
                        this.f15816b = this.f15819e;
                        F();
                        return;
                    } else if (c14 == '[') {
                        this.f15815a = 14;
                        next();
                        return;
                    } else if (c14 == '{') {
                        this.f15815a = 12;
                        next();
                        return;
                    }
                }
            } else {
                char c15 = this.f15818d;
                if (c15 >= '0' && c15 <= '9') {
                    this.f15816b = this.f15819e;
                    F();
                    return;
                } else if (c15 == '\"') {
                    this.f15816b = this.f15819e;
                    C();
                    return;
                } else if (c15 == '[') {
                    this.f15815a = 14;
                    next();
                    return;
                } else if (c15 == '{') {
                    this.f15815a = 12;
                    next();
                    return;
                }
            }
            char c16 = this.f15818d;
            if (c16 != ' ' && c16 != '\n' && c16 != '\r' && c16 != '\t' && c16 != '\f' && c16 != '\b') {
                nextToken();
                return;
            }
            next();
        }
    }

    public abstract String K0(int i10, int i11, int i12, l lVar);

    @Override // h4.c
    public abstract BigDecimal L();

    public abstract void L0(int i10, int i11, char[] cArr);

    public abstract boolean M0(char[] cArr);

    public abstract char N0(int i10);

    public abstract void O0(char[] cArr, int i10, int i11);

    /* JADX WARN: Removed duplicated region for block: B:137:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x00d5  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:144:0x00ef -> B:145:0x00f1). Please submit an issue!!! */
    @Override // h4.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public int P(char r14) {
        /*
            Method dump skipped, instructions count: 258
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: h4.e.P(char):int");
    }

    public final Calendar P0() {
        return this.f15824j;
    }

    public abstract int Q0(int i10);

    public abstract boolean R0();

    public final boolean T0(char[] cArr) {
        int i10;
        while (!M0(cArr)) {
            if (!S0(this.f15818d)) {
                return false;
            }
            next();
        }
        int length = this.f15819e + cArr.length;
        this.f15819e = length;
        char N0 = N0(length);
        this.f15818d = N0;
        if (N0 == '{') {
            next();
            i10 = 12;
        } else if (N0 == '[') {
            next();
            i10 = 14;
        } else if (N0 != 'S' || N0(this.f15819e + 1) != 'e' || N0(this.f15819e + 2) != 't' || N0(this.f15819e + 3) != '[') {
            nextToken();
            return true;
        } else {
            int i11 = this.f15819e + 3;
            this.f15819e = i11;
            this.f15818d = N0(i11);
            i10 = 21;
        }
        this.f15815a = i10;
        return true;
    }

    public final void U0() {
        this.f15821g = 0;
        while (true) {
            char c10 = this.f15818d;
            if (c10 == ':') {
                next();
                nextToken();
                return;
            } else if (c10 != ' ' && c10 != '\n' && c10 != '\r' && c10 != '\t' && c10 != '\f' && c10 != '\b') {
                throw new e4.d("not match : - " + this.f15818d + ", info : " + h());
            } else {
                next();
            }
        }
    }

    public final void V0(char c10) {
        int i10 = this.f15821g;
        char[] cArr = this.f15820f;
        if (i10 >= cArr.length) {
            int length = cArr.length * 2;
            if (length < i10) {
                length = i10 + 1;
            }
            char[] cArr2 = new char[length];
            System.arraycopy(cArr, 0, cArr2, 0, cArr.length);
            this.f15820f = cArr2;
        }
        char[] cArr3 = this.f15820f;
        int i11 = this.f15821g;
        this.f15821g = i11 + 1;
        cArr3[i11] = c10;
    }

    @Override // h4.c
    public abstract String W();

    @Override // h4.c
    public final TimeZone X() {
        return this.f15825k;
    }

    public final BigInteger X0(char[] cArr) {
        boolean z10;
        boolean z11;
        int i10;
        char N0;
        boolean z12;
        int length;
        int i11;
        BigInteger bigInteger;
        this.f15827m = 0;
        if (!M0(cArr)) {
            this.f15827m = -2;
            return null;
        }
        int length2 = cArr.length;
        int i12 = length2 + 1;
        char N02 = N0(this.f15819e + length2);
        if (N02 == '\"') {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            N02 = N0(this.f15819e + i12);
            i12++;
        }
        if (N02 == '-') {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11) {
            N02 = N0(this.f15819e + i12);
            i12++;
        }
        char c10 = '0';
        if (N02 >= '0') {
            char c11 = '9';
            if (N02 <= '9') {
                long j10 = N02 - '0';
                while (true) {
                    i10 = i12 + 1;
                    N0 = N0(this.f15819e + i12);
                    if (N0 < c10 || N0 > c11) {
                        break;
                    }
                    long j11 = (10 * j10) + (N0 - '0');
                    if (j11 < j10) {
                        z12 = true;
                        break;
                    }
                    j10 = j11;
                    i12 = i10;
                    c10 = '0';
                    c11 = '9';
                }
                z12 = false;
                if (z10) {
                    if (N0 != '\"') {
                        this.f15827m = -1;
                        return null;
                    }
                    int i13 = i10 + 1;
                    N0 = N0(this.f15819e + i10);
                    int i14 = this.f15819e;
                    length = cArr.length + i14 + 1;
                    i11 = ((i14 + i13) - length) - 2;
                    i10 = i13;
                } else {
                    int i15 = this.f15819e;
                    length = cArr.length + i15;
                    i11 = ((i15 + i10) - length) - 1;
                }
                if (!z12 && (i11 < 20 || (z11 && i11 < 21))) {
                    if (z11) {
                        j10 = -j10;
                    }
                    bigInteger = BigInteger.valueOf(j10);
                } else if (i11 <= 65535) {
                    bigInteger = new BigInteger(m1(length, i11), 10);
                } else {
                    throw new e4.d("scanInteger overflow");
                }
                if (N0 == ',') {
                    int i16 = this.f15819e + i10;
                    this.f15819e = i16;
                    this.f15818d = N0(i16);
                    this.f15827m = 3;
                    this.f15815a = 16;
                    return bigInteger;
                }
                int i17 = 16;
                if (N0 == '}') {
                    int i18 = i10 + 1;
                    char N03 = N0(this.f15819e + i10);
                    if (N03 != ',') {
                        if (N03 == ']') {
                            this.f15815a = 15;
                            int i19 = this.f15819e + i18;
                            this.f15819e = i19;
                            this.f15818d = N0(i19);
                            this.f15827m = 4;
                            return bigInteger;
                        } else if (N03 == '}') {
                            i17 = 13;
                        } else if (N03 == 26) {
                            this.f15815a = 20;
                            this.f15819e = (i18 - 1) + this.f15819e;
                            this.f15818d = (char) 26;
                            this.f15827m = 4;
                            return bigInteger;
                        } else {
                            this.f15827m = -1;
                            return null;
                        }
                    }
                    this.f15815a = i17;
                    int i192 = this.f15819e + i18;
                    this.f15819e = i192;
                    this.f15818d = N0(i192);
                    this.f15827m = 4;
                    return bigInteger;
                }
                this.f15827m = -1;
                return null;
            }
        }
        if (N02 == 'n' && N0(this.f15819e + i12) == 'u' && d.a(this.f15819e, i12, 1, this) == 'l' && d.a(this.f15819e, i12, 2, this) == 'l') {
            this.f15827m = 5;
            int i20 = i12 + 3;
            int i21 = i20 + 1;
            char N04 = N0(this.f15819e + i20);
            if (z10 && N04 == '\"') {
                N04 = N0(this.f15819e + i21);
                i21++;
            }
            while (N04 != ',') {
                if (N04 == '}') {
                    int i22 = this.f15819e + i21;
                    this.f15819e = i22;
                    this.f15818d = N0(i22);
                    this.f15827m = 5;
                    this.f15815a = 13;
                    return null;
                } else if (S0(N04)) {
                    N04 = N0(this.f15819e + i21);
                    i21++;
                } else {
                    this.f15827m = -1;
                    return null;
                }
            }
            int i23 = this.f15819e + i21;
            this.f15819e = i23;
            this.f15818d = N0(i23);
            this.f15827m = 5;
            this.f15815a = 16;
            return null;
        }
        this.f15827m = -1;
        return null;
    }

    public boolean Y0(char[] cArr) {
        int i10;
        boolean z10;
        int i11;
        this.f15827m = 0;
        if (!M0(cArr)) {
            this.f15827m = -2;
            return false;
        }
        int length = cArr.length;
        int i12 = length + 1;
        char N0 = N0(this.f15819e + length);
        if (N0 == 't') {
            int i13 = i12 + 1;
            if (N0(this.f15819e + i12) != 'r') {
                this.f15827m = -1;
                return false;
            }
            int i14 = i13 + 1;
            if (N0(this.f15819e + i13) != 'u') {
                this.f15827m = -1;
                return false;
            }
            i10 = i14 + 1;
            if (N0(this.f15819e + i14) != 'e') {
                this.f15827m = -1;
                return false;
            }
            z10 = true;
        } else if (N0 != 'f') {
            this.f15827m = -1;
            return false;
        } else {
            int i15 = i12 + 1;
            if (N0(this.f15819e + i12) != 'a') {
                this.f15827m = -1;
                return false;
            }
            int i16 = i15 + 1;
            if (N0(this.f15819e + i15) != 'l') {
                this.f15827m = -1;
                return false;
            }
            int i17 = i16 + 1;
            if (N0(this.f15819e + i16) != 's') {
                this.f15827m = -1;
                return false;
            }
            int i18 = i17 + 1;
            if (N0(this.f15819e + i17) != 'e') {
                this.f15827m = -1;
                return false;
            }
            i10 = i18;
            z10 = false;
        }
        int i19 = i10 + 1;
        char N02 = N0(this.f15819e + i10);
        if (N02 == ',') {
            int i20 = this.f15819e + i19;
            this.f15819e = i20;
            this.f15818d = N0(i20);
            this.f15827m = 3;
            this.f15815a = 16;
            return z10;
        } else if (N02 != '}') {
            this.f15827m = -1;
            return false;
        } else {
            int i21 = i19 + 1;
            char N03 = N0(this.f15819e + i19);
            if (N03 == ',') {
                this.f15815a = 16;
            } else {
                if (N03 == ']') {
                    i11 = 15;
                } else if (N03 != '}') {
                    if (N03 != 26) {
                        this.f15827m = -1;
                        return false;
                    }
                    this.f15815a = 20;
                    this.f15819e = (i21 - 1) + this.f15819e;
                    this.f15818d = (char) 26;
                    this.f15827m = 4;
                    return z10;
                } else {
                    i11 = 13;
                }
                this.f15815a = i11;
            }
            int i22 = this.f15819e + i21;
            this.f15819e = i22;
            this.f15818d = N0(i22);
            this.f15827m = 4;
            return z10;
        }
    }

    @Override // h4.c
    public String Z(l lVar) {
        return null;
    }

    public Date Z0(char[] cArr) {
        int i10;
        long j10;
        Date date;
        int i11;
        char N0;
        int i12;
        int i13;
        boolean z10 = false;
        this.f15827m = 0;
        if (!M0(cArr)) {
            this.f15827m = -2;
            return null;
        }
        int length = cArr.length;
        int i14 = length + 1;
        char N02 = N0(this.f15819e + length);
        if (N02 == '\"') {
            int Q0 = Q0(this.f15819e + cArr.length + 1);
            if (Q0 != -1) {
                int length2 = this.f15819e + cArr.length + 1;
                String m12 = m1(length2, Q0 - length2);
                if (m12.indexOf(92) != -1) {
                    while (true) {
                        int i15 = 0;
                        for (int i16 = Q0 - 1; i16 >= 0 && N0(i16) == '\\'; i16--) {
                            i15++;
                        }
                        if (i15 % 2 == 0) {
                            break;
                        }
                        Q0 = Q0(Q0 + 1);
                    }
                    int i17 = this.f15819e;
                    int length3 = Q0 - ((cArr.length + i17) + 1);
                    m12 = W0(n1(i17 + cArr.length + 1, length3), length3);
                }
                int i18 = this.f15819e;
                int length4 = (Q0 - ((cArr.length + i18) + 1)) + 1 + i14;
                i10 = length4 + 1;
                N02 = N0(i18 + length4);
                h hVar = new h(m12);
                try {
                    if (hVar.t1(false)) {
                        date = hVar.f15824j.getTime();
                    } else {
                        this.f15827m = -1;
                        return null;
                    }
                } finally {
                    hVar.close();
                }
            } else {
                throw new e4.d("unclosed str");
            }
        } else if (N02 != '-' && (N02 < '0' || N02 > '9')) {
            this.f15827m = -1;
            return null;
        } else {
            if (N02 == '-') {
                N02 = N0(this.f15819e + i14);
                i14++;
                z10 = true;
            }
            if (N02 >= '0' && N02 <= '9') {
                j10 = N02 - '0';
                while (true) {
                    i11 = i14 + 1;
                    N0 = N0(this.f15819e + i14);
                    if (N0 < '0' || N0 > '9') {
                        break;
                    }
                    j10 = (j10 * 10) + (N0 - '0');
                    i14 = i11;
                }
                N02 = N0;
                i10 = i11;
            } else {
                i10 = i14;
                j10 = 0;
            }
            if (j10 < 0) {
                this.f15827m = -1;
                return null;
            }
            if (z10) {
                j10 = -j10;
            }
            date = new Date(j10);
        }
        if (N02 == ',') {
            int i19 = this.f15819e + i10;
            this.f15819e = i19;
            this.f15818d = N0(i19);
            i13 = 3;
        } else if (N02 == '}') {
            int i20 = i10 + 1;
            char N03 = N0(this.f15819e + i10);
            if (N03 == ',') {
                i12 = 16;
            } else if (N03 == ']') {
                i12 = 15;
            } else if (N03 == '}') {
                i12 = 13;
            } else if (N03 == 26) {
                this.f15815a = 20;
                this.f15819e = (i20 - 1) + this.f15819e;
                this.f15818d = (char) 26;
                i13 = 4;
            } else {
                this.f15827m = -1;
                return null;
            }
            this.f15815a = i12;
            int i21 = this.f15819e + i20;
            this.f15819e = i21;
            this.f15818d = N0(i21);
            i13 = 4;
        } else {
            this.f15827m = -1;
            return null;
        }
        this.f15827m = i13;
        return date;
    }

    /* JADX WARN: Removed duplicated region for block: B:70:0x009f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00a0  */
    @Override // h4.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Enum<?> a(java.lang.Class<?> r10, h4.l r11, char r12) {
        /*
            r9 = this;
            r0 = 0
            r9.f15827m = r0
            int r1 = r9.f15819e
            int r1 = r1 + r0
            char r1 = r9.N0(r1)
            r2 = 1
            r3 = 3
            r4 = -1
            r5 = 110(0x6e, float:1.54E-43)
            r6 = 0
            if (r1 != r5) goto L49
            int r11 = r9.f15819e
            int r11 = r11 + r2
            char r11 = r9.N0(r11)
            r0 = 117(0x75, float:1.64E-43)
            if (r11 != r0) goto L9a
            int r11 = r9.f15819e
            char r11 = h4.d.a(r11, r2, r2, r9)
            r0 = 108(0x6c, float:1.51E-43)
            if (r11 != r0) goto L9a
            int r11 = r9.f15819e
            r1 = 2
            char r11 = h4.d.a(r11, r2, r1, r9)
            if (r11 != r0) goto L9a
            int r11 = r9.f15819e
            int r11 = r11 + 4
            char r11 = r9.N0(r11)
            if (r11 != r12) goto L9a
            int r11 = r9.f15819e
            int r11 = r11 + 5
            r9.f15819e = r11
            char r11 = r9.N0(r11)
            r9.f15818d = r11
            r9.f15827m = r3
            goto L9c
        L49:
            r5 = 34
            if (r1 == r5) goto L4e
            goto L9a
        L4e:
            r1 = 1
        L4f:
            int r7 = r9.f15819e
            int r8 = r1 + 1
            int r7 = r7 + r1
            char r1 = r9.N0(r7)
            if (r1 != r5) goto L93
            int r1 = r9.f15819e
            int r5 = r1 + 0
            int r5 = r5 + r2
            int r1 = r1 + r8
            int r1 = r1 - r5
            int r1 = r1 - r2
            java.lang.String r11 = r9.K0(r5, r1, r0, r11)
            int r0 = r9.f15819e
            int r1 = r8 + 1
            int r0 = r0 + r8
            char r0 = r9.N0(r0)
        L6f:
            if (r0 != r12) goto L7f
            int r12 = r9.f15819e
            int r12 = r12 + r1
            r9.f15819e = r12
            char r12 = r9.N0(r12)
            r9.f15818d = r12
            r9.f15827m = r3
            goto L9d
        L7f:
            boolean r0 = S0(r0)
            if (r0 == 0) goto L90
            int r0 = r9.f15819e
            int r2 = r1 + 1
            int r0 = r0 + r1
            char r0 = r9.N0(r0)
            r1 = r2
            goto L6f
        L90:
            r9.f15827m = r4
            goto L9d
        L93:
            int r0 = r0 * 31
            int r0 = r0 + r1
            r7 = 92
            if (r1 != r7) goto La5
        L9a:
            r9.f15827m = r4
        L9c:
            r11 = r6
        L9d:
            if (r11 != 0) goto La0
            return r6
        La0:
            java.lang.Enum r10 = java.lang.Enum.valueOf(r10, r11)
            return r10
        La5:
            r1 = r8
            goto L4f
        */
        throw new UnsupportedOperationException("Method not decompiled: h4.e.a(java.lang.Class, h4.l, char):java.lang.Enum");
    }

    /* JADX WARN: Removed duplicated region for block: B:185:0x00b0 A[ADDED_TO_REGION] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:183:0x00ad -> B:184:0x00ae). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.math.BigDecimal a1(char[] r15) {
        /*
            Method dump skipped, instructions count: 454
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: h4.e.a1(char[]):java.math.BigDecimal");
    }

    @Override // h4.c
    public final int b() {
        return this.f15816b;
    }

    /* JADX WARN: Removed duplicated region for block: B:88:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0092  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:96:0x008b -> B:85:0x0058). Please submit an issue!!! */
    @Override // h4.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Number b0() {
        /*
            Method dump skipped, instructions count: 257
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: h4.e.b0():java.lang.Number");
    }

    public final double b1(char[] cArr) {
        boolean z10;
        boolean z11;
        int i10;
        char N0;
        boolean z12;
        boolean z13;
        e eVar;
        int length;
        int i11;
        double parseDouble;
        char N02;
        this.f15827m = 0;
        if (!M0(cArr)) {
            this.f15827m = -2;
            return 0.0d;
        }
        int length2 = cArr.length;
        int i12 = length2 + 1;
        char N03 = N0(this.f15819e + length2);
        if (N03 == '\"') {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            N03 = N0(this.f15819e + i12);
            i12++;
        }
        if (N03 == '-') {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11) {
            N03 = N0(this.f15819e + i12);
            i12++;
        }
        char c10 = '0';
        if (N03 >= '0') {
            char c11 = '9';
            if (N03 <= '9') {
                long j10 = N03 - '0';
                while (true) {
                    i10 = i12 + 1;
                    N0 = N0(this.f15819e + i12);
                    if (N0 < '0' || N0 > '9') {
                        break;
                    }
                    j10 = (j10 * 10) + (N0 - '0');
                    i12 = i10;
                    z11 = z11;
                }
                boolean z14 = z11;
                long j11 = 1;
                if (N0 == '.') {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (z12) {
                    int i13 = i10 + 1;
                    char N04 = N0(this.f15819e + i10);
                    if (N04 >= '0' && N04 <= '9') {
                        j10 = (j10 * 10) + (N04 - '0');
                        long j12 = 10;
                        while (true) {
                            i10 = i13 + 1;
                            N0 = N0(this.f15819e + i13);
                            if (N0 < c10 || N0 > c11) {
                                break;
                            }
                            j10 = (j10 * 10) + (N0 - '0');
                            j12 *= 10;
                            i13 = i10;
                            c10 = '0';
                            c11 = '9';
                        }
                        j11 = j12;
                    } else {
                        this.f15827m = -1;
                        return 0.0d;
                    }
                }
                if (N0 != 'e' && N0 != 'E') {
                    z13 = false;
                } else {
                    z13 = true;
                }
                if (z13) {
                    int i14 = i10 + 1;
                    N0 = N0(this.f15819e + i10);
                    if (N0 != '+' && N0 != '-') {
                        eVar = this;
                        i10 = i14;
                    } else {
                        N0 = N0(this.f15819e + i14);
                        eVar = this;
                        i10 = i14 + 1;
                    }
                    while (N0 >= '0' && N0 <= '9') {
                        N0 = eVar.N0(eVar.f15819e + i10);
                        i10++;
                    }
                } else {
                    eVar = this;
                }
                if (z10) {
                    if (N0 != '\"') {
                        eVar.f15827m = -1;
                        return 0.0d;
                    }
                    int i15 = i10 + 1;
                    N0 = eVar.N0(eVar.f15819e + i10);
                    int i16 = eVar.f15819e;
                    length = cArr.length + i16 + 1;
                    i11 = ((i16 + i15) - length) - 2;
                    i10 = i15;
                } else {
                    int i17 = eVar.f15819e;
                    length = cArr.length + i17;
                    i11 = ((i17 + i10) - length) - 1;
                }
                if (!z13 && i11 < 17) {
                    parseDouble = j10 / j11;
                    if (z14) {
                        parseDouble = -parseDouble;
                    }
                } else {
                    parseDouble = Double.parseDouble(eVar.m1(length, i11));
                }
                if (N0 == ',') {
                    int i18 = eVar.f15819e + i10;
                    eVar.f15819e = i18;
                    eVar.f15818d = eVar.N0(i18);
                    eVar.f15827m = 3;
                    eVar.f15815a = 16;
                    return parseDouble;
                }
                int i19 = 16;
                if (N0 == '}') {
                    int i20 = i10 + 1;
                    char N05 = eVar.N0(eVar.f15819e + i10);
                    if (N05 != ',') {
                        if (N05 == ']') {
                            i19 = 15;
                        } else if (N05 == '}') {
                            i19 = 13;
                        } else {
                            N02 = 26;
                            if (N05 == 26) {
                                eVar.f15815a = 20;
                                eVar.f15819e = (i20 - 1) + eVar.f15819e;
                                eVar.f15818d = N02;
                                eVar.f15827m = 4;
                                return parseDouble;
                            }
                            eVar.f15827m = -1;
                            return 0.0d;
                        }
                    }
                    eVar.f15815a = i19;
                    int i21 = eVar.f15819e + i20;
                    eVar.f15819e = i21;
                    N02 = eVar.N0(i21);
                    eVar.f15818d = N02;
                    eVar.f15827m = 4;
                    return parseDouble;
                }
                eVar.f15827m = -1;
                return 0.0d;
            }
        }
        if (N03 == 'n' && N0(this.f15819e + i12) == 'u' && d.a(this.f15819e, i12, 1, this) == 'l' && d.a(this.f15819e, i12, 2, this) == 'l') {
            this.f15827m = 5;
            int i22 = i12 + 3;
            int i23 = i22 + 1;
            char N06 = N0(this.f15819e + i22);
            if (z10 && N06 == '\"') {
                N06 = N0(this.f15819e + i23);
                i23++;
            }
            while (N06 != ',') {
                if (N06 == '}') {
                    int i24 = this.f15819e + i23;
                    this.f15819e = i24;
                    this.f15818d = N0(i24);
                    this.f15827m = 5;
                    this.f15815a = 13;
                    return 0.0d;
                } else if (S0(N06)) {
                    N06 = N0(this.f15819e + i23);
                    i23++;
                } else {
                    this.f15827m = -1;
                    return 0.0d;
                }
            }
            int i25 = this.f15819e + i23;
            this.f15819e = i25;
            this.f15818d = N0(i25);
            this.f15827m = 5;
            this.f15815a = 16;
            return 0.0d;
        }
        this.f15827m = -1;
        return 0.0d;
    }

    /* JADX WARN: Removed duplicated region for block: B:199:0x00d7  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:197:0x00d1 -> B:198:0x00d5). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final float c1(char[] r18) {
        /*
            Method dump skipped, instructions count: 520
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: h4.e.c1(char[]):float");
    }

    @Override // h4.c, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        char[] cArr = this.f15820f;
        if (cArr.length <= 8192) {
            f15813o.set(cArr);
        }
        this.f15820f = null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:158:0x00a5, code lost:
        r20.f15827m = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:159:0x00a7, code lost:
        return r3;
     */
    /* JADX WARN: Removed duplicated region for block: B:177:0x00de A[ADDED_TO_REGION] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:175:0x00d6 -> B:176:0x00dc). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final float[] d1(char[] r21) {
        /*
            Method dump skipped, instructions count: 428
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: h4.e.d1(char[]):float[]");
    }

    @Override // h4.c
    public final float e0() {
        char charAt;
        String I0 = I0();
        float parseFloat = Float.parseFloat(I0);
        if ((parseFloat == 0.0f || parseFloat == Float.POSITIVE_INFINITY) && (charAt = I0.charAt(0)) > '0' && charAt <= '9') {
            throw new e4.d(a.b.b("float overflow : ", I0));
        }
        return parseFloat;
    }

    /* JADX WARN: Code restructure failed: missing block: B:182:0x00b5, code lost:
        r21.f15827m = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:183:0x00b7, code lost:
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:221:0x0156, code lost:
        r4 = r17 + 1;
        r3 = N0(r21.f15819e + r17);
     */
    /* JADX WARN: Code restructure failed: missing block: B:222:0x0161, code lost:
        if (r1 == r2.length) goto L122;
     */
    /* JADX WARN: Code restructure failed: missing block: B:223:0x0163, code lost:
        r5 = new float[r1];
        r12 = 0;
        java.lang.System.arraycopy(r2, 0, r5, 0, r1);
        r2 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:224:0x016b, code lost:
        r12 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:226:0x016d, code lost:
        if (r7 < r6.length) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:227:0x016f, code lost:
        r5 = new float[(r6.length * 3) / 2];
        java.lang.System.arraycopy(r2, r12, r5, r12, r1);
        r6 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:228:0x017a, code lost:
        r1 = r7 + 1;
        r6[r7] = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:229:0x0180, code lost:
        if (r3 != ',') goto L90;
     */
    /* JADX WARN: Code restructure failed: missing block: B:230:0x0182, code lost:
        r3 = r4 + 1;
        r2 = N0(r21.f15819e + r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:232:0x018e, code lost:
        if (r3 != ']') goto L92;
     */
    /* JADX WARN: Code restructure failed: missing block: B:233:0x0190, code lost:
        r7 = r1;
        r1 = N0(r21.f15819e + r4);
        r2 = r4 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:234:0x019d, code lost:
        r2 = r3;
        r3 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:241:0x01be, code lost:
        if (r7 == r6.length) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:242:0x01c0, code lost:
        r3 = new float[r7];
        java.lang.System.arraycopy(r6, 0, r3, 0, r7);
        r6 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:244:0x01c9, code lost:
        if (r1 != ',') goto L103;
     */
    /* JADX WARN: Code restructure failed: missing block: B:245:0x01cb, code lost:
        r21.f15819e = (r2 - 1) + r21.f15819e;
        next();
        r21.f15827m = 3;
        r21.f15815a = 16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:246:0x01db, code lost:
        return r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:247:0x01dc, code lost:
        r3 = 16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:248:0x01e0, code lost:
        if (r1 != '}') goto L120;
     */
    /* JADX WARN: Code restructure failed: missing block: B:249:0x01e2, code lost:
        r5 = r2 + 1;
        r1 = N0(r21.f15819e + r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:250:0x01ed, code lost:
        if (r1 != ',') goto L107;
     */
    /* JADX WARN: Code restructure failed: missing block: B:253:0x01f2, code lost:
        if (r1 != ']') goto L110;
     */
    /* JADX WARN: Code restructure failed: missing block: B:254:0x01f4, code lost:
        r3 = 15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:255:0x01f7, code lost:
        if (r1 != '}') goto L112;
     */
    /* JADX WARN: Code restructure failed: missing block: B:256:0x01f9, code lost:
        r3 = 13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:257:0x01fb, code lost:
        r21.f15815a = r3;
        r21.f15819e = (r5 - 1) + r21.f15819e;
        next();
     */
    /* JADX WARN: Code restructure failed: missing block: B:259:0x0209, code lost:
        if (r1 != 26) goto L117;
     */
    /* JADX WARN: Code restructure failed: missing block: B:260:0x020b, code lost:
        r21.f15819e = (r5 - 1) + r21.f15819e;
        r21.f15815a = 20;
        r21.f15818d = 26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:261:0x0217, code lost:
        r21.f15827m = 4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:262:0x021a, code lost:
        return r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:263:0x021b, code lost:
        r21.f15827m = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:264:0x021e, code lost:
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:265:0x021f, code lost:
        r21.f15827m = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:266:0x0222, code lost:
        return null;
     */
    /* JADX WARN: Removed duplicated region for block: B:202:0x0103 A[ADDED_TO_REGION] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:200:0x00f9 -> B:201:0x0101). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final float[][] e1(char[] r22) {
        /*
            Method dump skipped, instructions count: 547
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: h4.e.e1(char[]):float[][]");
    }

    /* JADX WARN: Removed duplicated region for block: B:126:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:139:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public int f1(char[] r11) {
        /*
            Method dump skipped, instructions count: 199
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: h4.e.f1(char[]):int");
    }

    public final int[] g1(char[] cArr) {
        boolean z10;
        int i10;
        char N0;
        int i11;
        int i12;
        char N02;
        int i13;
        this.f15827m = 0;
        int[] iArr = null;
        if (!M0(cArr)) {
            this.f15827m = -2;
            return null;
        }
        int length = cArr.length;
        int i14 = length + 1;
        if (N0(this.f15819e + length) != '[') {
            this.f15827m = -2;
            return null;
        }
        int i15 = i14 + 1;
        char N03 = N0(this.f15819e + i14);
        int[] iArr2 = new int[16];
        if (N03 != ']') {
            int i16 = 0;
            while (true) {
                if (N03 == '-') {
                    N03 = N0(this.f15819e + i15);
                    i15++;
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (N03 < '0' || N03 > '9') {
                    break;
                }
                int i17 = N03 - '0';
                while (true) {
                    i10 = i15 + 1;
                    N0 = N0(this.f15819e + i15);
                    if (N0 < '0' || N0 > '9') {
                        break;
                    }
                    i17 = (i17 * 10) + (N0 - '0');
                    i15 = i10;
                }
                if (i16 >= iArr2.length) {
                    int[] iArr3 = new int[(iArr2.length * 3) / 2];
                    System.arraycopy(iArr2, 0, iArr3, 0, i16);
                    iArr2 = iArr3;
                }
                i11 = i16 + 1;
                if (z10) {
                    i17 = -i17;
                }
                iArr2[i16] = i17;
                if (N0 == ',') {
                    i10++;
                    N0 = N0(this.f15819e + i10);
                } else if (N0 == ']') {
                    i12 = i10 + 1;
                    N02 = N0(this.f15819e + i10);
                    break;
                }
                i16 = i11;
                iArr = null;
                N03 = N0;
                i15 = i10;
            }
            int[] iArr4 = iArr;
            this.f15827m = -1;
            return iArr4;
        }
        i12 = i15 + 1;
        N02 = N0(this.f15819e + i15);
        i11 = 0;
        if (i11 != iArr2.length) {
            int[] iArr5 = new int[i11];
            System.arraycopy(iArr2, 0, iArr5, 0, i11);
            iArr2 = iArr5;
        }
        if (N02 == ',') {
            this.f15819e = (i12 - 1) + this.f15819e;
            next();
            this.f15827m = 3;
            this.f15815a = 16;
            return iArr2;
        } else if (N02 != '}') {
            this.f15827m = -1;
            return null;
        } else {
            int i18 = i12 + 1;
            char N04 = N0(this.f15819e + i12);
            if (N04 == ',') {
                this.f15815a = 16;
            } else {
                if (N04 == ']') {
                    i13 = 15;
                } else if (N04 != '}') {
                    if (N04 != 26) {
                        this.f15827m = -1;
                        return null;
                    }
                    this.f15819e = (i18 - 1) + this.f15819e;
                    this.f15815a = 20;
                    this.f15818d = (char) 26;
                    this.f15827m = 4;
                    return iArr2;
                } else {
                    i13 = 13;
                }
                this.f15815a = i13;
            }
            this.f15819e = (i18 - 1) + this.f15819e;
            next();
            this.f15827m = 4;
            return iArr2;
        }
    }

    @Override // h4.c
    public String h() {
        return "";
    }

    @Override // h4.c
    public final int h0() {
        return this.f15815a;
    }

    /* JADX WARN: Removed duplicated region for block: B:126:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:137:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public long h1(char[] r18) {
        /*
            Method dump skipped, instructions count: 214
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: h4.e.h1(char[]):long");
    }

    @Override // h4.c
    public final String i0(char c10) {
        this.f15827m = 0;
        char N0 = N0(this.f15819e + 0);
        if (N0 == 'n') {
            if (N0(this.f15819e + 1) == 'u' && d.a(this.f15819e, 1, 1, this) == 'l' && d.a(this.f15819e, 1, 2, this) == 'l') {
                if (N0(this.f15819e + 4) == c10) {
                    int i10 = this.f15819e + 5;
                    this.f15819e = i10;
                    this.f15818d = N0(i10);
                    this.f15827m = 3;
                    return null;
                }
                this.f15827m = -1;
                return null;
            }
            this.f15827m = -1;
            return null;
        }
        int i11 = 1;
        while (N0 != '\"') {
            if (S0(N0)) {
                N0 = N0(this.f15819e + i11);
                i11++;
            } else {
                this.f15827m = -1;
                return this.f15828n;
            }
        }
        int i12 = this.f15819e + i11;
        int Q0 = Q0(i12);
        if (Q0 != -1) {
            String m12 = m1(this.f15819e + i11, Q0 - i12);
            if (m12.indexOf(92) != -1) {
                while (true) {
                    int i13 = 0;
                    for (int i14 = Q0 - 1; i14 >= 0 && N0(i14) == '\\'; i14--) {
                        i13++;
                    }
                    if (i13 % 2 == 0) {
                        break;
                    }
                    Q0 = Q0(Q0 + 1);
                }
                int i15 = Q0 - i12;
                m12 = W0(n1(this.f15819e + 1, i15), i15);
            }
            int i16 = (Q0 - i12) + 1 + i11;
            int i17 = i16 + 1;
            char N02 = N0(this.f15819e + i16);
            while (N02 != c10) {
                if (S0(N02)) {
                    N02 = N0(this.f15819e + i17);
                    i17++;
                } else {
                    if (N02 == ']') {
                        int i18 = this.f15819e + i17;
                        this.f15819e = i18;
                        this.f15818d = N0(i18);
                        this.f15827m = -1;
                    }
                    return m12;
                }
            }
            int i19 = this.f15819e + i17;
            this.f15819e = i19;
            this.f15818d = N0(i19);
            this.f15827m = 3;
            this.f15815a = 16;
            return m12;
        }
        throw new e4.d("unclosed str");
    }

    public String i1(char[] cArr) {
        int i10;
        int i11;
        this.f15827m = 0;
        if (!M0(cArr)) {
            this.f15827m = -2;
        } else {
            int length = cArr.length;
            int i12 = length + 1;
            if (N0(this.f15819e + length) == '\"') {
                int Q0 = Q0(this.f15819e + cArr.length + 1);
                if (Q0 != -1) {
                    int length2 = this.f15819e + cArr.length + 1;
                    String m12 = m1(length2, Q0 - length2);
                    if (m12.indexOf(92) != -1) {
                        while (true) {
                            int i13 = 0;
                            for (int i14 = Q0 - 1; i14 >= 0 && N0(i14) == '\\'; i14--) {
                                i13++;
                            }
                            if (i13 % 2 == 0) {
                                break;
                            }
                            Q0 = Q0(Q0 + 1);
                        }
                        int i15 = this.f15819e;
                        int length3 = Q0 - ((cArr.length + i15) + 1);
                        m12 = W0(n1(i15 + cArr.length + 1, length3), length3);
                    }
                    int i16 = this.f15819e;
                    int length4 = (Q0 - ((cArr.length + i16) + 1)) + 1 + i12;
                    int i17 = length4 + 1;
                    char N0 = N0(i16 + length4);
                    if (N0 == ',') {
                        int i18 = this.f15819e + i17;
                        this.f15819e = i18;
                        this.f15818d = N0(i18);
                        i11 = 3;
                    } else if (N0 == '}') {
                        int i19 = i17 + 1;
                        char N02 = N0(this.f15819e + i17);
                        if (N02 == ',') {
                            i10 = 16;
                        } else if (N02 == ']') {
                            i10 = 15;
                        } else if (N02 == '}') {
                            i10 = 13;
                        } else if (N02 == 26) {
                            this.f15815a = 20;
                            this.f15819e = (i19 - 1) + this.f15819e;
                            this.f15818d = (char) 26;
                            i11 = 4;
                        }
                        this.f15815a = i10;
                        int i20 = this.f15819e + i19;
                        this.f15819e = i20;
                        this.f15818d = N0(i20);
                        i11 = 4;
                    }
                    this.f15827m = i11;
                    return m12;
                }
                throw new e4.d("unclosed str");
            }
            this.f15827m = -1;
        }
        return this.f15828n;
    }

    @Override // h4.c
    public final boolean isEnabled(int i10) {
        return (i10 & this.f15817c) != 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:55:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0085  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:66:0x005c -> B:52:0x0032). Please submit an issue!!! */
    @Override // h4.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long j() {
        /*
            r15 = this;
            int r0 = r15.f15822h
            r1 = 0
            r2 = -1
            if (r0 != r2) goto L8
            r15.f15822h = r1
        L8:
            int r0 = r15.f15822h
            int r2 = r15.f15821g
            int r2 = r2 + r0
            char r3 = r15.N0(r0)
            r4 = 45
            r5 = 1
            if (r3 != r4) goto L1c
            r3 = -9223372036854775808
            int r0 = r0 + 1
            r1 = 1
            goto L21
        L1c:
            r3 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
        L21:
            r6 = -922337203685477580(0xf333333333333334, double:-8.390303882365713E246)
            if (r0 >= r2) goto L34
            int r8 = r0 + 1
            char r0 = r15.N0(r0)
            int r0 = r0 + (-48)
            int r0 = -r0
            long r9 = (long) r0
        L32:
            r0 = r8
            goto L36
        L34:
            r9 = 0
        L36:
            if (r0 >= r2) goto L73
            int r8 = r0 + 1
            char r0 = r15.N0(r0)
            r11 = 76
            if (r0 == r11) goto L72
            r11 = 83
            if (r0 == r11) goto L72
            r11 = 66
            if (r0 != r11) goto L4b
            goto L72
        L4b:
            int r0 = r0 + (-48)
            int r11 = (r9 > r6 ? 1 : (r9 == r6 ? 0 : -1))
            if (r11 < 0) goto L68
            r11 = 10
            long r9 = r9 * r11
            long r11 = (long) r0
            long r13 = r3 + r11
            int r0 = (r9 > r13 ? 1 : (r9 == r13 ? 0 : -1))
            if (r0 < 0) goto L5e
            long r9 = r9 - r11
            goto L32
        L5e:
            java.lang.NumberFormatException r0 = new java.lang.NumberFormatException
            java.lang.String r1 = r15.I0()
            r0.<init>(r1)
            throw r0
        L68:
            java.lang.NumberFormatException r0 = new java.lang.NumberFormatException
            java.lang.String r1 = r15.I0()
            r0.<init>(r1)
            throw r0
        L72:
            r0 = r8
        L73:
            if (r1 == 0) goto L85
            int r1 = r15.f15822h
            int r1 = r1 + r5
            if (r0 <= r1) goto L7b
            return r9
        L7b:
            java.lang.NumberFormatException r0 = new java.lang.NumberFormatException
            java.lang.String r1 = r15.I0()
            r0.<init>(r1)
            throw r0
        L85:
            long r0 = -r9
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: h4.e.j():long");
    }

    public final void j1() {
        this.f15822h = this.f15819e - 1;
        this.f15823i = false;
        do {
            this.f15821g++;
            next();
        } while (Character.isLetterOrDigit(this.f15818d));
        String W = W();
        this.f15815a = "null".equalsIgnoreCase(W) ? 8 : "new".equals(W) ? 9 : "true".equals(W) ? 6 : "false".equals(W) ? 7 : "undefined".equals(W) ? 23 : "Set".equals(W) ? 21 : "TreeSet".equals(W) ? 22 : 18;
    }

    @Override // h4.c
    public boolean k() {
        int i10 = 0;
        while (true) {
            char N0 = N0(i10);
            if (N0 == 26) {
                this.f15815a = 20;
                return true;
            } else if (!S0(N0)) {
                return false;
            } else {
                i10++;
            }
        }
    }

    public final void k1(boolean z10) {
        if (this.f15818d != 'n') {
            throw new e4.d("error parse null or new");
        }
        next();
        char c10 = this.f15818d;
        if (c10 != 'u') {
            if (c10 != 'e') {
                throw new e4.d("error parse new");
            }
            next();
            if (this.f15818d != 'w') {
                throw new e4.d("error parse new");
            }
            next();
            char c11 = this.f15818d;
            if (c11 != ' ' && c11 != ',' && c11 != '}' && c11 != ']' && c11 != '\n' && c11 != '\r' && c11 != '\t' && c11 != 26 && c11 != '\f' && c11 != '\b') {
                throw new e4.d("scan new error");
            }
            this.f15815a = 9;
            return;
        }
        next();
        if (this.f15818d != 'l') {
            throw new e4.d("error parse null");
        }
        next();
        if (this.f15818d != 'l') {
            throw new e4.d("error parse null");
        }
        next();
        char c12 = this.f15818d;
        if (c12 != ' ' && c12 != ',' && c12 != '}' && c12 != ']' && c12 != '\n' && c12 != '\r' && c12 != '\t' && c12 != 26 && ((c12 != ':' || !z10) && c12 != '\f' && c12 != '\b')) {
            throw new e4.d("scan null error");
        }
        this.f15815a = 8;
    }

    @Override // h4.c
    public final int l0() {
        return this.f15817c;
    }

    public final void l1() {
        char c10;
        next();
        char c11 = this.f15818d;
        if (c11 == '/') {
            do {
                next();
                c10 = this.f15818d;
                if (c10 == '\n') {
                    next();
                    return;
                }
            } while (c10 != 26);
            return;
        }
        if (c11 != '*') {
            throw new e4.d("invalid comment");
        }
        while (true) {
            next();
            while (true) {
                char c12 = this.f15818d;
                if (c12 == 26) {
                    return;
                }
                if (c12 == '*') {
                    next();
                    if (this.f15818d == '/') {
                        next();
                        return;
                    }
                }
            }
        }
    }

    public abstract String m1(int i10, int i11);

    @Override // h4.c
    public final String n0(l lVar) {
        boolean z10 = false;
        if (this.f15815a == 1 && this.f15816b == 0 && this.f15819e == 1) {
            this.f15819e = 0;
        }
        boolean[] zArr = n4.g.f21969c;
        int i10 = this.f15818d;
        if ((i10 >= zArr.length || zArr[i10]) ? true : true) {
            boolean[] zArr2 = n4.g.f21970d;
            this.f15822h = this.f15819e;
            this.f15821g = 1;
            while (true) {
                char next = next();
                if (next < zArr2.length && !zArr2[next]) {
                    break;
                }
                i10 = (i10 * 31) + next;
                this.f15821g++;
            }
            this.f15818d = N0(this.f15819e);
            this.f15815a = 18;
            if (this.f15821g == 4 && i10 == 3392903 && N0(this.f15822h) == 'n' && N0(this.f15822h + 1) == 'u' && N0(this.f15822h + 2) == 'l' && N0(this.f15822h + 3) == 'l') {
                return null;
            }
            if (lVar == null) {
                return m1(this.f15822h, this.f15821g);
            }
            return K0(this.f15822h, this.f15821g, i10, lVar);
        }
        StringBuilder a10 = android.support.v4.media.d.a("illegal identifier : ");
        a10.append(this.f15818d);
        a10.append(h());
        throw new e4.d(a10.toString());
    }

    public abstract char[] n1(int i10, int i11);

    @Override // h4.c
    public abstract char next();

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:568:0x033a, code lost:
        throw new e4.d("invalid escape character \\x" + r0 + r2);
     */
    @Override // h4.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void nextToken() {
        /*
            Method dump skipped, instructions count: 1056
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: h4.e.nextToken():void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:215:0x0194, code lost:
        r18.f15815a = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:216:0x0196, code lost:
        return 0.0d;
     */
    @Override // h4.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public double p0(char r19) {
        /*
            Method dump skipped, instructions count: 440
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: h4.e.p0(char):double");
    }

    /* JADX WARN: Removed duplicated region for block: B:181:0x00a6 A[ADDED_TO_REGION] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:179:0x00a3 -> B:180:0x00a4). Please submit an issue!!! */
    @Override // h4.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.math.BigDecimal q() {
        /*
            Method dump skipped, instructions count: 436
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: h4.e.q():java.math.BigDecimal");
    }

    @Override // h4.c
    public final char q0() {
        return this.f15818d;
    }

    @Override // h4.c
    public final boolean s(char c10) {
        boolean z10 = false;
        this.f15827m = 0;
        char N0 = N0(this.f15819e + 0);
        int i10 = 5;
        if (N0 == 't') {
            if (N0(this.f15819e + 1) == 'r' && d.a(this.f15819e, 1, 1, this) == 'u' && d.a(this.f15819e, 1, 2, this) == 'e') {
                N0 = N0(this.f15819e + 4);
                z10 = true;
            } else {
                this.f15827m = -1;
                return false;
            }
        } else if (N0 == 'f') {
            if (N0(this.f15819e + 1) == 'a' && d.a(this.f15819e, 1, 1, this) == 'l' && d.a(this.f15819e, 1, 2, this) == 's' && d.a(this.f15819e, 1, 3, this) == 'e') {
                N0 = N0(this.f15819e + 5);
                i10 = 6;
            } else {
                this.f15827m = -1;
                return false;
            }
        } else {
            if (N0 == '1') {
                N0 = N0(this.f15819e + 1);
                z10 = true;
            } else if (N0 == '0') {
                N0 = N0(this.f15819e + 1);
            } else {
                i10 = 1;
            }
            i10 = 2;
        }
        while (N0 != c10) {
            if (S0(N0)) {
                N0 = N0(this.f15819e + i10);
                i10++;
            } else {
                this.f15827m = -1;
                return z10;
            }
        }
        int i11 = this.f15819e + i10;
        this.f15819e = i11;
        this.f15818d = N0(i11);
        this.f15827m = 3;
        return z10;
    }

    @Override // h4.c
    public final void t0() {
        while (true) {
            char c10 = this.f15818d;
            if (c10 > '/') {
                return;
            }
            if (c10 == ' ' || c10 == '\r' || c10 == '\n' || c10 == '\t' || c10 == '\f' || c10 == '\b') {
                next();
            } else if (c10 != '/') {
                return;
            } else {
                l1();
            }
        }
    }

    @Override // h4.c
    public final void u0() {
        this.f15821g = 0;
    }

    @Override // h4.c
    public final String v(l lVar) {
        int i10;
        t0();
        char c10 = this.f15818d;
        if (c10 == '\"') {
            return w0(lVar, '\"');
        }
        if (c10 == '\'') {
            if (I(b.AllowSingleQuotes)) {
                return w0(lVar, '\'');
            }
            throw new e4.d("syntax error");
        }
        if (c10 == '}') {
            next();
            i10 = 13;
        } else if (c10 == ',') {
            next();
            i10 = 16;
        } else if (c10 != 26) {
            if (I(b.AllowUnQuotedFieldNames)) {
                return n0(lVar);
            }
            throw new e4.d("syntax error");
        } else {
            i10 = 20;
        }
        this.f15815a = i10;
        return null;
    }

    @Override // h4.c
    public final String w0(l lVar, char c10) {
        String a10;
        int i10;
        this.f15822h = this.f15819e;
        this.f15821g = 0;
        boolean z10 = false;
        int i11 = 0;
        while (true) {
            char next = next();
            if (next == c10) {
                this.f15815a = 4;
                if (z10) {
                    a10 = lVar.a(0, this.f15821g, i11, this.f15820f);
                } else {
                    int i12 = this.f15822h;
                    a10 = K0(i12 == -1 ? 0 : i12 + 1, this.f15821g, i11, lVar);
                }
                this.f15821g = 0;
                next();
                return a10;
            } else if (next == 26) {
                throw new e4.d("unclosed.str");
            } else {
                char c11 = '\\';
                if (next == '\\') {
                    if (!z10) {
                        int i13 = this.f15821g;
                        char[] cArr = this.f15820f;
                        if (i13 >= cArr.length) {
                            int length = cArr.length * 2;
                            if (i13 <= length) {
                                i13 = length;
                            }
                            char[] cArr2 = new char[i13];
                            System.arraycopy(cArr, 0, cArr2, 0, cArr.length);
                            this.f15820f = cArr2;
                        }
                        L0(this.f15822h + 1, this.f15821g, this.f15820f);
                        z10 = true;
                    }
                    char next2 = next();
                    char c12 = '\"';
                    if (next2 != '\"') {
                        c12 = '\'';
                        if (next2 != '\'') {
                            if (next2 != 'F') {
                                if (next2 != '\\') {
                                    if (next2 == 'b') {
                                        i10 = i11 * 31;
                                        next = '\b';
                                    } else if (next2 != 'f') {
                                        if (next2 == 'n') {
                                            i10 = i11 * 31;
                                            next = '\n';
                                        } else if (next2 == 'r') {
                                            i10 = i11 * 31;
                                            next = '\r';
                                        } else if (next2 != 'x') {
                                            c11 = 3;
                                            switch (next2) {
                                                case '/':
                                                    i10 = i11 * 31;
                                                    next = '/';
                                                    break;
                                                case '0':
                                                    i11 = (i11 * 31) + next2;
                                                    V0((char) 0);
                                                    break;
                                                case '1':
                                                    i11 = (i11 * 31) + next2;
                                                    V0((char) 1);
                                                    break;
                                                case '2':
                                                    i11 = (i11 * 31) + next2;
                                                    next = 2;
                                                    V0(next);
                                                    break;
                                                case '3':
                                                    i11 = (i11 * 31) + next2;
                                                    break;
                                                case '4':
                                                    i11 = (i11 * 31) + next2;
                                                    V0((char) 4);
                                                    break;
                                                case '5':
                                                    i11 = (i11 * 31) + next2;
                                                    next = 5;
                                                    V0(next);
                                                    break;
                                                case '6':
                                                    i11 = (i11 * 31) + next2;
                                                    next = 6;
                                                    V0(next);
                                                    break;
                                                case '7':
                                                    i11 = (i11 * 31) + next2;
                                                    next = 7;
                                                    V0(next);
                                                    break;
                                                default:
                                                    switch (next2) {
                                                        case 't':
                                                            i10 = i11 * 31;
                                                            next = '\t';
                                                            break;
                                                        case 'u':
                                                            int parseInt = Integer.parseInt(new String(new char[]{next(), next(), next(), next()}), 16);
                                                            i11 = (i11 * 31) + parseInt;
                                                            next = (char) parseInt;
                                                            break;
                                                        case 'v':
                                                            i10 = i11 * 31;
                                                            next = 11;
                                                            break;
                                                        default:
                                                            this.f15818d = next2;
                                                            throw new e4.d("unclosed.str.lit");
                                                    }
                                                    V0(next);
                                                    break;
                                            }
                                        } else {
                                            char next3 = next();
                                            this.f15818d = next3;
                                            char next4 = next();
                                            this.f15818d = next4;
                                            int[] iArr = f15814p;
                                            next = (char) ((iArr[next3] * 16) + iArr[next4]);
                                            i10 = i11 * 31;
                                        }
                                    }
                                    i11 = i10 + next;
                                    V0(next);
                                } else {
                                    i11 = (i11 * 31) + 92;
                                }
                                V0(c11);
                            }
                            i10 = i11 * 31;
                            next = '\f';
                            i11 = i10 + next;
                            V0(next);
                        }
                    }
                    i11 = (i11 * 31) + c12;
                    V0(c12);
                } else {
                    i11 = (i11 * 31) + next;
                    if (z10) {
                        int i14 = this.f15821g;
                        char[] cArr3 = this.f15820f;
                        if (i14 == cArr3.length) {
                            V0(next);
                        } else {
                            this.f15821g = i14 + 1;
                            cArr3[i14] = next;
                        }
                    } else {
                        this.f15821g++;
                    }
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:160:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x010f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:167:0x0129 -> B:168:0x012b). Please submit an issue!!! */
    @Override // h4.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public long x0(char r16) {
        /*
            Method dump skipped, instructions count: 316
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: h4.e.x0(char):long");
    }

    /* JADX WARN: Removed duplicated region for block: B:171:0x00d1 A[ADDED_TO_REGION] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:169:0x00c9 -> B:170:0x00cf). Please submit an issue!!! */
    @Override // h4.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final float y(char r22) {
        /*
            Method dump skipped, instructions count: 445
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: h4.e.y(char):float");
    }

    @Override // h4.c
    public final void y0() {
        U0();
    }

    @Override // h4.c
    public final String z0() {
        return i.a(this.f15815a);
    }
}
