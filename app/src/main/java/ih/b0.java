package ih;

import com.topstep.fitcloud.pro.ui.MineViewModel;
import pm.e0;

@zl.e(c = "com.topstep.fitcloud.pro.ui.MineViewModel$setAssistEnabled$1", f = "MineFragment.kt", l = {257}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class b0 extends zl.i implements fm.p<e0, xl.d<? super tl.l>, Object> {

    /* renamed from: e */
    public int f16824e;

    /* renamed from: f */
    public final /* synthetic */ MineViewModel f16825f;

    /* renamed from: g */
    public final /* synthetic */ boolean f16826g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(MineViewModel mineViewModel, boolean z10, xl.d<? super b0> dVar) {
        super(2, dVar);
        this.f16825f = mineViewModel;
        this.f16826g = z10;
    }

    @Override // fm.p
    public final Object A(e0 e0Var, xl.d<? super tl.l> dVar) {
        return ((b0) p(e0Var, dVar)).t(tl.l.f28297a);
    }

    @Override // zl.a
    public final xl.d<tl.l> p(Object obj, xl.d<?> dVar) {
        return new b0(this.f16825f, this.f16826g, dVar);
    }

    @Override // zl.a
    public final Object t(Object obj) {
        yl.a aVar = yl.a.COROUTINE_SUSPENDED;
        int i10 = this.f16824e;
        if (i10 != 0) {
            if (i10 == 1) {
                mf.a0.k(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            mf.a0.k(obj);
            yg.m mVar = this.f16825f.f10290k;
            boolean z10 = this.f16826g;
            this.f16824e = 1;
            if (mVar.i(z10, this) == aVar) {
                return aVar;
            }
        }
        return tl.l.f28297a;
    }
}
