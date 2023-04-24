package p001if;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothGatt;
import android.bluetooth.BluetoothGattCharacteristic;
import android.bluetooth.BluetoothGattService;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.UUID;
import no.nordicsemi.android.dfu.DfuBaseService;
import xe.a;
import xe.m;
import ze.j;

/* renamed from: if.e */
/* loaded from: classes.dex */
public final class e extends p001if.a implements m {
    public static volatile e H;
    public final a A = new a();
    public final b B = new b();
    public final c C = new c();
    public final d D = new d();
    public final Handler E = new Handler(Looper.getMainLooper());
    public final C0296e F = new C0296e();

    /* renamed from: u */
    public vd.c f16807u;

    /* renamed from: v */
    public BluetoothGatt f16808v;

    /* renamed from: w */
    public BluetoothGattService f16809w;

    /* renamed from: x */
    public BluetoothGattService f16810x;

    /* renamed from: y */
    public BluetoothGattCharacteristic f16811y;

    /* renamed from: z */
    public xe.a f16812z;

    /* renamed from: if.e$a */
    /* loaded from: classes.dex */
    public class a implements a.c {
        public a() {
            e.this = r1;
        }
    }

    /* renamed from: if.e$b */
    /* loaded from: classes.dex */
    public class b implements Runnable {
        public b() {
            e.this = r1;
        }

        @Override // java.lang.Runnable
        public final void run() {
            e eVar = e.this;
            synchronized (eVar.f16801i) {
                try {
                    if (eVar.f16795c) {
                        ge.b.n("waitSyncLock");
                    }
                    eVar.f16801i.wait(15000L);
                } catch (InterruptedException e10) {
                    boolean z10 = eVar.f16794b;
                    ge.b.e("wait sync data interrupted: " + e10.toString(), z10);
                }
            }
            try {
                Thread.sleep(800L);
            } catch (InterruptedException e11) {
                ge.b.p(e11.toString());
            }
            e.i(e.this);
        }
    }

    /* renamed from: if.e$c */
    /* loaded from: classes.dex */
    public class c implements Runnable {
        public c() {
            e.this = r1;
        }

        @Override // java.lang.Runnable
        public final void run() {
            e.i(e.this);
        }
    }

    /* renamed from: if.e$d */
    /* loaded from: classes.dex */
    public class d implements Runnable {
        public d() {
            e.this = r1;
        }

        @Override // java.lang.Runnable
        public final void run() {
            Thread thread;
            BluetoothDevice g10;
            e eVar = e.this;
            if (eVar.f16802j == 536) {
                String str = eVar.f16779r;
                int i10 = 10;
                if (eVar.f16774m != null && (g10 = eVar.g(str)) != null) {
                    i10 = g10.getBondState();
                }
                eVar.f16778q = i10;
                e eVar2 = e.this;
                int i11 = eVar2.f16778q;
                boolean z10 = eVar2.f16794b;
                if (i11 == 11) {
                    ge.b.o("BOND_BONDING: wait to discover service", z10);
                    thread = new Thread(e.this.B);
                } else {
                    StringBuilder a10 = android.support.v4.media.d.a(">> mBondState: ");
                    a10.append(e.this.f16778q);
                    ge.b.o(a10.toString(), z10);
                    thread = new Thread(e.this.C);
                }
                thread.start();
                return;
            }
            boolean z11 = eVar.f16795c;
            StringBuilder a11 = android.support.v4.media.d.a("ignore state:");
            a11.append(e.this.f16802j);
            ge.b.o(a11.toString(), z11);
        }
    }

    /* renamed from: if.e$e */
    /* loaded from: classes.dex */
    public class C0296e extends yd.a {
        public C0296e() {
            e.this = r1;
        }

        @Override // yd.a
        public final void b(BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic, byte[] bArr, int i10) {
            boolean z10;
            String str;
            UUID uuid = bluetoothGattCharacteristic.getUuid();
            if (i10 == 0) {
                if (m.R.equals(uuid)) {
                    e eVar = e.this;
                    if (eVar.f16802j == 540) {
                        ByteBuffer wrap = ByteBuffer.wrap(bArr);
                        wrap.order(ByteOrder.LITTLE_ENDIAN);
                        e.this.k(wrap.getShort(0));
                        return;
                    }
                    z10 = eVar.f16794b;
                    str = "ignore duplicate data";
                } else {
                    return;
                }
            } else {
                ge.b.e(String.format("Characteristic read error:0x%04X ", Integer.valueOf(i10)), e.this.f16794b);
                if (m.R.equals(uuid)) {
                    if (e.this.b()) {
                        e.this.f(new ne.a(5));
                        return;
                    }
                    return;
                }
                z10 = e.this.f16795c;
                str = "ignore exception when read other info";
            }
            ge.b.o(str, z10);
        }

