package kc;

import android.content.Context;
import kc.k;

/* loaded from: classes.dex */
public final class p implements v3.c<Boolean> {

    /* renamed from: a */
    public final w3.a<Context> f18368a;

    /* renamed from: b */
    public final w3.a<Integer> f18369b;

    public p(w3.a aVar) {
        k kVar = k.a.f18345a;
        this.f18368a = aVar;
        this.f18369b = kVar;
    }

    @Override // w3.a
    public final Object get() {
        boolean z10;
        Context context = this.f18368a.get();
        if (this.f18369b.get().intValue() >= 20 && context.getPackageManager().hasSystemFeature("android.hardware.type.watch")) {
            z10 = true;
        } else {
            z10 = false;
        }
        return Boolean.valueOf(z10);
    }
}
