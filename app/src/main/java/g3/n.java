package g3;

import android.annotation.SuppressLint;
import androidx.work.ListenableWorker;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;

/* loaded from: classes.dex */
public final class n implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ q3.c f14905a;

    /* renamed from: b */
    public final /* synthetic */ String f14906b;

    /* renamed from: c */
    public final /* synthetic */ o f14907c;

    public n(o oVar, q3.c cVar, String str) {
        this.f14907c = oVar;
        this.f14905a = cVar;
        this.f14906b = str;
    }

    @Override // java.lang.Runnable
    @SuppressLint({"SyntheticAccessor"})
    public final void run() {
        try {
            try {
                ListenableWorker.a aVar = (ListenableWorker.a) this.f14905a.get();
                if (aVar == null) {
                    f3.m.c().b(o.f14908s, String.format("%s returned a null result. Treating it as a failure.", this.f14907c.f14912d.f22627c), new Throwable[0]);
                } else {
                    f3.m.c().a(o.f14908s, String.format("%s returned a %s result.", this.f14907c.f14912d.f22627c, aVar), new Throwable[0]);
                    this.f14907c.f14915g = aVar;
                }
            } catch (InterruptedException e10) {
                e = e10;
                f3.m.c().b(o.f14908s, String.format("%s failed because it threw an exception/error", this.f14906b), e);
            } catch (CancellationException e11) {
                f3.m.c().d(o.f14908s, String.format("%s was cancelled", this.f14906b), e11);
            } catch (ExecutionException e12) {
                e = e12;
                f3.m.c().b(o.f14908s, String.format("%s failed because it threw an exception/error", this.f14906b), e);
            }
        } finally {
            this.f14907c.c();
        }
    }
}
