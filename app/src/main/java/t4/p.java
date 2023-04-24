package t4;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import n5.a;
import n5.d;
import t4.j;
import t4.s;

/* loaded from: classes.dex */
public final class p<R> implements j.a<R>, a.d {

    /* renamed from: z */
    public static final c f27684z = new c();

    /* renamed from: a */
    public final e f27685a;

    /* renamed from: b */
    public final d.a f27686b;

    /* renamed from: c */
    public final s.a f27687c;

    /* renamed from: d */
    public final j1.d<p<?>> f27688d;

    /* renamed from: e */
    public final c f27689e;

    /* renamed from: f */
    public final q f27690f;

    /* renamed from: g */
    public final w4.a f27691g;

    /* renamed from: h */
    public final w4.a f27692h;

    /* renamed from: i */
    public final w4.a f27693i;

    /* renamed from: j */
    public final w4.a f27694j;

    /* renamed from: k */
    public final AtomicInteger f27695k;

    /* renamed from: l */
    public r4.f f27696l;

    /* renamed from: m */
    public boolean f27697m;

    /* renamed from: n */
    public boolean f27698n;

    /* renamed from: o */
    public boolean f27699o;

    /* renamed from: p */
    public boolean f27700p;

    /* renamed from: q */
    public x<?> f27701q;

    /* renamed from: r */
    public r4.a f27702r;

    /* renamed from: s */
    public boolean f27703s;

    /* renamed from: t */
    public t f27704t;

    /* renamed from: u */
    public boolean f27705u;

    /* renamed from: v */
    public s<?> f27706v;

    /* renamed from: w */
    public j<R> f27707w;

    /* renamed from: x */
    public volatile boolean f27708x;

    /* renamed from: y */
    public boolean f27709y;

    /* loaded from: classes.dex */
    public class a implements Runnable {

        /* renamed from: a */
        public final i5.h f27710a;

        public a(i5.h hVar) {
            p.this = r1;
            this.f27710a = hVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            i5.i iVar = (i5.i) this.f27710a;
            iVar.f16533b.a();
            synchronized (iVar.f16534c) {
                synchronized (p.this) {
                    if (p.this.f27685a.f27716a.contains(new d(this.f27710a, m5.e.f20368b))) {
                        p pVar = p.this;
                        i5.h hVar = this.f27710a;
                        pVar.getClass();
                        ((i5.i) hVar).l(pVar.f27704t, 5);
                    }
                    p.this.c();
                }
            }
        }
    }

    /* loaded from: classes.dex */
    public class b implements Runnable {

        /* renamed from: a */
        public final i5.h f27712a;

        public b(i5.h hVar) {
            p.this = r1;
            this.f27712a = hVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            i5.i iVar = (i5.i) this.f27712a;
            iVar.f16533b.a();
            synchronized (iVar.f16534c) {
                synchronized (p.this) {
                    if (p.this.f27685a.f27716a.contains(new d(this.f27712a, m5.e.f20368b))) {
                        p.this.f27706v.a();
                        p pVar = p.this;
                        i5.h hVar = this.f27712a;
                        pVar.getClass();
                        ((i5.i) hVar).n(pVar.f27706v, pVar.f27702r, pVar.f27709y);
                        p.this.h(this.f27712a);
                    }
                    p.this.c();
                }
            }
        }
    }

    /* loaded from: classes.dex */
    public static class c {
    }

    /* loaded from: classes.dex */
    public static final class d {

        /* renamed from: a */
        public final i5.h f27714a;

        /* renamed from: b */
        public final Executor f27715b;

        public d(i5.h hVar, Executor executor) {
            this.f27714a = hVar;
            this.f27715b = executor;
        }

        public final boolean equals(Object obj) {
            if (obj instanceof d) {
                return this.f27714a.equals(((d) obj).f27714a);
            }
            return false;
        }

        public final int hashCode() {
            return this.f27714a.hashCode();
        }
    }

    /* loaded from: classes.dex */
    public static final class e implements Iterable<d> {

        /* renamed from: a */
        public final List<d> f27716a;

        public e(ArrayList arrayList) {
            this.f27716a = arrayList;
        }

