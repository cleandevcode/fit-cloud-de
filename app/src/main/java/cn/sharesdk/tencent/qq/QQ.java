package cn.sharesdk.tencent.qq;

import android.os.Bundle;
import android.support.v4.media.d;
import android.text.TextUtils;
import cn.sharesdk.facebook.e;
import cn.sharesdk.framework.InnerShareParams;
import cn.sharesdk.framework.Platform;
import cn.sharesdk.framework.PlatformActionListener;
import cn.sharesdk.framework.ShareSDKCallback;
import cn.sharesdk.framework.a.b.f;
import cn.sharesdk.framework.authorize.AuthorizeListener;
import cn.sharesdk.framework.utils.SSDKLog;
import cn.sharesdk.framework.utils.j;
import com.huawei.hms.mlsdk.common.MLApplicationSetting;
import com.mob.MobSDK;
import com.mob.tools.utils.DH;
import com.mob.tools.utils.ResHelper;
import com.sina.weibo.sdk.auth.Oauth2AccessToken;
import java.util.HashMap;

/* loaded from: classes.dex */
public class QQ extends Platform {
    public static final String NAME = "QQ";

    /* renamed from: a */
    private String f5420a;

    /* renamed from: c */
    private boolean f5422c;

    /* renamed from: d */
    private String f5423d = null;

    /* renamed from: e */
    private final Object f5424e = new Object();

    /* renamed from: b */
    private boolean f5421b = true;

    public void a(cn.sharesdk.tencent.qq.utils.a aVar, String str, String str2, String str3, String str4, String str5, String str6, boolean z10, int i10, String str7, String str8, String str9, int i11, final Platform.ShareParams shareParams) {
        try {
            aVar.a(str, str2, str3, str4, str5, str6, new PlatformActionListener() { // from class: cn.sharesdk.tencent.qq.QQ.3
                @Override // cn.sharesdk.framework.PlatformActionListener
                public void onCancel(Platform platform, int i12) {
                    if (QQ.this.listener != null) {
                        QQ.this.listener.onCancel(QQ.this, 9);
                    }
                }

                @Override // cn.sharesdk.framework.PlatformActionListener
                public void onComplete(Platform platform, int i12, HashMap<String, Object> hashMap) {
                    HashMap<String, Object> hashMap2 = new HashMap<>();
                    hashMap2.put("ShareParams", shareParams);
                    if (QQ.this.listener != null) {
                        QQ.this.listener.onComplete(QQ.this, 9, hashMap2);
                    }
                }

                @Override // cn.sharesdk.framework.PlatformActionListener
                public void onError(Platform platform, int i12, Throwable th2) {
                    if (QQ.this.listener != null) {
                        QQ.this.listener.onError(QQ.this, 9, th2);
                    }
                }
            }, z10, i10, str7, str8, str9, i11, this.isClientValid);
        } catch (Throwable th2) {
            PlatformActionListener platformActionListener = this.listener;
            if (platformActionListener != null) {
                platformActionListener.onError(this, 9, th2);
            }
        }
    }

    @Override // cn.sharesdk.framework.Platform
    public boolean checkAuthorize(int i10, Object obj) {
        cn.sharesdk.tencent.qq.utils.a a10 = cn.sharesdk.tencent.qq.utils.a.a(this);
        if (this.isClientValid && this.f5422c && i10 == 9) {
            SSDKLog.b().a("ShareSDK", "QQ checkAuthorize qq.isQQInstalled() return true ");
            return true;
        } else if (!isAuthValid() && (i10 != 9 || obj == null || !(obj instanceof Platform.ShareParams) || ((Platform.ShareParams) obj).isShareTencentWeibo())) {
            innerAuthorize(i10, obj);
            return false;
        } else {
            a10.a(this.f5420a);
            a10.b(this.f5036db.getUserId());
            a10.d(this.f5036db.getToken());
            SSDKLog.b().a("ShareSDK", "QQ checkAuthorize isAuthValid return true ");
            return true;
        }
    }

