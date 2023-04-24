package d6;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.util.Log;
import java.util.Collection;
import java.util.List;

/* loaded from: classes.dex */
public final class n0 {

    /* renamed from: a */
    public static final String f12718a;

    static {
        new n0();
        f12718a = n0.class.getName();
    }

    public static final boolean a(Context context, String str) {
        List<ResolveInfo> list;
        gm.l.f(str, "redirectURI");
        PackageManager packageManager = context.getPackageManager();
        if (packageManager != null) {
            Intent intent = new Intent();
            intent.setAction("android.intent.action.VIEW");
            intent.addCategory("android.intent.category.DEFAULT");
            intent.addCategory("android.intent.category.BROWSABLE");
            intent.setData(Uri.parse(str));
            list = packageManager.queryIntentActivities(intent, 64);
        } else {
            list = null;
        }
        if (list != null) {
            boolean z10 = false;
            for (ResolveInfo resolveInfo : list) {
                ActivityInfo activityInfo = resolveInfo.activityInfo;
                if (!gm.l.a(activityInfo.name, "com.facebook.CustomTabActivity") || !gm.l.a(activityInfo.packageName, context.getPackageName())) {
                    return false;
                }
                z10 = true;
            }
            return z10;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x001b  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0031 A[ORIG_RETURN, RETURN] */
    @android.annotation.SuppressLint({"WrongConstant"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void b(android.content.Context r4, boolean r5) {
        /*
            java.lang.String r0 = "context"
            gm.l.f(r4, r0)
            android.content.pm.PackageManager r0 = r4.getPackageManager()
            r1 = 1
            if (r0 == 0) goto L18
            android.content.ComponentName r2 = new android.content.ComponentName
            java.lang.String r3 = "com.facebook.FacebookActivity"
            r2.<init>(r4, r3)
            android.content.pm.ActivityInfo r4 = r0.getActivityInfo(r2, r1)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L18
            goto L19
        L18:
            r4 = 0
        L19:
            if (r4 != 0) goto L31
            r4 = r5 ^ 1
            java.lang.String r5 = "FacebookActivity is not declared in the AndroidManifest.xml. If you are using the facebook-common module or dependent modules please add com.facebook.FacebookActivity to your AndroidManifest.xml file. See https://developers.facebook.com/docs/android/getting-started for more info."
            if (r4 == 0) goto L27
            java.lang.String r4 = d6.n0.f12718a
            android.util.Log.w(r4, r5)
            goto L31
        L27:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = r5.toString()
            r4.<init>(r5)
            throw r4
        L31:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: d6.n0.b(android.content.Context, boolean):void");
    }

    public static final void c(Context context, boolean z10) {
        gm.l.f(context, "context");
        if (context.checkCallingOrSelfPermission("android.permission.INTERNET") == -1) {
            if (!(!z10)) {
                throw new IllegalStateException("No internet permissions granted for the app, please add <uses-permission android:name=\"android.permission.INTERNET\" /> to your AndroidManifest.xml.".toString());
            }
            Log.w(f12718a, "No internet permissions granted for the app, please add <uses-permission android:name=\"android.permission.INTERNET\" /> to your AndroidManifest.xml.");
        }
    }

    public static final void d(String str, String str2) {
        boolean z10;
        gm.l.f(str, "arg");
        if (str.length() > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            return;
        }
        throw new IllegalArgumentException(android.support.v4.media.a.a("Argument '", str2, "' cannot be empty").toString());
    }

    public static final void e(Collection collection) {
        gm.l.f(collection, "container");
        for (Object obj : collection) {
            if (obj == null) {
                throw new NullPointerException("Container 'requests' cannot contain null values");
            }
        }
        if (!collection.isEmpty()) {
            return;
        }
        throw new IllegalArgumentException("Container 'requests' cannot be empty".toString());
    }

    public static final void f(String str, String str2) {
        boolean z10;
        boolean z11 = false;
        if (str != null) {
            if (str.length() > 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                z11 = true;
            }
        }
        if (z11) {
            return;
        }
        throw new IllegalArgumentException(android.support.v4.media.a.a("Argument '", str2, "' cannot be null or empty").toString());
    }

    public static final void g() {
        if (!o5.v.h()) {
            throw new o5.w("The SDK has not been initialized, make sure to call FacebookSdk.sdkInitialize() first.");
        }
    }
}
