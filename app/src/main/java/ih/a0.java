package ih;

import com.topstep.fitcloud.pro.ui.MineViewModel;

@zl.e(c = "com.topstep.fitcloud.pro.ui.MineViewModel$getWechatSportLinkUrl$1", f = "MineFragment.kt", l = {247}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class a0 extends zl.i implements fm.l<xl.d<? super String>, Object> {

    /* renamed from: e */
    public int f16822e;

    /* renamed from: f */
    public final /* synthetic */ MineViewModel f16823f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(MineViewModel mineViewModel, xl.d<? super a0> dVar) {
        super(1, dVar);
        this.f16823f = mineViewModel;
    }

    @Override // fm.l
    public final Object k(xl.d<? super String> dVar) {
        return new a0(this.f16823f, dVar).t(tl.l.f28297a);
    }

    @Override // zl.a
    public final Object t(Object obj) {
        yl.a aVar = yl.a.COROUTINE_SUSPENDED;
        int i10 = this.f16822e;
        if (i10 != 0) {
            if (i10 == 1) {
                mf.a0.k(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            mf.a0.k(obj);
            long j10 = this.f16823f.f10287h;
            this.f16822e = 1;
            obj = this.f16823f.f10289j.get().a(j10, this);
            if (obj == aVar) {
                return aVar;
            }
        }
        return obj;
    }
}
