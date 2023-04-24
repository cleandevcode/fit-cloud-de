package wh;

import com.topstep.fitcloud.pro.model.dial.DialPushParams;
import com.topstep.fitcloud.pro.ui.device.dial.DialPushViewModel;
import fm.l;
import mf.a0;
import og.d1;
import zl.i;

@zl.e(c = "com.topstep.fitcloud.pro.ui.device.dial.DialPushViewModel$refresh$1", f = "DialPushViewModel.kt", l = {36}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class d extends i implements l<xl.d<? super DialPushParams>, Object> {

    /* renamed from: e */
    public int f29840e;

    /* renamed from: f */
    public final /* synthetic */ DialPushViewModel f29841f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(DialPushViewModel dialPushViewModel, xl.d<? super d> dVar) {
        super(1, dVar);
        this.f29841f = dialPushViewModel;
    }

    @Override // fm.l
    public final Object k(xl.d<? super DialPushParams> dVar) {
        return new d(this.f29841f, dVar).t(tl.l.f28297a);
    }

    @Override // zl.a
    public final Object t(Object obj) {
        yl.a aVar = yl.a.COROUTINE_SUSPENDED;
        int i10 = this.f29840e;
        if (i10 != 0) {
            if (i10 == 1) {
                a0.k(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            a0.k(obj);
            d1 d1Var = this.f29841f.f10918i;
            this.f29840e = 1;
            obj = d1Var.c(this);
            if (obj == aVar) {
                return aVar;
            }
        }
        return obj;
    }
}
