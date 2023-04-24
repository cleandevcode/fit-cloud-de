package d6;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import o5.s;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class p {

    /* renamed from: d */
    public static final a f12720d = new a();

    /* renamed from: e */
    public static p f12721e;

    /* renamed from: a */
    public final Map<Integer, Set<Integer>> f12722a;

    /* renamed from: b */
    public final Map<Integer, Set<Integer>> f12723b;

    /* renamed from: c */
    public final Map<Integer, Set<Integer>> f12724c;

    /* loaded from: classes.dex */
    public static final class a {
        public static p b() {
            return new p(null, ul.z.C(new tl.f(2, null), new tl.f(4, null), new tl.f(9, null), new tl.f(17, null), new tl.f(341, null)), ul.z.C(new tl.f(102, null), new tl.f(190, null), new tl.f(412, null)), null, null, null);
        }

        public static HashMap c(JSONObject jSONObject) {
            int optInt;
            HashSet hashSet;
            JSONArray optJSONArray = jSONObject.optJSONArray("items");
            if (optJSONArray.length() == 0) {
                return null;
            }
            HashMap hashMap = new HashMap();
            int length = optJSONArray.length();
            if (length > 0) {
                int i10 = 0;
                while (true) {
                    int i11 = i10 + 1;
                    JSONObject optJSONObject = optJSONArray.optJSONObject(i10);
                    if (optJSONObject != null && (optInt = optJSONObject.optInt("code")) != 0) {
                        JSONArray optJSONArray2 = optJSONObject.optJSONArray("subcodes");
                        if (optJSONArray2 == null || optJSONArray2.length() <= 0) {
                            hashSet = null;
                        } else {
                            hashSet = new HashSet();
                            int length2 = optJSONArray2.length();
                            if (length2 > 0) {
                                int i12 = 0;
                                while (true) {
                                    int i13 = i12 + 1;
                                    int optInt2 = optJSONArray2.optInt(i12);
                                    if (optInt2 != 0) {
                                        hashSet.add(Integer.valueOf(optInt2));
                                    }
                                    if (i13 >= length2) {
                                        break;
                                    }
                                    i12 = i13;
                                }
                            }
                        }
                        hashMap.put(Integer.valueOf(optInt), hashSet);
                    }
                    if (i11 >= length) {
                        break;
                    }
                    i10 = i11;
                }
            }
            return hashMap;
        }

        public final synchronized p a() {
            p pVar;
            if (p.f12721e == null) {
                p.f12721e = b();
            }
            pVar = p.f12721e;
            if (pVar == null) {
                throw new NullPointerException("null cannot be cast to non-null type com.facebook.internal.FacebookRequestErrorClassification");
            }
            return pVar;
        }
    }

    /* loaded from: classes.dex */
    public /* synthetic */ class b {

        /* renamed from: a */
        public static final /* synthetic */ int[] f12725a;

        static {
            int[] iArr = new int[s.a.valuesCustom().length];
            iArr[1] = 1;
            iArr[0] = 2;
            iArr[2] = 3;
            f12725a = iArr;
        }
    }

    public p(HashMap hashMap, HashMap hashMap2, HashMap hashMap3, String str, String str2, String str3) {
        this.f12722a = hashMap;
        this.f12723b = hashMap2;
        this.f12724c = hashMap3;
    }
}
