package s;

import a0.b0;
import a0.d0;
import a0.f2;
import a0.g1;
import a0.m0;
import a0.u1;
import a0.w;
import a0.x;
import android.annotation.SuppressLint;
import android.graphics.SurfaceTexture;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CameraManager;
import android.os.Build;
import android.os.Handler;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.ArrayMap;
import android.util.Log;
import android.util.Rational;
import android.util.Size;
import android.view.Surface;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.z;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicInteger;
import s.c2;
import s.e0;
import s.p2;
import y.q;

/* loaded from: classes.dex */
public final class a0 implements a0.b0 {

    /* renamed from: a */
    public final a0.f2 f25869a;

    /* renamed from: b */
    public final t.d0 f25870b;

    /* renamed from: c */
    public final c0.g f25871c;

    /* renamed from: d */
    public final c0.b f25872d;

    /* renamed from: e */
    public volatile int f25873e = 1;

    /* renamed from: f */
    public final a0.g1<b0.a> f25874f;

    /* renamed from: g */
    public final g1 f25875g;

    /* renamed from: h */
    public final r f25876h;

    /* renamed from: i */
    public final d f25877i;

    /* renamed from: j */
    public final e0 f25878j;

    /* renamed from: k */
    public CameraDevice f25879k;

    /* renamed from: l */
    public int f25880l;

    /* renamed from: m */
    public q1 f25881m;

    /* renamed from: n */
    public final LinkedHashMap f25882n;

    /* renamed from: o */
    public final b f25883o;

    /* renamed from: p */
    public final a0.d0 f25884p;

    /* renamed from: q */
    public final HashSet f25885q;

    /* renamed from: r */
    public c2 f25886r;

    /* renamed from: s */
    public final r1 f25887s;

    /* renamed from: t */
    public final p2.a f25888t;

    /* renamed from: u */
    public final HashSet f25889u;

    /* renamed from: v */
    public w.a f25890v;

    /* renamed from: w */
    public final Object f25891w;

    /* renamed from: x */
    public a0.v1 f25892x;

    /* renamed from: y */
    public boolean f25893y;

    /* renamed from: z */
    public final t1 f25894z;

    /* loaded from: classes.dex */
    public class a implements d0.c<Void> {
        public a() {
            a0.this = r1;
        }

        @Override // d0.c
        public final void onFailure(Throwable th2) {
            a0.u1 u1Var = null;
            if (th2 instanceof m0.a) {
                a0 a0Var = a0.this;
                a0.m0 m0Var = ((m0.a) th2).f134a;
                Iterator<a0.u1> it = a0Var.f25869a.b().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    a0.u1 next = it.next();
                    if (next.b().contains(m0Var)) {
                        u1Var = next;
                        break;
                    }
                }
                if (u1Var != null) {
                    a0 a0Var2 = a0.this;
                    a0Var2.getClass();
                    c0.b p10 = o8.b.p();
                    List<u1.c> list = u1Var.f186e;
                    if (!list.isEmpty()) {
                        a0Var2.q("Posting surface closed", new Throwable());
                        p10.execute(new p(list.get(0), u1Var, 1));
                    }
                }
            } else if (th2 instanceof CancellationException) {
                a0.this.q("Unable to configure camera cancelled", null);
            } else {
                if (a0.this.f25873e == 4) {
                    a0.this.C(4, new y.e(4, th2), true);
                }
                if (th2 instanceof CameraAccessException) {
                    a0 a0Var3 = a0.this;
                    StringBuilder a10 = android.support.v4.media.d.a("Unable to configure camera due to ");
                    a10.append(th2.getMessage());
                    a0Var3.q(a10.toString(), null);
                } else if (th2 instanceof TimeoutException) {
                    StringBuilder a11 = android.support.v4.media.d.a("Unable to configure camera ");
                    a11.append(a0.this.f25878j.f25939a);
                    a11.append(", timeout!");
                    y.u0.b("Camera2CameraImpl", a11.toString());
                }
            }
        }

