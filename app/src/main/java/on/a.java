package on;

import android.annotation.SuppressLint;
import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.PowerManager;
import android.util.Log;
import org.eclipse.paho.android.service.MqttService;
import pn.r;
import pn.t;

/* loaded from: classes2.dex */
public final class a implements r {

    /* renamed from: a */
    public qn.a f23643a;

    /* renamed from: b */
    public MqttService f23644b;

    /* renamed from: c */
    public C0421a f23645c;

    /* renamed from: d */
    public a f23646d;

    /* renamed from: e */
    public PendingIntent f23647e;

    /* renamed from: f */
    public volatile boolean f23648f = false;

    /* renamed from: on.a$a */
    /* loaded from: classes2.dex */
    public class C0421a extends BroadcastReceiver {

        /* renamed from: a */
        public PowerManager.WakeLock f23649a;

        /* renamed from: b */
        public final String f23650b;

        /* renamed from: on.a$a$a */
        /* loaded from: classes2.dex */
        public class C0422a implements pn.a {
            public C0422a() {
                C0421a.this = r1;
            }

            @Override // pn.a
            public final void a(pn.e eVar) {
                StringBuilder a10 = android.support.v4.media.d.a("Success. Release lock(");
                a10.append(C0421a.this.f23650b);
                a10.append("):");
                a10.append(System.currentTimeMillis());
                Log.d("AlarmPingSender", a10.toString());
                C0421a.this.f23649a.release();
            }

            @Override // pn.a
            public final void b(pn.e eVar, Exception exc) {
                StringBuilder a10 = android.support.v4.media.d.a("Failure. Release lock(");
                a10.append(C0421a.this.f23650b);
                a10.append("):");
                a10.append(System.currentTimeMillis());
                Log.d("AlarmPingSender", a10.toString());
                C0421a.this.f23649a.release();
            }
        }

        public C0421a() {
            a.this = r2;
            StringBuilder a10 = android.support.v4.media.d.a("MqttService.client.");
            a10.append(r2.f23646d.f23643a.f24998a.a());
            this.f23650b = a10.toString();
        }

        @Override // android.content.BroadcastReceiver
        @SuppressLint({"Wakelock"})
        public final void onReceive(Context context, Intent intent) {
            pn.n nVar;
            StringBuilder a10 = android.support.v4.media.d.a("Sending Ping at:");
            a10.append(System.currentTimeMillis());
            Log.d("AlarmPingSender", a10.toString());
            PowerManager.WakeLock newWakeLock = ((PowerManager) a.this.f23644b.getSystemService("power")).newWakeLock(1, this.f23650b);
            this.f23649a = newWakeLock;
            newWakeLock.acquire();
            qn.a aVar = a.this.f23643a;
            C0422a c0422a = new C0422a();
            aVar.getClass();
            t tVar = null;
            try {
                tVar = aVar.f25004g.a(c0422a);
            } catch (pn.n | Exception e10) {
                qn.a.f24996q.e(qn.a.f24995p, "handleRunException", "804", null, e10);
                if (!(e10 instanceof pn.n)) {
                    nVar = new pn.n(32109, e10);
                } else {
                    nVar = (pn.n) e10;
                }
                aVar.i(null, nVar);
            }
            if (tVar == null && this.f23649a.isHeld()) {
                this.f23649a.release();
            }
        }
    }

    public a(MqttService mqttService) {
        if (mqttService == null) {
            throw new IllegalArgumentException("Neither service nor client can be null.");
        }
        this.f23644b = mqttService;
        this.f23646d = this;
    }

    public final void a(long j10) {
        long currentTimeMillis = System.currentTimeMillis() + j10;
        Log.d("AlarmPingSender", "Schedule next alarm at " + currentTimeMillis);
        AlarmManager alarmManager = (AlarmManager) this.f23644b.getSystemService("alarm");
        if (Build.VERSION.SDK_INT >= 23) {
            Log.d("AlarmPingSender", "Alarm scheule using setExactAndAllowWhileIdle, next: " + j10);
            alarmManager.setExactAndAllowWhileIdle(0, currentTimeMillis, this.f23647e);
            return;
        }
        Log.d("AlarmPingSender", "Alarm scheule using setExact, delay: " + j10);
        alarmManager.setExact(0, currentTimeMillis, this.f23647e);
    }
}
