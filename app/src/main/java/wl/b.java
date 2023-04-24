package wl;

import gm.l;
import java.util.Comparator;

/* loaded from: classes2.dex */
public final class b implements Comparator<Comparable<? super Object>> {

    /* renamed from: a */
    public static final b f30023a = new b();

    @Override // java.util.Comparator
    public final int compare(Comparable<? super Object> comparable, Comparable<? super Object> comparable2) {
        Comparable<? super Object> comparable3 = comparable;
        Comparable<? super Object> comparable4 = comparable2;
        l.f(comparable3, "a");
        l.f(comparable4, "b");
        return comparable4.compareTo(comparable3);
    }

    @Override // java.util.Comparator
    public final Comparator<Comparable<? super Object>> reversed() {
        return a.f30022a;
    }
}
