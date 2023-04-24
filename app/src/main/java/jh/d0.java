package jh;

import com.topstep.fitcloud.pro.model.auth.FillUserInfo;
import eh.i;

@zl.e(c = "com.topstep.fitcloud.pro.ui.auth.SignInViewModel$signInStandard$1", f = "SignInFragment.kt", l = {240}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class d0 extends zl.i implements fm.l<xl.d<? super FillUserInfo>, Object> {

    /* renamed from: e */
    public int f17769e;

    /* renamed from: f */
    public final /* synthetic */ z f17770f;

    /* renamed from: g */
    public final /* synthetic */ String f17771g;

    /* renamed from: h */
    public final /* synthetic */ String f17772h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(z zVar, String str, String str2, xl.d<? super d0> dVar) {
        super(1, dVar);
        this.f17770f = zVar;
        this.f17771g = str;
        this.f17772h = str2;
    }

    @Override // fm.l
    public final Object k(xl.d<? super FillUserInfo> dVar) {
        return new d0(this.f17770f, this.f17771g, this.f17772h, dVar).t(tl.l.f28297a);
    }

    @Override // zl.a
    public final Object t(Object obj) {
        yl.a aVar = yl.a.COROUTINE_SUSPENDED;
        int i10 = this.f17769e;
        if (i10 != 0) {
            if (i10 == 1) {
                mf.a0.k(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            mf.a0.k(obj);
            dk.a<eh.i> aVar2 = this.f17770f.f17838i;
            if (aVar2 != null) {
                i.a aVar3 = new i.a(this.f17771g, this.f17772h);
                this.f17769e = 1;
                obj = aVar2.get().b(aVar3, this);
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                gm.l.l("signInStandardUseCase");
                throw null;
            }
        }
        return obj;
    }
}
