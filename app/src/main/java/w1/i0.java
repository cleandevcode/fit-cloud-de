package w1;

import w1.p1;

/* loaded from: classes.dex */
public final class i0<K, V> {

    /* renamed from: a */
    public final a<K, V> f29608a;

    /* renamed from: b */
    public final K f29609b = "";

    /* renamed from: c */
    public final V f29610c;

    /* loaded from: classes.dex */
    public static class a<K, V> {

        /* renamed from: a */
        public final p1 f29611a;

        /* renamed from: b */
        public final K f29612b = "";

        /* renamed from: c */
        public final p1 f29613c;

        /* renamed from: d */
        public final V f29614d;

        /* JADX WARN: Multi-variable type inference failed */
        public a(p1.a aVar, p1.c cVar, u1.f fVar) {
            this.f29611a = aVar;
            this.f29613c = cVar;
            this.f29614d = fVar;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public i0(p1.a aVar, p1.c cVar, u1.f fVar) {
        this.f29608a = new a<>(aVar, cVar, fVar);
        this.f29610c = fVar;
    }

    public static <K, V> int a(a<K, V> aVar, K k10, V v10) {
        return s.c(aVar.f29613c, 2, v10) + s.c(aVar.f29611a, 1, k10);
    }

    public static <K, V> void b(k kVar, a<K, V> aVar, K k10, V v10) {
        s.p(kVar, aVar.f29611a, 1, k10);
        s.p(kVar, aVar.f29613c, 2, v10);
    }
}
