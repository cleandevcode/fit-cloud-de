package n3;

import android.app.Notification;
import androidx.work.impl.foreground.SystemForegroundService;

/* loaded from: classes.dex */
public final class d implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f21939a;

    /* renamed from: b */
    public final /* synthetic */ Notification f21940b;

    /* renamed from: c */
    public final /* synthetic */ SystemForegroundService f21941c;

    public d(SystemForegroundService systemForegroundService, int i10, Notification notification) {
        this.f21941c = systemForegroundService;
        this.f21939a = i10;
        this.f21940b = notification;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f21941c.f3723e.notify(this.f21939a, this.f21940b);
    }
}