        @Override // java.lang.Iterable
        public final Iterator<d> iterator() {
            return this.f27716a.iterator();
        }
    }

    public p() {
        throw null;
    }

    public p(w4.a aVar, w4.a aVar2, w4.a aVar3, w4.a aVar4, q qVar, s.a aVar5, a.c cVar) {
        c cVar2 = f27684z;
        this.f27685a = new e(new ArrayList(2));
        this.f27686b = new d.a();
        this.f27695k = new AtomicInteger();
        this.f27691g = aVar;
        this.f27692h = aVar2;
        this.f27693i = aVar3;
        this.f27694j = aVar4;
        this.f27690f = qVar;
        this.f27687c = aVar5;
        this.f27688d = cVar;
        this.f27689e = cVar2;
    }

    public final synchronized void a(i5.h hVar, Executor executor) {
        Runnable aVar;
        this.f27686b.a();
        this.f27685a.f27716a.add(new d(hVar, executor));
        boolean z10 = true;
        if (this.f27703s) {
            d(1);
            aVar = new b(hVar);
        } else if (this.f27705u) {
            d(1);
            aVar = new a(hVar);
        } else {
            if (this.f27708x) {
                z10 = false;
            }
            b0.c.g("Cannot add callbacks to a cancelled EngineJob", z10);
        }
        executor.execute(aVar);
    }

    public final void b() {
        Object obj;
        if (f()) {
            return;
        }
        this.f27708x = true;
        j<R> jVar = this.f27707w;
        jVar.E = true;
        h hVar = jVar.C;
        if (hVar != null) {
            hVar.cancel();
        }
        q qVar = this.f27690f;
        r4.f fVar = this.f27696l;
        o oVar = (o) qVar;
        synchronized (oVar) {
            m2.l lVar = oVar.f27660a;
            lVar.getClass();
            if (this.f27700p) {
                obj = lVar.f20216b;
            } else {
                obj = lVar.f20215a;
            }
            Map map = (Map) obj;
            if (equals(map.get(fVar))) {
                map.remove(fVar);
            }
        }
    }

    public final void c() {
        s<?> sVar;
        synchronized (this) {
            this.f27686b.a();
            b0.c.g("Not yet complete!", f());
            int decrementAndGet = this.f27695k.decrementAndGet();
            b0.c.g("Can't decrement below 0", decrementAndGet >= 0);
            if (decrementAndGet == 0) {
                sVar = this.f27706v;
                g();
            } else {
                sVar = null;
            }
        }
        if (sVar != null) {
            sVar.e();
        }
    }

    public final synchronized void d(int i10) {
        s<?> sVar;
        b0.c.g("Not yet complete!", f());
        if (this.f27695k.getAndAdd(i10) == 0 && (sVar = this.f27706v) != null) {
            sVar.a();
        }
    }

    @Override // n5.a.d
    public final d.a e() {
        return this.f27686b;
    }

    public final boolean f() {
        return this.f27705u || this.f27703s || this.f27708x;
    }

    public final synchronized void g() {
        boolean a10;
        if (this.f27696l != null) {
            this.f27685a.f27716a.clear();
            this.f27696l = null;
            this.f27706v = null;
            this.f27701q = null;
            this.f27705u = false;
            this.f27708x = false;
            this.f27703s = false;
            this.f27709y = false;
            j<R> jVar = this.f27707w;
            j.e eVar = jVar.f27623g;
            synchronized (eVar) {
                eVar.f27648a = true;
                a10 = eVar.a();
            }
            if (a10) {
                jVar.n();
            }
            this.f27707w = null;
            this.f27704t = null;
            this.f27702r = null;
            this.f27688d.release(this);
        } else {
            throw new IllegalArgumentException();
        }
    }

    public final synchronized void h(i5.h hVar) {
        boolean z10;
        this.f27686b.a();
        this.f27685a.f27716a.remove(new d(hVar, m5.e.f20368b));
        if (this.f27685a.f27716a.isEmpty()) {
            b();
            if (!this.f27703s && !this.f27705u) {
                z10 = false;
                if (z10 && this.f27695k.get() == 0) {
                    g();
                }
            }
            z10 = true;
            if (z10) {
                g();
            }
        }
    }
}
