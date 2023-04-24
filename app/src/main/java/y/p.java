package y;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;

/* loaded from: classes.dex */
public final class p {

    /* renamed from: b */
    public static final p f30747b;

    /* renamed from: c */
    public static final p f30748c;

    /* renamed from: a */
    public LinkedHashSet<m> f30749a;

    static {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.add(new a0.e1(0));
        f30747b = new p(linkedHashSet);
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        linkedHashSet2.add(new a0.e1(1));
        f30748c = new p(linkedHashSet2);
    }

    public p(LinkedHashSet<m> linkedHashSet) {
        this.f30749a = linkedHashSet;
    }

    public final LinkedHashSet<a0.b0> a(LinkedHashSet<a0.b0> linkedHashSet) {
        ArrayList arrayList = new ArrayList();
        Iterator<a0.b0> it = linkedHashSet.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().b());
        }
        List b10 = b(arrayList);
        LinkedHashSet<a0.b0> linkedHashSet2 = new LinkedHashSet<>();
        Iterator<a0.b0> it2 = linkedHashSet.iterator();
        while (it2.hasNext()) {
            a0.b0 next = it2.next();
            if (b10.contains(next.b())) {
                linkedHashSet2.add(next);
            }
        }
        return linkedHashSet2;
    }

    public final List b(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList(arrayList);
        Iterator<m> it = this.f30749a.iterator();
        while (it.hasNext()) {
            arrayList2 = it.next().b(Collections.unmodifiableList(arrayList2));
        }
        arrayList2.retainAll(arrayList);
        return arrayList2;
    }

    public final Integer c() {
        Iterator<m> it = this.f30749a.iterator();
        Integer num = null;
        while (it.hasNext()) {
            m next = it.next();
            if (next instanceof a0.e1) {
                Integer valueOf = Integer.valueOf(((a0.e1) next).f48b);
                if (num == null) {
                    num = valueOf;
                } else if (!num.equals(valueOf)) {
                    throw new IllegalStateException("Multiple conflicting lens facing requirements exist.");
                }
            }
        }
        return num;
    }

    public final void d(LinkedHashSet linkedHashSet) {
        Iterator<a0.b0> it = a(linkedHashSet).iterator();
        if (!it.hasNext()) {
            throw new IllegalArgumentException("No available camera can be found");
        }
        it.next();
    }
}
