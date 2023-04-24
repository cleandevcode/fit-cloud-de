package og;

import java.util.Objects;
import java.util.concurrent.TimeUnit;
import og.x0;

@zl.e(c = "com.topstep.fitcloud.pro.shared.data.device.DeviceManagerImpl$flowWeatherRequire$$inlined$flatMapLatest$1", f = "DeviceManager.kt", l = {190}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class l0 extends zl.i implements fm.q<sm.g<? super Boolean>, wf.a, xl.d<? super tl.l>, Object> {

    /* renamed from: e */
    public int f23401e;

    /* renamed from: f */
    public /* synthetic */ sm.g f23402f;

    /* renamed from: g */
    public /* synthetic */ Object f23403g;

    /* renamed from: h */
    public final /* synthetic */ d0 f23404h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0(d0 d0Var, xl.d dVar) {
        super(3, dVar);
        this.f23404h = d0Var;
    }

    @Override // fm.q
    public final Object j(sm.g<? super Boolean> gVar, wf.a aVar, xl.d<? super tl.l> dVar) {
        l0 l0Var = new l0(this.f23404h, dVar);
        l0Var.f23402f = gVar;
        l0Var.f23403g = aVar;
        return l0Var.t(tl.l.f28297a);
    }

    @Override // zl.a
    public final Object t(Object obj) {
        sm.f iVar;
        yl.a aVar = yl.a.COROUTINE_SUSPENDED;
        int i10 = this.f23401e;
        if (i10 != 0) {
            if (i10 == 1) {
                mf.a0.k(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            mf.a0.k(obj);
            sm.g gVar = this.f23402f;
            wf.a aVar2 = (wf.a) this.f23403g;
            if (aVar2 != null && !aVar2.f29804c) {
                ql.b<Byte> bVar = this.f23404h.f23258n.o().f17932f;
                gm.l.e(bVar, "refreshTypeSubject");
                fl.t tVar = new fl.t(bVar, new x0.c());
                TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                il.b bVar2 = pl.a.f24280b;
                Objects.requireNonNull(timeUnit, "unit is null");
                Objects.requireNonNull(bVar2, "scheduler is null");
                iVar = new n0(qi.h.d(new fl.h(1000L, tVar, bVar2, timeUnit).x((byte) 0)), this.f23404h);
            } else {
                iVar = new sm.i(Boolean.FALSE);
            }
            this.f23401e = 1;
            if (bi.r.v(this, iVar, gVar) == aVar) {
                return aVar;
            }
        }
        return tl.l.f28297a;
    }
}
