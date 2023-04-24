package g3;

import android.content.Context;
import android.database.Cursor;
import androidx.work.ListenableWorker;
import androidx.work.WorkerParameters;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemalarm.RescheduleReceiver;
import f3.s;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import m2.y;
import o3.p;
import o3.q;
import o3.r;
import o3.t;

/* loaded from: classes.dex */
public final class o implements Runnable {

    /* renamed from: s */
    public static final String f14908s = f3.m.e("WorkerWrapper");

    /* renamed from: a */
    public Context f14909a;

    /* renamed from: b */
    public String f14910b;

    /* renamed from: c */
    public List<d> f14911c;

    /* renamed from: d */
    public p f14912d;

    /* renamed from: e */
    public ListenableWorker f14913e;

    /* renamed from: f */
    public r3.a f14914f;

    /* renamed from: h */
    public androidx.work.a f14916h;

    /* renamed from: i */
    public n3.a f14917i;

    /* renamed from: j */
    public WorkDatabase f14918j;

    /* renamed from: k */
    public q f14919k;

    /* renamed from: l */
    public o3.b f14920l;

    /* renamed from: m */
    public t f14921m;

    /* renamed from: n */
    public ArrayList f14922n;

    /* renamed from: o */
    public String f14923o;

    /* renamed from: r */
    public volatile boolean f14926r;

    /* renamed from: g */
    public ListenableWorker.a f14915g = new ListenableWorker.a.C0036a();

    /* renamed from: p */
    public q3.c<Boolean> f14924p = new q3.c<>();

    /* renamed from: q */
    public na.a<ListenableWorker.a> f14925q = null;

    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a */
        public Context f14927a;

        /* renamed from: b */
        public n3.a f14928b;

        /* renamed from: c */
        public r3.a f14929c;

        /* renamed from: d */
        public androidx.work.a f14930d;

        /* renamed from: e */
        public WorkDatabase f14931e;

        /* renamed from: f */
        public String f14932f;

        /* renamed from: g */
        public List<d> f14933g;

        /* renamed from: h */
        public WorkerParameters.a f14934h = new WorkerParameters.a();

