package jh;

import cn.sharesdk.facebook.Facebook;
import cn.sharesdk.framework.Platform;
import cn.sharesdk.framework.PlatformActionListener;
import cn.sharesdk.sina.weibo.SinaWeibo;
import cn.sharesdk.tencent.qq.QQ;
import cn.sharesdk.wechat.friends.Wechat;
import eh.j;
import java.util.Arrays;
import java.util.HashMap;
import p000do.a;

/* loaded from: classes2.dex */
public final class p implements PlatformActionListener {

    /* renamed from: a */
    public final /* synthetic */ pm.i<j.a> f17816a;

    /* renamed from: b */
    public final /* synthetic */ q f17817b;

    public p(pm.j jVar, q qVar) {
        this.f17816a = jVar;
        this.f17817b = qVar;
    }

    @Override // cn.sharesdk.framework.PlatformActionListener
    public final void onCancel(Platform platform, int i10) {
        gm.l.f(platform, "platform");
        platform.removeAccount(true);
        this.f17816a.l(mf.a0.f(new n(platform)));
    }

    @Override // cn.sharesdk.framework.PlatformActionListener
    public final void onComplete(Platform platform, int i10, HashMap<String, Object> hashMap) {
        String format;
        String str;
        gm.l.f(platform, "platform");
        gm.l.f(hashMap, "hashMap");
        if (i10 == 8) {
            pm.i<j.a> iVar = this.f17816a;
            this.f17817b.getClass();
            String userId = platform.getDb().getUserId();
            gm.l.e(userId, "platform.db.userId");
            String name = platform.getName();
            gm.l.e(name, "platform.name");
            String userName = platform.getDb().getUserName();
            gm.l.e(userName, "platform.db.userName");
            j.a aVar = new j.a(userId, name, userName);
            String name2 = platform.getName();
            try {
            } catch (Exception e10) {
                a.b bVar = p000do.a.f13275a;
                bVar.t(q.class.getSimpleName());
                bVar.q(e10);
            }
            if (gm.l.a(name2, QQ.NAME)) {
                gm.l.a("男", (String) hashMap.get("gender"));
                str = "figureurl_qq_2";
            } else if (gm.l.a(name2, SinaWeibo.NAME)) {
                gm.l.a("m", (String) hashMap.get("gender"));
                str = "avatar_hd";
            } else if (gm.l.a(name2, Wechat.NAME)) {
                Object obj = hashMap.get("sex");
                gm.l.d(obj, "null cannot be cast to non-null type kotlin.Int");
                ((Integer) obj).intValue();
                str = "headimgurl";
            } else {
                if (gm.l.a(name2, Facebook.NAME)) {
                    gm.l.a("male", (String) hashMap.get("gender"));
                    format = String.format("http://graph.facebook.com/%s/picture?type=large", Arrays.copyOf(new Object[]{(String) hashMap.get("id")}, 1));
                    gm.l.e(format, "format(format, *args)");
                    aVar.f13669d = format;
                }
                iVar.l(aVar);
                return;
            }
            format = (String) hashMap.get(str);
            aVar.f13669d = format;
            iVar.l(aVar);
            return;
        }
        platform.removeAccount(true);
        this.f17816a.l(mf.a0.f(new o(platform, Integer.MIN_VALUE, null)));
    }

    @Override // cn.sharesdk.framework.PlatformActionListener
    public final void onError(Platform platform, int i10, Throwable th2) {
        gm.l.f(platform, "platform");
        gm.l.f(th2, "throwable");
        platform.removeAccount(true);
        this.f17816a.l(mf.a0.f(new o(platform, i10, th2)));
    }
}
