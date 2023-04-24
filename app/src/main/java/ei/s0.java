package ei;

import com.topstep.fitcloud.pro.model.config.UserInfo;
import com.topstep.fitcloud.pro.model.friend.Friend;
import com.topstep.fitcloud.pro.ui.friend.FriendSearchViewModel;

@zl.e(c = "com.topstep.fitcloud.pro.ui.friend.FriendSearchViewModel$check$1", f = "FriendSearchFragment.kt", l = {187}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class s0 extends zl.i implements fm.l<xl.d<? super g>, Object> {

    /* renamed from: e */
    public int f13784e;

    /* renamed from: f */
    public final /* synthetic */ FriendSearchViewModel f13785f;

    /* renamed from: g */
    public final /* synthetic */ UserInfo f13786g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s0(FriendSearchViewModel friendSearchViewModel, UserInfo userInfo, xl.d<? super s0> dVar) {
        super(1, dVar);
        this.f13785f = friendSearchViewModel;
        this.f13786g = userInfo;
    }

    @Override // fm.l
    public final Object k(xl.d<? super g> dVar) {
        return new s0(this.f13785f, this.f13786g, dVar).t(tl.l.f28297a);
    }

    @Override // zl.a
    public final Object t(Object obj) {
        yl.a aVar = yl.a.COROUTINE_SUSPENDED;
        int i10 = this.f13784e;
        if (i10 != 0) {
            if (i10 == 1) {
                mf.a0.k(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            mf.a0.k(obj);
            tg.c cVar = this.f13785f.f11680j;
            long userId = this.f13786g.getUserId();
            this.f13784e = 1;
            obj = cVar.a(userId, this);
            if (obj == aVar) {
                return aVar;
            }
        }
        Friend friend = (Friend) obj;
        if (friend == null) {
            return new g(null, this.f13786g);
        }
        return new g(friend, null);
    }
}
