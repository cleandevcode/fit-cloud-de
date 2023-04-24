package m3;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.os.Build;
import f3.m;

/* loaded from: classes.dex */
public final class g extends d<k3.b> {

    /* renamed from: j */
    public static final String f20342j = m.e("NetworkStateTracker");

    /* renamed from: g */
    public final ConnectivityManager f20343g;

    /* renamed from: h */
    public b f20344h;

    /* renamed from: i */
    public a f20345i;

    /* loaded from: classes.dex */
    public class a extends BroadcastReceiver {
        public a() {
            g.this = r1;
        }

        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            if (intent == null || intent.getAction() == null || !intent.getAction().equals("android.net.conn.CONNECTIVITY_CHANGE")) {
                return;
            }
            m.c().a(g.f20342j, "Network broadcast received", new Throwable[0]);
            g gVar = g.this;
            gVar.b(gVar.e());
        }
    }

    /* loaded from: classes.dex */
    public class b extends ConnectivityManager.NetworkCallback {
        public b() {
            g.this = r1;
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public final void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
            m.c().a(g.f20342j, String.format("Network capabilities changed: %s", networkCapabilities), new Throwable[0]);
            g gVar = g.this;
            gVar.b(gVar.e());
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public final void onLost(Network network) {
            m.c().a(g.f20342j, "Network connection lost", new Throwable[0]);
            g gVar = g.this;
            gVar.b(gVar.e());
        }
    }

    public g(Context context, r3.a aVar) {
        super(context, aVar);
        boolean z10;
        this.f20343g = (ConnectivityManager) this.f20336b.getSystemService("connectivity");
        if (Build.VERSION.SDK_INT >= 24) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            this.f20344h = new b();
        } else {
            this.f20345i = new a();
        }
    }

    @Override // m3.d
    public final k3.b a() {
        return e();
    }

    @Override // m3.d
    public final void c() {
        boolean z10;
        if (Build.VERSION.SDK_INT >= 24) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            try {
                m.c().a(f20342j, "Registering network callback", new Throwable[0]);
                this.f20343g.registerDefaultNetworkCallback(this.f20344h);
                return;
            } catch (IllegalArgumentException | SecurityException e10) {
                m.c().b(f20342j, "Received exception while registering network callback", e10);
                return;
            }
        }
        m.c().a(f20342j, "Registering broadcast receiver", new Throwable[0]);
        this.f20336b.registerReceiver(this.f20345i, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
    }

    @Override // m3.d
    public final void d() {
        boolean z10;
        if (Build.VERSION.SDK_INT >= 24) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            try {
                m.c().a(f20342j, "Unregistering network callback", new Throwable[0]);
                this.f20343g.unregisterNetworkCallback(this.f20344h);
                return;
            } catch (IllegalArgumentException | SecurityException e10) {
                m.c().b(f20342j, "Received exception while unregistering network callback", e10);
                return;
            }
        }
        m.c().a(f20342j, "Unregistering broadcast receiver", new Throwable[0]);
        this.f20336b.unregisterReceiver(this.f20345i);
    }

    public final k3.b e() {
        boolean z10;
        Network activeNetwork;
        NetworkCapabilities networkCapabilities;
        boolean z11;
        NetworkInfo activeNetworkInfo = this.f20343g.getActiveNetworkInfo();
        boolean z12 = false;
        if (activeNetworkInfo != null && activeNetworkInfo.isConnected()) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (Build.VERSION.SDK_INT >= 23) {
            try {
                activeNetwork = this.f20343g.getActiveNetwork();
                networkCapabilities = this.f20343g.getNetworkCapabilities(activeNetwork);
            } catch (SecurityException e10) {
                m.c().b(f20342j, "Unable to validate active network", e10);
            }
            if (networkCapabilities != null) {
                if (networkCapabilities.hasCapability(16)) {
                    z11 = true;
                    boolean a10 = e1.a.a(this.f20343g);
                    if (activeNetworkInfo != null && !activeNetworkInfo.isRoaming()) {
                        z12 = true;
                    }
                    return new k3.b(z10, z11, a10, z12);
                }
            }
        }
        z11 = false;
        boolean a102 = e1.a.a(this.f20343g);
        if (activeNetworkInfo != null) {
            z12 = true;
        }
        return new k3.b(z10, z11, a102, z12);
    }
}
