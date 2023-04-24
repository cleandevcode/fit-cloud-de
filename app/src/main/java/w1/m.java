package w1;

import androidx.appcompat.widget.e2;
import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;
import w1.y;

/* loaded from: classes.dex */
public final class m extends c<Double> implements RandomAccess, y0 {

    /* renamed from: b */
    public double[] f29638b;

    /* renamed from: c */
    public int f29639c;

    static {
        new m(0, new double[0]).f29545a = false;
    }

    public m() {
        this(0, new double[10]);
    }

    public m(int i10, double[] dArr) {
        this.f29638b = dArr;
        this.f29639c = i10;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i10, Object obj) {
        int i11;
        double doubleValue = ((Double) obj).doubleValue();
        b();
        if (i10 < 0 || i10 > (i11 = this.f29639c)) {
            StringBuilder a10 = e2.a("Index:", i10, ", Size:");
            a10.append(this.f29639c);
            throw new IndexOutOfBoundsException(a10.toString());
        }
        double[] dArr = this.f29638b;
        if (i11 < dArr.length) {
            System.arraycopy(dArr, i10, dArr, i10 + 1, i11 - i10);
        } else {
            double[] dArr2 = new double[((i11 * 3) / 2) + 1];
            System.arraycopy(dArr, 0, dArr2, 0, i10);
            System.arraycopy(this.f29638b, i10, dArr2, i10 + 1, this.f29639c - i10);
            this.f29638b = dArr2;
        }
        this.f29638b[i10] = doubleValue;
        this.f29639c++;
        ((AbstractList) this).modCount++;
    }

    @Override // w1.c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends Double> collection) {
        b();
        Charset charset = y.f29729a;
        collection.getClass();
        if (!(collection instanceof m)) {
            return super.addAll(collection);
        }
        m mVar = (m) collection;
        int i10 = mVar.f29639c;
        if (i10 == 0) {
            return false;
        }
        int i11 = this.f29639c;
        if (Integer.MAX_VALUE - i11 >= i10) {
            int i12 = i11 + i10;
            double[] dArr = this.f29638b;
            if (i12 > dArr.length) {
                this.f29638b = Arrays.copyOf(dArr, i12);
            }
            System.arraycopy(mVar.f29638b, 0, this.f29638b, this.f29639c, mVar.f29639c);
            this.f29639c = i12;
            ((AbstractList) this).modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    @Override // w1.y.c
    public final y.c c(int i10) {
        if (i10 >= this.f29639c) {
            return new m(this.f29639c, Arrays.copyOf(this.f29638b, i10));
        }
        throw new IllegalArgumentException();
    }

    public final void e(double d10) {
        b();
        int i10 = this.f29639c;
        double[] dArr = this.f29638b;
        if (i10 == dArr.length) {
            double[] dArr2 = new double[((i10 * 3) / 2) + 1];
            System.arraycopy(dArr, 0, dArr2, 0, i10);
            this.f29638b = dArr2;
        }
        double[] dArr3 = this.f29638b;
        int i11 = this.f29639c;
        this.f29639c = i11 + 1;
        dArr3[i11] = d10;
    }

    @Override // w1.c, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof m) {
            m mVar = (m) obj;
            if (this.f29639c != mVar.f29639c) {
                return false;
            }
            double[] dArr = mVar.f29638b;
            for (int i10 = 0; i10 < this.f29639c; i10++) {
                if (Double.doubleToLongBits(this.f29638b[i10]) != Double.doubleToLongBits(dArr[i10])) {
                    return false;
                }
            }
            return true;
        }
        return super.equals(obj);
    }

    public final void f(int i10) {
        if (i10 >= 0 && i10 < this.f29639c) {
            return;
        }
        StringBuilder a10 = e2.a("Index:", i10, ", Size:");
        a10.append(this.f29639c);
        throw new IndexOutOfBoundsException(a10.toString());
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i10) {
        f(i10);
        return Double.valueOf(this.f29638b[i10]);
    }

    @Override // w1.c, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i10 = 1;
        for (int i11 = 0; i11 < this.f29639c; i11++) {
            i10 = (i10 * 31) + y.b(Double.doubleToLongBits(this.f29638b[i11]));
        }
        return i10;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object remove(int i10) {
        int i11;
        b();
        f(i10);
        double[] dArr = this.f29638b;
        double d10 = dArr[i10];
        if (i10 < this.f29639c - 1) {
            System.arraycopy(dArr, i10 + 1, dArr, i10, (i11 - i10) - 1);
        }
        this.f29639c--;
        ((AbstractList) this).modCount++;
        return Double.valueOf(d10);
    }

    @Override // w1.c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        b();
        for (int i10 = 0; i10 < this.f29639c; i10++) {
            if (obj.equals(Double.valueOf(this.f29638b[i10]))) {
                double[] dArr = this.f29638b;
                System.arraycopy(dArr, i10 + 1, dArr, i10, (this.f29639c - i10) - 1);
                this.f29639c--;
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
        double[] dArr = this.f29638b;
        System.arraycopy(dArr, i11, dArr, i10, this.f29639c - i11);
        this.f29639c -= i11 - i10;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i10, Object obj) {
        double doubleValue = ((Double) obj).doubleValue();
        b();
        f(i10);
        double[] dArr = this.f29638b;
        double d10 = dArr[i10];
        dArr[i10] = doubleValue;
        return Double.valueOf(d10);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f29639c;
    }

    @Override // w1.c, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        e(((Double) obj).doubleValue());
        return true;
    }
}
