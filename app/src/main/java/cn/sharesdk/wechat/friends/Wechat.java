package cn.sharesdk.wechat.friends;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.support.v4.media.d;
import android.text.TextUtils;
import cn.sharesdk.framework.InnerShareParams;
import cn.sharesdk.framework.Platform;
import cn.sharesdk.framework.PlatformActionListener;
import cn.sharesdk.framework.ShareSDKCallback;
import cn.sharesdk.framework.a.b.f;
import cn.sharesdk.framework.authorize.AuthorizeListener;
import cn.sharesdk.framework.utils.SSDKLog;
import cn.sharesdk.wechat.moments.WechatMoments;
import cn.sharesdk.wechat.utils.WechatClientNotExistException;
import cn.sharesdk.wechat.utils.h;
import cn.sharesdk.wechat.utils.k;
import cn.sharesdk.wechat.utils.l;
import com.sina.weibo.sdk.auth.Oauth2AccessToken;
import java.util.HashMap;

/* loaded from: classes.dex */
public class Wechat extends Platform {
    public static final String NAME = "Wechat";

    /* renamed from: a */
    private String f5525a;

    /* renamed from: b */
    private String f5526b;

    /* renamed from: c */
    private boolean f5527c;

    /* renamed from: d */
    private String f5528d;

    /* renamed from: e */
    private String f5529e;

    /* renamed from: f */
    private boolean f5530f;

    /* renamed from: g */
    private int f5531g;

    private boolean c() {
        if (TextUtils.isEmpty(getDb().get(Oauth2AccessToken.KEY_REFRESH_TOKEN))) {
            return false;
        }
        h hVar = new h(this, 22);
        hVar.a(this.f5525a, this.f5526b);
        return hVar.a();
    }

    @Override // cn.sharesdk.framework.Platform
    public boolean checkAuthorize(int i10, Object obj) {
        if (i10 == 9 || isAuthValid() || c()) {
            return true;
        }
        if (!TextUtils.isEmpty(getDb().get(Oauth2AccessToken.KEY_REFRESH_TOKEN))) {
            try {
                h hVar = new h(this, 22);
                hVar.a(this.f5525a, this.f5526b);
                if (hVar.a()) {
                    return true;
                }
            } catch (Exception e10) {
                SSDKLog.b().a(e10);
            }
        }
        innerAuthorize(i10, obj);
        return false;
    }

    @Override // cn.sharesdk.framework.Platform
    public void doAuthorize(String[] strArr) {
        if (TextUtils.isEmpty(this.f5525a) || TextUtils.isEmpty(this.f5526b)) {
            PlatformActionListener platformActionListener = this.listener;
            if (platformActionListener != null) {
                platformActionListener.onError(this, 8, new Throwable("The params of appID or appSecret is missing !"));
                return;
            }
            return;
        }
        l a10 = l.a();
        a10.c(this.f5525a);
        if (!this.isClientValid) {
            PlatformActionListener platformActionListener2 = this.listener;
            if (platformActionListener2 != null) {
                platformActionListener2.onError(this, 1, new WechatClientNotExistException());
                return;
            }
            return;
        }
        h hVar = new h(this, 22);
        hVar.a(this.f5525a, this.f5526b);
        k kVar = new k(this);
        kVar.a(hVar);
        kVar.a(new AuthorizeListener() { // from class: cn.sharesdk.wechat.friends.Wechat.1
            @Override // cn.sharesdk.framework.authorize.AuthorizeListener
            public void onCancel() {
                if (Wechat.this.listener != null) {
                    Wechat.this.listener.onCancel(Wechat.this, 1);
                }
            }

            @Override // cn.sharesdk.framework.authorize.AuthorizeListener
            public void onComplete(Bundle bundle) {
                Wechat.this.afterRegister(1, null);
            }

            @Override // cn.sharesdk.framework.authorize.AuthorizeListener
            public void onError(Throwable th2) {
                if (Wechat.this.listener != null) {
                    Wechat.this.listener.onError(Wechat.this, 1, th2);
                }
            }
        });
        try {
            a10.a(kVar);
        } catch (Throwable th2) {
            if (this.listener != null) {
                this.listener.onError(this, 1, th2);
            }
        }
    }

