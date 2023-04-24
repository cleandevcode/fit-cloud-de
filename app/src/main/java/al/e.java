package al;

import java.util.concurrent.CountDownLatch;
import tk.r;

/* loaded from: classes2.dex */
public final class e<T> extends CountDownLatch implements r<T>, tk.b, tk.g<T> {

    /* renamed from: a */
    public T f612a;

    /* renamed from: b */
    public Throwable f613b;

    /* renamed from: c */
    public uk.c f614c;

    /* renamed from: d */
    public volatile boolean f615d;

    public e() {
        super(1);
    }

    @Override // tk.r, tk.b, tk.g
    public final void a(uk.c cVar) {
        this.f614c = cVar;
        if (this.f615d) {
            cVar.c();
        }
    }

    @Override // tk.b, tk.g
    public final void onComplete() {
        countDown();
    }

    @Override // tk.r, tk.b, tk.g
    public final void onError(Throwable th2) {
        this.f613b = th2;
        countDown();
    }

    @Override // tk.r, tk.g
    public final void onSuccess(T t10) {
        this.f612a = t10;
        countDown();
    }
}
