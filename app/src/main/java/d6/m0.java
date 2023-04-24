package d6;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.view.autofill.AutofillManager;
import android.webkit.CookieManager;
import android.webkit.CookieSyncManager;
import com.huawei.hms.framework.common.ContainerUtils;
import com.sina.weibo.sdk.auth.Oauth2AccessToken;
import d6.m0;
import java.io.BufferedInputStream;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.HttpURLConnection;
import java.net.URLConnection;
import java.net.URLDecoder;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.regex.Pattern;
import no.nordicsemi.android.dfu.DfuBaseService;
import o5.a;
import o5.y;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONTokener;

/* loaded from: classes.dex */
public final class m0 {

    /* renamed from: b */
    public static int f12710b;

    /* renamed from: a */
    public static final m0 f12709a = new m0();

    /* renamed from: c */
    public static long f12711c = -1;

    /* renamed from: d */
    public static long f12712d = -1;

    /* renamed from: e */
    public static long f12713e = -1;

    /* renamed from: f */
    public static String f12714f = "";

    /* renamed from: g */
    public static String f12715g = "";

    /* renamed from: h */
    public static String f12716h = "NoCarrier";

    /* loaded from: classes.dex */
    public interface a {
        void a(o5.p pVar);

        void b(JSONObject jSONObject);
    }

    public static final boolean A(String str) {
        if (str != null) {
            if (!(str.length() == 0)) {
                return false;
            }
        }
        return true;
    }

    public static final boolean B(Uri uri) {
        return uri != null && (om.h.V("http", uri.getScheme()) || om.h.V("https", uri.getScheme()) || om.h.V("fbstaging", uri.getScheme()));
    }

    public static final ArrayList C(JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList();
        int length = jSONArray.length();
        if (length > 0) {
            int i10 = 0;
            while (true) {
                int i11 = i10 + 1;
                arrayList.add(jSONArray.getString(i10));
                if (i11 >= length) {
                    break;
                }
                i10 = i11;
            }
        }
        return arrayList;
    }

