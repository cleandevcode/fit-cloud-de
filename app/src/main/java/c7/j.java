package c7;

import android.annotation.SuppressLint;
import android.location.LocationManager;

@SuppressLint({"MissingPermission"})
/* loaded from: classes.dex */
public abstract class j {

    /* renamed from: a */
    public final LocationManager f4569a;

    /* renamed from: b */
    public final boolean f4570b;

    /* renamed from: c */
    public a f4571c;

    /* renamed from: d */
    public Integer f4572d;

    /* renamed from: e */
    public long f4573e;

    /* renamed from: f */
    public final long f4574f;

    /* renamed from: g */
    public final k f4575g;

    /* loaded from: classes.dex */
    public interface a {
        void a(int i10);
    }

    public j(LocationManager locationManager) {
        gm.l.f(locationManager, "locationManager");
        this.f4569a = locationManager;
        this.f4570b = true;
        this.f4574f = 2000L;
        this.f4575g = new k();
    }

    public abstract boolean a();

    public abstract void b();

    public final void c(int i10) {
        long currentTimeMillis = System.currentTimeMillis();
        Integer num = this.f4572d;
        if (num == null || num.intValue() < i10) {
            this.f4572d = Integer.valueOf(i10);
            this.f4573e = currentTimeMillis;
            a aVar = this.f4571c;
            if (aVar != null) {
                aVar.a(i10);
            }
        } else if (num.intValue() == i10) {
            this.f4573e = currentTimeMillis;
        } else if (currentTimeMillis - this.f4573e > this.f4574f * 2) {
            this.f4572d = Integer.valueOf(num.intValue() - 1);
            this.f4573e = currentTimeMillis;
            a aVar2 = this.f4571c;
            if (aVar2 != null) {
                aVar2.a(num.intValue() - 1);
            }
        }
    }
}
