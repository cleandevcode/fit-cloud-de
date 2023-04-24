package jc;

import android.os.Build;
import android.os.Environment;
import android.provider.Settings;
import java.util.ArrayList;
import java.util.Iterator;
import p000do.a;
import si.f;

/* loaded from: classes.dex */
public abstract class b implements c {

    /* renamed from: a */
    public x f17572a;

    /* renamed from: b */
    public b f17573b;

    /* renamed from: c */
    public a0 f17574c;

    /* renamed from: d */
    public m2.l f17575d;

    public b(x xVar) {
        this.f17572a = xVar;
        this.f17574c = new a0(xVar, this);
        this.f17575d = new m2.l(this.f17572a, this);
        this.f17574c = new a0(this.f17572a, this);
        this.f17575d = new m2.l(this.f17572a, this);
    }

    @Override // jc.c
    public final void b() {
        tl.l lVar;
        boolean z10;
        boolean canRequestPackageInstalls;
        boolean isExternalStorageManager;
        boolean canWrite;
        boolean canDrawOverlays;
        boolean z11;
        b bVar = this.f17573b;
        if (bVar != null) {
            bVar.j();
            lVar = tl.l.f28297a;
        } else {
            lVar = null;
        }
        if (lVar == null) {
            ArrayList arrayList = new ArrayList();
            arrayList.addAll(this.f17572a.f17631j);
            arrayList.addAll(this.f17572a.f17632k);
            arrayList.addAll(this.f17572a.f17629h);
            if (this.f17572a.f17626e.contains("android.permission.ACCESS_BACKGROUND_LOCATION")) {
                if (y0.a.a(this.f17572a.a(), "android.permission.ACCESS_BACKGROUND_LOCATION") == 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (z11) {
                    this.f17572a.f17630i.add("android.permission.ACCESS_BACKGROUND_LOCATION");
                } else {
                    arrayList.add("android.permission.ACCESS_BACKGROUND_LOCATION");
                }
            }
            if (this.f17572a.f17626e.contains("android.permission.SYSTEM_ALERT_WINDOW") && Build.VERSION.SDK_INT >= 23 && this.f17572a.d() >= 23) {
                canDrawOverlays = Settings.canDrawOverlays(this.f17572a.a());
                if (canDrawOverlays) {
                    this.f17572a.f17630i.add("android.permission.SYSTEM_ALERT_WINDOW");
                } else {
                    arrayList.add("android.permission.SYSTEM_ALERT_WINDOW");
                }
            }
            if (this.f17572a.f17626e.contains("android.permission.WRITE_SETTINGS") && Build.VERSION.SDK_INT >= 23 && this.f17572a.d() >= 23) {
                canWrite = Settings.System.canWrite(this.f17572a.a());
                if (canWrite) {
                    this.f17572a.f17630i.add("android.permission.WRITE_SETTINGS");
                } else {
                    arrayList.add("android.permission.WRITE_SETTINGS");
                }
            }
            if (this.f17572a.f17626e.contains("android.permission.MANAGE_EXTERNAL_STORAGE")) {
                if (Build.VERSION.SDK_INT >= 30) {
                    isExternalStorageManager = Environment.isExternalStorageManager();
                    if (isExternalStorageManager) {
                        this.f17572a.f17630i.add("android.permission.MANAGE_EXTERNAL_STORAGE");
                    }
                }
                arrayList.add("android.permission.MANAGE_EXTERNAL_STORAGE");
            }
            if (this.f17572a.f17626e.contains("android.permission.REQUEST_INSTALL_PACKAGES")) {
                if (Build.VERSION.SDK_INT >= 26 && this.f17572a.d() >= 26) {
                    canRequestPackageInstalls = this.f17572a.a().getPackageManager().canRequestPackageInstalls();
                    if (canRequestPackageInstalls) {
                        this.f17572a.f17630i.add("android.permission.REQUEST_INSTALL_PACKAGES");
                    }
                }
                arrayList.add("android.permission.REQUEST_INSTALL_PACKAGES");
            }
            if (this.f17572a.f17626e.contains("android.permission.POST_NOTIFICATIONS")) {
                if (new x0.c0(this.f17572a.a()).a()) {
                    this.f17572a.f17630i.add("android.permission.POST_NOTIFICATIONS");
                } else {
                    arrayList.add("android.permission.POST_NOTIFICATIONS");
                }
            }
            if (this.f17572a.f17626e.contains("android.permission.BODY_SENSORS_BACKGROUND")) {
                if (y0.a.a(this.f17572a.a(), "android.permission.BODY_SENSORS_BACKGROUND") == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    this.f17572a.f17630i.add("android.permission.BODY_SENSORS_BACKGROUND");
                } else {
                    arrayList.add("android.permission.BODY_SENSORS_BACKGROUND");
                }
            }
            si.e eVar = this.f17572a.f17635n;
            if (eVar != null) {
                boolean isEmpty = arrayList.isEmpty();
                new ArrayList(this.f17572a.f17630i);
                androidx.fragment.app.r rVar = eVar.f27069a;
                f.a aVar = eVar.f27070b;
                gm.l.f(rVar, "$fragment");
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    a.b bVar2 = p000do.a.f13275a;
                    bVar2.t("PermissionHelper");
                    bVar2.h("denied:%s", (String) it.next());
                }
                if (aVar != null) {
                    aVar.b(isEmpty);
                }
            }
            x xVar = this.f17572a;
            androidx.fragment.app.r E = xVar.b().E("InvisibleFragment");
            if (E != null) {
                androidx.fragment.app.a aVar2 = new androidx.fragment.app.a(xVar.b());
                aVar2.i(E);
                if (!aVar2.f2569g) {
                    aVar2.f2570h = false;
                    aVar2.f2306q.z(aVar2, true);
                } else {
                    throw new IllegalStateException("This transaction is already being added to the back stack");
                }
            }
            if (Build.VERSION.SDK_INT != 26) {
                xVar.a().setRequestedOrientation(xVar.f17624c);
            }
        }
    }

    @Override // jc.c
    public final a0 c() {
        return this.f17574c;
    }

    @Override // jc.c
    public final m2.l d() {
        return this.f17575d;
    }
}