    @Override // cn.sharesdk.framework.Platform
    public void doAuthorize(String[] strArr) {
        SSDKLog.b().a("ShareSDK", "QQ doAuthorize ");
        SSDKLog b10 = SSDKLog.b();
        StringBuilder a10 = d.a("QQ start Authorize with Appid:");
        a10.append(this.f5420a);
        b10.a(a10.toString(), new Object[0]);
        final cn.sharesdk.tencent.qq.utils.a a11 = cn.sharesdk.tencent.qq.utils.a.a(this);
        a11.a(this.f5420a);
        a11.a(strArr);
        a11.a(new AuthorizeListener() { // from class: cn.sharesdk.tencent.qq.QQ.1
            @Override // cn.sharesdk.framework.authorize.AuthorizeListener
            public void onCancel() {
                if (QQ.this.listener != null) {
                    QQ.this.listener.onCancel(QQ.this, 1);
                }
            }

            @Override // cn.sharesdk.framework.authorize.AuthorizeListener
            public void onComplete(Bundle bundle) {
                String string = bundle.getString("open_id");
                String string2 = bundle.getString(Oauth2AccessToken.KEY_ACCESS_TOKEN);
                String string3 = bundle.getString(Oauth2AccessToken.KEY_EXPIRES_IN);
                QQ.this.f5036db.putToken(string2);
                QQ.this.f5036db.putTokenSecret("");
                try {
                    QQ.this.f5036db.putExpiresIn(ResHelper.parseLong(string3));
                } catch (Throwable th2) {
                    SSDKLog.b().b(th2);
                }
                QQ.this.f5036db.putUserId(string);
                String string4 = bundle.getString("pf");
                String string5 = bundle.getString("pfkey");
                String string6 = bundle.getString("pay_token");
                QQ.this.f5036db.put("pf", string4);
                QQ.this.f5036db.put("pfkey", string5);
                QQ.this.f5036db.put("pay_token", string6);
                a11.b(string);
                a11.d(string2);
                a11.a();
                QQ.this.afterRegister(1, null);
            }

            @Override // cn.sharesdk.framework.authorize.AuthorizeListener
            public void onError(Throwable th2) {
                if (QQ.this.listener != null) {
                    QQ.this.listener.onError(QQ.this, 1, th2);
                }
            }
        }, isSSODisable());
    }

    @Override // cn.sharesdk.framework.Platform
    public void doCustomerProtocol(String str, String str2, int i10, HashMap<String, Object> hashMap, HashMap<String, String> hashMap2) {
        PlatformActionListener platformActionListener = this.listener;
        if (platformActionListener != null) {
            platformActionListener.onCancel(this, i10);
        }
    }

    @Override // cn.sharesdk.framework.Platform
    public void doShare(final Platform.ShareParams shareParams) {
        SSDKLog.b().a("ShareSDK", " QQ doShare ");
        SSDKLog b10 = SSDKLog.b();
        StringBuilder a10 = d.a("QQ start Share with Appid:");
        a10.append(this.f5420a);
        b10.a(a10.toString(), new Object[0]);
        SSDKLog b11 = SSDKLog.b();
        StringBuilder a11 = d.a("QQ ShareParams:");
        a11.append(shareParams.toString());
        b11.a(a11.toString(), new Object[0]);
        final cn.sharesdk.tencent.qq.utils.a a12 = cn.sharesdk.tencent.qq.utils.a.a(this);
        if (this.f5422c && this.isClientValid) {
            try {
                a12.a(this, shareParams, this.listener);
                SSDKLog.b().a("ShareSDK", " QQ byPassShare ");
                return;
            } catch (Throwable th2) {
                PlatformActionListener platformActionListener = this.listener;
                if (platformActionListener != null) {
                    platformActionListener.onError(this, 9, th2);
                }
                SSDKLog.b().a("ShareSDK", e.a(" QQ doShare catch: ", th2));
                return;
            }
        }
        final String title = shareParams.getTitle();
        final String text = shareParams.getText();
        final String imagePath = shareParams.getImagePath();
        final String imageUrl = shareParams.getImageUrl();
        final String musicUrl = shareParams.getMusicUrl();
        String titleUrl = shareParams.getTitleUrl();
        if (TextUtils.isEmpty(titleUrl)) {
            titleUrl = shareParams.getUrl();
        }
        String str = titleUrl;
        final boolean isShareTencentWeibo = shareParams.isShareTencentWeibo();
        final int hidden = shareParams.getHidden();
        final String qQMiniProgramAppid = shareParams.getQQMiniProgramAppid();
        final String qQMiniProgramPath = shareParams.getQQMiniProgramPath();
        final String qQMiniProgramType = shareParams.getQQMiniProgramType();
        final int shareType = shareParams.getShareType();
        if (TextUtils.isEmpty(title) && TextUtils.isEmpty(text) && TextUtils.isEmpty(imagePath) && TextUtils.isEmpty(imageUrl) && TextUtils.isEmpty(musicUrl) && TextUtils.isEmpty(qQMiniProgramAppid)) {
            PlatformActionListener platformActionListener2 = this.listener;
            if (platformActionListener2 != null) {
                platformActionListener2.onError(this, 9, new Throwable("qq share must have one param at least"));
            }
        } else if (!TextUtils.isEmpty(str)) {
            getShortLintk(str, false, new ShareSDKCallback<String>() { // from class: cn.sharesdk.tencent.qq.QQ.2
                @Override // cn.sharesdk.framework.ShareSDKCallback
                /* renamed from: a */
                public void onCallback(String str2) {
                    shareParams.setTitleUrl(str2);
                    QQ.this.a(a12, title, str2, text, imagePath, imageUrl, musicUrl, isShareTencentWeibo, hidden, qQMiniProgramAppid, qQMiniProgramPath, qQMiniProgramType, shareType, shareParams);
                }
            });
        } else {
            a(a12, title, str, text, imagePath, imageUrl, musicUrl, isShareTencentWeibo, hidden, qQMiniProgramAppid, qQMiniProgramPath, qQMiniProgramType, shareType, shareParams);
        }
    }

