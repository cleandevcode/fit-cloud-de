package il;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes2.dex */
public final class i extends AtomicLong implements ThreadFactory {

    /* renamed from: a */
    public final String f17174a;

    /* renamed from: b */
    public final int f17175b;

    /* renamed from: c */
    public final boolean f17176c;

    /* loaded from: classes2.dex */
    public static final class a extends Thread {
        public a(Runnable runnable, String str) {
            super(runnable, str);
        }
    }

    public i(String str) {
        this(false, str, 5);
    }

    public i(boolean z10, String str, int i10) {
        this.f17174a = str;
        this.f17175b = i10;
        this.f17176c = z10;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        String str = this.f17174a + '-' + incrementAndGet();
        Thread aVar = this.f17176c ? new a(runnable, str) : new Thread(runnable, str);
        aVar.setPriority(this.f17175b);
        aVar.setDaemon(true);
        return aVar;
    }

    @Override // java.util.concurrent.atomic.AtomicLong
    public final String toString() {
        return androidx.activity.e.b(android.support.v4.media.d.a("RxThreadFactory["), this.f17174a, "]");
    }
}
