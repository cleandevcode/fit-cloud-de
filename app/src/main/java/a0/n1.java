package a0;

import a0.l0;
import android.util.ArrayMap;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import x.e;

/* loaded from: classes.dex */
public class n1 implements l0 {
    public static final n1 A;

    /* renamed from: z */
    public static final m1 f147z;

    /* renamed from: y */
    public final TreeMap<l0.a<?>, Map<l0.b, Object>> f148y;

    static {
        m1 m1Var = new m1(0);
        f147z = m1Var;
        A = new n1(new TreeMap(m1Var));
    }

    public n1(TreeMap<l0.a<?>, Map<l0.b, Object>> treeMap) {
        this.f148y = treeMap;
    }

    public static n1 A(i1 i1Var) {
        if (n1.class.equals(i1Var.getClass())) {
            return (n1) i1Var;
        }
        TreeMap treeMap = new TreeMap(f147z);
        n1 n1Var = (n1) i1Var;
        for (l0.a<?> aVar : n1Var.d()) {
            Set<l0.b> u10 = n1Var.u(aVar);
            ArrayMap arrayMap = new ArrayMap();
            for (l0.b bVar : u10) {
                arrayMap.put(bVar, n1Var.p(aVar, bVar));
            }
            treeMap.put(aVar, arrayMap);
        }
        return new n1(treeMap);
    }

    @Override // a0.l0
    public final l0.b a(l0.a<?> aVar) {
        Map<l0.b, Object> map = this.f148y.get(aVar);
        if (map != null) {
            return (l0.b) Collections.min(map.keySet());
        }
        throw new IllegalArgumentException("Option does not exist: " + aVar);
    }

    @Override // a0.l0
    public final <ValueT> ValueT c(l0.a<ValueT> aVar) {
        Map<l0.b, Object> map = this.f148y.get(aVar);
        if (map != null) {
            return (ValueT) map.get((l0.b) Collections.min(map.keySet()));
        }
        throw new IllegalArgumentException("Option does not exist: " + aVar);
    }

    @Override // a0.l0
    public final Set<l0.a<?>> d() {
        return Collections.unmodifiableSet(this.f148y.keySet());
    }

    @Override // a0.l0
    public final <ValueT> ValueT e(l0.a<ValueT> aVar, ValueT valuet) {
        try {
            return (ValueT) c(aVar);
        } catch (IllegalArgumentException unused) {
            return valuet;
        }
    }

    @Override // a0.l0
    public final void m(x.d dVar) {
        for (Map.Entry<l0.a<?>, Map<l0.b, Object>> entry : this.f148y.tailMap(l0.a.a("camera2.captureRequest.option.", Void.class)).entrySet()) {
            if (entry.getKey().b().startsWith("camera2.captureRequest.option.")) {
                l0.a<?> key = entry.getKey();
                l0 l0Var = (l0) dVar.f30081c;
                ((e.a) dVar.f30080b).f30083a.D(key, l0Var.a(key), l0Var.c(key));
            } else {
                return;
            }
        }
    }

    @Override // a0.l0
    public final <ValueT> ValueT p(l0.a<ValueT> aVar, l0.b bVar) {
        Map<l0.b, Object> map = this.f148y.get(aVar);
        if (map == null) {
            throw new IllegalArgumentException("Option does not exist: " + aVar);
        } else if (map.containsKey(bVar)) {
            return (ValueT) map.get(bVar);
        } else {
            throw new IllegalArgumentException("Option does not exist: " + aVar + " with priority=" + bVar);
        }
    }

    @Override // a0.l0
    public final Set<l0.b> u(l0.a<?> aVar) {
        Map<l0.b, Object> map = this.f148y.get(aVar);
        return map == null ? Collections.emptySet() : Collections.unmodifiableSet(map.keySet());
    }

    @Override // a0.l0
    public final boolean z(l0.a<?> aVar) {
        return this.f148y.containsKey(aVar);
    }
}
