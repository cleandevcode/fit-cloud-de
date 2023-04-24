package h4;

import androidx.appcompat.widget.u0;
import cn.sharesdk.framework.Platform;
import java.math.BigDecimal;
import java.math.MathContext;
import java.util.Calendar;
import java.util.Date;
import java.util.SimpleTimeZone;

/* loaded from: classes.dex */
public final class h extends e {

    /* renamed from: q */
    public final String f15831q;

    /* renamed from: r */
    public final int f15832r;

    public h(String str) {
        this(str, e4.a.f13344f);
    }

    public h(String str, int i10) {
        super(i10);
        this.f15831q = str;
        this.f15832r = str.length();
        this.f15819e = -1;
        next();
        if (this.f15818d == 65279) {
            next();
        }
    }

    public static boolean o1(String str, int i10, char[] cArr) {
        int length = cArr.length;
        if (length + i10 > str.length()) {
            return false;
        }
        for (int i11 = 0; i11 < length; i11++) {
            if (cArr[i11] != str.charAt(i10 + i11)) {
                return false;
            }
        }
        return true;
    }

    public static boolean p1(char c10, char c11, char c12, char c13, char c14, char c15, int i10, int i11) {
        if (c10 >= '0' && c10 <= '9' && c11 >= '0' && c11 <= '9' && c12 >= '0' && c12 <= '9' && c13 >= '0' && c13 <= '9') {
            if (c14 == '0') {
                if (c15 < '1' || c15 > '9') {
                    return false;
                }
            } else if (c14 != '1' || (c15 != '0' && c15 != '1' && c15 != '2')) {
                return false;
            }
            if (i10 == 48) {
                return i11 >= 49 && i11 <= 57;
            } else if (i10 != 49 && i10 != 50) {
                return i10 == 51 && (i11 == 48 || i11 == 49);
            } else if (i11 >= 48 && i11 <= 57) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:55:0x001d, code lost:
        if (r5 <= '4') goto L5;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean q1(char r4, char r5, char r6, char r7, char r8, char r9) {
        /*
            r0 = 57
            r1 = 0
            r2 = 48
            if (r4 != r2) goto Lc
            if (r5 < r2) goto Lb
            if (r5 <= r0) goto L20
        Lb:
            return r1
        Lc:
            r3 = 49
            if (r4 != r3) goto L15
            if (r5 < r2) goto L14
            if (r5 <= r0) goto L20
        L14:
            return r1
        L15:
            r3 = 50
            if (r4 != r3) goto L42
            if (r5 < r2) goto L42
            r4 = 52
            if (r5 <= r4) goto L20
            goto L42
        L20:
            r4 = 53
            r5 = 54
            if (r6 < r2) goto L2d
            if (r6 > r4) goto L2d
            if (r7 < r2) goto L2c
            if (r7 <= r0) goto L32
        L2c:
            return r1
        L2d:
            if (r6 != r5) goto L42
            if (r7 == r2) goto L32
            return r1
        L32:
            if (r8 < r2) goto L3b
            if (r8 > r4) goto L3b
            if (r9 < r2) goto L3a
            if (r9 <= r0) goto L40
        L3a:
            return r1
        L3b:
            if (r8 != r5) goto L42
            if (r9 == r2) goto L40
            return r1
        L40:
            r4 = 1
            return r4
        L42:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: h4.h.q1(char, char, char, char, char, char):boolean");
    }

    @Override // h4.e, h4.c
    public final String I0() {
        char N0 = N0((this.f15822h + this.f15821g) - 1);
        int i10 = this.f15821g;
        if (N0 == 'L' || N0 == 'S' || N0 == 'B' || N0 == 'F' || N0 == 'D') {
            i10--;
        }
        return m1(this.f15822h, i10);
    }

    @Override // h4.e
    public final String K0(int i10, int i11, int i12, l lVar) {
        return lVar.b(i10, this.f15831q, i11, i12);
    }

    @Override // h4.e, h4.c
    public final BigDecimal L() {
        char N0 = N0((this.f15822h + this.f15821g) - 1);
        int i10 = this.f15821g;
        if (N0 == 'L' || N0 == 'S' || N0 == 'B' || N0 == 'F' || N0 == 'D') {
            i10--;
        }
        if (i10 <= 65535) {
            int i11 = this.f15822h;
            char[] cArr = this.f15820f;
            if (i10 < cArr.length) {
                this.f15831q.getChars(i11, i11 + i10, cArr, 0);
                return new BigDecimal(this.f15820f, 0, i10, MathContext.UNLIMITED);
            }
            char[] cArr2 = new char[i10];
            this.f15831q.getChars(i11, i11 + i10, cArr2, 0);
            return new BigDecimal(cArr2, 0, i10, MathContext.UNLIMITED);
        }
        throw new e4.d("decimal overflow");
    }

    @Override // h4.e
    public final void L0(int i10, int i11, char[] cArr) {
        this.f15831q.getChars(i10, i11 + i10, cArr, 0);
    }

    @Override // h4.e
    public final boolean M0(char[] cArr) {
        return o1(this.f15831q, this.f15819e, cArr);
    }

    @Override // h4.e
    public final char N0(int i10) {
        if (i10 >= this.f15832r) {
            return (char) 26;
        }
        return this.f15831q.charAt(i10);
    }

    @Override // h4.e
    public final void O0(char[] cArr, int i10, int i11) {
        this.f15831q.getChars(i10, i11 + i10, cArr, 0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:123:0x007a, code lost:
        if (r2 != '.') goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x007c, code lost:
        r14.f15827m = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x007e, code lost:
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x007f, code lost:
        if (r5 == false) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x0081, code lost:
        if (r2 == '\"') goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x0083, code lost:
        r14.f15827m = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x0085, code lost:
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x0086, code lost:
        r2 = N0(r11);
        r11 = r11 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x008d, code lost:
        if (r3 >= 0) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x008f, code lost:
        r14.f15827m = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x0091, code lost:
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x0092, code lost:
        if (r2 != r15) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x0094, code lost:
        r14.f15819e = r11;
        r14.f15818d = N0(r11);
        r14.f15827m = 3;
        r14.f15815a = 16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x00a1, code lost:
        if (r6 == false) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x00a4, code lost:
        return -r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x00a9, code lost:
        if (h4.e.S0(r2) == false) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x00ab, code lost:
        r2 = N0(r11);
        r11 = r11 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x00b3, code lost:
        r14.f15827m = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x00b5, code lost:
        if (r6 == false) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x00b8, code lost:
        return -r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:180:?, code lost:
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:181:?, code lost:
        return r3;
     */
    /* JADX WARN: Removed duplicated region for block: B:161:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x00fa  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:168:0x0111 -> B:169:0x0113). Please submit an issue!!! */
    @Override // h4.e, h4.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int P(char r15) {
        /*
            Method dump skipped, instructions count: 291
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: h4.h.P(char):int");
    }

    @Override // h4.e
    public final int Q0(int i10) {
        return this.f15831q.indexOf(34, i10);
    }

    @Override // h4.c
    public final byte[] R() {
        int i10;
        int i11;
        char c10;
        int i12 = 2;
        int i13 = 0;
        if (this.f15815a == 26) {
            int i14 = this.f15822h + 1;
            int i15 = this.f15821g;
            if (i15 % 2 == 0) {
                int i16 = i15 / 2;
                byte[] bArr = new byte[i16];
                while (i13 < i16) {
                    int i17 = (i13 * 2) + i14;
                    char charAt = this.f15831q.charAt(i17);
                    char charAt2 = this.f15831q.charAt(i17 + 1);
                    char c11 = '0';
                    if (charAt <= '9') {
                        c10 = '0';
                    } else {
                        c10 = '7';
                    }
                    int i18 = charAt - c10;
                    if (charAt2 > '9') {
                        c11 = '7';
                    }
                    bArr[i13] = (byte) ((i18 << 4) | (charAt2 - c11));
                    i13++;
                }
                return bArr;
            }
            throw new e4.d(u0.a("illegal state. ", i15));
        } else if (!this.f15823i) {
            String str = this.f15831q;
            int i19 = this.f15822h + 1;
            int i20 = this.f15821g;
            if (i20 == 0) {
                return new byte[0];
            }
            int i21 = (i19 + i20) - 1;
            while (i19 < i21 && n4.g.f21982p[str.charAt(i19)] < 0) {
                i19++;
            }
            while (i21 > 0 && n4.g.f21982p[str.charAt(i21)] < 0) {
                i21--;
            }
            if (str.charAt(i21) == '=') {
                if (str.charAt(i21 - 1) != '=') {
                    i12 = 1;
                }
            } else {
                i12 = 0;
            }
            int i22 = (i21 - i19) + 1;
            if (i20 > 76) {
                if (str.charAt(76) == '\r') {
                    i11 = i22 / 78;
                } else {
                    i11 = 0;
                }
                i10 = i11 << 1;
            } else {
                i10 = 0;
            }
            int i23 = (((i22 - i10) * 6) >> 3) - i12;
            byte[] bArr2 = new byte[i23];
            int i24 = (i23 / 3) * 3;
            int i25 = 0;
            int i26 = 0;
            while (i25 < i24) {
                int[] iArr = n4.g.f21982p;
                int i27 = i19 + 1;
                int i28 = i27 + 1;
                int i29 = (iArr[str.charAt(i19)] << 18) | (iArr[str.charAt(i27)] << 12);
                int i30 = i28 + 1;
                int i31 = i29 | (iArr[str.charAt(i28)] << 6);
                int i32 = i30 + 1;
                int i33 = i31 | iArr[str.charAt(i30)];
                int i34 = i25 + 1;
                bArr2[i25] = (byte) (i33 >> 16);
                int i35 = i34 + 1;
                bArr2[i34] = (byte) (i33 >> 8);
                int i36 = i35 + 1;
                bArr2[i35] = (byte) i33;
                if (i10 > 0 && (i26 = i26 + 1) == 19) {
                    i19 = i32 + 2;
                    i26 = 0;
                } else {
                    i19 = i32;
                }
                i25 = i36;
            }
            if (i25 < i23) {
                int i37 = 0;
                while (i19 <= i21 - i12) {
                    i37 |= n4.g.f21982p[str.charAt(i19)] << (18 - (i13 * 6));
                    i13++;
                    i19++;
                }
                int i38 = 16;
                while (i25 < i23) {
                    bArr2[i25] = (byte) (i37 >> i38);
                    i38 -= 8;
                    i25++;
                }
            }
            return bArr2;
        } else {
            return n4.g.b(new String(this.f15820f, 0, this.f15821g));
        }
    }

    @Override // h4.e
    public final boolean R0() {
        int i10 = this.f15819e;
        int i11 = this.f15832r;
        if (i10 != i11) {
            return this.f15818d == 26 && i10 + 1 >= i11;
        }
        return true;
    }

    @Override // h4.e, h4.c
    public final String W() {
        return !this.f15823i ? m1(this.f15822h + 1, this.f15821g) : new String(this.f15820f, 0, this.f15821g);
    }

    /* JADX WARN: Removed duplicated region for block: B:194:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x00eb A[SYNTHETIC] */
    @Override // h4.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean Y0(char[] r11) {
        /*
            Method dump skipped, instructions count: 344
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: h4.h.Y0(char[]):boolean");
    }

    @Override // h4.e, h4.c
    public final String Z(l lVar) {
        int indexOf;
        if (!this.f15831q.startsWith("\"@type\":\"", this.f15819e) || (indexOf = this.f15831q.indexOf(34, this.f15819e + 9)) == -1) {
            return null;
        }
        int i10 = this.f15819e + 9;
        this.f15819e = i10;
        int i11 = 0;
        while (i10 < indexOf) {
            i11 = (i11 * 31) + this.f15831q.charAt(i10);
            i10++;
        }
        int i12 = this.f15819e;
        String b10 = lVar.b(i12, this.f15831q, indexOf - i12, i11);
        char charAt = this.f15831q.charAt(indexOf + 1);
        if (charAt != ',' && charAt != ']') {
            return null;
        }
        int i13 = indexOf + 2;
        this.f15819e = i13;
        this.f15818d = this.f15831q.charAt(i13);
        return b10;
    }

    @Override // h4.e
    public final Date Z0(char[] cArr) {
        char c10;
        long j10;
        char c11;
        Date date;
        int i10;
        int i11;
        boolean z10 = false;
        this.f15827m = 0;
        int i12 = this.f15819e;
        char c12 = this.f15818d;
        if (!o1(this.f15831q, i12, cArr)) {
            this.f15827m = -2;
            return null;
        }
        int length = this.f15819e + cArr.length;
        int i13 = length + 1;
        char N0 = N0(length);
        if (N0 == '\"') {
            int Q0 = Q0(i13);
            if (Q0 == -1) {
                throw new e4.d("unclosed str");
            }
            this.f15819e = i13;
            if (!s1(Q0 - i13, false)) {
                this.f15819e = i12;
                this.f15827m = -1;
                return null;
            }
            date = this.f15824j.getTime();
            c11 = N0(Q0 + 1);
            this.f15819e = i12;
            while (c11 != ',' && c11 != '}') {
                if (!e.S0(c11)) {
                    this.f15827m = -1;
                    return null;
                }
                Q0++;
                c11 = N0(Q0 + 1);
            }
            this.f15819e = Q0 + 1;
            this.f15818d = c11;
        } else {
            char c13 = '0';
            char c14 = '9';
            if (N0 != '-' && (N0 < '0' || N0 > '9')) {
                this.f15827m = -1;
                return null;
            }
            if (N0 == '-') {
                N0 = N0(i13);
                i13++;
                z10 = true;
            }
            if (N0 < '0' || N0 > '9') {
                c10 = N0;
                j10 = 0;
            } else {
                j10 = N0 - '0';
                while (true) {
                    i10 = i13 + 1;
                    c10 = N0(i13);
                    if (c10 < c13 || c10 > c14) {
                        break;
                    }
                    j10 = (j10 * 10) + (c10 - '0');
                    i13 = i10;
                    c13 = '0';
                    c14 = '9';
                }
                if (c10 == ',' || c10 == '}') {
                    this.f15819e = i10 - 1;
                }
            }
            if (j10 < 0) {
                this.f15827m = -1;
                return null;
            }
            if (z10) {
                j10 = -j10;
            }
            c11 = c10;
            date = new Date(j10);
        }
        if (c11 == ',') {
            int i14 = this.f15819e + 1;
            this.f15819e = i14;
            this.f15818d = N0(i14);
            this.f15827m = 3;
            this.f15815a = 16;
            return date;
        }
        int i15 = this.f15819e + 1;
        this.f15819e = i15;
        char N02 = N0(i15);
        if (N02 == ',') {
            this.f15815a = 16;
        } else {
            if (N02 == ']') {
                i11 = 15;
            } else if (N02 != '}') {
                if (N02 == 26) {
                    this.f15815a = 20;
                    this.f15827m = 4;
                    return date;
                }
                this.f15819e = i12;
                this.f15818d = c12;
                this.f15827m = -1;
                return null;
            } else {
                i11 = 13;
            }
            this.f15815a = i11;
        }
        int i16 = this.f15819e + 1;
        this.f15819e = i16;
        this.f15818d = N0(i16);
        this.f15827m = 4;
        return date;
    }

    /* JADX WARN: Code restructure failed: missing block: B:130:0x0065, code lost:
        if (r15 != '.') goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x0067, code lost:
        r14.f15827m = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x0069, code lost:
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x006a, code lost:
        if (r3 >= 0) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x006c, code lost:
        r14.f15827m = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x006e, code lost:
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x006f, code lost:
        if (r6 == false) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x0071, code lost:
        if (r15 == '\"') goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x0073, code lost:
        r14.f15827m = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x0075, code lost:
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x0076, code lost:
        r4 = N0(r11);
        r11 = r11 + 1;
        r15 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x0082, code lost:
        if (r15 == ',') goto L90;
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x0084, code lost:
        if (r15 != '}') goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x008b, code lost:
        if (h4.e.S0(r15) == false) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x008e, code lost:
        r14.f15827m = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:149:0x0090, code lost:
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:150:0x0091, code lost:
        r11 = r11 - 1;
        r14.f15819e = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:151:0x0096, code lost:
        if (r15 != ',') goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x0098, code lost:
        r11 = r11 + 1;
        r14.f15819e = r11;
        r14.f15818d = N0(r11);
        r14.f15827m = 3;
        r14.f15815a = 16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:153:0x00a6, code lost:
        if (r7 == false) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:155:0x00a9, code lost:
        return -r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:156:0x00aa, code lost:
        if (r15 != '}') goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:157:0x00ac, code lost:
        r11 = r11 + 1;
        r14.f15819e = r11;
        r15 = N0(r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:158:0x00b3, code lost:
        if (r15 != ',') goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:159:0x00b5, code lost:
        r14.f15815a = 16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:160:0x00b7, code lost:
        r15 = r14.f15819e + 1;
        r14.f15819e = r15;
        r14.f15818d = N0(r15);
     */
    /* JADX WARN: Code restructure failed: missing block: B:162:0x00c5, code lost:
        if (r15 != ']') goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:163:0x00c7, code lost:
        r15 = 15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:164:0x00c9, code lost:
        r14.f15815a = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:165:0x00cc, code lost:
        if (r15 != '}') goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:166:0x00ce, code lost:
        r15 = 13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:168:0x00d3, code lost:
        if (r15 != 26) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:169:0x00d5, code lost:
        r14.f15815a = 20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:170:0x00d9, code lost:
        r14.f15827m = 4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:172:0x00e1, code lost:
        if (h4.e.S0(r15) == false) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:173:0x00e3, code lost:
        r15 = r14.f15819e + 1;
        r14.f15819e = r15;
        r15 = N0(r15);
     */
    /* JADX WARN: Code restructure failed: missing block: B:174:0x00ed, code lost:
        r14.f15819e = r1;
        r14.f15818d = r2;
        r14.f15827m = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:175:0x00f3, code lost:
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:176:0x00f4, code lost:
        if (r7 == false) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:178:0x00f7, code lost:
        return -r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:181:0x0076, code lost:
        r4 = N0(r11);
        r11 = r11 + 1;
        r15 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:194:?, code lost:
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:195:?, code lost:
        return r3;
     */
    @Override // h4.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int f1(char[] r15) {
        /*
            Method dump skipped, instructions count: 251
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: h4.h.f1(char[]):int");
    }

    @Override // h4.e, h4.c
    public final String h() {
        StringBuilder sb2 = new StringBuilder();
        int i10 = 0;
        int i11 = 1;
        int i12 = 1;
        while (i10 < this.f15819e) {
            if (this.f15831q.charAt(i10) == '\n') {
                i11++;
                i12 = 1;
            }
            i10++;
            i12++;
        }
        sb2.append("pos ");
        sb2.append(this.f15819e);
        sb2.append(", line ");
        sb2.append(i11);
        sb2.append(", column ");
        sb2.append(i12);
        sb2.append(this.f15831q.length() < 65535 ? this.f15831q : this.f15831q.substring(0, Platform.CUSTOMER_ACTION_MASK));
        return sb2.toString();
    }

    /* JADX WARN: Removed duplicated region for block: B:170:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:195:? A[RETURN, SYNTHETIC] */
    @Override // h4.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long h1(char[] r21) {
        /*
            Method dump skipped, instructions count: 300
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: h4.h.h1(char[]):long");
    }

    /* JADX WARN: Code restructure failed: missing block: B:87:0x002a, code lost:
        return r11.f15828n;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x004d, code lost:
        if (r3 != '\"') goto L22;
     */
    @Override // h4.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String i1(char[] r12) {
        /*
            Method dump skipped, instructions count: 264
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: h4.h.i1(char[]):java.lang.String");
    }

    @Override // h4.e
    public final String m1(int i10, int i11) {
        if (n4.b.f21946a) {
            char[] cArr = this.f15820f;
            if (i11 < cArr.length) {
                this.f15831q.getChars(i10, i10 + i11, cArr, 0);
                return new String(this.f15820f, 0, i11);
            }
            char[] cArr2 = new char[i11];
            this.f15831q.getChars(i10, i11 + i10, cArr2, 0);
            return new String(cArr2);
        }
        return this.f15831q.substring(i10, i11 + i10);
    }

    @Override // h4.e
    public final char[] n1(int i10, int i11) {
        if (n4.b.f21946a) {
            char[] cArr = this.f15820f;
            if (i11 < cArr.length) {
                this.f15831q.getChars(i10, i11 + i10, cArr, 0);
                return this.f15820f;
            }
        }
        char[] cArr2 = new char[i11];
        this.f15831q.getChars(i10, i11 + i10, cArr2, 0);
        return cArr2;
    }

    @Override // h4.e, h4.c
    public final char next() {
        int i10 = this.f15819e + 1;
        this.f15819e = i10;
        char charAt = i10 >= this.f15832r ? (char) 26 : this.f15831q.charAt(i10);
        this.f15818d = charAt;
        return charAt;
    }

    /* JADX WARN: Removed duplicated region for block: B:170:0x00c0  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:172:0x00c4 -> B:167:0x00b4). Please submit an issue!!! */
    @Override // h4.e, h4.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final double p0(char r22) {
        /*
            Method dump skipped, instructions count: 385
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: h4.h.p0(char):double");
    }

    public final boolean r1() {
        return t1(true);
    }

    /* JADX WARN: Code restructure failed: missing block: B:748:0x05f4, code lost:
        if (N0(r26.f15819e + 16) == 'Z') goto L318;
     */
    /* JADX WARN: Removed duplicated region for block: B:532:0x01f0 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:534:0x01f2  */
    /* JADX WARN: Removed duplicated region for block: B:760:0x062d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:762:0x062f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean s1(int r27, boolean r28) {
        /*
            Method dump skipped, instructions count: 1704
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: h4.h.s1(int, boolean):boolean");
    }

    public final boolean t1(boolean z10) {
        return s1(this.f15832r - this.f15819e, z10);
    }

    public final void u1(char c10, char c11, char c12, char c13, char c14, char c15, char c16, char c17) {
        Calendar calendar = Calendar.getInstance(this.f15825k, this.f15826l);
        this.f15824j = calendar;
        int i10 = c13 - '0';
        calendar.set(1, i10 + ((c12 - '0') * 10) + ((c11 - '0') * 100) + ((c10 - '0') * 1000));
        this.f15824j.set(2, ((c15 - '0') + ((c14 - '0') * 10)) - 1);
        this.f15824j.set(5, (c17 - '0') + ((c16 - '0') * 10));
    }

    public final void v1(char c10, char c11, char c12, char c13, char c14, char c15) {
        this.f15824j.set(11, (c11 - '0') + ((c10 - '0') * 10));
        Calendar calendar = this.f15824j;
        calendar.set(12, (c13 - '0') + ((c12 - '0') * 10));
        Calendar calendar2 = this.f15824j;
        calendar2.set(13, (c15 - '0') + ((c14 - '0') * 10));
    }

    public final void w1(char c10, char c11, char c12, char c13, char c14) {
        int i10 = ((c14 - '0') + ((c13 - '0') * 10)) * 60 * 1000;
        int i11 = i10 + (((c12 - '0') + ((c11 - '0') * 10)) * 3600 * 1000);
        if (c10 == '-') {
            i11 = -i11;
        }
        if (this.f15824j.getTimeZone().getRawOffset() != i11) {
            this.f15824j.setTimeZone(new SimpleTimeZone(i11, Integer.toString(i11)));
        }
    }

    @Override // h4.e, h4.c
    public final long x0(char c10) {
        int i10;
        char N0;
        boolean z10 = false;
        this.f15827m = 0;
        int i11 = this.f15819e;
        int i12 = i11 + 1;
        char N02 = N0(i11);
        boolean z11 = N02 == '\"';
        if (z11) {
            int i13 = i12 + 1;
            char N03 = N0(i12);
            i12 = i13;
            N02 = N03;
        }
        boolean z12 = N02 == '-';
        if (z12) {
            int i14 = i12 + 1;
            char N04 = N0(i12);
            i12 = i14;
            N02 = N04;
        }
        char c11 = '0';
        if (N02 >= '0' && N02 <= '9') {
            long j10 = N02 - '0';
            while (true) {
                i10 = i12 + 1;
                N0 = N0(i12);
                if (N0 < c11 || N0 > '9') {
                    break;
                }
                j10 = (j10 * 10) + (N0 - '0');
                i12 = i10;
                c11 = '0';
            }
            if (N0 == '.') {
                this.f15827m = -1;
                return 0L;
            }
            if (z11) {
                if (N0 != '\"') {
                    this.f15827m = -1;
                    return 0L;
                }
                N0 = N0(i10);
                i10++;
            }
            if (j10 >= 0 || (j10 == Long.MIN_VALUE && z12)) {
                z10 = true;
            }
            if (!z10) {
                this.f15827m = -1;
                return 0L;
            }
            while (N0 != c10) {
                if (!e.S0(N0)) {
                    this.f15827m = -1;
                    return j10;
                }
                N0 = N0(i10);
                i10++;
            }
            this.f15819e = i10;
            this.f15818d = N0(i10);
            this.f15827m = 3;
            this.f15815a = 16;
            return z12 ? -j10 : j10;
        }
        if (N02 == 'n') {
            int i15 = i12 + 1;
            if (N0(i12) == 'u') {
                int i16 = i15 + 1;
                if (N0(i15) == 'l') {
                    int i17 = i16 + 1;
                    if (N0(i16) == 'l') {
                        this.f15827m = 5;
                        int i18 = i17 + 1;
                        char N05 = N0(i17);
                        if (z11 && N05 == '\"') {
                            int i19 = i18 + 1;
                            char N06 = N0(i18);
                            i18 = i19;
                            N05 = N06;
                        }
                        while (N05 != ',') {
                            if (N05 == ']') {
                                this.f15819e = i18;
                                this.f15818d = N0(i18);
                                this.f15827m = 5;
                                this.f15815a = 15;
                                return 0L;
                            } else if (!e.S0(N05)) {
                                this.f15827m = -1;
                                return 0L;
                            } else {
                                int i20 = i18 + 1;
                                char N07 = N0(i18);
                                i18 = i20;
                                N05 = N07;
                            }
                        }
                        this.f15819e = i18;
                        this.f15818d = N0(i18);
                        this.f15827m = 5;
                        this.f15815a = 16;
                        return 0L;
                    }
                }
            }
        }
        this.f15827m = -1;
        return 0L;
    }
}
