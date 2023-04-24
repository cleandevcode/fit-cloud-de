package cn.sharesdk.sina.weibo;

import android.os.Bundle;
import android.support.v4.media.d;
import android.text.TextUtils;
import cn.sharesdk.framework.Platform;
import cn.sharesdk.framework.PlatformActionListener;
import cn.sharesdk.framework.PlatformDb;
import cn.sharesdk.framework.ShareSDKCallback;
import cn.sharesdk.framework.a.b.f;
import cn.sharesdk.framework.authorize.AuthorizeListener;
import cn.sharesdk.framework.utils.SSDKLog;
import com.mob.tools.utils.Hashon;
import com.mob.tools.utils.ResHelper;
import com.sina.weibo.sdk.auth.Oauth2AccessToken;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* loaded from: classes.dex */
public class SinaWeibo extends Platform {
    public static final String NAME = "SinaWeibo";
    public static volatile boolean initFlag = false;

    /* renamed from: a */
    private String f5347a;

    /* renamed from: b */
    private String f5348b;

    /* renamed from: c */
    private String f5349c;

    /* renamed from: d */
    private boolean f5350d;

    private boolean c() {
        if (TextUtils.isEmpty(getDb().get(Oauth2AccessToken.KEY_REFRESH_TOKEN))) {
            return false;
        }
        a a10 = a.a(this);
        a10.a(this.f5347a, this.f5348b);
        a10.a(this.f5349c);
        return a10.a();
    }

    @Override // cn.sharesdk.framework.Platform
    public boolean checkAuthorize(int i10, Object obj) {
        a a10 = a.a(this);
        a10.c(this.f5036db.getToken());
        a10.a(this.f5347a, this.f5348b);
        a10.a(this.f5349c);
        a10.c();
        if (i10 == 9 || isAuthValid() || c()) {
            return true;
        }
        innerAuthorize(i10, obj);
        return false;
    }

    @Override // cn.sharesdk.framework.Platform
    public void doAuthorize(String[] strArr) {
        final a a10 = a.a(this);
        a10.a(this.f5347a, this.f5348b);
        a10.a(this.f5349c);
        a10.a(strArr);
        a10.a(new AuthorizeListener() { // from class: cn.sharesdk.sina.weibo.SinaWeibo.1
            @Override // cn.sharesdk.framework.authorize.AuthorizeListener
            public void onCancel() {
                if (SinaWeibo.this.listener != null) {
                    SinaWeibo.this.listener.onCancel(SinaWeibo.this, 1);
                }
            }

            @Override // cn.sharesdk.framework.authorize.AuthorizeListener
            public void onComplete(Bundle bundle) {
                long j10;
                String string = bundle.getString(Oauth2AccessToken.KEY_UID);
                String string2 = bundle.getString(Oauth2AccessToken.KEY_ACCESS_TOKEN);
                String string3 = bundle.getString(Oauth2AccessToken.KEY_EXPIRES_IN);
                String string4 = bundle.getString(Oauth2AccessToken.KEY_REFRESH_TOKEN);
                if (bundle.containsKey("username")) {
                    SinaWeibo.this.f5036db.put("nickname", bundle.getString(Oauth2AccessToken.KEY_SCREEN_NAME));
                }
                SinaWeibo.this.f5036db.putToken(string2);
                try {
                    j10 = ResHelper.parseLong(string3);
                } catch (Throwable unused) {
                    j10 = 0;
                }
                SinaWeibo.this.f5036db.putExpiresIn(j10);
                SinaWeibo.this.f5036db.put(Oauth2AccessToken.KEY_REFRESH_TOKEN, string4);
                SinaWeibo.this.f5036db.putUserId(string);
                a10.c(string2);
                SinaWeibo.this.afterRegister(1, null);
            }

            @Override // cn.sharesdk.framework.authorize.AuthorizeListener
            public void onError(Throwable th2) {
                if (SinaWeibo.this.listener != null) {
                    SinaWeibo.this.listener.onError(SinaWeibo.this, 1, th2);
                }
            }
        }, isSSODisable());
    }

