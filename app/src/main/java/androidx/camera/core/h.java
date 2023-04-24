package androidx.camera.core;

import a0.a1;
import a0.b0;
import a0.d1;
import a0.g0;
import a0.h0;
import a0.h2;
import a0.i0;
import a0.i1;
import a0.i2;
import a0.j0;
import a0.j1;
import a0.k0;
import a0.l0;
import a0.n1;
import a0.s1;
import a0.u1;
import a0.v1;
import a0.w;
import a0.w0;
import a0.y0;
import android.content.ContentResolver;
import android.content.ContentValues;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Looper;
import android.util.Pair;
import android.util.Rational;
import android.util.Size;
import androidx.appcompat.widget.r2;
import androidx.camera.core.a;
import androidx.camera.core.d;
import androidx.camera.core.h;
import androidx.camera.core.k;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.UUID;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import no.nordicsemi.android.dfu.DfuBaseService;
import p0.c;
import s.e2;
import s.h1;
import s.q0;
import s.r0;
import y.e1;
import y.g1;
import y.n0;
import y.s0;
import y.u0;
import y.w;

/* loaded from: classes.dex */
public final class h extends t {
    public static final C0023h H = new C0023h();
    public static final h0.a I = new h0.a();
    public androidx.camera.core.o A;
    public androidx.camera.core.n B;
    public na.a<Void> C;
    public a0.j D;
    public d1 E;
    public j F;
    public final c0.g G;

    /* renamed from: m */
    public final gm.k f1656m;

    /* renamed from: n */
    public final Executor f1657n;

    /* renamed from: o */
    public final int f1658o;

    /* renamed from: p */
    public final AtomicReference<Integer> f1659p;

    /* renamed from: q */
    public final int f1660q;

    /* renamed from: r */
    public int f1661r;

    /* renamed from: s */
    public Rational f1662s;

    /* renamed from: t */
    public ExecutorService f1663t;

    /* renamed from: u */
    public h0 f1664u;

    /* renamed from: v */
    public g0 f1665v;

    /* renamed from: w */
    public int f1666w;

    /* renamed from: x */
    public i0 f1667x;

    /* renamed from: y */
    public boolean f1668y;

    /* renamed from: z */
    public u1.b f1669z;

    /* loaded from: classes.dex */
    public class a extends a0.j {
    }

    /* loaded from: classes.dex */
    public class b extends a0.j {
    }

    /* loaded from: classes.dex */
    public class c implements k.a {

        /* renamed from: a */
        public final /* synthetic */ m f1670a;

        public c(m mVar) {
            this.f1670a = mVar;
        }
    }

    /* loaded from: classes.dex */
    public class d extends l {

        /* renamed from: a */
        public final /* synthetic */ n f1671a;

        /* renamed from: b */
        public final /* synthetic */ int f1672b;

        /* renamed from: c */
        public final /* synthetic */ Executor f1673c;

        /* renamed from: d */
        public final /* synthetic */ k.a f1674d;

        /* renamed from: e */
        public final /* synthetic */ m f1675e;

        public d(n nVar, int i10, Executor executor, c cVar, m mVar) {
            h.this = r1;
            this.f1671a = nVar;
            this.f1672b = i10;
            this.f1673c = executor;
            this.f1674d = cVar;
            this.f1675e = mVar;
        }

        @Override // androidx.camera.core.h.l
        public final void a(androidx.camera.core.j jVar) {
            h.this.f1657n.execute(new androidx.camera.core.k(jVar, this.f1671a, jVar.d0().c(), this.f1672b, this.f1673c, h.this.G, this.f1674d));
        }

        @Override // androidx.camera.core.h.l
        public final void b(n0 n0Var) {
            this.f1675e.b(n0Var);
        }
    }

    /* loaded from: classes.dex */
    public class e implements ThreadFactory {

        /* renamed from: a */
        public final AtomicInteger f1677a = new AtomicInteger(0);

        @Override // java.util.concurrent.ThreadFactory
        public final Thread newThread(Runnable runnable) {
            StringBuilder a10 = android.support.v4.media.d.a("CameraX-image_capture_");
            a10.append(this.f1677a.getAndIncrement());
            return new Thread(runnable, a10.toString());
        }
    }

    /* loaded from: classes.dex */
    public class f {
        public f(h hVar) {
        }
    }

