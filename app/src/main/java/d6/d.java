package d6;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a */
    public static final HashMap f12650a;

    /* loaded from: classes.dex */
    public static final class a implements h {
        @Override // d6.d.h
        public final void a(Bundle bundle, String str, Object obj) {
            bundle.putBoolean(str, ((Boolean) obj).booleanValue());
        }
    }

    /* loaded from: classes.dex */
    public static final class b implements h {
        @Override // d6.d.h
        public final void a(Bundle bundle, String str, Object obj) {
            bundle.putInt(str, ((Integer) obj).intValue());
        }
    }

    /* loaded from: classes.dex */
    public static final class c implements h {
        @Override // d6.d.h
        public final void a(Bundle bundle, String str, Object obj) {
            bundle.putLong(str, ((Long) obj).longValue());
        }
    }

    /* renamed from: d6.d$d */
    /* loaded from: classes.dex */
    public static final class C0217d implements h {
        @Override // d6.d.h
        public final void a(Bundle bundle, String str, Object obj) {
            bundle.putDouble(str, ((Double) obj).doubleValue());
        }
    }

    /* loaded from: classes.dex */
    public static final class e implements h {
        @Override // d6.d.h
        public final void a(Bundle bundle, String str, Object obj) {
            bundle.putString(str, (String) obj);
        }
    }

    /* loaded from: classes.dex */
    public static final class f implements h {
        @Override // d6.d.h
        public final void a(Bundle bundle, String str, Object obj) {
            throw new IllegalArgumentException("Unexpected type from JSON");
        }
    }

    /* loaded from: classes.dex */
    public static final class g implements h {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // d6.d.h
        public final void a(Bundle bundle, String str, Object obj) {
            JSONArray jSONArray = (JSONArray) obj;
            ArrayList arrayList = new ArrayList();
            if (jSONArray.length() == 0) {
                bundle.putStringArrayList(str, arrayList);
                return;
            }
            int i10 = 0;
            int length = jSONArray.length();
            if (length > 0) {
                while (true) {
                    int i11 = i10 + 1;
                    Object obj2 = jSONArray.get(i10);
                    if (!(obj2 instanceof String)) {
                        throw new IllegalArgumentException(gm.l.k(obj2.getClass(), "Unexpected type in an array: "));
                    }
                    arrayList.add(obj2);
                    if (i11 >= length) {
                        break;
                    }
                    i10 = i11;
                }
            }
            bundle.putStringArrayList(str, arrayList);
        }
    }

    /* loaded from: classes.dex */
    public interface h {
        void a(Bundle bundle, String str, Object obj);
    }

    static {
        HashMap hashMap = new HashMap();
        f12650a = hashMap;
        hashMap.put(Boolean.class, new a());
        hashMap.put(Integer.class, new b());
        hashMap.put(Long.class, new c());
        hashMap.put(Double.class, new C0217d());
        hashMap.put(String.class, new e());
        hashMap.put(String[].class, new f());
        hashMap.put(JSONArray.class, new g());
    }

    public static final Bundle a(JSONObject jSONObject) {
        gm.l.f(jSONObject, "jsonObject");
        Bundle bundle = new Bundle();
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            Object obj = jSONObject.get(next);
            if (obj != JSONObject.NULL) {
                if (obj instanceof JSONObject) {
                    bundle.putBundle(next, a((JSONObject) obj));
                } else {
                    h hVar = (h) f12650a.get(obj.getClass());
                    if (hVar == null) {
                        throw new IllegalArgumentException(gm.l.k(obj.getClass(), "Unsupported type: "));
                    }
                    gm.l.e(next, "key");
                    hVar.a(bundle, next, obj);
                }
            }
        }
        return bundle;
    }
}
