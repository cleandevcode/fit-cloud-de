package androidx.camera.core;

import a0.c1;
import a0.g0;
import a0.i0;
import a0.j0;
import android.media.ImageReader;
import android.util.Size;
import android.view.Surface;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import p0.c;
import y.f1;
import y.u0;

/* loaded from: classes.dex */
public final class n implements c1 {

    /* renamed from: g */
    public final c1 f1752g;

    /* renamed from: h */
    public final y.b f1753h;

    /* renamed from: i */
    public c1.a f1754i;

    /* renamed from: j */
    public Executor f1755j;

    /* renamed from: k */
    public c.a<Void> f1756k;

    /* renamed from: l */
    public na.a<Void> f1757l;

    /* renamed from: m */
    public final Executor f1758m;

    /* renamed from: n */
    public final i0 f1759n;

    /* renamed from: o */
    public final na.a<Void> f1760o;

    /* renamed from: t */
    public e f1765t;

    /* renamed from: u */
    public Executor f1766u;

    /* renamed from: a */
    public final Object f1746a = new Object();

    /* renamed from: b */
    public a f1747b = new a();

    /* renamed from: c */
    public b f1748c = new b();

    /* renamed from: d */
    public c f1749d = new c();

    /* renamed from: e */
    public boolean f1750e = false;

    /* renamed from: f */
    public boolean f1751f = false;

    /* renamed from: p */
    public String f1761p = new String();

    /* renamed from: q */
    public f1 f1762q = new f1(this.f1761p, Collections.emptyList());

    /* renamed from: r */
    public final ArrayList f1763r = new ArrayList();

    /* renamed from: s */
    public na.a<List<j>> f1764s = d0.f.e(new ArrayList());

    /* loaded from: classes.dex */
    public class a implements c1.a {
        public a() {
            n.this = r1;
        }

        @Override // a0.c1.a
        public final void a(c1 c1Var) {
            n nVar = n.this;
            synchronized (nVar.f1746a) {
                if (!nVar.f1750e) {
                    try {
                        j l10 = c1Var.l();
                        if (l10 != null) {
                            Integer num = (Integer) l10.d0().b().a(nVar.f1761p);
                            if (!nVar.f1763r.contains(num)) {
                                u0.h("ProcessingImageReader", "ImageProxyBundle does not contain this id: " + num);
                                l10.close();
                            } else {
                                nVar.f1762q.c(l10);
                            }
                        }
                    } catch (IllegalStateException e10) {
                        u0.c("ProcessingImageReader", "Failed to acquire latest image.", e10);
                    }
                }
            }
        }
    }

    /* loaded from: classes.dex */
    public class b implements c1.a {
        public b() {
            n.this = r1;
        }

        @Override // a0.c1.a
        public final void a(c1 c1Var) {
            c1.a aVar;
            Executor executor;
            synchronized (n.this.f1746a) {
                n nVar = n.this;
                aVar = nVar.f1754i;
                executor = nVar.f1755j;
                nVar.f1762q.e();
                n.this.d();
            }
            if (aVar != null) {
                if (executor != null) {
                    executor.execute(new t.n(this, aVar, 3));
                } else {
                    aVar.a(n.this);
                }
            }
        }
    }

    /* loaded from: classes.dex */
    public class c implements d0.c<List<j>> {
        public c() {
            n.this = r1;
        }

        @Override // d0.c
        public final void onFailure(Throwable th2) {
        }

        @Override // d0.c
        public final void onSuccess(List<j> list) {
            n nVar;
            synchronized (n.this.f1746a) {
                n nVar2 = n.this;
                if (nVar2.f1750e) {
                    return;
                }
                nVar2.f1751f = true;
                f1 f1Var = nVar2.f1762q;
                e eVar = nVar2.f1765t;
                Executor executor = nVar2.f1766u;
                try {
                    nVar2.f1759n.d(f1Var);
                } catch (Exception e10) {
                    synchronized (n.this.f1746a) {
                        n.this.f1762q.e();
                        if (eVar != null && executor != null) {
                            executor.execute(new s.q(eVar, e10, 5));
                        }
                    }
                }
                synchronized (n.this.f1746a) {
                    nVar = n.this;
                    nVar.f1751f = false;
                }
                nVar.a();
            }
        }
    }

    /* loaded from: classes.dex */
    public static final class d {

        /* renamed from: a */
        public final c1 f1770a;

        /* renamed from: b */
        public final g0 f1771b;

        /* renamed from: c */
        public final i0 f1772c;

        /* renamed from: d */
        public int f1773d;

        /* renamed from: e */
        public Executor f1774e = Executors.newSingleThreadExecutor();

        public d(c1 c1Var, g0 g0Var, i0 i0Var) {
            this.f1770a = c1Var;
            this.f1771b = g0Var;
            this.f1772c = i0Var;
            this.f1773d = c1Var.h();
        }
    }

    /* loaded from: classes.dex */
    public interface e {
    }

