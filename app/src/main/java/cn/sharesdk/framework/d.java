package cn.sharesdk.framework;

import android.text.TextUtils;
import cn.sharesdk.framework.Platform;
import cn.sharesdk.framework.a.b.f;
import cn.sharesdk.framework.utils.SSDKLog;
import cn.sharesdk.wechat.friends.Wechat;
import cn.sharesdk.wechat.moments.WechatMoments;
import com.mob.tools.utils.Data;
import com.mob.tools.utils.Hashon;
import java.util.HashMap;

/* loaded from: classes.dex */
public class d implements PlatformActionListener {

    /* renamed from: a */
    private PlatformActionListener f5213a;

    /* renamed from: b */
    private HashMap<Platform, Platform.ShareParams> f5214b = new HashMap<>();

    /* renamed from: c */
    private int f5215c;

    public String a(Platform platform) {
        try {
        } catch (Throwable th2) {
            th = th2;
        }
        try {
            return a(platform.getDb(), new String[]{"nickname", "icon", "gender", "snsUserUrl", "resume", "secretType", "secret", "birthday", "followerCount", "favouriteCount", "shareCount", "snsregat", "snsUserLevel", "educationJSONArrayStr", "workJSONArrayStr"});
        } catch (Throwable th3) {
            th = th3;
            SSDKLog.b().b(th);
            return null;
        }
    }

    private String a(PlatformDb platformDb, String[] strArr) {
        StringBuilder sb2 = new StringBuilder();
        StringBuilder sb3 = new StringBuilder();
        int i10 = 0;
        for (String str : strArr) {
            if (i10 > 0) {
                sb3.append('|');
                sb2.append('|');
            }
            i10++;
            String str2 = platformDb.get(str);
            if (!TextUtils.isEmpty(str2)) {
                sb2.append(str2);
                sb3.append(Data.urlEncode(str2, "utf-8"));
            }
        }
        SSDKLog b10 = SSDKLog.b();
        StringBuilder a10 = android.support.v4.media.d.a("======UserData: ");
        a10.append(sb2.toString());
        b10.b(a10.toString());
        return sb3.toString();
    }

    private void a(Platform platform, final int i10, final HashMap<String, Object> hashMap) {
        final PlatformActionListener platformActionListener = this.f5213a;
        this.f5213a = new PlatformActionListener() { // from class: cn.sharesdk.framework.d.1
            @Override // cn.sharesdk.framework.PlatformActionListener
            public void onCancel(Platform platform2, int i11) {
                d.this.f5213a = platformActionListener;
                if (d.this.f5213a != null) {
                    d.this.f5213a.onComplete(platform2, i10, hashMap);
                }
            }

            @Override // cn.sharesdk.framework.PlatformActionListener
            public void onComplete(Platform platform2, int i11, HashMap<String, Object> hashMap2) {
                d.this.f5213a = platformActionListener;
                if (d.this.f5213a != null) {
                    d.this.f5213a.onComplete(platform2, i10, hashMap);
                }
                cn.sharesdk.framework.a.b.b bVar = new cn.sharesdk.framework.a.b.b();
                bVar.f5121a = platform2.getPlatformId();
                bVar.f5122b = "TencentWeibo".equals(platform2.getName()) ? platform2.getDb().get("name") : platform2.getDb().getUserId();
                bVar.f5123c = new Hashon().fromHashMap(hashMap2);
                bVar.f5124d = d.this.a(platform2);
                cn.sharesdk.framework.a.d a10 = cn.sharesdk.framework.a.d.a();
                if (a10 != null) {
                    a10.a(bVar);
                }
            }

            @Override // cn.sharesdk.framework.PlatformActionListener
            public void onError(Platform platform2, int i11, Throwable th2) {
                SSDKLog.b().b(th2);
                d.this.f5213a = platformActionListener;
                if (d.this.f5213a != null) {
                    d.this.f5213a.onComplete(platform2, i10, hashMap);
                }
            }
        };
        platform.showUser(null);
    }

    private String b(Platform platform) {
        Platform platform2;
        PlatformDb db2 = platform.getDb();
        if ((WechatMoments.NAME.equals(platform.getName()) || "WechatFavorite".equals(platform.getName())) && TextUtils.isEmpty(db2.getUserGender())) {
            try {
                platform2 = ShareSDK.getPlatform(Wechat.NAME);
            } catch (Throwable th2) {
                SSDKLog.b().a(th2, "InnerPlatformActionListener getUserDataBrief catch ", new Object[0]);
                platform2 = null;
            }
            if (platform2 != null) {
                db2 = platform2.getDb();
            }
        }
        try {
            return a(db2, new String[]{"gender", "birthday", "secretType", "educationJSONArrayStr", "workJSONArrayStr"});
        } catch (Throwable th3) {
            SSDKLog.b().b(th3);
            return null;
        }
    }

