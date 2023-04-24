package ei;

import com.topstep.fitcloud.pro.ui.friend.FriendAddViewModel;

@zl.e(c = "com.topstep.fitcloud.pro.ui.friend.FriendAddViewModel$friendSend$1", f = "FriendAddFragment.kt", l = {110}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class e extends zl.i implements fm.l<xl.d<? super tl.l>, Object> {

    /* renamed from: e */
    public int f13712e;

    /* renamed from: f */
    public final /* synthetic */ FriendAddViewModel f13713f;

    /* renamed from: g */
    public final /* synthetic */ long f13714g;

    /* renamed from: h */
    public final /* synthetic */ String f13715h;

    /* renamed from: i */
    public final /* synthetic */ String f13716i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(FriendAddViewModel friendAddViewModel, long j10, String str, String str2, xl.d<? super e> dVar) {
        super(1, dVar);
        this.f13713f = friendAddViewModel;
        this.f13714g = j10;
        this.f13715h = str;
        this.f13716i = str2;
    }

    @Override // fm.l
    public final Object k(xl.d<? super tl.l> dVar) {
        return new e(this.f13713f, this.f13714g, this.f13715h, this.f13716i, dVar).t(tl.l.f28297a);
    }

    @Override // zl.a
    public final Object t(Object obj) {
        yl.a aVar = yl.a.COROUTINE_SUSPENDED;
        int i10 = this.f13712e;
        if (i10 != 0) {
            if (i10 == 1) {
                mf.a0.k(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            mf.a0.k(obj);
            tg.c cVar = this.f13713f.f11479j;
            long j10 = this.f13714g;
            String str = this.f13715h;
            String str2 = this.f13716i;
            this.f13712e = 1;
            if (cVar.i(j10, str, str2, this) == aVar) {
                return aVar;
            }
        }
        return tl.l.f28297a;
    }
}
