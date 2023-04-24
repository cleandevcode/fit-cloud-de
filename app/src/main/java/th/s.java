package th;

import com.topstep.fitcloud.pro.ui.device.alarm.AlarmViewModel;
import java.util.ArrayList;
import mf.a0;
import pm.e0;
import th.d;

@zl.e(c = "com.topstep.fitcloud.pro.ui.device.alarm.AlarmViewModel$deleteAlarm$1", f = "AlarmViewModel.kt", l = {91}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class s extends zl.i implements fm.p<e0, xl.d<? super tl.l>, Object> {

    /* renamed from: e */
    public int f28216e;

    /* renamed from: f */
    public final /* synthetic */ AlarmViewModel f28217f;

    /* renamed from: g */
    public final /* synthetic */ int f28218g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(AlarmViewModel alarmViewModel, int i10, xl.d<? super s> dVar) {
        super(2, dVar);
        this.f28217f = alarmViewModel;
        this.f28218g = i10;
    }

    @Override // fm.p
    public final Object A(e0 e0Var, xl.d<? super tl.l> dVar) {
        return ((s) p(e0Var, dVar)).t(tl.l.f28297a);
    }

    @Override // zl.a
    public final xl.d<tl.l> p(Object obj, xl.d<?> dVar) {
        return new s(this.f28217f, this.f28218g, dVar);
    }

    @Override // zl.a
    public final Object t(Object obj) {
        yl.a aVar = yl.a.COROUTINE_SUSPENDED;
        int i10 = this.f28216e;
        if (i10 != 0) {
            if (i10 == 1) {
                a0.k(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            a0.k(obj);
            ArrayList<rj.a> a10 = this.f28217f.e().f28212a.a();
            if (a10 != null && this.f28218g < a10.size()) {
                a10.remove(this.f28218g);
                AlarmViewModel alarmViewModel = this.f28217f;
                d.c cVar = new d.c(this.f28218g);
                this.f28216e = 1;
                if (alarmViewModel.f(cVar, this) == aVar) {
                    return aVar;
                }
            }
            return tl.l.f28297a;
        }
        qi.s.b(this.f28217f.f10787j);
        return tl.l.f28297a;
    }
}
