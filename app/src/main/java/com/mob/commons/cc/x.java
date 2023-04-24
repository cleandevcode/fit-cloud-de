package com.mob.commons.cc;

import com.huawei.hms.framework.common.hianalytics.WiseOpenHianalyticsData;
import com.mob.commons.cc.w;
import com.mob.commons.cc.y;
import com.mob.commons.cc.z;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Proxy;
import java.net.URL;
import java.net.URLConnection;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.cert.CertificateException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLContext;
import javax.net.ssl.TrustManager;
import no.nordicsemi.android.dfu.DfuBaseService;

/* loaded from: classes.dex */
public class x {

    /* renamed from: a */
    public int f8326a;

    /* renamed from: b */
    public String f8327b;

    /* renamed from: c */
    public int f8328c;

    /* renamed from: d */
    public String f8329d;

    /* renamed from: e */
    public String f8330e;

    /* renamed from: f */
    public String f8331f;

    /* renamed from: g */
    public int f8332g;

    /* renamed from: h */
    public String f8333h;

    /* renamed from: i */
    public int f8334i;

    /* renamed from: j */
    public int f8335j;

    /* renamed from: k */
    public int f8336k;

    /* renamed from: l */
    public String f8337l;

    /* renamed from: m */
    public Object[] f8338m;

    /* renamed from: n */
    public String f8339n;

    /* renamed from: o */
    public String[] f8340o;

    /* renamed from: p */
    public String f8341p;

    /* renamed from: q */
    public Object f8342q;

    /* renamed from: r */
    public int f8343r;

    /* renamed from: s */
    public int f8344s;

    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a */
        public int f8347a;

        /* renamed from: b */
        public r f8348b;

        /* renamed from: c */
        public List<Object> f8349c;

        /* renamed from: d */
        public boolean f8350d;

        /* renamed from: e */
        public boolean f8351e;

        /* renamed from: f */
        public ArrayList<x> f8352f;

        /* renamed from: g */
        public ArrayList<Object> f8353g;

        public Class<?> a(String str) {
            return this.f8348b.b(str);
        }

        public Object a() {
            return this.f8348b.a();
        }

        public void a(Object obj) {
            this.f8348b.a(obj);
        }

        public void a(String str, Class<?> cls) {
            this.f8348b.a(str, cls);
        }

        public void a(String str, Object obj) {
            this.f8348b.b(str, obj);
        }

        public Object b(String str) {
            return this.f8348b.a(str);
        }

