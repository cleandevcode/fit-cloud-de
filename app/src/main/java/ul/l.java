package ul;

import java.util.Collection;

/* loaded from: classes2.dex */
public class l extends h7.a {
    public static final int B(Iterable iterable, int i10) {
        gm.l.f(iterable, "<this>");
        return iterable instanceof Collection ? ((Collection) iterable).size() : i10;
    }
}
