package ii;

import eh.j;

@zl.e(c = "com.topstep.fitcloud.pro.ui.settings.AccountDeleteViewModel$platformAuth$1", f = "AccountDeleteFragment.kt", l = {170}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class k extends zl.i implements fm.l<xl.d<? super j.a>, Object> {

    /* renamed from: e */
    public int f16955e;

    /* renamed from: f */
    public final /* synthetic */ j f16956f;

    /* renamed from: g */
    public final /* synthetic */ String f16957g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(j jVar, String str, xl.d<? super k> dVar) {
        super(1, dVar);
        this.f16956f = jVar;
        this.f16957g = str;
    }

    @Override // fm.l
    public final Object k(xl.d<? super j.a> dVar) {
        return new k(this.f16956f, this.f16957g, dVar).t(tl.l.f28297a);
    }

    @Override // zl.a
    public final Object t(Object obj) {
        yl.a aVar = yl.a.COROUTINE_SUSPENDED;
        int i10 = this.f16955e;
        if (i10 != 0) {
            if (i10 == 1) {
                mf.a0.k(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            mf.a0.k(obj);
            dk.a<jh.q> aVar2 = this.f16956f.f16947g;
            if (aVar2 != null) {
                String str = this.f16957g;
                this.f16955e = 1;
                obj = aVar2.get().b(str, this);
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                gm.l.l("platformAuthUseCase");
                throw null;
            }
        }
        return obj;
    }
}
