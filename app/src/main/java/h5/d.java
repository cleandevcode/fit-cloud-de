package h5;

import java.util.ArrayList;
import r4.k;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a */
    public final ArrayList f15880a = new ArrayList();

    /* loaded from: classes.dex */
    public static final class a<T> {

        /* renamed from: a */
        public final Class<T> f15881a;

        /* renamed from: b */
        public final k<T> f15882b;

        public a(Class<T> cls, k<T> kVar) {
            this.f15881a = cls;
            this.f15882b = kVar;
        }
    }

    public final synchronized <Z> k<Z> a(Class<Z> cls) {
        int size = this.f15880a.size();
        for (int i10 = 0; i10 < size; i10++) {
            a aVar = (a) this.f15880a.get(i10);
            if (aVar.f15881a.isAssignableFrom(cls)) {
                return (k<Z>) aVar.f15882b;
            }
        }
        return null;
    }
}
