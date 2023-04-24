package qb;

import android.content.Context;
import android.content.pm.PackageManager;
import android.support.v4.media.d;
import com.huawei.hms.framework.common.ContextHolder;
import com.huawei.hms.framework.common.Logger;
import com.huawei.hms.framework.common.PLSharedPreferences;
import com.huawei.hms.framework.common.hianalytics.WiseOpenHianalyticsData;
import java.util.concurrent.ConcurrentHashMap;
import no.nordicsemi.android.dfu.DfuBaseService;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: b */
    public static final ConcurrentHashMap f24677b = new ConcurrentHashMap(16);

    /* renamed from: a */
    public final PLSharedPreferences f24678a;

    public c(Context context, String str) {
        String packageName = context.getPackageName();
        Logger.d("c", "get pkgname from context is{%s}", packageName);
        ConcurrentHashMap concurrentHashMap = f24677b;
        if (concurrentHashMap.containsKey(str + packageName)) {
            this.f24678a = (PLSharedPreferences) concurrentHashMap.get(str + packageName);
        } else {
            PLSharedPreferences pLSharedPreferences = new PLSharedPreferences(context, a.b.b(str, packageName));
            this.f24678a = pLSharedPreferences;
            concurrentHashMap.put(str + packageName, pLSharedPreferences);
        }
        StringBuilder a10 = d.a("ContextHolder.getAppContext() from GRS is:");
        a10.append(ContextHolder.getAppContext());
        Logger.i("c", a10.toString());
        context = ContextHolder.getAppContext() != null ? ContextHolder.getAppContext() : context;
        try {
            String l10 = Long.toString(context.getPackageManager().getPackageInfo(context.getPackageName(), DfuBaseService.ERROR_CONNECTION_MASK).versionCode);
            String a11 = a(WiseOpenHianalyticsData.UNION_VERSION, "");
            if (!l10.equals(a11)) {
                Logger.i("c", "app version changed! old version{%s} and new version{%s}", a11, l10);
                PLSharedPreferences pLSharedPreferences2 = this.f24678a;
                if (pLSharedPreferences2 != null) {
                    synchronized (pLSharedPreferences2) {
                        this.f24678a.clear();
                    }
                }
                c(WiseOpenHianalyticsData.UNION_VERSION, l10);
            }
        } catch (PackageManager.NameNotFoundException unused) {
            Logger.w("c", "get app version failed and catch NameNotFoundException");
        }
    }

    public final String a(String str, String str2) {
        String string;
        PLSharedPreferences pLSharedPreferences = this.f24678a;
        if (pLSharedPreferences == null) {
            return str2;
        }
        synchronized (pLSharedPreferences) {
            string = this.f24678a.getString(str, str2);
        }
        return string;
    }

    public final void b(String str) {
        PLSharedPreferences pLSharedPreferences = this.f24678a;
        if (pLSharedPreferences == null) {
            return;
        }
        synchronized (pLSharedPreferences) {
            this.f24678a.remove(str);
        }
    }

    public final void c(String str, String str2) {
        PLSharedPreferences pLSharedPreferences = this.f24678a;
        if (pLSharedPreferences == null) {
            return;
        }
        synchronized (pLSharedPreferences) {
            this.f24678a.putString(str, str2);
        }
    }
}
