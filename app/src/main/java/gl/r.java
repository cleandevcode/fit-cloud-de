package gl;

import jj.d1;

/* loaded from: classes2.dex */
public final class r<T> extends tk.p<T> {

    /* renamed from: a */
    public final tk.t<? extends T> f15450a;

    /* renamed from: b */
    public final wk.e<? super Throwable, ? extends T> f15451b;

    /* renamed from: c */
    public final T f15452c;

    /* loaded from: classes2.dex */
    public final class a implements tk.r<T> {

        /* renamed from: a */
        public final tk.r<? super T> f15453a;

        public a(tk.r<? super T> rVar) {
            r.this = r1;
            this.f15453a = rVar;
        }

        @Override // tk.r, tk.b, tk.g
        public final void a(uk.c cVar) {
            this.f15453a.a(cVar);
        }

        @Override // tk.r, tk.b, tk.g
        public final void onError(Throwable th2) {
            T apply;
            r rVar = r.this;
            wk.e<? super Throwable, ? extends T> eVar = rVar.f15451b;
            if (eVar != null) {
                try {
                    apply = eVar.apply(th2);
                } catch (Throwable th3) {
                    h7.a.y(th3);
                    this.f15453a.onError(new vk.a(th2, th3));
                    return;
                }
            } else {
                apply = rVar.f15452c;
            }
            if (apply != null) {
                this.f15453a.onSuccess(apply);
                return;
            }
            NullPointerException nullPointerException = new NullPointerException("Value supplied was null");
            nullPointerException.initCause(th2);
            this.f15453a.onError(nullPointerException);
        }

        @Override // tk.r, tk.g
        public final void onSuccess(T t10) {
            this.f15453a.onSuccess(t10);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public r(tk.t tVar, d1 d1Var, Object obj) {
        this.f15450a = tVar;
        this.f15451b = d1Var;
        this.f15452c = obj;
    }

    @Override // tk.p
    public final void f(tk.r<? super T> rVar) {
        this.f15450a.c(new a(rVar));
    }
}
