package b6;

import android.util.Patterns;
import cn.sharesdk.framework.InnerShareParams;
import gm.l;
import java.io.File;
import java.io.FileInputStream;
import java.util.Map;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import ul.z;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a */
    public static final a f3999a = new a();

    /* renamed from: b */
    public static Map<String, String> f4000b;

    /* renamed from: c */
    public static Map<String, String> f4001c;

    /* renamed from: d */
    public static Map<String, String> f4002d;

    /* renamed from: e */
    public static JSONObject f4003e;

    /* renamed from: f */
    public static boolean f4004f;

    public static final float[] a(String str, JSONObject jSONObject) {
        String lowerCase;
        JSONObject jSONObject2;
        String optString;
        JSONArray jSONArray;
        a aVar;
        JSONObject b10;
        if (i6.a.b(a.class)) {
            return null;
        }
        try {
            if (f4004f) {
                float[] fArr = new float[30];
                for (int i10 = 0; i10 < 30; i10++) {
                    fArr[i10] = 0.0f;
                }
                try {
                    lowerCase = str.toLowerCase();
                    l.e(lowerCase, "(this as java.lang.String).toLowerCase()");
                    jSONObject2 = new JSONObject(jSONObject.optJSONObject("view").toString());
                    optString = jSONObject.optString("screenname");
                    jSONArray = new JSONArray();
                    aVar = f3999a;
                    aVar.h(jSONArray, jSONObject2);
                    aVar.k(fArr, aVar.g(jSONObject2));
                    b10 = aVar.b(jSONObject2);
                } catch (JSONException unused) {
                }
                if (b10 == null) {
                    return null;
                }
                l.e(optString, "screenName");
                String jSONObject3 = jSONObject2.toString();
                l.e(jSONObject3, "viewTree.toString()");
                aVar.k(fArr, aVar.f(b10, jSONArray, optString, jSONObject3, lowerCase));
                return fArr;
            }
            return null;
        } catch (Throwable th2) {
            i6.a.a(a.class, th2);
            return null;
        }
    }

    public static final String c(String str, String str2, String str3) {
        if (i6.a.b(a.class)) {
            return null;
        }
        try {
            l.f(str2, "activityName");
            String str4 = str3 + " | " + str2 + ", " + str;
            if (str4 != null) {
                String lowerCase = str4.toLowerCase();
                l.e(lowerCase, "(this as java.lang.String).toLowerCase()");
                return lowerCase;
            }
            throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
        } catch (Throwable th2) {
            i6.a.a(a.class, th2);
            return null;
        }
    }

    public static final void d(File file) {
        if (i6.a.b(a.class)) {
            return;
        }
        try {
            try {
                f4003e = new JSONObject();
                FileInputStream fileInputStream = new FileInputStream(file);
                byte[] bArr = new byte[fileInputStream.available()];
                fileInputStream.read(bArr);
                fileInputStream.close();
                f4003e = new JSONObject(new String(bArr, om.a.f23623a));
                f4000b = z.D(new tl.f("ENGLISH", "1"), new tl.f("GERMAN", "2"), new tl.f("SPANISH", "3"), new tl.f("JAPANESE", "4"));
                f4001c = z.D(new tl.f("VIEW_CONTENT", "0"), new tl.f("SEARCH", "1"), new tl.f("ADD_TO_CART", "2"), new tl.f("ADD_TO_WISHLIST", "3"), new tl.f("INITIATE_CHECKOUT", "4"), new tl.f("ADD_PAYMENT_INFO", "5"), new tl.f("PURCHASE", "6"), new tl.f("LEAD", "7"), new tl.f("COMPLETE_REGISTRATION", "8"));
                f4002d = z.D(new tl.f("BUTTON_TEXT", "1"), new tl.f("PAGE_TITLE", "2"), new tl.f("RESOLVED_DOCUMENT_LINK", "3"), new tl.f("BUTTON_ID", "4"));
                f4004f = true;
            } catch (Exception unused) {
            }
        } catch (Throwable th2) {
            i6.a.a(a.class, th2);
        }
    }

    public final JSONObject b(JSONObject jSONObject) {
        if (i6.a.b(this)) {
            return null;
        }
        try {
        } catch (JSONException unused) {
        } catch (Throwable th2) {
            i6.a.a(this, th2);
        }
        if (jSONObject.optBoolean("is_interacted")) {
            return jSONObject;
        }
        JSONArray optJSONArray = jSONObject.optJSONArray("childviews");
        if (optJSONArray == null) {
            return null;
        }
        int i10 = 0;
        int length = optJSONArray.length();
        if (length > 0) {
            while (true) {
                int i11 = i10 + 1;
                JSONObject jSONObject2 = optJSONArray.getJSONObject(i10);
                l.e(jSONObject2, "children.getJSONObject(i)");
                JSONObject b10 = b(jSONObject2);
                if (b10 != null) {
                    return b10;
                }
                if (i11 >= length) {
                    break;
                }
                i10 = i11;
            }
        }
        return null;
    }

    public final boolean e(String[] strArr, String[] strArr2) {
        if (i6.a.b(this)) {
            return false;
        }
        try {
            int length = strArr.length;
            int i10 = 0;
            while (i10 < length) {
                String str = strArr[i10];
                i10++;
                int length2 = strArr2.length;
                int i11 = 0;
                while (i11 < length2) {
                    String str2 = strArr2[i11];
                    i11++;
                    if (om.l.c0(str2, str, false)) {
                        return true;
                    }
                }
            }
            return false;
        } catch (Throwable th2) {
            i6.a.a(this, th2);
            return false;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:129:0x0063 A[Catch: JSONException -> 0x0071, all -> 0x0179, TRY_LEAVE, TryCatch #0 {JSONException -> 0x0071, blocks: (B:115:0x0034, B:118:0x003b, B:129:0x0063, B:126:0x005d), top: B:192:0x0034 }] */
    /* JADX WARN: Removed duplicated region for block: B:132:0x006d A[LOOP:1: B:118:0x003b->B:132:0x006d, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:199:0x0071 A[EDGE_INSN: B:199:0x0071->B:133:0x0071 ?: BREAK  , SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final float[] f(org.json.JSONObject r17, org.json.JSONArray r18, java.lang.String r19, java.lang.String r20, java.lang.String r21) {
        /*
            Method dump skipped, instructions count: 383
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: b6.a.f(org.json.JSONObject, org.json.JSONArray, java.lang.String, java.lang.String, java.lang.String):float[]");
    }

    public final float[] g(JSONObject jSONObject) {
        if (i6.a.b(this)) {
            return null;
        }
        try {
            float[] fArr = new float[30];
            int i10 = 0;
            for (int i11 = 0; i11 < 30; i11++) {
                fArr[i11] = 0.0f;
            }
            String optString = jSONObject.optString(InnerShareParams.TEXT);
            l.e(optString, "node.optString(TEXT_KEY)");
            String lowerCase = optString.toLowerCase();
            l.e(lowerCase, "(this as java.lang.String).toLowerCase()");
            String optString2 = jSONObject.optString("hint");
            l.e(optString2, "node.optString(HINT_KEY)");
            String lowerCase2 = optString2.toLowerCase();
            l.e(lowerCase2, "(this as java.lang.String).toLowerCase()");
            String optString3 = jSONObject.optString("classname");
            l.e(optString3, "node.optString(CLASS_NAME_KEY)");
            String lowerCase3 = optString3.toLowerCase();
            l.e(lowerCase3, "(this as java.lang.String).toLowerCase()");
            int optInt = jSONObject.optInt("inputtype", -1);
            String[] strArr = {lowerCase, lowerCase2};
            if (e(new String[]{"$", "amount", "price", "total"}, strArr)) {
                fArr[0] = fArr[0] + 1.0f;
            }
            if (e(new String[]{"password", "pwd"}, strArr)) {
                fArr[1] = fArr[1] + 1.0f;
            }
            if (e(new String[]{"tel", "phone"}, strArr)) {
                fArr[2] = fArr[2] + 1.0f;
            }
            if (e(new String[]{"search"}, strArr)) {
                fArr[4] = fArr[4] + 1.0f;
            }
            if (optInt >= 0) {
                fArr[5] = fArr[5] + 1.0f;
            }
            if (optInt == 3 || optInt == 2) {
                fArr[6] = fArr[6] + 1.0f;
            }
            if (optInt == 32 || Patterns.EMAIL_ADDRESS.matcher(lowerCase).matches()) {
                fArr[7] = fArr[7] + 1.0f;
            }
            if (om.l.c0(lowerCase3, "checkbox", false)) {
                fArr[8] = fArr[8] + 1.0f;
            }
            if (e(new String[]{"complete", "confirm", "done", "submit"}, new String[]{lowerCase})) {
                fArr[10] = fArr[10] + 1.0f;
            }
            if (om.l.c0(lowerCase3, "radio", false) && om.l.c0(lowerCase3, "button", false)) {
                fArr[12] = fArr[12] + 1.0f;
            }
            try {
                JSONArray optJSONArray = jSONObject.optJSONArray("childviews");
                int length = optJSONArray.length();
                if (length > 0) {
                    while (true) {
                        int i12 = i10 + 1;
                        JSONObject jSONObject2 = optJSONArray.getJSONObject(i10);
                        l.e(jSONObject2, "childViews.getJSONObject(i)");
                        k(fArr, g(jSONObject2));
                        if (i12 >= length) {
                            break;
                        }
                        i10 = i12;
                    }
                }
            } catch (JSONException unused) {
            }
            return fArr;
        } catch (Throwable th2) {
            i6.a.a(this, th2);
            return null;
        }
    }

    public final boolean h(JSONArray jSONArray, JSONObject jSONObject) {
        boolean z10;
        boolean z11;
        if (i6.a.b(this)) {
            return false;
        }
        try {
            if (jSONObject.optBoolean("is_interacted")) {
                return true;
            }
            JSONArray optJSONArray = jSONObject.optJSONArray("childviews");
            int length = optJSONArray.length();
            if (length > 0) {
                int i10 = 0;
                while (true) {
                    int i11 = i10 + 1;
                    if (optJSONArray.getJSONObject(i10).optBoolean("is_interacted")) {
                        z10 = true;
                        z11 = true;
                        break;
                    } else if (i11 >= length) {
                        break;
                    } else {
                        i10 = i11;
                    }
                }
            }
            z10 = false;
            z11 = false;
            JSONArray jSONArray2 = new JSONArray();
            if (z10) {
                int length2 = optJSONArray.length();
                if (length2 > 0) {
                    int i12 = 0;
                    while (true) {
                        int i13 = i12 + 1;
                        jSONArray.put(optJSONArray.getJSONObject(i12));
                        if (i13 >= length2) {
                            break;
                        }
                        i12 = i13;
                    }
                }
            } else {
                int length3 = optJSONArray.length();
                if (length3 > 0) {
                    int i14 = 0;
                    while (true) {
                        int i15 = i14 + 1;
                        JSONObject jSONObject2 = optJSONArray.getJSONObject(i14);
                        l.e(jSONObject2, "child");
                        if (h(jSONArray, jSONObject2)) {
                            jSONArray2.put(jSONObject2);
                            z11 = true;
                        }
                        if (i15 >= length3) {
                            break;
                        }
                        i14 = i15;
                    }
                }
                jSONObject.put("childviews", jSONArray2);
            }
            return z11;
        } catch (JSONException unused) {
            return false;
        } catch (Throwable th2) {
            i6.a.a(this, th2);
            return false;
        }
    }

    public final boolean i(String str, String str2) {
        if (i6.a.b(this)) {
            return false;
        }
        try {
            return Pattern.compile(str).matcher(str2).find();
        } catch (Throwable th2) {
            i6.a.a(this, th2);
            return false;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:74:0x0052 A[Catch: all -> 0x007c, TryCatch #0 {all -> 0x007c, blocks: (B:51:0x000a, B:53:0x000f, B:77:0x005f, B:69:0x0045, B:72:0x004e, B:74:0x0052, B:79:0x0064, B:80:0x0069, B:61:0x002a, B:64:0x0034, B:66:0x0038, B:81:0x006a, B:82:0x006f, B:56:0x0019, B:58:0x001d, B:83:0x0070, B:84:0x0075, B:85:0x0076, B:86:0x007b), top: B:90:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x005f A[Catch: all -> 0x007c, TryCatch #0 {all -> 0x007c, blocks: (B:51:0x000a, B:53:0x000f, B:77:0x005f, B:69:0x0045, B:72:0x004e, B:74:0x0052, B:79:0x0064, B:80:0x0069, B:61:0x002a, B:64:0x0034, B:66:0x0038, B:81:0x006a, B:82:0x006f, B:56:0x0019, B:58:0x001d, B:83:0x0070, B:84:0x0075, B:85:0x0076, B:86:0x007b), top: B:90:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0064 A[Catch: all -> 0x007c, TryCatch #0 {all -> 0x007c, blocks: (B:51:0x000a, B:53:0x000f, B:77:0x005f, B:69:0x0045, B:72:0x004e, B:74:0x0052, B:79:0x0064, B:80:0x0069, B:61:0x002a, B:64:0x0034, B:66:0x0038, B:81:0x006a, B:82:0x006f, B:56:0x0019, B:58:0x001d, B:83:0x0070, B:84:0x0075, B:85:0x0076, B:86:0x007b), top: B:90:0x000a }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean j(java.lang.String r6, java.lang.String r7, java.lang.String r8) {
        /*
            r5 = this;
            java.lang.String r0 = "ENGLISH"
            boolean r1 = i6.a.b(r5)
            r2 = 0
            if (r1 == 0) goto La
            return r2
        La:
            org.json.JSONObject r1 = b6.a.f4003e     // Catch: java.lang.Throwable -> L7c
            r3 = 0
            if (r1 == 0) goto L76
            java.lang.String r4 = "rulesForLanguage"
            org.json.JSONObject r1 = r1.optJSONObject(r4)     // Catch: java.lang.Throwable -> L7c
            if (r1 != 0) goto L19
            r0 = r3
            goto L27
        L19:
            java.util.Map<java.lang.String, java.lang.String> r4 = b6.a.f4000b     // Catch: java.lang.Throwable -> L7c
            if (r4 == 0) goto L70
            java.lang.Object r0 = r4.get(r0)     // Catch: java.lang.Throwable -> L7c
            java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.Throwable -> L7c
            org.json.JSONObject r0 = r1.optJSONObject(r0)     // Catch: java.lang.Throwable -> L7c
        L27:
            if (r0 != 0) goto L2a
            goto L32
        L2a:
            java.lang.String r1 = "rulesForEvent"
            org.json.JSONObject r0 = r0.optJSONObject(r1)     // Catch: java.lang.Throwable -> L7c
            if (r0 != 0) goto L34
        L32:
            r6 = r3
            goto L42
        L34:
            java.util.Map<java.lang.String, java.lang.String> r1 = b6.a.f4001c     // Catch: java.lang.Throwable -> L7c
            if (r1 == 0) goto L6a
            java.lang.Object r6 = r1.get(r6)     // Catch: java.lang.Throwable -> L7c
            java.lang.String r6 = (java.lang.String) r6     // Catch: java.lang.Throwable -> L7c
            org.json.JSONObject r6 = r0.optJSONObject(r6)     // Catch: java.lang.Throwable -> L7c
        L42:
            if (r6 != 0) goto L45
            goto L5c
        L45:
            java.lang.String r0 = "positiveRules"
            org.json.JSONObject r6 = r6.optJSONObject(r0)     // Catch: java.lang.Throwable -> L7c
            if (r6 != 0) goto L4e
            goto L5c
        L4e:
            java.util.Map<java.lang.String, java.lang.String> r0 = b6.a.f4002d     // Catch: java.lang.Throwable -> L7c
            if (r0 == 0) goto L64
            java.lang.Object r7 = r0.get(r7)     // Catch: java.lang.Throwable -> L7c
            java.lang.String r7 = (java.lang.String) r7     // Catch: java.lang.Throwable -> L7c
            java.lang.String r3 = r6.optString(r7)     // Catch: java.lang.Throwable -> L7c
        L5c:
            if (r3 != 0) goto L5f
            goto L63
        L5f:
            boolean r2 = r5.i(r3, r8)     // Catch: java.lang.Throwable -> L7c
        L63:
            return r2
        L64:
            java.lang.String r6 = "textTypeInfo"
            gm.l.l(r6)     // Catch: java.lang.Throwable -> L7c
            throw r3     // Catch: java.lang.Throwable -> L7c
        L6a:
            java.lang.String r6 = "eventInfo"
            gm.l.l(r6)     // Catch: java.lang.Throwable -> L7c
            throw r3     // Catch: java.lang.Throwable -> L7c
        L70:
            java.lang.String r6 = "languageInfo"
            gm.l.l(r6)     // Catch: java.lang.Throwable -> L7c
            throw r3     // Catch: java.lang.Throwable -> L7c
        L76:
            java.lang.String r6 = "rules"
            gm.l.l(r6)     // Catch: java.lang.Throwable -> L7c
            throw r3     // Catch: java.lang.Throwable -> L7c
        L7c:
            r6 = move-exception
            i6.a.a(r5, r6)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: b6.a.j(java.lang.String, java.lang.String, java.lang.String):boolean");
    }

    public final void k(float[] fArr, float[] fArr2) {
        if (i6.a.b(this)) {
            return;
        }
        int i10 = 0;
        try {
            int length = fArr.length - 1;
            if (length < 0) {
                return;
            }
            while (true) {
                int i11 = i10 + 1;
                fArr[i10] = fArr[i10] + fArr2[i10];
                if (i11 > length) {
                    return;
                }
                i10 = i11;
            }
        } catch (Throwable th2) {
            i6.a.a(this, th2);
        }
    }

    public final void l(JSONObject jSONObject, StringBuilder sb2, StringBuilder sb3) {
        int length;
        if (i6.a.b(this)) {
            return;
        }
        try {
            String optString = jSONObject.optString(InnerShareParams.TEXT, "");
            l.e(optString, "view.optString(TEXT_KEY, \"\")");
            String lowerCase = optString.toLowerCase();
            l.e(lowerCase, "(this as java.lang.String).toLowerCase()");
            String optString2 = jSONObject.optString("hint", "");
            l.e(optString2, "view.optString(HINT_KEY, \"\")");
            String lowerCase2 = optString2.toLowerCase();
            l.e(lowerCase2, "(this as java.lang.String).toLowerCase()");
            int i10 = 0;
            boolean z10 = true;
            if (lowerCase.length() > 0) {
                sb2.append(lowerCase);
                sb2.append(" ");
            }
            if (lowerCase2.length() <= 0) {
                z10 = false;
            }
            if (z10) {
                sb3.append(lowerCase2);
                sb3.append(" ");
            }
            JSONArray optJSONArray = jSONObject.optJSONArray("childviews");
            if (optJSONArray == null || (length = optJSONArray.length()) <= 0) {
                return;
            }
            while (true) {
                int i11 = i10 + 1;
                try {
                    JSONObject jSONObject2 = optJSONArray.getJSONObject(i10);
                    l.e(jSONObject2, "currentChildView");
                    l(jSONObject2, sb2, sb3);
                } catch (JSONException unused) {
                }
                if (i11 >= length) {
                    return;
                }
                i10 = i11;
            }
        } catch (Throwable th2) {
            i6.a.a(this, th2);
        }
    }
}
