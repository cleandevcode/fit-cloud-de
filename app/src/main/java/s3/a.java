package s3;

import android.content.Context;
import android.text.TextUtils;
import androidx.work.ListenableWorker;
import androidx.work.impl.workers.ConstraintTrackingWorker;
import f3.m;
import g3.l;
import java.util.Collections;
import k3.d;
import o3.p;
import o3.r;
import q3.c;

/* loaded from: classes.dex */
public final class a implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ ConstraintTrackingWorker f26553a;

    public a(ConstraintTrackingWorker constraintTrackingWorker) {
        this.f26553a = constraintTrackingWorker;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str;
        ConstraintTrackingWorker constraintTrackingWorker = this.f26553a;
        Object obj = constraintTrackingWorker.f3619b.f3628b.f3648a.get("androidx.work.impl.workers.ConstraintTrackingWorker.ARGUMENT_CLASS_NAME");
        if (obj instanceof String) {
            str = (String) obj;
        } else {
            str = null;
        }
        if (TextUtils.isEmpty(str)) {
            m.c().b(ConstraintTrackingWorker.f3741k, "No worker to delegate to.", new Throwable[0]);
        } else {
            ListenableWorker b10 = constraintTrackingWorker.f3619b.f3633g.b(constraintTrackingWorker.f3618a, str, constraintTrackingWorker.f3742f);
            constraintTrackingWorker.f3746j = b10;
            if (b10 == null) {
                m.c().a(ConstraintTrackingWorker.f3741k, "No worker to delegate to.", new Throwable[0]);
            } else {
                p h10 = ((r) l.d(constraintTrackingWorker.f3618a).f14895c.w()).h(constraintTrackingWorker.f3619b.f3627a.toString());
                if (h10 != null) {
                    Context context = constraintTrackingWorker.f3618a;
                    d dVar = new d(context, l.d(context).f14896d, constraintTrackingWorker);
                    dVar.b(Collections.singletonList(h10));
                    if (dVar.a(constraintTrackingWorker.f3619b.f3627a.toString())) {
                        m.c().a(ConstraintTrackingWorker.f3741k, String.format("Constraints met for delegate %s", str), new Throwable[0]);
                        try {
                            c d10 = constraintTrackingWorker.f3746j.d();
                            d10.a(new b(constraintTrackingWorker, d10), constraintTrackingWorker.f3619b.f3631e);
                            return;
                        } catch (Throwable th2) {
                            m c10 = m.c();
                            String str2 = ConstraintTrackingWorker.f3741k;
                            c10.a(str2, String.format("Delegated worker %s threw exception in startWork.", str), th2);
                            synchronized (constraintTrackingWorker.f3743g) {
                                if (constraintTrackingWorker.f3744h) {
                                    m.c().a(str2, "Constraints were unmet, Retrying.", new Throwable[0]);
                                    constraintTrackingWorker.f3745i.i(new ListenableWorker.a.b());
                                } else {
                                    constraintTrackingWorker.h();
                                }
                                return;
                            }
                        }
                    }
                    m.c().a(ConstraintTrackingWorker.f3741k, String.format("Constraints not met for delegate %s. Requesting retry.", str), new Throwable[0]);
                    constraintTrackingWorker.f3745i.i(new ListenableWorker.a.b());
                    return;
                }
            }
        }
        constraintTrackingWorker.h();
    }
}
