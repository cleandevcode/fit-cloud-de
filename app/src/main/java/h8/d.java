package h8;

import android.app.ActivityManager;
import android.app.Application;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.util.Log;
import com.google.android.gms.common.api.GoogleApiActivity;
import com.google.android.gms.common.api.Status;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import g8.a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import o0.g;
import org.checkerframework.checker.initialization.qual.NotOnlyInitialized;

/* loaded from: classes.dex */
public final class d implements Handler.Callback {

    /* renamed from: p */
    public static final Status f15921p = new Status(4, "Sign-out occurred while this API call was in progress.");

    /* renamed from: q */
    public static final Status f15922q = new Status(4, "The user must be signed in to make this API call.");

    /* renamed from: r */
    public static final Object f15923r = new Object();

    /* renamed from: s */
    public static d f15924s;

    /* renamed from: a */
    public long f15925a;

    /* renamed from: b */
    public boolean f15926b;

    /* renamed from: c */
    public i8.s f15927c;

    /* renamed from: d */
    public k8.c f15928d;

    /* renamed from: e */
    public final Context f15929e;

    /* renamed from: f */
    public final f8.d f15930f;

    /* renamed from: g */
    public final i8.d0 f15931g;

    /* renamed from: h */
    public final AtomicInteger f15932h;

    /* renamed from: i */
    public final AtomicInteger f15933i;

    /* renamed from: j */
    public final ConcurrentHashMap f15934j;

    /* renamed from: k */
    public t f15935k;

    /* renamed from: l */
    public final o0.d f15936l;

    /* renamed from: m */
    public final o0.d f15937m;
    @NotOnlyInitialized

    /* renamed from: n */
    public final v8.j f15938n;

    /* renamed from: o */
    public volatile boolean f15939o;

    public d(Context context, Looper looper) {
        boolean z10;
        f8.d dVar = f8.d.f14180d;
        this.f15925a = 10000L;
        this.f15926b = false;
        boolean z11 = true;
        this.f15932h = new AtomicInteger(1);
        this.f15933i = new AtomicInteger(0);
        this.f15934j = new ConcurrentHashMap(5, 0.75f, 1);
        this.f15935k = null;
        this.f15936l = new o0.d();
        this.f15937m = new o0.d();
        this.f15939o = true;
        this.f15929e = context;
        v8.j jVar = new v8.j(looper, this);
        this.f15938n = jVar;
        this.f15930f = dVar;
        this.f15931g = new i8.d0();
        PackageManager packageManager = context.getPackageManager();
        if (n8.a.f22200d == null) {
            if (Build.VERSION.SDK_INT >= 26) {
                z10 = true;
            } else {
                z10 = false;
            }
            n8.a.f22200d = Boolean.valueOf((z10 && packageManager.hasSystemFeature("android.hardware.type.automotive")) ? false : false);
        }
        if (n8.a.f22200d.booleanValue()) {
            this.f15939o = false;
        }
        jVar.sendMessage(jVar.obtainMessage(6));
    }

    public static Status d(a aVar, f8.a aVar2) {
        String str = aVar.f15893b.f15015b;
        String valueOf = String.valueOf(aVar2);
        return new Status(1, 17, "API: " + str + " is not available on this device. Connection failed with: " + valueOf, aVar2.f14171c, aVar2);
    }

