package ln;

import a0.q0;
import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public class z {

    /* renamed from: d */
    public static final a f20144d = new a();

    /* renamed from: a */
    public boolean f20145a;

    /* renamed from: b */
    public long f20146b;

    /* renamed from: c */
    public long f20147c;

    /* loaded from: classes2.dex */
    public static final class a extends z {
        @Override // ln.z
        public final z d(long j10) {
            return this;
        }

        @Override // ln.z
        public final void f() {
        }

        @Override // ln.z
        public final z g(long j10, TimeUnit timeUnit) {
            gm.l.f(timeUnit, "unit");
            return this;
        }
    }

    public z a() {
        this.f20145a = false;
        return this;
    }

    public z b() {
        this.f20147c = 0L;
        return this;
    }

    public long c() {
        if (this.f20145a) {
            return this.f20146b;
        }
        throw new IllegalStateException("No deadline".toString());
    }

    public z d(long j10) {
        this.f20145a = true;
        this.f20146b = j10;
        return this;
    }

    public boolean e() {
        return this.f20145a;
    }

    public void f() {
        Thread currentThread = Thread.currentThread();
        gm.l.e(currentThread, "Thread.currentThread()");
        if (currentThread.isInterrupted()) {
            throw new InterruptedIOException("interrupted");
        }
        if (this.f20145a && this.f20146b - System.nanoTime() <= 0) {
            throw new InterruptedIOException("deadline reached");
        }
    }

    public z g(long j10, TimeUnit timeUnit) {
        boolean z10;
        gm.l.f(timeUnit, "unit");
        if (j10 >= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            this.f20147c = timeUnit.toNanos(j10);
            return this;
        }
        throw new IllegalArgumentException(q0.a("timeout < 0: ", j10).toString());
    }
}
