package ul;

import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public class z extends ih.v {
    public static final HashMap C(tl.f... fVarArr) {
        HashMap hashMap = new HashMap(ih.v.j(fVarArr.length));
        for (tl.f fVar : fVarArr) {
            hashMap.put(fVar.f28286a, fVar.f28287b);
        }
        return hashMap;
    }

    public static final Map D(tl.f... fVarArr) {
        if (fVarArr.length > 0) {
            LinkedHashMap linkedHashMap = new LinkedHashMap(ih.v.j(fVarArr.length));
            for (tl.f fVar : fVarArr) {
                linkedHashMap.put(fVar.f28286a, fVar.f28287b);
            }
            return linkedHashMap;
        }
        return t.f28880a;
    }

    public static final Map E(AbstractMap abstractMap) {
        gm.l.f(abstractMap, "<this>");
        int size = abstractMap.size();
        return size != 0 ? size != 1 ? H(abstractMap) : ih.v.A(abstractMap) : t.f28880a;
    }

    public static final Map F(ArrayList arrayList) {
        int size = arrayList.size();
        if (size != 0) {
            if (size != 1) {
                LinkedHashMap linkedHashMap = new LinkedHashMap(ih.v.j(arrayList.size()));
                G(arrayList, linkedHashMap);
                return linkedHashMap;
            }
            return ih.v.k((tl.f) arrayList.get(0));
        }
        return t.f28880a;
    }

    public static final void G(ArrayList arrayList, LinkedHashMap linkedHashMap) {
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            tl.f fVar = (tl.f) it.next();
            linkedHashMap.put(fVar.f28286a, fVar.f28287b);
        }
    }

    public static final LinkedHashMap H(Map map) {
        gm.l.f(map, "<this>");
        return new LinkedHashMap(map);
    }
}