    @Override // cn.sharesdk.framework.Platform
    public void doCustomerProtocol(String str, String str2, int i10, HashMap<String, Object> hashMap, HashMap<String, String> hashMap2) {
        PlatformActionListener platformActionListener = this.listener;
        if (platformActionListener != null) {
            platformActionListener.onCancel(this, i10);
        }
    }

    @Override // cn.sharesdk.framework.Platform
    public void doShare(Platform.ShareParams shareParams) {
        String wxPath;
        String wxUserName;
        boolean wxWithShareTicket;
        int wxMiniProgramType;
        PlatformActionListener platformActionListener;
        SSDKLog b10 = SSDKLog.b();
        StringBuilder a10 = d.a("Wechat start Share with Appid:");
        a10.append(this.f5525a);
        a10.append("appSecret:");
        a10.append(this.f5526b);
        b10.a(a10.toString(), new Object[0]);
        SSDKLog b11 = SSDKLog.b();
        StringBuilder a11 = d.a("Wechat ShareParams:");
        a11.append(shareParams.toString());
        b11.a(a11.toString(), new Object[0]);
        if (!this.isClientValid) {
            PlatformActionListener platformActionListener2 = this.listener;
            if (platformActionListener2 != null) {
                platformActionListener2.onError(this, 9, new WechatClientNotExistException());
                return;
            }
            return;
        }
        shareParams.set(InnerShareParams.SCENCE, 0);
        l a12 = l.a();
        if (TextUtils.isEmpty(shareParams.getWxPath())) {
            wxPath = this.f5529e;
        } else {
            wxPath = shareParams.getWxPath();
        }
        this.f5529e = wxPath;
        if (TextUtils.isEmpty(shareParams.getWxUserName())) {
            wxUserName = this.f5528d;
        } else {
            wxUserName = shareParams.getWxUserName();
        }
        this.f5528d = wxUserName;
        if (!shareParams.toMap().containsKey(InnerShareParams.WX_MINIPROGRAM_WITH_SHARETICKET)) {
            wxWithShareTicket = this.f5530f;
        } else {
            wxWithShareTicket = shareParams.getWxWithShareTicket();
        }
        this.f5530f = wxWithShareTicket;
        if (!shareParams.toMap().containsKey(InnerShareParams.WX_MINIPROGRAM_MINIPROGRAM_TYPE)) {
            wxMiniProgramType = this.f5531g;
        } else {
            wxMiniProgramType = shareParams.getWxMiniProgramType();
        }
        this.f5531g = wxMiniProgramType;
        a12.a(this.f5529e);
        a12.b(this.f5528d);
        a12.a(this.f5530f);
        a12.a(this.f5531g);
        a12.c(this.f5525a);
        k kVar = new k(this);
        if (this.f5527c) {
            try {
                a12.a(kVar, shareParams, this.listener);
                return;
            } catch (Throwable th2) {
                th = th2;
                platformActionListener = this.listener;
                if (platformActionListener == null) {
                    return;
                }
            }
        } else {
            kVar.a(shareParams, this.listener);
            try {
                a12.c(kVar);
                return;
            } catch (Throwable th3) {
                th = th3;
                if (this.listener != null) {
                    platformActionListener = this.listener;
                } else {
                    return;
                }
            }
        }
        platformActionListener.onError(this, 9, th);
    }

    @Override // cn.sharesdk.framework.Platform
    public HashMap<String, Object> filterFriendshipInfo(int i10, HashMap<String, Object> hashMap) {
        return null;
    }

