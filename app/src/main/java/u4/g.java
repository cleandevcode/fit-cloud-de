package u4;

import java.util.ArrayList;
import java.util.HashMap;
import u4.l;

/* loaded from: classes.dex */
public final class g<K extends l, V> {

    /* renamed from: a */
    public final a<K, V> f28478a = new a<>();

    /* renamed from: b */
    public final HashMap f28479b = new HashMap();

    /* loaded from: classes.dex */
    public static class a<K, V> {

        /* renamed from: a */
        public final K f28480a;

        /* renamed from: b */
        public ArrayList f28481b;

        /* renamed from: c */
        public a<K, V> f28482c;

        /* renamed from: d */
        public a<K, V> f28483d;

        public a() {
            this(null);
        }

        public a(K k10) {
            this.f28483d = this;
            this.f28482c = this;
            this.f28480a = k10;
        }
    }

    public final V a(K k10) {
        a aVar;
        int i10;
        a aVar2 = (a) this.f28479b.get(k10);
        if (aVar2 == null) {
            a aVar3 = new a(k10);
            this.f28479b.put(k10, aVar3);
            aVar = aVar3;
        } else {
            k10.a();
            aVar = aVar2;
        }
        a<K, V> aVar4 = aVar.f28483d;
        aVar4.f28482c = aVar.f28482c;
        aVar.f28482c.f28483d = aVar4;
        a<K, V> aVar5 = this.f28478a;
        aVar.f28483d = aVar5;
        a<K, V> aVar6 = aVar5.f28482c;
        aVar.f28482c = aVar6;
        aVar6.f28483d = aVar;
        aVar.f28483d.f28482c = aVar;
        ArrayList arrayList = aVar.f28481b;
        if (arrayList != null) {
            i10 = arrayList.size();
        } else {
            i10 = 0;
        }
        if (i10 > 0) {
            return (V) aVar.f28481b.remove(i10 - 1);
        }
        return null;
    }

    public final void b(K k10, V v10) {
        a aVar = (a) this.f28479b.get(k10);
        if (aVar == null) {
            aVar = new a(k10);
            a<K, V> aVar2 = aVar.f28483d;
            aVar2.f28482c = aVar.f28482c;
            aVar.f28482c.f28483d = aVar2;
            a<K, V> aVar3 = this.f28478a;
            aVar.f28483d = aVar3.f28483d;
            aVar.f28482c = aVar3;
            aVar3.f28483d = aVar;
            aVar.f28483d.f28482c = aVar;
            this.f28479b.put(k10, aVar);
        } else {
            k10.a();
        }
        if (aVar.f28481b == null) {
            aVar.f28481b = new ArrayList();
        }
        aVar.f28481b.add(v10);
    }

    public final V c() {
        int i10;
        a aVar = this.f28478a;
        while (true) {
            aVar = aVar.f28483d;
            V v10 = null;
            if (aVar.equals(this.f28478a)) {
                return null;
            }
            ArrayList arrayList = aVar.f28481b;
            if (arrayList != null) {
                i10 = arrayList.size();
            } else {
                i10 = 0;
            }
            if (i10 > 0) {
                v10 = (V) aVar.f28481b.remove(i10 - 1);
            }
            if (v10 != null) {
                return v10;
            }
            a<K, V> aVar2 = aVar.f28483d;
            aVar2.f28482c = aVar.f28482c;
            aVar.f28482c.f28483d = aVar2;
            this.f28479b.remove(aVar.f28480a);
            ((l) aVar.f28480a).a();
        }
    }

    public final String toString() {
        int i10;
        StringBuilder sb2 = new StringBuilder("GroupedLinkedMap( ");
        boolean z10 = false;
        for (a aVar = this.f28478a.f28482c; !aVar.equals(this.f28478a); aVar = aVar.f28482c) {
            z10 = true;
            sb2.append('{');
            sb2.append(aVar.f28480a);
            sb2.append(':');
            ArrayList arrayList = aVar.f28481b;
            if (arrayList != null) {
                i10 = arrayList.size();
            } else {
                i10 = 0;
            }
            sb2.append(i10);
            sb2.append("}, ");
        }
        if (z10) {
            sb2.delete(sb2.length() - 2, sb2.length());
        }
        sb2.append(" )");
        return sb2.toString();
    }
}
