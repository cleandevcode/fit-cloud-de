package com.huawei.hms.scankit.p;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import com.huawei.hms.feature.DynamicModuleInitializer;
import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import com.huawei.hms.framework.network.grs.GrsClient;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: com.huawei.hms.scankit.p.rb */
/* loaded from: classes.dex */
public class C0710rb {

    /* renamed from: a */
    private static volatile C0710rb f8043a = new C0710rb();

    /* renamed from: d */
    private volatile boolean f8046d;

    /* renamed from: e */
    private volatile long f8047e;

    /* renamed from: b */
    private Timer f8044b = new Timer();

    /* renamed from: c */
    private volatile boolean f8045c = true;

    /* renamed from: f */
    private final Lock f8048f = new ReentrantLock();

    /* renamed from: g */
    private List<a> f8049g = new ArrayList(5);

    /* renamed from: com.huawei.hms.scankit.p.rb$a */
    /* loaded from: classes.dex */
    public class a {

        /* renamed from: a */
        private String f8050a;

        /* renamed from: b */
        private LinkedHashMap<String, String> f8051b;

        private a(String str, LinkedHashMap<String, String> linkedHashMap) {
            C0710rb.this = r1;
            this.f8050a = str;
            this.f8051b = linkedHashMap;
        }

        public /* synthetic */ a(C0710rb c0710rb, String str, LinkedHashMap linkedHashMap, C0707qb c0707qb) {
            this(str, linkedHashMap);
        }
    }

    /* renamed from: com.huawei.hms.scankit.p.rb$b */
    /* loaded from: classes.dex */
    public class b extends TimerTask {
        private b() {
            C0710rb.this = r1;
        }

        public /* synthetic */ b(C0710rb c0710rb, C0707qb c0707qb) {
            this();
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            try {
                C0710rb.this.f8045c = true;
                rm.l.q();
            } catch (Exception e10) {
                com.huawei.hms.scankit.util.a.b("ScanHiAnalytics", e10.getMessage());
            }
        }
    }

    private C0710rb() {
    }

    public static C0710rb a() {
        return f8043a;
    }

    private String a(Context context) {
        try {
            GrsBaseInfo grsBaseInfo = new GrsBaseInfo();
            String a10 = new C0643ab(context, false).a();
            StringBuilder sb2 = new StringBuilder();
            sb2.append("getCollectURL:localCountryCode ");
            sb2.append(a10);
            Log.i("ScanHiAnalytics", sb2.toString());
            if (a10 != null && !a10.isEmpty() && !GrsBaseInfo.CountryCodeSource.UNKNOWN.equals(a10)) {
                grsBaseInfo.setSerCountry(a10.toUpperCase(Locale.ENGLISH));
            }
            GrsClient grsClient = new GrsClient(context, grsBaseInfo);
            String synGetGrsUrl = grsClient.synGetGrsUrl("com.huawei.cloud.mlkithianalytics", "ROOTNEW");
            if (TextUtils.isEmpty(synGetGrsUrl)) {
                synGetGrsUrl = grsClient.synGetGrsUrl("com.huawei.cloud.mlkithianalytics", "ROOT");
            }
            StringBuilder sb3 = new StringBuilder();
            sb3.append("grs get url success: ");
            sb3.append(synGetGrsUrl);
            sb3.append("  countryCode = ");
            sb3.append(grsBaseInfo.getSerCountry());
            Log.i("ScanHiAnalytics", sb3.toString());
            return synGetGrsUrl;
        } catch (RuntimeException | Exception unused) {
            return null;
        }
    }

    private synchronized void b() {
        this.f8046d = true;
        for (a aVar : this.f8049g) {
            c(aVar.f8050a, aVar.f8051b);
        }
        this.f8049g = null;
    }

    private synchronized void b(String str, LinkedHashMap<String, String> linkedHashMap) {
        if (this.f8046d) {
            c(str, linkedHashMap);
        } else if (this.f8049g.size() >= 100) {
        } else {
            this.f8049g.add(new a(this, str, linkedHashMap, null));
        }
    }

    private void c() {
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - this.f8047e > 6000) {
            this.f8047e = currentTimeMillis;
            new C0707qb(this, "ScanHiAnalytics").start();
        }
    }

    private void c(String str, LinkedHashMap<String, String> linkedHashMap) {
        rm.l.p(linkedHashMap, str, 0);
        rm.l.p(linkedHashMap, str, 1);
        if (this.f8045c) {
            this.f8045c = false;
            this.f8044b.schedule(new b(this, null), 3000L);
        }
        com.huawei.hms.scankit.util.a.a("ScanHiAnalytics", linkedHashMap.toString());
    }

    public void d() {
        String a10;
        if (!this.f8048f.tryLock() || this.f8046d) {
            return;
        }
        try {
            Context context = DynamicModuleInitializer.getContext();
            if (context != null && (a10 = a(context)) != null && !a10.isEmpty()) {
                rm.l.j(context, a10, context.getPackageName());
                rm.l.d();
                b();
            }
        } finally {
            this.f8048f.unlock();
        }
    }

    public void a(String str, LinkedHashMap<String, String> linkedHashMap) {
        if (this.f8046d) {
            c(str, linkedHashMap);
            return;
        }
        b(str, linkedHashMap);
        c();
    }
}
