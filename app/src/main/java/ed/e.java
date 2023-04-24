package ed;

import java.util.Locale;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes.dex */
public class e {

    /* renamed from: k */
    public static boolean f13563k = true;

    /* renamed from: l */
    public static boolean f13564l = true;

    /* renamed from: b */
    public volatile int f13566b;

    /* renamed from: c */
    public volatile int f13567c;

    /* renamed from: d */
    public b f13568d;

    /* renamed from: e */
    public a f13569e;

    /* renamed from: f */
    public c f13570f;

    /* renamed from: g */
    public CopyOnWriteArrayList f13571g;

    /* renamed from: h */
    public volatile ed.b f13572h;

    /* renamed from: i */
    public volatile boolean f13573i;

    /* renamed from: a */
    public Object f13565a = new Object();

    /* renamed from: j */
    public final Object f13574j = new Object();

    /* loaded from: classes.dex */
    public class a extends ud.b<ed.b> {
        public a() {
            e.this = r1;
        }

        /* JADX WARN: Removed duplicated region for block: B:57:0x0018  */
        /* JADX WARN: Removed duplicated region for block: B:83:0x0065  */
        /* JADX WARN: Removed duplicated region for block: B:90:0x002c A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:94:0x000e A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:97:? A[RETURN, SYNTHETIC] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:67:0x0030 -> B:68:0x0035). Please submit an issue!!! */
        @Override // java.lang.Thread, java.lang.Runnable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void run() {
            /*
                r8 = this;
                java.lang.String r0 = "AckThread"
                r8.setName(r0)
                boolean r0 = ed.e.f13564l
                if (r0 == 0) goto Ld
                java.lang.String r0 = "AckThread is running..."
                r1 = r8
                goto L35
            Ld:
                r0 = r8
            Le:
                java.lang.Thread r1 = java.lang.Thread.currentThread()
                boolean r1 = r1.isInterrupted()
                if (r1 != 0) goto L61
                boolean r1 = r0.f28684a
                if (r1 != 0) goto L61
                java.util.concurrent.LinkedBlockingDeque<T> r1 = r0.f28685b     // Catch: java.lang.InterruptedException -> L23
                java.lang.Object r1 = r1.take()     // Catch: java.lang.InterruptedException -> L23
                goto L28
            L23:
                r1 = move-exception
                r1.printStackTrace()
                r1 = 0
            L28:
                ed.b r1 = (ed.b) r1
                if (r1 == 0) goto Le
                byte[] r2 = r1.f13549e
                if (r2 != 0) goto L3a
                java.lang.String r1 = "payload == null"
                r7 = r1
                r1 = r0
                r0 = r7
            L35:
                ge.b.n(r0)
                r0 = r1
                goto Le
            L3a:
                ed.e r2 = ed.e.this
                java.lang.Object r2 = r2.f13565a
                monitor-enter(r2)
                ed.e r3 = ed.e.this     // Catch: java.lang.Throwable -> L54
                int r3 = r3.f13566b     // Catch: java.lang.Throwable -> L54
                r1.f13545a = r3     // Catch: java.lang.Throwable -> L54
                ed.e r3 = ed.e.this     // Catch: java.lang.Throwable -> L54
                int r4 = r3.f13566b     // Catch: java.lang.Throwable -> L54
                r5 = 1
                r6 = 255(0xff, float:3.57E-43)
                if (r4 == r6) goto L56
                int r4 = r3.f13566b     // Catch: java.lang.Throwable -> L54
                int r4 = r4 + r5
                r3.f13566b = r4     // Catch: java.lang.Throwable -> L54
                goto L58
            L54:
                r0 = move-exception
                goto L5f
            L56:
                r3.f13566b = r5     // Catch: java.lang.Throwable -> L54
            L58:
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L54
                ed.e r2 = ed.e.this
                r2.f(r1)
                goto Le
            L5f:
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L54
                throw r0
            L61:
                boolean r0 = ed.e.f13564l
                if (r0 == 0) goto L6a
                java.lang.String r0 = "TxThread stopped"
                ge.b.n(r0)
            L6a:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: ed.e.a.run():void");
        }
    }

    /* loaded from: classes.dex */
    public class b extends ud.b<ed.b> {
        public b() {
            e.this = r1;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public final void run() {
            Object obj;
            boolean z10;
            setName("CommandThread");
            if (e.f13564l) {
                ge.b.n("CommandThread is running...");
            }
            e.this.f13572h = null;
            while (!Thread.currentThread().isInterrupted() && !this.f28684a) {
                try {
                    obj = this.f28685b.take();
                } catch (InterruptedException e10) {
                    e10.printStackTrace();
                    obj = null;
                }
                ed.b bVar = (ed.b) obj;
                if (bVar != null) {
                    if (bVar.f13547c != 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (z10) {
                        e.this.f13572h = bVar;
                    }
                    synchronized (e.this.f13565a) {
                        try {
                            bVar.f13545a = e.this.f13566b;
                            e eVar = e.this;
                            if (eVar.f13566b != 255) {
                                eVar.f13566b++;
                            } else {
                                eVar.f13566b = 1;
                            }
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                    if (bVar.f13546b == 1) {
                        e.this.f(bVar);
                    } else {
                        e.this.f13573i = false;
                        int i10 = 0;
                        boolean z11 = false;
                        while (e.this.f(bVar)) {
                            synchronized (e.this.f13574j) {
                                if (!e.this.f13573i) {
                                    try {
                                        e.this.f13574j.wait(500L);
                                    } catch (InterruptedException e11) {
                                        ge.b.p(e11.toString());
                                    }
                                    z11 = !e.this.f13573i;
                                    boolean z12 = e.this.f13573i;
                                    if (!e.this.f13573i) {
                                        ge.b.o(String.format(Locale.US, "ACK timeout for %d ms, times=%d", 500, Integer.valueOf(i10)), e.f13564l);
                                    }
                                }
                            }
                            i10++;
                            if (i10 <= bVar.f13550f) {
                                if (!z11) {
                                    break;
                                }
                            }
                        }
                        continue;
                    }
                }
            }
            e.this.f13572h = null;
            if (e.f13564l) {
                ge.b.n("TxThread stopped");
            }
        }
    }

    /* loaded from: classes.dex */
    public class c extends ud.b<byte[]> {
        public c() {
            e.this = r1;
        }

        /* JADX WARN: Removed duplicated region for block: B:149:0x0051  */
        /* JADX WARN: Removed duplicated region for block: B:150:0x0052  */
        /* JADX WARN: Removed duplicated region for block: B:152:0x0055 A[Catch: all -> 0x01b5, TryCatch #2 {, blocks: (B:128:0x0001, B:132:0x0012, B:141:0x0028, B:143:0x0031, B:146:0x0035, B:152:0x0055, B:154:0x0059, B:155:0x007e, B:157:0x0084, B:159:0x008e, B:160:0x0092, B:163:0x009b, B:175:0x00cc, B:176:0x00d0, B:189:0x00fa, B:167:0x00a2, B:170:0x00a5, B:171:0x00bf, B:172:0x00c3, B:192:0x00fd, B:193:0x00fe, B:229:0x01b0, B:194:0x0104, B:195:0x0127, B:197:0x0130, B:199:0x015a, B:201:0x0160, B:203:0x016a, B:204:0x016e, B:207:0x0177, B:211:0x017e, B:214:0x0182, B:215:0x0186, B:228:0x01af), top: B:238:0x0001 }] */
        /* JADX WARN: Removed duplicated region for block: B:194:0x0104 A[Catch: all -> 0x01b5, TryCatch #2 {, blocks: (B:128:0x0001, B:132:0x0012, B:141:0x0028, B:143:0x0031, B:146:0x0035, B:152:0x0055, B:154:0x0059, B:155:0x007e, B:157:0x0084, B:159:0x008e, B:160:0x0092, B:163:0x009b, B:175:0x00cc, B:176:0x00d0, B:189:0x00fa, B:167:0x00a2, B:170:0x00a5, B:171:0x00bf, B:172:0x00c3, B:192:0x00fd, B:193:0x00fe, B:229:0x01b0, B:194:0x0104, B:195:0x0127, B:197:0x0130, B:199:0x015a, B:201:0x0160, B:203:0x016a, B:204:0x016e, B:207:0x0177, B:211:0x017e, B:214:0x0182, B:215:0x0186, B:228:0x01af), top: B:238:0x0001 }] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final synchronized void a(ed.g r12) {
            /*
                Method dump skipped, instructions count: 440
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: ed.e.c.a(ed.g):void");
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public final void run() {
            Object obj;
            if (e.f13563k) {
                ge.b.d("RxThread is running");
            }
            while (!Thread.currentThread().isInterrupted() && !this.f28684a) {
                try {
                    obj = this.f28685b.take();
                } catch (InterruptedException e10) {
                    e10.printStackTrace();
                    obj = null;
                }
                byte[] bArr = (byte[]) obj;
                if (bArr != null) {
                    int length = bArr.length;
                    int i10 = 0;
                    do {
                        int i11 = length - i10;
                        if (i11 <= 0) {
                            break;
                        }
                        try {
                            byte[] bArr2 = new byte[i11];
                            System.arraycopy(bArr, i10, bArr2, 0, i11);
                            g a10 = g.a(bArr2);
                            if (a10 == null) {
                                break;
                            }
                            a(a10);
                            i10 += a10.f13579b + 4;
                            continue;
                        } catch (Exception e11) {
                            ge.b.p(e11.toString());
                            continue;
                        }
                    } while (i10 < length);
                }
            }
            if (e.f13563k) {
                ge.b.d("RxThread stopped");
            }
        }
    }

    public e() {
        f13563k = rd.b.f25539b;
        f13564l = rd.b.f25540c;
        this.f13571g = new CopyOnWriteArrayList();
    }

    public final void a() {
        if (this.f13570f != null) {
            if (f13564l) {
                ge.b.n("clearRx");
            }
            c cVar = this.f13570f;
            synchronized (cVar.f28685b) {
                cVar.f28685b.clear();
            }
            this.f13570f.f28684a = true;
        }
        if (this.f13568d != null) {
            if (f13564l) {
                ge.b.n("clearTx.");
            }
            b bVar = this.f13568d;
            synchronized (bVar.f28685b) {
                bVar.f28685b.clear();
            }
            synchronized (this.f13574j) {
                this.f13573i = true;
                this.f13574j.notifyAll();
            }
        }
        if (this.f13569e != null) {
            if (f13564l) {
                ge.b.n("clearAck.");
            }
            a aVar = this.f13569e;
            synchronized (aVar.f28685b) {
                aVar.f28685b.clear();
            }
            synchronized (this.f13574j) {
                this.f13573i = true;
                this.f13574j.notifyAll();
            }
        }
    }

    public final void b(f fVar) {
        synchronized (this.f13571g) {
            if (this.f13571g == null) {
                this.f13571g = new CopyOnWriteArrayList();
            }
            if (!this.f13571g.contains(fVar)) {
                this.f13571g.add(fVar);
            }
            if (f13564l) {
                ge.b.n("callback's size=" + this.f13571g.size());
            }
        }
    }

    public final void c(short s10) {
        int i10 = 0;
        ed.b bVar = new ed.b(1, s10, (short) 0, new byte[]{0, 0, (byte) (s10 & 255), (byte) ((s10 >> 8) & 255), 0});
        synchronized (this) {
            a aVar = this.f13569e;
            if (aVar == null) {
                if (aVar != null) {
                    aVar.f28684a = true;
                }
                if (f13564l) {
                    ge.b.n("startAckThread.");
                }
                a aVar2 = new a();
                this.f13569e = aVar2;
                aVar2.start();
            }
            if (this.f13569e != null) {
                if (f13564l) {
                    Locale locale = Locale.US;
                    Object[] objArr = new Object[3];
                    objArr[0] = Integer.valueOf(bVar.f13546b);
                    byte[] bArr = bVar.f13549e;
                    if (bArr != null) {
                        i10 = bArr.length;
                    }
                    objArr[1] = Integer.valueOf(i10);
                    objArr[2] = he.a.a(bVar.f13549e);
                    ge.b.n(String.format(locale, "<< writeType=%d, (%d)%s", objArr));
                }
                a aVar3 = this.f13569e;
                synchronized (aVar3.f28685b) {
                    aVar3.f28685b.add(bVar);
                }
            }
        }
    }

    public final boolean d(short s10, byte[] bArr) {
        int i10;
        if (bArr != null) {
            i10 = bArr.length;
        } else {
            i10 = 0;
        }
        byte[] bArr2 = new byte[i10 + 2];
        bArr2[0] = (byte) (s10 & 255);
        bArr2[1] = (byte) ((s10 >> 8) & 255);
        if (i10 > 0) {
            System.arraycopy(bArr, 0, bArr2, 2, i10);
        }
        return e(new ed.b(2, s10, (short) 0, bArr2));
    }

    public final synchronized boolean e(ed.b bVar) {
        int i10 = 0;
        if (bVar == null) {
            return false;
        }
        b bVar2 = this.f13568d;
        if (bVar2 == null) {
            if (bVar2 != null) {
                bVar2.f28684a = true;
            }
            if (f13564l) {
                ge.b.n("startTxSchedule.");
            }
            b bVar3 = new b();
            this.f13568d = bVar3;
            bVar3.start();
        }
        if (this.f13568d == null) {
            return false;
        }
        if (f13564l) {
            Locale locale = Locale.US;
            Object[] objArr = new Object[3];
            objArr[0] = Integer.valueOf(bVar.f13546b);
            byte[] bArr = bVar.f13549e;
            if (bArr != null) {
                i10 = bArr.length;
            }
            objArr[1] = Integer.valueOf(i10);
            objArr[2] = he.a.a(bVar.f13549e);
            ge.b.n(String.format(locale, "<< writeType=%d, (%d)%s", objArr));
        }
        b bVar4 = this.f13568d;
        synchronized (bVar4.f28685b) {
            bVar4.f28685b.add(bVar);
        }
        return true;
    }

    public synchronized boolean f(ed.b bVar) {
        throw null;
    }

    public final void g(f fVar) {
        synchronized (this.f13571g) {
            CopyOnWriteArrayList copyOnWriteArrayList = this.f13571g;
            if (copyOnWriteArrayList != null) {
                copyOnWriteArrayList.remove(fVar);
            }
        }
    }
}
