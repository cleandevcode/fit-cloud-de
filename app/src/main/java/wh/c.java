package wh;

import com.topstep.fitcloud.pro.model.dial.DialPacket;
import com.topstep.fitcloud.pro.ui.device.dial.DialPushViewModel;
import fm.p;
import mf.a0;
import og.d1;
import pm.e0;
import tl.l;
import zl.i;

@zl.e(c = "com.topstep.fitcloud.pro.ui.device.dial.DialPushViewModel$addLocalDialPacket$1", f = "DialPushViewModel.kt", l = {45}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class c extends i implements p<e0, xl.d<? super l>, Object> {

    /* renamed from: e */
    public int f29836e;

    /* renamed from: f */
    public final /* synthetic */ DialPushViewModel f29837f;

    /* renamed from: g */
    public final /* synthetic */ String f29838g;

    /* renamed from: h */
    public final /* synthetic */ DialPacket f29839h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(DialPushViewModel dialPushViewModel, String str, DialPacket dialPacket, xl.d<? super c> dVar) {
        super(2, dVar);
        this.f29837f = dialPushViewModel;
        this.f29838g = str;
        this.f29839h = dialPacket;
    }

    @Override // fm.p
    public final Object A(e0 e0Var, xl.d<? super l> dVar) {
        return ((c) p(e0Var, dVar)).t(l.f28297a);
    }

    @Override // zl.a
    public final xl.d<l> p(Object obj, xl.d<?> dVar) {
        return new c(this.f29837f, this.f29838g, this.f29839h, dVar);
    }

    @Override // zl.a
    public final Object t(Object obj) {
        yl.a aVar = yl.a.COROUTINE_SUSPENDED;
        int i10 = this.f29836e;
        if (i10 != 0) {
            if (i10 == 1) {
                a0.k(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            a0.k(obj);
            d1 d1Var = this.f29837f.f10918i;
            String str = this.f29838g;
            DialPacket dialPacket = this.f29839h;
            this.f29836e = 1;
            if (d1Var.f(str, dialPacket, this) == aVar) {
                return aVar;
            }
        }
        return l.f28297a;
    }
}
