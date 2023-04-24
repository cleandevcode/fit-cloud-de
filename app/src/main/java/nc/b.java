package nc;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import nc.d;

/* loaded from: classes.dex */
public final class b implements Map<String, mc.b> {

    /* renamed from: a */
    public final HashMap<String, d> f22222a;

    /* renamed from: b */
    public final d.a f22223b;

    /* loaded from: classes.dex */
    public class a implements d.a {
    }

    public b() {
        a aVar = new a();
        this.f22222a = new HashMap<>();
        this.f22223b = aVar;
    }

    public final void a() {
        boolean z10;
        Iterator<Map.Entry<String, d>> it = this.f22222a.entrySet().iterator();
        while (it.hasNext()) {
            if (it.next().getValue().get() == null) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                it.remove();
            }
        }
    }

    @Override // java.util.Map
    /* renamed from: c */
    public final mc.b get(Object obj) {
        d dVar = this.f22222a.get(obj);
        if (dVar != null) {
            return dVar.get();
        }
        return null;
    }

    @Override // java.util.Map
    public final void clear() {
        this.f22222a.clear();
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return this.f22222a.containsKey(obj) && get(obj) != null;
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        boolean z10;
        Iterator<d> it = this.f22222a.values().iterator();
        do {
            z10 = false;
            if (!it.hasNext()) {
                return false;
            }
            mc.b bVar = it.next().get();
            if ((obj instanceof mc.b) && bVar != null && bVar.a() == ((mc.b) obj).a()) {
                z10 = true;
                continue;
            }
        } while (!z10);
        return true;
    }

    @Override // java.util.Map
    public final Set<Map.Entry<String, mc.b>> entrySet() {
        boolean z10;
        HashSet hashSet = new HashSet();
        for (Map.Entry<String, d> entry : this.f22222a.entrySet()) {
            d value = entry.getValue();
            if (value.get() == null) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!z10) {
                ((a) this.f22223b).getClass();
                hashSet.add(new nc.a(entry.getKey(), new d(value.get())));
            }
        }
        return hashSet;
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        a();
        return this.f22222a.isEmpty();
    }

    @Override // java.util.Map
    public final Set<String> keySet() {
        return this.f22222a.keySet();
    }

    @Override // java.util.Map
    public final mc.b put(String str, mc.b bVar) {
        mc.b bVar2 = bVar;
        HashMap<String, d> hashMap = this.f22222a;
        ((a) this.f22223b).getClass();
        hashMap.put(str, new d(bVar2));
        a();
        return bVar2;
    }

    @Override // java.util.Map
    public final void putAll(Map<? extends String, ? extends mc.b> map) {
        for (Map.Entry<? extends String, ? extends mc.b> entry : map.entrySet()) {
            HashMap<String, d> hashMap = this.f22222a;
            ((a) this.f22223b).getClass();
            hashMap.put(entry.getKey(), new d(entry.getValue()));
            a();
        }
    }

    @Override // java.util.Map
    public final mc.b remove(Object obj) {
        d remove = this.f22222a.remove(obj);
        a();
        if (remove != null) {
            return remove.get();
        }
        return null;
    }

    @Override // java.util.Map
    public final int size() {
        a();
        return this.f22222a.size();
    }

    @Override // java.util.Map
    public final Collection<mc.b> values() {
        boolean z10;
        ArrayList arrayList = new ArrayList();
        for (d dVar : this.f22222a.values()) {
            if (dVar.get() == null) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!z10) {
                arrayList.add(dVar.get());
            }
        }
        return arrayList;
    }
}
