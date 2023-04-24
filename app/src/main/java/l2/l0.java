package l2;

import l2.l2;

@zl.e(c = "androidx.paging.LegacyPagingSource$load$2", f = "LegacyPagingSource.kt", l = {111}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class l0 extends zl.i implements fm.p<pm.e0, xl.d<? super l2.b.c<Object, Object>>, Object> {

    /* renamed from: e */
    public int f19066e;

    /* renamed from: f */
    public final /* synthetic */ m0<Object, Object> f19067f;

    /* renamed from: g */
    public final /* synthetic */ x<Object> f19068g;

    /* renamed from: h */
    public final /* synthetic */ l2.a<Object> f19069h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0(m0<Object, Object> m0Var, x<Object> xVar, l2.a<Object> aVar, xl.d<? super l0> dVar) {
        super(2, dVar);
        this.f19067f = m0Var;
        this.f19068g = xVar;
        this.f19069h = aVar;
    }

    @Override // fm.p
    public final Object A(pm.e0 e0Var, xl.d<? super l2.b.c<Object, Object>> dVar) {
        ((l0) p(e0Var, dVar)).t(tl.l.f28297a);
        throw null;
    }

    @Override // zl.a
    public final xl.d<tl.l> p(Object obj, xl.d<?> dVar) {
        return new l0(this.f19067f, this.f19068g, this.f19069h, dVar);
    }

    @Override // zl.a
    public final Object t(Object obj) {
        int i10 = this.f19066e;
        if (i10 == 0) {
            mf.a0.k(obj);
            this.f19067f.getClass();
            this.f19066e = 1;
            throw null;
        } else if (i10 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            mf.a0.k(obj);
            ((w) obj).getClass();
            throw null;
        }
    }
}
