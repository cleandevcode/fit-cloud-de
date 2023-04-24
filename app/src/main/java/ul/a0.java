package ul;

import androidx.appcompat.widget.e2;
import androidx.appcompat.widget.u0;
import java.util.Arrays;
import java.util.Iterator;
import java.util.RandomAccess;
import s.p1;

/* loaded from: classes2.dex */
public final class a0<T> extends c<T> implements RandomAccess {

    /* renamed from: a */
    public final Object[] f28844a;

    /* renamed from: b */
    public final int f28845b;

    /* renamed from: c */
    public int f28846c;

    /* renamed from: d */
    public int f28847d;

    /* loaded from: classes2.dex */
    public static final class a extends b<T> {

        /* renamed from: c */
        public int f28848c;

        /* renamed from: d */
        public int f28849d;

        /* renamed from: e */
        public final /* synthetic */ a0<T> f28850e;

        public a(a0<T> a0Var) {
            this.f28850e = a0Var;
            this.f28848c = a0Var.e();
            this.f28849d = a0Var.f28846c;
        }

        @Override // ul.b
        public final void a() {
            int i10 = this.f28848c;
            if (i10 == 0) {
                this.f28851a = 3;
                return;
            }
            a0<T> a0Var = this.f28850e;
            Object[] objArr = a0Var.f28844a;
            int i11 = this.f28849d;
            this.f28852b = (T) objArr[i11];
            this.f28851a = 1;
            this.f28849d = (i11 + 1) % a0Var.f28845b;
            this.f28848c = i10 - 1;
        }
    }

    public a0(int i10, Object[] objArr) {
        boolean z10;
        this.f28844a = objArr;
        if (i10 >= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            if (i10 <= objArr.length) {
                this.f28845b = objArr.length;
                this.f28847d = i10;
                return;
            }
            StringBuilder a10 = e2.a("ring buffer filled size: ", i10, " cannot be larger than the buffer size: ");
            a10.append(objArr.length);
            throw new IllegalArgumentException(a10.toString().toString());
        }
        throw new IllegalArgumentException(u0.a("ring buffer filled size should not be negative but it is ", i10).toString());
    }

    @Override // ul.a
    public final int e() {
        return this.f28847d;
    }

    public final void f(int i10) {
        boolean z10;
        boolean z11 = true;
        if (i10 >= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            if (i10 > this.f28847d) {
                z11 = false;
            }
            if (z11) {
                if (i10 > 0) {
                    int i11 = this.f28846c;
                    int i12 = this.f28845b;
                    int i13 = (i11 + i10) % i12;
                    if (i11 > i13) {
                        i.y(this.f28844a, i11, i12);
                        i.y(this.f28844a, 0, i13);
                    } else {
                        i.y(this.f28844a, i11, i13);
                    }
                    this.f28846c = i13;
                    this.f28847d -= i10;
                    return;
                }
                return;
            }
            StringBuilder a10 = e2.a("n shouldn't be greater than the buffer size: n = ", i10, ", size = ");
            a10.append(this.f28847d);
            throw new IllegalArgumentException(a10.toString().toString());
        }
        throw new IllegalArgumentException(u0.a("n shouldn't be negative but it is ", i10).toString());
    }

    @Override // ul.c, java.util.List
    public final T get(int i10) {
        int e10 = e();
        if (i10 >= 0 && i10 < e10) {
            return (T) this.f28844a[(this.f28846c + i10) % this.f28845b];
        }
        throw new IndexOutOfBoundsException(p1.a("index: ", i10, ", size: ", e10));
    }

    @Override // ul.c, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator<T> iterator() {
        return new a(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // ul.a, java.util.Collection
    public final Object[] toArray() {
        return toArray(new Object[e()]);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // ul.a, java.util.Collection
    public final <T> T[] toArray(T[] tArr) {
        gm.l.f(tArr, "array");
        if (tArr.length < e()) {
            tArr = (T[]) Arrays.copyOf(tArr, e());
            gm.l.e(tArr, "copyOf(this, newSize)");
        }
        int e10 = e();
        int i10 = 0;
        int i11 = 0;
        for (int i12 = this.f28846c; i11 < e10 && i12 < this.f28845b; i12++) {
            tArr[i11] = this.f28844a[i12];
            i11++;
        }
        while (i11 < e10) {
            tArr[i11] = this.f28844a[i10];
            i11++;
            i10++;
        }
        if (tArr.length > e()) {
            tArr[e()] = null;
        }
        return tArr;
    }
}
