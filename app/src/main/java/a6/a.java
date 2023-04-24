package a6;

import android.util.Log;
import d6.m0;
import d6.v;
import d6.w;
import gm.l;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArraySet;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: b */
    public static boolean f352b;

    /* renamed from: a */
    public static final a f351a = new a();

    /* renamed from: c */
    public static final String f353c = a.class.getCanonicalName();

    /* renamed from: d */
    public static final ArrayList f354d = new ArrayList();

    /* renamed from: e */
    public static final CopyOnWriteArraySet f355e = new CopyOnWriteArraySet();

    /* renamed from: a6.a$a */
    /* loaded from: classes.dex */
    public static final class C0001a {

        /* renamed from: a */
        public String f356a;

        /* renamed from: b */
        public Map<String, String> f357b;

        public C0001a(String str, HashMap hashMap) {
            this.f356a = str;
            this.f357b = hashMap;
        }
    }

    public final String a(String str, String str2) {
        if (i6.a.b(this)) {
            return null;
        }
        try {
            try {
                Iterator it = new ArrayList(f354d).iterator();
                while (it.hasNext()) {
                    C0001a c0001a = (C0001a) it.next();
                    if (c0001a != null && l.a(str, c0001a.f356a)) {
                        for (String str3 : c0001a.f357b.keySet()) {
                            if (l.a(str2, str3)) {
                                return c0001a.f357b.get(str3);
                            }
                        }
                        continue;
                    }
                }
            } catch (Exception e10) {
                Log.w(f353c, "getMatchedRuleType failed", e10);
            }
            return null;
        } catch (Throwable th2) {
            i6.a.a(this, th2);
            return null;
        }
    }

    public final void b() {
        String str;
        if (i6.a.b(this)) {
            return;
        }
        try {
            w wVar = w.f12811a;
            boolean z10 = false;
            v f10 = w.f(o5.v.b(), false);
            if (f10 != null && (str = f10.f12807m) != null) {
                if (str.length() == 0) {
                    z10 = true;
                }
                if (!z10) {
                    JSONObject jSONObject = new JSONObject(str);
                    f354d.clear();
                    f355e.clear();
                    Iterator<String> keys = jSONObject.keys();
                    while (keys.hasNext()) {
                        String next = keys.next();
                        JSONObject jSONObject2 = jSONObject.getJSONObject(next);
                        if (jSONObject2 != null) {
                            JSONObject optJSONObject = jSONObject2.optJSONObject("restrictive_param");
                            l.e(next, "key");
                            C0001a c0001a = new C0001a(next, new HashMap());
                            if (optJSONObject != null) {
                                c0001a.f357b = m0.i(optJSONObject);
                                f354d.add(c0001a);
                            }
                            if (jSONObject2.has("process_event_name")) {
                                f355e.add(c0001a.f356a);
                            }
                        }
                    }
                }
            }
        } catch (Exception unused) {
        } catch (Throwable th2) {
            i6.a.a(this, th2);
        }
    }
}
