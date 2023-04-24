package androidx.camera.core;

import a0.c1;
import android.media.ImageReader;
import android.util.Log;
import android.util.LongSparseArray;
import android.view.Surface;
import androidx.camera.core.d;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.Executor;
import s.h1;
import y.e1;
import y.o0;
import y.u0;
import y.v0;

/* loaded from: classes.dex */
public final class l implements c1, d.a {

    /* renamed from: a */
    public final Object f1720a;

    /* renamed from: b */
    public a f1721b;

    /* renamed from: c */
    public int f1722c;

    /* renamed from: d */
    public v0 f1723d;

    /* renamed from: e */
    public boolean f1724e;

    /* renamed from: f */
    public final c1 f1725f;

    /* renamed from: g */
    public c1.a f1726g;

    /* renamed from: h */
    public Executor f1727h;

    /* renamed from: i */
    public final LongSparseArray<o0> f1728i;

    /* renamed from: j */
    public final LongSparseArray<j> f1729j;

    /* renamed from: k */
    public int f1730k;

    /* renamed from: l */
    public final ArrayList f1731l;

    /* renamed from: m */
    public final ArrayList f1732m;

    /* loaded from: classes.dex */
    public class a extends a0.j {
        public a() {
            l.this = r1;
        }

        @Override // a0.j
        public final void b(a0.s sVar) {
            l lVar = l.this;
            synchronized (lVar.f1720a) {
                if (!lVar.f1724e) {
                    lVar.f1728i.put(sVar.d(), new e0.c(sVar));
                    lVar.m();
                }
            }
        }
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [y.v0] */
    public l(int i10, int i11, int i12, int i13) {
        y.b bVar = new y.b(ImageReader.newInstance(i10, i11, i12, i13));
        this.f1720a = new Object();
        this.f1721b = new a();
        this.f1722c = 0;
        this.f1723d = new c1.a() { // from class: y.v0
            @Override // a0.c1.a
            public final void a(a0.c1 c1Var) {
                androidx.camera.core.l lVar = androidx.camera.core.l.this;
                synchronized (lVar.f1720a) {
                    lVar.f1722c++;
                }
                lVar.e(c1Var);
            }
        };
        this.f1724e = false;
        this.f1728i = new LongSparseArray<>();
        this.f1729j = new LongSparseArray<>();
        this.f1732m = new ArrayList();
        this.f1725f = bVar;
        this.f1730k = 0;
        this.f1731l = new ArrayList(k());
    }

    @Override // androidx.camera.core.d.a
    public final void a(j jVar) {
        synchronized (this.f1720a) {
            b(jVar);
        }
    }

    public final void b(j jVar) {
        synchronized (this.f1720a) {
            int indexOf = this.f1731l.indexOf(jVar);
            if (indexOf >= 0) {
                this.f1731l.remove(indexOf);
                int i10 = this.f1730k;
                if (indexOf <= i10) {
                    this.f1730k = i10 - 1;
                }
            }
            this.f1732m.remove(jVar);
            if (this.f1722c > 0) {
                e(this.f1725f);
            }
        }
    }

    @Override // a0.c1
    public final int c() {
        int c10;
        synchronized (this.f1720a) {
            c10 = this.f1725f.c();
        }
        return c10;
    }

    @Override // a0.c1
    public final void close() {
        synchronized (this.f1720a) {
            if (this.f1724e) {
                return;
            }
            Iterator it = new ArrayList(this.f1731l).iterator();
            while (it.hasNext()) {
                ((j) it.next()).close();
            }
            this.f1731l.clear();
            this.f1725f.close();
            this.f1724e = true;
        }
    }

    public final void d(e1 e1Var) {
        c1.a aVar;
        Executor executor;
        synchronized (this.f1720a) {
            aVar = null;
            if (this.f1731l.size() < k()) {
                e1Var.a(this);
                this.f1731l.add(e1Var);
                aVar = this.f1726g;
                executor = this.f1727h;
            } else {
                u0.a("TAG", "Maximum image number reached.");
                e1Var.close();
                executor = null;
            }
        }
        if (aVar != null) {
            if (executor != null) {
                executor.execute(new s.p(this, aVar, 6));
            } else {
                aVar.a(this);
            }
        }
    }

