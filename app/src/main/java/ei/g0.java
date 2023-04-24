package ei;

import com.topstep.fitcloud.pro.model.friend.FriendMsg;
import com.topstep.fitcloud.pro.ui.friend.FriendMsgVieModel;
import java.util.List;

@zl.e(c = "com.topstep.fitcloud.pro.ui.friend.FriendMsgVieModel$requestFriendMsgs$1", f = "FriendMsgFragment.kt", l = {115}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class g0 extends zl.i implements fm.l<xl.d<? super List<FriendMsg>>, Object> {

    /* renamed from: e */
    public int f13735e;

    /* renamed from: f */
    public final /* synthetic */ FriendMsgVieModel f13736f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(FriendMsgVieModel friendMsgVieModel, xl.d<? super g0> dVar) {
        super(1, dVar);
        this.f13736f = friendMsgVieModel;
    }

    @Override // fm.l
    public final Object k(xl.d<? super List<FriendMsg>> dVar) {
        return new g0(this.f13736f, dVar).t(tl.l.f28297a);
    }

    @Override // zl.a
    public final Object t(Object obj) {
        yl.a aVar = yl.a.COROUTINE_SUSPENDED;
        int i10 = this.f13735e;
        if (i10 != 0) {
            if (i10 == 1) {
                mf.a0.k(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            mf.a0.k(obj);
            tg.c cVar = this.f13736f.f11623j;
            this.f13735e = 1;
            obj = cVar.e(this);
            if (obj == aVar) {
                return aVar;
            }
        }
        List list = (List) obj;
        if (list != null) {
            return ul.q.Z(list);
        }
        return null;
    }
}
