package t4;

import t4.c;

/* loaded from: classes.dex */
public final class b implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ c f27567a;

    public b(c cVar) {
        this.f27567a = cVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        c cVar = this.f27567a;
        cVar.getClass();
        while (true) {
            try {
                cVar.b((c.a) cVar.f27573d.remove());
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
        }
    }
}
