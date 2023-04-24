package oc;

/* loaded from: classes.dex */
public final class u implements v3.c {

    /* renamed from: a */
    public final /* synthetic */ int f23044a;

    /* renamed from: b */
    public final w3.a f23045b;

    /* renamed from: c */
    public final w3.a f23046c;

    public /* synthetic */ u(int i10, w3.a aVar, w3.a aVar2) {
        this.f23044a = i10;
        this.f23045b = aVar;
        this.f23046c = aVar2;
    }

    @Override // w3.a
    public final Object get() {
        switch (this.f23044a) {
            case 0:
                return new t((sc.a) this.f23045b.get(), (qc.v) this.f23046c.get());
            case 1:
                return new n0((c1) this.f23045b.get(), ((Integer) this.f23046c.get()).intValue());
            default:
                return new tc.l((tc.o) this.f23045b.get(), (String[][]) this.f23046c.get());
        }
    }
}
