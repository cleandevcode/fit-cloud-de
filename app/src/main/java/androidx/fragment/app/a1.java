package androidx.fragment.app;

import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import androidx.lifecycle.k;
import androidx.lifecycle.v0;

/* loaded from: classes.dex */
public final class a1 implements androidx.lifecycle.i, q2.c, androidx.lifecycle.y0 {

    /* renamed from: a */
    public final r f2310a;

    /* renamed from: b */
    public final androidx.lifecycle.x0 f2311b;

    /* renamed from: c */
    public v0.b f2312c;

    /* renamed from: d */
    public androidx.lifecycle.v f2313d = null;

    /* renamed from: e */
    public q2.b f2314e = null;

    public a1(r rVar, androidx.lifecycle.x0 x0Var) {
        this.f2310a = rVar;
        this.f2311b = x0Var;
    }

    @Override // q2.c
    public final q2.a C() {
        d();
        return this.f2314e.f24512b;
    }

    @Override // androidx.lifecycle.u
    public final androidx.lifecycle.v a0() {
        d();
        return this.f2313d;
    }

    public final void c(k.b bVar) {
        this.f2313d.f(bVar);
    }

    public final void d() {
        if (this.f2313d == null) {
            this.f2313d = new androidx.lifecycle.v(this);
            q2.b bVar = new q2.b(this);
            this.f2314e = bVar;
            bVar.a();
            androidx.lifecycle.m0.b(this);
        }
    }

    @Override // androidx.lifecycle.i
    public final v0.b r() {
        v0.b r10 = this.f2310a.r();
        if (!r10.equals(this.f2310a.f2515e0)) {
            this.f2312c = r10;
            return r10;
        }
        if (this.f2312c == null) {
            Application application = null;
            Context applicationContext = this.f2310a.V0().getApplicationContext();
            while (true) {
                if (!(applicationContext instanceof ContextWrapper)) {
                    break;
                } else if (applicationContext instanceof Application) {
                    application = applicationContext;
                    break;
                } else {
                    applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
                }
            }
            this.f2312c = new androidx.lifecycle.p0(application, this, this.f2310a.f2516f);
        }
        return this.f2312c;
    }

    @Override // androidx.lifecycle.i
    public final d2.c s() {
        Application application;
        Context applicationContext = this.f2310a.V0().getApplicationContext();
        while (true) {
            if (applicationContext instanceof ContextWrapper) {
                if (applicationContext instanceof Application) {
                    application = (Application) applicationContext;
                    break;
                }
                applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
            } else {
                application = null;
                break;
            }
        }
        d2.c cVar = new d2.c(0);
        if (application != null) {
            cVar.f12611a.put(androidx.lifecycle.u0.f2788a, application);
        }
        cVar.f12611a.put(androidx.lifecycle.m0.f2748a, this);
        cVar.f12611a.put(androidx.lifecycle.m0.f2749b, this);
        Bundle bundle = this.f2310a.f2516f;
        if (bundle != null) {
            cVar.f12611a.put(androidx.lifecycle.m0.f2750c, bundle);
        }
        return cVar;
    }

    @Override // androidx.lifecycle.y0
    public final androidx.lifecycle.x0 z() {
        d();
        return this.f2311b;
    }
}
