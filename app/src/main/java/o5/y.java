package o5;

import android.database.Cursor;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Pair;
import androidx.fragment.app.i1;
import cn.sharesdk.framework.InnerShareParams;
import com.huawei.hms.framework.common.ContainerUtils;
import com.sina.weibo.sdk.auth.Oauth2AccessToken;
import d6.c0;
import java.io.BufferedOutputStream;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;
import java.nio.charset.Charset;
import java.security.SecureRandom;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.regex.Pattern;
import java.util.zip.GZIPOutputStream;
import o5.d0;
import o5.e0;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class y {

    /* renamed from: j */
    public static final String f22858j;

    /* renamed from: k */
    public static final Pattern f22859k;

    /* renamed from: l */
    public static volatile String f22860l;

    /* renamed from: a */
    public o5.a f22861a;

    /* renamed from: b */
    public String f22862b;

    /* renamed from: c */
    public JSONObject f22863c;

    /* renamed from: d */
    public Bundle f22864d;

    /* renamed from: e */
    public Object f22865e;

    /* renamed from: f */
    public String f22866f;

    /* renamed from: g */
    public b f22867g;

    /* renamed from: h */
    public f0 f22868h;

    /* renamed from: i */
    public boolean f22869i;

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a */
        public final y f22870a;

        /* renamed from: b */
        public final Object f22871b;

        public a(y yVar, Object obj) {
            this.f22870a = yVar;
            this.f22871b = obj;
        }
    }

    /* loaded from: classes.dex */
    public interface b {
        void b(e0 e0Var);
    }

    /* loaded from: classes.dex */
    public static final class c {
        public static final String a(Object obj) {
            String str = y.f22858j;
            if (obj instanceof String) {
                return (String) obj;
            }
            if (!(obj instanceof Boolean) && !(obj instanceof Number)) {
                if (obj instanceof Date) {
                    String format = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssZ", Locale.US).format((Date) obj);
                    gm.l.e(format, "iso8601DateFormat.format(value)");
                    return format;
                }
                throw new IllegalArgumentException("Unsupported parameter type.");
            }
            return obj.toString();
        }

        public static HttpURLConnection b(URL url) {
            URLConnection openConnection = url.openConnection();
            if (openConnection != null) {
                HttpURLConnection httpURLConnection = (HttpURLConnection) openConnection;
                if (y.f22860l == null) {
                    y.f22860l = i1.d(new Object[]{"FBAndroidSDK", "14.1.0"}, 2, "%s.%s", "java.lang.String.format(format, *args)");
                    if (!d6.m0.A(null)) {
                        y.f22860l = a0.a(new Object[]{y.f22860l, null}, 2, Locale.ROOT, "%s/%s", "java.lang.String.format(locale, format, *args)");
                    }
                }
                httpURLConnection.setRequestProperty("User-Agent", y.f22860l);
                httpURLConnection.setRequestProperty("Accept-Language", Locale.getDefault().toString());
                httpURLConnection.setChunkedStreamingMode(0);
                return httpURLConnection;
            }
            throw new NullPointerException("null cannot be cast to non-null type java.net.HttpURLConnection");
        }

        public static ArrayList c(d0 d0Var) {
            Exception exc;
            HttpURLConnection httpURLConnection;
            ArrayList arrayList;
            d6.n0.e(d0Var);
            HttpURLConnection httpURLConnection2 = null;
            try {
                httpURLConnection = p(d0Var);
                exc = null;
            } catch (Exception e10) {
                exc = e10;
                httpURLConnection = null;
            } catch (Throwable th2) {
                th = th2;
                d6.m0.k(httpURLConnection2);
                throw th;
            }
            try {
                if (httpURLConnection != null) {
                    arrayList = d(d0Var, httpURLConnection);
                } else {
                    int i10 = e0.f22701e;
                    ArrayList a10 = e0.a.a(d0Var.f22692c, null, new p(exc));
                    m(d0Var, a10);
                    arrayList = a10;
                }
                d6.m0.k(httpURLConnection);
                return arrayList;
            } catch (Throwable th3) {
                th = th3;
                httpURLConnection2 = httpURLConnection;
                d6.m0.k(httpURLConnection2);
                throw th;
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:81:0x006f  */
        /* JADX WARN: Removed duplicated region for block: B:98:0x00d3  */
        /* JADX WARN: Type inference failed for: r2v8, types: [int] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public static java.util.ArrayList d(o5.d0 r10, java.net.HttpURLConnection r11) {
            /*
                Method dump skipped, instructions count: 252
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: o5.y.c.d(o5.d0, java.net.HttpURLConnection):java.util.ArrayList");
        }

        public static boolean e(Object obj) {
            return (obj instanceof Bitmap) || (obj instanceof byte[]) || (obj instanceof Uri) || (obj instanceof ParcelFileDescriptor) || (obj instanceof g);
        }

        public static boolean f(Object obj) {
            return (obj instanceof String) || (obj instanceof Boolean) || (obj instanceof Number) || (obj instanceof Date);
        }

        public static y g(o5.a aVar, String str, b bVar) {
            return new y(aVar, str, null, null, bVar, 32);
        }

        public static y h(o5.a aVar, String str, JSONObject jSONObject, b bVar) {
            y yVar = new y(aVar, str, null, f0.POST, bVar, 32);
            yVar.f22863c = jSONObject;
            return yVar;
        }

        public static y i(String str, Bundle bundle, b bVar) {
            return new y(null, str, bundle, f0.POST, bVar, 32);
        }

        /* JADX WARN: Removed duplicated region for block: B:59:0x0051  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public static void j(org.json.JSONObject r7, java.lang.String r8, o5.y.e r9) {
            /*
                java.util.regex.Pattern r0 = o5.y.f22859k
                java.util.regex.Matcher r0 = r0.matcher(r8)
                boolean r1 = r0.matches()
                r2 = 1
                if (r1 == 0) goto L17
                java.lang.String r0 = r0.group(r2)
                java.lang.String r1 = "matcher.group(1)"
                gm.l.e(r0, r1)
                goto L18
            L17:
                r0 = r8
            L18:
                java.lang.String r1 = "me/"
                r3 = 0
                boolean r1 = om.h.a0(r0, r1, r3)
                if (r1 != 0) goto L2c
                java.lang.String r1 = "/me/"
                boolean r0 = om.h.a0(r0, r1, r3)
                if (r0 == 0) goto L2a
                goto L2c
            L2a:
                r0 = 0
                goto L2d
            L2c:
                r0 = 1
            L2d:
                if (r0 == 0) goto L46
                r0 = 6
                java.lang.String r1 = ":"
                int r1 = om.l.h0(r8, r1, r3, r3, r0)
                java.lang.String r4 = "?"
                int r8 = om.l.h0(r8, r4, r3, r3, r0)
                r0 = 3
                if (r1 <= r0) goto L46
                r0 = -1
                if (r8 == r0) goto L44
                if (r1 >= r8) goto L46
            L44:
                r8 = 1
                goto L47
            L46:
                r8 = 0
            L47:
                java.util.Iterator r0 = r7.keys()
            L4b:
                boolean r1 = r0.hasNext()
                if (r1 == 0) goto L76
                java.lang.Object r1 = r0.next()
                java.lang.String r1 = (java.lang.String) r1
                java.lang.Object r4 = r7.opt(r1)
                if (r8 == 0) goto L67
                java.lang.String r5 = "image"
                boolean r5 = om.h.V(r1, r5)
                if (r5 == 0) goto L67
                r5 = 1
                goto L68
            L67:
                r5 = 0
            L68:
                java.lang.String r6 = "key"
                gm.l.e(r1, r6)
                java.lang.String r6 = "value"
                gm.l.e(r4, r6)
                k(r1, r4, r9, r5)
                goto L4b
            L76:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: o5.y.c.j(org.json.JSONObject, java.lang.String, o5.y$e):void");
        }

        public static void k(String str, Object obj, e eVar, boolean z10) {
            String obj2;
            String jSONObject;
            String str2;
            Class<?> cls = obj.getClass();
            if (JSONObject.class.isAssignableFrom(cls)) {
                JSONObject jSONObject2 = (JSONObject) obj;
                if (z10) {
                    Iterator<String> keys = jSONObject2.keys();
                    while (keys.hasNext()) {
                        String next = keys.next();
                        String d10 = i1.d(new Object[]{str, next}, 2, "%s[%s]", "java.lang.String.format(format, *args)");
                        Object opt = jSONObject2.opt(next);
                        gm.l.e(opt, "jsonObject.opt(propertyName)");
                        k(d10, opt, eVar, z10);
                    }
                    return;
                }
                if (jSONObject2.has("id")) {
                    jSONObject = jSONObject2.optString("id");
                    str2 = "jsonObject.optString(\"id\")";
                } else if (jSONObject2.has(InnerShareParams.URL)) {
                    jSONObject = jSONObject2.optString(InnerShareParams.URL);
                    str2 = "jsonObject.optString(\"url\")";
                } else if (jSONObject2.has("fbsdk:create_object")) {
                    jSONObject = jSONObject2.toString();
                    str2 = "jsonObject.toString()";
                } else {
                    return;
                }
                gm.l.e(jSONObject, str2);
                k(str, jSONObject, eVar, z10);
            } else if (JSONArray.class.isAssignableFrom(cls)) {
                JSONArray jSONArray = (JSONArray) obj;
                int length = jSONArray.length();
                if (length > 0) {
                    int i10 = 0;
                    while (true) {
                        int i11 = i10 + 1;
                        String a10 = a0.a(new Object[]{str, Integer.valueOf(i10)}, 2, Locale.ROOT, "%s[%d]", "java.lang.String.format(locale, format, *args)");
                        Object opt2 = jSONArray.opt(i10);
                        gm.l.e(opt2, "jsonArray.opt(i)");
                        k(a10, opt2, eVar, z10);
                        if (i11 < length) {
                            i10 = i11;
                        } else {
                            return;
                        }
                    }
                }
            } else {
                if (!String.class.isAssignableFrom(cls) && !Number.class.isAssignableFrom(cls) && !Boolean.class.isAssignableFrom(cls)) {
                    if (Date.class.isAssignableFrom(cls)) {
                        obj2 = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssZ", Locale.US).format((Date) obj);
                        gm.l.e(obj2, "iso8601DateFormat.format(date)");
                    } else {
                        d6.m0 m0Var = d6.m0.f12709a;
                        String str3 = y.f22858j;
                        v vVar = v.f22837a;
                        return;
                    }
                } else {
                    obj2 = obj.toString();
                }
                eVar.a(str, obj2);
            }
        }

        /* JADX WARN: Type inference failed for: r3v1 */
        /* JADX WARN: Type inference failed for: r3v7 */
        public static void l(d0 d0Var, d6.c0 c0Var, int i10, URL url, OutputStream outputStream, boolean z10) {
            String b10;
            boolean z11;
            h hVar = new h(outputStream, c0Var, z10);
            int i11 = 1;
            if (i10 == 1) {
                y yVar = (y) d0Var.f22692c.get(0);
                HashMap hashMap = new HashMap();
                for (String str : yVar.f22864d.keySet()) {
                    Object obj = yVar.f22864d.get(str);
                    if (e(obj)) {
                        gm.l.e(str, "key");
                        hashMap.put(str, new a(yVar, obj));
                    }
                }
                if (c0Var != null) {
                    c0Var.c();
                }
                Bundle bundle = yVar.f22864d;
                for (String str2 : bundle.keySet()) {
                    Object obj2 = bundle.get(str2);
                    if (f(obj2)) {
                        gm.l.e(str2, "key");
                        hVar.g(str2, obj2, yVar);
                    }
                }
                if (c0Var != null) {
                    c0Var.c();
                }
                n(hashMap, hVar);
                JSONObject jSONObject = yVar.f22863c;
                if (jSONObject != null) {
                    String path = url.getPath();
                    gm.l.e(path, "url.path");
                    j(jSONObject, path, hVar);
                    return;
                }
                return;
            }
            Iterator<y> it = d0Var.iterator();
            while (true) {
                if (it.hasNext()) {
                    o5.a aVar = it.next().f22861a;
                    if (aVar != null) {
                        b10 = aVar.f22674h;
                        break;
                    }
                } else {
                    String str3 = y.f22858j;
                    b10 = v.b();
                    break;
                }
            }
            if (b10.length() == 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (!z11) {
                hVar.a("batch_app_id", b10);
                HashMap hashMap2 = new HashMap();
                JSONArray jSONArray = new JSONArray();
                Iterator<y> it2 = d0Var.iterator();
                while (it2.hasNext()) {
                    y next = it2.next();
                    next.getClass();
                    JSONObject jSONObject2 = new JSONObject();
                    int i12 = d6.i0.f12694a;
                    Object[] objArr = new Object[i11];
                    objArr[0] = v.e();
                    String format = String.format("https://graph.%s", Arrays.copyOf(objArr, i11));
                    gm.l.e(format, "java.lang.String.format(format, *args)");
                    String h10 = next.h(format);
                    next.a();
                    Uri parse = Uri.parse(next.b(h10, i11));
                    int i13 = 2;
                    Object[] objArr2 = new Object[2];
                    objArr2[0] = parse.getPath();
                    objArr2[i11] = parse.getQuery();
                    String format2 = String.format("%s?%s", Arrays.copyOf(objArr2, 2));
                    gm.l.e(format2, "java.lang.String.format(format, *args)");
                    jSONObject2.put("relative_url", format2);
                    jSONObject2.put("method", next.f22868h);
                    o5.a aVar2 = next.f22861a;
                    if (aVar2 != null) {
                        d6.c0.f12645d.c(aVar2.f22671e);
                    }
                    ArrayList arrayList = new ArrayList();
                    for (String str4 : next.f22864d.keySet()) {
                        Object obj3 = next.f22864d.get(str4);
                        String str5 = y.f22858j;
                        if (e(obj3)) {
                            Locale locale = Locale.ROOT;
                            Object[] objArr3 = new Object[i13];
                            objArr3[0] = "file";
                            objArr3[1] = Integer.valueOf(hashMap2.size());
                            String format3 = String.format(locale, "%s%d", Arrays.copyOf(objArr3, i13));
                            gm.l.e(format3, "java.lang.String.format(locale, format, *args)");
                            arrayList.add(format3);
                            hashMap2.put(format3, new a(next, obj3));
                            i13 = 2;
                        }
                    }
                    if (!arrayList.isEmpty()) {
                        jSONObject2.put("attached_files", TextUtils.join(",", arrayList));
                    }
                    JSONObject jSONObject3 = next.f22863c;
                    if (jSONObject3 != null) {
                        ArrayList arrayList2 = new ArrayList();
                        String str6 = y.f22858j;
                        j(jSONObject3, format2, new b0(arrayList2));
                        jSONObject2.put("body", TextUtils.join(ContainerUtils.FIELD_DELIMITER, arrayList2));
                    }
                    jSONArray.put(jSONObject2);
                    i11 = 1;
                }
                OutputStream outputStream2 = hVar.f22874a;
                if (!(outputStream2 instanceof m0)) {
                    String jSONArray2 = jSONArray.toString();
                    gm.l.e(jSONArray2, "requestJsonArray.toString()");
                    hVar.a("batch", jSONArray2);
                } else {
                    m0 m0Var = (m0) outputStream2;
                    hVar.c("batch", null, null);
                    hVar.b("[", new Object[0]);
                    Iterator<y> it3 = d0Var.iterator();
                    int i14 = 0;
                    while (it3.hasNext()) {
                        int i15 = i14 + 1;
                        JSONObject jSONObject4 = jSONArray.getJSONObject(i14);
                        m0Var.a(it3.next());
                        if (i14 > 0) {
                            hVar.b(",%s", jSONObject4.toString());
                        } else {
                            hVar.b("%s", jSONObject4.toString());
                        }
                        i14 = i15;
                    }
                    hVar.b("]", new Object[0]);
                    d6.c0 c0Var2 = hVar.f22875b;
                    if (c0Var2 != null) {
                        String k10 = gm.l.k("batch", "    ");
                        String jSONArray3 = jSONArray.toString();
                        gm.l.e(jSONArray3, "requestJsonArray.toString()");
                        c0Var2.a(jSONArray3, k10);
                    }
                }
                if (c0Var != null) {
                    c0Var.c();
                }
                n(hashMap2, hVar);
                return;
            }
            throw new p("App ID was not specified at the request or Settings.");
        }

        public static void m(d0 d0Var, ArrayList arrayList) {
            Boolean valueOf;
            gm.l.f(d0Var, "requests");
            int size = d0Var.size();
            ArrayList arrayList2 = new ArrayList();
            if (size > 0) {
                int i10 = 0;
                while (true) {
                    int i11 = i10 + 1;
                    y yVar = (y) d0Var.f22692c.get(i10);
                    if (yVar.f22867g != null) {
                        arrayList2.add(new Pair(yVar.f22867g, arrayList.get(i10)));
                    }
                    if (i11 >= size) {
                        break;
                    }
                    i10 = i11;
                }
            }
            if (arrayList2.size() > 0) {
                s.u uVar = new s.u(arrayList2, d0Var, 8);
                Handler handler = d0Var.f22690a;
                if (handler == null) {
                    valueOf = null;
                } else {
                    valueOf = Boolean.valueOf(handler.post(uVar));
                }
                if (valueOf == null) {
                    uVar.run();
                }
            }
        }

        public static void n(HashMap hashMap, h hVar) {
            for (Map.Entry entry : hashMap.entrySet()) {
                String str = y.f22858j;
                if (e(((a) entry.getValue()).f22871b)) {
                    hVar.g((String) entry.getKey(), ((a) entry.getValue()).f22871b, ((a) entry.getValue()).f22870a);
                }
            }
        }

        public static void o(d0 d0Var, HttpURLConnection httpURLConnection) {
            boolean z10;
            boolean z11;
            f0 f0Var;
            boolean z12;
            f0 f0Var2 = f0.POST;
            d6.c0 c0Var = new d6.c0();
            int size = d0Var.size();
            Iterator<y> it = d0Var.iterator();
            loop0: while (true) {
                z10 = true;
                if (it.hasNext()) {
                    y next = it.next();
                    for (String str : next.f22864d.keySet()) {
                        if (e(next.f22864d.get(str))) {
                            z11 = false;
                            break loop0;
                        }
                    }
                } else {
                    z11 = true;
                    break;
                }
            }
            FilterOutputStream filterOutputStream = null;
            if (size == 1) {
                f0Var = ((y) d0Var.f22692c.get(0)).f22868h;
            } else {
                f0Var = null;
            }
            if (f0Var == null) {
                f0Var = f0Var2;
            }
            httpURLConnection.setRequestMethod(f0Var.name());
            if (z11) {
                httpURLConnection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
                httpURLConnection.setRequestProperty("Content-Encoding", "gzip");
            } else {
                String format = String.format("multipart/form-data; boundary=%s", Arrays.copyOf(new Object[]{y.f22858j}, 1));
                gm.l.e(format, "java.lang.String.format(format, *args)");
                httpURLConnection.setRequestProperty("Content-Type", format);
            }
            URL url = httpURLConnection.getURL();
            c0Var.c();
            c0Var.a(d0Var.f22691b, "Id");
            gm.l.e(url, InnerShareParams.URL);
            c0Var.a(url, "URL");
            String requestMethod = httpURLConnection.getRequestMethod();
            gm.l.e(requestMethod, "connection.requestMethod");
            c0Var.a(requestMethod, "Method");
            String requestProperty = httpURLConnection.getRequestProperty("User-Agent");
            gm.l.e(requestProperty, "connection.getRequestProperty(\"User-Agent\")");
            c0Var.a(requestProperty, "User-Agent");
            String requestProperty2 = httpURLConnection.getRequestProperty("Content-Type");
            gm.l.e(requestProperty2, "connection.getRequestProperty(\"Content-Type\")");
            c0Var.a(requestProperty2, "Content-Type");
            httpURLConnection.setConnectTimeout(0);
            httpURLConnection.setReadTimeout(0);
            if (f0Var == f0Var2) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (!z12) {
                c0Var.b();
                return;
            }
            httpURLConnection.setDoOutput(true);
            try {
                FilterOutputStream bufferedOutputStream = new BufferedOutputStream(httpURLConnection.getOutputStream());
                if (z11) {
                    try {
                        bufferedOutputStream = new GZIPOutputStream(bufferedOutputStream);
                    } catch (Throwable th2) {
                        th = th2;
                        filterOutputStream = bufferedOutputStream;
                        if (filterOutputStream != null) {
                            filterOutputStream.close();
                        }
                        throw th;
                    }
                }
                Iterator it2 = d0Var.f22693d.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        if (((d0.a) it2.next()) instanceof d0.b) {
                            break;
                        }
                    } else {
                        Iterator<y> it3 = d0Var.iterator();
                        while (true) {
                            if (it3.hasNext()) {
                                if (it3.next().f22867g instanceof f) {
                                    break;
                                }
                            } else {
                                z10 = false;
                                break;
                            }
                        }
                    }
                }
                if (z10) {
                    k0 k0Var = new k0(d0Var.f22690a);
                    l(d0Var, null, size, url, k0Var, z11);
                    bufferedOutputStream = new l0(bufferedOutputStream, d0Var, k0Var.f22783b, k0Var.f22786e);
                }
                l(d0Var, c0Var, size, url, bufferedOutputStream, z11);
                bufferedOutputStream.close();
                c0Var.b();
            } catch (Throwable th3) {
                th = th3;
            }
        }

        public static HttpURLConnection p(d0 d0Var) {
            URL url;
            Iterator<y> it = d0Var.iterator();
            while (it.hasNext()) {
                y next = it.next();
                if (f0.GET == next.f22868h) {
                    d6.m0 m0Var = d6.m0.f12709a;
                    if (d6.m0.A(next.f22864d.getString("fields"))) {
                        c0.a aVar = d6.c0.f12645d;
                        g0 g0Var = g0.DEVELOPER_ERRORS;
                        StringBuilder a10 = android.support.v4.media.d.a("GET requests for /");
                        String str = next.f22862b;
                        if (str == null) {
                            str = "";
                        }
                        a10.append(str);
                        a10.append(" should contain an explicit \"fields\" parameter.");
                        c0.a.b(g0Var, "Request", a10.toString());
                    }
                }
            }
            try {
                if (d0Var.size() == 1) {
                    url = new URL(((y) d0Var.f22692c.get(0)).g());
                } else {
                    int i10 = d6.i0.f12694a;
                    String format = String.format("https://graph.%s", Arrays.copyOf(new Object[]{v.e()}, 1));
                    gm.l.e(format, "java.lang.String.format(format, *args)");
                    url = new URL(format);
                }
                HttpURLConnection httpURLConnection = null;
                try {
                    httpURLConnection = b(url);
                    o(d0Var, httpURLConnection);
                    return httpURLConnection;
                } catch (IOException e10) {
                    d6.m0.k(httpURLConnection);
                    throw new p("could not construct request body", e10);
                } catch (JSONException e11) {
                    d6.m0.k(httpURLConnection);
                    throw new p("could not construct request body", e11);
                }
            } catch (MalformedURLException e12) {
                throw new p("could not construct URL for request", e12);
            }
        }
    }

    /* loaded from: classes.dex */
    public interface d {
        void a();
    }

    /* loaded from: classes.dex */
    public interface e {
        void a(String str, String str2);
    }

    /* loaded from: classes.dex */
    public interface f extends b {
        void a();
    }

    /* loaded from: classes.dex */
    public static final class g<RESOURCE extends Parcelable> implements Parcelable {
        public static final Parcelable.Creator<g<?>> CREATOR = new a();

        /* renamed from: a */
        public final String f22872a;

        /* renamed from: b */
        public final RESOURCE f22873b;

        /* loaded from: classes.dex */
        public static final class a implements Parcelable.Creator<g<?>> {
            @Override // android.os.Parcelable.Creator
            public final g<?> createFromParcel(Parcel parcel) {
                gm.l.f(parcel, "source");
                return new g<>(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public final g<?>[] newArray(int i10) {
                return new g[i10];
            }
        }

        public g(Parcel parcel) {
            this.f22872a = parcel.readString();
            this.f22873b = (RESOURCE) parcel.readParcelable(v.a().getClassLoader());
        }

        /* JADX WARN: Multi-variable type inference failed */
        public g(Parcelable parcelable) {
            this.f22872a = "image/png";
            this.f22873b = parcelable;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 1;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i10) {
            gm.l.f(parcel, "out");
            parcel.writeString(this.f22872a);
            parcel.writeParcelable(this.f22873b, i10);
        }
    }

    /* loaded from: classes.dex */
    public static final class h implements e {

        /* renamed from: a */
        public final OutputStream f22874a;

        /* renamed from: b */
        public final d6.c0 f22875b;

        /* renamed from: c */
        public boolean f22876c = true;

        /* renamed from: d */
        public final boolean f22877d;

        public h(OutputStream outputStream, d6.c0 c0Var, boolean z10) {
            this.f22874a = outputStream;
            this.f22875b = c0Var;
            this.f22877d = z10;
        }

        @Override // o5.y.e
        public final void a(String str, String str2) {
            gm.l.f(str, "key");
            gm.l.f(str2, "value");
            c(str, null, null);
            f("%s", str2);
            h();
            d6.c0 c0Var = this.f22875b;
            if (c0Var == null) {
                return;
            }
            c0Var.a(str2, gm.l.k(str, "    "));
        }

        public final void b(String str, Object... objArr) {
            gm.l.f(objArr, "args");
            if (!this.f22877d) {
                if (this.f22876c) {
                    OutputStream outputStream = this.f22874a;
                    Charset charset = om.a.f23623a;
                    byte[] bytes = "--".getBytes(charset);
                    gm.l.e(bytes, "(this as java.lang.String).getBytes(charset)");
                    outputStream.write(bytes);
                    OutputStream outputStream2 = this.f22874a;
                    String str2 = y.f22858j;
                    if (str2 != null) {
                        byte[] bytes2 = str2.getBytes(charset);
                        gm.l.e(bytes2, "(this as java.lang.String).getBytes(charset)");
                        outputStream2.write(bytes2);
                        OutputStream outputStream3 = this.f22874a;
                        byte[] bytes3 = "\r\n".getBytes(charset);
                        gm.l.e(bytes3, "(this as java.lang.String).getBytes(charset)");
                        outputStream3.write(bytes3);
                        this.f22876c = false;
                    } else {
                        throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
                    }
                }
                OutputStream outputStream4 = this.f22874a;
                Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
                byte[] bytes4 = i1.d(copyOf, copyOf.length, str, "java.lang.String.format(format, *args)").getBytes(om.a.f23623a);
                gm.l.e(bytes4, "(this as java.lang.String).getBytes(charset)");
                outputStream4.write(bytes4);
                return;
            }
            OutputStream outputStream5 = this.f22874a;
            Locale locale = Locale.US;
            Object[] copyOf2 = Arrays.copyOf(objArr, objArr.length);
            String format = String.format(locale, str, Arrays.copyOf(copyOf2, copyOf2.length));
            gm.l.e(format, "java.lang.String.format(locale, format, *args)");
            String encode = URLEncoder.encode(format, "UTF-8");
            gm.l.e(encode, "encode(String.format(Locale.US, format, *args), \"UTF-8\")");
            byte[] bytes5 = encode.getBytes(om.a.f23623a);
            gm.l.e(bytes5, "(this as java.lang.String).getBytes(charset)");
            outputStream5.write(bytes5);
        }

        public final void c(String str, String str2, String str3) {
            if (!this.f22877d) {
                b("Content-Disposition: form-data; name=\"%s\"", str);
                if (str2 != null) {
                    b("; filename=\"%s\"", str2);
                }
                f("", new Object[0]);
                if (str3 != null) {
                    f("%s: %s", "Content-Type", str3);
                }
                f("", new Object[0]);
                return;
            }
            OutputStream outputStream = this.f22874a;
            byte[] bytes = i1.d(new Object[]{str}, 1, "%s=", "java.lang.String.format(format, *args)").getBytes(om.a.f23623a);
            gm.l.e(bytes, "(this as java.lang.String).getBytes(charset)");
            outputStream.write(bytes);
        }

        public final void d(String str, Uri uri, String str2) {
            int j10;
            long j11;
            gm.l.f(str, "key");
            gm.l.f(uri, "contentUri");
            if (str2 == null) {
                str2 = "content/unknown";
            }
            c(str, str, str2);
            if (this.f22874a instanceof k0) {
                d6.m0 m0Var = d6.m0.f12709a;
                Cursor cursor = null;
                try {
                    cursor = v.a().getContentResolver().query(uri, null, null, null, null);
                    if (cursor == null) {
                        j11 = 0;
                    } else {
                        int columnIndex = cursor.getColumnIndex("_size");
                        cursor.moveToFirst();
                        long j12 = cursor.getLong(columnIndex);
                        cursor.close();
                        j11 = j12;
                    }
                    ((k0) this.f22874a).b(j11);
                    j10 = 0;
                } catch (Throwable th2) {
                    if (cursor != null) {
                        cursor.close();
                    }
                    throw th2;
                }
            } else {
                InputStream openInputStream = v.a().getContentResolver().openInputStream(uri);
                d6.m0 m0Var2 = d6.m0.f12709a;
                j10 = d6.m0.j(openInputStream, this.f22874a) + 0;
            }
            f("", new Object[0]);
            h();
            d6.c0 c0Var = this.f22875b;
            if (c0Var != null) {
                String k10 = gm.l.k(str, "    ");
                String format = String.format(Locale.ROOT, "<Data: %d>", Arrays.copyOf(new Object[]{Integer.valueOf(j10)}, 1));
                gm.l.e(format, "java.lang.String.format(locale, format, *args)");
                c0Var.a(format, k10);
            }
        }

        public final void e(String str, ParcelFileDescriptor parcelFileDescriptor, String str2) {
            int j10;
            gm.l.f(str, "key");
            gm.l.f(parcelFileDescriptor, "descriptor");
            if (str2 == null) {
                str2 = "content/unknown";
            }
            c(str, str, str2);
            OutputStream outputStream = this.f22874a;
            if (outputStream instanceof k0) {
                ((k0) outputStream).b(parcelFileDescriptor.getStatSize());
                j10 = 0;
            } else {
                ParcelFileDescriptor.AutoCloseInputStream autoCloseInputStream = new ParcelFileDescriptor.AutoCloseInputStream(parcelFileDescriptor);
                d6.m0 m0Var = d6.m0.f12709a;
                j10 = d6.m0.j(autoCloseInputStream, this.f22874a) + 0;
            }
            f("", new Object[0]);
            h();
            d6.c0 c0Var = this.f22875b;
            if (c0Var == null) {
                return;
            }
            String k10 = gm.l.k(str, "    ");
            String format = String.format(Locale.ROOT, "<Data: %d>", Arrays.copyOf(new Object[]{Integer.valueOf(j10)}, 1));
            gm.l.e(format, "java.lang.String.format(locale, format, *args)");
            c0Var.a(format, k10);
        }

        public final void f(String str, Object... objArr) {
            b(str, Arrays.copyOf(objArr, objArr.length));
            if (this.f22877d) {
                return;
            }
            b("\r\n", new Object[0]);
        }

        public final void g(String str, Object obj, y yVar) {
            gm.l.f(str, "key");
            OutputStream outputStream = this.f22874a;
            if (outputStream instanceof m0) {
                ((m0) outputStream).a(yVar);
            }
            String str2 = y.f22858j;
            if (c.f(obj)) {
                a(str, c.a(obj));
            } else if (obj instanceof Bitmap) {
                Bitmap bitmap = (Bitmap) obj;
                gm.l.f(bitmap, "bitmap");
                c(str, str, "image/png");
                bitmap.compress(Bitmap.CompressFormat.PNG, 100, this.f22874a);
                f("", new Object[0]);
                h();
                d6.c0 c0Var = this.f22875b;
                if (c0Var != null) {
                    c0Var.a("<Image>", gm.l.k(str, "    "));
                }
            } else if (obj instanceof byte[]) {
                byte[] bArr = (byte[]) obj;
                gm.l.f(bArr, "bytes");
                c(str, str, "content/unknown");
                this.f22874a.write(bArr);
                f("", new Object[0]);
                h();
                d6.c0 c0Var2 = this.f22875b;
                if (c0Var2 != null) {
                    String k10 = gm.l.k(str, "    ");
                    String format = String.format(Locale.ROOT, "<Data: %d>", Arrays.copyOf(new Object[]{Integer.valueOf(bArr.length)}, 1));
                    gm.l.e(format, "java.lang.String.format(locale, format, *args)");
                    c0Var2.a(format, k10);
                }
            } else if (obj instanceof Uri) {
                d(str, (Uri) obj, null);
            } else if (obj instanceof ParcelFileDescriptor) {
                e(str, (ParcelFileDescriptor) obj, null);
            } else if (obj instanceof g) {
                g gVar = (g) obj;
                RESOURCE resource = gVar.f22873b;
                String str3 = gVar.f22872a;
                if (resource instanceof ParcelFileDescriptor) {
                    e(str, (ParcelFileDescriptor) resource, str3);
                } else if (resource instanceof Uri) {
                    d(str, (Uri) resource, str3);
                } else {
                    throw new IllegalArgumentException("value is not a supported type.");
                }
            } else {
                throw new IllegalArgumentException("value is not a supported type.");
            }
        }

        public final void h() {
            if (!this.f22877d) {
                f("--%s", y.f22858j);
                return;
            }
            OutputStream outputStream = this.f22874a;
            byte[] bytes = ContainerUtils.FIELD_DELIMITER.getBytes(om.a.f23623a);
            gm.l.e(bytes, "(this as java.lang.String).getBytes(charset)");
            outputStream.write(bytes);
        }
    }

    static {
        new c();
        char[] charArray = "-_1234567890abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
        gm.l.e(charArray, "(this as java.lang.String).toCharArray()");
        StringBuilder sb2 = new StringBuilder();
        SecureRandom secureRandom = new SecureRandom();
        int nextInt = secureRandom.nextInt(11) + 30;
        if (nextInt <= 0) {
            String sb3 = sb2.toString();
            gm.l.e(sb3, "buffer.toString()");
            f22858j = sb3;
            f22859k = Pattern.compile("^/?v\\d+\\.\\d+/(.*)");
        }
        int i10 = 0;
        do {
            i10++;
            sb2.append(charArray[secureRandom.nextInt(charArray.length)]);
        } while (i10 < nextInt);
        String sb32 = sb2.toString();
        gm.l.e(sb32, "buffer.toString()");
        f22858j = sb32;
        f22859k = Pattern.compile("^/?v\\d+\\.\\d+/(.*)");
    }

    public y() {
        this(null, null, null, null, null, 63);
    }

    public y(o5.a aVar, String str, Bundle bundle, f0 f0Var, b bVar, int i10) {
        aVar = (i10 & 1) != 0 ? null : aVar;
        str = (i10 & 2) != 0 ? null : str;
        bundle = (i10 & 4) != 0 ? null : bundle;
        f0Var = (i10 & 8) != 0 ? null : f0Var;
        bVar = (i10 & 16) != 0 ? null : bVar;
        this.f22861a = aVar;
        this.f22862b = str;
        this.f22866f = null;
        j(bVar);
        k(f0Var);
        this.f22864d = bundle != null ? new Bundle(bundle) : new Bundle();
        if (this.f22866f == null) {
            this.f22866f = v.d();
        }
    }

    public static String f() {
        boolean z10;
        String b10 = v.b();
        d6.n0.g();
        String str = v.f22842f;
        if (str != null) {
            boolean z11 = false;
            if (b10.length() > 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                if (str.length() > 0) {
                    z11 = true;
                }
                if (z11) {
                    return b10 + '|' + str;
                }
            }
            d6.m0 m0Var = d6.m0.f12709a;
            return null;
        }
        throw new p("A valid Facebook client token must be set in the AndroidManifest.xml or set by calling FacebookSdk.setClientToken before initializing the sdk. Visit https://developers.facebook.com/docs/android/getting-started#add-app_id for more information.");
    }

    /* JADX WARN: Code restructure failed: missing block: B:63:0x003f, code lost:
        if (r3 == false) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x004f, code lost:
        if (r2 != null) goto L17;
     */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x005a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a() {
        /*
            r6 = this;
            android.os.Bundle r0 = r6.f22864d
            java.lang.String r1 = r6.e()
            r2 = 0
            if (r1 != 0) goto Lb
            r3 = 0
            goto L11
        Lb:
            java.lang.String r3 = "|"
            boolean r3 = om.l.c0(r1, r3, r2)
        L11:
            r4 = 1
            if (r1 == 0) goto L20
            java.lang.String r5 = "IG"
            boolean r1 = om.h.a0(r1, r5, r2)
            if (r1 == 0) goto L20
            if (r3 != 0) goto L20
            r1 = 1
            goto L21
        L20:
            r1 = 0
        L21:
            if (r1 == 0) goto L2a
            boolean r1 = r6.i()
            if (r1 == 0) goto L2a
            goto L41
        L2a:
            java.lang.String r1 = o5.v.e()
            java.lang.String r5 = "instagram.com"
            boolean r1 = gm.l.a(r1, r5)
            if (r1 != 0) goto L38
            r1 = 1
            goto L3d
        L38:
            boolean r1 = r6.i()
            r1 = r1 ^ r4
        L3d:
            if (r1 != 0) goto L42
            if (r3 != 0) goto L42
        L41:
            r2 = 1
        L42:
            java.lang.String r1 = "access_token"
            if (r2 == 0) goto L4b
            java.lang.String r2 = f()
            goto L51
        L4b:
            java.lang.String r2 = r6.e()
            if (r2 == 0) goto L54
        L51:
            r0.putString(r1, r2)
        L54:
            boolean r1 = r0.containsKey(r1)
            if (r1 != 0) goto L7b
            d6.m0 r1 = d6.m0.f12709a
            o5.v r1 = o5.v.f22837a
            d6.n0.g()
            java.lang.String r1 = o5.v.f22842f
            if (r1 == 0) goto L73
            boolean r1 = d6.m0.A(r1)
            if (r1 == 0) goto L7b
            java.lang.String r1 = "y"
            java.lang.String r2 = "Starting with v13 of the SDK, a client token must be embedded in your client code before making Graph API calls. Visit https://developers.facebook.com/docs/android/getting-started#client-token to learn how to implement this change."
            android.util.Log.w(r1, r2)
            goto L7b
        L73:
            o5.p r0 = new o5.p
            java.lang.String r1 = "A valid Facebook client token must be set in the AndroidManifest.xml or set by calling FacebookSdk.setClientToken before initializing the sdk. Visit https://developers.facebook.com/docs/android/getting-started#add-app_id for more information."
            r0.<init>(r1)
            throw r0
        L7b:
            java.lang.String r1 = "sdk"
            java.lang.String r2 = "android"
            r0.putString(r1, r2)
            java.lang.String r1 = "format"
            java.lang.String r2 = "json"
            r0.putString(r1, r2)
            o5.v r0 = o5.v.f22837a
            o5.g0 r0 = o5.g0.GRAPH_API_DEBUG_INFO
            o5.v.i(r0)
            o5.g0 r0 = o5.g0.GRAPH_API_DEBUG_WARNING
            o5.v.i(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o5.y.a():void");
    }

    public final String b(String str, boolean z10) {
        if (!z10 && this.f22868h == f0.POST) {
            return str;
        }
        Uri.Builder buildUpon = Uri.parse(str).buildUpon();
        for (String str2 : this.f22864d.keySet()) {
            Object obj = this.f22864d.get(str2);
            if (obj == null) {
                obj = "";
            }
            if (c.f(obj)) {
                buildUpon.appendQueryParameter(str2, c.a(obj).toString());
            } else if (this.f22868h != f0.GET) {
                throw new IllegalArgumentException(a0.a(new Object[]{obj.getClass().getSimpleName()}, 1, Locale.US, "Unsupported parameter type for GET request: %s", "java.lang.String.format(locale, format, *args)"));
            }
        }
        String builder = buildUpon.toString();
        gm.l.e(builder, "uriBuilder.toString()");
        return builder;
    }

    public final e0 c() {
        ArrayList c10 = c.c(new d0(ul.i.G(new y[]{this})));
        if (c10.size() == 1) {
            return (e0) c10.get(0);
        }
        throw new p("invalid state: expected a single response");
    }

    public final c0 d() {
        d0 d0Var = new d0(ul.i.G(new y[]{this}));
        d6.n0.e(d0Var);
        c0 c0Var = new c0(d0Var);
        c0Var.executeOnExecutor(v.c(), new Void[0]);
        return c0Var;
    }

    public final String e() {
        o5.a aVar = this.f22861a;
        if (aVar != null) {
            if (!this.f22864d.containsKey(Oauth2AccessToken.KEY_ACCESS_TOKEN)) {
                String str = aVar.f22671e;
                d6.c0.f12645d.c(str);
                return str;
            }
        } else if (!this.f22864d.containsKey(Oauth2AccessToken.KEY_ACCESS_TOKEN)) {
            return f();
        }
        return this.f22864d.getString(Oauth2AccessToken.KEY_ACCESS_TOKEN);
    }

    public final String g() {
        String d10;
        String str = this.f22862b;
        if (this.f22868h == f0.POST && str != null && om.h.U(str, "/videos", false)) {
            int i10 = d6.i0.f12694a;
            d10 = i1.d(new Object[]{v.e()}, 1, "https://graph-video.%s", "java.lang.String.format(format, *args)");
        } else {
            int i11 = d6.i0.f12694a;
            String e10 = v.e();
            gm.l.f(e10, "subdomain");
            d10 = i1.d(new Object[]{e10}, 1, "https://graph.%s", "java.lang.String.format(format, *args)");
        }
        String h10 = h(d10);
        a();
        return b(h10, false);
    }

    public final String h(String str) {
        boolean z10;
        String d10;
        if (!gm.l.a(v.e(), "instagram.com")) {
            z10 = true;
        } else {
            z10 = !i();
        }
        if (!z10) {
            int i10 = d6.i0.f12694a;
            str = i1.d(new Object[]{v.f22854r}, 1, "https://graph.%s", "java.lang.String.format(format, *args)");
        }
        Object[] objArr = new Object[2];
        objArr[0] = str;
        if (f22859k.matcher(this.f22862b).matches()) {
            d10 = this.f22862b;
        } else {
            d10 = i1.d(new Object[]{this.f22866f, this.f22862b}, 2, "%s/%s", "java.lang.String.format(format, *args)");
        }
        objArr[1] = d10;
        return i1.d(objArr, 2, "%s/%s", "java.lang.String.format(format, *args)");
    }

    public final boolean i() {
        if (this.f22862b == null) {
            return false;
        }
        StringBuilder a10 = android.support.v4.media.d.a("^/?");
        a10.append(v.b());
        a10.append("/?.*");
        String sb2 = a10.toString();
        if (!this.f22869i && !Pattern.matches(sb2, this.f22862b) && !Pattern.matches("^/?app/?.*", this.f22862b)) {
            return false;
        }
        return true;
    }

    public final void j(b bVar) {
        v vVar = v.f22837a;
        v.i(g0.GRAPH_API_DEBUG_INFO);
        v.i(g0.GRAPH_API_DEBUG_WARNING);
        this.f22867g = bVar;
    }

    public final void k(f0 f0Var) {
        if (f0Var == null) {
            f0Var = f0.GET;
        }
        this.f22868h = f0Var;
    }

    public final String toString() {
        StringBuilder a10 = p.a.a("{Request: ", " accessToken: ");
        Object obj = this.f22861a;
        if (obj == null) {
            obj = "null";
        }
        a10.append(obj);
        a10.append(", graphPath: ");
        a10.append(this.f22862b);
        a10.append(", graphObject: ");
        a10.append(this.f22863c);
        a10.append(", httpMethod: ");
        a10.append(this.f22868h);
        a10.append(", parameters: ");
        a10.append(this.f22864d);
        a10.append("}");
        String sb2 = a10.toString();
        gm.l.e(sb2, "StringBuilder()\n        .append(\"{Request: \")\n        .append(\" accessToken: \")\n        .append(if (accessToken == null) \"null\" else accessToken)\n        .append(\", graphPath: \")\n        .append(graphPath)\n        .append(\", graphObject: \")\n        .append(graphObject)\n        .append(\", httpMethod: \")\n        .append(httpMethod)\n        .append(\", parameters: \")\n        .append(parameters)\n        .append(\"}\")\n        .toString()");
        return sb2;
    }
}
