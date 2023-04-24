package kc;

import java.util.concurrent.ExecutorService;

/* loaded from: classes.dex */
public final class f implements v3.c<tk.o> {

    /* renamed from: a */
    public final w3.a<ExecutorService> f18318a;

    public f(w3.a<ExecutorService> aVar) {
        this.f18318a = aVar;
    }

    @Override // w3.a
    public final Object get() {
        tk.o oVar = pl.a.f24279a;
        return new il.d(this.f18318a.get());
    }
}
