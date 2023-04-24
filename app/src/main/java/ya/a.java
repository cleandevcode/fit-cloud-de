package ya;

import android.support.v4.media.d;
import java.io.Closeable;
import java.io.Reader;
import java.io.StringReader;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;
import no.nordicsemi.android.dfu.DfuBaseService;
import qa.q;
import ta.f;
import w1.h;
import yb.y;

/* loaded from: classes.dex */
public class a implements Closeable {

    /* renamed from: a */
    public final Reader f31247a;

    /* renamed from: i */
    public long f31255i;

    /* renamed from: j */
    public int f31256j;

    /* renamed from: k */
    public String f31257k;

    /* renamed from: l */
    public int[] f31258l;

    /* renamed from: n */
    public String[] f31260n;

    /* renamed from: o */
    public int[] f31261o;

    /* renamed from: b */
    public boolean f31248b = false;

    /* renamed from: c */
    public final char[] f31249c = new char[DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED];

    /* renamed from: d */
    public int f31250d = 0;

    /* renamed from: e */
    public int f31251e = 0;

    /* renamed from: f */
    public int f31252f = 0;

    /* renamed from: g */
    public int f31253g = 0;

    /* renamed from: h */
    public int f31254h = 0;

    /* renamed from: m */
    public int f31259m = 1;

    /* renamed from: ya.a$a */
    /* loaded from: classes.dex */
    public class C0576a extends y {
        public final void C(a aVar) {
            int i10;
            if (aVar instanceof f) {
                f fVar = (f) aVar;
                fVar.w0(5);
                Map.Entry entry = (Map.Entry) ((Iterator) fVar.y0()).next();
                fVar.A0(entry.getValue());
                fVar.A0(new q((String) entry.getKey()));
                return;
            }
            int i11 = aVar.f31254h;
            if (i11 == 0) {
                i11 = aVar.j();
            }
            if (i11 == 13) {
                i10 = 9;
            } else if (i11 == 12) {
                i10 = 8;
            } else if (i11 == 14) {
                i10 = 10;
            } else {
                StringBuilder a10 = d.a("Expected a name but was ");
                a10.append(a1.b.c(aVar.h0()));
                a10.append(aVar.F());
                throw new IllegalStateException(a10.toString());
            }
            aVar.f31254h = i10;
        }
    }

    static {
        y.f31419b = new C0576a();
    }

    public a(StringReader stringReader) {
        int[] iArr = new int[32];
        this.f31258l = iArr;
        iArr[0] = 6;
        this.f31260n = new String[32];
        this.f31261o = new int[32];
        this.f31247a = stringReader;
    }

    public String C() {
        return y(true);
    }

    public boolean D() {
        int i10 = this.f31254h;
        if (i10 == 0) {
            i10 = j();
        }
        return (i10 == 2 || i10 == 4 || i10 == 17) ? false : true;
    }

    public final boolean E(char c10) {
        if (c10 == '\t' || c10 == '\n' || c10 == '\f' || c10 == '\r' || c10 == ' ') {
            return false;
        }
        if (c10 != '#') {
            if (c10 == ',') {
                return false;
            }
            if (c10 != '/' && c10 != '=') {
                if (c10 == '{' || c10 == '}' || c10 == ':') {
                    return false;
                }
                if (c10 != ';') {
                    switch (c10) {
                        case '[':
                        case ']':
                            return false;
                        case '\\':
                            break;
                        default:
                            return true;
                    }
                }
            }
        }
        h();
        return false;
    }

    public final String F() {
        StringBuilder a10 = h.a(" at line ", this.f31252f + 1, " column ", (this.f31250d - this.f31253g) + 1, " path ");
        a10.append(v());
        return a10.toString();
    }

