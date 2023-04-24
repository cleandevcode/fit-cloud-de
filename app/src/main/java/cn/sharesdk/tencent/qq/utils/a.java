package cn.sharesdk.tencent.qq.utils;

import a.b;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.media.d;
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
import cn.sharesdk.framework.authorize.c;
import cn.sharesdk.framework.e;
import cn.sharesdk.framework.network.SSDKNetworkHelper;
import cn.sharesdk.framework.utils.SSDKLog;
import cn.sharesdk.framework.utils.g;
import cn.sharesdk.tencent.qq.ShareActivity;
import com.mob.MobSDK;
import com.mob.tools.RxMob;
import com.mob.tools.network.KVPair;
import com.mob.tools.network.NetworkHelper;
import com.mob.tools.utils.DH;
import com.mob.tools.utils.Data;
import com.mob.tools.utils.Hashon;
import com.mob.tools.utils.ResHelper;
import com.sina.weibo.sdk.auth.Oauth2AccessToken;
import hj.o;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;

/* loaded from: classes.dex */
public class a extends e {

    /* renamed from: b */
    private static final String[] f5472b = {"get_user_info", "get_simple_userinfo", "get_user_profile", "get_app_friends", "add_share", "list_album", "upload_pic", "add_album", "set_user_face", "get_vip_info", "get_vip_rich_info", "get_intimate_friends_weibo", "match_nick_tips_weibo", "add_t", "add_pic_t"};

    /* renamed from: c */
    private static a f5473c;

    /* renamed from: d */
    private String f5474d;

    /* renamed from: e */
    private String[] f5475e;

    /* renamed from: f */
    private String f5476f;

    /* renamed from: g */
    private String f5477g;

    /* renamed from: h */
    private String f5478h;

    /* renamed from: i */
    private String f5479i;

    private a(Platform platform) {
        super(platform);
    }

