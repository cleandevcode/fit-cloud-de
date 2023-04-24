package c7;

import android.content.Context;
import android.location.LocationManager;
import android.os.Build;
import androidx.lifecycle.a0;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a */
    public final Context f4552a;

    /* renamed from: b */
    public final LocationManager f4553b;

    /* renamed from: c */
    public final c f4554c;

    /* renamed from: d */
    public final d f4555d;

    /* renamed from: e */
    public final a0<Integer> f4556e;

    /* renamed from: f */
    public boolean f4557f;

    /* renamed from: g */
    public boolean f4558g;

    /* renamed from: h */
    public final e f4559h;

    public f(Context context) {
        boolean z10;
        c cVar;
        this.f4552a = context;
        Object systemService = context.getSystemService("location");
        gm.l.d(systemService, "null cannot be cast to non-null type android.location.LocationManager");
        this.f4553b = (LocationManager) systemService;
        String[] strArr = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"};
        if (Build.VERSION.SDK_INT >= 23) {
            for (int i10 = 0; i10 < 2; i10++) {
                if (y0.a.a(context, strArr[i10]) != 0) {
                    z10 = false;
                    break;
                }
            }
        }
        z10 = true;
        if (z10) {
            cVar = null;
        } else {
            cVar = new c(context);
        }
        this.f4554c = cVar;
        this.f4555d = cVar != null ? new d(this) : null;
        this.f4556e = new a0<>();
        this.f4557f = cVar == null;
        this.f4559h = new e(this);
    }

    public final void a() {
        int i10;
        if (this.f4557f) {
            boolean isProviderEnabled = this.f4553b.isProviderEnabled("network");
            boolean isProviderEnabled2 = this.f4553b.isProviderEnabled("gps");
            i10 = isProviderEnabled ? isProviderEnabled2 ? -1 : -3 : isProviderEnabled2 ? -2 : -4;
        } else {
            i10 = -5;
        }
        Integer d10 = this.f4556e.d();
        if (d10 != null && i10 == d10.intValue()) {
            return;
        }
        this.f4556e.j(Integer.valueOf(i10));
    }
}
