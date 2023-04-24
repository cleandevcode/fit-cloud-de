package o0;

import java.util.Map;

/* loaded from: classes.dex */
public final class a extends g<Object, Object> {

    /* renamed from: d */
    public final /* synthetic */ b f22508d;

    public a(b bVar) {
        this.f22508d = bVar;
    }

    @Override // o0.g
    public final void a() {
        this.f22508d.clear();
    }

    @Override // o0.g
    public final Object b(int i10, int i11) {
        return this.f22508d.f22551b[(i10 << 1) + i11];
    }

    @Override // o0.g
    public final Map<Object, Object> c() {
        return this.f22508d;
    }

    @Override // o0.g
    public final int d() {
        return this.f22508d.f22552c;
    }

    @Override // o0.g
    public final int e(Object obj) {
        return this.f22508d.f(obj);
    }

    @Override // o0.g
    public final int f(Object obj) {
        return this.f22508d.h(obj);
    }

    @Override // o0.g
    public final void g(Object obj, Object obj2) {
        this.f22508d.put(obj, obj2);
    }

    @Override // o0.g
    public final void h(int i10) {
        this.f22508d.k(i10);
    }

    @Override // o0.g
    public final Object i(int i10, Object obj) {
        return this.f22508d.l(i10, obj);
    }
}