    @Override // cn.sharesdk.framework.Platform
    public HashMap<String, Object> filterFriendshipInfo(int i10, HashMap<String, Object> hashMap) {
        return null;
    }

    @Override // cn.sharesdk.framework.Platform
    public f.a filterShareContent(Platform.ShareParams shareParams, HashMap<String, Object> hashMap) {
        f.a aVar = new f.a();
        String titleUrl = shareParams.getTitleUrl();
        aVar.f5151c.add(titleUrl);
        aVar.f5149a = this.f5420a;
        String text = shareParams.getText();
        if (!TextUtils.isEmpty(text)) {
            aVar.f5150b = text;
        }
        String imageUrl = shareParams.getImageUrl();
        String imagePath = shareParams.getImagePath();
        if (!TextUtils.isEmpty(imagePath)) {
            aVar.f5153e.add(imagePath);
        } else if (!TextUtils.isEmpty(imageUrl)) {
            aVar.f5152d.add(imageUrl);
        }
        HashMap<String, Object> hashMap2 = new HashMap<>();
        hashMap2.put(InnerShareParams.TITLE, shareParams.getTitle());
        hashMap2.put(InnerShareParams.URL, titleUrl);
        hashMap2.put("imageLocalUrl", imagePath);
        hashMap2.put("summary", text);
        j.a(new j.a() { // from class: cn.sharesdk.tencent.qq.QQ.4
            @Override // cn.sharesdk.framework.utils.j.a
            public void a() {
                DH.requester(MobSDK.getContext()).getAppName().request(new DH.DHResponder() { // from class: cn.sharesdk.tencent.qq.QQ.4.1
                    @Override // com.mob.tools.utils.DH.DHResponder
                    public void onResponse(DH.DHResponse dHResponse) {
                        try {
                            synchronized (QQ.this.f5424e) {
                                QQ.this.f5423d = dHResponse.getAppName();
                                QQ.this.f5424e.notifyAll();
                            }
                        } catch (Throwable th2) {
                            SSDKLog.b().a(th2);
                        }
                    }
                });
            }
        });
        synchronized (this.f5424e) {
            try {
                this.f5424e.wait(1000L);
            }
        }
        hashMap2.put(MLApplicationSetting.BundleKeyConstants.AppInfo.appName, this.f5423d);
        aVar.f5155g = hashMap2;
        return aVar;
    }

    @Override // cn.sharesdk.framework.Platform
    public void follow(String str) {
        PlatformActionListener platformActionListener = this.listener;
        if (platformActionListener != null) {
            platformActionListener.onCancel(this, 6);
        }
    }

    @Override // cn.sharesdk.framework.Platform
    public HashMap<String, Object> getBilaterals(int i10, int i11, String str) {
        return null;
    }

    @Override // cn.sharesdk.framework.Platform
    public HashMap<String, Object> getFollowers(int i10, int i11, String str) {
        return null;
    }

