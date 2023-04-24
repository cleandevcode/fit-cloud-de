package fl;

import java.util.Objects;

/* loaded from: classes2.dex */
public final class x<T> extends tk.i<T> {

    /* renamed from: a */
    public final T[] f14751a;

    /* loaded from: classes2.dex */
    public static final class a<T> extends al.c<T> {

        /* renamed from: a */
        public final tk.n<? super T> f14752a;

        /* renamed from: b */
        public final T[] f14753b;

        /* renamed from: c */
        public int f14754c;

        /* renamed from: d */
        public boolean f14755d;

        /* renamed from: e */
        public volatile boolean f14756e;

        public a(tk.n<? super T> nVar, T[] tArr) {
            this.f14752a = nVar;
            this.f14753b = tArr;
        }

        @Override // uk.c
        public final void c() {
            this.f14756e = true;
        }

        @Override // nl.f
        public final void clear() {
            this.f14754c = this.f14753b.length;
        }

        @Override // nl.c
        public final int d(int i10) {
            if ((i10 & 1) != 0) {
                this.f14755d = true;
                return 1;
            }
            return 0;
        }

        @Override // nl.f
        public final boolean isEmpty() {
            return this.f14754c == this.f14753b.length;
        }

        @Override // nl.f
        public final T poll() {
            int i10 = this.f14754c;
            T[] tArr = this.f14753b;
            if (i10 != tArr.length) {
                this.f14754c = i10 + 1;
                T t10 = tArr[i10];
                Objects.requireNonNull(t10, "The array element is null");
                return t10;
            }
            return null;
        }
    }

    public x(T[] tArr) {
        this.f14751a = tArr;
    }

    @Override // tk.i
    public final void z(tk.n<? super T> nVar) {
        T[] tArr = this.f14751a;
        a aVar = new a(nVar, tArr);
        nVar.a(aVar);
        if (aVar.f14755d) {
            return;
        }
        int length = tArr.length;
        for (int i10 = 0; i10 < length && !aVar.f14756e; i10++) {
            T t10 = tArr[i10];
            if (t10 == null) {
                aVar.f14752a.onError(new NullPointerException(androidx.activity.i.a("The element at index ", i10, " is null")));
                return;
            }
            aVar.f14752a.b(t10);
        }
        if (!aVar.f14756e) {
            aVar.f14752a.onComplete();
        }
    }
}
