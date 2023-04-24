package s;

import a0.h0;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import d0.i;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import p0.c;
import s.k0;
import s.r;

/* loaded from: classes.dex */
public final class k0 {

    /* renamed from: g */
    public static final Set<a0.o> f26009g = Collections.unmodifiableSet(EnumSet.of(a0.o.PASSIVE_FOCUSED, a0.o.PASSIVE_NOT_FOCUSED, a0.o.LOCKED_FOCUSED, a0.o.LOCKED_NOT_FOCUSED));

    /* renamed from: h */
    public static final Set<a0.p> f26010h = Collections.unmodifiableSet(EnumSet.of(a0.p.CONVERGED, a0.p.UNKNOWN));

    /* renamed from: i */
    public static final Set<a0.n> f26011i;

    /* renamed from: j */
    public static final Set<a0.n> f26012j;

    /* renamed from: a */
    public final r f26013a;

    /* renamed from: b */
    public final w.q f26014b;

    /* renamed from: c */
    public final a0.r1 f26015c;

    /* renamed from: d */
    public final Executor f26016d;

    /* renamed from: e */
    public final boolean f26017e;

    /* renamed from: f */
    public int f26018f = 1;

    /* loaded from: classes.dex */
    public static class a implements d {

        /* renamed from: a */
        public final r f26019a;

        /* renamed from: b */
        public final w.k f26020b;

        /* renamed from: c */
        public final int f26021c;

        /* renamed from: d */
        public boolean f26022d = false;

        public a(r rVar, int i10, w.k kVar) {
            this.f26019a = rVar;
            this.f26021c = i10;
            this.f26020b = kVar;
        }

        @Override // s.k0.d
        public final na.a<Boolean> a(TotalCaptureResult totalCaptureResult) {
            if (k0.b(this.f26021c, totalCaptureResult)) {
                y.u0.a("Camera2CapturePipeline", "Trigger AE");
                this.f26022d = true;
                d0.d b10 = d0.d.b(p0.c.a(new i0(0, this)));
                j0 j0Var = new j0(0);
                c0.a i10 = o8.b.i();
                b10.getClass();
                return d0.f.h(b10, j0Var, i10);
            }
            return d0.f.e(Boolean.FALSE);
        }

        @Override // s.k0.d
        public final boolean b() {
            return this.f26021c == 0;
        }

        @Override // s.k0.d
        public final void c() {
            if (this.f26022d) {
                y.u0.a("Camera2CapturePipeline", "cancel TriggerAePreCapture");
                this.f26019a.f26143h.a(false, true);
                this.f26020b.f29499b = false;
            }
        }
    }

    /* loaded from: classes.dex */
    public static class b implements d {

        /* renamed from: a */
        public final r f26023a;

        /* renamed from: b */
        public boolean f26024b = false;

        public b(r rVar) {
            this.f26023a = rVar;
        }

        @Override // s.k0.d
        public final na.a<Boolean> a(TotalCaptureResult totalCaptureResult) {
            i.c e10 = d0.f.e(Boolean.TRUE);
            if (totalCaptureResult == null) {
                return e10;
            }
            Integer num = (Integer) totalCaptureResult.get(CaptureResult.CONTROL_AF_MODE);
            if (num == null) {
                return e10;
            }
            int intValue = num.intValue();
            if (intValue == 1 || intValue == 2) {
                y.u0.a("Camera2CapturePipeline", "TriggerAf? AF mode auto");
                Integer num2 = (Integer) totalCaptureResult.get(CaptureResult.CONTROL_AF_STATE);
                if (num2 != null && num2.intValue() == 0) {
                    y.u0.a("Camera2CapturePipeline", "Trigger AF");
                    this.f26024b = true;
                    z1 z1Var = this.f26023a.f26143h;
                    if (z1Var.f26266c) {
                        h0.a aVar = new h0.a();
                        aVar.f91c = z1Var.f26267d;
                        aVar.f93e = true;
                        a0.j1 B = a0.j1.B();
                        B.E(r.a.A(CaptureRequest.CONTROL_AF_TRIGGER), 1);
                        aVar.c(new r.a(a0.n1.A(B)));
                        aVar.b(new x1());
                        z1Var.f26264a.q(Collections.singletonList(aVar.d()));
                    }
                }
            }
            return e10;
        }

        @Override // s.k0.d
        public final boolean b() {
            return true;
        }

