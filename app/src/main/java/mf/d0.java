package mf;

import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class d0 extends e0 {

    /* renamed from: i */
    public Object[] f20521i = new Object[32];

    /* renamed from: j */
    public String f20522j;

    public d0() {
        C(6);
    }

    @Override // mf.e0
    public final e0 D(double d10) {
        if (!this.f20532e && (Double.isNaN(d10) || d10 == Double.NEGATIVE_INFINITY || d10 == Double.POSITIVE_INFINITY)) {
            throw new IllegalArgumentException("Numeric values must be finite, but was " + d10);
        } else if (this.f20534g) {
            this.f20534g = false;
            s(Double.toString(d10));
            return this;
        } else {
            L(Double.valueOf(d10));
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
        L(Long.valueOf(j10));
        int[] iArr = this.f20531d;
        int i10 = this.f20528a - 1;
        iArr[i10] = iArr[i10] + 1;
        return this;
    }

    @Override // mf.e0
    public final e0 F(Number number) {
        if ((number instanceof Byte) || (number instanceof Short) || (number instanceof Integer) || (number instanceof Long)) {
            E(number.longValue());
            return this;
        } else if ((number instanceof Float) || (number instanceof Double)) {
            D(number.doubleValue());
            return this;
        } else if (number == null) {
            v();
            return this;
        } else {
            BigDecimal bigDecimal = number instanceof BigDecimal ? (BigDecimal) number : new BigDecimal(number.toString());
            if (this.f20534g) {
                this.f20534g = false;
                s(bigDecimal.toString());
                return this;
            }
            L(bigDecimal);
            int[] iArr = this.f20531d;
            int i10 = this.f20528a - 1;
            iArr[i10] = iArr[i10] + 1;
            return this;
        }
    }

    @Override // mf.e0
    public final e0 I(String str) {
        if (this.f20534g) {
            this.f20534g = false;
            s(str);
            return this;
        }
        L(str);
        int[] iArr = this.f20531d;
        int i10 = this.f20528a - 1;
        iArr[i10] = iArr[i10] + 1;
        return this;
    }

    @Override // mf.e0
    public final e0 J(boolean z10) {
        if (!this.f20534g) {
            L(Boolean.valueOf(z10));
            int[] iArr = this.f20531d;
            int i10 = this.f20528a - 1;
            iArr[i10] = iArr[i10] + 1;
            return this;
        }
        StringBuilder a10 = android.support.v4.media.d.a("Boolean cannot be used as a map key in JSON at path ");
        a10.append(q());
        throw new IllegalStateException(a10.toString());
    }

    public final void L(Object obj) {
        String str;
        Object put;
        int y10 = y();
        int i10 = this.f20528a;
        if (i10 == 1) {
            if (y10 == 6) {
                this.f20529b[i10 - 1] = 7;
                this.f20521i[i10 - 1] = obj;
                return;
            }
            throw new IllegalStateException("JSON must have only one top-level value.");
        } else if (y10 == 3 && (str = this.f20522j) != null) {
            if ((obj == null && !this.f20533f) || (put = ((Map) this.f20521i[i10 - 1]).put(str, obj)) == null) {
                this.f20522j = null;
                return;
            }
            StringBuilder a10 = android.support.v4.media.d.a("Map key '");
            a10.append(this.f20522j);
            a10.append("' has multiple values at path ");
            a10.append(q());
            a10.append(": ");
            a10.append(put);
            a10.append(" and ");
            a10.append(obj);
            throw new IllegalArgumentException(a10.toString());
        } else if (y10 == 1) {
            ((List) this.f20521i[i10 - 1]).add(obj);
        } else if (y10 == 9) {
            throw new IllegalStateException("Sink from valueSink() was not closed");
        } else {
            throw new IllegalStateException("Nesting problem.");
        }
    }

    @Override // mf.e0
    public final e0 a() {
        if (!this.f20534g) {
            int i10 = this.f20528a;
            int i11 = this.f20535h;
            if (i10 == i11 && this.f20529b[i10 - 1] == 1) {
                this.f20535h = ~i11;
                return this;
            }
            h();
            ArrayList arrayList = new ArrayList();
            L(arrayList);
            Object[] objArr = this.f20521i;
            int i12 = this.f20528a;
            objArr[i12] = arrayList;
            this.f20531d[i12] = 0;
            C(1);
            return this;
        }
        StringBuilder a10 = android.support.v4.media.d.a("Array cannot be used as a map key in JSON at path ");
        a10.append(q());
        throw new IllegalStateException(a10.toString());
    }

    @Override // mf.e0
    public final e0 b() {
        if (!this.f20534g) {
            int i10 = this.f20528a;
            int i11 = this.f20535h;
            if (i10 == i11 && this.f20529b[i10 - 1] == 3) {
                this.f20535h = ~i11;
                return this;
            }
            h();
            f0 f0Var = new f0();
            L(f0Var);
            this.f20521i[this.f20528a] = f0Var;
            C(3);
            return this;
        }
        StringBuilder a10 = android.support.v4.media.d.a("Object cannot be used as a map key in JSON at path ");
        a10.append(q());
        throw new IllegalStateException(a10.toString());
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
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
    }

    @Override // mf.e0
    public final e0 j() {
        if (y() == 1) {
            int i10 = this.f20528a;
            int i11 = this.f20535h;
            if (i10 == (~i11)) {
                this.f20535h = ~i11;
                return this;
            }
            int i12 = i10 - 1;
            this.f20528a = i12;
            this.f20521i[i12] = null;
            int[] iArr = this.f20531d;
            int i13 = i12 - 1;
            iArr[i13] = iArr[i13] + 1;
            return this;
        }
        throw new IllegalStateException("Nesting problem.");
    }

    @Override // mf.e0
    public final e0 k() {
        if (y() == 3) {
            if (this.f20522j == null) {
                int i10 = this.f20528a;
                int i11 = this.f20535h;
                if (i10 == (~i11)) {
                    this.f20535h = ~i11;
                    return this;
                }
                this.f20534g = false;
                int i12 = i10 - 1;
                this.f20528a = i12;
                this.f20521i[i12] = null;
                this.f20530c[i12] = null;
                int[] iArr = this.f20531d;
                int i13 = i12 - 1;
                iArr[i13] = iArr[i13] + 1;
                return this;
            }
            StringBuilder a10 = android.support.v4.media.d.a("Dangling name: ");
            a10.append(this.f20522j);
            throw new IllegalStateException(a10.toString());
        }
        throw new IllegalStateException("Nesting problem.");
    }

    @Override // mf.e0
    public final e0 s(String str) {
        if (str != null) {
            if (this.f20528a != 0) {
                if (y() == 3 && this.f20522j == null && !this.f20534g) {
                    this.f20522j = str;
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
            L(null);
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
