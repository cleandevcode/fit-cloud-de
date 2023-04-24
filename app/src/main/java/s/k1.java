package s;

import java.util.ArrayList;

/* loaded from: classes.dex */
public final class k1 {
    public static void a(a0.j jVar, ArrayList arrayList) {
        if (!(jVar instanceof a0.k)) {
            if (jVar instanceof j1) {
                arrayList.add(((j1) jVar).f26002a);
                return;
            } else {
                arrayList.add(new i1(jVar));
                return;
            }
        }
        ((a0.k) jVar).getClass();
        throw null;
    }
}
