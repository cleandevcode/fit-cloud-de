package tg;

import fm.p;
import mf.a0;
import p000do.a;
import tl.l;

@zl.e(c = "com.topstep.fitcloud.pro.shared.data.friend.FriendRepositoryImpl$flowUnreadMsgCount$1$2", f = "FriendRepository.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class f extends zl.i implements p<Integer, xl.d<? super l>, Object> {

    /* renamed from: e */
    public /* synthetic */ int f28141e;

    public f(xl.d<? super f> dVar) {
        super(2, dVar);
    }

    @Override // fm.p
    public final Object A(Integer num, xl.d<? super l> dVar) {
        return ((f) p(Integer.valueOf(num.intValue()), dVar)).t(l.f28297a);
    }

    @Override // zl.a
    public final xl.d<l> p(Object obj, xl.d<?> dVar) {
        f fVar = new f(dVar);
        fVar.f28141e = ((Number) obj).intValue();
        return fVar;
    }

    @Override // zl.a
    public final Object t(Object obj) {
        a0.k(obj);
        int i10 = this.f28141e;
        a.b bVar = p000do.a.f13275a;
        bVar.t("FriendRepository");
        bVar.h("flowUnReadMsgCount update:%d", new Integer(i10));
        return l.f28297a;
    }
}
