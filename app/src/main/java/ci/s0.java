package ci;

import com.topstep.fitcloud.pro.ui.device.song.push.SongPushViewModel;

@zl.e(c = "com.topstep.fitcloud.pro.ui.device.song.push.SongPushViewModel$retry$2", f = "SongPushViewModel.kt", l = {159}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class s0 extends zl.i implements fm.p<pm.e0, xl.d<? super tl.l>, Object> {

    /* renamed from: e */
    public int f4827e;

    /* renamed from: f */
    public final /* synthetic */ SongPushViewModel f4828f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s0(SongPushViewModel songPushViewModel, xl.d<? super s0> dVar) {
        super(2, dVar);
        this.f4828f = songPushViewModel;
    }

    @Override // fm.p
    public final Object A(pm.e0 e0Var, xl.d<? super tl.l> dVar) {
        return ((s0) p(e0Var, dVar)).t(tl.l.f28297a);
    }

    @Override // zl.a
    public final xl.d<tl.l> p(Object obj, xl.d<?> dVar) {
        return new s0(this.f4828f, dVar);
    }

    @Override // zl.a
    public final Object t(Object obj) {
        yl.a aVar = yl.a.COROUTINE_SUSPENDED;
        int i10 = this.f4827e;
        if (i10 != 0) {
            if (i10 == 1) {
                mf.a0.k(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            mf.a0.k(obj);
            SongPushViewModel songPushViewModel = this.f4828f;
            this.f4827e = 1;
            obj = songPushViewModel.e(this);
            if (obj == aVar) {
                return aVar;
            }
        }
        if (((k0) obj).f4783a.a() == null) {
            SongPushViewModel.k(this.f4828f);
        }
        return tl.l.f28297a;
    }
}