    @ResultIgnorabilityUnspecified
    public static d g(Context context) {
        d dVar;
        HandlerThread handlerThread;
        synchronized (f15923r) {
            try {
                if (f15924s == null) {
                    synchronized (i8.h.f16667a) {
                        handlerThread = i8.h.f16669c;
                        if (handlerThread == null) {
                            HandlerThread handlerThread2 = new HandlerThread("GoogleApiHandler", 9);
                            i8.h.f16669c = handlerThread2;
                            handlerThread2.start();
                            handlerThread = i8.h.f16669c;
                        }
                    }
                    Looper looper = handlerThread.getLooper();
                    Context applicationContext = context.getApplicationContext();
                    Object obj = f8.d.f14179c;
                    f15924s = new d(applicationContext, looper);
                }
                dVar = f15924s;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return dVar;
    }

    public final void a(t tVar) {
        synchronized (f15923r) {
            if (this.f15935k != tVar) {
                this.f15935k = tVar;
                this.f15936l.clear();
            }
            this.f15936l.addAll(tVar.f16021f);
        }
    }

    public final boolean b() {
        if (this.f15926b) {
            return false;
        }
        i8.r rVar = i8.q.a().f16703a;
        if (rVar != null && !rVar.f16705b) {
            return false;
        }
        int i10 = this.f15931g.f16621a.get(203400000, -1);
        if (i10 != -1 && i10 != 0) {
            return false;
        }
        return true;
    }

    @ResultIgnorabilityUnspecified
    public final boolean c(f8.a aVar, int i10) {
        PendingIntent pendingIntent;
        boolean z10;
        Boolean bool;
        boolean booleanValue;
        boolean isInstantApp;
        boolean z11;
        PendingIntent pendingIntent2;
        Boolean bool2;
        f8.d dVar = this.f15930f;
        Context context = this.f15929e;
        dVar.getClass();
        synchronized (o8.b.class) {
            Context applicationContext = context.getApplicationContext();
            Context context2 = o8.b.f22882a;
            pendingIntent = null;
            if (context2 != null && (bool2 = o8.b.f22883b) != null && context2 == applicationContext) {
                booleanValue = bool2.booleanValue();
            }
            o8.b.f22883b = null;
            if (Build.VERSION.SDK_INT >= 26) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                isInstantApp = applicationContext.getPackageManager().isInstantApp();
                bool = Boolean.valueOf(isInstantApp);
            } else {
                try {
                    context.getClassLoader().loadClass("com.google.android.instantapps.supervisor.InstantAppsRuntime");
                    o8.b.f22883b = Boolean.TRUE;
                } catch (ClassNotFoundException unused) {
                    bool = Boolean.FALSE;
                }
                o8.b.f22882a = applicationContext;
                booleanValue = o8.b.f22883b.booleanValue();
            }
            o8.b.f22883b = bool;
            o8.b.f22882a = applicationContext;
            booleanValue = o8.b.f22883b.booleanValue();
        }
        if (!booleanValue) {
            int i11 = aVar.f14170b;
            if (i11 != 0 && aVar.f14171c != null) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z11) {
                pendingIntent2 = aVar.f14171c;
            } else {
                Intent a10 = dVar.a(context, i11, null);
                if (a10 != null) {
                    pendingIntent = PendingIntent.getActivity(context, 0, a10, w8.d.f29761a | 134217728);
                }
                pendingIntent2 = pendingIntent;
            }
            if (pendingIntent2 != null) {
                int i12 = aVar.f14170b;
                int i13 = GoogleApiActivity.f6047b;
                Intent intent = new Intent(context, GoogleApiActivity.class);
                intent.putExtra("pending_intent", pendingIntent2);
                intent.putExtra("failing_client_id", i10);
                intent.putExtra("notify_manager", true);
                dVar.g(context, i12, PendingIntent.getActivity(context, 0, intent, v8.i.f29175a | 134217728));
                return true;
            }
        }
        return false;
    }

    @ResultIgnorabilityUnspecified
    public final c0 e(g8.c cVar) {
        a aVar = cVar.f15021e;
        c0 c0Var = (c0) this.f15934j.get(aVar);
        if (c0Var == null) {
            c0Var = new c0(this, cVar);
            this.f15934j.put(aVar, c0Var);
        }
        if (c0Var.f15908b.l()) {
            this.f15937m.add(aVar);
        }
        c0Var.n();
        return c0Var;
    }

