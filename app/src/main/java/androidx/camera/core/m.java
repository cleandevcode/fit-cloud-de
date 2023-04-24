package androidx.camera.core;

import a0.a0;
import a0.a1;
import a0.b0;
import a0.h2;
import a0.i0;
import a0.i1;
import a0.i2;
import a0.j0;
import a0.j1;
import a0.k0;
import a0.l0;
import a0.m0;
import a0.n1;
import a0.p1;
import a0.u1;
import a0.x0;
import a0.y0;
import android.graphics.Rect;
import android.os.Handler;
import android.os.HandlerThread;
import android.util.Size;
import androidx.appcompat.widget.s2;
import androidx.camera.core.l;
import androidx.camera.core.s;
import androidx.camera.core.t;
import java.util.Iterator;
import java.util.UUID;
import java.util.concurrent.Executor;
import y.b1;

/* loaded from: classes.dex */
public final class m extends t {

    /* renamed from: s */
    public static final c f1734s = new c();

    /* renamed from: t */
    public static final c0.b f1735t = o8.b.p();

    /* renamed from: m */
    public d f1736m;

    /* renamed from: n */
    public Executor f1737n;

    /* renamed from: o */
    public m0 f1738o;

    /* renamed from: p */
    public s f1739p;

    /* renamed from: q */
    public Size f1740q;

    /* renamed from: r */
    public j0.j f1741r;

    /* loaded from: classes.dex */
    public class a extends a0.j {

        /* renamed from: a */
        public final /* synthetic */ x0 f1742a;

        public a(x0 x0Var) {
            m.this = r1;
            this.f1742a = x0Var;
        }

        @Override // a0.j
        public final void b(a0.s sVar) {
            if (this.f1742a.a()) {
                m mVar = m.this;
                Iterator it = mVar.f1800a.iterator();
                while (it.hasNext()) {
                    ((t.b) it.next()).f(mVar);
                }
            }
        }
    }

    /* loaded from: classes.dex */
    public static final class b implements h2.a<m, p1, b>, a1.a<b> {

        /* renamed from: a */
        public final j1 f1744a;

        public b() {
            this(j1.B());
        }

        public b(j1 j1Var) {
            Object obj;
            this.f1744a = j1Var;
            Object obj2 = null;
            try {
                obj = j1Var.c(e0.i.f13307v);
            } catch (IllegalArgumentException unused) {
                obj = null;
            }
            Class cls = (Class) obj;
            if (cls != null && !cls.equals(m.class)) {
                throw new IllegalArgumentException("Invalid target class configuration for " + this + ": " + cls);
            }
            this.f1744a.E(e0.i.f13307v, m.class);
            j1 j1Var2 = this.f1744a;
            a0.d dVar = e0.i.f13306u;
            j1Var2.getClass();
            try {
                obj2 = j1Var2.c(dVar);
            } catch (IllegalArgumentException unused2) {
            }
            if (obj2 == null) {
                this.f1744a.E(e0.i.f13306u, m.class.getCanonicalName() + "-" + UUID.randomUUID());
            }
        }

        @Override // a0.a1.a
        public final b a(Size size) {
            this.f1744a.E(a1.f12h, size);
            return this;
        }

        @Override // y.z
        public final i1 b() {
            return this.f1744a;
        }

        @Override // a0.h2.a
        public final p1 c() {
            return new p1(n1.A(this.f1744a));
        }

        @Override // a0.a1.a
        public final b d(int i10) {
            this.f1744a.E(a1.f10f, Integer.valueOf(i10));
            this.f1744a.E(a1.f11g, Integer.valueOf(i10));
            return this;
        }

        public final m e() {
            Object obj;
            j1 j1Var = this.f1744a;
            a0.d dVar = a1.f9e;
            j1Var.getClass();
            Object obj2 = null;
            try {
                obj = j1Var.c(dVar);
            } catch (IllegalArgumentException unused) {
                obj = null;
            }
            if (obj != null) {
                j1 j1Var2 = this.f1744a;
                a0.d dVar2 = a1.f12h;
                j1Var2.getClass();
                try {
                    obj2 = j1Var2.c(dVar2);
                } catch (IllegalArgumentException unused2) {
                }
                if (obj2 != null) {
                    throw new IllegalArgumentException("Cannot use both setTargetResolution and setTargetAspectRatio on the same config.");
                }
            }
            return new m(new p1(n1.A(this.f1744a)));
        }
    }

    /* loaded from: classes.dex */
    public static final class c {

        /* renamed from: a */
        public static final p1 f1745a;

        static {
            b bVar = new b();
            bVar.f1744a.E(h2.f101p, 2);
            bVar.f1744a.E(a1.f9e, 0);
            f1745a = new p1(n1.A(bVar.f1744a));
        }
    }

    /* loaded from: classes.dex */
    public interface d {
        void a(s sVar);
    }

    public m(p1 p1Var) {
        super(p1Var);
        this.f1737n = f1735t;
    }

    public final void A() {
        s.e eVar;
        Executor executor;
        b0 a10 = a();
        d dVar = this.f1736m;
        Size size = this.f1740q;
        Rect rect = this.f1808i;
        if (rect == null) {
            if (size != null) {
                rect = new Rect(0, 0, size.getWidth(), size.getHeight());
            } else {
                rect = null;
            }
        }
        s sVar = this.f1739p;
        if (a10 != null && dVar != null && rect != null && sVar != null) {
            androidx.camera.core.c cVar = new androidx.camera.core.c(rect, g(a10), ((a1) this.f1805f).y());
            synchronized (sVar.f1786a) {
                sVar.f1795j = cVar;
                eVar = sVar.f1796k;
                executor = sVar.f1797l;
            }
            if (eVar != null && executor != null) {
                executor.execute(new s.p(eVar, cVar, 8));
            }
        }
    }

