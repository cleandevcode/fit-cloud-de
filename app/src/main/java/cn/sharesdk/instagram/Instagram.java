package cn.sharesdk.instagram;

import android.os.Bundle;
import android.text.TextUtils;
import cn.sharesdk.framework.Platform;
import cn.sharesdk.framework.PlatformActionListener;
import cn.sharesdk.framework.PlatformDb;
import cn.sharesdk.framework.ShareSDK;
import cn.sharesdk.framework.ShareSDKCallback;
import cn.sharesdk.framework.a.b.f;
import cn.sharesdk.framework.authorize.AuthorizeListener;
import cn.sharesdk.framework.utils.SSDKLog;
import com.sina.weibo.sdk.auth.Oauth2AccessToken;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* loaded from: classes.dex */
public class Instagram extends Platform {
    public static final String NAME = "Instagram";

    /* renamed from: a */
    private String f5325a;

    /* renamed from: b */
    private String f5326b;

    /* renamed from: c */
    private String f5327c;

    @Override // cn.sharesdk.framework.Platform
    public boolean checkAuthorize(int i10, Object obj) {
        b a10 = b.a(this);
        if (i10 == 9) {
            if (this.isClientValid) {
                return true;
            }
            PlatformActionListener platformActionListener = this.listener;
            if (platformActionListener != null) {
                platformActionListener.onError(this, 9, new InstagramClientNotExistException());
            }
            return false;
        } else if (!isAuthValid()) {
            innerAuthorize(i10, obj);
            return false;
        } else {
            a10.a(this.f5325a, this.f5326b, this.f5327c);
            a10.b(this.f5036db.getToken());
            return true;
        }
    }

    @Override // cn.sharesdk.framework.Platform
    public void doAuthorize(String[] strArr) {
        final b a10 = b.a(this);
        a10.a(this.f5325a, this.f5326b, this.f5327c);
        a10.a(strArr);
        a10.a(new AuthorizeListener() { // from class: cn.sharesdk.instagram.Instagram.1
            @Override // cn.sharesdk.framework.authorize.AuthorizeListener
            public void onCancel() {
                if (Instagram.this.listener != null) {
                    Instagram.this.listener.onCancel(Instagram.this, 1);
                }
            }

            @Override // cn.sharesdk.framework.authorize.AuthorizeListener
            public void onComplete(Bundle bundle) {
                String string = bundle.getString(Oauth2AccessToken.KEY_ACCESS_TOKEN);
                String string2 = bundle.getString("username");
                String string3 = bundle.getString("bio");
                String string4 = bundle.getString("website");
                String string5 = bundle.getString("profile_picture");
                String string6 = bundle.getString("full_name");
                String string7 = bundle.getString("id");
                Instagram.this.f5036db.putToken(string);
                Instagram.this.f5036db.putUserId(string7);
                Instagram.this.f5036db.put("nickname", string2);
                Instagram.this.f5036db.put("resume", string3);
                Instagram.this.f5036db.put("website", string4);
                Instagram.this.f5036db.put("icon", string5);
                Instagram.this.f5036db.put("full_name", string6);
                a10.b(string);
                Instagram.this.afterRegister(1, null);
            }

            @Override // cn.sharesdk.framework.authorize.AuthorizeListener
            public void onError(Throwable th2) {
                if (Instagram.this.listener != null) {
                    Instagram.this.listener.onError(Instagram.this, 1, th2);
                }
            }
        });
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
        PlatformActionListener platformActionListener = new PlatformActionListener() { // from class: cn.sharesdk.instagram.Instagram.2
            @Override // cn.sharesdk.framework.PlatformActionListener
            public void onCancel(Platform platform, int i10) {
                if (Instagram.this.listener != null) {
                    Instagram.this.listener.onCancel(platform, i10);
                }
            }

            @Override // cn.sharesdk.framework.PlatformActionListener
            public void onComplete(Platform platform, int i10, HashMap<String, Object> hashMap) {
                HashMap<String, Object> hashMap2 = new HashMap<>();
                if (hashMap != null) {
                    hashMap2.putAll(hashMap);
                }
                hashMap2.put("ShareParams", shareParams);
                if (Instagram.this.listener != null) {
                    Instagram.this.listener.onComplete(platform, i10, hashMap2);
                }
            }

            @Override // cn.sharesdk.framework.PlatformActionListener
            public void onError(Platform platform, int i10, Throwable th2) {
                if (Instagram.this.listener != null) {
                    Instagram.this.listener.onError(platform, i10, th2);
                }
            }
        };
        b a10 = b.a(this);
        String imagePath = shareParams.getImagePath();
        String imageUrl = shareParams.getImageUrl();
        String filePath = shareParams.getFilePath();
        String text = shareParams.getText();
        int shareType = shareParams.getShareType();
        if (shareType == 13) {
            try {
                a10.a(this, shareParams, platformActionListener);
            } catch (Throwable th2) {
                th2.printStackTrace();
            }
        } else if (shareType == 6 && !TextUtils.isEmpty(filePath)) {
            a10.a(filePath, null, text, platformActionListener);
        } else {
            if ((TextUtils.isEmpty(imagePath) || !new File(imagePath).exists()) && !TextUtils.isEmpty(filePath) && new File(filePath).exists()) {
                imagePath = filePath;
            }
            a10.a(imagePath, imageUrl, text, platformActionListener);
        }
    }

