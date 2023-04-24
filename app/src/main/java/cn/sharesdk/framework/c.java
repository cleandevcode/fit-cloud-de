package cn.sharesdk.framework;

import cn.sharesdk.framework.utils.SSDKLog;
import com.mob.MobSDK;

/* loaded from: classes.dex */
public class c {

    /* renamed from: b */
    private static volatile c f5210b;

    /* renamed from: a */
    private boolean f5211a = false;

    private c() {
        new Thread() { // from class: cn.sharesdk.framework.c.1
            @Override // java.lang.Thread, java.lang.Runnable
            public void run() {
                try {
                    c.this.f5211a = MobSDK.isForb();
                } catch (Throwable th2) {
                    SSDKLog.b().b(th2);
                }
            }
        }.start();
    }

    public static c a() {
        synchronized (c.class) {
            if (f5210b == null) {
                synchronized (c.class) {
                    if (f5210b == null) {
                        f5210b = new c();
                    }
                }
            }
        }
        return f5210b;
    }
}