        @Override // d0.c
        public final /* bridge */ /* synthetic */ void onSuccess(Void r12) {
        }
    }

    /* loaded from: classes.dex */
    public final class b extends CameraManager.AvailabilityCallback implements d0.b {

        /* renamed from: a */
        public final String f25896a;

        /* renamed from: b */
        public boolean f25897b = true;

        public b(String str) {
            a0.this = r1;
            this.f25896a = str;
        }

        @Override // android.hardware.camera2.CameraManager.AvailabilityCallback
        public final void onCameraAvailable(String str) {
            if (this.f25896a.equals(str)) {
                this.f25897b = true;
                if (a0.this.f25873e == 2) {
                    a0.this.G(false);
                }
            }
        }

        @Override // android.hardware.camera2.CameraManager.AvailabilityCallback
        public final void onCameraUnavailable(String str) {
            if (this.f25896a.equals(str)) {
                this.f25897b = false;
            }
        }
    }

    /* loaded from: classes.dex */
    public final class c implements x.c {
        public c() {
            a0.this = r1;
        }
    }

    /* loaded from: classes.dex */
    public final class d extends CameraDevice.StateCallback {

        /* renamed from: a */
        public final Executor f25900a;

        /* renamed from: b */
        public final ScheduledExecutorService f25901b;

        /* renamed from: c */
        public b f25902c;

        /* renamed from: d */
        public ScheduledFuture<?> f25903d;

        /* renamed from: e */
        public final a f25904e = new a();

        /* loaded from: classes.dex */
        public class a {

            /* renamed from: a */
            public long f25906a = -1;

            public a() {
                d.this = r3;
            }

            public final int a() {
                if (d.this.c()) {
                    long uptimeMillis = SystemClock.uptimeMillis();
                    if (this.f25906a == -1) {
                        this.f25906a = uptimeMillis;
                    }
                    long j10 = uptimeMillis - this.f25906a;
                    if (j10 <= 120000) {
                        return 1000;
                    }
                    return j10 <= 300000 ? 2000 : 4000;
                }
                return 700;
            }
        }

        /* loaded from: classes.dex */
        public class b implements Runnable {

            /* renamed from: a */
            public Executor f25908a;

            /* renamed from: b */
            public boolean f25909b = false;

            public b(Executor executor) {
                d.this = r1;
                this.f25908a = executor;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.f25908a.execute(new androidx.activity.b(1, this));
            }
        }

        public d(c0.g gVar, c0.b bVar) {
            a0.this = r1;
            this.f25900a = gVar;
            this.f25901b = bVar;
        }

        public final boolean a() {
            if (this.f25903d != null) {
                a0 a0Var = a0.this;
                StringBuilder a10 = android.support.v4.media.d.a("Cancelling scheduled re-open: ");
                a10.append(this.f25902c);
                a0Var.q(a10.toString(), null);
                this.f25902c.f25909b = true;
                this.f25902c = null;
                this.f25903d.cancel(false);
                this.f25903d = null;
                return true;
            }
            return false;
        }

        public final void b() {
            boolean z10;
            boolean z11;
            int i10;
            boolean z12;
            boolean z13 = true;
            if (this.f25902c == null) {
                z10 = true;
            } else {
                z10 = false;
            }
            h1.k(null, z10);
            if (this.f25903d == null) {
                z11 = true;
            } else {
                z11 = false;
            }
            h1.k(null, z11);
            a aVar = this.f25904e;
            aVar.getClass();
            long uptimeMillis = SystemClock.uptimeMillis();
            if (aVar.f25906a == -1) {
                aVar.f25906a = uptimeMillis;
            }
            long j10 = uptimeMillis - aVar.f25906a;
            int i11 = 10000;
            if (!d.this.c()) {
                i10 = 10000;
            } else {
                i10 = 1800000;
            }
            if (j10 >= i10) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (z12) {
                aVar.f25906a = -1L;
                z13 = false;
            }
            if (z13) {
                this.f25902c = new b(this.f25900a);
                a0 a0Var = a0.this;
                StringBuilder a10 = android.support.v4.media.d.a("Attempting camera re-open in ");
                a10.append(this.f25904e.a());
                a10.append("ms: ");
                a10.append(this.f25902c);
                a10.append(" activeResuming = ");
                a10.append(a0.this.f25893y);
                a0Var.q(a10.toString(), null);
                this.f25903d = this.f25901b.schedule(this.f25902c, this.f25904e.a(), TimeUnit.MILLISECONDS);
                return;
            }
            StringBuilder a11 = android.support.v4.media.d.a("Camera reopening attempted for ");
            if (d.this.c()) {
                i11 = 1800000;
            }
            a11.append(i11);
            a11.append("ms without success.");
            y.u0.b("Camera2CameraImpl", a11.toString());
            a0.this.C(2, null, false);
        }

        public final boolean c() {
            int i10;
            a0 a0Var = a0.this;
            return a0Var.f25893y && ((i10 = a0Var.f25880l) == 1 || i10 == 2);
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public final void onClosed(CameraDevice cameraDevice) {
            boolean z10;
            a0.this.q("CameraDevice.onClosed()", null);
            if (a0.this.f25879k == null) {
                z10 = true;
            } else {
                z10 = false;
            }
            h1.k("Unexpected onClose callback on camera device: " + cameraDevice, z10);
            int b10 = c0.b(a0.this.f25873e);
            if (b10 != 4) {
                if (b10 != 5) {
                    if (b10 != 6) {
                        StringBuilder a10 = android.support.v4.media.d.a("Camera closed while in state: ");
                        a10.append(b0.b(a0.this.f25873e));
                        throw new IllegalStateException(a10.toString());
                    }
                } else {
                    a0 a0Var = a0.this;
                    if (a0Var.f25880l != 0) {
                        StringBuilder a11 = android.support.v4.media.d.a("Camera closed due to error: ");
                        a11.append(a0.s(a0.this.f25880l));
                        a0Var.q(a11.toString(), null);
                        b();
                        return;
                    }
                    a0Var.G(false);
                    return;
                }
            }
            h1.k(null, a0.this.u());
            a0.this.r();
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public final void onDisconnected(CameraDevice cameraDevice) {
            a0.this.q("CameraDevice.onDisconnected()", null);
            onError(cameraDevice, 1);
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public final void onError(CameraDevice cameraDevice, int i10) {
            boolean z10;
            a0 a0Var = a0.this;
            a0Var.f25879k = cameraDevice;
            a0Var.f25880l = i10;
            int b10 = c0.b(a0Var.f25873e);
            int i11 = 2;
            int i12 = 6;
            boolean z11 = false;
            if (b10 != 2 && b10 != 3) {
                if (b10 != 4) {
                    if (b10 != 5) {
                        if (b10 != 6) {
                            StringBuilder a10 = android.support.v4.media.d.a("onError() should not be possible from state: ");
                            a10.append(b0.b(a0.this.f25873e));
                            throw new IllegalStateException(a10.toString());
                        }
                    }
                }
                y.u0.b("Camera2CameraImpl", String.format("CameraDevice.onError(): %s failed with %s while in %s state. Will finish closing camera.", cameraDevice.getId(), a0.s(i10), b0.a(a0.this.f25873e)));
                a0.this.o();
                return;
            }
            y.u0.a("Camera2CameraImpl", String.format("CameraDevice.onError(): %s failed with %s while in %s state. Will attempt recovering from error.", cameraDevice.getId(), a0.s(i10), b0.a(a0.this.f25873e)));
            if (a0.this.f25873e != 3 && a0.this.f25873e != 4 && a0.this.f25873e != 6) {
                z10 = false;
            } else {
                z10 = true;
            }
            StringBuilder a11 = android.support.v4.media.d.a("Attempt to handle open error from non open state: ");
            a11.append(b0.b(a0.this.f25873e));
            h1.k(a11.toString(), z10);
            if (i10 != 1 && i10 != 2 && i10 != 4) {
                StringBuilder a12 = android.support.v4.media.d.a("Error observed on open (or opening) camera device ");
                a12.append(cameraDevice.getId());
                a12.append(": ");
                a12.append(a0.s(i10));
                a12.append(" closing camera.");
                y.u0.b("Camera2CameraImpl", a12.toString());
                if (i10 == 3) {
                    i12 = 5;
                }
                a0.this.C(5, new y.e(i12, null), true);
                a0.this.o();
                return;
            }
            y.u0.a("Camera2CameraImpl", String.format("Attempt to reopen camera[%s] after error[%s]", cameraDevice.getId(), a0.s(i10)));
            if (a0.this.f25880l != 0) {
                z11 = true;
            }
            h1.k("Can only reopen camera device after error if the camera device is actually in an error state.", z11);
            if (i10 != 1) {
                if (i10 != 2) {
                    i11 = 3;
                } else {
                    i11 = 1;
                }
            }
            a0.this.C(6, new y.e(i11, null), true);
            a0.this.o();
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public final void onOpened(CameraDevice cameraDevice) {
            a0.this.q("CameraDevice.onOpened()", null);
            a0 a0Var = a0.this;
            a0Var.f25879k = cameraDevice;
            a0Var.f25880l = 0;
            this.f25904e.f25906a = -1L;
            int b10 = c0.b(a0Var.f25873e);
            if (b10 != 2) {
                if (b10 != 4) {
                    if (b10 != 5) {
                        if (b10 != 6) {
                            StringBuilder a10 = android.support.v4.media.d.a("onOpened() should not be possible from state: ");
                            a10.append(b0.b(a0.this.f25873e));
                            throw new IllegalStateException(a10.toString());
                        }
                    }
                }
                h1.k(null, a0.this.u());
                a0.this.f25879k.close();
                a0.this.f25879k = null;
                return;
            }
            a0.this.B(4);
            a0.this.x();
        }
    }

    /* loaded from: classes.dex */
    public static abstract class e {
        public abstract a0.u1 a();

        public abstract Size b();

        public abstract a0.h2<?> c();

        public abstract String d();

        public abstract Class<?> e();
    }

    /* JADX WARN: Type inference failed for: r10v3, types: [s.d0] */
    public a0(t.d0 d0Var, String str, e0 e0Var, a0.d0 d0Var2, Executor executor, Handler handler, t1 t1Var) {
        boolean z10;
        z.a<?> f10;
        boolean z11 = true;
        a0.g1<b0.a> g1Var = new a0.g1<>();
        this.f25874f = g1Var;
        this.f25880l = 0;
        new AtomicInteger(0);
        this.f25882n = new LinkedHashMap();
        this.f25885q = new HashSet();
        this.f25889u = new HashSet();
        this.f25890v = a0.w.f203a;
        this.f25891w = new Object();
        this.f25893y = false;
        this.f25870b = d0Var;
        this.f25884p = d0Var2;
        c0.b bVar = new c0.b(handler);
        this.f25872d = bVar;
        c0.g gVar = new c0.g(executor);
        this.f25871c = gVar;
        this.f25877i = new d(gVar, bVar);
        this.f25869a = new a0.f2(str);
        g1Var.f71a.k(new g1.b<>(b0.a.f24f));
        g1 g1Var2 = new g1(d0Var2);
        this.f25875g = g1Var2;
        r1 r1Var = new r1(gVar);
        this.f25887s = r1Var;
        this.f25894z = t1Var;
        this.f25881m = v();
        try {
            r rVar = new r(d0Var.b(str), gVar, new c(), e0Var.f25945g);
            this.f25876h = rVar;
            this.f25878j = e0Var;
            e0Var.j(rVar);
            androidx.lifecycle.a0<y.q> a0Var = g1Var2.f25958b;
            final e0.a<y.q> aVar = e0Var.f25943e;
            LiveData<y.q> liveData = aVar.f25946m;
            if (liveData != null && (f10 = aVar.f2810l.f(liveData)) != null) {
                f10.f2811a.i(f10);
            }
            aVar.f25946m = a0Var;
            ?? r10 = new androidx.lifecycle.b0() { // from class: s.d0
                @Override // androidx.lifecycle.b0
                public final void a(Object obj) {
                    e0.a.this.j(obj);
                }
            };
            z.a<?> aVar2 = new z.a<>(a0Var, r10);
            z.a<?> e10 = aVar.f2810l.e(a0Var, aVar2);
            if (e10 != null && e10.f2812b != r10) {
                throw new IllegalArgumentException("This source was already added with the different observer");
            }
            if (aVar.f2640c > 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                aVar2.b();
            }
            this.f25888t = new p2.a(handler, r1Var, e0Var.f25945g, v.k.f28962a, gVar, bVar);
            b bVar2 = new b(str);
            this.f25883o = bVar2;
            synchronized (d0Var2.f37b) {
                if (d0Var2.f39d.containsKey(this)) {
                    z11 = false;
                }
                h1.k("Camera is already registered: " + this, z11);
                d0Var2.f39d.put(this, new d0.a(gVar, bVar2));
            }
            d0Var.f27404a.a(gVar, bVar2);
        } catch (t.f e11) {
            throw h1.l(e11);
        }
    }

    public static ArrayList D(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            androidx.camera.core.t tVar = (androidx.camera.core.t) it.next();
            arrayList2.add(new s.b(t(tVar), tVar.getClass(), tVar.f1811l, tVar.f1805f, tVar.f1806g));
        }
        return arrayList2;
    }

    public static String s(int i10) {
        return i10 != 0 ? i10 != 1 ? i10 != 2 ? i10 != 3 ? i10 != 4 ? i10 != 5 ? "UNKNOWN ERROR" : "ERROR_CAMERA_SERVICE" : "ERROR_CAMERA_DEVICE" : "ERROR_CAMERA_DISABLED" : "ERROR_MAX_CAMERAS_IN_USE" : "ERROR_CAMERA_IN_USE" : "ERROR_NONE";
    }

    public static String t(androidx.camera.core.t tVar) {
        return tVar.f() + tVar.hashCode();
    }

    public final void A() {
        boolean z10;
        if (this.f25881m != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        h1.k(null, z10);
        q("Resetting Capture Session", null);
        q1 q1Var = this.f25881m;
        a0.u1 f10 = q1Var.f();
        List<a0.h0> d10 = q1Var.d();
        q1 v10 = v();
        this.f25881m = v10;
        v10.b(f10);
        this.f25881m.e(d10);
        y(q1Var);
    }

    public final void B(int i10) {
        C(i10, null, true);
    }

    public final void C(int i10, y.e eVar, boolean z10) {
        b0.a aVar;
        boolean z11;
        b0.a aVar2;
        boolean z12;
        HashMap hashMap;
        y.d dVar;
        b0.a aVar3 = b0.a.f26h;
        b0.a aVar4 = b0.a.f21c;
        b0.a aVar5 = b0.a.f23e;
        b0.a aVar6 = b0.a.f20b;
        StringBuilder a10 = android.support.v4.media.d.a("Transitioning camera internal state: ");
        a10.append(b0.b(this.f25873e));
        a10.append(" --> ");
        a10.append(b0.b(i10));
        q(a10.toString(), null);
        this.f25873e = i10;
        if (i10 != 0) {
            switch (i10 - 1) {
                case 0:
                    aVar = b0.a.f24f;
                    break;
                case 1:
                    aVar = aVar6;
                    break;
                case 2:
                case 5:
                    aVar = aVar4;
                    break;
                case 3:
                    aVar = b0.a.f22d;
                    break;
                case 4:
                    aVar = aVar5;
                    break;
                case 6:
                    aVar = b0.a.f25g;
                    break;
                case 7:
                    aVar = aVar3;
                    break;
                default:
                    StringBuilder a11 = android.support.v4.media.d.a("Unknown state: ");
                    a11.append(b0.b(i10));
                    throw new IllegalStateException(a11.toString());
            }
            a0.d0 d0Var = this.f25884p;
            synchronized (d0Var.f37b) {
                int i11 = d0Var.f40e;
                z11 = false;
                if (aVar == aVar3) {
                    d0.a aVar7 = (d0.a) d0Var.f39d.remove(this);
                    if (aVar7 != null) {
                        d0Var.a();
                        aVar2 = aVar7.f41a;
                    } else {
                        aVar2 = null;
                    }
                } else {
                    d0.a aVar8 = (d0.a) d0Var.f39d.get(this);
                    h1.i(aVar8, "Cannot update state of camera which has not yet been registered. Register with CameraStateRegistry.registerCamera()");
                    b0.a aVar9 = aVar8.f41a;
                    aVar8.f41a = aVar;
                    if (aVar == aVar4) {
                        if (!aVar.f28a && aVar9 != aVar4) {
                            z12 = false;
                            h1.k("Cannot mark camera as opening until camera was successful at calling CameraStateRegistry.tryOpenCamera()", z12);
                        }
                        z12 = true;
                        h1.k("Cannot mark camera as opening until camera was successful at calling CameraStateRegistry.tryOpenCamera()", z12);
                    }
                    if (aVar9 != aVar) {
                        d0Var.a();
                    }
                    aVar2 = aVar9;
                }
                if (aVar2 != aVar) {
                    if (i11 < 1 && d0Var.f40e > 0) {
                        hashMap = new HashMap();
                        for (Map.Entry entry : d0Var.f39d.entrySet()) {
                            if (((d0.a) entry.getValue()).f41a == aVar6) {
                                hashMap.put((y.g) entry.getKey(), (d0.a) entry.getValue());
                            }
                        }
                    } else if (aVar == aVar6 && d0Var.f40e > 0) {
                        hashMap = new HashMap();
                        hashMap.put(this, (d0.a) d0Var.f39d.get(this));
                    } else {
                        hashMap = null;
                    }
                    if (hashMap != null && !z10) {
                        hashMap.remove(this);
                    }
                    if (hashMap != null) {
                        for (d0.a aVar10 : hashMap.values()) {
                            aVar10.getClass();
                            try {
                                Executor executor = aVar10.f42b;
                                d0.b bVar = aVar10.f43c;
                                Objects.requireNonNull(bVar);
                                executor.execute(new androidx.appcompat.widget.s2(4, bVar));
                            } catch (RejectedExecutionException e10) {
                                y.u0.c("CameraStateRegistry", "Unable to notify camera.", e10);
                            }
                        }
                    }
                }
            }
            this.f25874f.f71a.k(new g1.b<>(aVar));
            g1 g1Var = this.f25875g;
            g1Var.getClass();
            q.b bVar2 = q.b.OPENING;
            switch (aVar.ordinal()) {
                case 0:
                    a0.d0 d0Var2 = g1Var.f25957a;
                    synchronized (d0Var2.f37b) {
                        Iterator it = d0Var2.f39d.entrySet().iterator();
                        while (true) {
                            if (it.hasNext()) {
                                if (((d0.a) ((Map.Entry) it.next()).getValue()).f41a == aVar5) {
                                    z11 = true;
                                }
                            }
                        }
                    }
                    if (!z11) {
                        bVar2 = q.b.PENDING_OPEN;
                    }
                    dVar = new y.d(bVar2, null);
                    break;
                case 1:
                    dVar = new y.d(bVar2, eVar);
                    break;
                case 2:
                    dVar = new y.d(q.b.OPEN, eVar);
                    break;
                case 3:
                case 5:
                    dVar = new y.d(q.b.CLOSING, eVar);
                    break;
                case 4:
                case 6:
                    dVar = new y.d(q.b.CLOSED, eVar);
                    break;
                default:
                    throw new IllegalStateException("Unknown internal camera state: " + aVar);
            }
            y.u0.a("CameraStateMachine", "New public camera state " + dVar + " from " + aVar + " and " + eVar);
            if (!Objects.equals(g1Var.f25958b.d(), dVar)) {
                y.u0.a("CameraStateMachine", "Publishing new public camera state " + dVar);
                g1Var.f25958b.k(dVar);
                return;
            }
            return;
        }
        throw null;
    }

    public final void E(List list) {
        boolean z10;
        Size b10;
        boolean isEmpty = this.f25869a.b().isEmpty();
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        Rational rational = null;
        while (true) {
            z10 = true;
            boolean z11 = false;
            if (!it.hasNext()) {
                break;
            }
            e eVar = (e) it.next();
            a0.f2 f2Var = this.f25869a;
            String d10 = eVar.d();
            if (f2Var.f58b.containsKey(d10)) {
                z11 = ((f2.a) f2Var.f58b.get(d10)).f61c;
            }
            if (!z11) {
                a0.f2 f2Var2 = this.f25869a;
                String d11 = eVar.d();
                a0.u1 a10 = eVar.a();
                a0.h2<?> c10 = eVar.c();
                f2.a aVar = (f2.a) f2Var2.f58b.get(d11);
                if (aVar == null) {
                    aVar = new f2.a(a10, c10);
                    f2Var2.f58b.put(d11, aVar);
                }
                aVar.f61c = true;
                arrayList.add(eVar.d());
                if (eVar.e() == androidx.camera.core.m.class && (b10 = eVar.b()) != null) {
                    rational = new Rational(b10.getWidth(), b10.getHeight());
                }
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        StringBuilder a11 = android.support.v4.media.d.a("Use cases [");
        a11.append(TextUtils.join(", ", arrayList));
        a11.append("] now ATTACHED");
        q(a11.toString(), null);
        if (isEmpty) {
            this.f25876h.p(true);
            r rVar = this.f25876h;
            synchronized (rVar.f26139d) {
                rVar.f26150o++;
            }
        }
        n();
        I();
        H();
        A();
        if (this.f25873e == 4) {
            x();
        } else {
            int b11 = c0.b(this.f25873e);
            if (b11 != 0 && b11 != 1) {
                if (b11 != 4) {
                    StringBuilder a12 = android.support.v4.media.d.a("open() ignored due to being in state: ");
                    a12.append(b0.b(this.f25873e));
                    q(a12.toString(), null);
                } else {
                    B(6);
                    if (!u() && this.f25880l == 0) {
                        if (this.f25879k == null) {
                            z10 = false;
                        }
                        h1.k("Camera Device should be open if session close is not complete", z10);
                        B(4);
                        x();
                    }
                }
            } else {
                F(false);
            }
        }
        if (rational != null) {
            this.f25876h.f26143h.getClass();
        }
    }

    public final void F(boolean z10) {
        q("Attempting to force open the camera.", null);
        if (!this.f25884p.b(this)) {
            q("No cameras available. Waiting for available camera before opening camera.", null);
            B(2);
            return;
        }
        w(z10);
    }

    public final void G(boolean z10) {
        boolean z11;
        q("Attempting to open the camera.", null);
        if (this.f25883o.f25897b && this.f25884p.b(this)) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (!z11) {
            q("No cameras available. Waiting for available camera before opening camera.", null);
            B(2);
            return;
        }
        w(z10);
    }

    public final void H() {
        boolean z10;
        q1 q1Var;
        a0.u1 k10;
        a0.f2 f2Var = this.f25869a;
        f2Var.getClass();
        u1.f fVar = new u1.f();
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : f2Var.f58b.entrySet()) {
            f2.a aVar = (f2.a) entry.getValue();
            if (aVar.f62d && aVar.f61c) {
                fVar.a(aVar.f59a);
                arrayList.add((String) entry.getKey());
            }
        }
        y.u0.a("UseCaseAttachState", "Active and attached use case: " + arrayList + " for camera: " + f2Var.f57a);
        if (fVar.f199j && fVar.f198i) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            a0.u1 b10 = fVar.b();
            r rVar = this.f25876h;
            int i10 = b10.f187f.f84c;
            rVar.f26157v = i10;
            rVar.f26143h.f26267d = i10;
            rVar.f26149n.f26018f = i10;
            fVar.a(rVar.k());
            k10 = fVar.b();
            q1Var = this.f25881m;
        } else {
            r rVar2 = this.f25876h;
            rVar2.f26157v = 1;
            rVar2.f26143h.f26267d = 1;
            rVar2.f26149n.f26018f = 1;
            q1Var = this.f25881m;
            k10 = rVar2.k();
        }
        q1Var.b(k10);
    }

    public final void I() {
        boolean z10 = false;
        for (a0.h2<?> h2Var : this.f25869a.c()) {
            z10 |= h2Var.w();
        }
        this.f25876h.f26147l.e(z10);
    }

    @Override // a0.b0
    public final a0.g1 a() {
        return this.f25874f;
    }

    @Override // a0.b0, y.g
    public final y.n b() {
        return this.f25878j;
    }

    @Override // androidx.camera.core.t.b
    public final void c(androidx.camera.core.t tVar) {
        tVar.getClass();
        this.f25871c.execute(new w(this, t(tVar), tVar.f1811l, tVar.f1805f, 0));
    }

    @Override // androidx.camera.core.t.b
    public final void d(androidx.camera.core.t tVar) {
        tVar.getClass();
        this.f25871c.execute(new w(this, t(tVar), tVar.f1811l, tVar.f1805f, 1));
    }

    @Override // a0.b0
    public final void e(a0.t tVar) {
        if (tVar == null) {
            tVar = a0.w.f203a;
        }
        w.a aVar = (w.a) tVar;
        a0.v1 v1Var = (a0.v1) ((a0.n1) aVar.b()).e(a0.t.f179c, null);
        this.f25890v = aVar;
        synchronized (this.f25891w) {
            this.f25892x = v1Var;
        }
    }

    @Override // androidx.camera.core.t.b
    public final void f(androidx.camera.core.t tVar) {
        tVar.getClass();
        final String t10 = t(tVar);
        final a0.u1 u1Var = tVar.f1811l;
        final a0.h2<?> h2Var = tVar.f1805f;
        this.f25871c.execute(new Runnable() { // from class: s.x
            @Override // java.lang.Runnable
            public final void run() {
                a0 a0Var = a0.this;
                String str = t10;
                a0.u1 u1Var2 = u1Var;
                a0.h2<?> h2Var2 = h2Var;
                a0Var.getClass();
                a0Var.q("Use case " + str + " UPDATED", null);
                a0Var.f25869a.e(str, u1Var2, h2Var2);
                a0Var.H();
            }
        });
    }

    @Override // a0.b0
    public final r g() {
        return this.f25876h;
    }

    @Override // a0.b0
    public final a0.t h() {
        return this.f25890v;
    }

    @Override // a0.b0
    public final void i(boolean z10) {
        this.f25871c.execute(new v(this, z10));
    }

    @Override // a0.b0
    public final void j(Collection<androidx.camera.core.t> collection) {
        ArrayList arrayList = new ArrayList(collection);
        if (arrayList.isEmpty()) {
            return;
        }
        ArrayList arrayList2 = new ArrayList(D(arrayList));
        Iterator it = new ArrayList(arrayList).iterator();
        while (it.hasNext()) {
            androidx.camera.core.t tVar = (androidx.camera.core.t) it.next();
            String t10 = t(tVar);
            if (this.f25889u.contains(t10)) {
                tVar.s();
                this.f25889u.remove(t10);
            }
        }
        this.f25871c.execute(new q(this, arrayList2, 1));
    }

    @Override // a0.b0
    public final void k(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList(arrayList);
        if (arrayList2.isEmpty()) {
            return;
        }
        r rVar = this.f25876h;
        synchronized (rVar.f26139d) {
            rVar.f26150o++;
        }
        Iterator it = new ArrayList(arrayList2).iterator();
        while (it.hasNext()) {
            androidx.camera.core.t tVar = (androidx.camera.core.t) it.next();
            String t10 = t(tVar);
            if (!this.f25889u.contains(t10)) {
                this.f25889u.add(t10);
                tVar.o();
            }
        }
        try {
            this.f25871c.execute(new s(this, new ArrayList(D(arrayList2)), 1));
        } catch (RejectedExecutionException e10) {
            q("Unable to attach use cases.", e10);
            this.f25876h.g();
        }
    }

    @Override // a0.b0
    public final e0 l() {
        return this.f25878j;
    }

    @Override // androidx.camera.core.t.b
    public final void m(androidx.camera.core.t tVar) {
        tVar.getClass();
        this.f25871c.execute(new u(this, t(tVar), 0));
    }

    public final void n() {
        a0.u1 b10 = this.f25869a.a().b();
        a0.h0 h0Var = b10.f187f;
        int size = h0Var.a().size();
        int size2 = b10.b().size();
        if (!b10.b().isEmpty()) {
            if (h0Var.a().isEmpty()) {
                if (this.f25886r == null) {
                    this.f25886r = new c2(this.f25878j.f25940b, this.f25894z);
                }
                if (this.f25886r != null) {
                    a0.f2 f2Var = this.f25869a;
                    StringBuilder sb2 = new StringBuilder();
                    this.f25886r.getClass();
                    sb2.append("MeteringRepeating");
                    sb2.append(this.f25886r.hashCode());
                    String sb3 = sb2.toString();
                    c2 c2Var = this.f25886r;
                    a0.u1 u1Var = c2Var.f25923b;
                    c2.b bVar = c2Var.f25924c;
                    f2.a aVar = (f2.a) f2Var.f58b.get(sb3);
                    if (aVar == null) {
                        aVar = new f2.a(u1Var, bVar);
                        f2Var.f58b.put(sb3, aVar);
                    }
                    aVar.f61c = true;
                    a0.f2 f2Var2 = this.f25869a;
                    StringBuilder sb4 = new StringBuilder();
                    this.f25886r.getClass();
                    sb4.append("MeteringRepeating");
                    sb4.append(this.f25886r.hashCode());
                    String sb5 = sb4.toString();
                    c2 c2Var2 = this.f25886r;
                    a0.u1 u1Var2 = c2Var2.f25923b;
                    c2.b bVar2 = c2Var2.f25924c;
                    f2.a aVar2 = (f2.a) f2Var2.f58b.get(sb5);
                    if (aVar2 == null) {
                        aVar2 = new f2.a(u1Var2, bVar2);
                        f2Var2.f58b.put(sb5, aVar2);
                    }
                    aVar2.f62d = true;
                }
            } else if ((size2 == 1 && size == 1) || size >= 2) {
                z();
            } else {
                y.u0.a("Camera2CameraImpl", "mMeteringRepeating is ATTACHED, SessionConfig Surfaces: " + size2 + ", CaptureConfig Surfaces: " + size);
            }
        }
    }

    public final void o() {
        boolean z10;
        boolean z11;
        if (this.f25873e != 5 && this.f25873e != 7 && (this.f25873e != 6 || this.f25880l == 0)) {
            z10 = false;
        } else {
            z10 = true;
        }
        StringBuilder a10 = android.support.v4.media.d.a("closeCamera should only be called in a CLOSING, RELEASING or REOPENING (with error) state. Current state: ");
        a10.append(b0.b(this.f25873e));
        a10.append(" (error: ");
        a10.append(s(this.f25880l));
        a10.append(")");
        h1.k(a10.toString(), z10);
        int i10 = Build.VERSION.SDK_INT;
        if (i10 > 23 && i10 < 29) {
            if (this.f25878j.i() == 2) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z11 && this.f25880l == 0) {
                n1 n1Var = new n1();
                this.f25885q.add(n1Var);
                A();
                SurfaceTexture surfaceTexture = new SurfaceTexture(0);
                surfaceTexture.setDefaultBufferSize(640, 480);
                Surface surface = new Surface(surfaceTexture);
                u uVar = new u(surface, surfaceTexture, 1);
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                HashSet hashSet = new HashSet();
                a0.j1 B = a0.j1.B();
                ArrayList arrayList = new ArrayList();
                a0.k1 c10 = a0.k1.c();
                ArrayList arrayList2 = new ArrayList();
                ArrayList arrayList3 = new ArrayList();
                ArrayList arrayList4 = new ArrayList();
                ArrayList arrayList5 = new ArrayList();
                a0.d1 d1Var = new a0.d1(surface);
                linkedHashSet.add(u1.e.a(d1Var).a());
                q("Start configAndClose.", null);
                ArrayList arrayList6 = new ArrayList(linkedHashSet);
                ArrayList arrayList7 = new ArrayList(hashSet);
                a0.n1 A = a0.n1.A(B);
                a0.d2 d2Var = a0.d2.f45b;
                ArrayMap arrayMap = new ArrayMap();
                for (String str : c10.b()) {
                    arrayMap.put(str, c10.a(str));
                }
                a0.u1 u1Var = new a0.u1(arrayList6, arrayList2, arrayList3, arrayList5, arrayList4, new a0.h0(arrayList7, A, 1, arrayList, false, new a0.d2(arrayMap), null), null);
                CameraDevice cameraDevice = this.f25879k;
                cameraDevice.getClass();
                n1Var.c(u1Var, cameraDevice, this.f25888t.a()).a(new y(this, n1Var, d1Var, uVar, 0), this.f25871c);
                this.f25881m.a();
            }
        }
        A();
        this.f25881m.a();
    }

    public final CameraDevice.StateCallback p() {
        ArrayList arrayList = new ArrayList(this.f25869a.a().b().f183b);
        arrayList.add(this.f25887s.f26171f);
        arrayList.add(this.f25877i);
        if (arrayList.isEmpty()) {
            return new e1();
        }
        if (arrayList.size() == 1) {
            return (CameraDevice.StateCallback) arrayList.get(0);
        }
        return new d1(arrayList);
    }

    public final void q(String str, Throwable th2) {
        String format = String.format("{%s} %s", toString(), str);
        String g10 = y.u0.g("Camera2CameraImpl");
        if (y.u0.f(3, g10)) {
            Log.d(g10, format, th2);
        }
    }

    public final void r() {
        boolean z10;
        if (this.f25873e != 7 && this.f25873e != 5) {
            z10 = false;
        } else {
            z10 = true;
        }
        h1.k(null, z10);
        h1.k(null, this.f25882n.isEmpty());
        this.f25879k = null;
        if (this.f25873e == 5) {
            B(1);
            return;
        }
        t.d0 d0Var = this.f25870b;
        d0Var.f27404a.d(this.f25883o);
        B(8);
    }

    public final String toString() {
        return String.format(Locale.US, "Camera@%x[id=%s]", Integer.valueOf(hashCode()), this.f25878j.f25939a);
    }

    public final boolean u() {
        return this.f25882n.isEmpty() && this.f25885q.isEmpty();
    }

    public final q1 v() {
        synchronized (this.f25891w) {
            if (this.f25892x == null) {
                return new n1();
            }
            return new g2(this.f25892x, this.f25878j, this.f25871c, this.f25872d);
        }
    }

    @SuppressLint({"MissingPermission"})
    public final void w(boolean z10) {
        if (!z10) {
            this.f25877i.f25904e.f25906a = -1L;
        }
        this.f25877i.a();
        q("Opening camera.", null);
        B(3);
        try {
            t.d0 d0Var = this.f25870b;
            d0Var.f27404a.c(this.f25878j.f25939a, this.f25871c, p());
        } catch (SecurityException e10) {
            StringBuilder a10 = android.support.v4.media.d.a("Unable to open camera due to ");
            a10.append(e10.getMessage());
            q(a10.toString(), null);
            B(6);
            this.f25877i.b();
        } catch (t.f e11) {
            StringBuilder a11 = android.support.v4.media.d.a("Unable to open camera due to ");
            a11.append(e11.getMessage());
            q(a11.toString(), null);
            if (e11.f27411a == 10001) {
                C(1, new y.e(7, e11), true);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:120:0x009c, code lost:
        r1 = 4;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void x() {
        /*
            Method dump skipped, instructions count: 219
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: s.a0.x():void");
    }

    public final na.a y(q1 q1Var) {
        q1Var.close();
        na.a release = q1Var.release();
        StringBuilder a10 = android.support.v4.media.d.a("Releasing session in state ");
        a10.append(b0.a(this.f25873e));
        q(a10.toString(), null);
        this.f25882n.put(q1Var, release);
        d0.f.a(release, new z(this, q1Var), o8.b.i());
        return release;
    }

    public final void z() {
        if (this.f25886r != null) {
            a0.f2 f2Var = this.f25869a;
            StringBuilder sb2 = new StringBuilder();
            this.f25886r.getClass();
            sb2.append("MeteringRepeating");
            sb2.append(this.f25886r.hashCode());
            String sb3 = sb2.toString();
            if (f2Var.f58b.containsKey(sb3)) {
                f2.a aVar = (f2.a) f2Var.f58b.get(sb3);
                aVar.f61c = false;
                if (!aVar.f62d) {
                    f2Var.f58b.remove(sb3);
                }
            }
            a0.f2 f2Var2 = this.f25869a;
            StringBuilder sb4 = new StringBuilder();
            this.f25886r.getClass();
            sb4.append("MeteringRepeating");
            sb4.append(this.f25886r.hashCode());
            f2Var2.d(sb4.toString());
            c2 c2Var = this.f25886r;
            c2Var.getClass();
            y.u0.a("MeteringRepeating", "MeteringRepeating clear!");
            a0.d1 d1Var = c2Var.f25922a;
            if (d1Var != null) {
                d1Var.a();
            }
            c2Var.f25922a = null;
            this.f25886r = null;
        }
    }
}
