package w1;

import androidx.appcompat.widget.e2;
import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;
import w1.y;

/* loaded from: classes.dex */
public final class u extends c<Float> implements RandomAccess, y0 {

    /* renamed from: b */
    public float[] f29712b;

    /* renamed from: c */
    public int f29713c;

    static {
        new u(new float[0], 0).f29545a = false;
    }

    public u() {
        this(new float[10], 0);
    }

    public u(float[] fArr, int i10) {
        this.f29712b = fArr;
        this.f29713c = i10;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i10, Object obj) {
        int i11;
        float floatValue = ((Float) obj).floatValue();
        b();
        if (i10 < 0 || i10 > (i11 = this.f29713c)) {
            StringBuilder a10 = e2.a("Index:", i10, ", Size:");
            a10.append(this.f29713c);
            throw new IndexOutOfBoundsException(a10.toString());
        }
        float[] fArr = this.f29712b;
        if (i11 < fArr.length) {
            System.arraycopy(fArr, i10, fArr, i10 + 1, i11 - i10);
        } else {
            float[] fArr2 = new float[((i11 * 3) / 2) + 1];
            System.arraycopy(fArr, 0, fArr2, 0, i10);
            System.arraycopy(this.f29712b, i10, fArr2, i10 + 1, this.f29713c - i10);
            this.f29712b = fArr2;
        }
        this.f29712b[i10] = floatValue;
        this.f29713c++;
        ((AbstractList) this).modCount++;
    }

    @Override // w1.c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends Float> collection) {
        b();
        Charset charset = y.f29729a;
        collection.getClass();
        if (!(collection instanceof u)) {
            return super.addAll(collection);
        }
        u uVar = (u) collection;
        int i10 = uVar.f29713c;
        if (i10 == 0) {
            return false;
        }
        int i11 = this.f29713c;
        if (Integer.MAX_VALUE - i11 >= i10) {
            int i12 = i11 + i10;
            float[] fArr = this.f29712b;
            if (i12 > fArr.length) {
                this.f29712b = Arrays.copyOf(fArr, i12);
            }
            System.arraycopy(uVar.f29712b, 0, this.f29712b, this.f29713c, uVar.f29713c);
            this.f29713c = i12;
            ((AbstractList) this).modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    @Override // w1.y.c
    public final y.c c(int i10) {
        if (i10 >= this.f29713c) {
            return new u(Arrays.copyOf(this.f29712b, i10), this.f29713c);
        }
        throw new IllegalArgumentException();
    }

    public final void e(float f10) {
        b();
        int i10 = this.f29713c;
        float[] fArr = this.f29712b;
        if (i10 == fArr.length) {
            float[] fArr2 = new float[((i10 * 3) / 2) + 1];
            System.arraycopy(fArr, 0, fArr2, 0, i10);
            this.f29712b = fArr2;
        }
        float[] fArr3 = this.f29712b;
        int i11 = this.f29713c;
        this.f29713c = i11 + 1;
        fArr3[i11] = f10;
    }

    @Override // w1.c, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof u) {
            u uVar = (u) obj;
            if (this.f29713c != uVar.f29713c) {
                return false;
            }
            float[] fArr = uVar.f29712b;
            for (int i10 = 0; i10 < this.f29713c; i10++) {
                if (Float.floatToIntBits(this.f29712b[i10]) != Float.floatToIntBits(fArr[i10])) {
                    return false;
                }
            }
            return true;
        }
        return super.equals(obj);
    }

    public final void f(int i10) {
        if (i10 >= 0 && i10 < this.f29713c) {
            return;
        }
        StringBuilder a10 = e2.a("Index:", i10, ", Size:");
        a10.append(this.f29713c);
        throw new IndexOutOfBoundsException(a10.toString());
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i10) {
        f(i10);
        return Float.valueOf(this.f29712b[i10]);
    }

    @Override // w1.c, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i10 = 1;
        for (int i11 = 0; i11 < this.f29713c; i11++) {
            i10 = (i10 * 31) + Float.floatToIntBits(this.f29712b[i11]);
        }
        return i10;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object remove(int i10) {
        int i11;
        b();
        f(i10);
        float[] fArr = this.f29712b;
        float f10 = fArr[i10];
        if (i10 < this.f29713c - 1) {
            System.arraycopy(fArr, i10 + 1, fArr, i10, (i11 - i10) - 1);
        }
        this.f29713c--;
        ((AbstractList) this).modCount++;
        return Float.valueOf(f10);
    }

    @Override // w1.c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        b();
        for (int i10 = 0; i10 < this.f29713c; i10++) {
            if (obj.equals(Float.valueOf(this.f29712b[i10]))) {
                float[] fArr = this.f29712b;
                System.arraycopy(fArr, i10 + 1, fArr, i10, (this.f29713c - i10) - 1);
                this.f29713c--;
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
        float[] fArr = this.f29712b;
        System.arraycopy(fArr, i11, fArr, i10, this.f29713c - i11);
        this.f29713c -= i11 - i10;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i10, Object obj) {
        float floatValue = ((Float) obj).floatValue();
        b();
        f(i10);
        float[] fArr = this.f29712b;
        float f10 = fArr[i10];
        fArr[i10] = floatValue;
        return Float.valueOf(f10);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f29713c;
    }

    @Override // w1.c, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        e(((Float) obj).floatValue());
        return true;
    }
}
