package m2;

import java.util.concurrent.atomic.AtomicInteger;
import pm.g1;
import xl.f;

/* loaded from: classes.dex */
public final class b0 implements f.b {

    /* renamed from: d */
    public static final a f20180d = new a();

    /* renamed from: a */
    public final g1 f20181a;

    /* renamed from: b */
    public final xl.e f20182b;

    /* renamed from: c */
    public final AtomicInteger f20183c;

    /* loaded from: classes.dex */
    public static final class a implements f.c<b0> {
    }

    public b0(pm.s sVar, xl.e eVar) {
        gm.l.f(sVar, "transactionThreadControlJob");
        gm.l.f(eVar, "transactionDispatcher");
        this.f20181a = sVar;
        this.f20182b = eVar;
        this.f20183c = new AtomicInteger(0);
    }

    @Override // xl.f
    public final <R> R Z(R r10, fm.p<? super R, ? super f.b, ? extends R> pVar) {
        return pVar.A(r10, this);
    }

    @Override // xl.f.b, xl.f
    public final <E extends f.b> E b(f.c<E> cVar) {
        return (E) f.b.a.a(this, cVar);
    }

    @Override // xl.f.b
    public final f.c<b0> getKey() {
        return f20180d;
    }

    @Override // xl.f
    public final xl.f s(xl.f fVar) {
        gm.l.f(fVar, "context");
        return f.a.a(this, fVar);
    }

    @Override // xl.f
    public final xl.f y(f.c<?> cVar) {
        return f.b.a.b(this, cVar);
    }
}
