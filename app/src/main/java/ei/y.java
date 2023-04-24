package ei;

import com.topstep.fitcloud.pro.ui.friend.FriendInfoViewModel;

@zl.e(c = "com.topstep.fitcloud.pro.ui.friend.FriendInfoViewModel$friendRemove$1", f = "FriendInfoFragment.kt", l = {105}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class y extends zl.i implements fm.l<xl.d<? super tl.l>, Object> {

    /* renamed from: e */
    public int f13804e;

    /* renamed from: f */
    public final /* synthetic */ FriendInfoViewModel f13805f;

    /* renamed from: g */
    public final /* synthetic */ long f13806g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(FriendInfoViewModel friendInfoViewModel, long j10, xl.d<? super y> dVar) {
        super(1, dVar);
        this.f13805f = friendInfoViewModel;
        this.f13806g = j10;
    }

    @Override // fm.l
    public final Object k(xl.d<? super tl.l> dVar) {
        return new y(this.f13805f, this.f13806g, dVar).t(tl.l.f28297a);
    }

    @Override // zl.a
    public final Object t(Object obj) {
        yl.a aVar = yl.a.COROUTINE_SUSPENDED;
        int i10 = this.f13804e;
        if (i10 != 0) {
            if (i10 == 1) {
                mf.a0.k(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            mf.a0.k(obj);
            tg.c cVar = this.f13805f.f11573j;
            long j10 = this.f13806g;
            this.f13804e = 1;
            if (cVar.b(j10, this) == aVar) {
                return aVar;
            }
        }
        return tl.l.f28297a;
    }
}
