package t4;

import android.os.SystemClock;
import android.util.Log;
import java.io.File;
import java.util.concurrent.Executor;
import m5.i;
import n5.a;
import t4.c;
import t4.j;
import t4.s;
import v4.a;
import v4.i;

/* loaded from: classes.dex */
public final class o implements q, i.a, s.a {

    /* renamed from: h */
    public static final boolean f27659h = Log.isLoggable("Engine", 2);

    /* renamed from: a */
    public final m2.l f27660a;

    /* renamed from: b */
    public final rm.l f27661b;

    /* renamed from: c */
    public final v4.i f27662c;

    /* renamed from: d */
    public final b f27663d;

    /* renamed from: e */
    public final a0 f27664e;

    /* renamed from: f */
    public final a f27665f;

    /* renamed from: g */
    public final t4.c f27666g;

    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a */
        public final j.d f27667a;

        /* renamed from: b */
        public final a.c f27668b = n5.a.a(150, new C0494a());

        /* renamed from: c */
        public int f27669c;

        /* renamed from: t4.o$a$a */
        /* loaded from: classes.dex */
        public class C0494a implements a.b<j<?>> {
            public C0494a() {
                a.this = r1;
            }

            @Override // n5.a.b
            public final j<?> a() {
                a aVar = a.this;
                return new j<>(aVar.f27667a, aVar.f27668b);
            }
        }