    public boolean I() {
        int i10 = this.f31254h;
        if (i10 == 0) {
            i10 = j();
        }
        if (i10 == 5) {
            this.f31254h = 0;
            int[] iArr = this.f31261o;
            int i11 = this.f31259m - 1;
            iArr[i11] = iArr[i11] + 1;
            return true;
        } else if (i10 == 6) {
            this.f31254h = 0;
            int[] iArr2 = this.f31261o;
            int i12 = this.f31259m - 1;
            iArr2[i12] = iArr2[i12] + 1;
            return false;
        } else {
            StringBuilder a10 = d.a("Expected a boolean but was ");
            a10.append(a1.b.c(h0()));
            a10.append(F());
            throw new IllegalStateException(a10.toString());
        }
    }

    public double J() {
        char c10;
        String Z;
        int i10 = this.f31254h;
        if (i10 == 0) {
            i10 = j();
        }
        if (i10 == 15) {
            this.f31254h = 0;
            int[] iArr = this.f31261o;
            int i11 = this.f31259m - 1;
            iArr[i11] = iArr[i11] + 1;
            return this.f31255i;
        }
        if (i10 == 16) {
            this.f31257k = new String(this.f31249c, this.f31250d, this.f31256j);
            this.f31250d += this.f31256j;
        } else {
            if (i10 != 8 && i10 != 9) {
                if (i10 == 10) {
                    Z = e0();
                } else if (i10 != 11) {
                    StringBuilder a10 = d.a("Expected a double but was ");
                    a10.append(a1.b.c(h0()));
                    a10.append(F());
                    throw new IllegalStateException(a10.toString());
                }
            } else {
                if (i10 == 8) {
                    c10 = '\'';
                } else {
                    c10 = '\"';
                }
                Z = Z(c10);
            }
            this.f31257k = Z;
        }
        this.f31254h = 11;
        double parseDouble = Double.parseDouble(this.f31257k);
        if (!this.f31248b && (Double.isNaN(parseDouble) || Double.isInfinite(parseDouble))) {
            throw new c("JSON forbids NaN and infinities: " + parseDouble + F());
        }
        this.f31257k = null;
        this.f31254h = 0;
        int[] iArr2 = this.f31261o;
        int i12 = this.f31259m - 1;
        iArr2[i12] = iArr2[i12] + 1;
        return parseDouble;
    }

    public int L() {
        char c10;
        String Z;
        int i10 = this.f31254h;
        if (i10 == 0) {
            i10 = j();
        }
        if (i10 == 15) {
            long j10 = this.f31255i;
            int i11 = (int) j10;
            if (j10 == i11) {
                this.f31254h = 0;
                int[] iArr = this.f31261o;
                int i12 = this.f31259m - 1;
                iArr[i12] = iArr[i12] + 1;
                return i11;
            }
            StringBuilder a10 = d.a("Expected an int but was ");
            a10.append(this.f31255i);
            a10.append(F());
            throw new NumberFormatException(a10.toString());
        }
        if (i10 == 16) {
            this.f31257k = new String(this.f31249c, this.f31250d, this.f31256j);
            this.f31250d += this.f31256j;
        } else if (i10 != 8 && i10 != 9 && i10 != 10) {
            StringBuilder a11 = d.a("Expected an int but was ");
            a11.append(a1.b.c(h0()));
            a11.append(F());
            throw new IllegalStateException(a11.toString());
        } else {
            if (i10 == 10) {
                Z = e0();
            } else {
                if (i10 == 8) {
                    c10 = '\'';
                } else {
                    c10 = '\"';
                }
                Z = Z(c10);
            }
            this.f31257k = Z;
            try {
                int parseInt = Integer.parseInt(this.f31257k);
                this.f31254h = 0;
                int[] iArr2 = this.f31261o;
                int i13 = this.f31259m - 1;
                iArr2[i13] = iArr2[i13] + 1;
                return parseInt;
            } catch (NumberFormatException unused) {
            }
        }
        this.f31254h = 11;
        double parseDouble = Double.parseDouble(this.f31257k);
        int i14 = (int) parseDouble;
        if (i14 == parseDouble) {
            this.f31257k = null;
            this.f31254h = 0;
            int[] iArr3 = this.f31261o;
            int i15 = this.f31259m - 1;
            iArr3[i15] = iArr3[i15] + 1;
            return i14;
        }
        StringBuilder a12 = d.a("Expected an int but was ");
        a12.append(this.f31257k);
        a12.append(F());
        throw new NumberFormatException(a12.toString());
    }

