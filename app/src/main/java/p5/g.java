package p5;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import java.util.ArrayList;
import java.util.UUID;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import o5.v;
import p5.m;

/* loaded from: classes.dex */
public final /* synthetic */ class g implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f23907a;

    public /* synthetic */ g(int i10) {
        this.f23907a = i10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        v5.f fVar;
        Class<?> b10;
        x5.k kVar = null;
        r2 = null;
        ArrayList<String> arrayList = null;
        x5.m mVar = null;
        kVar = null;
        kVar = null;
        switch (this.f23907a) {
            case 0:
                if (!i6.a.b(i.class)) {
                    try {
                        i.f23917e = null;
                        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = m.f23923c;
                        if (m.a.b() != k.EXPLICIT_ONLY) {
                            i.d(p.TIMER);
                            return;
                        }
                        return;
                    } catch (Throwable th2) {
                        i6.a.a(i.class, th2);
                        return;
                    }
                }
                return;
            case 1:
                Context a10 = v.a();
                v5.f fVar2 = v5.f.f29104a;
                ArrayList<String> f10 = v5.f.f(a10, v5.c.f29074i);
                if (f10.isEmpty()) {
                    Object obj = v5.c.f29074i;
                    if (!i6.a.b(v5.f.class)) {
                        try {
                            ArrayList<String> arrayList2 = new ArrayList<>();
                            if (obj != null && (b10 = (fVar = v5.f.f29104a).b(a10, "com.android.vending.billing.IInAppBillingService")) != null && fVar.c("getPurchaseHistory", b10) != null) {
                                arrayList = fVar.a(fVar.d(a10, obj));
                            }
                            arrayList = arrayList2;
                        } catch (Throwable th3) {
                            i6.a.a(v5.f.class, th3);
                        }
                    }
                } else {
                    arrayList = f10;
                }
                v5.c.a(v5.c.f29066a, a10, arrayList, false);
                return;
            default:
                if (x5.d.f30291g == null) {
                    SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(v.a());
                    long j10 = defaultSharedPreferences.getLong("com.facebook.appevents.SessionInfo.sessionStartTime", 0L);
                    long j11 = defaultSharedPreferences.getLong("com.facebook.appevents.SessionInfo.sessionEndTime", 0L);
                    String string = defaultSharedPreferences.getString("com.facebook.appevents.SessionInfo.sessionId", null);
                    if (j10 != 0 && j11 != 0 && string != null) {
                        x5.k kVar2 = new x5.k(Long.valueOf(j10), Long.valueOf(j11));
                        kVar2.f30321d = defaultSharedPreferences.getInt("com.facebook.appevents.SessionInfo.interruptionCount", 0);
                        SharedPreferences defaultSharedPreferences2 = PreferenceManager.getDefaultSharedPreferences(v.a());
                        if (defaultSharedPreferences2.contains("com.facebook.appevents.SourceApplicationInfo.callingApplicationPackage")) {
                            mVar = new x5.m(defaultSharedPreferences2.getString("com.facebook.appevents.SourceApplicationInfo.callingApplicationPackage", null), defaultSharedPreferences2.getBoolean("com.facebook.appevents.SourceApplicationInfo.openedByApplink", false));
                        }
                        kVar2.f30323f = mVar;
                        kVar2.f30322e = Long.valueOf(System.currentTimeMillis());
                        UUID fromString = UUID.fromString(string);
                        gm.l.e(fromString, "fromString(sessionIDStr)");
                        kVar2.f30320c = fromString;
                        kVar = kVar2;
                    }
                    x5.d.f30291g = kVar;
                    return;
                }
                return;
        }
    }
}
