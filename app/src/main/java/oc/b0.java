package oc;

/* loaded from: classes.dex */
public final class b0 implements v3.c {

    /* renamed from: a */
    public final /* synthetic */ int f22928a;

    /* renamed from: b */
    public final w3.a f22929b;

    public /* synthetic */ b0(w3.a aVar, int i10) {
        this.f22928a = i10;
        this.f22929b = aVar;
    }

    @Override // w3.a
    public final Object get() {
        switch (this.f22928a) {
            case 0:
                return new a0((c0) this.f22929b.get());
            case 1:
                return new k1((d0) this.f22929b.get());
            case 2:
                return new rc.y((tk.o) this.f22929b.get());
            default:
                return new sc.b((tk.o) this.f22929b.get());
        }
    }
}
