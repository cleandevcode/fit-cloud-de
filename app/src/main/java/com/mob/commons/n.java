package com.mob.commons;

import android.content.Context;
import android.os.Bundle;
import cn.sharesdk.framework.ShareSDK;
import com.mob.MobSDK;
import com.mob.tools.MobLog;
import java.io.ObjectInputStream;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.zip.GZIPInputStream;

/* loaded from: classes.dex */
public class n {

    /* renamed from: a */
    public static volatile String f8471a = null;

    /* renamed from: b */
    public static volatile String f8472b = null;

    /* renamed from: c */
    public static volatile InternationalDomain f8473c = null;

    /* renamed from: d */
    public static volatile boolean f8474d = false;

    /* renamed from: e */
    public static volatile boolean f8475e = true;

    /* renamed from: f */
    public static volatile boolean f8476f = false;

    /* renamed from: g */
    public static volatile boolean f8477g = true;

    /* renamed from: h */
    public static volatile boolean f8478h = false;

    /* renamed from: i */
    public static volatile String f8479i;

    /* renamed from: j */
    private static AtomicBoolean f8480j = new AtomicBoolean(false);

    /* renamed from: k */
    private static HashMap<String, HashMap<String, Object>> f8481k = new HashMap<>();

    public static <T> T a(String str) {
        try {
            Bundle bundle = com.mob.tools.a.c.a(MobSDK.getContext()).b().a(false, 0, MobSDK.getContext().getPackageName(), 128).applicationInfo.metaData;
            if (bundle != null) {
                T t10 = (T) bundle.get(str);
                if (b("009@fhdbebghgc?ccd7ef").equals(str) && t10 != null && (t10 instanceof String)) {
                    return (T) Boolean.valueOf(b("003$chMh$ef").equalsIgnoreCase(String.valueOf(t10)));
                }
                if (t10 != null) {
                    return t10;
                }
                return null;
            }
            return null;
        } catch (Throwable th2) {
            MobLog.getInstance().d(th2);
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v5 */
    public static <T> T a(String str, Class<T> cls, MobProduct mobProduct) {
        T t10;
        ObjectInputStream objectInputStream;
        HashMap<String, Object> hashMap;
        Object obj;
        Class cls2;
        T cast;
        boolean z10;
        T t11 = null;
        try {
            String a10 = a(mobProduct);
            if (f8481k.containsKey(a10)) {
                hashMap = f8481k.get(a10);
                objectInputStream = null;
            } else {
                objectInputStream = new ObjectInputStream(new GZIPInputStream(MobSDK.getContext().getResources().getAssets().open(a10)));
                try {
                    HashMap<String, Object> hashMap2 = (HashMap) objectInputStream.readObject();
                    if (hashMap2 != null && !hashMap2.isEmpty()) {
                        f8481k.put(a10, hashMap2);
                    }
                    hashMap = hashMap2;
                    objectInputStream = objectInputStream;
                } catch (Throwable th2) {
                    th = th2;
                    obj = null;
                    t11 = (T) objectInputStream;
                    t10 = obj;
                    try {
                        MobLog.getInstance().d(th);
                        C0744r.a(t11);
                        return t10;
                    } catch (Throwable th3) {
                        C0744r.a(t11);
                        throw th3;
                    }
                }
            }
            if (hashMap != null && !hashMap.isEmpty()) {
                obj = hashMap.get(str);
                if (b("009-fhdbebghgc_ccd:ef").equals(str) && obj != 0 && (obj instanceof String)) {
                    if (!b("003NchWhQef").equalsIgnoreCase(String.valueOf(obj)) && !b("004cTcgcbGh").equalsIgnoreCase(String.valueOf(obj))) {
                        z10 = false;
                        t11 = (T) Boolean.valueOf(z10);
                    }
                    z10 = true;
                    t11 = (T) Boolean.valueOf(z10);
                } else if (obj != null) {
                    if (cls != null) {
                        if (cls != Void.class) {
                            try {
                                if (cls == Boolean.TYPE) {
                                    if (obj instanceof String) {
                                        cast = (T) Boolean.valueOf((String) obj);
                                        t11 = cast;
                                    } else {
                                        cls2 = Boolean.class;
                                        cast = (T) cls2.cast(obj);
                                        t11 = cast;
                                    }
                                } else if (cls == Integer.TYPE) {
                                    if (obj instanceof String) {
                                        cast = (T) Integer.valueOf((String) obj);
                                        t11 = cast;
                                    } else {
                                        cls2 = Integer.class;
                                        cast = (T) cls2.cast(obj);
                                        t11 = cast;
                                    }
                                } else if (cls != Byte.TYPE) {
                                    cls2 = Character.TYPE;
                                    if (cls == cls2) {
                                        if (!(obj instanceof String)) {
                                            cls2 = Character.class;
                                        }
                                    } else if (cls == Short.TYPE) {
                                        if (obj instanceof String) {
                                            cast = (T) Short.valueOf((String) obj);
                                            t11 = cast;
                                        } else {
                                            cls2 = Short.class;
                                        }
                                    } else if (cls == Long.TYPE) {
                                        if (obj instanceof String) {
                                            cast = (T) Long.valueOf((String) obj);
                                            t11 = cast;
                                        } else {
                                            cls2 = Long.class;
                                        }
                                    } else if (cls != Float.TYPE) {
                                        if (cls != Double.TYPE) {
                                            cast = cls.cast(obj);
                                        } else if (obj instanceof String) {
                                            cast = (T) Double.valueOf((String) obj);
                                        } else {
                                            cls2 = Double.class;
                                        }
                                        t11 = cast;
                                    } else if (obj instanceof String) {
                                        cast = (T) Float.valueOf((String) obj);
                                        t11 = cast;
                                    } else {
                                        cls2 = Float.class;
                                    }
                                    cast = (T) cls2.cast(obj);
                                    t11 = cast;
                                } else if (obj instanceof String) {
                                    cast = (T) Byte.valueOf((String) obj);
                                    t11 = cast;
                                } else {
                                    cls2 = Byte.class;
                                    cast = (T) cls2.cast(obj);
                                    t11 = cast;
                                }
                            } catch (Throwable th4) {
                                try {
                                    MobLog.getInstance().d(th4);
                                } catch (Throwable th5) {
                                    th = th5;
                                    t11 = (T) objectInputStream;
                                    t10 = obj;
                                    MobLog.getInstance().d(th);
                                    C0744r.a(t11);
                                    return t10;
                                }
                            }
                        }
                    }
                    t11 = obj;
                }
            }
            C0744r.a(objectInputStream);
            return t11;
        } catch (Throwable th6) {
            th = th6;
            t10 = null;
        }
    }

    private static String a(MobProduct mobProduct) {
        String str;
        if (mobProduct != null) {
            try {
                String productTag = mobProduct.getProductTag();
                if (ShareSDK.SDK_TAG.equals(productTag)) {
                    str = "ShareSDK.mt";
                } else if (b("006Kdgfhdgdgehgi").equals(productTag)) {
                    str = "SMSSDK.mt";
                } else if ("MOBLINK".equals(productTag)) {
                    str = "MobLink.mt";
                } else if ("MOBPUSH".equals(productTag)) {
                    str = "MobPush.mt";
                } else if (!b("009Kdgfcfffefcfddfejhh").equals(productTag)) {
                    return "MobSDK.mt";
                } else {
                    str = "SecVerify.mt";
                }
                return str;
            } catch (Throwable th2) {
                MobLog.getInstance().d(th2);
                return "MobSDK.mt";
            }
        }
        return "MobSDK.mt";
    }

    public static void a(Context context) {
        try {
            if (f8480j.compareAndSet(false, true)) {
                try {
                    if (f8471a == null) {
                        f8471a = (String) MobMeta.get(null, "Mob-AppKey", String.class, null);
                    }
                    if (f8472b == null) {
                        f8472b = (String) MobMeta.get(null, "Mob-AppSecret", String.class, null);
                    }
                    if (f8472b == null) {
                        f8472b = (String) MobMeta.get(null, "Mob-AppSeret", String.class, null);
                    }
                } catch (Throwable unused) {
                }
                String str = (String) MobMeta.get(null, b("0069ehdbYk$cecdcj"), String.class, null);
                if (str != null) {
                    f8473c = InternationalDomain.domainOf(str);
                }
                f8479i = (String) MobMeta.get(null, "Mob-OdVivoAppId", String.class, null);
                String b10 = b("009$fhdbebghgc^ccd[ef");
                Class cls = Boolean.TYPE;
                Boolean bool = Boolean.FALSE;
                f8474d = ((Boolean) MobMeta.get(null, b10, cls, bool)).booleanValue();
                f8475e = ((Boolean) MobMeta.get(null, b("015Ufhdbebghfg4d(deJh cf!h0efefcecgch"), cls, Boolean.valueOf(f8475e))).booleanValue();
                f8476f = ((Boolean) MobMeta.get(null, b("006=fhdbebghfehd"), cls, bool)).booleanValue();
                f8477g = ((Boolean) MobMeta.get(null, "Mob-elog", cls, Boolean.TRUE)).booleanValue();
                f8478h = ((Boolean) MobMeta.get(null, "Mob-GPP", cls, bool)).booleanValue();
            }
        } catch (Throwable th2) {
            MobLog.getInstance().d(th2);
        }
    }

    public static String b(String str) {
        return C0744r.a(str, 98);
    }
}
