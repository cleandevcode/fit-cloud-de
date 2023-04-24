package r5;

import android.content.SharedPreferences;
import d6.c0;
import java.util.HashMap;
import o5.g0;
import o5.v;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a */
    public static final d f25245a = new d();

    /* renamed from: b */
    public static final String f25246b = d.class.getCanonicalName();

    /* renamed from: c */
    public static boolean f25247c;

    public static void a(HashMap hashMap) {
        SharedPreferences sharedPreferences = v.a().getSharedPreferences("com.facebook.sdk.CloudBridgeSavedCredentials", 0);
        if (sharedPreferences == null) {
            return;
        }
        Object obj = hashMap.get("dataset_id");
        Object obj2 = hashMap.get("endpoint");
        Object obj3 = hashMap.get("access_key");
        if (obj == null || obj2 == null || obj3 == null) {
            return;
        }
        SharedPreferences.Editor edit = sharedPreferences.edit();
        edit.putString("dataset_id", obj.toString());
        edit.putString("endpoint", obj2.toString());
        edit.putString("access_key", obj3.toString());
        edit.apply();
        c0.a aVar = c0.f12645d;
        v.i(g0.APP_EVENTS);
    }
}
