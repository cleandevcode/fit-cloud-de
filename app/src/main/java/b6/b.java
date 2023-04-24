package b6;

import android.content.SharedPreferences;
import android.view.View;
import cn.sharesdk.framework.InnerShareParams;
import d6.m0;
import gm.l;
import java.util.LinkedHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import o5.v;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import ul.z;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: c */
    public static SharedPreferences f4007c;

    /* renamed from: a */
    public static final b f4005a = new b();

    /* renamed from: b */
    public static final LinkedHashMap f4006b = new LinkedHashMap();

    /* renamed from: d */
    public static final AtomicBoolean f4008d = new AtomicBoolean(false);

    public static final void a(String str, String str2) {
        if (i6.a.b(b.class)) {
            return;
        }
        try {
            l.f(str2, "predictedEvent");
            if (!f4008d.get()) {
                f4005a.c();
            }
            LinkedHashMap linkedHashMap = f4006b;
            linkedHashMap.put(str, str2);
            SharedPreferences sharedPreferences = f4007c;
            if (sharedPreferences == null) {
                l.l("shardPreferences");
                throw null;
            }
            SharedPreferences.Editor edit = sharedPreferences.edit();
            m0 m0Var = m0.f12709a;
            edit.putString("SUGGESTED_EVENTS_HISTORY", m0.E(z.E(linkedHashMap))).apply();
        } catch (Throwable th2) {
            i6.a.a(b.class, th2);
        }
    }

    public static final String b(View view, String str) {
        if (i6.a.b(b.class)) {
            return null;
        }
        try {
            l.f(str, InnerShareParams.TEXT);
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put(InnerShareParams.TEXT, str);
                JSONArray jSONArray = new JSONArray();
                while (view != null) {
                    jSONArray.put(view.getClass().getSimpleName());
                    view = t5.f.h(view);
                }
                jSONObject.put("classname", jSONArray);
            } catch (JSONException unused) {
            }
            m0 m0Var = m0.f12709a;
            return m0.O(jSONObject.toString());
        } catch (Throwable th2) {
            i6.a.a(b.class, th2);
            return null;
        }
    }

    public final void c() {
        String str = "";
        if (i6.a.b(this)) {
            return;
        }
        try {
            AtomicBoolean atomicBoolean = f4008d;
            if (atomicBoolean.get()) {
                return;
            }
            SharedPreferences sharedPreferences = v.a().getSharedPreferences("com.facebook.internal.SUGGESTED_EVENTS_HISTORY", 0);
            l.e(sharedPreferences, "FacebookSdk.getApplicationContext()\n            .getSharedPreferences(CLICKED_PATH_STORE, Context.MODE_PRIVATE)");
            f4007c = sharedPreferences;
            LinkedHashMap linkedHashMap = f4006b;
            m0 m0Var = m0.f12709a;
            SharedPreferences sharedPreferences2 = f4007c;
            if (sharedPreferences2 == null) {
                l.l("shardPreferences");
                throw null;
            }
            String string = sharedPreferences2.getString("SUGGESTED_EVENTS_HISTORY", "");
            if (string != null) {
                str = string;
            }
            linkedHashMap.putAll(m0.D(str));
            atomicBoolean.set(true);
        } catch (Throwable th2) {
            i6.a.a(this, th2);
        }
    }
}
