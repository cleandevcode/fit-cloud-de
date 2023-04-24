package f8;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.text.TextUtils;
import com.huawei.hms.framework.common.hianalytics.WiseOpenHianalyticsData;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public class e {

    /* renamed from: a */
    public static final int f14181a;

    /* renamed from: b */
    public static final e f14182b;

    static {
        AtomicBoolean atomicBoolean = com.google.android.gms.common.a.f6043a;
        f14181a = 12451000;
        f14182b = new e();
    }

    public Intent a(Context context, int i10, String str) {
        if (i10 != 1 && i10 != 2) {
            if (i10 != 3) {
                return null;
            }
            Uri fromParts = Uri.fromParts(WiseOpenHianalyticsData.UNION_PACKAGE, "com.google.android.gms", null);
            Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
            intent.setData(fromParts);
            return intent;
        } else if (context != null && n8.a.a(context)) {
            Intent intent2 = new Intent("com.google.android.clockwork.home.UPDATE_ANDROID_WEAR_ACTION");
            intent2.setPackage("com.google.android.wearable.app");
            return intent2;
        } else {
            StringBuilder a10 = android.support.v4.media.d.a("gcore_");
            a10.append(f14181a);
            a10.append("-");
            if (!TextUtils.isEmpty(str)) {
                a10.append(str);
            }
            a10.append("-");
            if (context != null) {
                a10.append(context.getPackageName());
            }
            a10.append("-");
            if (context != null) {
                try {
                    o8.c a11 = o8.d.a(context);
                    a10.append(a11.f22890a.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode);
                } catch (PackageManager.NameNotFoundException unused) {
                }
            }
            String sb2 = a10.toString();
            Intent intent3 = new Intent("android.intent.action.VIEW");
            Uri.Builder appendQueryParameter = Uri.parse("market://details").buildUpon().appendQueryParameter("id", "com.google.android.gms");
            if (!TextUtils.isEmpty(sb2)) {
                appendQueryParameter.appendQueryParameter("pcampaignid", sb2);
            }
            intent3.setData(appendQueryParameter.build());
            intent3.setPackage("com.android.vending");
            intent3.addFlags(524288);
            return intent3;
        }
    }

    public int b(Context context, int i10) {
        int a10 = com.google.android.gms.common.a.a(context, i10);
        if (a10 != 18 ? a10 == 1 ? com.google.android.gms.common.a.b(context) : false : true) {
            return 18;
        }
        return a10;
    }
}
