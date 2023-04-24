package cn.sharesdk.twitter;

import android.os.Bundle;
import android.text.TextUtils;
import cn.sharesdk.framework.Platform;
import cn.sharesdk.framework.PlatformActionListener;
import cn.sharesdk.framework.ShareSDKCallback;
import cn.sharesdk.framework.a.b.f;
import cn.sharesdk.framework.authorize.AuthorizeListener;
import cn.sharesdk.framework.utils.SSDKLog;
import com.mob.MobSDK;
import com.mob.tools.utils.BitmapHelper;
import com.mob.tools.utils.Hashon;
import com.mob.tools.utils.ResHelper;
import com.sina.weibo.sdk.auth.Oauth2AccessToken;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* loaded from: classes.dex */
public class Twitter extends Platform {
    public static final String NAME = "Twitter";

    /* renamed from: a */
    private String f5484a;

    /* renamed from: b */
    private String f5485b;

    /* renamed from: c */
    private String f5486c;

    /* renamed from: d */
    private boolean f5487d;

    /* renamed from: e */
    private boolean f5488e;

    /* loaded from: classes.dex */
    public static class ShareParams extends Platform.ShareParams {
    }

    public Twitter() {
        this.pkgName = "com.twitter.android";
    }

    @Override // cn.sharesdk.framework.Platform
    public boolean checkAuthorize(int i10, Object obj) {
        if (isAuthValid()) {
            c a10 = c.a(this);
            a10.a(this.f5484a, this.f5485b, this.f5486c, this.f5488e);
            String token = this.f5036db.getToken();
            String tokenSecret = this.f5036db.getTokenSecret();
            if (token != null && tokenSecret != null) {
                a10.a(token, tokenSecret);
                return true;
            }
        }
        if ((i10 == 9 && this.f5487d) || (i10 == 9 && this.isClientValid && this.f5487d)) {
            SSDKLog.b().a("twitter checkAuthorize ACTION_SHARE return true");
            return true;
        }
        innerAuthorize(i10, obj);
        return false;
    }

    @Override // cn.sharesdk.framework.Platform
    public void doAuthorize(String[] strArr) {
        final c a10 = c.a(this);
        a10.a(this.f5484a, this.f5485b, this.f5486c, this.f5488e);
        a10.a(new AuthorizeListener() { // from class: cn.sharesdk.twitter.Twitter.2
            @Override // cn.sharesdk.framework.authorize.AuthorizeListener
            public void onCancel() {
                if (Twitter.this.listener != null) {
                    Twitter.this.listener.onCancel(Twitter.this, 1);
                }
            }

            @Override // cn.sharesdk.framework.authorize.AuthorizeListener
            public void onComplete(Bundle bundle) {
                try {
                    String string = bundle.getString("oauth_token");
                    String string2 = bundle.getString("screen_name");
                    String string3 = bundle.getString(Oauth2AccessToken.KEY_ACCESS_TOKEN);
                    if (string != null && !string.equals("")) {
                        String string4 = bundle.getString("oauth_token_secret");
                        String string5 = bundle.getString("user_id");
                        if (Twitter.this.f5488e && !TextUtils.isEmpty(string3)) {
                            Twitter.this.f5036db.putToken(string3);
                        } else if (!TextUtils.isEmpty(string)) {
                            Twitter.this.f5036db.putToken(string);
                            SSDKLog.b().a("IS USEv1 OR accessToken empty");
                        }
                        Twitter.this.f5036db.putTokenSecret(string4);
                        Twitter.this.f5036db.putUserId(string5);
                        Twitter.this.f5036db.put("nickname", string2);
                        a10.a(string, string4);
                        Twitter.this.afterRegister(1, null);
                    }
                    String string6 = bundle.getString("tk");
                    String string7 = bundle.getString("ts");
                    String valueOf = String.valueOf(bundle.getLong("user_id", 0L));
                    if (Twitter.this.f5488e && !TextUtils.isEmpty(string3)) {
                        Twitter.this.f5036db.putToken(string3);
                    } else if (!TextUtils.isEmpty(string6)) {
                        Twitter.this.f5036db.putToken(string6);
                        SSDKLog.b().a("IS USEv1 OR accessToken empty");
                    }
                    Twitter.this.f5036db.putTokenSecret(string7);
                    Twitter.this.f5036db.putUserId(valueOf);
                    Twitter.this.f5036db.put("nickname", string2);
                    Twitter.this.afterRegister(1, null);
                } catch (Exception e10) {
                    SSDKLog.b().a(e10);
                }
            }

            @Override // cn.sharesdk.framework.authorize.AuthorizeListener
            public void onError(Throwable th2) {
                if (Twitter.this.listener != null) {
                    Twitter.this.listener.onError(Twitter.this, 1, th2);
                }
            }
        }, isSSODisable());
    }