    @Override // cn.sharesdk.framework.Platform
    public HashMap<String, Object> filterFriendshipInfo(int i10, HashMap<String, Object> hashMap) {
        HashMap<String, Object> hashMap2 = new HashMap<>();
        hashMap2.put("type", 2 == i10 ? "FOLLOWING" : "FOLLOWERS");
        hashMap2.put("snsplat", Integer.valueOf(getPlatformId()));
        hashMap2.put("snsuid", this.f5036db.getUserId());
        Object obj = hashMap.get("data");
        if (obj == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = (ArrayList) obj;
        if (arrayList2.size() <= 0) {
            return null;
        }
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            HashMap hashMap3 = (HashMap) it.next();
            if (hashMap3 != null) {
                HashMap hashMap4 = new HashMap();
                String valueOf = String.valueOf(hashMap3.get("username"));
                hashMap4.put("snsuid", String.valueOf(hashMap3.get("id")));
                hashMap4.put("nickname", valueOf);
                hashMap4.put("snsUserUrl", "http://instagram.com/" + valueOf + "/#");
                hashMap4.put("icon", String.valueOf(hashMap3.get("profile_picture")));
                hashMap4.put("gender", "2");
                arrayList.add(hashMap4);
            }
        }
        if (arrayList.size() <= 0) {
            return null;
        }
        hashMap2.put("nextCursor", "0_true");
        hashMap2.put("list", arrayList);
        return hashMap2;
    }

    @Override // cn.sharesdk.framework.Platform
    public f.a filterShareContent(Platform.ShareParams shareParams, HashMap<String, Object> hashMap) {
        f.a aVar = new f.a();
        String imagePath = shareParams.getImagePath();
        String imageUrl = shareParams.getImageUrl();
        if (!TextUtils.isEmpty(imagePath)) {
            aVar.f5153e.add(imagePath);
        } else if (!TextUtils.isEmpty(imageUrl)) {
            aVar.f5152d.add(imageUrl);
        }
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
        HashMap<String, Object> e10;
        try {
            if (TextUtils.isEmpty(str)) {
                str = this.f5036db.getUserId();
            }
            if (TextUtils.isEmpty(str)) {
                str = this.f5036db.get("nickname");
            }
            if (!TextUtils.isEmpty(str) && (e10 = b.a(this).e(str)) != null && e10.size() > 0) {
                return filterFriendshipInfo(11, e10);
            }
            return null;
        } catch (Throwable th2) {
            SSDKLog.b().a(th2);
            return null;
        }
    }

    @Override // cn.sharesdk.framework.Platform
    public HashMap<String, Object> getFollowings(int i10, int i11, String str) {
        HashMap<String, Object> d10;
        try {
            if (TextUtils.isEmpty(str)) {
                str = this.f5036db.getUserId();
            }
            if (TextUtils.isEmpty(str)) {
                str = this.f5036db.get("nickname");
            }
            if (!TextUtils.isEmpty(str) && (d10 = b.a(this).d(str)) != null && d10.size() > 0) {
                return filterFriendshipInfo(2, d10);
            }
            return null;
        } catch (Throwable th2) {
            SSDKLog.b().a(th2);
            return null;
        }
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
        return 15;
    }

    @Override // cn.sharesdk.framework.Platform
    public int getVersion() {
        return 1;
    }

