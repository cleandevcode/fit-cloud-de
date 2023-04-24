package v5;

import android.content.SharedPreferences;
import gm.l;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;
import o5.v;
import org.json.JSONObject;
import ul.z;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: b */
    public static SharedPreferences f29111b;

    /* renamed from: a */
    public static final g f29110a = new g();

    /* renamed from: c */
    public static final CopyOnWriteArraySet f29112c = new CopyOnWriteArraySet();

    /* renamed from: d */
    public static final ConcurrentHashMap f29113d = new ConcurrentHashMap();

    public static final boolean d() {
        if (i6.a.b(g.class)) {
            return false;
        }
        try {
            f29110a.f();
            long currentTimeMillis = System.currentTimeMillis() / 1000;
            SharedPreferences sharedPreferences = f29111b;
            if (sharedPreferences == null) {
                l.l("sharedPreferences");
                throw null;
            }
            long j10 = sharedPreferences.getLong("LAST_QUERY_PURCHASE_HISTORY_TIME", 0L);
            if (j10 == 0 || currentTimeMillis - j10 >= 86400) {
                SharedPreferences sharedPreferences2 = f29111b;
                if (sharedPreferences2 != null) {
                    sharedPreferences2.edit().putLong("LAST_QUERY_PURCHASE_HISTORY_TIME", currentTimeMillis).apply();
                    return true;
                }
                l.l("sharedPreferences");
                throw null;
            }
            return false;
        } catch (Throwable th2) {
            i6.a.a(g.class, th2);
            return false;
        }
    }

    public static final void e(ConcurrentHashMap concurrentHashMap, ConcurrentHashMap concurrentHashMap2) {
        if (i6.a.b(g.class)) {
            return;
        }
        try {
            l.f(concurrentHashMap, "purchaseDetailsMap");
            l.f(concurrentHashMap2, "skuDetailsMap");
            g gVar = f29110a;
            gVar.f();
            LinkedHashMap c10 = gVar.c(gVar.a(concurrentHashMap), concurrentHashMap2);
            if (!i6.a.b(gVar)) {
                for (Map.Entry entry : c10.entrySet()) {
                    String str = (String) entry.getKey();
                    String str2 = (String) entry.getValue();
                    if (str != null && str2 != null) {
                        x5.g.a(str, str2, false);
                    }
                }
            }
        } catch (Throwable th2) {
            i6.a.a(g.class, th2);
        }
    }

    public final HashMap a(ConcurrentHashMap concurrentHashMap) {
        if (i6.a.b(this)) {
            return null;
        }
        try {
            l.f(concurrentHashMap, "purchaseDetailsMap");
            long currentTimeMillis = System.currentTimeMillis() / 1000;
            for (Map.Entry entry : z.E(concurrentHashMap).entrySet()) {
                String str = (String) entry.getKey();
                JSONObject jSONObject = (JSONObject) entry.getValue();
                try {
                    if (jSONObject.has("purchaseToken")) {
                        String string = jSONObject.getString("purchaseToken");
                        if (f29113d.containsKey(string)) {
                            concurrentHashMap.remove(str);
                        } else {
                            CopyOnWriteArraySet copyOnWriteArraySet = f29112c;
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append((Object) string);
                            sb2.append(';');
                            sb2.append(currentTimeMillis);
                            copyOnWriteArraySet.add(sb2.toString());
                        }
                    }
                } catch (Exception unused) {
                }
            }
            SharedPreferences sharedPreferences = f29111b;
            if (sharedPreferences != null) {
                sharedPreferences.edit().putStringSet("PURCHASE_DETAILS_SET", f29112c).apply();
                return new HashMap(concurrentHashMap);
            }
            l.l("sharedPreferences");
            throw null;
        } catch (Throwable th2) {
            i6.a.a(this, th2);
            return null;
        }
    }

    public final void b() {
        SharedPreferences.Editor putStringSet;
        if (i6.a.b(this)) {
            return;
        }
        try {
            long currentTimeMillis = System.currentTimeMillis() / 1000;
            SharedPreferences sharedPreferences = f29111b;
            if (sharedPreferences == null) {
                l.l("sharedPreferences");
                throw null;
            }
            long j10 = sharedPreferences.getLong("LAST_CLEARED_TIME", 0L);
            if (j10 == 0) {
                SharedPreferences sharedPreferences2 = f29111b;
                if (sharedPreferences2 == null) {
                    l.l("sharedPreferences");
                    throw null;
                }
                putStringSet = sharedPreferences2.edit();
            } else if (currentTimeMillis - j10 <= 604800) {
                return;
            } else {
                for (Map.Entry entry : z.E(f29113d).entrySet()) {
                    String str = (String) entry.getKey();
                    long longValue = ((Number) entry.getValue()).longValue();
                    if (currentTimeMillis - longValue > 86400) {
                        CopyOnWriteArraySet copyOnWriteArraySet = f29112c;
                        copyOnWriteArraySet.remove(str + ';' + longValue);
                        f29113d.remove(str);
                    }
                }
                SharedPreferences sharedPreferences3 = f29111b;
                if (sharedPreferences3 == null) {
                    l.l("sharedPreferences");
                    throw null;
                }
                putStringSet = sharedPreferences3.edit().putStringSet("PURCHASE_DETAILS_SET", f29112c);
            }
            putStringSet.putLong("LAST_CLEARED_TIME", currentTimeMillis).apply();
        } catch (Throwable th2) {
            i6.a.a(this, th2);
        }
    }

    public final LinkedHashMap c(HashMap hashMap, ConcurrentHashMap concurrentHashMap) {
        if (i6.a.b(this)) {
            return null;
        }
        try {
            l.f(hashMap, "purchaseDetailsMap");
            l.f(concurrentHashMap, "skuDetailsMap");
            long currentTimeMillis = System.currentTimeMillis() / 1000;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry entry : hashMap.entrySet()) {
                JSONObject jSONObject = (JSONObject) entry.getValue();
                JSONObject jSONObject2 = (JSONObject) concurrentHashMap.get((String) entry.getKey());
                if (jSONObject != null && jSONObject.has("purchaseTime")) {
                    try {
                        if (currentTimeMillis - (jSONObject.getLong("purchaseTime") / 1000) <= 86400 && jSONObject2 != null) {
                            String jSONObject3 = jSONObject.toString();
                            l.e(jSONObject3, "purchaseDetail.toString()");
                            String jSONObject4 = jSONObject2.toString();
                            l.e(jSONObject4, "skuDetail.toString()");
                            linkedHashMap.put(jSONObject3, jSONObject4);
                        }
                    } catch (Exception unused) {
                    }
                }
            }
            return linkedHashMap;
        } catch (Throwable th2) {
            i6.a.a(this, th2);
            return null;
        }
    }

    public final void f() {
        if (i6.a.b(this)) {
            return;
        }
        try {
            SharedPreferences sharedPreferences = v.a().getSharedPreferences("com.facebook.internal.SKU_DETAILS", 0);
            SharedPreferences sharedPreferences2 = v.a().getSharedPreferences("com.facebook.internal.PURCHASE", 0);
            if (sharedPreferences.contains("LAST_CLEARED_TIME")) {
                sharedPreferences.edit().clear().apply();
                sharedPreferences2.edit().clear().apply();
            }
            SharedPreferences sharedPreferences3 = v.a().getSharedPreferences("com.facebook.internal.iap.PRODUCT_DETAILS", 0);
            l.e(sharedPreferences3, "getApplicationContext().getSharedPreferences(PRODUCT_DETAILS_STORE, Context.MODE_PRIVATE)");
            f29111b = sharedPreferences3;
            CopyOnWriteArraySet copyOnWriteArraySet = f29112c;
            Set<String> stringSet = sharedPreferences3.getStringSet("PURCHASE_DETAILS_SET", new HashSet());
            if (stringSet == null) {
                stringSet = new HashSet<>();
            }
            copyOnWriteArraySet.addAll(stringSet);
            Iterator it = copyOnWriteArraySet.iterator();
            while (it.hasNext()) {
                List s02 = om.l.s0((String) it.next(), new String[]{";"}, 2, 2);
                f29113d.put(s02.get(0), Long.valueOf(Long.parseLong((String) s02.get(1))));
            }
            b();
        } catch (Throwable th2) {
            i6.a.a(this, th2);
        }
    }
}
