package d6;

/* loaded from: classes.dex */
public final class y {

    /* loaded from: classes.dex */
    public interface a {
        void a(String str);
    }

    public static final void a() {
        o5.v.a().getSharedPreferences("com.facebook.sdk.appEventPreferences", 0).edit().putBoolean("is_referrer_updated", true).apply();
    }
}
