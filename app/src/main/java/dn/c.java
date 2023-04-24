package dn;

import java.io.IOException;
import java.net.ProtocolException;
import ln.w;
import ln.y;
import zm.a0;
import zm.m;

/* loaded from: classes2.dex */
public final class c {

    /* renamed from: a */
    public boolean f13187a;

    /* renamed from: b */
    public final h f13188b;

    /* renamed from: c */
    public final e f13189c;

    /* renamed from: d */
    public final m f13190d;

    /* renamed from: e */
    public final d f13191e;

    /* renamed from: f */
    public final en.d f13192f;

    /* loaded from: classes2.dex */
    public final class a extends ln.i {

        /* renamed from: b */
        public boolean f13193b;

        /* renamed from: c */
        public long f13194c;

        /* renamed from: d */
        public boolean f13195d;

        /* renamed from: e */
        public final long f13196e;

        /* renamed from: f */
        public final /* synthetic */ c f13197f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(c cVar, w wVar, long j10) {
            super(wVar);
            gm.l.f(wVar, "delegate");
            this.f13197f = cVar;
            this.f13196e = j10;
        }

        public final <E extends IOException> E a(E e10) {
            if (this.f13193b) {
                return e10;
            }
            this.f13193b = true;
            return (E) this.f13197f.a(false, true, e10);
        }

        @Override // ln.w
        public final void c0(ln.e eVar, long j10) {
            gm.l.f(eVar, "source");
            if (!this.f13195d) {
                long j11 = this.f13196e;
                if (j11 != -1 && this.f13194c + j10 > j11) {
                    StringBuilder a10 = android.support.v4.media.d.a("expected ");
                    a10.append(this.f13196e);
                    a10.append(" bytes but received ");
                    a10.append(this.f13194c + j10);
                    throw new ProtocolException(a10.toString());
                }
                try {
                    this.f20104a.c0(eVar, j10);
                    this.f13194c += j10;
                    return;
                } catch (IOException e10) {
                    throw a(e10);
                }
            }
            throw new IllegalStateException("closed".toString());
        }

