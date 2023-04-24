package jc;

import android.os.Build;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class y extends b {
    public y(x xVar) {
        super(xVar);
    }

    @Override // jc.c
    public final void a(List<String> list) {
        x xVar = this.f17572a;
        xVar.getClass();
        u c10 = xVar.c();
        c10.f17603m0 = xVar;
        c10.f17604n0 = this;
        c10.f17606p0.b("android.permission.ACCESS_BACKGROUND_LOCATION");
    }

    @Override // jc.c
    public final void j() {
        boolean z10;
        boolean z11;
        if (this.f17572a.f17626e.contains("android.permission.ACCESS_BACKGROUND_LOCATION")) {
            if (Build.VERSION.SDK_INT < 29) {
                this.f17572a.f17626e.remove("android.permission.ACCESS_BACKGROUND_LOCATION");
                this.f17572a.f17629h.add("android.permission.ACCESS_BACKGROUND_LOCATION");
                b();
                return;
            }
            boolean z12 = false;
            if (y0.a.a(this.f17572a.a(), "android.permission.ACCESS_BACKGROUND_LOCATION") == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                b();
                return;
            }
            if (y0.a.a(this.f17572a.a(), "android.permission.ACCESS_FINE_LOCATION") == 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (y0.a.a(this.f17572a.a(), "android.permission.ACCESS_COARSE_LOCATION") == 0) {
                z12 = true;
            }
            if (z11 || z12) {
                if (this.f17572a.f17636o == null) {
                    x xVar = this.f17572a;
                    xVar.getClass();
                    u c10 = xVar.c();
                    c10.f17603m0 = xVar;
                    c10.f17604n0 = this;
                    c10.f17606p0.b("android.permission.ACCESS_BACKGROUND_LOCATION");
                    return;
                }
                ArrayList r10 = h7.a.r("android.permission.ACCESS_BACKGROUND_LOCATION");
                this.f17572a.getClass();
                s5.b bVar = this.f17572a.f17636o;
                gm.l.c(bVar);
                bVar.a(this.f17574c, r10);
                return;
            }
        }
        b();
    }
}
