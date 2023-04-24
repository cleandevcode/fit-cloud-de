package androidx.work;

import android.annotation.SuppressLint;
import android.content.Context;
import androidx.annotation.Keep;
import androidx.work.ListenableWorker;

/* loaded from: classes.dex */
public abstract class Worker extends ListenableWorker {

    /* renamed from: f */
    public q3.c<ListenableWorker.a> f3626f;

    @Keep
    @SuppressLint({"BanKeepAnnotation"})
    public Worker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
    }

    @Override // androidx.work.ListenableWorker
    public final q3.c d() {
        this.f3626f = new q3.c<>();
        this.f3619b.f3631e.execute(new c(this));
        return this.f3626f;
    }

    public abstract ListenableWorker.a.c h();
}
