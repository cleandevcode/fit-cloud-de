package f3;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public final class b implements ThreadFactory {

    /* renamed from: a */
    public final AtomicInteger f14063a = new AtomicInteger(0);

    /* renamed from: b */
    public final /* synthetic */ boolean f14064b;

    public b(boolean z10) {
        this.f14064b = z10;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        String str;
        if (this.f14064b) {
            str = "WM.task-";
        } else {
            str = "androidx.work-";
        }
        StringBuilder a10 = android.support.v4.media.d.a(str);
        a10.append(this.f14063a.incrementAndGet());
        return new Thread(runnable, a10.toString());
    }
}