    @Override // cn.sharesdk.framework.Platform
    public void doCustomerProtocol(String str, String str2, int i10, HashMap<String, Object> hashMap, HashMap<String, String> hashMap2) {
        try {
            HashMap<String, Object> a10 = a.a(this).a(str, str2, hashMap, hashMap2);
            if (a10 != null && a10.size() > 0) {
                if (!a10.containsKey("error_code") || ((Integer) a10.get("error_code")).intValue() == 0) {
                    PlatformActionListener platformActionListener = this.listener;
                    if (platformActionListener != null) {
                        platformActionListener.onComplete(this, i10, a10);
                        return;
                    }
                    return;
                } else if (this.listener != null) {
                    this.listener.onError(this, i10, new Throwable(new Hashon().fromHashMap(a10)));
                    return;
                } else {
                    return;
                }
            }
            PlatformActionListener platformActionListener2 = this.listener;
            if (platformActionListener2 != null) {
                platformActionListener2.onError(this, i10, new Throwable());
            }
        } catch (Throwable th2) {
            this.listener.onError(this, i10, th2);
        }
    }

    @Override // cn.sharesdk.framework.Platform
    public void doShare(Platform.ShareParams shareParams) {
        SSDKLog b10 = SSDKLog.b();
        StringBuilder a10 = d.a("Weibo start Share with Appkey:");
        a10.append(this.f5347a);
        a10.append(",appSecret:");
        a10.append(this.f5348b);
        a10.append(",redirectUrl:");
        a10.append(this.f5349c);
        b10.a(a10.toString(), new Object[0]);
        SSDKLog b11 = SSDKLog.b();
        StringBuilder a11 = d.a("Weibo ShareParams:");
        a11.append(shareParams.toString());
        b11.a(a11.toString(), new Object[0]);
        a a12 = a.a(this);
        a12.a(this.f5347a, this.f5348b);
        try {
            if (this.f5350d && this.isClientValid) {
                a12.a(shareParams, this.listener);
            } else {
                a12.b(shareParams, this.listener);
            }
        } catch (Throwable th2) {
            this.listener.onError(this, 9, th2);
        }
    }

