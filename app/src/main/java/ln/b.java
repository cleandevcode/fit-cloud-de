package ln;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public class b extends z {

    /* renamed from: h */
    public static final long f20087h;

    /* renamed from: i */
    public static final long f20088i;

    /* renamed from: j */
    public static b f20089j;

    /* renamed from: e */
    public boolean f20090e;

    /* renamed from: f */
    public b f20091f;

    /* renamed from: g */
    public long f20092g;

    /* loaded from: classes2.dex */
    public static final class a {
        public static b a() {
            b bVar = b.f20089j;
            gm.l.c(bVar);
            b bVar2 = bVar.f20091f;
            long nanoTime = System.nanoTime();
            if (bVar2 == null) {
                b.class.wait(b.f20087h);
                b bVar3 = b.f20089j;
                gm.l.c(bVar3);
                if (bVar3.f20091f != null || System.nanoTime() - nanoTime < b.f20088i) {
                    return null;
                }
                return b.f20089j;
            }
            long j10 = bVar2.f20092g - nanoTime;
            if (j10 > 0) {
                long j11 = j10 / 1000000;
                b.class.wait(j11, (int) (j10 - (1000000 * j11)));
                return null;
            }
            b bVar4 = b.f20089j;
            gm.l.c(bVar4);
            bVar4.f20091f = bVar2.f20091f;
            bVar2.f20091f = null;
            return bVar2;
        }
    }

    /* renamed from: ln.b$b */
    /* loaded from: classes2.dex */
    public static final class C0363b extends Thread {
        public C0363b() {
            super("Okio Watchdog");
            setDaemon(true);
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public final void run() {
            b a10;
            while (true) {
                try {
                    synchronized (b.class) {
                        b bVar = b.f20089j;
                        a10 = a.a();
                        if (a10 == b.f20089j) {
                            b.f20089j = null;
                            return;
                        }
                        tl.l lVar = tl.l.f28297a;
                    }
                    if (a10 != null) {
                        a10.k();
                    }
                } catch (InterruptedException unused) {
                }
            }
        }
    }

    static {
        long millis = TimeUnit.SECONDS.toMillis(60L);
        f20087h = millis;
        f20088i = TimeUnit.MILLISECONDS.toNanos(millis);
    }

    /* JADX WARN: Removed duplicated region for block: B:74:0x0065 A[Catch: all -> 0x007e, TryCatch #0 {, blocks: (B:52:0x0010, B:54:0x0016, B:56:0x001c, B:57:0x002b, B:60:0x0033, B:62:0x003f, B:65:0x0047, B:66:0x004c, B:68:0x0053, B:72:0x005d, B:74:0x0065, B:75:0x0068, B:64:0x0043, B:78:0x006c, B:79:0x0071, B:80:0x0072, B:81:0x007d), top: B:85:0x0010 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void h() {
        /*
            r10 = this;
            long r0 = r10.f20147c
            boolean r2 = r10.f20145a
            r3 = 0
            int r5 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r5 != 0) goto Ld
            if (r2 != 0) goto Ld
            return
        Ld:
            java.lang.Class<ln.b> r3 = ln.b.class
            monitor-enter(r3)
            boolean r4 = r10.f20090e     // Catch: java.lang.Throwable -> L7e
            r6 = 1
            r4 = r4 ^ r6
            if (r4 == 0) goto L72
            r10.f20090e = r6     // Catch: java.lang.Throwable -> L7e
            ln.b r4 = ln.b.f20089j     // Catch: java.lang.Throwable -> L7e
            if (r4 != 0) goto L2b
            ln.b r4 = new ln.b     // Catch: java.lang.Throwable -> L7e
            r4.<init>()     // Catch: java.lang.Throwable -> L7e
            ln.b.f20089j = r4     // Catch: java.lang.Throwable -> L7e
            ln.b$b r4 = new ln.b$b     // Catch: java.lang.Throwable -> L7e
            r4.<init>()     // Catch: java.lang.Throwable -> L7e
            r4.start()     // Catch: java.lang.Throwable -> L7e
        L2b:
            long r6 = java.lang.System.nanoTime()     // Catch: java.lang.Throwable -> L7e
            if (r5 == 0) goto L3d
            if (r2 == 0) goto L3d
            long r4 = r10.c()     // Catch: java.lang.Throwable -> L7e
            long r4 = r4 - r6
            long r0 = java.lang.Math.min(r0, r4)     // Catch: java.lang.Throwable -> L7e
            goto L3f
        L3d:
            if (r5 == 0) goto L41
        L3f:
            long r0 = r0 + r6
            goto L47
        L41:
            if (r2 == 0) goto L6c
            long r0 = r10.c()     // Catch: java.lang.Throwable -> L7e
        L47:
            r10.f20092g = r0     // Catch: java.lang.Throwable -> L7e
            long r0 = r0 - r6
            ln.b r2 = ln.b.f20089j     // Catch: java.lang.Throwable -> L7e
        L4c:
            gm.l.c(r2)     // Catch: java.lang.Throwable -> L7e
            ln.b r4 = r2.f20091f     // Catch: java.lang.Throwable -> L7e
            if (r4 == 0) goto L5d
            long r8 = r4.f20092g     // Catch: java.lang.Throwable -> L7e
            long r8 = r8 - r6
            int r5 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            if (r5 >= 0) goto L5b
            goto L5d
        L5b:
            r2 = r4
            goto L4c
        L5d:
            r10.f20091f = r4     // Catch: java.lang.Throwable -> L7e
            r2.f20091f = r10     // Catch: java.lang.Throwable -> L7e
            ln.b r0 = ln.b.f20089j     // Catch: java.lang.Throwable -> L7e
            if (r2 != r0) goto L68
            r3.notify()     // Catch: java.lang.Throwable -> L7e
        L68:
            tl.l r0 = tl.l.f28297a     // Catch: java.lang.Throwable -> L7e
            monitor-exit(r3)
            return
        L6c:
            java.lang.AssertionError r0 = new java.lang.AssertionError     // Catch: java.lang.Throwable -> L7e
            r0.<init>()     // Catch: java.lang.Throwable -> L7e
            throw r0     // Catch: java.lang.Throwable -> L7e
        L72:
            java.lang.String r0 = "Unbalanced enter/exit"
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L7e
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L7e
            r1.<init>(r0)     // Catch: java.lang.Throwable -> L7e
            throw r1     // Catch: java.lang.Throwable -> L7e
        L7e:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ln.b.h():void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x0013, code lost:
        r1.f20091f = r4.f20091f;
        r4.f20091f = null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean i() {
        /*
            r4 = this;
            java.lang.Class<ln.b> r0 = ln.b.class
            monitor-enter(r0)
            boolean r1 = r4.f20090e     // Catch: java.lang.Throwable -> L20
            r2 = 0
            if (r1 != 0) goto L9
            goto L1e
        L9:
            r4.f20090e = r2     // Catch: java.lang.Throwable -> L20
            ln.b r1 = ln.b.f20089j     // Catch: java.lang.Throwable -> L20
        Ld:
            if (r1 == 0) goto L1d
            ln.b r3 = r1.f20091f     // Catch: java.lang.Throwable -> L20
            if (r3 != r4) goto L1b
            ln.b r3 = r4.f20091f     // Catch: java.lang.Throwable -> L20
            r1.f20091f = r3     // Catch: java.lang.Throwable -> L20
            r1 = 0
            r4.f20091f = r1     // Catch: java.lang.Throwable -> L20
            goto L1e
        L1b:
            r1 = r3
            goto Ld
        L1d:
            r2 = 1
        L1e:
            monitor-exit(r0)
            return r2
        L20:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: ln.b.i():boolean");
    }

    public IOException j(IOException iOException) {
        InterruptedIOException interruptedIOException = new InterruptedIOException("timeout");
        if (iOException != null) {
            interruptedIOException.initCause(iOException);
        }
        return interruptedIOException;
    }

    public void k() {
    }
}
