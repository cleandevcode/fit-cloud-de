package n3;

import androidx.work.impl.foreground.SystemForegroundService;

/* loaded from: classes.dex */
public final class e implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f21942a;

    /* renamed from: b */
    public final /* synthetic */ SystemForegroundService f21943b;

    public e(SystemForegroundService systemForegroundService, int i10) {
        this.f21943b = systemForegroundService;
        this.f21942a = i10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f21943b.f3723e.cancel(this.f21942a);
    }
}
