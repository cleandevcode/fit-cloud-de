package ya;

import android.support.v4.media.d;
import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;
import java.io.Writer;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public class b implements Closeable, Flushable {

    /* renamed from: i */
    public static final Pattern f31262i = Pattern.compile("-?(?:0|[1-9][0-9]*)(?:\\.[0-9]+)?(?:[eE][-+]?[0-9]+)?");

    /* renamed from: j */
    public static final String[] f31263j = new String[128];

    /* renamed from: k */
    public static final String[] f31264k;

    /* renamed from: a */
    public final Writer f31265a;

    /* renamed from: b */
    public int[] f31266b;

    /* renamed from: c */
    public int f31267c;

    /* renamed from: d */
    public String f31268d;

    /* renamed from: e */
    public boolean f31269e;

    /* renamed from: f */
    public boolean f31270f;

    /* renamed from: g */
    public String f31271g;

    /* renamed from: h */
    public boolean f31272h;

    static {
        for (int i10 = 0; i10 <= 31; i10++) {
            f31263j[i10] = String.format("\\u%04x", Integer.valueOf(i10));
        }
        String[] strArr = f31263j;
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
        String[] strArr2 = (String[]) strArr.clone();
        f31264k = strArr2;
        strArr2[60] = "\\u003c";
        strArr2[62] = "\\u003e";
        strArr2[38] = "\\u0026";
        strArr2[61] = "\\u003d";
        strArr2[39] = "\\u0027";
    }

    public b(Writer writer) {
        int[] iArr = new int[32];
        this.f31266b = iArr;
        this.f31267c = 0;
        if (iArr.length == 0) {
            this.f31266b = Arrays.copyOf(iArr, 0 * 2);
        }
        int[] iArr2 = this.f31266b;
        int i10 = this.f31267c;
        this.f31267c = i10 + 1;
        iArr2[i10] = 6;
        this.f31268d = ":";
        this.f31272h = true;
        Objects.requireNonNull(writer, "out == null");
        this.f31265a = writer;
    }

    public final int C() {
        int i10 = this.f31267c;
        if (i10 != 0) {
            return this.f31266b[i10 - 1];
        }
        throw new IllegalStateException("JsonWriter is closed.");
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x0034  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void D(java.lang.String r9) {
        /*
            r8 = this;
            boolean r0 = r8.f31270f
            if (r0 == 0) goto L7
            java.lang.String[] r0 = ya.b.f31264k
            goto L9
        L7:
            java.lang.String[] r0 = ya.b.f31263j
        L9:
            java.io.Writer r1 = r8.f31265a
            r2 = 34
            r1.write(r2)
            int r1 = r9.length()
            r3 = 0
            r4 = 0
        L16:
            if (r3 >= r1) goto L45
            char r5 = r9.charAt(r3)
            r6 = 128(0x80, float:1.8E-43)
            if (r5 >= r6) goto L25
            r5 = r0[r5]
            if (r5 != 0) goto L32
            goto L42
        L25:
            r6 = 8232(0x2028, float:1.1535E-41)
            if (r5 != r6) goto L2c
            java.lang.String r5 = "\\u2028"
            goto L32
        L2c:
            r6 = 8233(0x2029, float:1.1537E-41)
            if (r5 != r6) goto L42
            java.lang.String r5 = "\\u2029"
        L32:
            if (r4 >= r3) goto L3b
            java.io.Writer r6 = r8.f31265a
            int r7 = r3 - r4
            r6.write(r9, r4, r7)
        L3b:
            java.io.Writer r4 = r8.f31265a
            r4.write(r5)
            int r4 = r3 + 1
        L42:
            int r3 = r3 + 1
            goto L16
        L45:
            if (r4 >= r1) goto L4d
            java.io.Writer r0 = r8.f31265a
            int r1 = r1 - r4
            r0.write(r9, r4, r1)
        L4d:
            java.io.Writer r9 = r8.f31265a
            r9.write(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ya.b.D(java.lang.String):void");
    }

    public void E(double d10) {
        R();
        if (this.f31269e || !(Double.isNaN(d10) || Double.isInfinite(d10))) {
            a();
            this.f31265a.append((CharSequence) Double.toString(d10));
            return;
        }
        throw new IllegalArgumentException("Numeric values must be finite, but was " + d10);
    }

    public void F(long j10) {
        R();
        a();
        this.f31265a.write(Long.toString(j10));
    }

    public void I(Boolean bool) {
        if (bool == null) {
            y();
            return;
        }
        R();
        a();
        this.f31265a.write(bool.booleanValue() ? "true" : "false");
    }

    public void J(Number number) {
        boolean z10;
        if (number == null) {
            y();
            return;
        }
        R();
        String obj = number.toString();
        if (!obj.equals("-Infinity") && !obj.equals("Infinity") && !obj.equals("NaN")) {
            Class<?> cls = number.getClass();
            if (cls != Integer.class && cls != Long.class && cls != Double.class && cls != Float.class && cls != Byte.class && cls != Short.class && cls != BigDecimal.class && cls != BigInteger.class && cls != AtomicInteger.class && cls != AtomicLong.class) {
                z10 = false;
            } else {
                z10 = true;
            }
            if (!z10 && !f31262i.matcher(obj).matches()) {
                throw new IllegalArgumentException("String created by " + cls + " is not a valid JSON number: " + obj);
            }
        } else if (!this.f31269e) {
            throw new IllegalArgumentException(a.b.b("Numeric values must be finite, but was ", obj));
        }
        a();
        this.f31265a.append((CharSequence) obj);
    }

    public void L(String str) {
        if (str == null) {
            y();
            return;
        }
        R();
        a();
        D(str);
    }

    public void P(boolean z10) {
        R();
        a();
        this.f31265a.write(z10 ? "true" : "false");
    }

    public final void R() {
        if (this.f31271g != null) {
            int C = C();
            if (C == 5) {
                this.f31265a.write(44);
            } else if (C != 3) {
                throw new IllegalStateException("Nesting problem.");
            }
            v();
            this.f31266b[this.f31267c - 1] = 4;
            D(this.f31271g);
            this.f31271g = null;
        }
    }

    public final void a() {
        int C = C();
        if (C != 1) {
            if (C != 2) {
                if (C != 4) {
                    if (C != 6) {
                        if (C == 7) {
                            if (!this.f31269e) {
                                throw new IllegalStateException("JSON must have only one top-level value.");
                            }
                        } else {
                            throw new IllegalStateException("Nesting problem.");
                        }
                    }
                    this.f31266b[this.f31267c - 1] = 7;
                    return;
                }
                this.f31265a.append((CharSequence) this.f31268d);
                this.f31266b[this.f31267c - 1] = 5;
                return;
            }
            this.f31265a.append(',');
        } else {
            this.f31266b[this.f31267c - 1] = 2;
        }
        v();
    }

    public void b() {
        R();
        a();
        int i10 = this.f31267c;
        int[] iArr = this.f31266b;
        if (i10 == iArr.length) {
            this.f31266b = Arrays.copyOf(iArr, i10 * 2);
        }
        int[] iArr2 = this.f31266b;
        int i11 = this.f31267c;
        this.f31267c = i11 + 1;
        iArr2[i11] = 1;
        this.f31265a.write(91);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f31265a.close();
        int i10 = this.f31267c;
        if (i10 > 1 || (i10 == 1 && this.f31266b[i10 - 1] != 7)) {
            throw new IOException("Incomplete document");
        }
        this.f31267c = 0;
    }

    public void flush() {
        if (this.f31267c == 0) {
            throw new IllegalStateException("JsonWriter is closed.");
        }
        this.f31265a.flush();
    }

    public void h() {
        R();
        a();
        int i10 = this.f31267c;
        int[] iArr = this.f31266b;
        if (i10 == iArr.length) {
            this.f31266b = Arrays.copyOf(iArr, i10 * 2);
        }
        int[] iArr2 = this.f31266b;
        int i11 = this.f31267c;
        this.f31267c = i11 + 1;
        iArr2[i11] = 3;
        this.f31265a.write(123);
    }

    public final void j(int i10, int i11, char c10) {
        int C = C();
        if (C != i11 && C != i10) {
            throw new IllegalStateException("Nesting problem.");
        }
        if (this.f31271g == null) {
            this.f31267c--;
            if (C == i11) {
                v();
            }
            this.f31265a.write(c10);
            return;
        }
        StringBuilder a10 = d.a("Dangling name: ");
        a10.append(this.f31271g);
        throw new IllegalStateException(a10.toString());
    }

    public void k() {
        j(1, 2, ']');
    }

    public void q() {
        j(3, 5, '}');
    }

    public void s(String str) {
        Objects.requireNonNull(str, "name == null");
        if (this.f31271g != null) {
            throw new IllegalStateException();
        }
        if (this.f31267c == 0) {
            throw new IllegalStateException("JsonWriter is closed.");
        }
        this.f31271g = str;
    }

    public final void v() {
    }

    public b y() {
        if (this.f31271g != null) {
            if (!this.f31272h) {
                this.f31271g = null;
                return this;
            }
            R();
        }
        a();
        this.f31265a.write("null");
        return this;
    }
}
