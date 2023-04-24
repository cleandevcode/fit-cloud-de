package y3;

@zl.e(c = "com.airbnb.mvrx.MavericksViewModelExtensionsKt$_internalSF$1", f = "MavericksViewModelExtensions.kt", l = {138, 140}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class q0 extends zl.i implements fm.p<b<Object>, xl.d<? super tl.l>, Object> {

    /* renamed from: e */
    public int f31014e;

    /* renamed from: f */
    public /* synthetic */ Object f31015f;

    /* renamed from: g */
    public final /* synthetic */ fm.p<Object, xl.d<? super tl.l>, Object> f31016g;

    /* renamed from: h */
    public final /* synthetic */ fm.p<Throwable, xl.d<? super tl.l>, Object> f31017h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public q0(fm.p<Object, ? super xl.d<? super tl.l>, ? extends Object> pVar, fm.p<? super Throwable, ? super xl.d<? super tl.l>, ? extends Object> pVar2, xl.d<? super q0> dVar) {
        super(2, dVar);
        this.f31016g = pVar;
        this.f31017h = pVar2;
    }

    @Override // fm.p
    public final Object A(b<Object> bVar, xl.d<? super tl.l> dVar) {
        return ((q0) p(bVar, dVar)).t(tl.l.f28297a);
    }

    @Override // zl.a
    public final xl.d<tl.l> p(Object obj, xl.d<?> dVar) {
        q0 q0Var = new q0(this.f31016g, this.f31017h, dVar);
        q0Var.f31015f = obj;
        return q0Var;
    }

    @Override // zl.a
    public final Object t(Object obj) {
        yl.a aVar = yl.a.COROUTINE_SUSPENDED;
        int i10 = this.f31014e;
        if (i10 != 0) {
            if (i10 != 1 && i10 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            mf.a0.k(obj);
        } else {
            mf.a0.k(obj);
            b bVar = (b) this.f31015f;
            fm.p<Object, xl.d<? super tl.l>, Object> pVar = this.f31016g;
            if (pVar != null && (bVar instanceof c1)) {
                Object obj2 = ((c1) bVar).f30937b;
                this.f31014e = 1;
                if (pVar.A(obj2, this) == aVar) {
                    return aVar;
                }
            } else {
                fm.p<Throwable, xl.d<? super tl.l>, Object> pVar2 = this.f31017h;
                if (pVar2 != null && (bVar instanceof j)) {
                    Throwable th2 = ((j) bVar).f30961b;
                    this.f31014e = 2;
                    if (pVar2.A(th2, this) == aVar) {
                        return aVar;
                    }
                }
            }
        }
        return tl.l.f28297a;
    }
}
