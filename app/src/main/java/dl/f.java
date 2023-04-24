package dl;

import java.util.Objects;
import og.u;

/* loaded from: classes2.dex */
public final class f<T> extends dl.a<T, T> {

    /* renamed from: b */
    public final wk.e<? super Throwable, ? extends T> f13142b;

    /* loaded from: classes2.dex */
    public static final class a<T> implements tk.g<T>, uk.c {

        /* renamed from: a */
        public final tk.g<? super T> f13143a;

        /* renamed from: b */
        public final wk.e<? super Throwable, ? extends T> f13144b;

        /* renamed from: c */
        public uk.c f13145c;

        public a(tk.g<? super T> gVar, wk.e<? super Throwable, ? extends T> eVar) {
            this.f13143a = gVar;
            this.f13144b = eVar;
        }

        @Override // tk.g
        public final void a(uk.c cVar) {
            if (xk.b.i(this.f13145c, cVar)) {
                this.f13145c = cVar;
                this.f13143a.a(this);
            }
        }

        @Override // uk.c
        public final void c() {
            this.f13145c.c();
        }

        @Override // tk.g
        public final void onComplete() {
            this.f13143a.onComplete();
        }

        @Override // tk.g
        public final void onError(Throwable th2) {
            try {
                T apply = this.f13144b.apply(th2);
                Objects.requireNonNull(apply, "The itemSupplier returned a null value");
                this.f13143a.onSuccess(apply);
            } catch (Throwable th3) {
                h7.a.y(th3);
                this.f13143a.onError(new vk.a(th2, th3));
            }
        }

        @Override // tk.g
        public final void onSuccess(T t10) {
            this.f13143a.onSuccess(t10);
        }
    }

    public f(e eVar, u uVar) {
        super(eVar);
        this.f13142b = uVar;
    }

    @Override // tk.f
    public final void c(tk.g<? super T> gVar) {
        this.f13126a.a(new a(gVar, this.f13142b));
    }
}
