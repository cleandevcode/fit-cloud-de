package nb;

import java.util.concurrent.Callable;
import x2.i;

/* loaded from: classes.dex */
public final class c implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ i f22218a;

    /* renamed from: b */
    public final /* synthetic */ Callable f22219b;

    public c(i iVar, Callable callable) {
        this.f22218a = iVar;
        this.f22219b = callable;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, TResult] */
    @Override // java.lang.Runnable
    public final void run() {
        try {
            i iVar = this.f22218a;
            ?? call = this.f22219b.call();
            b bVar = (b) iVar.f30183b;
            synchronized (bVar.f22214a) {
                if (!bVar.f22215b) {
                    bVar.f22215b = true;
                    bVar.f22216c = call;
                    bVar.f22214a.notifyAll();
                    bVar.a();
                }
            }
        } catch (Exception unused) {
            this.f22218a.g();
        }
    }
}
