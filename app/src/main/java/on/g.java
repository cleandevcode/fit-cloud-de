package on;

import android.content.ContentValues;
import android.database.SQLException;
import android.os.Bundle;
import android.os.PowerManager;
import android.util.Log;
import hj.o;
import java.util.HashMap;
import java.util.UUID;
import org.eclipse.paho.android.service.MqttService;

/* loaded from: classes2.dex */
public final class g implements pn.j {

    /* renamed from: a */
    public String f23682a;

    /* renamed from: b */
    public String f23683b;

    /* renamed from: c */
    public pn.k f23684c;

    /* renamed from: d */
    public pn.l f23685d;

    /* renamed from: e */
    public String f23686e;

    /* renamed from: i */
    public MqttService f23690i;

    /* renamed from: r */
    public String f23699r;

    /* renamed from: f */
    public String f23687f = null;

    /* renamed from: g */
    public pn.h f23688g = null;

    /* renamed from: h */
    public on.a f23689h = null;

    /* renamed from: j */
    public volatile boolean f23691j = true;

    /* renamed from: k */
    public boolean f23692k = true;

    /* renamed from: l */
    public volatile boolean f23693l = false;

    /* renamed from: m */
    public HashMap f23694m = new HashMap();

    /* renamed from: n */
    public HashMap f23695n = new HashMap();

    /* renamed from: o */
    public HashMap f23696o = new HashMap();

    /* renamed from: p */
    public HashMap f23697p = new HashMap();

    /* renamed from: q */
    public PowerManager.WakeLock f23698q = null;

    /* loaded from: classes2.dex */
    public class a implements pn.a {
        @Override // pn.a
        public final void a(pn.e eVar) {
        }

        @Override // pn.a
        public final void b(pn.e eVar, Exception exc) {
        }
    }

    /* loaded from: classes2.dex */
    public class b implements pn.a {

        /* renamed from: a */
        public final Bundle f23700a;

        public b(Bundle bundle) {
            g.this = r1;
            this.f23700a = bundle;
        }

        @Override // pn.a
        public void a(pn.e eVar) {
            g gVar = g.this;
            gVar.f23690i.b(gVar.f23686e, n.OK, this.f23700a);
        }

        @Override // pn.a
        public void b(pn.e eVar, Exception exc) {
            this.f23700a.putString("MqttService.errorMessage", exc.getLocalizedMessage());
            this.f23700a.putSerializable("MqttService.exception", exc);
            g gVar = g.this;
            gVar.f23690i.b(gVar.f23686e, n.ERROR, this.f23700a);
        }
    }

    public g(MqttService mqttService, String str, String str2, pn.k kVar, String str3) {
        this.f23684c = null;
        this.f23690i = null;
        this.f23699r = null;
        this.f23682a = str;
        this.f23690i = mqttService;
        this.f23683b = str2;
        this.f23684c = kVar;
        this.f23686e = str3;
        StringBuilder sb2 = new StringBuilder(g.class.getCanonicalName());
        o.a(sb2, " ", str2, " ", "on host ");
        sb2.append(str);
        this.f23699r = sb2.toString();
    }

    public static Bundle i(String str, String str2, pn.o oVar) {
        Bundle bundle = new Bundle();
        bundle.putString("MqttService.messageId", str);
        bundle.putString("MqttService.destinationName", str2);
        bundle.putParcelable("MqttService.PARCEL", new m(oVar));
        return bundle;
    }

    @Override // pn.i
    public final void a(String str, pn.o oVar) {
        MqttService mqttService = this.f23690i;
        StringBuilder a10 = androidx.activity.result.d.a("messageArrived(", str, ",{");
        a10.append(oVar.toString());
        a10.append("})");
        mqttService.g("MqttConnection", a10.toString());
        c cVar = this.f23690i.f23716c;
        String str2 = this.f23686e;
        cVar.f23655a = cVar.f23656b.getWritableDatabase();
        MqttService mqttService2 = cVar.f23657c;
        StringBuilder a11 = androidx.activity.result.d.a("storeArrived{", str2, "}, {");
        a11.append(oVar.toString());
        a11.append("}");
        mqttService2.g("DatabaseMessageStore", a11.toString());
        byte[] bArr = oVar.f24447b;
        int i10 = oVar.f24448c;
        boolean z10 = oVar.f24449d;
        boolean z11 = oVar.f24450e;
        ContentValues contentValues = new ContentValues();
        String uuid = UUID.randomUUID().toString();
        contentValues.put("messageId", uuid);
        contentValues.put("clientHandle", str2);
        contentValues.put("destinationName", str);
        contentValues.put("payload", bArr);
        contentValues.put("qos", Integer.valueOf(i10));
        contentValues.put("retained", Boolean.valueOf(z10));
        contentValues.put("duplicate", Boolean.valueOf(z11));
        contentValues.put("mtimestamp", Long.valueOf(System.currentTimeMillis()));
        try {
            cVar.f23655a.insertOrThrow("MqttArrivedMessageTable", null, contentValues);
            int b10 = cVar.b(str2);
            MqttService mqttService3 = cVar.f23657c;
            mqttService3.g("DatabaseMessageStore", "storeArrived: inserted message with id of {" + uuid + "} - Number of messages in database for this clientHandle = " + b10);
            Bundle i11 = i(uuid, str, oVar);
            i11.putString("MqttService.callbackAction", "messageArrived");
            i11.putString("MqttService.messageId", uuid);
            this.f23690i.b(this.f23686e, n.OK, i11);
        } catch (SQLException e10) {
            cVar.f23657c.i("DatabaseMessageStore", "onUpgrade", e10);
            throw e10;
        }
    }

