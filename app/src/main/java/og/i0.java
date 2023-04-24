package og;

import p000do.a;

@zl.e(c = "com.topstep.fitcloud.pro.shared.data.device.DeviceManagerImpl$flowDevice$1", f = "DeviceManager.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class i0 extends zl.i implements fm.q<wf.a, wf.a, xl.d<? super wf.a>, Object> {

    /* renamed from: e */
    public /* synthetic */ wf.a f23361e;

    /* renamed from: f */
    public /* synthetic */ wf.a f23362f;

    public i0(xl.d<? super i0> dVar) {
        super(3, dVar);
    }

    @Override // fm.q
    public final Object j(wf.a aVar, wf.a aVar2, xl.d<? super wf.a> dVar) {
        i0 i0Var = new i0(dVar);
        i0Var.f23361e = aVar;
        i0Var.f23362f = aVar2;
        return i0Var.t(tl.l.f28297a);
    }

    @Override // zl.a
    public final Object t(Object obj) {
        mf.a0.k(obj);
        wf.a aVar = this.f23361e;
        wf.a aVar2 = this.f23362f;
        a.b bVar = p000do.a.f13275a;
        bVar.t("DeviceManager");
        boolean z10 = false;
        bVar.h("device fromMemory:%s , fromStorage:%s", aVar, aVar2);
        if ((aVar2 == null || !aVar2.f29804c) ? true : true) {
            if (aVar == null) {
                return aVar2;
            }
            return aVar;
        }
        throw new IllegalStateException("Check failed.".toString());
    }
}
