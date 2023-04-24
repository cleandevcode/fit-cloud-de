package dn;

import ih.v;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import zm.a0;
import zm.m;
import zm.u;
import zm.w;

/* loaded from: classes2.dex */
public final class e implements zm.d {

    /* renamed from: a */
    public final j f13214a;

    /* renamed from: b */
    public final m f13215b;

    /* renamed from: c */
    public final c f13216c;

    /* renamed from: d */
    public final AtomicBoolean f13217d;

    /* renamed from: e */
    public Object f13218e;

    /* renamed from: f */
    public d f13219f;

    /* renamed from: g */
    public h f13220g;

    /* renamed from: h */
    public boolean f13221h;

    /* renamed from: i */
    public dn.c f13222i;

    /* renamed from: j */
    public boolean f13223j;

    /* renamed from: k */
    public boolean f13224k;

    /* renamed from: l */
    public boolean f13225l;

    /* renamed from: m */
    public volatile boolean f13226m;

    /* renamed from: n */
    public volatile dn.c f13227n;

    /* renamed from: o */
    public volatile h f13228o;

    /* renamed from: p */
    public final u f13229p;

    /* renamed from: q */
    public final w f13230q;

    /* renamed from: r */
    public final boolean f13231r;

    /* loaded from: classes2.dex */
    public final class a implements Runnable {

        /* renamed from: a */
        public volatile AtomicInteger f13232a = new AtomicInteger(0);

        /* renamed from: b */
        public final zm.e f13233b;

        public a(zm.e eVar) {
            e.this = r1;
            this.f13233b = eVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            e eVar;
            StringBuilder a10 = android.support.v4.media.d.a("OkHttp ");
            a10.append(e.this.f13230q.f32751b.f());
            String sb2 = a10.toString();
            Thread currentThread = Thread.currentThread();
            gm.l.e(currentThread, "currentThread");
            String name = currentThread.getName();
            currentThread.setName(sb2);
            try {
                e.this.f13216c.h();
                boolean z10 = false;
                try {
                } catch (IOException e10) {
                    e = e10;
                } catch (Throwable th2) {
                    th = th2;
                }
                try {
                    this.f13233b.a(e.this, e.this.e());
                    eVar = e.this;
                } catch (IOException e11) {
                    e = e11;
                    z10 = true;
                    if (z10) {
                        hn.k.f16188c.getClass();
                        hn.k.f16186a.getClass();
                        hn.k.i(4, "Callback failure for " + e.a(e.this), e);
                    } else {
                        this.f13233b.b(e.this, e);
                    }
                    eVar = e.this;
                    eVar.f13229p.f32697a.b(this);
                } catch (Throwable th3) {
                    th = th3;
                    z10 = true;
                    e.this.cancel();
                    if (!z10) {
                        IOException iOException = new IOException("canceled due to " + th);
                        v.b(iOException, th);
                        this.f13233b.b(e.this, iOException);
                    }
                    throw th;
                }
                eVar.f13229p.f32697a.b(this);
            } finally {
                currentThread.setName(name);
            }
        }
    }

    /* loaded from: classes2.dex */
    public static final class b extends WeakReference<e> {

        /* renamed from: a */
        public final Object f13235a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(e eVar, Object obj) {
            super(eVar);
            gm.l.f(eVar, "referent");
            this.f13235a = obj;
        }
    }

    /* loaded from: classes2.dex */
    public static final class c extends ln.b {
        public c() {
            e.this = r1;
        }

        @Override // ln.b
        public final void k() {
            e.this.cancel();
        }
    }

    public e(u uVar, w wVar, boolean z10) {
        gm.l.f(uVar, "client");
        gm.l.f(wVar, "originalRequest");
        this.f13229p = uVar;
        this.f13230q = wVar;
        this.f13231r = z10;
        this.f13214a = (j) uVar.f32698b.f29489a;
        this.f13215b = uVar.f32701e.a(this);
        c cVar = new c();
        cVar.g(0, TimeUnit.MILLISECONDS);
        tl.l lVar = tl.l.f28297a;
        this.f13216c = cVar;
        this.f13217d = new AtomicBoolean();
        this.f13225l = true;
    }

