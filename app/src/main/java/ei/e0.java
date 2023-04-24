package ei;

import com.topstep.fitcloud.pro.ui.friend.FriendMsgVieModel;

@zl.e(c = "com.topstep.fitcloud.pro.ui.friend.FriendMsgVieModel$process$1", f = "FriendMsgFragment.kt", l = {127, 129}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class e0 extends zl.i implements fm.l<xl.d<? super Boolean>, Object> {

    /* renamed from: e */
    public int f13717e;

    /* renamed from: f */
    public final /* synthetic */ boolean f13718f;

    /* renamed from: g */
    public final /* synthetic */ FriendMsgVieModel f13719g;

    /* renamed from: h */
    public final /* synthetic */ long f13720h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(boolean z10, FriendMsgVieModel friendMsgVieModel, long j10, xl.d<? super e0> dVar) {
        super(1, dVar);
        this.f13718f = z10;
        this.f13719g = friendMsgVieModel;
        this.f13720h = j10;
    }

    @Override // fm.l
    public final Object k(xl.d<? super Boolean> dVar) {
        return new e0(this.f13718f, this.f13719g, this.f13720h, dVar).t(tl.l.f28297a);
    }

    @Override // zl.a
    public final Object t(Object obj) {
        yl.a aVar = yl.a.COROUTINE_SUSPENDED;
        int i10 = this.f13717e;
        if (i10 != 0) {
            if (i10 != 1 && i10 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            mf.a0.k(obj);
        } else {
            mf.a0.k(obj);
            if (this.f13718f) {
                tg.c cVar = this.f13719g.f11623j;
                long j10 = this.f13720h;
                this.f13717e = 1;
                if (cVar.d(j10, this) == aVar) {
                    return aVar;
                }
            } else {
                tg.c cVar2 = this.f13719g.f11623j;
                long j11 = this.f13720h;
                this.f13717e = 2;
                if (cVar2.j(j11, this) == aVar) {
                    return aVar;
                }
            }
        }
        return Boolean.valueOf(this.f13718f);
    }
}
