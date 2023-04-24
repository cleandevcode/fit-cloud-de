package w0;

import j1.e;
import java.util.ArrayList;
import java.util.HashSet;
import o0.h;

/* loaded from: classes.dex */
public final class a<T> {

    /* renamed from: a */
    public final e f29518a = new e(10, 0);

    /* renamed from: b */
    public final h<T, ArrayList<T>> f29519b = new h<>();

    /* renamed from: c */
    public final ArrayList<T> f29520c = new ArrayList<>();

    /* renamed from: d */
    public final HashSet<T> f29521d = new HashSet<>();

    public final void a(T t10, ArrayList<T> arrayList, HashSet<T> hashSet) {
        if (arrayList.contains(t10)) {
            return;
        }
        if (!hashSet.contains(t10)) {
            hashSet.add(t10);
            ArrayList<T> orDefault = this.f29519b.getOrDefault(t10, null);
            if (orDefault != null) {
                int size = orDefault.size();
                for (int i10 = 0; i10 < size; i10++) {
                    a(orDefault.get(i10), arrayList, hashSet);
                }
            }
            hashSet.remove(t10);
            arrayList.add(t10);
            return;
        }
        throw new RuntimeException("This graph contains cyclic dependencies");
    }
}