        public a(Context context, androidx.work.a aVar, r3.a aVar2, n3.a aVar3, WorkDatabase workDatabase, String str) {
            this.f14927a = context.getApplicationContext();
            this.f14929c = aVar2;
            this.f14928b = aVar3;
            this.f14930d = aVar;
            this.f14931e = workDatabase;
            this.f14932f = str;
        }
    }

    public o(a aVar) {
        this.f14909a = aVar.f14927a;
        this.f14914f = aVar.f14929c;
        this.f14917i = aVar.f14928b;
        this.f14910b = aVar.f14932f;
        this.f14911c = aVar.f14933g;
        WorkerParameters.a aVar2 = aVar.f14934h;
        this.f14913e = null;
        this.f14916h = aVar.f14930d;
        WorkDatabase workDatabase = aVar.f14931e;
        this.f14918j = workDatabase;
        this.f14919k = workDatabase.w();
        this.f14920l = this.f14918j.r();
        this.f14921m = this.f14918j.x();
    }

    public final void a(ListenableWorker.a aVar) {
        if (aVar instanceof ListenableWorker.a.c) {
            f3.m.c().d(f14908s, String.format("Worker result SUCCESS for %s", this.f14923o), new Throwable[0]);
            if (!this.f14912d.c()) {
                this.f14918j.c();
                try {
                    ((r) this.f14919k).o(s.SUCCEEDED, this.f14910b);
                    ((r) this.f14919k).m(this.f14910b, ((ListenableWorker.a.c) this.f14915g).f3624a);
                    long currentTimeMillis = System.currentTimeMillis();
                    Iterator it = ((o3.c) this.f14920l).a(this.f14910b).iterator();
                    while (it.hasNext()) {
                        String str = (String) it.next();
                        if (((r) this.f14919k).f(str) == s.BLOCKED && ((o3.c) this.f14920l).b(str)) {
                            f3.m.c().d(f14908s, String.format("Setting status to enqueued for %s", str), new Throwable[0]);
                            ((r) this.f14919k).o(s.ENQUEUED, str);
                            ((r) this.f14919k).n(currentTimeMillis, str);
                        }
                    }
                    this.f14918j.p();
                    return;
                } finally {
                    this.f14918j.l();
                    f(false);
                }
            }
        } else if (aVar instanceof ListenableWorker.a.b) {
            f3.m.c().d(f14908s, String.format("Worker result RETRY for %s", this.f14923o), new Throwable[0]);
            d();
            return;
        } else {
            f3.m.c().d(f14908s, String.format("Worker result FAILURE for %s", this.f14923o), new Throwable[0]);
            if (!this.f14912d.c()) {
                h();
                return;
            }
        }
        e();
    }

    public final void b(String str) {
        LinkedList linkedList = new LinkedList();
        linkedList.add(str);
        while (!linkedList.isEmpty()) {
            String str2 = (String) linkedList.remove();
            if (((r) this.f14919k).f(str2) != s.CANCELLED) {
                ((r) this.f14919k).o(s.FAILED, str2);
            }
            linkedList.addAll(((o3.c) this.f14920l).a(str2));
        }
    }

    public final void c() {
        if (!i()) {
            this.f14918j.c();
            try {
                s f10 = ((r) this.f14919k).f(this.f14910b);
                ((o3.o) this.f14918j.v()).a(this.f14910b);
                if (f10 == null) {
                    f(false);
                } else if (f10 == s.RUNNING) {
                    a(this.f14915g);
                } else if (!f10.a()) {
                    d();
                }
                this.f14918j.p();
            } finally {
                this.f14918j.l();
            }
        }
        List<d> list = this.f14911c;
        if (list != null) {
            for (d dVar : list) {
                dVar.d(this.f14910b);
            }
            e.a(this.f14916h, this.f14918j, this.f14911c);
        }
    }

    public final void d() {
        this.f14918j.c();
        try {
            ((r) this.f14919k).o(s.ENQUEUED, this.f14910b);
            ((r) this.f14919k).n(System.currentTimeMillis(), this.f14910b);
            ((r) this.f14919k).k(-1L, this.f14910b);
            this.f14918j.p();
        } finally {
            this.f14918j.l();
            f(true);
        }
    }

    public final void e() {
        this.f14918j.c();
        try {
            ((r) this.f14919k).n(System.currentTimeMillis(), this.f14910b);
            ((r) this.f14919k).o(s.ENQUEUED, this.f14910b);
            ((r) this.f14919k).l(this.f14910b);
            ((r) this.f14919k).k(-1L, this.f14910b);
            this.f14918j.p();
        } finally {
            this.f14918j.l();
            f(false);
        }
    }

    public final void f(boolean z10) {
        boolean z11;
        ListenableWorker listenableWorker;
        this.f14918j.c();
        try {
            r rVar = (r) this.f14918j.w();
            rVar.getClass();
            y h10 = y.h(0, "SELECT COUNT(*) > 0 FROM workspec WHERE state NOT IN (2, 3, 5) LIMIT 1");
            rVar.f22645a.b();
            Cursor r10 = o8.b.r(rVar.f22645a, h10);
            if (r10.moveToFirst() && r10.getInt(0) != 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            r10.close();
            h10.j();
            if (!z11) {
                p3.f.a(this.f14909a, RescheduleReceiver.class, false);
            }
            if (z10) {
                ((r) this.f14919k).o(s.ENQUEUED, this.f14910b);
                ((r) this.f14919k).k(-1L, this.f14910b);
            }
            if (this.f14912d != null && (listenableWorker = this.f14913e) != null && listenableWorker.b()) {
                n3.a aVar = this.f14917i;
                String str = this.f14910b;
                c cVar = (c) aVar;
                synchronized (cVar.f14872k) {
                    cVar.f14867f.remove(str);
                    cVar.g();
                }
            }
            this.f14918j.p();
            this.f14918j.l();
            this.f14924p.i(Boolean.valueOf(z10));
        } catch (Throwable th2) {
            this.f14918j.l();
            throw th2;
        }
    }

    public final void g() {
        s f10 = ((r) this.f14919k).f(this.f14910b);
        if (f10 == s.RUNNING) {
            f3.m.c().a(f14908s, String.format("Status for %s is RUNNING;not doing any work and rescheduling for later execution", this.f14910b), new Throwable[0]);
            f(true);
            return;
        }
        f3.m.c().a(f14908s, String.format("Status for %s is %s; not doing any work", this.f14910b, f10), new Throwable[0]);
        f(false);
    }

    public final void h() {
        this.f14918j.c();
        try {
            b(this.f14910b);
            androidx.work.b bVar = ((ListenableWorker.a.C0036a) this.f14915g).f3623a;
            ((r) this.f14919k).m(this.f14910b, bVar);
            this.f14918j.p();
        } finally {
            this.f14918j.l();
            f(false);
        }
    }

    public final boolean i() {
        if (this.f14926r) {
            f3.m.c().a(f14908s, String.format("Work interrupted for %s", this.f14923o), new Throwable[0]);
            s f10 = ((r) this.f14919k).f(this.f14910b);
            if (f10 == null) {
                f(false);
            } else {
                f(!f10.a());
            }
            return true;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:139:0x00ba, code lost:
        if (r1 != false) goto L96;
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void run() {
        /*
            Method dump skipped, instructions count: 720
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: g3.o.run():void");
    }
}
