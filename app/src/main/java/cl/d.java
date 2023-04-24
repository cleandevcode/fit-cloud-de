package cl;

import androidx.activity.i;
import bi.z0;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class d<T> extends tk.d<T> {

    /* renamed from: b */
    public final T[] f4949b;

    /* loaded from: classes2.dex */
    public static final class a<T> extends c<T> {

        /* renamed from: d */
        public final nl.a<? super T> f4950d;

        public a(nl.a<? super T> aVar, T[] tArr) {
            super(tArr);
            this.f4950d = aVar;
        }

        @Override // cl.d.c
        public final void a() {
            T[] tArr = this.f4952a;
            int length = tArr.length;
            nl.a<? super T> aVar = this.f4950d;
            for (int i10 = this.f4953b; i10 != length; i10++) {
                if (this.f4954c) {
                    return;
                }
                if (tArr[i10] == null) {
                    aVar.onError(new NullPointerException(i.a("The element at index ", i10, " is null")));
                    return;
                }
                aVar.d();
            }
            if (this.f4954c) {
                return;
            }
            aVar.onComplete();
        }

        @Override // cl.d.c
        public final void b(long j10) {
            T[] tArr = this.f4952a;
            int length = tArr.length;
            int i10 = this.f4953b;
            nl.a<? super T> aVar = this.f4950d;
            do {
                long j11 = 0;
                while (true) {
                    if (j11 != j10 && i10 != length) {
                        if (this.f4954c) {
                            return;
                        }
                        if (tArr[i10] == null) {
                            aVar.onError(new NullPointerException(i.a("The element at index ", i10, " is null")));
                            return;
                        }
                        if (aVar.d()) {
                            j11++;
                        }
                        i10++;
                    } else if (i10 == length) {
                        if (!this.f4954c) {
                            aVar.onComplete();
                            return;
                        }
                        return;
                    } else {
                        j10 = get();
                        if (j11 == j10) {
                            this.f4953b = i10;
                            j10 = addAndGet(-j11);
                        }
                    }
                }
            } while (j10 != 0);
        }
    }

    /* loaded from: classes2.dex */
    public static final class b<T> extends c<T> {

        /* renamed from: d */
        public final xn.a<? super T> f4951d;

        public b(xn.a<? super T> aVar, T[] tArr) {
            super(tArr);
            this.f4951d = aVar;
        }

        @Override // cl.d.c
        public final void a() {
            T[] tArr = this.f4952a;
            int length = tArr.length;
            xn.a<? super T> aVar = this.f4951d;
            for (int i10 = this.f4953b; i10 != length; i10++) {
                if (this.f4954c) {
                    return;
                }
                T t10 = tArr[i10];
                if (t10 == null) {
                    aVar.onError(new NullPointerException(i.a("The element at index ", i10, " is null")));
                    return;
                }
                aVar.b(t10);
            }
            if (this.f4954c) {
                return;
            }
            aVar.onComplete();
        }

        @Override // cl.d.c
        public final void b(long j10) {
            T[] tArr = this.f4952a;
            int length = tArr.length;
            int i10 = this.f4953b;
            xn.a<? super T> aVar = this.f4951d;
            do {
                long j11 = 0;
                while (true) {
                    if (j11 != j10 && i10 != length) {
                        if (this.f4954c) {
                            return;
                        }
                        T t10 = tArr[i10];
                        if (t10 == null) {
                            aVar.onError(new NullPointerException(i.a("The element at index ", i10, " is null")));
                            return;
                        }
                        aVar.b(t10);
                        j11++;
                        i10++;
                    } else if (i10 == length) {
                        if (!this.f4954c) {
                            aVar.onComplete();
                            return;
                        }
                        return;
                    } else {
                        j10 = get();
                        if (j11 == j10) {
                            this.f4953b = i10;
                            j10 = addAndGet(-j11);
                        }
                    }
                }
            } while (j10 != 0);
        }
    }

    /* loaded from: classes2.dex */
    public static abstract class c<T> extends jl.a<T> {

        /* renamed from: a */
        public final T[] f4952a;

        /* renamed from: b */
        public int f4953b;

        /* renamed from: c */
        public volatile boolean f4954c;

        public c(T[] tArr) {
            this.f4952a = tArr;
        }

        public abstract void a();

        public abstract void b(long j10);

        @Override // xn.b
        public final void cancel() {
            this.f4954c = true;
        }

        @Override // nl.f
        public final void clear() {
            this.f4953b = this.f4952a.length;
        }

        @Override // xn.b
        public final void g(long j10) {
            if (jl.b.a(j10) && z0.b(this, j10) == 0) {
                if (j10 == Long.MAX_VALUE) {
                    a();
                } else {
                    b(j10);
                }
            }
        }

        @Override // nl.f
        public final boolean isEmpty() {
            return this.f4953b == this.f4952a.length;
        }

        @Override // nl.f
        public final T poll() {
            int i10 = this.f4953b;
            T[] tArr = this.f4952a;
            if (i10 == tArr.length) {
                return null;
            }
            this.f4953b = i10 + 1;
            T t10 = tArr[i10];
            Objects.requireNonNull(t10, "array element is null");
            return t10;
        }
    }

    public d(T[] tArr) {
        this.f4949b = tArr;
    }

    @Override // tk.d
    public final void b(xn.a<? super T> aVar) {
        aVar.a(aVar instanceof nl.a ? new a((nl.a) aVar, this.f4949b) : new b(aVar, this.f4949b));
    }
}
