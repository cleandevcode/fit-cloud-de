package o5;

import android.content.SharedPreferences;

/* loaded from: classes.dex */
public final class i0 {

    /* renamed from: a */
    public final SharedPreferences f22753a;

    public i0() {
        SharedPreferences sharedPreferences = v.a().getSharedPreferences("com.facebook.AccessTokenManager.SharedPreferences", 0);
        gm.l.e(sharedPreferences, "FacebookSdk.getApplicationContext()\n            .getSharedPreferences(SHARED_PREFERENCES_NAME, Context.MODE_PRIVATE)");
        this.f22753a = sharedPreferences;
    }
}
