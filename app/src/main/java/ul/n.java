package ul;

import gm.e0;
import java.util.AbstractCollection;
import java.util.AbstractList;
import java.util.Collection;
import java.util.Iterator;
import java.util.RandomAccess;

/* loaded from: classes2.dex */
public class n extends m {
    public static final void D(Iterable iterable, AbstractCollection abstractCollection) {
        gm.l.f(abstractCollection, "<this>");
        gm.l.f(iterable, "elements");
        if (iterable instanceof Collection) {
            abstractCollection.addAll((Collection) iterable);
            return;
        }
        for (Object obj : iterable) {
            abstractCollection.add(obj);
        }
    }

    public static final void E(AbstractList abstractList, fm.l lVar) {
        int k10;
        gm.l.f(abstractList, "<this>");
        if (!(abstractList instanceof RandomAccess)) {
            if ((abstractList instanceof hm.a) && !(abstractList instanceof hm.b)) {
                e0.d(abstractList, "kotlin.collections.MutableIterable");
                throw null;
            }
            Iterator it = abstractList.iterator();
            while (it.hasNext()) {
                if (((Boolean) lVar.k(it.next())).booleanValue()) {
                    it.remove();
                }
            }
            return;
        }
        int i10 = 0;
        lm.i it2 = new lm.j(0, h7.a.k(abstractList)).iterator();
        while (it2.f20076c) {
            int nextInt = it2.nextInt();
            Object obj = abstractList.get(nextInt);
            if (!((Boolean) lVar.k(obj)).booleanValue()) {
                if (i10 != nextInt) {
                    abstractList.set(i10, obj);
                }
                i10++;
            }
        }
        if (i10 >= abstractList.size() || i10 > (k10 = h7.a.k(abstractList))) {
            return;
        }
        while (true) {
            abstractList.remove(k10);
            if (k10 != i10) {
                k10--;
            } else {
                return;
            }
        }
    }
}
