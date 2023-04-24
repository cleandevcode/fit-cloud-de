package c7;

import android.location.GnssStatus;
import p000do.a;

/* loaded from: classes.dex */
public final class o extends GnssStatus.Callback {

    /* renamed from: a */
    public final /* synthetic */ p f4578a;

    public o(p pVar) {
        this.f4578a = pVar;
    }

    public final void onSatelliteStatusChanged(GnssStatus gnssStatus) {
        gm.l.f(gnssStatus, "status");
        int satelliteCount = gnssStatus.getSatelliteCount();
        int i10 = 0;
        float f10 = 0.0f;
        for (int i11 = 0; i11 < satelliteCount; i11++) {
            if (gnssStatus.usedInFix(i11) && gnssStatus.getCn0DbHz(i11) > 0.0f) {
                i10++;
                f10 += gnssStatus.getCn0DbHz(i11);
            }
        }
        if (i10 > 0) {
            f10 /= i10;
        }
        int i12 = (i10 >= 3 || f10 >= 12.0f) ? (i10 < 5 || f10 < 20.0f) ? 2 : 3 : 1;
        a.b bVar = p000do.a.f13275a;
        bVar.t("GpsSignalMonitor");
        bVar.b("count:%d  value:%f  gpsSignal:%d", Integer.valueOf(i10), Float.valueOf(f10), Integer.valueOf(i12));
        this.f4578a.c(i12);
    }
}
