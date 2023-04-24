package xg;

import fm.r;
import mf.a0;
import tl.l;
import xl.d;
import zl.e;
import zl.i;

@e(c = "com.topstep.fitcloud.pro.shared.data.notice.NoticeRepositoryImpl$flowNotice$1", f = "NoticeRepository.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class b extends i implements r<Boolean, Boolean, Integer, d<? super ag.a>, Object> {

    /* renamed from: e */
    public /* synthetic */ boolean f30542e;

    /* renamed from: f */
    public /* synthetic */ boolean f30543f;

    /* renamed from: g */
    public /* synthetic */ int f30544g;

    public b(d<? super b> dVar) {
        super(4, dVar);
    }

    @Override // fm.r
    public final Object s(Boolean bool, Boolean bool2, Integer num, d<? super ag.a> dVar) {
        boolean booleanValue = bool.booleanValue();
        boolean booleanValue2 = bool2.booleanValue();
        int intValue = num.intValue();
        b bVar = new b(dVar);
        bVar.f30542e = booleanValue;
        bVar.f30543f = booleanValue2;
        bVar.f30544g = intValue;
        return bVar.t(l.f28297a);
    }

    @Override // zl.a
    public final Object t(Object obj) {
        a0.k(obj);
        return new ag.a(this.f30542e, this.f30543f, this.f30544g > 0);
    }
}
