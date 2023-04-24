package th;

import com.topstep.fitcloud.pro.ui.device.alarm.AlarmViewModel;
import java.util.ArrayList;
import mf.a0;
import pm.e0;
import th.d;

@zl.e(c = "com.topstep.fitcloud.pro.ui.device.alarm.AlarmViewModel$addAlarm$1", f = "AlarmViewModel.kt", l = {77}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class r extends zl.i implements fm.p<e0, xl.d<? super tl.l>, Object> {

    /* renamed from: e */
    public int f28213e;

    /* renamed from: f */
    public final /* synthetic */ AlarmViewModel f28214f;

    /* renamed from: g */
    public final /* synthetic */ rj.a f28215g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(AlarmViewModel alarmViewModel, rj.a aVar, xl.d<? super r> dVar) {
        super(2, dVar);
        this.f28214f = alarmViewModel;
        this.f28215g = aVar;
    }

    @Override // fm.p
    public final Object A(e0 e0Var, xl.d<? super tl.l> dVar) {
        return ((r) p(e0Var, dVar)).t(tl.l.f28297a);
    }

    @Override // zl.a
    public final xl.d<tl.l> p(Object obj, xl.d<?> dVar) {
        return new r(this.f28214f, this.f28215g, dVar);
    }

    @Override // zl.a
    public final Object t(Object obj) {
        yl.a aVar = yl.a.COROUTINE_SUSPENDED;
        int i10 = this.f28213e;
        if (i10 != 0) {
            if (i10 == 1) {
                a0.k(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            a0.k(obj);
            ArrayList<rj.a> a10 = this.f28214f.e().f28212a.a();
            if (a10 != null) {
                int h10 = AlarmViewModel.h(this.f28214f, this.f28215g, a10);
                a10.add(h10, this.f28215g);
                AlarmViewModel alarmViewModel = this.f28214f;
                d.a aVar2 = new d.a(h10);
                this.f28213e = 1;
                if (alarmViewModel.f(aVar2, this) == aVar) {
                    return aVar;
                }
            }
            return tl.l.f28297a;
        }
        qi.s.b(this.f28214f.f10787j);
        return tl.l.f28297a;
    }
}
