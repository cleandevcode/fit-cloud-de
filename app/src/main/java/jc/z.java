package jc;

import android.os.Build;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class z extends b {
    public z(x xVar) {
        super(xVar);
    }

    @Override // jc.c
    public final void a(List<String> list) {
        x xVar = this.f17572a;
        xVar.getClass();
        u c10 = xVar.c();
        c10.f17603m0 = xVar;
        c10.f17604n0 = this;
        c10.f17612v0.b("android.permission.BODY_SENSORS_BACKGROUND");
    }

    @Override // jc.c
    public final void j() {
        boolean z10;
        if (this.f17572a.f17626e.contains("android.permission.BODY_SENSORS_BACKGROUND")) {
            if (Build.VERSION.SDK_INT < 33) {
                this.f17572a.f17626e.remove("android.permission.BODY_SENSORS_BACKGROUND");
                this.f17572a.f17629h.add("android.permission.BODY_SENSORS_BACKGROUND");
                b();
                return;
            }
            boolean z11 = false;
            if (y0.a.a(this.f17572a.a(), "android.permission.BODY_SENSORS_BACKGROUND") == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                b();
                return;
            }
            if (y0.a.a(this.f17572a.a(), "android.permission.BODY_SENSORS") == 0) {
                z11 = true;
            }
            if (z11) {
                if (this.f17572a.f17636o == null) {
                    x xVar = this.f17572a;
                    xVar.getClass();
                    u c10 = xVar.c();
                    c10.f17603m0 = xVar;
                    c10.f17604n0 = this;
                    c10.f17612v0.b("android.permission.BODY_SENSORS_BACKGROUND");
                    return;
                }
                ArrayList r10 = h7.a.r("android.permission.BODY_SENSORS_BACKGROUND");
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
