package t4;

import android.os.Build;
import android.os.SystemClock;
import android.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import n5.a;
import n5.d;
import t4.h;
import t4.o;
import t4.p;
import t4.s;

/* loaded from: classes.dex */
public final class j<R> implements h.a, Runnable, Comparable<j<?>>, a.d {
    public r4.a A;
    public com.bumptech.glide.load.data.d<?> B;
    public volatile h C;
    public volatile boolean D;
    public volatile boolean E;
    public boolean F;

    /* renamed from: d */
    public final d f27620d;

    /* renamed from: e */
    public final j1.d<j<?>> f27621e;

    /* renamed from: h */
    public com.bumptech.glide.h f27624h;

    /* renamed from: i */
    public r4.f f27625i;

    /* renamed from: j */
    public com.bumptech.glide.j f27626j;

    /* renamed from: k */
    public r f27627k;

    /* renamed from: l */
    public int f27628l;

    /* renamed from: m */
    public int f27629m;

    /* renamed from: n */
    public n f27630n;

    /* renamed from: o */
    public r4.h f27631o;

    /* renamed from: p */
    public a<R> f27632p;

    /* renamed from: q */
    public int f27633q;

    /* renamed from: r */
    public int f27634r;

    /* renamed from: s */
    public int f27635s;

    /* renamed from: t */
    public long f27636t;

    /* renamed from: u */
    public boolean f27637u;

    /* renamed from: v */
    public Object f27638v;

    /* renamed from: w */
    public Thread f27639w;

    /* renamed from: x */
    public r4.f f27640x;

    /* renamed from: y */
    public r4.f f27641y;

    /* renamed from: z */
    public Object f27642z;

    /* renamed from: a */
    public final i<R> f27617a = new i<>();

    /* renamed from: b */
    public final ArrayList f27618b = new ArrayList();

    /* renamed from: c */
    public final d.a f27619c = new d.a();

    /* renamed from: f */
    public final c<?> f27622f = new c<>();

    /* renamed from: g */
    public final e f27623g = new e();

    /* loaded from: classes.dex */
    public interface a<R> {
    }

    /* loaded from: classes.dex */
    public final class b<Z> {

        /* renamed from: a */
        public final r4.a f27643a;

        public b(r4.a aVar) {
            j.this = r1;
            this.f27643a = aVar;
        }
    }

    /* loaded from: classes.dex */
    public static class c<Z> {

        /* renamed from: a */
        public r4.f f27645a;

        /* renamed from: b */
        public r4.k<Z> f27646b;

        /* renamed from: c */
        public w<Z> f27647c;
    }

    /* loaded from: classes.dex */
    public interface d {
    }

    /* loaded from: classes.dex */
    public static class e {

        /* renamed from: a */
        public boolean f27648a;

        /* renamed from: b */
        public boolean f27649b;

        /* renamed from: c */
        public boolean f27650c;

        public final boolean a() {
            return (this.f27650c || this.f27649b) && this.f27648a;
        }
    }

    public j(d dVar, a.c cVar) {
        this.f27620d = dVar;
        this.f27621e = cVar;
    }

    @Override // t4.h.a
    public final void a(r4.f fVar, Object obj, com.bumptech.glide.load.data.d<?> dVar, r4.a aVar, r4.f fVar2) {
        this.f27640x = fVar;
        this.f27642z = obj;
        this.B = dVar;
        this.A = aVar;
        this.f27641y = fVar2;
        this.F = fVar != this.f27617a.a().get(0);
        if (Thread.currentThread() != this.f27639w) {
            t(3);
        } else {
            h();
        }
    }

    @Override // t4.h.a
    public final void c() {
        t(2);
    }

    @Override // java.lang.Comparable
    public final int compareTo(j<?> jVar) {
        j<?> jVar2 = jVar;
        int ordinal = this.f27626j.ordinal() - jVar2.f27626j.ordinal();
        if (ordinal == 0) {
            return this.f27633q - jVar2.f27633q;
        }
        return ordinal;
    }

    @Override // t4.h.a
    public final void d(r4.f fVar, Exception exc, com.bumptech.glide.load.data.d<?> dVar, r4.a aVar) {
        dVar.b();
        t tVar = new t("Fetching data failed", Collections.singletonList(exc));
        Class<?> a10 = dVar.a();
        tVar.f27735b = fVar;
        tVar.f27736c = aVar;
        tVar.f27737d = a10;
        this.f27618b.add(tVar);
        if (Thread.currentThread() != this.f27639w) {
            t(2);
        } else {
            u();
        }
    }

