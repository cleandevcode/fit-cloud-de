package ta;

import java.io.Reader;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;
import s.c0;
import sa.o;

/* loaded from: classes.dex */
public final class f extends ya.a {

    /* renamed from: t */
    public static final Object f27858t;

    /* renamed from: p */
    public Object[] f27859p;

    /* renamed from: q */
    public int f27860q;

    /* renamed from: r */
    public String[] f27861r;

    /* renamed from: s */
    public int[] f27862s;

    /* loaded from: classes.dex */
    public class a extends Reader {
        @Override // java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            throw new AssertionError();
        }

        @Override // java.io.Reader
        public final int read(char[] cArr, int i10, int i11) {
            throw new AssertionError();
        }
    }

    static {
        new a();
        f27858t = new Object();
    }

    private String F() {
        StringBuilder a10 = android.support.v4.media.d.a(" at path ");
        a10.append(y(false));
        return a10.toString();
    }

    private String y(boolean z10) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append('$');
        int i10 = 0;
        while (true) {
            int i11 = this.f27860q;
            if (i10 >= i11) {
                return sb2.toString();
            }
            Object[] objArr = this.f27859p;
            Object obj = objArr[i10];
            if (obj instanceof qa.j) {
                i10++;
                if (i10 < i11 && (objArr[i10] instanceof Iterator)) {
                    int i12 = this.f27862s[i10];
                    if (z10 && i12 > 0 && (i10 == i11 - 1 || i10 == i11 - 2)) {
                        i12--;
                    }
                    sb2.append('[');
                    sb2.append(i12);
                    sb2.append(']');
                }
            } else if ((obj instanceof qa.o) && (i10 = i10 + 1) < i11 && (objArr[i10] instanceof Iterator)) {
                sb2.append('.');
                String str = this.f27861r[i10];
                if (str != null) {
                    sb2.append(str);
                }
            }
            i10++;
        }
    }

    public final void A0(Object obj) {
        int i10 = this.f27860q;
        Object[] objArr = this.f27859p;
        if (i10 == objArr.length) {
            int i11 = i10 * 2;
            this.f27859p = Arrays.copyOf(objArr, i11);
            this.f27862s = Arrays.copyOf(this.f27862s, i11);
            this.f27861r = (String[]) Arrays.copyOf(this.f27861r, i11);
        }
        Object[] objArr2 = this.f27859p;
        int i12 = this.f27860q;
        this.f27860q = i12 + 1;
        objArr2[i12] = obj;
    }

    @Override // ya.a
    public final String C() {
        return y(true);
    }

    @Override // ya.a
    public final boolean D() {
        int h02 = h0();
        return (h02 == 4 || h02 == 2 || h02 == 10) ? false : true;
    }

    @Override // ya.a
    public final boolean I() {
        w0(8);
        boolean e10 = ((qa.q) z0()).e();
        int i10 = this.f27860q;
        if (i10 > 0) {
            int[] iArr = this.f27862s;
            int i11 = i10 - 1;
            iArr[i11] = iArr[i11] + 1;
        }
        return e10;
    }

    @Override // ya.a
    public final double J() {
        double parseDouble;
        int h02 = h0();
        if (h02 != 7 && h02 != 6) {
            StringBuilder a10 = android.support.v4.media.d.a("Expected ");
            a10.append(a1.b.c(7));
            a10.append(" but was ");
            a10.append(a1.b.c(h02));
            a10.append(F());
            throw new IllegalStateException(a10.toString());
        }
        qa.q qVar = (qa.q) y0();
        if (qVar.f24665a instanceof Number) {
            parseDouble = qVar.f().doubleValue();
        } else {
            parseDouble = Double.parseDouble(qVar.i());
        }
        if (!this.f31248b && (Double.isNaN(parseDouble) || Double.isInfinite(parseDouble))) {
            throw new ya.c("JSON forbids NaN and infinities: " + parseDouble);
        }
        z0();
        int i10 = this.f27860q;
        if (i10 > 0) {
            int[] iArr = this.f27862s;
            int i11 = i10 - 1;
            iArr[i11] = iArr[i11] + 1;
        }
        return parseDouble;
    }

    @Override // ya.a
    public final int L() {
        int parseInt;
        int h02 = h0();
        if (h02 != 7 && h02 != 6) {
            StringBuilder a10 = android.support.v4.media.d.a("Expected ");
            a10.append(a1.b.c(7));
            a10.append(" but was ");
            a10.append(a1.b.c(h02));
            a10.append(F());
            throw new IllegalStateException(a10.toString());
        }
        qa.q qVar = (qa.q) y0();
        if (qVar.f24665a instanceof Number) {
            parseInt = qVar.f().intValue();
        } else {
            parseInt = Integer.parseInt(qVar.i());
        }
        z0();
        int i10 = this.f27860q;
        if (i10 > 0) {
            int[] iArr = this.f27862s;
            int i11 = i10 - 1;
            iArr[i11] = iArr[i11] + 1;
        }
        return parseInt;
    }

    @Override // ya.a
    public final long P() {
        long parseLong;
        int h02 = h0();
        if (h02 != 7 && h02 != 6) {
            StringBuilder a10 = android.support.v4.media.d.a("Expected ");
            a10.append(a1.b.c(7));
            a10.append(" but was ");
            a10.append(a1.b.c(h02));
            a10.append(F());
            throw new IllegalStateException(a10.toString());
        }
        qa.q qVar = (qa.q) y0();
        if (qVar.f24665a instanceof Number) {
            parseLong = qVar.f().longValue();
        } else {
            parseLong = Long.parseLong(qVar.i());
        }
        z0();
        int i10 = this.f27860q;
        if (i10 > 0) {
            int[] iArr = this.f27862s;
            int i11 = i10 - 1;
            iArr[i11] = iArr[i11] + 1;
        }
        return parseLong;
    }

    @Override // ya.a
    public final String R() {
        return x0(false);
    }

    @Override // ya.a
    public final void X() {
        w0(9);
        z0();
        int i10 = this.f27860q;
        if (i10 > 0) {
            int[] iArr = this.f27862s;
            int i11 = i10 - 1;
            iArr[i11] = iArr[i11] + 1;
        }
    }

    @Override // ya.a
    public final void a() {
        w0(1);
        A0(((qa.j) y0()).iterator());
        this.f27862s[this.f27860q - 1] = 0;
    }

    @Override // ya.a
    public final void b() {
        w0(3);
        A0(new o.b.a((o.b) ((qa.o) y0()).f24664a.entrySet()));
    }

    @Override // ya.a
    public final String b0() {
        int h02 = h0();
        if (h02 != 6 && h02 != 7) {
            StringBuilder a10 = android.support.v4.media.d.a("Expected ");
            a10.append(a1.b.c(6));
            a10.append(" but was ");
            a10.append(a1.b.c(h02));
            a10.append(F());
            throw new IllegalStateException(a10.toString());
        }
        String i10 = ((qa.q) z0()).i();
        int i11 = this.f27860q;
        if (i11 > 0) {
            int[] iArr = this.f27862s;
            int i12 = i11 - 1;
            iArr[i12] = iArr[i12] + 1;
        }
        return i10;
    }

    @Override // ya.a, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f27859p = new Object[]{f27858t};
        this.f27860q = 1;
    }

    @Override // ya.a
    public final int h0() {
        if (this.f27860q == 0) {
            return 10;
        }
        Object y02 = y0();
        if (y02 instanceof Iterator) {
            boolean z10 = this.f27859p[this.f27860q - 2] instanceof qa.o;
            Iterator it = (Iterator) y02;
            if (it.hasNext()) {
                if (z10) {
                    return 5;
                }
                A0(it.next());
                return h0();
            } else if (z10) {
                return 4;
            } else {
                return 2;
            }
        } else if (y02 instanceof qa.o) {
            return 3;
        } else {
            if (y02 instanceof qa.j) {
                return 1;
            }
            if (y02 instanceof qa.q) {
                Serializable serializable = ((qa.q) y02).f24665a;
                if (serializable instanceof String) {
                    return 6;
                }
                if (serializable instanceof Boolean) {
                    return 8;
                }
                if (serializable instanceof Number) {
                    return 7;
                }
                throw new AssertionError();
            } else if (y02 instanceof qa.n) {
                return 9;
            } else {
                if (y02 == f27858t) {
                    throw new IllegalStateException("JsonReader is closed");
                }
                StringBuilder a10 = android.support.v4.media.d.a("Custom JsonElement subclass ");
                a10.append(y02.getClass().getName());
                a10.append(" is not supported");
                throw new ya.c(a10.toString());
            }
        }
    }

    @Override // ya.a
    public final void k() {
        w0(2);
        z0();
        z0();
        int i10 = this.f27860q;
        if (i10 > 0) {
            int[] iArr = this.f27862s;
            int i11 = i10 - 1;
            iArr[i11] = iArr[i11] + 1;
        }
    }

    @Override // ya.a
    public final void q() {
        w0(4);
        this.f27861r[this.f27860q - 1] = null;
        z0();
        z0();
        int i10 = this.f27860q;
        if (i10 > 0) {
            int[] iArr = this.f27862s;
            int i11 = i10 - 1;
            iArr[i11] = iArr[i11] + 1;
        }
    }

    @Override // ya.a
    public final void t0() {
        int b10 = c0.b(h0());
        if (b10 == 1) {
            k();
        } else if (b10 != 9) {
            if (b10 == 3) {
                q();
            } else if (b10 == 4) {
                x0(true);
            } else {
                z0();
                int i10 = this.f27860q;
                if (i10 > 0) {
                    int[] iArr = this.f27862s;
                    int i11 = i10 - 1;
                    iArr[i11] = iArr[i11] + 1;
                }
            }
        }
    }

    @Override // ya.a
    public final String toString() {
        return f.class.getSimpleName() + F();
    }

    @Override // ya.a
    public final String v() {
        return y(false);
    }

    public final void w0(int i10) {
        if (h0() == i10) {
            return;
        }
        StringBuilder a10 = android.support.v4.media.d.a("Expected ");
        a10.append(a1.b.c(i10));
        a10.append(" but was ");
        a10.append(a1.b.c(h0()));
        a10.append(F());
        throw new IllegalStateException(a10.toString());
    }

    public final String x0(boolean z10) {
        w0(5);
        Map.Entry entry = (Map.Entry) ((Iterator) y0()).next();
        String str = (String) entry.getKey();
        this.f27861r[this.f27860q - 1] = z10 ? "<skipped>" : str;
        A0(entry.getValue());
        return str;
    }

    public final Object y0() {
        return this.f27859p[this.f27860q - 1];
    }

    public final Object z0() {
        Object[] objArr = this.f27859p;
        int i10 = this.f27860q - 1;
        this.f27860q = i10;
        Object obj = objArr[i10];
        objArr[i10] = null;
        return obj;
    }
}
