package h3;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.text.TextUtils;
import f3.m;
import f3.s;
import g3.d;
import g3.l;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import o3.p;
import p3.i;

/* loaded from: classes.dex */
public final class c implements d, k3.c, g3.a {

    /* renamed from: i */
    public static final String f15760i = m.e("GreedyScheduler");

    /* renamed from: a */
    public final Context f15761a;

    /* renamed from: b */
    public final l f15762b;

    /* renamed from: c */
    public final k3.d f15763c;

    /* renamed from: e */
    public b f15765e;

    /* renamed from: f */
    public boolean f15766f;

    /* renamed from: h */
    public Boolean f15768h;

    /* renamed from: d */
    public final HashSet f15764d = new HashSet();

    /* renamed from: g */
    public final Object f15767g = new Object();

    public c(Context context, androidx.work.a aVar, r3.b bVar, l lVar) {
        this.f15761a = context;
        this.f15762b = lVar;
        this.f15763c = new k3.d(context, bVar, this);
        this.f15765e = new b(this, aVar.f3641e);
    }

    @Override // g3.d
    public final void a(p... pVarArr) {
        boolean z10;
        if (this.f15768h == null) {
            this.f15768h = Boolean.valueOf(i.a(this.f15761a, this.f15762b.f14894b));
        }
        if (!this.f15768h.booleanValue()) {
            m.c().d(f15760i, "Ignoring schedule request in a secondary process", new Throwable[0]);
            return;
        }
        if (!this.f15766f) {
            this.f15762b.f14898f.a(this);
            this.f15766f = true;
        }
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        for (p pVar : pVarArr) {
            long a10 = pVar.a();
            long currentTimeMillis = System.currentTimeMillis();
            if (pVar.f22626b == s.ENQUEUED) {
                if (currentTimeMillis < a10) {
                    b bVar = this.f15765e;
                    if (bVar != null) {
                        Runnable runnable = (Runnable) bVar.f15759c.remove(pVar.f22625a);
                        if (runnable != null) {
                            ((Handler) bVar.f15758b.f30183b).removeCallbacks(runnable);
                        }
                        a aVar = new a(bVar, pVar);
                        bVar.f15759c.put(pVar.f22625a, aVar);
                        ((Handler) bVar.f15758b.f30183b).postDelayed(aVar, pVar.a() - System.currentTimeMillis());
                    }
                } else if (pVar.b()) {
                    int i10 = Build.VERSION.SDK_INT;
                    if (i10 >= 23 && pVar.f22634j.f14068c) {
                        m.c().a(f15760i, String.format("Ignoring WorkSpec %s, Requires device idle.", pVar), new Throwable[0]);
                    } else {
                        if (i10 >= 24) {
                            if (pVar.f22634j.f14073h.f14076a.size() > 0) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            if (z10) {
                                m.c().a(f15760i, String.format("Ignoring WorkSpec %s, Requires ContentUri triggers.", pVar), new Throwable[0]);
                            }
                        }
                        hashSet.add(pVar);
                        hashSet2.add(pVar.f22625a);
                    }
                } else {
                    m.c().a(f15760i, String.format("Starting work for %s", pVar.f22625a), new Throwable[0]);
                    this.f15762b.h(pVar.f22625a, null);
                }
            }
        }
        synchronized (this.f15767g) {
            if (!hashSet.isEmpty()) {
                m.c().a(f15760i, String.format("Starting tracking for [%s]", TextUtils.join(",", hashSet2)), new Throwable[0]);
                this.f15764d.addAll(hashSet);
                this.f15763c.b(this.f15764d);
            }
        }
    }

    @Override // g3.d
    public final boolean b() {
        return false;
    }

    @Override // g3.a
    public final void c(String str, boolean z10) {
        synchronized (this.f15767g) {
            Iterator it = this.f15764d.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                p pVar = (p) it.next();
                if (pVar.f22625a.equals(str)) {
                    m.c().a(f15760i, String.format("Stopping tracking for %s", str), new Throwable[0]);
                    this.f15764d.remove(pVar);
                    this.f15763c.b(this.f15764d);
                    break;
                }
            }
        }
    }

    @Override // g3.d
    public final void d(String str) {
        Runnable runnable;
        if (this.f15768h == null) {
            this.f15768h = Boolean.valueOf(i.a(this.f15761a, this.f15762b.f14894b));
        }
        if (!this.f15768h.booleanValue()) {
            m.c().d(f15760i, "Ignoring schedule request in non-main process", new Throwable[0]);
            return;
        }
        if (!this.f15766f) {
            this.f15762b.f14898f.a(this);
            this.f15766f = true;
        }
        m.c().a(f15760i, String.format("Cancelling work ID %s", str), new Throwable[0]);
        b bVar = this.f15765e;
        if (bVar != null && (runnable = (Runnable) bVar.f15759c.remove(str)) != null) {
            ((Handler) bVar.f15758b.f30183b).removeCallbacks(runnable);
        }
        this.f15762b.i(str);
    }

    @Override // k3.c
    public final void e(ArrayList arrayList) {
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            m.c().a(f15760i, String.format("Constraints not met: Cancelling work ID %s", str), new Throwable[0]);
            this.f15762b.i(str);
        }
    }

    @Override // k3.c
    public final void f(List<String> list) {
        Iterator it = ((ArrayList) list).iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            m.c().a(f15760i, String.format("Constraints met: Scheduling work ID %s", str), new Throwable[0]);
            this.f15762b.h(str, null);
        }
    }
}
