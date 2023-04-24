package x8;

/* loaded from: classes.dex */
public final class e0 extends f0 {

    /* renamed from: c */
    public final transient int f30408c;

    /* renamed from: d */
    public final transient int f30409d;

    /* renamed from: e */
    public final /* synthetic */ f0 f30410e;

    public e0(f0 f0Var, int i10, int i11) {
        this.f30410e = f0Var;
        this.f30408c = i10;
        this.f30409d = i11;
    }

    @Override // x8.c0
    public final int e() {
        return this.f30410e.f() + this.f30408c + this.f30409d;
    }

    @Override // x8.c0
    public final int f() {
        return this.f30410e.f() + this.f30408c;
    }

    @Override // java.util.List
    public final Object get(int i10) {
        p.b.A(i10, this.f30409d);
        return this.f30410e.get(i10 + this.f30408c);
    }

    @Override // x8.c0
    public final boolean k() {
        return true;
    }

    @Override // x8.c0
    public final Object[] n() {
        return this.f30410e.n();
    }

    @Override // x8.f0, java.util.List
    /* renamed from: o */
    public final f0 subList(int i10, int i11) {
        p.b.C(i10, i11, this.f30409d);
        f0 f0Var = this.f30410e;
        int i12 = this.f30408c;
        return f0Var.subList(i10 + i12, i11 + i12);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f30409d;
    }
}
