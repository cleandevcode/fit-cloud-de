package jh;

import cn.sharesdk.framework.Platform;

/* loaded from: classes2.dex */
public final class o extends Exception {

    /* renamed from: a */
    public final Platform f17814a;

    /* renamed from: b */
    public final int f17815b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(Platform platform, int i10, Throwable th2) {
        super(th2);
        gm.l.f(platform, "platform");
        this.f17814a = platform;
        this.f17815b = i10;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        StringBuilder a10 = android.support.v4.media.d.a("Platform ");
        a10.append(this.f17814a.getName());
        a10.append(" auth error:");
        a10.append(this.f17815b);
        return a10.toString();
    }
}
