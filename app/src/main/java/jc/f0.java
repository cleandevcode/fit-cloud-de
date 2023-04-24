package jc;

import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.provider.Settings;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class f0 extends b {
    public f0(x xVar) {
        super(xVar);
    }

    @Override // jc.c
    public final void a(List<String> list) {
        boolean canDrawOverlays;
        x xVar = this.f17572a;
        xVar.getClass();
        u c10 = xVar.c();
        c10.f17603m0 = xVar;
        c10.f17604n0 = this;
        if (Build.VERSION.SDK_INT >= 23) {
            canDrawOverlays = Settings.canDrawOverlays(c10.V0());
            if (!canDrawOverlays) {
                Intent intent = new Intent("android.settings.action.MANAGE_OVERLAY_PERMISSION");
                StringBuilder a10 = android.support.v4.media.d.a("package:");
                a10.append(c10.T0().getPackageName());
                intent.setData(Uri.parse(a10.toString()));
                c10.f17607q0.b(intent);
                return;
            }
        }
        c10.d1();
    }

    @Override // jc.c
    public final void j() {
        boolean canDrawOverlays;
        if (this.f17572a.f17626e.contains("android.permission.SYSTEM_ALERT_WINDOW")) {
            if (Build.VERSION.SDK_INT >= 23 && this.f17572a.d() >= 23) {
                canDrawOverlays = Settings.canDrawOverlays(this.f17572a.a());
                if (canDrawOverlays) {
                    b();
                    return;
                } else if (this.f17572a.f17636o != null) {
                    ArrayList r10 = h7.a.r("android.permission.SYSTEM_ALERT_WINDOW");
                    this.f17572a.getClass();
                    s5.b bVar = this.f17572a.f17636o;
                    gm.l.c(bVar);
                    bVar.a(this.f17574c, r10);
                    return;
                }
            } else {
                this.f17572a.f17630i.add("android.permission.SYSTEM_ALERT_WINDOW");
                this.f17572a.f17626e.remove("android.permission.SYSTEM_ALERT_WINDOW");
            }
        }
        b();
    }
}
