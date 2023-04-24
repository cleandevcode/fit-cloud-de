package dagger.hilt.android.internal.managers;

import android.app.Application;
import android.app.Service;
import ih.v;
import of.i;
import of.j;

/* loaded from: classes2.dex */
public final class g implements lk.b<Object> {

    /* renamed from: a */
    public final Service f12964a;

    /* renamed from: b */
    public j f12965b;

    /* loaded from: classes2.dex */
    public interface a {
        i a();
    }

    public g(Service service) {
        this.f12964a = service;
    }

    @Override // lk.b
    public final Object h() {
        if (this.f12965b == null) {
            Application application = this.f12964a.getApplication();
            h7.a.h(application instanceof lk.b, "Hilt service must be attached to an @AndroidEntryPoint Application. Found: %s", application.getClass());
            i a10 = ((a) v.f(application, a.class)).a();
            Service service = this.f12964a;
            a10.getClass();
            service.getClass();
            this.f12965b = new j(a10.f23141a);
        }
        return this.f12965b;
    }
}
