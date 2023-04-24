package u6;

import bi.z0;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import pm.e0;
import pm.y0;
import sm.s0;
import sm.w0;
import u6.o;
import xl.f;

/* loaded from: classes.dex */
public final class e<S extends o> {

    /* renamed from: h */
    public static final y0 f28534h;

    /* renamed from: a */
    public final e0 f28535a;

    /* renamed from: b */
    public final xl.f f28536b;

    /* renamed from: c */
    public final rm.a f28537c;

    /* renamed from: d */
    public final rm.a f28538d;

    /* renamed from: e */
    public final w0 f28539e;

    /* renamed from: f */
    public volatile S f28540f;

    /* renamed from: g */
    public final s0 f28541g;

    static {
        ExecutorService newCachedThreadPool = Executors.newCachedThreadPool();
        gm.l.e(newCachedThreadPool, "newCachedThreadPool()");
        f28534h = new y0(newCachedThreadPool);
    }

    public e(S s10, e0 e0Var, xl.f fVar) {
        gm.l.f(s10, "initialState");
        gm.l.f(fVar, "contextOverride");
        this.f28535a = e0Var;
        this.f28536b = fVar;
        this.f28537c = jh.v.a(Integer.MAX_VALUE, null, 6);
        this.f28538d = jh.v.a(Integer.MAX_VALUE, null, 6);
        w0 c10 = qi.h.c(1, 63, rm.f.SUSPEND);
        c10.d(s10);
        this.f28539e = c10;
        this.f28540f = s10;
        this.f28541g = new s0(c10, null);
        Boolean bool = p.f28602a;
        y0 y0Var = f28534h;
        y0Var.getClass();
        z0.g(e0Var, f.a.a(y0Var, fVar), 0, new d(this, null), 2);
    }

    public static final Object a(e eVar, xl.d dVar) {
        eVar.getClass();
        xm.a aVar = new xm.a(dVar);
        try {
            rm.a aVar2 = eVar.f28537c;
            aVar2.getClass();
            rm.a.r(0, new b(eVar, null), aVar2, aVar);
            rm.a aVar3 = eVar.f28538d;
            aVar3.getClass();
            rm.a.r(0, new c(eVar, null), aVar3, aVar);
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
}