    @Override // cn.sharesdk.framework.Platform
    public void doCustomerProtocol(String str, String str2, int i10, HashMap<String, Object> hashMap, HashMap<String, String> hashMap2) {
        try {
            HashMap<String, Object> a10 = c.a(this).a(str, str2, hashMap, hashMap2);
            if (a10 != null && a10.size() > 0) {
                if (!a10.containsKey("error_code") && !a10.containsKey("error")) {
                    PlatformActionListener platformActionListener = this.listener;
                    if (platformActionListener != null) {
                        platformActionListener.onComplete(this, i10, a10);
                        return;
                    }
                    return;
                }
                if (this.listener != null) {
                    this.listener.onError(this, i10, new Throwable(new Hashon().fromHashMap(a10)));
                    return;
                }
                return;
            }
            PlatformActionListener platformActionListener2 = this.listener;
            if (platformActionListener2 != null) {
                platformActionListener2.onError(this, i10, new Throwable("response is null"));
            }
        } catch (Throwable th2) {
            PlatformActionListener platformActionListener3 = this.listener;
            if (platformActionListener3 != null) {
                platformActionListener3.onError(this, i10, th2);
            }
        }
    }

    @Override // cn.sharesdk.framework.Platform
    public void doShare(final Platform.ShareParams shareParams) {
        final c a10 = c.a(this);
        try {
            final String[] imageArray = shareParams.getImageArray();
            final String imagePath = shareParams.getImagePath();
            final String imageUrl = shareParams.getImageUrl();
            final String text = shareParams.getText();
            final String filePath = shareParams.getFilePath();
            final int shareType = shareParams.getShareType();
            if (!this.f5487d) {
                final String url = shareParams.getUrl();
                getShortLintk(url, false, new ShareSDKCallback<String>() { // from class: cn.sharesdk.twitter.Twitter.1
                    @Override // cn.sharesdk.framework.ShareSDKCallback
                    /* renamed from: a */
                    public void onCallback(String str) {
                        HashMap<String, Object> d10;
                        try {
                            if (TextUtils.isEmpty(str)) {
                                str = url;
                            }
                            if (shareType != 6 || TextUtils.isEmpty(filePath)) {
                                String[] strArr = imageArray;
                                if (strArr != null && strArr.length > 0) {
                                    d10 = a10.a(text, strArr);
                                } else if (!TextUtils.isEmpty(imagePath) && new File(imagePath).exists()) {
                                    d10 = a10.e(text, imagePath);
                                } else if (TextUtils.isEmpty(imageUrl)) {
                                    d10 = !TextUtils.isEmpty(str) ? a10.d(str) : a10.d(text);
                                } else {
                                    String downloadBitmap = BitmapHelper.downloadBitmap(MobSDK.getContext(), imageUrl);
                                    d10 = new File(downloadBitmap).exists() ? a10.e(text, downloadBitmap) : null;
                                }
                            } else {
                                d10 = a10.f(text, filePath);
                            }
                            if (d10 == null) {
                                if (Twitter.this.listener != null) {
                                    Twitter.this.listener.onError(Twitter.this, 8, new Throwable("response is null"));
                                }
                            } else if (d10.containsKey("error_code") || d10.containsKey("error")) {
                                if (Twitter.this.listener != null) {
                                    Twitter.this.listener.onError(Twitter.this, 8, new Throwable(new Hashon().fromHashMap(d10)));
                                }
                            } else {
                                d10.put("ShareParams", shareParams);
                                if (Twitter.this.listener != null) {
                                    Twitter.this.listener.onComplete(Twitter.this, 9, d10);
                                }
                            }
                        } catch (Throwable th2) {
                            if (Twitter.this.listener != null) {
                                Twitter.this.listener.onError(Twitter.this, 9, th2);
                            }
                        }
                    }
                });
                return;
            }
            SSDKLog.b().a("Twitter bypassApproval ", new Object[0]);
            if (imageArray != null && imageArray.length > 0) {
                a10.a(text, imageArray, this.listener, shareParams);
                return;
            }
            if (TextUtils.isEmpty(imagePath) && TextUtils.isEmpty(imageUrl)) {
                if (!TextUtils.isEmpty(text)) {
                    a10.a(text, this.listener, shareParams);
                    return;
                }
                PlatformActionListener platformActionListener = this.listener;
                if (platformActionListener != null) {
                    platformActionListener.onError(this, 9, new Throwable("Please set params"));
                    return;
                }
                return;
            }
            a10.a(text, imagePath, imageUrl, this.listener, shareParams);
        } catch (Throwable th2) {
            PlatformActionListener platformActionListener2 = this.listener;
            if (platformActionListener2 != null) {
                platformActionListener2.onError(this, 9, th2);
            }
        }
    }