    @Override // cn.sharesdk.framework.Platform
    public f.a filterShareContent(Platform.ShareParams shareParams, HashMap<String, Object> hashMap) {
        f.a aVar = new f.a();
        String text = shareParams.getText();
        aVar.f5150b = text;
        String imageUrl = shareParams.getImageUrl();
        String imagePath = shareParams.getImagePath();
        Bitmap imageData = shareParams.getImageData();
        if (!TextUtils.isEmpty(imageUrl)) {
            aVar.f5152d.add(imageUrl);
        } else if (imagePath != null) {
            aVar.f5153e.add(imagePath);
        } else if (imageData != null) {
            aVar.f5154f.add(imageData);
        }
        String url = shareParams.getUrl();
        if (url != null) {
            aVar.f5151c.add(url);
        }
        HashMap<String, Object> hashMap2 = new HashMap<>();
        hashMap2.put(InnerShareParams.TITLE, shareParams.getTitle());
        hashMap2.put(InnerShareParams.URL, url);
        hashMap2.put(InnerShareParams.EXT_INFO, null);
        hashMap2.put("content", text);
        hashMap2.put("image", aVar.f5152d);
        hashMap2.put("musicFileUrl", url);
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
        return 22;
    }

    @Override // cn.sharesdk.framework.Platform
    public int getVersion() {
        return 1;
    }

    @Override // cn.sharesdk.framework.Platform
    public boolean hasShareCallback() {
        return !this.f5527c;
    }

    @Override // cn.sharesdk.framework.Platform
    public void initDevInfo(String str) {
        this.f5525a = getDevinfo("AppId");
        this.f5526b = getDevinfo("AppSecret");
        this.f5527c = "true".equals(getDevinfo("BypassApproval"));
        this.f5528d = getDevinfo(TextUtils.isEmpty(getDevinfo("UserName")) ? Oauth2AccessToken.KEY_SCREEN_NAME : "UserName");
        this.f5529e = getDevinfo(TextUtils.isEmpty(getDevinfo("Path")) ? "path" : "Path");
        this.f5530f = "true".equals(getDevinfo("WithShareTicket"));
        try {
            this.f5531g = Integer.valueOf(getDevinfo("MiniprogramType")).intValue();
        } catch (Throwable unused) {
            this.f5531g = 0;
        }
        String str2 = this.f5525a;
        if (str2 == null || str2.length() <= 0) {
            this.f5525a = getDevinfo(WechatMoments.NAME, "AppId");
            this.f5527c = "true".equals(getDevinfo(WechatMoments.NAME, "BypassApproval"));
            String str3 = this.f5525a;
            if (str3 != null && str3.length() > 0) {
                copyDevinfo(WechatMoments.NAME, NAME);
                this.f5525a = getDevinfo("AppId");
                this.f5527c = "true".equals(getDevinfo("BypassApproval"));
                SSDKLog.b().a("Try to use the dev info of WechatMoments, this will cause Id and SortId field are always 0.", new Object[0]);
                return;
            }
            String devinfo = getDevinfo("WechatFavorite", "AppId");
            this.f5525a = devinfo;
            if (devinfo == null || devinfo.length() <= 0) {
                return;
            }
            copyDevinfo("WechatFavorite", NAME);
            this.f5525a = getDevinfo("AppId");
            SSDKLog.b().a("Try to use the dev info of WechatFavorite, this will cause Id and SortId field are always 0.", new Object[0]);
        }
    }

