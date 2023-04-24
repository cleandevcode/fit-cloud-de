package jh;

import com.topstep.fitcloud.pro.model.auth.FillUserInfo;
import eh.k;

@zl.e(c = "com.topstep.fitcloud.pro.ui.auth.SignUpViewModel$signUp$1", f = "SignUpFragment.kt", l = {191}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class i0 extends zl.i implements fm.l<xl.d<? super FillUserInfo>, Object> {

    /* renamed from: e */
    public int f17793e;

    /* renamed from: f */
    public final /* synthetic */ h0 f17794f;

    /* renamed from: g */
    public final /* synthetic */ String f17795g;

    /* renamed from: h */
    public final /* synthetic */ String f17796h;

    /* renamed from: i */
    public final /* synthetic */ String f17797i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(h0 h0Var, String str, String str2, String str3, xl.d<? super i0> dVar) {
        super(1, dVar);
        this.f17794f = h0Var;
        this.f17795g = str;
        this.f17796h = str2;
        this.f17797i = str3;
    }

    @Override // fm.l
    public final Object k(xl.d<? super FillUserInfo> dVar) {
        return new i0(this.f17794f, this.f17795g, this.f17796h, this.f17797i, dVar).t(tl.l.f28297a);
    }

    @Override // zl.a
    public final Object t(Object obj) {
        yl.a aVar = yl.a.COROUTINE_SUSPENDED;
        int i10 = this.f17793e;
        if (i10 != 0) {
            if (i10 == 1) {
                mf.a0.k(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            mf.a0.k(obj);
            dk.a<eh.k> aVar2 = this.f17794f.f17789f;
            if (aVar2 != null) {
                k.a aVar3 = new k.a(this.f17795g, this.f17796h, this.f17797i);
                this.f17793e = 1;
                obj = aVar2.get().b(aVar3, this);
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                gm.l.l("signUpUseCase");
                throw null;
            }
        }
        return obj;
    }
}
