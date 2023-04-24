package ph;

import com.topstep.fitcloud.pro.model.data.BloodPressureRealtime;
import com.topstep.fitcloud.pro.model.data.TemperatureRealtime;
import java.math.RoundingMode;
import java.util.Date;

/* loaded from: classes2.dex */
public final class g0 {

    /* renamed from: c */
    public float f24150c;

    /* renamed from: f */
    public float f24153f;

    /* renamed from: g */
    public float f24154g;

    /* renamed from: h */
    public float f24155h;

    /* renamed from: a */
    public float f24148a = 0.0f;

    /* renamed from: b */
    public float f24149b = 0.0f;

    /* renamed from: d */
    public float f24151d = 0.0f;

    /* renamed from: e */
    public float f24152e = 0.0f;

    /* renamed from: i */
    public int f24156i = 0;

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0015, code lost:
        if (r2.f24149b > r3) goto L4;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(float r3) {
        /*
            r2 = this;
            int r0 = r2.f24156i
            if (r0 != 0) goto L9
            r2.f24148a = r3
        L6:
            r2.f24149b = r3
            goto L18
        L9:
            float r1 = r2.f24148a
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 >= 0) goto L11
            r2.f24148a = r3
        L11:
            float r1 = r2.f24149b
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 <= 0) goto L18
            goto L6
        L18:
            float r1 = r2.f24150c
            float r1 = r1 + r3
            r2.f24150c = r1
            int r0 = r0 + 1
            r2.f24156i = r0
            r2.f24154g = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ph.g0.a(float):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x0029, code lost:
        if (r2.f24152e > r4) goto L4;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b(float r3, float r4) {
        /*
            r2 = this;
            int r0 = r2.f24156i
            if (r0 != 0) goto Ld
            r2.f24148a = r3
            r2.f24149b = r3
            r2.f24151d = r4
        La:
            r2.f24152e = r4
            goto L2c
        Ld:
            float r1 = r2.f24148a
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 >= 0) goto L15
            r2.f24148a = r3
        L15:
            float r1 = r2.f24149b
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 <= 0) goto L1d
            r2.f24149b = r3
        L1d:
            float r1 = r2.f24151d
            int r1 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r1 >= 0) goto L25
            r2.f24151d = r4
        L25:
            float r1 = r2.f24152e
            int r1 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r1 <= 0) goto L2c
            goto La
        L2c:
            float r1 = r2.f24150c
            float r1 = r1 + r3
            r2.f24150c = r1
            float r1 = r2.f24153f
            float r1 = r1 + r4
            r2.f24153f = r1
            int r0 = r0 + 1
            r2.f24156i = r0
            r2.f24154g = r3
            r2.f24155h = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ph.g0.b(float, float):void");
    }

    public final void c() {
        this.f24156i = 0;
        float f10 = 0;
        this.f24155h = f10;
        this.f24154g = f10;
        this.f24153f = f10;
        this.f24152e = f10;
        this.f24151d = f10;
        this.f24150c = f10;
        this.f24149b = f10;
        this.f24148a = f10;
    }

    public final BloodPressureRealtime d(boolean z10, boolean z11) {
        if (z11) {
            return new BloodPressureRealtime(new Date(), (int) this.f24154g, (int) this.f24155h, z10);
        }
        Date date = new Date();
        int i10 = this.f24156i;
        return new BloodPressureRealtime(date, ((int) this.f24150c) / i10, ((int) this.f24153f) / i10, z10);
    }

    public final TemperatureRealtime e() {
        return new TemperatureRealtime(new Date(), this.f24148a, (float) rm.l.r(String.valueOf(this.f24153f / this.f24156i), 2, RoundingMode.DOWN));
    }
}
