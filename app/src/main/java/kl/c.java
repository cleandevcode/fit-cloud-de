package kl;

import java.util.concurrent.CountDownLatch;

/* loaded from: classes2.dex */
public final class c extends CountDownLatch implements wk.d<Throwable>, wk.a {

    /* renamed from: a */
    public Throwable f18619a;

    public c() {
        super(1);
    }

    @Override // wk.d
    public final void accept(Throwable th2) {
        this.f18619a = th2;
        countDown();
    }

    @Override // wk.a
    public final void run() {
        countDown();
    }
}
