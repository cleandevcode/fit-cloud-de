package cn.sharesdk.framework.a;

import android.text.TextUtils;
import android.util.Base64;
import cn.sharesdk.framework.ShareSDK;
import cn.sharesdk.framework.ShareSDKCallback;
import cn.sharesdk.framework.a.a.e;
import cn.sharesdk.framework.utils.SSDKLog;
import com.mob.MobCommunicator;
import com.mob.MobSDK;
import com.mob.tools.network.KVPair;
import com.mob.tools.network.NetworkHelper;
import com.mob.tools.utils.DH;
import com.mob.tools.utils.Data;
import com.mob.tools.utils.Hashon;
import com.mob.tools.utils.ResHelper;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.HashMap;
import no.nordicsemi.android.dfu.DfuBaseService;

/* loaded from: classes.dex */
public class c {

    /* renamed from: h */
    private static MobCommunicator f5156h;

    /* renamed from: a */
    private e f5157a = e.a();

    /* renamed from: b */
    private NetworkHelper f5158b = new NetworkHelper();

    /* renamed from: c */
    private Hashon f5159c = new Hashon();

    /* renamed from: d */
    private String f5160d;

    /* renamed from: e */
    private String f5161e;

    /* renamed from: f */
    private boolean f5162f;

    /* renamed from: g */
    private HashMap<String, String> f5163g;

    public c() {
        try {
            this.f5163g = (HashMap) this.f5157a.k("buffered_server_paths");
        } catch (Throwable unused) {
            this.f5163g = new HashMap<>();
        }
        h();
    }

    private String a(String str, HashMap<String, String> hashMap) {
        boolean c10 = this.f5157a.c();
        boolean d10 = this.f5157a.d();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(Data.urlEncode(DH.SyncMtd.getPackageName(), "utf-8"));
        sb2.append("|");
        sb2.append(Data.urlEncode(DH.SyncMtd.getAppVersionName(), "utf-8"));
        sb2.append("|");
        sb2.append(Data.urlEncode(String.valueOf(ShareSDK.SDK_VERSION_CODE), "utf-8"));
        sb2.append("|");
        sb2.append(Data.urlEncode(String.valueOf(DH.SyncMtd.getPlatformCode()), "utf-8"));
        sb2.append("|");
        sb2.append(Data.urlEncode(hashMap.get("dnwktfs"), "utf-8"));
        sb2.append("|");
        if (c10) {
            sb2.append(Data.urlEncode(String.valueOf(DH.SyncMtd.getOSVersionInt()), "utf-8"));
            sb2.append("|");
            sb2.append(Data.urlEncode(hashMap.get("srs"), "utf-8"));
            sb2.append("|");
            sb2.append(Data.urlEncode(DH.SyncMtd.getManufacturer(), "utf-8"));
            sb2.append("|");
            sb2.append(Data.urlEncode(DH.SyncMtd.getModel(), "utf-8"));
            sb2.append("|");
            sb2.append(Data.urlEncode(hashMap.get("car"), "utf-8"));
            sb2.append("|");
        } else {
            sb2.append("|||||");
        }
        if (d10) {
            sb2.append(str);
        } else {
            sb2.append(str.split("\\|")[0]);
            sb2.append("|||||");
        }
        String sb3 = sb2.toString();
        SSDKLog.b().c("shorLinkMsg ===>>>>", sb3);
        return Base64.encodeToString(Data.AES128Encode(Data.rawMD5(String.format("%s:%s", hashMap.get("dk"), MobSDK.getAppkey())), sb3), 2);
    }

    public static /* synthetic */ MobCommunicator e() {
        return f();
    }

    private static synchronized MobCommunicator f() {
        MobCommunicator mobCommunicator;
        synchronized (c.class) {
            if (f5156h == null) {
                f5156h = new MobCommunicator(DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED, "bb7addd7e33383b74e82aba9b1d274c73aea6c0c71fcc88730270f630dbe490e1d162004f74e9532f98e17004630fbea9b346de63c23e83a7dfad70dd47cebfd", "288e7c44e01569a905386e6341baabfcde63ec37d0f0835cc662c299a5d0072970808a7fa434f0a51fa581d09d5ec4350ba5d548eafbe1fd956fb3afd678c1fb6134c904668652ec5cceb5d85da337a0f2f13ea457cca74a01b3ba0f4c809ad30d382bba2562ec9b996ae44c3700731c1b914997ef826331759e4084a019a03f");
            }
            mobCommunicator = f5156h;
        }
        return mobCommunicator;
    }

