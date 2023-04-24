package kc;

import android.content.Context;
import android.location.LocationManager;

/* loaded from: classes.dex */
public final class s implements v3.c<LocationManager> {

    /* renamed from: a */
    public final w3.a<Context> f18377a;

    public s(v3.d dVar) {
        this.f18377a = dVar;
    }

    @Override // w3.a
    public final Object get() {
        LocationManager locationManager = (LocationManager) this.f18377a.get().getSystemService("location");
        b0.c.j(locationManager);
        return locationManager;
    }
}
