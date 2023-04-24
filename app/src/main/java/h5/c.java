package h5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import r4.j;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a */
    public final ArrayList f15875a = new ArrayList();

    /* renamed from: b */
    public final HashMap f15876b = new HashMap();

    /* loaded from: classes.dex */
    public static class a<T, R> {

        /* renamed from: a */
        public final Class<T> f15877a;

        /* renamed from: b */
        public final Class<R> f15878b;

        /* renamed from: c */
        public final j<T, R> f15879c;

        public a(Class<T> cls, Class<R> cls2, j<T, R> jVar) {
            this.f15877a = cls;
            this.f15878b = cls2;
            this.f15879c = jVar;
        }
    }

    public final synchronized List<a<?, ?>> a(String str) {
        List<a<?, ?>> list;
        if (!this.f15875a.contains(str)) {
            this.f15875a.add(str);
        }
        list = (List) this.f15876b.get(str);
        if (list == null) {
            list = new ArrayList<>();
            this.f15876b.put(str, list);
        }
        return list;
    }

    public final synchronized ArrayList b(Class cls, Class cls2) {
        ArrayList arrayList;
        boolean z10;
        arrayList = new ArrayList();
        Iterator it = this.f15875a.iterator();
        while (it.hasNext()) {
            List<a> list = (List) this.f15876b.get((String) it.next());
            if (list != null) {
                for (a aVar : list) {
                    if (aVar.f15877a.isAssignableFrom(cls) && cls2.isAssignableFrom(aVar.f15878b)) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (z10 && !arrayList.contains(aVar.f15878b)) {
                        arrayList.add(aVar.f15878b);
                    }
                }
            }
        }
        return arrayList;
    }
}
