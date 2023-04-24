package fj;

import tk.i;
import tk.l;
import tk.n;
import wi.h;

/* loaded from: classes2.dex */
public final class b<T> extends i<T> {

    /* renamed from: a */
    public final l<T> f14302a;

    /* renamed from: b */
    public final wk.e<? super Throwable, ? extends Throwable> f14303b;

    /* loaded from: classes2.dex */
    public static final class a<T> implements n<T>, uk.c {

        /* renamed from: a */
        public final n<? super T> f14304a;

        /* renamed from: b */
        public final wk.e<? super Throwable, ? extends Throwable> f14305b;

        /* renamed from: c */
        public uk.c f14306c;

        public a(n<? super T> nVar, wk.e<? super Throwable, ? extends Throwable> eVar) {
            this.f14304a = nVar;
            this.f14305b = eVar;
        }

        @Override // tk.n
        public final void a(uk.c cVar) {
            if (xk.b.i(this.f14306c, cVar)) {
                this.f14306c = cVar;
                this.f14304a.a(this);
            }
        }

        @Override // tk.n
        public final void b(T t10) {
            this.f14304a.b(t10);
        }

        @Override // uk.c
        public final void c() {
            this.f14306c.c();
        }

        @Override // tk.n
        public final void onComplete() {
            this.f14304a.onComplete();
        }

        @Override // tk.n
        public final void onError(Throwable th2) {
            try {
                this.f14304a.onError(this.f14305b.apply(th2));
            } catch (Throwable th3) {
                h7.a.y(th3);
                this.f14304a.onError(new vk.a(th2, th3));
            }
        }
    }

    public b(i iVar, h hVar) {
        this.f14302a = iVar;
        this.f14303b = hVar;
    }

    @Override // tk.i
    public final void z(n<? super T> nVar) {
        this.f14302a.d(new a(nVar, this.f14303b));
    }
}
