package l2;

import l2.b1;
import l2.t1;

@zl.e(c = "androidx.paging.PageFetcherSnapshot$pageEventFlow$2", f = "PageFetcherSnapshot.kt", l = {608, 174}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class p1 extends zl.i implements fm.p<sm.g<? super b1<Object>>, xl.d<? super tl.l>, Object> {

    /* renamed from: e */
    public ym.c f19183e;

    /* renamed from: f */
    public sm.g f19184f;

    /* renamed from: g */
    public int f19185g;

    /* renamed from: h */
    public /* synthetic */ Object f19186h;

    /* renamed from: i */
    public final /* synthetic */ i1<Object, Object> f19187i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p1(i1<Object, Object> i1Var, xl.d<? super p1> dVar) {
        super(2, dVar);
        this.f19187i = i1Var;
    }

    @Override // fm.p
    public final Object A(sm.g<? super b1<Object>> gVar, xl.d<? super tl.l> dVar) {
        return ((p1) p(gVar, dVar)).t(tl.l.f28297a);
    }

    @Override // zl.a
    public final xl.d<tl.l> p(Object obj, xl.d<?> dVar) {
        p1 p1Var = new p1(this.f19187i, dVar);
        p1Var.f19186h = obj;
        return p1Var;
    }

    @Override // zl.a
    public final Object t(Object obj) {
        sm.g gVar;
        t1.a<Object, Object> aVar;
        ym.c cVar;
        yl.a aVar2 = yl.a.COROUTINE_SUSPENDED;
        int i10 = this.f19185g;
        try {
            if (i10 != 0) {
                if (i10 != 1) {
                    if (i10 == 2) {
                        mf.a0.k(obj);
                        return tl.l.f28297a;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                gVar = this.f19184f;
                cVar = this.f19183e;
                aVar = (t1.a) this.f19186h;
                mf.a0.k(obj);
            } else {
                mf.a0.k(obj);
                gVar = (sm.g) this.f19186h;
                aVar = this.f19187i.f18985l;
                ym.c cVar2 = aVar.f19265a;
                this.f19186h = aVar;
                this.f19183e = cVar2;
                this.f19184f = gVar;
                this.f19185g = 1;
                if (cVar2.b(this) == aVar2) {
                    return aVar2;
                }
                cVar = cVar2;
            }
            q0 d10 = aVar.f19266b.f19264l.d();
            cVar.a(null);
            b1.c cVar3 = new b1.c(d10, null);
            this.f19186h = null;
            this.f19183e = null;
            this.f19184f = null;
            this.f19185g = 2;
            if (gVar.n(cVar3, this) == aVar2) {
                return aVar2;
            }
            return tl.l.f28297a;
        } catch (Throwable th2) {
            cVar.a(null);
            throw th2;
        }
    }
}
