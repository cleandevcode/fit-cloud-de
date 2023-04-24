package tm;

/* loaded from: classes2.dex */
public final class v<T> implements xl.d<T>, zl.d {

    /* renamed from: a */
    public final xl.d<T> f28372a;

    /* renamed from: b */
    public final xl.f f28373b;

    /* JADX WARN: Multi-variable type inference failed */
    public v(xl.d<? super T> dVar, xl.f fVar) {
        this.f28372a = dVar;
        this.f28373b = fVar;
    }

    @Override // xl.d
    public final xl.f e() {
        return this.f28373b;
    }

    @Override // zl.d
    public final zl.d g() {
        xl.d<T> dVar = this.f28372a;
        if (dVar instanceof zl.d) {
            return (zl.d) dVar;
        }
        return null;
    }

    @Override // xl.d
    public final void l(Object obj) {
        this.f28372a.l(obj);
    }
}
