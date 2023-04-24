package al;

import java.util.concurrent.CountDownLatch;
import tk.n;

/* loaded from: classes2.dex */
public final class d<T> extends CountDownLatch implements n<Object>, uk.c {

    /* renamed from: a */
    public Object f608a;

    /* renamed from: b */
    public Throwable f609b;

    /* renamed from: c */
    public uk.c f610c;

    /* renamed from: d */
    public volatile boolean f611d;

    public d() {
        super(1);
    }

    @Override // tk.n
    public final void a(uk.c cVar) {
        this.f610c = cVar;
        if (this.f611d) {
            cVar.c();
        }
    }

    @Override // tk.n
    public final void b(T t10) {
        if (this.f608a == null) {
            this.f608a = t10;
            this.f610c.c();
            countDown();
        }
    }

    @Override // uk.c
    public final void c() {
        this.f611d = true;
        uk.c cVar = this.f610c;
        if (cVar != null) {
            cVar.c();
        }
    }

    @Override // tk.n
    public final void onComplete() {
        countDown();
    }

    @Override // tk.n
    public final void onError(Throwable th2) {
        if (this.f608a == null) {
            this.f609b = th2;
        }
        countDown();
    }
}
