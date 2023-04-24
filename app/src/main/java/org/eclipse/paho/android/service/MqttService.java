package org.eclipse.paho.android.service;

import android.annotation.SuppressLint;
import android.app.Service;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.os.IBinder;
import android.os.PowerManager;
import android.support.v4.media.d;
import android.util.Log;
import java.io.File;
import java.util.concurrent.ConcurrentHashMap;
import on.c;
import on.f;
import on.g;
import on.h;
import on.j;
import on.l;
import pn.n;
import pn.q;

@SuppressLint({"Registered"})
/* loaded from: classes2.dex */
public class MqttService extends Service implements l {

    /* renamed from: a */
    public String f23714a;

    /* renamed from: c */
    public c f23716c;

    /* renamed from: d */
    public a f23717d;

    /* renamed from: f */
    public j f23719f;

    /* renamed from: b */
    public boolean f23715b = false;

    /* renamed from: e */
    public volatile boolean f23718e = true;

    /* renamed from: g */
    public ConcurrentHashMap f23720g = new ConcurrentHashMap();

    /* loaded from: classes2.dex */
    public class a extends BroadcastReceiver {
        public a() {
            MqttService.this = r1;
        }

        @Override // android.content.BroadcastReceiver
        @SuppressLint({"Wakelock"})
        public final void onReceive(Context context, Intent intent) {
            Bundle bundle;
            MqttService mqttService;
            String str;
            String str2;
            MqttService.this.g("MqttService", "Internal network status receive.");
            PowerManager.WakeLock newWakeLock = ((PowerManager) MqttService.this.getSystemService("power")).newWakeLock(1, "MQTT");
            newWakeLock.acquire();
            MqttService.this.g("MqttService", "Reconnect for Network recovery.");
            if (MqttService.this.e()) {
                MqttService.this.g("MqttService", "Online,reconnect.");
                MqttService mqttService2 = MqttService.this;
                mqttService2.getClass();
                mqttService2.g("MqttService", "Reconnect to server, client size=" + mqttService2.f23720g.size());
                for (g gVar : mqttService2.f23720g.values()) {
                    mqttService2.g("Reconnect Client:", gVar.f23683b + '/' + gVar.f23682a);
                    if (mqttService2.e()) {
                        synchronized (gVar) {
                            if (gVar.f23688g == null) {
                                gVar.f23690i.h("MqttConnection", "Reconnect myClient = null. Will not do reconnect");
                            } else {
                                if (gVar.f23693l) {
                                    mqttService = gVar.f23690i;
                                    str = "MqttConnection";
                                    str2 = "The client is connecting. Reconnect return directly.";
                                } else if (!gVar.f23690i.e()) {
                                    mqttService = gVar.f23690i;
                                    str = "MqttConnection";
                                    str2 = "The network is not reachable. Will not do reconnect";
                                } else {
                                    if (gVar.f23685d.f24443f) {
                                        Log.i("MqttConnection", "Requesting Automatic reconnect using New Java AC");
                                        bundle = new Bundle();
                                        bundle.putString("MqttService.activityToken", gVar.f23687f);
                                        bundle.putString("MqttService.invocationContext", null);
                                        bundle.putString("MqttService.callbackAction", "connect");
                                        try {
                                            gVar.f23688g.g();
                                        } catch (n e10) {
                                            e = e10;
                                            Log.e("MqttConnection", "Exception occurred attempting to reconnect: " + e.getMessage());
                                            gVar.k(false);
                                            gVar.h(bundle, e);
                                        }
                                    } else if (gVar.f23691j && !gVar.f23692k) {
                                        gVar.f23690i.g("MqttConnection", "Do Real Reconnect!");
                                        bundle = new Bundle();
                                        bundle.putString("MqttService.activityToken", gVar.f23687f);
                                        bundle.putString("MqttService.invocationContext", null);
                                        bundle.putString("MqttService.callbackAction", "connect");
                                        try {
                                            gVar.f23688g.c(gVar.f23685d, null, new h(gVar, bundle, bundle));
                                            gVar.k(true);
                                        } catch (n e11) {
                                            e = e11;
                                            MqttService mqttService3 = gVar.f23690i;
                                            mqttService3.h("MqttConnection", "Cannot reconnect to remote server." + e.getMessage());
                                            gVar.k(false);
                                            gVar.h(bundle, e);
                                        } catch (Exception e12) {
                                            MqttService mqttService4 = gVar.f23690i;
                                            mqttService4.h("MqttConnection", "Cannot reconnect to remote server." + e12.getMessage());
                                            gVar.k(false);
                                            gVar.h(bundle, new n(6, e12.getCause()));
                                        }
                                    }
                                }
                                mqttService.g(str, str2);
                            }
                        }
                    }
                }
            } else {
                for (g gVar2 : MqttService.this.f23720g.values()) {
                    if (!gVar2.f23691j && !gVar2.f23692k) {
                        gVar2.b(new Exception("Android offline"));
                    }
                }
            }
            newWakeLock.release();
        }
    }

