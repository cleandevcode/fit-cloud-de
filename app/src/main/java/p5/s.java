package p5;

import java.io.Serializable;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes.dex */
public final class s implements Serializable {

    /* renamed from: a */
    public final HashMap<p5.a, List<d>> f23940a;

    /* loaded from: classes.dex */
    public static final class a implements Serializable {

        /* renamed from: a */
        public final HashMap<p5.a, List<d>> f23941a;

        public a(HashMap<p5.a, List<d>> hashMap) {
            gm.l.f(hashMap, "proxyEvents");
            this.f23941a = hashMap;
        }

        private final Object readResolve() {
            return new s(this.f23941a);
        }
    }

    public s() {
        this.f23940a = new HashMap<>();
    }

    public s(HashMap<p5.a, List<d>> hashMap) {
        gm.l.f(hashMap, "appEventMap");
        HashMap<p5.a, List<d>> hashMap2 = new HashMap<>();
        this.f23940a = hashMap2;
        hashMap2.putAll(hashMap);
    }

    private final Object writeReplace() {
        if (i6.a.b(this)) {
            return null;
        }
        try {
            return new a(this.f23940a);
        } catch (Throwable th2) {
            i6.a.a(this, th2);
            return null;
        }
    }

    public final void a(p5.a aVar, List<d> list) {
        if (i6.a.b(this)) {
            return;
        }
        try {
            gm.l.f(list, "appEvents");
            if (!this.f23940a.containsKey(aVar)) {
                this.f23940a.put(aVar, ul.q.Z(list));
                return;
            }
            List<d> list2 = this.f23940a.get(aVar);
            if (list2 == null) {
                return;
            }
            list2.addAll(list);
        } catch (Throwable th2) {
            i6.a.a(this, th2);
        }
    }
}
