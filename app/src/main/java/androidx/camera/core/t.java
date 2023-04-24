package androidx.camera.core;

import a0.a0;
import a0.a1;
import a0.b0;
import a0.h2;
import a0.i2;
import a0.j1;
import a0.l0;
import a0.m0;
import a0.u1;
import a0.x;
import android.annotation.SuppressLint;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.util.Size;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import s.c0;
import s.h1;

/* loaded from: classes.dex */
public abstract class t {

    /* renamed from: d */
    public h2<?> f1803d;

    /* renamed from: e */
    public h2<?> f1804e;

    /* renamed from: f */
    public h2<?> f1805f;

    /* renamed from: g */
    public Size f1806g;

    /* renamed from: h */
    public h2<?> f1807h;

    /* renamed from: i */
    public Rect f1808i;

    /* renamed from: k */
    public b0 f1810k;

    /* renamed from: a */
    public final HashSet f1800a = new HashSet();

    /* renamed from: b */
    public final Object f1801b = new Object();

    /* renamed from: c */
    public int f1802c = 2;

    /* renamed from: j */
    public Matrix f1809j = new Matrix();

    /* renamed from: l */
    public u1 f1811l = u1.a();

    /* loaded from: classes.dex */
    public interface a {
        void a();

        void b();
    }

    /* loaded from: classes.dex */
    public interface b {
        void c(t tVar);

        void d(t tVar);

        void f(t tVar);

        void m(t tVar);
    }

    public t(h2<?> h2Var) {
        this.f1804e = h2Var;
        this.f1805f = h2Var;
    }

    public final b0 a() {
        b0 b0Var;
        synchronized (this.f1801b) {
            b0Var = this.f1810k;
        }
        return b0Var;
    }

    public final x b() {
        synchronized (this.f1801b) {
            b0 b0Var = this.f1810k;
            if (b0Var == null) {
                return x.f207a;
            }
            return b0Var.g();
        }
    }

    public final String c() {
        b0 a10 = a();
        h1.i(a10, "No camera attached to use case: " + this);
        return a10.l().f25939a;
    }

    public abstract h2<?> d(boolean z10, i2 i2Var);

    public final int e() {
        return this.f1805f.h();
    }

    public final String f() {
        h2<?> h2Var = this.f1805f;
        StringBuilder a10 = android.support.v4.media.d.a("<UnknownUseCase-");
        a10.append(hashCode());
        a10.append(">");
        String n10 = h2Var.n(a10.toString());
        Objects.requireNonNull(n10);
        return n10;
    }

    public final int g(b0 b0Var) {
        return b0Var.l().e(((a1) this.f1805f).x(0));
    }

    public abstract h2.a<?, ?, ?> h(l0 l0Var);

    public final boolean i(String str) {
        if (a() == null) {
            return false;
        }
        return Objects.equals(str, c());
    }

    public final h2<?> j(a0 a0Var, h2<?> h2Var, h2<?> h2Var2) {
        j1 B;
        if (h2Var2 != null) {
            B = j1.C(h2Var2);
            B.f148y.remove(e0.i.f13306u);
        } else {
            B = j1.B();
        }
        for (l0.a<?> aVar : this.f1804e.d()) {
            B.D(aVar, this.f1804e.a(aVar), this.f1804e.c(aVar));
        }
        if (h2Var != null) {
            for (l0.a<?> aVar2 : h2Var.d()) {
                if (!aVar2.b().equals(e0.i.f13306u.f33a)) {
                    B.D(aVar2, h2Var.a(aVar2), h2Var.c(aVar2));
                }
            }
        }
        if (B.z(a1.f12h)) {
            a0.d dVar = a1.f9e;
            if (B.z(dVar)) {
                B.f148y.remove(dVar);
            }
        }
        return r(a0Var, h(B));
    }

    public final void k() {
        Iterator it = this.f1800a.iterator();
        while (it.hasNext()) {
            ((b) it.next()).d(this);
        }
    }

    public final void l() {
        int b10 = c0.b(this.f1802c);
        if (b10 == 0) {
            Iterator it = this.f1800a.iterator();
            while (it.hasNext()) {
                ((b) it.next()).c(this);
            }
        } else if (b10 != 1) {
        } else {
            Iterator it2 = this.f1800a.iterator();
            while (it2.hasNext()) {
                ((b) it2.next()).m(this);
            }
        }
    }

    @SuppressLint({"WrongConstant"})
    public final void m(b0 b0Var, h2<?> h2Var, h2<?> h2Var2) {
        synchronized (this.f1801b) {
            this.f1810k = b0Var;
            this.f1800a.add(b0Var);
        }
        this.f1803d = h2Var;
        this.f1807h = h2Var2;
        h2<?> j10 = j(b0Var.l(), this.f1803d, this.f1807h);
        this.f1805f = j10;
        a f10 = j10.f();
        if (f10 != null) {
            b0Var.l();
            f10.b();
        }
        n();
    }

    public void n() {
    }

    public void o() {
    }

    public final void p(b0 b0Var) {
        boolean z10;
        q();
        a f10 = this.f1805f.f();
        if (f10 != null) {
            f10.a();
        }
        synchronized (this.f1801b) {
            if (b0Var == this.f1810k) {
                z10 = true;
            } else {
                z10 = false;
            }
            h1.f(z10);
            this.f1800a.remove(this.f1810k);
            this.f1810k = null;
        }
        this.f1806g = null;
        this.f1808i = null;
        this.f1805f = this.f1804e;
        this.f1803d = null;
        this.f1807h = null;
    }

    public void q() {
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [a0.h2, a0.h2<?>] */
    public h2<?> r(a0 a0Var, h2.a<?, ?, ?> aVar) {
        return aVar.c();
    }

    public void s() {
    }

    public abstract Size t(Size size);

    public void u(Matrix matrix) {
        this.f1809j = new Matrix(matrix);
    }

    /* JADX WARN: Type inference failed for: r6v1, types: [a0.h2, a0.h2<?>] */
    public final boolean v(int i10) {
        h2<?> j10;
        Size q10;
        int x10 = ((a1) this.f1805f).x(-1);
        if (x10 != -1 && x10 == i10) {
            return false;
        }
        h2.a<?, ?, ?> h10 = h(this.f1804e);
        a1 a1Var = (a1) h10.c();
        int x11 = a1Var.x(-1);
        if (x11 == -1 || x11 != i10) {
            ((a1.a) h10).d(i10);
        }
        if (x11 != -1 && i10 != -1 && x11 != i10) {
            if (Math.abs(b0.c.u(i10) - b0.c.u(x11)) % 180 == 90 && (q10 = a1Var.q()) != null) {
                ((a1.a) h10).a(new Size(q10.getHeight(), q10.getWidth()));
            }
        }
        this.f1804e = h10.c();
        b0 a10 = a();
        if (a10 == null) {
            j10 = this.f1804e;
        } else {
            j10 = j(a10.l(), this.f1803d, this.f1807h);
        }
        this.f1805f = j10;
        return true;
    }

    public void w(Rect rect) {
        this.f1808i = rect;
    }

    public final void x(u1 u1Var) {
        this.f1811l = u1Var;
        for (m0 m0Var : u1Var.b()) {
            if (m0Var.f133h == null) {
                m0Var.f133h = getClass();
            }
        }
    }
}