    /* loaded from: classes.dex */
    public static final class g implements h2.a<h, w0, g>, a1.a<g> {

        /* renamed from: a */
        public final j1 f1678a;

        public g() {
            this(j1.B());
        }

        public g(j1 j1Var) {
            Object obj;
            this.f1678a = j1Var;
            Object obj2 = null;
            try {
                obj = j1Var.c(e0.i.f13307v);
            } catch (IllegalArgumentException unused) {
                obj = null;
            }
            Class cls = (Class) obj;
            if (cls != null && !cls.equals(h.class)) {
                throw new IllegalArgumentException("Invalid target class configuration for " + this + ": " + cls);
            }
            this.f1678a.E(e0.i.f13307v, h.class);
            j1 j1Var2 = this.f1678a;
            a0.d dVar = e0.i.f13306u;
            j1Var2.getClass();
            try {
                obj2 = j1Var2.c(dVar);
            } catch (IllegalArgumentException unused2) {
            }
            if (obj2 == null) {
                this.f1678a.E(e0.i.f13306u, h.class.getCanonicalName() + "-" + UUID.randomUUID());
            }
        }

        @Override // a0.a1.a
        public final g a(Size size) {
            this.f1678a.E(a1.f12h, size);
            return this;
        }

        @Override // y.z
        public final i1 b() {
            return this.f1678a;
        }

        @Override // a0.h2.a
        public final w0 c() {
            return new w0(n1.A(this.f1678a));
        }

        @Override // a0.a1.a
        public final g d(int i10) {
            this.f1678a.E(a1.f10f, Integer.valueOf(i10));
            return this;
        }

        public final h e() {
            Object obj;
            Object obj2;
            Object obj3;
            j1 j1Var;
            a0.d dVar;
            int i10;
            Integer num;
            Object obj4;
            boolean z10;
            Object obj5;
            j1 j1Var2 = this.f1678a;
            a0.d dVar2 = a1.f9e;
            j1Var2.getClass();
            Object obj6 = null;
            try {
                obj = j1Var2.c(dVar2);
            } catch (IllegalArgumentException unused) {
                obj = null;
            }
            if (obj != null) {
                j1 j1Var3 = this.f1678a;
                a0.d dVar3 = a1.f12h;
                j1Var3.getClass();
                try {
                    obj5 = j1Var3.c(dVar3);
                } catch (IllegalArgumentException unused2) {
                    obj5 = null;
                }
                if (obj5 != null) {
                    throw new IllegalArgumentException("Cannot use both setTargetResolution and setTargetAspectRatio on the same config.");
                }
            }
            j1 j1Var4 = this.f1678a;
            a0.d dVar4 = w0.D;
            j1Var4.getClass();
            try {
                obj2 = j1Var4.c(dVar4);
            } catch (IllegalArgumentException unused3) {
                obj2 = null;
            }
            Integer num2 = (Integer) obj2;
            boolean z11 = false;
            if (num2 != null) {
                j1 j1Var5 = this.f1678a;
                a0.d dVar5 = w0.C;
                j1Var5.getClass();
                try {
                    obj4 = j1Var5.c(dVar5);
                } catch (IllegalArgumentException unused4) {
                    obj4 = null;
                }
                if (obj4 == null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                h1.e("Cannot set buffer format with CaptureProcessor defined.", z10);
                this.f1678a.E(y0.f210d, num2);
            } else {
                j1 j1Var6 = this.f1678a;
                a0.d dVar6 = w0.C;
                j1Var6.getClass();
                try {
                    obj3 = j1Var6.c(dVar6);
                } catch (IllegalArgumentException unused5) {
                    obj3 = null;
                }
                if (obj3 != null) {
                    j1Var = this.f1678a;
                    dVar = y0.f210d;
                    i10 = 35;
                } else {
                    j1Var = this.f1678a;
                    dVar = y0.f210d;
                    i10 = DfuBaseService.ERROR_REMOTE_TYPE_LEGACY;
                }
                j1Var.E(dVar, Integer.valueOf(i10));
            }
            h hVar = new h(new w0(n1.A(this.f1678a)));
            j1 j1Var7 = this.f1678a;
            a0.d dVar7 = a1.f12h;
            j1Var7.getClass();
            try {
                obj6 = j1Var7.c(dVar7);
            } catch (IllegalArgumentException unused6) {
            }
            Size size = (Size) obj6;
            if (size != null) {
                hVar.f1662s = new Rational(size.getWidth(), size.getHeight());
            }
            j1 j1Var8 = this.f1678a;
            a0.d dVar8 = w0.E;
            int i11 = 2;
            j1Var8.getClass();
            try {
                i11 = j1Var8.c(dVar8);
            } catch (IllegalArgumentException unused7) {
            }
            Integer num3 = (Integer) i11;
            h1.i(num3, "Maximum outstanding image count must be at least 1");
            if (num3.intValue() >= 1) {
                z11 = true;
            }
            h1.e("Maximum outstanding image count must be at least 1", z11);
            j1 j1Var9 = this.f1678a;
            a0.d dVar9 = e0.g.f13305t;
            Object o10 = o8.b.o();
            j1Var9.getClass();
            try {
                o10 = j1Var9.c(dVar9);
            } catch (IllegalArgumentException unused8) {
            }
            h1.i((Executor) o10, "The IO executor can't be null");
            j1 j1Var10 = this.f1678a;
            a0.d dVar10 = w0.A;
            if (j1Var10.z(dVar10) && ((num = (Integer) this.f1678a.c(dVar10)) == null || (num.intValue() != 0 && num.intValue() != 1 && num.intValue() != 2))) {
                throw new IllegalArgumentException("The flash mode is not allowed to set: " + num);
            }
            return hVar;
        }
    }

