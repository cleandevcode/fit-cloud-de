package kc;

import java.util.concurrent.ExecutorService;

/* loaded from: classes.dex */
public final class b implements a {

    /* renamed from: a */
    public final /* synthetic */ ExecutorService f18263a;

    /* renamed from: b */
    public final /* synthetic */ tk.o f18264b;

    /* renamed from: c */
    public final /* synthetic */ ExecutorService f18265c;

    public b(ExecutorService executorService, tk.o oVar, ExecutorService executorService2) {
        this.f18263a = executorService;
        this.f18264b = oVar;
        this.f18265c = executorService2;
    }

    @Override // kc.a
    public final void a() {
        this.f18263a.shutdown();
        this.f18264b.f();
        this.f18265c.shutdown();
    }
}
