package o5;

import android.content.SharedPreferences;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: a */
    public final SharedPreferences f22752a;

    public i() {
        SharedPreferences sharedPreferences = v.a().getSharedPreferences("com.facebook.AuthenticationTokenManager.SharedPreferences", 0);
        gm.l.e(sharedPreferences, "FacebookSdk.getApplicationContext()\n              .getSharedPreferences(\n                  AuthenticationTokenManager.SHARED_PREFERENCES_NAME, Context.MODE_PRIVATE)");
        this.f22752a = sharedPreferences;
    }
}
