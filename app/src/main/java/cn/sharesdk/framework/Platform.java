package cn.sharesdk.framework;

import android.content.pm.PackageInfo;
import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import cn.sharesdk.framework.a.b.f;
import cn.sharesdk.framework.utils.SSDKLog;
import cn.sharesdk.framework.utils.j;
import com.mob.MobSDK;
import com.mob.tools.utils.DH;
import com.mob.tools.utils.UIHandler;
import java.util.HashMap;

/* loaded from: classes.dex */
public abstract class Platform {
    public static final int ACTION_AUTHORIZING = 1;
    public static final int ACTION_CUSTOMER = 655360;
    public static final int ACTION_FOLLOWING_USER = 6;
    public static final int ACTION_GETTING_BILATERAL_LIST = 10;
    public static final int ACTION_GETTING_FOLLOWER_LIST = 11;
    public static final int ACTION_GETTING_FRIEND_LIST = 2;
    public static final int ACTION_SENDING_DIRECT_MESSAGE = 5;
    public static final int ACTION_SHARE = 9;
    public static final int ACTION_TIMELINE = 7;
    public static final int ACTION_USER_INFOR = 8;
    public static final int CUSTOMER_ACTION_MASK = 65535;
    public static final int DY_MIXFILE = 23;
    public static final int GGP_REFUSE = 21;
    public static final int INSTAGRAM_FRIEND = 13;
    public static final int KAKAO_COMMERCE_TEMPLATE = 18;
    public static final int KAKAO_CUSTOM_TEMPLATE = 20;
    public static final int KAKAO_FEED_TEMPLATE = 16;
    public static final int KAKAO_TEXT_TEMPLATE = 19;
    public static final int KAKAO_URL_TEMPLATE = 17;
    public static final int OPEN_QQMINIPROGRAM = 22;
    public static final int OPEN_WXMINIPROGRAM = 12;
    public static final int QQ_MINI_PROGRAM = 15;
    public static final int SHARE_APPS = 7;
    public static final int SHARE_DYIM_IMG = 24;
    public static final int SHARE_DYIM_WEBPAGE = 25;
    public static final int SHARE_EMOJI = 9;
    public static final int SHARE_FILE = 8;
    public static final int SHARE_IMAGE = 2;
    public static final int SHARE_LINKCARD = 14;
    public static final int SHARE_MUSIC = 5;
    public static final int SHARE_TEXT = 1;
    public static final int SHARE_VIDEO = 6;
    public static final int SHARE_WEBPAGE = 4;
    public static final int SHARE_WXMINIPROGRAM = 11;
    public static final int SHARE_ZHIFUBAO = 10;

    /* renamed from: a */
    private f f5034a;

    /* renamed from: b */
    private final Object f5035b = new Object();

    /* renamed from: db */
    public final PlatformDb f5036db;
    public volatile boolean isClientValid;
    public PlatformActionListener listener;
    public String pkgName;
    public final PlatformActionListener uIListener;

    /* loaded from: classes.dex */
    public static class ShareParams extends InnerShareParams {
        public ShareParams() {
        }

        public ShareParams(String str) {
            super(str);
        }

        public ShareParams(HashMap<String, Object> hashMap) {
            super(hashMap);
        }
    }

    public Platform() {
        f fVar = new f(this);
        this.f5034a = fVar;
        this.f5036db = fVar.g();
        this.listener = this.f5034a.i();
        this.uIListener = new PlatformActionListener() { // from class: cn.sharesdk.framework.Platform.1
            @Override // cn.sharesdk.framework.PlatformActionListener
            public void onCancel(final Platform platform, final int i10) {
                if (Platform.this.listener == null) {
                    return;
                }
                try {
                    if (Looper.getMainLooper() == Looper.myLooper()) {
                        Platform.this.listener.onCancel(platform, i10);
                    } else {
                        UIHandler.sendEmptyMessage(0, new Handler.Callback() { // from class: cn.sharesdk.framework.Platform.1.3
                            @Override // android.os.Handler.Callback
                            public boolean handleMessage(Message message) {
                                Platform.this.listener.onCancel(platform, i10);
                                return false;
                            }
                        });
                    }
                } catch (Throwable th2) {
                    SSDKLog.b().a(th2);
                }
            }

            @Override // cn.sharesdk.framework.PlatformActionListener
            public void onComplete(final Platform platform, final int i10, final HashMap<String, Object> hashMap) {
                if (Platform.this.listener == null) {
                    return;
                }
                try {
                    if (Looper.getMainLooper() == Looper.myLooper()) {
                        Platform.this.listener.onComplete(platform, i10, hashMap);
                    } else {
                        UIHandler.sendEmptyMessage(0, new Handler.Callback() { // from class: cn.sharesdk.framework.Platform.1.2
                            @Override // android.os.Handler.Callback
                            public boolean handleMessage(Message message) {
                                Platform.this.listener.onComplete(platform, i10, hashMap);
                                return false;
                            }
                        });
                    }
                } catch (Throwable th2) {
                    SSDKLog.b().a(th2);
                }
            }

            @Override // cn.sharesdk.framework.PlatformActionListener
            public void onError(final Platform platform, final int i10, final Throwable th2) {
                if (Platform.this.listener == null) {
                    return;
                }
                try {
                    if (Looper.getMainLooper() == Looper.myLooper()) {
                        Platform.this.listener.onError(platform, i10, th2);
                    } else {
                        UIHandler.sendEmptyMessage(0, new Handler.Callback() { // from class: cn.sharesdk.framework.Platform.1.1
                            @Override // android.os.Handler.Callback
                            public boolean handleMessage(Message message) {
                                Platform.this.listener.onError(platform, i10, th2);
                                return false;
                            }
                        });
                    }
                } catch (Throwable th3) {
                    SSDKLog.b().a(th3);
                }
            }
        };
    }

