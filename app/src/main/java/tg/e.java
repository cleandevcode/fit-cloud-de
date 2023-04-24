package tg;

import bi.z0;
import fm.p;
import gm.a0;
import pm.g1;
import tl.l;

@zl.e(c = "com.topstep.fitcloud.pro.shared.data.friend.FriendRepositoryImpl$flowUnreadMsgCount$1$1", f = "FriendRepository.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class e extends zl.i implements p<sm.g<? super Integer>, xl.d<? super l>, Object> {

    /* renamed from: e */
    public final /* synthetic */ a0<g1> f28138e;

    /* renamed from: f */
    public final /* synthetic */ i f28139f;

    /* renamed from: g */
    public final /* synthetic */ Long f28140g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(a0<g1> a0Var, i iVar, Long l10, xl.d<? super e> dVar) {
        super(2, dVar);
        this.f28138e = a0Var;
        this.f28139f = iVar;
        this.f28140g = l10;
    }

    @Override // fm.p
    public final Object A(sm.g<? super Integer> gVar, xl.d<? super l> dVar) {
        return ((e) p(gVar, dVar)).t(l.f28297a);
    }

    @Override // zl.a
    public final xl.d<l> p(Object obj, xl.d<?> dVar) {
        return new e(this.f28138e, this.f28139f, this.f28140g, dVar);
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [pm.z1, T, pm.l1] */
    @Override // zl.a
    public final Object t(Object obj) {
        mf.a0.k(obj);
        a0<g1> a0Var = this.f28138e;
        i iVar = this.f28139f;
        ?? g10 = z0.g(iVar.f28149d, null, 0, new j(iVar, this.f28140g.longValue(), null), 3);
        g10.k(k.f28176b);
        a0Var.f15485a = g10;
        return l.f28297a;
    }
}
