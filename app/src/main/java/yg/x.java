package yg;

@zl.e(c = "com.topstep.fitcloud.pro.shared.data.storage.UserStorageManagerImpl$flowHourStyle$$inlined$flatMapLatest$1", f = "UserStorageManager.kt", l = {190}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class x extends zl.i implements fm.q<sm.g<? super Integer>, o, xl.d<? super tl.l>, Object> {

    /* renamed from: e */
    public int f31667e;

    /* renamed from: f */
    public /* synthetic */ sm.g f31668f;

    /* renamed from: g */
    public /* synthetic */ Object f31669g;

    public x(xl.d dVar) {
        super(3, dVar);
    }

    @Override // fm.q
    public final Object j(sm.g<? super Integer> gVar, o oVar, xl.d<? super tl.l> dVar) {
        x xVar = new x(dVar);
        xVar.f31668f = gVar;
        xVar.f31669g = oVar;
        return xVar.t(tl.l.f28297a);
    }

    @Override // zl.a
    public final Object t(Object obj) {
        sm.f iVar;
        yl.a aVar = yl.a.COROUTINE_SUSPENDED;
        int i10 = this.f31667e;
        if (i10 != 0) {
            if (i10 == 1) {
                mf.a0.k(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            mf.a0.k(obj);
            sm.g gVar = this.f31668f;
            o oVar = (o) this.f31669g;
            if (oVar == null || (iVar = oVar.f()) == null) {
                iVar = new sm.i(new Integer(0));
            }
            this.f31667e = 1;
            if (bi.r.v(this, iVar, gVar) == aVar) {
                return aVar;
            }
        }
        return tl.l.f28297a;
    }
}
