package gn;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;
import java.util.ArrayDeque;
import ln.y;
import ln.z;

/* loaded from: classes2.dex */
public final class r {

    /* renamed from: a */
    public long f15640a;

    /* renamed from: b */
    public long f15641b;

    /* renamed from: c */
    public long f15642c;

    /* renamed from: d */
    public long f15643d;

    /* renamed from: e */
    public final ArrayDeque<zm.p> f15644e;

    /* renamed from: f */
    public boolean f15645f;

    /* renamed from: g */
    public final b f15646g;

    /* renamed from: h */
    public final a f15647h;

    /* renamed from: i */
    public final c f15648i;

    /* renamed from: j */
    public final c f15649j;

    /* renamed from: k */
    public gn.b f15650k;

    /* renamed from: l */
    public IOException f15651l;

    /* renamed from: m */
    public final int f15652m;

    /* renamed from: n */
    public final f f15653n;

    /* loaded from: classes2.dex */
    public final class a implements ln.w {

        /* renamed from: a */
        public final ln.e f15654a = new ln.e();

        /* renamed from: b */
        public boolean f15655b;

        /* renamed from: c */
        public boolean f15656c;

        public a(boolean z10) {
            r.this = r1;
            this.f15656c = z10;
        }

        public final void a(boolean z10) {
            long min;
            boolean z11;
            gn.b bVar;
            gn.b bVar2;
            synchronized (r.this) {
                r.this.f15649j.h();
                while (true) {
                    r rVar = r.this;
                    if (rVar.f15642c >= rVar.f15643d && !this.f15656c && !this.f15655b) {
                        synchronized (rVar) {
                            bVar2 = rVar.f15650k;
                        }
                        if (bVar2 != null) {
                            break;
                        }
                        r.this.j();
                    } else {
                        break;
                    }
                }
                r.this.f15649j.l();
                r.this.b();
                r rVar2 = r.this;
                min = Math.min(rVar2.f15643d - rVar2.f15642c, this.f15654a.f20098b);
                r rVar3 = r.this;
                rVar3.f15642c += min;
                if (z10 && min == this.f15654a.f20098b) {
                    synchronized (rVar3) {
                        bVar = rVar3.f15650k;
                    }
                    if (bVar == null) {
                        z11 = true;
                        tl.l lVar = tl.l.f28297a;
                    }
                }
                z11 = false;
                tl.l lVar2 = tl.l.f28297a;
            }
            r.this.f15649j.h();
            try {
                r rVar4 = r.this;
                rVar4.f15653n.s(rVar4.f15652m, z11, this.f15654a, min);
            } finally {
                r.this.f15649j.l();
            }
        }

        @Override // ln.w
        public final void c0(ln.e eVar, long j10) {
            gm.l.f(eVar, "source");
            byte[] bArr = an.c.f635a;
            this.f15654a.c0(eVar, j10);
            while (this.f15654a.f20098b >= 16384) {
                a(false);
            }
        }

        @Override // ln.w, java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            gn.b bVar;
            boolean z10;
            r rVar = r.this;
            byte[] bArr = an.c.f635a;
            synchronized (rVar) {
                if (this.f15655b) {
                    return;
                }
                r rVar2 = r.this;
                synchronized (rVar2) {
                    bVar = rVar2.f15650k;
                }
                boolean z11 = false;
                if (bVar == null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                tl.l lVar = tl.l.f28297a;
                r rVar3 = r.this;
                if (!rVar3.f15647h.f15656c) {
                    if (this.f15654a.f20098b > 0) {
                        z11 = true;
                    }
                    if (z11) {
                        while (this.f15654a.f20098b > 0) {
                            a(true);
                        }
                    } else if (z10) {
                        rVar3.f15653n.s(rVar3.f15652m, true, null, 0L);
                    }
                }
                synchronized (r.this) {
                    this.f15655b = true;
                    tl.l lVar2 = tl.l.f28297a;
                }
                r.this.f15653n.flush();
                r.this.a();
            }
        }

        @Override // ln.w
        public final z e() {
            return r.this.f15649j;
        }

        @Override // ln.w, java.io.Flushable
        public final void flush() {
            r rVar = r.this;
            byte[] bArr = an.c.f635a;
            synchronized (rVar) {
                r.this.b();
                tl.l lVar = tl.l.f28297a;
            }
            while (this.f15654a.f20098b > 0) {
                a(false);
                r.this.f15653n.flush();
            }
        }
    }

    /* loaded from: classes2.dex */
    public final class b implements y {

        /* renamed from: a */
        public final ln.e f15658a = new ln.e();

        /* renamed from: b */
        public final ln.e f15659b = new ln.e();

