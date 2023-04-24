package jc;

import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.provider.Settings;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class g0 extends b {
    public g0(x xVar) {
        super(xVar);
    }

    @Override // jc.c
    public final void a(List<String> list) {
        boolean canWrite;
        x xVar = this.f17572a;
        xVar.getClass();
        u c10 = xVar.c();
        c10.f17603m0 = xVar;
        c10.f17604n0 = this;
        if (Build.VERSION.SDK_INT >= 23) {
            canWrite = Settings.System.canWrite(c10.V0());
            if (!canWrite) {
                Intent intent = new Intent("android.settings.action.MANAGE_WRITE_SETTINGS");
                StringBuilder a10 = android.support.v4.media.d.a("package:");
                a10.append(c10.T0().getPackageName());
                intent.setData(Uri.parse(a10.toString()));
                c10.f17608r0.b(intent);
                return;
            }
        }
        if (c10.c1()) {
            c10.e1(new l(c10));
        }
    }

    @Override // jc.c
    public final void j() {
        boolean canWrite;
        if (this.f17572a.f17626e.contains("android.permission.WRITE_SETTINGS")) {
            if (Build.VERSION.SDK_INT >= 23 && this.f17572a.d() >= 23) {
                canWrite = Settings.System.canWrite(this.f17572a.a());
                if (canWrite) {
                    b();
                    return;
                } else if (this.f17572a.f17636o != null) {
                    ArrayList r10 = h7.a.r("android.permission.WRITE_SETTINGS");
                    this.f17572a.getClass();
                    s5.b bVar = this.f17572a.f17636o;
                    gm.l.c(bVar);
                    bVar.a(this.f17574c, r10);
                    return;
                }
            } else {
                this.f17572a.f17630i.add("android.permission.WRITE_SETTINGS");
                this.f17572a.f17626e.remove("android.permission.WRITE_SETTINGS");
            }
        }
        b();
    }
}
