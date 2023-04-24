package zh;

import com.topstep.fitcloud.pro.model.dial.DialPushParams;
import mf.a0;
import og.d1;

@zl.e(c = "com.topstep.fitcloud.pro.ui.device.dial.push.custom.DialCustomViewModel$refreshInternal$1", f = "DialCustomFragment.kt", l = {280}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class k extends zl.i implements fm.l<xl.d<? super n>, Object> {

    /* renamed from: e */
    public int f32465e;

    /* renamed from: f */
    public final /* synthetic */ i f32466f;

    /* renamed from: g */
    public final /* synthetic */ DialPushParams f32467g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(i iVar, DialPushParams dialPushParams, xl.d<? super k> dVar) {
        super(1, dVar);
        this.f32466f = iVar;
        this.f32467g = dialPushParams;
    }

    @Override // fm.l
    public final Object k(xl.d<? super n> dVar) {
        return new k(this.f32466f, this.f32467g, dVar).t(tl.l.f28297a);
    }

    @Override // zl.a
    public final Object t(Object obj) {
        yl.a aVar = yl.a.COROUTINE_SUSPENDED;
        int i10 = this.f32465e;
        if (i10 != 0) {
            if (i10 == 1) {
                a0.k(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            a0.k(obj);
            d1 d1Var = this.f32466f.f32459i;
            DialPushParams dialPushParams = this.f32467g;
            this.f32465e = 1;
            obj = d1Var.d(dialPushParams, this);
            if (obj == aVar) {
                return aVar;
            }
        }
        return new n(this.f32467g, (xf.a) obj);
    }
}
