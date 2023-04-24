package f5;

import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a */
    public final ArrayList f14125a = new ArrayList();

    /* loaded from: classes.dex */
    public static final class a<Z, R> {

        /* renamed from: a */
        public final Class<Z> f14126a;

        /* renamed from: b */
        public final Class<R> f14127b;

        /* renamed from: c */
        public final c<Z, R> f14128c;

        public a(Class<Z> cls, Class<R> cls2, c<Z, R> cVar) {
            this.f14126a = cls;
            this.f14127b = cls2;
            this.f14128c = cVar;
        }
    }

    public final synchronized ArrayList a(Class cls, Class cls2) {
        boolean z10;
        ArrayList arrayList = new ArrayList();
        if (cls2.isAssignableFrom(cls)) {
            arrayList.add(cls2);
            return arrayList;
        }
        Iterator it = this.f14125a.iterator();
        while (it.hasNext()) {
            a aVar = (a) it.next();
            if (aVar.f14126a.isAssignableFrom(cls) && cls2.isAssignableFrom(aVar.f14127b)) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10 && !arrayList.contains(aVar.f14127b)) {
                arrayList.add(aVar.f14127b);
            }
        }
        return arrayList;
    }
}
