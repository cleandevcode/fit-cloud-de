package o0;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import o0.g;

/* loaded from: classes.dex */
public class b<K, V> extends h<K, V> implements Map<K, V> {

    /* renamed from: h */
    public a f22509h;

    public b() {
    }

    public b(int i10) {
        super(i10);
    }

    public b(b bVar) {
        if (bVar != null) {
            j(bVar);
        }
    }

    @Override // java.util.Map
    public final Set<Map.Entry<K, V>> entrySet() {
        if (this.f22509h == null) {
            this.f22509h = new a(this);
        }
        a aVar = this.f22509h;
        if (aVar.f22531a == null) {
            aVar.f22531a = new g.b();
        }
        return aVar.f22531a;
    }

    @Override // java.util.Map
    public final Set<K> keySet() {
        if (this.f22509h == null) {
            this.f22509h = new a(this);
        }
        a aVar = this.f22509h;
        if (aVar.f22532b == null) {
            aVar.f22532b = new g.c();
        }
        return aVar.f22532b;
    }

    @Override // java.util.Map
    public final void putAll(Map<? extends K, ? extends V> map) {
        c(map.size() + this.f22552c);
        for (Map.Entry<? extends K, ? extends V> entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    @Override // java.util.Map
    public final Collection<V> values() {
        if (this.f22509h == null) {
            this.f22509h = new a(this);
        }
        a aVar = this.f22509h;
        if (aVar.f22533c == null) {
            aVar.f22533c = new g.e();
        }
        return aVar.f22533c;
    }
}
