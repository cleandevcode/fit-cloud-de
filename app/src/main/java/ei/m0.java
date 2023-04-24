package ei;

import com.topstep.fitcloud.pro.ui.friend.FriendRenameViewModel;

@zl.e(c = "com.topstep.fitcloud.pro.ui.friend.FriendRenameViewModel$rename$1", f = "FriendRenameFragment.kt", l = {81}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class m0 extends zl.i implements fm.l<xl.d<? super String>, Object> {

    /* renamed from: e */
    public int f13765e;

    /* renamed from: f */
    public final /* synthetic */ FriendRenameViewModel f13766f;

    /* renamed from: g */
    public final /* synthetic */ long f13767g;

    /* renamed from: h */
    public final /* synthetic */ String f13768h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m0(FriendRenameViewModel friendRenameViewModel, long j10, String str, xl.d<? super m0> dVar) {
        super(1, dVar);
        this.f13766f = friendRenameViewModel;
        this.f13767g = j10;
        this.f13768h = str;
    }

    @Override // fm.l
    public final Object k(xl.d<? super String> dVar) {
        return new m0(this.f13766f, this.f13767g, this.f13768h, dVar).t(tl.l.f28297a);
    }

    @Override // zl.a
    public final Object t(Object obj) {
        yl.a aVar = yl.a.COROUTINE_SUSPENDED;
        int i10 = this.f13765e;
        if (i10 != 0) {
            if (i10 == 1) {
                mf.a0.k(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            mf.a0.k(obj);
            tg.c cVar = this.f13766f.f11653j;
            long j10 = this.f13767g;
            String str = this.f13768h;
            this.f13765e = 1;
            if (cVar.f(j10, str, this) == aVar) {
                return aVar;
            }
        }
        return this.f13768h;
    }
}
