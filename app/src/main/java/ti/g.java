package ti;

import com.huawei.hms.scankit.C0637e;
import fl.g;
import gm.l;
import tk.n;

/* loaded from: classes2.dex */
public abstract class g<T, U> implements n<T>, wk.c {

    /* renamed from: a */
    public final tk.j<U> f28258a;

    /* renamed from: b */
    public final ej.a f28259b;

    /* renamed from: c */
    public uk.c f28260c;

    public g(g.a aVar, ej.a aVar2) {
        this.f28258a = aVar;
        this.f28259b = aVar2;
        aVar.e(this);
    }

    @Override // tk.n
    public final void a(uk.c cVar) {
        l.f(cVar, "d");
        this.f28260c = cVar;
    }

    @Override // wk.c
    public final void cancel() {
        uk.c cVar = this.f28260c;
        if (cVar != null) {
            cVar.c();
        }
        ((ej.b) this.f28259b).b();
    }

    @Override // tk.n
    public final void onComplete() {
        uk.c cVar = this.f28260c;
        if (cVar != null) {
            cVar.c();
        }
        ((ej.b) this.f28259b).b();
        ((g.a) this.f28258a).b();
    }

    @Override // tk.n
    public final void onError(Throwable th2) {
        l.f(th2, C0637e.f7371a);
        uk.c cVar = this.f28260c;
        if (cVar != null) {
            cVar.c();
        }
        ((ej.b) this.f28259b).b();
        ((g.a) this.f28258a).f(th2);
    }
}
