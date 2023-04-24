package cn.sharesdk.wechat.utils;

import android.os.Bundle;
import android.text.TextUtils;
import cn.sharesdk.framework.Platform;
import cn.sharesdk.framework.PlatformActionListener;
import cn.sharesdk.framework.PlatformDb;
import cn.sharesdk.framework.authorize.AuthorizeListener;
import cn.sharesdk.framework.network.SSDKNetworkHelper;
import cn.sharesdk.framework.utils.SSDKLog;
import com.huawei.hms.mlsdk.common.MLApplicationSetting;
import com.mob.tools.network.KVPair;
import com.mob.tools.utils.Hashon;
import com.mob.tools.utils.ResHelper;
import com.sina.weibo.sdk.auth.Oauth2AccessToken;
import java.util.ArrayList;
import java.util.HashMap;

/* loaded from: classes.dex */
public class h {

    /* renamed from: a */
    private String f5564a;

    /* renamed from: b */
    private String f5565b;

    /* renamed from: c */
    private SSDKNetworkHelper f5566c = SSDKNetworkHelper.getInstance();

    /* renamed from: d */
    private Platform f5567d;

    /* renamed from: e */
    private int f5568e;

    public h(Platform platform, int i10) {
        this.f5567d = platform;
        this.f5568e = i10;
    }

    public void a(String str) {
        SSDKLog.b().a(a.b.b("wechat getAuthorizeToken ==>>", str), new Object[0]);
        HashMap fromJson = new Hashon().fromJson(str);
        String valueOf = String.valueOf(fromJson.get(Oauth2AccessToken.KEY_ACCESS_TOKEN));
        String valueOf2 = String.valueOf(fromJson.get(Oauth2AccessToken.KEY_REFRESH_TOKEN));
        String valueOf3 = String.valueOf(fromJson.get(Oauth2AccessToken.KEY_EXPIRES_IN));
        this.f5567d.getDb().put("openid", String.valueOf(fromJson.get("openid")));
        this.f5567d.getDb().putExpiresIn(Long.valueOf(valueOf3).longValue());
        this.f5567d.getDb().putToken(valueOf);
        this.f5567d.getDb().put(Oauth2AccessToken.KEY_REFRESH_TOKEN, valueOf2);
    }

    public void a(Bundle bundle, AuthorizeListener authorizeListener) {
        String string = bundle.getString("_wxapi_sendauth_resp_url");
        if (TextUtils.isEmpty(string)) {
            if (authorizeListener != null) {
                authorizeListener.onError(null);
                return;
            }
            return;
        }
        int indexOf = string.indexOf("://oauth?");
        if (indexOf >= 0) {
            string = string.substring(indexOf + 1);
        }
        try {
            a(ResHelper.urlToBundle(string).getString("code"), authorizeListener);
        } catch (Throwable th2) {
            SSDKLog.b().a(th2);
            if (authorizeListener != null) {
                authorizeListener.onError(th2);
            }
        }
    }

