package ci;

import com.topstep.fitcloud.pro.ui.device.song.push.SongPushViewModel;

@zl.e(c = "com.topstep.fitcloud.pro.ui.device.song.push.SongPushViewModel$refresh$1", f = "SongPushViewModel.kt", l = {180}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class o0 extends zl.i implements fm.l<xl.d<? super j0>, Object> {

    /* renamed from: e */
    public int f4813e;

    /* renamed from: f */
    public final /* synthetic */ SongPushViewModel f4814f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0(SongPushViewModel songPushViewModel, xl.d<? super o0> dVar) {
        super(1, dVar);
        this.f4814f = songPushViewModel;
    }

    @Override // fm.l
    public final Object k(xl.d<? super j0> dVar) {
        return new o0(this.f4814f, dVar).t(tl.l.f28297a);
    }

    @Override // zl.a
    public final Object t(Object obj) {
        yl.a aVar = yl.a.COROUTINE_SUSPENDED;
        int i10 = this.f4813e;
        if (i10 != 0) {
            if (i10 == 1) {
                mf.a0.k(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            mf.a0.k(obj);
            v vVar = this.f4814f.f11386n;
            this.f4813e = 1;
            obj = vVar.a(this);
            if (obj == aVar) {
                return aVar;
            }
        }
        return obj;
    }
}