    private void b(Platform platform, int i10, HashMap<String, Object> hashMap) {
        HashMap<String, Object> hashMap2;
        Platform platform2;
        Platform.ShareParams remove = this.f5214b.remove(platform);
        if (hashMap != null) {
            remove = (Platform.ShareParams) hashMap.remove("ShareParams");
        }
        try {
            hashMap2 = (HashMap) hashMap.clone();
        } catch (Throwable th2) {
            SSDKLog.b().a(th2);
            hashMap2 = hashMap;
        }
        if (remove != null) {
            cn.sharesdk.framework.a.b.f fVar = new cn.sharesdk.framework.a.b.f();
            fVar.f5148n = remove.getCustomFlag();
            String userId = platform.getDb().getUserId();
            if ((WechatMoments.NAME.equals(platform.getName()) || "WechatFavorite".equals(platform.getName())) && TextUtils.isEmpty(userId)) {
                try {
                    platform2 = ShareSDK.getPlatform(Wechat.NAME);
                } catch (Throwable th3) {
                    SSDKLog.b().a(th3, "InnerPlatformActionListener wechat is null", new Object[0]);
                    platform2 = null;
                }
                if (platform2 != null) {
                    userId = platform2.getDb().getUserId();
                }
            } else if ("TencentWeibo".equals(platform.getName())) {
                userId = platform.getDb().get("name");
            }
            fVar.f5144b = userId;
            fVar.f5143a = platform.getPlatformId();
            f.a filterShareContent = platform.filterShareContent(remove, hashMap2);
            if (filterShareContent != null) {
                fVar.f5145c = filterShareContent.f5149a;
                fVar.f5146d = filterShareContent;
            }
            fVar.f5147m = b(platform);
            cn.sharesdk.framework.a.d a10 = cn.sharesdk.framework.a.d.a();
            if (a10 != null) {
                a10.a(fVar);
            }
        }
        PlatformActionListener platformActionListener = this.f5213a;
        if (platformActionListener != null) {
            try {
                platformActionListener.onComplete(platform, i10, hashMap);
                this.f5213a = null;
                this.f5215c = 0;
            } catch (Throwable th4) {
                SSDKLog.b().a(th4);
            }
        }
    }

    public PlatformActionListener a() {
        return this.f5213a;
    }

    public void a(Platform platform, final int i10, final Object obj) {
        this.f5215c = i10;
        final PlatformActionListener platformActionListener = this.f5213a;
        this.f5213a = new PlatformActionListener() { // from class: cn.sharesdk.framework.d.2
            @Override // cn.sharesdk.framework.PlatformActionListener
            public void onCancel(Platform platform2, int i11) {
                d.this.f5213a = platformActionListener;
                if (d.this.f5213a != null) {
                    d.this.f5213a.onCancel(platform2, i10);
                }
            }

            @Override // cn.sharesdk.framework.PlatformActionListener
            public void onComplete(Platform platform2, int i11, HashMap<String, Object> hashMap) {
                d.this.f5213a = platformActionListener;
                platform2.afterRegister(i10, obj);
            }

            @Override // cn.sharesdk.framework.PlatformActionListener
            public void onError(Platform platform2, int i11, Throwable th2) {
                d.this.f5213a = platformActionListener;
                if (d.this.f5213a != null) {
                    d.this.f5213a.onError(platform2, i11, th2);
                }
            }
        };
        platform.doAuthorize(null);
    }

    public void a(Platform platform, Platform.ShareParams shareParams) {
        this.f5214b.put(platform, shareParams);
    }

    public void a(PlatformActionListener platformActionListener) {
        this.f5213a = platformActionListener;
    }

    @Override // cn.sharesdk.framework.PlatformActionListener
    public void onCancel(Platform platform, int i10) {
        PlatformActionListener platformActionListener = this.f5213a;
        if (platformActionListener != null) {
            platformActionListener.onCancel(platform, i10);
            this.f5213a = null;
            this.f5215c = 0;
        }
    }

    @Override // cn.sharesdk.framework.PlatformActionListener
    public void onComplete(Platform platform, int i10, HashMap<String, Object> hashMap) {
        if (platform instanceof CustomPlatform) {
            PlatformActionListener platformActionListener = this.f5213a;
            if (platformActionListener != null) {
                platformActionListener.onComplete(platform, i10, hashMap);
                this.f5213a = null;
                this.f5215c = 0;
            }
        } else if (i10 == 1) {
            a(platform, i10, hashMap);
        } else if (i10 == 9) {
            b(platform, i10, hashMap);
        } else {
            PlatformActionListener platformActionListener2 = this.f5213a;
            if (platformActionListener2 != null) {
                platformActionListener2.onComplete(platform, i10, hashMap);
                if (Wechat.NAME.equals(platform.getName())) {
                    return;
                }
                int i11 = this.f5215c;
                if (i11 == 0 || i11 == i10) {
                    this.f5213a = null;
                    this.f5215c = 0;
                }
            }
        }
    }

    @Override // cn.sharesdk.framework.PlatformActionListener
    public void onError(Platform platform, int i10, Throwable th2) {
        PlatformActionListener platformActionListener = this.f5213a;
        if (platformActionListener != null) {
            platformActionListener.onError(platform, i10, th2);
            this.f5213a = null;
            this.f5215c = 0;
        }
    }
}
