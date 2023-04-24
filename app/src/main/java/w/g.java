package w;

import a0.m0;
import a0.r1;
import java.util.List;
import v.b0;
import v.x;
import y.u0;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: a */
    public final boolean f29492a;

    /* renamed from: b */
    public final boolean f29493b;

    /* renamed from: c */
    public final boolean f29494c;

    public g(r1 r1Var, r1 r1Var2) {
        this.f29492a = r1Var2.b(b0.class);
        this.f29493b = r1Var.b(x.class);
        this.f29494c = r1Var.b(v.i.class);
    }

    public final void a(List<m0> list) {
        boolean z10;
        if (!this.f29492a && !this.f29493b && !this.f29494c) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (z10 && list != null) {
            for (m0 m0Var : list) {
                m0Var.a();
            }
            u0.a("ForceCloseDeferrableSurface", "deferrableSurface closed");
        }
    }
}