    @Override // cn.sharesdk.framework.Platform
    public HashMap<String, Object> getFollowings(int i10, int i11, String str) {
        return null;
    }

    @Override // cn.sharesdk.framework.Platform
    public void getFriendList(int i10, int i11, String str) {
        PlatformActionListener platformActionListener = this.listener;
        if (platformActionListener != null) {
            platformActionListener.onCancel(this, 2);
        }
    }

    @Override // cn.sharesdk.framework.Platform
    public String getName() {
        return NAME;
    }

    @Override // cn.sharesdk.framework.Platform
    public int getPlatformId() {
        return 24;
    }

    @Override // cn.sharesdk.framework.Platform
    public int getVersion() {
        return 2;
    }

    @Override // cn.sharesdk.framework.Platform
    public boolean hasShareCallback() {
        return this.f5421b;
    }

    @Override // cn.sharesdk.framework.Platform
    public void initDevInfo(String str) {
        this.f5420a = getDevinfo("AppId");
        this.f5422c = "true".equals(getDevinfo("BypassApproval"));
        String str2 = this.f5420a;
        if (str2 == null || str2.length() <= 0) {
            String devinfo = getDevinfo("QZone", "AppId");
            this.f5420a = devinfo;
            if (devinfo == null || devinfo.length() <= 0) {
                return;
            }
            copyDevinfo("QZone", NAME);
            this.f5420a = getDevinfo("AppId");
            SSDKLog.b().a("Try to use the dev info of QZone, this will cause Id and SortId field are always 0.", new Object[0]);
        }
    }

    @Override // cn.sharesdk.framework.Platform
    public void isClientValid(ShareSDKCallback<Boolean> shareSDKCallback) {
        try {
            cn.sharesdk.tencent.qq.utils.a a10 = cn.sharesdk.tencent.qq.utils.a.a(this);
            a10.a(this.f5420a);
            a10.a(shareSDKCallback);
        } catch (Throwable th2) {
            SSDKLog.b().a(th2);
            if (shareSDKCallback != null) {
                shareSDKCallback.onCallback(Boolean.FALSE);
            }
        }
    }

    @Override // cn.sharesdk.framework.Platform
    public void setNetworkDevinfo() {
        String networkDevinfo = getNetworkDevinfo("app_id", "AppId");
        this.f5420a = networkDevinfo;
        if (networkDevinfo == null || networkDevinfo.length() <= 0) {
            String networkDevinfo2 = getNetworkDevinfo(6, "app_id", "AppId");
            this.f5420a = networkDevinfo2;
            if (networkDevinfo2 == null || networkDevinfo2.length() <= 0) {
                return;
            }
            copyNetworkDevinfo(6, 24);
            this.f5420a = getNetworkDevinfo("app_id", "AppId");
            SSDKLog.b().a("Try to use the dev info of QZone, this will cause Id and SortId field are always 0.", new Object[0]);
        }
    }

    @Override // cn.sharesdk.framework.Platform
    public void timeline(int i10, int i11, String str) {
        PlatformActionListener platformActionListener = this.listener;
        if (platformActionListener != null) {
            platformActionListener.onCancel(this, 7);
        }
    }

    @Override // cn.sharesdk.framework.Platform
    public String uploadImageToFileServer(String str) {
        return super.uploadImageToFileServer(str);
    }

