package androidx.work.impl.workers;

import android.content.Context;
import androidx.work.ListenableWorker;
import androidx.work.WorkerParameters;
import f3.m;
import java.util.ArrayList;
import java.util.List;
import k3.c;
import s3.a;

/* loaded from: classes.dex */
public class ConstraintTrackingWorker extends ListenableWorker implements c {

    /* renamed from: k */
    public static final String f3741k = m.e("ConstraintTrkngWrkr");

    /* renamed from: f */
    public WorkerParameters f3742f;

    /* renamed from: g */
    public final Object f3743g;

    /* renamed from: h */
    public volatile boolean f3744h;

    /* renamed from: i */
    public q3.c<ListenableWorker.a> f3745i;

    /* renamed from: j */
    public ListenableWorker f3746j;

    public ConstraintTrackingWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        this.f3742f = workerParameters;
        this.f3743g = new Object();
        this.f3744h = false;
        this.f3745i = new q3.c<>();
    }

    @Override // androidx.work.ListenableWorker
    public final boolean b() {
        ListenableWorker listenableWorker = this.f3746j;
        return listenableWorker != null && listenableWorker.b();
    }

    @Override // androidx.work.ListenableWorker
    public final void c() {
        ListenableWorker listenableWorker = this.f3746j;
        if (listenableWorker != null && !listenableWorker.f3620c) {
            this.f3746j.g();
        }
    }

    @Override // androidx.work.ListenableWorker
    public final q3.c d() {
        this.f3619b.f3631e.execute(new a(this));
        return this.f3745i;
    }

    @Override // k3.c
    public final void e(ArrayList arrayList) {
        m.c().a(f3741k, String.format("Constraints changed for %s", arrayList), new Throwable[0]);
        synchronized (this.f3743g) {
            this.f3744h = true;
        }
    }

    @Override // k3.c
    public final void f(List<String> list) {
    }

    public final void h() {
        this.f3745i.i(new ListenableWorker.a.C0036a());
    }
}
