package com.mob.commons;

import android.text.TextUtils;
import android.util.Base64;
import cn.sharesdk.framework.ShareSDK;
import com.mob.MobSDK;
import com.mob.tools.MobLog;
import com.mob.tools.utils.DH;
import com.mob.tools.utils.Data;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public class v {

    /* renamed from: a */
    public static final String[] f8525a = {ShareSDK.SDK_TAG, o.a("0064ehgiehehfihj"), "MOBLINK", "MOBPUSH", o.a("0097ehgdgggfgdgeegfkii"), o.a("008Ogiflfjejfiehfihj"), "MOBGUARD"};

    /* renamed from: b */
    private static AtomicBoolean f8526b = new AtomicBoolean(false);

    /* renamed from: c */
    private static final HashMap<String, MobProduct> f8527c = new HashMap<>();

    /* renamed from: d */
    private static String f8528d;

    private static synchronized String a(final ArrayList<MobProduct> arrayList, final int i10) {
        String str;
        synchronized (v.class) {
            final String[] strArr = {""};
            DH.RequestBuilder carrier = DH.requester(MobSDK.getContext()).getMIUIVersion().getNetworkTypeForStatic().getCarrier();
            if (s.b()) {
                carrier.getDeviceKey();
            } else {
                carrier.getDeviceKeyFromCache(true);
            }
            carrier.request(new DH.DHResponder() { // from class: com.mob.commons.v.2
                @Override // com.mob.tools.utils.DH.DHResponder
                public void onResponse(DH.DHResponse dHResponse) {
                    String str2;
                    String str3;
                    int i11;
                    try {
                        String str4 = "";
                        String encode = TextUtils.isEmpty(DH.SyncMtd.getPackageName()) ? "" : URLEncoder.encode(DH.SyncMtd.getPackageName(), "utf-8");
                        String encode2 = TextUtils.isEmpty(DH.SyncMtd.getAppVersionName()) ? "" : URLEncoder.encode(DH.SyncMtd.getAppVersionName(), "utf-8");
                        String encode3 = TextUtils.isEmpty(DH.SyncMtd.getManufacturer()) ? "" : URLEncoder.encode(DH.SyncMtd.getManufacturer(), "utf-8");
                        String encode4 = TextUtils.isEmpty(DH.SyncMtd.getModel()) ? "" : URLEncoder.encode(DH.SyncMtd.getModel(), "utf-8");
                        String encode5 = TextUtils.isEmpty(dHResponse.getMIUIVersion()) ? "" : URLEncoder.encode(dHResponse.getMIUIVersion(), "utf-8");
                        String encode6 = TextUtils.isEmpty(DH.SyncMtd.getOSVersionName()) ? "" : URLEncoder.encode(DH.SyncMtd.getOSVersionName(), "utf-8");
                        HashMap<String, Object> b10 = o.a().b();
                        String str5 = o.a("004GejghghBg") + encode + ";" + encode2;
                        String str6 = o.a("012]ehiieh$gLejdk>h_dhecdeCh1jd") + DH.SyncMtd.getOSVersionInt() + ";" + encode6;
                        int i12 = 0;
                        String str7 = o.a("004HehfiegBg") + (s.b() ? dHResponse.getDeviceKey() : dHResponse.getDeviceKeyFromCache(new int[0]));
                        String str8 = o.a("003+fkgi[g") + encode3 + ";" + encode4;
                        if (!TextUtils.isEmpty(encode5)) {
                            str8 = str8 + ";" + encode5;
                        }
                        String str9 = o.a("0031efgdNg") + dHResponse.getNetworkTypeForStatic() + ";" + dHResponse.getCarrier();
                        String str10 = o.a("005+ekdfdkff:g") + Locale.getDefault().toString().replace(o.a("002Ghidh"), "-");
                        String str11 = o.a("004YggekgfMg") + MobSDK.SDK_VERSION_CODE;
                        String a10 = o.a("004:ehfihj-g");
                        if (!arrayList.isEmpty()) {
                            int size = arrayList.size();
                            while (i12 < size) {
                                String str12 = str4;
                                try {
                                    MobProduct mobProduct = (MobProduct) arrayList.get(i12);
                                    if (i12 != 0) {
                                        i11 = size;
                                        try {
                                            a10 = a10 + ",";
                                        } catch (Throwable unused) {
                                        }
                                    } else {
                                        i11 = size;
                                    }
                                    try {
                                        StringBuilder sb2 = new StringBuilder();
                                        sb2.append(a10);
                                        String str13 = a10;
                                        try {
                                            sb2.append(mobProduct.getProductTag());
                                            sb2.append(";");
                                            sb2.append(mobProduct.getSdkver());
                                            sb2.append(";");
                                            sb2.append(b10.get(mobProduct.getProductTag()));
                                            a10 = sb2.toString();
                                        } catch (Throwable unused2) {
                                            a10 = str13;
                                        }
                                    } catch (Throwable unused3) {
                                    }
                                } catch (Throwable unused4) {
                                    i11 = size;
                                }
                                i12++;
                                size = i11;
                                str4 = str12;
                            }
                        }
                        String str14 = str4;
                        String str15 = "DC/6";
                        int i13 = i10;
                        if (i13 == 1) {
                            str15 = "DC/[DC]";
                        } else if (i13 == 2) {
                            str15 = "DC/[DC2]";
                        }
                        String timezone = DH.SyncMtd.getTimezone();
                        if (TextUtils.isEmpty(timezone)) {
                            str2 = str14;
                        } else {
                            str2 = o.a("003Reikddd") + timezone;
                        }
                        String c10 = x.a().c();
                        String str16 = "TID/";
                        if (!TextUtils.isEmpty(c10)) {
                            str16 = "TID/" + c10;
                        }
                        String str17 = "IED/";
                        String e10 = v.e();
                        if (TextUtils.isEmpty(e10)) {
                            str3 = str16;
                        } else {
                            str3 = str16;
                            str17 = "IED/" + e10;
                        }
                        int a11 = com.mob.commons.cc.a.a();
                        StringBuilder sb3 = new StringBuilder();
                        String str18 = str17;
                        sb3.append("SVM/");
                        sb3.append(a11);
                        String sb4 = sb3.toString();
                        if (com.mob.tools.a.d.b()) {
                            if (!o.a("0042ehfihj]g").equals(a10)) {
                                a10 = a10 + ",";
                            }
                            a10 = a10 + "CS;" + a11;
                        }
                        String str19 = "RD/";
                        String f10 = t.a().f();
                        if (!TextUtils.isEmpty(f10)) {
                            str19 = "RD/" + f10;
                        }
                        strArr[0] = str5 + " " + str6 + " " + str7 + " " + str8 + " " + str9 + " " + str10 + " " + str11 + " " + a10 + " " + str15 + " " + str2 + " " + str3 + " " + str18 + " " + sb4 + " " + str19;
                    } catch (Throwable th2) {
                        MobLog.getInstance().w(th2);
                    }
                }
            });
            str = strArr[0];
        }
        return str;
    }

    public static void a() {
        f();
        u.f8516c.execute(new com.mob.tools.utils.e() { // from class: com.mob.commons.v.1
            @Override // com.mob.tools.utils.e
            public void a() {
                MobLog.getInstance().d("init sks start", new Object[0]);
                v.b();
                MobLog.getInstance().d("init sks over", new Object[0]);
            }
        });
    }

    public static synchronized void a(MobProduct mobProduct) {
        synchronized (v.class) {
            if (mobProduct != null) {
                HashMap<String, MobProduct> hashMap = f8527c;
                if (!hashMap.containsKey(mobProduct.getProductTag())) {
                    hashMap.put(mobProduct.getProductTag(), mobProduct);
                }
            }
        }
    }

    public static synchronized ArrayList<MobProduct> b() {
        ArrayList<MobProduct> arrayList;
        synchronized (v.class) {
            if (f8526b.compareAndSet(false, true)) {
                f8527c.putAll(g());
            }
            arrayList = new ArrayList<>();
            arrayList.addAll(f8527c.values());
        }
        return arrayList;
    }

    public static synchronized String c() {
        String a10;
        synchronized (v.class) {
            a10 = a(b(), 0);
        }
        return a10;
    }

    public static synchronized String d() {
        String a10;
        synchronized (v.class) {
            a10 = a(b(), 2);
        }
        return a10;
    }

    public static /* synthetic */ String e() {
        return h();
    }

    private static void f() {
        try {
            MOBLINK moblink = new MOBLINK();
            if (moblink instanceof MobProduct) {
                moblink.getProductTag();
            }
        } catch (Throwable unused) {
        }
    }

    private static HashMap<String, MobProduct> g() {
        HashMap<String, MobProduct> hashMap = new HashMap<>();
        for (Object obj : p.f8484a) {
            try {
                Class<?> cls = obj instanceof String ? Class.forName(String.valueOf(obj).trim()) : (Class) obj;
                if (!MobProduct.class.isAssignableFrom(cls) || MobProduct.class.equals(cls)) {
                    cls.newInstance();
                } else {
                    MobProduct mobProduct = (MobProduct) cls.newInstance();
                    String productTag = mobProduct.getProductTag();
                    String[] strArr = f8525a;
                    int length = strArr.length;
                    int i10 = 0;
                    while (true) {
                        if (i10 < length) {
                            String str = strArr[i10];
                            if (str.equals(productTag)) {
                                hashMap.put(str, mobProduct);
                                break;
                            }
                            i10++;
                        }
                    }
                }
            } catch (Throwable unused) {
            }
        }
        return hashMap;
    }

    private static String h() {
        if (TextUtils.isEmpty(f8528d)) {
            String o10 = com.mob.tools.a.c.a(MobSDK.getContext()).b().o();
            if (!TextUtils.isEmpty(o10)) {
                try {
                    String encodeToString = Base64.encodeToString(Data.AES128Encode(Data.MD5(DH.SyncMtd.getManufacturer()), o10), 2);
                    f8528d = encodeToString;
                    return encodeToString;
                } catch (Throwable th2) {
                    MobLog.getInstance().d(th2);
                }
            }
            return null;
        }
        return f8528d;
    }
}
