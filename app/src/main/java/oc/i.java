package oc;

import android.content.Context;

/* loaded from: classes.dex */
public final class i implements v3.c {

    /* renamed from: a */
    public final /* synthetic */ int f22988a;

    /* renamed from: b */
    public final w3.a f22989b;

    /* renamed from: c */
    public final w3.a f22990c;

    public /* synthetic */ i(int i10, w3.a aVar, w3.a aVar2) {
        this.f22988a = i10;
        this.f22989b = aVar;
        this.f22990c = aVar2;
    }

    @Override // w3.a
    public final Object get() {
        switch (this.f22988a) {
            case 0:
                kc.z0 z0Var = (kc.z0) this.f22990c.get();
                return new qc.m0(z0Var.f18437b, z0Var.f18436a, (tk.o) this.f22989b.get());
            case 1:
                return new s((sc.d) this.f22989b.get(), (qc.z) this.f22990c.get());
            case 2:
                return new rc.u((rc.t) this.f22989b.get(), (tk.o) this.f22990c.get());
            default:
                return new tc.c0((Context) this.f22989b.get(), (tc.d0) this.f22990c.get());
        }
    }
}
