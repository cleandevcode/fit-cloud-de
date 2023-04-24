package fc;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a */
    public static SharedPreferences f14231a;

    public static synchronized SharedPreferences a(Context context) {
        SharedPreferences sharedPreferences;
        Context applicationContext;
        String str;
        synchronized (d.class) {
            if (f14231a == null) {
                if (Build.VERSION.SDK_INT >= 24) {
                    applicationContext = context.createDeviceProtectedStorageContext();
                    str = "aegis";
                } else {
                    applicationContext = context.getApplicationContext();
                    str = "aegis";
                }
                f14231a = applicationContext.getSharedPreferences(str, 0);
            }
            sharedPreferences = f14231a;
        }
        return sharedPreferences;
    }
}