    public static final HashMap D(String str) {
        if (str.length() == 0) {
            return new HashMap();
        }
        try {
            HashMap hashMap = new HashMap();
            JSONObject jSONObject = new JSONObject(str);
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                gm.l.e(next, "key");
                String string = jSONObject.getString(next);
                gm.l.e(string, "jsonObject.getString(key)");
                hashMap.put(next, string);
            }
            return hashMap;
        } catch (JSONException unused) {
            return new HashMap();
        }
    }

    public static final String E(Map<String, String> map) {
        gm.l.f(map, "map");
        String str = "";
        if (!map.isEmpty()) {
            try {
                JSONObject jSONObject = new JSONObject();
                for (Map.Entry<String, String> entry : map.entrySet()) {
                    jSONObject.put(entry.getKey(), entry.getValue());
                }
                str = jSONObject.toString();
            } catch (JSONException unused) {
            }
            gm.l.e(str, "{\n      try {\n        val jsonObject = JSONObject()\n        for ((key, value) in map) {\n          jsonObject.put(key, value)\n        }\n        jsonObject.toString()\n      } catch (_e: JSONException) {\n        \"\"\n      }\n    }");
        }
        return str;
    }

    public static final boolean F(Context context) {
        AutofillManager autofillManager;
        return Build.VERSION.SDK_INT >= 26 && (autofillManager = (AutofillManager) context.getSystemService(AutofillManager.class)) != null && autofillManager.isAutofillSupported() && autofillManager.isEnabled();
    }

    public static final Bundle G(String str) {
        Bundle bundle = new Bundle();
        if (!A(str)) {
            if (str != null) {
                Object[] array = om.l.s0(str, new String[]{ContainerUtils.FIELD_DELIMITER}, 0, 6).toArray(new String[0]);
                if (array != null) {
                    String[] strArr = (String[]) array;
                    int length = strArr.length;
                    int i10 = 0;
                    while (i10 < length) {
                        String str2 = strArr[i10];
                        i10++;
                        Object[] array2 = om.l.s0(str2, new String[]{ContainerUtils.KEY_VALUE_DELIMITER}, 0, 6).toArray(new String[0]);
                        if (array2 != null) {
                            String[] strArr2 = (String[]) array2;
                            try {
                                if (strArr2.length == 2) {
                                    bundle.putString(URLDecoder.decode(strArr2[0], "UTF-8"), URLDecoder.decode(strArr2[1], "UTF-8"));
                                } else if (strArr2.length == 1) {
                                    bundle.putString(URLDecoder.decode(strArr2[0], "UTF-8"), "");
                                }
                            } catch (UnsupportedEncodingException unused) {
                                o5.v vVar = o5.v.f22837a;
                            }
                        } else {
                            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
                        }
                    }
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
                }
            } else {
                throw new IllegalStateException("Required value was null.".toString());
            }
        }
        return bundle;
    }

    public static final void H(Bundle bundle, JSONArray jSONArray) {
        gm.l.f(bundle, "bundle");
        if (jSONArray instanceof Boolean) {
            bundle.putBoolean("media", ((Boolean) jSONArray).booleanValue());
        } else if (jSONArray instanceof boolean[]) {
            bundle.putBooleanArray("media", (boolean[]) jSONArray);
        } else if (jSONArray instanceof Double) {
            bundle.putDouble("media", ((Number) jSONArray).doubleValue());
        } else if (jSONArray instanceof double[]) {
            bundle.putDoubleArray("media", (double[]) jSONArray);
        } else if (jSONArray instanceof Integer) {
            bundle.putInt("media", ((Number) jSONArray).intValue());
        } else if (jSONArray instanceof int[]) {
            bundle.putIntArray("media", (int[]) jSONArray);
        } else if (jSONArray instanceof Long) {
            bundle.putLong("media", ((Number) jSONArray).longValue());
        } else if (jSONArray instanceof long[]) {
            bundle.putLongArray("media", (long[]) jSONArray);
        } else {
            bundle.putString("media", jSONArray instanceof String ? (String) jSONArray : jSONArray.toString());
        }
    }

    public static final void I(Bundle bundle, String str, String str2) {
        if (A(str2)) {
            return;
        }
        bundle.putString(str, str2);
    }

    public static final void J(Bundle bundle, String str, Uri uri) {
        if (uri != null) {
            I(bundle, str, uri.toString());
        }
    }

    public static final HashMap K(Parcel parcel) {
        gm.l.f(parcel, "parcel");
        int readInt = parcel.readInt();
        if (readInt < 0) {
            return null;
        }
        HashMap hashMap = new HashMap();
        int i10 = 0;
        if (readInt > 0) {
            do {
                i10++;
                String readString = parcel.readString();
                String readString2 = parcel.readString();
                if (readString != null && readString2 != null) {
                    hashMap.put(readString, readString2);
                    continue;
                }
            } while (i10 < readInt);
            return hashMap;
        }
        return hashMap;
    }

    public static final String L(InputStream inputStream) {
        BufferedInputStream bufferedInputStream;
        Throwable th2;
        InputStreamReader inputStreamReader;
        try {
            bufferedInputStream = new BufferedInputStream(inputStream);
            try {
                inputStreamReader = new InputStreamReader(bufferedInputStream);
            } catch (Throwable th3) {
                th2 = th3;
                inputStreamReader = null;
            }
        } catch (Throwable th4) {
            bufferedInputStream = null;
            th2 = th4;
            inputStreamReader = null;
        }
        try {
            StringBuilder sb2 = new StringBuilder();
            char[] cArr = new char[2048];
            while (true) {
                int read = inputStreamReader.read(cArr);
                if (read == -1) {
                    String sb3 = sb2.toString();
                    gm.l.e(sb3, "{\n      bufferedInputStream = BufferedInputStream(inputStream)\n      reader = InputStreamReader(bufferedInputStream)\n      val stringBuilder = StringBuilder()\n      val bufferSize = 1024 * 2\n      val buffer = CharArray(bufferSize)\n      var n = 0\n      while (reader.read(buffer).also { n = it } != -1) {\n        stringBuilder.append(buffer, 0, n)\n      }\n      stringBuilder.toString()\n    }");
                    e(bufferedInputStream);
                    e(inputStreamReader);
                    return sb3;
                }
                sb2.append(cArr, 0, read);
            }
        } catch (Throwable th5) {
            th2 = th5;
            e(bufferedInputStream);
            e(inputStreamReader);
            throw th2;
        }
    }

    public static final void M(Runnable runnable) {
        try {
            o5.v.c().execute(runnable);
        } catch (Exception unused) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:157:0x0189 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void N(org.json.JSONObject r10, android.content.Context r11) {
        /*
            Method dump skipped, instructions count: 465
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: d6.m0.N(org.json.JSONObject, android.content.Context):void");
    }

    public static final String O(String str) {
        if (str == null) {
            return null;
        }
        f12709a.getClass();
        byte[] bytes = str.getBytes(om.a.f23623a);
        gm.l.e(bytes, "(this as java.lang.String).getBytes(charset)");
        return u("SHA-256", bytes);
    }

    public static final void P(Parcel parcel, Map<String, String> map) {
        gm.l.f(parcel, "parcel");
        if (map == null) {
            parcel.writeInt(-1);
            return;
        }
        parcel.writeInt(map.size());
        for (Map.Entry<String, String> entry : map.entrySet()) {
            parcel.writeString(entry.getKey());
            parcel.writeString(entry.getValue());
        }
    }

    public static final <T> boolean a(T t10, T t11) {
        return t10 == null ? t11 == null : gm.l.a(t10, t11);
    }

    public static final Uri b(Bundle bundle, String str, String str2) {
        Uri.Builder builder = new Uri.Builder();
        builder.scheme("https");
        builder.authority(str);
        builder.path(str2);
        if (bundle != null) {
            for (String str3 : bundle.keySet()) {
                Object obj = bundle.get(str3);
                if (obj instanceof String) {
                    builder.appendQueryParameter(str3, (String) obj);
                }
            }
        }
        Uri build = builder.build();
        gm.l.e(build, "builder.build()");
        return build;
    }

    public static void c(Context context, String str) {
        CookieSyncManager.createInstance(context).sync();
        CookieManager cookieManager = CookieManager.getInstance();
        String cookie = cookieManager.getCookie(str);
        if (cookie == null) {
            return;
        }
        Object[] array = om.l.s0(cookie, new String[]{";"}, 0, 6).toArray(new String[0]);
        if (array == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
        }
        String[] strArr = (String[]) array;
        int length = strArr.length;
        int i10 = 0;
        while (i10 < length) {
            String str2 = strArr[i10];
            i10++;
            Object[] array2 = om.l.s0(str2, new String[]{ContainerUtils.KEY_VALUE_DELIMITER}, 0, 6).toArray(new String[0]);
            if (array2 == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
            }
            String[] strArr2 = (String[]) array2;
            if (strArr2.length > 0) {
                String str3 = strArr2[0];
                int length2 = str3.length() - 1;
                int i11 = 0;
                boolean z10 = false;
                while (i11 <= length2) {
                    boolean z11 = gm.l.h(str3.charAt(!z10 ? i11 : length2), 32) <= 0;
                    if (z10) {
                        if (!z11) {
                            break;
                        }
                        length2--;
                    } else if (z11) {
                        i11++;
                    } else {
                        z10 = true;
                    }
                }
                cookieManager.setCookie(str, gm.l.k("=;expires=Sat, 1 Jan 2000 00:00:01 UTC;", str3.subSequence(i11, length2 + 1).toString()));
            }
        }
        cookieManager.removeExpiredCookie();
    }

    public static final void d(Context context) {
        try {
            f12709a.getClass();
            c(context, "facebook.com");
            c(context, ".facebook.com");
            c(context, "https://facebook.com");
            c(context, "https://.facebook.com");
        } catch (Exception unused) {
        }
    }

    public static final void e(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    public static final String f(String str) {
        return A(str) ? "" : str;
    }

    public static final ArrayList g(JSONArray jSONArray) {
        try {
            ArrayList arrayList = new ArrayList();
            int i10 = 0;
            int length = jSONArray.length();
            if (length <= 0) {
                return arrayList;
            }
            while (true) {
                int i11 = i10 + 1;
                String string = jSONArray.getString(i10);
                gm.l.e(string, "jsonArray.getString(i)");
                arrayList.add(string);
                if (i11 >= length) {
                    return arrayList;
                }
                i10 = i11;
            }
        } catch (JSONException unused) {
            return new ArrayList();
        }
    }

    public static final HashMap h(JSONObject jSONObject) {
        gm.l.f(jSONObject, "jsonObject");
        HashMap hashMap = new HashMap();
        JSONArray names = jSONObject.names();
        if (names == null) {
            return hashMap;
        }
        int i10 = 0;
        int length = names.length();
        if (length > 0) {
            while (true) {
                int i11 = i10 + 1;
                try {
                    String string = names.getString(i10);
                    gm.l.e(string, "keys.getString(i)");
                    Object obj = jSONObject.get(string);
                    if (obj instanceof JSONObject) {
                        obj = h((JSONObject) obj);
                    }
                    gm.l.e(obj, "value");
                    hashMap.put(string, obj);
                } catch (JSONException unused) {
                }
                if (i11 >= length) {
                    break;
                }
                i10 = i11;
            }
        }
        return hashMap;
    }

    public static final HashMap i(JSONObject jSONObject) {
        HashMap hashMap = new HashMap();
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            String optString = jSONObject.optString(next);
            if (optString != null) {
                gm.l.e(next, "key");
                hashMap.put(next, optString);
            }
        }
        return hashMap;
    }

    public static final int j(InputStream inputStream, OutputStream outputStream) {
        BufferedInputStream bufferedInputStream;
        gm.l.f(outputStream, "outputStream");
        BufferedInputStream bufferedInputStream2 = null;
        try {
            bufferedInputStream = new BufferedInputStream(inputStream);
        } catch (Throwable th2) {
            th = th2;
        }
        try {
            byte[] bArr = new byte[DfuBaseService.ERROR_REMOTE_MASK];
            int i10 = 0;
            while (true) {
                int read = bufferedInputStream.read(bArr);
                if (read == -1) {
                    break;
                }
                outputStream.write(bArr, 0, read);
                i10 += read;
            }
            bufferedInputStream.close();
            if (inputStream != null) {
                inputStream.close();
            }
            return i10;
        } catch (Throwable th3) {
            th = th3;
            bufferedInputStream2 = bufferedInputStream;
            if (bufferedInputStream2 != null) {
                bufferedInputStream2.close();
            }
            if (inputStream != null) {
                inputStream.close();
            }
            throw th;
        }
    }

    public static final void k(URLConnection uRLConnection) {
        if (uRLConnection == null || !(uRLConnection instanceof HttpURLConnection)) {
            return;
        }
        ((HttpURLConnection) uRLConnection).disconnect();
    }

    public static final String l(Context context) {
        return context == null ? "null" : context == context.getApplicationContext() ? "unknown" : context.getClass().getSimpleName();
    }

    public static final String m(Context context) {
        String string;
        try {
            o5.v vVar = o5.v.f22837a;
            n0.g();
            String str = o5.v.f22841e;
            if (str != null) {
                return str;
            }
            ApplicationInfo applicationInfo = context.getApplicationInfo();
            int i10 = applicationInfo.labelRes;
            if (i10 == 0) {
                string = applicationInfo.nonLocalizedLabel.toString();
            } else {
                string = context.getString(i10);
                gm.l.e(string, "context.getString(stringId)");
            }
            return string;
        } catch (Exception unused) {
            return "";
        }
    }

    public static final Date n(Bundle bundle, String str, Date date) {
        long parseLong;
        if (bundle == null) {
            return null;
        }
        Object obj = bundle.get(str);
        if (!(obj instanceof Long)) {
            if (obj instanceof String) {
                try {
                    parseLong = Long.parseLong((String) obj);
                } catch (NumberFormatException unused) {
                }
            }
            return null;
        }
        parseLong = ((Number) obj).longValue();
        if (parseLong == 0) {
            return new Date(Long.MAX_VALUE);
        }
        return new Date((parseLong * 1000) + date.getTime());
    }

    public static final JSONObject o() {
        if (i6.a.b(m0.class)) {
            return null;
        }
        try {
            String string = o5.v.a().getSharedPreferences("com.facebook.sdk.DataProcessingOptions", 0).getString("data_processing_options", null);
            if (string != null) {
                try {
                    return new JSONObject(string);
                } catch (JSONException unused) {
                }
            }
            return null;
        } catch (Throwable th2) {
            i6.a.a(m0.class, th2);
            return null;
        }
    }

    public static final void p(final a aVar, final String str) {
        String str2;
        gm.l.f(str, "accessToken");
        ConcurrentHashMap<String, JSONObject> concurrentHashMap = h0.f12690a;
        JSONObject jSONObject = h0.f12690a.get(str);
        if (jSONObject != null) {
            aVar.b(jSONObject);
            return;
        }
        y.b bVar = new y.b() { // from class: d6.k0
            @Override // o5.y.b
            public final void b(o5.e0 e0Var) {
                m0.a aVar2 = m0.a.this;
                String str3 = str;
                gm.l.f(aVar2, "$callback");
                gm.l.f(str3, "$accessToken");
                o5.s sVar = e0Var.f22704c;
                if (sVar != null) {
                    aVar2.a(sVar.f22830i);
                    return;
                }
                ConcurrentHashMap<String, JSONObject> concurrentHashMap2 = h0.f12690a;
                JSONObject jSONObject2 = e0Var.f22705d;
                if (jSONObject2 != null) {
                    h0.f12690a.put(str3, jSONObject2);
                    aVar2.b(e0Var.f22705d);
                    return;
                }
                throw new IllegalStateException("Required value was null.".toString());
            }
        };
        f12709a.getClass();
        Bundle bundle = new Bundle();
        Date date = o5.a.f22664l;
        o5.a b10 = a.c.b();
        if (gm.l.a((b10 == null || (r1 = b10.f22677k) == null) ? "facebook" : "facebook", "instagram")) {
            str2 = "id,name,profile_picture";
        } else {
            str2 = "id,name,first_name,middle_name,last_name";
        }
        bundle.putString("fields", str2);
        bundle.putString(Oauth2AccessToken.KEY_ACCESS_TOKEN, str);
        o5.y yVar = new o5.y(null, "me", null, null, new o5.z(0, null), 32);
        yVar.f22864d = bundle;
        yVar.k(o5.f0.GET);
        yVar.j(bVar);
        yVar.d();
    }

    public static final String q(Context context) {
        String str = n0.f12718a;
        return o5.v.b();
    }

    public static final Method r(Class<?> cls, String str, Class<?>... clsArr) {
        gm.l.f(clsArr, "parameterTypes");
        try {
            return cls.getMethod(str, (Class[]) Arrays.copyOf(clsArr, clsArr.length));
        } catch (NoSuchMethodException unused) {
            return null;
        }
    }

    public static final Method s(String str, String str2, Class<?>... clsArr) {
        try {
            return r(Class.forName(str), str2, (Class[]) Arrays.copyOf(clsArr, clsArr.length));
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }

    public static final Object t(String str, String str2, JSONObject jSONObject) {
        Object opt = jSONObject.opt(str);
        if (opt != null && (opt instanceof String)) {
            opt = new JSONTokener((String) opt).nextValue();
        }
        if (opt == null || (opt instanceof JSONObject) || (opt instanceof JSONArray)) {
            return opt;
        }
        if (str2 != null) {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.putOpt(str2, opt);
            return jSONObject2;
        }
        throw new o5.p("Got an unexpected non-JSON object.");
    }

    public static String u(String str, byte[] bArr) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance(str);
            gm.l.e(messageDigest, "hash");
            messageDigest.update(bArr);
            byte[] digest = messageDigest.digest();
            StringBuilder sb2 = new StringBuilder();
            gm.l.e(digest, "digest");
            int length = digest.length;
            int i10 = 0;
            while (i10 < length) {
                byte b10 = digest[i10];
                i10++;
                sb2.append(Integer.toHexString((b10 >> 4) & 15));
                sb2.append(Integer.toHexString((b10 >> 0) & 15));
            }
            String sb3 = sb2.toString();
            gm.l.e(sb3, "builder.toString()");
            return sb3;
        } catch (NoSuchAlgorithmException unused) {
            return null;
        }
    }

    public static final Object v(Object obj, Method method, Object... objArr) {
        try {
            return method.invoke(obj, Arrays.copyOf(objArr, objArr.length));
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    public static final boolean w() {
        try {
            Intent intent = new Intent("android.intent.action.VIEW");
            String format = String.format("fb%s://applinks", Arrays.copyOf(new Object[]{o5.v.b()}, 1));
            gm.l.e(format, "java.lang.String.format(format, *args)");
            intent.setData(Uri.parse(format));
            Context a10 = o5.v.a();
            PackageManager packageManager = a10.getPackageManager();
            String packageName = a10.getPackageName();
            for (ResolveInfo resolveInfo : packageManager.queryIntentActivities(intent, 65536)) {
                if (gm.l.a(packageName, resolveInfo.activityInfo.packageName)) {
                    return true;
                }
            }
        } catch (Exception unused) {
        }
        return false;
    }

    public static final boolean x(Context context) {
        if (Build.VERSION.SDK_INT >= 27) {
            return context.getPackageManager().hasSystemFeature("android.hardware.type.pc");
        }
        String str = Build.DEVICE;
        if (str != null) {
            Pattern compile = Pattern.compile(".+_cheets|cheets_.+");
            gm.l.e(compile, "compile(pattern)");
            if (compile.matcher(str).matches()) {
                return true;
            }
        }
        return false;
    }

    public static final boolean y() {
        if (i6.a.b(m0.class)) {
            return false;
        }
        try {
            JSONObject o10 = o();
            if (o10 == null) {
                return false;
            }
            try {
                JSONArray jSONArray = o10.getJSONArray("data_processing_options");
                int length = jSONArray.length();
                if (length > 0) {
                    int i10 = 0;
                    while (true) {
                        int i11 = i10 + 1;
                        String string = jSONArray.getString(i10);
                        gm.l.e(string, "options.getString(i)");
                        String lowerCase = string.toLowerCase();
                        gm.l.e(lowerCase, "(this as java.lang.String).toLowerCase()");
                        if (gm.l.a(lowerCase, "ldu")) {
                            return true;
                        }
                        if (i11 >= length) {
                            break;
                        }
                        i10 = i11;
                    }
                }
            } catch (Exception unused) {
            }
            return false;
        } catch (Throwable th2) {
            i6.a.a(m0.class, th2);
            return false;
        }
    }

    public static boolean z(Context context) {
        Method s10 = s("com.google.android.gms.common.GooglePlayServicesUtil", "isGooglePlayServicesAvailable", Context.class);
        if (s10 == null) {
            return false;
        }
        Object v10 = v(null, s10, context);
        return (v10 instanceof Integer) && gm.l.a(v10, 0);
    }
}
