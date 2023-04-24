package ii;

import fh.b;

@zl.e(c = "com.topstep.fitcloud.pro.ui.settings.ModifyPwdViewModel$modifyPwd$1", f = "ModifyPwdFragment.kt", l = {105}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class k0 extends zl.i implements fm.l<xl.d<? super tl.l>, Object> {

    /* renamed from: e */
    public int f16958e;

    /* renamed from: f */
    public final /* synthetic */ j0 f16959f;

    /* renamed from: g */
    public final /* synthetic */ String f16960g;

    /* renamed from: h */
    public final /* synthetic */ String f16961h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0(j0 j0Var, String str, String str2, xl.d<? super k0> dVar) {
        super(1, dVar);
        this.f16959f = j0Var;
        this.f16960g = str;
        this.f16961h = str2;
    }

    @Override // fm.l
    public final Object k(xl.d<? super tl.l> dVar) {
        return new k0(this.f16959f, this.f16960g, this.f16961h, dVar).t(tl.l.f28297a);
    }

    @Override // zl.a
    public final Object t(Object obj) {
        yl.a aVar = yl.a.COROUTINE_SUSPENDED;
        int i10 = this.f16958e;
        if (i10 != 0) {
            if (i10 == 1) {
                mf.a0.k(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            mf.a0.k(obj);
            dk.a<fh.b> aVar2 = this.f16959f.f16953f;
            if (aVar2 != null) {
                b.a aVar3 = new b.a(this.f16960g, this.f16961h);
                this.f16958e = 1;
                if (aVar2.get().b(aVar3, this) == aVar) {
                    return aVar;
                }
            } else {
                gm.l.l("modifyPwdUseCase");
                throw null;
            }
        }
        return tl.l.f28297a;
    }
}
