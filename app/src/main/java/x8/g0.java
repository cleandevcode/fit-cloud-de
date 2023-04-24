package x8;

/* loaded from: classes.dex */
public final class g0 extends f0 {

    /* renamed from: e */
    public static final g0 f30415e = new g0(0, new Object[0]);

    /* renamed from: c */
    public final transient Object[] f30416c;

    /* renamed from: d */
    public final transient int f30417d;

    public g0(int i10, Object[] objArr) {
        this.f30416c = objArr;
        this.f30417d = i10;
    }

    @Override // x8.f0, x8.c0
    public final void b(Object[] objArr) {
        System.arraycopy(this.f30416c, 0, objArr, 0, this.f30417d);
    }

    @Override // x8.c0
    public final int e() {
        return this.f30417d;
    }

    @Override // x8.c0
    public final int f() {
        return 0;
    }

    @Override // java.util.List
    public final Object get(int i10) {
        p.b.A(i10, this.f30417d);
        Object obj = this.f30416c[i10];
        obj.getClass();
        return obj;
    }

    @Override // x8.c0
    public final boolean k() {
        return false;
    }

    @Override // x8.c0
    public final Object[] n() {
        return this.f30416c;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f30417d;
    }
}
