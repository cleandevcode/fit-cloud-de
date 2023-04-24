package n4;

import no.nordicsemi.android.dfu.DfuBaseService;

/* loaded from: classes.dex */
public final class h<K, V> {

    /* renamed from: a */
    public final a<K, V>[] f21983a;

    /* renamed from: b */
    public final int f21984b;

    /* loaded from: classes.dex */
    public static final class a<K, V> {

        /* renamed from: a */
        public final K f21985a;

        /* renamed from: b */
        public V f21986b;

        /* renamed from: c */
        public final a<K, V> f21987c;

        /* JADX WARN: Multi-variable type inference failed */
        public a(Object obj, Object obj2, a aVar) {
            this.f21985a = obj;
            this.f21986b = obj2;
            this.f21987c = aVar;
        }
    }

    public h() {
        this(DfuBaseService.ERROR_REMOTE_MASK);
    }

    public h(int i10) {
        this.f21984b = i10 - 1;
        this.f21983a = new a[i10];
    }

    public final V a(K k10) {
        for (a<K, V> aVar = this.f21983a[System.identityHashCode(k10) & this.f21984b]; aVar != null; aVar = aVar.f21987c) {
            if (k10 == aVar.f21985a) {
                return aVar.f21986b;
            }
        }
        return null;
    }

    public final boolean b(K k10, V v10) {
        int identityHashCode = System.identityHashCode(k10) & this.f21984b;
        for (a<K, V> aVar = this.f21983a[identityHashCode]; aVar != null; aVar = aVar.f21987c) {
            if (k10 == aVar.f21985a) {
                aVar.f21986b = v10;
                return true;
            }
        }
        a<K, V>[] aVarArr = this.f21983a;
        aVarArr[identityHashCode] = new a<>(k10, v10, aVarArr[identityHashCode]);
        return false;
    }
}
