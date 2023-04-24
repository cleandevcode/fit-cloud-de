package th;

import com.topstep.fitcloud.pro.ui.device.alarm.AlarmViewModel;
import mf.a0;
import pm.e0;
import th.d;

@zl.e(c = "com.topstep.fitcloud.pro.ui.device.alarm.AlarmViewModel$sendNavigateUpEvent$1", f = "AlarmViewModel.kt", l = {119, 120}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class v extends zl.i implements fm.p<e0, xl.d<? super tl.l>, Object> {

    /* renamed from: e */
    public int f28228e;

    /* renamed from: f */
    public final /* synthetic */ AlarmViewModel f28229f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(AlarmViewModel alarmViewModel, xl.d<? super v> dVar) {
        super(2, dVar);
        this.f28229f = alarmViewModel;
    }

    @Override // fm.p
    public final Object A(e0 e0Var, xl.d<? super tl.l> dVar) {
        return ((v) p(e0Var, dVar)).t(tl.l.f28297a);
    }

    @Override // zl.a
    public final xl.d<tl.l> p(Object obj, xl.d<?> dVar) {
        return new v(this.f28229f, dVar);
    }

    @Override // zl.a
    public final Object t(Object obj) {
        yl.a aVar = yl.a.COROUTINE_SUSPENDED;
        int i10 = this.f28228e;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 == 2) {
                    a0.k(obj);
                    return tl.l.f28297a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            a0.k(obj);
        } else {
            a0.k(obj);
            this.f28228e = 1;
            if (a0.g(1000L, this) == aVar) {
                return aVar;
            }
        }
        AlarmViewModel alarmViewModel = this.f28229f;
        d.C0503d c0503d = d.C0503d.f28184a;
        this.f28228e = 2;
        if (alarmViewModel.f(c0503d, this) == aVar) {
            return aVar;
        }
        return tl.l.f28297a;
    }
}
