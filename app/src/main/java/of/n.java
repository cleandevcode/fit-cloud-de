package of;

import android.app.Application;
import android.content.Context;
import hj.b;

/* loaded from: classes2.dex */
public final class n {

    /* renamed from: a */
    public final Object f23204a = new Object();

    /* renamed from: b */
    public volatile hj.b f23205b;

    public final hj.b a(Context context, mm.h<?> hVar) {
        hj.b bVar;
        gm.l.f(context, "thisRef");
        gm.l.f(hVar, "property");
        hj.b bVar2 = this.f23205b;
        if (bVar2 == null) {
            synchronized (this.f23204a) {
                if (this.f23205b == null) {
                    Context applicationContext = context.getApplicationContext();
                    gm.l.d(applicationContext, "null cannot be cast to non-null type android.app.Application");
                    b.a aVar = new b.a((Application) applicationContext);
                    aVar.f16123c = new jj.a(true, true, true, 16);
                    aVar.f16122b = false;
                    this.f23205b = new hj.b(aVar);
                }
                bVar = this.f23205b;
                gm.l.c(bVar);
            }
            return bVar;
        }
        return bVar2;
    }
}
