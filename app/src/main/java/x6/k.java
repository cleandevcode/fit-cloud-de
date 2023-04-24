package x6;

import android.content.Context;
import gm.b0;
import gm.o;
import p000do.a;
import x6.h;

/* loaded from: classes.dex */
public final class k {

    /* renamed from: a */
    public static final k f30377a;

    /* renamed from: b */
    public static final /* synthetic */ mm.h<Object>[] f30378b;

    /* renamed from: c */
    public static String f30379c;

    /* renamed from: d */
    public static Class<? extends c> f30380d;

    /* renamed from: e */
    public static final im.a f30381e;

    /* renamed from: f */
    public static final im.a f30382f;

    static {
        o oVar = new o(k.class, "restoreSportTime", "getRestoreSportTime()I");
        b0.f15488a.getClass();
        f30378b = new mm.h[]{oVar, new o(k.class, "locationFilterAccuracy", "getLocationFilterAccuracy()I")};
        f30377a = new k();
        f30381e = new im.a();
        f30382f = new im.a();
    }

    public final Integer a(Context context, long j10) {
        gm.l.f(context, "context");
        h.a e10 = new h(context).e();
        if (e10 == null) {
            a.b bVar = p000do.a.f13275a;
            bVar.t("SportManager");
            bVar.b("No unfinished sport", new Object[0]);
            return null;
        }
        a.b bVar2 = p000do.a.f13275a;
        bVar2.t("SportManager");
        bVar2.b("Have unfinished sport: userId=%d, sportType=%d", Long.valueOf(e10.f30368b), Integer.valueOf(e10.f30367a));
        long currentTimeMillis = System.currentTimeMillis() - e10.f30369c;
        if (e10.f30368b == j10 && currentTimeMillis >= 0 && currentTimeMillis <= ((Number) f30381e.a(this, f30378b[0])).intValue() * 60 * 1000) {
            bVar2.t("SportManager");
            bVar2.b("Should continue sport!", new Object[0]);
            return Integer.valueOf(e10.f30367a);
        }
        bVar2.t("SportManager");
        bVar2.b("Should stop sport!", new Object[0]);
        new b7.a(context);
        return null;
    }
}
