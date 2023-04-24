package y3;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import xl.f;
import y3.b0;

/* loaded from: classes.dex */
public final class f<S extends b0> implements d0<S> {

    /* renamed from: h */
    public static final pm.y0 f30946h;

    /* renamed from: a */
    public final pm.e0 f30947a;

    /* renamed from: b */
    public final xl.f f30948b;

    /* renamed from: c */
    public final rm.a f30949c;

    /* renamed from: d */
    public final rm.a f30950d;

    /* renamed from: e */
    public final sm.w0 f30951e;

    /* renamed from: f */
    public volatile S f30952f;

    /* renamed from: g */
    public final sm.s0 f30953g;

    static {
        ExecutorService newCachedThreadPool = Executors.newCachedThreadPool();
        gm.l.e(newCachedThreadPool, "newCachedThreadPool()");
        f30946h = new pm.y0(newCachedThreadPool);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public f(b0 b0Var, um.f fVar, xl.f fVar2) {
        gm.l.f(b0Var, "initialState");
        gm.l.f(fVar2, "contextOverride");
        this.f30947a = fVar;
        this.f30948b = fVar2;
        this.f30949c = jh.v.a(Integer.MAX_VALUE, null, 6);
        this.f30950d = jh.v.a(Integer.MAX_VALUE, null, 6);
        sm.w0 c10 = qi.h.c(1, 63, rm.f.SUSPEND);
        c10.d(b0Var);
        this.f30951e = c10;
        this.f30952f = b0Var;
        this.f30953g = new sm.s0(c10, null);
        Boolean bool = e0.f30944a;
        pm.y0 y0Var = f30946h;
        y0Var.getClass();
        bi.z0.g(fVar, f.a.a(y0Var, fVar2), 0, new e(this, null), 2);
    }

    public static final Object e(f fVar, xl.d dVar) {
        fVar.getClass();
        xm.a aVar = new xm.a(dVar);
        try {
            rm.a aVar2 = fVar.f30949c;
            aVar2.getClass();
            rm.a.r(0, new c(fVar, null), aVar2, aVar);
            rm.a aVar3 = fVar.f30950d;
            aVar3.getClass();
            rm.a.r(0, new d(fVar, null), aVar3, aVar);
        } catch (Throwable th2) {
            aVar.T(th2);
        }
        Object S = aVar.S();
        yl.a aVar4 = yl.a.COROUTINE_SUSPENDED;
        if (S == aVar4) {
            gm.l.f(dVar, "frame");
        }
        if (S != aVar4) {
            return tl.l.f28297a;
        }
        return S;
    }

    @Override // y3.d0
    public final sm.s0 a() {
        return this.f30953g;
    }

    @Override // y3.d0
    public final void b(v vVar) {
        this.f30950d.p(vVar);
        Boolean bool = e0.f30944a;
    }

    @Override // y3.d0
    public final void c(fm.l<? super S, ? extends S> lVar) {
        this.f30949c.p(lVar);
        Boolean bool = e0.f30944a;
    }

    @Override // y3.d0
    public final b0 d() {
        return this.f30952f;
    }
}
