package gl;

import yk.a;

/* loaded from: classes2.dex */
public final class h<T> extends tk.p<T> {

    /* renamed from: a */
    public final tk.t<T> f15414a;

    /* renamed from: b */
    public final wk.d<? super Throwable> f15415b;

    /* loaded from: classes2.dex */
    public final class a implements tk.r<T> {

        /* renamed from: a */
        public final tk.r<? super T> f15416a;

        public a(tk.r<? super T> rVar) {
            h.this = r1;
            this.f15416a = rVar;
        }

        @Override // tk.r, tk.b, tk.g
        public final void a(uk.c cVar) {
            this.f15416a.a(cVar);
        }

        @Override // tk.r, tk.b, tk.g
        public final void onError(Throwable th2) {
            try {
                h.this.f15415b.accept(th2);
            } catch (Throwable th3) {
                h7.a.y(th3);
                th2 = new vk.a(th2, th3);
            }
            this.f15416a.onError(th2);
        }

        @Override // tk.r, tk.g
        public final void onSuccess(T t10) {
            this.f15416a.onSuccess(t10);
        }
    }

    public h(j jVar, a.C0601a c0601a) {
        this.f15414a = jVar;
        this.f15415b = c0601a;
    }

    @Override // tk.p
    public final void f(tk.r<? super T> rVar) {
        this.f15414a.c(new a(rVar));
    }
}
