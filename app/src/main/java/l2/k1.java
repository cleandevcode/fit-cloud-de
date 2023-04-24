package l2;

import l2.n0;
import l2.t1;

@zl.e(c = "androidx.paging.PageFetcherSnapshot$collectAsGenerationalViewportHints$$inlined$simpleFlatMapLatest$1", f = "PageFetcherSnapshot.kt", l = {229, 244}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class k1 extends zl.i implements fm.q<sm.g<? super g0>, Integer, xl.d<? super tl.l>, Object> {

    /* renamed from: e */
    public int f19046e;

    /* renamed from: f */
    public /* synthetic */ sm.g f19047f;

    /* renamed from: g */
    public /* synthetic */ Object f19048g;

    /* renamed from: h */
    public final /* synthetic */ i1 f19049h;

    /* renamed from: i */
    public final /* synthetic */ r0 f19050i;

    /* renamed from: j */
    public ym.c f19051j;

    /* renamed from: k */
    public int f19052k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k1(r0 r0Var, i1 i1Var, xl.d dVar) {
        super(3, dVar);
        this.f19049h = i1Var;
        this.f19050i = r0Var;
    }

    @Override // fm.q
    public final Object j(sm.g<? super g0> gVar, Integer num, xl.d<? super tl.l> dVar) {
        i1 i1Var = this.f19049h;
        k1 k1Var = new k1(this.f19050i, i1Var, dVar);
        k1Var.f19047f = gVar;
        k1Var.f19048g = num;
        return k1Var.t(tl.l.f28297a);
    }

    @Override // zl.a
    public final Object t(Object obj) {
        sm.g gVar;
        int intValue;
        t1.a aVar;
        ym.c cVar;
        sm.f m1Var;
        yl.a aVar2 = yl.a.COROUTINE_SUSPENDED;
        int i10 = this.f19046e;
        int i11 = 1;
        try {
            if (i10 != 0) {
                if (i10 != 1) {
                    if (i10 == 2) {
                        mf.a0.k(obj);
                        return tl.l.f28297a;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                intValue = this.f19052k;
                cVar = this.f19051j;
                aVar = (t1.a) this.f19048g;
                gVar = this.f19047f;
                mf.a0.k(obj);
            } else {
                mf.a0.k(obj);
                gVar = this.f19047f;
                intValue = ((Number) this.f19048g).intValue();
                aVar = this.f19049h.f18985l;
                cVar = aVar.f19265a;
                this.f19047f = gVar;
                this.f19048g = aVar;
                this.f19051j = cVar;
                this.f19052k = intValue;
                this.f19046e = 1;
                if (cVar.b(this) == aVar2) {
                    return aVar2;
                }
            }
            t1<Key, Value> t1Var = aVar.f19266b;
            if (gm.l.a(t1Var.f19264l.a(this.f19050i), n0.c.f19108b)) {
                m1Var = new sm.h(new g0[0]);
            } else {
                if (!(t1Var.f19264l.a(this.f19050i) instanceof n0.a)) {
                    t1Var.f19264l.c(this.f19050i, n0.c.f19109c);
                }
                tl.l lVar = tl.l.f28297a;
                cVar.a(null);
                sm.w0 a10 = this.f19049h.f18982i.a(this.f19050i);
                if (intValue == 0) {
                    i11 = 0;
                }
                m1Var = new m1(bi.r.u(a10, i11), intValue);
            }
            this.f19047f = null;
            this.f19048g = null;
            this.f19051j = null;
            this.f19046e = 2;
            if (bi.r.v(this, m1Var, gVar) == aVar2) {
                return aVar2;
            }
            return tl.l.f28297a;
        } finally {
            cVar.a(null);
        }
    }
}
