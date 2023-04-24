package yg;

import v1.d;
import yg.b;

@zl.e(c = "com.topstep.fitcloud.pro.shared.data.storage.GlobalStorageImpl$setHardwareUpgradeVersion$2", f = "GlobalStorageImpl.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class h extends zl.i implements fm.p<v1.a, xl.d<? super tl.l>, Object> {

    /* renamed from: e */
    public /* synthetic */ Object f31581e;

    /* renamed from: f */
    public final /* synthetic */ String f31582f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(String str, xl.d<? super h> dVar) {
        super(2, dVar);
        this.f31582f = str;
    }

    @Override // fm.p
    public final Object A(v1.a aVar, xl.d<? super tl.l> dVar) {
        return ((h) p(aVar, dVar)).t(tl.l.f28297a);
    }

    @Override // zl.a
    public final xl.d<tl.l> p(Object obj, xl.d<?> dVar) {
        h hVar = new h(this.f31582f, dVar);
        hVar.f31581e = obj;
        return hVar;
    }

    @Override // zl.a
    public final Object t(Object obj) {
        mf.a0.k(obj);
        v1.a aVar = (v1.a) this.f31581e;
        d.a<Integer> aVar2 = b.C0579b.f31496a;
        d.a<String> aVar3 = b.C0579b.f31500e;
        String str = (String) aVar.b(aVar3);
        String str2 = this.f31582f;
        if (str2 == null) {
            str2 = "";
        }
        aVar.d(aVar3, str2);
        if (!gm.l.a(this.f31582f, str)) {
            aVar.d(b.C0579b.f31501f, Boolean.FALSE);
        }
        return tl.l.f28297a;
    }
}
