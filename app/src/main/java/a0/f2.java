package a0;

import a0.u1;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class f2 {

    /* renamed from: a */
    public final String f57a;

    /* renamed from: b */
    public final LinkedHashMap f58b = new LinkedHashMap();

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a */
        public final u1 f59a;

        /* renamed from: b */
        public final h2<?> f60b;

        /* renamed from: c */
        public boolean f61c = false;

        /* renamed from: d */
        public boolean f62d = false;

        public a(u1 u1Var, h2<?> h2Var) {
            this.f59a = u1Var;
            this.f60b = h2Var;
        }
    }

    public f2(String str) {
        this.f57a = str;
    }

    public final u1.f a() {
        u1.f fVar = new u1.f();
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : this.f58b.entrySet()) {
            a aVar = (a) entry.getValue();
            if (aVar.f61c) {
                fVar.a(aVar.f59a);
                arrayList.add((String) entry.getKey());
            }
        }
        y.u0.a("UseCaseAttachState", "All use case: " + arrayList + " for camera: " + this.f57a);
        return fVar;
    }

    public final Collection<u1> b() {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : this.f58b.entrySet()) {
            if (((a) entry.getValue()).f61c) {
                arrayList.add(((a) entry.getValue()).f59a);
            }
        }
        return Collections.unmodifiableCollection(arrayList);
    }

    public final Collection<h2<?>> c() {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : this.f58b.entrySet()) {
            if (((a) entry.getValue()).f61c) {
                arrayList.add(((a) entry.getValue()).f60b);
            }
        }
        return Collections.unmodifiableCollection(arrayList);
    }

    public final void d(String str) {
        if (!this.f58b.containsKey(str)) {
            return;
        }
        a aVar = (a) this.f58b.get(str);
        aVar.f62d = false;
        if (!aVar.f61c) {
            this.f58b.remove(str);
        }
    }

    public final void e(String str, u1 u1Var, h2<?> h2Var) {
        if (!this.f58b.containsKey(str)) {
            return;
        }
        a aVar = new a(u1Var, h2Var);
        a aVar2 = (a) this.f58b.get(str);
        aVar.f61c = aVar2.f61c;
        aVar.f62d = aVar2.f62d;
        this.f58b.put(str, aVar);
    }
}
