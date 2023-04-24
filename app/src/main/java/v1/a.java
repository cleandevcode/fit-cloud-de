package v1;

import fm.l;
import gm.m;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import ul.q;
import v1.d;

/* loaded from: classes.dex */
public final class a extends d {

    /* renamed from: a */
    public final Map<d.a<?>, Object> f28978a;

    /* renamed from: b */
    public final AtomicBoolean f28979b;

    /* renamed from: v1.a$a */
    /* loaded from: classes.dex */
    public static final class C0523a extends m implements l<Map.Entry<d.a<?>, Object>, CharSequence> {

        /* renamed from: b */
        public static final C0523a f28980b = new C0523a();

        public C0523a() {
            super(1);
        }

        @Override // fm.l
        public final CharSequence k(Map.Entry<d.a<?>, Object> entry) {
            Map.Entry<d.a<?>, Object> entry2 = entry;
            gm.l.f(entry2, "entry");
            return "  " + entry2.getKey().f28986a + " = " + entry2.getValue();
        }
    }

    public a() {
        this(false, 3);
    }

    public a(Map<d.a<?>, Object> map, boolean z10) {
        gm.l.f(map, "preferencesMap");
        this.f28978a = map;
        this.f28979b = new AtomicBoolean(z10);
    }

    public /* synthetic */ a(boolean z10, int i10) {
        this((i10 & 1) != 0 ? new LinkedHashMap() : null, (i10 & 2) != 0 ? true : z10);
    }

    @Override // v1.d
    public final Map<d.a<?>, Object> a() {
        Map<d.a<?>, Object> unmodifiableMap = Collections.unmodifiableMap(this.f28978a);
        gm.l.e(unmodifiableMap, "unmodifiableMap(preferencesMap)");
        return unmodifiableMap;
    }

    @Override // v1.d
    public final <T> T b(d.a<T> aVar) {
        gm.l.f(aVar, "key");
        return (T) this.f28978a.get(aVar);
    }

    public final void c() {
        if (!(!this.f28979b.get())) {
            throw new IllegalStateException("Do mutate preferences once returned to DataStore.".toString());
        }
    }

    public final <T> void d(d.a<T> aVar, T t10) {
        gm.l.f(aVar, "key");
        e(aVar, t10);
    }

    public final void e(d.a<?> aVar, Object obj) {
        Map<d.a<?>, Object> map;
        gm.l.f(aVar, "key");
        c();
        if (obj == null) {
            c();
            this.f28978a.remove(aVar);
            return;
        }
        if (obj instanceof Set) {
            map = this.f28978a;
            obj = Collections.unmodifiableSet(q.b0((Iterable) obj));
            gm.l.e(obj, "unmodifiableSet(value.toSet())");
        } else {
            map = this.f28978a;
        }
        map.put(aVar, obj);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof a) {
            return gm.l.a(this.f28978a, ((a) obj).f28978a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f28978a.hashCode();
    }

    public final String toString() {
        return q.M(this.f28978a.entrySet(), ",\n", "{\n", "\n}", C0523a.f28980b, 24);
    }
}
