package xh;

import com.topstep.fitcloud.pro.model.dial.DialPushParams;
import mf.a0;
import og.d1;

@zl.e(c = "com.topstep.fitcloud.pro.ui.device.dial.component.DialComponentViewModel$getParams$1", f = "DialComponentViewModel.kt", l = {44}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class k extends zl.i implements fm.l<xl.d<? super DialPushParams>, Object> {

    /* renamed from: e */
    public int f30576e;

    /* renamed from: f */
    public final /* synthetic */ i f30577f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(i iVar, xl.d<? super k> dVar) {
        super(1, dVar);
        this.f30577f = iVar;
    }

    @Override // fm.l
    public final Object k(xl.d<? super DialPushParams> dVar) {
        return new k(this.f30577f, dVar).t(tl.l.f28297a);
    }

    @Override // zl.a
    public final Object t(Object obj) {
        yl.a aVar = yl.a.COROUTINE_SUSPENDED;
        int i10 = this.f30576e;
        if (i10 != 0) {
            if (i10 == 1) {
                a0.k(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            a0.k(obj);
            d1 d1Var = this.f30577f.f30568g;
            this.f30576e = 1;
            obj = d1Var.c(this);
            if (obj == aVar) {
                return aVar;
            }
        }
        return obj;
    }
}
