package x6;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Build;

/* loaded from: classes.dex */
public final class l {

    /* renamed from: a */
    public final Context f30383a;

    /* renamed from: b */
    public final boolean f30384b;

    /* renamed from: c */
    public final SensorManager f30385c;

    /* renamed from: d */
    public final Sensor f30386d;

    /* renamed from: e */
    public int f30387e;

    /* renamed from: f */
    public long f30388f;

    /* renamed from: g */
    public long f30389g;

    /* renamed from: h */
    public final tl.d f30390h;

    /* renamed from: i */
    public boolean f30391i;

    /* renamed from: j */
    public boolean f30392j;

    /* renamed from: k */
    public a f30393k;

    /* loaded from: classes.dex */
    public interface a {
        void b(int i10);
    }

    public l(c cVar) {
        gm.l.f(cVar, "context");
        this.f30383a = cVar;
        this.f30384b = true;
        Object systemService = cVar.getSystemService("sensor");
        gm.l.d(systemService, "null cannot be cast to non-null type android.hardware.SensorManager");
        SensorManager sensorManager = (SensorManager) systemService;
        this.f30385c = sensorManager;
        this.f30386d = sensorManager.getDefaultSensor(19);
        this.f30390h = fb.e.a(new n(this));
    }

    public final void a(boolean z10) {
        boolean z11;
        this.f30392j = z10;
        if (Build.VERSION.SDK_INT >= 29 && y0.a.a(this.f30383a, "android.permission.ACTIVITY_RECOGNITION") != 0) {
            z11 = false;
        } else {
            z11 = true;
        }
        if (this.f30386d != null && z11) {
            this.f30387e = 0;
            this.f30388f = System.currentTimeMillis();
            this.f30389g = 0L;
            if (!this.f30391i) {
                this.f30391i = this.f30385c.registerListener((SensorEventListener) this.f30390h.getValue(), this.f30386d, 1);
            }
        }
    }
}