    /* renamed from: androidx.camera.core.h$h */
    /* loaded from: classes.dex */
    public static final class C0023h {

        /* renamed from: a */
        public static final w0 f1679a;

        static {
            g gVar = new g();
            gVar.f1678a.E(h2.f101p, 4);
            gVar.f1678a.E(a1.f9e, 0);
            f1679a = new w0(n1.A(gVar.f1678a));
        }
    }

    /* loaded from: classes.dex */
    public static class i {

        /* renamed from: a */
        public final int f1680a;

        /* renamed from: b */
        public final int f1681b;

        /* renamed from: c */
        public final Rational f1682c;

        /* renamed from: d */
        public final Executor f1683d;

        /* renamed from: e */
        public final l f1684e;

        /* renamed from: f */
        public AtomicBoolean f1685f = new AtomicBoolean(false);

        /* renamed from: g */
        public final Rect f1686g;

        /* renamed from: h */
        public final Matrix f1687h;

        public i(int i10, int i11, Rational rational, Rect rect, Matrix matrix, c0.b bVar, d dVar) {
            this.f1680a = i10;
            this.f1681b = i11;
            if (rational != null) {
                h1.e("Target ratio cannot be zero", !rational.isZero());
                h1.e("Target ratio must be positive", rational.floatValue() > 0.0f);
            }
            this.f1682c = rational;
            this.f1686g = rect;
            this.f1687h = matrix;
            this.f1683d = bVar;
            this.f1684e = dVar;
        }

        public final void a(g1 g1Var) {
            boolean z10;
            boolean z11;
            Size size;
            int e10;
            if (!this.f1685f.compareAndSet(false, true)) {
                g1Var.close();
                return;
            }
            h.I.getClass();
            if (((g0.b) g0.a.f14801a.c(g0.b.class)) != null) {
                a0.d dVar = h0.f80h;
                z10 = false;
            } else {
                z10 = true;
            }
            if (z10 && g1Var.getFormat() == 256) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z11) {
                try {
                    ByteBuffer a10 = ((a.C0021a) g1Var.l()[0]).a();
                    a10.rewind();
                    byte[] bArr = new byte[a10.capacity()];
                    a10.get(bArr);
                    z1.a aVar = new z1.a(new ByteArrayInputStream(bArr));
                    b0.h hVar = new b0.h(aVar);
                    a10.rewind();
                    size = new Size(aVar.e(0, "ImageWidth"), aVar.e(0, "ImageLength"));
                    e10 = hVar.e();
                } catch (IOException e11) {
                    b(1, "Unable to parse JPEG exif", e11);
                    g1Var.close();
                    return;
                }
            } else {
                size = new Size(g1Var.f(), g1Var.c());
                e10 = this.f1680a;
            }
            e1 e1Var = new e1(g1Var, size, s0.e(g1Var.d0().b(), g1Var.d0().d(), e10, this.f1687h));
            e1Var.b(h.z(this.f1686g, this.f1682c, this.f1680a, size, e10));
            try {
                this.f1683d.execute(new s.u(this, e1Var, 4));
            } catch (RejectedExecutionException unused) {
                u0.b("ImageCapture", "Unable to post to the supplied executor.");
                g1Var.close();
            }
        }

