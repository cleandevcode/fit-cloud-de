package p5;

import android.content.Context;
import android.os.Bundle;
import d6.c0;
import d6.m0;
import d6.n0;
import d6.w;
import d6.y;
import d6.z;
import java.math.BigDecimal;
import java.util.Currency;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import o5.a;
import o5.g0;
import o5.v;
import org.json.JSONException;

/* loaded from: classes.dex */
public final class m {

    /* renamed from: c */
    public static ScheduledThreadPoolExecutor f23923c;

    /* renamed from: d */
    public static final Object f23924d;

    /* renamed from: e */
    public static String f23925e;

    /* renamed from: f */
    public static boolean f23926f;

    /* renamed from: a */
    public final String f23927a;

    /* renamed from: b */
    public p5.a f23928b;

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: p5.m$a$a */
        /* loaded from: classes.dex */
        public static final class C0431a implements y.a {
            @Override // d6.y.a
            public final void a(String str) {
                ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = m.f23923c;
                v.a().getSharedPreferences("com.facebook.sdk.appEventPreferences", 0).edit().putString("install_referrer", str).apply();
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:178:0x0074 A[Catch: all -> 0x0083, TRY_LEAVE, TryCatch #1 {all -> 0x0083, blocks: (B:160:0x0042, B:178:0x0074, B:163:0x0053, B:165:0x0057, B:169:0x0064), top: B:203:0x0042 }] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public static final void a(p5.d r7, p5.a r8) {
            /*
                java.util.concurrent.ScheduledThreadPoolExecutor r0 = p5.m.f23923c
                java.lang.Class<p5.m> r0 = p5.m.class
                java.lang.String r1 = p5.i.f23913a
                java.lang.Class<p5.i> r1 = p5.i.class
                boolean r2 = i6.a.b(r1)
                if (r2 == 0) goto Lf
                goto L25
            Lf:
                java.lang.String r2 = "accessTokenAppId"
                gm.l.f(r8, r2)     // Catch: java.lang.Throwable -> L21
                java.util.concurrent.ScheduledExecutorService r2 = p5.i.f23916d     // Catch: java.lang.Throwable -> L21
                s.g r3 = new s.g     // Catch: java.lang.Throwable -> L21
                r4 = 8
                r3.<init>(r8, r7, r4)     // Catch: java.lang.Throwable -> L21
                r2.execute(r3)     // Catch: java.lang.Throwable -> L21
                goto L25
            L21:
                r2 = move-exception
                i6.a.a(r1, r2)
            L25:
                d6.s r1 = d6.s.f12755a
                d6.s$b r1 = d6.s.b.OnDevicePostInstallEventProcessing
                boolean r1 = d6.s.c(r1)
                r2 = 0
                r3 = 1
                if (r1 == 0) goto L87
                boolean r1 = z5.a.a()
                if (r1 == 0) goto L87
                java.lang.String r8 = r8.f23885a
                java.lang.Class<z5.a> r1 = z5.a.class
                boolean r4 = i6.a.b(r1)
                if (r4 == 0) goto L42
                goto L87
            L42:
                java.lang.String r4 = "applicationId"
                gm.l.f(r8, r4)     // Catch: java.lang.Throwable -> L83
                z5.a r4 = z5.a.f31960a     // Catch: java.lang.Throwable -> L83
                r4.getClass()     // Catch: java.lang.Throwable -> L83
                boolean r5 = i6.a.b(r4)     // Catch: java.lang.Throwable -> L83
                if (r5 == 0) goto L53
                goto L71
            L53:
                boolean r5 = r7.f23897b     // Catch: java.lang.Throwable -> L6d
                if (r5 == 0) goto L63
                java.util.Set<java.lang.String> r5 = z5.a.f31961b     // Catch: java.lang.Throwable -> L6d
                java.lang.String r6 = r7.f23899d     // Catch: java.lang.Throwable -> L6d
                boolean r5 = r5.contains(r6)     // Catch: java.lang.Throwable -> L6d
                if (r5 == 0) goto L63
                r5 = 1
                goto L64
            L63:
                r5 = 0
            L64:
                boolean r4 = r7.f23897b     // Catch: java.lang.Throwable -> L6d
                r4 = r4 ^ r3
                if (r4 != 0) goto L6b
                if (r5 == 0) goto L71
            L6b:
                r4 = 1
                goto L72
            L6d:
                r5 = move-exception
                i6.a.a(r4, r5)     // Catch: java.lang.Throwable -> L83
            L71:
                r4 = 0
            L72:
                if (r4 == 0) goto L87
                java.util.concurrent.Executor r4 = o5.v.c()     // Catch: java.lang.Throwable -> L83
                s.o r5 = new s.o     // Catch: java.lang.Throwable -> L83
                r6 = 9
                r5.<init>(r8, r7, r6)     // Catch: java.lang.Throwable -> L83
                r4.execute(r5)     // Catch: java.lang.Throwable -> L83
                goto L87
            L83:
                r8 = move-exception
                i6.a.a(r1, r8)
            L87:
                boolean r8 = r7.f23897b
                if (r8 != 0) goto Lbf
                boolean r8 = i6.a.b(r0)
                if (r8 == 0) goto L92
                goto L99
            L92:
                boolean r2 = p5.m.f23926f     // Catch: java.lang.Throwable -> L95
                goto L99
            L95:
                r8 = move-exception
                i6.a.a(r0, r8)
            L99:
                if (r2 != 0) goto Lbf
                java.lang.String r7 = r7.f23899d
                java.lang.String r8 = "fb_mobile_activate_app"
                boolean r7 = gm.l.a(r7, r8)
                if (r7 == 0) goto Lb4
                boolean r7 = i6.a.b(r0)
                if (r7 == 0) goto Lac
                goto Lbf
            Lac:
                p5.m.f23926f = r3     // Catch: java.lang.Throwable -> Laf
                goto Lbf
            Laf:
                r7 = move-exception
                i6.a.a(r0, r7)
                goto Lbf
            Lb4:
                d6.c0$a r7 = d6.c0.f12645d
                o5.g0 r7 = o5.g0.APP_EVENTS
                java.lang.String r8 = "AppEvents"
                java.lang.String r0 = "Warning: Please call AppEventsLogger.activateApp(...)from the long-lived activity's onResume() methodbefore logging other app events."
                d6.c0.a.a(r7, r8, r0)
            Lbf:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p5.m.a.a(p5.d, p5.a):void");
        }

        public static k b() {
            k kVar;
            synchronized (m.c()) {
                kVar = null;
                if (!i6.a.b(m.class)) {
                    kVar = k.AUTO;
                }
            }
            return kVar;
        }

        public static String c() {
            C0431a c0431a = new C0431a();
            if (!v.a().getSharedPreferences("com.facebook.sdk.appEventPreferences", 0).getBoolean("is_referrer_updated", false)) {
                o4.a aVar = new o4.a(v.a());
                try {
                    aVar.b(new z(aVar, c0431a));
                } catch (Exception unused) {
                }
            }
            return v.a().getSharedPreferences("com.facebook.sdk.appEventPreferences", 0).getString("install_referrer", null);
        }

        public static void d() {
            synchronized (m.c()) {
                if (m.b() != null) {
                    return;
                }
                ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1);
                if (!i6.a.b(m.class)) {
                    m.f23923c = scheduledThreadPoolExecutor;
                }
                tl.l lVar = tl.l.f28297a;
                Runnable runnable = new Runnable() { // from class: p5.l
                    @Override // java.lang.Runnable
                    public final void run() {
                        HashSet hashSet = new HashSet();
                        String str = i.f23913a;
                        Set<a> set = null;
                        if (!i6.a.b(i.class)) {
                            try {
                                set = i.f23915c.p();
                            } catch (Throwable th2) {
                                i6.a.a(i.class, th2);
                            }
                        }
                        for (a aVar : set) {
                            hashSet.add(aVar.f23885a);
                        }
                        Iterator it = hashSet.iterator();
                        while (it.hasNext()) {
                            w.f((String) it.next(), true);
                        }
                    }
                };
                ScheduledThreadPoolExecutor b10 = m.b();
                if (b10 != null) {
                    b10.scheduleAtFixedRate(runnable, 0L, 86400L, TimeUnit.SECONDS);
                    return;
                }
                throw new IllegalStateException("Required value was null.".toString());
            }
        }
    }

    static {
        new a();
        f23924d = new Object();
    }

    public m(Context context, String str) {
        this(m0.l(context), str);
    }

    public m(String str, String str2) {
        p5.a aVar;
        n0.g();
        this.f23927a = str;
        Date date = o5.a.f22664l;
        o5.a b10 = a.c.b();
        if (b10 == null || new Date().after(b10.f22667a) || !(str2 == null || gm.l.a(str2, b10.f22674h))) {
            if (str2 == null) {
                m0 m0Var = m0.f12709a;
                str2 = m0.q(v.a());
            }
            aVar = new p5.a(null, str2);
        } else {
            aVar = new p5.a(b10.f22671e, v.b());
        }
        this.f23928b = aVar;
        a.d();
    }

    public static final /* synthetic */ String a() {
        if (i6.a.b(m.class)) {
            return null;
        }
        try {
            return f23925e;
        } catch (Throwable th2) {
            i6.a.a(m.class, th2);
            return null;
        }
    }

    public static final /* synthetic */ ScheduledThreadPoolExecutor b() {
        if (i6.a.b(m.class)) {
            return null;
        }
        try {
            return f23923c;
        } catch (Throwable th2) {
            i6.a.a(m.class, th2);
            return null;
        }
    }

    public static final /* synthetic */ Object c() {
        if (i6.a.b(m.class)) {
            return null;
        }
        try {
            return f23924d;
        } catch (Throwable th2) {
            i6.a.a(m.class, th2);
            return null;
        }
    }

    public final void d(Bundle bundle, String str) {
        if (i6.a.b(this)) {
            return;
        }
        try {
            e(str, null, bundle, false, x5.d.a());
        } catch (Throwable th2) {
            i6.a.a(this, th2);
        }
    }

    public final void e(String str, Double d10, Bundle bundle, boolean z10, UUID uuid) {
        boolean z11;
        boolean z12;
        g0 g0Var = g0.APP_EVENTS;
        if (!i6.a.b(this) && str != null) {
            try {
                if (str.length() == 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (!z11) {
                    d6.u uVar = d6.u.f12789a;
                    if (d6.u.b("app_events_killswitch", v.b(), false)) {
                        c0.a aVar = c0.f12645d;
                        v.i(g0Var);
                        return;
                    }
                    try {
                        String str2 = this.f23927a;
                        if (x5.d.f30295k == 0) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        a.a(new d(str2, str, d10, bundle, z10, z12, uuid), this.f23928b);
                    } catch (o5.p e10) {
                        c0.a aVar2 = c0.f12645d;
                        e10.toString();
                        v.i(g0Var);
                    } catch (JSONException e11) {
                        c0.a aVar3 = c0.f12645d;
                        e11.toString();
                        v.i(g0Var);
                    }
                }
            } catch (Throwable th2) {
                i6.a.a(this, th2);
            }
        }
    }

    public final void f(String str, Bundle bundle) {
        if (i6.a.b(this)) {
            return;
        }
        try {
            e(str, null, bundle, true, x5.d.a());
        } catch (Throwable th2) {
            i6.a.a(this, th2);
        }
    }

    public final void g(BigDecimal bigDecimal, Currency currency, Bundle bundle) {
        g0 g0Var = g0.DEVELOPER_ERRORS;
        if (i6.a.b(this)) {
            return;
        }
        try {
            if (bigDecimal == null) {
                c0.a aVar = c0.f12645d;
                c0.a.a(g0Var, "AppEvents", "purchaseAmount cannot be null");
            } else if (currency == null) {
                c0.a aVar2 = c0.f12645d;
                c0.a.a(g0Var, "AppEvents", "currency cannot be null");
            } else {
                if (bundle == null) {
                    bundle = new Bundle();
                }
                Bundle bundle2 = bundle;
                bundle2.putString("fb_currency", currency.getCurrencyCode());
                e("fb_mobile_purchase", Double.valueOf(bigDecimal.doubleValue()), bundle2, true, x5.d.a());
                if (a.b() != k.EXPLICIT_ONLY) {
                    String str = i.f23913a;
                    i.c(p.EAGER_FLUSHING_EVENT);
                }
            }
        } catch (Throwable th2) {
            i6.a.a(this, th2);
        }
    }
}