    public final void f(g9.h hVar, int i10, g8.c cVar) {
        long j10;
        long j11;
        boolean z10;
        if (i10 != 0) {
            a aVar = cVar.f15021e;
            k0 k0Var = null;
            if (b()) {
                i8.r rVar = i8.q.a().f16703a;
                boolean z11 = true;
                if (rVar != null) {
                    if (rVar.f16705b) {
                        boolean z12 = rVar.f16706c;
                        c0 c0Var = (c0) this.f15934j.get(aVar);
                        if (c0Var != null) {
                            a.e eVar = c0Var.f15908b;
                            if (eVar instanceof i8.b) {
                                i8.b bVar = (i8.b) eVar;
                                if (bVar.f16597u != null) {
                                    z10 = true;
                                } else {
                                    z10 = false;
                                }
                                if (z10 && !bVar.c()) {
                                    i8.e a10 = k0.a(c0Var, bVar, i10);
                                    if (a10 != null) {
                                        c0Var.f15918l++;
                                        z11 = a10.f16632c;
                                    }
                                }
                            }
                        }
                        z11 = z12;
                    }
                }
                if (z11) {
                    j10 = System.currentTimeMillis();
                } else {
                    j10 = 0;
                }
                if (z11) {
                    j11 = SystemClock.elapsedRealtime();
                } else {
                    j11 = 0;
                }
                k0Var = new k0(this, i10, aVar, j10, j11);
            }
            if (k0Var != null) {
                g9.t tVar = hVar.f15034a;
                v8.j jVar = this.f15938n;
                jVar.getClass();
                tVar.f15058b.a(new g9.m(new w(jVar), k0Var));
                tVar.e();
            }
        }
    }

