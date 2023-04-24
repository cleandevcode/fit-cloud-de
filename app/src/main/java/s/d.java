package s;

import android.view.View;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a */
    public boolean f25928a;

    /* renamed from: b */
    public int f25929b;

    /* renamed from: c */
    public final Object f25930c;

    public /* synthetic */ d(String str, t.t tVar) {
        boolean z10;
        int i10;
        try {
            i10 = Integer.parseInt(str);
            z10 = true;
        } catch (NumberFormatException unused) {
            y.u0.h("Camera2CamcorderProfileProvider", "Camera id is not an integer: " + str + ", unable to create CamcorderProfileProvider");
            z10 = false;
            i10 = -1;
        }
        this.f25928a = z10;
        this.f25929b = i10;
        this.f25930c = new w.c((v.e) rm.l.f(tVar).c(v.e.class));
    }

    public /* synthetic */ d(x9.a aVar) {
        this.f25928a = false;
        this.f25929b = 0;
        this.f25930c = (View) aVar;
    }
}
