package com.mob.tools.utils;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.LinkProperties;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.net.NetworkRequest;
import android.os.Build;
import android.text.TextUtils;
import com.mob.commons.j;
import com.mob.tools.MobLog;
import com.mob.tools.a.k;
import com.mob.tools.proguard.PublicMemberKeeper;
import com.mob.tools.utils.DH;

/* loaded from: classes.dex */
public class NtFetcher implements PublicMemberKeeper {

    /* renamed from: a */
    private static NtFetcher f9331a;

    /* renamed from: b */
    private Context f9332b;

    /* renamed from: c */
    private BroadcastReceiver f9333c;

    /* renamed from: d */
    private String f9334d;

    /* renamed from: e */
    private Integer f9335e;

    private NtFetcher(Context context) {
        this.f9332b = context;
        if (DH.SyncMtd.isSensitiveDevice()) {
            a();
        }
    }

    @SuppressLint({"MissingPermission"})
    private void a() {
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) DH.SyncMtd.getSystemServiceSafe("connectivity");
            if (Build.VERSION.SDK_INT >= 26 && DH.SyncMtd.checkPermission(j.a("039%bdbiHfTbfcabc$fRcj+cg'bf:j3bcdedebccabicjcheeeeebcfcfbbcdebcgfadjecfhbbcfcgchcgeb"))) {
                connectivityManager.registerDefaultNetworkCallback(b());
            } else if (DH.SyncMtd.checkPermission(j.a("039%bdbiLfKbfcabcGf$cj4cgLbf0jQbcdedebccabicjcheeeeebcfcfbbcdebcgfadjecfhbbcfcgchcgeb"))) {
                connectivityManager.registerNetworkCallback(new NetworkRequest.Builder().build(), b());
            } else {
                e();
            }
        } catch (Throwable th2) {
            MobLog.getInstance().d(th2);
        }
    }

    @TargetApi(21)
    private ConnectivityManager.NetworkCallback b() {
        return new ConnectivityManager.NetworkCallback() { // from class: com.mob.tools.utils.NtFetcher.1
            @Override // android.net.ConnectivityManager.NetworkCallback
            public void onAvailable(Network network) {
                super.onAvailable(network);
                NtFetcher.this.c();
            }

            @Override // android.net.ConnectivityManager.NetworkCallback
            public void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
                super.onCapabilitiesChanged(network, networkCapabilities);
            }

            @Override // android.net.ConnectivityManager.NetworkCallback
            public void onLinkPropertiesChanged(Network network, LinkProperties linkProperties) {
                super.onLinkPropertiesChanged(network, linkProperties);
            }

            @Override // android.net.ConnectivityManager.NetworkCallback
            public void onLosing(Network network, int i10) {
                super.onLosing(network, i10);
            }

            @Override // android.net.ConnectivityManager.NetworkCallback
            public void onLost(Network network) {
                super.onLost(network);
                NtFetcher.this.c();
            }

            @Override // android.net.ConnectivityManager.NetworkCallback
            public void onUnavailable() {
                super.onUnavailable();
            }
        };
    }

    public void c() {
        this.f9334d = g();
        this.f9335e = Integer.valueOf(d());
    }

    private int d() {
        if (DH.SyncMtd.getSystemServiceSafe("phone") == null) {
            return -1;
        }
        try {
            if (DH.SyncMtd.checkPermission(j.a("035^bdbiGfTbfcabcKf.cjYcg5bfXjDbcdedebccabicjecebchdgbbeffbdjcdebbbcfcgchcgeb"))) {
                return Build.VERSION.SDK_INT >= 24 ? k.a(this.f9332b).a().c() : k.a(this.f9332b).a().b();
            }
            return -1;
        } catch (Throwable th2) {
            MobLog.getInstance().w(th2);
            return -1;
        }
    }

    private void e() {
        this.f9333c = new BroadcastReceiver() { // from class: com.mob.tools.utils.NtFetcher.2
            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context, Intent intent) {
                try {
                    if (intent.getAction().equalsIgnoreCase("android.net.conn.CONNECTIVITY_CHANGE")) {
                        NtFetcher.this.c();
                    }
                } catch (Throwable th2) {
                    MobLog.getInstance().d(th2);
                }
            }
        };
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
        try {
            if (Build.VERSION.SDK_INT < 33) {
                ReflectHelper.invokeInstanceMethod(this.f9332b, j.a("016Bbf_g8ddbcde>bg$bfecPgAbeSg9bcEhgHbf"), new Object[]{this.f9333c, intentFilter}, new Class[]{BroadcastReceiver.class, IntentFilter.class});
            } else {
                ReflectHelper.invokeInstanceMethod(this.f9332b, j.a("016EbfJgXddbcdeHbg'bfec(g@beTgTbcRhgNbf"), new Object[]{this.f9333c, intentFilter, 4}, new Class[]{BroadcastReceiver.class, IntentFilter.class, Integer.TYPE});
            }
        } catch (Throwable unused) {
        }
    }

    private void f() {
        if (this.f9333c != null) {
            try {
                ReflectHelper.invokeInstanceMethod(this.f9332b, j.a("018(babibf+g5ddbcde'bgWbfec1g6be5g<bc.hgVbf"), new Object[]{this.f9333c}, new Class[]{BroadcastReceiver.class});
            } catch (Throwable unused) {
            }
            this.f9333c = null;
        }
    }

    private String g() {
        Object systemServiceSafe;
        NetworkInfo activeNetworkInfo;
        try {
            if (DH.SyncMtd.checkPermission(j.a("039Kbdbi+f1bfcabc(f]cj2cg.bfXjCbcdedebccabicjcheeeeebcfcfbbcdebcgfadjecfhbbcfcgchcgeb")) && (systemServiceSafe = DH.SyncMtd.getSystemServiceSafe("connectivity")) != null && (activeNetworkInfo = ((ConnectivityManager) systemServiceSafe).getActiveNetworkInfo()) != null && activeNetworkInfo.isAvailable()) {
                int type = activeNetworkInfo.getType();
                if (type == 0) {
                    if (h()) {
                        return j.a("002Pfcfi");
                    }
                    if (l()) {
                        return j.a("002Khgfi");
                    }
                    return j.a(m() ? "002(hafi" : "002Geifi");
                } else if (type != 1) {
                    switch (type) {
                        case 6:
                            return j.a("005Bdbbc3jXbdbj");
                        case 7:
                            return j.a("0097dacbbaQgb'caca0ba");
                        case 8:
                            return j.a("005fUba)jj,bg");
                        case 9:
                            return j.a("008gbag-bfbiHgb");
                        default:
                            return String.valueOf(type);
                    }
                } else {
                    return j.a("0049dbbcdfbc");
                }
            }
        } catch (Throwable th2) {
            MobLog.getInstance().w(th2);
        }
        return j.a("004]bicabi7g");
    }

    public static NtFetcher getInstance(Context context) {
        if (f9331a == null) {
            synchronized (NtFetcher.class) {
                if (f9331a == null) {
                    f9331a = new NtFetcher(context);
                }
            }
        }
        return f9331a;
    }

    private boolean h() {
        if (i() || j()) {
            return true;
        }
        return k();
    }

    private boolean i() {
        try {
            Object systemServiceSafe = DH.SyncMtd.getSystemServiceSafe("phone");
            if (systemServiceSafe != null && DH.SyncMtd.checkPermission(j.a("035,bdbi(fIbfcabc'fQcjVcg)bf=j*bcdedebccabicjecebchdgbbeffbdjcdebbbcfcgchcgeb"))) {
                String manufacturer = DH.SyncMtd.getManufacturer();
                if (!TextUtils.isEmpty(manufacturer) && ((manufacturer.contains(j.a("006a.babddb0g8bc")) || manufacturer.contains(j.a("006 fbbabddbLgAbc")) || manufacturer.contains(j.a("006*fbccchfaebce"))) && Build.VERSION.SDK_INT >= 29)) {
                    if (((Integer) ReflectHelper.invokeInstanceMethod(ReflectHelper.invokeInstanceMethod(systemServiceSafe, j.a("015%ddDgb[cfOg_bfGh(bcbeAgQcf'bVbdPbg"), new Object[0]), j.a("016*dd9gb<fbdbcd^gbPdbcabfbhcgbg5cg"), new Object[0])).intValue() == 20) {
                        return true;
                    }
                }
            }
        } catch (Throwable th2) {
            MobLog.getInstance().w(th2);
        }
        return false;
    }

    private boolean j() {
        try {
            Object systemServiceSafe = DH.SyncMtd.getSystemServiceSafe("phone");
            if (systemServiceSafe != null && DH.SyncMtd.checkPermission(j.a("0354bdbi8f bfcabc fAcj5cg?bf%jMbcdedebccabicjecebchdgbbeffbdjcdebbbcfcgchcgeb")) && Build.VERSION.SDK_INT >= 26) {
                return ((Integer) ReflectHelper.invokeInstanceMethod(ReflectHelper.invokeInstanceMethod(systemServiceSafe, j.a("0152ddGgbNcfSgSbf4hUbcbeDg6cfMbGbd*bg"), new Object[0]), j.a("010Fdd]gbRcdbfcf bKbdAbg"), new Object[0])).intValue() == 3;
            }
            return false;
        } catch (Throwable unused) {
            return false;
        }
    }

    private boolean k() {
        try {
            return k.a(this.f9332b).a().b() == 20;
        } catch (Throwable th2) {
            MobLog.getInstance().w(th2);
            return false;
        }
    }

    private boolean l() {
        return k.a(this.f9332b).a().b() == 13;
    }

    private boolean m() {
        if (DH.SyncMtd.getSystemServiceSafe("phone") == null) {
            return false;
        }
        try {
            switch (k.a(this.f9332b).a().b()) {
                case 3:
                case 5:
                case 6:
                case 8:
                case 9:
                case 10:
                case 12:
                case 13:
                case 14:
                case 15:
                    return true;
            }
        } catch (Throwable th2) {
            MobLog.getInstance().w(th2);
        }
        return false;
    }

    @Deprecated
    public synchronized int getDtNtType() {
        if (!DH.SyncMtd.isSensitiveDevice() || this.f9335e == null) {
            this.f9335e = Integer.valueOf(d());
        }
        return this.f9335e.intValue();
    }

    public synchronized String getNtType() {
        if (!DH.SyncMtd.isSensitiveDevice() || TextUtils.isEmpty(this.f9334d)) {
            this.f9334d = g();
        }
        return this.f9334d;
    }

    public void recycle() {
        f();
    }
}
