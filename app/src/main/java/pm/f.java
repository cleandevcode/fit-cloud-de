package pm;

import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;

/* loaded from: classes2.dex */
public final class f extends g {

    /* renamed from: a */
    public final Future<?> f24338a;

    public f(ScheduledFuture scheduledFuture) {
        this.f24338a = scheduledFuture;
    }

    @Override // pm.h
    public final void a(Throwable th2) {
        if (th2 != null) {
            this.f24338a.cancel(false);
        }
    }

    @Override // fm.l
    public final /* bridge */ /* synthetic */ tl.l k(Throwable th2) {
        a(th2);
        return tl.l.f28297a;
    }

    public final String toString() {
        StringBuilder a10 = android.support.v4.media.d.a("CancelFutureOnCancel[");
        a10.append(this.f24338a);
        a10.append(']');
        return a10.toString();
    }
}