    @Override // pn.i
    public final void b(Throwable th2) {
        MqttService mqttService = this.f23690i;
        StringBuilder a10 = android.support.v4.media.d.a("connectionLost(");
        a10.append(th2.getMessage());
        a10.append(")");
        mqttService.g("MqttConnection", a10.toString());
        this.f23691j = true;
        try {
            if (!this.f23685d.f24443f) {
                this.f23688g.d(new a());
            } else {
                this.f23689h.a(100L);
            }
        } catch (Exception unused) {
        }
        Bundle bundle = new Bundle();
        bundle.putString("MqttService.callbackAction", "onConnectionLost");
        bundle.putString("MqttService.errorMessage", th2.getMessage());
        if (th2 instanceof pn.n) {
            bundle.putSerializable("MqttService.exception", th2);
        }
        bundle.putString("MqttService.exceptionStack", Log.getStackTraceString(th2));
        this.f23690i.b(this.f23686e, n.OK, bundle);
        j();
    }

    @Override // pn.i
    public final void c(pn.c cVar) {
        n nVar = n.OK;
        MqttService mqttService = this.f23690i;
        mqttService.g("MqttConnection", "deliveryComplete(" + cVar + ")");
        pn.o oVar = (pn.o) this.f23695n.remove(cVar);
        if (oVar != null) {
            String str = (String) this.f23696o.remove(cVar);
            String str2 = (String) this.f23697p.remove(cVar);
            Bundle i10 = i(null, (String) this.f23694m.remove(cVar), oVar);
            if (str != null) {
                i10.putString("MqttService.callbackAction", "send");
                i10.putString("MqttService.activityToken", str);
                i10.putString("MqttService.invocationContext", str2);
                this.f23690i.b(this.f23686e, nVar, i10);
            }
            i10.putString("MqttService.callbackAction", "messageDelivered");
            this.f23690i.b(this.f23686e, nVar, i10);
        }
    }

    @Override // pn.j
    public final void d(String str, boolean z10) {
        Bundle bundle = new Bundle();
        bundle.putString("MqttService.callbackAction", "connectExtended");
        bundle.putBoolean("MqttService.reconnect", z10);
        bundle.putString("MqttService.serverURI", str);
        this.f23690i.b(this.f23686e, n.OK, bundle);
    }

    public final void e() {
        if (this.f23698q == null) {
            this.f23698q = ((PowerManager) this.f23690i.getSystemService("power")).newWakeLock(1, this.f23699r);
        }
        this.f23698q.acquire();
    }

    public final void f(String str) {
        this.f23690i.g("MqttConnection", "disconnect()");
        this.f23691j = true;
        Bundle bundle = new Bundle();
        bundle.putString("MqttService.activityToken", str);
        bundle.putString("MqttService.invocationContext", null);
        bundle.putString("MqttService.callbackAction", "disconnect");
        pn.h hVar = this.f23688g;
        if (hVar != null && hVar.f24430c.f()) {
            try {
                this.f23688g.d(new b(bundle));
            } catch (Exception e10) {
                h(bundle, e10);
            }
        } else {
            bundle.putString("MqttService.errorMessage", "not connected");
            this.f23690i.h("disconnect", "not connected");
            this.f23690i.b(this.f23686e, n.ERROR, bundle);
        }
        if (this.f23685d != null) {
            this.f23690i.f23716c.a(this.f23686e);
        }
        j();
    }

    public final void g(Bundle bundle) {
        n nVar = n.OK;
        e();
        this.f23690i.b(this.f23686e, nVar, bundle);
        c cVar = this.f23690i.f23716c;
        String str = this.f23686e;
        cVar.getClass();
        on.b bVar = new on.b(cVar, str);
        while (bVar.hasNext()) {
            d dVar = (d) bVar.next();
            Bundle i10 = i(dVar.a(), dVar.c(), dVar.b());
            i10.putString("MqttService.callbackAction", "messageArrived");
            this.f23690i.b(this.f23686e, nVar, i10);
        }
        k(false);
        this.f23691j = false;
        j();
    }

    public final void h(Bundle bundle, Exception exc) {
        bundle.putString("MqttService.errorMessage", exc.getLocalizedMessage());
        bundle.putSerializable("MqttService.exception", exc);
        this.f23690i.b(this.f23686e, n.ERROR, bundle);
    }

    public final void j() {
        PowerManager.WakeLock wakeLock = this.f23698q;
        if (wakeLock == null || !wakeLock.isHeld()) {
            return;
        }
        this.f23698q.release();
    }

    public final synchronized void k(boolean z10) {
        this.f23693l = z10;
    }
}
