package cn.sharesdk.wechat.moments;

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
import cn.sharesdk.wechat.friends.Wechat;
import cn.sharesdk.wechat.utils.WechatClientNotExistException;
import cn.sharesdk.wechat.utils.WechatTimelineNotSupportedException;
import cn.sharesdk.wechat.utils.h;
import cn.sharesdk.wechat.utils.k;
import cn.sharesdk.wechat.utils.l;
import com.sina.weibo.sdk.auth.Oauth2AccessToken;
import java.util.HashMap;

/* loaded from: classes.dex */
public class WechatMoments extends Platform {
    public static final String NAME = "WechatMoments";

    /* renamed from: a */
    private String f5533a;

    /* renamed from: b */
    private String f5534b;

    /* renamed from: c */
    private boolean f5535c;

    private boolean c() {
        if (TextUtils.isEmpty(getDb().get(Oauth2AccessToken.KEY_REFRESH_TOKEN))) {
            return false;
        }
        h hVar = new h(this, 23);
        hVar.a(this.f5533a, this.f5534b);
        return hVar.a();
    }

    @Override // cn.sharesdk.framework.Platform
    public boolean checkAuthorize(int i10, Object obj) {
        l a10 = l.a();
        a10.c(this.f5533a);
        if (!this.isClientValid) {
            PlatformActionListener platformActionListener = this.listener;
            if (platformActionListener != null) {
                platformActionListener.onError(this, i10, new WechatClientNotExistException());
            }
            return false;
        } else if (!a10.c()) {
            PlatformActionListener platformActionListener2 = this.listener;
            if (platformActionListener2 != null) {
                platformActionListener2.onError(this, 1, new WechatTimelineNotSupportedException());
            }
            return false;
        } else if (i10 == 9 || isAuthValid() || c()) {
            return true;
        } else {
            innerAuthorize(i10, obj);
            return false;
        }
    }