    public n(d dVar) {
        if (dVar.f1770a.k() < dVar.f1771b.a().size()) {
            throw new IllegalArgumentException("MetadataImageReader is smaller than CaptureBundle.");
        }
        c1 c1Var = dVar.f1770a;
        this.f1752g = c1Var;
        int f10 = c1Var.f();
        int c10 = c1Var.c();
        int i10 = dVar.f1773d;
        if (i10 == 256) {
            f10 = ((int) (f10 * c10 * 1.5f)) + 64000;
            c10 = 1;
        }
        y.b bVar = new y.b(ImageReader.newInstance(f10, c10, i10, c1Var.k()));
        this.f1753h = bVar;
        this.f1758m = dVar.f1774e;
        i0 i0Var = dVar.f1772c;
        this.f1759n = i0Var;
        i0Var.a(dVar.f1773d, bVar.getSurface());
        i0Var.c(new Size(c1Var.f(), c1Var.c()));
        this.f1760o = i0Var.b();
        b(dVar.f1771b);
    }

    public final void a() {
        boolean z10;
        boolean z11;
        c.a<Void> aVar;
        synchronized (this.f1746a) {
            z10 = this.f1750e;
            z11 = this.f1751f;
            aVar = this.f1756k;
            if (z10 && !z11) {
                this.f1752g.close();
                this.f1762q.d();
                this.f1753h.close();
            }
        }
        if (!z10 || z11) {
            return;
        }
        this.f1760o.a(new s.p(this, aVar, 7), o8.b.i());
    }

    public final void b(g0 g0Var) {
        synchronized (this.f1746a) {
            if (this.f1750e) {
                return;
            }
            synchronized (this.f1746a) {
                if (!this.f1764s.isDone()) {
                    this.f1764s.cancel(true);
                }
                this.f1762q.e();
            }
            if (g0Var.a() != null) {
                if (this.f1752g.k() >= g0Var.a().size()) {
                    this.f1763r.clear();
                    for (j0 j0Var : g0Var.a()) {
                        if (j0Var != null) {
                            ArrayList arrayList = this.f1763r;
                            j0Var.getId();
                            arrayList.add(0);
                        }
                    }
                } else {
                    throw new IllegalArgumentException("CaptureBundle is larger than InputImageReader.");
                }
            }
            String num = Integer.toString(g0Var.hashCode());
            this.f1761p = num;
            this.f1762q = new f1(num, this.f1763r);
            d();
        }
    }

    @Override // a0.c1
    public final int c() {
        int c10;
        synchronized (this.f1746a) {
            c10 = this.f1752g.c();
        }
        return c10;
    }

    @Override // a0.c1
    public final void close() {
        synchronized (this.f1746a) {
            if (this.f1750e) {
                return;
            }
            this.f1752g.i();
            this.f1753h.i();
            this.f1750e = true;
            this.f1759n.close();
            a();
        }
    }

    public final void d() {
        ArrayList arrayList = new ArrayList();
        Iterator it = this.f1763r.iterator();
        while (it.hasNext()) {
            arrayList.add(this.f1762q.a(((Integer) it.next()).intValue()));
        }
        this.f1764s = d0.f.b(arrayList);
        d0.f.a(d0.f.b(arrayList), this.f1749d, this.f1758m);
    }

    @Override // a0.c1
    public final int f() {
        int f10;
        synchronized (this.f1746a) {
            f10 = this.f1752g.f();
        }
        return f10;
    }

    @Override // a0.c1
    public final j g() {
        j g10;
        synchronized (this.f1746a) {
            g10 = this.f1753h.g();
        }
        return g10;
    }

    @Override // a0.c1
    public final Surface getSurface() {
        Surface surface;
        synchronized (this.f1746a) {
            surface = this.f1752g.getSurface();
        }
        return surface;
    }

    @Override // a0.c1
    public final int h() {
        int h10;
        synchronized (this.f1746a) {
            h10 = this.f1753h.h();
        }
        return h10;
    }

    @Override // a0.c1
    public final void i() {
        synchronized (this.f1746a) {
            this.f1754i = null;
            this.f1755j = null;
            this.f1752g.i();
            this.f1753h.i();
            if (!this.f1751f) {
                this.f1762q.d();
            }
        }
    }

    @Override // a0.c1
    public final void j(c1.a aVar, Executor executor) {
        synchronized (this.f1746a) {
            aVar.getClass();
            this.f1754i = aVar;
            executor.getClass();
            this.f1755j = executor;
            this.f1752g.j(this.f1747b, executor);
            this.f1753h.j(this.f1748c, executor);
        }
    }

    @Override // a0.c1
    public final int k() {
        int k10;
        synchronized (this.f1746a) {
            k10 = this.f1752g.k();
        }
        return k10;
    }

    @Override // a0.c1
    public final j l() {
        j l10;
        synchronized (this.f1746a) {
            l10 = this.f1753h.l();
        }
        return l10;
    }
}
