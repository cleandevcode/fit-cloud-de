package c0;

import c0.b;

/* loaded from: classes.dex */
public final class c implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ b.c.a f4509a;

    public c(b.c.a aVar) {
        this.f4509a = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (b.c.this.f4502a.getAndSet(null) != null) {
            b.c.a aVar = this.f4509a;
            aVar.f4506a.removeCallbacks(b.c.this);
        }
    }
}
