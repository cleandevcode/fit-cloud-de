package jg;

import com.topstep.fitcloud.pro.shared.data.bean.TokenBean;
import fm.l;
import mf.a0;
import vg.k;
import zl.e;
import zl.i;

@e(c = "com.topstep.fitcloud.pro.shared.data.auth.AuthManagerImpl$signInStandard$2", f = "AuthManager.kt", l = {169}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class c extends i implements l<xl.d<? super TokenBean>, Object> {

    /* renamed from: e */
    public int f17728e;

    /* renamed from: f */
    public final /* synthetic */ b f17729f;

    /* renamed from: g */
    public final /* synthetic */ String f17730g;

    /* renamed from: h */
    public final /* synthetic */ String f17731h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(b bVar, String str, String str2, xl.d<? super c> dVar) {
        super(1, dVar);
        this.f17729f = bVar;
        this.f17730g = str;
        this.f17731h = str2;
    }

    @Override // fm.l
    public final Object k(xl.d<? super TokenBean> dVar) {
        return new c(this.f17729f, this.f17730g, this.f17731h, dVar).t(tl.l.f28297a);
    }

    @Override // zl.a
    public final Object t(Object obj) {
        yl.a aVar = yl.a.COROUTINE_SUSPENDED;
        int i10 = this.f17728e;
        if (i10 != 0) {
            if (i10 == 1) {
                a0.k(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            a0.k(obj);
            vg.d dVar = this.f17729f.f17665c;
            String str = this.f17730g;
            String str2 = this.f17731h;
            this.f17728e = 1;
            obj = dVar.s(str, str2, 1, 0, this);
            if (obj == aVar) {
                return aVar;
            }
        }
        return ((k) obj).f29381c;
    }
}
