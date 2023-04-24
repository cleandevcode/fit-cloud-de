package jc;

import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class b0 extends b {
    public b0(x xVar) {
        super(xVar);
    }

    @Override // jc.c
    public final void a(List<String> list) {
        x xVar = this.f17572a;
        xVar.getClass();
        u c10 = xVar.c();
        c10.f17603m0 = xVar;
        c10.f17604n0 = this;
        if (Build.VERSION.SDK_INT >= 26) {
            Intent intent = new Intent("android.settings.MANAGE_UNKNOWN_APP_SOURCES");
            StringBuilder a10 = android.support.v4.media.d.a("package:");
            a10.append(c10.T0().getPackageName());
            intent.setData(Uri.parse(a10.toString()));
            c10.f17610t0.b(intent);
        } else if (c10.c1()) {
            c10.e1(new i(c10));
        }
    }

    @Override // jc.c
    public final void j() {
        boolean canRequestPackageInstalls;
        if (this.f17572a.f17626e.contains("android.permission.REQUEST_INSTALL_PACKAGES") && Build.VERSION.SDK_INT >= 26 && this.f17572a.d() >= 26) {
            canRequestPackageInstalls = this.f17572a.a().getPackageManager().canRequestPackageInstalls();
            if (canRequestPackageInstalls) {
                b();
                return;
            } else if (this.f17572a.f17636o != null) {
                ArrayList r10 = h7.a.r("android.permission.REQUEST_INSTALL_PACKAGES");
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
