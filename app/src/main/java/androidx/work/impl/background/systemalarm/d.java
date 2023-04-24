package androidx.work.impl.background.systemalarm;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.os.PowerManager;
import android.text.TextUtils;
import f3.m;
import g3.l;
import java.util.ArrayList;
import java.util.Iterator;
import p3.j;
import p3.r;

/* loaded from: classes.dex */
public final class d implements g3.a {

    /* renamed from: k */
    public static final String f3699k = m.e("SystemAlarmDispatcher");

    /* renamed from: a */
    public final Context f3700a;

    /* renamed from: b */
    public final r3.a f3701b;

    /* renamed from: c */
    public final r f3702c;

    /* renamed from: d */
    public final g3.c f3703d;

    /* renamed from: e */
    public final l f3704e;

    /* renamed from: f */
    public final androidx.work.impl.background.systemalarm.a f3705f;

    /* renamed from: g */
    public final Handler f3706g;

    /* renamed from: h */
    public final ArrayList f3707h;

    /* renamed from: i */
    public Intent f3708i;

    /* renamed from: j */
    public c f3709j;

    /* loaded from: classes.dex */
    public class a implements Runnable {
        public a() {
            d.this = r1;
        }

        @Override // java.lang.Runnable
        public final void run() {
            d dVar;
            RunnableC0039d runnableC0039d;
            synchronized (d.this.f3707h) {
                d dVar2 = d.this;
                dVar2.f3708i = (Intent) dVar2.f3707h.get(0);
            }
            Intent intent = d.this.f3708i;
            if (intent != null) {
                String action = intent.getAction();
                int intExtra = d.this.f3708i.getIntExtra("KEY_START_ID", 0);
                m c10 = m.c();
                String str = d.f3699k;
                c10.a(str, String.format("Processing command %s, %s", d.this.f3708i, Integer.valueOf(intExtra)), new Throwable[0]);
                PowerManager.WakeLock a10 = p3.m.a(d.this.f3700a, String.format("%s (%s)", action, Integer.valueOf(intExtra)));
                try {
                    m.c().a(str, String.format("Acquiring operation wake lock (%s) %s", action, a10), new Throwable[0]);
                    a10.acquire();
                    d dVar3 = d.this;
                    dVar3.f3705f.d(intExtra, dVar3.f3708i, dVar3);
                    m.c().a(str, String.format("Releasing operation wake lock (%s) %s", action, a10), new Throwable[0]);
                    a10.release();
                    dVar = d.this;
                    runnableC0039d = new RunnableC0039d(dVar);
                } catch (Throwable th2) {
                    try {
                        m c11 = m.c();
                        String str2 = d.f3699k;
                        c11.b(str2, "Unexpected error in onHandleIntent", th2);
                        m.c().a(str2, String.format("Releasing operation wake lock (%s) %s", action, a10), new Throwable[0]);
                        a10.release();
                        dVar = d.this;
                        runnableC0039d = new RunnableC0039d(dVar);
                    } catch (Throwable th3) {
                        m.c().a(d.f3699k, String.format("Releasing operation wake lock (%s) %s", action, a10), new Throwable[0]);
                        a10.release();
                        d dVar4 = d.this;
                        dVar4.e(new RunnableC0039d(dVar4));
                        throw th3;
                    }
                }
                dVar.e(runnableC0039d);
            }
        }
    }

    /* loaded from: classes.dex */
    public static class b implements Runnable {

        /* renamed from: a */
        public final d f3711a;

        /* renamed from: b */
        public final Intent f3712b;

        /* renamed from: c */
        public final int f3713c;

        public b(int i10, Intent intent, d dVar) {
            this.f3711a = dVar;
            this.f3712b = intent;
            this.f3713c = i10;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f3711a.a(this.f3712b, this.f3713c);
        }
    }

    /* loaded from: classes.dex */
    public interface c {
    }

    /* renamed from: androidx.work.impl.background.systemalarm.d$d */
    /* loaded from: classes.dex */
    public static class RunnableC0039d implements Runnable {

        /* renamed from: a */
        public final d f3714a;

