package j3;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.os.Build;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemjob.SystemJobService;
import f3.m;
import f3.s;
import g3.l;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import o3.p;
import o3.r;

/* loaded from: classes.dex */
public final class f implements g3.d {

    /* renamed from: e */
    public static final String f17276e = m.e("SystemJobScheduler");

    /* renamed from: a */
    public final Context f17277a;

    /* renamed from: b */
    public final JobScheduler f17278b;

    /* renamed from: c */
    public final l f17279c;

    /* renamed from: d */
    public final e f17280d;

    public f(Context context, l lVar) {
        e eVar = new e(context);
        this.f17277a = context;
        this.f17279c = lVar;
        this.f17278b = (JobScheduler) context.getSystemService("jobscheduler");
        this.f17280d = eVar;
    }

    public static void c(JobScheduler jobScheduler, int i10) {
        try {
            jobScheduler.cancel(i10);
        } catch (Throwable th2) {
            m.c().b(f17276e, String.format(Locale.getDefault(), "Exception while trying to cancel job (%d)", Integer.valueOf(i10)), th2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x0038 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0012 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.util.ArrayList e(android.content.Context r5, android.app.job.JobScheduler r6, java.lang.String r7) {
        /*
            java.util.ArrayList r5 = f(r5, r6)
            r6 = 0
            if (r5 != 0) goto L8
            return r6
        L8:
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = 2
            r0.<init>(r1)
            java.util.Iterator r5 = r5.iterator()
        L12:
            boolean r1 = r5.hasNext()
            if (r1 == 0) goto L44
            java.lang.Object r1 = r5.next()
            android.app.job.JobInfo r1 = (android.app.job.JobInfo) r1
            java.lang.String r2 = "EXTRA_WORK_SPEC_ID"
            android.os.PersistableBundle r3 = r1.getExtras()
            if (r3 == 0) goto L31
            boolean r4 = r3.containsKey(r2)     // Catch: java.lang.NullPointerException -> L31
            if (r4 == 0) goto L31
            java.lang.String r2 = r3.getString(r2)     // Catch: java.lang.NullPointerException -> L31
            goto L32
        L31:
            r2 = r6
        L32:
            boolean r2 = r7.equals(r2)
            if (r2 == 0) goto L12
            int r1 = r1.getId()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0.add(r1)
            goto L12
        L44:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: j3.f.e(android.content.Context, android.app.job.JobScheduler, java.lang.String):java.util.ArrayList");
    }

    public static ArrayList f(Context context, JobScheduler jobScheduler) {
        List<JobInfo> list;
        try {
            list = jobScheduler.getAllPendingJobs();
        } catch (Throwable th2) {
            m.c().b(f17276e, "getAllPendingJobs() is not reliable on this device.", th2);
            list = null;
        }
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(list.size());
        ComponentName componentName = new ComponentName(context, SystemJobService.class);
        for (JobInfo jobInfo : list) {
            if (componentName.equals(jobInfo.getService())) {
                arrayList.add(jobInfo);
            }
        }
        return arrayList;
    }

    @Override // g3.d
    public final void a(p... pVarArr) {
        int i10;
        int i11;
        int i12;
        int i13;
        ArrayList e10;
        int i14;
        int i15;
        int i16;
        WorkDatabase workDatabase = this.f17279c.f14895c;
        int length = pVarArr.length;
        int i17 = 0;
        int i18 = 0;
        while (i18 < length) {
            p pVar = pVarArr[i18];
            workDatabase.c();
            try {
                p h10 = ((r) workDatabase.w()).h(pVar.f22625a);
                if (h10 == null) {
                    m c10 = m.c();
                    String str = f17276e;
                    c10.f(str, "Skipping scheduling " + pVar.f22625a + " because it's no longer in the DB", new Throwable[i17]);
                } else if (h10.f22626b != s.ENQUEUED) {
                    m c11 = m.c();
                    String str2 = f17276e;
                    c11.f(str2, "Skipping scheduling " + pVar.f22625a + " because it is no longer enqueued", new Throwable[i17]);
                } else {
                    o3.g a10 = ((o3.i) workDatabase.t()).a(pVar.f22625a);
                    if (a10 != null) {
                        i13 = a10.f22613b;
                        i12 = i18;
                    } else {
                        this.f17279c.f14894b.getClass();
                        int i19 = this.f17279c.f14894b.f3643g;
                        synchronized (p3.e.class) {
                            workDatabase.c();
                            try {
                                Long a11 = ((o3.f) workDatabase.s()).a("next_job_scheduler_id");
                                if (a11 != null) {
                                    i10 = a11.intValue();
                                } else {
                                    i10 = 0;
                                }
                                if (i10 == Integer.MAX_VALUE) {
                                    i11 = 0;
                                } else {
                                    i11 = i10 + 1;
                                }
                                i12 = i18;
                                ((o3.f) workDatabase.s()).b(new o3.d(i11, "next_job_scheduler_id"));
                                workDatabase.p();
                                workDatabase.l();
                                if (i10 >= 0 && i10 <= i19) {
                                    i13 = i10;
                                }
                                ((o3.f) workDatabase.s()).b(new o3.d(1, "next_job_scheduler_id"));
                                i13 = 0;
                            } finally {
                                workDatabase.l();
                            }
                        }
                    }
                    if (a10 == null) {
                        ((o3.i) this.f17279c.f14895c.t()).b(new o3.g(pVar.f22625a, i13));
                    }
                    g(pVar, i13);
                    if (Build.VERSION.SDK_INT == 23 && (e10 = e(this.f17277a, this.f17278b, pVar.f22625a)) != null) {
                        int indexOf = e10.indexOf(Integer.valueOf(i13));
                        if (indexOf >= 0) {
                            e10.remove(indexOf);
                        }
                        if (!e10.isEmpty()) {
                            i16 = ((Integer) e10.get(0)).intValue();
                        } else {
                            this.f17279c.f14894b.getClass();
                            int i20 = this.f17279c.f14894b.f3643g;
                            synchronized (p3.e.class) {
                                workDatabase.c();
                                Long a12 = ((o3.f) workDatabase.s()).a("next_job_scheduler_id");
                                if (a12 != null) {
                                    i14 = a12.intValue();
                                } else {
                                    i14 = 0;
                                }
                                if (i14 == Integer.MAX_VALUE) {
                                    i15 = 0;
                                } else {
                                    i15 = i14 + 1;
                                }
                                ((o3.f) workDatabase.s()).b(new o3.d(i15, "next_job_scheduler_id"));
                                workDatabase.p();
                                if (i14 >= 0 && i14 <= i20) {
                                    i16 = i14;
                                }
                                ((o3.f) workDatabase.s()).b(new o3.d(1, "next_job_scheduler_id"));
                                i16 = 0;
                            }
                        }
                        g(pVar, i16);
                        workDatabase.p();
                        workDatabase.l();
                        i18 = i12 + 1;
                        i17 = 0;
                    }
                    workDatabase.p();
                    workDatabase.l();
                    i18 = i12 + 1;
                    i17 = 0;
                }
                i12 = i18;
                workDatabase.p();
                workDatabase.l();
                i18 = i12 + 1;
                i17 = 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // g3.d
    public final boolean b() {
        return true;
    }

    @Override // g3.d
    public final void d(String str) {
        ArrayList e10 = e(this.f17277a, this.f17278b, str);
        if (e10 != null && !e10.isEmpty()) {
            Iterator it = e10.iterator();
            while (it.hasNext()) {
                c(this.f17278b, ((Integer) it.next()).intValue());
            }
            ((o3.i) this.f17279c.f14895c.t()).c(str);
        }
    }

    public final void g(p pVar, int i10) {
        int i11;
        int i12;
        JobInfo a10 = this.f17280d.a(pVar, i10);
        m c10 = m.c();
        String str = f17276e;
        c10.a(str, String.format("Scheduling work ID %s Job ID %s", pVar.f22625a, Integer.valueOf(i10)), new Throwable[0]);
        try {
            if (this.f17278b.schedule(a10) == 0) {
                m.c().f(str, String.format("Unable to schedule work ID %s", pVar.f22625a), new Throwable[0]);
                if (pVar.f22641q && pVar.f22642r == 1) {
                    pVar.f22641q = false;
                    m.c().a(str, String.format("Scheduling a non-expedited job (work ID %s)", pVar.f22625a), new Throwable[0]);
                    g(pVar, i10);
                }
            }
        } catch (IllegalStateException e10) {
            ArrayList f10 = f(this.f17277a, this.f17278b);
            if (f10 != null) {
                i11 = f10.size();
            } else {
                i11 = 0;
            }
            Locale locale = Locale.getDefault();
            Object[] objArr = new Object[3];
            objArr[0] = Integer.valueOf(i11);
            objArr[1] = Integer.valueOf(((r) this.f17279c.f14895c.w()).e().size());
            androidx.work.a aVar = this.f17279c.f14894b;
            if (Build.VERSION.SDK_INT == 23) {
                i12 = aVar.f3644h / 2;
            } else {
                i12 = aVar.f3644h;
            }
            objArr[2] = Integer.valueOf(i12);
            String format = String.format(locale, "JobScheduler 100 job limit exceeded.  We count %d WorkManager jobs in JobScheduler; we have %d tracked jobs in our DB; our Configuration limit is %d.", objArr);
            m.c().b(f17276e, format, new Throwable[0]);
            throw new IllegalStateException(format, e10);
        } catch (Throwable th2) {
            m.c().b(f17276e, String.format("Unable to schedule %s", pVar), th2);
        }
    }
}
