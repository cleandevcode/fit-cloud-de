package wl;

import gm.l;
import java.util.Comparator;

/* loaded from: classes2.dex */
public final class a implements Comparator<Comparable<? super Object>> {

    /* renamed from: a */
    public static final a f30022a = new a();

    @Override // java.util.Comparator
    public final int compare(Comparable<? super Object> comparable, Comparable<? super Object> comparable2) {
        Comparable<? super Object> comparable3 = comparable;
        Comparable<? super Object> comparable4 = comparable2;
        l.f(comparable3, "a");
        l.f(comparable4, "b");
        return comparable3.compareTo(comparable4);
    }

    @Override // java.util.Comparator
    public final Comparator<Comparable<? super Object>> reversed() {
        return b.f30023a;
    }
}
