package jh;

import eh.f;

@zl.e(c = "com.topstep.fitcloud.pro.ui.auth.ResetPwdViewModel$resetPassword$1", f = "ResetPwdFragment.kt", l = {147}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class t extends zl.i implements fm.l<xl.d<? super tl.l>, Object> {

    /* renamed from: e */
    public int f17822e;

    /* renamed from: f */
    public final /* synthetic */ s f17823f;

    /* renamed from: g */
    public final /* synthetic */ String f17824g;

    /* renamed from: h */
    public final /* synthetic */ String f17825h;

    /* renamed from: i */
    public final /* synthetic */ String f17826i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(s sVar, String str, String str2, String str3, xl.d<? super t> dVar) {
        super(1, dVar);
        this.f17823f = sVar;
        this.f17824g = str;
        this.f17825h = str2;
        this.f17826i = str3;
    }

    @Override // fm.l
    public final Object k(xl.d<? super tl.l> dVar) {
        return new t(this.f17823f, this.f17824g, this.f17825h, this.f17826i, dVar).t(tl.l.f28297a);
    }

    @Override // zl.a
    public final Object t(Object obj) {
        yl.a aVar = yl.a.COROUTINE_SUSPENDED;
        int i10 = this.f17822e;
        if (i10 != 0) {
            if (i10 == 1) {
                mf.a0.k(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            mf.a0.k(obj);
            dk.a<eh.f> aVar2 = this.f17823f.f17820f;
            if (aVar2 != null) {
                f.a aVar3 = new f.a(this.f17824g, this.f17825h, this.f17826i);
                this.f17822e = 1;
                if (aVar2.get().b(aVar3, this) == aVar) {
                    return aVar;
                }
            } else {
                gm.l.l("resetPwdUseCase");
                throw null;
            }
        }
        return tl.l.f28297a;
    }
}
