package mf;

import java.io.IOException;

/* loaded from: classes.dex */
public final class c0 extends e0 {

    /* renamed from: l */
    public static final String[] f20517l = new String[128];

    /* renamed from: i */
    public final ln.f f20518i;

    /* renamed from: j */
    public String f20519j = ":";

    /* renamed from: k */
    public String f20520k;

    static {
        for (int i10 = 0; i10 <= 31; i10++) {
            f20517l[i10] = String.format("\\u%04x", Integer.valueOf(i10));
        }
        String[] strArr = f20517l;
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
    }

    public c0(ln.e eVar) {
        this.f20518i = eVar;
        C(6);
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void W(ln.f r7, java.lang.String r8) {
        /*
            java.lang.String[] r0 = mf.c0.f20517l
            r1 = 34
            r7.writeByte(r1)
            int r2 = r8.length()
            r3 = 0
            r4 = 0
        Ld:
            if (r3 >= r2) goto L36
            char r5 = r8.charAt(r3)
            r6 = 128(0x80, float:1.8E-43)
            if (r5 >= r6) goto L1c
            r5 = r0[r5]
            if (r5 != 0) goto L29
            goto L33
        L1c:
            r6 = 8232(0x2028, float:1.1535E-41)
            if (r5 != r6) goto L23
            java.lang.String r5 = "\\u2028"
            goto L29
        L23:
            r6 = 8233(0x2029, float:1.1537E-41)
            if (r5 != r6) goto L33
            java.lang.String r5 = "\\u2029"
        L29:
            if (r4 >= r3) goto L2e
            r7.g0(r4, r3, r8)
        L2e:
            r7.S(r5)
            int r4 = r3 + 1
        L33:
            int r3 = r3 + 1
            goto Ld
        L36:
            if (r4 >= r2) goto L3b
            r7.g0(r4, r2, r8)
        L3b:
            r7.writeByte(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: mf.c0.W(ln.f, java.lang.String):void");
    }

    @Override // mf.e0
    public final e0 D(double d10) {
        if (!this.f20532e && (Double.isNaN(d10) || Double.isInfinite(d10))) {
            throw new IllegalArgumentException("Numeric values must be finite, but was " + d10);
        } else if (this.f20534g) {
            this.f20534g = false;
            s(Double.toString(d10));
            return this;
        } else {
            X();
            L();
            this.f20518i.S(Double.toString(d10));
            int[] iArr = this.f20531d;
            int i10 = this.f20528a - 1;
            iArr[i10] = iArr[i10] + 1;
            return this;
        }
    }

    @Override // mf.e0
    public final e0 E(long j10) {
        if (this.f20534g) {
            this.f20534g = false;
            s(Long.toString(j10));
            return this;
        }
        X();
        L();
        this.f20518i.S(Long.toString(j10));
        int[] iArr = this.f20531d;
        int i10 = this.f20528a - 1;
        iArr[i10] = iArr[i10] + 1;
        return this;
    }

    @Override // mf.e0
    public final e0 F(Number number) {
        if (number == null) {
            v();
            return this;
        }
        String obj = number.toString();
        if (!this.f20532e && (obj.equals("-Infinity") || obj.equals("Infinity") || obj.equals("NaN"))) {
            throw new IllegalArgumentException("Numeric values must be finite, but was " + number);
        } else if (this.f20534g) {
            this.f20534g = false;
            s(obj);
            return this;
        } else {
            X();
            L();
            this.f20518i.S(obj);
            int[] iArr = this.f20531d;
            int i10 = this.f20528a - 1;
            iArr[i10] = iArr[i10] + 1;
            return this;
        }
    }

    @Override // mf.e0
    public final e0 I(String str) {
        if (str == null) {
            v();
            return this;
        } else if (this.f20534g) {
            this.f20534g = false;
            s(str);
            return this;
        } else {
            X();
            L();
            W(this.f20518i, str);
            int[] iArr = this.f20531d;
            int i10 = this.f20528a - 1;
            iArr[i10] = iArr[i10] + 1;
            return this;
        }
    }

    @Override // mf.e0
    public final e0 J(boolean z10) {
        String str;
        if (!this.f20534g) {
            X();
            L();
            ln.f fVar = this.f20518i;
            if (z10) {
                str = "true";
            } else {
                str = "false";
            }
            fVar.S(str);
            int[] iArr = this.f20531d;
            int i10 = this.f20528a - 1;
            iArr[i10] = iArr[i10] + 1;
            return this;
        }
        StringBuilder a10 = android.support.v4.media.d.a("Boolean cannot be used as a map key in JSON at path ");
        a10.append(q());
        throw new IllegalStateException(a10.toString());
    }

    public final void L() {
        int y10 = y();
        int i10 = 2;
        if (y10 != 1) {
            if (y10 == 2) {
                this.f20518i.writeByte(44);
            } else if (y10 == 4) {
                i10 = 5;
                this.f20518i.S(this.f20519j);
            } else if (y10 == 9) {
                throw new IllegalStateException("Sink from valueSink() was not closed");
            } else {
                if (y10 != 6) {
                    if (y10 != 7) {
                        throw new IllegalStateException("Nesting problem.");
                    }
                    if (!this.f20532e) {
                        throw new IllegalStateException("JSON must have only one top-level value.");
                    }
                }
                i10 = 7;
            }
        }
        this.f20529b[this.f20528a - 1] = i10;
    }

    public final void P(int i10, int i11, char c10) {
        int y10 = y();
        if (y10 != i11 && y10 != i10) {
            throw new IllegalStateException("Nesting problem.");
        }
        if (this.f20520k == null) {
            int i12 = this.f20528a;
            int i13 = ~this.f20535h;
            if (i12 == i13) {
                this.f20535h = i13;
                return;
            }
            int i14 = i12 - 1;
            this.f20528a = i14;
            this.f20530c[i14] = null;
            int[] iArr = this.f20531d;
            int i15 = i14 - 1;
            iArr[i15] = iArr[i15] + 1;
            this.f20518i.writeByte(c10);
            return;
        }
        StringBuilder a10 = android.support.v4.media.d.a("Dangling name: ");
        a10.append(this.f20520k);
        throw new IllegalStateException(a10.toString());
    }

    public final void R(int i10, int i11, char c10) {
        int i12;
        int i13 = this.f20528a;
        int i14 = this.f20535h;
        if (i13 == i14 && ((i12 = this.f20529b[i13 - 1]) == i10 || i12 == i11)) {
            this.f20535h = ~i14;
            return;
        }
        L();
        h();
        C(i10);
        this.f20531d[this.f20528a - 1] = 0;
        this.f20518i.writeByte(c10);
    }

    public final void X() {
        if (this.f20520k != null) {
            int y10 = y();
            if (y10 == 5) {
                this.f20518i.writeByte(44);
            } else if (y10 != 3) {
                throw new IllegalStateException("Nesting problem.");
            }
            this.f20529b[this.f20528a - 1] = 4;
            W(this.f20518i, this.f20520k);
            this.f20520k = null;
        }
    }

    @Override // mf.e0
    public final e0 a() {
        if (!this.f20534g) {
            X();
            R(1, 2, '[');
            return this;
        }
        StringBuilder a10 = android.support.v4.media.d.a("Array cannot be used as a map key in JSON at path ");
        a10.append(q());
        throw new IllegalStateException(a10.toString());
    }

    @Override // mf.e0
    public final e0 b() {
        if (!this.f20534g) {
            X();
            R(3, 5, '{');
            return this;
        }
        StringBuilder a10 = android.support.v4.media.d.a("Object cannot be used as a map key in JSON at path ");
        a10.append(q());
        throw new IllegalStateException(a10.toString());
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f20518i.close();
        int i10 = this.f20528a;
        if (i10 > 1 || (i10 == 1 && this.f20529b[i10 - 1] != 7)) {
            throw new IOException("Incomplete document");
        }
        this.f20528a = 0;
    }

    @Override // java.io.Flushable
    public final void flush() {
        if (this.f20528a == 0) {
            throw new IllegalStateException("JsonWriter is closed.");
        }
        this.f20518i.flush();
    }

    @Override // mf.e0
    public final e0 j() {
        P(1, 2, ']');
        return this;
    }

    @Override // mf.e0
    public final e0 k() {
        this.f20534g = false;
        P(3, 5, '}');
        return this;
    }

    @Override // mf.e0
    public final e0 s(String str) {
        if (str != null) {
            if (this.f20528a != 0) {
                int y10 = y();
                if ((y10 == 3 || y10 == 5) && this.f20520k == null && !this.f20534g) {
                    this.f20520k = str;
                    this.f20530c[this.f20528a - 1] = str;
                    return this;
                }
                throw new IllegalStateException("Nesting problem.");
            }
            throw new IllegalStateException("JsonWriter is closed.");
        }
        throw new NullPointerException("name == null");
    }

    @Override // mf.e0
    public final e0 v() {
        if (!this.f20534g) {
            if (this.f20520k != null) {
                if (this.f20533f) {
                    X();
                } else {
                    this.f20520k = null;
                    return this;
                }
            }
            L();
            this.f20518i.S("null");
            int[] iArr = this.f20531d;
            int i10 = this.f20528a - 1;
            iArr[i10] = iArr[i10] + 1;
            return this;
        }
        StringBuilder a10 = android.support.v4.media.d.a("null cannot be used as a map key in JSON at path ");
        a10.append(q());
        throw new IllegalStateException(a10.toString());
    }
}
