package h8;

import android.content.Context;
import android.os.DeadObjectException;
import android.os.Looper;
import android.os.Message;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import g8.a;
import g8.d;
import h8.h;
import i8.b;
import i8.d;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import no.nordicsemi.android.dfu.DfuServiceInitiator;
import org.checkerframework.checker.initialization.qual.NotOnlyInitialized;

/* loaded from: classes.dex */
public final class c0 implements d.a, d.b {
    @NotOnlyInitialized

    /* renamed from: b */
    public final a.e f15908b;

    /* renamed from: c */
    public final a f15909c;

    /* renamed from: d */
    public final s f15910d;

    /* renamed from: g */
    public final int f15913g;

    /* renamed from: h */
    public final v0 f15914h;

    /* renamed from: i */
    public boolean f15915i;

    /* renamed from: m */
    public final /* synthetic */ d f15919m;

    /* renamed from: a */
    public final LinkedList f15907a = new LinkedList();

    /* renamed from: e */
    public final HashSet f15911e = new HashSet();

    /* renamed from: f */
    public final HashMap f15912f = new HashMap();

    /* renamed from: j */
    public final ArrayList f15916j = new ArrayList();

    /* renamed from: k */
    public f8.a f15917k = null;

    /* renamed from: l */
    public int f15918l = 0;

    public c0(d dVar, g8.c cVar) {
        this.f15919m = dVar;
        Looper looper = dVar.f15938n.getLooper();
        d.a a10 = cVar.a();
        i8.d dVar2 = new i8.d(a10.f16617a, a10.f16618b, a10.f16619c, a10.f16620d);
        a.AbstractC0268a abstractC0268a = cVar.f15019c.f15014a;
        i8.p.f(abstractC0268a);
        a.e a11 = abstractC0268a.a(cVar.f15017a, looper, dVar2, cVar.f15020d, this, this);
        String str = cVar.f15018b;
        if (str != null && (a11 instanceof i8.b)) {
            ((i8.b) a11).f16594r = str;
        }
        if (str != null && (a11 instanceof i)) {
            ((i) a11).getClass();
        }
        this.f15908b = a11;
        this.f15909c = cVar.f15021e;
        this.f15910d = new s();
        this.f15913g = cVar.f15023g;
        if (a11.l()) {
            Context context = dVar.f15929e;
            v8.j jVar = dVar.f15938n;
            d.a a12 = cVar.a();
            this.f15914h = new v0(context, jVar, new i8.d(a12.f16617a, a12.f16618b, a12.f16619c, a12.f16620d));
            return;
        }
        this.f15914h = null;
    }

    public final f8.c a(f8.c[] cVarArr) {
        if (cVarArr != null && cVarArr.length != 0) {
            f8.c[] j10 = this.f15908b.j();
            if (j10 == null) {
                j10 = new f8.c[0];
            }
            o0.b bVar = new o0.b(j10.length);
            for (f8.c cVar : j10) {
                bVar.put(cVar.f14176a, Long.valueOf(cVar.e()));
            }
            for (f8.c cVar2 : cVarArr) {
                Long l10 = (Long) bVar.getOrDefault(cVar2.f14176a, null);
                if (l10 == null || l10.longValue() < cVar2.e()) {
                    return cVar2;
                }
            }
        }
        return null;
    }

    @Override // h8.c
    public final void a0(int i10) {
        if (Looper.myLooper() == this.f15919m.f15938n.getLooper()) {
            g(i10);
        } else {
            this.f15919m.f15938n.post(new z(this, i10));
        }
    }

    public final void b(f8.a aVar) {
        Iterator it = this.f15911e.iterator();
        if (it.hasNext()) {
            e1 e1Var = (e1) it.next();
            if (i8.n.a(aVar, f8.a.f14168e)) {
                this.f15908b.d();
            }
            e1Var.getClass();
            throw null;
        }
        this.f15911e.clear();
    }

    public final void c(Status status) {
        i8.p.c(this.f15919m.f15938n);
        d(status, null, false);
    }

    public final void d(Status status, RuntimeException runtimeException, boolean z10) {
        boolean z11;
        i8.p.c(this.f15919m.f15938n);
        boolean z12 = true;
        if (status != null) {
            z11 = false;
        } else {
            z11 = true;
        }
        if (runtimeException != null) {
            z12 = false;
        }
        if (z11 != z12) {
            Iterator it = this.f15907a.iterator();
            while (it.hasNext()) {
                d1 d1Var = (d1) it.next();
                if (!z10 || d1Var.f15942a == 2) {
                    if (status != null) {
                        d1Var.a(status);
                    } else {
                        d1Var.b(runtimeException);
                    }
                    it.remove();
                }
            }
            return;
        }
        throw new IllegalArgumentException("Status XOR exception should be null");
    }

