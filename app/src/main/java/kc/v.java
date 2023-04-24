package kc;

import kc.k;

/* loaded from: classes.dex */
public final class v implements v3.c<String[][]> {

    /* renamed from: a */
    public final w3.a<Integer> f18413a = k.a.f18345a;

    /* renamed from: b */
    public final w3.a<Integer> f18414b;

    public v(w3.a aVar) {
        this.f18414b = aVar;
    }

    @Override // w3.a
    public final Object get() {
        return Math.min(this.f18413a.get().intValue(), this.f18414b.get().intValue()) < 31 ? new String[0] : new String[][]{new String[]{"android.permission.BLUETOOTH_CONNECT"}};
    }
}