    public static final String a(e eVar) {
        String str;
        String str2;
        StringBuilder sb2 = new StringBuilder();
        if (eVar.f13226m) {
            str = "canceled ";
        } else {
            str = "";
        }
        sb2.append(str);
        if (eVar.f13231r) {
            str2 = "web socket";
        } else {
            str2 = "call";
        }
        sb2.append(str2);
        sb2.append(" to ");
        sb2.append(eVar.f13230q.f32751b.f());
        return sb2.toString();
    }

    public final void b(h hVar) {
        boolean z10;
        byte[] bArr = an.c.f635a;
        if (this.f13220g == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            this.f13220g = hVar;
            hVar.f13254o.add(new b(this, this.f13218e));
            return;
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    public final <E extends IOException> E c(E e10) {
        E e11;
        m mVar;
        Socket h10;
        boolean z10;
        byte[] bArr = an.c.f635a;
        h hVar = this.f13220g;
        if (hVar != null) {
            synchronized (hVar) {
                h10 = h();
            }
            if (this.f13220g == null) {
                if (h10 != null) {
                    an.c.c(h10);
                }
                this.f13215b.getClass();
            } else {
                if (h10 == null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (!z10) {
                    throw new IllegalStateException("Check failed.".toString());
                }
            }
        }
        if (this.f13221h || !this.f13216c.i()) {
            e11 = e10;
        } else {
            e11 = new InterruptedIOException("timeout");
            if (e10 != null) {
                e11.initCause(e10);
            }
        }
        if (e10 != null) {
            mVar = this.f13215b;
            gm.l.c(e11);
        } else {
            mVar = this.f13215b;
        }
        mVar.getClass();
        return e11;
    }

    @Override // zm.d
    public final void cancel() {
        Socket socket;
        if (this.f13226m) {
            return;
        }
        this.f13226m = true;
        dn.c cVar = this.f13227n;
        if (cVar != null) {
            cVar.f13192f.cancel();
        }
        h hVar = this.f13228o;
        if (hVar != null && (socket = hVar.f13241b) != null) {
            an.c.c(socket);
        }
        this.f13215b.getClass();
    }

    public final Object clone() {
        return new e(this.f13229p, this.f13230q, this.f13231r);
    }

    public final void d(boolean z10) {
        dn.c cVar;
        synchronized (this) {
            if (this.f13225l) {
                tl.l lVar = tl.l.f28297a;
            } else {
                throw new IllegalStateException("released".toString());
            }
        }
        if (z10 && (cVar = this.f13227n) != null) {
            cVar.f13192f.cancel();
            cVar.f13189c.f(cVar, true, true, null);
        }
        this.f13222i = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x008e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final zm.a0 e() {
        /*
            r10 = this;
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            zm.u r0 = r10.f13229p
            java.util.List<zm.r> r0 = r0.f32699c
            ul.n.D(r0, r2)
            en.i r0 = new en.i
            zm.u r1 = r10.f13229p
            r0.<init>(r1)
            r2.add(r0)
            en.a r0 = new en.a
            zm.u r1 = r10.f13229p
            zm.j r1 = r1.f32706j
            r0.<init>(r1)
            r2.add(r0)
            bn.a r0 = new bn.a
            zm.u r1 = r10.f13229p
            r1.getClass()
            r0.<init>()
            r2.add(r0)
            dn.a r0 = dn.a.f13182a
            r2.add(r0)
            boolean r0 = r10.f13231r
            if (r0 != 0) goto L3f
            zm.u r0 = r10.f13229p
            java.util.List<zm.r> r0 = r0.f32700d
            ul.n.D(r0, r2)
        L3f:
            en.b r0 = new en.b
            boolean r1 = r10.f13231r
            r0.<init>(r1)
            r2.add(r0)
            en.g r9 = new en.g
            r3 = 0
            r4 = 0
            zm.w r5 = r10.f13230q
            zm.u r0 = r10.f13229p
            int r6 = r0.f32718v
            int r7 = r0.f32719w
            int r8 = r0.f32720x
            r0 = r9
            r1 = r10
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            r0 = 0
            r1 = 0
            zm.w r2 = r10.f13230q     // Catch: java.lang.Throwable -> L77 java.io.IOException -> L79
            zm.a0 r2 = r9.c(r2)     // Catch: java.lang.Throwable -> L77 java.io.IOException -> L79
            boolean r3 = r10.f13226m     // Catch: java.lang.Throwable -> L77 java.io.IOException -> L79
            if (r3 != 0) goto L6c
            r10.g(r1)
            return r2
        L6c:
            an.c.b(r2)     // Catch: java.lang.Throwable -> L77 java.io.IOException -> L79
            java.io.IOException r2 = new java.io.IOException     // Catch: java.lang.Throwable -> L77 java.io.IOException -> L79
            java.lang.String r3 = "Canceled"
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L77 java.io.IOException -> L79
            throw r2     // Catch: java.lang.Throwable -> L77 java.io.IOException -> L79
        L77:
            r2 = move-exception
            goto L8c
        L79:
            r0 = move-exception
            java.io.IOException r0 = r10.g(r0)     // Catch: java.lang.Throwable -> L89
            if (r0 != 0) goto L88
            java.lang.NullPointerException r0 = new java.lang.NullPointerException     // Catch: java.lang.Throwable -> L89
            java.lang.String r2 = "null cannot be cast to non-null type kotlin.Throwable"
            r0.<init>(r2)     // Catch: java.lang.Throwable -> L89
            throw r0     // Catch: java.lang.Throwable -> L89
        L88:
            throw r0     // Catch: java.lang.Throwable -> L89
        L89:
            r0 = move-exception
            r2 = r0
            r0 = 1
        L8c:
            if (r0 != 0) goto L91
            r10.g(r1)
        L91:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: dn.e.e():zm.a0");
    }

    @Override // zm.d
    public final a0 execute() {
        if (this.f13217d.compareAndSet(false, true)) {
            this.f13216c.h();
            hn.k.f16188c.getClass();
            this.f13218e = hn.k.f16186a.g();
            this.f13215b.getClass();
            try {
                zm.k kVar = this.f13229p.f32697a;
                synchronized (kVar) {
                    kVar.f32636d.add(this);
                }
                return e();
            } finally {
                zm.k kVar2 = this.f13229p.f32697a;
                kVar2.getClass();
                kVar2.a(kVar2.f32636d, this);
            }
        }
        throw new IllegalStateException("Already Executed".toString());
    }

    /* JADX WARN: Removed duplicated region for block: B:73:0x0023 A[Catch: all -> 0x0019, TryCatch #1 {all -> 0x0019, blocks: (B:64:0x0014, B:73:0x0023, B:75:0x0027, B:76:0x0029, B:78:0x002d, B:83:0x0036, B:85:0x003a, B:90:0x0043, B:70:0x001d), top: B:110:0x0014 }] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0027 A[Catch: all -> 0x0019, TryCatch #1 {all -> 0x0019, blocks: (B:64:0x0014, B:73:0x0023, B:75:0x0027, B:76:0x0029, B:78:0x002d, B:83:0x0036, B:85:0x003a, B:90:0x0043, B:70:0x001d), top: B:110:0x0014 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final <E extends java.io.IOException> E f(dn.c r3, boolean r4, boolean r5, E r6) {
        /*
            r2 = this;
            java.lang.String r0 = "exchange"
            gm.l.f(r3, r0)
            dn.c r0 = r2.f13227n
            boolean r3 = gm.l.a(r3, r0)
            r0 = 1
            r3 = r3 ^ r0
            if (r3 == 0) goto L10
            return r6
        L10:
            monitor-enter(r2)
            r3 = 0
            if (r4 == 0) goto L1b
            boolean r1 = r2.f13223j     // Catch: java.lang.Throwable -> L19
            if (r1 != 0) goto L21
            goto L1b
        L19:
            r3 = move-exception
            goto L62
        L1b:
            if (r5 == 0) goto L42
            boolean r1 = r2.f13224k     // Catch: java.lang.Throwable -> L19
            if (r1 == 0) goto L42
        L21:
            if (r4 == 0) goto L25
            r2.f13223j = r3     // Catch: java.lang.Throwable -> L19
        L25:
            if (r5 == 0) goto L29
            r2.f13224k = r3     // Catch: java.lang.Throwable -> L19
        L29:
            boolean r4 = r2.f13223j     // Catch: java.lang.Throwable -> L19
            if (r4 != 0) goto L33
            boolean r5 = r2.f13224k     // Catch: java.lang.Throwable -> L19
            if (r5 != 0) goto L33
            r5 = 1
            goto L34
        L33:
            r5 = 0
        L34:
            if (r4 != 0) goto L3f
            boolean r4 = r2.f13224k     // Catch: java.lang.Throwable -> L19
            if (r4 != 0) goto L3f
            boolean r4 = r2.f13225l     // Catch: java.lang.Throwable -> L19
            if (r4 != 0) goto L3f
            r3 = 1
        L3f:
            r4 = r3
            r3 = r5
            goto L43
        L42:
            r4 = 0
        L43:
            tl.l r5 = tl.l.f28297a     // Catch: java.lang.Throwable -> L19
            monitor-exit(r2)
            if (r3 == 0) goto L5a
            r3 = 0
            r2.f13227n = r3
            dn.h r3 = r2.f13220g
            if (r3 == 0) goto L5a
            monitor-enter(r3)
            int r5 = r3.f13251l     // Catch: java.lang.Throwable -> L57
            int r5 = r5 + r0
            r3.f13251l = r5     // Catch: java.lang.Throwable -> L57
            monitor-exit(r3)
            goto L5a
        L57:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
        L5a:
            if (r4 == 0) goto L61
            java.io.IOException r3 = r2.c(r6)
            return r3
        L61:
            return r6
        L62:
            monitor-exit(r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: dn.e.f(dn.c, boolean, boolean, java.io.IOException):java.io.IOException");
    }

    public final IOException g(IOException iOException) {
        boolean z10;
        synchronized (this) {
            z10 = false;
            if (this.f13225l) {
                this.f13225l = false;
                if (!this.f13223j && !this.f13224k) {
                    z10 = true;
                }
            }
            tl.l lVar = tl.l.f28297a;
        }
        return z10 ? c(iOException) : iOException;
    }

    public final Socket h() {
        boolean z10;
        h hVar = this.f13220g;
        gm.l.c(hVar);
        byte[] bArr = an.c.f635a;
        ArrayList arrayList = hVar.f13254o;
        Iterator it = arrayList.iterator();
        boolean z11 = false;
        int i10 = 0;
        while (true) {
            if (it.hasNext()) {
                if (gm.l.a((e) ((Reference) it.next()).get(), this)) {
                    break;
                }
                i10++;
            } else {
                i10 = -1;
                break;
            }
        }
        if (i10 != -1) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            arrayList.remove(i10);
            this.f13220g = null;
            if (arrayList.isEmpty()) {
                hVar.f13255p = System.nanoTime();
                j jVar = this.f13214a;
                jVar.getClass();
                byte[] bArr2 = an.c.f635a;
                if (!hVar.f13248i && jVar.f13262e != 0) {
                    jVar.f13259b.c(jVar.f13260c, 0L);
                } else {
                    hVar.f13248i = true;
                    jVar.f13261d.remove(hVar);
                    if (jVar.f13261d.isEmpty()) {
                        jVar.f13259b.a();
                    }
                    z11 = true;
                }
                if (z11) {
                    Socket socket = hVar.f13242c;
                    gm.l.c(socket);
                    return socket;
                }
            }
            return null;
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    @Override // zm.d
    public final w j() {
        return this.f13230q;
    }

    @Override // zm.d
    public final boolean k() {
        return this.f13226m;
    }

    @Override // zm.d
    public final void s(zm.e eVar) {
        a aVar;
        if (this.f13217d.compareAndSet(false, true)) {
            hn.k.f16188c.getClass();
            this.f13218e = hn.k.f16186a.g();
            this.f13215b.getClass();
            zm.k kVar = this.f13229p.f32697a;
            a aVar2 = new a(eVar);
            kVar.getClass();
            synchronized (kVar) {
                kVar.f32634b.add(aVar2);
                if (!this.f13231r) {
                    String str = this.f13230q.f32751b.f32661e;
                    Iterator<a> it = kVar.f32635c.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            aVar = it.next();
                            if (gm.l.a(e.this.f13230q.f32751b.f32661e, str)) {
                                break;
                            }
                        } else {
                            Iterator<a> it2 = kVar.f32634b.iterator();
                            while (true) {
                                if (it2.hasNext()) {
                                    aVar = it2.next();
                                    if (gm.l.a(e.this.f13230q.f32751b.f32661e, str)) {
                                        break;
                                    }
                                } else {
                                    aVar = null;
                                    break;
                                }
                            }
                        }
                    }
                    if (aVar != null) {
                        aVar2.f13232a = aVar.f13232a;
                    }
                }
                tl.l lVar = tl.l.f28297a;
            }
            kVar.c();
            return;
        }
        throw new IllegalStateException("Already Executed".toString());
    }
}
