package androidx.work.impl.background.systemjob;

import android.app.Application;
import android.app.job.JobParameters;
import android.app.job.JobService;
import f3.m;
import g3.a;
import g3.c;
import g3.l;
import java.util.HashMap;

/* loaded from: classes.dex */
public class SystemJobService extends JobService implements a {

    /* renamed from: c */
    public static final String f3715c = m.e("SystemJobService");

    /* renamed from: a */
    public l f3716a;

    /* renamed from: b */
    public final HashMap f3717b = new HashMap();

    @Override // g3.a
    public final void c(String str, boolean z10) {
        JobParameters jobParameters;
        m.c().a(f3715c, String.format("%s executed on JobScheduler", str), new Throwable[0]);
        synchronized (this.f3717b) {
            jobParameters = (JobParameters) this.f3717b.remove(str);
        }
        if (jobParameters != null) {
            jobFinished(jobParameters, z10);
        }
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        try {
            l d10 = l.d(getApplicationContext());
            this.f3716a = d10;
            d10.f14898f.a(this);
        } catch (IllegalStateException unused) {
            if (Application.class.equals(getApplication().getClass())) {
                m.c().f(f3715c, "Could not find WorkManager instance; this may be because an auto-backup is in progress. Ignoring JobScheduler commands for now. Please make sure that you are initializing WorkManager if you have manually disabled WorkManagerInitializer.", new Throwable[0]);
                return;
            }
            throw new IllegalStateException("WorkManager needs to be initialized via a ContentProvider#onCreate() or an Application#onCreate().");
        }
    }

