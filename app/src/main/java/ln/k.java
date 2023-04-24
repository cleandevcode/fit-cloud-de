package ln;

import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public final class k extends z {

    /* renamed from: e */
    public z f20106e;

    public k(z zVar) {
        gm.l.f(zVar, "delegate");
        this.f20106e = zVar;
    }

    @Override // ln.z
    public final z a() {
        return this.f20106e.a();
    }

    @Override // ln.z
    public final z b() {
        return this.f20106e.b();
    }

    @Override // ln.z
    public final long c() {
        return this.f20106e.c();
    }

    @Override // ln.z
    public final z d(long j10) {
        return this.f20106e.d(j10);
    }

    @Override // ln.z
    public final boolean e() {
        return this.f20106e.e();
    }

    @Override // ln.z
    public final void f() {
        this.f20106e.f();
    }

    @Override // ln.z
    public final z g(long j10, TimeUnit timeUnit) {
        gm.l.f(timeUnit, "unit");
        return this.f20106e.g(j10, timeUnit);
    }
}
