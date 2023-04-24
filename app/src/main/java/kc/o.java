package kc;

import java.util.concurrent.ExecutorService;

/* loaded from: classes.dex */
public final class o implements v3.c<a> {

    /* renamed from: a */
    public final w3.a<ExecutorService> f18361a;

    /* renamed from: b */
    public final w3.a<tk.o> f18362b;

    /* renamed from: c */
    public final w3.a<ExecutorService> f18363c;

    public o(w3.a<ExecutorService> aVar, w3.a<tk.o> aVar2, w3.a<ExecutorService> aVar3) {
        this.f18361a = aVar;
        this.f18362b = aVar2;
        this.f18363c = aVar3;
    }

    @Override // w3.a
    public final Object get() {
        return new b(this.f18361a.get(), this.f18362b.get(), this.f18363c.get());
    }
}