    public final void e() {
        ArrayList arrayList = new ArrayList(this.f15907a);
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            d1 d1Var = (d1) arrayList.get(i10);
            if (!this.f15908b.e()) {
                return;
            }
            if (j(d1Var)) {
                this.f15907a.remove(d1Var);
            }
        }
    }

    public final void f() {
        i8.p.c(this.f15919m.f15938n);
        this.f15917k = null;
        b(f8.a.f14168e);
        i();
        Iterator it = this.f15912f.values().iterator();
        while (it.hasNext()) {
            o0 o0Var = (o0) it.next();
            if (a(o0Var.f16007a.f15973b) == null) {
                try {
                    k kVar = o0Var.f16007a;
                    ((q0) kVar).f16013d.f15983a.a(this.f15908b, new g9.h());
                } catch (DeadObjectException unused) {
                    a0(3);
                    this.f15908b.b("DeadObjectException thrown while calling register listener method.");
                } catch (RemoteException unused2) {
                    it.remove();
                }
            }
            it.remove();
        }
        e();
        h();
    }

    @Override // h8.c
    public final void f0() {
        if (Looper.myLooper() == this.f15919m.f15938n.getLooper()) {
            f();
        } else {
            this.f15919m.f15938n.post(new y(this));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0080 A[LOOP:0: B:29:0x007a->B:31:0x0080, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void g(int r6) {
        /*
            r5 = this;
            h8.d r0 = r5.f15919m
            v8.j r0 = r0.f15938n
            i8.p.c(r0)
            r0 = 0
            r5.f15917k = r0
            r0 = 1
            r5.f15915i = r0
            h8.s r1 = r5.f15910d
            g8.a$e r2 = r5.f15908b
            java.lang.String r2 = r2.k()
            r1.getClass()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "The connection to Google Play services was lost"
            r3.<init>(r4)
            if (r6 != r0) goto L24
            java.lang.String r6 = " due to service disconnection."
            goto L29
        L24:
            r4 = 3
            if (r6 != r4) goto L2c
            java.lang.String r6 = " due to dead object exception."
        L29:
            r3.append(r6)
        L2c:
            if (r2 == 0) goto L36
            java.lang.String r6 = " Last reason for disconnect: "
            r3.append(r6)
            r3.append(r2)
        L36:
            com.google.android.gms.common.api.Status r6 = new com.google.android.gms.common.api.Status
            r2 = 20
            java.lang.String r3 = r3.toString()
            r6.<init>(r2, r3)
            r1.a(r0, r6)
            h8.d r6 = r5.f15919m
            v8.j r6 = r6.f15938n
            r0 = 9
            h8.a r1 = r5.f15909c
            android.os.Message r0 = android.os.Message.obtain(r6, r0, r1)
            r1 = 5000(0x1388, double:2.4703E-320)
            r6.sendMessageDelayed(r0, r1)
            h8.d r6 = r5.f15919m
            v8.j r6 = r6.f15938n
            r0 = 11
            h8.a r1 = r5.f15909c
            android.os.Message r0 = android.os.Message.obtain(r6, r0, r1)
            r1 = 120000(0x1d4c0, double:5.9288E-319)
            r6.sendMessageDelayed(r0, r1)
            h8.d r6 = r5.f15919m
            i8.d0 r6 = r6.f15931g
            android.util.SparseIntArray r6 = r6.f16621a
            r6.clear()
            java.util.HashMap r6 = r5.f15912f
            java.util.Collection r6 = r6.values()
            java.util.Iterator r6 = r6.iterator()
        L7a:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L8c
            java.lang.Object r0 = r6.next()
            h8.o0 r0 = (h8.o0) r0
            java.lang.Runnable r0 = r0.f16009c
            r0.run()
            goto L7a
        L8c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: h8.c0.g(int):void");
    }

    public final void h() {
        this.f15919m.f15938n.removeMessages(12, this.f15909c);
        v8.j jVar = this.f15919m.f15938n;
        jVar.sendMessageDelayed(jVar.obtainMessage(12, this.f15909c), this.f15919m.f15925a);
    }

    public final void i() {
        if (this.f15915i) {
            this.f15919m.f15938n.removeMessages(11, this.f15909c);
            this.f15919m.f15938n.removeMessages(9, this.f15909c);
            this.f15915i = false;
        }
    }

    public final boolean j(d1 d1Var) {
        if (!(d1Var instanceof i0)) {
            d1Var.d(this.f15910d, this.f15908b.l());
            try {
                d1Var.c(this);
            } catch (DeadObjectException unused) {
                a0(1);
                this.f15908b.b("DeadObjectException thrown while running ApiCallRunner.");
            }
            return true;
        }
        i0 i0Var = (i0) d1Var;
        f8.c a10 = a(i0Var.g(this));
        if (a10 == null) {
            d1Var.d(this.f15910d, this.f15908b.l());
            try {
                d1Var.c(this);
            } catch (DeadObjectException unused2) {
                a0(1);
                this.f15908b.b("DeadObjectException thrown while running ApiCallRunner.");
            }
            return true;
        }
        String name = this.f15908b.getClass().getName();
        String str = a10.f14176a;
        long e10 = a10.e();
        Log.w("GoogleApiManager", name + " could not execute call because it requires feature (" + str + ", " + e10 + ").");
        if (this.f15919m.f15939o && i0Var.f(this)) {
            d0 d0Var = new d0(this.f15909c, a10);
            int indexOf = this.f15916j.indexOf(d0Var);
            if (indexOf >= 0) {
                d0 d0Var2 = (d0) this.f15916j.get(indexOf);
                this.f15919m.f15938n.removeMessages(15, d0Var2);
                v8.j jVar = this.f15919m.f15938n;
                jVar.sendMessageDelayed(Message.obtain(jVar, 15, d0Var2), DfuServiceInitiator.DEFAULT_SCAN_TIMEOUT);
                return false;
            }
            this.f15916j.add(d0Var);
            v8.j jVar2 = this.f15919m.f15938n;
            jVar2.sendMessageDelayed(Message.obtain(jVar2, 15, d0Var), DfuServiceInitiator.DEFAULT_SCAN_TIMEOUT);
            v8.j jVar3 = this.f15919m.f15938n;
            jVar3.sendMessageDelayed(Message.obtain(jVar3, 16, d0Var), 120000L);
            f8.a aVar = new f8.a(2, null);
            if (!l(aVar)) {
                this.f15919m.c(aVar, this.f15913g);
                return false;
            }
            return false;
        }
        i0Var.b(new g8.j(a10));
        return true;
    }

    @Override // h8.j
    public final void k(f8.a aVar) {
        p(aVar, null);
    }

    public final boolean l(f8.a aVar) {
        boolean z10;
        synchronized (d.f15923r) {
            try {
                d dVar = this.f15919m;
                if (dVar.f15935k == null || !dVar.f15936l.contains(this.f15909c)) {
                    return false;
                }
                t tVar = this.f15919m.f15935k;
                int i10 = this.f15913g;
                tVar.getClass();
                f1 f1Var = new f1(aVar, i10);
                AtomicReference atomicReference = tVar.f15964c;
                while (true) {
                    while (true) {
                        if (atomicReference.compareAndSet(null, f1Var)) {
                            z10 = true;
                            break;
                        } else if (atomicReference.get() != null) {
                            z10 = false;
                            break;
                        }
                    }
                    if (z10) {
                        tVar.f15965d.post(new g1(tVar, f1Var));
                        break;
                    } else if (atomicReference.get() != null) {
                        break;
                    }
                }
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final boolean m(boolean z10) {
        boolean z11;
        i8.p.c(this.f15919m.f15938n);
        if (!this.f15908b.e() || this.f15912f.size() != 0) {
            return false;
        }
        s sVar = this.f15910d;
        if (sVar.f16018a.isEmpty() && sVar.f16019b.isEmpty()) {
            z11 = false;
        } else {
            z11 = true;
        }
        if (z11) {
            if (z10) {
                h();
            }
            return false;
        }
        this.f15908b.b("Timing out service connection.");
        return true;
    }

    /* JADX WARN: Type inference failed for: r3v5, types: [e9.f, g8.a$e] */
    public final void n() {
        f8.a aVar;
        i8.p.c(this.f15919m.f15938n);
        if (!this.f15908b.e() && !this.f15908b.c()) {
            try {
                d dVar = this.f15919m;
                int a10 = dVar.f15931g.a(dVar.f15929e, this.f15908b);
                if (a10 != 0) {
                    f8.a aVar2 = new f8.a(a10, null);
                    String name = this.f15908b.getClass().getName();
                    String aVar3 = aVar2.toString();
                    Log.w("GoogleApiManager", "The service for " + name + " is not available: " + aVar3);
                    p(aVar2, null);
                    return;
                }
                d dVar2 = this.f15919m;
                a.e eVar = this.f15908b;
                f0 f0Var = new f0(dVar2, eVar, this.f15909c);
                if (eVar.l()) {
                    v0 v0Var = this.f15914h;
                    i8.p.f(v0Var);
                    e9.f fVar = v0Var.f16032g;
                    if (fVar != null) {
                        ((i8.b) fVar).o();
                    }
                    v0Var.f16031f.f16616i = Integer.valueOf(System.identityHashCode(v0Var));
                    e9.b bVar = v0Var.f16029d;
                    Context context = v0Var.f16027b;
                    Looper looper = v0Var.f16028c.getLooper();
                    i8.d dVar3 = v0Var.f16031f;
                    v0Var.f16032g = bVar.a(context, looper, dVar3, dVar3.f16615h, v0Var, v0Var);
                    v0Var.f16033h = f0Var;
                    Set set = v0Var.f16030e;
                    if (set != null && !set.isEmpty()) {
                        f9.a aVar4 = (f9.a) v0Var.f16032g;
                        aVar4.getClass();
                        aVar4.m(new b.d(aVar4));
                    } else {
                        v0Var.f16028c.post(new s0(v0Var));
                    }
                }
                try {
                    this.f15908b.m(f0Var);
                } catch (SecurityException e10) {
                    e = e10;
                    aVar = new f8.a(10);
                    p(aVar, e);
                }
            } catch (IllegalStateException e11) {
                e = e11;
                aVar = new f8.a(10);
            }
        }
    }

    public final void o(d1 d1Var) {
        boolean z10;
        i8.p.c(this.f15919m.f15938n);
        if (this.f15908b.e()) {
            if (j(d1Var)) {
                h();
                return;
            } else {
                this.f15907a.add(d1Var);
                return;
            }
        }
        this.f15907a.add(d1Var);
        f8.a aVar = this.f15917k;
        if (aVar != null) {
            if (aVar.f14170b != 0 && aVar.f14171c != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                p(aVar, null);
                return;
            }
        }
        n();
    }

    public final void p(f8.a aVar, RuntimeException runtimeException) {
        e9.f fVar;
        i8.p.c(this.f15919m.f15938n);
        v0 v0Var = this.f15914h;
        if (v0Var != null && (fVar = v0Var.f16032g) != null) {
            ((i8.b) fVar).o();
        }
        i8.p.c(this.f15919m.f15938n);
        this.f15917k = null;
        this.f15919m.f15931g.f16621a.clear();
        b(aVar);
        if ((this.f15908b instanceof k8.d) && aVar.f14170b != 24) {
            d dVar = this.f15919m;
            dVar.f15926b = true;
            v8.j jVar = dVar.f15938n;
            jVar.sendMessageDelayed(jVar.obtainMessage(19), 300000L);
        }
        if (aVar.f14170b == 4) {
            c(d.f15922q);
        } else if (this.f15907a.isEmpty()) {
            this.f15917k = aVar;
        } else if (runtimeException != null) {
            i8.p.c(this.f15919m.f15938n);
            d(null, runtimeException, false);
        } else if (this.f15919m.f15939o) {
            d(d.d(this.f15909c, aVar), null, true);
            if (!this.f15907a.isEmpty() && !l(aVar) && !this.f15919m.c(aVar, this.f15913g)) {
                if (aVar.f14170b == 18) {
                    this.f15915i = true;
                }
                if (this.f15915i) {
                    v8.j jVar2 = this.f15919m.f15938n;
                    jVar2.sendMessageDelayed(Message.obtain(jVar2, 9, this.f15909c), DfuServiceInitiator.DEFAULT_SCAN_TIMEOUT);
                    return;
                }
                c(d.d(this.f15909c, aVar));
            }
        } else {
            c(d.d(this.f15909c, aVar));
        }
    }

    public final void q() {
        i8.p.c(this.f15919m.f15938n);
        Status status = d.f15921p;
        c(status);
        s sVar = this.f15910d;
        sVar.getClass();
        sVar.a(false, status);
        for (h.a aVar : (h.a[]) this.f15912f.keySet().toArray(new h.a[0])) {
            o(new c1(aVar, new g9.h()));
        }
        b(new f8.a(4));
        if (this.f15908b.e()) {
            this.f15908b.f(new b0(this));
        }
    }
}
