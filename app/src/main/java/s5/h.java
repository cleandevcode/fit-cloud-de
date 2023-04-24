package s5;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import gm.l;

/* loaded from: classes.dex */
public final class h implements SensorEventListener {

    /* renamed from: a */
    public a f26615a;

    /* loaded from: classes.dex */
    public interface a {
    }

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(Sensor sensor, int i10) {
        if (i6.a.b(this)) {
            return;
        }
        try {
            l.f(sensor, "sensor");
        } catch (Throwable th2) {
            i6.a.a(this, th2);
        }
    }

    @Override // android.hardware.SensorEventListener
    public final void onSensorChanged(SensorEvent sensorEvent) {
        if (i6.a.b(this)) {
            return;
        }
        try {
            l.f(sensorEvent, "event");
            a aVar = this.f26615a;
            if (aVar == null) {
                return;
            }
            float[] fArr = sensorEvent.values;
            double d10 = fArr[0] / 9.80665f;
            double d11 = fArr[1] / 9.80665f;
            double d12 = fArr[2] / 9.80665f;
            if (Math.sqrt((d12 * d12) + (d11 * d11) + (d10 * d10)) > 2.3d) {
                ((b) aVar).c();
            }
        } catch (Throwable th2) {
            i6.a.a(this, th2);
        }
    }
}
