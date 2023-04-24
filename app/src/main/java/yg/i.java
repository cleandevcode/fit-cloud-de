package yg;

import v1.d;
import yg.b;

@zl.e(c = "com.topstep.fitcloud.pro.shared.data.storage.GlobalStorageImpl$setUpgradeCheckTime$2", f = "GlobalStorageImpl.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class i extends zl.i implements fm.p<v1.a, xl.d<? super tl.l>, Object> {

    /* renamed from: e */
    public /* synthetic */ Object f31583e;

    /* renamed from: f */
    public final /* synthetic */ long f31584f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(long j10, xl.d<? super i> dVar) {
        super(2, dVar);
        this.f31584f = j10;
    }

    @Override // fm.p
    public final Object A(v1.a aVar, xl.d<? super tl.l> dVar) {
        return ((i) p(aVar, dVar)).t(tl.l.f28297a);
    }

    @Override // zl.a
    public final xl.d<tl.l> p(Object obj, xl.d<?> dVar) {
        i iVar = new i(this.f31584f, dVar);
        iVar.f31583e = obj;
        return iVar;
    }

    @Override // zl.a
    public final Object t(Object obj) {
        mf.a0.k(obj);
        d.a<Integer> aVar = b.C0579b.f31496a;
        ((v1.a) this.f31583e).d(b.C0579b.f31502g, new Long(this.f31584f));
        return tl.l.f28297a;
    }
}