    /* JADX WARN: Removed duplicated region for block: B:132:0x00bd A[Catch: all -> 0x018b, TRY_ENTER, TryCatch #0 {all -> 0x018b, blocks: (B:102:0x0034, B:104:0x003a, B:107:0x0042, B:109:0x0048, B:111:0x004c, B:113:0x0055, B:115:0x0061, B:117:0x0065, B:119:0x0079, B:121:0x0081, B:124:0x0096, B:125:0x00a0, B:129:0x00b5, B:132:0x00bd, B:133:0x00c7, B:140:0x00ed, B:142:0x010a, B:143:0x011b, B:145:0x0145, B:146:0x0149, B:147:0x014d, B:149:0x015b, B:150:0x015e, B:134:0x00cb, B:136:0x00d1, B:137:0x00dc, B:139:0x00e2, B:126:0x00a4, B:128:0x00aa, B:151:0x0163, B:153:0x0167, B:155:0x016f, B:156:0x0178, B:157:0x017e, B:159:0x0182), top: B:170:0x0034 }] */
    /* JADX WARN: Removed duplicated region for block: B:134:0x00cb A[Catch: all -> 0x018b, TryCatch #0 {all -> 0x018b, blocks: (B:102:0x0034, B:104:0x003a, B:107:0x0042, B:109:0x0048, B:111:0x004c, B:113:0x0055, B:115:0x0061, B:117:0x0065, B:119:0x0079, B:121:0x0081, B:124:0x0096, B:125:0x00a0, B:129:0x00b5, B:132:0x00bd, B:133:0x00c7, B:140:0x00ed, B:142:0x010a, B:143:0x011b, B:145:0x0145, B:146:0x0149, B:147:0x014d, B:149:0x015b, B:150:0x015e, B:134:0x00cb, B:136:0x00d1, B:137:0x00dc, B:139:0x00e2, B:126:0x00a4, B:128:0x00aa, B:151:0x0163, B:153:0x0167, B:155:0x016f, B:156:0x0178, B:157:0x017e, B:159:0x0182), top: B:170:0x0034 }] */
    /* JADX WARN: Removed duplicated region for block: B:142:0x010a A[Catch: all -> 0x018b, TryCatch #0 {all -> 0x018b, blocks: (B:102:0x0034, B:104:0x003a, B:107:0x0042, B:109:0x0048, B:111:0x004c, B:113:0x0055, B:115:0x0061, B:117:0x0065, B:119:0x0079, B:121:0x0081, B:124:0x0096, B:125:0x00a0, B:129:0x00b5, B:132:0x00bd, B:133:0x00c7, B:140:0x00ed, B:142:0x010a, B:143:0x011b, B:145:0x0145, B:146:0x0149, B:147:0x014d, B:149:0x015b, B:150:0x015e, B:134:0x00cb, B:136:0x00d1, B:137:0x00dc, B:139:0x00e2, B:126:0x00a4, B:128:0x00aa, B:151:0x0163, B:153:0x0167, B:155:0x016f, B:156:0x0178, B:157:0x017e, B:159:0x0182), top: B:170:0x0034 }] */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0145 A[Catch: all -> 0x018b, TryCatch #0 {all -> 0x018b, blocks: (B:102:0x0034, B:104:0x003a, B:107:0x0042, B:109:0x0048, B:111:0x004c, B:113:0x0055, B:115:0x0061, B:117:0x0065, B:119:0x0079, B:121:0x0081, B:124:0x0096, B:125:0x00a0, B:129:0x00b5, B:132:0x00bd, B:133:0x00c7, B:140:0x00ed, B:142:0x010a, B:143:0x011b, B:145:0x0145, B:146:0x0149, B:147:0x014d, B:149:0x015b, B:150:0x015e, B:134:0x00cb, B:136:0x00d1, B:137:0x00dc, B:139:0x00e2, B:126:0x00a4, B:128:0x00aa, B:151:0x0163, B:153:0x0167, B:155:0x016f, B:156:0x0178, B:157:0x017e, B:159:0x0182), top: B:170:0x0034 }] */
    /* JADX WARN: Removed duplicated region for block: B:147:0x014d A[Catch: all -> 0x018b, TryCatch #0 {all -> 0x018b, blocks: (B:102:0x0034, B:104:0x003a, B:107:0x0042, B:109:0x0048, B:111:0x004c, B:113:0x0055, B:115:0x0061, B:117:0x0065, B:119:0x0079, B:121:0x0081, B:124:0x0096, B:125:0x00a0, B:129:0x00b5, B:132:0x00bd, B:133:0x00c7, B:140:0x00ed, B:142:0x010a, B:143:0x011b, B:145:0x0145, B:146:0x0149, B:147:0x014d, B:149:0x015b, B:150:0x015e, B:134:0x00cb, B:136:0x00d1, B:137:0x00dc, B:139:0x00e2, B:126:0x00a4, B:128:0x00aa, B:151:0x0163, B:153:0x0167, B:155:0x016f, B:156:0x0178, B:157:0x017e, B:159:0x0182), top: B:170:0x0034 }] */
    @Override // cn.sharesdk.framework.Platform
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void userInfor(java.lang.String r15) {
        /*
            Method dump skipped, instructions count: 419
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: cn.sharesdk.tencent.qq.QQ.userInfor(java.lang.String):void");
    }
}