    public long P() {
        char c10;
        String Z;
        int i10 = this.f31254h;
        if (i10 == 0) {
            i10 = j();
        }
        if (i10 == 15) {
            this.f31254h = 0;
            int[] iArr = this.f31261o;
            int i11 = this.f31259m - 1;
            iArr[i11] = iArr[i11] + 1;
            return this.f31255i;
        }
        if (i10 == 16) {
            this.f31257k = new String(this.f31249c, this.f31250d, this.f31256j);
            this.f31250d += this.f31256j;
        } else if (i10 != 8 && i10 != 9 && i10 != 10) {
            StringBuilder a10 = d.a("Expected a long but was ");
            a10.append(a1.b.c(h0()));
            a10.append(F());
            throw new IllegalStateException(a10.toString());
        } else {
            if (i10 == 10) {
                Z = e0();
            } else {
                if (i10 == 8) {
                    c10 = '\'';
                } else {
                    c10 = '\"';
                }
                Z = Z(c10);
            }
            this.f31257k = Z;
            try {
                long parseLong = Long.parseLong(this.f31257k);
                this.f31254h = 0;
                int[] iArr2 = this.f31261o;
                int i12 = this.f31259m - 1;
                iArr2[i12] = iArr2[i12] + 1;
                return parseLong;
            } catch (NumberFormatException unused) {
            }
        }
        this.f31254h = 11;
        double parseDouble = Double.parseDouble(this.f31257k);
        long j10 = (long) parseDouble;
        if (j10 == parseDouble) {
            this.f31257k = null;
            this.f31254h = 0;
            int[] iArr3 = this.f31261o;
            int i13 = this.f31259m - 1;
            iArr3[i13] = iArr3[i13] + 1;
            return j10;
        }
        StringBuilder a11 = d.a("Expected a long but was ");
        a11.append(this.f31257k);
        a11.append(F());
        throw new NumberFormatException(a11.toString());
    }

    public String R() {
        char c10;
        String Z;
        int i10 = this.f31254h;
        if (i10 == 0) {
            i10 = j();
        }
        if (i10 == 14) {
            Z = e0();
        } else {
            if (i10 == 12) {
                c10 = '\'';
            } else if (i10 == 13) {
                c10 = '\"';
            } else {
                StringBuilder a10 = d.a("Expected a name but was ");
                a10.append(a1.b.c(h0()));
                a10.append(F());
                throw new IllegalStateException(a10.toString());
            }
            Z = Z(c10);
        }
        this.f31254h = 0;
        this.f31260n[this.f31259m - 1] = Z;
        return Z;
    }