        public final void b(final int i10, final String str, final Throwable th2) {
            if (this.f1685f.compareAndSet(false, true)) {
                try {
                    this.f1683d.execute(new Runnable() { // from class: y.m0
                        @Override // java.lang.Runnable
                        public final void run() {
                            h.i.this.f1684e.b(new n0(i10, str, th2));
                        }
                    });
                } catch (RejectedExecutionException unused) {
                    u0.b("ImageCapture", "Unable to post to the supplied executor.");
                }
            }
        }
    }

    /* loaded from: classes.dex */
    public static class j implements d.a {

        /* renamed from: e */
        public final b f1692e;

        /* renamed from: g */
        public final c f1694g;

        /* renamed from: a */
        public final ArrayDeque f1688a = new ArrayDeque();

        /* renamed from: b */
        public i f1689b = null;

        /* renamed from: c */
        public c.d f1690c = null;

        /* renamed from: d */
        public int f1691d = 0;

        /* renamed from: h */
        public final Object f1695h = new Object();

        /* renamed from: f */
        public final int f1693f = 2;

        /* loaded from: classes.dex */
        public class a implements d0.c<androidx.camera.core.j> {

            /* renamed from: a */
            public final /* synthetic */ i f1696a;

            public a(i iVar) {
                j.this = r1;
                this.f1696a = iVar;
            }

            @Override // d0.c
            public final void onFailure(Throwable th2) {
                synchronized (j.this.f1695h) {
                    if (!(th2 instanceof CancellationException)) {
                        this.f1696a.b(h.C(th2), th2.getMessage(), th2);
                    }
                    j jVar = j.this;
                    jVar.f1689b = null;
                    jVar.f1690c = null;
                    jVar.c();
                }
            }

            @Override // d0.c
            public final void onSuccess(androidx.camera.core.j jVar) {
                androidx.camera.core.j jVar2 = jVar;
                synchronized (j.this.f1695h) {
                    jVar2.getClass();
                    g1 g1Var = new g1(jVar2);
                    g1Var.a(j.this);
                    j.this.f1691d++;
                    this.f1696a.a(g1Var);
                    j jVar3 = j.this;
                    jVar3.f1689b = null;
                    jVar3.f1690c = null;
                    jVar3.c();
                }
            }
        }

        /* loaded from: classes.dex */
        public interface b {
        }

        /* loaded from: classes.dex */
        public interface c {
        }

        public j(q0 q0Var, r0 r0Var) {
            this.f1692e = q0Var;
            this.f1694g = r0Var;
        }

        @Override // androidx.camera.core.d.a
        public final void a(androidx.camera.core.j jVar) {
            synchronized (this.f1695h) {
                this.f1691d--;
                o8.b.p().execute(new e2(1, this));
            }
        }

        public final void b(RuntimeException runtimeException) {
            i iVar;
            c.d dVar;
            ArrayList arrayList;
            synchronized (this.f1695h) {
                iVar = this.f1689b;
                this.f1689b = null;
                dVar = this.f1690c;
                this.f1690c = null;
                arrayList = new ArrayList(this.f1688a);
                this.f1688a.clear();
            }
            if (iVar != null && dVar != null) {
                iVar.b(h.C(runtimeException), runtimeException.getMessage(), runtimeException);
                dVar.cancel(true);
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((i) it.next()).b(h.C(runtimeException), runtimeException.getMessage(), runtimeException);
            }
        }

        public final void c() {
            synchronized (this.f1695h) {
                if (this.f1689b != null) {
                    return;
                }
                if (this.f1691d >= this.f1693f) {
                    u0.h("ImageCapture", "Too many acquire images. Close image to be able to process next.");
                    return;
                }
                i iVar = (i) this.f1688a.poll();
                if (iVar == null) {
                    return;
                }
                this.f1689b = iVar;
                c cVar = this.f1694g;
                if (cVar != null) {
                    ((r0) cVar).a(iVar);
                }
                h hVar = (h) ((q0) this.f1692e).f26134b;
                C0023h c0023h = h.H;
                hVar.getClass();
                c.d a10 = p0.c.a(new y.i0(hVar, iVar, 0));
                this.f1690c = a10;
                d0.f.a(a10, new a(iVar), o8.b.p());
            }
        }

