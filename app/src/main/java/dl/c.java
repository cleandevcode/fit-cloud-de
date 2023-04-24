package dl;

import gl.n;
import oc.g1;
import tk.r;
import tk.t;

/* loaded from: classes2.dex */
public final class c<T> extends tk.f<T> {

    /* renamed from: a */
    public final t<T> f13128a;

    /* renamed from: b */
    public final wk.f<? super T> f13129b;

    /* loaded from: classes2.dex */
    public static final class a<T> implements r<T>, uk.c {

        /* renamed from: a */
        public final tk.g<? super T> f13130a;

        /* renamed from: b */
        public final wk.f<? super T> f13131b;

        /* renamed from: c */
        public uk.c f13132c;

        public a(tk.g<? super T> gVar, wk.f<? super T> fVar) {
            this.f13130a = gVar;
            this.f13131b = fVar;
        }

        @Override // tk.r, tk.b, tk.g
        public final void a(uk.c cVar) {
            if (xk.b.i(this.f13132c, cVar)) {
                this.f13132c = cVar;
                this.f13130a.a(this);
            }
        }

        @Override // uk.c
        public final void c() {
            uk.c cVar = this.f13132c;
            this.f13132c = xk.b.f30613a;
            cVar.c();
        }

        @Override // tk.r, tk.b, tk.g
        public final void onError(Throwable th2) {
            this.f13130a.onError(th2);
        }

        @Override // tk.r, tk.g
        public final void onSuccess(T t10) {
            try {
                if (this.f13131b.test(t10)) {
                    this.f13130a.onSuccess(t10);
                } else {
                    this.f13130a.onComplete();
                }
            } catch (Throwable th2) {
                h7.a.y(th2);
                this.f13130a.onError(th2);
            }
        }
    }

    public c(n nVar, g1 g1Var) {
        this.f13128a = nVar;
        this.f13129b = g1Var;
    }

    @Override // tk.f
    public final void c(tk.g<? super T> gVar) {
        this.f13128a.c(new a(gVar, this.f13129b));
    }
}
