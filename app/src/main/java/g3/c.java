package g3;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.PowerManager;
import androidx.work.ListenableWorker;
import androidx.work.WorkerParameters;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.foreground.SystemForegroundService;
import g3.o;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutionException;
import y0.a;

/* loaded from: classes.dex */
public final class c implements g3.a, n3.a {

    /* renamed from: l */
    public static final String f14861l = f3.m.e("Processor");

    /* renamed from: b */
    public Context f14863b;

    /* renamed from: c */
    public androidx.work.a f14864c;

    /* renamed from: d */
    public r3.a f14865d;

    /* renamed from: e */
    public WorkDatabase f14866e;

    /* renamed from: h */
    public List<d> f14869h;

    /* renamed from: g */
    public HashMap f14868g = new HashMap();

    /* renamed from: f */
    public HashMap f14867f = new HashMap();

    /* renamed from: i */
    public HashSet f14870i = new HashSet();

    /* renamed from: j */
    public final ArrayList f14871j = new ArrayList();

    /* renamed from: a */
    public PowerManager.WakeLock f14862a = null;

    /* renamed from: k */
    public final Object f14872k = new Object();

    /* loaded from: classes.dex */
    public static class a implements Runnable {

        /* renamed from: a */
        public g3.a f14873a;

        /* renamed from: b */
        public String f14874b;

        /* renamed from: c */
        public na.a<Boolean> f14875c;

        public a(g3.a aVar, String str, q3.c cVar) {
            this.f14873a = aVar;
            this.f14874b = str;
            this.f14875c = cVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            boolean z10;
            try {
                z10 = this.f14875c.get().booleanValue();
            } catch (InterruptedException | ExecutionException unused) {
                z10 = true;
            }
            this.f14873a.c(this.f14874b, z10);
        }
    }

    public c(Context context, androidx.work.a aVar, r3.b bVar, WorkDatabase workDatabase, List list) {
        this.f14863b = context;
        this.f14864c = aVar;
        this.f14865d = bVar;
        this.f14866e = workDatabase;
        this.f14869h = list;
    }

    public static boolean b(String str, o oVar) {
        boolean z10;
        if (oVar != null) {
            oVar.f14926r = true;
            oVar.i();
            na.a<ListenableWorker.a> aVar = oVar.f14925q;
            if (aVar != null) {
                z10 = aVar.isDone();
                oVar.f14925q.cancel(true);
            } else {
                z10 = false;
            }
            ListenableWorker listenableWorker = oVar.f14913e;
            if (listenableWorker != null && !z10) {
                listenableWorker.g();
            } else {
                f3.m.c().a(o.f14908s, String.format("WorkSpec %s is already done. Not interrupting.", oVar.f14912d), new Throwable[0]);
            }
            f3.m.c().a(f14861l, String.format("WorkerWrapper interrupted for %s", str), new Throwable[0]);
            return true;
        }
        f3.m.c().a(f14861l, String.format("WorkerWrapper could not be found for %s", str), new Throwable[0]);
        return false;
    }

    public final void a(g3.a aVar) {
        synchronized (this.f14872k) {
            this.f14871j.add(aVar);
        }
    }

    @Override // g3.a
    public final void c(String str, boolean z10) {
        synchronized (this.f14872k) {
            this.f14868g.remove(str);
            f3.m.c().a(f14861l, String.format("%s %s executed; reschedule = %s", c.class.getSimpleName(), str, Boolean.valueOf(z10)), new Throwable[0]);
            Iterator it = this.f14871j.iterator();
            while (it.hasNext()) {
                ((g3.a) it.next()).c(str, z10);
            }
        }
    }

    public final boolean d(String str) {
        boolean z10;
        synchronized (this.f14872k) {
            z10 = this.f14868g.containsKey(str) || this.f14867f.containsKey(str);
        }
        return z10;
    }

    public final void e(String str, f3.g gVar) {
        synchronized (this.f14872k) {
            f3.m.c().d(f14861l, String.format("Moving WorkSpec (%s) to the foreground", str), new Throwable[0]);
            o oVar = (o) this.f14868g.remove(str);
            if (oVar != null) {
                if (this.f14862a == null) {
                    PowerManager.WakeLock a10 = p3.m.a(this.f14863b, "ProcessorForegroundLck");
                    this.f14862a = a10;
                    a10.acquire();
                }
                this.f14867f.put(str, oVar);
                Intent b10 = androidx.work.impl.foreground.a.b(this.f14863b, str, gVar);
                Context context = this.f14863b;
                Object obj = y0.a.f30807a;
                if (Build.VERSION.SDK_INT >= 26) {
                    a.e.b(context, b10);
                } else {
                    context.startService(b10);
                }
            }
        }
    }

    public final boolean f(String str, WorkerParameters.a aVar) {
        synchronized (this.f14872k) {
            if (d(str)) {
                f3.m.c().a(f14861l, String.format("Work %s is already enqueued for processing", str), new Throwable[0]);
                return false;
            }
            o.a aVar2 = new o.a(this.f14863b, this.f14864c, this.f14865d, this, this.f14866e, str);
            aVar2.f14933g = this.f14869h;
            if (aVar != null) {
                aVar2.f14934h = aVar;
            }
            o oVar = new o(aVar2);
            q3.c<Boolean> cVar = oVar.f14924p;
            cVar.a(new a(this, str, cVar), ((r3.b) this.f14865d).f25197c);
            this.f14868g.put(str, oVar);
            ((r3.b) this.f14865d).f25195a.execute(oVar);
            f3.m.c().a(f14861l, String.format("%s: processing %s", c.class.getSimpleName(), str), new Throwable[0]);
            return true;
        }
    }

    public final void g() {
        synchronized (this.f14872k) {
            if (!(!this.f14867f.isEmpty())) {
                Context context = this.f14863b;
                String str = androidx.work.impl.foreground.a.f3724k;
                Intent intent = new Intent(context, SystemForegroundService.class);
                intent.setAction("ACTION_STOP_FOREGROUND");
                this.f14863b.startService(intent);
                PowerManager.WakeLock wakeLock = this.f14862a;
                if (wakeLock != null) {
                    wakeLock.release();
                    this.f14862a = null;
                }
            }
        }
    }

    public final boolean h(String str) {
        boolean b10;
        synchronized (this.f14872k) {
            f3.m.c().a(f14861l, String.format("Processor stopping foreground work %s", str), new Throwable[0]);
            b10 = b(str, (o) this.f14867f.remove(str));
        }
        return b10;
    }

    public final boolean i(String str) {
        boolean b10;
        synchronized (this.f14872k) {
            f3.m.c().a(f14861l, String.format("Processor stopping background work %s", str), new Throwable[0]);
            b10 = b(str, (o) this.f14868g.remove(str));
        }
        return b10;
    }
}
