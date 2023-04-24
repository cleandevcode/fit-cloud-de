package d6;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import java.util.HashSet;
import java.util.List;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: a */
    public static final String[] f12679a;

    static {
        new g();
        f12679a = new String[]{"com.android.chrome", "com.chrome.beta", "com.chrome.dev"};
    }

    public static final String a() {
        if (i6.a.b(g.class)) {
            return null;
        }
        try {
            Context a10 = o5.v.a();
            List<ResolveInfo> queryIntentServices = a10.getPackageManager().queryIntentServices(new Intent("android.support.customtabs.action.CustomTabsService"), 0);
            if (queryIntentServices != null) {
                String[] strArr = f12679a;
                gm.l.f(strArr, "<this>");
                HashSet hashSet = new HashSet(ih.v.j(strArr.length));
                ul.i.E(hashSet, strArr);
                for (ResolveInfo resolveInfo : queryIntentServices) {
                    ServiceInfo serviceInfo = resolveInfo.serviceInfo;
                    if (serviceInfo != null && hashSet.contains(serviceInfo.packageName)) {
                        return serviceInfo.packageName;
                    }
                }
            }
            return null;
        } catch (Throwable th2) {
            i6.a.a(g.class, th2);
            return null;
        }
    }

    public static final String b() {
        if (i6.a.b(g.class)) {
            return null;
        }
        try {
            return gm.l.k(o5.v.a().getPackageName(), "fbconnect://cct.");
        } catch (Throwable th2) {
            i6.a.a(g.class, th2);
            return null;
        }
    }

    public static final String c(String str) {
        if (i6.a.b(g.class)) {
            return null;
        }
        try {
            gm.l.f(str, "developerDefinedRedirectURI");
            String str2 = n0.f12718a;
            return n0.a(o5.v.a(), str) ? str : n0.a(o5.v.a(), b()) ? b() : "";
        } catch (Throwable th2) {
            i6.a.a(g.class, th2);
            return null;
        }
    }
}
