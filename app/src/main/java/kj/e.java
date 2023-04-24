package kj;

import al.j;
import android.app.Application;
import gm.l;
import jj.o0;
import wi.k;

/* loaded from: classes2.dex */
public final class e {

    /* renamed from: a */
    public final lj.c f18613a;

    /* renamed from: b */
    public final lj.e f18614b;

    /* renamed from: c */
    public final j f18615c;

    public e(Application application, k kVar, o0 o0Var, boolean z10, boolean z11) {
        lj.c cVar;
        l.f(application, "application");
        l.f(o0Var, "messageFeature");
        if (z10) {
            cVar = new lj.c(application);
        } else {
            cVar = null;
        }
        this.f18613a = cVar;
        this.f18614b = z11 ? new lj.e(application, kVar, o0Var) : null;
        this.f18615c = h7.a.t(kVar).y(new ph.k(7, new d(this)), yk.a.f31790e, yk.a.f31788c);
    }
}
