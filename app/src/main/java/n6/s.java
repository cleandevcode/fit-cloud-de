package n6;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes.dex */
public final class s {

    /* renamed from: d */
    public static final ScheduledExecutorService f22163d;

    /* renamed from: a */
    public final String f22164a;

    /* renamed from: b */
    public final p5.r f22165b;

    /* renamed from: c */
    public String f22166c;

    /* loaded from: classes.dex */
    public static final class a {
        public static final Bundle a(String str) {
            ScheduledExecutorService scheduledExecutorService = s.f22163d;
            Bundle bundle = new Bundle();
            bundle.putLong("1_timestamp_ms", System.currentTimeMillis());
            bundle.putString("0_auth_logger_id", str);
            bundle.putString("3_method", "");
            bundle.putString("2_result", "");
            bundle.putString("5_error_message", "");
            bundle.putString("4_error_code", "");
            bundle.putString("6_extras", "");
            return bundle;
        }
    }

    static {
        new a();
        f22163d = Executors.newSingleThreadScheduledExecutor();
    }

    public s(Context context, String str) {
        PackageInfo packageInfo;
        gm.l.f(str, "applicationId");
        this.f22164a = str;
        this.f22165b = new p5.r(context, str);
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null || (packageInfo = packageManager.getPackageInfo("com.facebook.katana", 0)) == null) {
                return;
            }
            this.f22166c = packageInfo.versionName;
        } catch (PackageManager.NameNotFoundException unused) {
        }
    }

    public final void a(String str, String str2) {
        if (i6.a.b(this)) {
            return;
        }
        try {
            Bundle a10 = a.a("");
            a10.putString("2_result", "error");
            a10.putString("5_error_message", "Unexpected call to logCompleteLogin with null pendingAuthorizationRequest.");
            a10.putString("3_method", str2);
            this.f22165b.a(a10, str);
        } catch (Throwable th2) {
            i6.a.a(this, th2);
        }
    }
}