    public final void a(String str, String str2) {
        c cVar = this.f23716c;
        cVar.f23655a = cVar.f23656b.getWritableDatabase();
        MqttService mqttService = cVar.f23657c;
        mqttService.g("DatabaseMessageStore", "discardArrived{" + str + "}, {" + str2 + "}");
        try {
            int delete = cVar.f23655a.delete("MqttArrivedMessageTable", "messageId=? AND clientHandle=?", new String[]{str2, str});
            if (delete != 1) {
                MqttService mqttService2 = cVar.f23657c;
                mqttService2.h("DatabaseMessageStore", "discardArrived - Error deleting message {" + str2 + "} from database: Rows affected = " + delete);
                return;
            }
            int b10 = cVar.b(str);
            MqttService mqttService3 = cVar.f23657c;
            mqttService3.g("DatabaseMessageStore", "discardArrived - Message deleted successfully. - messages in db for this clientHandle " + b10);
        } catch (SQLException e10) {
            cVar.f23657c.i("DatabaseMessageStore", "discardArrived", e10);
            throw e10;
        }
    }

    public final void b(String str, on.n nVar, Bundle bundle) {
        Intent intent = new Intent("MqttService.callbackToActivity.v0");
        if (str != null) {
            intent.putExtra("MqttService.clientHandle", str);
        }
        intent.putExtra("MqttService.callbackStatus", nVar);
        if (bundle != null) {
            intent.putExtras(bundle);
        }
        g2.a.a(this).c(intent);
    }

