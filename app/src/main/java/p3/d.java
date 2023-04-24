package p3;

import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemalarm.RescheduleReceiver;
import f3.p;
import java.util.HashSet;

/* loaded from: classes.dex */
public final class d implements Runnable {

    /* renamed from: c */
    public static final String f23803c = f3.m.e("EnqueueRunnable");

    /* renamed from: a */
    public final g3.f f23804a;

    /* renamed from: b */
    public final g3.b f23805b = new g3.b();

    public d(g3.f fVar) {
        this.f23804a = fVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:376:0x0289, code lost:
        if (r0 != false) goto L89;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:312:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:346:0x0224  */
    /* JADX WARN: Removed duplicated region for block: B:388:0x02d7  */
    /* JADX WARN: Removed duplicated region for block: B:393:0x02fb  */
    /* JADX WARN: Removed duplicated region for block: B:404:0x0341  */
    /* JADX WARN: Removed duplicated region for block: B:411:0x037b  */
    /* JADX WARN: Removed duplicated region for block: B:452:0x03ae A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:460:0x01bf A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r14v16, types: [java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean a(g3.f r27) {
        /*
            Method dump skipped, instructions count: 972
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p3.d.a(g3.f):boolean");
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            g3.f fVar = this.f23804a;
            fVar.getClass();
            if (!g3.f.b(fVar, new HashSet())) {
                WorkDatabase workDatabase = this.f23804a.f14878a.f14895c;
                workDatabase.c();
                boolean a10 = a(this.f23804a);
                workDatabase.p();
                workDatabase.l();
                if (a10) {
                    f.a(this.f23804a.f14878a.f14893a, RescheduleReceiver.class, true);
                    g3.l lVar = this.f23804a.f14878a;
                    g3.e.a(lVar.f14894b, lVar.f14895c, lVar.f14897e);
                }
                this.f23805b.a(f3.p.f14102a);
                return;
            }
            throw new IllegalStateException(String.format("WorkContinuation has cycles (%s)", this.f23804a));
        } catch (Throwable th2) {
            this.f23805b.a(new p.a.C0249a(th2));
        }
    }
}
