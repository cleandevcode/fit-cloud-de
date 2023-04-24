package androidx.camera.core;

import a0.a0;
import a0.a1;
import a0.d1;
import a0.h2;
import a0.i1;
import a0.i2;
import a0.j1;
import a0.k0;
import a0.l0;
import a0.n1;
import a0.v0;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.util.Size;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.UUID;
import java.util.concurrent.Executor;
import y.e0;
import y.e1;

/* loaded from: classes.dex */
public final class e extends t {

    /* renamed from: q */
    public static final d f1624q = new d();

    /* renamed from: m */
    public final f f1625m;

    /* renamed from: n */
    public final Object f1626n;

    /* renamed from: o */
    public a f1627o;

    /* renamed from: p */
    public d1 f1628p;

    /* loaded from: classes.dex */
    public interface a {
        void a();

        void b(e1 e1Var);
    }

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes.dex */
    public @interface b {
    }

    /* loaded from: classes.dex */
    public static final class c implements a1.a<c>, h2.a<e, v0, c> {

        /* renamed from: a */
        public final j1 f1629a;

        public c() {
            this(j1.B());
        }

        public c(j1 j1Var) {
            Object obj;
            this.f1629a = j1Var;
            Object obj2 = null;
            try {
                obj = j1Var.c(e0.i.f13307v);
            } catch (IllegalArgumentException unused) {
                obj = null;
            }
            Class cls = (Class) obj;
            if (cls != null && !cls.equals(e.class)) {
                throw new IllegalArgumentException("Invalid target class configuration for " + this + ": " + cls);
            }
            this.f1629a.E(e0.i.f13307v, e.class);
            j1 j1Var2 = this.f1629a;
            a0.d dVar = e0.i.f13306u;
            j1Var2.getClass();
            try {
                obj2 = j1Var2.c(dVar);
            } catch (IllegalArgumentException unused2) {
            }
            if (obj2 == null) {
                this.f1629a.E(e0.i.f13306u, e.class.getCanonicalName() + "-" + UUID.randomUUID());
            }
        }

        @Override // a0.a1.a
        public final c a(Size size) {
            this.f1629a.E(a1.f12h, size);
            return this;
        }

        @Override // y.z
        public final i1 b() {
            return this.f1629a;
        }

        @Override // a0.h2.a
        public final v0 c() {
            return new v0(n1.A(this.f1629a));
        }

        @Override // a0.a1.a
        public final c d(int i10) {
            this.f1629a.E(a1.f10f, Integer.valueOf(i10));
            return this;
        }
    }

    /* loaded from: classes.dex */
    public static final class d {

        /* renamed from: a */
        public static final v0 f1630a;

        static {
            Size size = new Size(640, 480);
            c cVar = new c();
            cVar.f1629a.E(a1.f13i, size);
            cVar.f1629a.E(h2.f101p, 1);
            cVar.f1629a.E(a1.f9e, 0);
            f1630a = new v0(n1.A(cVar.f1629a));
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: androidx.camera.core.e$e */
    /* loaded from: classes.dex */
    public @interface InterfaceC0022e {
    }

    public e(v0 v0Var) {
        super(v0Var);
        this.f1626n = new Object();
        if (((Integer) ((n1) ((v0) this.f1805f).b()).e(v0.f201z, 0)).intValue() == 1) {
            this.f1625m = new e0();
        } else {
            if (c0.d.f4510b == null) {
                synchronized (c0.d.class) {
                    if (c0.d.f4510b == null) {
                        c0.d.f4510b = new c0.d();
                    }
                }
            }
            this.f1625m = new g((Executor) v0Var.e(e0.j.f13308w, c0.d.f4510b));
        }
        this.f1625m.f1634d = z();
        f fVar = this.f1625m;
        v0 v0Var2 = (v0) this.f1805f;
        Boolean bool = Boolean.FALSE;
        v0Var2.getClass();
        fVar.f1635e = ((Boolean) ((n1) v0Var2.b()).e(v0.E, bool)).booleanValue();
    }

    @Override // androidx.camera.core.t
    public final h2<?> d(boolean z10, i2 i2Var) {
        l0 a10 = i2Var.a(i2.b.IMAGE_ANALYSIS, 1);
        if (z10) {
            f1624q.getClass();
            a10 = k0.e(a10, d.f1630a);
        }
        if (a10 == null) {
            return null;
        }
        return new v0(n1.A(((c) h(a10)).f1629a));
    }

    @Override // androidx.camera.core.t
    public final h2.a<?, ?, ?> h(l0 l0Var) {
        return new c(j1.C(l0Var));
    }

    @Override // androidx.camera.core.t
    public final void n() {
        this.f1625m.f1649s = true;
    }

    @Override // androidx.camera.core.t
    public final void q() {
        p.b.f();
        d1 d1Var = this.f1628p;
        if (d1Var != null) {
            d1Var.a();
            this.f1628p = null;
        }
        f fVar = this.f1625m;
        fVar.f1649s = false;
        fVar.d();
    }

    /* JADX WARN: Type inference failed for: r4v5, types: [a0.h2, a0.h2<?>] */
    @Override // androidx.camera.core.t
    public final h2<?> r(a0 a0Var, h2.a<?, ?, ?> aVar) {
        v0 v0Var = (v0) this.f1805f;
        v0Var.getClass();
        Boolean bool = (Boolean) ((n1) v0Var.b()).e(v0.D, null);
        boolean b10 = a0Var.g().b(g0.c.class);
        f fVar = this.f1625m;
        if (bool != null) {
            b10 = bool.booleanValue();
        }
        fVar.f1636f = b10;
        synchronized (this.f1626n) {
            a aVar2 = this.f1627o;
            if (aVar2 != null) {
                aVar2.a();
            }
        }
        return aVar.c();
    }

    @Override // androidx.camera.core.t
    public final Size t(Size size) {
        x(y(c(), (v0) this.f1805f, size).d());
        return size;
    }

    public final String toString() {
        StringBuilder a10 = android.support.v4.media.d.a("ImageAnalysis:");
        a10.append(f());
        return a10.toString();
    }

    @Override // androidx.camera.core.t
    public final void u(Matrix matrix) {
        super.u(matrix);
        f fVar = this.f1625m;
        synchronized (fVar.f1648r) {
            fVar.f1642l = matrix;
            fVar.f1643m = new Matrix(fVar.f1642l);
        }
    }

    @Override // androidx.camera.core.t
    public final void w(Rect rect) {
        this.f1808i = rect;
        f fVar = this.f1625m;
        synchronized (fVar.f1648r) {
            fVar.f1640j = rect;
            fVar.f1641k = new Rect(fVar.f1640j);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:129:0x014c, code lost:
        if (r13.equals((java.lang.Boolean) ((a0.n1) r14.b()).e(a0.v0.D, null)) != false) goto L46;
     */
    /* JADX WARN: Removed duplicated region for block: B:107:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x018e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final a0.u1.b y(final java.lang.String r17, final a0.v0 r18, final android.util.Size r19) {
        /*
            Method dump skipped, instructions count: 453
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.core.e.y(java.lang.String, a0.v0, android.util.Size):a0.u1$b");
    }

    public final int z() {
        v0 v0Var = (v0) this.f1805f;
        v0Var.getClass();
        return ((Integer) ((n1) v0Var.b()).e(v0.C, 1)).intValue();
    }
}
