package o5;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class e0 {

    /* renamed from: e */
    public static final /* synthetic */ int f22701e = 0;

    /* renamed from: a */
    public final HttpURLConnection f22702a;

    /* renamed from: b */
    public final JSONObject f22703b;

    /* renamed from: c */
    public final s f22704c;

    /* renamed from: d */
    public final JSONObject f22705d;

    /* loaded from: classes.dex */
    public static final class a {
        public static ArrayList a(List list, HttpURLConnection httpURLConnection, p pVar) {
            gm.l.f(list, "requests");
            ArrayList arrayList = new ArrayList(ul.l.B(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(new e0((y) it.next(), httpURLConnection, new s(pVar)));
            }
            return arrayList;
        }

        /* JADX WARN: Removed duplicated region for block: B:149:0x00df A[Catch: JSONException -> 0x011d, TryCatch #0 {JSONException -> 0x011d, blocks: (B:106:0x0018, B:108:0x001e, B:110:0x0028, B:112:0x002c, B:115:0x0038, B:149:0x00df, B:136:0x007c, B:133:0x0072, B:130:0x0068, B:127:0x0060, B:124:0x0059, B:121:0x004f, B:118:0x0045, B:137:0x0083, B:140:0x0090, B:142:0x0099, B:146:0x00b0, B:156:0x00f9, B:158:0x010b, B:159:0x0111), top: B:201:0x0018 }] */
        /* JADX WARN: Removed duplicated region for block: B:164:0x0121  */
        /* JADX WARN: Removed duplicated region for block: B:186:0x01ba  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public static o5.e0 b(o5.y r23, java.net.HttpURLConnection r24, java.lang.Object r25, java.lang.Object r26) {
            /*
                Method dump skipped, instructions count: 538
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: o5.e0.a.b(o5.y, java.net.HttpURLConnection, java.lang.Object, java.lang.Object):o5.e0");
        }

        /* JADX WARN: Removed duplicated region for block: B:64:0x0071  */
        /* JADX WARN: Removed duplicated region for block: B:80:0x00bb A[LOOP:0: B:68:0x0080->B:80:0x00bb, LOOP_END] */
        /* JADX WARN: Removed duplicated region for block: B:89:0x00bd A[EDGE_INSN: B:89:0x00bd->B:81:0x00bd ?: BREAK  , SYNTHETIC] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public static java.util.ArrayList c(java.io.InputStream r8, java.net.HttpURLConnection r9, o5.d0 r10) {
            /*
                java.lang.String r0 = "requests"
                gm.l.f(r10, r0)
                java.lang.String r8 = d6.m0.L(r8)
                d6.c0$a r0 = d6.c0.f12645d
                o5.g0 r0 = o5.g0.INCLUDE_RAW_RESPONSES
                o5.v.i(r0)
                org.json.JSONTokener r0 = new org.json.JSONTokener
                r0.<init>(r8)
                java.lang.Object r8 = r0.nextValue()
                java.lang.String r0 = "resultObject"
                gm.l.e(r8, r0)
                int r0 = r10.size()
                java.util.ArrayList r1 = new java.util.ArrayList
                r1.<init>(r0)
                r2 = 1
                r3 = 0
                if (r0 != r2) goto L6c
                java.lang.Object r2 = r10.get(r3)
                o5.y r2 = (o5.y) r2
                org.json.JSONObject r4 = new org.json.JSONObject     // Catch: java.io.IOException -> L52 org.json.JSONException -> L5e
                r4.<init>()     // Catch: java.io.IOException -> L52 org.json.JSONException -> L5e
                java.lang.String r5 = "body"
                r4.put(r5, r8)     // Catch: java.io.IOException -> L52 org.json.JSONException -> L5e
                if (r9 != 0) goto L40
                r5 = 200(0xc8, float:2.8E-43)
                goto L44
            L40:
                int r5 = r9.getResponseCode()     // Catch: java.io.IOException -> L52 org.json.JSONException -> L5e
            L44:
                java.lang.String r6 = "code"
                r4.put(r6, r5)     // Catch: java.io.IOException -> L52 org.json.JSONException -> L5e
                org.json.JSONArray r5 = new org.json.JSONArray     // Catch: java.io.IOException -> L52 org.json.JSONException -> L5e
                r5.<init>()     // Catch: java.io.IOException -> L52 org.json.JSONException -> L5e
                r5.put(r4)     // Catch: java.io.IOException -> L52 org.json.JSONException -> L5e
                goto L6d
            L52:
                r4 = move-exception
                o5.e0 r5 = new o5.e0
                o5.s r6 = new o5.s
                r6.<init>(r4)
                r5.<init>(r2, r9, r6)
                goto L69
            L5e:
                r4 = move-exception
                o5.e0 r5 = new o5.e0
                o5.s r6 = new o5.s
                r6.<init>(r4)
                r5.<init>(r2, r9, r6)
            L69:
                r1.add(r5)
            L6c:
                r5 = r8
            L6d:
                boolean r2 = r5 instanceof org.json.JSONArray
                if (r2 == 0) goto Lc5
                r2 = r5
                org.json.JSONArray r2 = (org.json.JSONArray) r2
                int r4 = r2.length()
                if (r4 != r0) goto Lc5
                int r0 = r2.length()
                if (r0 <= 0) goto Lbd
            L80:
                int r2 = r3 + 1
                java.lang.Object r4 = r10.get(r3)
                o5.y r4 = (o5.y) r4
                r6 = r5
                org.json.JSONArray r6 = (org.json.JSONArray) r6     // Catch: o5.p -> L9c org.json.JSONException -> L9e
                java.lang.Object r3 = r6.get(r3)     // Catch: o5.p -> L9c org.json.JSONException -> L9e
                java.lang.String r6 = "obj"
                gm.l.e(r3, r6)     // Catch: o5.p -> L9c org.json.JSONException -> L9e
                o5.e0 r3 = b(r4, r9, r3, r8)     // Catch: o5.p -> L9c org.json.JSONException -> L9e
                r1.add(r3)     // Catch: o5.p -> L9c org.json.JSONException -> L9e
                goto Lb8
            L9c:
                r3 = move-exception
                goto La0
            L9e:
                r3 = move-exception
                goto Lab
            La0:
                o5.e0 r6 = new o5.e0
                o5.s r7 = new o5.s
                r7.<init>(r3)
                r6.<init>(r4, r9, r7)
                goto Lb5
            Lab:
                o5.e0 r6 = new o5.e0
                o5.s r7 = new o5.s
                r7.<init>(r3)
                r6.<init>(r4, r9, r7)
            Lb5:
                r1.add(r6)
            Lb8:
                if (r2 < r0) goto Lbb
                goto Lbd
            Lbb:
                r3 = r2
                goto L80
            Lbd:
                d6.c0$a r8 = d6.c0.f12645d
                o5.g0 r8 = o5.g0.REQUESTS
                o5.v.i(r8)
                return r1
            Lc5:
                o5.p r8 = new o5.p
                java.lang.String r9 = "Unexpected number of results"
                r8.<init>(r9)
                throw r8
            */
            throw new UnsupportedOperationException("Method not decompiled: o5.e0.a.c(java.io.InputStream, java.net.HttpURLConnection, o5.d0):java.util.ArrayList");
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public e0(y yVar, HttpURLConnection httpURLConnection, String str, JSONObject jSONObject) {
        this(yVar, httpURLConnection, jSONObject, null, null);
        gm.l.f(yVar, "request");
        gm.l.f(str, "rawResponse");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public e0(y yVar, HttpURLConnection httpURLConnection, s sVar) {
        this(yVar, httpURLConnection, null, null, sVar);
        gm.l.f(yVar, "request");
    }

    public e0(y yVar, HttpURLConnection httpURLConnection, JSONObject jSONObject, JSONArray jSONArray, s sVar) {
        gm.l.f(yVar, "request");
        this.f22702a = httpURLConnection;
        this.f22703b = jSONObject;
        this.f22704c = sVar;
        this.f22705d = jSONObject;
    }

    public final String toString() {
        String str;
        try {
            Locale locale = Locale.US;
            Object[] objArr = new Object[1];
            HttpURLConnection httpURLConnection = this.f22702a;
            objArr[0] = Integer.valueOf(httpURLConnection == null ? 200 : httpURLConnection.getResponseCode());
            str = String.format(locale, "%d", Arrays.copyOf(objArr, 1));
            gm.l.e(str, "java.lang.String.format(locale, format, *args)");
        } catch (IOException unused) {
            str = "unknown";
        }
        String str2 = "{Response:  responseCode: " + str + ", graphObject: " + this.f22703b + ", error: " + this.f22704c + "}";
        gm.l.e(str2, "StringBuilder()\n        .append(\"{Response: \")\n        .append(\" responseCode: \")\n        .append(responseCode)\n        .append(\", graphObject: \")\n        .append(graphObject)\n        .append(\", error: \")\n        .append(error)\n        .append(\"}\")\n        .toString()");
        return str2;
    }
}
