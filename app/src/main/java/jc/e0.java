package jc;

import android.content.Intent;
import android.os.Build;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class e0 extends b {
    public e0(x xVar) {
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
            Intent intent = new Intent("android.settings.APP_NOTIFICATION_SETTINGS");
            intent.putExtra("android.provider.extra.APP_PACKAGE", c10.T0().getPackageName());
            c10.f17611u0.b(intent);
        } else if (c10.c1()) {
            c10.e1(new i(c10));
        }
    }

    @Override // jc.c
    public final void j() {
        if (this.f17572a.f17626e.contains("android.permission.POST_NOTIFICATIONS")) {
            if (new x0.c0(this.f17572a.a()).a()) {
                b();
                return;
            } else if (this.f17572a.f17636o != null) {
                ArrayList r10 = h7.a.r("android.permission.POST_NOTIFICATIONS");
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
