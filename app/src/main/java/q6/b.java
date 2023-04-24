package q6;

import android.os.Bundle;
import gm.l;
import java.util.HashMap;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;
import ul.u;
import ul.z;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a */
    public static final HashMap<Class<?>, d> f24605a = z.C(new tl.f(String.class, new a()), new tl.f(String[].class, new C0446b()), new tl.f(JSONArray.class, new c()));

    /* loaded from: classes.dex */
    public static final class a implements d {
        @Override // q6.b.d
        public final void a(JSONObject jSONObject, String str, Object obj) {
            l.f(str, "key");
            jSONObject.put(str, obj);
        }
    }

    /* renamed from: q6.b$b */
    /* loaded from: classes.dex */
    public static final class C0446b implements d {
        @Override // q6.b.d
        public final void a(JSONObject jSONObject, String str, Object obj) {
            l.f(str, "key");
            JSONArray jSONArray = new JSONArray();
            String[] strArr = (String[]) obj;
            int i10 = 0;
            int length = strArr.length;
            while (i10 < length) {
                String str2 = strArr[i10];
                i10++;
                jSONArray.put(str2);
            }
            jSONObject.put(str, jSONArray);
        }
    }

    /* loaded from: classes.dex */
    public static final class c implements d {
        @Override // q6.b.d
        public final void a(JSONObject jSONObject, String str, Object obj) {
            l.f(str, "key");
            throw new IllegalArgumentException("JSONArray's are not supported in bundles.");
        }
    }

    /* loaded from: classes.dex */
    public interface d {
        void a(JSONObject jSONObject, String str, Object obj);
    }

    public static final JSONObject a(r6.a aVar) {
        Set<String> keySet;
        Object obj;
        if (aVar == null) {
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        Bundle bundle = aVar.f25346a;
        if (bundle == null) {
            keySet = null;
        } else {
            keySet = bundle.keySet();
        }
        if (keySet == null) {
            keySet = u.f28881a;
        }
        for (String str : keySet) {
            Bundle bundle2 = aVar.f25346a;
            if (bundle2 == null) {
                obj = null;
            } else {
                obj = bundle2.get(str);
            }
            if (obj != null) {
                d dVar = f24605a.get(obj.getClass());
                if (dVar != null) {
                    dVar.a(jSONObject, str, obj);
                } else {
                    throw new IllegalArgumentException(l.k(obj.getClass(), "Unsupported type: "));
                }
            }
        }
        return jSONObject;
    }
}