    public final void c(String str, pn.l lVar, String str2) {
        g d10 = d(str);
        d10.f23685d = lVar;
        d10.f23687f = str2;
        if (lVar != null) {
            d10.f23692k = true;
        }
        lVar.getClass();
        d10.f23690i.f23716c.a(d10.f23686e);
        MqttService mqttService = d10.f23690i;
        StringBuilder a10 = d.a("Connecting {");
        a10.append(d10.f23682a);
        a10.append("} as {");
        a10.append(d10.f23683b);
        a10.append("}");
        mqttService.g("MqttConnection", a10.toString());
        Bundle bundle = new Bundle();
        bundle.putString("MqttService.activityToken", str2);
        bundle.putString("MqttService.invocationContext", null);
        bundle.putString("MqttService.callbackAction", "connect");
        try {
            if (d10.f23684c == null) {
                File externalFilesDir = d10.f23690i.getExternalFilesDir("MqttConnection");
                if (externalFilesDir == null && (externalFilesDir = d10.f23690i.getDir("MqttConnection", 0)) == null) {
                    bundle.putString("MqttService.errorMessage", "Error! No external and internal storage available");
                    bundle.putSerializable("MqttService.exception", new q());
                    d10.f23690i.b(d10.f23686e, on.n.ERROR, bundle);
                    return;
                }
                d10.f23684c = new vn.c(externalFilesDir.getAbsolutePath());
            }
            f fVar = new f(d10, bundle, bundle);
            if (d10.f23688g != null) {
                if (d10.f23693l) {
                    d10.f23690i.g("MqttConnection", "myClient != null and the client is connecting. Connect return directly.");
                    MqttService mqttService2 = d10.f23690i;
                    mqttService2.g("MqttConnection", "Connect return:isConnecting:" + d10.f23693l + ".disconnected:" + d10.f23691j);
                    return;
                } else if (!d10.f23691j) {
                    d10.f23690i.g("MqttConnection", "myClient != null and the client is connected and notify!");
                    d10.g(bundle);
                    return;
                } else {
                    d10.f23690i.g("MqttConnection", "myClient != null and the client is not connected");
                    d10.f23690i.g("MqttConnection", "Do Real connect!");
                }
            } else {
                d10.f23689h = new on.a(d10.f23690i);
                pn.h hVar = new pn.h(d10.f23682a, d10.f23683b, d10.f23684c, d10.f23689h);
                d10.f23688g = hVar;
                hVar.f24432e = d10;
                hVar.f24430c.f25003f.f25051a = d10;
                d10.f23690i.g("MqttConnection", "Do Real connect!");
            }
            d10.k(true);
            d10.f23688g.c(d10.f23685d, null, fVar);
        } catch (Exception e10) {
            MqttService mqttService3 = d10.f23690i;
            StringBuilder a11 = d.a("Exception occurred attempting to connect: ");
            a11.append(e10.getMessage());
            mqttService3.h("MqttConnection", a11.toString());
            d10.k(false);
            d10.h(bundle, e10);
        }
    }

    public final g d(String str) {
        g gVar = (g) this.f23720g.get(str);
        if (gVar != null) {
            return gVar;
        }
        throw new IllegalArgumentException("Invalid ClientHandle");
    }

    public final boolean e() {
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) getSystemService("connectivity")).getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.isAvailable() && activeNetworkInfo.isConnected() && this.f23718e;
    }

    public final void f(String str, String str2, String str3) {
        if (this.f23714a == null || !this.f23715b) {
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putString("MqttService.callbackAction", "trace");
        bundle.putString("MqttService.traceSeverity", str);
        bundle.putString("MqttService.traceTag", str2);
        bundle.putString("MqttService.errorMessage", str3);
        b(this.f23714a, on.n.ERROR, bundle);
    }

    public final void g(String str, String str2) {
        f("debug", str, str2);
    }

    public final void h(String str, String str2) {
        f("error", str, str2);
    }

    public final void i(String str, String str2, SQLException sQLException) {
        if (this.f23714a != null) {
            Bundle bundle = new Bundle();
            bundle.putString("MqttService.callbackAction", "trace");
            bundle.putString("MqttService.traceSeverity", "exception");
            bundle.putString("MqttService.errorMessage", str2);
            bundle.putSerializable("MqttService.exception", sQLException);
            bundle.putString("MqttService.traceTag", str);
            b(this.f23714a, on.n.ERROR, bundle);
        }
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        intent.getStringExtra("MqttService.activityToken");
        this.f23719f.getClass();
        return this.f23719f;
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        this.f23719f = new j(this);
        this.f23716c = new c(this, this);
    }

    @Override // android.app.Service
    public final void onDestroy() {
        SQLiteDatabase sQLiteDatabase;
        for (g gVar : this.f23720g.values()) {
            gVar.f(null);
        }
        if (this.f23719f != null) {
            this.f23719f = null;
        }
        a aVar = this.f23717d;
        if (aVar != null) {
            unregisterReceiver(aVar);
            this.f23717d = null;
        }
        c cVar = this.f23716c;
        if (cVar != null && (sQLiteDatabase = cVar.f23655a) != null) {
            sQLiteDatabase.close();
        }
        super.onDestroy();
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i10, int i11) {
        if (this.f23717d == null) {
            a aVar = new a();
            this.f23717d = aVar;
            registerReceiver(aVar, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
            return 1;
        }
        return 1;
    }
}
