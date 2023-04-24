package ao;

import androidx.appcompat.widget.e2;
import ao.z;
import java.io.IOException;
import java.util.ArrayList;
import zm.d;
import zm.n;
import zm.q;
import zm.t;
import zm.w;

/* loaded from: classes2.dex */
public final class s<T> implements ao.b<T> {

    /* renamed from: a */
    public final a0 f3844a;

    /* renamed from: b */
    public final Object[] f3845b;

    /* renamed from: c */
    public final d.a f3846c;

    /* renamed from: d */
    public final f<zm.c0, T> f3847d;

    /* renamed from: e */
    public volatile boolean f3848e;

    /* renamed from: f */
    public zm.d f3849f;

    /* renamed from: g */
    public Throwable f3850g;

    /* renamed from: h */
    public boolean f3851h;

    /* loaded from: classes2.dex */
    public class a implements zm.e {

        /* renamed from: a */
        public final /* synthetic */ d f3852a;

        public a(d dVar) {
            s.this = r1;
            this.f3852a = dVar;
        }

        @Override // zm.e
        public final void a(dn.e eVar, zm.a0 a0Var) {
            try {
                try {
                    this.f3852a.a(s.this, s.this.c(a0Var));
                } catch (Throwable th2) {
                    h0.n(th2);
                    th2.printStackTrace();
                }
            } catch (Throwable th3) {
                h0.n(th3);
                try {
                    this.f3852a.b(s.this, th3);
                } catch (Throwable th4) {
                    h0.n(th4);
                    th4.printStackTrace();
                }
            }
        }

        @Override // zm.e
        public final void b(dn.e eVar, IOException iOException) {
            try {
                this.f3852a.b(s.this, iOException);
            } catch (Throwable th2) {
                h0.n(th2);
                th2.printStackTrace();
            }
        }
    }

    /* loaded from: classes2.dex */
    public static final class b extends zm.c0 {

        /* renamed from: b */
        public final zm.c0 f3854b;

        /* renamed from: c */
        public final ln.s f3855c;

        /* renamed from: d */
        public IOException f3856d;

        /* loaded from: classes2.dex */
        public class a extends ln.j {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(ln.g gVar) {
                super(gVar);
                b.this = r1;
            }

            @Override // ln.y
            public final long V(ln.e eVar, long j10) {
                try {
                    gm.l.f(eVar, "sink");
                    return this.f20105a.V(eVar, j10);
                } catch (IOException e10) {
                    b.this.f3856d = e10;
                    throw e10;
                }
            }
        }

        public b(zm.c0 c0Var) {
            this.f3854b = c0Var;
            this.f3855c = new ln.s(new a(c0Var.h()));
        }

        @Override // zm.c0
        public final long a() {
            return this.f3854b.a();
        }

        @Override // zm.c0
        public final zm.s b() {
            return this.f3854b.b();
        }

        @Override // zm.c0, java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            this.f3854b.close();
        }

