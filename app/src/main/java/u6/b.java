package u6;

import sm.w0;

@zl.e(c = "com.github.airbnb.mvrx.CoroutinesStateStore$flushQueuesOnce$2$1", f = "CoroutinesStateStore.kt", l = {83}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class b extends zl.i implements fm.p<fm.l<o, o>, xl.d<? super tl.l>, Object> {

    /* renamed from: e */
    public int f28524e;

    /* renamed from: f */
    public /* synthetic */ Object f28525f;

    /* renamed from: g */
    public final /* synthetic */ e<o> f28526g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(e<o> eVar, xl.d<? super b> dVar) {
        super(2, dVar);
        this.f28526g = eVar;
    }

    @Override // fm.p
    public final Object A(fm.l<o, o> lVar, xl.d<? super tl.l> dVar) {
        return ((b) p(lVar, dVar)).t(tl.l.f28297a);
    }

    @Override // zl.a
    public final xl.d<tl.l> p(Object obj, xl.d<?> dVar) {
        b bVar = new b(this.f28526g, dVar);
        bVar.f28525f = obj;
        return bVar;
    }

    @Override // zl.a
    public final Object t(Object obj) {
        yl.a aVar = yl.a.COROUTINE_SUSPENDED;
        int i10 = this.f28524e;
        if (i10 != 0) {
            if (i10 == 1) {
                mf.a0.k(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            mf.a0.k(obj);
            S s10 = (S) ((fm.l) this.f28525f).k(this.f28526g.f28540f);
            if (!gm.l.a(s10, this.f28526g.f28540f)) {
                e<o> eVar = this.f28526g;
                eVar.getClass();
                gm.l.f(s10, "<set-?>");
                eVar.f28540f = s10;
                w0 w0Var = this.f28526g.f28539e;
                this.f28524e = 1;
                if (w0Var.n(s10, this) == aVar) {
                    return aVar;
                }
            }
        }
        return tl.l.f28297a;
    }
}