    @Override // cn.sharesdk.framework.Platform
    public HashMap<String, Object> filterFriendshipInfo(int i10, HashMap<String, Object> hashMap) {
        String str;
        String str2;
        HashMap<String, Object> hashMap2 = new HashMap<>();
        if (i10 != 2) {
            if (i10 != 10) {
                if (i10 != 11) {
                    return null;
                }
                str = "FOLLOWERS";
            } else {
                str = "FRIENDS";
            }
        } else {
            str = "FOLLOWING";
        }
        hashMap2.put("type", str);
        hashMap2.put("snsplat", Integer.valueOf(getPlatformId()));
        hashMap2.put("snsuid", this.f5036db.getUserId());
        if (hashMap.containsKey("next_cursor")) {
            str2 = String.valueOf(hashMap.get("next_cursor"));
        } else {
            str2 = null;
        }
        Object obj = hashMap.get("users");
        if (obj == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = (ArrayList) obj;
        if (arrayList2.size() <= 0) {
            return null;
        }
        Iterator it = arrayList2.iterator();
        while (true) {
            String str3 = "0";
            if (!it.hasNext()) {
                break;
            }
            HashMap hashMap3 = (HashMap) it.next();
            if (hashMap3 != null) {
                HashMap hashMap4 = new HashMap();
                hashMap4.put("snsuid", String.valueOf(hashMap3.get("id")));
                hashMap4.put("nickname", String.valueOf(hashMap3.get("screen_name")));
                hashMap4.put("icon", String.valueOf(hashMap3.get("profile_image_url")));
                hashMap4.put("gender", "2");
                hashMap4.put("resume", String.valueOf(hashMap3.get("description")));
                if ("true".equals(String.valueOf(hashMap3.get("verified")))) {
                    str3 = "1";
                }
                hashMap4.put("secretType", str3);
                hashMap4.put("followerCount", String.valueOf(hashMap3.get("followers_count")));
                hashMap4.put("favouriteCount", String.valueOf(hashMap3.get("friends_count")));
                hashMap4.put("shareCount", String.valueOf(hashMap3.get("statuses_count")));
                hashMap4.put("snsregat", String.valueOf(ResHelper.dateToLong(String.valueOf(hashMap3.get("created_at")))));
                hashMap4.put("snsUserUrl", "https://twitter.com/" + hashMap3.get("screen_name"));
                arrayList.add(hashMap4);
            }
        }
        if (arrayList.size() <= 0) {
            return null;
        }
        a.b.b(str2, "_false");
        hashMap2.put("nextCursor", (TextUtils.isEmpty(str2) || "0".equals(str2)) ? "0_true" : "0_true");
        hashMap2.put("list", arrayList);
        return hashMap2;
    }

    @Override // cn.sharesdk.framework.Platform
    public f.a filterShareContent(Platform.ShareParams shareParams, HashMap<String, Object> hashMap) {
        ArrayList arrayList;
        f.a aVar = new f.a();
        aVar.f5150b = shareParams.getText();
        if (hashMap != null) {
            HashMap hashMap2 = (HashMap) hashMap.get("entities");
            if (hashMap2 != null && (arrayList = (ArrayList) hashMap2.get("media")) != null && arrayList.size() > 0 && ((HashMap) arrayList.get(0)) != null) {
                aVar.f5152d.add(String.valueOf(hashMap.get("media_url")));
            }
            aVar.f5149a = String.valueOf(hashMap.get("id"));
            aVar.f5155g = hashMap;
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
        String userId = TextUtils.isEmpty(null) ? this.f5036db.getUserId() : null;
        if (TextUtils.isEmpty(userId)) {
            userId = this.f5036db.getUserName();
        }
        if (TextUtils.isEmpty(userId)) {
            return null;
        }
        c a10 = c.a(this);
        try {
            if (TextUtils.isEmpty(str)) {
                str = "0";
            }
            HashMap<String, Object> c10 = a10.c(userId, str);
            if (c10 != null && c10.size() > 0 && !c10.containsKey("error_code") && !c10.containsKey("error")) {
                return filterFriendshipInfo(11, c10);
            }
            return null;
        } catch (Throwable th2) {
            SSDKLog.b().a(th2);
            return null;
        }
    }

    @Override // cn.sharesdk.framework.Platform
    public HashMap<String, Object> getFollowings(int i10, int i11, String str) {
        String userId = TextUtils.isEmpty(null) ? this.f5036db.getUserId() : null;
        if (TextUtils.isEmpty(userId)) {
            userId = this.f5036db.getUserName();
        }
        if (TextUtils.isEmpty(userId)) {
            return null;
        }
        c a10 = c.a(this);
        try {
            if (TextUtils.isEmpty(str)) {
                str = "0";
            }
            HashMap<String, Object> b10 = a10.b(userId, str);
            if (b10 != null && b10.size() > 0 && !b10.containsKey("error_code") && !b10.containsKey("error")) {
                return filterFriendshipInfo(2, b10);
            }
            return null;
        } catch (Throwable th2) {
            SSDKLog.b().a(th2);
            return null;
        }
    }

    @Override // cn.sharesdk.framework.Platform
    public void getFriendList(int i10, int i11, String str) {
        PlatformActionListener platformActionListener;
        String userId = TextUtils.isEmpty(null) ? this.f5036db.getUserId() : null;
        if (TextUtils.isEmpty(userId)) {
            userId = this.f5036db.getUserName();
        }
        if (TextUtils.isEmpty(userId) && (platformActionListener = this.listener) != null) {
            platformActionListener.onError(this, 2, new Throwable("The account do not authorize!"));
        }
        c a10 = c.a(this);
        try {
            if (TextUtils.isEmpty(str)) {
                str = "0";
            }
            HashMap<String, Object> b10 = a10.b(userId, str);
            if (b10 != null && b10.size() > 0) {
                if (!b10.containsKey("error_code") && !b10.containsKey("error")) {
                    PlatformActionListener platformActionListener2 = this.listener;
                    if (platformActionListener2 != null) {
                        platformActionListener2.onComplete(this, 2, b10);
                        return;
                    }
                    return;
                }
                if (this.listener != null) {
                    this.listener.onError(this, 2, new Throwable(new Hashon().fromHashMap(b10)));
                    return;
                }
                return;
            }
            PlatformActionListener platformActionListener3 = this.listener;
            if (platformActionListener3 != null) {
                platformActionListener3.onError(this, 2, new Throwable("response is null"));
            }
        } catch (Throwable th2) {
            PlatformActionListener platformActionListener4 = this.listener;
            if (platformActionListener4 != null) {
                platformActionListener4.onError(this, 2, th2);
            }
        }
    }

    @Override // cn.sharesdk.framework.Platform
    public String getName() {
        return NAME;
    }

    @Override // cn.sharesdk.framework.Platform
    public int getPlatformId() {
        return 11;
    }

    @Override // cn.sharesdk.framework.Platform
    public int getVersion() {
        return 2;
    }

    @Override // cn.sharesdk.framework.Platform
    public boolean hasShareCallback() {
        return true;
    }

    @Override // cn.sharesdk.framework.Platform
    public void initDevInfo(String str) {
        this.f5484a = getDevinfo("ConsumerKey");
        this.f5485b = getDevinfo("ConsumerSecret");
        this.f5486c = getDevinfo("CallbackUrl");
        this.f5487d = "true".equals(getDevinfo("BypassApproval"));
        this.f5488e = "true".equals(getDevinfo("IsUseV2"));
    }

    @Override // cn.sharesdk.framework.Platform
    public void setNetworkDevinfo() {
        this.f5484a = getNetworkDevinfo("consumer_key", "ConsumerKey");
        this.f5485b = getNetworkDevinfo("consumer_secret", "ConsumerSecret");
        this.f5486c = getNetworkDevinfo("redirect_uri", "CallbackUrl");
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
        try {
            HashMap<String, Object> a10 = c.a(this).a(str, this.f5488e);
            if (a10 != null && a10.size() > 0) {
                if (!a10.containsKey("error_code") && !a10.containsKey("error") && !a10.containsKey("errors")) {
                    if (str == null) {
                        this.f5036db.put("nickname", String.valueOf(a10.get("screen_name")));
                        this.f5036db.put("icon", String.valueOf(a10.get("profile_image_url")));
                        this.f5036db.put("gender", "2");
                        this.f5036db.put("resume", String.valueOf(a10.get("description")));
                        this.f5036db.put("secretType", "true".equals(String.valueOf(a10.get("verified"))) ? "1" : "0");
                        this.f5036db.put("followerCount", String.valueOf(a10.get("followers_count")));
                        this.f5036db.put("favouriteCount", String.valueOf(a10.get("friends_count")));
                        this.f5036db.put("shareCount", String.valueOf(a10.get("statuses_count")));
                        this.f5036db.put("snsregat", String.valueOf(ResHelper.dateToLong(String.valueOf(a10.get("created_at")))));
                        this.f5036db.put("snsUserUrl", "https://twitter.com/" + a10.get("screen_name"));
                    }
                    PlatformActionListener platformActionListener = this.listener;
                    if (platformActionListener != null) {
                        platformActionListener.onComplete(this, 8, a10);
                        return;
                    }
                    return;
                }
                if (this.listener != null) {
                    this.listener.onError(this, 8, new Throwable(new Hashon().fromHashMap(a10)));
                    return;
                }
                return;
            }
            PlatformActionListener platformActionListener2 = this.listener;
            if (platformActionListener2 != null) {
                platformActionListener2.onError(this, 8, new Throwable("response is null"));
            }
        } catch (Throwable th2) {
            PlatformActionListener platformActionListener3 = this.listener;
            if (platformActionListener3 != null) {
                platformActionListener3.onError(this, 8, th2);
            }
        }
    }
}