        @Override // zm.c0
        public final ln.g h() {
            return this.f3855c;
        }
    }

    /* loaded from: classes2.dex */
    public static final class c extends zm.c0 {

        /* renamed from: b */
        public final zm.s f3858b;

        /* renamed from: c */
        public final long f3859c;

        public c(zm.s sVar, long j10) {
            this.f3858b = sVar;
            this.f3859c = j10;
        }

        @Override // zm.c0
        public final long a() {
            return this.f3859c;
        }

        @Override // zm.c0
        public final zm.s b() {
            return this.f3858b;
        }

        @Override // zm.c0
        public final ln.g h() {
            throw new IllegalStateException("Cannot read raw response body of a converted body.");
        }
    }

    public s(a0 a0Var, Object[] objArr, d.a aVar, f<zm.c0, T> fVar) {
        this.f3844a = a0Var;
        this.f3845b = objArr;
        this.f3846c = aVar;
        this.f3847d = fVar;
    }

    public final zm.d a() {
        q.a aVar;
        zm.q qVar;
        d.a aVar2 = this.f3846c;
        a0 a0Var = this.f3844a;
        Object[] objArr = this.f3845b;
        w<?>[] wVarArr = a0Var.f3764j;
        int length = objArr.length;
        if (length == wVarArr.length) {
            z zVar = new z(a0Var.f3757c, a0Var.f3756b, a0Var.f3758d, a0Var.f3759e, a0Var.f3760f, a0Var.f3761g, a0Var.f3762h, a0Var.f3763i);
            if (a0Var.f3765k) {
                length--;
            }
            ArrayList arrayList = new ArrayList(length);
            for (int i10 = 0; i10 < length; i10++) {
                arrayList.add(objArr[i10]);
                wVarArr[i10].a(zVar, objArr[i10]);
            }
            q.a aVar3 = zVar.f3912d;
            if (aVar3 != null) {
                qVar = aVar3.a();
            } else {
                zm.q qVar2 = zVar.f3910b;
                String str = zVar.f3911c;
                qVar2.getClass();
                gm.l.f(str, "link");
                try {
                    aVar = new q.a();
                    aVar.c(qVar2, str);
                } catch (IllegalArgumentException unused) {
                    aVar = null;
                }
                if (aVar != null) {
                    qVar = aVar.a();
                } else {
                    qVar = null;
                }
                if (qVar == null) {
                    StringBuilder a10 = android.support.v4.media.d.a("Malformed URL. Base: ");
                    a10.append(zVar.f3910b);
                    a10.append(", Relative: ");
                    a10.append(zVar.f3911c);
                    throw new IllegalArgumentException(a10.toString());
                }
            }
            z.a aVar4 = zVar.f3919k;
            if (aVar4 == null) {
                n.a aVar5 = zVar.f3918j;
                if (aVar5 != null) {
                    aVar4 = new zm.n(aVar5.f32642a, aVar5.f32643b);
                } else {
                    t.a aVar6 = zVar.f3917i;
                    if (aVar6 != null) {
                        if (!aVar6.f32692c.isEmpty()) {
                            aVar4 = new zm.t(aVar6.f32690a, aVar6.f32691b, an.c.t(aVar6.f32692c));
                        } else {
                            throw new IllegalStateException("Multipart body must have at least one part.".toString());
                        }
                    } else if (zVar.f3916h) {
                        byte[] bArr = new byte[0];
                        zm.z.f32767a.getClass();
                        long j10 = 0;
                        byte[] bArr2 = an.c.f635a;
                        if ((j10 | j10) >= 0 && j10 <= j10 && j10 - j10 >= j10) {
                            aVar4 = new zm.y(null, bArr, 0, 0);
                        } else {
                            throw new ArrayIndexOutOfBoundsException();
                        }
                    }
                }
            }
            zm.s sVar = zVar.f3915g;
            if (sVar != null) {
                if (aVar4 != null) {
                    aVar4 = new z.a(aVar4, sVar);
                } else {
                    zVar.f3914f.a("Content-Type", sVar.f32678a);
                }
            }
            w.a aVar7 = zVar.f3913e;
            aVar7.getClass();
            aVar7.f32756a = qVar;
            aVar7.f32758c = zVar.f3914f.c().i();
            aVar7.c(zVar.f3909a, aVar4);
            aVar7.d(new k(a0Var.f3755a, arrayList), k.class);
            dn.e a11 = aVar2.a(aVar7.a());
            if (a11 != null) {
                return a11;
            }
            throw new NullPointerException("Call.Factory returned null.");
        }
        throw new IllegalArgumentException(a0.q.b(e2.a("Argument count (", length, ") doesn't match expected count ("), wVarArr.length, ")"));
    }

    public final zm.d b() {
        zm.d dVar = this.f3849f;
        if (dVar != null) {
            return dVar;
        }
        Throwable th2 = this.f3850g;
        if (th2 != null) {
            if (th2 instanceof IOException) {
                throw ((IOException) th2);
            }
            if (th2 instanceof RuntimeException) {
                throw ((RuntimeException) th2);
            }
            throw ((Error) th2);
        }
        try {
            zm.d a10 = a();
            this.f3849f = a10;
            return a10;
        } catch (IOException | Error | RuntimeException e10) {
            h0.n(e10);
            this.f3850g = e10;
            throw e10;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x0086 A[Catch: all -> 0x0097, TRY_LEAVE, TryCatch #1 {all -> 0x0097, blocks: (B:97:0x0078, B:104:0x0086, B:107:0x008f, B:108:0x0096), top: B:113:0x0078 }] */
    /* JADX WARN: Removed duplicated region for block: B:107:0x008f A[Catch: all -> 0x0097, TRY_ENTER, TryCatch #1 {all -> 0x0097, blocks: (B:97:0x0078, B:104:0x0086, B:107:0x008f, B:108:0x0096), top: B:113:0x0078 }] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x004b A[Catch: RuntimeException -> 0x0057, TryCatch #0 {RuntimeException -> 0x0057, blocks: (B:70:0x003a, B:77:0x004b, B:79:0x0051, B:80:0x0056), top: B:112:0x003a }] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0051 A[Catch: RuntimeException -> 0x0057, TryCatch #0 {RuntimeException -> 0x0057, blocks: (B:70:0x003a, B:77:0x004b, B:79:0x0051, B:80:0x0056), top: B:112:0x003a }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final ao.b0<T> c(zm.a0 r10) {
        /*
            r9 = this;
            zm.c0 r0 = r10.f32535g
            zm.a0$a r1 = new zm.a0$a
            r1.<init>(r10)
            ao.s$c r10 = new ao.s$c
            zm.s r2 = r0.b()
            long r3 = r0.a()
            r10.<init>(r2, r3)
            r1.f32548g = r10
            zm.a0 r10 = r1.a()
            int r1 = r10.f32532d
            r2 = 1
            r3 = 0
            r4 = 299(0x12b, float:4.19E-43)
            r5 = 200(0xc8, float:2.8E-43)
            r6 = 0
            if (r1 < r5) goto L78
            r7 = 300(0x12c, float:4.2E-43)
            if (r1 < r7) goto L2a
            goto L78
        L2a:
            r7 = 204(0xcc, float:2.86E-43)
            java.lang.String r8 = "rawResponse must be successful response"
            if (r1 == r7) goto L5e
            r7 = 205(0xcd, float:2.87E-43)
            if (r1 != r7) goto L35
            goto L5e
        L35:
            ao.s$b r1 = new ao.s$b
            r1.<init>(r0)
            ao.f<zm.c0, T> r0 = r9.f3847d     // Catch: java.lang.RuntimeException -> L57
            java.lang.Object r0 = r0.a(r1)     // Catch: java.lang.RuntimeException -> L57
            int r6 = r10.f32532d     // Catch: java.lang.RuntimeException -> L57
            if (r5 <= r6) goto L45
            goto L48
        L45:
            if (r4 < r6) goto L48
            goto L49
        L48:
            r2 = 0
        L49:
            if (r2 == 0) goto L51
            ao.b0 r2 = new ao.b0     // Catch: java.lang.RuntimeException -> L57
            r2.<init>(r10, r0)     // Catch: java.lang.RuntimeException -> L57
            return r2
        L51:
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException     // Catch: java.lang.RuntimeException -> L57
            r10.<init>(r8)     // Catch: java.lang.RuntimeException -> L57
            throw r10     // Catch: java.lang.RuntimeException -> L57
        L57:
            r10 = move-exception
            java.io.IOException r0 = r1.f3856d
            if (r0 != 0) goto L5d
            throw r10
        L5d:
            throw r0
        L5e:
            r0.close()
            int r0 = r10.f32532d
            if (r5 <= r0) goto L66
            goto L69
        L66:
            if (r4 < r0) goto L69
            goto L6a
        L69:
            r2 = 0
        L6a:
            if (r2 == 0) goto L72
            ao.b0 r0 = new ao.b0
            r0.<init>(r10, r6)
            return r0
        L72:
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
            r10.<init>(r8)
            throw r10
        L78:
            ao.h0.a(r0)     // Catch: java.lang.Throwable -> L97
            int r1 = r10.f32532d     // Catch: java.lang.Throwable -> L97
            if (r5 <= r1) goto L80
            goto L83
        L80:
            if (r4 < r1) goto L83
            goto L84
        L83:
            r2 = 0
        L84:
            if (r2 != 0) goto L8f
            ao.b0 r1 = new ao.b0     // Catch: java.lang.Throwable -> L97
            r1.<init>(r10, r6)     // Catch: java.lang.Throwable -> L97
            r0.close()
            return r1
        L8f:
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> L97
            java.lang.String r1 = "rawResponse should not be successful response"
            r10.<init>(r1)     // Catch: java.lang.Throwable -> L97
            throw r10     // Catch: java.lang.Throwable -> L97
        L97:
            r10 = move-exception
            r0.close()
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: ao.s.c(zm.a0):ao.b0");
    }

    @Override // ao.b
    public final void cancel() {
        zm.d dVar;
        this.f3848e = true;
        synchronized (this) {
            dVar = this.f3849f;
        }
        if (dVar != null) {
            dVar.cancel();
        }
    }

    @Override // ao.b
    public final ao.b clone() {
        return new s(this.f3844a, this.f3845b, this.f3846c, this.f3847d);
    }

    @Override // ao.b
    public final b0<T> execute() {
        zm.d b10;
        synchronized (this) {
            if (this.f3851h) {
                throw new IllegalStateException("Already executed.");
            }
            this.f3851h = true;
            b10 = b();
        }
        if (this.f3848e) {
            b10.cancel();
        }
        return c(b10.execute());
    }

    @Override // ao.b
    public final synchronized zm.w j() {
        try {
        } catch (IOException e10) {
            throw new RuntimeException("Unable to create request.", e10);
        }
        return b().j();
    }

    @Override // ao.b
    public final boolean k() {
        boolean z10 = true;
        if (this.f3848e) {
            return true;
        }
        synchronized (this) {
            zm.d dVar = this.f3849f;
            if (dVar == null || !dVar.k()) {
                z10 = false;
            }
        }
        return z10;
    }

    @Override // ao.b
    public final void q(d<T> dVar) {
        zm.d dVar2;
        Throwable th2;
        synchronized (this) {
            if (this.f3851h) {
                throw new IllegalStateException("Already executed.");
            }
            this.f3851h = true;
            dVar2 = this.f3849f;
            th2 = this.f3850g;
            if (dVar2 == null && th2 == null) {
                zm.d a10 = a();
                this.f3849f = a10;
                dVar2 = a10;
            }
        }
        if (th2 != null) {
            dVar.b(this, th2);
            return;
        }
        if (this.f3848e) {
            dVar2.cancel();
        }
        dVar2.s(new a(dVar));
    }

    /* renamed from: clone */
    public final Object m1clone() {
        return new s(this.f3844a, this.f3845b, this.f3846c, this.f3847d);
    }
}
