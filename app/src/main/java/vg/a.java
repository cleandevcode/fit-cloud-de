package vg;

import fm.p;
import mf.a0;
import pm.e0;

@zl.e(c = "com.topstep.fitcloud.pro.shared.data.net.ApiClient$AppInterceptor$parserEndPoint$1", f = "ApiClient.kt", l = {257}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class a extends zl.i implements p<e0, xl.d<? super tl.l>, Object> {

    /* renamed from: e */
    public int f29327e;

    /* renamed from: f */
    public final /* synthetic */ b f29328f;

    /* renamed from: g */
    public final /* synthetic */ String f29329g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b bVar, String str, xl.d<? super a> dVar) {
        super(2, dVar);
        this.f29328f = bVar;
        this.f29329g = str;
    }

    @Override // fm.p
    public final Object A(e0 e0Var, xl.d<? super tl.l> dVar) {
        return ((a) p(e0Var, dVar)).t(tl.l.f28297a);
    }

    @Override // zl.a
    public final xl.d<tl.l> p(Object obj, xl.d<?> dVar) {
        return new a(this.f29328f, this.f29329g, dVar);
    }

    @Override // zl.a
    public final Object t(Object obj) {
        yl.a aVar = yl.a.COROUTINE_SUSPENDED;
        int i10 = this.f29327e;
        if (i10 != 0) {
            if (i10 == 1) {
                a0.k(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            a0.k(obj);
            yg.j jVar = this.f29328f.f29331b;
            String str = this.f29329g;
            this.f29327e = 1;
            if (jVar.g(str, this) == aVar) {
                return aVar;
            }
        }
        return tl.l.f28297a;
    }
}
