package a0;

import android.util.ArrayMap;
import java.util.ArrayList;
import java.util.HashSet;

/* loaded from: classes.dex */
public interface j0 {

    /* loaded from: classes.dex */
    public static final class a implements j0 {

        /* renamed from: a */
        public final h0 f114a;

        public a() {
            HashSet hashSet = new HashSet();
            j1 B = j1.B();
            ArrayList arrayList = new ArrayList();
            k1 c10 = k1.c();
            ArrayList arrayList2 = new ArrayList(hashSet);
            n1 A = n1.A(B);
            d2 d2Var = d2.f45b;
            ArrayMap arrayMap = new ArrayMap();
            for (String str : c10.b()) {
                arrayMap.put(str, c10.a(str));
            }
            this.f114a = new h0(arrayList2, A, -1, arrayList, false, new d2(arrayMap), null);
        }

        @Override // a0.j0
        public final h0 a() {
            return this.f114a;
        }

        @Override // a0.j0
        public final void getId() {
        }
    }

    h0 a();

    void getId();
}
