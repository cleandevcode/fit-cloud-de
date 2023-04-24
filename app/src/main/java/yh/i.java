package yh;

import com.topstep.fitcloud.pro.model.dial.DialPushParams;
import java.util.List;
import mf.a0;
import og.d1;
import ul.q;

@zl.e(c = "com.topstep.fitcloud.pro.ui.device.dial.push.DialPacketListViewModel$refreshInternal$1", f = "DialPacketListFragment.kt", l = {225, 227}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class i extends zl.i implements fm.l<xl.d<? super o>, Object> {

    /* renamed from: e */
    public int f31751e;

    /* renamed from: f */
    public final /* synthetic */ g f31752f;

    /* renamed from: g */
    public final /* synthetic */ DialPushParams f31753g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(g gVar, DialPushParams dialPushParams, xl.d<? super i> dVar) {
        super(1, dVar);
        this.f31752f = gVar;
        this.f31753g = dialPushParams;
    }

    @Override // fm.l
    public final Object k(xl.d<? super o> dVar) {
        return new i(this.f31752f, this.f31753g, dVar).t(tl.l.f28297a);
    }

    @Override // zl.a
    public final Object t(Object obj) {
        yl.a aVar = yl.a.COROUTINE_SUSPENDED;
        int i10 = this.f31751e;
        if (i10 != 0) {
            if (i10 != 1 && i10 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            a0.k(obj);
        } else {
            a0.k(obj);
            g gVar = this.f31752f;
            if (gVar.f31743i) {
                d1 d1Var = gVar.f31744j;
                DialPushParams dialPushParams = this.f31753g;
                this.f31751e = 1;
                obj = d1Var.b(dialPushParams, this);
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                d1 d1Var2 = gVar.f31744j;
                DialPushParams dialPushParams2 = this.f31753g;
                this.f31751e = 2;
                obj = d1Var2.e(dialPushParams2, this);
                if (obj == aVar) {
                    return aVar;
                }
            }
        }
        return new o(this.f31753g, q.Z((List) obj));
    }
}