        public RunnableC0039d(d dVar) {
            this.f3714a = dVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            boolean z10;
            d dVar = this.f3714a;
            dVar.getClass();
            m c10 = m.c();
            String str = d.f3699k;
            c10.a(str, "Checking if commands are complete.", new Throwable[0]);
            dVar.b();
            synchronized (dVar.f3707h) {
                boolean z11 = true;
                if (dVar.f3708i != null) {
                    m.c().a(str, String.format("Removing command %s", dVar.f3708i), new Throwable[0]);
                    if (((Intent) dVar.f3707h.remove(0)).equals(dVar.f3708i)) {
                        dVar.f3708i = null;
                    } else {
                        throw new IllegalStateException("Dequeue-d command is not the first.");
                    }
                }
                j jVar = ((r3.b) dVar.f3701b).f25195a;
                androidx.work.impl.background.systemalarm.a aVar = dVar.f3705f;
                synchronized (aVar.f3683c) {
                    if (!aVar.f3682b.isEmpty()) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                }
                if (!z10 && dVar.f3707h.isEmpty()) {
                    synchronized (jVar.f23811c) {
                        if (jVar.f23809a.isEmpty()) {
                            z11 = false;
                        }
                    }
                    if (!z11) {
                        m.c().a(str, "No more commands & intents.", new Throwable[0]);
                        c cVar = dVar.f3709j;
                        if (cVar != null) {
                            ((SystemAlarmService) cVar).d();
                        }
                    }
                }
                if (!dVar.f3707h.isEmpty()) {
                    dVar.f();
                }
            }
        }
    }

    public d(Context context) {
        Context applicationContext = context.getApplicationContext();
        this.f3700a = applicationContext;
        this.f3705f = new androidx.work.impl.background.systemalarm.a(applicationContext);
        this.f3702c = new r();
        l d10 = l.d(context);
        this.f3704e = d10;
        g3.c cVar = d10.f14898f;
        this.f3703d = cVar;
        this.f3701b = d10.f14896d;
        cVar.a(this);
        this.f3707h = new ArrayList();
        this.f3708i = null;
        this.f3706g = new Handler(Looper.getMainLooper());
    }

    public final void a(Intent intent, int i10) {
        m c10 = m.c();
        String str = f3699k;
        boolean z10 = false;
        c10.a(str, String.format("Adding command %s (%s)", intent, Integer.valueOf(i10)), new Throwable[0]);
        b();
        String action = intent.getAction();
        if (TextUtils.isEmpty(action)) {
            m.c().f(str, "Unknown command. Ignoring", new Throwable[0]);
            return;
        }
        if ("ACTION_CONSTRAINTS_CHANGED".equals(action)) {
            b();
            synchronized (this.f3707h) {
                Iterator it = this.f3707h.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    } else if ("ACTION_CONSTRAINTS_CHANGED".equals(((Intent) it.next()).getAction())) {
                        z10 = true;
                        break;
                    }
                }
            }
            if (z10) {
                return;
            }
        }
        intent.putExtra("KEY_START_ID", i10);
        synchronized (this.f3707h) {
            boolean z11 = !this.f3707h.isEmpty();
            this.f3707h.add(intent);
            if (!z11) {
                f();
            }
        }
    }

    public final void b() {
        if (this.f3706g.getLooper().getThread() != Thread.currentThread()) {
            throw new IllegalStateException("Needs to be invoked on the main thread.");
        }
    }

    @Override // g3.a
    public final void c(String str, boolean z10) {
        Context context = this.f3700a;
        String str2 = androidx.work.impl.background.systemalarm.a.f3680d;
        Intent intent = new Intent(context, SystemAlarmService.class);
        intent.setAction("ACTION_EXECUTION_COMPLETED");
        intent.putExtra("KEY_WORKSPEC_ID", str);
        intent.putExtra("KEY_NEEDS_RESCHEDULE", z10);
        e(new b(0, intent, this));
    }

    public final void d() {
        m.c().a(f3699k, "Destroying SystemAlarmDispatcher", new Throwable[0]);
        g3.c cVar = this.f3703d;
        synchronized (cVar.f14872k) {
            cVar.f14871j.remove(this);
        }
        r rVar = this.f3702c;
        if (!rVar.f23844a.isShutdown()) {
            rVar.f23844a.shutdownNow();
        }
        this.f3709j = null;
    }

    public final void e(Runnable runnable) {
        this.f3706g.post(runnable);
    }

    public final void f() {
        b();
        PowerManager.WakeLock a10 = p3.m.a(this.f3700a, "ProcessCommand");
        try {
            a10.acquire();
            ((r3.b) this.f3704e.f14896d).a(new a());
        } finally {
            a10.release();
        }
    }
}
