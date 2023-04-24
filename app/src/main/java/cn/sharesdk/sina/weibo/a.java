package cn.sharesdk.sina.weibo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.media.d;
import android.text.TextUtils;
import cn.sharesdk.framework.Platform;
import cn.sharesdk.framework.PlatformActionListener;
import cn.sharesdk.framework.ShareSDK;
import cn.sharesdk.framework.ShareSDKCallback;
import cn.sharesdk.framework.authorize.AuthorizeListener;
import cn.sharesdk.framework.authorize.SSOAuthorizeActivity;
import cn.sharesdk.framework.authorize.WebAuthorizeActivity;
import cn.sharesdk.framework.authorize.b;
import cn.sharesdk.framework.authorize.c;
import cn.sharesdk.framework.e;
import cn.sharesdk.framework.network.SSDKNetworkHelper;
import cn.sharesdk.framework.utils.SSDKLog;
import cn.sharesdk.sina.weibo.utils.WebSharePage;
import com.mob.MobSDK;
import com.mob.tools.network.KVPair;
import com.mob.tools.network.NetworkHelper;
import com.mob.tools.utils.BitmapHelper;
import com.mob.tools.utils.DH;
import com.mob.tools.utils.Hashon;
import com.mob.tools.utils.ResHelper;
import com.sina.weibo.BuildConfig;
import com.sina.weibo.sdk.auth.Oauth2AccessToken;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public class a extends e {

    /* renamed from: b */
    private static a f5364b;

    /* renamed from: c */
    private String f5365c;

    /* renamed from: d */
    private String f5366d;

    /* renamed from: e */
    private String f5367e;

    /* renamed from: f */
    private String f5368f;

    /* renamed from: g */
    private String[] f5369g;

    /* renamed from: h */
    private SSDKNetworkHelper f5370h;

    private a(Platform platform) {
        super(platform);
        this.f5369g = new String[]{"follow_app_official_microblog"};
        this.f5370h = SSDKNetworkHelper.getInstance();
    }

    public static synchronized a a(Platform platform) {
        a aVar;
        synchronized (a.class) {
            if (f5364b == null) {
                f5364b = new a(platform);
            }
            aVar = f5364b;
        }
        return aVar;
    }

    private String a(Object[] objArr, String str) {
        if (objArr == null) {
            return null;
        }
        return a(objArr, str, 0, objArr.length);
    }

    private String a(Object[] objArr, String str, int i10, int i11) {
        if (objArr == null) {
            return null;
        }
        if (str == null) {
            str = "";
        }
        int i12 = i11 - i10;
        if (i12 <= 0) {
            return "";
        }
        StringBuilder sb2 = new StringBuilder(i12 * 16);
        Object obj = objArr[i10];
        if (obj != null) {
            sb2.append(obj);
        }
        while (true) {
            i10++;
            if (i10 >= i11) {
                return sb2.toString();
            }
            sb2.append(str);
            Object obj2 = objArr[i10];
            if (obj2 != null) {
                sb2.append(obj2);
            }
        }
    }

    private void a(AuthorizeListener authorizeListener) {
        new SinaWeiboWebAuthOfficial(this.f5365c, this.f5367e, a(this.f5369g, ","), authorizeListener).show(MobSDK.getContext(), null);
        SSDKLog.b().a("SinaWeibo SDK Web showWebAuthActivity ");
    }

    public HashMap<String, Object> a(int i10, int i11, String str) {
        boolean z10;
        ArrayList<KVPair<String>> arrayList = new ArrayList<>();
        arrayList.add(new KVPair<>("source", this.f5365c));
        try {
            ResHelper.parseLong(str);
            z10 = true;
        } catch (Throwable unused) {
            z10 = false;
        }
        arrayList.add(z10 ? new KVPair<>(Oauth2AccessToken.KEY_UID, str) : new KVPair<>("screen_name", str));
        arrayList.add(new KVPair<>("count", String.valueOf(i10)));
        arrayList.add(new KVPair<>("page", String.valueOf(i11)));
        String httpGet = this.f5370h.httpGet("https://api.weibo.com/2/statuses/user_timeline.json", arrayList, "/2/statuses/user_timeline.json", b());
        if (httpGet != null) {
            return d.b(httpGet);
        }
        return null;
    }

    public void a(final Platform.ShareParams shareParams, final PlatformActionListener platformActionListener) {
        if (shareParams == null) {
            if (platformActionListener != null) {
                platformActionListener.onError(this.f5224a, 9, new Throwable("Please set params"));
                return;
            }
            return;
        }
        if (shareParams.getImageData() == null && TextUtils.isEmpty(shareParams.getImagePath()) && !TextUtils.isEmpty(shareParams.getImageUrl())) {
            try {
                File file = new File(BitmapHelper.downloadBitmap(MobSDK.getContext(), shareParams.getImageUrl()));
                if (file.exists()) {
                    shareParams.setImagePath(file.getAbsolutePath());
                }
            } catch (Throwable th2) {
                SSDKLog.b().a(th2);
            }
        }
        if (shareParams.getImageArray() != null && shareParams.getImageArray().length > 0) {
            try {
                List<String> asList = Arrays.asList(shareParams.getImageArray());
                String[] strArr = new String[asList.size()];
                int i10 = 0;
                for (String str : asList) {
                    if (str.startsWith("http")) {
                        str = BitmapHelper.downloadBitmap(MobSDK.getContext(), str);
                    }
                    File file2 = new File(str);
                    if (file2.exists() && str.startsWith("/data/")) {
                        String cachePath = ResHelper.getCachePath(MobSDK.getContext(), "images");
                        File file3 = new File(cachePath, System.currentTimeMillis() + file2.getName());
                        String absolutePath = file3.getAbsolutePath();
                        file3.createNewFile();
                        if (ResHelper.copyFile(str, absolutePath)) {
                            str = file3.getAbsolutePath();
                        }
                    }
                    strArr[i10] = str;
                    i10++;
                }
                shareParams.setImageArray(strArr);
            } catch (Throwable th3) {
                SSDKLog.b().a(th3);
            }
        }
        AuthorizeListener authorizeListener = new AuthorizeListener() { // from class: cn.sharesdk.sina.weibo.a.2
            @Override // cn.sharesdk.framework.authorize.AuthorizeListener
            public void onCancel() {
                PlatformActionListener platformActionListener2 = platformActionListener;
                if (platformActionListener2 != null) {
                    platformActionListener2.onCancel(a.this.f5224a, 9);
                }
            }

            @Override // cn.sharesdk.framework.authorize.AuthorizeListener
            public void onComplete(Bundle bundle) {
                if (platformActionListener != null) {
                    HashMap<String, Object> hashMap = new HashMap<>();
                    hashMap.put("ShareParams", shareParams);
                    platformActionListener.onComplete(a.this.f5224a, 9, hashMap);
                }
            }

            @Override // cn.sharesdk.framework.authorize.AuthorizeListener
            public void onError(Throwable th4) {
                PlatformActionListener platformActionListener2 = platformActionListener;
                if (platformActionListener2 != null) {
                    platformActionListener2.onError(a.this.f5224a, 9, th4);
                }
            }
        };
        new SinaWeiboShareOfficial(this.f5365c, this.f5367e, a(this.f5369g, ","), shareParams, authorizeListener).show(MobSDK.getContext(), null);
    }

    public void a(final ShareSDKCallback<Boolean> shareSDKCallback) {
        Intent intent = new Intent("android.intent.action.SEND");
        intent.setPackage(BuildConfig.APPLICATION_ID);
        intent.setType("image/*");
        Intent intent2 = new Intent("android.intent.action.SEND");
        intent2.setPackage("com.sina.weibog3");
        intent2.setType("image/*");
        DH.requester(MobSDK.getContext()).resolveActivity(intent, 0).resolveActivity(intent2, 0).request(new DH.DHResponder() { // from class: cn.sharesdk.sina.weibo.a.1
            @Override // com.mob.tools.utils.DH.DHResponder
            public void onResponse(DH.DHResponse dHResponse) {
                boolean z10 = true;
                try {
                    if (dHResponse.resolveActivity(0) == null) {
                        ShareSDKCallback shareSDKCallback2 = shareSDKCallback;
                        if (shareSDKCallback2 != null) {
                            if (dHResponse.resolveActivity(1) == null) {
                                z10 = false;
                            }
                            shareSDKCallback2.onCallback(Boolean.valueOf(z10));
                        }
                    } else {
                        ShareSDKCallback shareSDKCallback3 = shareSDKCallback;
                        if (shareSDKCallback3 != null) {
                            shareSDKCallback3.onCallback(Boolean.TRUE);
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

    public void a(AuthorizeListener authorizeListener, boolean z10) {
        if (z10) {
            a(authorizeListener);
            return;
        }
        new SinaWeiboOfficialAuth(this.f5365c, this.f5367e, a(this.f5369g, ","), authorizeListener).show(MobSDK.getContext(), null);
        SSDKLog.b().a("SinaWeibo SDK Client doAuthorize ");
    }

    public void a(String str) {
        this.f5367e = str;
    }

    public void a(String str, String str2) {
        this.f5365c = str;
        this.f5366d = str2;
    }

    public void a(String[] strArr) {
        if (strArr == null || strArr.length <= 0) {
            return;
        }
        this.f5369g = strArr;
    }

    public boolean a() {
        ArrayList<KVPair<String>> arrayList = new ArrayList<>();
        arrayList.add(new KVPair<>("client_id", this.f5365c));
        arrayList.add(new KVPair<>("client_secret", this.f5366d));
        arrayList.add(new KVPair<>("redirect_uri", this.f5367e));
        arrayList.add(new KVPair<>("grant_type", Oauth2AccessToken.KEY_REFRESH_TOKEN));
        arrayList.add(new KVPair<>(Oauth2AccessToken.KEY_REFRESH_TOKEN, this.f5224a.getDb().get(Oauth2AccessToken.KEY_REFRESH_TOKEN)));
        try {
            String httpPost = this.f5370h.httpPost("https://api.weibo.com/oauth2/access_token", arrayList, "/oauth2/access_token", b());
            if (TextUtils.isEmpty(httpPost) || httpPost.contains("error") || httpPost.contains("error_code")) {
                return false;
            }
            HashMap fromJson = new Hashon().fromJson(httpPost);
            String valueOf = String.valueOf(fromJson.get(Oauth2AccessToken.KEY_UID));
            String valueOf2 = String.valueOf(fromJson.get(Oauth2AccessToken.KEY_EXPIRES_IN));
            this.f5368f = String.valueOf(fromJson.get(Oauth2AccessToken.KEY_ACCESS_TOKEN));
            String valueOf3 = String.valueOf(fromJson.get(Oauth2AccessToken.KEY_REFRESH_TOKEN));
            String valueOf4 = String.valueOf(fromJson.get("remind_in"));
            this.f5224a.getDb().putUserId(valueOf);
            this.f5224a.getDb().putExpiresIn(Long.valueOf(valueOf2).longValue());
            this.f5224a.getDb().putToken(this.f5368f);
            this.f5224a.getDb().put(Oauth2AccessToken.KEY_REFRESH_TOKEN, valueOf3);
            this.f5224a.getDb().put("remind_in", valueOf4);
            return true;
        } catch (Throwable th2) {
            SSDKLog.b().a(th2);
            return false;
        }
    }

    public String b(String str) {
        ArrayList<KVPair<String>> arrayList = new ArrayList<>();
        arrayList.add(new KVPair<>("client_id", this.f5365c));
        arrayList.add(new KVPair<>("client_secret", this.f5366d));
        arrayList.add(new KVPair<>("redirect_uri", this.f5367e));
        arrayList.add(new KVPair<>("grant_type", "authorization_code"));
        arrayList.add(new KVPair<>("code", str));
        String httpPost = this.f5370h.httpPost("https://api.weibo.com/oauth2/access_token", arrayList, "/oauth2/access_token", b());
        ShareSDK.logApiEvent("/oauth2/access_token", b());
        return httpPost;
    }

    public HashMap<String, Object> b(int i10, int i11, String str) {
        KVPair<String> kVPair;
        ArrayList<KVPair<String>> arrayList = new ArrayList<>();
        arrayList.add(new KVPair<>("source", this.f5365c));
        String str2 = this.f5368f;
        if (str2 != null) {
            arrayList.add(new KVPair<>(Oauth2AccessToken.KEY_ACCESS_TOKEN, str2));
        }
        boolean z10 = true;
        try {
            ResHelper.parseLong(str);
        } catch (Throwable unused) {
            z10 = false;
        }
        if (z10) {
            kVPair = new KVPair<>(Oauth2AccessToken.KEY_UID, str);
        } else {
            kVPair = new KVPair<>("screen_name", str);
        }
        arrayList.add(kVPair);
        arrayList.add(new KVPair<>("count", String.valueOf(i10)));
        arrayList.add(new KVPair<>("cursor", String.valueOf(i11)));
        String httpGet = this.f5370h.httpGet("https://api.weibo.com/2/friendships/friends.json", arrayList, "/2/friendships/friends.json", b());
        if (httpGet != null) {
            return d.b(httpGet);
        }
        return null;
    }

    public void b(final Platform.ShareParams shareParams, final PlatformActionListener platformActionListener) {
        DH.requester(MobSDK.getContext()).getDeviceKey().getDetailNetworkTypeForStatic().getScreenSize().getCarrier().getNetworkType().request(new DH.DHResponder() { // from class: cn.sharesdk.sina.weibo.a.3
            @Override // com.mob.tools.utils.DH.DHResponder
            public void onResponse(DH.DHResponse dHResponse) {
                String str;
                Platform.ShareParams shareParams2;
                String string;
                try {
                    HashMap<String, String> hashMap = new HashMap<>();
                    hashMap.put("dk", dHResponse.getDeviceKey());
                    hashMap.put("nt", dHResponse.getNetworkType());
                    hashMap.put("dnwktfs", dHResponse.getDetailNetworkTypeForStatic());
                    hashMap.put("srs", dHResponse.getScreenSize());
                    hashMap.put("car", dHResponse.getCarrier());
                    final Platform.ShareParams shareParams3 = shareParams;
                    if (TextUtils.isEmpty(shareParams3.getUrl())) {
                        str = shareParams.getText();
                    } else {
                        str = shareParams.getText() + " " + shareParams.getUrl();
                    }
                    if (TextUtils.isEmpty(str)) {
                        int stringRes = ResHelper.getStringRes(MobSDK.getContext(), "ssdk_weibo_upload_content");
                        if (stringRes > 0) {
                            shareParams2 = shareParams;
                            string = MobSDK.getContext().getResources().getString(stringRes);
                        }
                        AuthorizeListener authorizeListener = new AuthorizeListener() { // from class: cn.sharesdk.sina.weibo.a.3.1
                            @Override // cn.sharesdk.framework.authorize.AuthorizeListener
                            public void onCancel() {
                                AnonymousClass3 anonymousClass3 = AnonymousClass3.this;
                                PlatformActionListener platformActionListener2 = platformActionListener;
                                if (platformActionListener2 != null) {
                                    platformActionListener2.onCancel(a.this.f5224a, 9);
                                }
                            }

                            @Override // cn.sharesdk.framework.authorize.AuthorizeListener
                            public void onComplete(Bundle bundle) {
                                if (platformActionListener != null) {
                                    HashMap<String, Object> hashMap2 = new HashMap<>();
                                    hashMap2.put("ShareParams", shareParams3);
                                    AnonymousClass3 anonymousClass3 = AnonymousClass3.this;
                                    platformActionListener.onComplete(a.this.f5224a, 9, hashMap2);
                                }
                                if (bundle != null) {
                                    String string2 = bundle.getString(Oauth2AccessToken.KEY_UID);
                                    String string3 = bundle.getString(Oauth2AccessToken.KEY_ACCESS_TOKEN);
                                    String string4 = bundle.getString("expire_in");
                                    if (!TextUtils.isEmpty(string3)) {
                                        a.this.f5368f = string3;
                                        a.this.f5224a.getDb().putToken(a.this.f5368f);
                                    }
                                    a.this.f5224a.getDb().putUserId(string2);
                                    try {
                                        a.this.f5224a.getDb().putExpiresIn(ResHelper.parseLong(string4));
                                    } catch (Throwable unused) {
                                    }
                                }
                            }

                            @Override // cn.sharesdk.framework.authorize.AuthorizeListener
                            public void onError(Throwable th2) {
                                AnonymousClass3 anonymousClass3 = AnonymousClass3.this;
                                PlatformActionListener platformActionListener2 = platformActionListener;
                                if (platformActionListener2 != null) {
                                    platformActionListener2.onError(a.this.f5224a, 9, th2);
                                }
                            }
                        };
                        WebSharePage webSharePage = new WebSharePage();
                        webSharePage.setAppKey(a.this.f5365c, a.this.f5368f);
                        webSharePage.setShareParams(shareParams);
                        webSharePage.setListener(authorizeListener);
                        webSharePage.show(MobSDK.getContext(), null);
                    }
                    string = a.this.f5224a.getShortLintk(str, false, hashMap);
                    shareParams2 = shareParams;
                    shareParams2.setText(string);
                    AuthorizeListener authorizeListener2 = new AuthorizeListener() { // from class: cn.sharesdk.sina.weibo.a.3.1
                        @Override // cn.sharesdk.framework.authorize.AuthorizeListener
                        public void onCancel() {
                            AnonymousClass3 anonymousClass3 = AnonymousClass3.this;
                            PlatformActionListener platformActionListener2 = platformActionListener;
                            if (platformActionListener2 != null) {
                                platformActionListener2.onCancel(a.this.f5224a, 9);
                            }
                        }

                        @Override // cn.sharesdk.framework.authorize.AuthorizeListener
                        public void onComplete(Bundle bundle) {
                            if (platformActionListener != null) {
                                HashMap<String, Object> hashMap2 = new HashMap<>();
                                hashMap2.put("ShareParams", shareParams3);
                                AnonymousClass3 anonymousClass3 = AnonymousClass3.this;
                                platformActionListener.onComplete(a.this.f5224a, 9, hashMap2);
                            }
                            if (bundle != null) {
                                String string2 = bundle.getString(Oauth2AccessToken.KEY_UID);
                                String string3 = bundle.getString(Oauth2AccessToken.KEY_ACCESS_TOKEN);
                                String string4 = bundle.getString("expire_in");
                                if (!TextUtils.isEmpty(string3)) {
                                    a.this.f5368f = string3;
                                    a.this.f5224a.getDb().putToken(a.this.f5368f);
                                }
                                a.this.f5224a.getDb().putUserId(string2);
                                try {
                                    a.this.f5224a.getDb().putExpiresIn(ResHelper.parseLong(string4));
                                } catch (Throwable unused) {
                                }
                            }
                        }

                        @Override // cn.sharesdk.framework.authorize.AuthorizeListener
                        public void onError(Throwable th2) {
                            AnonymousClass3 anonymousClass3 = AnonymousClass3.this;
                            PlatformActionListener platformActionListener2 = platformActionListener;
                            if (platformActionListener2 != null) {
                                platformActionListener2.onError(a.this.f5224a, 9, th2);
                            }
                        }
                    };
                    WebSharePage webSharePage2 = new WebSharePage();
                    webSharePage2.setAppKey(a.this.f5365c, a.this.f5368f);
                    webSharePage2.setShareParams(shareParams);
                    webSharePage2.setListener(authorizeListener2);
                    webSharePage2.show(MobSDK.getContext(), null);
                } catch (Throwable th2) {
                    PlatformActionListener platformActionListener2 = platformActionListener;
                    if (platformActionListener2 != null) {
                        platformActionListener2.onError(a.this.f5224a, 9, th2);
                    }
                }
            }
        });
    }

    public HashMap<String, Object> c(int i10, int i11, String str) {
        KVPair<String> kVPair;
        ArrayList<KVPair<String>> arrayList = new ArrayList<>();
        arrayList.add(new KVPair<>("source", this.f5365c));
        String str2 = this.f5368f;
        if (str2 != null) {
            arrayList.add(new KVPair<>(Oauth2AccessToken.KEY_ACCESS_TOKEN, str2));
        }
        boolean z10 = true;
        try {
            ResHelper.parseLong(str);
        } catch (Throwable unused) {
            z10 = false;
        }
        if (z10) {
            kVPair = new KVPair<>(Oauth2AccessToken.KEY_UID, str);
        } else {
            kVPair = new KVPair<>("screen_name", str);
        }
        arrayList.add(kVPair);
        arrayList.add(new KVPair<>("count", String.valueOf(i10)));
        arrayList.add(new KVPair<>("page", String.valueOf(i11)));
        String httpGet = this.f5370h.httpGet("https://api.weibo.com/2/friendships/friends/bilateral.json", arrayList, "/2/friendships/friends/bilateral.json", b());
        if (httpGet != null) {
            return d.b(httpGet);
        }
        return null;
    }

    public void c() {
        cn.sharesdk.sina.weibo.sdk.a.a(MobSDK.getContext(), DH.SyncMtd.getPackageName(), new ShareSDKCallback<String>() { // from class: cn.sharesdk.sina.weibo.a.4
            @Override // cn.sharesdk.framework.ShareSDKCallback
            /* renamed from: a */
            public void onCallback(String str) {
                Intent intent = new Intent();
                intent.setAction("com.sina.weibo.sdk.Intent.ACTION_WEIBO_REGISTER");
                String packageName = MobSDK.getContext().getPackageName();
                intent.putExtra("_weibo_sdkVersion", "0031405000");
                intent.putExtra("_weibo_appPackage", packageName);
                intent.putExtra("_weibo_appKey", a.this.f5365c);
                intent.putExtra("_weibo_flag", 538116905);
                intent.putExtra("_weibo_sign", str);
                SSDKLog b10 = SSDKLog.b();
                b10.a("intent=" + intent + ", extra=" + intent.getExtras(), new Object[0]);
                MobSDK.getContext().sendBroadcast(intent, "com.sina.weibo.permission.WEIBO_SDK_PERMISSION");
            }
        });
    }

    public void c(String str) {
        this.f5368f = str;
    }

    public HashMap<String, Object> d(int i10, int i11, String str) {
        ArrayList<KVPair<String>> arrayList = new ArrayList<>();
        arrayList.add(new KVPair<>("source", this.f5365c));
        String str2 = this.f5368f;
        if (str2 != null) {
            arrayList.add(new KVPair<>(Oauth2AccessToken.KEY_ACCESS_TOKEN, str2));
        }
        boolean z10 = true;
        try {
            ResHelper.parseLong(str);
        } catch (Throwable unused) {
            z10 = false;
        }
        arrayList.add(z10 ? new KVPair<>(Oauth2AccessToken.KEY_UID, str) : new KVPair<>("screen_name", str));
        arrayList.add(new KVPair<>("count", String.valueOf(i10)));
        arrayList.add(new KVPair<>("cursor", String.valueOf(i11)));
        String httpGet = this.f5370h.httpGet("https://api.weibo.com/2/friendships/followers.json", arrayList, "/2/friendships/followers.json", b());
        if (httpGet != null) {
            return d.b(httpGet);
        }
        return null;
    }

    public HashMap<String, Object> e(String str) {
        boolean z10;
        KVPair<String> kVPair;
        ArrayList<KVPair<String>> arrayList = new ArrayList<>();
        arrayList.add(new KVPair<>("source", this.f5365c));
        arrayList.add(new KVPair<>(Oauth2AccessToken.KEY_ACCESS_TOKEN, this.f5368f));
        try {
            ResHelper.parseLong(str);
            z10 = true;
        } catch (Throwable unused) {
            z10 = false;
        }
        if (z10) {
            kVPair = new KVPair<>(Oauth2AccessToken.KEY_UID, str);
        } else {
            kVPair = new KVPair<>("screen_name", str);
        }
        arrayList.add(kVPair);
        String httpPost = this.f5370h.httpPost("https://api.weibo.com/2/friendships/create.json", arrayList, "/2/friendships/create.json", b());
        if (httpPost != null) {
            return d.b(httpPost);
        }
        return null;
    }

    @Override // cn.sharesdk.framework.authorize.AuthorizeHelper
    public String getAuthorizeUrl() {
        return "";
    }

    @Override // cn.sharesdk.framework.authorize.AuthorizeHelper
    public b getAuthorizeWebviewClient(WebAuthorizeActivity webAuthorizeActivity) {
        return new cn.sharesdk.sina.weibo.utils.a(webAuthorizeActivity);
    }

    @Override // cn.sharesdk.framework.authorize.AuthorizeHelper
    public String getRedirectUri() {
        return TextUtils.isEmpty(this.f5367e) ? "https://api.weibo.com/oauth2/default.html" : this.f5367e;
    }

    @Override // cn.sharesdk.framework.e, cn.sharesdk.framework.authorize.AuthorizeHelper
    public c getSSOProcessor(SSOAuthorizeActivity sSOAuthorizeActivity) {
        cn.sharesdk.sina.weibo.utils.b bVar = new cn.sharesdk.sina.weibo.utils.b(sSOAuthorizeActivity);
        bVar.a(32973);
        bVar.a(this.f5365c, this.f5367e, this.f5369g);
        return bVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public HashMap<String, Object> a(String str, String str2, HashMap<String, Object> hashMap, HashMap<String, String> hashMap2) {
        KVPair kVPair;
        String str3;
        if (str2 == null) {
            return null;
        }
        ArrayList<KVPair<String>> arrayList = new ArrayList<>();
        if (hashMap != null && hashMap.size() > 0) {
            for (Map.Entry<String, Object> entry : hashMap.entrySet()) {
                arrayList.add(new KVPair<>(entry.getKey(), String.valueOf(entry.getValue())));
            }
        }
        arrayList.add(new KVPair<>("source", this.f5365c));
        String str4 = this.f5368f;
        if (str4 != null) {
            arrayList.add(new KVPair<>(Oauth2AccessToken.KEY_ACCESS_TOKEN, str4));
        }
        if (hashMap2 == null || hashMap2.size() <= 0) {
            kVPair = null;
        } else {
            KVPair kVPair2 = null;
            for (Map.Entry<String, String> entry2 : hashMap2.entrySet()) {
                kVPair2 = new KVPair(entry2.getKey(), entry2.getValue());
            }
            kVPair = kVPair2;
        }
        try {
        } catch (Throwable th2) {
            SSDKLog.b().a(th2);
        }
        if ("GET".equals(str2.toUpperCase())) {
            str3 = new NetworkHelper().httpGet(str, arrayList, null, null);
        } else {
            if ("POST".equals(str2.toUpperCase())) {
                str3 = new NetworkHelper().httpPost(str, arrayList, kVPair, (ArrayList<KVPair<String>>) null, (NetworkHelper.NetworkTimeOut) null);
            }
            str3 = null;
        }
        if (str3 == null || str3.length() <= 0) {
            return null;
        }
        return d.b(str3);
    }

    public HashMap<String, Object> d(String str) {
        ArrayList<KVPair<String>> arrayList = new ArrayList<>();
        arrayList.add(new KVPair<>("source", this.f5365c));
        String str2 = this.f5368f;
        if (str2 != null) {
            arrayList.add(new KVPair<>(Oauth2AccessToken.KEY_ACCESS_TOKEN, str2));
        }
        boolean z10 = true;
        try {
            ResHelper.parseLong(str);
        } catch (Throwable unused) {
            z10 = false;
        }
        arrayList.add(z10 ? new KVPair<>(Oauth2AccessToken.KEY_UID, str) : new KVPair<>("screen_name", str));
        String httpGet = this.f5370h.httpGet("https://api.weibo.com/2/users/show.json", arrayList, "/2/users/show.json", b());
        if (httpGet != null) {
            return d.b(httpGet);
        }
        return null;
    }
}
