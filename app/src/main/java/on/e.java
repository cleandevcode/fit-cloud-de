package on;

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.IBinder;
import android.util.Log;
import android.util.SparseArray;
import bi.m0;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import on.g;
import org.eclipse.paho.android.service.MqttService;
import pn.o;
import qn.p;

/* loaded from: classes2.dex */
public final class e extends BroadcastReceiver implements pn.b {

    /* renamed from: p */
    public static final ExecutorService f23662p = Executors.newCachedThreadPool();

    /* renamed from: b */
    public MqttService f23664b;

    /* renamed from: c */
    public String f23665c;

    /* renamed from: d */
    public Context f23666d;

    /* renamed from: g */
    public final String f23669g;

    /* renamed from: h */
    public final String f23670h;

    /* renamed from: i */
    public pn.k f23671i;

    /* renamed from: j */
    public pn.l f23672j;

    /* renamed from: k */
    public k f23673k;

    /* renamed from: l */
    public pn.i f23674l;

    /* renamed from: a */
    public final b f23663a = new b();

    /* renamed from: e */
    public final SparseArray<pn.e> f23667e = new SparseArray<>();

    /* renamed from: f */
    public int f23668f = 0;

    /* renamed from: n */
    public volatile boolean f23676n = false;

    /* renamed from: o */
    public volatile boolean f23677o = false;

    /* renamed from: m */
    public final int f23675m = 1;

    /* loaded from: classes2.dex */
    public class a implements Runnable {
        public a() {
            e.this = r1;
        }

        @Override // java.lang.Runnable
        public final void run() {
            e.b(e.this);
            if (!e.this.f23676n) {
                e eVar = e.this;
                eVar.getClass();
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("MqttService.callbackToActivity.v0");
                g2.a.a(eVar.f23666d).b(eVar, intentFilter);
                eVar.f23676n = true;
            }
        }
    }

    /* loaded from: classes2.dex */
    public final class b implements ServiceConnection {
        public b() {
            e.this = r1;
        }

        @Override // android.content.ServiceConnection
        public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            e eVar = e.this;
            eVar.f23664b = ((j) iBinder).f23704a;
            eVar.f23677o = true;
            e.b(e.this);
        }

