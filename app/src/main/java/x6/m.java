package x6;

import android.hardware.Sensor;
import android.hardware.SensorEventListener;

/* loaded from: classes.dex */
public final class m implements SensorEventListener {

    /* renamed from: a */
    public final /* synthetic */ l f30394a;

    public m(l lVar) {
        this.f30394a = lVar;
    }

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(Sensor sensor, int i10) {
        gm.l.f(sensor, "sensor");
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x003a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x003b  */
    @Override // android.hardware.SensorEventListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onSensorChanged(android.hardware.SensorEvent r12) {
        /*
            r11 = this;
            java.lang.String r0 = "event"
            gm.l.f(r12, r0)
            float[] r12 = r12.values
            r0 = 1
            r1 = 0
            if (r12 == 0) goto L18
            int r2 = r12.length
            if (r2 != 0) goto L10
            r2 = 1
            goto L11
        L10:
            r2 = 0
        L11:
            r2 = r2 ^ r0
            if (r2 == 0) goto L18
            r12 = r12[r1]
            int r12 = (int) r12
            goto L19
        L18:
            r12 = 0
        L19:
            do.a$b r2 = p000do.a.f13275a
            java.lang.String r3 = "SportStepCounter"
            r2.t(r3)
            r3 = 2
            java.lang.Object[] r3 = new java.lang.Object[r3]
            java.lang.Integer r4 = java.lang.Integer.valueOf(r12)
            r3[r1] = r4
            x6.l r4 = r11.f30394a
            int r4 = r4.f30387e
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r3[r0] = r4
            java.lang.String r4 = "currentStep:%d previousStep:%d"
            r2.b(r4, r3)
            if (r12 > 0) goto L3b
            return
        L3b:
            x6.l r2 = r11.f30394a
            int r3 = r2.f30387e
            if (r3 != 0) goto L44
            r2.f30387e = r12
            goto L71
        L44:
            int r2 = r12 - r3
            if (r2 < 0) goto L71
            long r3 = java.lang.System.currentTimeMillis()
            x6.l r5 = r11.f30394a
            r5.f30388f = r3
            boolean r6 = r5.f30384b
            if (r6 == 0) goto L60
            long r6 = r5.f30389g
            long r6 = r3 - r6
            r8 = 5000(0x1388, double:2.4703E-320)
            int r10 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r10 <= 0) goto L5f
            goto L60
        L5f:
            r0 = 0
        L60:
            if (r0 == 0) goto L71
            r5.f30387e = r12
            boolean r12 = r5.f30392j
            if (r12 != 0) goto L71
            r5.f30389g = r3
            x6.l$a r12 = r5.f30393k
            if (r12 == 0) goto L71
            r12.b(r2)
        L71:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: x6.m.onSensorChanged(android.hardware.SensorEvent):void");
    }
}
