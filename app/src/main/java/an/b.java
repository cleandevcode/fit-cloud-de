package an;

import java.util.concurrent.ThreadFactory;

/* loaded from: classes2.dex */
public final class b implements ThreadFactory {

    /* renamed from: a */
    public final /* synthetic */ String f633a;

    /* renamed from: b */
    public final /* synthetic */ boolean f634b;

    public b(String str, boolean z10) {
        this.f633a = str;
        this.f634b = z10;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread thread = new Thread(runnable, this.f633a);
        thread.setDaemon(this.f634b);
        return thread;
    }
}
