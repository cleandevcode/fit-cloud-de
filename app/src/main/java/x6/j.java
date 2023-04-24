package x6;

import android.annotation.SuppressLint;
import android.location.Location;
import android.os.Looper;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.LocationResult;
import g8.a;
import g9.p;
import g9.t;
import h8.a1;
import h8.h;
import h8.n0;
import h8.o;
import h8.o0;
import h8.q0;
import h8.r0;
import java.util.concurrent.Executor;
import p000do.a;
import x6.b;

@SuppressLint({"MissingPermission"})
/* loaded from: classes.dex */
public final class j extends x6.b {

    /* renamed from: h */
    public final x8.h f30373h;

    /* renamed from: i */
    public b f30374i;

    /* loaded from: classes.dex */
    public static final class a extends gm.m implements fm.l<Location, tl.l> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a() {
            super(1);
            j.this = r1;
        }

        @Override // fm.l
        public final tl.l k(Location location) {
            b.a aVar;
            Location location2 = location;
            if (location2 != null) {
                j jVar = j.this;
                jVar.getClass();
                if (jVar.f30332d && (aVar = jVar.f30330b) != null) {
                    aVar.c(location2.getLatitude(), location2.getLongitude());
                }
            }
            return tl.l.f28297a;
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends a9.c {
        public b() {
            j.this = r1;
        }

        @Override // a9.c
        public final void a(LocationResult locationResult) {
            Location location;
            boolean z10;
            gm.l.f(locationResult, "locationResult");
            int size = locationResult.f6129a.size();
            if (size == 0) {
                location = null;
            } else {
                location = (Location) locationResult.f6129a.get(size - 1);
            }
            if (location == null) {
                return;
            }
            a.b bVar = p000do.a.f13275a;
            j.this.getClass();
            bVar.t("GMapSportLocation");
            bVar.b("Location Success: lat:%f lng:%f altitude:%f speed:%f accuracy:%f  provider:%s thread:%s", Double.valueOf(location.getLatitude()), Double.valueOf(location.getLongitude()), Double.valueOf(location.getAltitude()), Float.valueOf(location.getSpeed()), Float.valueOf(location.getAccuracy()), location.getProvider(), Thread.currentThread().getName());
            j jVar = j.this;
            jVar.getClass();
            if (jVar.f30332d) {
                jVar.f30332d = false;
                b.a aVar = jVar.f30330b;
                if (aVar != null) {
                    aVar.c(location.getLatitude(), location.getLongitude());
                }
            }
            Integer num = jVar.f30331c;
            if (num == null) {
                jVar.f30331c = 0;
                b.a aVar2 = jVar.f30330b;
                if (aVar2 != null) {
                    aVar2.b();
                }
            } else if (num.intValue() == 0) {
                int i10 = jVar.f30333e;
                if (i10 < 5) {
                    jVar.f30333e = i10 + 1;
                } else if (location.getAccuracy() <= jVar.f30329a) {
                    y6.a aVar3 = new y6.a(location.getLatitude(), location.getLongitude());
                    int i11 = jVar.f30335g;
                    y6.a[] aVarArr = jVar.f30334f;
                    if (i11 < aVarArr.length) {
                        aVarArr[i11] = aVar3;
                        int i12 = i11 + 1;
                        jVar.f30335g = i12;
                        if (i12 > 1) {
                            return;
                        }
                    } else {
                        y6.a aVar4 = aVarArr[0];
                        gm.l.c(aVar4);
                        float e10 = jVar.e(aVar4, aVar3);
                        y6.a aVar5 = jVar.f30334f[1];
                        gm.l.c(aVar5);
                        float e11 = jVar.e(aVar5, aVar3);
                        y6.a aVar6 = jVar.f30334f[2];
                        gm.l.c(aVar6);
                        float e12 = jVar.e(aVar6, aVar3);
                        bVar.t("GMapSportLocation");
                        bVar.b("distance1:%f distance2:%f distance3:%f ", Float.valueOf(e10), Float.valueOf(e11), Float.valueOf(e12));
                        if (e10 > 5.0f && e11 > 5.0f && e12 > 5.0f) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (z10) {
                            jVar.f30334f[0] = aVar3;
                            jVar.f30335g = 1;
                        } else {
                            return;
                        }
                    }
                    b.a aVar7 = jVar.f30330b;
                    if (aVar7 != null) {
                        aVar7.a(location.getLatitude(), location.getLongitude(), location.getAltitude());
                    }
                }
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(c cVar, int i10) {
        super(i10);
        gm.l.f(cVar, "context");
        int i11 = a9.d.f425a;
        this.f30373h = new x8.h(cVar);
    }

    @Override // x6.b
    public final float a(double d10, double d11, double d12, double d13) {
        gm.l.f(k.f30377a, "<this>");
        float[] fArr = new float[1];
        Location.distanceBetween(d10, d11, d12, d13, fArr);
        return fArr[0];
    }

    @Override // x6.b
    public final void b() {
        x8.h hVar = this.f30373h;
        hVar.getClass();
        o.a aVar = new o.a();
        aVar.f16003a = new h8.m() { // from class: x8.c
            @Override // h8.m
            public final void a(a.e eVar, Object obj) {
                u uVar = (u) eVar;
                g9.h hVar2 = (g9.h) obj;
                a9.b bVar = new a9.b(Long.MAX_VALUE, 0, false, null, null);
                uVar.getClass();
                boolean D = uVar.D(a9.h.f431b);
                q0 q0Var = (q0) uVar.u();
                if (D) {
                    q0Var.J(bVar, new l(hVar2));
                } else {
                    hVar2.a(q0Var.n());
                }
            }
        };
        aVar.f16006d = 2414;
        t c10 = hVar.c(0, aVar.a());
        final a aVar2 = new a();
        g9.e eVar = new g9.e() { // from class: x6.i
            @Override // g9.e
            public final void onSuccess(Object obj) {
                fm.l lVar = aVar2;
                gm.l.f(lVar, "$tmp0");
                lVar.k(obj);
            }
        };
        c10.getClass();
        c10.f15058b.a(new p(g9.i.f15035a, eVar));
        c10.e();
    }

    @Override // x6.b
    public final void c(y6.d dVar) {
        super.c(dVar);
        if (this.f30374i != null) {
            return;
        }
        LocationRequest a10 = new LocationRequest.a(100, 3000L).a();
        b bVar = new b();
        this.f30374i = bVar;
        x8.h hVar = this.f30373h;
        Looper mainLooper = Looper.getMainLooper();
        hVar.getClass();
        if (mainLooper == null) {
            mainLooper = Looper.myLooper();
            i8.p.g(mainLooper, "invalid null looper");
        }
        h8.h hVar2 = new h8.h(mainLooper, bVar, a9.c.class.getSimpleName());
        x8.g gVar = new x8.g(hVar, hVar2);
        w.c cVar = new w.c(gVar, a10);
        h8.l lVar = new h8.l();
        lVar.f15983a = cVar;
        lVar.f15984b = gVar;
        lVar.f15985c = hVar2;
        lVar.f15986d = 2436;
        h.a aVar = hVar2.f15958c;
        i8.p.g(aVar, "Key must not be null");
        h8.h hVar3 = lVar.f15985c;
        int i10 = lVar.f15986d;
        q0 q0Var = new q0(lVar, hVar3, i10);
        r0 r0Var = new r0(lVar, aVar);
        i8.p.g(hVar3.f15958c, "Listener has already been released.");
        h8.d dVar2 = hVar.f15026j;
        dVar2.getClass();
        g9.h hVar4 = new g9.h();
        dVar2.f(hVar4, i10, hVar);
        a1 a1Var = new a1(new o0(q0Var, r0Var), hVar4);
        v8.j jVar = dVar2.f15938n;
        jVar.sendMessage(jVar.obtainMessage(8, new n0(a1Var, dVar2.f15933i.get(), hVar)));
    }

    @Override // x6.b
    public final void d() {
        b bVar = this.f30374i;
        if (bVar != null) {
            x8.h hVar = this.f30373h;
            hVar.getClass();
            String simpleName = a9.c.class.getSimpleName();
            i8.p.e("Listener type must not be empty", simpleName);
            t b10 = hVar.b(new h.a<>(bVar, simpleName), 2418);
            x8.e eVar = new Executor() { // from class: x8.e
                @Override // java.util.concurrent.Executor
                public final void execute(Runnable runnable) {
                    runnable.run();
                }
            };
            x8.b bVar2 = new g9.a() { // from class: x8.b
                @Override // g9.a
                public final void a(g9.t tVar) {
                    g8.a aVar = h.f30418k;
                }
            };
            b10.getClass();
            b10.f15058b.a(new g9.k(eVar, bVar2, new t()));
            b10.e();
        }
        this.f30374i = null;
    }

    public final float e(y6.a aVar, y6.a aVar2) {
        gm.l.f(k.f30377a, "<this>");
        float[] fArr = new float[1];
        Location.distanceBetween(aVar.f31164a, aVar.f31165b, aVar2.f31164a, aVar2.f31165b, fArr);
        return fArr[0];
    }
}