    private static synchronized MobCommunicator g() {
        MobCommunicator mobCommunicator;
        synchronized (c.class) {
            if (f5156h == null) {
                f5156h = new MobCommunicator(DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED, "009cbd92ccef123be840deec0c6ed0547194c1e471d11b6f375e56038458fb18833e5bab2e1206b261495d7e2d1d9e5aa859e6d4b671a8ca5d78efede48e291a3f", "1dfd1d615cb891ce9a76f42d036af7fce5f8b8efaa11b2f42590ecc4ea4cff28f5f6b0726aeb76254ab5b02a58c1d5b486c39d9da1a58fa6ba2f22196493b3a4cbc283dcf749bf63679ee24d185de70c8dfe05605886c9b53e9f569082eabdf98c4fb0dcf07eb9bb3e647903489ff0b5d933bd004af5be4a1022fdda41f347f1");
            }
            mobCommunicator = f5156h;
        }
        return mobCommunicator;
    }

    private void h() {
        StringBuilder a10 = android.support.v4.media.d.a("Android/");
        a10.append(DH.SyncMtd.getOSVersionInt());
        this.f5160d = (DH.SyncMtd.getPackageName() + "/" + DH.SyncMtd.getAppVersionName()) + " ShareSDK/3.10.7 " + a10.toString();
        try {
            this.f5161e = MobSDK.dynamicModifyUrl("api-share.mob.com");
        } catch (Throwable th2) {
            this.f5161e = MobSDK.checkRequestUrl("api-share.mob.com");
            SSDKLog.b().a(cn.sharesdk.facebook.e.a("001 dynamicModifyUrl catch, no problem ", th2), new Object[0]);
        }
        this.f5162f = true;
    }

    private String i() {
        return androidx.activity.e.b(new StringBuilder(), this.f5161e, "/conn");
    }

    private String j() {
        StringBuilder sb2;
        String str;
        HashMap<String, String> hashMap = this.f5163g;
        if (hashMap != null && hashMap.containsKey("/date")) {
            sb2 = new StringBuilder();
            str = this.f5163g.get("/date");
        } else {
            sb2 = new StringBuilder();
            str = this.f5161e;
        }
        return androidx.activity.e.b(sb2, str, "/date");
    }

    public String k() {
        return androidx.activity.e.b(new StringBuilder(), this.f5161e, "/conf5");
    }

    private String l() {
        try {
            return MobSDK.dynamicModifyUrl("up.mob.com/upload/image");
        } catch (Throwable th2) {
            SSDKLog.b().a(cn.sharesdk.facebook.e.a("002 dynamicModifyUrl catch, no problem ", th2), new Object[0]);
            return MobSDK.checkRequestUrl("up.mob.com/upload/image");
        }
    }

    private String m() {
        StringBuilder sb2;
        String str;
        HashMap<String, String> hashMap = this.f5163g;
        if (hashMap != null && hashMap.containsKey("/log5")) {
            sb2 = new StringBuilder();
            str = this.f5163g.get("/log5");
        } else {
            sb2 = new StringBuilder();
            str = this.f5161e;
        }
        return androidx.activity.e.b(sb2, str, "/log5");
    }

    public String n() {
        try {
            return MobSDK.dynamicModifyUrl("l.mob.com/url/shareSdkEncryptMapping.do");
        } catch (Throwable th2) {
            SSDKLog.b().a(cn.sharesdk.facebook.e.a("003 dynamicModifyUrl catch, no problem ", th2), new Object[0]);
            return MobSDK.checkRequestUrl("l.mob.com/url/shareSdkEncryptMapping.do");
        }
    }

    private String o() {
        StringBuilder sb2;
        String str;
        HashMap<String, String> hashMap = this.f5163g;
        if (hashMap != null && hashMap.containsKey("/snsconf")) {
            sb2 = new StringBuilder();
            str = this.f5163g.get("/snsconf");
        } else {
            sb2 = new StringBuilder();
            str = this.f5161e;
        }
        return androidx.activity.e.b(sb2, str, "/snsconf");
    }

