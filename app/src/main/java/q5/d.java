package q5;

import gm.l;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: d */
    public static final CopyOnWriteArraySet f24593d = new CopyOnWriteArraySet();

    /* renamed from: a */
    public final String f24594a;

    /* renamed from: b */
    public final String f24595b;

    /* renamed from: c */
    public final List<String> f24596c;

    /* loaded from: classes.dex */
    public static final class a {
        public static void a(JSONObject jSONObject) {
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                JSONObject optJSONObject = jSONObject.optJSONObject(next);
                if (optJSONObject != null) {
                    String optString = optJSONObject.optString("k");
                    String optString2 = optJSONObject.optString("v");
                    l.e(optString, "k");
                    if (!(optString.length() == 0)) {
                        CopyOnWriteArraySet a10 = d.a();
                        l.e(next, "key");
                        List s02 = om.l.s0(optString, new String[]{","}, 0, 6);
                        l.e(optString2, "v");
                        a10.add(new d(next, s02, optString2));
                    }
                }
            }
        }
    }

    public d(String str, List list, String str2) {
        this.f24594a = str;
        this.f24595b = str2;
        this.f24596c = list;
    }

    public static final /* synthetic */ CopyOnWriteArraySet a() {
        if (i6.a.b(d.class)) {
            return null;
        }
        try {
            return f24593d;
        } catch (Throwable th2) {
            i6.a.a(d.class, th2);
            return null;
        }
    }

    public final String b() {
        if (i6.a.b(this)) {
            return null;
        }
        try {
            return this.f24594a;
        } catch (Throwable th2) {
            i6.a.a(this, th2);
            return null;
        }
    }
}
