package di;

import mf.a0;
import og.p1;

@zl.e(c = "com.topstep.fitcloud.pro.ui.device.sport.push.SportPushViewModel$refresh$1", f = "SportPushViewModel.kt", l = {40}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class h extends zl.i implements fm.l<xl.d<? super bg.a>, Object> {

    /* renamed from: e */
    public int f13068e;

    /* renamed from: f */
    public final /* synthetic */ g f13069f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(g gVar, xl.d<? super h> dVar) {
        super(1, dVar);
        this.f13069f = gVar;
    }

    @Override // fm.l
    public final Object k(xl.d<? super bg.a> dVar) {
        return new h(this.f13069f, dVar).t(tl.l.f28297a);
    }

    @Override // zl.a
    public final Object t(Object obj) {
        yl.a aVar = yl.a.COROUTINE_SUSPENDED;
        int i10 = this.f13068e;
        if (i10 != 0) {
            if (i10 == 1) {
                a0.k(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            a0.k(obj);
            p1 p1Var = this.f13069f.f13063g;
            this.f13068e = 1;
            obj = p1Var.a(this);
            if (obj == aVar) {
                return aVar;
            }
        }
        return obj;
    }
}