    /* JADX WARN: Code restructure failed: missing block: B:106:0x0051, code lost:
        if (r1 != '/') goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x0053, code lost:
        r9.f31250d = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x0056, code lost:
        if (r4 != r2) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x0058, code lost:
        r9.f31250d = r4 - 1;
        r2 = s(2);
        r9.f31250d++;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x0065, code lost:
        if (r2 != false) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x0067, code lost:
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x0068, code lost:
        h();
        r2 = r9.f31250d;
        r4 = r0[r2];
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x0071, code lost:
        if (r4 == '*') goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x0073, code lost:
        if (r4 == '/') goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x0075, code lost:
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x0076, code lost:
        r9.f31250d = r2 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x007b, code lost:
        r9.f31250d = r2 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x007f, code lost:
        r4 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x0085, code lost:
        if ((r9.f31250d + 2) <= r9.f31251e) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x008b, code lost:
        if (s(2) == false) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x008e, code lost:
        r3 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x0090, code lost:
        r1 = r9.f31249c;
        r2 = r9.f31250d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x0096, code lost:
        if (r1[r2] != '\n') goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x0098, code lost:
        r9.f31252f++;
        r9.f31253g = r2 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x00a2, code lost:
        if (r4 >= 2) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x00b1, code lost:
        if (r9.f31249c[r9.f31250d + r4] == "*\/".charAt(r4)) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x00b3, code lost:
        r9.f31250d++;
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x00b9, code lost:
        r4 = r4 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x00bc, code lost:
        if (r3 == false) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x00c3, code lost:
        u0("Unterminated comment");
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x00c9, code lost:
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x00ca, code lost:
        r9.f31250d = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x00ce, code lost:
        if (r1 != '#') goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x00d0, code lost:
        h();
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x00d8, code lost:
        return r1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int W(boolean r10) {
        /*
            Method dump skipped, instructions count: 220
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ya.a.W(boolean):int");
    }

    public void X() {
        int i10 = this.f31254h;
        if (i10 == 0) {
            i10 = j();
        }
        if (i10 == 7) {
            this.f31254h = 0;
            int[] iArr = this.f31261o;
            int i11 = this.f31259m - 1;
            iArr[i11] = iArr[i11] + 1;
            return;
        }
        StringBuilder a10 = d.a("Expected null but was ");
        a10.append(a1.b.c(h0()));
        a10.append(F());
        throw new IllegalStateException(a10.toString());
    }

    public final String Z(char c10) {
        char[] cArr = this.f31249c;
        StringBuilder sb2 = null;
        while (true) {
            int i10 = this.f31250d;
            int i11 = this.f31251e;
            int i12 = i10;
            while (true) {
                if (i12 < i11) {
                    int i13 = i12 + 1;
                    char c11 = cArr[i12];
                    if (c11 == c10) {
                        this.f31250d = i13;
                        int i14 = (i13 - i10) - 1;
                        if (sb2 == null) {
                            return new String(cArr, i10, i14);
                        }
                        sb2.append(cArr, i10, i14);
                        return sb2.toString();
                    } else if (c11 == '\\') {
                        this.f31250d = i13;
                        int i15 = (i13 - i10) - 1;
                        if (sb2 == null) {
                            sb2 = new StringBuilder(Math.max((i15 + 1) * 2, 16));
                        }
                        sb2.append(cArr, i10, i15);
                        sb2.append(l0());
                    } else {
                        if (c11 == '\n') {
                            this.f31252f++;
                            this.f31253g = i13;
                        }
                        i12 = i13;
                    }
                } else {
                    if (sb2 == null) {
                        sb2 = new StringBuilder(Math.max((i12 - i10) * 2, 16));
                    }
                    sb2.append(cArr, i10, i12 - i10);
                    this.f31250d = i12;
                    if (!s(1)) {
                        u0("Unterminated string");
                        throw null;
                    }
                }
            }
        }
    }

    public void a() {
        int i10 = this.f31254h;
        if (i10 == 0) {
            i10 = j();
        }
        if (i10 == 3) {
            i0(1);
            this.f31261o[this.f31259m - 1] = 0;
            this.f31254h = 0;
            return;
        }
        StringBuilder a10 = d.a("Expected BEGIN_ARRAY but was ");
        a10.append(a1.b.c(h0()));
        a10.append(F());
        throw new IllegalStateException(a10.toString());
    }

    public void b() {
        int i10 = this.f31254h;
        if (i10 == 0) {
            i10 = j();
        }
        if (i10 == 1) {
            i0(3);
            this.f31254h = 0;
            return;
        }
        StringBuilder a10 = d.a("Expected BEGIN_OBJECT but was ");
        a10.append(a1.b.c(h0()));
        a10.append(F());
        throw new IllegalStateException(a10.toString());
    }

    public String b0() {
        String str;
        char c10;
        int i10 = this.f31254h;
        if (i10 == 0) {
            i10 = j();
        }
        if (i10 == 10) {
            str = e0();
        } else {
            if (i10 == 8) {
                c10 = '\'';
            } else if (i10 == 9) {
                c10 = '\"';
            } else if (i10 == 11) {
                str = this.f31257k;
                this.f31257k = null;
            } else if (i10 == 15) {
                str = Long.toString(this.f31255i);
            } else if (i10 == 16) {
                str = new String(this.f31249c, this.f31250d, this.f31256j);
                this.f31250d += this.f31256j;
            } else {
                StringBuilder a10 = d.a("Expected a string but was ");
                a10.append(a1.b.c(h0()));
                a10.append(F());
                throw new IllegalStateException(a10.toString());
            }
            str = Z(c10);
        }
        this.f31254h = 0;
        int[] iArr = this.f31261o;
        int i11 = this.f31259m - 1;
        iArr[i11] = iArr[i11] + 1;
        return str;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f31254h = 0;
        this.f31258l[0] = 8;
        this.f31259m = 1;
        this.f31247a.close();
    }

    /* JADX WARN: Code restructure failed: missing block: B:107:0x004a, code lost:
        h();
     */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x008a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String e0() {
        /*
            r6 = this;
            r0 = 0
            r1 = 0
        L2:
            r2 = 0
        L3:
            int r3 = r6.f31250d
            int r4 = r3 + r2
            int r5 = r6.f31251e
            if (r4 >= r5) goto L4e
            char[] r4 = r6.f31249c
            int r3 = r3 + r2
            char r3 = r4[r3]
            r4 = 9
            if (r3 == r4) goto L5c
            r4 = 10
            if (r3 == r4) goto L5c
            r4 = 12
            if (r3 == r4) goto L5c
            r4 = 13
            if (r3 == r4) goto L5c
            r4 = 32
            if (r3 == r4) goto L5c
            r4 = 35
            if (r3 == r4) goto L4a
            r4 = 44
            if (r3 == r4) goto L5c
            r4 = 47
            if (r3 == r4) goto L4a
            r4 = 61
            if (r3 == r4) goto L4a
            r4 = 123(0x7b, float:1.72E-43)
            if (r3 == r4) goto L5c
            r4 = 125(0x7d, float:1.75E-43)
            if (r3 == r4) goto L5c
            r4 = 58
            if (r3 == r4) goto L5c
            r4 = 59
            if (r3 == r4) goto L4a
            switch(r3) {
                case 91: goto L5c;
                case 92: goto L4a;
                case 93: goto L5c;
                default: goto L47;
            }
        L47:
            int r2 = r2 + 1
            goto L3
        L4a:
            r6.h()
            goto L5c
        L4e:
            char[] r3 = r6.f31249c
            int r3 = r3.length
            if (r2 >= r3) goto L5e
            int r3 = r2 + 1
            boolean r3 = r6.s(r3)
            if (r3 == 0) goto L5c
            goto L3
        L5c:
            r0 = r2
            goto L7e
        L5e:
            if (r1 != 0) goto L6b
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r3 = 16
            int r3 = java.lang.Math.max(r2, r3)
            r1.<init>(r3)
        L6b:
            char[] r3 = r6.f31249c
            int r4 = r6.f31250d
            r1.append(r3, r4, r2)
            int r3 = r6.f31250d
            int r3 = r3 + r2
            r6.f31250d = r3
            r2 = 1
            boolean r2 = r6.s(r2)
            if (r2 != 0) goto L2
        L7e:
            if (r1 != 0) goto L8a
            java.lang.String r1 = new java.lang.String
            char[] r2 = r6.f31249c
            int r3 = r6.f31250d
            r1.<init>(r2, r3, r0)
            goto L95
        L8a:
            char[] r2 = r6.f31249c
            int r3 = r6.f31250d
            r1.append(r2, r3, r0)
            java.lang.String r1 = r1.toString()
        L95:
            int r2 = r6.f31250d
            int r2 = r2 + r0
            r6.f31250d = r2
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: ya.a.e0():java.lang.String");
    }

    public final void h() {
        if (this.f31248b) {
            return;
        }
        u0("Use JsonReader.setLenient(true) to accept malformed JSON");
        throw null;
    }

    public int h0() {
        int i10 = this.f31254h;
        if (i10 == 0) {
            i10 = j();
        }
        switch (i10) {
            case 1:
                return 3;
            case 2:
                return 4;
            case 3:
                return 1;
            case 4:
                return 2;
            case 5:
            case 6:
                return 8;
            case 7:
                return 9;
            case 8:
            case 9:
            case 10:
            case 11:
                return 6;
            case 12:
            case 13:
            case 14:
                return 5;
            case 15:
            case 16:
                return 7;
            case 17:
                return 10;
            default:
                throw new AssertionError();
        }
    }

    public final void i0(int i10) {
        int i11 = this.f31259m;
        int[] iArr = this.f31258l;
        if (i11 == iArr.length) {
            int i12 = i11 * 2;
            this.f31258l = Arrays.copyOf(iArr, i12);
            this.f31261o = Arrays.copyOf(this.f31261o, i12);
            this.f31260n = (String[]) Arrays.copyOf(this.f31260n, i12);
        }
        int[] iArr2 = this.f31258l;
        int i13 = this.f31259m;
        this.f31259m = i13 + 1;
        iArr2[i13] = i10;
    }

    /* JADX WARN: Code restructure failed: missing block: B:450:0x0212, code lost:
        if (E(r1) != false) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:451:0x0214, code lost:
        r1 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:452:0x0215, code lost:
        if (r11 != 2) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:453:0x0217, code lost:
        if (r13 == false) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:455:0x021d, code lost:
        if (r6 != Long.MIN_VALUE) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:456:0x021f, code lost:
        if (r12 == false) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:458:0x0223, code lost:
        if (r6 != 0) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:459:0x0225, code lost:
        if (r12 != false) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:460:0x0227, code lost:
        if (r12 == false) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:462:0x022a, code lost:
        r6 = -r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:463:0x022b, code lost:
        r18.f31255i = r6;
        r18.f31250d += r5;
        r10 = 15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:464:0x0237, code lost:
        r1 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:465:0x0238, code lost:
        if (r11 == r1) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:467:0x023b, code lost:
        if (r11 == 4) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:469:0x023e, code lost:
        if (r11 != 7) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:470:0x0240, code lost:
        r18.f31256j = r5;
        r10 = 16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:471:0x0246, code lost:
        r18.f31254h = r10;
     */
    /* JADX WARN: Removed duplicated region for block: B:351:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:398:0x0181 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:399:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:492:0x0275 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:493:0x0276  */
    /* JADX WARN: Removed duplicated region for block: B:512:0x02b8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int j() {
        /*
            Method dump skipped, instructions count: 798
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ya.a.j():int");
    }

    public void k() {
        int i10 = this.f31254h;
        if (i10 == 0) {
            i10 = j();
        }
        if (i10 == 4) {
            int i11 = this.f31259m - 1;
            this.f31259m = i11;
            int[] iArr = this.f31261o;
            int i12 = i11 - 1;
            iArr[i12] = iArr[i12] + 1;
            this.f31254h = 0;
            return;
        }
        StringBuilder a10 = d.a("Expected END_ARRAY but was ");
        a10.append(a1.b.c(h0()));
        a10.append(F());
        throw new IllegalStateException(a10.toString());
    }

    public final char l0() {
        int i10;
        int i11;
        if (this.f31250d == this.f31251e && !s(1)) {
            u0("Unterminated escape sequence");
            throw null;
        }
        char[] cArr = this.f31249c;
        int i12 = this.f31250d;
        int i13 = i12 + 1;
        this.f31250d = i13;
        char c10 = cArr[i12];
        if (c10 != '\n') {
            if (c10 != '\"' && c10 != '\'' && c10 != '/' && c10 != '\\') {
                if (c10 != 'b') {
                    if (c10 != 'f') {
                        if (c10 == 'n') {
                            return '\n';
                        }
                        if (c10 != 'r') {
                            if (c10 != 't') {
                                if (c10 == 'u') {
                                    if (i13 + 4 > this.f31251e && !s(4)) {
                                        u0("Unterminated escape sequence");
                                        throw null;
                                    }
                                    char c11 = 0;
                                    int i14 = this.f31250d;
                                    int i15 = i14 + 4;
                                    while (i14 < i15) {
                                        char c12 = this.f31249c[i14];
                                        char c13 = (char) (c11 << 4);
                                        if (c12 >= '0' && c12 <= '9') {
                                            i11 = c12 - '0';
                                        } else {
                                            if (c12 >= 'a' && c12 <= 'f') {
                                                i10 = c12 - 'a';
                                            } else if (c12 >= 'A' && c12 <= 'F') {
                                                i10 = c12 - 'A';
                                            } else {
                                                StringBuilder a10 = d.a("\\u");
                                                a10.append(new String(this.f31249c, this.f31250d, 4));
                                                throw new NumberFormatException(a10.toString());
                                            }
                                            i11 = i10 + 10;
                                        }
                                        c11 = (char) (i11 + c13);
                                        i14++;
                                    }
                                    this.f31250d += 4;
                                    return c11;
                                }
                                u0("Invalid escape sequence");
                                throw null;
                            }
                            return '\t';
                        }
                        return '\r';
                    }
                    return '\f';
                }
                return '\b';
            }
        } else {
            this.f31252f++;
            this.f31253g = i13;
        }
        return c10;
    }

    public final void n0(char c10) {
        char[] cArr = this.f31249c;
        while (true) {
            int i10 = this.f31250d;
            int i11 = this.f31251e;
            while (true) {
                if (i10 < i11) {
                    int i12 = i10 + 1;
                    char c11 = cArr[i10];
                    if (c11 == c10) {
                        this.f31250d = i12;
                        return;
                    } else if (c11 == '\\') {
                        this.f31250d = i12;
                        l0();
                        break;
                    } else {
                        if (c11 == '\n') {
                            this.f31252f++;
                            this.f31253g = i12;
                        }
                        i10 = i12;
                    }
                } else {
                    this.f31250d = i10;
                    if (!s(1)) {
                        u0("Unterminated string");
                        throw null;
                    }
                }
            }
        }
    }

    public final void p0() {
        char c10;
        do {
            if (this.f31250d >= this.f31251e && !s(1)) {
                return;
            }
            char[] cArr = this.f31249c;
            int i10 = this.f31250d;
            int i11 = i10 + 1;
            this.f31250d = i11;
            c10 = cArr[i10];
            if (c10 == '\n') {
                this.f31252f++;
                this.f31253g = i11;
                return;
            }
        } while (c10 != '\r');
    }

    public void q() {
        int i10 = this.f31254h;
        if (i10 == 0) {
            i10 = j();
        }
        if (i10 == 2) {
            int i11 = this.f31259m - 1;
            this.f31259m = i11;
            this.f31260n[i11] = null;
            int[] iArr = this.f31261o;
            int i12 = i11 - 1;
            iArr[i12] = iArr[i12] + 1;
            this.f31254h = 0;
            return;
        }
        StringBuilder a10 = d.a("Expected END_OBJECT but was ");
        a10.append(a1.b.c(h0()));
        a10.append(F());
        throw new IllegalStateException(a10.toString());
    }

    /* JADX WARN: Code restructure failed: missing block: B:89:0x0048, code lost:
        h();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void q0() {
        /*
            r4 = this;
        L0:
            r0 = 0
        L1:
            int r1 = r4.f31250d
            int r2 = r1 + r0
            int r3 = r4.f31251e
            if (r2 >= r3) goto L51
            char[] r2 = r4.f31249c
            int r1 = r1 + r0
            char r1 = r2[r1]
            r2 = 9
            if (r1 == r2) goto L4b
            r2 = 10
            if (r1 == r2) goto L4b
            r2 = 12
            if (r1 == r2) goto L4b
            r2 = 13
            if (r1 == r2) goto L4b
            r2 = 32
            if (r1 == r2) goto L4b
            r2 = 35
            if (r1 == r2) goto L48
            r2 = 44
            if (r1 == r2) goto L4b
            r2 = 47
            if (r1 == r2) goto L48
            r2 = 61
            if (r1 == r2) goto L48
            r2 = 123(0x7b, float:1.72E-43)
            if (r1 == r2) goto L4b
            r2 = 125(0x7d, float:1.75E-43)
            if (r1 == r2) goto L4b
            r2 = 58
            if (r1 == r2) goto L4b
            r2 = 59
            if (r1 == r2) goto L48
            switch(r1) {
                case 91: goto L4b;
                case 92: goto L48;
                case 93: goto L4b;
                default: goto L45;
            }
        L45:
            int r0 = r0 + 1
            goto L1
        L48:
            r4.h()
        L4b:
            int r1 = r4.f31250d
            int r1 = r1 + r0
            r4.f31250d = r1
            return
        L51:
            int r1 = r1 + r0
            r4.f31250d = r1
            r0 = 1
            boolean r0 = r4.s(r0)
            if (r0 != 0) goto L0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ya.a.q0():void");
    }

    public final boolean s(int i10) {
        int i11;
        int i12;
        char[] cArr = this.f31249c;
        int i13 = this.f31253g;
        int i14 = this.f31250d;
        this.f31253g = i13 - i14;
        int i15 = this.f31251e;
        if (i15 != i14) {
            int i16 = i15 - i14;
            this.f31251e = i16;
            System.arraycopy(cArr, i14, cArr, 0, i16);
        } else {
            this.f31251e = 0;
        }
        this.f31250d = 0;
        do {
            Reader reader = this.f31247a;
            int i17 = this.f31251e;
            int read = reader.read(cArr, i17, cArr.length - i17);
            if (read == -1) {
                return false;
            }
            i11 = this.f31251e + read;
            this.f31251e = i11;
            if (this.f31252f == 0 && (i12 = this.f31253g) == 0 && i11 > 0 && cArr[0] == 65279) {
                this.f31250d++;
                this.f31253g = i12 + 1;
                i10++;
                continue;
            }
        } while (i11 < i10);
        return true;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public void t0() {
        int i10 = 0;
        do {
            int i11 = this.f31254h;
            if (i11 == 0) {
                i11 = j();
            }
            switch (i11) {
                case 1:
                    i0(3);
                    i10++;
                    break;
                case 2:
                    if (i10 == 0) {
                        this.f31260n[this.f31259m - 1] = null;
                    }
                    this.f31259m--;
                    i10--;
                    break;
                case 3:
                    i0(1);
                    i10++;
                    break;
                case 4:
                    this.f31259m--;
                    i10--;
                    break;
                case 8:
                    n0('\'');
                    break;
                case 9:
                    n0('\"');
                    break;
                case 10:
                    q0();
                    break;
                case 12:
                    n0('\'');
                    if (i10 == 0) {
                        this.f31260n[this.f31259m - 1] = "<skipped>";
                        break;
                    }
                    break;
                case 13:
                    n0('\"');
                    if (i10 == 0) {
                        this.f31260n[this.f31259m - 1] = "<skipped>";
                        break;
                    }
                    break;
                case 14:
                    q0();
                    if (i10 == 0) {
                        this.f31260n[this.f31259m - 1] = "<skipped>";
                        break;
                    }
                    break;
                case 16:
                    this.f31250d += this.f31256j;
                    break;
                case 17:
                    return;
            }
            this.f31254h = 0;
        } while (i10 > 0);
        int[] iArr = this.f31261o;
        int i12 = this.f31259m - 1;
        iArr[i12] = iArr[i12] + 1;
    }

    public String toString() {
        return getClass().getSimpleName() + F();
    }

    public final void u0(String str) {
        StringBuilder a10 = d.a(str);
        a10.append(F());
        throw new c(a10.toString());
    }

    public String v() {
        return y(false);
    }

    public final String y(boolean z10) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append('$');
        int i10 = 0;
        while (true) {
            int i11 = this.f31259m;
            if (i10 >= i11) {
                return sb2.toString();
            }
            int i12 = this.f31258l[i10];
            if (i12 == 1 || i12 == 2) {
                int i13 = this.f31261o[i10];
                if (z10 && i13 > 0 && i10 == i11 - 1) {
                    i13--;
                }
                sb2.append('[');
                sb2.append(i13);
                sb2.append(']');
            } else if (i12 == 3 || i12 == 4 || i12 == 5) {
                sb2.append('.');
                String str = this.f31260n[i10];
                if (str != null) {
                    sb2.append(str);
                }
            }
            i10++;
        }
    }
}