    @Override // n5.a.d
    public final d.a e() {
        return this.f27619c;
    }

    public final <Data> x<R> f(com.bumptech.glide.load.data.d<?> dVar, Data data, r4.a aVar) {
        if (data == null) {
            return null;
        }
        try {
            int i10 = m5.h.f20372b;
            long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
            x<R> g10 = g(data, aVar);
            if (Log.isLoggable("DecodeJob", 2)) {
                k("Decoded result " + g10, elapsedRealtimeNanos, null);
            }
            return g10;
        } finally {
            dVar.b();
        }
    }

    public final <Data> x<R> g(Data data, r4.a aVar) {
        boolean z10;
        v<Data, ?, R> c10 = this.f27617a.c(data.getClass());
        r4.h hVar = this.f27631o;
        if (Build.VERSION.SDK_INT >= 26) {
            if (aVar != r4.a.RESOURCE_DISK_CACHE && !this.f27617a.f27616r) {
                z10 = false;
            } else {
                z10 = true;
            }
            r4.g<Boolean> gVar = a5.n.f302i;
            Boolean bool = (Boolean) hVar.c(gVar);
            if (bool == null || (bool.booleanValue() && !z10)) {
                hVar = new r4.h();
                hVar.f25218b.j(this.f27631o.f25218b);
                hVar.f25218b.put(gVar, Boolean.valueOf(z10));
            }
        }
        r4.h hVar2 = hVar;
        com.bumptech.glide.load.data.e f10 = this.f27624h.a().f(data);
        try {
            return c10.a(this.f27628l, this.f27629m, hVar2, f10, new b(aVar));
        } finally {
            f10.b();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v12, types: [t4.x] */
    /* JADX WARN: Type inference failed for: r9v0, types: [t4.j, t4.j<R>] */
    public final void h() {
        w wVar;
        boolean z10;
        boolean a10;
        if (Log.isLoggable("DecodeJob", 2)) {
            long j10 = this.f27636t;
            StringBuilder a11 = android.support.v4.media.d.a("data: ");
            a11.append(this.f27642z);
            a11.append(", cache key: ");
            a11.append(this.f27640x);
            a11.append(", fetcher: ");
            a11.append(this.B);
            k("Retrieved data", j10, a11.toString());
        }
        w wVar2 = null;
        try {
            wVar = f(this.B, this.f27642z, this.A);
        } catch (t e10) {
            r4.f fVar = this.f27641y;
            r4.a aVar = this.A;
            e10.f27735b = fVar;
            e10.f27736c = aVar;
            e10.f27737d = null;
            this.f27618b.add(e10);
            wVar = null;
        }
        if (wVar != null) {
            r4.a aVar2 = this.A;
            boolean z11 = this.F;
            if (wVar instanceof u) {
                ((u) wVar).a();
            }
            boolean z12 = false;
            if (this.f27622f.f27647c != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                wVar2 = (w) w.f27744e.acquire();
                b0.c.i(wVar2);
                wVar2.f27748d = false;
                wVar2.f27747c = true;
                wVar2.f27746b = wVar;
                wVar = wVar2;
            }
            l(wVar, aVar2, z11);
            this.f27634r = 5;
            c<?> cVar = this.f27622f;
            if (cVar.f27647c != null) {
                z12 = true;
            }
            if (z12) {
                d dVar = this.f27620d;
                r4.h hVar = this.f27631o;
                cVar.getClass();
                try {
                    ((o.c) dVar).a().b(cVar.f27645a, new g(cVar.f27646b, cVar.f27647c, hVar));
                    cVar.f27647c.a();
                } catch (Throwable th2) {
                    cVar.f27647c.a();
                    throw th2;
                }
            }
            if (wVar2 != null) {
                wVar2.a();
            }
            e eVar = this.f27623g;
            synchronized (eVar) {
                eVar.f27649b = true;
                a10 = eVar.a();
            }
            if (a10) {
                n();
                return;
            }
            return;
        }
        u();
    }

    public final h i() {
        int b10 = s.c0.b(this.f27634r);
        if (b10 != 1) {
            if (b10 != 2) {
                if (b10 != 3) {
                    if (b10 == 5) {
                        return null;
                    }
                    StringBuilder a10 = android.support.v4.media.d.a("Unrecognized stage: ");
                    a10.append(l.a(this.f27634r));
                    throw new IllegalStateException(a10.toString());
                }
                return new c0(this.f27617a, this);
            }
            i<R> iVar = this.f27617a;
            return new t4.e(iVar.a(), iVar, this);
        }
        return new y(this.f27617a, this);
    }

    public final int j(int i10) {
        if (i10 != 0) {
            int i11 = i10 - 1;
            if (i11 != 0) {
                if (i11 != 1) {
                    if (i11 != 2) {
                        if (i11 == 3 || i11 == 5) {
                            return 6;
                        }
                        StringBuilder a10 = android.support.v4.media.d.a("Unrecognized stage: ");
                        a10.append(l.a(i10));
                        throw new IllegalArgumentException(a10.toString());
                    } else if (this.f27637u) {
                        return 6;
                    } else {
                        return 4;
                    }
                } else if (this.f27630n.a()) {
                    return 3;
                } else {
                    return j(3);
                }
            } else if (this.f27630n.b()) {
                return 2;
            } else {
                return j(2);
            }
        }
        throw null;
    }

    public final void k(String str, long j10, String str2) {
        String str3;
        StringBuilder a10 = p.a.a(str, " in ");
        a10.append(m5.h.a(j10));
        a10.append(", load key: ");
        a10.append(this.f27627k);
        if (str2 != null) {
            str3 = a.b.b(", ", str2);
        } else {
            str3 = "";
        }
        a10.append(str3);
        a10.append(", thread: ");
        a10.append(Thread.currentThread().getName());
        Log.v("DecodeJob", a10.toString());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void l(x<R> xVar, r4.a aVar, boolean z10) {
        Object obj;
        w();
        p pVar = (p) this.f27632p;
        synchronized (pVar) {
            pVar.f27701q = xVar;
            pVar.f27702r = aVar;
            pVar.f27709y = z10;
        }
        synchronized (pVar) {
            pVar.f27686b.a();
            if (pVar.f27708x) {
                pVar.f27701q.c();
                pVar.g();
            } else if (!pVar.f27685a.f27716a.isEmpty()) {
                if (!pVar.f27703s) {
                    p.c cVar = pVar.f27689e;
                    x<?> xVar2 = pVar.f27701q;
                    boolean z11 = pVar.f27697m;
                    r4.f fVar = pVar.f27696l;
                    s.a aVar2 = pVar.f27687c;
                    cVar.getClass();
                    pVar.f27706v = new s<>(xVar2, z11, true, fVar, aVar2);
                    pVar.f27703s = true;
                    p.e eVar = pVar.f27685a;
                    eVar.getClass();
                    ArrayList<p.d> arrayList = new ArrayList(eVar.f27716a);
                    pVar.d(arrayList.size() + 1);
                    r4.f fVar2 = pVar.f27696l;
                    s<?> sVar = pVar.f27706v;
                    o oVar = (o) pVar.f27690f;
                    synchronized (oVar) {
                        if (sVar != null) {
                            if (sVar.f27726a) {
                                oVar.f27666g.a(fVar2, sVar);
                            }
                        }
                        m2.l lVar = oVar.f27660a;
                        lVar.getClass();
                        if (pVar.f27700p) {
                            obj = lVar.f20216b;
                        } else {
                            obj = lVar.f20215a;
                        }
                        Map map = (Map) obj;
                        if (pVar.equals(map.get(fVar2))) {
                            map.remove(fVar2);
                        }
                    }
                    for (p.d dVar : arrayList) {
                        dVar.f27715b.execute(new p.b(dVar.f27714a));
                    }
                    pVar.c();
                    return;
                }
                throw new IllegalStateException("Already have resource");
            } else {
                throw new IllegalStateException("Received a resource without any callbacks to notify");
            }
        }
    }

    public final void m() {
        Object obj;
        boolean a10;
        w();
        t tVar = new t("Failed to load resource", new ArrayList(this.f27618b));
        p pVar = (p) this.f27632p;
        synchronized (pVar) {
            pVar.f27704t = tVar;
        }
        synchronized (pVar) {
            pVar.f27686b.a();
            if (pVar.f27708x) {
                pVar.g();
            } else if (!pVar.f27685a.f27716a.isEmpty()) {
                if (!pVar.f27705u) {
                    pVar.f27705u = true;
                    r4.f fVar = pVar.f27696l;
                    p.e eVar = pVar.f27685a;
                    eVar.getClass();
                    ArrayList<p.d> arrayList = new ArrayList(eVar.f27716a);
                    pVar.d(arrayList.size() + 1);
                    o oVar = (o) pVar.f27690f;
                    synchronized (oVar) {
                        m2.l lVar = oVar.f27660a;
                        lVar.getClass();
                        if (pVar.f27700p) {
                            obj = lVar.f20216b;
                        } else {
                            obj = lVar.f20215a;
                        }
                        Map map = (Map) obj;
                        if (pVar.equals(map.get(fVar))) {
                            map.remove(fVar);
                        }
                    }
                    for (p.d dVar : arrayList) {
                        dVar.f27715b.execute(new p.a(dVar.f27714a));
                    }
                    pVar.c();
                } else {
                    throw new IllegalStateException("Already failed once");
                }
            } else {
                throw new IllegalStateException("Received an exception without any callbacks to notify");
            }
        }
        e eVar2 = this.f27623g;
        synchronized (eVar2) {
            eVar2.f27650c = true;
            a10 = eVar2.a();
        }
        if (a10) {
            n();
        }
    }

    public final void n() {
        e eVar = this.f27623g;
        synchronized (eVar) {
            eVar.f27649b = false;
            eVar.f27648a = false;
            eVar.f27650c = false;
        }
        c<?> cVar = this.f27622f;
        cVar.f27645a = null;
        cVar.f27646b = null;
        cVar.f27647c = null;
        i<R> iVar = this.f27617a;
        iVar.f27601c = null;
        iVar.f27602d = null;
        iVar.f27612n = null;
        iVar.f27605g = null;
        iVar.f27609k = null;
        iVar.f27607i = null;
        iVar.f27613o = null;
        iVar.f27608j = null;
        iVar.f27614p = null;
        iVar.f27599a.clear();
        iVar.f27610l = false;
        iVar.f27600b.clear();
        iVar.f27611m = false;
        this.D = false;
        this.f27624h = null;
        this.f27625i = null;
        this.f27631o = null;
        this.f27626j = null;
        this.f27627k = null;
        this.f27632p = null;
        this.f27634r = 0;
        this.C = null;
        this.f27639w = null;
        this.f27640x = null;
        this.f27642z = null;
        this.A = null;
        this.B = null;
        this.f27636t = 0L;
        this.E = false;
        this.f27638v = null;
        this.f27618b.clear();
        this.f27621e.release(this);
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.bumptech.glide.load.data.d<?> dVar = this.B;
        try {
            try {
                if (this.E) {
                    m();
                    if (dVar != null) {
                        dVar.b();
                        return;
                    }
                    return;
                }
                v();
                if (dVar != null) {
                    dVar.b();
                }
            } catch (t4.d e10) {
                throw e10;
            } catch (Throwable th2) {
                if (Log.isLoggable("DecodeJob", 3)) {
                    Log.d("DecodeJob", "DecodeJob threw unexpectedly, isCancelled: " + this.E + ", stage: " + l.a(this.f27634r), th2);
                }
                if (this.f27634r != 5) {
                    this.f27618b.add(th2);
                    m();
                }
                if (!this.E) {
                    throw th2;
                }
                throw th2;
            }
        } catch (Throwable th3) {
            if (dVar != null) {
                dVar.b();
            }
            throw th3;
        }
    }

    public final void t(int i10) {
        w4.a aVar;
        this.f27635s = i10;
        p pVar = (p) this.f27632p;
        if (pVar.f27698n) {
            aVar = pVar.f27693i;
        } else if (pVar.f27699o) {
            aVar = pVar.f27694j;
        } else {
            aVar = pVar.f27692h;
        }
        aVar.execute(this);
    }

    public final void u() {
        this.f27639w = Thread.currentThread();
        int i10 = m5.h.f20372b;
        this.f27636t = SystemClock.elapsedRealtimeNanos();
        boolean z10 = false;
        while (!this.E && this.C != null && !(z10 = this.C.b())) {
            this.f27634r = j(this.f27634r);
            this.C = i();
            if (this.f27634r == 4) {
                t(2);
                return;
            }
        }
        if ((this.f27634r == 6 || this.E) && !z10) {
            m();
        }
    }

    public final void v() {
        int b10 = s.c0.b(this.f27635s);
        if (b10 != 0) {
            if (b10 != 1) {
                if (b10 == 2) {
                    h();
                    return;
                }
                StringBuilder a10 = android.support.v4.media.d.a("Unrecognized run reason: ");
                a10.append(k.a(this.f27635s));
                throw new IllegalStateException(a10.toString());
            }
        } else {
            this.f27634r = j(1);
            this.C = i();
        }
        u();
    }

    public final void w() {
        Throwable th2;
        this.f27619c.a();
        if (!this.D) {
            this.D = true;
            return;
        }
        if (this.f27618b.isEmpty()) {
            th2 = null;
        } else {
            ArrayList arrayList = this.f27618b;
            th2 = (Throwable) arrayList.get(arrayList.size() - 1);
        }
        throw new IllegalStateException("Already notified", th2);
    }
}
