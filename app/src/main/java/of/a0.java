package of;

import com.huawei.hms.scankit.C0637e;
import java.lang.Thread;
import p000do.a;

/* loaded from: classes2.dex */
public final class a0 implements Thread.UncaughtExceptionHandler {

    /* renamed from: a */
    public final Thread.UncaughtExceptionHandler f23085a = Thread.getDefaultUncaughtExceptionHandler();

    public a0() {
        Thread.setDefaultUncaughtExceptionHandler(this);
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final void uncaughtException(Thread thread, Throwable th2) {
        gm.l.f(thread, "t");
        gm.l.f(th2, C0637e.f7371a);
        a.b bVar = p000do.a.f13275a;
        bVar.t("Crash");
        bVar.h("\n", new Object[0]);
        bVar.t("Crash");
        bVar.h("--------------------------------------", new Object[0]);
        bVar.t("Crash");
        bVar.h("\n", new Object[0]);
        bVar.t("Crash");
        bVar.e(th2, "thread:%s", thread.toString());
        bVar.t("Crash");
        bVar.h("\n", new Object[0]);
        bVar.t("Crash");
        bVar.h("--------------------------------------", new Object[0]);
        bVar.t("Crash");
        bVar.h("\n", new Object[0]);
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.f23085a;
        if (uncaughtExceptionHandler != null) {
            uncaughtExceptionHandler.uncaughtException(thread, th2);
        }
    }
}
