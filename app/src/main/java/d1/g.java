package d1;

import android.location.GnssMeasurementsEvent;
import android.location.GnssStatus;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.location.LocationRequest;
import android.os.Build;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.Handler;
import android.os.Looper;
import f1.d;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Objects;
import java.util.WeakHashMap;
import java.util.concurrent.Executor;
import java.util.function.Consumer;
import s.h1;
import tf.b;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: a */
    public static final /* synthetic */ int f12600a = 0;

    /* loaded from: classes.dex */
    public static class a {
        public static String a(LocationManager locationManager) {
            String gnssHardwareModelName;
            gnssHardwareModelName = locationManager.getGnssHardwareModelName();
            return gnssHardwareModelName;
        }

        public static int b(LocationManager locationManager) {
            int gnssYearOfHardware;
            gnssYearOfHardware = locationManager.getGnssYearOfHardware();
            return gnssYearOfHardware;
        }

        public static boolean c(LocationManager locationManager) {
            boolean isLocationEnabled;
            isLocationEnabled = locationManager.isLocationEnabled();
            return isLocationEnabled;
        }
    }

    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a */
        public static Class<?> f12601a;

        /* renamed from: b */
        public static Method f12602b;

        /* JADX WARN: Type inference failed for: r4v1, types: [d1.j] */
        public static void a(LocationManager locationManager, String str, f1.d dVar, Executor executor, final j1.a<Location> aVar) {
            CancellationSignal cancellationSignal;
            if (dVar != null) {
                synchronized (dVar) {
                    try {
                        if (dVar.f14030c == null) {
                            CancellationSignal b10 = d.a.b();
                            dVar.f14030c = b10;
                            if (dVar.f14028a) {
                                d.a.a(b10);
                            }
                        }
                        cancellationSignal = dVar.f14030c;
                    } finally {
                    }
                }
            } else {
                cancellationSignal = null;
            }
            Objects.requireNonNull(aVar);
            locationManager.getCurrentLocation(str, cancellationSignal, executor, new Consumer() { // from class: d1.j
                @Override // java.util.function.Consumer
                public final void accept(Object obj) {
                    j1.a.this.accept((Location) obj);
                }
            });
        }

        public static boolean b(LocationManager locationManager, Handler handler, Executor executor, d1.a aVar) {
            boolean registerGnssStatusCallback;
            o0.h<Object, Object> hVar = e.f12609a;
            synchronized (hVar) {
                f fVar = (f) hVar.getOrDefault(aVar, null);
                if (fVar == null) {
                    fVar = new f();
                }
                registerGnssStatusCallback = locationManager.registerGnssStatusCallback(executor, fVar);
                if (registerGnssStatusCallback) {
                    hVar.put(aVar, fVar);
                    return true;
                }
                return false;
            }
        }

        public static boolean c(LocationManager locationManager, String str, n nVar, Executor executor, d1.c cVar) {
            if (Build.VERSION.SDK_INT >= 30) {
                try {
                    if (f12601a == null) {
                        f12601a = Class.forName("android.location.LocationRequest");
                    }
                    if (f12602b == null) {
                        Method declaredMethod = LocationManager.class.getDeclaredMethod("requestLocationUpdates", f12601a, Executor.class, LocationListener.class);
                        f12602b = declaredMethod;
                        declaredMethod.setAccessible(true);
                    }
                    throw null;
                } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | UnsupportedOperationException | InvocationTargetException unused) {
                }
            }
            return false;
        }
    }

    /* loaded from: classes.dex */
    public static class c {
        public static boolean a(LocationManager locationManager, String str) {
            boolean hasProvider;
            hasProvider = locationManager.hasProvider(str);
            return hasProvider;
        }

        public static boolean b(LocationManager locationManager, Executor executor, GnssMeasurementsEvent.Callback callback) {
            boolean registerGnssMeasurementsCallback;
            registerGnssMeasurementsCallback = locationManager.registerGnssMeasurementsCallback(executor, callback);
            return registerGnssMeasurementsCallback;
        }

        public static void c(LocationManager locationManager, String str, LocationRequest locationRequest, Executor executor, LocationListener locationListener) {
            locationManager.requestLocationUpdates(str, locationRequest, executor, locationListener);
        }
    }

    /* loaded from: classes.dex */
    public static final class d implements LocationListener {

        /* renamed from: a */
        public final LocationManager f12603a;

        /* renamed from: b */
        public final Executor f12604b;

        /* renamed from: c */
        public final Handler f12605c = new Handler(Looper.getMainLooper());

        /* renamed from: d */
        public j1.a<Location> f12606d;

        /* renamed from: e */
        public boolean f12607e;

        /* renamed from: f */
        public s.m f12608f;

        public d(LocationManager locationManager, Executor executor, b.a.C0500a c0500a) {
            this.f12603a = locationManager;
            this.f12604b = executor;
            this.f12606d = c0500a;
        }

        @Override // android.location.LocationListener
        public final void onLocationChanged(Location location) {
            synchronized (this) {
                if (this.f12607e) {
                    return;
                }
                this.f12607e = true;
                this.f12604b.execute(new s.g(this.f12606d, location, 6));
                this.f12606d = null;
                this.f12603a.removeUpdates(this);
                s.m mVar = this.f12608f;
                if (mVar != null) {
                    this.f12605c.removeCallbacks(mVar);
                    this.f12608f = null;
                }
            }
        }

        @Override // android.location.LocationListener
        public final void onProviderDisabled(String str) {
            onLocationChanged((Location) null);
        }

        @Override // android.location.LocationListener
        public final void onProviderEnabled(String str) {
        }

        @Override // android.location.LocationListener
        public final void onStatusChanged(String str, int i10, Bundle bundle) {
        }
    }

    /* loaded from: classes.dex */
    public static class e {

        /* renamed from: a */
        public static final o0.h<Object, Object> f12609a = new o0.h<>();
    }

    /* loaded from: classes.dex */
    public static class f extends GnssStatus.Callback {
        public f() {
            h1.e("invalid null callback", false);
        }

        public final void onFirstFix(int i10) {
            throw null;
        }

        public final void onSatelliteStatusChanged(GnssStatus gnssStatus) {
            gnssStatus.getClass();
            throw null;
        }

        public final void onStarted() {
            throw null;
        }

        public final void onStopped() {
            throw null;
        }
    }

    static {
        new WeakHashMap();
    }

    public static boolean a(LocationManager locationManager) {
        return Build.VERSION.SDK_INT >= 28 ? a.c(locationManager) : locationManager.isProviderEnabled("network") || locationManager.isProviderEnabled("gps");
    }
}
