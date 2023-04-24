package l2;

import l2.t1;

@zl.e(c = "androidx.paging.PageFetcherSnapshot$startConsumingHints$3", f = "PageFetcherSnapshot.kt", l = {608, 234}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class s1 extends zl.i implements fm.p<pm.e0, xl.d<? super tl.l>, Object> {

    /* renamed from: e */
    public t1.a f19242e;

    /* renamed from: f */
    public ym.c f19243f;

    /* renamed from: g */
    public i1 f19244g;

    /* renamed from: h */
    public int f19245h;

    /* renamed from: i */
    public final /* synthetic */ i1<Object, Object> f19246i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s1(i1<Object, Object> i1Var, xl.d<? super s1> dVar) {
        super(2, dVar);
        this.f19246i = i1Var;
    }

    @Override // fm.p
    public final Object A(pm.e0 e0Var, xl.d<? super tl.l> dVar) {
        return ((s1) p(e0Var, dVar)).t(tl.l.f28297a);
    }

    @Override // zl.a
    public final xl.d<tl.l> p(Object obj, xl.d<?> dVar) {
        return new s1(this.f19246i, dVar);
    }

    @Override // zl.a
    public final Object t(Object obj) {
        i1<Object, Object> i1Var;
        t1.a<Object, Object> aVar;
        ym.c cVar;
        yl.a aVar2 = yl.a.COROUTINE_SUSPENDED;
        int i10 = this.f19245h;
        try {
            if (i10 != 0) {
                if (i10 != 1) {
                    if (i10 == 2) {
                        mf.a0.k(obj);
                        return tl.l.f28297a;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                i1Var = this.f19244g;
                cVar = this.f19243f;
                aVar = this.f19242e;
                mf.a0.k(obj);
            } else {
                mf.a0.k(obj);
                i1Var = this.f19246i;
                aVar = i1Var.f18985l;
                ym.c cVar2 = aVar.f19265a;
                this.f19242e = aVar;
                this.f19243f = cVar2;
                this.f19244g = i1Var;
                this.f19245h = 1;
                if (cVar2.b(this) == aVar2) {
                    return aVar2;
                }
                cVar = cVar2;
            }
            t1<Object, Object> t1Var = aVar.f19266b;
            sm.o oVar = new sm.o(new u1(t1Var, null), bi.r.r(t1Var.f19262j));
            cVar.a(null);
            r0 r0Var = r0.APPEND;
            this.f19242e = null;
            this.f19243f = null;
            this.f19244g = null;
            this.f19245h = 2;
            if (i1.a(i1Var, oVar, r0Var, this) == aVar2) {
                return aVar2;
            }
            return tl.l.f28297a;
        } catch (Throwable th2) {
            cVar.a(null);
            throw th2;
        }
    }
}