    public void SSOSetting(boolean z10) {
        this.f5034a.a(z10);
    }

    public void a() {
        this.f5034a.a(false);
        this.f5034a.a(getName());
    }

    public void afterRegister(int i10, Object obj) {
        this.f5034a.b(i10, obj);
    }

    public void authorize() {
        authorize(null);
    }

    public void authorize(final String[] strArr) {
        cn.sharesdk.framework.utils.h.a();
        isClientValid(new ShareSDKCallback<Boolean>() { // from class: cn.sharesdk.framework.Platform.4
            @Override // cn.sharesdk.framework.ShareSDKCallback
            /* renamed from: a */
            public void onCallback(Boolean bool) {
                Platform.this.isClientValid = bool.booleanValue();
                Platform.this.f5034a.a(strArr);
            }
        });
    }

    public boolean b() {
        return this.f5034a.f();
    }

    public abstract boolean checkAuthorize(int i10, Object obj);

    public void copyDevinfo(String str, String str2) {
        ShareSDK.a(str, str2);
    }

    public void copyNetworkDevinfo(int i10, int i11) {
        ShareSDK.a(i10, i11);
    }

    public void customerProtocol(String str, String str2, short s10, HashMap<String, Object> hashMap, HashMap<String, String> hashMap2) {
        this.f5034a.a(str, str2, s10, hashMap, hashMap2);
    }

    public abstract void doAuthorize(String[] strArr);

    public abstract void doCustomerProtocol(String str, String str2, int i10, HashMap<String, Object> hashMap, HashMap<String, String> hashMap2);

    public abstract void doShare(ShareParams shareParams);

    public abstract HashMap<String, Object> filterFriendshipInfo(int i10, HashMap<String, Object> hashMap);

    public abstract f.a filterShareContent(ShareParams shareParams, HashMap<String, Object> hashMap);

    public abstract void follow(String str);

    public void followFriend(String str) {
        this.f5034a.b(str);
    }

    public abstract HashMap<String, Object> getBilaterals(int i10, int i11, String str);

    public PlatformDb getDb() {
        return this.f5036db;
    }

    public String getDevinfo(String str) {
        return getDevinfo(getName(), str);
    }

    public String getDevinfo(String str, String str2) {
        return ShareSDK.getDevinfo(str, str2);
    }

    public abstract HashMap<String, Object> getFollowers(int i10, int i11, String str);

    public abstract HashMap<String, Object> getFollowings(int i10, int i11, String str);

    public abstract void getFriendList(int i10, int i11, String str);

    public int getId() {
        return this.f5034a.a();
    }

    public abstract String getName();

    public String getNetworkDevinfo(int i10, String str, String str2) {
        return this.f5034a.a(i10, str, str2);
    }

    public String getNetworkDevinfo(String str, String str2) {
        return getNetworkDevinfo(getPlatformId(), str, str2);
    }

    public PlatformActionListener getPlatformActionListener() {
        return this.f5034a.c();
    }

    public abstract int getPlatformId();

    public String getShortLintk(String str, boolean z10, HashMap<String, String> hashMap) {
        return this.f5034a.a(str, z10, hashMap);
    }

    public void getShortLintk(String str, boolean z10, ShareSDKCallback<String> shareSDKCallback) {
        this.f5034a.a(str, z10, shareSDKCallback);
    }

    public int getSortId() {
        return this.f5034a.b();
    }

    public void getTimeLine(String str, int i10, int i11) {
        this.f5034a.a(str, i10, i11);
    }

