package w1;

import androidx.appcompat.widget.e2;
import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;
import w1.y;

/* loaded from: classes.dex */
public final class g0 extends c<Long> implements RandomAccess, y0 {

    /* renamed from: b */
    public long[] f29567b;

    /* renamed from: c */
    public int f29568c;

    static {
        new g0(new long[0], 0).f29545a = false;
    }

    public g0() {
        this(new long[10], 0);
    }

    public g0(long[] jArr, int i10) {
        this.f29567b = jArr;
        this.f29568c = i10;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i10, Object obj) {
        int i11;
        long longValue = ((Long) obj).longValue();
        b();
        if (i10 < 0 || i10 > (i11 = this.f29568c)) {
            StringBuilder a10 = e2.a("Index:", i10, ", Size:");
            a10.append(this.f29568c);
            throw new IndexOutOfBoundsException(a10.toString());
        }
        long[] jArr = this.f29567b;
        if (i11 < jArr.length) {
            System.arraycopy(jArr, i10, jArr, i10 + 1, i11 - i10);
        } else {
            long[] jArr2 = new long[((i11 * 3) / 2) + 1];
            System.arraycopy(jArr, 0, jArr2, 0, i10);
            System.arraycopy(this.f29567b, i10, jArr2, i10 + 1, this.f29568c - i10);
            this.f29567b = jArr2;
        }
        this.f29567b[i10] = longValue;
        this.f29568c++;
        ((AbstractList) this).modCount++;
    }

    @Override // w1.c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends Long> collection) {
        b();
        Charset charset = y.f29729a;
        collection.getClass();
        if (!(collection instanceof g0)) {
            return super.addAll(collection);
        }
        g0 g0Var = (g0) collection;
        int i10 = g0Var.f29568c;
        if (i10 == 0) {
            return false;
        }
        int i11 = this.f29568c;
        if (Integer.MAX_VALUE - i11 >= i10) {
            int i12 = i11 + i10;
            long[] jArr = this.f29567b;
            if (i12 > jArr.length) {
                this.f29567b = Arrays.copyOf(jArr, i12);
            }
            System.arraycopy(g0Var.f29567b, 0, this.f29567b, this.f29568c, g0Var.f29568c);
            this.f29568c = i12;
            ((AbstractList) this).modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    @Override // w1.y.c
    public final y.c c(int i10) {
        if (i10 >= this.f29568c) {
            return new g0(Arrays.copyOf(this.f29567b, i10), this.f29568c);
        }
        throw new IllegalArgumentException();
    }

    public final void e(long j10) {
        b();
        int i10 = this.f29568c;
        long[] jArr = this.f29567b;
        if (i10 == jArr.length) {
            long[] jArr2 = new long[((i10 * 3) / 2) + 1];
            System.arraycopy(jArr, 0, jArr2, 0, i10);
            this.f29567b = jArr2;
        }
        long[] jArr3 = this.f29567b;
        int i11 = this.f29568c;
        this.f29568c = i11 + 1;
        jArr3[i11] = j10;
    }

    @Override // w1.c, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof g0) {
            g0 g0Var = (g0) obj;
            if (this.f29568c != g0Var.f29568c) {
                return false;
            }
            long[] jArr = g0Var.f29567b;
            for (int i10 = 0; i10 < this.f29568c; i10++) {
                if (this.f29567b[i10] != jArr[i10]) {
                    return false;
                }
            }
            return true;
        }
        return super.equals(obj);
    }

    public final void f(int i10) {
        if (i10 >= 0 && i10 < this.f29568c) {
            return;
        }
        StringBuilder a10 = e2.a("Index:", i10, ", Size:");
        a10.append(this.f29568c);
        throw new IndexOutOfBoundsException(a10.toString());
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i10) {
        f(i10);
        return Long.valueOf(this.f29567b[i10]);
    }

    @Override // w1.c, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i10 = 1;
        for (int i11 = 0; i11 < this.f29568c; i11++) {
            i10 = (i10 * 31) + y.b(this.f29567b[i11]);
        }
        return i10;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object remove(int i10) {
        int i11;
        b();
        f(i10);
        long[] jArr = this.f29567b;
        long j10 = jArr[i10];
        if (i10 < this.f29568c - 1) {
            System.arraycopy(jArr, i10 + 1, jArr, i10, (i11 - i10) - 1);
        }
        this.f29568c--;
        ((AbstractList) this).modCount++;
        return Long.valueOf(j10);
    }

    @Override // w1.c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        b();
        for (int i10 = 0; i10 < this.f29568c; i10++) {
            if (obj.equals(Long.valueOf(this.f29567b[i10]))) {
                long[] jArr = this.f29567b;
                System.arraycopy(jArr, i10 + 1, jArr, i10, (this.f29568c - i10) - 1);
                this.f29568c--;
                ((AbstractList) this).modCount++;
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i10, int i11) {
        b();
        if (i11 < i10) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        long[] jArr = this.f29567b;
        System.arraycopy(jArr, i11, jArr, i10, this.f29568c - i11);
        this.f29568c -= i11 - i10;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i10, Object obj) {
        long longValue = ((Long) obj).longValue();
        b();
        f(i10);
        long[] jArr = this.f29567b;
        long j10 = jArr[i10];
        jArr[i10] = longValue;
        return Long.valueOf(j10);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f29568c;
    }

    @Override // w1.c, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        e(((Long) obj).longValue());
        return true;
    }
}
