package ei;

import com.topstep.fitcloud.pro.ui.friend.FriendDataViewModel;

@zl.e(c = "com.topstep.fitcloud.pro.ui.friend.FriendDataViewModel$friendRemove$1", f = "FriendDataFragment.kt", l = {274}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class l extends zl.i implements fm.l<xl.d<? super tl.l>, Object> {

    /* renamed from: e */
    public int f13761e;

    /* renamed from: f */
    public final /* synthetic */ FriendDataViewModel f13762f;

    /* renamed from: g */
    public final /* synthetic */ long f13763g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(FriendDataViewModel friendDataViewModel, long j10, xl.d<? super l> dVar) {
        super(1, dVar);
        this.f13762f = friendDataViewModel;
        this.f13763g = j10;
    }

    @Override // fm.l
    public final Object k(xl.d<? super tl.l> dVar) {
        return new l(this.f13762f, this.f13763g, dVar).t(tl.l.f28297a);
    }

    @Override // zl.a
    public final Object t(Object obj) {
        yl.a aVar = yl.a.COROUTINE_SUSPENDED;
        int i10 = this.f13761e;
        if (i10 != 0) {
            if (i10 == 1) {
                mf.a0.k(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            mf.a0.k(obj);
            tg.c cVar = this.f13762f.f11510j;
            long j10 = this.f13763g;
            this.f13761e = 1;
            if (cVar.b(j10, this) == aVar) {
                return aVar;
            }
        }
        return tl.l.f28297a;
    }
}
