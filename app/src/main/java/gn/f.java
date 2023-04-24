package gn;

import cn.sharesdk.framework.Platform;
import gn.q;
import java.io.Closeable;
import java.io.IOException;
import java.net.Socket;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.concurrent.TimeUnit;
import no.nordicsemi.android.dfu.DfuBaseService;

/* loaded from: classes2.dex */
public final class f implements Closeable {
    public static final w B;
    public final LinkedHashSet A;

    /* renamed from: a */
    public final boolean f15550a;

    /* renamed from: b */
    public final c f15551b;

    /* renamed from: c */
    public final LinkedHashMap f15552c;

    /* renamed from: d */
    public final String f15553d;

    /* renamed from: e */
    public int f15554e;

    /* renamed from: f */
    public int f15555f;

    /* renamed from: g */
    public boolean f15556g;

    /* renamed from: h */
    public final cn.d f15557h;

    /* renamed from: i */
    public final cn.c f15558i;

    /* renamed from: j */
    public final cn.c f15559j;

    /* renamed from: k */
    public final cn.c f15560k;

    /* renamed from: l */
    public final u f15561l;

    /* renamed from: m */
    public long f15562m;

    /* renamed from: n */
    public long f15563n;

    /* renamed from: o */
    public long f15564o;

    /* renamed from: p */
    public long f15565p;

    /* renamed from: q */
    public long f15566q;

    /* renamed from: r */
    public final w f15567r;

    /* renamed from: s */
    public w f15568s;

    /* renamed from: t */
    public long f15569t;

    /* renamed from: u */
    public long f15570u;

    /* renamed from: v */
    public long f15571v;

    /* renamed from: w */
    public long f15572w;

    /* renamed from: x */
    public final Socket f15573x;

    /* renamed from: y */
    public final s f15574y;

    /* renamed from: z */
    public final d f15575z;

    /* loaded from: classes2.dex */
    public static final class a extends cn.a {

        /* renamed from: e */
        public final /* synthetic */ f f15576e;

        /* renamed from: f */
        public final /* synthetic */ long f15577f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, f fVar, long j10) {
            super(str, true);
            this.f15576e = fVar;
            this.f15577f = j10;
        }

