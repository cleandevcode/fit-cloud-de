package x6;

import a7.a;
import android.app.Service;
import android.content.Intent;
import android.hardware.SensorEventListener;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.os.PowerManager;
import android.os.RemoteCallbackList;
import android.os.RemoteException;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import p000do.a;
import x6.f;

/* loaded from: classes.dex */
public abstract class c extends Service {

    /* renamed from: o */
    public static final /* synthetic */ int f30336o = 0;

    /* renamed from: h */
    public y6.d f30344h;

    /* renamed from: i */
    public boolean f30345i;

    /* renamed from: l */
    public boolean f30348l;

    /* renamed from: m */
    public float f30349m;

    /* renamed from: n */
    public float f30350n;

    /* renamed from: a */
    public final RemoteCallbackList<x6.g> f30337a = new RemoteCallbackList<>();

    /* renamed from: b */
    public final b f30338b = new b();

    /* renamed from: c */
    public final tl.d f30339c = fb.e.a(new e());

    /* renamed from: d */
    public final tl.d f30340d = fb.e.a(new g());

    /* renamed from: e */
    public final tl.d f30341e = fb.e.a(new C0554c());

    /* renamed from: f */
    public final tl.d f30342f = fb.e.a(new f());

    /* renamed from: g */
    public final tl.d f30343g = fb.e.a(new d());

    /* renamed from: j */
    public ArrayList f30346j = new ArrayList(16);

    /* renamed from: k */
    public boolean f30347k = true;

    /* loaded from: classes.dex */
    public static final class a extends Handler {

        /* renamed from: a */
        public final WeakReference<c> f30351a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Looper looper, c cVar) {
            super(looper);
            gm.l.f(cVar, "sportService");
            this.f30351a = new WeakReference<>(cVar);
        }

        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            int i10;
            gm.l.f(message, "msg");
            c cVar = this.f30351a.get();
            if (cVar == null) {
                return;
            }
            int i11 = message.what;
            if (i11 == 1) {
                int i12 = c.f30336o;
                synchronized (cVar) {
                    y6.d dVar = cVar.f30344h;
                    i10 = 0;
                    if (cVar.f30345i && dVar != null) {
                        long currentTimeMillis = System.currentTimeMillis();
                        if (currentTimeMillis - dVar.f31171e > 30000) {
                            dVar.f31171e = currentTimeMillis;
                            cVar.d().i(currentTimeMillis);
                        }
                        if (!dVar.f31173g) {
                            int i13 = dVar.f31174h + 1;
                            dVar.f31174h = i13;
                            if (i13 % 20 == 0) {
                                cVar.g();
                            }
                            int beginBroadcast = cVar.f30337a.beginBroadcast();
                            while (i10 < beginBroadcast) {
                                try {
                                    x6.g broadcastItem = cVar.f30337a.getBroadcastItem(i10);
                                    gm.l.e(broadcastItem, "callbacks.getBroadcastItem(i)");
                                    broadcastItem.s0(dVar.f31174h);
                                    i10++;
                                } catch (RemoteException e10) {
                                    e10.printStackTrace();
                                }
                            }
                            cVar.f30337a.finishBroadcast();
                        }
                        i10 = 1;
                    }
                }
                if (i10 != 0) {
                    sendEmptyMessageDelayed(1, 1000L);
                }
            } else if (i11 == 2) {
                int i14 = c.f30336o;
                synchronized (cVar) {
                    if (cVar.f30344h != null && cVar.f30345i) {
                        gm.l.c(null);
                        throw null;
                    }
                }
            }
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends f.a {
        public b() {
            c.this = r1;
        }

        @Override // x6.f
        public final void W() {
            c.a(c.this, false);
        }

        @Override // x6.f
        public final void e(x6.g gVar) {
            if (gVar != null) {
                c cVar = c.this;
                synchronized (cVar) {
                    cVar.f30337a.unregister(gVar);
                }
            }
        }

        @Override // x6.f
        public final void g0(x6.g gVar) {
            if (gVar != null) {
                c cVar = c.this;
                synchronized (cVar) {
                    cVar.f30337a.register(gVar);
                }
            }
        }

        @Override // x6.f
        public final ArrayList l0() {
            ArrayList arrayList;
            c cVar = c.this;
            synchronized (cVar) {
                y6.d dVar = cVar.f30344h;
                if (dVar != null) {
                    arrayList = cVar.d().h(dVar);
                } else {
                    arrayList = null;
                }
            }
            return arrayList;
        }

        @Override // x6.f
        public final y6.e r0() {
            y6.e eVar;
            c cVar = c.this;
            synchronized (cVar) {
                y6.d dVar = cVar.f30344h;
                if (dVar != null) {
                    eVar = new y6.e(dVar.f31167a, dVar.f31173g, dVar.f31174h, dVar.f31175i, dVar.f31176j, dVar.f31177k, dVar.f31178l, dVar.f31179m, cVar.f30349m);
                } else {
                    eVar = null;
                }
            }
            return eVar;
        }

        @Override // x6.f
        public final void t() {
            c.a(c.this, true);
        }

        @Override // x6.f
        public final String u() {
            String str;
            c cVar = c.this;
            synchronized (cVar) {
                y6.d dVar = cVar.f30344h;
                if (dVar != null) {
                    str = cVar.c(dVar);
                } else {
                    str = null;
                }
            }
            return str;
        }
    }

