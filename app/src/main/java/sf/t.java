package sf;

import android.content.Context;
import android.os.PowerManager;
import bi.m0;
import og.j1;
import p000do.a;

/* loaded from: classes2.dex */
public final class t extends bk.d {

    /* renamed from: h */
    public final dk.a<j1> f26972h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(Context context, hj.a aVar, dk.a<j1> aVar2) {
        super(context, aVar);
        gm.l.f(context, "context");
        gm.l.f(aVar, "connector");
        gm.l.f(aVar2, "notificationRepository");
        this.f26972h = aVar2;
    }

    @Override // bk.d
    public final boolean b(Context context) {
        gm.l.f(context, "context");
        if (!m0.w(this.f26972h.get().d(), 1)) {
            a.b bVar = p000do.a.f13275a;
            bVar.t("Fc#Telephony");
            bVar.h("FLAG_TELEPHONY disabled", new Object[0]);
            return false;
        }
        if (this.f26972h.get().b()) {
            Object systemService = context.getSystemService("power");
            gm.l.d(systemService, "null cannot be cast to non-null type android.os.PowerManager");
            if (((PowerManager) systemService).isInteractive()) {
                a.b bVar2 = p000do.a.f13275a;
                bVar2.t("Fc#Telephony");
                bVar2.b("Skip ScreenOff", new Object[0]);
                return false;
            }
        }
        return true;
    }
}
