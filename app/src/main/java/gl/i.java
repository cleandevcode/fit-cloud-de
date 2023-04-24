package gl;

import oc.d1;

/* loaded from: classes2.dex */
public final class i<T> extends tk.p<T> {

    /* renamed from: a */
    public final tk.t<T> f15418a;

    /* renamed from: b */
    public final wk.d<? super uk.c> f15419b;

    /* loaded from: classes2.dex */
    public static final class a<T> implements tk.r<T> {

        /* renamed from: a */
        public final tk.r<? super T> f15420a;

        /* renamed from: b */
        public final wk.d<? super uk.c> f15421b;

        /* renamed from: c */
        public boolean f15422c;

        public a(tk.r<? super T> rVar, wk.d<? super uk.c> dVar) {
            this.f15420a = rVar;
            this.f15421b = dVar;
        }

        @Override // tk.r, tk.b, tk.g
        public final void a(uk.c cVar) {
            try {
                this.f15421b.accept(cVar);
                this.f15420a.a(cVar);
            } catch (Throwable th2) {
                h7.a.y(th2);
                this.f15422c = true;
                cVar.c();
                tk.r<? super T> rVar = this.f15420a;
                rVar.a(xk.c.INSTANCE);
                rVar.onError(th2);
            }
        }

        @Override // tk.r, tk.b, tk.g
        public final void onError(Throwable th2) {
            if (this.f15422c) {
                ol.a.a(th2);
            } else {
                this.f15420a.onError(th2);
            }
        }

        @Override // tk.r, tk.g
        public final void onSuccess(T t10) {
            if (this.f15422c) {
                return;
            }
            this.f15420a.onSuccess(t10);
        }
    }

    public i(gl.a aVar, d1 d1Var) {
        this.f15418a = aVar;
        this.f15419b = d1Var;
    }

    @Override // tk.p
    public final void f(tk.r<? super T> rVar) {
        this.f15418a.c(new a(rVar, this.f15419b));
    }
}
