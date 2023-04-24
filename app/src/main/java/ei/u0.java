package ei;

import com.topstep.fitcloud.pro.model.config.UserInfo;
import com.topstep.fitcloud.pro.ui.friend.FriendSearchViewModel;
import java.util.List;

@zl.e(c = "com.topstep.fitcloud.pro.ui.friend.FriendSearchViewModel$search$1", f = "FriendSearchFragment.kt", l = {179}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class u0 extends zl.i implements fm.l<xl.d<? super List<? extends UserInfo>>, Object> {

    /* renamed from: e */
    public int f13791e;

    /* renamed from: f */
    public final /* synthetic */ FriendSearchViewModel f13792f;

    /* renamed from: g */
    public final /* synthetic */ String f13793g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u0(FriendSearchViewModel friendSearchViewModel, String str, xl.d<? super u0> dVar) {
        super(1, dVar);
        this.f13792f = friendSearchViewModel;
        this.f13793g = str;
    }

    @Override // fm.l
    public final Object k(xl.d<? super List<? extends UserInfo>> dVar) {
        return new u0(this.f13792f, this.f13793g, dVar).t(tl.l.f28297a);
    }

    @Override // zl.a
    public final Object t(Object obj) {
        yl.a aVar = yl.a.COROUTINE_SUSPENDED;
        int i10 = this.f13791e;
        if (i10 != 0) {
            if (i10 == 1) {
                mf.a0.k(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            mf.a0.k(obj);
            tg.c cVar = this.f13792f.f11680j;
            String str = this.f13793g;
            this.f13791e = 1;
            obj = cVar.g(str, this);
            if (obj == aVar) {
                return aVar;
            }
        }
        return obj;
    }
}
