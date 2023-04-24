package s;

import a0.h0;
import a0.l0;
import a0.u1;
import a0.x;
import android.graphics.Rect;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import android.hardware.camera2.params.MeteringRectangle;
import android.os.Build;
import android.os.Looper;
import android.util.ArrayMap;
import androidx.activity.h;
import d0.i;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicLong;
import p0.c;
import r.a;
import s.a0;
import s.k0;
import s.r;
import x.e;

/* loaded from: classes.dex */
public final class r implements a0.x {

    /* renamed from: b */
    public final b f26137b;

    /* renamed from: c */
    public final Executor f26138c;

    /* renamed from: d */
    public final Object f26139d = new Object();

    /* renamed from: e */
    public final t.t f26140e;

    /* renamed from: f */
    public final x.c f26141f;

    /* renamed from: g */
    public final u1.b f26142g;

    /* renamed from: h */
    public final z1 f26143h;

    /* renamed from: i */
    public final t2 f26144i;

    /* renamed from: j */
    public final s2 f26145j;

    /* renamed from: k */
    public final u1 f26146k;

    /* renamed from: l */
    public v2 f26147l;

    /* renamed from: m */
    public final x.c f26148m;

    /* renamed from: n */
    public final k0 f26149n;

    /* renamed from: o */
    public int f26150o;

    /* renamed from: p */
    public volatile boolean f26151p;

    /* renamed from: q */
    public volatile int f26152q;

    /* renamed from: r */
    public final w.a f26153r;

    /* renamed from: s */
    public final w.b f26154s;

    /* renamed from: t */
    public final AtomicLong f26155t;

    /* renamed from: u */
    public volatile na.a<Void> f26156u;

    /* renamed from: v */
    public int f26157v;

    /* renamed from: w */
    public long f26158w;

    /* renamed from: x */
    public final a f26159x;

    /* loaded from: classes.dex */
    public static final class a extends a0.j {

        /* renamed from: a */
        public HashSet f26160a = new HashSet();

        /* renamed from: b */
        public ArrayMap f26161b = new ArrayMap();

        @Override // a0.j
        public final void a() {
            Iterator it = this.f26160a.iterator();
            while (it.hasNext()) {
                a0.j jVar = (a0.j) it.next();
                try {
                    ((Executor) this.f26161b.get(jVar)).execute(new androidx.appcompat.widget.r2(1, jVar));
                } catch (RejectedExecutionException e10) {
                    y.u0.c("Camera2CameraControlImp", "Executor rejected to invoke onCaptureCancelled.", e10);
                }
            }
        }

        @Override // a0.j
        public final void b(a0.s sVar) {
            Iterator it = this.f26160a.iterator();
            while (it.hasNext()) {
                a0.j jVar = (a0.j) it.next();
                try {
                    ((Executor) this.f26161b.get(jVar)).execute(new q(jVar, sVar, 0));
                } catch (RejectedExecutionException e10) {
                    y.u0.c("Camera2CameraControlImp", "Executor rejected to invoke onCaptureCompleted.", e10);
                }
            }
        }

