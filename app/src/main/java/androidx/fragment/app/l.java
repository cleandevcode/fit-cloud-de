package androidx.fragment.app;

import android.util.Log;
import androidx.fragment.app.f1;
import androidx.fragment.app.m;

/* loaded from: classes.dex */
public final class l implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ m.c f2441a;

    /* renamed from: b */
    public final /* synthetic */ f1.b f2442b;

    public l(m.c cVar, f1.b bVar) {
        this.f2441a = cVar;
        this.f2442b = bVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f2441a.a();
        if (j0.J(2)) {
            StringBuilder a10 = android.support.v4.media.d.a("Transition for operation ");
            a10.append(this.f2442b);
            a10.append("has completed");
            Log.v("FragmentManager", a10.toString());
        }
    }
}