        public final void d(i iVar) {
            synchronized (this.f1695h) {
                this.f1688a.offer(iVar);
                Locale locale = Locale.US;
                Object[] objArr = new Object[2];
                objArr[0] = Integer.valueOf(this.f1689b != null ? 1 : 0);
                objArr[1] = Integer.valueOf(this.f1688a.size());
                u0.a("ImageCapture", String.format(locale, "Send image capture request [current, pending] = [%d, %d]", objArr));
                c();
            }
        }
    }

    /* loaded from: classes.dex */
    public static final class k {

        /* renamed from: a */
        public boolean f1698a;
    }

    /* loaded from: classes.dex */
    public static abstract class l {
        public abstract void a(androidx.camera.core.j jVar);

        public abstract void b(n0 n0Var);
    }

    /* loaded from: classes.dex */
    public interface m {
        void a(o oVar);

        void b(n0 n0Var);
    }

    /* loaded from: classes.dex */
    public static final class n {

        /* renamed from: b */
        public final ContentResolver f1700b;

        /* renamed from: c */
        public final Uri f1701c;

        /* renamed from: d */
        public final ContentValues f1702d;

        /* renamed from: f */
        public final k f1704f;

        /* renamed from: a */
        public final File f1699a = null;

        /* renamed from: e */
        public final OutputStream f1703e = null;

        public n(ContentResolver contentResolver, Uri uri, ContentValues contentValues, k kVar) {
            this.f1700b = contentResolver;
            this.f1701c = uri;
            this.f1702d = contentValues;
            this.f1704f = kVar == null ? new k() : kVar;
        }
    }

    /* loaded from: classes.dex */
    public static class o {

        /* renamed from: a */
        public final Uri f1705a;

        public o(Uri uri) {
            this.f1705a = uri;
        }
    }

    public h(w0 w0Var) {
        super(w0Var);
        int i10;
        this.f1656m = new gm.k();
        this.f1659p = new AtomicReference<>(null);
        this.f1661r = -1;
        this.f1662s = null;
        this.f1668y = false;
        this.C = d0.f.e(null);
        new f(this);
        w0 w0Var2 = (w0) this.f1805f;
        a0.d dVar = w0.f205z;
        w0Var2.getClass();
        if (((n1) w0Var2.b()).z(dVar)) {
            i10 = ((Integer) ((n1) w0Var2.b()).c(dVar)).intValue();
        } else {
            i10 = 1;
        }
        this.f1658o = i10;
        this.f1660q = ((Integer) ((n1) w0Var2.b()).e(w0.H, 0)).intValue();
        c0.e o10 = o8.b.o();
        Executor executor = (Executor) ((n1) w0Var2.b()).e(e0.g.f13305t, o10);
        executor.getClass();
        this.f1657n = executor;
        this.G = new c0.g(executor);
    }

    public static int C(Throwable th2) {
        if (th2 instanceof y.h) {
            return 3;
        }
        if (th2 instanceof n0) {
            return ((n0) th2).f30746a;
        }
        return 0;
    }

