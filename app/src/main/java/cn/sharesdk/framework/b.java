package cn.sharesdk.framework;

import android.text.TextUtils;
import cn.sharesdk.framework.utils.SSDKLog;
import com.mob.MobSDK;
import com.mob.tools.network.KVPair;
import com.mob.tools.network.NetworkHelper;
import com.mob.tools.utils.DH;
import com.mob.tools.utils.Hashon;
import java.util.ArrayList;
import java.util.HashMap;

/* loaded from: classes.dex */
public class b {

    /* renamed from: a */
    private static volatile b f5206a;

    /* renamed from: b */
    private NetworkHelper f5207b = new NetworkHelper();

    /* renamed from: c */
    private String f5208c = MobSDK.checkRequestUrl("api-share.mob.com");

    private b() {
    }

    public static b a() {
        synchronized (b.class) {
            if (f5206a == null) {
                synchronized (b.class) {
                    if (f5206a == null) {
                        f5206a = new b();
                    }
                }
            }
        }
        return f5206a;
    }

    public String c() {
        return androidx.activity.e.b(new StringBuilder(), this.f5208c, "/conf5");
    }

    public void b() {
        try {
            DH.requester(MobSDK.getContext()).getDeviceKey().getDetailNetworkTypeForStatic().request(new DH.DHResponder() { // from class: cn.sharesdk.framework.b.1
                @Override // com.mob.tools.utils.DH.DHResponder
                public void onResponse(DH.DHResponse dHResponse) {
                    try {
                        ArrayList<KVPair<String>> arrayList = new ArrayList<>();
                        String appkey = MobSDK.getAppkey();
                        if (TextUtils.isEmpty(appkey)) {
                            return;
                        }
                        arrayList.add(new KVPair<>("appkey", appkey));
                        arrayList.add(new KVPair<>("device", dHResponse.getDeviceKey()));
                        arrayList.add(new KVPair<>("plat", String.valueOf(DH.SyncMtd.getPlatformCode())));
                        arrayList.add(new KVPair<>("apppkg", DH.SyncMtd.getPackageName()));
                        arrayList.add(new KVPair<>("appver", String.valueOf(DH.SyncMtd.getAppVersion())));
                        arrayList.add(new KVPair<>("sdkver", String.valueOf(ShareSDK.SDK_VERSION_CODE)));
                        arrayList.add(new KVPair<>("networktype", dHResponse.getDetailNetworkTypeForStatic()));
                        ArrayList<KVPair<String>> arrayList2 = new ArrayList<>();
                        arrayList2.add(new KVPair<>("User-Identity", cn.sharesdk.framework.network.a.a()));
                        NetworkHelper.NetworkTimeOut networkTimeOut = new NetworkHelper.NetworkTimeOut();
                        networkTimeOut.readTimout = 10000;
                        networkTimeOut.connectionTimeout = 10000;
                        HashMap fromJson = new Hashon().fromJson(b.this.f5207b.httpPost(b.this.c(), arrayList, (KVPair<String>) null, arrayList2, networkTimeOut));
                        if (fromJson.containsKey("error")) {
                            if (String.valueOf(fromJson.get("error")).contains("'appkey' is illegal")) {
                                a.f5086a = true;
                            }
                        } else {
                            a.f5087b = appkey;
                        }
                    } catch (Throwable th2) {
                        SSDKLog.b().a(cn.sharesdk.facebook.e.a("updateServerConfig ", th2), new Object[0]);
                    }
                }
            });
        } catch (Throwable th2) {
            SSDKLog.b().a(th2);
        }
    }
}
