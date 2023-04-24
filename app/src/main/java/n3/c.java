package n3;

import android.app.Notification;
import android.os.Build;
import androidx.work.impl.foreground.SystemForegroundService;

/* loaded from: classes.dex */
public final class c implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f21935a;

    /* renamed from: b */
    public final /* synthetic */ Notification f21936b;

    /* renamed from: c */
    public final /* synthetic */ int f21937c;

    /* renamed from: d */
    public final /* synthetic */ SystemForegroundService f21938d;

    public c(SystemForegroundService systemForegroundService, int i10, Notification notification, int i11) {
        this.f21938d = systemForegroundService;
        this.f21935a = i10;
        this.f21936b = notification;
        this.f21937c = i11;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (Build.VERSION.SDK_INT >= 29) {
            this.f21938d.startForeground(this.f21935a, this.f21936b, this.f21937c);
        } else {
            this.f21938d.startForeground(this.f21935a, this.f21936b);
        }
    }
}
