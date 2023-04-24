package a0;

import a0.m0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import no.nordicsemi.android.dfu.DfuServiceInitiator;
import p0.c;

/* loaded from: classes.dex */
public final class s0 {
    public static void a(List<m0> list) {
        if (list.isEmpty()) {
            return;
        }
        int i10 = 0;
        do {
            try {
                list.get(i10).e();
                i10++;
            } catch (m0.a e10) {
                for (int i11 = i10 - 1; i11 >= 0; i11--) {
                    list.get(i11).b();
                }
                throw e10;
            }
        } while (i10 < list.size());
    }

    public static c.d b(List list, final Executor executor, final ScheduledExecutorService scheduledExecutorService) {
        final ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(d0.f.f(((m0) it.next()).c()));
        }
        return p0.c.a(new c.InterfaceC0425c() { // from class: a0.p0

            /* renamed from: d  reason: collision with root package name */
            public final /* synthetic */ long f169d = DfuServiceInitiator.DEFAULT_SCAN_TIMEOUT;

            /* renamed from: e  reason: collision with root package name */
            public final /* synthetic */ boolean f170e = false;

            @Override // p0.c.InterfaceC0425c
            public final String g(final c.a aVar) {
                List list2 = arrayList;
                ScheduledExecutorService scheduledExecutorService2 = scheduledExecutorService;
                final Executor executor2 = executor;
                final long j10 = this.f169d;
                boolean z10 = this.f170e;
                final d0.m mVar = new d0.m(new ArrayList(list2), false, o8.b.i());
                ScheduledFuture<?> schedule = scheduledExecutorService2.schedule(new Runnable() { // from class: a0.n0
                    @Override // java.lang.Runnable
                    public final void run() {
                        Executor executor3 = executor2;
                        final na.a aVar2 = mVar;
                        final c.a aVar3 = aVar;
                        final long j11 = j10;
                        executor3.execute(new Runnable() { // from class: a0.o0
                            @Override // java.lang.Runnable
                            public final void run() {
                                na.a aVar4 = na.a.this;
                                c.a aVar5 = aVar3;
                                long j12 = j11;
                                if (!aVar4.isDone()) {
                                    aVar5.b(new TimeoutException(q0.a("Cannot complete surfaceList within ", j12)));
                                    aVar4.cancel(true);
                                }
                            }
                        });
                    }
                }, j10, TimeUnit.MILLISECONDS);
                y.l0 l0Var = new y.l0(mVar, 1);
                p0.d<Void> dVar = aVar.f23755c;
                if (dVar != null) {
                    dVar.a(l0Var, executor2);
                }
                d0.f.a(mVar, new r0(z10, aVar, schedule), executor2);
                return "surfaceList";
            }
        });
    }
}
