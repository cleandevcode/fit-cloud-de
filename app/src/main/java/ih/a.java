package ih;

import android.app.Application;
import ih.u;
import tl.g;

/* loaded from: classes2.dex */
public abstract class a extends androidx.lifecycle.b {

    /* renamed from: e */
    public jg.a f16821e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(Application application) {
        super(application);
        gm.l.f(application, "application");
    }

    public final u e() {
        Object f10;
        long j10;
        jg.a aVar;
        Object obj = null;
        try {
            aVar = this.f16821e;
        } catch (Throwable th2) {
            p000do.a.f13275a.q(th2);
            f10 = mf.a0.f(th2);
        }
        if (aVar != null) {
            f10 = aVar.a();
            if (!(f10 instanceof g.a)) {
                obj = f10;
            }
            Long l10 = (Long) obj;
            x6.k kVar = x6.k.f30377a;
            Application application = this.f2694d;
            gm.l.e(application, "getApplication()");
            if (l10 != null) {
                j10 = l10.longValue();
            } else {
                j10 = 0;
            }
            Integer a10 = kVar.a(application, j10);
            if (l10 != null) {
                if (a10 != null) {
                    return new u.d(a10.intValue());
                }
                return u.c.f16878a;
            }
            return u.a.f16876a;
        }
        gm.l.l("authManager");
        throw null;
    }
}
