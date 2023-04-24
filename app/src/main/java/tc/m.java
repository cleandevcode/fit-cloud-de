package tc;

import android.content.ContentResolver;
import android.location.LocationManager;
import android.os.Build;
import android.provider.Settings;
import com.polidea.rxandroidble3.internal.RxBleLog;

/* loaded from: classes.dex */
public final class m {

    /* renamed from: a */
    public final ContentResolver f28002a;

    /* renamed from: b */
    public final LocationManager f28003b;

    public m(ContentResolver contentResolver, LocationManager locationManager) {
        this.f28002a = contentResolver;
        this.f28003b = locationManager;
    }

    public final boolean a() {
        boolean isLocationEnabled;
        if (Build.VERSION.SDK_INT >= 28) {
            isLocationEnabled = this.f28003b.isLocationEnabled();
            return isLocationEnabled;
        }
        try {
        } catch (Settings.SettingNotFoundException e10) {
            RxBleLog.w(e10, "Could not use LOCATION_MODE check. Falling back to a legacy/heuristic function.", new Object[0]);
            if (this.f28003b.isProviderEnabled("network") || this.f28003b.isProviderEnabled("gps")) {
                return true;
            }
        }
        if (Settings.Secure.getInt(this.f28002a, "location_mode") != 0) {
            return true;
        }
        return false;
    }
}
