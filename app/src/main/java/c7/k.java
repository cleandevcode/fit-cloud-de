package c7;

import android.location.Location;
import android.location.LocationListener;
import android.os.Bundle;

/* loaded from: classes.dex */
public final class k implements LocationListener {
    @Override // android.location.LocationListener
    public final void onLocationChanged(Location location) {
        gm.l.f(location, "location");
    }

    @Override // android.location.LocationListener
    public final void onProviderDisabled(String str) {
        gm.l.f(str, "provider");
    }

    @Override // android.location.LocationListener
    public final void onProviderEnabled(String str) {
        gm.l.f(str, "provider");
    }

    @Override // android.location.LocationListener
    public final void onStatusChanged(String str, int i10, Bundle bundle) {
    }
}