        @Override // a0.j
        public final void c(a0.m mVar) {
            Iterator it = this.f26160a.iterator();
            while (it.hasNext()) {
                a0.j jVar = (a0.j) it.next();
                try {
                    ((Executor) this.f26161b.get(jVar)).execute(new p(jVar, mVar, 0));
                } catch (RejectedExecutionException e10) {
                    y.u0.c("Camera2CameraControlImp", "Executor rejected to invoke onCaptureFailed.", e10);
                }
            }
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends CameraCaptureSession.CaptureCallback {

        /* renamed from: a */
        public final HashSet f26162a = new HashSet();

        /* renamed from: b */
        public final Executor f26163b;

        public b(c0.g gVar) {
            this.f26163b = gVar;
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public final void onCaptureCompleted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, TotalCaptureResult totalCaptureResult) {
            this.f26163b.execute(new s(this, totalCaptureResult, 0));
        }
    }

    /* loaded from: classes.dex */
    public interface c {
        boolean a(TotalCaptureResult totalCaptureResult);
    }

    public r(t.t tVar, c0.g gVar, a0.c cVar, a0.r1 r1Var) {
        v2 z2Var;
        u1.b bVar = new u1.b();
        this.f26142g = bVar;
        this.f26150o = 0;
        this.f26151p = false;
        this.f26152q = 2;
        this.f26155t = new AtomicLong(0L);
        this.f26156u = d0.f.e(null);
        this.f26157v = 1;
        this.f26158w = 0L;
        a aVar = new a();
        this.f26159x = aVar;
        this.f26140e = tVar;
        this.f26141f = cVar;
        this.f26138c = gVar;
        b bVar2 = new b(gVar);
        this.f26137b = bVar2;
        bVar.f190b.f91c = this.f26157v;
        bVar.f190b.b(new j1(bVar2));
        bVar.f190b.b(aVar);
        this.f26146k = new u1(this, gVar);
        this.f26143h = new z1(this, gVar);
        this.f26144i = new t2(this, tVar, gVar);
        this.f26145j = new s2(this, tVar, gVar);
        if (Build.VERSION.SDK_INT >= 23) {
            z2Var = new y2(tVar);
        } else {
            z2Var = new z2();
        }
        this.f26147l = z2Var;
        this.f26153r = new w.a(r1Var);
        this.f26154s = new w.b(r1Var);
        this.f26148m = new x.c(this, gVar);
        this.f26149n = new k0(this, tVar, r1Var, gVar);
        gVar.execute(new m(0, this));
    }

    public static boolean n(int i10, int[] iArr) {
        for (int i11 : iArr) {
            if (i10 == i11) {
                return true;
            }
        }
        return false;
    }

    public static boolean o(TotalCaptureResult totalCaptureResult, long j10) {
        Long l10;
        if (totalCaptureResult.getRequest() == null) {
            return false;
        }
        Object tag = totalCaptureResult.getRequest().getTag();
        return (tag instanceof a0.d2) && (l10 = (Long) ((a0.d2) tag).a("CameraControlSessionUpdateId")) != null && l10.longValue() >= j10;
    }

    @Override // a0.x
    public final void a(u1.b bVar) {
        this.f26147l.a(bVar);
    }

    @Override // a0.x
    public final void b(int i10) {
        int i11;
        boolean z10;
        synchronized (this.f26139d) {
            i11 = this.f26150o;
        }
        boolean z11 = true;
        if (i11 > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            y.u0.h("Camera2CameraControlImp", "Camera is not active.");
            return;
        }
        this.f26152q = i10;
        v2 v2Var = this.f26147l;
        if (this.f26152q != 1 && this.f26152q != 0) {
            z11 = false;
        }
        v2Var.d(z11);
        this.f26156u = d0.f.f(p0.c.a(new i(0, this)));
    }

    @Override // a0.x
    public final na.a c(final int i10, final int i11, final List list) {
        int i12;
        boolean z10;
        synchronized (this.f26139d) {
            i12 = this.f26150o;
        }
        if (i12 > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            y.u0.h("Camera2CameraControlImp", "Camera is not active.");
            return new i.a(new y.i("Camera is not active."));
        }
        final int i13 = this.f26152q;
        return d0.d.b(d0.f.f(this.f26156u)).d(new d0.a() { // from class: s.l
            @Override // d0.a
            public final na.a apply(Object obj) {
                boolean z11;
                k0.d aVar;
                na.a e10;
                r rVar = r.this;
                final List list2 = list;
                int i14 = i10;
                final int i15 = i13;
                int i16 = i11;
                Void r13 = (Void) obj;
                k0 k0Var = rVar.f26149n;
                w.k kVar = new w.k(k0Var.f26015c);
                final k0.c cVar = new k0.c(k0Var.f26018f, k0Var.f26016d, k0Var.f26013a, k0Var.f26017e, kVar);
                if (i14 == 0) {
                    cVar.f26033g.add(new k0.b(k0Var.f26013a));
                }
                if (!k0Var.f26014b.f29506a && k0Var.f26018f != 3 && i16 != 1) {
                    z11 = false;
                } else {
                    z11 = true;
                }
                if (z11) {
                    aVar = new k0.f(k0Var.f26013a, i15, k0Var.f26016d);
                } else {
                    aVar = new k0.a(k0Var.f26013a, i15, kVar);
                }
                cVar.f26033g.add(aVar);
                na.a e11 = d0.f.e(null);
                if (!cVar.f26033g.isEmpty()) {
                    if (cVar.f26034h.b()) {
                        r rVar2 = cVar.f26029c;
                        k0.e eVar = new k0.e(0L, null);
                        rVar2.d(eVar);
                        e10 = eVar.f26037b;
                    } else {
                        e10 = d0.f.e(null);
                    }
                    e11 = d0.d.b(e10).d(new d0.a() { // from class: s.m0
                        @Override // d0.a
                        public final na.a apply(Object obj2) {
                            k0.c cVar2 = k0.c.this;
                            int i17 = i15;
                            TotalCaptureResult totalCaptureResult = (TotalCaptureResult) obj2;
                            cVar2.getClass();
                            if (k0.b(i17, totalCaptureResult)) {
                                cVar2.f26032f = k0.c.f26026j;
                            }
                            return cVar2.f26034h.a(totalCaptureResult);
                        }
                    }, cVar.f26028b).d(new d0.a() { // from class: s.n0
                        @Override // d0.a
                        public final na.a apply(Object obj2) {
                            k0.c cVar2 = k0.c.this;
                            cVar2.getClass();
                            if (Boolean.TRUE.equals((Boolean) obj2)) {
                                long j10 = cVar2.f26032f;
                                r rVar3 = cVar2.f26029c;
                                ih.c0 c0Var = new ih.c0();
                                Set<a0.o> set = k0.f26009g;
                                k0.e eVar2 = new k0.e(j10, c0Var);
                                rVar3.d(eVar2);
                                return eVar2.f26037b;
                            }
                            return d0.f.e(null);
                        }
                    }, cVar.f26028b);
                }
                d0.d d10 = d0.d.b(e11).d(new d0.a() { // from class: s.o0
                    @Override // d0.a
                    public final na.a apply(Object obj2) {
                        int i17;
                        boolean z12;
                        k0.c cVar2 = k0.c.this;
                        List<a0.h0> list3 = list2;
                        int i18 = i15;
                        TotalCaptureResult totalCaptureResult = (TotalCaptureResult) obj2;
                        cVar2.getClass();
                        ArrayList arrayList = new ArrayList();
                        ArrayList arrayList2 = new ArrayList();
                        for (a0.h0 h0Var : list3) {
                            h0.a aVar2 = new h0.a(h0Var);
                            boolean z13 = true;
                            a0.s sVar = null;
                            if (h0Var.f84c == 5 && !cVar2.f26029c.f26147l.c() && !cVar2.f26029c.f26147l.b()) {
                                androidx.camera.core.j f10 = cVar2.f26029c.f26147l.f();
                                if (f10 != null && cVar2.f26029c.f26147l.g(f10)) {
                                    z12 = true;
                                } else {
                                    z12 = false;
                                }
                                if (z12) {
                                    y.o0 d02 = f10.d0();
                                    if (d02 instanceof e0.c) {
                                        sVar = ((e0.c) d02).f13287a;
                                    }
                                }
                            }
                            if (sVar != null) {
                                aVar2.f95g = sVar;
                            } else {
                                if (cVar2.f26027a == 3 && !cVar2.f26031e) {
                                    i17 = 4;
                                } else {
                                    int i19 = h0Var.f84c;
                                    if (i19 != -1 && i19 != 5) {
                                        i17 = -1;
                                    } else {
                                        i17 = 2;
                                    }
                                }
                                if (i17 != -1) {
                                    aVar2.f91c = i17;
                                }
                            }
                            w.k kVar2 = cVar2.f26030d;
                            if ((kVar2.f29499b && i18 == 0 && kVar2.f29498a) ? false : false) {
                                a0.j1 B = a0.j1.B();
                                B.E(r.a.A(CaptureRequest.CONTROL_AE_MODE), 3);
                                aVar2.c(new r.a(a0.n1.A(B)));
                            }
                            arrayList.add(p0.c.a(new l0(cVar2, aVar2, 0)));
                            arrayList2.add(aVar2.d());
                        }
                        cVar2.f26029c.q(arrayList2);
                        return d0.f.b(arrayList);
                    }
                }, cVar.f26028b);
                k0.c.a aVar2 = cVar.f26034h;
                Objects.requireNonNull(aVar2);
                d10.a(new androidx.appcompat.widget.s2(1, aVar2), cVar.f26028b);
                return d0.f.f(d10);
            }
        }, this.f26138c);
    }

    public final void d(c cVar) {
        this.f26137b.f26162a.add(cVar);
    }

    public final void e(a0.l0 l0Var) {
        x.c cVar = this.f26148m;
        x.e a10 = e.a.d(l0Var).a();
        synchronized (cVar.f30075e) {
            try {
                for (l0.a<?> aVar : a10.b().d()) {
                    cVar.f30076f.f25144a.E(aVar, a10.b().c(aVar));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        d0.f.f(p0.c.a(new r0(2, cVar))).a(new n(0), o8.b.i());
    }

    public final void f() {
        x.c cVar = this.f26148m;
        synchronized (cVar.f30075e) {
            cVar.f30076f = new a.C0454a();
        }
        d0.f.f(p0.c.a(new q0(3, cVar))).a(new j(0), o8.b.i());
    }

    public final void g() {
        synchronized (this.f26139d) {
            int i10 = this.f26150o;
            if (i10 == 0) {
                throw new IllegalStateException("Decrementing use count occurs more times than incrementing");
            }
            this.f26150o = i10 - 1;
        }
    }

    public final void h(boolean z10) {
        this.f26151p = z10;
        if (!z10) {
            h0.a aVar = new h0.a();
            aVar.f91c = this.f26157v;
            aVar.f93e = true;
            a0.j1 B = a0.j1.B();
            CaptureRequest.Key key = CaptureRequest.CONTROL_AE_MODE;
            B.E(r.a.A(key), Integer.valueOf(l(1)));
            B.E(r.a.A(CaptureRequest.FLASH_MODE), 0);
            aVar.c(new r.a(a0.n1.A(B)));
            q(Collections.singletonList(aVar.d()));
        }
        r();
    }

    public final a0.l0 i() {
        return this.f26148m.a();
    }

    public final Rect j() {
        Rect rect = (Rect) this.f26140e.a(CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE);
        rect.getClass();
        return rect;
    }

    /* JADX WARN: Code restructure failed: missing block: B:85:0x0076, code lost:
        if (r2 != 1) goto L19;
     */
    /* JADX WARN: Removed duplicated region for block: B:121:0x00c4 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final a0.u1 k() {
        /*
            Method dump skipped, instructions count: 337
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: s.r.k():a0.u1");
    }

    public final int l(int i10) {
        int[] iArr = (int[]) this.f26140e.a(CameraCharacteristics.CONTROL_AE_AVAILABLE_MODES);
        if (iArr == null) {
            return 0;
        }
        return n(i10, iArr) ? i10 : n(1, iArr) ? 1 : 0;
    }

    public final int m(int i10) {
        int[] iArr = (int[]) this.f26140e.a(CameraCharacteristics.CONTROL_AF_AVAILABLE_MODES);
        if (iArr == null) {
            return 0;
        }
        if (n(i10, iArr)) {
            return i10;
        }
        if (n(4, iArr)) {
            return 4;
        }
        return n(1, iArr) ? 1 : 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v2, types: [s.w1, s.r$c] */
    public final void p(final boolean z10) {
        e0.a aVar;
        boolean z11;
        final z1 z1Var = this.f26143h;
        if (z10 != z1Var.f26266c) {
            z1Var.f26266c = z10;
            if (!z1Var.f26266c) {
                r rVar = z1Var.f26264a;
                rVar.f26137b.f26162a.remove(z1Var.f26268e);
                c.a<Void> aVar2 = z1Var.f26272i;
                if (aVar2 != null) {
                    aVar2.b(new y.i("Cancelled by another cancelFocusAndMetering()"));
                    z1Var.f26272i = null;
                }
                z1Var.f26264a.f26137b.f26162a.remove(null);
                z1Var.f26272i = null;
                if (z1Var.f26269f.length > 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (z11) {
                    z1Var.a(true, false);
                }
                MeteringRectangle[] meteringRectangleArr = z1.f26263j;
                z1Var.f26269f = meteringRectangleArr;
                z1Var.f26270g = meteringRectangleArr;
                z1Var.f26271h = meteringRectangleArr;
                final long r10 = z1Var.f26264a.r();
                if (z1Var.f26272i != null) {
                    r rVar2 = z1Var.f26264a;
                    int i10 = 3;
                    if (z1Var.f26267d != 3) {
                        i10 = 4;
                    }
                    final int m10 = rVar2.m(i10);
                    ?? r62 = new c() { // from class: s.w1
                        @Override // s.r.c
                        public final boolean a(TotalCaptureResult totalCaptureResult) {
                            z1 z1Var2 = z1.this;
                            int i11 = m10;
                            long j10 = r10;
                            z1Var2.getClass();
                            if (((Integer) totalCaptureResult.get(CaptureResult.CONTROL_AF_MODE)).intValue() == i11 && r.o(totalCaptureResult, j10)) {
                                c.a<Void> aVar3 = z1Var2.f26272i;
                                if (aVar3 != null) {
                                    aVar3.a(null);
                                    z1Var2.f26272i = null;
                                }
                                return true;
                            }
                            return false;
                        }
                    };
                    z1Var.f26268e = r62;
                    z1Var.f26264a.d(r62);
                }
            }
        }
        t2 t2Var = this.f26144i;
        if (t2Var.f26205f != z10) {
            t2Var.f26205f = z10;
            if (!z10) {
                synchronized (t2Var.f26202c) {
                    t2Var.f26202c.a();
                    u2 u2Var = t2Var.f26202c;
                    aVar = new e0.a(u2Var.f26214a, u2Var.f26215b, u2Var.f26216c, u2Var.f26217d);
                }
                if (Looper.myLooper() == Looper.getMainLooper()) {
                    t2Var.f26203d.j(aVar);
                } else {
                    t2Var.f26203d.k(aVar);
                }
                t2Var.f26204e.e();
                t2Var.f26200a.r();
            }
        }
        s2 s2Var = this.f26145j;
        if (s2Var.f26184e != z10) {
            s2Var.f26184e = z10;
            if (!z10) {
                if (s2Var.f26186g) {
                    s2Var.f26186g = false;
                    s2Var.f26180a.h(false);
                    androidx.lifecycle.a0<Integer> a0Var = s2Var.f26181b;
                    if (p.b.s()) {
                        a0Var.j(0);
                    } else {
                        a0Var.k(0);
                    }
                }
                c.a<Void> aVar3 = s2Var.f26185f;
                if (aVar3 != null) {
                    aVar3.b(new y.i("Camera is not active."));
                    s2Var.f26185f = null;
                }
            }
        }
        u1 u1Var = this.f26146k;
        if (z10 != u1Var.f26213c) {
            u1Var.f26213c = z10;
            if (!z10) {
                v1 v1Var = u1Var.f26211a;
                synchronized (v1Var.f26221a) {
                    v1Var.f26222b = 0;
                }
            }
        }
        final x.c cVar = this.f26148m;
        cVar.f30074d.execute(new Runnable() { // from class: x.a
            @Override // java.lang.Runnable
            public final void run() {
                c cVar2 = c.this;
                boolean z12 = z10;
                if (cVar2.f30071a != z12) {
                    cVar2.f30071a = z12;
                    if (z12) {
                        if (cVar2.f30072b) {
                            r rVar3 = cVar2.f30073c;
                            rVar3.f26138c.execute(new h(1, rVar3));
                            cVar2.f30072b = false;
                            return;
                        }
                        return;
                    }
                    c.a<Void> aVar4 = cVar2.f30077g;
                    if (aVar4 != null) {
                        aVar4.b(new y.i("The camera control has became inactive."));
                        cVar2.f30077g = null;
                    }
                }
            }
        });
    }

    /* JADX WARN: Removed duplicated region for block: B:133:0x011d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0017 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void q(java.util.List<a0.h0> r18) {
        /*
            Method dump skipped, instructions count: 357
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: s.r.q(java.util.List):void");
    }

    public final long r() {
        this.f26158w = this.f26155t.getAndIncrement();
        a0.this.H();
        return this.f26158w;
    }
}
