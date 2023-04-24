package c7;

import android.annotation.SuppressLint;
import android.location.GpsSatellite;
import android.location.GpsStatus;
import android.location.LocationManager;
import java.util.Iterator;
import p000do.a;

@SuppressLint({"MissingPermission"})
/* loaded from: classes.dex */
public final class q extends j {

    /* renamed from: h */
    public final l f4581h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r0v1, types: [c7.l] */
    public q(final LocationManager locationManager) {
        super(locationManager);
        gm.l.f(locationManager, "locationManager");
        this.f4581h = new GpsStatus.Listener() { // from class: c7.l
            @Override // android.location.GpsStatus.Listener
            public final void onGpsStatusChanged(int i10) {
                LocationManager locationManager2 = locationManager;
                q qVar = this;
                gm.l.f(locationManager2, "$locationManager");
                gm.l.f(qVar, "this$0");
                if (i10 != 4) {
                    return;
                }
                GpsStatus gpsStatus = null;
                try {
                    gpsStatus = locationManager2.getGpsStatus(null);
                } catch (Exception unused) {
                }
                if (gpsStatus == null) {
                    return;
                }
                int maxSatellites = gpsStatus.getMaxSatellites();
                Iterator<GpsSatellite> it = gpsStatus.getSatellites().iterator();
                int i11 = 0;
                int i12 = 0;
                float f10 = 0.0f;
                while (it.hasNext() && i11 <= maxSatellites) {
                    GpsSatellite next = it.next();
                    i11++;
                    if (next.usedInFix() && next.getSnr() > 0.0f) {
                        i12++;
                        f10 += next.getSnr();
                    }
                }
                if (i12 > 0) {
                    f10 /= i12;
                }
                int i13 = (i12 >= 3 || f10 >= 12.0f) ? (i12 < 5 || f10 < 20.0f) ? 2 : 3 : 1;
                a.b bVar = p000do.a.f13275a;
                bVar.t("GpsSignalMonitor");
                bVar.b("count:%d  value:%f  gpsSignal:%d", Integer.valueOf(i12), Float.valueOf(f10), Integer.valueOf(i13));
                qVar.c(i13);
            }
        };
    }

    @Override // c7.j
    public final boolean a() {
        return this.f4569a.addGpsStatusListener(this.f4581h);
    }

    @Override // c7.j
    public final void b() {
        this.f4569a.removeGpsStatusListener(this.f4581h);
    }
}
