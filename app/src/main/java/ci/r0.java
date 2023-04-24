package ci;

import com.topstep.fitcloud.pro.ui.device.song.push.SongPushViewModel;

@zl.e(c = "com.topstep.fitcloud.pro.ui.device.song.push.SongPushViewModel$retry$1", f = "SongPushViewModel.kt", l = {155}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class r0 extends zl.i implements fm.p<pm.e0, xl.d<? super tl.l>, Object> {

    /* renamed from: e */
    public int f4824e;

    /* renamed from: f */
    public final /* synthetic */ SongPushViewModel f4825f;

    /* renamed from: g */
    public final /* synthetic */ String f4826g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r0(SongPushViewModel songPushViewModel, String str, xl.d<? super r0> dVar) {
        super(2, dVar);
        this.f4825f = songPushViewModel;
        this.f4826g = str;
    }

    @Override // fm.p
    public final Object A(pm.e0 e0Var, xl.d<? super tl.l> dVar) {
        return ((r0) p(e0Var, dVar)).t(tl.l.f28297a);
    }

    @Override // zl.a
    public final xl.d<tl.l> p(Object obj, xl.d<?> dVar) {
        return new r0(this.f4825f, this.f4826g, dVar);
    }

    @Override // zl.a
    public final Object t(Object obj) {
        yl.a aVar = yl.a.COROUTINE_SUSPENDED;
        int i10 = this.f4824e;
        if (i10 == 0) {
            mf.a0.k(obj);
            SongPushViewModel songPushViewModel = this.f4825f;
            String str = this.f4826g;
            this.f4824e = 1;
            if (SongPushViewModel.j(songPushViewModel, str, this) == aVar) {
                return aVar;
            }
        } else if (i10 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            mf.a0.k(obj);
        }
        return tl.l.f28297a;
    }
}
