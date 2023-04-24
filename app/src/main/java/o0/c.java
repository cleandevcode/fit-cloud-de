package o0;

import java.util.Map;

/* loaded from: classes.dex */
public final class c extends g<Object, Object> {

    /* renamed from: d */
    public final /* synthetic */ d f22510d;

    public c(d dVar) {
        this.f22510d = dVar;
    }

    @Override // o0.g
    public final void a() {
        this.f22510d.clear();
    }

    @Override // o0.g
    public final Object b(int i10, int i11) {
        return this.f22510d.f22518b[i10];
    }

    @Override // o0.g
    public final Map<Object, Object> c() {
        throw new UnsupportedOperationException("not a map");
    }

    @Override // o0.g
    public final int d() {
        return this.f22510d.f22519c;
    }

    @Override // o0.g
    public final int e(Object obj) {
        return this.f22510d.indexOf(obj);
    }

    @Override // o0.g
    public final int f(Object obj) {
        return this.f22510d.indexOf(obj);
    }

    @Override // o0.g
    public final void g(Object obj, Object obj2) {
        this.f22510d.add(obj);
    }

    @Override // o0.g
    public final void h(int i10) {
        this.f22510d.j(i10);
    }

    @Override // o0.g
    public final Object i(int i10, Object obj) {
        throw new UnsupportedOperationException("not a map");
    }
}