        @Override // s.k0.d
        public final void c() {
            if (this.f26024b) {
                y.u0.a("Camera2CapturePipeline", "cancel TriggerAF");
                this.f26023a.f26143h.a(true, false);
            }
        }
    }

    /* loaded from: classes.dex */
    public static class c {

        /* renamed from: i */
        public static final long f26025i;

        /* renamed from: j */
        public static final long f26026j;

        /* renamed from: a */
        public final int f26027a;

        /* renamed from: b */
        public final Executor f26028b;

        /* renamed from: c */
        public final r f26029c;

        /* renamed from: d */
        public final w.k f26030d;

        /* renamed from: e */
        public final boolean f26031e;

        /* renamed from: f */
        public long f26032f = f26025i;

        /* renamed from: g */
        public final ArrayList f26033g = new ArrayList();

        /* renamed from: h */
        public final a f26034h = new a();

        /* loaded from: classes.dex */
        public class a implements d {
            public a() {
                c.this = r1;
            }

            @Override // s.k0.d
            public final na.a<Boolean> a(TotalCaptureResult totalCaptureResult) {
                ArrayList arrayList = new ArrayList();
                Iterator it = c.this.f26033g.iterator();
                while (it.hasNext()) {
                    arrayList.add(((d) it.next()).a(totalCaptureResult));
                }
                return d0.f.h(d0.f.b(arrayList), new j0(1), o8.b.i());
            }

            @Override // s.k0.d
            public final boolean b() {
                Iterator it = c.this.f26033g.iterator();
                while (it.hasNext()) {
                    if (((d) it.next()).b()) {
                        return true;
                    }
                }
                return false;
            }

            @Override // s.k0.d
            public final void c() {
                Iterator it = c.this.f26033g.iterator();
                while (it.hasNext()) {
                    ((d) it.next()).c();
                }
            }
        }

        static {
            TimeUnit timeUnit = TimeUnit.SECONDS;
            f26025i = timeUnit.toNanos(1L);
            f26026j = timeUnit.toNanos(5L);
        }

        public c(int i10, Executor executor, r rVar, boolean z10, w.k kVar) {
            this.f26027a = i10;
            this.f26028b = executor;
            this.f26029c = rVar;
            this.f26031e = z10;
            this.f26030d = kVar;
        }
    }

    /* loaded from: classes.dex */
    public interface d {
        na.a<Boolean> a(TotalCaptureResult totalCaptureResult);

        boolean b();

        void c();
    }

    /* loaded from: classes.dex */
    public static class e implements r.c {

        /* renamed from: a */
        public c.a<TotalCaptureResult> f26036a;

        /* renamed from: c */
        public final long f26038c;

        /* renamed from: d */
        public final a f26039d;

        /* renamed from: b */
        public final c.d f26037b = p0.c.a(new q0(0, this));

        /* renamed from: e */
        public volatile Long f26040e = null;

        /* loaded from: classes.dex */
        public interface a {
            boolean a(TotalCaptureResult totalCaptureResult);
        }

        public e(long j10, a aVar) {
            this.f26038c = j10;
            this.f26039d = aVar;
        }

        @Override // s.r.c
        public final boolean a(TotalCaptureResult totalCaptureResult) {
            Long l10 = (Long) totalCaptureResult.get(CaptureResult.SENSOR_TIMESTAMP);
            if (l10 != null && this.f26040e == null) {
                this.f26040e = l10;
            }
            Long l11 = this.f26040e;
            if (0 == this.f26038c || l11 == null || l10 == null || l10.longValue() - l11.longValue() <= this.f26038c) {
                a aVar = this.f26039d;
                if (aVar == null || aVar.a(totalCaptureResult)) {
                    this.f26036a.a(totalCaptureResult);
                    return true;
                }
                return false;
            }
            this.f26036a.a(null);
            y.u0.a("Camera2CapturePipeline", "Wait for capture result timeout, current:" + l10 + " first: " + l11);
            return true;
        }
    }

    /* loaded from: classes.dex */
    public static class f implements d {

        /* renamed from: e */
        public static final long f26041e = TimeUnit.SECONDS.toNanos(2);

        /* renamed from: a */
        public final r f26042a;

        /* renamed from: b */
        public final int f26043b;

        /* renamed from: c */
        public boolean f26044c = false;

        /* renamed from: d */
        public final Executor f26045d;

        public f(r rVar, int i10, Executor executor) {
            this.f26042a = rVar;
            this.f26043b = i10;
            this.f26045d = executor;
        }