    public HashMap<String, Object> a() {
        ArrayList<KVPair<String>> arrayList = new ArrayList<>();
        arrayList.add(new KVPair<>("appkey", MobSDK.getAppkey()));
        ArrayList<KVPair<String>> arrayList2 = new ArrayList<>();
        arrayList2.add(new KVPair<>("User-Identity", cn.sharesdk.framework.network.a.a()));
        NetworkHelper.NetworkTimeOut networkTimeOut = new NetworkHelper.NetworkTimeOut();
        networkTimeOut.readTimout = 30000;
        networkTimeOut.connectionTimeout = 30000;
        String httpPost = this.f5158b.httpPost(i(), arrayList, (KVPair<String>) null, arrayList2, networkTimeOut);
        SSDKLog.b().c(" isConnectToServer response == %s", httpPost);
        return this.f5159c.fromJson(httpPost);
    }

    public HashMap<String, Object> a(String str, String str2) {
        byte[] decode = Base64.decode(str, 2);
        return this.f5159c.fromJson(new String(Data.AES128Decode(Data.rawMD5(MobSDK.getAppkey() + ":" + str2), decode), "UTF-8").trim());
    }

    public HashMap<String, Object> a(String str, ArrayList<String> arrayList, int i10, String str2, HashMap<String, String> hashMap) {
        if (this.f5162f) {
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(new KVPair("key", MobSDK.getAppkey()));
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                arrayList2.add(new KVPair("urls", arrayList.get(i11).toString()));
            }
            arrayList2.add(new KVPair("deviceid", hashMap.get("dk")));
            arrayList2.add(new KVPair("snsplat", String.valueOf(i10)));
            String a10 = a(str2, hashMap);
            if (TextUtils.isEmpty(a10)) {
                return null;
            }
            arrayList2.add(new KVPair("m", a10));
            new ArrayList().add(new KVPair("User-Identity", cn.sharesdk.framework.network.a.a()));
            NetworkHelper.NetworkTimeOut networkTimeOut = new NetworkHelper.NetworkTimeOut();
            networkTimeOut.readTimout = 5000;
            networkTimeOut.connectionTimeout = 5000;
            HashMap<String, Object> hashMap2 = new HashMap<>();
            hashMap2.put("key", MobSDK.getAppkey());
            ArrayList arrayList3 = new ArrayList();
            for (int i12 = 0; i12 < arrayList.size(); i12++) {
                arrayList3.add(URLEncoder.encode(arrayList.get(i12), "UTF-8"));
            }
            hashMap2.put("urls", arrayList3);
            hashMap2.put("deviceid", hashMap.get("dk"));
            hashMap2.put("snsplat", Integer.valueOf(i10));
            if (TextUtils.isEmpty(a10)) {
                return null;
            }
            hashMap2.put("m", a10);
            HashMap<String, Object> hashMap3 = (HashMap) f().requestSynchronized(hashMap2, n(), false);
            SSDKLog.b().c("> SERVER_SHORT_LINK_URL  resp: %s", hashMap3);
            if (hashMap3.size() == 0) {
                this.f5162f = false;
                return null;
            } else if (hashMap3.get("data") == null) {
                return null;
            } else {
                return hashMap3;
            }
        }
        return null;
    }

    public void a(final ShareSDKCallback<HashMap<String, Object>> shareSDKCallback) {
        DH.requester(MobSDK.getContext()).getDeviceKey().getDetailNetworkTypeForStatic().getNetworkType().request(new DH.DHResponder() { // from class: cn.sharesdk.framework.a.c.1
            @Override // com.mob.tools.utils.DH.DHResponder
            public void onResponse(DH.DHResponse dHResponse) {
                try {
                    String networkType = dHResponse.getNetworkType();
                    if (!"none".equals(networkType) && !TextUtils.isEmpty(networkType)) {
                        String appkey = MobSDK.getAppkey();
                        ArrayList<KVPair<String>> arrayList = new ArrayList<>();
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
                        String httpPost = c.this.f5158b.httpPost(c.this.k(), arrayList, (KVPair<String>) null, arrayList2, networkTimeOut);
                        HashMap fromJson = new Hashon().fromJson(httpPost);
                        if (fromJson.containsKey("error")) {
                            if (String.valueOf(fromJson.get("error")).contains("'appkey' is illegal")) {
                                if (TextUtils.isEmpty(appkey)) {
                                    cn.sharesdk.framework.b.a().b();
                                } else {
                                    cn.sharesdk.framework.a.f5086a = true;
                                }
                            }
                        } else if (!TextUtils.isEmpty(appkey)) {
                            cn.sharesdk.framework.a.f5087b = appkey;
                        }
                        SSDKLog.b().c(" get server config response == %s", httpPost);
                        shareSDKCallback.onCallback(c.this.f5159c.fromJson(httpPost));
                    }
                } catch (Throwable th2) {
                    SSDKLog.b().a(cn.sharesdk.facebook.e.a("getServerConfig", th2), new Object[0]);
                }
            }
        });
    }

    public void a(cn.sharesdk.framework.a.b.c cVar) {
        cn.sharesdk.framework.a.a.d.a(cVar.toString(), cVar.f5125e);
    }

    public void a(String str) {
        if (!TextUtils.isEmpty(str)) {
            SSDKLog.b().a(a.b.b("duid === ", str), new Object[0]);
            this.f5160d += " " + str;
        }
    }

    public void a(String str, final ArrayList<String> arrayList, final int i10, final String str2, final ShareSDKCallback<HashMap<String, Object>> shareSDKCallback) {
        DH.requester(MobSDK.getContext()).getDeviceKey().getDetailNetworkTypeForStatic().getScreenSize().getCarrier().getNetworkType().request(new DH.DHResponder() { // from class: cn.sharesdk.framework.a.c.2
            @Override // com.mob.tools.utils.DH.DHResponder
            public void onResponse(DH.DHResponse dHResponse) {
                try {
                    String networkType = dHResponse.getNetworkType();
                    if ("none".equals(networkType) || TextUtils.isEmpty(networkType) || !c.this.f5162f) {
                        return;
                    }
                    boolean c10 = c.this.f5157a.c();
                    boolean d10 = c.this.f5157a.d();
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(Data.urlEncode(DH.SyncMtd.getPackageName(), "utf-8"));
                    sb2.append("|");
                    sb2.append(Data.urlEncode(DH.SyncMtd.getAppVersionName(), "utf-8"));
                    sb2.append("|");
                    sb2.append(Data.urlEncode(String.valueOf(ShareSDK.SDK_VERSION_CODE), "utf-8"));
                    sb2.append("|");
                    sb2.append(Data.urlEncode(String.valueOf(DH.SyncMtd.getPlatformCode()), "utf-8"));
                    sb2.append("|");
                    sb2.append(Data.urlEncode(dHResponse.getDetailNetworkTypeForStatic(), "utf-8"));
                    sb2.append("|");
                    if (c10) {
                        sb2.append(Data.urlEncode(String.valueOf(DH.SyncMtd.getOSVersionInt()), "utf-8"));
                        sb2.append("|");
                        sb2.append(Data.urlEncode(dHResponse.getScreenSize(), "utf-8"));
                        sb2.append("|");
                        sb2.append(Data.urlEncode(DH.SyncMtd.getManufacturer(), "utf-8"));
                        sb2.append("|");
                        sb2.append(Data.urlEncode(DH.SyncMtd.getModel(), "utf-8"));
                        sb2.append("|");
                        sb2.append(Data.urlEncode(dHResponse.getCarrier(), "utf-8"));
                        sb2.append("|");
                    } else {
                        sb2.append("|||||");
                    }
                    if (d10) {
                        sb2.append(str2);
                    } else {
                        sb2.append(str2.split("\\|")[0]);
                        sb2.append("|||||");
                    }
                    String sb3 = sb2.toString();
                    SSDKLog.b().c("shorLinkMsg ===>>>>", sb3);
                    String encodeToString = Base64.encodeToString(Data.AES128Encode(Data.rawMD5(String.format("%s:%s", dHResponse.getDeviceKey(), MobSDK.getAppkey())), sb3), 2);
                    new ArrayList().add(new KVPair("User-Identity", cn.sharesdk.framework.network.a.a()));
                    NetworkHelper.NetworkTimeOut networkTimeOut = new NetworkHelper.NetworkTimeOut();
                    networkTimeOut.readTimout = 5000;
                    networkTimeOut.connectionTimeout = 5000;
                    HashMap<String, Object> hashMap = new HashMap<>();
                    hashMap.put("key", MobSDK.getAppkey());
                    ArrayList arrayList2 = new ArrayList();
                    for (int i11 = 0; i11 < arrayList.size(); i11++) {
                        arrayList2.add(URLEncoder.encode((String) arrayList.get(i11), "UTF-8"));
                    }
                    hashMap.put("urls", arrayList2);
                    hashMap.put("deviceid", dHResponse.getDeviceKey());
                    hashMap.put("snsplat", Integer.valueOf(i10));
                    if (TextUtils.isEmpty(str2)) {
                        SSDKLog.b().a("shortLinkMsg null", new Object[0]);
                        return;
                    }
                    hashMap.put("m", encodeToString);
                    HashMap hashMap2 = (HashMap) c.e().requestSynchronized(hashMap, c.this.n(), false);
                    SSDKLog.b().c("> SERVER_SHORT_LINK_URL  resp: %s", hashMap2);
                    if (hashMap2.size() == 0) {
                        c.this.f5162f = false;
                    } else if (hashMap2.get("data") != null) {
                        shareSDKCallback.onCallback(hashMap2);
                    }
                } catch (Throwable th2) {
                    SSDKLog.b().a(cn.sharesdk.facebook.e.a("getShortLink", th2), new Object[0]);
                    ShareSDKCallback shareSDKCallback2 = shareSDKCallback;
                    if (shareSDKCallback2 != null) {
                        shareSDKCallback2.onCallback(new HashMap());
                    }
                }
            }
        });
    }

    public void a(ArrayList<String> arrayList) {
        cn.sharesdk.framework.a.a.d.a(arrayList);
    }

    public void a(HashMap<String, String> hashMap) {
        this.f5163g = hashMap;
        this.f5157a.a("buffered_server_paths", hashMap);
    }

    public boolean a(String str, boolean z10) {
        try {
            if (MobSDK.isMob()) {
                HashMap<String, Object> hashMap = new HashMap<>();
                hashMap.put("m", str);
                hashMap.put("t", z10 ? "1" : "0");
                String str2 = (String) g().requestSynchronized(hashMap, m(), false);
                SSDKLog.b().c("> Upload All Log  resp: %s", str2);
                if (!TextUtils.isEmpty(str2)) {
                    if (((Integer) this.f5159c.fromJson(str2).get("status")).intValue() != 200) {
                        return false;
                    }
                }
                return true;
            }
            return true;
        } catch (Throwable th2) {
            SSDKLog.b().a(th2);
            return false;
        }
    }

    public long b() {
        String str;
        if (this.f5157a.i()) {
            try {
                str = this.f5158b.httpGet(j(), null, null, null);
            } catch (Throwable th2) {
                SSDKLog.b().a(th2);
                str = "{}";
            }
            HashMap fromJson = this.f5159c.fromJson(str);
            if (fromJson.containsKey("timestamp")) {
                try {
                    long currentTimeMillis = System.currentTimeMillis() - ResHelper.parseLong(String.valueOf(fromJson.get("timestamp")));
                    this.f5157a.a("service_time", Long.valueOf(currentTimeMillis));
                    return currentTimeMillis;
                } catch (Throwable th3) {
                    SSDKLog.b().a(th3);
                }
            }
            return this.f5157a.b();
        }
        return 0L;
    }

    public void b(String str) {
        this.f5161e = str;
    }

    public void b(HashMap<String, Object> hashMap) {
        this.f5157a.g(this.f5159c.fromHashMap(hashMap));
    }

    public ArrayList<cn.sharesdk.framework.a.a.c> c() {
        ArrayList<cn.sharesdk.framework.a.a.c> a10 = cn.sharesdk.framework.a.a.d.a();
        return a10 == null ? new ArrayList<>() : a10;
    }

    public HashMap<String, Object> c(String str) {
        KVPair<String> kVPair = new KVPair<>("file", str);
        ArrayList<KVPair<String>> arrayList = new ArrayList<>();
        arrayList.add(new KVPair<>("User-Identity", cn.sharesdk.framework.network.a.a()));
        String httpPost = this.f5158b.httpPost(l(), (ArrayList<KVPair<String>>) null, kVPair, arrayList, (NetworkHelper.NetworkTimeOut) null);
        SSDKLog.b().c("upload file response == %s", httpPost);
        return this.f5159c.fromJson(httpPost);
    }

    public HashMap<String, Object> d() {
        return this.f5159c.fromJson(this.f5157a.g());
    }

    public HashMap<String, Object> d(String str) {
        ArrayList<KVPair<String>> arrayList = new ArrayList<>();
        arrayList.add(new KVPair<>("appkey", MobSDK.getAppkey()));
        arrayList.add(new KVPair<>("device", str));
        ArrayList<KVPair<String>> arrayList2 = new ArrayList<>();
        arrayList2.add(new KVPair<>("User-Identity", cn.sharesdk.framework.network.a.a()));
        NetworkHelper.NetworkTimeOut networkTimeOut = new NetworkHelper.NetworkTimeOut();
        networkTimeOut.readTimout = 10000;
        networkTimeOut.connectionTimeout = 10000;
        return this.f5159c.fromJson(this.f5158b.httpPost(o(), arrayList, (KVPair<String>) null, arrayList2, networkTimeOut));
    }
}
