package qm;

import android.os.Handler;
import android.os.Looper;
import bi.m0;
import gm.l;
import java.util.concurrent.CancellationException;
import pm.e2;
import pm.j;
import pm.o0;
import pm.p1;
import pm.q0;
import pm.s1;
import um.q;

/* loaded from: classes2.dex */
public final class f extends g {
    private volatile f _immediate;

    /* renamed from: c */
    public final Handler f24991c;

    /* renamed from: d */
    public final String f24992d;

    /* renamed from: e */
    public final boolean f24993e;

    /* renamed from: f */
    public final f f24994f;

    public f(Handler handler) {
        this(handler, null, false);
    }

    @Override // pm.j0
    public final void D(long j10, j jVar) {
        d dVar = new d(jVar, this);
        Handler handler = this.f24991c;
        if (j10 > 4611686018427387903L) {
            j10 = 4611686018427387903L;
        }
        if (handler.postDelayed(dVar, j10)) {
            jVar.z(new e(this, dVar));
        } else {
            t0(jVar.f24353e, dVar);
        }
    }

    @Override // qm.g, pm.j0
    public final q0 E(long j10, final e2 e2Var, xl.f fVar) {
        Handler handler = this.f24991c;
        if (j10 > 4611686018427387903L) {
            j10 = 4611686018427387903L;
        }
        if (handler.postDelayed(e2Var, j10)) {
            return new q0() { // from class: qm.c
                @Override // pm.q0
                public final void c() {
                    f fVar2 = f.this;
                    fVar2.f24991c.removeCallbacks(e2Var);
                }
            };
        }
        t0(fVar, e2Var);
        return s1.f24388a;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof f) && ((f) obj).f24991c == this.f24991c;
    }

    public final int hashCode() {
        return System.identityHashCode(this.f24991c);
    }

    @Override // pm.b0
    public final void l0(xl.f fVar, Runnable runnable) {
        if (this.f24991c.post(runnable)) {
            return;
        }
        t0(fVar, runnable);
    }

    @Override // pm.b0
    public final boolean p0(xl.f fVar) {
        return (this.f24993e && l.a(Looper.myLooper(), this.f24991c.getLooper())) ? false : true;
    }

    @Override // pm.p1
    public final p1 q0() {
        return this.f24994f;
    }

    public final void t0(xl.f fVar, Runnable runnable) {
        m0.f(fVar, new CancellationException("The task was rejected, the handler underlying the dispatcher '" + this + "' was closed"));
        o0.f24382b.l0(fVar, runnable);
    }

    @Override // pm.p1, pm.b0
    public final String toString() {
        p1 p1Var;
        String str;
        wm.c cVar = o0.f24381a;
        p1 p1Var2 = q.f28935a;
        if (this == p1Var2) {
            str = "Dispatchers.Main";
        } else {
            try {
                p1Var = p1Var2.q0();
            } catch (UnsupportedOperationException unused) {
                p1Var = null;
            }
            if (this == p1Var) {
                str = "Dispatchers.Main.immediate";
            } else {
                str = null;
            }
        }
        if (str == null) {
            String str2 = this.f24992d;
            if (str2 == null) {
                str2 = this.f24991c.toString();
            }
            if (this.f24993e) {
                return a.b.b(str2, ".immediate");
            }
            return str2;
        }
        return str;
    }

    public f(Handler handler, String str, boolean z10) {
        this.f24991c = handler;
        this.f24992d = str;
        this.f24993e = z10;
        this._immediate = z10 ? this : null;
        f fVar = this._immediate;
        if (fVar == null) {
            fVar = new f(handler, str, true);
            this._immediate = fVar;
        }
        this.f24994f = fVar;
    }
}