        @Override // s.k0.d
        public final na.a<Boolean> a(TotalCaptureResult totalCaptureResult) {
            if (k0.b(this.f26043b, totalCaptureResult)) {
                if (this.f26042a.f26151p) {
                    y.u0.a("Camera2CapturePipeline", "Torch already on, not turn on");
                } else {
                    y.u0.a("Camera2CapturePipeline", "Turn on torch");
                    this.f26044c = true;
                    return d0.f.h(d0.d.b(p0.c.a(new r0(0, this))).d(new d0.a() { // from class: s.s0
                        @Override // d0.a
                        public final na.a apply(Object obj) {
                            k0.f fVar = k0.f.this;
                            Void r52 = (Void) obj;
                            long j10 = k0.f.f26041e;
                            r rVar = fVar.f26042a;
                            t0 t0Var = new t0(0);
                            Set<a0.o> set = k0.f26009g;
                            k0.e eVar = new k0.e(j10, t0Var);
                            rVar.d(eVar);
                            return eVar.f26037b;
                        }
                    }, this.f26045d), new a0.k0(), o8.b.i());
                }
            }
            return d0.f.e(Boolean.FALSE);
        }

        @Override // s.k0.d
        public final boolean b() {
            return this.f26043b == 0;
        }

        @Override // s.k0.d
        public final void c() {
            if (this.f26044c) {
                this.f26042a.f26145j.a(null, false);
                y.u0.a("Camera2CapturePipeline", "Turn off torch");
            }
        }
    }

    static {
        a0.n nVar = a0.n.CONVERGED;
        a0.n nVar2 = a0.n.FLASH_REQUIRED;
        a0.n nVar3 = a0.n.UNKNOWN;
        Set<a0.n> unmodifiableSet = Collections.unmodifiableSet(EnumSet.of(nVar, nVar2, nVar3));
        f26011i = unmodifiableSet;
        EnumSet copyOf = EnumSet.copyOf((Collection) unmodifiableSet);
        copyOf.remove(nVar2);
        copyOf.remove(nVar3);
        f26012j = Collections.unmodifiableSet(copyOf);
    }

    public k0(r rVar, t.t tVar, a0.r1 r1Var, c0.g gVar) {
        boolean z10 = true;
        this.f26013a = rVar;
        Integer num = (Integer) tVar.a(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL);
        this.f26017e = (num == null || num.intValue() != 2) ? false : false;
        this.f26016d = gVar;
        this.f26015c = r1Var;
        this.f26014b = new w.q(r1Var);
    }

    public static boolean a(TotalCaptureResult totalCaptureResult, boolean z10) {
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        if (totalCaptureResult == null) {
            return false;
        }
        s.e eVar = new s.e(a0.d2.f45b, totalCaptureResult);
        if (eVar.c() != 2 && eVar.c() != 1 && !f26009g.contains(eVar.i())) {
            z11 = false;
        } else {
            z11 = true;
        }
        if (((Integer) totalCaptureResult.get(CaptureResult.CONTROL_AE_MODE)).intValue() == 0) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (!z10 ? !(z12 || f26011i.contains(eVar.g())) : !(z12 || f26012j.contains(eVar.g()))) {
            z13 = false;
        } else {
            z13 = true;
        }
        if (((Integer) totalCaptureResult.get(CaptureResult.CONTROL_AWB_MODE)).intValue() == 0) {
            z14 = true;
        } else {
            z14 = false;
        }
        if (!z14 && !f26010h.contains(eVar.e())) {
            z15 = false;
        } else {
            z15 = true;
        }
        StringBuilder a10 = android.support.v4.media.d.a("checkCaptureResult, AE=");
        a10.append(eVar.g());
        a10.append(" AF =");
        a10.append(eVar.i());
        a10.append(" AWB=");
        a10.append(eVar.e());
        y.u0.a("Camera2CapturePipeline", a10.toString());
        if (!z11 || !z13 || !z15) {
            return false;
        }
        return true;
    }

    public static boolean b(int i10, TotalCaptureResult totalCaptureResult) {
        if (i10 == 0) {
            Integer num = totalCaptureResult != null ? (Integer) totalCaptureResult.get(CaptureResult.CONTROL_AE_STATE) : null;
            return num != null && num.intValue() == 4;
        } else if (i10 != 1) {
            if (i10 == 2) {
                return false;
            }
            throw new AssertionError(i10);
        } else {
            return true;
        }
    }
}
