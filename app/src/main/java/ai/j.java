package ai;

import com.topstep.fitcloud.pro.ui.device.game.push.GamePushViewModel;
import mf.a0;
import og.h1;

@zl.e(c = "com.topstep.fitcloud.pro.ui.device.game.push.GamePushViewModel$refresh$1", f = "GamePushViewModel.kt", l = {36}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class j extends zl.i implements fm.l<xl.d<? super zf.a>, Object> {

    /* renamed from: e */
    public int f566e;

    /* renamed from: f */
    public final /* synthetic */ GamePushViewModel f567f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(GamePushViewModel gamePushViewModel, xl.d<? super j> dVar) {
        super(1, dVar);
        this.f567f = gamePushViewModel;
    }

    @Override // fm.l
    public final Object k(xl.d<? super zf.a> dVar) {
        return new j(this.f567f, dVar).t(tl.l.f28297a);
    }

    @Override // zl.a
    public final Object t(Object obj) {
        yl.a aVar = yl.a.COROUTINE_SUSPENDED;
        int i10 = this.f566e;
        if (i10 != 0) {
            if (i10 == 1) {
                a0.k(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            a0.k(obj);
            h1 h1Var = this.f567f.f11060i;
            this.f566e = 1;
            obj = h1Var.a(this);
            if (obj == aVar) {
                return aVar;
            }
        }
        return obj;
    }
}