    @Override // cn.sharesdk.framework.Platform
    public void doAuthorize(String[] strArr) {
        if (TextUtils.isEmpty(this.f5533a) || TextUtils.isEmpty(this.f5534b)) {
            PlatformActionListener platformActionListener = this.listener;
            if (platformActionListener != null) {
                platformActionListener.onError(this, 8, new Throwable("The params of appID or appSecret is missing !"));
                return;
            }
            return;
        }
        l a10 = l.a();
        a10.c(this.f5533a);
        if (!this.isClientValid) {
            PlatformActionListener platformActionListener2 = this.listener;
            if (platformActionListener2 != null) {
                platformActionListener2.onError(this, 1, new WechatClientNotExistException());
            }
        } else if (!a10.c()) {
            PlatformActionListener platformActionListener3 = this.listener;
            if (platformActionListener3 != null) {
                platformActionListener3.onError(this, 1, new WechatTimelineNotSupportedException());
            }
        } else {
            h hVar = new h(this, 23);
            hVar.a(this.f5533a, this.f5534b);
            k kVar = new k(this);
            kVar.a(hVar);
            kVar.a(new AuthorizeListener() { // from class: cn.sharesdk.wechat.moments.WechatMoments.1
                @Override // cn.sharesdk.framework.authorize.AuthorizeListener
                public void onCancel() {
                    if (WechatMoments.this.listener != null) {
                        WechatMoments.this.listener.onCancel(WechatMoments.this, 1);
                    }
                }

                @Override // cn.sharesdk.framework.authorize.AuthorizeListener
                public void onComplete(Bundle bundle) {
                    WechatMoments.this.afterRegister(1, null);
                }

                @Override // cn.sharesdk.framework.authorize.AuthorizeListener
                public void onError(Throwable th2) {
                    if (WechatMoments.this.listener != null) {
                        WechatMoments.this.listener.onError(WechatMoments.this, 1, th2);
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
        PlatformActionListener platformActionListener;
        SSDKLog b10 = SSDKLog.b();
        StringBuilder a10 = d.a("WechatMoments start Share with Appid:");
        a10.append(this.f5533a);
        a10.append("appSecret:");
        a10.append(this.f5534b);
        b10.a(a10.toString(), new Object[0]);
        SSDKLog b11 = SSDKLog.b();
        StringBuilder a11 = d.a("WechatMoments ShareParams:");
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
        shareParams.set(InnerShareParams.SCENCE, 1);
        l a12 = l.a();
        a12.c(this.f5533a);
        k kVar = new k(this);
        if (this.f5535c) {
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
                if (this.listener != null && a12.b()) {
                    HashMap<String, Object> hashMap = new HashMap<>();
                    hashMap.put("ShareParams", shareParams);
                    PlatformActionListener platformActionListener3 = this.listener;
                    if (platformActionListener3 != null) {
                        platformActionListener3.onComplete(this, 9, hashMap);
                        return;
                    }
                    return;
                }
                return;
            } catch (Throwable th3) {
                th = th3;
                platformActionListener = this.listener;
                if (platformActionListener == null) {
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
        return 23;
    }

    @Override // cn.sharesdk.framework.Platform
    public int getVersion() {
        return 1;
    }

    @Override // cn.sharesdk.framework.Platform
    public boolean hasShareCallback() {
        return !this.f5535c;
    }

    @Override // cn.sharesdk.framework.Platform
    public void initDevInfo(String str) {
        this.f5533a = getDevinfo("AppId");
        this.f5534b = getDevinfo("AppSecret");
        this.f5535c = "true".equals(getDevinfo("BypassApproval"));
        String str2 = this.f5533a;
        if (str2 == null || str2.length() <= 0) {
            this.f5533a = getDevinfo(Wechat.NAME, "AppId");
            this.f5535c = "true".equals(getDevinfo(Wechat.NAME, "BypassApproval"));
            String str3 = this.f5533a;
            if (str3 != null && str3.length() > 0) {
                copyDevinfo(Wechat.NAME, NAME);
                this.f5533a = getDevinfo("AppId");
                this.f5535c = "true".equals(getDevinfo("BypassApproval"));
                SSDKLog.b().a("Try to use the dev info of Wechat, this will cause Id and SortId field are always 0.", new Object[0]);
                return;
            }
            String devinfo = getDevinfo("WechatFavorite", "AppId");
            this.f5533a = devinfo;
            if (devinfo == null || devinfo.length() <= 0) {
                return;
            }
            copyDevinfo("WechatFavorite", NAME);
            this.f5533a = getDevinfo("AppId");
            SSDKLog.b().a("Try to use the dev info of WechatFavorite, this will cause Id and SortId field are always 0.", new Object[0]);
        }
    }

    @Override // cn.sharesdk.framework.Platform
    public void isClientValid(ShareSDKCallback<Boolean> shareSDKCallback) {
        try {
            l a10 = l.a();
            a10.c(this.f5533a);
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
        this.f5533a = getNetworkDevinfo("app_id", "AppId");
        this.f5534b = getNetworkDevinfo("app_secret", "AppSecret");
        String str = this.f5533a;
        if (str == null || str.length() <= 0) {
            String networkDevinfo = getNetworkDevinfo(22, "app_id", "AppId");
            this.f5533a = networkDevinfo;
            if (networkDevinfo == null || networkDevinfo.length() <= 0) {
                String networkDevinfo2 = getNetworkDevinfo(37, "app_id", "AppId");
                this.f5533a = networkDevinfo2;
                if (networkDevinfo2 != null && networkDevinfo2.length() > 0) {
                    copyNetworkDevinfo(23, 23);
                    this.f5533a = getNetworkDevinfo("app_id", "AppId");
                    SSDKLog.b().a("Try to use the dev info of WechatFavorite, this will cause Id and SortId field are always 0.", new Object[0]);
                }
            } else {
                copyNetworkDevinfo(22, 23);
                this.f5533a = getNetworkDevinfo("app_id", "AppId");
                SSDKLog.b().a("Try to use the dev info of Wechat, this will cause Id and SortId field are always 0.", new Object[0]);
            }
        }
        String str2 = this.f5534b;
        if (str2 == null || str2.length() <= 0) {
            String networkDevinfo3 = getNetworkDevinfo(22, "app_secret", "AppSecret");
            this.f5534b = networkDevinfo3;
            if (networkDevinfo3 != null && networkDevinfo3.length() > 0) {
                copyNetworkDevinfo(22, 23);
                this.f5534b = getNetworkDevinfo("app_secret", "AppSecret");
                SSDKLog.b().a("Try to use the dev info of Wechat, this will cause Id and SortId field are always 0.", new Object[0]);
                return;
            }
            String networkDevinfo4 = getNetworkDevinfo(37, "app_secret", "AppSecret");
            this.f5534b = networkDevinfo4;
            if (networkDevinfo4 == null || networkDevinfo4.length() <= 0) {
                return;
            }
            copyNetworkDevinfo(23, 23);
            this.f5534b = getNetworkDevinfo("app_secret", "AppSecret");
            SSDKLog.b().a("Try to use the dev info of WechatFavorite, this will cause Id and SortId field are always 0.", new Object[0]);
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
        if (TextUtils.isEmpty(this.f5533a) || TextUtils.isEmpty(this.f5534b)) {
            PlatformActionListener platformActionListener = this.listener;
            if (platformActionListener != null) {
                platformActionListener.onError(this, 8, new Throwable("The params of appID or appSecret is missing !"));
                return;
            }
            return;
        }
        h hVar = new h(this, 23);
        hVar.a(this.f5533a, this.f5534b);
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
