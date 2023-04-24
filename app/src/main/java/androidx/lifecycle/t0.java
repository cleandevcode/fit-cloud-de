package androidx.lifecycle;

import androidx.lifecycle.s0;
import androidx.lifecycle.v0;

/* loaded from: classes.dex */
public final class t0<VM extends s0> implements tl.d<VM> {

    /* renamed from: a */
    public final mm.b<VM> f2783a;

    /* renamed from: b */
    public final fm.a<x0> f2784b;

    /* renamed from: c */
    public final fm.a<v0.b> f2785c;

    /* renamed from: d */
    public final fm.a<d2.a> f2786d;

    /* renamed from: e */
    public VM f2787e;

    public t0(gm.e eVar, fm.a aVar, fm.a aVar2, fm.a aVar3) {
        this.f2783a = eVar;
        this.f2784b = aVar;
        this.f2785c = aVar2;
        this.f2786d = aVar3;
    }

    @Override // tl.d
    public final Object getValue() {
        VM vm2 = this.f2787e;
        if (vm2 == null) {
            VM vm3 = (VM) new v0(this.f2784b.m(), this.f2785c.m(), this.f2786d.m()).a(bi.m0.p(this.f2783a));
            this.f2787e = vm3;
            return vm3;
        }
        return vm2;
    }
}