    public abstract int getVersion();

    public abstract boolean hasShareCallback();

    public abstract void initDevInfo(String str);

    public void innerAuthorize(int i10, Object obj) {
        this.f5034a.a(i10, obj);
    }

    public boolean isAuthValid() {
        return this.f5034a.d();
    }

    public void isClientValid(final ShareSDKCallback<Boolean> shareSDKCallback) {
        if (shareSDKCallback == null) {
            return;
        }
        try {
            if (TextUtils.isEmpty(this.pkgName)) {
                shareSDKCallback.onCallback(Boolean.FALSE);
            } else {
                DH.requester(MobSDK.getContext()).getPInfoForce(true, this.pkgName, 0).request(new DH.DHResponder() { // from class: cn.sharesdk.framework.Platform.3
                    @Override // com.mob.tools.utils.DH.DHResponder
                    public void onResponse(DH.DHResponse dHResponse) {
                        boolean z10;
                        try {
                            PackageInfo pInfoForce = dHResponse.getPInfoForce(new int[0]);
                            ShareSDKCallback shareSDKCallback2 = shareSDKCallback;
                            if (pInfoForce != null) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            shareSDKCallback2.onCallback(Boolean.valueOf(z10));
                        } catch (Throwable th2) {
                            SSDKLog.b().a(cn.sharesdk.facebook.e.a("isClientValid", th2), new Object[0]);
                            shareSDKCallback.onCallback(Boolean.FALSE);
                        }
                    }
                });
            }
        } catch (Throwable unused) {
            shareSDKCallback.onCallback(Boolean.FALSE);
        }
    }

    @Deprecated
    public boolean isClientValid() {
        j.a(new j.a() { // from class: cn.sharesdk.framework.Platform.2
            @Override // cn.sharesdk.framework.utils.j.a
            public void a() {
                Platform.this.isClientValid(new ShareSDKCallback<Boolean>() { // from class: cn.sharesdk.framework.Platform.2.1
                    @Override // cn.sharesdk.framework.ShareSDKCallback
                    /* renamed from: a */
                    public void onCallback(Boolean bool) {
                        synchronized (Platform.this.f5035b) {
                            Platform.this.isClientValid = bool != null && bool.booleanValue();
                            Platform.this.f5035b.notifyAll();
                        }
                    }
                });
            }
        });
        synchronized (this.f5035b) {
            try {
                this.f5035b.wait(1000L);
            }
        }
        return this.isClientValid;
    }

    public boolean isSSODisable() {
        return this.f5034a.e();
    }

    public void listFriend(int i10, int i11, String str) {
        this.f5034a.a(i10, i11, str);
    }

    public void removeAccount(boolean z10) {
        this.f5034a.h();
        ShareSDK.removeCookieOnAuthorize(z10);
    }

    public abstract void setNetworkDevinfo();

    public void setPlatformActionListener(PlatformActionListener platformActionListener) {
        this.f5034a.a(platformActionListener);
    }

    public void share(final ShareParams shareParams) {
        cn.sharesdk.framework.utils.h.a();
        isClientValid(new ShareSDKCallback<Boolean>() { // from class: cn.sharesdk.framework.Platform.6
            @Override // cn.sharesdk.framework.ShareSDKCallback
            /* renamed from: a */
            public void onCallback(Boolean bool) {
                Platform.this.isClientValid = bool.booleanValue();
                Platform.this.f5034a.b(shareParams);
            }
        });
    }

    public void showUser(final String str) {
        isClientValid(new ShareSDKCallback<Boolean>() { // from class: cn.sharesdk.framework.Platform.7
            @Override // cn.sharesdk.framework.ShareSDKCallback
            /* renamed from: a */
            public void onCallback(Boolean bool) {
                Platform.this.isClientValid = bool.booleanValue();
                Platform.this.f5034a.c(str);
            }
        });
    }

    public void subscribeAuth(final ShareParams shareParams) {
        isClientValid(new ShareSDKCallback<Boolean>() { // from class: cn.sharesdk.framework.Platform.5
            @Override // cn.sharesdk.framework.ShareSDKCallback
            /* renamed from: a */
            public void onCallback(Boolean bool) {
                Platform.this.isClientValid = bool.booleanValue();
                Platform.this.f5034a.a(shareParams);
            }
        });
    }

    public abstract void timeline(int i10, int i11, String str);

    public String uploadImageToFileServer(Bitmap bitmap) {
        return this.f5034a.a(bitmap);
    }

    public String uploadImageToFileServer(String str) {
        return this.f5034a.d(str);
    }

    public abstract void userInfor(String str);
}
