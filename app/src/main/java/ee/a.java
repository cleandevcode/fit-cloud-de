package ee;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;
import android.os.HandlerThread;
import android.text.TextUtils;
import androidx.fragment.app.a0;
import java.util.Calendar;
import java.util.Locale;
import java.util.Objects;

/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: c */
    public Context f13585c;

    /* renamed from: d */
    public be.d f13586d;

    /* renamed from: e */
    public a0 f13587e;

    /* renamed from: f */
    public HandlerThread f13588f;

    /* renamed from: g */
    public Handler f13589g;

    /* renamed from: h */
    public BluetoothAdapter f13590h;

    /* renamed from: a */
    public boolean f13583a = false;

    /* renamed from: b */
    public boolean f13584b = false;

    /* renamed from: i */
    public int f13591i = 0;

    /* renamed from: j */
    public boolean f13592j = false;

    /* renamed from: k */
    public long f13593k = 0;

    /* renamed from: l */
    public final C0239a f13594l = new C0239a();

    /* renamed from: m */
    public final b f13595m = new b();

    /* renamed from: n */
    public final c f13596n = new c();

    /* renamed from: o */
    public boolean f13597o = false;

    /* renamed from: p */
    public final d f13598p = new d();

    /* renamed from: ee.a$a */
    /* loaded from: classes.dex */
    public class C0239a extends BroadcastReceiver {

        /* renamed from: ee.a$a$a */
        /* loaded from: classes.dex */
        public class RunnableC0240a implements Runnable {
            public RunnableC0240a() {
                C0239a.this = r1;
            }

            @Override // java.lang.Runnable
            public final void run() {
                a.this.l();
            }
        }

        public C0239a() {
            a.this = r1;
        }

        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            String action = intent.getAction();
            if ("android.bluetooth.adapter.action.STATE_CHANGED".equals(action)) {
                int intExtra = intent.getIntExtra("android.bluetooth.adapter.extra.STATE", -1);
                boolean z10 = false;
                ge.b.n(String.format(Locale.US, "[%s] %d -> %d", action, Integer.valueOf(intent.getIntExtra("android.bluetooth.adapter.extra.PREVIOUS_STATE", -1)), Integer.valueOf(intExtra)));
                if (intExtra == 10) {
                    int i10 = a.this.f13591i;
                    if ((i10 == 2 || i10 == 1) ? true : true) {
                        new Thread(new RunnableC0240a()).start();
                    }
                }
            }
        }
    }

    /* loaded from: classes.dex */
    public class b implements Runnable {
        public b() {
            a.this = r1;
        }

        @Override // java.lang.Runnable
        public final void run() {
            boolean z10;
            String format;
            long timeInMillis = Calendar.getInstance().getTimeInMillis();
            a aVar = a.this;
            if (timeInMillis < aVar.f13593k) {
                aVar.f13593k = 0L;
            }
            long j10 = timeInMillis - aVar.f13593k;
            int i10 = aVar.f13591i;
            if (i10 == 1) {
                if (j10 > 30000) {
                    format = String.format(Locale.US, "no scan response received after start scan for %d ms", 30000L);
                } else {
                    return;
                }
            } else {
                if (i10 == 2) {
                    if (j10 > 30000) {
                        format = String.format(Locale.US, "exceed %d ms , no scan response received since last time", 30000L);
                    } else {
                        Handler handler = aVar.f13589g;
                        if (handler != null) {
                            handler.removeCallbacksAndMessages(aVar.f13596n);
                            aVar.f13589g.postDelayed(aVar.f13596n, aVar.f13586d.f4164h);
                            return;
                        }
                        z10 = aVar.f13584b;
                    }
                } else {
                    boolean z11 = aVar.f13584b;
                    ge.b.o("ignore state:" + a.this.f13591i, z11);
                    a aVar2 = a.this;
                    Handler handler2 = aVar2.f13589g;
                    if (handler2 != null) {
                        handler2.removeCallbacksAndMessages(aVar2.f13596n);
                        aVar2.f13589g.postDelayed(aVar2.f13596n, aVar2.f13586d.f4164h);
                        return;
                    }
                    z10 = aVar2.f13584b;
                }
                ge.b.o("mHandler == null", z10);
                return;
            }
            ge.b.d(format);
            a.this.i();
        }
    }

    /* loaded from: classes.dex */
    public class c implements Runnable {
        public c() {
            a.this = r1;
        }

        @Override // java.lang.Runnable
        public final void run() {
            ge.b.n("scan delay time reached");
            a.this.i();
        }
    }

    /* loaded from: classes.dex */
    public class d implements Runnable {
        public d() {
            a.this = r1;
        }

        @Override // java.lang.Runnable
        public final void run() {
            a aVar = a.this;
            if (aVar.f13587e == null) {
                ge.b.o("no callback registered", aVar.f13584b);
            }
            a.this.k();
        }
    }

    public void a() {
    }

    public final void b(int i10) {
        int i11 = this.f13591i;
        if (i11 != i10) {
            if (this.f13583a) {
                ge.b.d(String.format(Locale.US, "ScanState 0x%02X >> 0x%02X", Integer.valueOf(i11), Integer.valueOf(i10)));
            }
            this.f13591i = i10;
            a0 a0Var = this.f13587e;
            if (a0Var != null) {
                a0Var.B(i10);
            } else {
                ge.b.o("no callback registered", this.f13584b);
            }
        }
        int i12 = this.f13591i;
        if (i12 == 0 || i12 == 3) {
            Handler handler = this.f13589g;
            if (handler != null) {
                handler.removeCallbacks(this.f13596n);
                this.f13589g.removeCallbacks(this.f13595m);
                this.f13589g.removeCallbacks(this.f13598p);
            }
            boolean z10 = this.f13597o;
            if (z10) {
                if (this.f13589g != null) {
                    ge.b.o("wait to start auto scan", this.f13583a);
                    this.f13589g.postDelayed(this.f13598p, this.f13586d.f4166j);
                }
            } else if (this.f13584b) {
                ge.b.n(String.format("continousScanEnabled=%b", Boolean.valueOf(z10)));
            }
        }
    }

    public final void c(BluetoothDevice bluetoothDevice, int i10, byte[] bArr) {
        this.f13593k = Calendar.getInstance().getTimeInMillis();
        int i11 = this.f13591i;
        boolean z10 = false;
        if (i11 == 1) {
            b(2);
        } else if (i11 != 2) {
            ge.b.n(String.format("stop to calibration state: 0x%04X", Integer.valueOf(i11)));
            i();
            return;
        }
        if (bluetoothDevice == null) {
            ge.b.d("ignore, device is null");
            return;
        }
        int i12 = this.f13586d.f4163g;
        if (i12 > -1000 && i12 > i10) {
            ge.b.p("filter, low rssi:" + i10);
        } else {
            z10 = d(bluetoothDevice);
        }
        if (!z10) {
            return;
        }
        String name = bluetoothDevice.getName();
        bluetoothDevice.getBondState();
        be.b bVar = new be.b(bluetoothDevice, name, bArr);
        a();
        a0 a0Var = this.f13587e;
        if (a0Var != null) {
            a0Var.y(bVar);
        } else {
            ge.b.o("no callback registered", this.f13584b);
        }
        if (this.f13586d.f4158b == 1) {
            ge.b.d("SCAN_MECHANISM_FILTER_ONE > scanDevice(false)");
            i();
        }
    }

    public abstract boolean d(BluetoothDevice bluetoothDevice);

    public boolean e() {
        if (this.f13592j) {
            ge.b.p("please call onDestroy() method first");
            return false;
        }
        this.f13583a = rd.b.f25539b;
        this.f13584b = rd.b.f25540c;
        this.f13590h = sd.a.a(this.f13585c);
        if (this.f13586d == null) {
            ge.b.o("create new ScannerParams", this.f13584b);
            this.f13586d = new be.d(0);
        }
        if (this.f13589g == null) {
            HandlerThread handlerThread = new HandlerThread("ScannerPresenter");
            this.f13588f = handlerThread;
            handlerThread.start();
            this.f13589g = new Handler(this.f13588f.getLooper());
        }
        if (this.f13587e == null) {
            ge.b.o("callback is null", this.f13584b);
        }
        this.f13585c.registerReceiver(this.f13594l, new IntentFilter("android.bluetooth.adapter.action.STATE_CHANGED"));
        this.f13592j = true;
        ge.b.o("scan presenter initialized", this.f13583a);
        return true;
    }

    public final boolean f(BluetoothDevice bluetoothDevice) {
        String name = bluetoothDevice.getName();
        if (!TextUtils.isEmpty(this.f13586d.f4159c)) {
            if (TextUtils.isEmpty(name)) {
                return false;
            }
            if (Objects.equals(this.f13586d.f4159c, name)) {
                return true;
            }
            be.d dVar = this.f13586d;
            if (dVar.f4160d && name.contains(dVar.f4159c)) {
                return true;
            }
            if (this.f13583a) {
                ge.b.n(String.format("conflict name: %s", name));
            }
            return false;
        } else if (!TextUtils.isEmpty(name) || this.f13586d.f4161e) {
            return true;
        } else {
            if (this.f13584b) {
                ge.b.n("name is null, ignore");
            }
            return false;
        }
    }

    public final void g() {
        if (this.f13589g == null) {
            ge.b.o("mHandler == null", this.f13584b);
            return;
        }
        ge.b.o(String.format(Locale.US, "wait to check scan period(%d)", 30000L), this.f13584b);
        this.f13589g.removeCallbacks(this.f13595m);
        this.f13589g.postDelayed(this.f13595m, 30000L);
    }

    public final boolean h() {
        boolean z10;
        String str;
        if (!this.f13592j) {
            str = "presenter not initialized";
        } else {
            BluetoothAdapter bluetoothAdapter = this.f13590h;
            if (bluetoothAdapter != null && bluetoothAdapter.isEnabled()) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!z10) {
                str = "Bluetooth not enabled, ignore scan process.";
            } else {
                int i10 = this.f13591i;
                if (i10 != 1 && i10 != 2) {
                    b(1);
                    Handler handler = this.f13589g;
                    if (handler != null) {
                        handler.removeCallbacks(this.f13596n);
                        this.f13589g.removeCallbacks(this.f13595m);
                        this.f13589g.removeCallbacks(this.f13598p);
                    }
                    this.f13593k = 0L;
                    be.d dVar = this.f13586d;
                    if (dVar != null) {
                        this.f13597o = dVar.f4165i;
                    } else {
                        this.f13597o = false;
                    }
                    return true;
                }
                long timeInMillis = Calendar.getInstance().getTimeInMillis();
                if (timeInMillis < this.f13593k) {
                    this.f13593k = 0L;
                }
                if (timeInMillis - this.f13593k > 30000) {
                    ge.b.d(String.format(Locale.US, "exceed %d ms , no scan response received since last time", 30000L));
                    i();
                } else {
                    g();
                }
                return false;
            }
        }
        ge.b.p(str);
        return false;
    }

    public abstract boolean i();

    public void j() {
        ge.b.e("onDestroy", this.f13583a);
        Context context = this.f13585c;
        if (context != null) {
            try {
                context.unregisterReceiver(this.f13594l);
            } catch (Exception unused) {
            }
        }
        this.f13587e = null;
        l();
        Handler handler = this.f13589g;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
            this.f13589g = null;
        }
        HandlerThread handlerThread = this.f13588f;
        if (handlerThread != null) {
            handlerThread.quit();
            this.f13588f = null;
        }
        this.f13592j = false;
        ge.b.n("scan presenter destroyed");
    }

    public abstract boolean k();

    public final boolean l() {
        this.f13597o = false;
        if (!this.f13592j) {
            ge.b.p("presenter not initialized");
            return false;
        }
        Handler handler = this.f13589g;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
        return i();
    }
}