    /* renamed from: x6.c$c */
    /* loaded from: classes.dex */
    public static final class C0554c extends gm.m implements fm.a<a> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0554c() {
            super(0);
            c.this = r1;
        }

        @Override // fm.a
        public final a m() {
            Looper mainLooper = Looper.getMainLooper();
            gm.l.e(mainLooper, "getMainLooper()");
            return new a(mainLooper, c.this);
        }
    }

    /* loaded from: classes.dex */
    public static final class d extends gm.m implements fm.a<x6.b> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d() {
            super(0);
            c.this = r1;
        }

        @Override // fm.a
        public final x6.b m() {
            j b10 = c.this.b();
            b10.f30330b = new x6.d(c.this);
            return b10;
        }
    }

    /* loaded from: classes.dex */
    public static final class e extends gm.m implements fm.a<h> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e() {
            super(0);
            c.this = r1;
        }

        @Override // fm.a
        public final h m() {
            return new h(c.this);
        }
    }

    /* loaded from: classes.dex */
    public static final class f extends gm.m implements fm.a<l> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f() {
            super(0);
            c.this = r1;
        }

        @Override // fm.a
        public final l m() {
            l lVar = new l(c.this);
            lVar.f30393k = new x6.e(c.this);
            return lVar;
        }
    }

    /* loaded from: classes.dex */
    public static final class g extends gm.m implements fm.a<PowerManager.WakeLock> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g() {
            super(0);
            c.this = r1;
        }

        @Override // fm.a
        public final PowerManager.WakeLock m() {
            Object systemService = c.this.getSystemService("power");
            gm.l.d(systemService, "null cannot be cast to non-null type android.os.PowerManager");
            PowerManager.WakeLock newWakeLock = ((PowerManager) systemService).newWakeLock(1, "libSport:SportWakeLock");
            newWakeLock.setReferenceCounted(false);
            return newWakeLock;
        }
    }

    public static final void a(c cVar, boolean z10) {
        synchronized (cVar) {
            y6.d dVar = cVar.f30344h;
            if (cVar.f30345i && dVar != null && dVar.f31173g != z10) {
                dVar.f31173g = z10;
                ((l) cVar.f30342f.getValue()).f30392j = z10;
                cVar.d().a().edit().putBoolean("is_paused", z10).apply();
                if (z10) {
                    cVar.g();
                    cVar.f30347k = true;
                }
            }
        }
    }

    public abstract j b();

    public final String c(y6.d dVar) {
        String i10;
        ((a) this.f30341e.getValue()).removeCallbacksAndMessages(null);
        ((x6.b) this.f30343g.getValue()).d();
        l lVar = (l) this.f30342f.getValue();
        if (lVar.f30391i) {
            lVar.f30385c.unregisterListener((SensorEventListener) lVar.f30390h.getValue(), lVar.f30386d);
            lVar.f30391i = false;
        }
        if (dVar.f31167a == 2) {
            i10 = i(dVar, null);
        } else {
            i10 = i(dVar, d().h(dVar));
        }
        a7.a c10 = d().c();
        c10.getClass();
        a.SharedPreferences$EditorC0002a sharedPreferences$EditorC0002a = new a.SharedPreferences$EditorC0002a();
        sharedPreferences$EditorC0002a.remove("sport_type");
        sharedPreferences$EditorC0002a.remove("user_id");
        sharedPreferences$EditorC0002a.remove("alive_time_millis");
        sharedPreferences$EditorC0002a.apply();
        this.f30344h = null;
        this.f30345i = false;
        this.f30346j.clear();
        stopForeground(true);
        if (e().isHeld()) {
            e().release();
        }
        return i10;
    }

    public final h d() {
        return (h) this.f30339c.getValue();
    }

    public final PowerManager.WakeLock e() {
        Object value = this.f30340d.getValue();
        gm.l.e(value, "<get-wakeLock>(...)");
        return (PowerManager.WakeLock) value;
    }

    public final synchronized void f(int i10, long j10, boolean z10, float f10, float f11) {
        long currentTimeMillis = System.currentTimeMillis();
        float f12 = (z10 ? 0.415f : 0.413f) * f10;
        if (f12 < 30.0f) {
            f12 = 30.0f;
        }
        if (f12 > 100.0f) {
            f12 = 100.0f;
        }
        y6.d dVar = new y6.d(i10, j10, f12 / 100, f11, currentTimeMillis, currentTimeMillis);
        d().j(dVar);
        j(dVar);
    }

    public final synchronized void g() {
        if (this.f30348l) {
            h d10 = d();
            y6.d dVar = this.f30344h;
            gm.l.c(dVar);
            d10.k(dVar, this.f30346j);
            this.f30348l = false;
            this.f30346j.clear();
        } else {
            h d11 = d();
            y6.d dVar2 = this.f30344h;
            gm.l.c(dVar2);
            d11.a().edit().putInt("duration", dVar2.f31174h).apply();
        }
    }

    public abstract String i(y6.d dVar, ArrayList arrayList);

    public final synchronized void j(y6.d dVar) {
        this.f30344h = dVar;
        this.f30345i = true;
        this.f30346j.clear();
        this.f30347k = true;
        this.f30348l = false;
        this.f30349m = 0.0f;
        this.f30350n = 0.0f;
        ((a) this.f30341e.getValue()).removeCallbacksAndMessages(null);
        if (!e().isHeld()) {
            e().acquire(7200000L);
        }
        k(dVar.f31167a);
        ((a) this.f30341e.getValue()).sendEmptyMessage(1);
        ((l) this.f30342f.getValue()).a(dVar.f31173g);
        ((x6.b) this.f30343g.getValue()).c(dVar);
    }

    public abstract void k(int i10);

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        a.b bVar = p000do.a.f13275a;
        bVar.t("SportService");
        bVar.b("onBind", new Object[0]);
        return this.f30338b;
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        long currentTimeMillis = System.currentTimeMillis();
        synchronized (this) {
            this.f30344h = d().d();
            tl.l lVar = tl.l.f28297a;
        }
        long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
        a.b bVar = p000do.a.f13275a;
        bVar.t("SportService");
        bVar.b("onCreate useTime:" + currentTimeMillis2, new Object[0]);
    }

    @Override // android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        a.b bVar = p000do.a.f13275a;
        bVar.t("SportService");
        bVar.b("onDestroy", new Object[0]);
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i10, int i11) {
        Bundle bundle;
        boolean z10;
        a.b bVar = p000do.a.f13275a;
        bVar.t("SportService");
        StringBuilder sb2 = new StringBuilder();
        sb2.append("onStartCommand：");
        if (intent != null) {
            bundle = intent.getExtras();
        } else {
            bundle = null;
        }
        sb2.append(bundle);
        bVar.b(sb2.toString(), new Object[0]);
        if (intent == null) {
            synchronized (this) {
                y6.d dVar = this.f30344h;
                if (dVar == null) {
                    stopSelf();
                    bVar.t("SportService");
                    bVar.b("onStartCommand error state", new Object[0]);
                } else {
                    bVar.t("SportService");
                    bVar.b("onStartCommand intent=null restoreSport", new Object[0]);
                    synchronized (this) {
                        if (!this.f30345i) {
                            j(dVar);
                        }
                    }
                }
                tl.l lVar = tl.l.f28297a;
            }
        } else {
            int intExtra = intent.getIntExtra("sport_type", -1);
            long longExtra = intent.getLongExtra("user_id", 0L);
            Integer valueOf = Integer.valueOf(intExtra);
            if (valueOf != null && new lm.j(0, 2).k(valueOf.intValue())) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10 && longExtra > 0) {
                boolean booleanExtra = intent.getBooleanExtra("user_sex", true);
                float floatExtra = intent.getFloatExtra("user_height", 170.0f);
                float floatExtra2 = intent.getFloatExtra("user_weight", 70.0f);
                synchronized (this) {
                    y6.d dVar2 = this.f30344h;
                    if (dVar2 == null) {
                        bVar.t("SportService");
                        bVar.b("onStartCommand newSport", new Object[0]);
                    } else if (dVar2.f31167a == intExtra && dVar2.f31168b == longExtra) {
                        bVar.t("SportService");
                        bVar.b("onStartCommand restoreSport", new Object[0]);
                        synchronized (this) {
                            if (!this.f30345i) {
                                j(dVar2);
                            }
                        }
                    } else {
                        bVar.t("SportService");
                        bVar.b("onStartCommand changeSport", new Object[0]);
                        c(dVar2);
                    }
                    f(intExtra, longExtra, booleanExtra, floatExtra, floatExtra2);
                    tl.l lVar2 = tl.l.f28297a;
                }
                tl.l lVar22 = tl.l.f28297a;
            } else {
                throw new IllegalArgumentException("start sport with error params:sportType=" + intExtra + " userId=" + longExtra);
            }
        }
        return 1;
    }

    @Override // android.app.Service
    public final boolean onUnbind(Intent intent) {
        a.b bVar = p000do.a.f13275a;
        bVar.t("SportService");
        bVar.b("onUnbind", new Object[0]);
        return super.onUnbind(intent);
    }
}
