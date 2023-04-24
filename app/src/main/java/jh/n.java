package jh;

import cn.sharesdk.framework.Platform;

/* loaded from: classes2.dex */
public final class n extends Exception {

    /* renamed from: a */
    public final Platform f17813a;

    public n(Platform platform) {
        gm.l.f(platform, "platform");
        this.f17813a = platform;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        StringBuilder a10 = android.support.v4.media.d.a("Platform ");
        a10.append(this.f17813a.getName());
        a10.append(" auth cancel");
        return a10.toString();
    }
}