    public void a(final PlatformActionListener platformActionListener) {
        new Thread() { // from class: cn.sharesdk.wechat.utils.h.2
            @Override // java.lang.Thread, java.lang.Runnable
            public void run() {
                PlatformDb db2;
                String str;
                HashMap<String, Object> hashMap;
                try {
                    ArrayList<KVPair<String>> arrayList = new ArrayList<>();
                    arrayList.add(new KVPair<>(Oauth2AccessToken.KEY_ACCESS_TOKEN, h.this.f5567d.getDb().getToken()));
                    arrayList.add(new KVPair<>("openid", h.this.f5567d.getDb().get("openid")));
                    arrayList.add(new KVPair<>("lang", "zh_CN"));
                    String httpGet = h.this.f5566c.httpGet("https://api.weixin.qq.com/sns/userinfo", arrayList, "/sns/userinfo", h.this.f5568e);
                    if (TextUtils.isEmpty(httpGet)) {
                        PlatformActionListener platformActionListener2 = platformActionListener;
                        if (platformActionListener2 != null) {
                            platformActionListener2.onError(h.this.f5567d, 8, new Throwable());
                            return;
                        }
                        return;
                    }
                    SSDKLog b10 = SSDKLog.b();
                    b10.a("getUserInfo ==>>" + httpGet, new Object[0]);
                    HashMap<String, Object> fromJson = new Hashon().fromJson(httpGet);
                    if (fromJson.containsKey(com.huawei.hms.feature.dynamic.b.f7006g) && ((Integer) fromJson.get(com.huawei.hms.feature.dynamic.b.f7006g)).intValue() != 0) {
                        if (platformActionListener != null) {
                            platformActionListener.onError(h.this.f5567d, 8, new Throwable(new Hashon().fromHashMap(fromJson)));
                            return;
                        }
                        return;
                    }
                    String valueOf = String.valueOf(fromJson.get("openid"));
                    String valueOf2 = String.valueOf(fromJson.get("nickname"));
                    int parseInt = ResHelper.parseInt(String.valueOf(fromJson.get("sex")));
                    String valueOf3 = String.valueOf(fromJson.get("province"));
                    String valueOf4 = String.valueOf(fromJson.get("city"));
                    String valueOf5 = String.valueOf(fromJson.get("country"));
                    String valueOf6 = String.valueOf(fromJson.get("headimgurl"));
                    String valueOf7 = String.valueOf(fromJson.get("unionid"));
                    h.this.f5567d.getDb().put("nickname", valueOf2);
                    if (parseInt == 1) {
                        db2 = h.this.f5567d.getDb();
                        str = "0";
                    } else if (parseInt == 2) {
                        db2 = h.this.f5567d.getDb();
                        str = "1";
                    } else {
                        db2 = h.this.f5567d.getDb();
                        str = "2";
                    }
                    db2.put("gender", str);
                    h.this.f5567d.getDb().putUserId(valueOf);
                    h.this.f5567d.getDb().put("icon", valueOf6);
                    h.this.f5567d.getDb().put("province", valueOf3);
                    h.this.f5567d.getDb().put("city", valueOf4);
                    h.this.f5567d.getDb().put("country", valueOf5);
                    h.this.f5567d.getDb().put("openid", valueOf);
                    h.this.f5567d.getDb().put("unionid", valueOf7);
                    if (h.this.f5567d.getDb().get("userTags") != null) {
                        hashMap = fromJson;
                        hashMap.put("userTags", h.this.f5567d.getDb().get("userTags"));
                    } else {
                        hashMap = fromJson;
                    }
                    platformActionListener.onComplete(h.this.f5567d, 8, hashMap);
                } catch (Throwable th2) {
                    SSDKLog.b().a(th2);
                }
            }
        }.start();
    }

    public void a(String str, String str2) {
        this.f5564a = str;
        this.f5565b = str2;
    }

    public boolean a() {
        String str = this.f5567d.getDb().get(Oauth2AccessToken.KEY_REFRESH_TOKEN);
        if (!TextUtils.isEmpty(this.f5564a) && !TextUtils.isEmpty(str)) {
            ArrayList<KVPair<String>> arrayList = new ArrayList<>();
            arrayList.add(new KVPair<>(MLApplicationSetting.BundleKeyConstants.AppInfo.appid, this.f5564a));
            arrayList.add(new KVPair<>(Oauth2AccessToken.KEY_REFRESH_TOKEN, str));
            arrayList.add(new KVPair<>("grant_type", Oauth2AccessToken.KEY_REFRESH_TOKEN));
            try {
                String httpGet = this.f5566c.httpGet("https://api.weixin.qq.com/sns/oauth2/refresh_token", arrayList, "/sns/oauth2/refresh_token", this.f5568e);
                if (TextUtils.isEmpty(httpGet) || httpGet.contains(com.huawei.hms.feature.dynamic.b.f7006g)) {
                    return false;
                }
                a(httpGet);
                return true;
            } catch (Throwable th2) {
                SSDKLog.b().a(th2);
            }
        }
        return false;
    }

    private void a(final String str, final AuthorizeListener authorizeListener) {
        SSDKLog.b().a(a.b.b("getAuthorizeToken ==>> ", str), new Object[0]);
        new Thread() { // from class: cn.sharesdk.wechat.utils.h.1
            @Override // java.lang.Thread, java.lang.Runnable
            public void run() {
                try {
                    ArrayList<KVPair<String>> arrayList = new ArrayList<>();
                    arrayList.add(new KVPair<>(MLApplicationSetting.BundleKeyConstants.AppInfo.appid, h.this.f5564a));
                    arrayList.add(new KVPair<>("secret", h.this.f5565b));
                    arrayList.add(new KVPair<>("code", str));
                    arrayList.add(new KVPair<>("grant_type", "authorization_code"));
                    String httpGet = h.this.f5566c.httpGet("https://api.weixin.qq.com/sns/oauth2/access_token", arrayList, "/sns/oauth2/access_token", h.this.f5568e);
                    if (TextUtils.isEmpty(httpGet)) {
                        authorizeListener.onError(new Throwable("Authorize token is empty"));
                    } else if (!httpGet.contains(com.huawei.hms.feature.dynamic.b.f7006g)) {
                        h.this.a(httpGet);
                        authorizeListener.onComplete(null);
                    } else {
                        AuthorizeListener authorizeListener2 = authorizeListener;
                        if (authorizeListener2 != null) {
                            authorizeListener2.onError(new Throwable(httpGet));
                        }
                    }
                } catch (Throwable th2) {
                    SSDKLog.b().a(th2);
                }
            }
        }.start();
    }
}
