package cn.sharesdk.wechat.utils;

import android.os.Bundle;
import cn.sharesdk.framework.Platform;
import cn.sharesdk.framework.PlatformActionListener;
import cn.sharesdk.framework.authorize.AuthorizeListener;
import com.mob.tools.utils.Hashon;
import java.util.HashMap;

/* loaded from: classes.dex */
public class k {

    /* renamed from: a */
    private Platform f5582a;

    /* renamed from: b */
    private Platform.ShareParams f5583b;

    /* renamed from: c */
    private PlatformActionListener f5584c;

    /* renamed from: d */
    private AuthorizeListener f5585d;

    /* renamed from: e */
    private h f5586e;

    public k(Platform platform) {
        this.f5582a = platform;
    }

    public Platform.ShareParams a() {
        return this.f5583b;
    }

    public void a(Platform.ShareParams shareParams, PlatformActionListener platformActionListener) {
        this.f5583b = shareParams;
        this.f5584c = platformActionListener;
    }

    public void a(AuthorizeListener authorizeListener) {
        this.f5585d = authorizeListener;
    }

    public void a(WechatResp wechatResp) {
        Throwable th2;
        AuthorizeListener authorizeListener;
        PlatformActionListener platformActionListener;
        PlatformActionListener platformActionListener2;
        int i10 = wechatResp.f5541g;
        if (i10 == -4) {
            HashMap hashMap = new HashMap();
            hashMap.put("errCode", Integer.valueOf(wechatResp.f5541g));
            hashMap.put("errStr", wechatResp.f5542h);
            hashMap.put("transaction", wechatResp.f5543i);
            th2 = new Throwable(new Hashon().fromHashMap(hashMap));
            if (wechatResp.a() != 1 || (authorizeListener = this.f5585d) == null) {
                return;
            }
        } else if (i10 != -3) {
            if (i10 == -2) {
                int a10 = wechatResp.a();
                if (a10 != 1) {
                    if (a10 == 2 && (platformActionListener2 = this.f5584c) != null) {
                        platformActionListener2.onCancel(this.f5582a, 9);
                        return;
                    }
                    return;
                }
                AuthorizeListener authorizeListener2 = this.f5585d;
                if (authorizeListener2 != null) {
                    authorizeListener2.onCancel();
                    return;
                }
                return;
            } else if (i10 != 0) {
                HashMap hashMap2 = new HashMap();
                hashMap2.put("req", wechatResp.getClass().getSimpleName());
                hashMap2.put("errCode", Integer.valueOf(wechatResp.f5541g));
                hashMap2.put("errStr", wechatResp.f5542h);
                hashMap2.put("transaction", wechatResp.f5543i);
                Throwable th3 = new Throwable(new Hashon().fromHashMap(hashMap2));
                PlatformActionListener platformActionListener3 = this.f5584c;
                if (platformActionListener3 != null) {
                    platformActionListener3.onError(this.f5582a, 9, th3);
                }
                AuthorizeListener authorizeListener3 = this.f5585d;
                if (authorizeListener3 != null) {
                    authorizeListener3.onError(th3);
                    return;
                }
                return;
            } else {
                int a11 = wechatResp.a();
                if (a11 == 1) {
                    if (this.f5585d != null) {
                        Bundle bundle = new Bundle();
                        wechatResp.b(bundle);
                        this.f5586e.a(bundle, this.f5585d);
                        return;
                    }
                    return;
                } else if (a11 == 2 && this.f5584c != null) {
                    HashMap<String, Object> hashMap3 = new HashMap<>();
                    hashMap3.put("ShareParams", this.f5583b);
                    this.f5584c.onComplete(this.f5582a, 9, hashMap3);
                    return;
                } else {
                    return;
                }
            }
        } else {
            HashMap hashMap4 = new HashMap();
            hashMap4.put("errCode", Integer.valueOf(wechatResp.f5541g));
            hashMap4.put("errStr", wechatResp.f5542h);
            hashMap4.put("transaction", wechatResp.f5543i);
            th2 = new Throwable(new Hashon().fromHashMap(hashMap4));
            int a12 = wechatResp.a();
            if (a12 != 1) {
                if (a12 == 2 && (platformActionListener = this.f5584c) != null) {
                    platformActionListener.onError(this.f5582a, 9, th2);
                    return;
                }
                return;
            }
            authorizeListener = this.f5585d;
            if (authorizeListener == null) {
                return;
            }
        }
        authorizeListener.onError(th2);
    }

    public void a(h hVar) {
        this.f5586e = hVar;
    }

    public Platform b() {
        return this.f5582a;
    }

    public PlatformActionListener c() {
        return this.f5584c;
    }
}
