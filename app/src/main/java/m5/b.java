package m5;

/* loaded from: classes.dex */
public final class b<K, V> extends o0.b<K, V> {

    /* renamed from: i */
    public int f20361i;

    @Override // o0.h, java.util.Map
    public final void clear() {
        this.f20361i = 0;
        super.clear();
    }

    @Override // o0.h, java.util.Map
    public final int hashCode() {
        if (this.f20361i == 0) {
            this.f20361i = super.hashCode();
        }
        return this.f20361i;
    }

    @Override // o0.h
    public final void j(o0.b bVar) {
        this.f20361i = 0;
        super.j(bVar);
    }

    @Override // o0.h
    public final V k(int i10) {
        this.f20361i = 0;
        return (V) super.k(i10);
    }

    @Override // o0.h
    public final V l(int i10, V v10) {
        this.f20361i = 0;
        return (V) super.l(i10, v10);
    }

    @Override // o0.h, java.util.Map
    public final V put(K k10, V v10) {
        this.f20361i = 0;
        return (V) super.put(k10, v10);
    }
}