    public final void h(f8.a aVar, int i10) {
        if (c(aVar, i10)) {
            return;
        }
        v8.j jVar = this.f15938n;
        jVar.sendMessage(jVar.obtainMessage(5, i10, 0, aVar));
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        Status status;
        f8.c[] g10;
        boolean z10;
        int i10 = message.what;
        c0 c0Var = null;
        long j10 = 300000;
        switch (i10) {
            case 1:
                if (true == ((Boolean) message.obj).booleanValue()) {
                    j10 = 10000;
                }
                this.f15925a = j10;
                this.f15938n.removeMessages(12);
                for (a aVar : this.f15934j.keySet()) {
                    v8.j jVar = this.f15938n;
                    jVar.sendMessageDelayed(jVar.obtainMessage(12, aVar), this.f15925a);
                }
                break;
            case 2:
                ((e1) message.obj).getClass();
                throw null;
            case 3:
                for (c0 c0Var2 : this.f15934j.values()) {
                    i8.p.c(c0Var2.f15919m.f15938n);
                    c0Var2.f15917k = null;
                    c0Var2.n();
                }
                break;
            case 4:
            case 8:
            case 13:
                n0 n0Var = (n0) message.obj;
                c0 c0Var3 = (c0) this.f15934j.get(n0Var.f15999c.f15021e);
                if (c0Var3 == null) {
                    c0Var3 = e(n0Var.f15999c);
                }
                if (c0Var3.f15908b.l() && this.f15933i.get() != n0Var.f15998b) {
                    n0Var.f15997a.a(f15921p);
                    c0Var3.q();
                    break;
                } else {
                    c0Var3.o(n0Var.f15997a);
                    break;
                }
                break;
            case 5:
                int i11 = message.arg1;
                f8.a aVar2 = (f8.a) message.obj;
                Iterator it = this.f15934j.values().iterator();
                while (true) {
                    if (it.hasNext()) {
                        c0 c0Var4 = (c0) it.next();
                        if (c0Var4.f15913g == i11) {
                            c0Var = c0Var4;
                        }
                    }
                }
                if (c0Var != null) {
                    if (aVar2.f14170b == 13) {
                        f8.d dVar = this.f15930f;
                        int i12 = aVar2.f14170b;
                        dVar.getClass();
                        AtomicBoolean atomicBoolean = com.google.android.gms.common.a.f6043a;
                        String e10 = f8.a.e(i12);
                        String str = aVar2.f14172d;
                        c0Var.c(new Status(17, "Error resolution was canceled by the user, original error message: " + e10 + ": " + str));
                        break;
                    } else {
                        c0Var.c(d(c0Var.f15909c, aVar2));
                        break;
                    }
                } else {
                    Log.wtf("GoogleApiManager", androidx.activity.i.a("Could not find API instance ", i11, " while trying to fail enqueued calls."), new Exception());
                    break;
                }
            case 6:
                if (this.f15929e.getApplicationContext() instanceof Application) {
                    Application application = (Application) this.f15929e.getApplicationContext();
                    b bVar = b.f15898e;
                    synchronized (bVar) {
                        if (!bVar.f15902d) {
                            application.registerActivityLifecycleCallbacks(bVar);
                            application.registerComponentCallbacks(bVar);
                            bVar.f15902d = true;
                        }
                    }
                    x xVar = new x(this);
                    synchronized (bVar) {
                        bVar.f15901c.add(xVar);
                    }
                    if (!bVar.f15900b.get()) {
                        ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
                        ActivityManager.getMyMemoryState(runningAppProcessInfo);
                        if (!bVar.f15900b.getAndSet(true) && runningAppProcessInfo.importance > 100) {
                            bVar.f15899a.set(true);
                        }
                    }
                    if (!bVar.f15899a.get()) {
                        this.f15925a = 300000L;
                        break;
                    }
                }
                break;
            case 7:
                e((g8.c) message.obj);
                break;
            case 9:
                if (this.f15934j.containsKey(message.obj)) {
                    c0 c0Var5 = (c0) this.f15934j.get(message.obj);
                    i8.p.c(c0Var5.f15919m.f15938n);
                    if (c0Var5.f15915i) {
                        c0Var5.n();
                        break;
                    }
                }
                break;
            case 10:
                Iterator it2 = this.f15937m.iterator();
                while (true) {
                    g.a aVar3 = (g.a) it2;
                    if (aVar3.hasNext()) {
                        c0 c0Var6 = (c0) this.f15934j.remove((a) aVar3.next());
                        if (c0Var6 != null) {
                            c0Var6.q();
                        }
                    } else {
                        this.f15937m.clear();
                        break;
                    }
                }
            case 11:
                if (this.f15934j.containsKey(message.obj)) {
                    c0 c0Var7 = (c0) this.f15934j.get(message.obj);
                    i8.p.c(c0Var7.f15919m.f15938n);
                    if (c0Var7.f15915i) {
                        c0Var7.i();
                        d dVar2 = c0Var7.f15919m;
                        if (dVar2.f15930f.c(dVar2.f15929e) == 18) {
                            status = new Status(21, "Connection timed out waiting for Google Play services update to complete.");
                        } else {
                            status = new Status(22, "API failed to connect while resuming due to an unknown error.");
                        }
                        c0Var7.c(status);
                        c0Var7.f15908b.b("Timing out connection while resuming.");
                        break;
                    }
                }
                break;
            case 12:
                if (this.f15934j.containsKey(message.obj)) {
                    ((c0) this.f15934j.get(message.obj)).m(true);
                    break;
                }
                break;
            case 14:
                ((u) message.obj).getClass();
                if (!this.f15934j.containsKey(null)) {
                    throw null;
                }
                ((c0) this.f15934j.get(null)).m(false);
                throw null;
            case 15:
                d0 d0Var = (d0) message.obj;
                if (this.f15934j.containsKey(d0Var.f15940a)) {
                    c0 c0Var8 = (c0) this.f15934j.get(d0Var.f15940a);
                    if (c0Var8.f15916j.contains(d0Var) && !c0Var8.f15915i) {
                        if (!c0Var8.f15908b.e()) {
                            c0Var8.n();
                            break;
                        } else {
                            c0Var8.e();
                            break;
                        }
                    }
                }
                break;
            case 16:
                d0 d0Var2 = (d0) message.obj;
                if (this.f15934j.containsKey(d0Var2.f15940a)) {
                    c0 c0Var9 = (c0) this.f15934j.get(d0Var2.f15940a);
                    if (c0Var9.f15916j.remove(d0Var2)) {
                        c0Var9.f15919m.f15938n.removeMessages(15, d0Var2);
                        c0Var9.f15919m.f15938n.removeMessages(16, d0Var2);
                        f8.c cVar = d0Var2.f15941b;
                        ArrayList arrayList = new ArrayList(c0Var9.f15907a.size());
                        for (d1 d1Var : c0Var9.f15907a) {
                            if ((d1Var instanceof i0) && (g10 = ((i0) d1Var).g(c0Var9)) != null) {
                                int length = g10.length;
                                int i13 = 0;
                                while (true) {
                                    if (i13 < length) {
                                        if (i8.n.a(g10[i13], cVar)) {
                                            if (i13 >= 0) {
                                                z10 = true;
                                            }
                                        } else {
                                            i13++;
                                        }
                                    }
                                }
                                z10 = false;
                                if (z10) {
                                    arrayList.add(d1Var);
                                }
                            }
                        }
                        int size = arrayList.size();
                        for (int i14 = 0; i14 < size; i14++) {
                            d1 d1Var2 = (d1) arrayList.get(i14);
                            c0Var9.f15907a.remove(d1Var2);
                            d1Var2.b(new g8.j(cVar));
                        }
                        break;
                    }
                }
                break;
            case 17:
                i8.s sVar = this.f15927c;
                if (sVar != null) {
                    if (sVar.f16710a > 0 || b()) {
                        if (this.f15928d == null) {
                            this.f15928d = new k8.c(this.f15929e);
                        }
                        this.f15928d.d(sVar);
                    }
                    this.f15927c = null;
                    break;
                }
                break;
            case 18:
                l0 l0Var = (l0) message.obj;
                if (l0Var.f15989c == 0) {
                    i8.s sVar2 = new i8.s(l0Var.f15988b, Arrays.asList(l0Var.f15987a));
                    if (this.f15928d == null) {
                        this.f15928d = new k8.c(this.f15929e);
                    }
                    this.f15928d.d(sVar2);
                    break;
                } else {
                    i8.s sVar3 = this.f15927c;
                    if (sVar3 != null) {
                        List list = sVar3.f16711b;
                        if (sVar3.f16710a == l0Var.f15988b && (list == null || list.size() < l0Var.f15990d)) {
                            i8.s sVar4 = this.f15927c;
                            i8.m mVar = l0Var.f15987a;
                            if (sVar4.f16711b == null) {
                                sVar4.f16711b = new ArrayList();
                            }
                            sVar4.f16711b.add(mVar);
                        } else {
                            this.f15938n.removeMessages(17);
                            i8.s sVar5 = this.f15927c;
                            if (sVar5 != null) {
                                if (sVar5.f16710a > 0 || b()) {
                                    if (this.f15928d == null) {
                                        this.f15928d = new k8.c(this.f15929e);
                                    }
                                    this.f15928d.d(sVar5);
                                }
                                this.f15927c = null;
                            }
                        }
                    }
                    if (this.f15927c == null) {
                        ArrayList arrayList2 = new ArrayList();
                        arrayList2.add(l0Var.f15987a);
                        this.f15927c = new i8.s(l0Var.f15988b, arrayList2);
                        v8.j jVar2 = this.f15938n;
                        jVar2.sendMessageDelayed(jVar2.obtainMessage(17), l0Var.f15989c);
                        break;
                    }
                }
                break;
            case 19:
                this.f15926b = false;
                break;
            default:
                Log.w("GoogleApiManager", "Unknown message id: " + i10);
                return false;
        }
        return true;
    }
}
