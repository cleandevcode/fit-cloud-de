package v5;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import d6.s;
import java.util.concurrent.atomic.AtomicBoolean;
import o5.v;
import om.l;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: a */
    public static final h f29114a = new h();

    /* renamed from: b */
    public static final AtomicBoolean f29115b = new AtomicBoolean(false);

    public static final void a() {
        if (i6.a.b(h.class)) {
            return;
        }
        try {
            if (f29115b.get()) {
                if (f29114a.b()) {
                    s sVar = s.f12755a;
                    if (s.c(s.b.IapLoggingLib2)) {
                        d dVar = d.f29075a;
                        d.b(v.a());
                        return;
                    }
                }
                c.b();
            }
        } catch (Throwable th2) {
            i6.a.a(h.class, th2);
        }
    }

    public final boolean b() {
        String string;
        if (i6.a.b(this)) {
            return false;
        }
        try {
            Context a10 = v.a();
            ApplicationInfo applicationInfo = a10.getPackageManager().getApplicationInfo(a10.getPackageName(), 128);
            if (applicationInfo == null || (string = applicationInfo.metaData.getString("com.google.android.play.billingclient.version")) == null) {
                return false;
            }
            return Integer.parseInt((String) l.s0(string, new String[]{"."}, 3, 2).get(0)) >= 2;
        } catch (Exception unused) {
        } catch (Throwable th2) {
            i6.a.a(this, th2);
        }
        return false;
    }
}
