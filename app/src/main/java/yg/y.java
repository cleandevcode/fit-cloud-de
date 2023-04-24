package yg;

@zl.e(c = "com.topstep.fitcloud.pro.shared.data.storage.UserStorageManagerImpl$flowLastSyncTime$$inlined$flatMapLatest$1", f = "UserStorageManager.kt", l = {190}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class y extends zl.i implements fm.q<sm.g<? super Long>, o, xl.d<? super tl.l>, Object> {

    /* renamed from: e */
    public int f31670e;

    /* renamed from: f */
    public /* synthetic */ sm.g f31671f;

    /* renamed from: g */
    public /* synthetic */ Object f31672g;

    /* renamed from: h */
    public final /* synthetic */ long f31673h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(long j10, xl.d dVar) {
        super(3, dVar);
        this.f31673h = j10;
    }

    @Override // fm.q
    public final Object j(sm.g<? super Long> gVar, o oVar, xl.d<? super tl.l> dVar) {
        y yVar = new y(this.f31673h, dVar);
        yVar.f31671f = gVar;
        yVar.f31672g = oVar;
        return yVar.t(tl.l.f28297a);
    }

    @Override // zl.a
    public final Object t(Object obj) {
        sm.f iVar;
        yl.a aVar = yl.a.COROUTINE_SUSPENDED;
        int i10 = this.f31670e;
        if (i10 != 0) {
            if (i10 == 1) {
                mf.a0.k(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            mf.a0.k(obj);
            sm.g gVar = this.f31671f;
            o oVar = (o) this.f31672g;
            if (oVar != null && oVar.n() == this.f31673h) {
                iVar = oVar.t();
            } else {
                iVar = new sm.i(new Long(0L));
            }
            this.f31670e = 1;
            if (bi.r.v(this, iVar, gVar) == aVar) {
                return aVar;
            }
        }
        return tl.l.f28297a;
    }
}
