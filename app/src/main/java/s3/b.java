package s3;

import androidx.work.ListenableWorker;
import androidx.work.impl.workers.ConstraintTrackingWorker;

/* loaded from: classes.dex */
public final class b implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ na.a f26554a;

    /* renamed from: b */
    public final /* synthetic */ ConstraintTrackingWorker f26555b;

    public b(ConstraintTrackingWorker constraintTrackingWorker, na.a aVar) {
        this.f26555b = constraintTrackingWorker;
        this.f26554a = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f26555b.f3743g) {
            if (this.f26555b.f3744h) {
                this.f26555b.f3745i.i(new ListenableWorker.a.b());
            } else {
                this.f26555b.f3745i.k(this.f26554a);
            }
        }
    }
}
