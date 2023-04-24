package v5;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.util.Log;
import d6.v;
import d6.w;
import gm.l;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import o5.q0;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a */
    public static final c f29066a = new c();

    /* renamed from: b */
    public static final String f29067b = c.class.getCanonicalName();

    /* renamed from: c */
    public static final AtomicBoolean f29068c = new AtomicBoolean(false);

    /* renamed from: d */
    public static Boolean f29069d;

    /* renamed from: e */
    public static Boolean f29070e;

    /* renamed from: f */
    public static a f29071f;

    /* renamed from: g */
    public static b f29072g;

    /* renamed from: h */
    public static Intent f29073h;

    /* renamed from: i */
    public static Object f29074i;

    public static final void a(c cVar, Context context, ArrayList arrayList, boolean z10) {
        cVar.getClass();
        if (!arrayList.isEmpty()) {
            HashMap hashMap = new HashMap();
            ArrayList arrayList2 = new ArrayList();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                try {
                    String string = new JSONObject(str).getString("productId");
                    l.e(string, "sku");
                    l.e(str, "purchase");
                    hashMap.put(string, str);
                    arrayList2.add(string);
                } catch (JSONException e10) {
                    Log.e(f29067b, "Error parsing in-app purchase data.", e10);
                }
            }
            f fVar = f.f29104a;
            Object obj = f29074i;
            LinkedHashMap linkedHashMap = null;
            if (!i6.a.b(f.class)) {
                try {
                    LinkedHashMap j10 = f.f29104a.j(arrayList2);
                    ArrayList arrayList3 = new ArrayList();
                    Iterator it2 = arrayList2.iterator();
                    while (it2.hasNext()) {
                        String str2 = (String) it2.next();
                        if (!j10.containsKey(str2)) {
                            arrayList3.add(str2);
                        }
                    }
                    j10.putAll(f.f29104a.g(context, arrayList3, obj, z10));
                    linkedHashMap = j10;
                } catch (Throwable th2) {
                    i6.a.a(f.class, th2);
                }
            }
            for (Map.Entry entry : linkedHashMap.entrySet()) {
                String str3 = (String) entry.getValue();
                String str4 = (String) hashMap.get((String) entry.getKey());
                if (str4 != null) {
                    x5.g.a(str4, str3, z10);
                }
            }
        }
    }

    public static final void b() {
        boolean z10;
        boolean z11;
        boolean z12;
        SharedPreferences.Editor clear;
        f29066a.getClass();
        if (f29069d == null) {
            if (j.a("com.android.vending.billing.IInAppBillingService$Stub") != null) {
                z11 = true;
            } else {
                z11 = false;
            }
            Boolean valueOf = Boolean.valueOf(z11);
            f29069d = valueOf;
            if (!l.a(valueOf, Boolean.FALSE)) {
                if (j.a("com.android.billingclient.api.ProxyBillingActivity") != null) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                f29070e = Boolean.valueOf(z12);
                f fVar = f.f29104a;
                if (!i6.a.b(f.class)) {
                    try {
                        long currentTimeMillis = System.currentTimeMillis() / 1000;
                        SharedPreferences sharedPreferences = f.f29108e;
                        long j10 = sharedPreferences.getLong("LAST_CLEARED_TIME", 0L);
                        if (j10 == 0) {
                            clear = sharedPreferences.edit();
                        } else if (currentTimeMillis - j10 > 604800) {
                            clear = sharedPreferences.edit().clear();
                        }
                        clear.putLong("LAST_CLEARED_TIME", currentTimeMillis).apply();
                    } catch (Throwable th2) {
                        i6.a.a(f.class, th2);
                    }
                }
                Intent intent = new Intent("com.android.vending.billing.InAppBillingService.BIND").setPackage("com.android.vending");
                l.e(intent, "Intent(\"com.android.vending.billing.InAppBillingService.BIND\")\n            .setPackage(\"com.android.vending\")");
                f29073h = intent;
                f29071f = new a();
                f29072g = new b();
            }
        }
        if (l.a(f29069d, Boolean.FALSE)) {
            return;
        }
        x5.g gVar = x5.g.f30302a;
        v b10 = w.b(o5.v.b());
        if (b10 != null && q0.b() && b10.f12801g) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            f29066a.getClass();
            if (f29068c.compareAndSet(false, true)) {
                Context a10 = o5.v.a();
                if (a10 instanceof Application) {
                    Application application = (Application) a10;
                    b bVar = f29072g;
                    if (bVar != null) {
                        application.registerActivityLifecycleCallbacks(bVar);
                        Intent intent2 = f29073h;
                        if (intent2 != null) {
                            a aVar = f29071f;
                            if (aVar != null) {
                                a10.bindService(intent2, aVar, 1);
                                return;
                            } else {
                                l.l("serviceConnection");
                                throw null;
                            }
                        }
                        l.l("intent");
                        throw null;
                    }
                    l.l("callbacks");
                    throw null;
                }
            }
        }
    }
}
