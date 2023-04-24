package yg;

@zl.e(c = "com.topstep.fitcloud.pro.shared.data.storage.UserStorageManagerImpl$flowFriendMsgUnreadCount$$inlined$flatMapLatest$1", f = "UserStorageManager.kt", l = {219, 190}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class w extends zl.i implements fm.q<sm.g<? super Integer>, o, xl.d<? super tl.l>, Object> {

    /* renamed from: e */
    public int f31663e;

    /* renamed from: f */
    public /* synthetic */ sm.g f31664f;

    /* renamed from: g */
    public /* synthetic */ Object f31665g;

    /* renamed from: h */
    public final /* synthetic */ long f31666h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(long j10, xl.d dVar) {
        super(3, dVar);
        this.f31666h = j10;
    }

    @Override // fm.q
    public final Object j(sm.g<? super Integer> gVar, o oVar, xl.d<? super tl.l> dVar) {
        w wVar = new w(this.f31666h, dVar);
        wVar.f31664f = gVar;
        wVar.f31665g = oVar;
        return wVar.t(tl.l.f28297a);
    }

    @Override // zl.a
    public final Object t(Object obj) {
        sm.g gVar;
        yl.a aVar = yl.a.COROUTINE_SUSPENDED;
        int i10 = this.f31663e;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 == 2) {
                    mf.a0.k(obj);
                    return tl.l.f28297a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            gVar = this.f31664f;
            mf.a0.k(obj);
        } else {
            mf.a0.k(obj);
            gVar = this.f31664f;
            o oVar = (o) this.f31665g;
            if (oVar != null && oVar.n() == this.f31666h) {
                this.f31664f = gVar;
                this.f31663e = 1;
                obj = oVar.j();
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                obj = new sm.i(new Integer(0));
            }
        }
        this.f31664f = null;
        this.f31663e = 2;
        if (bi.r.v(this, (sm.f) obj, gVar) == aVar) {
            return aVar;
        }
        return tl.l.f28297a;
    }
}