    @Override // android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        l lVar = this.f3716a;
        if (lVar != null) {
            c cVar = lVar.f14898f;
            synchronized (cVar.f14872k) {
                cVar.f14871j.remove(this);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:63:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0040  */
    @Override // android.app.job.JobService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean onStartJob(android.app.job.JobParameters r10) {
        /*
            r9 = this;
            g3.l r0 = r9.f3716a
            r1 = 1
            r2 = 0
            if (r0 != 0) goto L17
            f3.m r0 = f3.m.c()
            java.lang.String r3 = androidx.work.impl.background.systemjob.SystemJobService.f3715c
            java.lang.String r4 = "WorkManager is not initialized; requesting retry."
            java.lang.Throwable[] r5 = new java.lang.Throwable[r2]
            r0.a(r3, r4, r5)
            r9.jobFinished(r10, r1)
            return r2
        L17:
            java.lang.String r0 = "EXTRA_WORK_SPEC_ID"
            r3 = 0
            android.os.PersistableBundle r4 = r10.getExtras()     // Catch: java.lang.NullPointerException -> L2b
            if (r4 == 0) goto L2b
            boolean r5 = r4.containsKey(r0)     // Catch: java.lang.NullPointerException -> L2b
            if (r5 == 0) goto L2b
            java.lang.String r0 = r4.getString(r0)     // Catch: java.lang.NullPointerException -> L2b
            goto L2c
        L2b:
            r0 = r3
        L2c:
            boolean r4 = android.text.TextUtils.isEmpty(r0)
            if (r4 == 0) goto L40
            f3.m r10 = f3.m.c()
            java.lang.String r0 = androidx.work.impl.background.systemjob.SystemJobService.f3715c
            java.lang.String r1 = "WorkSpec id not found!"
            java.lang.Throwable[] r3 = new java.lang.Throwable[r2]
            r10.b(r0, r1, r3)
            return r2
        L40:
            java.util.HashMap r4 = r9.f3717b
            monitor-enter(r4)
            java.util.HashMap r5 = r9.f3717b     // Catch: java.lang.Throwable -> Lb5
            boolean r5 = r5.containsKey(r0)     // Catch: java.lang.Throwable -> Lb5
            if (r5 == 0) goto L62
            f3.m r10 = f3.m.c()     // Catch: java.lang.Throwable -> Lb5
            java.lang.String r3 = androidx.work.impl.background.systemjob.SystemJobService.f3715c     // Catch: java.lang.Throwable -> Lb5
            java.lang.String r5 = "Job is already being executed by SystemJobService: %s"
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch: java.lang.Throwable -> Lb5
            r1[r2] = r0     // Catch: java.lang.Throwable -> Lb5
            java.lang.String r0 = java.lang.String.format(r5, r1)     // Catch: java.lang.Throwable -> Lb5
            java.lang.Throwable[] r1 = new java.lang.Throwable[r2]     // Catch: java.lang.Throwable -> Lb5
            r10.a(r3, r0, r1)     // Catch: java.lang.Throwable -> Lb5
            monitor-exit(r4)     // Catch: java.lang.Throwable -> Lb5
            return r2
        L62:
            f3.m r5 = f3.m.c()     // Catch: java.lang.Throwable -> Lb5
            java.lang.String r6 = androidx.work.impl.background.systemjob.SystemJobService.f3715c     // Catch: java.lang.Throwable -> Lb5
            java.lang.String r7 = "onStartJob for %s"
            java.lang.Object[] r8 = new java.lang.Object[r1]     // Catch: java.lang.Throwable -> Lb5
            r8[r2] = r0     // Catch: java.lang.Throwable -> Lb5
            java.lang.String r7 = java.lang.String.format(r7, r8)     // Catch: java.lang.Throwable -> Lb5
            java.lang.Throwable[] r2 = new java.lang.Throwable[r2]     // Catch: java.lang.Throwable -> Lb5
            r5.a(r6, r7, r2)     // Catch: java.lang.Throwable -> Lb5
            java.util.HashMap r2 = r9.f3717b     // Catch: java.lang.Throwable -> Lb5
            r2.put(r0, r10)     // Catch: java.lang.Throwable -> Lb5
            monitor-exit(r4)     // Catch: java.lang.Throwable -> Lb5
            int r2 = android.os.Build.VERSION.SDK_INT
            r4 = 24
            if (r2 < r4) goto Laf
            androidx.work.WorkerParameters$a r3 = new androidx.work.WorkerParameters$a
            r3.<init>()
            android.net.Uri[] r4 = j3.g.a(r10)
            if (r4 == 0) goto L98
            android.net.Uri[] r4 = j3.g.a(r10)
            java.util.List r4 = java.util.Arrays.asList(r4)
            r3.f3636b = r4
        L98:
            java.lang.String[] r4 = j3.h.a(r10)
            if (r4 == 0) goto La8
            java.lang.String[] r4 = j3.h.a(r10)
            java.util.List r4 = java.util.Arrays.asList(r4)
            r3.f3635a = r4
        La8:
            r4 = 28
            if (r2 < r4) goto Laf
            j3.i.a(r10)
        Laf:
            g3.l r10 = r9.f3716a
            r10.h(r0, r3)
            return r1
        Lb5:
            r10 = move-exception
            monitor-exit(r4)     // Catch: java.lang.Throwable -> Lb5
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.work.impl.background.systemjob.SystemJobService.onStartJob(android.app.job.JobParameters):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:57:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x003c  */
    @Override // android.app.job.JobService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean onStopJob(android.app.job.JobParameters r7) {
        /*
            r6 = this;
            g3.l r0 = r6.f3716a
            r1 = 1
            r2 = 0
            if (r0 != 0) goto L14
            f3.m r7 = f3.m.c()
            java.lang.String r0 = androidx.work.impl.background.systemjob.SystemJobService.f3715c
            java.lang.String r3 = "WorkManager is not initialized; requesting retry."
            java.lang.Throwable[] r2 = new java.lang.Throwable[r2]
            r7.a(r0, r3, r2)
            return r1
        L14:
            java.lang.String r0 = "EXTRA_WORK_SPEC_ID"
            android.os.PersistableBundle r7 = r7.getExtras()     // Catch: java.lang.NullPointerException -> L27
            if (r7 == 0) goto L27
            boolean r3 = r7.containsKey(r0)     // Catch: java.lang.NullPointerException -> L27
            if (r3 == 0) goto L27
            java.lang.String r7 = r7.getString(r0)     // Catch: java.lang.NullPointerException -> L27
            goto L28
        L27:
            r7 = 0
        L28:
            boolean r0 = android.text.TextUtils.isEmpty(r7)
            if (r0 == 0) goto L3c
            f3.m r7 = f3.m.c()
            java.lang.String r0 = androidx.work.impl.background.systemjob.SystemJobService.f3715c
            java.lang.String r1 = "WorkSpec id not found!"
            java.lang.Throwable[] r3 = new java.lang.Throwable[r2]
            r7.b(r0, r1, r3)
            return r2
        L3c:
            f3.m r0 = f3.m.c()
            java.lang.String r3 = androidx.work.impl.background.systemjob.SystemJobService.f3715c
            java.lang.String r4 = "onStopJob for %s"
            java.lang.Object[] r5 = new java.lang.Object[r1]
            r5[r2] = r7
            java.lang.String r4 = java.lang.String.format(r4, r5)
            java.lang.Throwable[] r2 = new java.lang.Throwable[r2]
            r0.a(r3, r4, r2)
            java.util.HashMap r0 = r6.f3717b
            monitor-enter(r0)
            java.util.HashMap r2 = r6.f3717b     // Catch: java.lang.Throwable -> L72
            r2.remove(r7)     // Catch: java.lang.Throwable -> L72
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L72
            g3.l r0 = r6.f3716a
            r0.i(r7)
            g3.l r0 = r6.f3716a
            g3.c r0 = r0.f14898f
            java.lang.Object r2 = r0.f14872k
            monitor-enter(r2)
            java.util.HashSet r0 = r0.f14870i     // Catch: java.lang.Throwable -> L6f
            boolean r7 = r0.contains(r7)     // Catch: java.lang.Throwable -> L6f
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L6f
            r7 = r7 ^ r1
            return r7
        L6f:
            r7 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L6f
            throw r7
        L72:
            r7 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L72
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.work.impl.background.systemjob.SystemJobService.onStopJob(android.app.job.JobParameters):boolean");
    }
}
