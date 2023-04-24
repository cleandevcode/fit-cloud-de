package w1;

import androidx.appcompat.widget.e2;
import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;
import w1.y;

/* loaded from: classes.dex */
public final class e extends c<Boolean> implements RandomAccess, y0 {

    /* renamed from: b */
    public boolean[] f29551b;

    /* renamed from: c */
    public int f29552c;

    static {
        new e(new boolean[0], 0).f29545a = false;
    }

    public e() {
        this(new boolean[10], 0);
    }

    public e(boolean[] zArr, int i10) {
        this.f29551b = zArr;
        this.f29552c = i10;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i10, Object obj) {
        int i11;
        boolean booleanValue = ((Boolean) obj).booleanValue();
        b();
        if (i10 < 0 || i10 > (i11 = this.f29552c)) {
            StringBuilder a10 = e2.a("Index:", i10, ", Size:");
            a10.append(this.f29552c);
            throw new IndexOutOfBoundsException(a10.toString());
        }
        boolean[] zArr = this.f29551b;
        if (i11 < zArr.length) {
            System.arraycopy(zArr, i10, zArr, i10 + 1, i11 - i10);
        } else {
            boolean[] zArr2 = new boolean[((i11 * 3) / 2) + 1];
            System.arraycopy(zArr, 0, zArr2, 0, i10);
            System.arraycopy(this.f29551b, i10, zArr2, i10 + 1, this.f29552c - i10);
            this.f29551b = zArr2;
        }
        this.f29551b[i10] = booleanValue;
        this.f29552c++;
        ((AbstractList) this).modCount++;
    }

    @Override // w1.c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends Boolean> collection) {
        b();
        Charset charset = y.f29729a;
        collection.getClass();
        if (!(collection instanceof e)) {
            return super.addAll(collection);
        }
        e eVar = (e) collection;
        int i10 = eVar.f29552c;
        if (i10 == 0) {
            return false;
        }
        int i11 = this.f29552c;
        if (Integer.MAX_VALUE - i11 >= i10) {
            int i12 = i11 + i10;
            boolean[] zArr = this.f29551b;
            if (i12 > zArr.length) {
                this.f29551b = Arrays.copyOf(zArr, i12);
            }
            System.arraycopy(eVar.f29551b, 0, this.f29551b, this.f29552c, eVar.f29552c);
            this.f29552c = i12;
            ((AbstractList) this).modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    @Override // w1.y.c
    public final y.c c(int i10) {
        if (i10 >= this.f29552c) {
            return new e(Arrays.copyOf(this.f29551b, i10), this.f29552c);
        }
        throw new IllegalArgumentException();
    }

    public final void e(boolean z10) {
        b();
        int i10 = this.f29552c;
        boolean[] zArr = this.f29551b;
        if (i10 == zArr.length) {
            boolean[] zArr2 = new boolean[((i10 * 3) / 2) + 1];
            System.arraycopy(zArr, 0, zArr2, 0, i10);
            this.f29551b = zArr2;
        }
        boolean[] zArr3 = this.f29551b;
        int i11 = this.f29552c;
        this.f29552c = i11 + 1;
        zArr3[i11] = z10;
    }

    @Override // w1.c, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof e) {
            e eVar = (e) obj;
            if (this.f29552c != eVar.f29552c) {
                return false;
            }
            boolean[] zArr = eVar.f29551b;
            for (int i10 = 0; i10 < this.f29552c; i10++) {
                if (this.f29551b[i10] != zArr[i10]) {
                    return false;
                }
            }
            return true;
        }
        return super.equals(obj);
    }

    public final void f(int i10) {
        if (i10 >= 0 && i10 < this.f29552c) {
            return;
        }
        StringBuilder a10 = e2.a("Index:", i10, ", Size:");
        a10.append(this.f29552c);
        throw new IndexOutOfBoundsException(a10.toString());
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i10) {
        f(i10);
        return Boolean.valueOf(this.f29551b[i10]);
    }

    @Override // w1.c, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i10 = 1;
        for (int i11 = 0; i11 < this.f29552c; i11++) {
            i10 = (i10 * 31) + y.a(this.f29551b[i11]);
        }
        return i10;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object remove(int i10) {
        int i11;
        b();
        f(i10);
        boolean[] zArr = this.f29551b;
        boolean z10 = zArr[i10];
        if (i10 < this.f29552c - 1) {
            System.arraycopy(zArr, i10 + 1, zArr, i10, (i11 - i10) - 1);
        }
        this.f29552c--;
        ((AbstractList) this).modCount++;
        return Boolean.valueOf(z10);
    }

    @Override // w1.c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        b();
        for (int i10 = 0; i10 < this.f29552c; i10++) {
            if (obj.equals(Boolean.valueOf(this.f29551b[i10]))) {
                boolean[] zArr = this.f29551b;
                System.arraycopy(zArr, i10 + 1, zArr, i10, (this.f29552c - i10) - 1);
                this.f29552c--;
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
        boolean[] zArr = this.f29551b;
        System.arraycopy(zArr, i11, zArr, i10, this.f29552c - i11);
        this.f29552c -= i11 - i10;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i10, Object obj) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        b();
        f(i10);
        boolean[] zArr = this.f29551b;
        boolean z10 = zArr[i10];
        zArr[i10] = booleanValue;
        return Boolean.valueOf(z10);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f29552c;
    }

    @Override // w1.c, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        e(((Boolean) obj).booleanValue());
        return true;
    }
}
