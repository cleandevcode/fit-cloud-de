package ei;

import com.topstep.fitcloud.pro.ui.friend.FriendDataViewModel;

@zl.e(c = "com.topstep.fitcloud.pro.ui.friend.FriendDataViewModel$requestTotalData$1", f = "FriendDataFragment.kt", l = {282}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class n extends zl.i implements fm.l<xl.d<? super yf.a>, Object> {

    /* renamed from: e */
    public int f13769e;

    /* renamed from: f */
    public final /* synthetic */ FriendDataViewModel f13770f;

    /* renamed from: g */
    public final /* synthetic */ long f13771g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(FriendDataViewModel friendDataViewModel, long j10, xl.d<? super n> dVar) {
        super(1, dVar);
        this.f13770f = friendDataViewModel;
        this.f13771g = j10;
    }

    @Override // fm.l
    public final Object k(xl.d<? super yf.a> dVar) {
        return new n(this.f13770f, this.f13771g, dVar).t(tl.l.f28297a);
    }

    @Override // zl.a
    public final Object t(Object obj) {
        yl.a aVar = yl.a.COROUTINE_SUSPENDED;
        int i10 = this.f13769e;
        if (i10 != 0) {
            if (i10 == 1) {
                mf.a0.k(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            mf.a0.k(obj);
            tg.a aVar2 = this.f13770f.f11511k;
            long j10 = this.f13771g;
            this.f13769e = 1;
            obj = aVar2.b(j10, this);
            if (obj == aVar) {
                return aVar;
            }
        }
        return obj;
    }
}