    public final void B(d dVar) {
        c0.b bVar = f1735t;
        p.b.f();
        if (dVar == null) {
            this.f1736m = null;
            this.f1802c = 2;
            l();
            return;
        }
        this.f1736m = dVar;
        this.f1737n = bVar;
        this.f1802c = 1;
        l();
        if (this.f1806g != null) {
            x(z(c(), (p1) this.f1805f, this.f1806g).d());
            k();
        }
    }

    @Override // androidx.camera.core.t
    public final h2<?> d(boolean z10, i2 i2Var) {
        l0 a10 = i2Var.a(i2.b.PREVIEW, 1);
        if (z10) {
            f1734s.getClass();
            a10 = k0.e(a10, c.f1745a);
        }
        if (a10 == null) {
            return null;
        }
        return new p1(n1.A(((b) h(a10)).f1744a));
    }

    @Override // androidx.camera.core.t
    public final h2.a<?, ?, ?> h(l0 l0Var) {
        return new b(j1.C(l0Var));
    }

    @Override // androidx.camera.core.t
    public final void q() {
        y();
    }

    /* JADX WARN: Type inference failed for: r3v8, types: [a0.h2, a0.h2<?>] */
    @Override // androidx.camera.core.t
    public final h2<?> r(a0 a0Var, h2.a<?, ?, ?> aVar) {
        Object obj;
        i1 b10;
        a0.d dVar;
        int i10;
        i1 b11 = aVar.b();
        a0.d dVar2 = p1.A;
        n1 n1Var = (n1) b11;
        n1Var.getClass();
        try {
            obj = n1Var.c(dVar2);
        } catch (IllegalArgumentException unused) {
            obj = null;
        }
        if (obj != null) {
            b10 = aVar.b();
            dVar = y0.f210d;
            i10 = 35;
        } else {
            b10 = aVar.b();
            dVar = y0.f210d;
            i10 = 34;
        }
        ((j1) b10).E(dVar, Integer.valueOf(i10));
        return aVar.c();
    }

    @Override // androidx.camera.core.t
    public final Size t(Size size) {
        this.f1740q = size;
        x(z(c(), (p1) this.f1805f, this.f1740q).d());
        return size;
    }

    public final String toString() {
        StringBuilder a10 = android.support.v4.media.d.a("Preview:");
        a10.append(f());
        return a10.toString();
    }

    @Override // androidx.camera.core.t
    public final void w(Rect rect) {
        this.f1808i = rect;
        A();
    }

    public final void y() {
        m0 m0Var = this.f1738o;
        if (m0Var != null) {
            m0Var.a();
            this.f1738o = null;
        }
        j0.j jVar = this.f1741r;
        if (jVar == null) {
            this.f1739p = null;
        } else {
            jVar.getClass();
            throw null;
        }
    }

    public final u1.b z(final String str, final p1 p1Var, final Size size) {
        l.a aVar;
        p.b.f();
        u1.b e10 = u1.b.e(p1Var);
        i0 i0Var = (i0) ((n1) p1Var.b()).e(p1.A, null);
        y();
        s sVar = new s(size, a(), ((Boolean) ((n1) p1Var.b()).e(p1.B, Boolean.FALSE)).booleanValue());
        this.f1739p = sVar;
        d dVar = this.f1736m;
        if (dVar != null) {
            dVar.getClass();
            s sVar2 = this.f1739p;
            sVar2.getClass();
            this.f1737n.execute(new s.s(dVar, sVar2, 6));
            A();
        }
        if (i0Var != null) {
            j0.a aVar2 = new j0.a();
            HandlerThread handlerThread = new HandlerThread("CameraX-preview_processing");
            handlerThread.start();
            String num = Integer.toString(aVar2.hashCode());
            b1 b1Var = new b1(size.getWidth(), size.getHeight(), p1Var.h(), new Handler(handlerThread.getLooper()), aVar2, i0Var, sVar.f1794i, num);
            synchronized (b1Var.f30659m) {
                if (!b1Var.f30660n) {
                    aVar = b1Var.f30665s;
                } else {
                    throw new IllegalStateException("ProcessingSurface already released!");
                }
            }
            e10.a(aVar);
            b1Var.d().a(new s2(2, handlerThread), o8.b.i());
            this.f1738o = b1Var;
            e10.f190b.f94f.f46a.put(num, 0);
        } else {
            x0 x0Var = (x0) ((n1) p1Var.b()).e(p1.f171z, null);
            if (x0Var != null) {
                e10.a(new a(x0Var));
            }
            this.f1738o = sVar.f1794i;
        }
        if (this.f1736m != null) {
            e10.c(this.f1738o);
        }
        e10.f193e.add(new u1.c() { // from class: y.y0
            @Override // a0.u1.c
            public final void a() {
                androidx.camera.core.m mVar = androidx.camera.core.m.this;
                String str2 = str;
                p1 p1Var2 = p1Var;
                Size size2 = size;
                if (mVar.i(str2)) {
                    mVar.x(mVar.z(str2, p1Var2, size2).d());
                    mVar.k();
                }
            }
        });
        return e10;
    }
}