        @Override // ln.i, ln.w, java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            if (this.f13195d) {
                return;
            }
            this.f13195d = true;
            long j10 = this.f13196e;
            if (j10 != -1 && this.f13194c != j10) {
                throw new ProtocolException("unexpected end of stream");
            }
            try {
                super.close();
                a(null);
            } catch (IOException e10) {
                throw a(e10);
            }
        }

        @Override // ln.i, ln.w, java.io.Flushable
        public final void flush() {
            try {
                super.flush();
            } catch (IOException e10) {
                throw a(e10);
            }
        }
    }

    /* loaded from: classes2.dex */
    public final class b extends ln.j {

        /* renamed from: b */
        public long f13198b;

        /* renamed from: c */
        public boolean f13199c;

        /* renamed from: d */
        public boolean f13200d;

        /* renamed from: e */
        public boolean f13201e;

        /* renamed from: f */
        public final long f13202f;

        /* renamed from: g */
        public final /* synthetic */ c f13203g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(c cVar, y yVar, long j10) {
            super(yVar);
            gm.l.f(yVar, "delegate");
            this.f13203g = cVar;
            this.f13202f = j10;
            this.f13199c = true;
            if (j10 == 0) {
                a(null);
            }
        }

        @Override // ln.y
        public final long V(ln.e eVar, long j10) {
            gm.l.f(eVar, "sink");
            if (!this.f13201e) {
                try {
                    long V = this.f20105a.V(eVar, j10);
                    if (this.f13199c) {
                        this.f13199c = false;
                        c cVar = this.f13203g;
                        m mVar = cVar.f13190d;
                        e eVar2 = cVar.f13189c;
                        mVar.getClass();
                        gm.l.f(eVar2, "call");
                    }
                    if (V == -1) {
                        a(null);
                        return -1L;
                    }
                    long j11 = this.f13198b + V;
                    long j12 = this.f13202f;
                    if (j12 != -1 && j11 > j12) {
                        throw new ProtocolException("expected " + this.f13202f + " bytes but received " + j11);
                    }
                    this.f13198b = j11;
                    if (j11 == j12) {
                        a(null);
                    }
                    return V;
                } catch (IOException e10) {
                    throw a(e10);
                }
            }
            throw new IllegalStateException("closed".toString());
        }

        public final <E extends IOException> E a(E e10) {
            if (this.f13200d) {
                return e10;
            }
            this.f13200d = true;
            if (e10 == null && this.f13199c) {
                this.f13199c = false;
                c cVar = this.f13203g;
                m mVar = cVar.f13190d;
                e eVar = cVar.f13189c;
                mVar.getClass();
                gm.l.f(eVar, "call");
            }
            return (E) this.f13203g.a(true, false, e10);
        }

        @Override // ln.j, ln.y, java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            if (this.f13201e) {
                return;
            }
            this.f13201e = true;
            try {
                super.close();
                a(null);
            } catch (IOException e10) {
                throw a(e10);
            }
        }
    }

    public c(e eVar, m mVar, d dVar, en.d dVar2) {
        gm.l.f(mVar, "eventListener");
        this.f13189c = eVar;
        this.f13190d = mVar;
        this.f13191e = dVar;
        this.f13192f = dVar2;
        this.f13188b = dVar2.getConnection();
    }

    public final IOException a(boolean z10, boolean z11, IOException iOException) {
        if (iOException != null) {
            c(iOException);
        }
        if (z11) {
            m mVar = this.f13190d;
            e eVar = this.f13189c;
            mVar.getClass();
            if (iOException != null) {
                gm.l.f(eVar, "call");
            } else {
                gm.l.f(eVar, "call");
            }
        }
        if (z10) {
            if (iOException != null) {
                m mVar2 = this.f13190d;
                e eVar2 = this.f13189c;
                mVar2.getClass();
                gm.l.f(eVar2, "call");
            } else {
                m mVar3 = this.f13190d;
                e eVar3 = this.f13189c;
                mVar3.getClass();
                gm.l.f(eVar3, "call");
            }
        }
        return this.f13189c.f(this, z11, z10, iOException);
    }

    public final a0.a b(boolean z10) {
        try {
            a0.a c10 = this.f13192f.c(z10);
            if (c10 != null) {
                c10.f32554m = this;
            }
            return c10;
        } catch (IOException e10) {
            m mVar = this.f13190d;
            e eVar = this.f13189c;
            mVar.getClass();
            gm.l.f(eVar, "call");
            c(e10);
            throw e10;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x0026, code lost:
        if (r6 > 1) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void c(java.io.IOException r6) {
        /*
            r5 = this;
            dn.d r0 = r5.f13191e
            r0.c(r6)
            en.d r0 = r5.f13192f
            dn.h r0 = r0.getConnection()
            dn.e r1 = r5.f13189c
            monitor-enter(r0)
            java.lang.String r2 = "call"
            gm.l.f(r1, r2)     // Catch: java.lang.Throwable -> L59
            boolean r2 = r6 instanceof gn.x     // Catch: java.lang.Throwable -> L59
            r3 = 1
            if (r2 == 0) goto L38
            r2 = r6
            gn.x r2 = (gn.x) r2     // Catch: java.lang.Throwable -> L59
            gn.b r2 = r2.f15680a     // Catch: java.lang.Throwable -> L59
            gn.b r4 = gn.b.REFUSED_STREAM     // Catch: java.lang.Throwable -> L59
            if (r2 != r4) goto L2b
            int r6 = r0.f13252m     // Catch: java.lang.Throwable -> L59
            int r6 = r6 + r3
            r0.f13252m = r6     // Catch: java.lang.Throwable -> L59
            if (r6 <= r3) goto L57
        L28:
            r0.f13248i = r3     // Catch: java.lang.Throwable -> L59
            goto L52
        L2b:
            gn.x r6 = (gn.x) r6     // Catch: java.lang.Throwable -> L59
            gn.b r6 = r6.f15680a     // Catch: java.lang.Throwable -> L59
            gn.b r2 = gn.b.CANCEL     // Catch: java.lang.Throwable -> L59
            if (r6 != r2) goto L28
            boolean r6 = r1.f13226m     // Catch: java.lang.Throwable -> L59
            if (r6 == 0) goto L28
            goto L57
        L38:
            gn.f r2 = r0.f13245f     // Catch: java.lang.Throwable -> L59
            if (r2 == 0) goto L3e
            r2 = 1
            goto L3f
        L3e:
            r2 = 0
        L3f:
            if (r2 == 0) goto L45
            boolean r2 = r6 instanceof gn.a     // Catch: java.lang.Throwable -> L59
            if (r2 == 0) goto L57
        L45:
            r0.f13248i = r3     // Catch: java.lang.Throwable -> L59
            int r2 = r0.f13251l     // Catch: java.lang.Throwable -> L59
            if (r2 != 0) goto L57
            zm.u r1 = r1.f13229p     // Catch: java.lang.Throwable -> L59
            zm.d0 r2 = r0.f13256q     // Catch: java.lang.Throwable -> L59
            dn.h.d(r1, r2, r6)     // Catch: java.lang.Throwable -> L59
        L52:
            int r6 = r0.f13250k     // Catch: java.lang.Throwable -> L59
            int r6 = r6 + r3
            r0.f13250k = r6     // Catch: java.lang.Throwable -> L59
        L57:
            monitor-exit(r0)
            return
        L59:
            r6 = move-exception
            monitor-exit(r0)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: dn.c.c(java.io.IOException):void");
    }
}
