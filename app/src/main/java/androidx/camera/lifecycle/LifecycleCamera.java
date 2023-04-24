package androidx.camera.lifecycle;

import a0.w;
import android.os.Build;
import androidx.lifecycle.c0;
import androidx.lifecycle.k;
import androidx.lifecycle.t;
import androidx.lifecycle.u;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import y.g;
import y.n;

/* loaded from: classes.dex */
public final class LifecycleCamera implements t, g {

    /* renamed from: b */
    public final u f1825b;

    /* renamed from: c */
    public final e0.e f1826c;

    /* renamed from: a */
    public final Object f1824a = new Object();

    /* renamed from: d */
    public boolean f1827d = false;

    public LifecycleCamera(u uVar, e0.e eVar) {
        this.f1825b = uVar;
        this.f1826c = eVar;
        if (uVar.a0().f2790c.a(k.c.STARTED)) {
            eVar.d();
        } else {
            eVar.p();
        }
        uVar.a0().a(this);
    }

    @Override // y.g
    public final n b() {
        return this.f1826c.b();
    }

    public final void e(a0.t tVar) {
        e0.e eVar = this.f1826c;
        synchronized (eVar.f13298i) {
            if (tVar == null) {
                tVar = w.f203a;
            }
            if (!eVar.f13294e.isEmpty() && !((w.a) eVar.f13297h).f204y.equals(((w.a) tVar).f204y)) {
                throw new IllegalStateException("Need to unbind all use cases before binding with extension enabled");
            }
            eVar.f13297h = tVar;
            eVar.f13290a.e(tVar);
        }
    }

    public final List<androidx.camera.core.t> f() {
        List<androidx.camera.core.t> unmodifiableList;
        synchronized (this.f1824a) {
            unmodifiableList = Collections.unmodifiableList(this.f1826c.q());
        }
        return unmodifiableList;
    }

    public final void m() {
        synchronized (this.f1824a) {
            if (!this.f1827d) {
                return;
            }
            this.f1827d = false;
            if (this.f1825b.a0().f2790c.a(k.c.STARTED)) {
                onStart(this.f1825b);
            }
        }
    }

    @c0(k.b.ON_DESTROY)
    public void onDestroy(u uVar) {
        synchronized (this.f1824a) {
            e0.e eVar = this.f1826c;
            eVar.s((ArrayList) eVar.q());
        }
    }

    @c0(k.b.ON_PAUSE)
    public void onPause(u uVar) {
        if (Build.VERSION.SDK_INT >= 24) {
            this.f1826c.f13290a.i(false);
        }
    }

    @c0(k.b.ON_RESUME)
    public void onResume(u uVar) {
        if (Build.VERSION.SDK_INT >= 24) {
            this.f1826c.f13290a.i(true);
        }
    }

    @c0(k.b.ON_START)
    public void onStart(u uVar) {
        synchronized (this.f1824a) {
            if (!this.f1827d) {
                this.f1826c.d();
            }
        }
    }

    @c0(k.b.ON_STOP)
    public void onStop(u uVar) {
        synchronized (this.f1824a) {
            if (!this.f1827d) {
                this.f1826c.p();
            }
        }
    }
}
