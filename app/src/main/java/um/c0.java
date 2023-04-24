package um;

import java.lang.Comparable;
import java.util.Arrays;
import pm.v0;
import um.d0;

/* loaded from: classes2.dex */
public class c0<T extends d0 & Comparable<? super T>> {
    private volatile /* synthetic */ int _size = 0;

    /* renamed from: a */
    public T[] f28894a;

    public final void a(v0.c cVar) {
        cVar.a((v0.d) this);
        T[] tArr = this.f28894a;
        if (tArr == null) {
            tArr = (T[]) new d0[4];
            this.f28894a = tArr;
        } else if (this._size >= tArr.length) {
            Object[] copyOf = Arrays.copyOf(tArr, this._size * 2);
            gm.l.e(copyOf, "copyOf(this, newSize)");
            tArr = (T[]) ((d0[]) copyOf);
            this.f28894a = tArr;
        }
        int i10 = this._size;
        this._size = i10 + 1;
        tArr[i10] = cVar;
        cVar.f24409b = i10;
        e(i10);
    }

    public final boolean b() {
        return this._size == 0;
    }

    public final T c(int i10) {
        T[] tArr = this.f28894a;
        gm.l.c(tArr);
        this._size--;
        if (i10 < this._size) {
            f(i10, this._size);
            int i11 = (i10 - 1) / 2;
            if (i10 > 0) {
                T t10 = tArr[i10];
                gm.l.c(t10);
                T t11 = tArr[i11];
                gm.l.c(t11);
                if (((Comparable) t10).compareTo(t11) < 0) {
                    f(i10, i11);
                    e(i11);
                }
            }
            while (true) {
                int i12 = (i10 * 2) + 1;
                if (i12 >= this._size) {
                    break;
                }
                T[] tArr2 = this.f28894a;
                gm.l.c(tArr2);
                int i13 = i12 + 1;
                if (i13 < this._size) {
                    T t12 = tArr2[i13];
                    gm.l.c(t12);
                    T t13 = tArr2[i12];
                    gm.l.c(t13);
                    if (((Comparable) t12).compareTo(t13) < 0) {
                        i12 = i13;
                    }
                }
                T t14 = tArr2[i10];
                gm.l.c(t14);
                T t15 = tArr2[i12];
                gm.l.c(t15);
                if (((Comparable) t14).compareTo(t15) <= 0) {
                    break;
                }
                f(i10, i12);
                i10 = i12;
            }
        }
        T t16 = tArr[this._size];
        gm.l.c(t16);
        t16.a(null);
        t16.setIndex(-1);
        tArr[this._size] = null;
        return t16;
    }

    public final T d() {
        T t10;
        synchronized (this) {
            if (this._size > 0) {
                t10 = c(0);
            } else {
                t10 = null;
            }
        }
        return t10;
    }

    public final void e(int i10) {
        while (i10 > 0) {
            T[] tArr = this.f28894a;
            gm.l.c(tArr);
            int i11 = (i10 - 1) / 2;
            T t10 = tArr[i11];
            gm.l.c(t10);
            T t11 = tArr[i10];
            gm.l.c(t11);
            if (((Comparable) t10).compareTo(t11) <= 0) {
                return;
            }
            f(i10, i11);
            i10 = i11;
        }
    }

    public final void f(int i10, int i11) {
        T[] tArr = this.f28894a;
        gm.l.c(tArr);
        T t10 = tArr[i11];
        gm.l.c(t10);
        T t11 = tArr[i10];
        gm.l.c(t11);
        tArr[i10] = t10;
        tArr[i11] = t11;
        t10.setIndex(i10);
        t11.setIndex(i11);
    }
}
