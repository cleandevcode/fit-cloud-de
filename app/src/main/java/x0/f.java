package x0;

import android.app.Application;
import x0.h;

/* loaded from: classes.dex */
public final class f implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ Application f30093a;

    /* renamed from: b */
    public final /* synthetic */ h.a f30094b;

    public f(Application application, h.a aVar) {
        this.f30093a = application;
        this.f30094b = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f30093a.unregisterActivityLifecycleCallbacks(this.f30094b);
    }
}
