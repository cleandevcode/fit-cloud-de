package th;

import com.topstep.fitcloud.pro.ui.device.alarm.AlarmViewModel;
import java.util.ArrayList;
import mf.a0;
import pm.e0;
import th.d;

@zl.e(c = "com.topstep.fitcloud.pro.ui.device.alarm.AlarmViewModel$modifyAlarm$1", f = "AlarmViewModel.kt", l = {111}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class t extends zl.i implements fm.p<e0, xl.d<? super tl.l>, Object> {

    /* renamed from: e */
    public int f28219e;

    /* renamed from: f */
    public final /* synthetic */ AlarmViewModel f28220f;

    /* renamed from: g */
    public final /* synthetic */ int f28221g;

    /* renamed from: h */
    public final /* synthetic */ rj.a f28222h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(AlarmViewModel alarmViewModel, int i10, rj.a aVar, xl.d<? super t> dVar) {
        super(2, dVar);
        this.f28220f = alarmViewModel;
        this.f28221g = i10;
        this.f28222h = aVar;
    }

    @Override // fm.p
    public final Object A(e0 e0Var, xl.d<? super tl.l> dVar) {
        return ((t) p(e0Var, dVar)).t(tl.l.f28297a);
    }

    @Override // zl.a
    public final xl.d<tl.l> p(Object obj, xl.d<?> dVar) {
        return new t(this.f28220f, this.f28221g, this.f28222h, dVar);
    }

    @Override // zl.a
    public final Object t(Object obj) {
        yl.a aVar = yl.a.COROUTINE_SUSPENDED;
        int i10 = this.f28219e;
        if (i10 != 0) {
            if (i10 == 1) {
                a0.k(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            a0.k(obj);
            ArrayList<rj.a> a10 = this.f28220f.e().f28212a.a();
            if (a10 != null && this.f28221g < a10.size()) {
                if (!a10.contains(this.f28222h)) {
                    a10.remove(this.f28221g);
                    int h10 = AlarmViewModel.h(this.f28220f, this.f28222h, a10);
                    a10.add(h10, this.f28222h);
                    AlarmViewModel alarmViewModel = this.f28220f;
                    d.b bVar = new d.b(this.f28221g, h10);
                    this.f28219e = 1;
                    if (alarmViewModel.f(bVar, this) == aVar) {
                        return aVar;
                    }
                } else {
                    throw new IllegalStateException();
                }
            }
            return tl.l.f28297a;
        }
        qi.s.b(this.f28220f.f10787j);
        return tl.l.f28297a;
    }
}
