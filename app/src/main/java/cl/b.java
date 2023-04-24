package cl;

import java.util.NoSuchElementException;
import tk.e;
import tk.p;
import tk.r;

/* loaded from: classes2.dex */
public final class b<T> extends p<T> {

    /* renamed from: a */
    public final tk.d<T> f4925a;

    /* renamed from: b */
    public final long f4926b = 0;

    /* renamed from: c */
    public final T f4927c = null;

    /* loaded from: classes2.dex */
    public static final class a<T> implements e<T>, uk.c {

        /* renamed from: a */
        public final r<? super T> f4928a;

        /* renamed from: b */
        public final long f4929b;

        /* renamed from: c */
        public final T f4930c;

        /* renamed from: d */
        public xn.b f4931d;

        /* renamed from: e */
        public long f4932e;

        /* renamed from: f */
        public boolean f4933f;

        public a(r<? super T> rVar, long j10, T t10) {
            this.f4928a = rVar;
            this.f4929b = j10;
            this.f4930c = t10;
        }

        @Override // xn.a
        public final void a(xn.b bVar) {
            if (jl.b.c(this.f4931d, bVar)) {
                this.f4931d = bVar;
                this.f4928a.a(this);
                bVar.g(this.f4929b + 1);
            }
        }

        @Override // xn.a
        public final void b(T t10) {
            if (this.f4933f) {
                return;
            }
            long j10 = this.f4932e;
            if (j10 != this.f4929b) {
                this.f4932e = j10 + 1;
                return;
            }
            this.f4933f = true;
            this.f4931d.cancel();
            this.f4931d = jl.b.f17993a;
            this.f4928a.onSuccess(t10);
        }

        @Override // uk.c
        public final void c() {
            this.f4931d.cancel();
            this.f4931d = jl.b.f17993a;
        }

        @Override // xn.a
        public final void onComplete() {
            this.f4931d = jl.b.f17993a;
            if (this.f4933f) {
                return;
            }
            this.f4933f = true;
            T t10 = this.f4930c;
            if (t10 != null) {
                this.f4928a.onSuccess(t10);
            } else {
                this.f4928a.onError(new NoSuchElementException());
            }
        }

        @Override // xn.a
        public final void onError(Throwable th2) {
            if (this.f4933f) {
                ol.a.a(th2);
                return;
            }
            this.f4933f = true;
            this.f4931d = jl.b.f17993a;
            this.f4928a.onError(th2);
        }
    }

    public b(c cVar) {
        this.f4925a = cVar;
    }

    @Override // tk.p
    public final void f(r<? super T> rVar) {
        this.f4925a.a(new a(rVar, this.f4926b, this.f4927c));
    }
}