        @Override // yd.a
        public final void d(BluetoothGatt bluetoothGatt, int i10, int i11) {
            if (i10 == 0) {
                if (i11 == 2) {
                    e eVar = e.this;
                    vd.c cVar = eVar.f16807u;
                    eVar.f16808v = cVar.f28036f.get(eVar.f16779r);
                    p001if.b bVar = e.this.f16798f;
                    if (bVar != null && bVar.f16790g) {
                        ae.b.c(bluetoothGatt);
                    }
                    if (bluetoothGatt != null) {
                        e eVar2 = e.this;
                        if (eVar2.f16802j != 536) {
                            eVar2.e(536);
                            e eVar3 = e.this;
                            if (eVar3.E != null) {
                                ge.b.n("delay to discover service for : 1600");
                                e eVar4 = e.this;
                                eVar4.E.removeCallbacks(eVar4.D);
                                e eVar5 = e.this;
                                boolean postDelayed = eVar5.E.postDelayed(eVar5.D, 1600L);
                                if (!postDelayed) {
                                    d4.b.b("postDelayed:", postDelayed, e.this.f16793a);
                                    return;
                                }
                                return;
                            }
                            ge.b.o("mHandler == null", eVar3.f16793a);
                            return;
                        }
                        return;
                    }
                } else if (i11 == 0) {
                    e.this.a();
                } else {
                    return;
                }
            }
            i();
        }

        @Override // yd.a
        public final void h(BluetoothGatt bluetoothGatt, int i10) {
            e eVar = e.this;
            int i11 = eVar.f16802j;
            if (i11 == 1025) {
                ge.b.d("ignore, when it is ota processing");
            } else if (i10 == 0) {
                eVar.e(539);
                if (i11 == 537) {
                    e.this.d();
                }
            } else {
                ge.b.p("service discovery failed !!!");
                if (e.this.b()) {
                    e.this.f(new ne.a(1));
                }
            }
        }

        public final void i() {
            if (!e.this.b()) {
                e.this.e(DfuBaseService.ERROR_FILE_NOT_FOUND);
                return;
            }
            e.this.d();
            e.this.f(new ne.a(0));
        }
    }

    public e(Context context) {
        ge.b.n("create GattDfuAdapter");
        this.f16796d = context;
        m();
    }

    public static void i(e eVar) {
        boolean z10;
        BluetoothGattService service;
        BluetoothGatt bluetoothGatt;
        UUID uuid;
        BluetoothGattCharacteristic characteristic;
        if (eVar.f16802j == 537) {
            ge.b.p("discoverServices already started");
            return;
        }
        eVar.e(537);
        ge.b.o("discoverServices...", eVar.f16795c);
        BluetoothGatt bluetoothGatt2 = eVar.f16808v;
        if (bluetoothGatt2 != null) {
            z10 = bluetoothGatt2.discoverServices();
        } else {
            ge.b.d("mBtGatt is null");
            z10 = false;
        }
        if (!z10) {
            ge.b.e("discoverServices failed", eVar.f16794b);
            if (eVar.b()) {
                eVar.f(new ne.a(1));
                return;
            }
            return;
        }
        synchronized (eVar.f16801i) {
            try {
                ge.b.o("wait discover service complete", eVar.f16795c);
                eVar.f16801i.wait(30000L);
            } catch (InterruptedException e10) {
                ge.b.e(e10.toString(), eVar.f16794b);
            }
        }
        if (eVar.f16802j == 537) {
            ge.b.p("discoverServices timeout");
            eVar.a();
            return;
        }
        BluetoothGatt bluetoothGatt3 = eVar.f16808v;
        if (bluetoothGatt3 != null) {
            if (eVar.f16795c) {
                ge.b.n(p.b.l(bluetoothGatt3));
            }
            p001if.b bVar = eVar.f16798f;
            if (bVar != null) {
                service = eVar.f16808v.getService(bVar.f16788e);
                bluetoothGatt = eVar.f16808v;
                uuid = eVar.f16798f.f16789f;
            } else {
                service = eVar.f16808v.getService(m.P);
                bluetoothGatt = eVar.f16808v;
                uuid = m.S;
            }
            BluetoothGattService service2 = bluetoothGatt.getService(uuid);
            eVar.f16809w = service;
            eVar.f16810x = service2;
            if (service == null) {
                boolean z11 = eVar.f16794b;
                StringBuilder a10 = android.support.v4.media.d.a("not find OTA_SERVICE = ");
                a10.append(m.P);
                ge.b.e(a10.toString(), z11);
                characteristic = null;
            } else {
                boolean z12 = eVar.f16795c;
                StringBuilder a11 = android.support.v4.media.d.a("find OTA_SERVICE = ");
                a11.append(m.P);
                ge.b.o(a11.toString(), z12);
                characteristic = service.getCharacteristic(m.R);
            }
            eVar.f16811y = characteristic;
            if (characteristic != null) {
                boolean z13 = eVar.f16794b;
                StringBuilder a12 = android.support.v4.media.d.a("find CHARACTERISTIC_PROTOCOL_TYPE = ");
                a12.append(m.R);
                ge.b.o(a12.toString(), z13);
                eVar.e(540);
                BluetoothGattCharacteristic bluetoothGattCharacteristic = eVar.f16811y;
                if (eVar.f16808v != null && bluetoothGattCharacteristic != null) {
                    if (eVar.f16793a) {
                        ge.b.n(String.format(Locale.US, "readCharacteristic:(%d) %s", Integer.valueOf(bluetoothGattCharacteristic.getInstanceId()), bluetoothGattCharacteristic.getUuid().toString()));
                    }
                    eVar.f16808v.readCharacteristic(bluetoothGattCharacteristic);
                    return;
                }
                ge.b.p("mBtGatt is null maybe disconnected just now");
                return;
            }
            eVar.k(0);
        }
    }

