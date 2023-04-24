package oc;

/* loaded from: classes.dex */
public final class j0 implements v3.c {

    /* renamed from: a */
    public final /* synthetic */ int f23001a;

    /* renamed from: b */
    public final w3.a f23002b;

    /* renamed from: c */
    public final w3.a f23003c;

    /* renamed from: d */
    public final w3.a f23004d;

    /* renamed from: e */
    public final w3.a f23005e;

    public /* synthetic */ j0(w3.a aVar, w3.a aVar2, w3.a aVar3, w3.a aVar4, int i10) {
        this.f23001a = i10;
        this.f23002b = aVar;
        this.f23003c = aVar2;
        this.f23004d = aVar3;
        this.f23005e = aVar4;
    }

    @Override // w3.a
    public final Object get() {
        switch (this.f23001a) {
            case 0:
                return new i0((sc.d) this.f23002b.get(), (k0) this.f23003c.get(), (kc.v0) this.f23004d.get(), (qc.z) this.f23005e.get());
            case 1:
                return new c1((tk.o) this.f23002b.get(), (a) this.f23003c.get(), (v) this.f23004d.get(), (o0) this.f23005e.get());
            default:
                return new rc.g0((tc.l0) this.f23002b.get(), (rc.h) this.f23003c.get(), (rc.y) this.f23004d.get(), (rc.d) this.f23005e.get());
        }
    }
}
