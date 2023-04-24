package pm;

import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;

/* loaded from: classes2.dex */
public final class p0 implements q0 {

    /* renamed from: a */
    public final Future<?> f24384a;

    public p0(ScheduledFuture scheduledFuture) {
        this.f24384a = scheduledFuture;
    }

    @Override // pm.q0
    public final void c() {
        this.f24384a.cancel(false);
    }

    public final String toString() {
        StringBuilder a10 = android.support.v4.media.d.a("DisposableFutureHandle[");
        a10.append(this.f24384a);
        a10.append(']');
        return a10.toString();
    }
}