    @Override // p001if.c
    public final void a() {
        List<yd.a> list;
        boolean z10 = false;
        this.f16799g = 0;
        Handler handler = this.f16803k;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
        String str = this.f16779r;
        if (str == null) {
            ge.b.d("no device registered");
        } else {
            vd.c cVar = this.f16807u;
            if (cVar != null) {
                if (cVar.e(str)) {
                    vd.c cVar2 = this.f16807u;
                    String str2 = this.f16779r;
                    C0296e c0296e = this.F;
                    HashMap<String, List<yd.a>> hashMap = cVar2.f28037g;
                    if (hashMap != null) {
                        list = hashMap.get(str2);
                    } else {
                        list = null;
                    }
                    if (list != null && list.contains(c0296e)) {
                        z10 = true;
                    }
                    if (z10) {
                        e(4096);
                        this.f16807u.a(this.f16779r);
                        this.f16808v = null;
                    }
                    ge.b.o("no gatt callback registered", this.f16794b);
                } else {
                    ge.b.n("already disconnected");
                }
            }
        }
        e(DfuBaseService.ERROR_FILE_NOT_FOUND);
        this.f16808v = null;
    }

    public final boolean j(String str) {
        e(535);
        return this.f16807u.c(str, this.F);
    }

    public final void k(int i10) {
        boolean z10;
        xe.a aVar;
        ge.b.n(String.format("protocolType=0x%04X", Integer.valueOf(i10)));
        xe.a aVar2 = this.f16812z;
        if (aVar2 != null) {
            aVar2.a();
        }
        if (i10 == 16) {
            aVar = new ef.a(i10, this.f16798f, this.f16779r, this.f16809w, this.f16810x, this.A);
        } else if (i10 == 20) {
            aVar = new bf.a(i10, this.f16798f, this.f16779r, this.f16809w, this.f16810x, this.A);
        } else if (i10 == 21) {
            aVar = new cf.a(i10, this.f16798f, this.f16779r, this.f16809w, this.f16810x, this.A);
        } else if (i10 == 18) {
            aVar = new ye.a(i10, this.f16798f, this.f16779r, this.f16809w, this.f16810x, this.A);
        } else if (i10 == 19) {
            aVar = new af.a(i10, this.f16798f, this.f16779r, this.f16809w, this.f16810x, this.A);
        } else {
            p001if.b bVar = this.f16798f;
            if (bVar != null && "BeeTgt02".equals(bVar.f16785b)) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.f16812z = new df.a(this.f16798f, this.f16779r, this.f16809w, this.f16810x, this.A, z10);
            e(541);
            xe.a aVar3 = this.f16812z;
            aVar3.getClass();
            ge.b.n("sync data ...");
            a.b bVar2 = new a.b();
            aVar3.f30493v = bVar2;
            bVar2.start();
        }
        this.f16812z = aVar;
        e(541);
        xe.a aVar32 = this.f16812z;
        aVar32.getClass();
        ge.b.n("sync data ...");
        a.b bVar22 = new a.b();
        aVar32.f30493v = bVar22;
        bVar22.start();
    }

    /* JADX WARN: Removed duplicated region for block: B:84:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00d3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean l(java.lang.String r8) {
        /*
            Method dump skipped, instructions count: 243
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p001if.e.l(java.lang.String):boolean");
    }

    public final void m() {
        boolean z10 = ie.b.f16771a;
        this.f16793a = z10;
        this.f16794b = z10;
        this.f16795c = ie.b.f16772b;
        this.f16774m = BluetoothAdapter.getDefaultAdapter();
        n().A(2);
        vd.b bVar = vd.b.f29198l;
        this.f16775n = bVar;
        if (bVar == null) {
            vd.b.g(this.f16796d);
            this.f16775n = vd.b.f29198l;
        }
        if (this.f16775n == null) {
            ge.b.o("BluetoothProfileManager not initialized", this.f16793a);
        }
        vd.d dVar = vd.d.f29213g;
        this.f16776o = dVar;
        if (dVar == null) {
            vd.d.b(this.f16796d);
            this.f16776o = vd.d.f29213g;
        }
        vd.d dVar2 = this.f16776o;
        if (dVar2 != null) {
            dVar2.a(this.f16780s);
        } else {
            ge.b.p("BluetoothProfileManager not initialized");
        }
        vd.c cVar = vd.c.f29212m;
        this.f16807u = cVar;
        if (cVar == null) {
            vd.c.i(this.f16796d);
            this.f16807u = vd.c.f29212m;
        }
    }

    public final j n() {
        xe.a aVar = this.f16812z;
        if (aVar != null) {
            return aVar.g();
        }
        return new j(0);
    }
}
