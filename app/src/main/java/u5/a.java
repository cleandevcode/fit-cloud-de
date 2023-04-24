package u5;

import d6.m0;
import d6.v;
import d6.w;
import gm.l;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;
import p5.d;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: b */
    public static boolean f28516b;

    /* renamed from: a */
    public static final a f28515a = new a();

    /* renamed from: c */
    public static final ArrayList f28517c = new ArrayList();

    /* renamed from: d */
    public static final HashSet f28518d = new HashSet();

    /* renamed from: u5.a$a */
    /* loaded from: classes.dex */
    public static final class C0511a {

        /* renamed from: a */
        public String f28519a;

        /* renamed from: b */
        public List<String> f28520b;

        public C0511a(String str, ArrayList arrayList) {
            this.f28519a = str;
            this.f28520b = arrayList;
        }
    }

    public static final void b(ArrayList arrayList) {
        if (i6.a.b(a.class)) {
            return;
        }
        try {
            l.f(arrayList, "events");
            if (!f28516b) {
                return;
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                if (f28518d.contains(((d) it.next()).f23899d)) {
                    it.remove();
                }
            }
        } catch (Throwable th2) {
            i6.a.a(a.class, th2);
        }
    }

    public final synchronized void a() {
        boolean z10;
        v f10;
        if (i6.a.b(this)) {
            return;
        }
        try {
            w wVar = w.f12811a;
            z10 = false;
            f10 = w.f(o5.v.b(), false);
        } catch (Exception unused) {
        }
        if (f10 == null) {
            return;
        }
        String str = f10.f12807m;
        if (str != null) {
            if (str.length() > 0) {
                z10 = true;
            }
            if (z10) {
                JSONObject jSONObject = new JSONObject(str);
                f28517c.clear();
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    JSONObject jSONObject2 = jSONObject.getJSONObject(next);
                    if (jSONObject2 != null) {
                        if (jSONObject2.optBoolean("is_deprecated_event")) {
                            HashSet hashSet = f28518d;
                            l.e(next, "key");
                            hashSet.add(next);
                        } else {
                            JSONArray optJSONArray = jSONObject2.optJSONArray("deprecated_param");
                            l.e(next, "key");
                            C0511a c0511a = new C0511a(next, new ArrayList());
                            if (optJSONArray != null) {
                                c0511a.f28520b = m0.g(optJSONArray);
                            }
                            f28517c.add(c0511a);
                        }
                    }
                }
            }
        }
    }
}
