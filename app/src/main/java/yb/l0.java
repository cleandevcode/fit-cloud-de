package yb;

import android.content.Context;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;

/* loaded from: classes.dex */
public final class l0 {
    public static HashMap a(Context context, String str, String str2) {
        HashMap c10;
        HashMap c11;
        if (!"alltype".equals(str2) && !TextUtils.isEmpty(str)) {
            String e10 = y.e(str, str2);
            String b10 = l.b(context, "stat_v2_1", e10);
            c10 = new HashMap();
            b(e10, b10, c10);
            String b11 = l.b(context, "cached_v2_1", e10);
            c11 = new HashMap();
            b(e10, b11, c11);
        } else {
            m2.f.b("read all event records");
            c10 = c(context, "stat_v2_1");
            c11 = c(context, "cached_v2_1");
        }
        if (c10.size() == 0 && c11.size() == 0) {
            return new HashMap();
        }
        if (c10.size() != 0) {
            if (c11.size() == 0) {
                return c10;
            }
            HashMap hashMap = new HashMap(c10);
            hashMap.putAll(c11);
            return hashMap;
        }
        return c11;
    }

    public static void b(String str, String str2, HashMap hashMap) {
        ArrayList arrayList = new ArrayList();
        try {
            if (TextUtils.isEmpty(str2)) {
                return;
            }
            JSONArray jSONArray = new JSONArray(str2);
            if (jSONArray.length() == 0) {
                return;
            }
            for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                h0 h0Var = new h0();
                try {
                    h0Var.b(jSONArray.getJSONObject(i10));
                    arrayList.add(h0Var);
                } catch (JSONException unused) {
                    m2.f.e("hmsSdk", "JSON Exception happened when create data for report - readDataToRecord");
                }
            }
            hashMap.put(str, arrayList);
        } catch (JSONException unused2) {
            m2.f.e("hmsSdk", "When events turn to JSONArray,JSON Exception has happened");
        }
    }

    public static HashMap c(Context context, String str) {
        HashSet hashSet;
        if (context == null) {
            return null;
        }
        Map<String, ?> all = context.getSharedPreferences(l.f(context, str), 0).getAll();
        Iterator<Map.Entry<String, ?>> it = all.entrySet().iterator();
        r.a().getClass();
        Set<String> keySet = r.f31378b.keySet();
        if (keySet != null && keySet.size() != 0) {
            hashSet = new HashSet();
            for (String str2 : keySet) {
                if (!"_default_config_tag".equals(str2)) {
                    String a10 = android.support.v4.media.a.a(str2, "-", "oper");
                    String a11 = android.support.v4.media.a.a(str2, "-", "maint");
                    hashSet.add(a10);
                    hashSet.add(a11);
                    hashSet.add(str2 + "-diffprivacy");
                } else {
                    hashSet.add("_default_config_tag");
                }
            }
        } else {
            hashSet = new HashSet();
        }
        while (it.hasNext()) {
            if (!hashSet.contains(it.next().getKey())) {
                it.remove();
            }
        }
        HashMap hashMap = new HashMap();
        for (Map.Entry<String, ?> entry : all.entrySet()) {
            String key = entry.getKey();
            if (entry.getValue() instanceof String) {
                b(key, (String) entry.getValue(), hashMap);
            }
        }
        return hashMap;
    }
}
