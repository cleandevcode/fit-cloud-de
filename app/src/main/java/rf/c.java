package rf;

import com.tencent.mars.xlog.Xlog;
import fm.p;
import mf.a0;
import pm.e0;
import tl.l;
import zl.i;

@zl.e(c = "com.topstep.fitcloud.pro.files.AppLogger$flush$2", f = "AppLogger.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class c extends i implements p<e0, xl.d<? super l>, Object> {

    /* renamed from: e */
    public final /* synthetic */ Xlog f25598e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(Xlog xlog, xl.d<? super c> dVar) {
        super(2, dVar);
        this.f25598e = xlog;
    }

    @Override // fm.p
    public final Object A(e0 e0Var, xl.d<? super l> dVar) {
        return ((c) p(e0Var, dVar)).t(l.f28297a);
    }

    @Override // zl.a
    public final xl.d<l> p(Object obj, xl.d<?> dVar) {
        return new c(this.f25598e, dVar);
    }

    @Override // zl.a
    public final Object t(Object obj) {
        a0.k(obj);
        Xlog xlog = this.f25598e;
        long currentTimeMillis = System.currentTimeMillis();
        xlog.appenderFlush(0L, true);
        p000do.a.f13275a.h("flush used:%d", new Long(System.currentTimeMillis() - currentTimeMillis));
        return l.f28297a;
    }
}