    @Override // cn.sharesdk.framework.Platform
    public HashMap<String, Object> filterFriendshipInfo(int i10, HashMap<String, Object> hashMap) {
        String str;
        Object obj;
        String str2;
        StringBuilder sb2;
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
        int parseInt = Integer.parseInt(String.valueOf(hashMap.get("current_cursor")));
        int parseInt2 = Integer.parseInt(String.valueOf(hashMap.get("total_number")));
        if (parseInt2 == 0 || (obj = hashMap.get("users")) == null) {
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
                hashMap4.put("snsuid", String.valueOf(hashMap3.get("id")));
                hashMap4.put("nickname", String.valueOf(hashMap3.get("screen_name")));
                hashMap4.put("icon", String.valueOf(hashMap3.get("avatar_hd")));
                String str3 = "1";
                if (String.valueOf(hashMap3.get("verified")).equals("true")) {
                    hashMap4.put("secretType", "1");
                } else {
                    hashMap4.put("secretType", "0");
                }
                hashMap4.put("secret", String.valueOf(hashMap3.get("verified_reason")));
                String valueOf = String.valueOf(hashMap3.get("gender"));
                if (valueOf.equals("m")) {
                    hashMap4.put("gender", "0");
                } else {
                    if (!valueOf.equals("f")) {
                        str3 = "2";
                    }
                    hashMap4.put("gender", str3);
                }
                StringBuilder a10 = d.a("http://weibo.com/");
                a10.append(String.valueOf(hashMap3.get("profile_url")));
                hashMap4.put("snsUserUrl", a10.toString());
                hashMap4.put("resume", String.valueOf(hashMap3.get("description")));
                hashMap4.put("followerCount", String.valueOf(hashMap3.get("followers_count")));
                hashMap4.put("favouriteCount", String.valueOf(hashMap3.get("friends_count")));
                hashMap4.put("shareCount", String.valueOf(hashMap3.get("statuses_count")));
                hashMap4.put("snsregat", String.valueOf(ResHelper.dateToLong(String.valueOf(hashMap3.get("created_at")))));
                arrayList.add(hashMap4);
            }
        }
        if (arrayList.size() <= 0) {
            return null;
        }
        if (10 == i10) {
            int i11 = parseInt + 1;
            if (((Integer) hashMap.get("page_count")).intValue() * i11 >= parseInt2) {
                sb2 = new StringBuilder();
                sb2.append(parseInt);
            } else {
                sb2 = new StringBuilder();
                sb2.append(i11);
                sb2.append("_false");
                str2 = sb2.toString();
                hashMap2.put("nextCursor", str2);
                hashMap2.put("list", arrayList);
                return hashMap2;
            }
        } else {
            int size = arrayList.size() + parseInt;
            if (size >= parseInt2) {
                sb2 = new StringBuilder();
                sb2.append(parseInt2);
            } else {
                str2 = size + "_false";
                hashMap2.put("nextCursor", str2);
                hashMap2.put("list", arrayList);
                return hashMap2;
            }
        }
        sb2.append("_true");
        str2 = sb2.toString();
        hashMap2.put("nextCursor", str2);
        hashMap2.put("list", arrayList);
        return hashMap2;
    }

    @Override // cn.sharesdk.framework.Platform
    public f.a filterShareContent(Platform.ShareParams shareParams, HashMap<String, Object> hashMap) {
        f.a aVar = new f.a();
        aVar.f5150b = shareParams.getText();
        if (hashMap != null) {
            aVar.f5149a = String.valueOf(hashMap.get("id"));
            aVar.f5152d.add(String.valueOf(hashMap.get("original_pic")));
            aVar.f5155g = hashMap;
        }
        return aVar;
    }

    @Override // cn.sharesdk.framework.Platform
    public void follow(String str) {
        try {
            HashMap<String, Object> e10 = a.a(this).e(str);
            if (e10 == null) {
                PlatformActionListener platformActionListener = this.listener;
                if (platformActionListener != null) {
                    platformActionListener.onError(this, 6, new Throwable());
                }
            } else if (!e10.containsKey("error_code") || ((Integer) e10.get("error_code")).intValue() == 0) {
                PlatformActionListener platformActionListener2 = this.listener;
                if (platformActionListener2 != null) {
                    platformActionListener2.onComplete(this, 6, e10);
                }
            } else if (this.listener != null) {
                this.listener.onError(this, 6, new Throwable(new Hashon().fromHashMap(e10)));
            }
        } catch (Throwable th2) {
            this.listener.onError(this, 6, th2);
        }
    }

    @Override // cn.sharesdk.framework.Platform
    public HashMap<String, Object> getBilaterals(int i10, int i11, String str) {
        if (TextUtils.isEmpty(str)) {
            str = this.f5036db.getUserId();
        }
        if (TextUtils.isEmpty(str)) {
            str = this.f5036db.get("nickname");
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            HashMap<String, Object> c10 = a.a(this).c(i10, i11, str);
            if (c10 == null || c10.containsKey("error_code")) {
                return null;
            }
            c10.put("page_count", Integer.valueOf(i10));
            c10.put("current_cursor", Integer.valueOf(i11));
            return filterFriendshipInfo(10, c10);
        } catch (Throwable th2) {
            SSDKLog.b().a(th2);
            return null;
        }
    }

    @Override // cn.sharesdk.framework.Platform
    public HashMap<String, Object> getFollowers(int i10, int i11, String str) {
        if (TextUtils.isEmpty(str)) {
            str = this.f5036db.getUserId();
        }
        if (TextUtils.isEmpty(str)) {
            str = this.f5036db.get("nickname");
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            HashMap<String, Object> d10 = a.a(this).d(i10, i11, str);
            if (d10 == null || d10.containsKey("error_code")) {
                return null;
            }
            d10.put("current_cursor", Integer.valueOf(i11));
            return filterFriendshipInfo(11, d10);
        } catch (Throwable th2) {
            SSDKLog.b().a(th2);
            return null;
        }
    }

    @Override // cn.sharesdk.framework.Platform
    public HashMap<String, Object> getFollowings(int i10, int i11, String str) {
        if (TextUtils.isEmpty(str)) {
            str = this.f5036db.getUserId();
        }
        if (TextUtils.isEmpty(str)) {
            str = this.f5036db.get("nickname");
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            HashMap<String, Object> b10 = a.a(this).b(i10, i11, str);
            if (b10 == null || b10.containsKey("error_code")) {
                return null;
            }
            b10.put("current_cursor", Integer.valueOf(i11));
            return filterFriendshipInfo(2, b10);
        } catch (Throwable th2) {
            SSDKLog.b().a(th2);
            return null;
        }
    }

    @Override // cn.sharesdk.framework.Platform
    public void getFriendList(int i10, int i11, String str) {
        if (TextUtils.isEmpty(str)) {
            str = this.f5036db.getUserId();
        }
        if (TextUtils.isEmpty(str)) {
            str = this.f5036db.get("nickname");
        }
        if (TextUtils.isEmpty(str)) {
            PlatformActionListener platformActionListener = this.listener;
            if (platformActionListener != null) {
                platformActionListener.onError(this, 2, new RuntimeException("Both weibo id and screen_name are null"));
                return;
            }
            return;
        }
        try {
            HashMap<String, Object> b10 = a.a(this).b(i10, i11, str);
            if (b10 == null) {
                PlatformActionListener platformActionListener2 = this.listener;
                if (platformActionListener2 != null) {
                    platformActionListener2.onError(this, 2, new Throwable());
                }
            } else if (!b10.containsKey("error_code") || ((Integer) b10.get("error_code")).intValue() == 0) {
                PlatformActionListener platformActionListener3 = this.listener;
                if (platformActionListener3 != null) {
                    platformActionListener3.onComplete(this, 2, b10);
                }
            } else if (this.listener != null) {
                this.listener.onError(this, 2, new Throwable(new Hashon().fromHashMap(b10)));
            }
        } catch (Throwable th2) {
            this.listener.onError(this, 2, th2);
        }
    }

    @Override // cn.sharesdk.framework.Platform
    public String getName() {
        return NAME;
    }

    @Override // cn.sharesdk.framework.Platform
    public int getPlatformId() {
        return 1;
    }

    @Override // cn.sharesdk.framework.Platform
    public int getVersion() {
        return 1;
    }

    @Override // cn.sharesdk.framework.Platform
    public boolean hasShareCallback() {
        return true;
    }

    @Override // cn.sharesdk.framework.Platform
    public void initDevInfo(String str) {
        this.f5347a = getDevinfo("AppKey");
        this.f5348b = getDevinfo("AppSecret");
        this.f5349c = getDevinfo("RedirectUrl");
        this.f5350d = !"false".equals(getDevinfo("ShareByAppClient"));
    }

    @Override // cn.sharesdk.framework.Platform
    public void isClientValid(ShareSDKCallback<Boolean> shareSDKCallback) {
        try {
            a.a(this).a(shareSDKCallback);
        } catch (Throwable th2) {
            SSDKLog.b().a(th2);
            if (shareSDKCallback != null) {
                shareSDKCallback.onCallback(Boolean.FALSE);
            }
        }
    }

    @Override // cn.sharesdk.framework.Platform
    public void setNetworkDevinfo() {
        this.f5347a = getNetworkDevinfo("app_key", "AppKey");
        this.f5348b = getNetworkDevinfo("app_secret", "AppSecret");
        this.f5349c = getNetworkDevinfo("redirect_uri", "RedirectUrl");
    }

    @Override // cn.sharesdk.framework.Platform
    public void timeline(int i10, int i11, String str) {
        if (TextUtils.isEmpty(str)) {
            str = this.f5036db.getUserId();
        }
        if (TextUtils.isEmpty(str)) {
            str = this.f5036db.get("nickname");
        }
        if (TextUtils.isEmpty(str)) {
            PlatformActionListener platformActionListener = this.listener;
            if (platformActionListener != null) {
                platformActionListener.onError(this, 7, new RuntimeException("Both weibo id and screen_name are null"));
                return;
            }
            return;
        }
        try {
            HashMap<String, Object> a10 = a.a(this).a(i10, i11, str);
            if (a10 == null) {
                PlatformActionListener platformActionListener2 = this.listener;
                if (platformActionListener2 != null) {
                    platformActionListener2.onError(this, 7, new Throwable());
                }
            } else if (!a10.containsKey("error_code") || ((Integer) a10.get("error_code")).intValue() == 0) {
                PlatformActionListener platformActionListener3 = this.listener;
                if (platformActionListener3 != null) {
                    platformActionListener3.onComplete(this, 7, a10);
                }
            } else if (this.listener != null) {
                this.listener.onError(this, 7, new Throwable(new Hashon().fromHashMap(a10)));
            }
        } catch (Throwable th2) {
            this.listener.onError(this, 7, th2);
        }
    }

    @Override // cn.sharesdk.framework.Platform
    public void userInfor(String str) {
        boolean z10;
        PlatformDb platformDb;
        boolean z11 = true;
        if (TextUtils.isEmpty(str)) {
            str = this.f5036db.getUserId();
            z10 = true;
        } else {
            z10 = false;
        }
        if (TextUtils.isEmpty(str)) {
            str = this.f5036db.get("nickname");
        } else {
            z11 = z10;
        }
        if (TextUtils.isEmpty(str)) {
            PlatformActionListener platformActionListener = this.listener;
            if (platformActionListener != null) {
                platformActionListener.onError(this, 8, new RuntimeException("Both weibo id and screen_name are null"));
                return;
            }
            return;
        }
        try {
            HashMap<String, Object> d10 = a.a(this).d(str);
            if (d10 == null) {
                PlatformActionListener platformActionListener2 = this.listener;
                if (platformActionListener2 != null) {
                    platformActionListener2.onError(this, 8, new Throwable());
                }
            } else if (d10.containsKey("error_code") && ((Integer) d10.get("error_code")).intValue() != 0) {
                if (this.listener != null) {
                    this.listener.onError(this, 8, new Throwable(new Hashon().fromHashMap(d10)));
                }
            } else {
                if (z11) {
                    this.f5036db.putUserId(String.valueOf(d10.get("id")));
                    this.f5036db.put("nickname", String.valueOf(d10.get("screen_name")));
                    this.f5036db.put("icon", String.valueOf(d10.get("avatar_hd")));
                    String str2 = "1";
                    if (String.valueOf(d10.get("verified")).equals("true")) {
                        this.f5036db.put("secretType", "1");
                    } else {
                        this.f5036db.put("secretType", "0");
                    }
                    this.f5036db.put("secret", String.valueOf(d10.get("verified_reason")));
                    String valueOf = String.valueOf(d10.get("gender"));
                    if (valueOf.equals("m")) {
                        this.f5036db.put("gender", "0");
                    } else {
                        if (valueOf.equals("f")) {
                            platformDb = this.f5036db;
                        } else {
                            platformDb = this.f5036db;
                            str2 = "2";
                        }
                        platformDb.put("gender", str2);
                    }
                    PlatformDb platformDb2 = this.f5036db;
                    platformDb2.put("snsUserUrl", "http://weibo.com/" + String.valueOf(d10.get("profile_url")));
                    this.f5036db.put("resume", String.valueOf(d10.get("description")));
                    this.f5036db.put("followerCount", String.valueOf(d10.get("followers_count")));
                    this.f5036db.put("favouriteCount", String.valueOf(d10.get("friends_count")));
                    this.f5036db.put("shareCount", String.valueOf(d10.get("statuses_count")));
                    this.f5036db.put("snsregat", String.valueOf(ResHelper.dateToLong(String.valueOf(d10.get("created_at")))));
                }
                PlatformActionListener platformActionListener3 = this.listener;
                if (platformActionListener3 != null) {
                    platformActionListener3.onComplete(this, 8, d10);
                }
            }
        } catch (Throwable th2) {
            this.listener.onError(this, 8, th2);
        }
    }
}
