package yg;

@zl.e(c = "com.topstep.fitcloud.pro.shared.data.storage.UserStorageManagerImpl$flowWomenHealthMode$$inlined$flatMapLatest$1", f = "UserStorageManager.kt", l = {219, 190}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class a0 extends zl.i implements fm.q<sm.g<? super Integer>, o, xl.d<? super tl.l>, Object> {

    /* renamed from: e */
    public int f31477e;

    /* renamed from: f */
    public /* synthetic */ sm.g f31478f;

    /* renamed from: g */
    public /* synthetic */ Object f31479g;

    /* renamed from: h */
    public final /* synthetic */ long f31480h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(long j10, xl.d dVar) {
        super(3, dVar);
        this.f31480h = j10;
    }

    @Override // fm.q
    public final Object j(sm.g<? super Integer> gVar, o oVar, xl.d<? super tl.l> dVar) {
        a0 a0Var = new a0(this.f31480h, dVar);
        a0Var.f31478f = gVar;
        a0Var.f31479g = oVar;
        return a0Var.t(tl.l.f28297a);
    }

    @Override // zl.a
    public final Object t(Object obj) {
        sm.g gVar;
        yl.a aVar = yl.a.COROUTINE_SUSPENDED;
        int i10 = this.f31477e;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 == 2) {
                    mf.a0.k(obj);
                    return tl.l.f28297a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            gVar = this.f31478f;
            mf.a0.k(obj);
        } else {
            mf.a0.k(obj);
            gVar = this.f31478f;
            o oVar = (o) this.f31479g;
            if (oVar != null && oVar.n() == this.f31480h) {
                this.f31478f = gVar;
                this.f31477e = 1;
                obj = oVar.v();
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                obj = new sm.i(null);
            }
        }
        this.f31478f = null;
        this.f31477e = 2;
        if (bi.r.v(this, (sm.f) obj, gVar) == aVar) {
            return aVar;
        }
        return tl.l.f28297a;
    }
}
