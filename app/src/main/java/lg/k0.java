package lg;

import mg.d7;

@zl.e(c = "com.topstep.fitcloud.pro.shared.data.data.SportRepositoryImpl$1", f = "SportRepository.kt", l = {60}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class k0 extends zl.i implements fm.p<pm.e0, xl.d<? super tl.l>, Object> {

    /* renamed from: e */
    public int f19817e;

    /* renamed from: f */
    public final /* synthetic */ r0 f19818f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0(r0 r0Var, xl.d<? super k0> dVar) {
        super(2, dVar);
        this.f19818f = r0Var;
    }

    @Override // fm.p
    public final Object A(pm.e0 e0Var, xl.d<? super tl.l> dVar) {
        return ((k0) p(e0Var, dVar)).t(tl.l.f28297a);
    }

    @Override // zl.a
    public final xl.d<tl.l> p(Object obj, xl.d<?> dVar) {
        return new k0(this.f19818f, dVar);
    }

    @Override // zl.a
    public final Object t(Object obj) {
        yl.a aVar = yl.a.COROUTINE_SUSPENDED;
        int i10 = this.f19817e;
        if (i10 != 0) {
            if (i10 == 1) {
                mf.a0.k(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            mf.a0.k(obj);
            d7 C = this.f19818f.f19893b.C();
            this.f19817e = 1;
            if (C.d(this) == aVar) {
                return aVar;
            }
        }
        return tl.l.f28297a;
    }
}
