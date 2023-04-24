package y;

import a0.i2;
import a0.l0;
import a0.n1;
import a0.s1;
import a0.y;
import a0.z;
import android.os.Handler;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class v implements e0.i<u> {

    /* renamed from: y */
    public final n1 f30784y;

    /* renamed from: z */
    public static final a0.d f30783z = l0.a.a("camerax.core.appConfig.cameraFactoryProvider", z.a.class);
    public static final a0.d A = l0.a.a("camerax.core.appConfig.deviceSurfaceManagerProvider", y.a.class);
    public static final a0.d B = l0.a.a("camerax.core.appConfig.useCaseConfigFactoryProvider", i2.c.class);
    public static final a0.d C = l0.a.a("camerax.core.appConfig.cameraExecutor", Executor.class);
    public static final a0.d D = l0.a.a("camerax.core.appConfig.schedulerHandler", Handler.class);
    public static final a0.d E = l0.a.a("camerax.core.appConfig.minimumLoggingLevel", Integer.TYPE);
    public static final a0.d F = l0.a.a("camerax.core.appConfig.availableCamerasLimiter", p.class);

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a */
        public final a0.j1 f30785a;

        public a(a0.j1 j1Var) {
            Object obj;
            this.f30785a = j1Var;
            Object obj2 = null;
            try {
                obj = j1Var.c(e0.i.f13307v);
            } catch (IllegalArgumentException unused) {
                obj = null;
            }
            Class cls = (Class) obj;
            if (cls != null && !cls.equals(u.class)) {
                throw new IllegalArgumentException("Invalid target class configuration for " + this + ": " + cls);
            }
            this.f30785a.E(e0.i.f13307v, u.class);
            a0.j1 j1Var2 = this.f30785a;
            a0.d dVar = e0.i.f13306u;
            j1Var2.getClass();
            try {
                obj2 = j1Var2.c(dVar);
            } catch (IllegalArgumentException unused2) {
            }
            if (obj2 == null) {
                this.f30785a.E(e0.i.f13306u, u.class.getCanonicalName() + "-" + UUID.randomUUID());
            }
        }
    }

    /* loaded from: classes.dex */
    public interface b {
        v getCameraXConfig();
    }

    public v(n1 n1Var) {
        this.f30784y = n1Var;
    }

    public final p A() {
        Object obj;
        n1 n1Var = this.f30784y;
        a0.d dVar = F;
        n1Var.getClass();
        try {
            obj = n1Var.c(dVar);
        } catch (IllegalArgumentException unused) {
            obj = null;
        }
        return (p) obj;
    }

    public final z.a B() {
        Object obj;
        n1 n1Var = this.f30784y;
        a0.d dVar = f30783z;
        n1Var.getClass();
        try {
            obj = n1Var.c(dVar);
        } catch (IllegalArgumentException unused) {
            obj = null;
        }
        return (z.a) obj;
    }

    public final y.a C() {
        Object obj;
        n1 n1Var = this.f30784y;
        a0.d dVar = A;
        n1Var.getClass();
        try {
            obj = n1Var.c(dVar);
        } catch (IllegalArgumentException unused) {
            obj = null;
        }
        return (y.a) obj;
    }

    public final i2.c D() {
        Object obj;
        n1 n1Var = this.f30784y;
        a0.d dVar = B;
        n1Var.getClass();
        try {
            obj = n1Var.c(dVar);
        } catch (IllegalArgumentException unused) {
            obj = null;
        }
        return (i2.c) obj;
    }

    @Override // a0.t1, a0.l0
    public final l0.b a(l0.a aVar) {
        return ((n1) b()).a(aVar);
    }

    @Override // a0.t1
    public final a0.l0 b() {
        return this.f30784y;
    }

    @Override // a0.t1, a0.l0
    public final Object c(l0.a aVar) {
        return ((n1) b()).c(aVar);
    }

    @Override // a0.t1, a0.l0
    public final Set d() {
        return ((n1) b()).d();
    }

    @Override // a0.t1, a0.l0
    public final Object e(l0.a aVar, Object obj) {
        return ((n1) b()).e(aVar, obj);
    }

    @Override // a0.l0
    public final /* synthetic */ void m(x.d dVar) {
        s1.b(this, dVar);
    }

    @Override // e0.i
    public final /* synthetic */ String n(String str) {
        throw null;
    }

    @Override // a0.l0
    public final Object p(l0.a aVar, l0.b bVar) {
        return ((n1) b()).p(aVar, bVar);
    }

    @Override // a0.l0
    public final Set u(l0.a aVar) {
        return ((n1) b()).u(aVar);
    }

    @Override // a0.l0
    public final /* synthetic */ boolean z(l0.a aVar) {
        return s1.a(this, (a0.d) aVar);
    }
}
