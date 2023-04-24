package oc;

/* loaded from: classes.dex */
public final class l0 implements v3.c {

    /* renamed from: a */
    public final /* synthetic */ int f23011a;

    /* renamed from: b */
    public final w3.a f23012b;

    /* renamed from: c */
    public final w3.a f23013c;

    public /* synthetic */ l0(int i10, v3.c cVar, w3.a aVar) {
        this.f23011a = i10;
        this.f23012b = cVar;
        this.f23013c = aVar;
    }

    @Override // w3.a
    public final Object get() {
        switch (this.f23011a) {
            case 0:
                return new k0((kc.v0) this.f23012b.get(), ((Integer) this.f23013c.get()).intValue());
            default:
                return new rc.h((tc.m0) this.f23012b.get(), (rc.k) this.f23013c.get());
        }
    }
}