        @Override // android.content.ServiceConnection
        public final void onServiceDisconnected(ComponentName componentName) {
            e.this.f23664b = null;
        }
    }

    public e(Context context, String str, String str2) {
        this.f23671i = null;
        this.f23666d = context;
        this.f23669g = str;
        this.f23670h = str2;
        this.f23671i = null;
    }

    public static void b(e eVar) {
        if (eVar.f23665c == null) {
            MqttService mqttService = eVar.f23664b;
            String str = eVar.f23669g;
            String str2 = eVar.f23670h;
            String str3 = eVar.f23666d.getApplicationInfo().packageName;
            pn.k kVar = eVar.f23671i;
            mqttService.getClass();
            String str4 = str + ":" + str2 + ":" + str3;
            if (!mqttService.f23720g.containsKey(str4)) {
                mqttService.f23720g.put(str4, new g(mqttService, str, str2, kVar, str4));
            }
            eVar.f23665c = str4;
        }
        MqttService mqttService2 = eVar.f23664b;
        mqttService2.f23715b = false;
        mqttService2.f23714a = eVar.f23665c;
        try {
            eVar.f23664b.c(eVar.f23665c, eVar.f23672j, eVar.h(eVar.f23673k));
        } catch (pn.n e10) {
            k kVar2 = eVar.f23673k;
            pn.a aVar = kVar2.f23705a;
            if (aVar != null) {
                aVar.b(kVar2, e10);
            }
        }
    }

    @Override // pn.b
    public final String a() {
        return this.f23670h;
    }

    public final pn.e c(pn.l lVar, Object obj, pn.a aVar) {
        pn.a aVar2;
        k kVar = new k(this, aVar);
        this.f23672j = lVar;
        this.f23673k = kVar;
        if (this.f23664b == null) {
            Intent intent = new Intent();
            intent.setClassName(this.f23666d, "org.eclipse.paho.android.service.MqttService");
            if (this.f23666d.startService(intent) == null && (aVar2 = kVar.f23705a) != null) {
                aVar2.b(kVar, new RuntimeException("cannot start service org.eclipse.paho.android.service.MqttService"));
            }
            this.f23666d.bindService(intent, this.f23663a, 1);
            if (!this.f23676n) {
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("MqttService.callbackToActivity.v0");
                g2.a.a(this.f23666d).b(this, intentFilter);
                this.f23676n = true;
            }
        } else {
            f23662p.execute(new a());
        }
        return kVar;
    }

    public final boolean d() {
        MqttService mqttService;
        boolean z10;
        String str = this.f23665c;
        if (str == null || (mqttService = this.f23664b) == null) {
            return false;
        }
        pn.h hVar = mqttService.d(str).f23688g;
        if (hVar != null && hVar.f24430c.f()) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            return false;
        }
        return true;
    }

    public final pn.c e(String str, o oVar, pn.a aVar) {
        pn.m mVar;
        i iVar = new i(this, (ck.b) aVar);
        String h10 = h(iVar);
        g d10 = this.f23664b.d(this.f23665c);
        Bundle bundle = new Bundle();
        bundle.putString("MqttService.callbackAction", "send");
        bundle.putString("MqttService.activityToken", h10);
        pn.m mVar2 = null;
        bundle.putString("MqttService.invocationContext", null);
        pn.h hVar = d10.f23688g;
        if (hVar != null && hVar.f24430c.f()) {
            g.b bVar = new g.b(bundle);
            try {
                pn.h hVar2 = d10.f23688g;
                hVar2.getClass();
                un.b bVar2 = pn.h.f24425k;
                String str2 = pn.h.f24424j;
                bVar2.g(str2, "publish", "111", new Object[]{str, null, bVar});
                gm.f.i(str, false);
                mVar = new pn.m(hVar2.f24428a);
                p pVar = mVar.f24452a;
                pVar.f25139k = bVar;
                pVar.f25140l = null;
                pVar.f25136h = new String[]{str};
                tn.o oVar2 = new tn.o(str, oVar);
                qn.a aVar2 = hVar2.f24430c;
                if (!aVar2.f() && ((aVar2.f() || !(oVar2 instanceof tn.d)) && (!aVar2.h() || !(oVar2 instanceof tn.e)))) {
                    qn.a.f24996q.c(qn.a.f24995p, "sendNoWait", "208");
                    throw m0.h(32104);
                }
                aVar2.d(mVar, oVar2);
                bVar2.c(str2, "publish", "112");
            } catch (Exception e10) {
                e = e10;
            }
            try {
                d10.f23694m.put(mVar, str);
                d10.f23695n.put(mVar, oVar);
                d10.f23696o.put(mVar, h10);
                d10.f23697p.put(mVar, null);
                mVar2 = mVar;
            } catch (Exception e11) {
                e = e11;
                mVar2 = mVar;
                d10.h(bundle, e);
                iVar.f23709e = mVar2;
                return iVar;
            }
        } else {
            Log.i("MqttConnection", "Client is not connected, so not sending message");
            bundle.putString("MqttService.errorMessage", "not connected");
            d10.f23690i.h("send", "not connected");
            d10.f23690i.b(d10.f23686e, n.ERROR, bundle);
        }
        iVar.f23709e = mVar2;
        return iVar;
    }

    public final synchronized pn.e f(Bundle bundle) {
        String string = bundle.getString("MqttService.activityToken");
        if (string != null) {
            int parseInt = Integer.parseInt(string);
            pn.e eVar = this.f23667e.get(parseInt);
            this.f23667e.delete(parseInt);
            return eVar;
        }
        return null;
    }

    public final void g(pn.e eVar, Bundle bundle) {
        if (eVar != null) {
            if (((n) bundle.getSerializable("MqttService.callbackStatus")) == n.OK) {
                k kVar = (k) eVar;
                synchronized (kVar.f23706b) {
                    kVar.f23706b.notifyAll();
                    pn.a aVar = kVar.f23705a;
                    if (aVar != null) {
                        aVar.a(kVar);
                    }
                }
                return;
            }
            Exception exc = (Exception) bundle.getSerializable("MqttService.exception");
            k kVar2 = (k) eVar;
            synchronized (kVar2.f23706b) {
                if (exc instanceof pn.n) {
                    pn.n nVar = (pn.n) exc;
                } else {
                    new pn.n(exc);
                }
                kVar2.f23706b.notifyAll();
                if (exc instanceof pn.n) {
                    pn.n nVar2 = (pn.n) exc;
                }
                pn.a aVar2 = kVar2.f23705a;
                if (aVar2 != null) {
                    aVar2.b(kVar2, exc);
                }
            }
            return;
        }
        this.f23664b.h("MqttService", "simpleAction : token is null");
    }

    public final synchronized String h(k kVar) {
        int i10;
        this.f23667e.put(this.f23668f, kVar);
        i10 = this.f23668f;
        this.f23668f = i10 + 1;
        return Integer.toString(i10);
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        pn.e eVar;
        Bundle extras = intent.getExtras();
        String string = extras.getString("MqttService.clientHandle");
        if (string != null && string.equals(this.f23665c)) {
            String string2 = extras.getString("MqttService.callbackAction");
            if ("connect".equals(string2)) {
                k kVar = this.f23673k;
                f(extras);
                g(kVar, extras);
            } else if ("connectExtended".equals(string2)) {
                if (this.f23674l instanceof pn.j) {
                    boolean z10 = extras.getBoolean("MqttService.reconnect", false);
                    ((pn.j) this.f23674l).d(extras.getString("MqttService.serverURI"), z10);
                }
            } else if ("messageArrived".equals(string2)) {
                if (this.f23674l != null) {
                    String string3 = extras.getString("MqttService.messageId");
                    String string4 = extras.getString("MqttService.destinationName");
                    m mVar = (m) extras.getParcelable("MqttService.PARCEL");
                    try {
                        if (this.f23675m == 1) {
                            this.f23674l.a(string4, mVar);
                            this.f23664b.a(this.f23665c, string3);
                        } else {
                            mVar.f23710g = string3;
                            this.f23674l.a(string4, mVar);
                        }
                    } catch (Exception unused) {
                    }
                }
            } else if ("subscribe".equals(string2)) {
                g(f(extras), extras);
            } else if ("unsubscribe".equals(string2)) {
                g(f(extras), extras);
            } else if ("send".equals(string2)) {
                synchronized (this) {
                    eVar = this.f23667e.get(Integer.parseInt(extras.getString("MqttService.activityToken")));
                }
                g(eVar, extras);
            } else if ("messageDelivered".equals(string2)) {
                pn.e f10 = f(extras);
                if (f10 != null && this.f23674l != null && ((n) extras.getSerializable("MqttService.callbackStatus")) == n.OK && (f10 instanceof pn.c)) {
                    this.f23674l.c((pn.c) f10);
                }
            } else if ("onConnectionLost".equals(string2)) {
                if (this.f23674l != null) {
                    this.f23674l.b((Exception) extras.getSerializable("MqttService.exception"));
                }
            } else if ("disconnect".equals(string2)) {
                this.f23665c = null;
                pn.e f11 = f(extras);
                if (f11 != null) {
                    k kVar2 = (k) f11;
                    synchronized (kVar2.f23706b) {
                        kVar2.f23706b.notifyAll();
                        pn.a aVar = kVar2.f23705a;
                        if (aVar != null) {
                            aVar.a(kVar2);
                        }
                    }
                }
                pn.i iVar = this.f23674l;
                if (iVar != null) {
                    iVar.b(null);
                }
            } else if (!"trace".equals(string2)) {
                this.f23664b.h("MqttService", "Callback action doesn't exist.");
            }
        }
    }
}