    public static boolean F(int i10, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (((Integer) ((Pair) it.next()).first).equals(Integer.valueOf(i10))) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:67:0x00dc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static android.graphics.Rect z(android.graphics.Rect r8, android.util.Rational r9, int r10, android.util.Size r11, int r12) {
        /*
            Method dump skipped, instructions count: 330
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.core.h.z(android.graphics.Rect, android.util.Rational, int, android.util.Size, int):android.graphics.Rect");
    }

    /* JADX WARN: Removed duplicated region for block: B:113:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x01e1  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x01f7  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0210  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x023c  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0271  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final a0.u1.b A(final java.lang.String r15, final a0.w0 r16, final android.util.Size r17) {
        /*
            Method dump skipped, instructions count: 688
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.core.h.A(java.lang.String, a0.w0, android.util.Size):a0.u1$b");
    }

    public final g0 B(w.a aVar) {
        List<j0> a10 = this.f1665v.a();
        return (a10 == null || a10.isEmpty()) ? aVar : new w.a(a10);
    }

    public final int D() {
        int i10;
        synchronized (this.f1659p) {
            i10 = this.f1661r;
            if (i10 == -1) {
                w0 w0Var = (w0) this.f1805f;
                w0Var.getClass();
                i10 = ((Integer) ((n1) w0Var.b()).e(w0.A, 2)).intValue();
            }
        }
        return i10;
    }

    public final int E() {
        w0 w0Var = (w0) this.f1805f;
        a0.d dVar = w0.I;
        w0Var.getClass();
        if (((n1) w0Var.b()).z(dVar)) {
            return ((Integer) ((n1) w0Var.b()).c(dVar)).intValue();
        }
        int i10 = this.f1658o;
        if (i10 != 0) {
            if (i10 != 1 && i10 != 2) {
                throw new IllegalStateException(a0.q.b(android.support.v4.media.d.a("CaptureMode "), this.f1658o, " is invalid"));
            }
            return 95;
        }
        return 100;
    }

    public final void G() {
        int i10;
        List<j0> a10;
        p.b.f();
        w0 w0Var = (w0) this.f1805f;
        if (((y.r0) ((n1) w0Var.b()).e(w0.F, null)) != null) {
            return;
        }
        boolean z10 = false;
        if (a() != null) {
            if (((v1) ((n1) ((w.a) a().h()).b()).e(a0.t.f179c, null)) != null) {
                z10 = true;
            }
        }
        if (z10 || this.f1667x != null) {
            return;
        }
        g0 g0Var = (g0) ((n1) w0Var.b()).e(w0.B, null);
        if (g0Var == null || (a10 = g0Var.a()) == null) {
            i10 = 1;
        } else {
            i10 = a10.size();
        }
        if (i10 > 1) {
            return;
        }
        Integer num = (Integer) ((n1) w0Var.b()).e(y0.f210d, Integer.valueOf((int) DfuBaseService.ERROR_REMOTE_TYPE_LEGACY));
        Objects.requireNonNull(num);
        num.intValue();
    }

    public final void H() {
        synchronized (this.f1659p) {
            if (this.f1659p.get() != null) {
                return;
            }
            this.f1659p.set(Integer.valueOf(D()));
        }
    }

    public final void I(int i10) {
        if (i10 != 0 && i10 != 1 && i10 != 2) {
            throw new IllegalArgumentException(androidx.appcompat.widget.u0.a("Invalid flash mode: ", i10));
        }
        synchronized (this.f1659p) {
            this.f1661r = i10;
            L();
        }
    }

    public final d0.b J(List list) {
        p.b.f();
        return d0.f.h(b().c(this.f1658o, this.f1660q, list), new y.j0(0), o8.b.i());
    }

    public final void K(n nVar, Executor executor, m mVar) {
        boolean z10;
        int E;
        Runnable mVar2;
        if (Looper.getMainLooper() != Looper.myLooper()) {
            o8.b.p().execute(new y.g0(this, nVar, executor, mVar, 0));
            return;
        }
        G();
        d dVar = new d(nVar, E(), executor, new c(mVar), mVar);
        c0.b p10 = o8.b.p();
        b0 a10 = a();
        if (a10 == null) {
            mVar2 = new s.s(this, dVar, 4);
        } else {
            j jVar = this.F;
            if (jVar == null) {
                mVar2 = new s.m(2, dVar);
            } else {
                int g10 = g(a10);
                int g11 = g(a10);
                Size size = this.f1806g;
                Objects.requireNonNull(size);
                Rect z11 = z(this.f1808i, this.f1662s, g11, size, g11);
                int width = size.getWidth();
                int height = size.getHeight();
                int width2 = z11.width();
                int height2 = z11.height();
                if (width == width2 && height == height2) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                if (z10) {
                    if (this.f1658o == 0) {
                        E = 100;
                    } else {
                        E = 95;
                    }
                } else {
                    E = E();
                }
                jVar.d(new i(g10, E, this.f1662s, this.f1808i, this.f1809j, p10, dVar));
                return;
            }
        }
        p10.execute(mVar2);
    }

    public final void L() {
        synchronized (this.f1659p) {
            if (this.f1659p.get() != null) {
                return;
            }
            b().b(D());
        }
    }

    public final void M() {
        synchronized (this.f1659p) {
            Integer andSet = this.f1659p.getAndSet(null);
            if (andSet == null) {
                return;
            }
            if (andSet.intValue() != D()) {
                L();
            }
        }
    }

    @Override // androidx.camera.core.t
    public final h2<?> d(boolean z10, i2 i2Var) {
        l0 a10 = i2Var.a(i2.b.IMAGE_CAPTURE, this.f1658o);
        if (z10) {
            H.getClass();
            a10 = k0.e(a10, C0023h.f1679a);
        }
        if (a10 == null) {
            return null;
        }
        return new w0(n1.A(((g) h(a10)).f1678a));
    }

    @Override // androidx.camera.core.t
    public final h2.a<?, ?, ?> h(l0 l0Var) {
        return new g(j1.C(l0Var));
    }

    @Override // androidx.camera.core.t
    public final void n() {
        w0 w0Var = (w0) this.f1805f;
        this.f1664u = h0.a.e(w0Var).d();
        this.f1667x = (i0) s1.e(w0Var, w0.C, null);
        this.f1666w = ((Integer) ((n1) w0Var.b()).e(w0.E, 2)).intValue();
        w.a a10 = y.w.a();
        this.f1665v = (g0) ((n1) w0Var.b()).e(w0.B, a10);
        this.f1668y = ((Boolean) ((n1) w0Var.b()).e(w0.G, Boolean.FALSE)).booleanValue();
        h1.i(a(), "Attached camera cannot be null");
        this.f1663t = Executors.newFixedThreadPool(1, new e());
    }

    @Override // androidx.camera.core.t
    public final void o() {
        L();
    }

    @Override // androidx.camera.core.t
    public final void q() {
        na.a<Void> aVar = this.C;
        if (this.F != null) {
            this.F.b(new y.h());
        }
        y();
        this.f1668y = false;
        ExecutorService executorService = this.f1663t;
        Objects.requireNonNull(executorService);
        aVar.a(new r2(4, executorService), o8.b.i());
    }

    /* JADX WARN: Can't wrap try/catch for region: R(20:1|(19:82|(5:84|85|86|87|(1:89)(1:90))|7|8|9|10|(8:12|(1:14)(1:78)|15|16|17|18|(1:22)|(1:24))(1:79)|25|26|27|28|(7:30|31|32|(1:34)(1:50)|35|(1:37)|38)(6:53|54|55|(5:58|59|60|61|(1:65)(2:67|68))|71|68)|39|40|41|42|(1:44)|45|46)(1:5)|6|7|8|9|10|(0)(0)|25|26|27|28|(0)(0)|39|40|41|42|(0)|45|46) */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x00cf, code lost:
        r10 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:181:0x014b, code lost:
        if (F(35, r2) != false) goto L71;
     */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0180  */
    /* JADX WARN: Type inference failed for: r0v0, types: [a0.t1, a0.h2] */
    /* JADX WARN: Type inference failed for: r10v29, types: [a0.h2, a0.h2<?>] */
    @Override // androidx.camera.core.t
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final a0.h2<?> r(a0.a0 r10, a0.h2.a<?, ?, ?> r11) {
        /*
            Method dump skipped, instructions count: 393
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.core.h.r(a0.a0, a0.h2$a):a0.h2");
    }

    @Override // androidx.camera.core.t
    public final void s() {
        if (this.F != null) {
            this.F.b(new y.h());
        }
    }

    @Override // androidx.camera.core.t
    public final Size t(Size size) {
        u1.b A = A(c(), (w0) this.f1805f, size);
        this.f1669z = A;
        x(A.d());
        this.f1802c = 1;
        l();
        return size;
    }

    public final String toString() {
        StringBuilder a10 = android.support.v4.media.d.a("ImageCapture:");
        a10.append(f());
        return a10.toString();
    }

    public final void y() {
        p.b.f();
        G();
        j jVar = this.F;
        if (jVar != null) {
            jVar.b(new CancellationException("Request is canceled."));
            this.F = null;
        }
        d1 d1Var = this.E;
        this.E = null;
        this.A = null;
        this.B = null;
        this.C = d0.f.e(null);
        if (d1Var != null) {
            d1Var.a();
        }
    }
}
