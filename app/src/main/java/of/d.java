package of;

/* loaded from: classes2.dex */
public final class d extends u {

    /* renamed from: a */
    public final k f23091a;

    /* renamed from: b */
    public final d f23092b = this;

    /* renamed from: c */
    public sl.a<ek.a> f23093c = mk.a.b(new a());

    /* loaded from: classes2.dex */
    public static final class a<T> implements sl.a<T> {
        @Override // sl.a, dk.a
        public final T get() {
            return (T) new ik.f();
        }
    }

    public d(k kVar) {
        this.f23091a = kVar;
    }

    @Override // dagger.hilt.android.internal.managers.c.InterfaceC0221c
    public final ek.a a() {
        return this.f23093c.get();
    }

    @Override // dagger.hilt.android.internal.managers.a.InterfaceC0220a
    public final of.a b() {
        return new of.a(this.f23091a, this.f23092b);
    }
}
