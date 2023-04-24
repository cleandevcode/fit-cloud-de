package ee;

import android.bluetooth.BluetoothDevice;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import be.d;
import gf.a;

/* loaded from: classes.dex */
public class b extends ee.a {

    /* renamed from: q */
    public final a f13604q;

    /* loaded from: classes.dex */
    public class a extends BroadcastReceiver {

        /* renamed from: a */
        public final /* synthetic */ b f13605a;

        public a(be.a aVar) {
            this.f13605a = aVar;
        }

        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            BluetoothDevice bluetoothDevice;
            short shortExtra;
            String format;
            b bVar;
            String action = intent.getAction();
            if ("android.bluetooth.device.action.FOUND".equals(action) || "android.bluetooth.device.action.CLASS_CHANGED".equals(action)) {
                bluetoothDevice = (BluetoothDevice) intent.getParcelableExtra("android.bluetooth.device.extra.DEVICE");
                shortExtra = intent.getShortExtra("android.bluetooth.device.extra.RSSI", (short) 0);
                if (bluetoothDevice != null) {
                    if (this.f13605a.f13584b) {
                        ge.b.n(String.format("%s %s", action, p.b.k(bluetoothDevice)));
                    }
                    bVar = this.f13605a;
                    bVar.c(bluetoothDevice, shortExtra, null);
                } else if (this.f13605a.f13584b) {
                    format = String.format("%s", action);
                    ge.b.n(format);
                }
            } else if (!"android.bluetooth.device.action.NAME_CHANGED".equals(action) && !"android.bluetooth.device.action.UUID".equals(action)) {
                if ("android.bluetooth.adapter.action.DISCOVERY_STARTED".equals(action)) {
                    this.f13605a.b(2);
                } else if ("android.bluetooth.adapter.action.DISCOVERY_FINISHED".equals(action)) {
                    this.f13605a.b(3);
                }
            } else {
                bluetoothDevice = (BluetoothDevice) intent.getParcelableExtra("android.bluetooth.device.extra.DEVICE");
                shortExtra = intent.getShortExtra("android.bluetooth.device.extra.RSSI", (short) 0);
                if (bluetoothDevice == null) {
                    if (this.f13605a.f13584b) {
                        format = String.format("%s", action);
                        ge.b.n(format);
                    }
                    return;
                }
                if (this.f13605a.f13584b) {
                    ge.b.n(String.format("%s %s/%s", action, bluetoothDevice.getName(), bluetoothDevice.toString()));
                }
                bVar = this.f13605a;
                if (bVar.f13591i != 2) {
                    return;
                }
                bVar.c(bluetoothDevice, shortExtra, null);
            }
        }
    }

    public b(Context context, d dVar, a.C0272a c0272a) {
        a aVar = new a((be.a) this);
        this.f13604q = aVar;
        this.f13585c = context.getApplicationContext();
        this.f13589g = null;
        this.f13586d = dVar;
        this.f13587e = c0272a;
        if (super.e()) {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.bluetooth.device.action.FOUND");
            intentFilter.addAction("android.bluetooth.adapter.action.DISCOVERY_STARTED");
            intentFilter.addAction("android.bluetooth.adapter.action.DISCOVERY_FINISHED");
            intentFilter.addAction("android.bluetooth.device.action.UUID");
            this.f13585c.registerReceiver(aVar, intentFilter);
            ge.b.o("scanner initialized", this.f13584b);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:147:0x00dc, code lost:
        if (r1.length == 0) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:151:0x00e2, code lost:
        if (r0.length == 0) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:173:0x0120, code lost:
        if (r10.length == 0) goto L62;
     */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0143  */
    @Override // ee.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean d(android.bluetooth.BluetoothDevice r10) {
        /*
            Method dump skipped, instructions count: 334
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ee.b.d(android.bluetooth.BluetoothDevice):boolean");
    }

    @Override // ee.a
    public final boolean i() {
        if (this.f13590h.isDiscovering()) {
            ge.b.o("cancelDiscovery", this.f13584b);
            if (!this.f13590h.cancelDiscovery()) {
                ge.b.d("cancelDiscovery failed");
                return false;
            }
        }
        b(0);
        return true;
    }

    @Override // ee.a
    public final void j() {
        Context context = this.f13585c;
        if (context != null) {
            try {
                context.unregisterReceiver(this.f13604q);
            } catch (Exception e10) {
                ge.b.q(e10.toString(), this.f13584b);
            }
        }
        super.j();
    }

    @Override // ee.a
    public final boolean k() {
        boolean z10;
        StringBuilder sb2;
        String str;
        if (!h()) {
            return true;
        }
        if (this.f13590h.isDiscovering()) {
            this.f13590h.cancelDiscovery();
        }
        if (this.f13584b) {
            z10 = this.f13583a;
            sb2 = new StringBuilder("startDiscovery for ");
            str = this.f13586d.toString();
        } else {
            z10 = this.f13583a;
            sb2 = new StringBuilder("startDiscovery for ");
            sb2.append(this.f13586d.f4164h);
            str = "ms";
        }
        sb2.append(str);
        ge.b.o(sb2.toString(), z10);
        if (!this.f13590h.startDiscovery()) {
            ge.b.d("startDiscovery failed");
            l();
            return false;
        }
        g();
        return true;
    }
}
