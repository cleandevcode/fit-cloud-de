package a0;

import a0.l0;
import android.util.ArrayMap;
import java.util.Collections;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.TreeMap;

/* loaded from: classes.dex */
public final class j1 extends n1 implements i1 {
    public j1(TreeMap<l0.a<?>, Map<l0.b, Object>> treeMap) {
        super(treeMap);
    }

    public static j1 B() {
        return new j1(new TreeMap(n1.f147z));
    }

    public static j1 C(l0 l0Var) {
        TreeMap treeMap = new TreeMap(n1.f147z);
        for (l0.a<?> aVar : l0Var.d()) {
            Set<l0.b> u10 = l0Var.u(aVar);
            ArrayMap arrayMap = new ArrayMap();
            for (l0.b bVar : u10) {
                arrayMap.put(bVar, l0Var.p(aVar, bVar));
            }
            treeMap.put(aVar, arrayMap);
        }
        return new j1(treeMap);
    }

    public final <ValueT> void D(l0.a<ValueT> aVar, l0.b bVar, ValueT valuet) {
        l0.b bVar2;
        Map<l0.b, Object> map = this.f148y.get(aVar);
        if (map == null) {
            ArrayMap arrayMap = new ArrayMap();
            this.f148y.put(aVar, arrayMap);
            arrayMap.put(bVar, valuet);
            return;
        }
        l0.b bVar3 = (l0.b) Collections.min(map.keySet());
        if (!Objects.equals(map.get(bVar3), valuet)) {
            l0.b bVar4 = l0.b.ALWAYS_OVERRIDE;
            boolean z10 = true;
            if ((bVar3 != bVar4 || bVar != bVar4) && (bVar3 != (bVar2 = l0.b.REQUIRED) || bVar != bVar2)) {
                z10 = false;
            }
            if (z10) {
                StringBuilder a10 = android.support.v4.media.d.a("Option values conflicts: ");
                a10.append(aVar.b());
                a10.append(", existing value (");
                a10.append(bVar3);
                a10.append(")=");
                a10.append(map.get(bVar3));
                a10.append(", conflicting (");
                a10.append(bVar);
                a10.append(")=");
                a10.append(valuet);
                throw new IllegalArgumentException(a10.toString());
            }
        }
        map.put(bVar, valuet);
    }

    public final <ValueT> void E(l0.a<ValueT> aVar, ValueT valuet) {
        D(aVar, l0.b.OPTIONAL, valuet);
    }
}
