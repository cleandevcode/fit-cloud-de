package tc;

import android.content.ContentResolver;
import android.location.LocationManager;

/* loaded from: classes.dex */
public final class n implements v3.c<m> {

    /* renamed from: a */
    public final w3.a<ContentResolver> f28005a;

    /* renamed from: b */
    public final w3.a<LocationManager> f28006b;

    public n(kc.j jVar, kc.s sVar) {
        this.f28005a = jVar;
        this.f28006b = sVar;
    }

    @Override // w3.a
    public final Object get() {
        return new m(this.f28005a.get(), this.f28006b.get());
    }
}
