package og;

import java.util.concurrent.TimeUnit;
import og.x0;

@zl.e(c = "com.topstep.fitcloud.pro.shared.data.device.DeviceManagerImpl$special$$inlined$flatMapLatest$2", f = "DeviceManager.kt", l = {190}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class v0 extends zl.i implements fm.q<sm.g<? super rj.b>, wf.b, xl.d<? super tl.l>, Object> {

    /* renamed from: e */
    public int f23505e;

    /* renamed from: f */
    public /* synthetic */ sm.g f23506f;

    /* renamed from: g */
    public /* synthetic */ Object f23507g;

    /* renamed from: h */
    public final /* synthetic */ d0 f23508h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v0(d0 d0Var, xl.d dVar) {
        super(3, dVar);
        this.f23508h = d0Var;
    }

    @Override // fm.q
    public final Object j(sm.g<? super rj.b> gVar, wf.b bVar, xl.d<? super tl.l> dVar) {
        v0 v0Var = new v0(this.f23508h, dVar);
        v0Var.f23506f = gVar;
        v0Var.f23507g = bVar;
        return v0Var.t(tl.l.f28297a);
    }

    @Override // zl.a
    public final Object t(Object obj) {
        yl.a aVar = yl.a.COROUTINE_SUSPENDED;
        int i10 = this.f23505e;
        if (i10 != 0) {
            if (i10 == 1) {
                mf.a0.k(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            mf.a0.k(obj);
            sm.g gVar = this.f23506f;
            wf.b bVar = (wf.b) this.f23507g;
            tk.l o10 = tk.i.r(1000L, 7500L, TimeUnit.MILLISECONDS, pl.a.f24280b).o(new x0.b(new e0(this.f23508h)));
            x0.b bVar2 = new x0.b(g0.f23351b);
            o10.getClass();
            sm.q qVar = new sm.q(qi.h.d(new fl.r0(o10, bVar2)), new h0(null));
            this.f23505e = 1;
            if (bi.r.v(this, qVar, gVar) == aVar) {
                return aVar;
            }
        }
        return tl.l.f28297a;
    }
}
