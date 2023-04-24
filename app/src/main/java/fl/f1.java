package fl;

import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes2.dex */
public final class f1<T> extends tk.i<T> {

    /* renamed from: a */
    public final ql.d<T> f14466a;

    /* renamed from: b */
    public final AtomicBoolean f14467b = new AtomicBoolean();

    public f1(ql.e eVar) {
        this.f14466a = eVar;
    }

    @Override // tk.i
    public final void z(tk.n<? super T> nVar) {
        this.f14466a.d(nVar);
        this.f14467b.set(true);
    }
}
