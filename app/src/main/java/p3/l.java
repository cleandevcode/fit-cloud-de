package p3;

import androidx.work.impl.WorkDatabase;
import f3.s;

/* loaded from: classes.dex */
public final class l implements Runnable {

    /* renamed from: d */
    public static final String f23818d = f3.m.e("StopWorkRunnable");

    /* renamed from: a */
    public final g3.l f23819a;

    /* renamed from: b */
    public final String f23820b;

    /* renamed from: c */
    public final boolean f23821c;

    public l(g3.l lVar, String str, boolean z10) {
        this.f23819a = lVar;
        this.f23820b = str;
        this.f23821c = z10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean containsKey;
        boolean i10;
        g3.l lVar = this.f23819a;
        WorkDatabase workDatabase = lVar.f14895c;
        g3.c cVar = lVar.f14898f;
        o3.q w10 = workDatabase.w();
        workDatabase.c();
        try {
            String str = this.f23820b;
            synchronized (cVar.f14872k) {
                containsKey = cVar.f14867f.containsKey(str);
            }
            if (this.f23821c) {
                i10 = this.f23819a.f14898f.h(this.f23820b);
            } else {
                if (!containsKey) {
                    o3.r rVar = (o3.r) w10;
                    if (rVar.f(this.f23820b) == s.RUNNING) {
                        rVar.o(s.ENQUEUED, this.f23820b);
                    }
                }
                i10 = this.f23819a.f14898f.i(this.f23820b);
            }
            f3.m.c().a(f23818d, String.format("StopWorkRunnable for %s; Processor.stopWork = %s", this.f23820b, Boolean.valueOf(i10)), new Throwable[0]);
            workDatabase.p();
        } finally {
            workDatabase.l();
        }
    }
}
