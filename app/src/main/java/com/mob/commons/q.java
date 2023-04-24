package com.mob.commons;

import android.text.TextUtils;
import com.mob.MobSDK;
import com.mob.tools.MobLog;
import com.mob.tools.utils.DH;
import java.util.HashMap;

/* loaded from: classes.dex */
public class q {
    public static HashMap<String, Object> a(String str) {
        HashMap<String, Object> hashMap = new HashMap<>();
        hashMap.put(i.a("006Dfh1gg7fl!k0fk"), MobSDK.getAppkey());
        hashMap.put(i.a("006IfhZggg;flhh"), DH.SyncMtd.getPackageName());
        hashMap.put(i.a("006Ofh,gglk-fj"), DH.SyncMtd.getAppVersionName());
        hashMap.put(i.a("004g'gffh:f"), String.valueOf(DH.SyncMtd.getPlatformCode()));
        hashMap.put(i.a("0115fmAkfRhfgefjfl;fIfk6gk"), str);
        String b10 = e.b();
        if (!TextUtils.isEmpty(b10)) {
            hashMap.put(i.a("004j_fefgIj"), b10);
        }
        return hashMap;
    }

    public static void a() {
        try {
            s.a(false);
        } catch (Throwable th2) {
            MobLog.getInstance().w(th2);
        }
    }

    public static void b() {
        s.a(true);
    }

    public static int c() {
        int d10 = s.d();
        if (d10 == 1) {
            return 1;
        }
        if (d10 == 0) {
            return -1;
        }
        return w.a().a(w.f8539h, n.f8475e) ? 0 : 2;
    }

    public static boolean d() {
        int c10 = c();
        if (c10 == 2 || c10 == 1) {
            return b.b();
        }
        return false;
    }

    public static boolean e() {
        Boolean isGpAvailable = MobSDK.isGpAvailable();
        if (isGpAvailable == null || !isGpAvailable.booleanValue()) {
            MobLog.getInstance().w("Service unavailable due to Google Play Services is unavailable!");
            return true;
        }
        int c10 = c();
        if (c10 == 2 || c10 == 1) {
            s.f();
            return true ^ b.a();
        }
        return true;
    }

    public static HashMap<String, Object> f() {
        final HashMap<String, Object> hashMap = new HashMap<>();
        DH.RequestBuilder requester = DH.requester(MobSDK.getContext());
        requester.getIMEI().getSerialno().getCarrier().getNetworkType().getMIUIVersion().getSignMD5().getIMSI();
        requester.request(new DH.DHResponder() { // from class: com.mob.commons.q.1
            @Override // com.mob.tools.utils.DH.DHResponder
            public void onResponse(DH.DHResponse dHResponse) {
                hashMap.put(i.a("006'fhWgg3fl0kMfk"), MobSDK.getAppkey());
                hashMap.put(i.a("006Bhi7j5flKlk$fj"), Integer.valueOf(MobSDK.SDK_VERSION_CODE));
                hashMap.put(i.a("004g8gffhKf"), 1);
                hashMap.put(i.a("004j!fefg9j"), e.a((MobProduct) null));
                hashMap.put(i.a("006_fh*gggDflhh"), MobSDK.getContext().getPackageName());
                hashMap.put(i.a("006;fhNgglk?fj"), Integer.valueOf(DH.SyncMtd.getAppVersion()));
                hashMap.put("iemt", dHResponse.getIMEI());
                hashMap.put("snmt", dHResponse.getSerialno());
                hashMap.put(i.a("007ZfifhfjfjfgXk1fj"), dHResponse.getCarrier());
                hashMap.put(i.a("005nLge8jkKgf"), DH.SyncMtd.getModel());
                hashMap.put(i.a("007BhjfhfiHf8gefjfk"), DH.SyncMtd.getManufacturer());
                hashMap.put(i.a("011?fmPkf-hfgefjflgkfk0gk"), dHResponse.getNetworkType());
                hashMap.put(i.a("006IhifkhiWlk.fj"), DH.SyncMtd.getOSVersionName());
                hashMap.put(i.a("005;fefgVlk+fj"), dHResponse.getMIUIVersion());
                hashMap.put(i.a("0097hifkhi4lk!fjfgfm?f"), Integer.valueOf(DH.SyncMtd.getOSVersionInt()));
                hashMap.put(i.a("010$figffgZk;fmGfBgkfg'nk"), Long.valueOf(System.currentTimeMillis()));
                hashMap.put(i.a("006[fhLggnjLjg"), dHResponse.getSignMD5());
                hashMap.put("ismt", dHResponse.getIMSI());
                hashMap.put(i.a("005[hefjfhfmZj"), DH.SyncMtd.getBrand());
            }
        });
        return hashMap;
    }
}
