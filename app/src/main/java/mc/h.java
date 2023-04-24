package mc;

import android.os.DeadObjectException;
import com.polidea.rxandroidble3.internal.RxBleLog;
import fl.g;

/* loaded from: classes.dex */
public final class h implements tk.k<Object> {

    /* renamed from: a */
    public final /* synthetic */ w.d f20429a;

    /* renamed from: b */
    public final /* synthetic */ i f20430b;

    public h(i iVar, w.d dVar) {
        this.f20430b = iVar;
        this.f20429a = dVar;
    }

    @Override // tk.k
    public final void a(g.a aVar) {
        try {
            this.f20430b.a(aVar, this.f20429a);
        } catch (DeadObjectException e10) {
            aVar.f(this.f20430b.c(e10));
            RxBleLog.e(e10, "QueueOperation terminated with a DeadObjectException", new Object[0]);
        } catch (Throwable th2) {
            aVar.f(th2);
            RxBleLog.e(th2, "QueueOperation terminated with an unexpected exception", new Object[0]);
        }
    }
}
