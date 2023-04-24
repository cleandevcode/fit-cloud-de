package c7;

import android.annotation.SuppressLint;
import android.location.LocationManager;
import android.os.Handler;
import android.os.Looper;

@SuppressLint({"MissingPermission"})
/* loaded from: classes.dex */
public final class p extends j {

    /* renamed from: h */
    public final Handler f4579h;

    /* renamed from: i */
    public final o f4580i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(LocationManager locationManager) {
        super(locationManager);
        gm.l.f(locationManager, "locationManager");
        this.f4579h = new Handler(Looper.getMainLooper());
        this.f4580i = new o(this);
    }

    @Override // c7.j
    public final boolean a() {
        boolean registerGnssStatusCallback;
        registerGnssStatusCallback = this.f4569a.registerGnssStatusCallback(this.f4580i, this.f4579h);
        return registerGnssStatusCallback;
    }

    @Override // c7.j
    public final void b() {
        this.f4569a.unregisterGnssStatusCallback(this.f4580i);
    }
}
