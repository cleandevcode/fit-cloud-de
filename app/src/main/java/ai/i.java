package ai;

import com.topstep.fitcloud.pro.ui.device.game.push.GamePushViewModel;
import fm.p;
import mf.a0;
import og.x0;
import pm.e0;

@zl.e(c = "com.topstep.fitcloud.pro.ui.device.game.push.GamePushViewModel$1", f = "GamePushViewModel.kt", l = {22}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class i extends zl.i implements p<e0, xl.d<? super tl.l>, Object> {

    /* renamed from: e */
    public int f563e;

    /* renamed from: f */
    public final /* synthetic */ GamePushViewModel f564f;

    /* loaded from: classes2.dex */
    public static final class a<T> implements sm.g {

        /* renamed from: a */
        public final /* synthetic */ GamePushViewModel f565a;

        public a(GamePushViewModel gamePushViewModel) {
            this.f565a = gamePushViewModel;
        }

        @Override // sm.g
        public final Object n(Object obj, xl.d dVar) {
            if (((Boolean) obj).booleanValue()) {
                GamePushViewModel gamePushViewModel = this.f565a;
                gamePushViewModel.getClass();
                gamePushViewModel.h(new j(gamePushViewModel, null), 0L);
            }
            return tl.l.f28297a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(GamePushViewModel gamePushViewModel, xl.d<? super i> dVar) {
        super(2, dVar);
        this.f564f = gamePushViewModel;
    }

    @Override // fm.p
    public final Object A(e0 e0Var, xl.d<? super tl.l> dVar) {
        return ((i) p(e0Var, dVar)).t(tl.l.f28297a);
    }

    @Override // zl.a
    public final xl.d<tl.l> p(Object obj, xl.d<?> dVar) {
        return new i(this.f564f, dVar);
    }

    @Override // zl.a
    public final Object t(Object obj) {
        yl.a aVar = yl.a.COROUTINE_SUSPENDED;
        int i10 = this.f563e;
        if (i10 != 0) {
            if (i10 == 1) {
                a0.k(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            a0.k(obj);
            sm.f<Boolean> a10 = x0.a(this.f564f.f11059h);
            a aVar2 = new a(this.f564f);
            this.f563e = 1;
            if (a10.a(aVar2, this) == aVar) {
                return aVar;
            }
        }
        return tl.l.f28297a;
    }
}
