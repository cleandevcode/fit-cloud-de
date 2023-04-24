package jh;

import com.topstep.fitcloud.pro.model.auth.FillUserInfo;

@zl.e(c = "com.topstep.fitcloud.pro.ui.auth.SignInViewModel$signInDirectly$1", f = "SignInFragment.kt", l = {226}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class a0 extends zl.i implements fm.l<xl.d<? super FillUserInfo>, Object> {

    /* renamed from: e */
    public int f17736e;

    /* renamed from: f */
    public final /* synthetic */ z f17737f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(z zVar, xl.d<? super a0> dVar) {
        super(1, dVar);
        this.f17737f = zVar;
    }

    @Override // fm.l
    public final Object k(xl.d<? super FillUserInfo> dVar) {
        return new a0(this.f17737f, dVar).t(tl.l.f28297a);
    }

    @Override // zl.a
    public final Object t(Object obj) {
        yl.a aVar = yl.a.COROUTINE_SUSPENDED;
        int i10 = this.f17736e;
        if (i10 != 0) {
            if (i10 == 1) {
                mf.a0.k(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            mf.a0.k(obj);
            dk.a<eh.h> aVar2 = this.f17737f.f17837h;
            if (aVar2 != null) {
                tl.l lVar = tl.l.f28297a;
                this.f17736e = 1;
                obj = aVar2.get().b(lVar, this);
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                gm.l.l("signInDirectlyUseCase");
                throw null;
            }
        }
        return obj;
    }
}
