package e8;

import android.app.AppOpsManager;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Binder;
import android.os.Build;
import android.util.Log;

/* loaded from: classes.dex */
public final class s extends o {

    /* renamed from: a */
    public final Context f13503a;

    public s(Context context) {
        this.f13503a = context;
    }

    public final void a0() {
        boolean z10;
        boolean z11;
        AppOpsManager appOpsManager;
        Context context = this.f13503a;
        int callingUid = Binder.getCallingUid();
        o8.c a10 = o8.d.a(context);
        a10.getClass();
        boolean z12 = true;
        boolean z13 = false;
        try {
            appOpsManager = (AppOpsManager) a10.f22890a.getSystemService("appops");
        } catch (SecurityException unused) {
            z10 = false;
        }
        if (appOpsManager != null) {
            appOpsManager.checkPackage(callingUid, "com.google.android.gms");
            z10 = true;
            if (z10) {
                try {
                    PackageInfo packageInfo = context.getPackageManager().getPackageInfo("com.google.android.gms", 64);
                    f8.h a11 = f8.h.a(context);
                    a11.getClass();
                    if (packageInfo != null) {
                        if (!f8.h.c(packageInfo, false)) {
                            if (f8.h.c(packageInfo, true)) {
                                Context context2 = a11.f14186a;
                                if (!com.google.android.gms.common.a.f6045c) {
                                    try {
                                        try {
                                            PackageInfo packageInfo2 = o8.d.a(context2).f22890a.getPackageManager().getPackageInfo("com.google.android.gms", 64);
                                            f8.h.a(context2);
                                            if (packageInfo2 != null && !f8.h.c(packageInfo2, false) && f8.h.c(packageInfo2, true)) {
                                                com.google.android.gms.common.a.f6044b = true;
                                            } else {
                                                com.google.android.gms.common.a.f6044b = false;
                                            }
                                        } catch (PackageManager.NameNotFoundException e10) {
                                            Log.w("GooglePlayServicesUtil", "Cannot find Google Play services package name.", e10);
                                        }
                                    } finally {
                                        com.google.android.gms.common.a.f6045c = true;
                                    }
                                }
                                if (!com.google.android.gms.common.a.f6044b && "user".equals(Build.TYPE)) {
                                    z11 = false;
                                } else {
                                    z11 = true;
                                }
                                if (!z11) {
                                    Log.w("GoogleSignatureVerifier", "Test-keys aren't accepted on this build.");
                                }
                            }
                        }
                        z13 = z12;
                    }
                    z12 = false;
                    z13 = z12;
                } catch (PackageManager.NameNotFoundException unused2) {
                    if (Log.isLoggable("UidVerifier", 3)) {
                        Log.d("UidVerifier", "Package manager can't find google play services package, defaulting to false");
                    }
                }
            }
            if (z13) {
                return;
            }
            throw new SecurityException(androidx.activity.i.a("Calling UID ", Binder.getCallingUid(), " is not Google Play services."));
        }
        throw new NullPointerException("context.getSystemService(Context.APP_OPS_SERVICE) is null");
    }
}
