package jg;

import com.topstep.fitcloud.pro.shared.data.bean.TokenBean;
import fm.l;
import mf.a0;
import vg.k;
import zl.e;
import zl.i;

@e(c = "com.topstep.fitcloud.pro.shared.data.auth.AuthManagerImpl$signInThirdParty$2", f = "AuthManager.kt", l = {175}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class d extends i implements l<xl.d<? super TokenBean>, Object> {

    /* renamed from: e */
    public int f17732e;

    /* renamed from: f */
    public final /* synthetic */ b f17733f;

    /* renamed from: g */
    public final /* synthetic */ String f17734g;

    /* renamed from: h */
    public final /* synthetic */ String f17735h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(b bVar, String str, String str2, xl.d<? super d> dVar) {
        super(1, dVar);
        this.f17733f = bVar;
        this.f17734g = str;
        this.f17735h = str2;
    }

    @Override // fm.l
    public final Object k(xl.d<? super TokenBean> dVar) {
        return new d(this.f17733f, this.f17734g, this.f17735h, dVar).t(tl.l.f28297a);
    }

    @Override // zl.a
    public final Object t(Object obj) {
        yl.a aVar = yl.a.COROUTINE_SUSPENDED;
        int i10 = this.f17732e;
        if (i10 != 0) {
            if (i10 == 1) {
                a0.k(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            a0.k(obj);
            vg.d dVar = this.f17733f.f17665c;
            String str = this.f17734g;
            String str2 = this.f17735h;
            this.f17732e = 1;
            obj = dVar.A(str, str2, 1, 0, this);
            if (obj == aVar) {
                return aVar;
            }
        }
        return ((k) obj).f29381c;
    }
}
