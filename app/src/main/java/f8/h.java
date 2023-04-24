package f8;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.Signature;
import android.util.Log;
import com.google.errorprone.annotations.CheckReturnValue;
import com.google.errorprone.annotations.RestrictedInheritance;

@CheckReturnValue
@RestrictedInheritance(allowedOnPath = ".*java.*/com/google/android/gms/common/testing/.*", explanation = "Sub classing of GMS Core's APIs are restricted to testing fakes.", link = "go/gmscore-restrictedinheritance")
/* loaded from: classes.dex */
public final class h {

    /* renamed from: b */
    public static h f14185b;

    /* renamed from: a */
    public final Context f14186a;

    public h(Context context) {
        this.f14186a = context.getApplicationContext();
    }

    public static h a(Context context) {
        i8.p.f(context);
        synchronized (h.class) {
            if (f14185b == null) {
                o oVar = u.f14194a;
                synchronized (u.class) {
                    if (u.f14196c == null) {
                        u.f14196c = context.getApplicationContext();
                    } else {
                        Log.w("GoogleCertificates", "GoogleCertificates has been initialized already");
                    }
                }
                f14185b = new h(context);
            }
        }
        return f14185b;
    }

    public static final q b(PackageInfo packageInfo, q... qVarArr) {
        Signature[] signatureArr = packageInfo.signatures;
        if (signatureArr == null) {
            return null;
        }
        if (signatureArr.length != 1) {
            Log.w("GoogleSignatureVerifier", "Package has more than one signature.");
            return null;
        }
        r rVar = new r(packageInfo.signatures[0].toByteArray());
        for (int i10 = 0; i10 < qVarArr.length; i10++) {
            if (qVarArr[i10].equals(rVar)) {
                return qVarArr[i10];
            }
        }
        return null;
    }

    public static final boolean c(PackageInfo packageInfo, boolean z10) {
        if (z10 && packageInfo != null && ("com.android.vending".equals(packageInfo.packageName) || "com.google.android.gms".equals(packageInfo.packageName))) {
            ApplicationInfo applicationInfo = packageInfo.applicationInfo;
            z10 = (applicationInfo == null || (applicationInfo.flags & 129) == 0) ? false : true;
        }
        if (packageInfo != null && packageInfo.signatures != null) {
            if ((z10 ? b(packageInfo, t.f14193a) : b(packageInfo, t.f14193a[0])) != null) {
                return true;
            }
        }
        return false;
    }
}
