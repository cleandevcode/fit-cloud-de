package g3;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.os.Build;
import androidx.work.R;
import androidx.work.WorkerParameters;
import androidx.work.a;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.a;
import androidx.work.impl.background.systemalarm.SystemAlarmService;
import androidx.work.impl.background.systemjob.SystemJobService;
import androidx.work.impl.utils.ForceStopRunnable;
import f3.m;
import f3.p;
import f3.r;
import f3.t;
import f3.u;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import m2.t;

/* loaded from: classes.dex */
public final class l extends t {

    /* renamed from: j */
    public static l f14890j;

    /* renamed from: k */
    public static l f14891k;

    /* renamed from: l */
    public static final Object f14892l;

    /* renamed from: a */
    public Context f14893a;

    /* renamed from: b */
    public androidx.work.a f14894b;

    /* renamed from: c */
    public WorkDatabase f14895c;

    /* renamed from: d */
    public r3.a f14896d;

    /* renamed from: e */
    public List<d> f14897e;

    /* renamed from: f */
    public c f14898f;

    /* renamed from: g */
    public p3.g f14899g;

    /* renamed from: h */
    public boolean f14900h;

    /* renamed from: i */
    public BroadcastReceiver.PendingResult f14901i;

    static {
        f3.m.e("WorkManagerImpl");
        f14890j = null;
        f14891k = null;
        f14892l = new Object();
    }

    public l(Context context, androidx.work.a aVar, r3.b bVar) {
        t.a aVar2;
        d dVar;
        boolean isDeviceProtectedStorage;
        boolean z10 = context.getResources().getBoolean(R.bool.workmanager_test_configuration);
        Context applicationContext = context.getApplicationContext();
        p3.j jVar = bVar.f25195a;
        int i10 = WorkDatabase.f3652n;
        d dVar2 = null;
        if (z10) {
            gm.l.f(applicationContext, "context");
            aVar2 = new t.a(applicationContext, WorkDatabase.class, null);
            aVar2.f20282j = true;
        } else {
            String str = i.f14888a;
            gm.l.f(applicationContext, "context");
            if (!om.h.W("androidx.work.workdb")) {
                t.a aVar3 = new t.a(applicationContext, WorkDatabase.class, "androidx.work.workdb");
                aVar3.f20281i = new g(applicationContext);
                aVar2 = aVar3;
            } else {
                throw new IllegalArgumentException("Cannot build a database with null or empty name. If you are trying to create an in memory database, use Room.inMemoryDatabaseBuilder".toString());
            }
        }
        gm.l.f(jVar, "executor");
        aVar2.f20279g = jVar;
        aVar2.f20276d.add(new h());
        aVar2.a(androidx.work.impl.a.f3662a);
        aVar2.a(new a.h(applicationContext, 2, 3));
        aVar2.a(androidx.work.impl.a.f3663b);
        aVar2.a(androidx.work.impl.a.f3664c);
        aVar2.a(new a.h(applicationContext, 5, 6));
        aVar2.a(androidx.work.impl.a.f3665d);
        aVar2.a(androidx.work.impl.a.f3666e);
        aVar2.a(androidx.work.impl.a.f3667f);
        aVar2.a(new a.i(applicationContext));
        aVar2.a(new a.h(applicationContext, 10, 11));
        aVar2.a(androidx.work.impl.a.f3668g);
        aVar2.f20284l = false;
        aVar2.f20285m = true;
        WorkDatabase workDatabase = (WorkDatabase) aVar2.b();
        Context applicationContext2 = context.getApplicationContext();
        m.a aVar4 = new m.a(aVar.f3642f);
        synchronized (f3.m.class) {
            f3.m.f14093a = aVar4;
        }
        d[] dVarArr = new d[2];
        String str2 = e.f14876a;
        if (Build.VERSION.SDK_INT >= 23) {
            dVar = new j3.f(applicationContext2, this);
            p3.f.a(applicationContext2, SystemJobService.class, true);
            f3.m.c().a(e.f14876a, "Created SystemJobScheduler and enabled SystemJobService", new Throwable[0]);
        } else {
            try {
                d dVar3 = (d) Class.forName("androidx.work.impl.background.gcm.GcmScheduler").getConstructor(Context.class).newInstance(applicationContext2);
                f3.m.c().a(e.f14876a, String.format("Created %s", "androidx.work.impl.background.gcm.GcmScheduler"), new Throwable[0]);
                dVar2 = dVar3;
            } catch (Throwable th2) {
                f3.m.c().a(e.f14876a, "Unable to create GCM Scheduler", th2);
            }
            if (dVar2 == null) {
                dVar = new i3.b(applicationContext2);
                p3.f.a(applicationContext2, SystemAlarmService.class, true);
                f3.m.c().a(e.f14876a, "Created SystemAlarmScheduler", new Throwable[0]);
            } else {
                dVar = dVar2;
            }
        }
        dVarArr[0] = dVar;
        dVarArr[1] = new h3.c(applicationContext2, aVar, bVar, this);
        List<d> asList = Arrays.asList(dVarArr);
        c cVar = new c(context, aVar, bVar, workDatabase, asList);
        Context applicationContext3 = context.getApplicationContext();
        this.f14893a = applicationContext3;
        this.f14894b = aVar;
        this.f14896d = bVar;
        this.f14895c = workDatabase;
        this.f14897e = asList;
        this.f14898f = cVar;
        this.f14899g = new p3.g(workDatabase);
        this.f14900h = false;
        if (Build.VERSION.SDK_INT >= 24) {
            isDeviceProtectedStorage = applicationContext3.isDeviceProtectedStorage();
            if (isDeviceProtectedStorage) {
                throw new IllegalStateException("Cannot initialize WorkManager in direct boot mode");
            }
        }
        ((r3.b) this.f14896d).a(new ForceStopRunnable(applicationContext3, this));
    }

