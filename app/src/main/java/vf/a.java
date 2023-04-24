package vf;

import com.topstep.fitcloud.pro.model.data.BloodPressureRealtime;
import com.topstep.fitcloud.pro.model.data.HeartRateRealtime;
import com.topstep.fitcloud.pro.model.data.OxygenRealtime;
import com.topstep.fitcloud.pro.model.data.PressureRealtime;
import com.topstep.fitcloud.pro.model.data.TemperatureRealtime;

/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a */
    public final HeartRateRealtime f29257a;

    /* renamed from: b */
    public final OxygenRealtime f29258b;

    /* renamed from: c */
    public final BloodPressureRealtime f29259c;

    /* renamed from: d */
    public final TemperatureRealtime f29260d;

    /* renamed from: e */
    public final PressureRealtime f29261e;

    public a() {
        this(null, null, null, null, null);
    }

    public a(HeartRateRealtime heartRateRealtime, OxygenRealtime oxygenRealtime, BloodPressureRealtime bloodPressureRealtime, TemperatureRealtime temperatureRealtime, PressureRealtime pressureRealtime) {
        this.f29257a = heartRateRealtime;
        this.f29258b = oxygenRealtime;
        this.f29259c = bloodPressureRealtime;
        this.f29260d = temperatureRealtime;
        this.f29261e = pressureRealtime;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            return gm.l.a(this.f29257a, aVar.f29257a) && gm.l.a(this.f29258b, aVar.f29258b) && gm.l.a(this.f29259c, aVar.f29259c) && gm.l.a(this.f29260d, aVar.f29260d) && gm.l.a(this.f29261e, aVar.f29261e);
        }
        return false;
    }

    public final int hashCode() {
        HeartRateRealtime heartRateRealtime = this.f29257a;
        int hashCode = (heartRateRealtime == null ? 0 : heartRateRealtime.hashCode()) * 31;
        OxygenRealtime oxygenRealtime = this.f29258b;
        int hashCode2 = (hashCode + (oxygenRealtime == null ? 0 : oxygenRealtime.hashCode())) * 31;
        BloodPressureRealtime bloodPressureRealtime = this.f29259c;
        int hashCode3 = (hashCode2 + (bloodPressureRealtime == null ? 0 : bloodPressureRealtime.hashCode())) * 31;
        TemperatureRealtime temperatureRealtime = this.f29260d;
        int hashCode4 = (hashCode3 + (temperatureRealtime == null ? 0 : temperatureRealtime.hashCode())) * 31;
        PressureRealtime pressureRealtime = this.f29261e;
        return hashCode4 + (pressureRealtime != null ? pressureRealtime.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder a10 = android.support.v4.media.d.a("AllRealtime(heartRate=");
        a10.append(this.f29257a);
        a10.append(", oxygen=");
        a10.append(this.f29258b);
        a10.append(", bloodPressure=");
        a10.append(this.f29259c);
        a10.append(", temperature=");
        a10.append(this.f29260d);
        a10.append(", pressure=");
        a10.append(this.f29261e);
        a10.append(')');
        return a10.toString();
    }
}
