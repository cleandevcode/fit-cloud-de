package oc;

import oc.g;

/* loaded from: classes.dex */
public final class e0 implements v3.c {

    /* renamed from: a */
    public final /* synthetic */ int f22967a;

    /* renamed from: b */
    public final w3.a f22968b;

    public /* synthetic */ e0(int i10) {
        g gVar = g.a.f22979a;
        this.f22967a = i10;
        this.f22968b = gVar;
    }

    @Override // w3.a
    public final Object get() {
        switch (this.f22967a) {
            case 0:
                return new d0((tc.k) this.f22968b.get());
            default:
                return new pc.c((tc.k) this.f22968b.get());
        }
    }
}
