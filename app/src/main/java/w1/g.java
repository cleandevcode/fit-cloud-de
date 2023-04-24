package w1;

import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public abstract class g implements Iterable<Byte>, Serializable {

    /* renamed from: b */
    public static final e f29563b = new e(y.f29730b);

    /* renamed from: c */
    public static final c f29564c;

    /* renamed from: a */
    public int f29565a = 0;

    /* loaded from: classes.dex */
    public static abstract class a implements Iterator {
        @Override // java.util.Iterator
        public final Object next() {
            w1.f fVar = (w1.f) this;
            int i10 = fVar.f29557a;
            if (i10 < fVar.f29558b) {
                fVar.f29557a = i10 + 1;
                return Byte.valueOf(fVar.f29559c.i(i10));
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException();
        }
    }

    /* loaded from: classes.dex */
    public static final class b implements c {
        @Override // w1.g.c
        public final byte[] a(byte[] bArr, int i10, int i11) {
            return Arrays.copyOfRange(bArr, i10, i11 + i10);
        }
    }

    /* loaded from: classes.dex */
    public interface c {
        byte[] a(byte[] bArr, int i10, int i11);
    }

    /* loaded from: classes.dex */
    public static abstract class d extends g {
        @Override // w1.g, java.lang.Iterable
        public final Iterator<Byte> iterator() {
            return new w1.f(this);
        }
    }

    /* loaded from: classes.dex */
    public static class e extends d {

        /* renamed from: d */
        public final byte[] f29566d;

        public e(byte[] bArr) {
            bArr.getClass();
            this.f29566d = bArr;
        }

        @Override // w1.g
        public byte b(int i10) {
            return this.f29566d[i10];
        }

        @Override // w1.g
        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof g) || size() != ((g) obj).size()) {
                return false;
            }
            if (size() == 0) {
                return true;
            }
            if (obj instanceof e) {
                e eVar = (e) obj;
                int i10 = this.f29565a;
                int i11 = eVar.f29565a;
                if (i10 != 0 && i11 != 0 && i10 != i11) {
                    return false;
                }
                int size = size();
                if (size <= eVar.size()) {
                    if (0 + size <= eVar.size()) {
                        byte[] bArr = this.f29566d;
                        byte[] bArr2 = eVar.f29566d;
                        int p10 = p() + size;
                        int p11 = p();
                        int p12 = eVar.p() + 0;
                        while (p11 < p10) {
                            if (bArr[p11] != bArr2[p12]) {
                                return false;
                            }
                            p11++;
                            p12++;
                        }
                        return true;
                    }
                    StringBuilder a10 = h.a("Ran off end of other: ", 0, ", ", size, ", ");
                    a10.append(eVar.size());
                    throw new IllegalArgumentException(a10.toString());
                }
                throw new IllegalArgumentException("Length too large: " + size + size());
            }
            return obj.equals(this);
        }

        @Override // w1.g
        public byte i(int i10) {
            return this.f29566d[i10];
        }

        @Override // w1.g
        public final boolean j() {
            int p10 = p();
            byte[] bArr = this.f29566d;
            if (o1.f29660a.c(p10, size() + p10, bArr) == 0) {
                return true;
            }
            return false;
        }

        @Override // w1.g
        public final int k(int i10, int i11) {
            byte[] bArr = this.f29566d;
            int p10 = p() + 0;
            Charset charset = y.f29729a;
            for (int i12 = p10; i12 < p10 + i11; i12++) {
                i10 = (i10 * 31) + bArr[i12];
            }
            return i10;
        }

        @Override // w1.g
        public final String n(Charset charset) {
            return new String(this.f29566d, p(), size(), charset);
        }

        @Override // w1.g
        public final void o(androidx.fragment.app.a0 a0Var) {
            a0Var.E(this.f29566d, p(), size());
        }

        public int p() {
            return 0;
        }

        @Override // w1.g
        public int size() {
            return this.f29566d.length;
        }
    }

    /* loaded from: classes.dex */
    public static final class f implements c {
        @Override // w1.g.c
        public final byte[] a(byte[] bArr, int i10, int i11) {
            byte[] bArr2 = new byte[i11];
            System.arraycopy(bArr, i10, bArr2, 0, i11);
            return bArr2;
        }
    }

    static {
        f29564c = w1.d.a() ? new f() : new b();
    }

    public static int e(int i10, int i11, int i12) {
        int i13 = i11 - i10;
        if ((i10 | i11 | i13 | (i12 - i11)) < 0) {
            if (i10 >= 0) {
                if (i11 < i10) {
                    throw new IndexOutOfBoundsException(s.p1.a("Beginning index larger than ending index: ", i10, ", ", i11));
                }
                throw new IndexOutOfBoundsException(s.p1.a("End index: ", i11, " >= ", i12));
            }
            throw new IndexOutOfBoundsException(androidx.activity.i.a("Beginning index: ", i10, " < 0"));
        }
        return i13;
    }

    public static e f(byte[] bArr, int i10, int i11) {
        e(i10, i10 + i11, bArr.length);
        return new e(f29564c.a(bArr, i10, i11));
    }

    public abstract byte b(int i10);

    public abstract boolean equals(Object obj);

    public final int hashCode() {
        int i10 = this.f29565a;
        if (i10 == 0) {
            int size = size();
            i10 = k(size, size);
            if (i10 == 0) {
                i10 = 1;
            }
            this.f29565a = i10;
        }
        return i10;
    }

    public abstract byte i(int i10);

    @Override // java.lang.Iterable
    public Iterator<Byte> iterator() {
        return new w1.f(this);
    }

    public abstract boolean j();

    public abstract int k(int i10, int i11);

    public abstract String n(Charset charset);

    public abstract void o(androidx.fragment.app.a0 a0Var);

    public abstract int size();

    public final String toString() {
        return String.format("<ByteString@%s size=%d>", Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(size()));
    }
}