    public static l d(Context context) {
        l lVar;
        Object obj = f14892l;
        synchronized (obj) {
            synchronized (obj) {
                lVar = f14890j;
                if (lVar == null) {
                    lVar = f14891k;
                }
            }
            return lVar;
        }
        if (lVar == null) {
            Context applicationContext = context.getApplicationContext();
            if (applicationContext instanceof a.b) {
                e(applicationContext, ((a.b) applicationContext).a());
                lVar = d(applicationContext);
            } else {
                throw new IllegalStateException("WorkManager is not initialized properly.  You have explicitly disabled WorkManagerInitializer in your manifest, have not manually called WorkManager#initialize at this point, and your Application does not implement Configuration.Provider.");
            }
        }
        return lVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x0016, code lost:
        r4 = r4.getApplicationContext();
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x001c, code lost:
        if (g3.l.f14891k != null) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x001e, code lost:
        g3.l.f14891k = new g3.l(r4, r5, new r3.b(r5.f3638b));
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x002c, code lost:
        g3.l.f14890j = g3.l.f14891k;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void e(android.content.Context r4, androidx.work.a r5) {
        /*
            java.lang.Object r0 = g3.l.f14892l
            monitor-enter(r0)
            g3.l r1 = g3.l.f14890j     // Catch: java.lang.Throwable -> L32
            if (r1 == 0) goto L14
            g3.l r2 = g3.l.f14891k     // Catch: java.lang.Throwable -> L32
            if (r2 != 0) goto Lc
            goto L14
        Lc:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L32
            java.lang.String r5 = "WorkManager is already initialized.  Did you try to initialize it manually without disabling WorkManagerInitializer? See WorkManager#initialize(Context, Configuration) or the class level Javadoc for more information."
            r4.<init>(r5)     // Catch: java.lang.Throwable -> L32
            throw r4     // Catch: java.lang.Throwable -> L32
        L14:
            if (r1 != 0) goto L30
            android.content.Context r4 = r4.getApplicationContext()     // Catch: java.lang.Throwable -> L32
            g3.l r1 = g3.l.f14891k     // Catch: java.lang.Throwable -> L32
            if (r1 != 0) goto L2c
            g3.l r1 = new g3.l     // Catch: java.lang.Throwable -> L32
            r3.b r2 = new r3.b     // Catch: java.lang.Throwable -> L32
            java.util.concurrent.ExecutorService r3 = r5.f3638b     // Catch: java.lang.Throwable -> L32
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L32
            r1.<init>(r4, r5, r2)     // Catch: java.lang.Throwable -> L32
            g3.l.f14891k = r1     // Catch: java.lang.Throwable -> L32
        L2c:
            g3.l r4 = g3.l.f14891k     // Catch: java.lang.Throwable -> L32
            g3.l.f14890j = r4     // Catch: java.lang.Throwable -> L32
        L30:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L32
            return
        L32:
            r4 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L32
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: g3.l.e(android.content.Context, androidx.work.a):void");
    }

    public final p a(List<? extends u> list) {
        if (!list.isEmpty()) {
            return new f(this, null, f3.f.KEEP, list, 0).a();
        }
        throw new IllegalArgumentException("enqueue needs at least one WorkRequest.");
    }

    public final p b(String str, r rVar) {
        return new f(this, str, f3.f.KEEP, Collections.singletonList(rVar)).a();
    }

    public final p c(List list) {
        return new f(this, "WeatherOnce", f3.f.REPLACE, list).a();
    }

    public final void f() {
        synchronized (f14892l) {
            this.f14900h = true;
            BroadcastReceiver.PendingResult pendingResult = this.f14901i;
            if (pendingResult != null) {
                pendingResult.finish();
                this.f14901i = null;
            }
        }
    }

    public final void g() {
        ArrayList f10;
        if (Build.VERSION.SDK_INT >= 23) {
            Context context = this.f14893a;
            String str = j3.f.f17276e;
            JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
            if (jobScheduler != null && (f10 = j3.f.f(context, jobScheduler)) != null && !f10.isEmpty()) {
                Iterator it = f10.iterator();
                while (it.hasNext()) {
                    j3.f.c(jobScheduler, ((JobInfo) it.next()).getId());
                }
            }
        }
        o3.r rVar = (o3.r) this.f14895c.w();
        rVar.f22645a.b();
        r2.f a10 = rVar.f22653i.a();
        rVar.f22645a.c();
        try {
            a10.r();
            rVar.f22645a.p();
            rVar.f22645a.l();
            rVar.f22653i.c(a10);
            e.a(this.f14894b, this.f14895c, this.f14897e);
        } catch (Throwable th2) {
            rVar.f22645a.l();
            rVar.f22653i.c(a10);
            throw th2;
        }
    }

    public final void h(String str, WorkerParameters.a aVar) {
        ((r3.b) this.f14896d).a(new p3.k(this, str, aVar));
    }

    public final void i(String str) {
        ((r3.b) this.f14896d).a(new p3.l(this, str, false));
    }
}
