package androidx.camera.core;

import a0.c1;
import android.view.Surface;
import androidx.camera.core.d;
import java.util.concurrent.Executor;
import y.g1;

/* loaded from: classes.dex */
public final class o implements c1 {

    /* renamed from: d */
    public final c1 f1778d;

    /* renamed from: e */
    public final Surface f1779e;

    /* renamed from: a */
    public final Object f1775a = new Object();

    /* renamed from: b */
    public int f1776b = 0;

    /* renamed from: c */
    public boolean f1777c = false;

    /* renamed from: f */
    public final y.c1 f1780f = new d.a() { // from class: y.c1
        @Override // androidx.camera.core.d.a
        public final void a(androidx.camera.core.j jVar) {
            androidx.camera.core.o oVar = androidx.camera.core.o.this;
            synchronized (oVar.f1775a) {
                int i10 = oVar.f1776b - 1;
                oVar.f1776b = i10;
                if (oVar.f1777c && i10 == 0) {
                    oVar.close();
                }
                oVar.getClass();
            }
        }
    };

    /* JADX WARN: Type inference failed for: r0v2, types: [y.c1] */
    public o(c1 c1Var) {
        this.f1778d = c1Var;
        this.f1779e = c1Var.getSurface();
    }

    public final void a() {
        synchronized (this.f1775a) {
            this.f1777c = true;
            this.f1778d.i();
            if (this.f1776b == 0) {
                close();
            }
        }
    }

    @Override // a0.c1
    public final int c() {
        int c10;
        synchronized (this.f1775a) {
            c10 = this.f1778d.c();
        }
        return c10;
    }

    @Override // a0.c1
    public final void close() {
        synchronized (this.f1775a) {
            Surface surface = this.f1779e;
            if (surface != null) {
                surface.release();
            }
            this.f1778d.close();
        }
    }

    @Override // a0.c1
    public final int f() {
        int f10;
        synchronized (this.f1775a) {
            f10 = this.f1778d.f();
        }
        return f10;
    }

    @Override // a0.c1
    public final j g() {
        g1 g1Var;
        synchronized (this.f1775a) {
            j g10 = this.f1778d.g();
            if (g10 != null) {
                this.f1776b++;
                g1Var = new g1(g10);
                g1Var.a(this.f1780f);
            } else {
                g1Var = null;
            }
        }
        return g1Var;
    }

    @Override // a0.c1
    public final Surface getSurface() {
        Surface surface;
        synchronized (this.f1775a) {
            surface = this.f1778d.getSurface();
        }
        return surface;
    }

    @Override // a0.c1
    public final int h() {
        int h10;
        synchronized (this.f1775a) {
            h10 = this.f1778d.h();
        }
        return h10;
    }

    @Override // a0.c1
    public final void i() {
        synchronized (this.f1775a) {
            this.f1778d.i();
        }
    }

    @Override // a0.c1
    public final void j(final c1.a aVar, Executor executor) {
        synchronized (this.f1775a) {
            this.f1778d.j(new c1.a() { // from class: y.d1
                @Override // a0.c1.a
                public final void a(a0.c1 c1Var) {
                    androidx.camera.core.o oVar = androidx.camera.core.o.this;
                    c1.a aVar2 = aVar;
                    oVar.getClass();
                    aVar2.a(oVar);
                }
            }, executor);
        }
    }

    @Override // a0.c1
    public final int k() {
        int k10;
        synchronized (this.f1775a) {
            k10 = this.f1778d.k();
        }
        return k10;
    }

    @Override // a0.c1
    public final j l() {
        g1 g1Var;
        synchronized (this.f1775a) {
            j l10 = this.f1778d.l();
            if (l10 != null) {
                this.f1776b++;
                g1Var = new g1(l10);
                g1Var.a(this.f1780f);
            } else {
                g1Var = null;
            }
        }
        return g1Var;
    }
}
