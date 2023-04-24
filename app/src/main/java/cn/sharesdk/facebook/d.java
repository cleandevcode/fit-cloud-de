package cn.sharesdk.facebook;

import android.content.Intent;
import android.content.pm.Signature;
import android.os.Bundle;
import android.text.TextUtils;
import cn.sharesdk.framework.InnerShareParams;
import cn.sharesdk.framework.Platform;
import cn.sharesdk.framework.PlatformActionListener;
import cn.sharesdk.framework.ShareSDK;
import cn.sharesdk.framework.ShareSDKCallback;
import cn.sharesdk.framework.authorize.AuthorizeListener;
import cn.sharesdk.framework.authorize.SSOAuthorizeActivity;
import cn.sharesdk.framework.authorize.SSOListener;
import cn.sharesdk.framework.authorize.WebAuthorizeActivity;
import cn.sharesdk.framework.network.SSDKNetworkHelper;
import cn.sharesdk.framework.utils.SSDKLog;
import com.huawei.hms.framework.common.hianalytics.HianalyticsBaseData;
import com.mob.MobSDK;
import com.mob.tools.network.KVPair;
import com.mob.tools.network.NetworkHelper;
import com.mob.tools.utils.DH;
import com.mob.tools.utils.Data;
import com.mob.tools.utils.ResHelper;
import com.sina.weibo.sdk.auth.Oauth2AccessToken;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class d extends cn.sharesdk.framework.e {

    /* renamed from: b */
    private static final String[] f5014b = {"email", "public_profile"};

    /* renamed from: c */
    private static d f5015c;

    /* renamed from: d */
    private String f5016d;

    /* renamed from: e */
    private String f5017e;

    /* renamed from: f */
    private long f5018f;

    /* renamed from: g */
    private String f5019g;

    /* renamed from: h */
    private SSDKNetworkHelper f5020h;

    /* renamed from: i */
    private String[] f5021i;

    /* renamed from: j */
    private String f5022j;

    private d(Platform platform) {
        super(platform);
        this.f5020h = SSDKNetworkHelper.getInstance();
    }

    public static d a(Platform platform) {
        if (f5015c == null) {
            f5015c = new d(platform);
        }
        return f5015c;
    }

    public HashMap<String, Object> a(int i10, int i11, String str) {
        String str2 = str != null ? str : "me";
        ArrayList<KVPair<String>> arrayList = new ArrayList<>();
        arrayList.add(new KVPair<>(Oauth2AccessToken.KEY_ACCESS_TOKEN, this.f5017e));
        arrayList.add(new KVPair<>("format", "json"));
        arrayList.add(new KVPair<>("limit", String.valueOf(i10)));
        arrayList.add(new KVPair<>("offset", String.valueOf(i11)));
        arrayList.add(new KVPair<>("fields", "id,name,first_name,middle_name,last_name,gender,locale,languages,link,age_range,third_party_id,installed,timezone,updated_time,verified,birthday,cover,currency,devices,education,email,hometown,interested_in,location,political,payment_pricepoints,favorite_athletes,favorite_teams,picture,quotes,relationship_status,religion,significant_other,video_upload_limits,website,work"));
        String httpGet = this.f5020h.httpGet(android.support.v4.media.a.a("https://graph.facebook.com/v13.0/", str2, !TextUtils.isEmpty(str) ? "/taggable_friends" : "/friends"), arrayList, "friends", b());
        if (httpGet == null || httpGet.length() <= 0) {
            return null;
        }
        return android.support.v4.media.d.b(httpGet);
    }

    public void a(final Platform.ShareParams shareParams, final PlatformActionListener platformActionListener) {
        DH.requester(MobSDK.getContext()).getDeviceKey().getDetailNetworkTypeForStatic().getScreenSize().getCarrier().getNetworkType().request(new DH.DHResponder() { // from class: cn.sharesdk.facebook.d.3
            @Override // com.mob.tools.utils.DH.DHResponder
            public void onResponse(DH.DHResponse dHResponse) {
                try {
                    HashMap<String, String> hashMap = new HashMap<>();
                    hashMap.put("dk", dHResponse.getDeviceKey());
                    hashMap.put("nt", dHResponse.getNetworkType());
                    hashMap.put("dnwktfs", dHResponse.getDetailNetworkTypeForStatic());
                    hashMap.put("srs", dHResponse.getScreenSize());
                    hashMap.put("car", dHResponse.getCarrier());
                    String imageUrl = shareParams.getImageUrl();
                    String title = shareParams.getTitle();
                    String text = shareParams.getText();
                    String musicUrl = shareParams.getMusicUrl();
                    String url = shareParams.getUrl();
                    String titleUrl = shareParams.getTitleUrl();
                    if (!TextUtils.isEmpty(titleUrl)) {
                        titleUrl = d.this.f5224a.getShortLintk(titleUrl, false, hashMap);
                        shareParams.setTitleUrl(titleUrl);
                    } else if (!TextUtils.isEmpty(url)) {
                        titleUrl = d.this.f5224a.getShortLintk(url, false, hashMap);
                        shareParams.setUrl(titleUrl);
                    }
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("https://www.facebook.com/dialog/feed?");
                    sb2.append("app_id=");
                    sb2.append(d.this.f5019g);
                    sb2.append("&redirect_uri=fbconnect://success");
                    sb2.append("&link=");
                    sb2.append(Data.urlEncode(titleUrl, "utf-8"));
                    if (!TextUtils.isEmpty(shareParams.getQuote())) {
                        sb2.append("&quote=");
                        sb2.append(Data.urlEncode(shareParams.getQuote(), "utf-8"));
                    }
                    if (!TextUtils.isEmpty(imageUrl)) {
                        sb2.append("&picture=");
                        sb2.append(Data.urlEncode(imageUrl, "utf-8"));
                    }
                    if (!TextUtils.isEmpty(title)) {
                        sb2.append("&caption=");
                        sb2.append(Data.urlEncode(title, "utf-8"));
                    }
                    if (!TextUtils.isEmpty(text)) {
                        sb2.append("&description=");
                        sb2.append(Data.urlEncode(text, "utf-8"));
                    }
                    if (!TextUtils.isEmpty(musicUrl)) {
                        sb2.append("&source=");
                        sb2.append(Data.urlEncode(musicUrl, "utf-8"));
                        if (!TextUtils.isEmpty(text)) {
                            sb2.append("&name=");
                            sb2.append(Data.urlEncode(text, "utf-8"));
                        }
                    }
                    WebShareActivity webShareActivity = new WebShareActivity();
                    webShareActivity.setScheme(sb2.toString());
                    webShareActivity.setSharedCallback(platformActionListener);
                    webShareActivity.show(MobSDK.getContext(), null);
                } catch (Throwable th2) {
                    PlatformActionListener platformActionListener2 = platformActionListener;
                    if (platformActionListener2 != null) {
                        platformActionListener2.onError(d.this.f5224a, 9, th2);
                    }
                }
            }
        });
    }

    public void a(PlatformActionListener platformActionListener, Platform.ShareParams shareParams) {
        SSDKLog.b().a("Facebook share by primordial appClientShare", new Object[0]);
        Intent intent = new Intent();
        intent.putExtra("TITLE", shareParams.getTitle());
        ShareActivity shareActivity = new ShareActivity();
        shareActivity.setPlatformActionListener(platformActionListener, this.f5224a, shareParams, this.f5019g);
        shareActivity.show(MobSDK.getContext(), intent);
    }

    public void a(final ShareSDKCallback<Boolean> shareSDKCallback) {
        Intent intent = new Intent();
        intent.setClassName("com.facebook.katana", "com.facebook.katana.ProxyAuth");
        intent.putExtra("client_id", this.f5019g);
        String[] strArr = this.f5021i;
        if (strArr != null && strArr.length > 0) {
            intent.putExtra("scope", TextUtils.join(",", strArr));
        }
        DH.requester(MobSDK.getContext()).getPInfoForce(true, "com.facebook.katana", 64).resolveActivity(intent, 0).request(new DH.DHResponder() { // from class: cn.sharesdk.facebook.d.1
            @Override // com.mob.tools.utils.DH.DHResponder
            public void onResponse(DH.DHResponse dHResponse) {
                ShareSDKCallback shareSDKCallback2;
                try {
                    if (dHResponse.resolveActivity(new int[0]) == null) {
                        ShareSDKCallback shareSDKCallback3 = shareSDKCallback;
                        if (shareSDKCallback3 != null) {
                            shareSDKCallback3.onCallback(Boolean.FALSE);
                            return;
                        }
                        return;
                    }
                    for (Signature signature : dHResponse.getPInfoForce(new int[0]).signatures) {
                        if ("30820268308201d102044a9c4610300d06092a864886f70d0101040500307a310b3009060355040613025553310b3009060355040813024341311230100603550407130950616c6f20416c746f31183016060355040a130f46616365626f6f6b204d6f62696c653111300f060355040b130846616365626f6f6b311d301b0603550403131446616365626f6f6b20436f72706f726174696f6e3020170d3039303833313231353231365a180f32303530303932353231353231365a307a310b3009060355040613025553310b3009060355040813024341311230100603550407130950616c6f20416c746f31183016060355040a130f46616365626f6f6b204d6f62696c653111300f060355040b130846616365626f6f6b311d301b0603550403131446616365626f6f6b20436f72706f726174696f6e30819f300d06092a864886f70d010101050003818d0030818902818100c207d51df8eb8c97d93ba0c8c1002c928fab00dc1b42fca5e66e99cc3023ed2d214d822bc59e8e35ddcf5f44c7ae8ade50d7e0c434f500e6c131f4a2834f987fc46406115de2018ebbb0d5a3c261bd97581ccfef76afc7135a6d59e8855ecd7eacc8f8737e794c60a761c536b72b11fac8e603f5da1a2d54aa103b8a13c0dbc10203010001300d06092a864886f70d0101040500038181005ee9be8bcbb250648d3b741290a82a1c9dc2e76a0af2f2228f1d9f9c4007529c446a70175c5a900d5141812866db46be6559e2141616483998211f4a673149fb2232a10d247663b26a9031e15f84bc1c74d141ff98a02d76f85b2c8ab2571b6469b232d8e768a7f7ca04f7abe4a775615916c07940656b58717457b42bd928a2".equals(signature.toCharsString()) && (shareSDKCallback2 = shareSDKCallback) != null) {
                            shareSDKCallback2.onCallback(Boolean.TRUE);
                        }
                    }
                } catch (Throwable unused) {
                    ShareSDKCallback shareSDKCallback4 = shareSDKCallback;
                    if (shareSDKCallback4 != null) {
                        shareSDKCallback4.onCallback(Boolean.FALSE);
                    }
                }
            }
        });
    }

    public void a(final AuthorizeListener authorizeListener, boolean z10) {
        if (z10) {
            b(authorizeListener);
        } else {
            a(new SSOListener() { // from class: cn.sharesdk.facebook.d.2
                @Override // cn.sharesdk.framework.authorize.SSOListener
                public void onCancel() {
                    authorizeListener.onCancel();
                }

                @Override // cn.sharesdk.framework.authorize.SSOListener
                public void onComplete(Bundle bundle) {
                    authorizeListener.onComplete(bundle);
                }

                @Override // cn.sharesdk.framework.authorize.SSOListener
                public void onFailed(Throwable th2) {
                    SSDKLog.b().a(th2);
                    d.this.b(authorizeListener);
                }
            });
        }
    }

    public void a(String str) {
        this.f5019g = str;
    }

    public void a(String str, String str2) {
        this.f5017e = str;
        if (str2 == null || str2.equals("0")) {
            return;
        }
        try {
            this.f5018f = (Long.valueOf(str2).longValue() * 1000) + System.currentTimeMillis();
        } catch (Throwable th2) {
            SSDKLog.b().a(th2);
        }
    }

    public void a(String[] strArr) {
        this.f5021i = strArr;
    }

    public boolean a() {
        return this.f5017e != null && (this.f5018f == 0 || System.currentTimeMillis() < this.f5018f);
    }

    public void b(String str) {
        this.f5022j = str;
    }

    @Override // cn.sharesdk.framework.authorize.AuthorizeHelper
    public String getAuthorizeUrl() {
        Bundle bundle = new Bundle();
        bundle.putString("app_id", this.f5019g);
        bundle.putString("client_id", this.f5019g);
        bundle.putString("auth_type", "rerequest");
        bundle.putString("default_audience", "friends");
        bundle.putString("display", "touch");
        bundle.putString("fbapp_pres", "1");
        bundle.putString("redirect_uri", this.f5022j);
        bundle.putString("response_type", "token,signed_request");
        bundle.putString("return_scopes", "true");
        bundle.putString("sdk", "android");
        bundle.putString(HianalyticsBaseData.SDK_VERSION, "5.4.0");
        bundle.putString("state", "{\"challenge\":\"G/I5SknMfRmyvIr/q5bFJNwIqI8=\"}");
        bundle.putString(InnerShareParams.TITLE, "Log In");
        bundle.putString("type", "user_agent");
        String[] strArr = this.f5021i;
        if (strArr == null) {
            strArr = f5014b;
        }
        for (String str : strArr) {
        }
        StringBuilder a10 = p.a.a("https://m.facebook.com/v13.0/dialog/oauth", "?");
        a10.append(ResHelper.encodeUrl(bundle));
        this.f5016d = a10.toString();
        ShareSDK.logApiEvent("/dialog/oauth", b());
        SSDKLog b10 = SSDKLog.b();
        StringBuilder a11 = android.support.v4.media.d.a("FbHelper===> ");
        a11.append(this.f5016d);
        b10.a(a11.toString());
        return this.f5016d;
    }

    @Override // cn.sharesdk.framework.authorize.AuthorizeHelper
    public cn.sharesdk.framework.authorize.b getAuthorizeWebviewClient(WebAuthorizeActivity webAuthorizeActivity) {
        return new c(webAuthorizeActivity);
    }

    @Override // cn.sharesdk.framework.authorize.AuthorizeHelper
    public String getRedirectUri() {
        return this.f5022j;
    }

    @Override // cn.sharesdk.framework.e, cn.sharesdk.framework.authorize.AuthorizeHelper
    public cn.sharesdk.framework.authorize.c getSSOProcessor(SSOAuthorizeActivity sSOAuthorizeActivity) {
        b bVar = new b(sSOAuthorizeActivity);
        bVar.a(32525);
        String str = this.f5019g;
        String[] strArr = this.f5021i;
        if (strArr == null) {
            strArr = f5014b;
        }
        bVar.a(str, strArr);
        return bVar;
    }

    public HashMap<String, Object> a(String str, Boolean bool) {
        String b10 = str != null ? a.b.b("/", str) : "/me";
        ArrayList<KVPair<String>> arrayList = new ArrayList<>();
        arrayList.add(new KVPair<>(Oauth2AccessToken.KEY_ACCESS_TOKEN, this.f5017e));
        arrayList.add(new KVPair<>("format", "json"));
        arrayList.add(bool.booleanValue() ? new KVPair<>("fields", "id,name,first_name,middle_name,last_name,gender,locale,link,age_range,birthday,currency,email,picture.type(large)") : new KVPair<>("fields", "id,name,first_name,middle_name,last_name,gender,locale,languages,link,age_range,third_party_id,installed,timezone,updated_time,verified,birthday,currency,devices,education,email,hometown,interested_in,location,political,payment_pricepoints,favorite_athletes,favorite_teams,picture.type(large),quotes,relationship_status,religion,significant_other,video_upload_limits,website,work"));
        String httpGet = this.f5020h.httpGet(a.b.b("https://graph.facebook.com/v13.0", b10), arrayList, "get_user_info", b());
        SSDKLog.b().b("facebook helper getUser");
        if (httpGet == null || httpGet.length() <= 0) {
            return null;
        }
        return android.support.v4.media.d.b(httpGet);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public HashMap<String, Object> a(String str, String str2, HashMap<String, Object> hashMap, HashMap<String, String> hashMap2) {
        KVPair kVPair;
        if (str2 == null) {
            return null;
        }
        ArrayList<KVPair<String>> arrayList = new ArrayList<>();
        if (hashMap != null && hashMap.size() > 0) {
            for (Map.Entry<String, Object> entry : hashMap.entrySet()) {
                arrayList.add(new KVPair<>(entry.getKey(), String.valueOf(entry.getValue())));
            }
        }
        arrayList.add(new KVPair<>(Oauth2AccessToken.KEY_ACCESS_TOKEN, this.f5017e));
        arrayList.add(new KVPair<>("format", "json"));
        if (hashMap2 == null || hashMap2.size() <= 0) {
            kVPair = null;
        } else {
            KVPair kVPair2 = null;
            for (Map.Entry<String, String> entry2 : hashMap2.entrySet()) {
                kVPair2 = new KVPair(entry2.getKey(), entry2.getValue());
            }
            kVPair = kVPair2;
        }
        String httpGet = "GET".equals(str2.toUpperCase()) ? this.f5020h.httpGet(str, arrayList, (ArrayList<KVPair<String>>) null, (NetworkHelper.NetworkTimeOut) null) : "POST".equals(str2.toUpperCase()) ? this.f5020h.httpPost(str, arrayList, kVPair, (ArrayList<KVPair<String>>) null, (NetworkHelper.NetworkTimeOut) null) : null;
        if (httpGet == null || httpGet.length() <= 0) {
            return null;
        }
        return android.support.v4.media.d.b(httpGet);
    }
}
