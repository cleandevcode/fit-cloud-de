package tf;

import android.content.Context;
import android.location.Geocoder;
import android.location.Location;
import android.location.LocationManager;
import android.os.Build;
import android.os.Looper;
import android.os.SystemClock;
import com.topstep.fitcloud.pro.model.location.LocationInfo;
import d1.g;
import f1.n;
import fm.l;
import fm.p;
import gm.m;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import mf.a0;
import p000do.a;
import pm.e0;
import pm.j;
import pm.n0;
import pm.o0;
import pm.x0;
import s.h1;
import s.n2;
import xl.d;
import zl.e;
import zl.i;

/* loaded from: classes2.dex */
public final class b implements ug.a {

    /* renamed from: a */
    public final LocationManager f28079a;

    /* renamed from: b */
    public final Geocoder f28080b;

    @e(c = "com.topstep.fitcloud.pro.function.location.StandardLocationEngine$requestLocation$2", f = "StandardLocationEngine.kt", l = {103}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class a extends i implements p<e0, d<? super LocationInfo>, Object> {

        /* renamed from: e */
        public int f28081e;

        /* renamed from: g */
        public final /* synthetic */ String f28083g;

        /* renamed from: tf.b$a$a */
        /* loaded from: classes2.dex */
        public static final class C0500a<T> implements j1.a {

            /* renamed from: a */
            public final /* synthetic */ pm.i<LocationInfo> f28084a;

            /* renamed from: b */
            public final /* synthetic */ b f28085b;

            public C0500a(j jVar, b bVar) {
                this.f28084a = jVar;
                this.f28085b = bVar;
            }

            @Override // j1.a
            public final void accept(Object obj) {
                Location location = (Location) obj;
                a.b bVar = p000do.a.f13275a;
                bVar.t("StdLocation");
                bVar.h("continuation resume:%s", location);
                if (location == null) {
                    this.f28084a.l(null);
                } else {
                    this.f28084a.l(h1.q(this.f28085b.f28080b, "StdLocation", location));
                }
            }
        }

        /* renamed from: tf.b$a$b */
        /* loaded from: classes2.dex */
        public static final class C0501b extends m implements l<Throwable, tl.l> {

            /* renamed from: b */
            public final /* synthetic */ f1.d f28086b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0501b(f1.d dVar) {
                super(1);
                this.f28086b = dVar;
            }

            @Override // fm.l
            public final tl.l k(Throwable th2) {
                a.b bVar = p000do.a.f13275a;
                bVar.t("StdLocation");
                bVar.h("continuation cancel", new Object[0]);
                this.f28086b.a();
                return tl.l.f28297a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, d<? super a> dVar) {
            super(2, dVar);
            b.this = r1;
            this.f28083g = str;
        }

        @Override // fm.p
        public final Object A(e0 e0Var, d<? super LocationInfo> dVar) {
            return ((a) p(e0Var, dVar)).t(tl.l.f28297a);
        }

        @Override // zl.a
        public final d<tl.l> p(Object obj, d<?> dVar) {
            return new a(this.f28083g, dVar);
        }

        @Override // zl.a
        public final Object t(Object obj) {
            Executor executor;
            boolean z10;
            yl.a aVar = yl.a.COROUTINE_SUSPENDED;
            int i10 = this.f28081e;
            if (i10 != 0) {
                if (i10 == 1) {
                    a0.k(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                a0.k(obj);
                b bVar = b.this;
                String str = this.f28083g;
                this.f28081e = 1;
                j jVar = new j(1, a0.i(this));
                jVar.u();
                a.b bVar2 = p000do.a.f13275a;
                bVar2.t("StdLocation");
                bVar2.h("continuation start", new Object[0]);
                f1.d dVar = new f1.d();
                LocationManager locationManager = bVar.f28079a;
                wm.b bVar3 = o0.f24382b;
                if (bVar3 instanceof x0) {
                    executor = bVar3;
                } else {
                    executor = null;
                }
                if (executor == null) {
                    executor = new n0(bVar3);
                }
                C0500a c0500a = new C0500a(jVar, bVar);
                int i11 = g.f12600a;
                if (Build.VERSION.SDK_INT >= 30) {
                    g.b.a(locationManager, str, dVar, executor, c0500a);
                } else {
                    synchronized (dVar) {
                        z10 = dVar.f14028a;
                    }
                    if (!z10) {
                        Location lastKnownLocation = locationManager.getLastKnownLocation(str);
                        if (lastKnownLocation != null && SystemClock.elapsedRealtime() - TimeUnit.NANOSECONDS.toMillis(d1.b.a(lastKnownLocation)) < 10000) {
                            executor.execute(new s.p(c0500a, lastKnownLocation, 12));
                        } else {
                            g.d dVar2 = new g.d(locationManager, executor, c0500a);
                            locationManager.requestLocationUpdates(str, 0L, 0.0f, dVar2, Looper.getMainLooper());
                            dVar.b(new n2(3, dVar2));
                            synchronized (dVar2) {
                                if (!dVar2.f12607e) {
                                    s.m mVar = new s.m(8, dVar2);
                                    dVar2.f12608f = mVar;
                                    dVar2.f12605c.postDelayed(mVar, 30000L);
                                }
                            }
                        }
                    } else {
                        throw new n(null);
                    }
                }
                jVar.z(new C0501b(dVar));
                obj = jVar.t();
                if (obj == aVar) {
                    return aVar;
                }
            }
            return obj;
        }
    }

    public b(Context context) {
        Object systemService = context.getSystemService("location");
        gm.l.d(systemService, "null cannot be cast to non-null type android.location.LocationManager");
        this.f28079a = (LocationManager) systemService;
        this.f28080b = new Geocoder(context);
        a.b bVar = p000do.a.f13275a;
        bVar.t("StdLocation");
        bVar.h("init", new Object[0]);
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x002b, code lost:
        if (r4.getProvider("fused") != null) goto L4;
     */
    @Override // ug.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(xl.d<? super com.topstep.fitcloud.pro.model.location.LocationInfo> r9) {
        /*
            r8 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            do.a$b r1 = p000do.a.f13275a
            java.lang.String r2 = "StdLocation"
            r1.t(r2)
            r2 = 1
            java.lang.Object[] r3 = new java.lang.Object[r2]
            android.location.LocationManager r4 = r8.f28079a
            int r5 = d1.g.f12600a
            r5 = 0
            java.lang.String r6 = "fused"
            r7 = 31
            if (r0 < r7) goto L1c
            boolean r2 = d1.g.c.a(r4, r6)
            goto L2f
        L1c:
            java.util.List r0 = r4.getAllProviders()
            boolean r0 = r0.contains(r6)
            if (r0 == 0) goto L27
            goto L2f
        L27:
            android.location.LocationProvider r0 = r4.getProvider(r6)     // Catch: java.lang.SecurityException -> L2e
            if (r0 == 0) goto L2e
            goto L2f
        L2e:
            r2 = 0
        L2f:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r2)
            r3[r5] = r0
            java.lang.String r0 = "hasProvider:%b"
            r1.h(r0, r3)
            r0 = 180000(0x2bf20, double:8.8932E-319)
            tf.b$a r2 = new tf.b$a
            r3 = 0
            r2.<init>(r6, r3)
            java.lang.Object r9 = jh.v.g(r0, r2, r9)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: tf.b.a(xl.d):java.lang.Object");
    }
}
