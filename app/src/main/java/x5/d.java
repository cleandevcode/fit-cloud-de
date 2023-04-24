package x5;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.os.Bundle;
import android.util.Log;
import cn.sharesdk.framework.InnerShareParams;
import d6.c0;
import d6.m0;
import d6.s;
import d6.t;
import d6.u;
import d6.v;
import d6.w;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Timer;
import java.util.UUID;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import o5.g0;
import o5.q0;
import q5.e;
import s.j0;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a */
    public static final d f30285a = new d();

    /* renamed from: b */
    public static final String f30286b;

    /* renamed from: c */
    public static final ScheduledExecutorService f30287c;

    /* renamed from: d */
    public static volatile ScheduledFuture<?> f30288d;

    /* renamed from: e */
    public static final Object f30289e;

    /* renamed from: f */
    public static final AtomicInteger f30290f;

    /* renamed from: g */
    public static volatile k f30291g;

    /* renamed from: h */
    public static final AtomicBoolean f30292h;

    /* renamed from: i */
    public static String f30293i;

    /* renamed from: j */
    public static long f30294j;

    /* renamed from: k */
    public static int f30295k;

    /* renamed from: l */
    public static WeakReference<Activity> f30296l;

    /* loaded from: classes.dex */
    public static final class a implements Application.ActivityLifecycleCallbacks {
        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityCreated(Activity activity, Bundle bundle) {
            gm.l.f(activity, InnerShareParams.ACTIVITY);
            c0.a aVar = c0.f12645d;
            c0.a.a(g0.APP_EVENTS, d.f30286b, "onActivityCreated");
            int i10 = e.f30297a;
            d.f30287c.execute(new p5.g(2));
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityDestroyed(Activity activity) {
            gm.l.f(activity, InnerShareParams.ACTIVITY);
            c0.a aVar = c0.f12645d;
            c0.a.a(g0.APP_EVENTS, d.f30286b, "onActivityDestroyed");
            d.f30285a.getClass();
            s5.c cVar = s5.c.f26581a;
            if (!i6.a.b(s5.c.class)) {
                try {
                    s5.d a10 = s5.d.f26589f.a();
                    if (!i6.a.b(a10)) {
                        a10.f26595e.remove(Integer.valueOf(activity.hashCode()));
                    }
                } catch (Throwable th2) {
                    i6.a.a(s5.c.class, th2);
                }
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityPaused(Activity activity) {
            ScheduledFuture<?> scheduledFuture;
            gm.l.f(activity, InnerShareParams.ACTIVITY);
            c0.a aVar = c0.f12645d;
            g0 g0Var = g0.APP_EVENTS;
            String str = d.f30286b;
            c0.a.a(g0Var, str, "onActivityPaused");
            int i10 = e.f30297a;
            d.f30285a.getClass();
            AtomicInteger atomicInteger = d.f30290f;
            if (atomicInteger.decrementAndGet() < 0) {
                atomicInteger.set(0);
                Log.w(str, "Unexpected activity pause without a matching activity resume. Logging data may be incorrect. Make sure you call activateApp from your Application's onCreate method");
            }
            synchronized (d.f30289e) {
                if (d.f30288d != null && (scheduledFuture = d.f30288d) != null) {
                    scheduledFuture.cancel(false);
                }
                d.f30288d = null;
                tl.l lVar = tl.l.f28297a;
            }
            final long currentTimeMillis = System.currentTimeMillis();
            final String l10 = m0.l(activity);
            s5.c cVar = s5.c.f26581a;
            if (!i6.a.b(s5.c.class)) {
                try {
                    if (s5.c.f26586f.get()) {
                        s5.d.f26589f.a().c(activity);
                        s5.g gVar = s5.c.f26584d;
                        if (gVar != null && !i6.a.b(gVar) && gVar.f26610b.get() != null) {
                            try {
                                Timer timer = gVar.f26611c;
                                if (timer != null) {
                                    timer.cancel();
                                }
                                gVar.f26611c = null;
                            } catch (Exception e10) {
                                Log.e(s5.g.f26608e, "Error unscheduling indexing job", e10);
                            }
                        }
                        SensorManager sensorManager = s5.c.f26583c;
                        if (sensorManager != null) {
                            sensorManager.unregisterListener(s5.c.f26582b);
                        }
                    }
                } catch (Throwable th2) {
                    i6.a.a(s5.c.class, th2);
                }
            }
            d.f30287c.execute(new Runnable() { // from class: x5.a
                @Override // java.lang.Runnable
                public final void run() {
                    long j10;
                    int i11;
                    long j11 = currentTimeMillis;
                    String str2 = l10;
                    gm.l.f(str2, "$activityName");
                    if (d.f30291g == null) {
                        d.f30291g = new k(Long.valueOf(j11), null);
                    }
                    k kVar = d.f30291g;
                    if (kVar != null) {
                        kVar.f30319b = Long.valueOf(j11);
                    }
                    if (d.f30290f.get() <= 0) {
                        c cVar2 = new c(j11, str2);
                        synchronized (d.f30289e) {
                            ScheduledExecutorService scheduledExecutorService = d.f30287c;
                            d.f30285a.getClass();
                            w wVar = w.f12811a;
                            v b10 = w.b(o5.v.b());
                            if (b10 == null) {
                                i11 = 60;
                            } else {
                                i11 = b10.f12796b;
                            }
                            d.f30288d = scheduledExecutorService.schedule(cVar2, i11, TimeUnit.SECONDS);
                            tl.l lVar2 = tl.l.f28297a;
                        }
                    }
                    long j12 = d.f30294j;
                    if (j12 > 0) {
                        j10 = (j11 - j12) / 1000;
                    } else {
                        j10 = 0;
                    }
                    g gVar2 = g.f30302a;
                    Context a10 = o5.v.a();
                    v f10 = w.f(o5.v.b(), false);
                    if (f10 != null && f10.f12799e && j10 > 0) {
                        p5.m mVar = new p5.m(a10, (String) null);
                        Bundle bundle = new Bundle(1);
                        bundle.putCharSequence("fb_aa_time_spent_view_name", str2);
                        double d10 = j10;
                        if (q0.b() && !i6.a.b(mVar)) {
                            try {
                                mVar.e("fb_aa_time_spent_on_view", Double.valueOf(d10), bundle, false, d.a());
                            } catch (Throwable th3) {
                                i6.a.a(mVar, th3);
                            }
                        }
                    }
                    k kVar2 = d.f30291g;
                    if (kVar2 != null) {
                        kVar2.a();
                    }
                }
            });
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityResumed(Activity activity) {
            Boolean bool;
            ScheduledFuture<?> scheduledFuture;
            gm.l.f(activity, InnerShareParams.ACTIVITY);
            c0.a aVar = c0.f12645d;
            c0.a.a(g0.APP_EVENTS, d.f30286b, "onActivityResumed");
            int i10 = e.f30297a;
            d.f30296l = new WeakReference<>(activity);
            d.f30290f.incrementAndGet();
            d.f30285a.getClass();
            synchronized (d.f30289e) {
                if (d.f30288d != null && (scheduledFuture = d.f30288d) != null) {
                    scheduledFuture.cancel(false);
                }
                bool = null;
                d.f30288d = null;
                tl.l lVar = tl.l.f28297a;
            }
            final long currentTimeMillis = System.currentTimeMillis();
            d.f30294j = currentTimeMillis;
            final String l10 = m0.l(activity);
            s5.c cVar = s5.c.f26581a;
            if (!i6.a.b(s5.c.class)) {
                try {
                    if (s5.c.f26586f.get()) {
                        s5.d.f26589f.a().a(activity);
                        Context applicationContext = activity.getApplicationContext();
                        String b10 = o5.v.b();
                        v b11 = w.b(b10);
                        if (b11 != null) {
                            bool = Boolean.valueOf(b11.f12802h);
                        }
                        if (!gm.l.a(bool, Boolean.TRUE)) {
                            s5.c cVar2 = s5.c.f26581a;
                            cVar2.getClass();
                            i6.a.b(cVar2);
                        } else {
                            SensorManager sensorManager = (SensorManager) applicationContext.getSystemService("sensor");
                            if (sensorManager != null) {
                                s5.c.f26583c = sensorManager;
                                Sensor defaultSensor = sensorManager.getDefaultSensor(1);
                                s5.g gVar = new s5.g(activity);
                                s5.c.f26584d = gVar;
                                s5.h hVar = s5.c.f26582b;
                                s5.b bVar = new s5.b(b11, b10, 0);
                                hVar.getClass();
                                if (!i6.a.b(hVar)) {
                                    hVar.f26615a = bVar;
                                }
                                sensorManager.registerListener(s5.c.f26582b, defaultSensor, 2);
                                if (b11 != null && b11.f12802h) {
                                    gVar.c();
                                }
                            }
                        }
                        s5.c cVar3 = s5.c.f26581a;
                        cVar3.getClass();
                        i6.a.b(cVar3);
                    }
                } catch (Throwable th2) {
                    i6.a.a(s5.c.class, th2);
                }
            }
            q5.b bVar2 = q5.b.f24590a;
            if (!i6.a.b(q5.b.class)) {
                try {
                    if (q5.b.f24591b) {
                        CopyOnWriteArraySet copyOnWriteArraySet = q5.d.f24593d;
                        if (!new HashSet(q5.d.a()).isEmpty()) {
                            HashMap hashMap = q5.e.f24597e;
                            e.a.b(activity);
                        }
                    }
                } catch (Exception unused) {
                } catch (Throwable th3) {
                    i6.a.a(q5.b.class, th3);
                }
            }
            b6.d.c(activity);
            v5.h.a();
            final Context applicationContext2 = activity.getApplicationContext();
            d.f30287c.execute(new Runnable() { // from class: x5.b
                @Override // java.lang.Runnable
                public final void run() {
                    Long l11;
                    int i11;
                    k kVar;
                    long j10 = currentTimeMillis;
                    String str = l10;
                    Context context = applicationContext2;
                    gm.l.f(str, "$activityName");
                    k kVar2 = d.f30291g;
                    if (kVar2 == null) {
                        l11 = null;
                    } else {
                        l11 = kVar2.f30319b;
                    }
                    if (d.f30291g == null) {
                        d.f30291g = new k(Long.valueOf(j10), null);
                        l lVar2 = l.f30324a;
                        String str2 = d.f30293i;
                        gm.l.e(context, "appContext");
                        l.b(str, str2, context);
                    } else if (l11 != null) {
                        long longValue = j10 - l11.longValue();
                        d.f30285a.getClass();
                        w wVar = w.f12811a;
                        v b12 = w.b(o5.v.b());
                        if (b12 == null) {
                            i11 = 60;
                        } else {
                            i11 = b12.f12796b;
                        }
                        if (longValue > i11 * 1000) {
                            l lVar3 = l.f30324a;
                            l.c(str, d.f30291g, d.f30293i);
                            String str3 = d.f30293i;
                            gm.l.e(context, "appContext");
                            l.b(str, str3, context);
                            d.f30291g = new k(Long.valueOf(j10), null);
                        } else if (longValue > 1000 && (kVar = d.f30291g) != null) {
                            kVar.f30321d++;
                        }
                    }
                    k kVar3 = d.f30291g;
                    if (kVar3 != null) {
                        kVar3.f30319b = Long.valueOf(j10);
                    }
                    k kVar4 = d.f30291g;
                    if (kVar4 != null) {
                        kVar4.a();
                    }
                }
            });
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
            gm.l.f(activity, InnerShareParams.ACTIVITY);
            gm.l.f(bundle, "outState");
            c0.a aVar = c0.f12645d;
            c0.a.a(g0.APP_EVENTS, d.f30286b, "onActivitySaveInstanceState");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityStarted(Activity activity) {
            gm.l.f(activity, InnerShareParams.ACTIVITY);
            d.f30295k++;
            c0.a aVar = c0.f12645d;
            c0.a.a(g0.APP_EVENTS, d.f30286b, "onActivityStarted");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityStopped(Activity activity) {
            gm.l.f(activity, InnerShareParams.ACTIVITY);
            c0.a aVar = c0.f12645d;
            c0.a.a(g0.APP_EVENTS, d.f30286b, "onActivityStopped");
            ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = p5.m.f23923c;
            String str = p5.i.f23913a;
            if (!i6.a.b(p5.i.class)) {
                try {
                    p5.i.f23916d.execute(new p5.b(1));
                } catch (Throwable th2) {
                    i6.a.a(p5.i.class, th2);
                }
            }
            d.f30295k--;
        }
    }

    static {
        String canonicalName = d.class.getCanonicalName();
        if (canonicalName == null) {
            canonicalName = "com.facebook.appevents.internal.ActivityLifecycleTracker";
        }
        f30286b = canonicalName;
        f30287c = Executors.newSingleThreadScheduledExecutor();
        f30289e = new Object();
        f30290f = new AtomicInteger(0);
        f30292h = new AtomicBoolean(false);
    }

    public static final UUID a() {
        k kVar;
        if (f30291g == null || (kVar = f30291g) == null) {
            return null;
        }
        return kVar.f30320c;
    }

    public static final void b(Application application, String str) {
        if (!f30292h.compareAndSet(false, true)) {
            return;
        }
        s sVar = s.f12755a;
        u.c(new t(new j0(5), s.b.CodelessEvents));
        f30293i = str;
        application.registerActivityLifecycleCallbacks(new a());
    }
}
