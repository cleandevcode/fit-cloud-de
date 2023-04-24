package y5;

import android.os.Bundle;
import android.text.TextUtils;
import cn.sharesdk.framework.InnerShareParams;
import gm.l;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import lm.i;
import lm.j;
import o5.y;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import qa.p;
import s.q0;
import x5.h;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a */
    public static final d f31147a = new d();

    /* renamed from: b */
    public static final ConcurrentHashMap f31148b = new ConcurrentHashMap();

    /* renamed from: c */
    public static final List<String> f31149c = h7.a.q("other", "fb_mobile_complete_registration", "fb_mobile_add_to_cart", "fb_mobile_purchase", "fb_mobile_initiated_checkout");

    /* renamed from: d */
    public static final List<String> f31150d = h7.a.q("none", InnerShareParams.ADDRESS, "health");

    /* loaded from: classes.dex */
    public enum a {
        MTML_INTEGRITY_DETECT,
        MTML_APP_EVENT_PREDICTION;

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static a[] valuesCustom() {
            return (a[]) Arrays.copyOf(values(), 2);
        }

        public final String a() {
            int ordinal = ordinal();
            if (ordinal != 0) {
                if (ordinal == 1) {
                    return "app_event_pred";
                }
                throw new p();
            }
            return "integrity_detect";
        }

        public final String c() {
            int ordinal = ordinal();
            if (ordinal != 0) {
                if (ordinal == 1) {
                    return "MTML_APP_EVENT_PRED";
                }
                throw new p();
            }
            return "MTML_INTEGRITY_DETECT";
        }
    }

    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a */
        public String f31154a;

        /* renamed from: b */
        public String f31155b;

        /* renamed from: c */
        public String f31156c;

        /* renamed from: d */
        public int f31157d;

        /* renamed from: e */
        public float[] f31158e;

        /* renamed from: f */
        public File f31159f;

        /* renamed from: g */
        public y5.b f31160g;

        /* renamed from: h */
        public Runnable f31161h;

        /* loaded from: classes.dex */
        public static final class a {
            public static b a(JSONObject jSONObject) {
                String string;
                String string2;
                String optString;
                int i10;
                float[] fArr;
                if (jSONObject != null) {
                    try {
                        string = jSONObject.getString("use_case");
                        string2 = jSONObject.getString("asset_uri");
                        optString = jSONObject.optString("rules_uri", null);
                        i10 = jSONObject.getInt("version_id");
                        d dVar = d.f31147a;
                        JSONArray jSONArray = jSONObject.getJSONArray("thresholds");
                        if (!i6.a.b(d.class)) {
                            dVar.getClass();
                            if (!i6.a.b(dVar) && jSONArray != null) {
                                fArr = new float[jSONArray.length()];
                                int i11 = 0;
                                int length = jSONArray.length();
                                if (length > 0) {
                                    while (true) {
                                        int i12 = i11 + 1;
                                        try {
                                            String string3 = jSONArray.getString(i11);
                                            l.e(string3, "jsonArray.getString(i)");
                                            fArr[i11] = Float.parseFloat(string3);
                                        } catch (JSONException unused) {
                                        }
                                        if (i12 >= length) {
                                            break;
                                        }
                                        i11 = i12;
                                    }
                                }
                                l.e(string, "useCase");
                                l.e(string2, "assetUri");
                            }
                        }
                        fArr = null;
                        l.e(string, "useCase");
                        l.e(string2, "assetUri");
                    } catch (Exception unused2) {
                        return null;
                    }
                }
                return new b(string, string2, optString, i10, fArr);
            }

            public static void b(String str, String str2, h.a aVar) {
                File file = new File(f.a(), str2);
                if (str == null || file.exists()) {
                    aVar.c(file);
                } else {
                    new h(str, file, aVar).execute(new String[0]);
                }
            }

            public static void c(b bVar, ArrayList arrayList) {
                File[] listFiles;
                boolean z10;
                String str = bVar.f31154a;
                int i10 = bVar.f31157d;
                File a10 = f.a();
                if (a10 != null && (listFiles = a10.listFiles()) != null) {
                    if (listFiles.length == 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (!z10) {
                        String str2 = str + '_' + i10;
                        int length = listFiles.length;
                        int i11 = 0;
                        while (i11 < length) {
                            File file = listFiles[i11];
                            i11++;
                            String name = file.getName();
                            l.e(name, "name");
                            if (om.h.a0(name, str, false) && !om.h.a0(name, str2, false)) {
                                file.delete();
                            }
                        }
                    }
                }
                b(bVar.f31155b, bVar.f31154a + '_' + bVar.f31157d, new q0(7, arrayList));
            }
        }

        public b(String str, String str2, String str3, int i10, float[] fArr) {
            this.f31154a = str;
            this.f31155b = str2;
            this.f31156c = str3;
            this.f31157d = i10;
            this.f31158e = fArr;
        }
    }

    public static final File d() {
        a aVar = a.MTML_APP_EVENT_PREDICTION;
        if (i6.a.b(d.class)) {
            return null;
        }
        try {
            b bVar = (b) f31148b.get(aVar.c());
            if (bVar == null) {
                return null;
            }
            return bVar.f31159f;
        } catch (Throwable th2) {
            i6.a.a(d.class, th2);
            return null;
        }
    }

    public static final String[] f(a aVar, float[][] fArr, String[] strArr) {
        y5.b bVar;
        boolean z10;
        if (i6.a.b(d.class)) {
            return null;
        }
        try {
            b bVar2 = (b) f31148b.get(aVar.c());
            if (bVar2 == null) {
                bVar = null;
            } else {
                bVar = bVar2.f31160g;
            }
            if (bVar == null) {
                return null;
            }
            float[] fArr2 = bVar2.f31158e;
            int length = strArr.length;
            boolean z11 = false;
            int length2 = fArr[0].length;
            y5.a aVar2 = new y5.a(new int[]{length, length2});
            if (length > 0) {
                int i10 = 0;
                while (true) {
                    int i11 = i10 + 1;
                    System.arraycopy(fArr[i10], 0, aVar2.f31133c, i10 * length2, length2);
                    if (i11 >= length) {
                        break;
                    }
                    i10 = i11;
                }
            }
            y5.a a10 = bVar.a(aVar2, strArr, aVar.a());
            if (a10 == null || fArr2 == null) {
                return null;
            }
            if (a10.f31133c.length == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                return null;
            }
            if (fArr2.length == 0) {
                z11 = true;
            }
            if (z11) {
                return null;
            }
            int ordinal = aVar.ordinal();
            if (ordinal != 0) {
                if (ordinal == 1) {
                    return f31147a.h(a10, fArr2);
                }
                throw new p();
            }
            return f31147a.g(a10, fArr2);
        } catch (Throwable th2) {
            i6.a.a(d.class, th2);
            return null;
        }
    }

    public final void a(JSONObject jSONObject) {
        if (i6.a.b(this)) {
            return;
        }
        try {
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                try {
                    b a10 = b.a.a(jSONObject.getJSONObject(keys.next()));
                    if (a10 != null) {
                        f31148b.put(a10.f31154a, a10);
                    }
                } catch (JSONException unused) {
                    return;
                }
            }
        } catch (Throwable th2) {
            i6.a.a(this, th2);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:80:0x007c, code lost:
        if (om.l.c0(r7, "en", false) != false) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0086 A[Catch: all -> 0x00d3, TryCatch #3 {all -> 0x00d3, blocks: (B:62:0x0007, B:63:0x001a, B:65:0x0020, B:67:0x003e, B:69:0x0050, B:85:0x0086, B:86:0x0090, B:88:0x009c, B:90:0x00ae, B:93:0x00bf, B:95:0x00c5, B:72:0x0057, B:73:0x0059, B:79:0x006d), top: B:102:0x0007 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b() {
        /*
            r10 = this;
            boolean r0 = i6.a.b(r10)
            if (r0 == 0) goto L7
            return
        L7:
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch: java.lang.Throwable -> Ld3
            r0.<init>()     // Catch: java.lang.Throwable -> Ld3
            java.util.concurrent.ConcurrentHashMap r1 = y5.d.f31148b     // Catch: java.lang.Throwable -> Ld3
            java.util.Set r1 = r1.entrySet()     // Catch: java.lang.Throwable -> Ld3
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> Ld3
            r2 = 0
            r3 = 0
            r6 = r2
            r8 = 0
        L1a:
            boolean r4 = r1.hasNext()     // Catch: java.lang.Throwable -> Ld3
            if (r4 == 0) goto Lbb
            java.lang.Object r4 = r1.next()     // Catch: java.lang.Throwable -> Ld3
            java.util.Map$Entry r4 = (java.util.Map.Entry) r4     // Catch: java.lang.Throwable -> Ld3
            java.lang.Object r5 = r4.getKey()     // Catch: java.lang.Throwable -> Ld3
            java.lang.String r5 = (java.lang.String) r5     // Catch: java.lang.Throwable -> Ld3
            java.lang.Object r4 = r4.getValue()     // Catch: java.lang.Throwable -> Ld3
            y5.d$b r4 = (y5.d.b) r4     // Catch: java.lang.Throwable -> Ld3
            y5.d$a r7 = y5.d.a.MTML_APP_EVENT_PREDICTION     // Catch: java.lang.Throwable -> Ld3
            java.lang.String r7 = r7.c()     // Catch: java.lang.Throwable -> Ld3
            boolean r7 = gm.l.a(r5, r7)     // Catch: java.lang.Throwable -> Ld3
            if (r7 == 0) goto L90
            java.lang.String r6 = r4.f31155b     // Catch: java.lang.Throwable -> Ld3
            int r7 = r4.f31157d     // Catch: java.lang.Throwable -> Ld3
            int r8 = java.lang.Math.max(r8, r7)     // Catch: java.lang.Throwable -> Ld3
            d6.s r7 = d6.s.f12755a     // Catch: java.lang.Throwable -> Ld3
            d6.s$b r7 = d6.s.b.SuggestedEvents     // Catch: java.lang.Throwable -> Ld3
            boolean r7 = d6.s.c(r7)     // Catch: java.lang.Throwable -> Ld3
            if (r7 == 0) goto L90
            boolean r7 = i6.a.b(r10)     // Catch: java.lang.Throwable -> Ld3
            if (r7 == 0) goto L57
            goto L83
        L57:
            d6.m0 r7 = d6.m0.f12709a     // Catch: java.lang.Throwable -> L68
            android.content.Context r7 = o5.v.a()     // Catch: java.lang.Throwable -> L68 java.lang.Exception -> L6a
            android.content.res.Resources r7 = r7.getResources()     // Catch: java.lang.Throwable -> L68 java.lang.Exception -> L6a
            android.content.res.Configuration r7 = r7.getConfiguration()     // Catch: java.lang.Throwable -> L68 java.lang.Exception -> L6a
            java.util.Locale r7 = r7.locale     // Catch: java.lang.Throwable -> L68 java.lang.Exception -> L6a
            goto L6b
        L68:
            r7 = move-exception
            goto L80
        L6a:
            r7 = r2
        L6b:
            if (r7 == 0) goto L7e
            java.lang.String r7 = r7.getLanguage()     // Catch: java.lang.Throwable -> L68
            java.lang.String r9 = "locale.language"
            gm.l.e(r7, r9)     // Catch: java.lang.Throwable -> L68
            java.lang.String r9 = "en"
            boolean r7 = om.l.c0(r7, r9, r3)     // Catch: java.lang.Throwable -> L68
            if (r7 == 0) goto L83
        L7e:
            r7 = 1
            goto L84
        L80:
            i6.a.a(r10, r7)     // Catch: java.lang.Throwable -> Ld3
        L83:
            r7 = 0
        L84:
            if (r7 == 0) goto L90
            y5.c r7 = new y5.c     // Catch: java.lang.Throwable -> Ld3
            r7.<init>()     // Catch: java.lang.Throwable -> Ld3
            r4.f31161h = r7     // Catch: java.lang.Throwable -> Ld3
            r0.add(r4)     // Catch: java.lang.Throwable -> Ld3
        L90:
            y5.d$a r7 = y5.d.a.MTML_INTEGRITY_DETECT     // Catch: java.lang.Throwable -> Ld3
            java.lang.String r7 = r7.c()     // Catch: java.lang.Throwable -> Ld3
            boolean r5 = gm.l.a(r5, r7)     // Catch: java.lang.Throwable -> Ld3
            if (r5 == 0) goto L1a
            java.lang.String r6 = r4.f31155b     // Catch: java.lang.Throwable -> Ld3
            int r5 = r4.f31157d     // Catch: java.lang.Throwable -> Ld3
            int r8 = java.lang.Math.max(r8, r5)     // Catch: java.lang.Throwable -> Ld3
            d6.s r5 = d6.s.f12755a     // Catch: java.lang.Throwable -> Ld3
            d6.s$b r5 = d6.s.b.IntelligentIntegrity     // Catch: java.lang.Throwable -> Ld3
            boolean r5 = d6.s.c(r5)     // Catch: java.lang.Throwable -> Ld3
            if (r5 == 0) goto L1a
            p5.b r5 = new p5.b     // Catch: java.lang.Throwable -> Ld3
            r7 = 2
            r5.<init>(r7)     // Catch: java.lang.Throwable -> Ld3
            r4.f31161h = r5     // Catch: java.lang.Throwable -> Ld3
            r0.add(r4)     // Catch: java.lang.Throwable -> Ld3
            goto L1a
        Lbb:
            if (r6 == 0) goto Ld2
            if (r8 <= 0) goto Ld2
            boolean r1 = r0.isEmpty()     // Catch: java.lang.Throwable -> Ld3
            if (r1 != 0) goto Ld2
            y5.d$b r1 = new y5.d$b     // Catch: java.lang.Throwable -> Ld3
            java.lang.String r5 = "MTML"
            r7 = 0
            r9 = 0
            r4 = r1
            r4.<init>(r5, r6, r7, r8, r9)     // Catch: java.lang.Throwable -> Ld3
            y5.d.b.a.c(r1, r0)     // Catch: java.lang.Throwable -> Ld3
        Ld2:
            return
        Ld3:
            r0 = move-exception
            i6.a.a(r10, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: y5.d.b():void");
    }

    public final JSONObject c() {
        if (i6.a.b(this)) {
            return null;
        }
        try {
            Bundle bundle = new Bundle();
            bundle.putString("fields", TextUtils.join(",", new String[]{"use_case", "version_id", "asset_uri", "rules_uri", "thresholds"}));
            String str = y.f22858j;
            y g10 = y.c.g(null, "app/model_asset", null);
            g10.f22864d = bundle;
            JSONObject jSONObject = g10.c().f22703b;
            if (jSONObject == null) {
                return null;
            }
            return e(jSONObject);
        } catch (Throwable th2) {
            i6.a.a(this, th2);
            return null;
        }
    }

    public final JSONObject e(JSONObject jSONObject) {
        if (i6.a.b(this)) {
            return null;
        }
        try {
            JSONObject jSONObject2 = new JSONObject();
            try {
                JSONArray jSONArray = jSONObject.getJSONArray("data");
                int i10 = 0;
                int length = jSONArray.length();
                if (length <= 0) {
                    return jSONObject2;
                }
                while (true) {
                    int i11 = i10 + 1;
                    JSONObject jSONObject3 = jSONArray.getJSONObject(i10);
                    JSONObject jSONObject4 = new JSONObject();
                    jSONObject4.put("version_id", jSONObject3.getString("version_id"));
                    jSONObject4.put("use_case", jSONObject3.getString("use_case"));
                    jSONObject4.put("thresholds", jSONObject3.getJSONArray("thresholds"));
                    jSONObject4.put("asset_uri", jSONObject3.getString("asset_uri"));
                    if (jSONObject3.has("rules_uri")) {
                        jSONObject4.put("rules_uri", jSONObject3.getString("rules_uri"));
                    }
                    jSONObject2.put(jSONObject3.getString("use_case"), jSONObject4);
                    if (i11 >= length) {
                        return jSONObject2;
                    }
                    i10 = i11;
                }
            } catch (JSONException unused) {
                return new JSONObject();
            }
        } catch (Throwable th2) {
            i6.a.a(this, th2);
            return null;
        }
    }

    public final String[] g(y5.a aVar, float[] fArr) {
        if (i6.a.b(this)) {
            return null;
        }
        try {
            int[] iArr = aVar.f31131a;
            int i10 = iArr[0];
            int i11 = iArr[1];
            float[] fArr2 = aVar.f31133c;
            if (i11 != fArr.length) {
                return null;
            }
            j A = h7.a.A(0, i10);
            ArrayList arrayList = new ArrayList(ul.l.B(A, 10));
            i it = A.iterator();
            while (it.f20076c) {
                int nextInt = it.nextInt();
                String str = "none";
                int length = fArr.length;
                int i12 = 0;
                int i13 = 0;
                while (i12 < length) {
                    int i14 = i13 + 1;
                    if (fArr2[(nextInt * i11) + i13] >= fArr[i12]) {
                        str = f31150d.get(i13);
                    }
                    i12++;
                    i13 = i14;
                }
                arrayList.add(str);
            }
            Object[] array = arrayList.toArray(new String[0]);
            if (array != null) {
                return (String[]) array;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
        } catch (Throwable th2) {
            i6.a.a(this, th2);
            return null;
        }
    }

    public final String[] h(y5.a aVar, float[] fArr) {
        if (i6.a.b(this)) {
            return null;
        }
        try {
            int[] iArr = aVar.f31131a;
            int i10 = iArr[0];
            int i11 = iArr[1];
            float[] fArr2 = aVar.f31133c;
            if (i11 != fArr.length) {
                return null;
            }
            j A = h7.a.A(0, i10);
            ArrayList arrayList = new ArrayList(ul.l.B(A, 10));
            i it = A.iterator();
            while (it.f20076c) {
                int nextInt = it.nextInt();
                String str = "other";
                int length = fArr.length;
                int i12 = 0;
                int i13 = 0;
                while (i12 < length) {
                    int i14 = i13 + 1;
                    if (fArr2[(nextInt * i11) + i13] >= fArr[i12]) {
                        str = f31149c.get(i13);
                    }
                    i12++;
                    i13 = i14;
                }
                arrayList.add(str);
            }
            Object[] array = arrayList.toArray(new String[0]);
            if (array != null) {
                return (String[]) array;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
        } catch (Throwable th2) {
            i6.a.a(this, th2);
            return null;
        }
    }
}
