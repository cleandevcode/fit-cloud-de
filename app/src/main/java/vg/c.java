package vg;

import fm.p;
import mf.a0;
import pm.e0;

@zl.e(c = "com.topstep.fitcloud.pro.shared.data.net.ApiClient$baseUrl$1", f = "ApiClient.kt", l = {49}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class c extends zl.i implements p<e0, xl.d<? super String>, Object> {

    /* renamed from: e */
    public int f29347e;

    /* renamed from: f */
    public final /* synthetic */ b f29348f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(b bVar, xl.d<? super c> dVar) {
        super(2, dVar);
        this.f29348f = bVar;
    }

    @Override // fm.p
    public final Object A(e0 e0Var, xl.d<? super String> dVar) {
        return ((c) p(e0Var, dVar)).t(tl.l.f28297a);
    }

    @Override // zl.a
    public final xl.d<tl.l> p(Object obj, xl.d<?> dVar) {
        return new c(this.f29348f, dVar);
    }

    @Override // zl.a
    public final Object t(Object obj) {
        yl.a aVar = yl.a.COROUTINE_SUSPENDED;
        int i10 = this.f29347e;
        if (i10 != 0) {
            if (i10 == 1) {
                a0.k(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            a0.k(obj);
            yg.j jVar = this.f29348f.f29331b;
            this.f29347e = 1;
            obj = jVar.A(this);
            if (obj == aVar) {
                return aVar;
            }
        }
        return obj;
    }
}