    @Override // cn.sharesdk.framework.Platform
    public void isClientValid(ShareSDKCallback<Boolean> shareSDKCallback) {
        try {
            l a10 = l.a();
            a10.c(this.f5525a);
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
        this.f5525a = getNetworkDevinfo("app_id", "AppId");
        this.f5526b = getNetworkDevinfo("app_secret", "AppSecret");
        String str = this.f5525a;
        if (str == null || str.length() <= 0) {
            String networkDevinfo = getNetworkDevinfo(23, "app_id", "AppId");
            this.f5525a = networkDevinfo;
            if (networkDevinfo == null || networkDevinfo.length() <= 0) {
                String networkDevinfo2 = getNetworkDevinfo(37, "app_id", "AppId");
                this.f5525a = networkDevinfo2;
                if (networkDevinfo2 != null && networkDevinfo2.length() > 0) {
                    copyNetworkDevinfo(37, 22);
                    this.f5525a = getNetworkDevinfo("app_id", "AppId");
                    SSDKLog.b().a("Try to use the dev info of WechatFavorite, this will cause Id and SortId field are always 0.", new Object[0]);
                }
            } else {
                copyNetworkDevinfo(23, 22);
                this.f5525a = getNetworkDevinfo("app_id", "AppId");
                SSDKLog.b().a("Try to use the dev info of WechatMoments, this will cause Id and SortId field are always 0.", new Object[0]);
            }
        }
        String str2 = this.f5526b;
        if (str2 == null || str2.length() <= 0) {
            String networkDevinfo3 = getNetworkDevinfo(23, "app_secret", "AppSecret");
            this.f5526b = networkDevinfo3;
            if (networkDevinfo3 != null && networkDevinfo3.length() > 0) {
                copyNetworkDevinfo(23, 22);
                this.f5526b = getNetworkDevinfo("app_secret", "AppSecret");
                SSDKLog.b().a("Try to use the dev info of WechatMoments, this will cause Id and SortId field are always 0.", new Object[0]);
                return;
            }
            String networkDevinfo4 = getNetworkDevinfo(37, "app_secret", "AppSecret");
            this.f5526b = networkDevinfo4;
            if (networkDevinfo4 == null || networkDevinfo4.length() <= 0) {
                return;
            }
            copyNetworkDevinfo(37, 22);
            this.f5526b = getNetworkDevinfo("app_secret", "AppSecret");
            SSDKLog.b().a("Try to use the dev info of WechatFavorite, this will cause Id and SortId field are always 0.", new Object[0]);
        }
    }

    @Override // cn.sharesdk.framework.Platform
    public void subscribeAuth(Platform.ShareParams shareParams) {
        if (TextUtils.isEmpty(this.f5525a) || TextUtils.isEmpty(this.f5526b)) {
            PlatformActionListener platformActionListener = this.listener;
            if (platformActionListener != null) {
                platformActionListener.onError(this, 8, new Throwable("The params of appID or appSecret is missing !"));
                return;
            }
            return;
        }
        l a10 = l.a();
        a10.c(this.f5525a);
        if (!this.isClientValid) {
            PlatformActionListener platformActionListener2 = this.listener;
            if (platformActionListener2 != null) {
                platformActionListener2.onError(this, 1, new WechatClientNotExistException());
                return;
            }
            return;
        }
        k kVar = new k(this);
        kVar.a(shareParams, this.listener);
        try {
            a10.b(kVar);
            PlatformActionListener platformActionListener3 = this.listener;
            if (platformActionListener3 != null) {
                platformActionListener3.onComplete(this, 9, null);
            }
            SSDKLog.b().a("ShareSDK", "subscribeAuth start on Wechat");
        } catch (Throwable th2) {
            PlatformActionListener platformActionListener4 = this.listener;
            if (platformActionListener4 != null) {
                platformActionListener4.onError(this, 1, th2);
            }
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
    public void userInfor(String str) {
        if (TextUtils.isEmpty(this.f5525a) || TextUtils.isEmpty(this.f5526b)) {
            PlatformActionListener platformActionListener = this.listener;
            if (platformActionListener != null) {
                platformActionListener.onError(this, 8, new Throwable("The params of appID or appSecret is missing !"));
                return;
            }
            return;
        }
        h hVar = new h(this, 22);
        hVar.a(this.f5525a, this.f5526b);
        try {
            hVar.a(this.listener);
        } catch (Throwable th2) {
            SSDKLog.b().a(th2);
            PlatformActionListener platformActionListener2 = this.listener;
            if (platformActionListener2 != null) {
                platformActionListener2.onError(this, 8, th2);
            }
        }
    }
}
