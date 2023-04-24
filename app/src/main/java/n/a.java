package n;

import java.util.HashMap;
import n.b;

/* loaded from: classes.dex */
public final class a<K, V> extends b<K, V> {

    /* renamed from: e */
    public HashMap<K, b.c<K, V>> f21895e = new HashMap<>();

    @Override // n.b
    public final b.c<K, V> b(K k10) {
        return this.f21895e.get(k10);
    }

    @Override // n.b
    public final V e(K k10, V v10) {
        b.c<K, V> b10 = b(k10);
        if (b10 != null) {
            return b10.f21901b;
        }
        HashMap<K, b.c<K, V>> hashMap = this.f21895e;
        b.c<K, V> cVar = new b.c<>(k10, v10);
        this.f21899d++;
        b.c<K, V> cVar2 = this.f21897b;
        if (cVar2 == null) {
            this.f21896a = cVar;
        } else {
            cVar2.f21902c = cVar;
            cVar.f21903d = cVar2;
        }
        this.f21897b = cVar;
        hashMap.put(k10, cVar);
        return null;
    }

    @Override // n.b
    public final V f(K k10) {
        V v10 = (V) super.f(k10);
        this.f21895e.remove(k10);
        return v10;
    }
}
