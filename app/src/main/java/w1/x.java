package w1;

import androidx.appcompat.widget.e2;
import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;
import w1.y;

/* loaded from: classes.dex */
public final class x extends c<Integer> implements RandomAccess, y0 {

    /* renamed from: b */
    public int[] f29727b;

    /* renamed from: c */
    public int f29728c;

    static {
        new x(new int[0], 0).f29545a = false;
    }

    public x() {
        this(new int[10], 0);
    }

    public x(int[] iArr, int i10) {
        this.f29727b = iArr;
        this.f29728c = i10;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i10, Object obj) {
        int i11;
        int intValue = ((Integer) obj).intValue();
        b();
        if (i10 < 0 || i10 > (i11 = this.f29728c)) {
            StringBuilder a10 = e2.a("Index:", i10, ", Size:");
            a10.append(this.f29728c);
            throw new IndexOutOfBoundsException(a10.toString());
        }
        int[] iArr = this.f29727b;
        if (i11 < iArr.length) {
            System.arraycopy(iArr, i10, iArr, i10 + 1, i11 - i10);
        } else {
            int[] iArr2 = new int[((i11 * 3) / 2) + 1];
            System.arraycopy(iArr, 0, iArr2, 0, i10);
            System.arraycopy(this.f29727b, i10, iArr2, i10 + 1, this.f29728c - i10);
            this.f29727b = iArr2;
        }
        this.f29727b[i10] = intValue;
        this.f29728c++;
        ((AbstractList) this).modCount++;
    }

    @Override // w1.c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends Integer> collection) {
        b();
        Charset charset = y.f29729a;
        collection.getClass();
        if (!(collection instanceof x)) {
            return super.addAll(collection);
        }
        x xVar = (x) collection;
        int i10 = xVar.f29728c;
        if (i10 == 0) {
            return false;
        }
        int i11 = this.f29728c;
        if (Integer.MAX_VALUE - i11 >= i10) {
            int i12 = i11 + i10;
            int[] iArr = this.f29727b;
            if (i12 > iArr.length) {
                this.f29727b = Arrays.copyOf(iArr, i12);
            }
            System.arraycopy(xVar.f29727b, 0, this.f29727b, this.f29728c, xVar.f29728c);
            this.f29728c = i12;
            ((AbstractList) this).modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    @Override // w1.y.c
    public final y.c c(int i10) {
        if (i10 >= this.f29728c) {
            return new x(Arrays.copyOf(this.f29727b, i10), this.f29728c);
        }
        throw new IllegalArgumentException();
    }

    public final void e(int i10) {
        b();
        int i11 = this.f29728c;
        int[] iArr = this.f29727b;
        if (i11 == iArr.length) {
            int[] iArr2 = new int[((i11 * 3) / 2) + 1];
            System.arraycopy(iArr, 0, iArr2, 0, i11);
            this.f29727b = iArr2;
        }
        int[] iArr3 = this.f29727b;
        int i12 = this.f29728c;
        this.f29728c = i12 + 1;
        iArr3[i12] = i10;
    }

    @Override // w1.c, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof x) {
            x xVar = (x) obj;
            if (this.f29728c != xVar.f29728c) {
                return false;
            }
            int[] iArr = xVar.f29727b;
            for (int i10 = 0; i10 < this.f29728c; i10++) {
                if (this.f29727b[i10] != iArr[i10]) {
                    return false;
                }
            }
            return true;
        }
        return super.equals(obj);
    }

    public final void f(int i10) {
        if (i10 >= 0 && i10 < this.f29728c) {
            return;
        }
        StringBuilder a10 = e2.a("Index:", i10, ", Size:");
        a10.append(this.f29728c);
        throw new IndexOutOfBoundsException(a10.toString());
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i10) {
        f(i10);
        return Integer.valueOf(this.f29727b[i10]);
    }

    @Override // w1.c, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i10 = 1;
        for (int i11 = 0; i11 < this.f29728c; i11++) {
            i10 = (i10 * 31) + this.f29727b[i11];
        }
        return i10;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object remove(int i10) {
        int i11;
        b();
        f(i10);
        int[] iArr = this.f29727b;
        int i12 = iArr[i10];
        if (i10 < this.f29728c - 1) {
            System.arraycopy(iArr, i10 + 1, iArr, i10, (i11 - i10) - 1);
        }
        this.f29728c--;
        ((AbstractList) this).modCount++;
        return Integer.valueOf(i12);
    }

    @Override // w1.c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        b();
        for (int i10 = 0; i10 < this.f29728c; i10++) {
            if (obj.equals(Integer.valueOf(this.f29727b[i10]))) {
                int[] iArr = this.f29727b;
                System.arraycopy(iArr, i10 + 1, iArr, i10, (this.f29728c - i10) - 1);
                this.f29728c--;
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
        int[] iArr = this.f29727b;
        System.arraycopy(iArr, i11, iArr, i10, this.f29728c - i11);
        this.f29728c -= i11 - i10;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i10, Object obj) {
        int intValue = ((Integer) obj).intValue();
        b();
        f(i10);
        int[] iArr = this.f29727b;
        int i11 = iArr[i10];
        iArr[i10] = intValue;
        return Integer.valueOf(i11);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f29728c;
    }

    @Override // w1.c, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        e(((Integer) obj).intValue());
        return true;
    }
}