        public void b(String str, Object obj) {
            this.f8348b.a(str, obj);
        }
    }

    public x() {
    }

    public x(int i10) {
        this.f8326a = i10;
    }

    private Object a(Object obj, Class<?> cls) {
        if (obj instanceof ByteArrayOutputStream) {
            return a(((ByteArrayOutputStream) obj).toByteArray(), cls);
        }
        if (obj instanceof byte[]) {
            return a(new String((byte[]) obj, "utf-8"), cls);
        }
        if ((obj instanceof StringBuffer) || (obj instanceof StringBuilder)) {
            return a(obj.toString(), cls);
        }
        if (obj instanceof String) {
            return cls.getConstructor(String.class).newInstance(obj);
        }
        if (obj.getClass().equals(cls)) {
            return obj;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Failed to cast ");
        sb2.append(obj);
        sb2.append(" to be ");
        sb2.append(cls.getName());
        sb2.append(" at line: ");
        sb2.append(this.f8327b);
        sb2.append("(");
        throw new ClassCastException(a0.q.b(sb2, this.f8328c, ")"));
    }

    private Object a(Object obj, Object obj2, Class<?> cls, Class<?> cls2) {
        if (obj == null || obj2.equals(obj)) {
            return null;
        }
        if (obj.getClass().equals(cls)) {
            HashMap hashMap = new HashMap();
            a((Map) hashMap, obj, cls, cls2);
            return hashMap;
        } else if (obj.getClass().equals(cls2)) {
            Field declaredField = cls2.getDeclaredField("values");
            declaredField.setAccessible(true);
            ArrayList arrayList = new ArrayList();
            for (Object obj3 : (List) declaredField.get(obj)) {
                arrayList.add(a(obj3, obj2, cls, cls2));
            }
            return arrayList;
        } else {
            return obj;
        }
    }

    private static Object a(final String str) {
        Object[] objArr;
        final Object obj = null;
        try {
            Method declaredMethod = Class.forName("javax.net.ssl.TrustManagerFactory").getDeclaredMethod("getInstance", String.class);
            declaredMethod.setAccessible(true);
            Object invoke = declaredMethod.invoke(null, "X509");
            Method method = invoke.getClass().getMethod("init", Class.forName("java.security.KeyStore"));
            method.setAccessible(true);
            method.invoke(invoke, null);
            Method method2 = invoke.getClass().getMethod("getTrustManagers", new Class[0]);
            method2.setAccessible(true);
            objArr = (Object[]) method2.invoke(invoke, new Object[0]);
        } catch (Exception unused) {
        }
        if (objArr == null || objArr.length == 0) {
            throw new NoSuchAlgorithmException("no trust manager found.");
        }
        obj = objArr[0];
        return Proxy.newProxyInstance(ClassLoader.getSystemClassLoader(), new Class[]{Class.forName("javax.net.ssl.X509TrustManager")}, new InvocationHandler() { // from class: com.mob.commons.cc.x.1
            private boolean a() {
                try {
                    Field field = Class.forName("android.os.Build$VERSION").getField("SDK_INT");
                    field.setAccessible(true);
                    return field.getInt(null) >= 17;
                } catch (Throwable unused2) {
                    return true;
                }
            }

            @Override // java.lang.reflect.InvocationHandler
            public Object invoke(Object obj2, Method method3, Object[] objArr2) {
                String name = method3.getName();
                if (name.equals("checkClientTrusted")) {
                    return null;
                }
                try {
                    if (!name.equals("checkServerTrusted")) {
                        if (name.equals("getAcceptedIssuers")) {
                            return Array.newInstance(Class.forName("java.security.cert.X509Certificate"), 0);
                        }
                        if (name.equals("hashCode")) {
                            return Integer.valueOf(hashCode());
                        }
                        if (name.equals("toString")) {
                            return toString();
                        }
                        return null;
                    }
                    Object[] objArr3 = (Object[]) objArr2[0];
                    String str2 = (String) objArr2[1];
                    if (objArr3 != null) {
                        if (objArr3.length == 1) {
                            Method declaredMethod2 = objArr3[0].getClass().getDeclaredMethod("checkValidity", new Class[0]);
                            declaredMethod2.setAccessible(true);
                            declaredMethod2.invoke(objArr3[0], new Object[0]);
                            return null;
                        } else if (obj != null) {
                            if (!a()) {
                                Method declaredMethod3 = obj.getClass().getDeclaredMethod("checkServerTrusted", Array.newInstance(Class.forName("java.security.cert.X509Certificate"), 0).getClass(), String.class);
                                declaredMethod3.setAccessible(true);
                                declaredMethod3.invoke(obj, objArr3, str2);
                                return null;
                            }
                            Object newInstance = Class.forName("android.net.http.X509TrustManagerExtensions").getConstructor(Class.forName("javax.net.ssl.X509TrustManager")).newInstance(obj);
                            Method declaredMethod4 = newInstance.getClass().getDeclaredMethod("checkServerTrusted", Array.newInstance(Class.forName("java.security.cert.X509Certificate"), 0).getClass(), String.class, String.class);
                            declaredMethod4.setAccessible(true);
                            declaredMethod4.invoke(newInstance, objArr3, str2, str);
                            return null;
                        } else {
                            throw new CertificateException("there were one more certificates but no trust manager found.");
                        }
                    }
                    throw new IllegalArgumentException("there were no certificates.");
                } catch (Throwable unused2) {
                    return null;
                }
            }
        });
    }

    private String a(InputStream inputStream) {
        if (inputStream == null) {
            return null;
        }
        byte[] bArr = new byte[DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED];
        MessageDigest messageDigest = MessageDigest.getInstance("MD5");
        while (true) {
            int read = inputStream.read(bArr);
            if (read == -1) {
                return a(messageDigest.digest());
            }
            messageDigest.update(bArr, 0, read);
        }
    }

    private String a(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        int length = bArr.length;
        StringBuffer stringBuffer = new StringBuffer();
        for (int i10 = 0; i10 < length; i10++) {
            stringBuffer.append(String.format("%02x", Byte.valueOf(bArr[i10])));
        }
        return stringBuffer.toString();
    }

    private URLConnection a(URL url) {
        URLConnection openConnection = url.openConnection();
        if (openConnection instanceof HttpsURLConnection) {
            Field field = Class.forName("org.apache.http.conn.ssl.SSLSocketFactory").getField("STRICT_HOSTNAME_VERIFIER");
            field.setAccessible(true);
            HostnameVerifier hostnameVerifier = (HostnameVerifier) field.get(null);
            HttpsURLConnection httpsURLConnection = (HttpsURLConnection) openConnection;
            SSLContext sSLContext = SSLContext.getInstance("TLS");
            TrustManager[] trustManagerArr = new TrustManager[0];
            try {
                trustManagerArr = new TrustManager[]{(TrustManager) a(httpsURLConnection.getURL().getHost())};
            } catch (Throwable unused) {
            }
            sSLContext.init(null, trustManagerArr, new SecureRandom());
            httpsURLConnection.setSSLSocketFactory(sSLContext.getSocketFactory());
            httpsURLConnection.setHostnameVerifier(hostnameVerifier);
        }
        return openConnection;
    }

    private void a(Map map, Object obj, Class<?> cls, Class<?> cls2) {
        Field declaredField = cls.getDeclaredField("nameValuePairs");
        declaredField.setAccessible(true);
        Field declaredField2 = cls.getDeclaredField("NULL");
        declaredField2.setAccessible(true);
        Object obj2 = declaredField2.get(null);
        for (Map.Entry entry : ((Map) declaredField.get(obj)).entrySet()) {
            map.put(entry.getKey(), a(entry.getValue(), obj2, cls, cls2));
        }
    }

    public void a(w.a aVar) {
        int i10 = 0;
        switch (this.f8326a) {
            case 1:
                this.f8333h = (String) aVar.b();
                aVar.a();
                return;
            case 2:
                this.f8342q = aVar.b();
                return;
            case 3:
            case 9:
            case 19:
                this.f8333h = (String) aVar.b();
                return;
            case 4:
            case 5:
                this.f8336k = ((Integer) aVar.b()).intValue();
                return;
            case 6:
                this.f8344s = ((Integer) aVar.b()).intValue();
                return;
            case 7:
                this.f8343r = ((Integer) aVar.b()).intValue();
                return;
            case 8:
            case 15:
            case 23:
            case 25:
            case 28:
            case 30:
            case 33:
            case 34:
            default:
                return;
            case 10:
            case 35:
                this.f8329d = (String) aVar.b();
                this.f8330e = (String) aVar.b();
                return;
            case 11:
            case 24:
                this.f8337l = (String) aVar.b();
                return;
            case 12:
                this.f8341p = (String) aVar.b();
                this.f8334i = ((Integer) aVar.b()).intValue();
                return;
            case 13:
            case 26:
                this.f8339n = (String) aVar.b();
                this.f8337l = (String) aVar.b();
                return;
            case 14:
                this.f8339n = (String) aVar.b();
                this.f8341p = (String) aVar.b();
                this.f8334i = ((Integer) aVar.b()).intValue();
                return;
            case 16:
            case 32:
                this.f8334i = ((Integer) aVar.b()).intValue();
                return;
            case 17:
            case 27:
                this.f8339n = (String) aVar.b();
                return;
            case 18:
                this.f8339n = (String) aVar.b();
                this.f8334i = ((Integer) aVar.b()).intValue();
                return;
            case 20:
                this.f8331f = (String) aVar.b();
                return;
            case 21:
            case 22:
                this.f8331f = (String) aVar.b();
                int intValue = ((Integer) aVar.b()).intValue();
                this.f8332g = intValue;
                this.f8332g = aVar.c() + intValue;
                return;
            case 29:
                this.f8333h = (String) aVar.b();
                this.f8334i = ((Integer) aVar.b()).intValue();
                int intValue2 = ((Integer) aVar.b()).intValue();
                this.f8335j = intValue2;
                this.f8335j = aVar.c() + intValue2;
                return;
            case 31:
                this.f8333h = (String) aVar.b();
                this.f8334i = ((Integer) aVar.b()).intValue();
                return;
            case 36:
                int intValue3 = ((Integer) aVar.b()).intValue();
                this.f8340o = new String[intValue3];
                while (i10 < intValue3) {
                    this.f8340o[i10] = (String) aVar.b();
                    aVar.a();
                    i10++;
                }
                return;
            case 37:
                int intValue4 = ((Integer) aVar.b()).intValue();
                this.f8338m = new Object[intValue4];
                while (i10 < intValue4) {
                    this.f8338m[i10] = aVar.b();
                    i10++;
                }
                return;
            case 38:
                int intValue5 = ((Integer) aVar.b()).intValue();
                this.f8340o = new String[intValue5];
                while (i10 < intValue5) {
                    this.f8340o[i10] = (String) aVar.b();
                    i10++;
                }
                return;
        }
    }

    public void b(Class<?> cls, r rVar) {
        Field field;
        Object a10 = rVar.a();
        while (cls != null) {
            try {
                field = cls.getDeclaredField(this.f8337l);
            } catch (Throwable unused) {
                field = null;
            }
            if (field != null && Modifier.isStatic(field.getModifiers())) {
                field.setAccessible(true);
                field.set(null, a10);
                return;
            }
            cls = cls.getSuperclass();
        }
        x xVar = new x(14);
        xVar.f8327b = this.f8327b;
        xVar.f8328c = this.f8328c;
        xVar.f8339n = this.f8339n;
        StringBuilder a11 = android.support.v4.media.d.a("set");
        a11.append(Character.toUpperCase(this.f8337l.charAt(0)));
        a11.append(this.f8337l.substring(1));
        xVar.f8341p = a11.toString();
        xVar.f8334i = 1;
        xVar.a(cls, new Object[]{a10}, rVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:1243:0x0ab0, code lost:
        if (java.lang.Double.valueOf(r0.toString()).doubleValue() == 0.0d) goto L556;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1249:0x0acc, code lost:
        if ((r0 instanceof java.lang.Boolean) != false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1331:0x0c58, code lost:
        if (r1 == null) goto L563;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1338:0x0c71, code lost:
        if (((java.lang.Number) r0).doubleValue() != ((java.lang.Number) r1).doubleValue()) goto L556;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1343:0x0c7c, code lost:
        if (r1 == null) goto L562;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1344:0x0c7e, code lost:
        r0 = java.lang.Boolean.TRUE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1351:0x0c9a, code lost:
        if (((java.lang.Number) r0).doubleValue() == ((java.lang.Number) r1).doubleValue()) goto L556;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1352:0x0c9c, code lost:
        r6 = true;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:1147:0x090c  */
    /* JADX WARN: Removed duplicated region for block: B:1151:0x0925  */
    /* JADX WARN: Removed duplicated region for block: B:1163:0x0955 A[LOOP:13: B:1161:0x094e->B:1163:0x0955, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:1385:0x0959 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v105, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v140, types: [java.lang.Double] */
    /* JADX WARN: Type inference failed for: r0v141, types: [java.lang.Float] */
    /* JADX WARN: Type inference failed for: r0v143, types: [java.lang.Long] */
    /* JADX WARN: Type inference failed for: r0v144, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r0v179, types: [java.lang.Double] */
    /* JADX WARN: Type inference failed for: r0v181, types: [java.lang.Float] */
    /* JADX WARN: Type inference failed for: r0v182, types: [java.lang.Long] */
    /* JADX WARN: Type inference failed for: r0v184, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v205, types: [java.lang.Boolean] */
    /* JADX WARN: Type inference failed for: r0v213, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v214, types: [java.util.HashMap] */
    /* JADX WARN: Type inference failed for: r0v215 */
    /* JADX WARN: Type inference failed for: r0v221, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v222, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v224, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v226, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v227, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v229, types: [java.lang.Class] */
    /* JADX WARN: Type inference failed for: r0v263, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v276, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v28, types: [java.lang.Boolean] */
    /* JADX WARN: Type inference failed for: r0v29, types: [java.lang.Boolean] */
    /* JADX WARN: Type inference failed for: r0v295 */
    /* JADX WARN: Type inference failed for: r0v296 */
    /* JADX WARN: Type inference failed for: r0v30, types: [java.lang.Boolean] */
    /* JADX WARN: Type inference failed for: r0v32, types: [java.lang.Double] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v45, types: [java.lang.Short] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v62, types: [java.lang.Character] */
    /* JADX WARN: Type inference failed for: r0v70, types: [java.lang.Byte] */
    /* JADX WARN: Type inference failed for: r0v71, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v84, types: [java.lang.Double] */
    /* JADX WARN: Type inference failed for: r0v85, types: [java.lang.Float] */
    /* JADX WARN: Type inference failed for: r0v88, types: [java.lang.Long] */
    /* JADX WARN: Type inference failed for: r0v89, types: [java.lang.Integer] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void a(com.mob.commons.cc.x.a r13) {
        /*
            Method dump skipped, instructions count: 3378
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mob.commons.cc.x.a(com.mob.commons.cc.x$a):void");
    }

    public void b(Object obj, r rVar) {
        Object a10 = rVar.a();
        if (obj instanceof Map) {
            ((Map) obj).put(this.f8337l, a10);
            return;
        }
        for (Class<?> cls = obj.getClass(); cls != null; cls = cls.getSuperclass()) {
            Field field = null;
            try {
                field = cls.getDeclaredField(this.f8337l);
            } catch (Throwable unused) {
            }
            if (field != null && !Modifier.isStatic(field.getModifiers())) {
                field.setAccessible(true);
                field.set(obj, a10);
                return;
            }
        }
        x xVar = new x(12);
        xVar.f8327b = this.f8327b;
        xVar.f8328c = this.f8328c;
        StringBuilder a11 = android.support.v4.media.d.a("set");
        a11.append(Character.toUpperCase(this.f8337l.charAt(0)));
        a11.append(this.f8337l.substring(1));
        xVar.f8341p = a11.toString();
        xVar.f8334i = 1;
        xVar.a(obj, new Object[]{a10}, rVar);
    }

    public void a(Class<?> cls, r rVar) {
        Field field;
        while (true) {
            if (cls == null) {
                x xVar = new x(14);
                xVar.f8327b = this.f8327b;
                xVar.f8328c = this.f8328c;
                xVar.f8339n = this.f8339n;
                StringBuilder a10 = android.support.v4.media.d.a("get");
                a10.append(Character.toUpperCase(this.f8337l.charAt(0)));
                a10.append(this.f8337l.substring(1));
                xVar.f8341p = a10.toString();
                xVar.f8334i = 1;
                xVar.a(cls, new Object[0], rVar);
                return;
            } else if ("class".equals(this.f8337l)) {
                rVar.a(cls);
                return;
            } else if (cls.equals(w.class) && WiseOpenHianalyticsData.UNION_VERSION.equals(this.f8337l)) {
                rVar.a((Object) 60);
                return;
            } else if (cls.isEnum()) {
                Object[] enumConstants = cls.getEnumConstants();
                if (enumConstants != null) {
                    for (Object obj : enumConstants) {
                        if (((Enum) obj).name().equals(this.f8337l)) {
                            rVar.a(obj);
                            return;
                        }
                    }
                    continue;
                } else {
                    continue;
                }
            } else {
                try {
                    field = cls.getDeclaredField(this.f8337l);
                } catch (Throwable unused) {
                    field = null;
                }
                if (field != null && Modifier.isStatic(field.getModifiers())) {
                    field.setAccessible(true);
                    rVar.a(field.get(null));
                    return;
                }
                cls = cls.getSuperclass();
            }
        }
    }

    public void a(Class<?> cls, Object[] objArr, r rVar) {
        Method[] declaredMethods;
        Class<?>[] parameterTypes;
        boolean[] zArr;
        boolean[] a10;
        Constructor<?>[] declaredConstructors;
        Object obj;
        Class<?> cls2 = cls;
        if ("new".equals(this.f8341p)) {
            if (List.class.isAssignableFrom(cls2) && objArr.length == 1 && (obj = objArr[0]) != null && obj.getClass().isArray()) {
                int length = Array.getLength(objArr[0]);
                List arrayList = cls2.equals(List.class) ? new ArrayList(length) : (List) cls.newInstance();
                for (int i10 = 0; i10 < length; i10++) {
                    arrayList.add(Array.get(objArr[0], i10));
                }
                rVar.a(arrayList);
            } else if (Map.class.isAssignableFrom(cls2) && objArr.length == 1 && objArr[0] != null) {
                Map hashMap = cls2.equals(Map.class) ? new HashMap() : (Map) cls.newInstance();
                Object obj2 = objArr[0];
                if (obj2 instanceof Map) {
                    hashMap.putAll((Map) obj2);
                } else {
                    Class<?> cls3 = Class.forName("org.json.JSONObject");
                    a(hashMap, a(objArr[0], cls3), cls3, Class.forName("org.json.JSONArray"));
                }
                rVar.a(hashMap);
            } else if (!cls2.equals(z.class)) {
                boolean[][] zArr2 = new boolean[2];
                Constructor a11 = rVar.g().a(cls2, objArr, zArr2);
                if (a11 != null) {
                    Object[] a12 = !zArr2[1][0] ? rVar.g().a(rVar, a11.getParameterTypes(), objArr, zArr2[0]) : objArr;
                    a11.setAccessible(true);
                    rVar.a(a11.newInstance(a12));
                    return;
                }
                for (Constructor<?> constructor : cls.getDeclaredConstructors()) {
                    Class<?>[] parameterTypes2 = constructor.getParameterTypes();
                    boolean[] zArr3 = new boolean[1];
                    boolean[] a13 = rVar.g().a(parameterTypes2, objArr, zArr3);
                    if (a13 != null) {
                        Object[] a14 = !zArr3[0] ? rVar.g().a(rVar, parameterTypes2, objArr, a13) : objArr;
                        constructor.setAccessible(true);
                        rVar.a(constructor.newInstance(a14));
                        return;
                    }
                }
                StringBuilder a15 = android.support.v4.media.d.a("method name: new at line: ");
                a15.append(this.f8327b);
                a15.append("(");
                throw new NoSuchMethodException(a0.q.b(a15, this.f8328c, ")"));
            } else if (objArr.length == 2) {
                rVar.a(new z((Number) objArr[0], (Number) objArr[1], null));
            } else if (objArr.length != 3) {
                StringBuilder a16 = android.support.v4.media.d.a("method name: new at line: ");
                a16.append(this.f8327b);
                a16.append("(");
                throw new NoSuchMethodException(a0.q.b(a16, this.f8328c, ")"));
            } else {
                rVar.a(new z((Number) objArr[0], (Number) objArr[1], (Number) objArr[2]));
            }
        } else if (!"fromJson".equals(this.f8341p) || !Map.class.isAssignableFrom(cls2) || objArr.length != 1 || objArr[0] == null) {
            if (cls2.equals(Array.class)) {
                if (this.f8341p.equals("newInstance") && objArr.length == 2) {
                    Object obj3 = objArr[1];
                    if (obj3 instanceof Integer) {
                        rVar.a(Array.newInstance((Class) objArr[0], ((Integer) obj3).intValue()));
                        return;
                    }
                }
                if ("copy".equals(this.f8341p)) {
                    int i11 = this.f8334i;
                    if (i11 == 5) {
                        System.arraycopy(objArr[0], Integer.parseInt(String.valueOf(objArr[1])), objArr[2], Integer.parseInt(String.valueOf(objArr[3])), Integer.parseInt(String.valueOf(objArr[44])));
                        return;
                    } else if (i11 == 2) {
                        Object obj4 = objArr[0];
                        System.arraycopy(obj4, 0, objArr[1], 0, Math.min(Array.getLength(obj4), Array.getLength(objArr[1])));
                        return;
                    } else {
                        StringBuilder a17 = android.support.v4.media.d.a("method name: copy at line: ");
                        a17.append(this.f8327b);
                        a17.append("(");
                        throw new NoSuchMethodException(a0.q.b(a17, this.f8328c, ")"));
                    }
                }
            } else if ("quit".equals(this.f8341p) && cls2.equals(w.class)) {
                rVar.e();
                return;
            }
            if (rVar.g().a((Object) null, cls, this.f8341p, objArr, rVar)) {
                return;
            }
            for (Class<? super Object> cls4 = cls2; cls4 != null; cls4 = cls4.getSuperclass()) {
                boolean[][] zArr4 = new boolean[2];
                Method a18 = rVar.g().a(cls4, this.f8341p, true, objArr, zArr4);
                if (a18 != null) {
                    Object[] a19 = !zArr4[1][0] ? rVar.g().a(rVar, a18.getParameterTypes(), objArr, zArr4[0]) : objArr;
                    a18.setAccessible(true);
                    if (a18.getReturnType() == Void.TYPE) {
                        a18.invoke(null, a19);
                        return;
                    } else {
                        rVar.a(a18.invoke(null, a19));
                        return;
                    }
                }
            }
            while (cls2 != null) {
                for (Method method : cls2.getDeclaredMethods()) {
                    if (method.getName().equals(this.f8341p) && Modifier.isStatic(method.getModifiers()) && (a10 = rVar.g().a((parameterTypes = method.getParameterTypes()), objArr, (zArr = new boolean[1]))) != null) {
                        Object[] a20 = !zArr[0] ? rVar.g().a(rVar, parameterTypes, objArr, a10) : objArr;
                        method.setAccessible(true);
                        if (method.getReturnType() == Void.TYPE) {
                            method.invoke(null, a20);
                            return;
                        } else {
                            rVar.a(method.invoke(null, a20));
                            return;
                        }
                    }
                }
                cls2 = cls2.getSuperclass();
            }
            StringBuilder a21 = android.support.v4.media.d.a("method name: ");
            a21.append(this.f8341p);
            a21.append(" at line: ");
            a21.append(this.f8327b);
            a21.append("(");
            throw new NoSuchMethodException(a0.q.b(a21, this.f8328c, ")"));
        } else {
            this.f8341p = "new";
            a(cls, objArr, rVar);
        }
    }

    public void a(Object obj, r rVar) {
        if (obj instanceof Map) {
            rVar.a(((Map) obj).get(this.f8337l));
        } else if ("length".equals(this.f8337l) && obj.getClass().isArray()) {
            rVar.a(Integer.valueOf(Array.getLength(obj)));
        } else {
            for (Class<?> cls = obj.getClass(); cls != null; cls = cls.getSuperclass()) {
                Field field = null;
                try {
                    field = cls.getDeclaredField(this.f8337l);
                } catch (Throwable unused) {
                }
                if (field != null && !Modifier.isStatic(field.getModifiers())) {
                    field.setAccessible(true);
                    rVar.a(field.get(obj));
                    return;
                }
            }
            x xVar = new x(12);
            xVar.f8327b = this.f8327b;
            xVar.f8328c = this.f8328c;
            StringBuilder a10 = android.support.v4.media.d.a("get");
            a10.append(Character.toUpperCase(this.f8337l.charAt(0)));
            a10.append(this.f8337l.substring(1));
            xVar.f8341p = a10.toString();
            xVar.f8334i = 0;
            xVar.a(obj, new Object[0], rVar);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r17v0, types: [com.mob.commons.cc.x] */
    /* JADX WARN: Type inference failed for: r20v0, types: [com.mob.commons.cc.r] */
    /* JADX WARN: Type inference failed for: r3v125 */
    /* JADX WARN: Type inference failed for: r3v126 */
    /* JADX WARN: Type inference failed for: r3v27, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r3v29, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v31, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r3v32, types: [java.util.ArrayList] */
    public void a(Object obj, Object[] objArr, r rVar) {
        byte[] bArr;
        String[] strArr;
        Object obj2;
        y yVar;
        String str;
        Object obj3;
        Method[] declaredMethods;
        Class<?>[] parameterTypes;
        boolean[] zArr;
        boolean[] a10;
        Object obj4;
        Class[] clsArr;
        Object[] objArr2 = objArr;
        int i10 = 0;
        if (obj instanceof Map) {
            Map map = (Map) obj;
            Object obj5 = map.get(this.f8341p);
            if (obj5 != null) {
                if (obj5 instanceof y) {
                    LinkedList<Object> b10 = ((y) obj5).b(objArr2);
                    if (b10.size() > 0) {
                        rVar.a(b10.get(0));
                        return;
                    }
                    return;
                } else if (obj5 instanceof Method) {
                    rVar.a((Method) obj5, objArr2);
                    return;
                }
            } else if (("proxy".equals(this.f8341p) || "unsafeProxy".equals(this.f8341p)) && objArr2.length == 1 && (obj4 = objArr2[0]) != null) {
                if (obj4 instanceof Class) {
                    clsArr = new Class[]{(Class) obj4};
                } else if (!(obj4 instanceof List)) {
                    StringBuilder a11 = android.support.v4.media.d.a("method name: ");
                    a11.append(this.f8341p);
                    a11.append(" at line: ");
                    a11.append(this.f8327b);
                    a11.append("(");
                    throw new NoSuchMethodException(a0.q.b(a11, this.f8328c, ")"));
                } else {
                    List list = (List) obj4;
                    clsArr = (Class[]) list.toArray(new Class[list.size()]);
                }
                rVar.a(rVar.a(obj, "proxy".equals(this.f8341p), clsArr));
                return;
            } else if ("iterator".equals(this.f8341p) && objArr2.length == 0) {
                rVar.a(map.entrySet().iterator());
                return;
            } else if ("toJson".equals(this.f8341p) && objArr2.length == 0) {
                rVar.a(Class.forName("org.json.JSONObject").getDeclaredConstructor(Map.class).newInstance(obj));
                return;
            }
        } else if (obj instanceof y) {
            y yVar2 = (y) obj;
            if ("test".equals(this.f8341p)) {
                rVar.a(yVar2.a(objArr2));
                return;
            } else if ("currying".equals(this.f8341p)) {
                rVar.a(yVar2.a(rVar, this.f8327b, this.f8328c));
                return;
            }
        } else if (obj instanceof Method) {
            if ("test".equals(this.f8341p)) {
                y.a aVar = new y.a();
                r b11 = rVar.b();
                try {
                    b11.a((Method) obj, objArr2);
                    aVar.f8361b = b11.a();
                } catch (Throwable th2) {
                    aVar.f8360a = th2;
                }
                rVar.a(aVar);
                return;
            }
        } else if (obj instanceof Collection) {
            Collection<Object> collection = (Collection) obj;
            int size = collection.size();
            if ("toArray".equals(this.f8341p) && objArr2.length == 1 && (obj3 = objArr2[0]) != null && (obj3 instanceof Class)) {
                Object newInstance = Array.newInstance((Class) obj3, size);
                for (Object obj6 : collection) {
                    Array.set(newInstance, i10, obj6);
                    i10++;
                }
                rVar.a(newInstance);
                return;
            }
        } else if (obj.getClass().isArray()) {
            if ("iterator".equals(this.f8341p) && objArr2.length == 0) {
                ArrayList arrayList = new ArrayList();
                int length = Array.getLength(obj);
                while (i10 < length) {
                    arrayList.add(Array.get(obj, i10));
                    i10++;
                }
                rVar.a(arrayList.iterator());
                return;
            } else if ("toList".equals(this.f8341p) && objArr2.length == 0) {
                ArrayList arrayList2 = new ArrayList();
                int length2 = Array.getLength(obj);
                while (i10 < length2) {
                    arrayList2.add(Array.get(obj, i10));
                    i10++;
                }
                rVar.a(arrayList2);
                return;
            } else if (obj.getClass().getComponentType() == Byte.TYPE) {
                if ("md5".equals(this.f8341p) && objArr2.length == 0) {
                    byte[] bArr2 = (byte[]) obj;
                    ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr2, 0, bArr2.length);
                    String a12 = a(byteArrayInputStream);
                    byteArrayInputStream.close();
                    rVar.a(a12);
                    return;
                } else if ("hex".equals(this.f8341p) && objArr2.length == 0) {
                    rVar.a(a((byte[]) obj));
                    return;
                } else if ("sha".equals(this.f8341p) && objArr2.length == 1) {
                    MessageDigest messageDigest = MessageDigest.getInstance((String) objArr2[0]);
                    messageDigest.update((byte[]) obj);
                    rVar.a(messageDigest.digest());
                    return;
                }
            }
        } else if (obj instanceof z.a) {
            if ("hasNext".equals(this.f8341p) && objArr2.length == 0) {
                rVar.a(Boolean.valueOf(((z.a) obj).a()));
                return;
            } else if ("next".equals(this.f8341p) && objArr2.length == 0) {
                rVar.a(((z.a) obj).b());
                return;
            }
        } else if (obj instanceof z) {
            if ("iterator".equals(this.f8341p) && objArr2.length == 0) {
                rVar.a(((z) obj).a());
                return;
            } else if ("isInRange".equals(this.f8341p) && objArr2.length == 1) {
                rVar.a(Boolean.valueOf(((z) obj).a((Number) objArr2[0])));
                return;
            } else if ("contains".equals(this.f8341p) && objArr2.length == 1) {
                rVar.a(Boolean.valueOf(((z) obj).b((Number) objArr2[0])));
                return;
            } else if ("boundary".equals(this.f8341p) && objArr2.length == 0) {
                rVar.a(((z) obj).b());
                return;
            }
        } else if (obj instanceof String) {
            if ("getBytes".equals(this.f8341p)) {
                if (objArr2.length == 0) {
                    rVar.a(((String) obj).getBytes());
                    return;
                } else if (objArr2.length == 1) {
                    Object obj7 = objArr2[0];
                    if (obj7 instanceof String) {
                        rVar.a(((String) obj).getBytes((String) obj7));
                        return;
                    }
                }
            } else if ("input".equals(this.f8341p)) {
                if (objArr2.length == 0) {
                    rVar.a(new FileInputStream((String) obj));
                    return;
                } else if (objArr2.length == 1 && (objArr2[0] instanceof y)) {
                    FileInputStream fileInputStream = new FileInputStream((String) obj);
                    ((y) objArr2[0]).b(fileInputStream);
                    fileInputStream.close();
                    return;
                }
            } else if (!"output".equals(this.f8341p)) {
                File file = null;
                String valueOf = null;
                String valueOf2 = null;
                FileInputStream fileInputStream2 = null;
                r3 = 0;
                ?? r32 = 0;
                file = null;
                if ("readFromFile".equals(this.f8341p)) {
                    if (objArr2.length == 0) {
                        valueOf = "utf-8";
                    } else if (objArr2.length == 1) {
                        valueOf = String.valueOf(objArr2[0]);
                    }
                    if (valueOf != null) {
                        FileInputStream fileInputStream3 = new FileInputStream((String) obj);
                        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                        byte[] bArr3 = new byte[4096];
                        while (true) {
                            int read = fileInputStream3.read(bArr3);
                            if (read == -1) {
                                fileInputStream3.close();
                                byteArrayOutputStream.flush();
                                byteArrayOutputStream.close();
                                rVar.a(new String(byteArrayOutputStream.toByteArray(), valueOf));
                                return;
                            }
                            byteArrayOutputStream.write(bArr3, 0, read);
                        }
                    }
                } else if ("writeToFile".equals(this.f8341p)) {
                    if (objArr2.length == 1) {
                        valueOf2 = String.valueOf(objArr2[0]);
                        str = "utf-8";
                    } else if (objArr2.length == 2) {
                        valueOf2 = String.valueOf(objArr2[0]);
                        str = String.valueOf(objArr2[1]);
                    } else {
                        str = null;
                    }
                    if (valueOf2 != null) {
                        FileOutputStream fileOutputStream = new FileOutputStream(valueOf2);
                        fileOutputStream.write(((String) obj).getBytes(str));
                        fileOutputStream.flush();
                        fileOutputStream.close();
                        return;
                    }
                } else if ("readLines".equals(this.f8341p)) {
                    String str2 = "utf-8";
                    if (objArr2.length == 0) {
                        yVar = null;
                        fileInputStream2 = new FileInputStream((String) obj);
                    } else if (objArr2.length == 1) {
                        Object obj8 = objArr2[0];
                        if (obj8 instanceof String) {
                            fileInputStream2 = new FileInputStream((String) obj);
                            str2 = (String) objArr2[0];
                            yVar = null;
                        } else {
                            if (obj8 instanceof y) {
                                fileInputStream2 = new FileInputStream((String) obj);
                                obj2 = objArr2[0];
                                yVar = (y) obj2;
                            }
                            yVar = null;
                        }
                    } else {
                        if (objArr2.length == 2 && (objArr2[0] instanceof String) && (objArr2[1] instanceof y)) {
                            FileInputStream fileInputStream4 = new FileInputStream((String) obj);
                            String str3 = (String) objArr2[0];
                            obj2 = objArr2[1];
                            fileInputStream2 = fileInputStream4;
                            str2 = str3;
                            yVar = (y) obj2;
                        }
                        yVar = null;
                    }
                    if (fileInputStream2 != null) {
                        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(fileInputStream2, str2));
                        String readLine = bufferedReader.readLine();
                        if (yVar == null) {
                            ArrayList arrayList3 = new ArrayList();
                            while (readLine != null) {
                                arrayList3.add(readLine);
                                readLine = bufferedReader.readLine();
                            }
                            rVar.a(arrayList3);
                        } else {
                            while (readLine != null) {
                                yVar.b(readLine);
                                readLine = bufferedReader.readLine();
                            }
                        }
                        bufferedReader.close();
                        return;
                    }
                } else if ("writeLines".equals(this.f8341p)) {
                    String str4 = "utf-8";
                    if (objArr2.length >= 1) {
                        if (objArr2.length == 2) {
                            Object obj9 = objArr2[1];
                            if (obj9 instanceof String) {
                                str4 = (String) obj9;
                            }
                        }
                        Object obj10 = objArr2[0];
                        if (obj10 instanceof String) {
                            r32 = new ArrayList();
                            r32.add(objArr2[0]);
                        } else if (obj10 instanceof Collection) {
                            r32 = (Collection) obj10;
                        } else if (obj10.getClass().isArray()) {
                            r32 = new ArrayList();
                            int length3 = Array.getLength(objArr2[0]);
                            for (int i11 = 0; i11 < length3; i11++) {
                                r32.add(Array.get(objArr2[0], i11));
                            }
                        }
                    }
                    if (r32 != 0) {
                        FileOutputStream fileOutputStream2 = new FileOutputStream((String) obj);
                        for (Object obj11 : r32) {
                            fileOutputStream2.write((obj11 + "\r\n").getBytes(str4));
                        }
                        fileOutputStream2.flush();
                        fileOutputStream2.close();
                        return;
                    }
                } else if ("exec".equals(this.f8341p)) {
                    if (objArr2.length == 0) {
                        rVar.a(Runtime.getRuntime().exec((String) obj));
                        return;
                    } else if (objArr2.length == 1 || objArr2.length == 2) {
                        Object obj12 = objArr2[0];
                        if (obj12 instanceof String[]) {
                            strArr = (String[]) obj12;
                        } else if (obj12 instanceof List) {
                            List list2 = (List) obj12;
                            int size2 = list2.size();
                            String[] strArr2 = new String[size2];
                            for (int i12 = 0; i12 < size2; i12++) {
                                Object obj13 = list2.get(i12);
                                strArr2[i12] = obj13 == null ? null : String.valueOf(obj13);
                            }
                            strArr = strArr2;
                        } else {
                            strArr = null;
                        }
                        if (objArr2.length == 2) {
                            Object obj14 = objArr2[1];
                            if (obj14 instanceof File) {
                                file = (File) obj14;
                            }
                        }
                        if (strArr != null) {
                            rVar.a(Runtime.getRuntime().exec((String) obj, strArr, file));
                            return;
                        }
                    }
                } else if ("fromHex".equals(this.f8341p) && objArr2.length == 0) {
                    String str5 = (String) obj;
                    int length4 = str5.length();
                    if (length4 % 2 == 1) {
                        length4++;
                        bArr = new byte[length4 / 2];
                        str5 = a.b.b("0", str5);
                    } else {
                        bArr = new byte[length4 / 2];
                    }
                    int i13 = 0;
                    while (i10 < length4) {
                        int i14 = i10 + 2;
                        bArr[i13] = (byte) Integer.parseInt(str5.substring(i10, i14), 16);
                        i13++;
                        i10 = i14;
                    }
                    rVar.a(bArr);
                    return;
                }
            } else if (objArr2.length == 0) {
                rVar.a(new FileOutputStream((String) obj));
                return;
            } else if (objArr2.length == 1 && (objArr2[0] instanceof y)) {
                FileOutputStream fileOutputStream3 = new FileOutputStream((String) obj);
                ((y) objArr2[0]).b(fileOutputStream3);
                fileOutputStream3.flush();
                fileOutputStream3.close();
                return;
            }
        } else if (obj instanceof InputStream) {
            if ("toDataInputStream".equals(this.f8341p) && objArr2.length == 0) {
                rVar.a(new DataInputStream((InputStream) obj));
                return;
            } else if ("toBufferedInputStream".equals(this.f8341p) && objArr2.length == 0) {
                rVar.a(new BufferedInputStream((InputStream) obj));
                return;
            } else if ("toGZIPInputStream".equals(this.f8341p) && objArr2.length == 0) {
                rVar.a(new GZIPInputStream((InputStream) obj));
                return;
            } else if ("toObjectInputStream".equals(this.f8341p) && objArr2.length == 0) {
                rVar.a(new ObjectInputStream((InputStream) obj));
                return;
            } else if ("md5".equals(this.f8341p) && objArr2.length == 0) {
                a((InputStream) obj);
            }
        } else if (obj instanceof OutputStream) {
            if ("toDataOutputStream".equals(this.f8341p) && objArr2.length == 0) {
                rVar.a(new DataOutputStream((OutputStream) obj));
                return;
            } else if ("toBufferedOutputStream".equals(this.f8341p) && objArr2.length == 0) {
                rVar.a(new BufferedOutputStream((OutputStream) obj));
                return;
            } else if ("toGZIPOutputStream".equals(this.f8341p) && objArr2.length == 0) {
                rVar.a(new GZIPOutputStream((OutputStream) obj));
                return;
            } else if ("toObjectOutputStream".equals(this.f8341p) && objArr2.length == 0) {
                rVar.a(new ObjectOutputStream((OutputStream) obj));
                return;
            }
        } else if (obj instanceof Class) {
            if ("import".equals(this.f8341p)) {
                if (objArr2.length == 0) {
                    Class cls = (Class) obj;
                    rVar.a(cls.getSimpleName(), cls);
                    return;
                } else if (objArr2.length == 1) {
                    Object obj15 = objArr2[0];
                    if (obj15 instanceof String) {
                        rVar.a((String) obj15, (Class) obj);
                        return;
                    }
                }
            }
        } else if ((obj instanceof Throwable) && "throw".equals(this.f8341p) && objArr2.length == 0) {
            throw ((Throwable) obj);
        }
        if ("lock".equals(this.f8341p) && objArr2.length > 0 && (objArr2[0] instanceof y)) {
            synchronized (obj) {
                y yVar3 = (y) objArr2[0];
                int length5 = objArr2.length - 1;
                Object[] objArr3 = new Object[length5];
                if (objArr2.length > 1) {
                    System.arraycopy(objArr2, 1, objArr3, 0, length5);
                }
                LinkedList<Object> b12 = yVar3.b(objArr3);
                if (!b12.isEmpty()) {
                    rVar.a(b12.get(0));
                }
            }
            return;
        }
        Class<?> cls2 = obj.getClass();
        if (rVar.g().a(obj, cls2, this.f8341p, objArr, (r) rVar)) {
            return;
        }
        for (Class<?> cls3 = cls2; cls3 != null; cls3 = cls3.getSuperclass()) {
            boolean[][] zArr2 = new boolean[2];
            Method a13 = rVar.g().a(cls3, this.f8341p, false, objArr, zArr2);
            if (a13 != null) {
                if (!zArr2[1][0]) {
                    objArr2 = rVar.g().a(rVar, a13.getParameterTypes(), objArr2, zArr2[0]);
                }
                a13.setAccessible(true);
                if (a13.getReturnType() == Void.TYPE) {
                    a13.invoke(obj, objArr2);
                    return;
                } else {
                    rVar.a(a13.invoke(obj, objArr2));
                    return;
                }
            }
        }
        while (cls2 != null) {
            for (Method method : cls2.getDeclaredMethods()) {
                if (method.getName().equals(this.f8341p) && !Modifier.isStatic(method.getModifiers()) && (a10 = rVar.g().a((parameterTypes = method.getParameterTypes()), objArr2, (zArr = new boolean[1]))) != null) {
                    if (!zArr[0]) {
                        objArr2 = rVar.g().a(rVar, parameterTypes, objArr2, a10);
                    }
                    method.setAccessible(true);
                    if (method.getReturnType() == Void.TYPE) {
                        method.invoke(obj, objArr2);
                        return;
                    } else {
                        rVar.a(method.invoke(obj, objArr2));
                        return;
                    }
                }
            }
            cls2 = cls2.getSuperclass();
        }
        StringBuilder a14 = android.support.v4.media.d.a("method name: ");
        a14.append(this.f8341p);
        a14.append(" at line: ");
        a14.append(this.f8327b);
        a14.append("(");
        throw new NoSuchMethodException(a0.q.b(a14, this.f8328c, ")"));
    }
}