    @Override // cn.sharesdk.framework.Platform
    public boolean hasShareCallback() {
        return false;
    }

    @Override // cn.sharesdk.framework.Platform
    public void initDevInfo(String str) {
        this.f5325a = getDevinfo("ClientId");
        this.f5326b = getDevinfo("ClientSecret");
        this.f5327c = getDevinfo("RedirectUri");
    }

    @Override // cn.sharesdk.framework.Platform
    public void isClientValid(ShareSDKCallback<Boolean> shareSDKCallback) {
        try {
            b.a(this).a(shareSDKCallback);
        } catch (Throwable th2) {
            SSDKLog.b().a(th2);
            if (shareSDKCallback != null) {
                shareSDKCallback.onCallback(Boolean.FALSE);
            }
        }
    }

    @Override // cn.sharesdk.framework.Platform
    public void setNetworkDevinfo() {
        this.f5325a = getNetworkDevinfo("client_id", "ClientId");
        this.f5326b = getNetworkDevinfo("client_secret", "ClientSecret");
        this.f5327c = getNetworkDevinfo("redirect_uri", "RedirectUri");
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
        PlatformActionListener platformActionListener;
        HashMap hashMap;
        if (ShareSDK.isFBInstagram()) {
            boolean z10 = false;
            if (str == null || str.length() < 0) {
                str = this.f5036db.getUserId();
                z10 = true;
            }
            if (str == null || str.length() < 0) {
                PlatformActionListener platformActionListener2 = this.listener;
                if (platformActionListener2 != null) {
                    platformActionListener2.onError(this, 8, new RuntimeException("Instagram account is null"));
                    return;
                }
                return;
            }
            try {
                HashMap<String, Object> c10 = b.a(this).c(str);
                if (c10 != null && c10.size() > 0) {
                    if (z10 && (hashMap = (HashMap) c10.get("data")) != null && hashMap.size() > 0) {
                        this.f5036db.put("resume", String.valueOf(hashMap.get("bio")));
                        this.f5036db.put("icon", String.valueOf(hashMap.get("profile_picture")));
                        String valueOf = String.valueOf(hashMap.get("username"));
                        this.f5036db.put("nickname", valueOf);
                        PlatformDb platformDb = this.f5036db;
                        platformDb.put("snsUserUrl", "http://instagram.com/" + valueOf + "/#");
                        HashMap hashMap2 = (HashMap) hashMap.get("counts");
                        if (hashMap2 != null && hashMap2.size() > 0) {
                            this.f5036db.put("followerCount", String.valueOf(hashMap2.get("followed_by")));
                            this.f5036db.put("favouriteCount", String.valueOf(hashMap2.get("follows")));
                            this.f5036db.put("shareCount", String.valueOf(hashMap2.get("media")));
                        }
                    }
                    PlatformActionListener platformActionListener3 = this.listener;
                    if (platformActionListener3 != null) {
                        platformActionListener3.onComplete(this, 8, c10);
                        return;
                    }
                    return;
                }
                PlatformActionListener platformActionListener4 = this.listener;
                if (platformActionListener4 != null) {
                    platformActionListener4.onError(this, 8, new Throwable());
                    return;
                }
                return;
            } catch (Throwable th2) {
                th = th2;
                platformActionListener = this.listener;
                if (platformActionListener == null) {
                    return;
                }
            }
        } else {
            try {
                HashMap<String, Object> c11 = b.a(this).c(str);
                if (c11 != null && c11.size() > 0) {
                    String valueOf2 = String.valueOf(c11.get("id"));
                    if (!TextUtils.isEmpty(valueOf2)) {
                        this.f5036db.putUserId(valueOf2);
                    }
                    String valueOf3 = String.valueOf(c11.get("username"));
                    if (!TextUtils.isEmpty(valueOf3)) {
                        this.f5036db.put("username", valueOf3);
                    }
                    PlatformActionListener platformActionListener5 = this.listener;
                    if (platformActionListener5 != null) {
                        platformActionListener5.onComplete(this, 8, c11);
                        return;
                    }
                    return;
                }
                PlatformActionListener platformActionListener6 = this.listener;
                if (platformActionListener6 != null) {
                    platformActionListener6.onError(this, 8, new Throwable("Instagram userInfor resultInfo is empty"));
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
        platformActionListener.onError(this, 8, th);
    }
}
