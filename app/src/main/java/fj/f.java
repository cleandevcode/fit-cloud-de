package fj;

import tk.p;
import tk.r;
import tk.t;

/* loaded from: classes2.dex */
public final class f<T> extends p<T> {

    /* renamed from: a */
    public final t<? extends T> f14311a;

    /* renamed from: b */
    public final wk.e<? super Throwable, ? extends Throwable> f14312b;

    /* loaded from: classes2.dex */
    public final class a implements r<T> {

        /* renamed from: a */
        public final r<? super T> f14313a;

        public a(r<? super T> rVar) {
            f.this = r1;
            this.f14313a = rVar;
        }

        @Override // tk.r, tk.b, tk.g
        public final void a(uk.c cVar) {
            this.f14313a.a(cVar);
        }

        @Override // tk.r, tk.b, tk.g
        public final void onError(Throwable th2) {
            try {
                this.f14313a.onError(f.this.f14312b.apply(th2));
            } catch (Throwable th3) {
                h7.a.y(th3);
                this.f14313a.onError(new vk.a(th2, th3));
            }
        }

        @Override // tk.r, tk.g
        public final void onSuccess(T t10) {
            this.f14313a.onSuccess(t10);
        }
    }

    public f(gl.p pVar, ph.p pVar2) {
        this.f14311a = pVar;
        this.f14312b = pVar2;
    }

    @Override // tk.p
    public final void f(r<? super T> rVar) {
        this.f14311a.c(new a(rVar));
    }
}