    public static a a(Platform platform) {
        if (f5473c == null) {
            f5473c = new a(platform);
        }
        return f5473c;
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x0014  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0017  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x006c A[Catch: all -> 0x00cc, TryCatch #0 {all -> 0x00cc, blocks: (B:43:0x0002, B:45:0x0008, B:53:0x0019, B:55:0x006c, B:57:0x0072, B:58:0x007a, B:61:0x009c, B:64:0x00a4, B:66:0x00bb, B:67:0x00c6, B:59:0x008e), top: B:73:0x0002 }] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x008e A[Catch: all -> 0x00cc, TryCatch #0 {all -> 0x00cc, blocks: (B:43:0x0002, B:45:0x0008, B:53:0x0019, B:55:0x006c, B:57:0x0072, B:58:0x007a, B:61:0x009c, B:64:0x00a4, B:66:0x00bb, B:67:0x00c6, B:59:0x008e), top: B:73:0x0002 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void a(java.lang.String r7, java.lang.String r8, java.lang.String r9, java.lang.String r10, java.lang.String r11, java.lang.String r12, cn.sharesdk.framework.PlatformActionListener r13) {
        /*
            r6 = this;
            r7 = 9
            boolean r8 = android.text.TextUtils.isEmpty(r10)     // Catch: java.lang.Throwable -> Lcc
            if (r8 == 0) goto L11
            boolean r8 = android.text.TextUtils.isEmpty(r11)     // Catch: java.lang.Throwable -> Lcc
            if (r8 != 0) goto Lf
            goto L11
        Lf:
            r8 = 0
            goto L12
        L11:
            r8 = 1
        L12:
            if (r8 != 0) goto L17
            java.lang.String r12 = "/t/add_t"
            goto L19
        L17:
            java.lang.String r12 = "/t/add_pic_t"
        L19:
            r4 = r12
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lcc
            r12.<init>()     // Catch: java.lang.Throwable -> Lcc
            java.lang.String r0 = "https://graph.qq.com"
            r12.append(r0)     // Catch: java.lang.Throwable -> Lcc
            r12.append(r4)     // Catch: java.lang.Throwable -> Lcc
            java.lang.String r1 = r12.toString()     // Catch: java.lang.Throwable -> Lcc
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch: java.lang.Throwable -> Lcc
            r2.<init>()     // Catch: java.lang.Throwable -> Lcc
            com.mob.tools.network.KVPair r12 = new com.mob.tools.network.KVPair     // Catch: java.lang.Throwable -> Lcc
            java.lang.String r0 = "oauth_consumer_key"
            java.lang.String r3 = r6.f5474d     // Catch: java.lang.Throwable -> Lcc
            r12.<init>(r0, r3)     // Catch: java.lang.Throwable -> Lcc
            r2.add(r12)     // Catch: java.lang.Throwable -> Lcc
            com.mob.tools.network.KVPair r12 = new com.mob.tools.network.KVPair     // Catch: java.lang.Throwable -> Lcc
            java.lang.String r0 = "access_token"
            java.lang.String r3 = r6.f5478h     // Catch: java.lang.Throwable -> Lcc
            r12.<init>(r0, r3)     // Catch: java.lang.Throwable -> Lcc
            r2.add(r12)     // Catch: java.lang.Throwable -> Lcc
            com.mob.tools.network.KVPair r12 = new com.mob.tools.network.KVPair     // Catch: java.lang.Throwable -> Lcc
            java.lang.String r0 = "openid"
            java.lang.String r3 = r6.f5476f     // Catch: java.lang.Throwable -> Lcc
            r12.<init>(r0, r3)     // Catch: java.lang.Throwable -> Lcc
            r2.add(r12)     // Catch: java.lang.Throwable -> Lcc
            com.mob.tools.network.KVPair r12 = new com.mob.tools.network.KVPair     // Catch: java.lang.Throwable -> Lcc
            java.lang.String r0 = "format"
            java.lang.String r3 = "json"
            r12.<init>(r0, r3)     // Catch: java.lang.Throwable -> Lcc
            r2.add(r12)     // Catch: java.lang.Throwable -> Lcc
            com.mob.tools.network.KVPair r12 = new com.mob.tools.network.KVPair     // Catch: java.lang.Throwable -> Lcc
            java.lang.String r0 = "content"
            r12.<init>(r0, r9)     // Catch: java.lang.Throwable -> Lcc
            r2.add(r12)     // Catch: java.lang.Throwable -> Lcc
            if (r8 == 0) goto L8e
            boolean r8 = android.text.TextUtils.isEmpty(r10)     // Catch: java.lang.Throwable -> Lcc
            if (r8 == 0) goto L7a
            android.content.Context r8 = com.mob.MobSDK.getContext()     // Catch: java.lang.Throwable -> Lcc
            java.lang.String r10 = com.mob.tools.utils.BitmapHelper.downloadBitmap(r8, r11)     // Catch: java.lang.Throwable -> Lcc
        L7a:
            com.mob.tools.network.KVPair r3 = new com.mob.tools.network.KVPair     // Catch: java.lang.Throwable -> Lcc
            java.lang.String r8 = "pic"
            r3.<init>(r8, r10)     // Catch: java.lang.Throwable -> Lcc
            cn.sharesdk.framework.network.SSDKNetworkHelper r0 = cn.sharesdk.framework.network.SSDKNetworkHelper.getInstance()     // Catch: java.lang.Throwable -> Lcc
            int r5 = r6.b()     // Catch: java.lang.Throwable -> Lcc
            java.lang.String r8 = r0.httpPost(r1, r2, r3, r4, r5)     // Catch: java.lang.Throwable -> Lcc
            goto L9a
        L8e:
            cn.sharesdk.framework.network.SSDKNetworkHelper r8 = cn.sharesdk.framework.network.SSDKNetworkHelper.getInstance()     // Catch: java.lang.Throwable -> Lcc
            int r9 = r6.b()     // Catch: java.lang.Throwable -> Lcc
            java.lang.String r8 = r8.httpPost(r1, r2, r4, r9)     // Catch: java.lang.Throwable -> Lcc
        L9a:
            if (r8 == 0) goto Ld4
            int r9 = r8.length()     // Catch: java.lang.Throwable -> Lcc
            if (r9 <= 0) goto Ld4
            if (r13 == 0) goto Ld4
            com.mob.tools.utils.Hashon r9 = new com.mob.tools.utils.Hashon     // Catch: java.lang.Throwable -> Lcc
            r9.<init>()     // Catch: java.lang.Throwable -> Lcc
            java.util.HashMap r9 = r9.fromJson(r8)     // Catch: java.lang.Throwable -> Lcc
            java.lang.String r10 = "ret"
            java.lang.Object r10 = r9.get(r10)     // Catch: java.lang.Throwable -> Lcc
            java.lang.Integer r10 = (java.lang.Integer) r10     // Catch: java.lang.Throwable -> Lcc
            int r10 = r10.intValue()     // Catch: java.lang.Throwable -> Lcc
            if (r10 == 0) goto Lc6
            cn.sharesdk.framework.Platform r9 = r6.f5224a     // Catch: java.lang.Throwable -> Lcc
            java.lang.Exception r10 = new java.lang.Exception     // Catch: java.lang.Throwable -> Lcc
            r10.<init>(r8)     // Catch: java.lang.Throwable -> Lcc
            r13.onError(r9, r7, r10)     // Catch: java.lang.Throwable -> Lcc
            goto Ld4
        Lc6:
            cn.sharesdk.framework.Platform r8 = r6.f5224a     // Catch: java.lang.Throwable -> Lcc
            r13.onComplete(r8, r7, r9)     // Catch: java.lang.Throwable -> Lcc
            goto Ld4
        Lcc:
            r8 = move-exception
            if (r13 == 0) goto Ld4
            cn.sharesdk.framework.Platform r9 = r6.f5224a
            r13.onError(r9, r7, r8)
        Ld4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: cn.sharesdk.tencent.qq.utils.a.a(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, cn.sharesdk.framework.PlatformActionListener):void");
    }

    private String c() {
        String[] strArr = this.f5475e;
        if (strArr == null) {
            strArr = f5472b;
        }
        StringBuilder sb2 = new StringBuilder();
        int i10 = 0;
        for (String str : strArr) {
            if (i10 > 0) {
                sb2.append(',');
            }
            sb2.append(str);
            i10++;
        }
        return sb2.toString();
    }

    public void a() {
        RxMob.Subscribable create = RxMob.create(new RxMob.OnSubscribe() { // from class: cn.sharesdk.tencent.qq.utils.QQHelper$2
            @Override // com.mob.tools.RxMob.OnSubscribe
            public void call(RxMob.Subscriber subscriber) {
                String str;
                Platform platform;
                ArrayList<KVPair<String>> arrayList = new ArrayList<>();
                str = a.this.f5478h;
                arrayList.add(new KVPair<>(Oauth2AccessToken.KEY_ACCESS_TOKEN, str));
                arrayList.add(new KVPair<>("unionid", "1"));
                NetworkHelper.NetworkTimeOut networkTimeOut = new NetworkHelper.NetworkTimeOut();
                networkTimeOut.readTimout = 10000;
                networkTimeOut.connectionTimeout = 10000;
                SSDKNetworkHelper sSDKNetworkHelper = SSDKNetworkHelper.getInstance();
                try {
                    a.this.f5477g = sSDKNetworkHelper.httpPost("https://graph.qq.com/oauth2.0/me", arrayList, (KVPair<String>) null, (ArrayList<KVPair<String>>) null, networkTimeOut);
                    subscriber.onCompleted();
                } catch (Throwable th2) {
                    th2.printStackTrace();
                    platform = a.this.f5224a;
                    platform.getDb().put("unionid", "");
                    SSDKLog.b().a("qq auth,get unionId fail", new Object[0]);
                }
            }
        });
        create.subscribeOn(RxMob.Thread.NEW_THREAD);
        create.observeOn(RxMob.Thread.IMMEDIATE);
        create.subscribe(new RxMob.Subscriber() { // from class: cn.sharesdk.tencent.qq.utils.QQHelper$3
            @Override // com.mob.tools.RxMob.Subscriber
            public void onCompleted() {
                String str;
                String str2;
                String str3;
                String str4;
                String str5;
                Platform platform;
                Platform platform2;
                str = a.this.f5477g;
                if (str != null) {
                    str2 = a.this.f5477g;
                    if (str2.length() > 0) {
                        a aVar = a.this;
                        str3 = aVar.f5477g;
                        aVar.f5477g = str3.replace("callback( ", "");
                        a aVar2 = a.this;
                        str4 = aVar2.f5477g;
                        aVar2.f5477g = str4.replace(" );", "");
                        Hashon hashon = new Hashon();
                        str5 = a.this.f5477g;
                        HashMap fromJson = hashon.fromJson(str5);
                        if (!fromJson.containsKey("unionid")) {
                            platform = a.this.f5224a;
                            platform.getDb().put("unionid", "");
                            return;
                        }
                        platform2 = a.this.f5224a;
                        platform2.getDb().put("unionid", (String) fromJson.get("unionid"));
                    }
                }
            }

            @Override // com.mob.tools.RxMob.Subscriber
            public void onError(Throwable th2) {
                Platform platform;
                platform = a.this.f5224a;
                platform.getDb().put("unionid", "");
                SSDKLog.b().a("qq auth,get unionId fail", new Object[0]);
            }
        });
    }

    public void a(Platform platform, Platform.ShareParams shareParams, PlatformActionListener platformActionListener) {
        g gVar = new g();
        gVar.a(this.f5479i, "com.tencent.mobileqq.activity.JumpActivity");
        gVar.a(shareParams, platform);
        HashMap<String, Object> hashMap = new HashMap<>();
        hashMap.put("ShareParams", shareParams);
        platformActionListener.onComplete(platform, 9, hashMap);
    }

    public void a(final ShareSDKCallback<Boolean> shareSDKCallback) {
        DH.requester(MobSDK.getContext()).getPInfoForce(true, "com.tencent.mobileqq", 0).getPInfoForce(true, "com.tencent.tim", 0).getPInfoForce(true, "com.tencent.minihd.qq", 0).getPInfoForce(true, "com.tencent.mobileqqi", 0).getPInfoForce(true, "com.tencent.qqlite", 0).request(new DH.DHResponder() { // from class: cn.sharesdk.tencent.qq.utils.a.2
            /* JADX WARN: Removed duplicated region for block: B:51:0x0062 A[Catch: all -> 0x0072, TryCatch #0 {all -> 0x0072, blocks: (B:36:0x0001, B:38:0x002f, B:39:0x0035, B:49:0x005e, B:51:0x0062, B:55:0x006a, B:41:0x003b, B:43:0x0044, B:45:0x004d, B:47:0x0056), top: B:61:0x0001 }] */
            /* JADX WARN: Removed duplicated region for block: B:63:? A[RETURN, SYNTHETIC] */
            @Override // com.mob.tools.utils.DH.DHResponder
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public void onResponse(com.mob.tools.utils.DH.DHResponse r9) {
                /*
                    r8 = this;
                    r0 = 1
                    int[] r1 = new int[r0]     // Catch: java.lang.Throwable -> L72
                    r2 = 0
                    r1[r2] = r2     // Catch: java.lang.Throwable -> L72
                    android.content.pm.PackageInfo r1 = r9.getPInfoForce(r1)     // Catch: java.lang.Throwable -> L72
                    int[] r3 = new int[r0]     // Catch: java.lang.Throwable -> L72
                    r3[r2] = r0     // Catch: java.lang.Throwable -> L72
                    android.content.pm.PackageInfo r3 = r9.getPInfoForce(r3)     // Catch: java.lang.Throwable -> L72
                    int[] r4 = new int[r0]     // Catch: java.lang.Throwable -> L72
                    r5 = 2
                    r4[r2] = r5     // Catch: java.lang.Throwable -> L72
                    android.content.pm.PackageInfo r4 = r9.getPInfoForce(r4)     // Catch: java.lang.Throwable -> L72
                    int[] r5 = new int[r0]     // Catch: java.lang.Throwable -> L72
                    r6 = 3
                    r5[r2] = r6     // Catch: java.lang.Throwable -> L72
                    android.content.pm.PackageInfo r5 = r9.getPInfoForce(r5)     // Catch: java.lang.Throwable -> L72
                    int[] r6 = new int[r0]     // Catch: java.lang.Throwable -> L72
                    r7 = 4
                    r6[r2] = r7     // Catch: java.lang.Throwable -> L72
                    android.content.pm.PackageInfo r9 = r9.getPInfoForce(r6)     // Catch: java.lang.Throwable -> L72
                    if (r1 == 0) goto L39
                    java.lang.String r9 = r1.versionName     // Catch: java.lang.Throwable -> L72
                    cn.sharesdk.tencent.qq.utils.a r1 = cn.sharesdk.tencent.qq.utils.a.this     // Catch: java.lang.Throwable -> L72
                    java.lang.String r3 = "com.tencent.mobileqq"
                L35:
                    cn.sharesdk.tencent.qq.utils.a.b(r1, r3)     // Catch: java.lang.Throwable -> L72
                    goto L5e
                L39:
                    if (r3 == 0) goto L42
                    java.lang.String r9 = r3.versionName     // Catch: java.lang.Throwable -> L72
                    cn.sharesdk.tencent.qq.utils.a r1 = cn.sharesdk.tencent.qq.utils.a.this     // Catch: java.lang.Throwable -> L72
                    java.lang.String r3 = "com.tencent.tim"
                    goto L35
                L42:
                    if (r4 == 0) goto L4b
                    java.lang.String r9 = r4.versionName     // Catch: java.lang.Throwable -> L72
                    cn.sharesdk.tencent.qq.utils.a r1 = cn.sharesdk.tencent.qq.utils.a.this     // Catch: java.lang.Throwable -> L72
                    java.lang.String r3 = "com.tencent.minihd.qq"
                    goto L35
                L4b:
                    if (r5 == 0) goto L54
                    java.lang.String r9 = r5.versionName     // Catch: java.lang.Throwable -> L72
                    cn.sharesdk.tencent.qq.utils.a r1 = cn.sharesdk.tencent.qq.utils.a.this     // Catch: java.lang.Throwable -> L72
                    java.lang.String r3 = "com.tencent.mobileqqi"
                    goto L35
                L54:
                    if (r9 == 0) goto L5d
                    java.lang.String r9 = r9.versionName     // Catch: java.lang.Throwable -> L72
                    cn.sharesdk.tencent.qq.utils.a r1 = cn.sharesdk.tencent.qq.utils.a.this     // Catch: java.lang.Throwable -> L72
                    java.lang.String r3 = "com.tencent.qqlite"
                    goto L35
                L5d:
                    r9 = 0
                L5e:
                    cn.sharesdk.framework.ShareSDKCallback r1 = r2     // Catch: java.lang.Throwable -> L72
                    if (r1 == 0) goto L7c
                    boolean r9 = android.text.TextUtils.isEmpty(r9)     // Catch: java.lang.Throwable -> L72
                    if (r9 != 0) goto L69
                    goto L6a
                L69:
                    r0 = 0
                L6a:
                    java.lang.Boolean r9 = java.lang.Boolean.valueOf(r0)     // Catch: java.lang.Throwable -> L72
                    r1.onCallback(r9)     // Catch: java.lang.Throwable -> L72
                    goto L7c
                L72:
                    cn.sharesdk.framework.ShareSDKCallback r9 = r2
                    if (r9 == 0) goto L7c
                    java.lang.Boolean r0 = java.lang.Boolean.FALSE
                    r9.onCallback(r0)
                L7c:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: cn.sharesdk.tencent.qq.utils.a.AnonymousClass2.onResponse(com.mob.tools.utils.DH$DHResponse):void");
            }
        });
    }

    public void a(final AuthorizeListener authorizeListener, boolean z10) {
        a(new SSOListener() { // from class: cn.sharesdk.tencent.qq.utils.a.1
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
                if (th2 != null) {
                    authorizeListener.onError(th2);
                } else {
                    authorizeListener.onError(new Throwable("Unknown Throwable!"));
                }
            }
        });
    }

    public void a(String str) {
        this.f5474d = str;
    }

    public void a(String str, String str2, String str3, String str4, String str5, String str6, PlatformActionListener platformActionListener, boolean z10, int i10, String str7, String str8, String str9, int i11, boolean z11) {
        String str10 = str4;
        if (z10) {
            a(str, str2, str3, str4, str5, str6, platformActionListener);
            SSDKLog.b().a("ShareSDK", " QQ QQHelper addShare weiboShare ");
        } else if (!z11) {
            if (platformActionListener != null) {
                platformActionListener.onError(this.f5224a, 9, new Throwable("QQClientNotExistException"));
            }
        } else {
            SSDKLog.b().a("ShareSDK", " QQ QQHelper addShare isQQInstalled ");
            if (!TextUtils.isEmpty(str4)) {
                File file = new File(str10);
                if (file.exists() && str10.startsWith("/data/")) {
                    String cachePath = ResHelper.getCachePath(MobSDK.getContext(), "images");
                    String absolutePath = new File(cachePath, System.currentTimeMillis() + file.getName()).getAbsolutePath();
                    if (ResHelper.copyFile(str10, absolutePath)) {
                        SSDKLog.b().a("ShareSDK", b.b(" QQ QQHelper imagePath ", absolutePath));
                        str10 = absolutePath;
                    } else {
                        str10 = null;
                        SSDKLog.b().a("ShareSDK", " QQ QQHelper imagePath is null");
                    }
                }
            }
            Intent intent = new Intent();
            intent.putExtra(InnerShareParams.TITLE, str);
            intent.putExtra(InnerShareParams.TITLE_URL, str2);
            intent.putExtra("summary", str3);
            intent.putExtra(InnerShareParams.IMAGE_PATH, str10);
            intent.putExtra(InnerShareParams.IMAGE_URL, str5);
            intent.putExtra(InnerShareParams.MUSIC_URL, str6);
            intent.putExtra("appId", this.f5474d);
            intent.putExtra(InnerShareParams.HIDDEN, i10);
            intent.putExtra(InnerShareParams.QQ_MINI_PROGRAM_APPID, str7);
            intent.putExtra(InnerShareParams.QQ_MINI_PROGRAM_PATH, str8);
            intent.putExtra(InnerShareParams.QQ_MINI_PROGRAM_TYPE, str9);
            intent.putExtra("share_type", i11);
            ShareActivity shareActivity = new ShareActivity();
            shareActivity.setPlatformActionListener(this.f5224a, platformActionListener);
            shareActivity.setAppId(this.f5474d);
            shareActivity.show(MobSDK.getContext(), intent);
        }
    }

    public void a(String[] strArr) {
        this.f5475e = strArr;
    }

    public void b(String str) {
        this.f5476f = str;
    }

    public HashMap<String, Object> c(String str) {
        ArrayList<KVPair<String>> arrayList = new ArrayList<>();
        arrayList.add(new KVPair<>(Oauth2AccessToken.KEY_ACCESS_TOKEN, str));
        ArrayList<KVPair<String>> arrayList2 = new ArrayList<>();
        arrayList2.add(new KVPair<>("User-Agent", System.getProperties().getProperty("http.agent") + " ArzenAndroidSDK"));
        String httpGet = SSDKNetworkHelper.getInstance().httpGet("https://graph.qq.com/oauth2.0/me", arrayList, arrayList2, null, "/oauth2.0/me", b());
        if (httpGet.startsWith("callback")) {
            while (!httpGet.startsWith("{") && httpGet.length() > 0) {
                httpGet = httpGet.substring(1);
            }
            while (!httpGet.endsWith("}") && httpGet.length() > 0) {
                httpGet = httpGet.substring(0, httpGet.length() - 1);
            }
        }
        if (httpGet.length() > 0) {
            return d.b(httpGet);
        }
        return null;
    }

    public void d(String str) {
        this.f5478h = str;
    }

    public HashMap<String, Object> e(String str) {
        ArrayList<KVPair<String>> arrayList = new ArrayList<>();
        arrayList.add(new KVPair<>(Oauth2AccessToken.KEY_ACCESS_TOKEN, this.f5478h));
        arrayList.add(new KVPair<>("oauth_consumer_key", this.f5474d));
        arrayList.add(new KVPair<>("openid", this.f5476f));
        ArrayList<KVPair<String>> arrayList2 = new ArrayList<>();
        arrayList2.add(new KVPair<>("User-Agent", System.getProperties().getProperty("http.agent") + " ArzenAndroidSDK"));
        String httpGet = SSDKNetworkHelper.getInstance().httpGet("https://graph.qq.com/user/get_simple_userinfo", arrayList, arrayList2, null, "/user/get_simple_userinfo", b());
        if (httpGet != null && httpGet.length() > 0) {
            return d.b(httpGet);
        }
        return null;
    }

    @Override // cn.sharesdk.framework.authorize.AuthorizeHelper
    public String getAuthorizeUrl() {
        String redirectUri;
        ShareSDK.logApiEvent("/oauth2.0/authorize", b());
        String c10 = c();
        try {
            redirectUri = Data.urlEncode(getRedirectUri(), "utf-8");
        } catch (Throwable th2) {
            SSDKLog.b().a(th2);
            redirectUri = getRedirectUri();
        }
        StringBuilder a10 = d.a("https://graph.qq.com/oauth2.0/m_authorize?response_type=token&client_id=");
        o.a(a10, this.f5474d, "&redirect_uri=", redirectUri, "&display=mobile&scope=");
        a10.append(c10);
        return a10.toString();
    }

    @Override // cn.sharesdk.framework.authorize.AuthorizeHelper
    public cn.sharesdk.framework.authorize.b getAuthorizeWebviewClient(WebAuthorizeActivity webAuthorizeActivity) {
        return new cn.sharesdk.tencent.qq.a(webAuthorizeActivity);
    }

    @Override // cn.sharesdk.framework.authorize.AuthorizeHelper
    public String getRedirectUri() {
        return "auth://tauth.qq.com/";
    }

    @Override // cn.sharesdk.framework.e, cn.sharesdk.framework.authorize.AuthorizeHelper
    public c getSSOProcessor(SSOAuthorizeActivity sSOAuthorizeActivity) {
        cn.sharesdk.tencent.qq.b bVar = new cn.sharesdk.tencent.qq.b(sSOAuthorizeActivity);
        bVar.a(5656);
        bVar.a(this.f5474d, c(), this.f5479i);
        return bVar;
    }
}
