package tg;

import fm.q;
import gm.a0;
import pm.g1;
import tl.l;

@zl.e(c = "com.topstep.fitcloud.pro.shared.data.friend.FriendRepositoryImpl$flowUnreadMsgCount$1$3", f = "FriendRepository.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class g extends zl.i implements q<sm.g<? super Integer>, Throwable, xl.d<? super l>, Object> {

    /* renamed from: e */
    public final /* synthetic */ a0<g1> f28142e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(a0<g1> a0Var, xl.d<? super g> dVar) {
        super(3, dVar);
        this.f28142e = a0Var;
    }

    @Override // fm.q
    public final Object j(sm.g<? super Integer> gVar, Throwable th2, xl.d<? super l> dVar) {
        return new g(this.f28142e, dVar).t(l.f28297a);
    }

    @Override // zl.a
    public final Object t(Object obj) {
        mf.a0.k(obj);
        g1 g1Var = this.f28142e.f15485a;
        if (g1Var != null) {
            g1Var.h(null);
        }
        return l.f28297a;
    }
}
