package o5;

import android.content.SharedPreferences;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a */
    public final SharedPreferences f22678a;

    /* loaded from: classes.dex */
    public static final class a {
    }

    public b() {
        SharedPreferences sharedPreferences = v.a().getSharedPreferences("com.facebook.AccessTokenManager.SharedPreferences", 0);
        gm.l.e(sharedPreferences, "FacebookSdk.getApplicationContext()\n              .getSharedPreferences(\n                  AccessTokenManager.SHARED_PREFERENCES_NAME, Context.MODE_PRIVATE)");
        new a();
        this.f22678a = sharedPreferences;
    }
}