    public final void e(c1 c1Var) {
        synchronized (this.f1720a) {
            if (this.f1724e) {
                return;
            }
            int size = this.f1729j.size() + this.f1731l.size();
            if (size >= c1Var.k()) {
                u0.a("MetadataImageReader", "Skip to acquire the next image because the acquired image count has reached the max images count.");
                return;
            }
            do {
                j jVar = null;
                try {
                    jVar = c1Var.l();
                    if (jVar != null) {
                        this.f1722c--;
                        size++;
                        this.f1729j.put(jVar.d0().d(), jVar);
                        m();
                    }
                } catch (IllegalStateException e10) {
                    String g10 = u0.g("MetadataImageReader");
                    if (u0.f(3, g10)) {
                        Log.d(g10, "Failed to acquire next image.", e10);
                    }
                }
                if (jVar == null || this.f1722c <= 0) {
                    break;
                }
            } while (size < c1Var.k());
        }
    }

    @Override // a0.c1
    public final int f() {
        int f10;
        synchronized (this.f1720a) {
            f10 = this.f1725f.f();
        }
        return f10;
    }

    @Override // a0.c1
    public final j g() {
        synchronized (this.f1720a) {
            if (this.f1731l.isEmpty()) {
                return null;
            }
            if (this.f1730k < this.f1731l.size()) {
                ArrayList arrayList = new ArrayList();
                for (int i10 = 0; i10 < this.f1731l.size() - 1; i10++) {
                    if (!this.f1732m.contains(this.f1731l.get(i10))) {
                        arrayList.add((j) this.f1731l.get(i10));
                    }
                }
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((j) it.next()).close();
                }
                int size = this.f1731l.size() - 1;
                ArrayList arrayList2 = this.f1731l;
                this.f1730k = size + 1;
                j jVar = (j) arrayList2.get(size);
                this.f1732m.add(jVar);
                return jVar;
            }
            throw new IllegalStateException("Maximum image number reached.");
        }
    }

    @Override // a0.c1
    public final Surface getSurface() {
        Surface surface;
        synchronized (this.f1720a) {
            surface = this.f1725f.getSurface();
        }
        return surface;
    }

    @Override // a0.c1
    public final int h() {
        int h10;
        synchronized (this.f1720a) {
            h10 = this.f1725f.h();
        }
        return h10;
    }

    @Override // a0.c1
    public final void i() {
        synchronized (this.f1720a) {
            this.f1725f.i();
            this.f1726g = null;
            this.f1727h = null;
            this.f1722c = 0;
        }
    }

    @Override // a0.c1
    public final void j(c1.a aVar, Executor executor) {
        synchronized (this.f1720a) {
            aVar.getClass();
            this.f1726g = aVar;
            executor.getClass();
            this.f1727h = executor;
            this.f1725f.j(this.f1723d, executor);
        }
    }

    @Override // a0.c1
    public final int k() {
        int k10;
        synchronized (this.f1720a) {
            k10 = this.f1725f.k();
        }
        return k10;
    }

    @Override // a0.c1
    public final j l() {
        synchronized (this.f1720a) {
            if (this.f1731l.isEmpty()) {
                return null;
            }
            if (this.f1730k < this.f1731l.size()) {
                ArrayList arrayList = this.f1731l;
                int i10 = this.f1730k;
                this.f1730k = i10 + 1;
                j jVar = (j) arrayList.get(i10);
                this.f1732m.add(jVar);
                return jVar;
            }
            throw new IllegalStateException("Maximum image number reached.");
        }
    }

    public final void m() {
        synchronized (this.f1720a) {
            for (int size = this.f1728i.size() - 1; size >= 0; size--) {
                o0 valueAt = this.f1728i.valueAt(size);
                long d10 = valueAt.d();
                j jVar = this.f1729j.get(d10);
                if (jVar != null) {
                    this.f1729j.remove(d10);
                    this.f1728i.removeAt(size);
                    d(new e1(jVar, null, valueAt));
                }
            }
            n();
        }
    }

    public final void n() {
        synchronized (this.f1720a) {
            if (this.f1729j.size() != 0 && this.f1728i.size() != 0) {
                Long valueOf = Long.valueOf(this.f1729j.keyAt(0));
                Long valueOf2 = Long.valueOf(this.f1728i.keyAt(0));
                h1.f(valueOf2.equals(valueOf) ? false : true);
                if (valueOf2.longValue() > valueOf.longValue()) {
                    for (int size = this.f1729j.size() - 1; size >= 0; size--) {
                        if (this.f1729j.keyAt(size) < valueOf2.longValue()) {
                            this.f1729j.valueAt(size).close();
                            this.f1729j.removeAt(size);
                        }
                    }
                } else {
                    for (int size2 = this.f1728i.size() - 1; size2 >= 0; size2--) {
                        if (this.f1728i.keyAt(size2) < valueOf.longValue()) {
                            this.f1728i.removeAt(size2);
                        }
                    }
                }
            }
        }
    }
}