        /* renamed from: c */
        public boolean f15660c;

        /* renamed from: d */
        public final long f15661d;

        /* renamed from: e */
        public boolean f15662e;

        public b(long j10, boolean z10) {
            r.this = r1;
            this.f15661d = j10;
            this.f15662e = z10;
        }

        /* JADX WARN: Code restructure failed: missing block: B:124:0x00b2, code lost:
            throw new java.io.IOException("stream closed");
         */
        @Override // ln.y
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final long V(ln.e r12, long r13) {
            /*
                Method dump skipped, instructions count: 210
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: gn.r.b.V(ln.e, long):long");
        }

        public final void a(long j10) {
            r rVar = r.this;
            byte[] bArr = an.c.f635a;
            rVar.f15653n.q(j10);
        }

        @Override // ln.y, java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            long j10;
            synchronized (r.this) {
                this.f15660c = true;
                ln.e eVar = this.f15659b;
                j10 = eVar.f20098b;
                eVar.a();
                r rVar = r.this;
                if (rVar != null) {
                    rVar.notifyAll();
                    tl.l lVar = tl.l.f28297a;
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type java.lang.Object");
                }
            }
            if (j10 > 0) {
                a(j10);
            }
            r.this.a();
        }

        @Override // ln.y
        public final z e() {
            return r.this.f15648i;
        }
    }

    /* loaded from: classes2.dex */
    public final class c extends ln.b {
        public c() {
            r.this = r1;
        }

        @Override // ln.b
        public final IOException j(IOException iOException) {
            SocketTimeoutException socketTimeoutException = new SocketTimeoutException("timeout");
            if (iOException != null) {
                socketTimeoutException.initCause(iOException);
            }
            return socketTimeoutException;
        }

        @Override // ln.b
        public final void k() {
            r.this.e(gn.b.CANCEL);
            f fVar = r.this.f15653n;
            synchronized (fVar) {
                long j10 = fVar.f15565p;
                long j11 = fVar.f15564o;
                if (j10 >= j11) {
                    fVar.f15564o = j11 + 1;
                    fVar.f15566q = System.nanoTime() + 1000000000;
                    tl.l lVar = tl.l.f28297a;
                    fVar.f15558i.c(new o(androidx.activity.e.b(new StringBuilder(), fVar.f15553d, " ping"), fVar), 0L);
                }
            }
        }

        public final void l() {
            if (i()) {
                throw j(null);
            }
        }
    }

    public r(int i10, f fVar, boolean z10, boolean z11, zm.p pVar) {
        gm.l.f(fVar, "connection");
        this.f15652m = i10;
        this.f15653n = fVar;
        this.f15643d = fVar.f15568s.a();
        ArrayDeque<zm.p> arrayDeque = new ArrayDeque<>();
        this.f15644e = arrayDeque;
        this.f15646g = new b(fVar.f15567r.a(), z11);
        this.f15647h = new a(z10);
        this.f15648i = new c();
        this.f15649j = new c();
        if (pVar != null) {
            if (!g()) {
                arrayDeque.add(pVar);
                return;
            }
            throw new IllegalStateException("locally-initiated streams shouldn't have headers yet".toString());
        } else if (g()) {
        } else {
            throw new IllegalStateException("remotely-initiated streams should have headers".toString());
        }
    }

    public final void a() {
        boolean z10;
        boolean h10;
        byte[] bArr = an.c.f635a;
        synchronized (this) {
            b bVar = this.f15646g;
            if (!bVar.f15662e && bVar.f15660c) {
                a aVar = this.f15647h;
                if (aVar.f15656c || aVar.f15655b) {
                    z10 = true;
                    h10 = h();
                    tl.l lVar = tl.l.f28297a;
                }
            }
            z10 = false;
            h10 = h();
            tl.l lVar2 = tl.l.f28297a;
        }
        if (z10) {
            c(gn.b.CANCEL, null);
        } else if (!h10) {
            this.f15653n.j(this.f15652m);
        }
    }

    public final void b() {
        a aVar = this.f15647h;
        if (!aVar.f15655b) {
            if (!aVar.f15656c) {
                if (this.f15650k != null) {
                    IOException iOException = this.f15651l;
                    if (iOException == null) {
                        gn.b bVar = this.f15650k;
                        gm.l.c(bVar);
                        throw new x(bVar);
                    }
                    throw iOException;
                }
                return;
            }
            throw new IOException("stream finished");
        }
        throw new IOException("stream closed");
    }

    public final void c(gn.b bVar, IOException iOException) {
        if (d(bVar, iOException)) {
            f fVar = this.f15653n;
            int i10 = this.f15652m;
            fVar.getClass();
            fVar.f15574y.q(i10, bVar);
        }
    }

    public final boolean d(gn.b bVar, IOException iOException) {
        byte[] bArr = an.c.f635a;
        synchronized (this) {
            if (this.f15650k != null) {
                return false;
            }
            if (this.f15646g.f15662e && this.f15647h.f15656c) {
                return false;
            }
            this.f15650k = bVar;
            this.f15651l = iOException;
            notifyAll();
            tl.l lVar = tl.l.f28297a;
            this.f15653n.j(this.f15652m);
            return true;
        }
    }

    public final void e(gn.b bVar) {
        if (d(bVar, null)) {
            this.f15653n.v(this.f15652m, bVar);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0011 A[Catch: all -> 0x0023, TRY_LEAVE, TryCatch #0 {, blocks: (B:24:0x0001, B:26:0x0005, B:32:0x0011, B:36:0x0017, B:37:0x0022), top: B:41:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0017 A[Catch: all -> 0x0023, TRY_ENTER, TryCatch #0 {, blocks: (B:24:0x0001, B:26:0x0005, B:32:0x0011, B:36:0x0017, B:37:0x0022), top: B:41:0x0001 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final gn.r.a f() {
        /*
            r2 = this;
            monitor-enter(r2)
            boolean r0 = r2.f15645f     // Catch: java.lang.Throwable -> L23
            if (r0 != 0) goto Le
            boolean r0 = r2.g()     // Catch: java.lang.Throwable -> L23
            if (r0 == 0) goto Lc
            goto Le
        Lc:
            r0 = 0
            goto Lf
        Le:
            r0 = 1
        Lf:
            if (r0 == 0) goto L17
            tl.l r0 = tl.l.f28297a     // Catch: java.lang.Throwable -> L23
            monitor-exit(r2)
            gn.r$a r0 = r2.f15647h
            return r0
        L17:
            java.lang.String r0 = "reply before requesting the sink"
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L23
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L23
            r1.<init>(r0)     // Catch: java.lang.Throwable -> L23
            throw r1     // Catch: java.lang.Throwable -> L23
        L23:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: gn.r.f():gn.r$a");
    }

    public final boolean g() {
        return this.f15653n.f15550a == ((this.f15652m & 1) == 1);
    }

    public final synchronized boolean h() {
        if (this.f15650k != null) {
            return false;
        }
        b bVar = this.f15646g;
        if (bVar.f15662e || bVar.f15660c) {
            a aVar = this.f15647h;
            if (aVar.f15656c || aVar.f15655b) {
                if (this.f15645f) {
                    return false;
                }
            }
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x001f A[Catch: all -> 0x0037, TryCatch #0 {, blocks: (B:27:0x0008, B:31:0x0010, B:34:0x001f, B:35:0x0023, B:32:0x0016), top: B:43:0x0008 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void i(zm.p r3, boolean r4) {
        /*
            r2 = this;
            java.lang.String r0 = "headers"
            gm.l.f(r3, r0)
            byte[] r0 = an.c.f635a
            monitor-enter(r2)
            boolean r0 = r2.f15645f     // Catch: java.lang.Throwable -> L37
            r1 = 1
            if (r0 == 0) goto L16
            if (r4 != 0) goto L10
            goto L16
        L10:
            gn.r$b r3 = r2.f15646g     // Catch: java.lang.Throwable -> L37
            r3.getClass()     // Catch: java.lang.Throwable -> L37
            goto L1d
        L16:
            r2.f15645f = r1     // Catch: java.lang.Throwable -> L37
            java.util.ArrayDeque<zm.p> r0 = r2.f15644e     // Catch: java.lang.Throwable -> L37
            r0.add(r3)     // Catch: java.lang.Throwable -> L37
        L1d:
            if (r4 == 0) goto L23
            gn.r$b r3 = r2.f15646g     // Catch: java.lang.Throwable -> L37
            r3.f15662e = r1     // Catch: java.lang.Throwable -> L37
        L23:
            boolean r3 = r2.h()     // Catch: java.lang.Throwable -> L37
            r2.notifyAll()     // Catch: java.lang.Throwable -> L37
            tl.l r4 = tl.l.f28297a     // Catch: java.lang.Throwable -> L37
            monitor-exit(r2)
            if (r3 != 0) goto L36
            gn.f r3 = r2.f15653n
            int r4 = r2.f15652m
            r3.j(r4)
        L36:
            return
        L37:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: gn.r.i(zm.p, boolean):void");
    }

    public final void j() {
        try {
            wait();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            throw new InterruptedIOException();
        }
    }
}
