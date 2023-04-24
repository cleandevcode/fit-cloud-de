package jc;

import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class c0 extends b {
    public c0(x xVar) {
        super(xVar);
    }

    @Override // jc.c
    public final void a(List<String> list) {
        boolean isExternalStorageManager;
        x xVar = this.f17572a;
        xVar.getClass();
        u c10 = xVar.c();
        c10.f17603m0 = xVar;
        c10.f17604n0 = this;
        if (Build.VERSION.SDK_INT >= 30) {
            isExternalStorageManager = Environment.isExternalStorageManager();
            if (!isExternalStorageManager) {
                Intent intent = new Intent("android.settings.MANAGE_APP_ALL_FILES_ACCESS_PERMISSION");
                StringBuilder a10 = android.support.v4.media.d.a("package:");
                a10.append(c10.T0().getPackageName());
                intent.setData(Uri.parse(a10.toString()));
                if (intent.resolveActivity(c10.T0().getPackageManager()) == null) {
                    intent = new Intent("android.settings.MANAGE_ALL_FILES_ACCESS_PERMISSION");
                }
                c10.f17609s0.b(intent);
                return;
            }
        }
        if (c10.c1()) {
            c10.e1(new j(c10));
        }
    }

    @Override // jc.c
    public final void j() {
        boolean isExternalStorageManager;
        if (this.f17572a.f17626e.contains("android.permission.MANAGE_EXTERNAL_STORAGE") && Build.VERSION.SDK_INT >= 30) {
            isExternalStorageManager = Environment.isExternalStorageManager();
            if (isExternalStorageManager) {
                b();
                return;
            } else if (this.f17572a.f17636o == null) {
                b();
                return;
            } else {
                ArrayList r10 = h7.a.r("android.permission.MANAGE_EXTERNAL_STORAGE");
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
