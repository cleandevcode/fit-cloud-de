package ei;

import com.topstep.fitcloud.pro.model.data.SimpleEcgRecord;
import com.topstep.fitcloud.pro.ui.friend.FriendEcgViewModel;
import java.util.List;

@zl.e(c = "com.topstep.fitcloud.pro.ui.friend.FriendEcgViewModel$requestList$1", f = "FriendEcgFragment.kt", l = {220}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class s extends zl.i implements fm.l<xl.d<? super List<? extends SimpleEcgRecord>>, Object> {

    /* renamed from: e */
    public int f13782e;

    /* renamed from: f */
    public final /* synthetic */ FriendEcgViewModel f13783f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(FriendEcgViewModel friendEcgViewModel, xl.d<? super s> dVar) {
        super(1, dVar);
        this.f13783f = friendEcgViewModel;
    }

    @Override // fm.l
    public final Object k(xl.d<? super List<? extends SimpleEcgRecord>> dVar) {
        return new s(this.f13783f, dVar).t(tl.l.f28297a);
    }

    @Override // zl.a
    public final Object t(Object obj) {
        yl.a aVar = yl.a.COROUTINE_SUSPENDED;
        int i10 = this.f13782e;
        if (i10 != 0) {
            if (i10 == 1) {
                mf.a0.k(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            mf.a0.k(obj);
            FriendEcgViewModel friendEcgViewModel = this.f13783f;
            tg.a aVar2 = friendEcgViewModel.f11543j;
            long userId = friendEcgViewModel.f11544k.f13779a.getUserId();
            this.f13782e = 1;
            obj = aVar2.f(userId, this);
            if (obj == aVar) {
                return aVar;
            }
        }
        return obj;
    }
}
