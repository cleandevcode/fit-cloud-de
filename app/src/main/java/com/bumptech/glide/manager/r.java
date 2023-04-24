package com.bumptech.glide.manager;

import android.annotation.SuppressLint;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkInfo;
import android.os.AsyncTask;
import android.os.Build;
import android.util.Log;
import com.bumptech.glide.manager.b;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class r {

    /* renamed from: d */
    public static volatile r f5757d;

    /* renamed from: a */
    public final c f5758a;

    /* renamed from: b */
    public final HashSet f5759b = new HashSet();

    /* renamed from: c */
    public boolean f5760c;

    /* loaded from: classes.dex */
    public class a implements m5.g<ConnectivityManager> {

        /* renamed from: a */
        public final /* synthetic */ Context f5761a;

        public a(Context context) {
            this.f5761a = context;
        }

        @Override // m5.g
        public final ConnectivityManager get() {
            return (ConnectivityManager) this.f5761a.getSystemService("connectivity");
        }
    }

    /* loaded from: classes.dex */
    public class b implements b.a {
        public b() {
            r.this = r1;
        }

        @Override // com.bumptech.glide.manager.b.a
        public final void a(boolean z10) {
            ArrayList arrayList;
            m5.l.a();
            synchronized (r.this) {
                arrayList = new ArrayList(r.this.f5759b);
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((b.a) it.next()).a(z10);
            }
        }
    }

    /* loaded from: classes.dex */
    public interface c {
        boolean a();

        void b();
    }

    /* loaded from: classes.dex */
    public static final class d implements c {

        /* renamed from: a */
        public boolean f5763a;

        /* renamed from: b */
        public final b.a f5764b;

        /* renamed from: c */
        public final m5.g<ConnectivityManager> f5765c;

        /* renamed from: d */
        public final a f5766d = new a();

        /* loaded from: classes.dex */
        public class a extends ConnectivityManager.NetworkCallback {
            public a() {
                d.this = r1;
            }

            @Override // android.net.ConnectivityManager.NetworkCallback
            public final void onAvailable(Network network) {
                m5.l.f().post(new t(this, true));
            }

            @Override // android.net.ConnectivityManager.NetworkCallback
            public final void onLost(Network network) {
                m5.l.f().post(new t(this, false));
            }
        }

        public d(m5.f fVar, b bVar) {
            this.f5765c = fVar;
            this.f5764b = bVar;
        }

        @Override // com.bumptech.glide.manager.r.c
        @SuppressLint({"MissingPermission"})
        public final boolean a() {
            Network activeNetwork;
            activeNetwork = this.f5765c.get().getActiveNetwork();
            this.f5763a = activeNetwork != null;
            try {
                this.f5765c.get().registerDefaultNetworkCallback(this.f5766d);
                return true;
            } catch (RuntimeException e10) {
                if (Log.isLoggable("ConnectivityMonitor", 5)) {
                    Log.w("ConnectivityMonitor", "Failed to register callback", e10);
                }
                return false;
            }
        }

        @Override // com.bumptech.glide.manager.r.c
        public final void b() {
            this.f5765c.get().unregisterNetworkCallback(this.f5766d);
        }
    }

    /* loaded from: classes.dex */
    public static final class e implements c {

        /* renamed from: g */
        public static final Executor f5768g = AsyncTask.SERIAL_EXECUTOR;

        /* renamed from: a */
        public final Context f5769a;

        /* renamed from: b */
        public final b.a f5770b;

        /* renamed from: c */
        public final m5.g<ConnectivityManager> f5771c;

        /* renamed from: d */
        public volatile boolean f5772d;

        /* renamed from: e */
        public volatile boolean f5773e;

        /* renamed from: f */
        public final a f5774f = new a();

        /* loaded from: classes.dex */
        public class a extends BroadcastReceiver {
            public a() {
                e.this = r1;
            }

            @Override // android.content.BroadcastReceiver
            public final void onReceive(Context context, Intent intent) {
                e eVar = e.this;
                eVar.getClass();
                e.f5768g.execute(new u(eVar));
            }
        }

        /* loaded from: classes.dex */
        public class b implements Runnable {
            public b() {
                e.this = r1;
            }

            @Override // java.lang.Runnable
            public final void run() {
                e eVar = e.this;
                eVar.f5772d = eVar.c();
                try {
                    e eVar2 = e.this;
                    eVar2.f5769a.registerReceiver(eVar2.f5774f, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
                    e.this.f5773e = true;
                } catch (SecurityException e10) {
                    if (Log.isLoggable("ConnectivityMonitor", 5)) {
                        Log.w("ConnectivityMonitor", "Failed to register", e10);
                    }
                    e.this.f5773e = false;
                }
            }
        }

        /* loaded from: classes.dex */
        public class c implements Runnable {
            public c() {
                e.this = r1;
            }

            @Override // java.lang.Runnable
            public final void run() {
                if (e.this.f5773e) {
                    e.this.f5773e = false;
                    e eVar = e.this;
                    eVar.f5769a.unregisterReceiver(eVar.f5774f);
                }
            }
        }

        public e(Context context, m5.f fVar, b bVar) {
            this.f5769a = context.getApplicationContext();
            this.f5771c = fVar;
            this.f5770b = bVar;
        }

        @Override // com.bumptech.glide.manager.r.c
        public final boolean a() {
            f5768g.execute(new b());
            return true;
        }

        @Override // com.bumptech.glide.manager.r.c
        public final void b() {
            f5768g.execute(new c());
        }

        @SuppressLint({"MissingPermission"})
        public final boolean c() {
            try {
                NetworkInfo activeNetworkInfo = this.f5771c.get().getActiveNetworkInfo();
                return activeNetworkInfo != null && activeNetworkInfo.isConnected();
            } catch (RuntimeException e10) {
                if (Log.isLoggable("ConnectivityMonitor", 5)) {
                    Log.w("ConnectivityMonitor", "Failed to determine connectivity status when connectivity changed", e10);
                }
                return true;
            }
        }
    }

    public r(Context context) {
        c eVar;
        m5.f fVar = new m5.f(new a(context));
        b bVar = new b();
        if (Build.VERSION.SDK_INT >= 24) {
            eVar = new d(fVar, bVar);
        } else {
            eVar = new e(context, fVar, bVar);
        }
        this.f5758a = eVar;
    }

    public static r a(Context context) {
        if (f5757d == null) {
            synchronized (r.class) {
                if (f5757d == null) {
                    f5757d = new r(context.getApplicationContext());
                }
            }
        }
        return f5757d;
    }
}