        public a(c cVar) {
            this.f27667a = cVar;
        }
    }

    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a */
        public final w4.a f27671a;

        /* renamed from: b */
        public final w4.a f27672b;

        /* renamed from: c */
        public final w4.a f27673c;

        /* renamed from: d */
        public final w4.a f27674d;

        /* renamed from: e */
        public final q f27675e;

        /* renamed from: f */
        public final s.a f27676f;

        /* renamed from: g */
        public final a.c f27677g = n5.a.a(150, new a());

        /* loaded from: classes.dex */
        public class a implements a.b<p<?>> {
            public a() {
                b.this = r1;
            }

            @Override // n5.a.b
            public final p<?> a() {
                b bVar = b.this;
                return new p<>(bVar.f27671a, bVar.f27672b, bVar.f27673c, bVar.f27674d, bVar.f27675e, bVar.f27676f, bVar.f27677g);
            }
        }

        public b(w4.a aVar, w4.a aVar2, w4.a aVar3, w4.a aVar4, q qVar, s.a aVar5) {
            this.f27671a = aVar;
            this.f27672b = aVar2;
            this.f27673c = aVar3;
            this.f27674d = aVar4;
            this.f27675e = qVar;
            this.f27676f = aVar5;
        }
    }

    /* loaded from: classes.dex */
    public static class c implements j.d {

        /* renamed from: a */
        public final a.InterfaceC0524a f27679a;

        /* renamed from: b */
        public volatile v4.a f27680b;

        public c(a.InterfaceC0524a interfaceC0524a) {
            this.f27679a = interfaceC0524a;
        }

        public final v4.a a() {
            if (this.f27680b == null) {
                synchronized (this) {
                    if (this.f27680b == null) {
                        v4.d dVar = (v4.d) this.f27679a;
                        v4.f fVar = (v4.f) dVar.f29044b;
                        File cacheDir = fVar.f29050a.getCacheDir();
                        v4.e eVar = null;
                        if (cacheDir == null) {
                            cacheDir = null;
                        } else if (fVar.f29051b != null) {
                            cacheDir = new File(cacheDir, fVar.f29051b);
                        }
                        if (cacheDir != null && (cacheDir.isDirectory() || cacheDir.mkdirs())) {
                            eVar = new v4.e(cacheDir, dVar.f29043a);
                        }
                        this.f27680b = eVar;
                    }
                    if (this.f27680b == null) {
                        this.f27680b = new v4.b();
                    }
                }
            }
            return this.f27680b;
        }
    }

    /* loaded from: classes.dex */
    public class d {

        /* renamed from: a */
        public final p<?> f27681a;

        /* renamed from: b */
        public final i5.h f27682b;

        public d(i5.h hVar, p<?> pVar) {
            o.this = r1;
            this.f27682b = hVar;
            this.f27681a = pVar;
        }
    }

    public o(v4.i iVar, a.InterfaceC0524a interfaceC0524a, w4.a aVar, w4.a aVar2, w4.a aVar3, w4.a aVar4) {
        this.f27662c = iVar;
        c cVar = new c(interfaceC0524a);
        t4.c cVar2 = new t4.c();
        this.f27666g = cVar2;
        synchronized (this) {
            synchronized (cVar2) {
                cVar2.f27574e = this;
            }
        }
        this.f27661b = new rm.l();
        this.f27660a = new m2.l(1);
        this.f27663d = new b(aVar, aVar2, aVar3, aVar4, this, this);
        this.f27665f = new a(cVar);
        this.f27664e = new a0();
        ((v4.h) iVar).f29052d = this;
    }

    public static void d(String str, long j10, r4.f fVar) {
        StringBuilder a10 = p.a.a(str, " in ");
        a10.append(m5.h.a(j10));
        a10.append("ms, key: ");
        a10.append(fVar);
        Log.v("Engine", a10.toString());
    }

    public static void e(x xVar) {
        if (!(xVar instanceof s)) {
            throw new IllegalArgumentException("Cannot release anything but an EngineResource");
        }
        ((s) xVar).e();
    }

    @Override // t4.s.a
    public final void a(r4.f fVar, s<?> sVar) {
        t4.c cVar = this.f27666g;
        synchronized (cVar) {
            c.a aVar = (c.a) cVar.f27572c.remove(fVar);
            if (aVar != null) {
                aVar.f27577c = null;
                aVar.clear();
            }
        }
        if (sVar.f27726a) {
            ((v4.h) this.f27662c).d(fVar, sVar);
        } else {
            this.f27664e.a(sVar, false);
        }
    }

    public final d b(com.bumptech.glide.h hVar, Object obj, r4.f fVar, int i10, int i11, Class cls, Class cls2, com.bumptech.glide.j jVar, n nVar, m5.b bVar, boolean z10, boolean z11, r4.h hVar2, boolean z12, boolean z13, boolean z14, boolean z15, i5.h hVar3, Executor executor) {
        long j10;
        if (f27659h) {
            int i12 = m5.h.f20372b;
            j10 = SystemClock.elapsedRealtimeNanos();
        } else {
            j10 = 0;
        }
        long j11 = j10;
        this.f27661b.getClass();
        r rVar = new r(obj, fVar, i10, i11, bVar, cls, cls2, hVar2);
        synchronized (this) {
            try {
                s<?> c10 = c(rVar, z12, j11);
                if (c10 == null) {
                    return f(hVar, obj, fVar, i10, i11, cls, cls2, jVar, nVar, bVar, z10, z11, hVar2, z12, z13, z14, z15, hVar3, executor, rVar, j11);
                }
                ((i5.i) hVar3).n(c10, r4.a.MEMORY_CACHE, false);
                return null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final s<?> c(r rVar, boolean z10, long j10) {
        s<?> sVar;
        x xVar;
        s<?> sVar2;
        if (!z10) {
            return null;
        }
        t4.c cVar = this.f27666g;
        synchronized (cVar) {
            c.a aVar = (c.a) cVar.f27572c.get(rVar);
            if (aVar == null) {
                sVar = null;
            } else {
                sVar = aVar.get();
                if (sVar == null) {
                    cVar.b(aVar);
                }
            }
        }
        if (sVar != null) {
            sVar.a();
        }
        if (sVar != null) {
            if (f27659h) {
                d("Loaded resource from active resources", j10, rVar);
            }
            return sVar;
        }
        v4.h hVar = (v4.h) this.f27662c;
        synchronized (hVar) {
            i.a aVar2 = (i.a) hVar.f20373a.remove(rVar);
            if (aVar2 == null) {
                xVar = null;
            } else {
                hVar.f20375c -= aVar2.f20377b;
                xVar = aVar2.f20376a;
            }
        }
        x xVar2 = xVar;
        if (xVar2 == null) {
            sVar2 = null;
        } else if (xVar2 instanceof s) {
            sVar2 = (s) xVar2;
        } else {
            sVar2 = new s<>(xVar2, true, true, rVar, this);
        }
        if (sVar2 != null) {
            sVar2.a();
            this.f27666g.a(rVar, sVar2);
        }
        if (sVar2 == null) {
            return null;
        }
        if (f27659h) {
            d("Loaded resource from cache", j10, rVar);
        }
        return sVar2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:85:0x00e5, code lost:
        r0 = r15.f27691g;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [w4.a] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final t4.o.d f(com.bumptech.glide.h r17, java.lang.Object r18, r4.f r19, int r20, int r21, java.lang.Class r22, java.lang.Class r23, com.bumptech.glide.j r24, t4.n r25, m5.b r26, boolean r27, boolean r28, r4.h r29, boolean r30, boolean r31, boolean r32, boolean r33, i5.h r34, java.util.concurrent.Executor r35, t4.r r36, long r37) {
        /*
            Method dump skipped, instructions count: 275
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: t4.o.f(com.bumptech.glide.h, java.lang.Object, r4.f, int, int, java.lang.Class, java.lang.Class, com.bumptech.glide.j, t4.n, m5.b, boolean, boolean, r4.h, boolean, boolean, boolean, boolean, i5.h, java.util.concurrent.Executor, t4.r, long):t4.o$d");
    }
}