        @Override // cn.a
        public final long a() {
            f fVar;
            boolean z10;
            synchronized (this.f15576e) {
                fVar = this.f15576e;
                long j10 = fVar.f15563n;
                long j11 = fVar.f15562m;
                if (j10 < j11) {
                    z10 = true;
                } else {
                    fVar.f15562m = j11 + 1;
                    z10 = false;
                }
            }
            if (z10) {
                fVar.b(null);
                return -1L;
            }
            try {
                fVar.f15574y.k(1, 0, false);
            } catch (IOException e10) {
                fVar.b(e10);
            }
            return this.f15577f;
        }
    }

    /* loaded from: classes2.dex */
    public static final class b {

        /* renamed from: a */
        public Socket f15578a;

        /* renamed from: b */
        public String f15579b;

        /* renamed from: c */
        public ln.g f15580c;

        /* renamed from: d */
        public ln.f f15581d;

        /* renamed from: e */
        public c f15582e;

        /* renamed from: f */
        public u f15583f;

        /* renamed from: g */
        public int f15584g;

        /* renamed from: h */
        public boolean f15585h;

        /* renamed from: i */
        public final cn.d f15586i;

        public b(cn.d dVar) {
            gm.l.f(dVar, "taskRunner");
            this.f15585h = true;
            this.f15586i = dVar;
            this.f15582e = c.f15587a;
            this.f15583f = v.I;
        }
    }

    /* loaded from: classes2.dex */
    public static abstract class c {

        /* renamed from: a */
        public static final a f15587a = new a();

        /* loaded from: classes2.dex */
        public static final class a extends c {
            @Override // gn.f.c
            public final void b(r rVar) {
                gm.l.f(rVar, "stream");
                rVar.c(gn.b.REFUSED_STREAM, null);
            }
        }

        public void a(f fVar, w wVar) {
            gm.l.f(fVar, "connection");
            gm.l.f(wVar, "settings");
        }

        public abstract void b(r rVar);
    }

    /* loaded from: classes2.dex */
    public final class d implements q.c, fm.a<tl.l> {

        /* renamed from: a */
        public final q f15588a;

        public d(q qVar) {
            f.this = r1;
            this.f15588a = qVar;
        }

        @Override // gn.q.c
        public final void a(int i10, List list) {
            f fVar = f.this;
            fVar.getClass();
            synchronized (fVar) {
                if (fVar.A.contains(Integer.valueOf(i10))) {
                    fVar.v(i10, gn.b.PROTOCOL_ERROR);
                    return;
                }
                fVar.A.add(Integer.valueOf(i10));
                cn.c cVar = fVar.f15559j;
                cVar.c(new m(fVar.f15553d + '[' + i10 + "] onRequest", fVar, i10, list), 0L);
            }
        }

        @Override // gn.q.c
        public final void c() {
        }

        @Override // gn.q.c
        public final void d(int i10, gn.b bVar, ln.h hVar) {
            int i11;
            r[] rVarArr;
            gm.l.f(hVar, "debugData");
            hVar.d();
            synchronized (f.this) {
                Object[] array = f.this.f15552c.values().toArray(new r[0]);
                if (array != null) {
                    rVarArr = (r[]) array;
                    f.this.f15556g = true;
                    tl.l lVar = tl.l.f28297a;
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
                }
            }
            for (r rVar : rVarArr) {
                if (rVar.f15652m > i10 && rVar.g()) {
                    gn.b bVar2 = gn.b.REFUSED_STREAM;
                    synchronized (rVar) {
                        if (rVar.f15650k == null) {
                            rVar.f15650k = bVar2;
                            rVar.notifyAll();
                        }
                    }
                    f.this.j(rVar.f15652m);
                }
            }
        }

        @Override // gn.q.c
        public final void e(int i10, gn.b bVar) {
            f.this.getClass();
            boolean z10 = true;
            if ((i10 == 0 || (i10 & 1) != 0) ? false : false) {
                f fVar = f.this;
                fVar.getClass();
                cn.c cVar = fVar.f15559j;
                cVar.c(new n(fVar.f15553d + '[' + i10 + "] onReset", fVar, i10, bVar), 0L);
                return;
            }
            r j10 = f.this.j(i10);
            if (j10 != null) {
                synchronized (j10) {
                    if (j10.f15650k == null) {
                        j10.f15650k = bVar;
                        j10.notifyAll();
                    }
                }
            }
        }

        @Override // gn.q.c
        public final void f(int i10, long j10) {
            Object obj;
            if (i10 == 0) {
                Object obj2 = f.this;
                synchronized (obj2) {
                    f fVar = f.this;
                    fVar.f15572w += j10;
                    fVar.notifyAll();
                    tl.l lVar = tl.l.f28297a;
                    obj = obj2;
                }
            } else {
                r h10 = f.this.h(i10);
                if (h10 != null) {
                    synchronized (h10) {
                        h10.f15643d += j10;
                        if (j10 > 0) {
                            h10.notifyAll();
                        }
                        tl.l lVar2 = tl.l.f28297a;
                        obj = h10;
                    }
                } else {
                    return;
                }
            }
        }

        @Override // gn.q.c
        public final void g(int i10, int i11, boolean z10) {
            if (z10) {
                synchronized (f.this) {
                    if (i10 != 1) {
                        if (i10 != 2) {
                            if (i10 == 3) {
                                f fVar = f.this;
                                fVar.getClass();
                                fVar.notifyAll();
                            }
                            tl.l lVar = tl.l.f28297a;
                        } else {
                            f.this.f15565p++;
                        }
                    } else {
                        f.this.f15563n++;
                    }
                }
                return;
            }
            f.this.f15558i.c(new i(androidx.activity.e.b(new StringBuilder(), f.this.f15553d, " ping"), this, i10, i11), 0L);
        }

        @Override // gn.q.c
        public final void i(w wVar) {
            f.this.f15558i.c(new j(androidx.activity.e.b(new StringBuilder(), f.this.f15553d, " applyAndAckSettings"), this, wVar), 0L);
        }

        /* JADX WARN: Code restructure failed: missing block: B:127:0x00ea, code lost:
            throw new java.lang.NullPointerException("null cannot be cast to non-null type java.lang.Object");
         */
        /* JADX WARN: Code restructure failed: missing block: B:141:0x0101, code lost:
            if (r21 == false) goto L68;
         */
        /* JADX WARN: Code restructure failed: missing block: B:142:0x0103, code lost:
            r5.i(an.c.f636b, true);
         */
        /* JADX WARN: Code restructure failed: missing block: B:143:0x0108, code lost:
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:157:?, code lost:
            return;
         */
        @Override // gn.q.c
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void l(int r18, int r19, ln.g r20, boolean r21) {
            /*
                Method dump skipped, instructions count: 265
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: gn.f.d.l(int, int, ln.g, boolean):void");
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v0, types: [gn.b] */
        /* JADX WARN: Type inference failed for: r0v3 */
        /* JADX WARN: Type inference failed for: r0v6, types: [tl.l] */
        @Override // fm.a
        public final tl.l m() {
            Throwable th2;
            gn.b bVar;
            gn.b bVar2;
            gn.b bVar3 = gn.b.INTERNAL_ERROR;
            IOException e10 = null;
            try {
                try {
                    this.f15588a.b(this);
                    while (this.f15588a.a(false, this)) {
                    }
                    bVar2 = gn.b.NO_ERROR;
                } catch (IOException e11) {
                    e10 = e11;
                } catch (Throwable th3) {
                    th2 = th3;
                    bVar = bVar3;
                    f.this.a(bVar, bVar3, e10);
                    an.c.b(this.f15588a);
                    throw th2;
                }
                try {
                    f.this.a(bVar2, gn.b.CANCEL, null);
                    bVar = bVar2;
                } catch (IOException e12) {
                    e10 = e12;
                    gn.b bVar4 = gn.b.PROTOCOL_ERROR;
                    f fVar = f.this;
                    fVar.a(bVar4, bVar4, e10);
                    bVar = fVar;
                    an.c.b(this.f15588a);
                    bVar3 = tl.l.f28297a;
                    return bVar3;
                }
                an.c.b(this.f15588a);
                bVar3 = tl.l.f28297a;
                return bVar3;
            } catch (Throwable th4) {
                th2 = th4;
                f.this.a(bVar, bVar3, e10);
                an.c.b(this.f15588a);
                throw th2;
            }
        }

        @Override // gn.q.c
        public final void n() {
        }

        @Override // gn.q.c
        public final void o(List list, int i10, boolean z10) {
            f.this.getClass();
            boolean z11 = true;
            if ((i10 == 0 || (i10 & 1) != 0) ? false : false) {
                f fVar = f.this;
                fVar.getClass();
                cn.c cVar = fVar.f15559j;
                cVar.c(new l(fVar.f15553d + '[' + i10 + "] onHeaders", fVar, i10, list, z10), 0L);
                return;
            }
            synchronized (f.this) {
                r h10 = f.this.h(i10);
                if (h10 == null) {
                    f fVar2 = f.this;
                    if (fVar2.f15556g) {
                        return;
                    }
                    if (i10 <= fVar2.f15554e) {
                        return;
                    }
                    if (i10 % 2 == fVar2.f15555f % 2) {
                        return;
                    }
                    r rVar = new r(i10, f.this, false, z10, an.c.r(list));
                    f fVar3 = f.this;
                    fVar3.f15554e = i10;
                    fVar3.f15552c.put(Integer.valueOf(i10), rVar);
                    cn.c f10 = f.this.f15557h.f();
                    f10.c(new h(f.this.f15553d + '[' + i10 + "] onStream", rVar, this, list), 0L);
                    return;
                }
                tl.l lVar = tl.l.f28297a;
                h10.i(an.c.r(list), z10);
            }
        }
    }

    /* loaded from: classes2.dex */
    public static final class e extends cn.a {

        /* renamed from: e */
        public final /* synthetic */ f f15590e;

        /* renamed from: f */
        public final /* synthetic */ int f15591f;

        /* renamed from: g */
        public final /* synthetic */ gn.b f15592g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(String str, f fVar, int i10, gn.b bVar) {
            super(str, true);
            this.f15590e = fVar;
            this.f15591f = i10;
            this.f15592g = bVar;
        }

        @Override // cn.a
        public final long a() {
            try {
                f fVar = this.f15590e;
                int i10 = this.f15591f;
                gn.b bVar = this.f15592g;
                fVar.getClass();
                gm.l.f(bVar, "statusCode");
                fVar.f15574y.q(i10, bVar);
                return -1L;
            } catch (IOException e10) {
                this.f15590e.b(e10);
                return -1L;
            }
        }
    }

    /* renamed from: gn.f$f */
    /* loaded from: classes2.dex */
    public static final class C0278f extends cn.a {

        /* renamed from: e */
        public final /* synthetic */ f f15593e;

        /* renamed from: f */
        public final /* synthetic */ int f15594f;

        /* renamed from: g */
        public final /* synthetic */ long f15595g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0278f(String str, f fVar, int i10, long j10) {
            super(str, true);
            this.f15593e = fVar;
            this.f15594f = i10;
            this.f15595g = j10;
        }

        @Override // cn.a
        public final long a() {
            try {
                this.f15593e.f15574y.s(this.f15594f, this.f15595g);
                return -1L;
            } catch (IOException e10) {
                this.f15593e.b(e10);
                return -1L;
            }
        }
    }

    static {
        w wVar = new w();
        wVar.b(7, Platform.CUSTOMER_ACTION_MASK);
        wVar.b(5, DfuBaseService.ERROR_CONNECTION_MASK);
        B = wVar;
    }

    public f(b bVar) {
        int i10;
        boolean z10 = bVar.f15585h;
        this.f15550a = z10;
        this.f15551b = bVar.f15582e;
        this.f15552c = new LinkedHashMap();
        String str = bVar.f15579b;
        if (str != null) {
            this.f15553d = str;
            if (bVar.f15585h) {
                i10 = 3;
            } else {
                i10 = 2;
            }
            this.f15555f = i10;
            cn.d dVar = bVar.f15586i;
            this.f15557h = dVar;
            cn.c f10 = dVar.f();
            this.f15558i = f10;
            this.f15559j = dVar.f();
            this.f15560k = dVar.f();
            this.f15561l = bVar.f15583f;
            w wVar = new w();
            if (bVar.f15585h) {
                wVar.b(7, 16777216);
            }
            tl.l lVar = tl.l.f28297a;
            this.f15567r = wVar;
            w wVar2 = B;
            this.f15568s = wVar2;
            this.f15572w = wVar2.a();
            Socket socket = bVar.f15578a;
            if (socket != null) {
                this.f15573x = socket;
                ln.f fVar = bVar.f15581d;
                if (fVar != null) {
                    this.f15574y = new s(fVar, z10);
                    ln.g gVar = bVar.f15580c;
                    if (gVar != null) {
                        this.f15575z = new d(new q(gVar, z10));
                        this.A = new LinkedHashSet();
                        int i11 = bVar.f15584g;
                        if (i11 != 0) {
                            long nanos = TimeUnit.MILLISECONDS.toNanos(i11);
                            f10.c(new a(a.b.b(str, " ping"), this, nanos), nanos);
                            return;
                        }
                        return;
                    }
                    gm.l.l("source");
                    throw null;
                }
                gm.l.l("sink");
                throw null;
            }
            gm.l.l("socket");
            throw null;
        }
        gm.l.l("connectionName");
        throw null;
    }

    public final void a(gn.b bVar, gn.b bVar2, IOException iOException) {
        int i10;
        byte[] bArr = an.c.f635a;
        try {
            k(bVar);
        } catch (IOException unused) {
        }
        r[] rVarArr = null;
        synchronized (this) {
            if (!this.f15552c.isEmpty()) {
                Object[] array = this.f15552c.values().toArray(new r[0]);
                if (array == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
                }
                rVarArr = (r[]) array;
                this.f15552c.clear();
            }
            tl.l lVar = tl.l.f28297a;
        }
        if (rVarArr != null) {
            for (r rVar : rVarArr) {
                try {
                    rVar.c(bVar2, iOException);
                } catch (IOException unused2) {
                }
            }
        }
        try {
            this.f15574y.close();
        } catch (IOException unused3) {
        }
        try {
            this.f15573x.close();
        } catch (IOException unused4) {
        }
        this.f15558i.e();
        this.f15559j.e();
        this.f15560k.e();
    }

    public final void b(IOException iOException) {
        gn.b bVar = gn.b.PROTOCOL_ERROR;
        a(bVar, bVar, iOException);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        a(gn.b.NO_ERROR, gn.b.CANCEL, null);
    }

    public final void flush() {
        s sVar = this.f15574y;
        synchronized (sVar) {
            if (!sVar.f15668c) {
                sVar.f15670e.flush();
            } else {
                throw new IOException("closed");
            }
        }
    }

    public final synchronized r h(int i10) {
        return (r) this.f15552c.get(Integer.valueOf(i10));
    }

    public final synchronized r j(int i10) {
        r rVar;
        rVar = (r) this.f15552c.remove(Integer.valueOf(i10));
        notifyAll();
        return rVar;
    }

    public final void k(gn.b bVar) {
        synchronized (this.f15574y) {
            synchronized (this) {
                if (this.f15556g) {
                    return;
                }
                this.f15556g = true;
                int i10 = this.f15554e;
                tl.l lVar = tl.l.f28297a;
                this.f15574y.j(i10, bVar, an.c.f635a);
            }
        }
    }

    public final synchronized void q(long j10) {
        long j11 = this.f15569t + j10;
        this.f15569t = j11;
        long j12 = j11 - this.f15570u;
        if (j12 >= this.f15567r.a() / 2) {
            y(0, j12);
            this.f15570u += j12;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:55:0x0031, code lost:
        throw new java.io.IOException("stream closed");
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0033, code lost:
        r3 = java.lang.Math.min((int) java.lang.Math.min(r12, r5 - r3), r8.f15574y.f15667b);
        r6 = r3;
        r8.f15571v += r6;
        r4 = tl.l.f28297a;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void s(int r9, boolean r10, ln.e r11, long r12) {
        /*
            r8 = this;
            r0 = 0
            r1 = 0
            int r3 = (r12 > r1 ? 1 : (r12 == r1 ? 0 : -1))
            if (r3 != 0) goto Ld
            gn.s r12 = r8.f15574y
            r12.b(r10, r9, r11, r0)
            return
        Ld:
            int r3 = (r12 > r1 ? 1 : (r12 == r1 ? 0 : -1))
            if (r3 <= 0) goto L6a
            monitor-enter(r8)
        L12:
            long r3 = r8.f15571v     // Catch: java.lang.Throwable -> L59 java.lang.InterruptedException -> L5b
            long r5 = r8.f15572w     // Catch: java.lang.Throwable -> L59 java.lang.InterruptedException -> L5b
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 < 0) goto L32
            java.util.LinkedHashMap r3 = r8.f15552c     // Catch: java.lang.Throwable -> L59 java.lang.InterruptedException -> L5b
            java.lang.Integer r4 = java.lang.Integer.valueOf(r9)     // Catch: java.lang.Throwable -> L59 java.lang.InterruptedException -> L5b
            boolean r3 = r3.containsKey(r4)     // Catch: java.lang.Throwable -> L59 java.lang.InterruptedException -> L5b
            if (r3 == 0) goto L2a
            r8.wait()     // Catch: java.lang.Throwable -> L59 java.lang.InterruptedException -> L5b
            goto L12
        L2a:
            java.io.IOException r9 = new java.io.IOException     // Catch: java.lang.Throwable -> L59 java.lang.InterruptedException -> L5b
            java.lang.String r10 = "stream closed"
            r9.<init>(r10)     // Catch: java.lang.Throwable -> L59 java.lang.InterruptedException -> L5b
            throw r9     // Catch: java.lang.Throwable -> L59 java.lang.InterruptedException -> L5b
        L32:
            long r5 = r5 - r3
            long r3 = java.lang.Math.min(r12, r5)     // Catch: java.lang.Throwable -> L59
            int r4 = (int) r3     // Catch: java.lang.Throwable -> L59
            gn.s r3 = r8.f15574y     // Catch: java.lang.Throwable -> L59
            int r3 = r3.f15667b     // Catch: java.lang.Throwable -> L59
            int r3 = java.lang.Math.min(r4, r3)     // Catch: java.lang.Throwable -> L59
            long r4 = r8.f15571v     // Catch: java.lang.Throwable -> L59
            long r6 = (long) r3     // Catch: java.lang.Throwable -> L59
            long r4 = r4 + r6
            r8.f15571v = r4     // Catch: java.lang.Throwable -> L59
            tl.l r4 = tl.l.f28297a     // Catch: java.lang.Throwable -> L59
            monitor-exit(r8)
            long r12 = r12 - r6
            gn.s r4 = r8.f15574y
            if (r10 == 0) goto L54
            int r5 = (r12 > r1 ? 1 : (r12 == r1 ? 0 : -1))
            if (r5 != 0) goto L54
            r5 = 1
            goto L55
        L54:
            r5 = 0
        L55:
            r4.b(r5, r9, r11, r3)
            goto Ld
        L59:
            r9 = move-exception
            goto L68
        L5b:
            java.lang.Thread r9 = java.lang.Thread.currentThread()     // Catch: java.lang.Throwable -> L59
            r9.interrupt()     // Catch: java.lang.Throwable -> L59
            java.io.InterruptedIOException r9 = new java.io.InterruptedIOException     // Catch: java.lang.Throwable -> L59
            r9.<init>()     // Catch: java.lang.Throwable -> L59
            throw r9     // Catch: java.lang.Throwable -> L59
        L68:
            monitor-exit(r8)
            throw r9
        L6a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: gn.f.s(int, boolean, ln.e, long):void");
    }

    public final void v(int i10, gn.b bVar) {
        cn.c cVar = this.f15558i;
        cVar.c(new e(this.f15553d + '[' + i10 + "] writeSynReset", this, i10, bVar), 0L);
    }

    public final void y(int i10, long j10) {
        cn.c cVar = this.f15558i;
        cVar.c(new C0278f(this.f15553d + '[' + i10 + "] windowUpdate", this, i10, j10), 0L);
    }
}
