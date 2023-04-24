package jh;

import android.content.Context;
import cn.sharesdk.framework.Platform;
import cn.sharesdk.framework.ShareSDK;
import com.mob.MobSDK;
import eh.j;

/* loaded from: classes2.dex */
public final class q extends dh.b<String, j.a> {

    /* renamed from: b */
    public final Context f17818b;

    public q(Context context, wm.c cVar) {
        super(cVar);
        this.f17818b = context;
    }

    @Override // dh.b
    public final Object a(String str, xl.d<? super j.a> dVar) {
        String str2 = str;
        Context context = this.f17818b;
        gm.l.f(context, "context");
        if (!a.f.f7a) {
            MobSDK.init(context);
            MobSDK.submitPolicyGrantResult(true, null);
            a.f.f7a = true;
        }
        Platform platform = ShareSDK.getPlatform(str2);
        if (platform != null && platform.isClientValid) {
            if (platform.isAuthValid()) {
                platform.removeAccount(true);
            }
            pm.j jVar = new pm.j(1, mf.a0.i(dVar));
            jVar.u();
            platform.setPlatformActionListener(new p(jVar, this));
            platform.SSOSetting(false);
            platform.showUser(null);
            return jVar.t();
        }
        throw new r(str2);
    }
}
