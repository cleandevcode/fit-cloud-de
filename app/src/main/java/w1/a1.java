package w1;

import androidx.appcompat.widget.e2;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;
import w1.y;

/* loaded from: classes.dex */
public final class a1<E> extends c<E> implements RandomAccess {

    /* renamed from: d */
    public static final a1<Object> f29536d;

    /* renamed from: b */
    public E[] f29537b;

    /* renamed from: c */
    public int f29538c;

    static {
        a1<Object> a1Var = new a1<>(0, new Object[0]);
        f29536d = a1Var;
        a1Var.f29545a = false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public a1(int i10, Object[] objArr) {
        this.f29537b = objArr;
        this.f29538c = i10;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i10, E e10) {
        int i11;
        b();
        if (i10 < 0 || i10 > (i11 = this.f29538c)) {
            StringBuilder a10 = e2.a("Index:", i10, ", Size:");
            a10.append(this.f29538c);
            throw new IndexOutOfBoundsException(a10.toString());
        }
        E[] eArr = this.f29537b;
        if (i11 < eArr.length) {
            System.arraycopy(eArr, i10, eArr, i10 + 1, i11 - i10);
        } else {
            E[] eArr2 = (E[]) new Object[((i11 * 3) / 2) + 1];
            System.arraycopy(eArr, 0, eArr2, 0, i10);
            System.arraycopy(this.f29537b, i10, eArr2, i10 + 1, this.f29538c - i10);
            this.f29537b = eArr2;
        }
        this.f29537b[i10] = e10;
        this.f29538c++;
        ((AbstractList) this).modCount++;
    }

    @Override // w1.c, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(E e10) {
        b();
        int i10 = this.f29538c;
        E[] eArr = this.f29537b;
        if (i10 == eArr.length) {
            this.f29537b = (E[]) Arrays.copyOf(eArr, ((i10 * 3) / 2) + 1);
        }
        E[] eArr2 = this.f29537b;
        int i11 = this.f29538c;
        this.f29538c = i11 + 1;
        eArr2[i11] = e10;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // w1.y.c
    public final y.c c(int i10) {
        if (i10 >= this.f29538c) {
            return new a1(this.f29538c, Arrays.copyOf(this.f29537b, i10));
        }
        throw new IllegalArgumentException();
    }

    public final void e(int i10) {
        if (i10 >= 0 && i10 < this.f29538c) {
            return;
        }
        StringBuilder a10 = e2.a("Index:", i10, ", Size:");
        a10.append(this.f29538c);
        throw new IndexOutOfBoundsException(a10.toString());
    }

    @Override // java.util.AbstractList, java.util.List
    public final E get(int i10) {
        e(i10);
        return this.f29537b[i10];
    }

    @Override // java.util.AbstractList, java.util.List
    public final E remove(int i10) {
        int i11;
        b();
        e(i10);
        E[] eArr = this.f29537b;
        E e10 = eArr[i10];
        if (i10 < this.f29538c - 1) {
            System.arraycopy(eArr, i10 + 1, eArr, i10, (i11 - i10) - 1);
        }
        this.f29538c--;
        ((AbstractList) this).modCount++;
        return e10;
    }

    @Override // java.util.AbstractList, java.util.List
    public final E set(int i10, E e10) {
        b();
        e(i10);
        E[] eArr = this.f29537b;
        E e11 = eArr[i10];
        eArr[i10] = e10;
        ((AbstractList) this).modCount++;
        return e11;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f29538c;
    }
}
