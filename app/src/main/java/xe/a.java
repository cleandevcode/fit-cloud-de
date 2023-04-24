package xe;

import android.bluetooth.BluetoothGatt;
import android.bluetooth.BluetoothGattCharacteristic;
import android.bluetooth.BluetoothGattDescriptor;
import android.bluetooth.BluetoothGattService;
import java.util.ArrayList;
import java.util.Locale;
import java.util.UUID;
import no.nordicsemi.android.dfu.DfuBaseService;
import p001if.e;

/* loaded from: classes.dex */
public abstract class a implements m {
    public Object A;

    /* renamed from: a */
    public boolean f30472a;

    /* renamed from: b */
    public boolean f30473b;

    /* renamed from: c */
    public boolean f30474c;

    /* renamed from: d */
    public int f30475d;

    /* renamed from: e */
    public BluetoothGatt f30476e;

    /* renamed from: f */
    public BluetoothGattCharacteristic f30477f;

    /* renamed from: g */
    public BluetoothGattCharacteristic f30478g;

    /* renamed from: h */
    public BluetoothGattService f30479h;

    /* renamed from: i */
    public BluetoothGattCharacteristic f30480i;

    /* renamed from: j */
    public BluetoothGattCharacteristic f30481j;

    /* renamed from: k */
    public BluetoothGattCharacteristic f30482k;

    /* renamed from: l */
    public ArrayList f30483l;

    /* renamed from: m */
    public BluetoothGattService f30484m;

    /* renamed from: n */
    public BluetoothGattCharacteristic f30485n;

    /* renamed from: o */
    public ArrayList f30486o;

    /* renamed from: p */
    public ze.j f30487p;

    /* renamed from: q */
    public ArrayList f30488q;

    /* renamed from: r */
    public String f30489r;

    /* renamed from: s */
    public c f30490s;

    /* renamed from: t */
    public p001if.b f30491t;

    /* renamed from: u */
    public int f30492u;

    /* renamed from: v */
    public b f30493v;

    /* renamed from: w */
    public final C0557a f30494w;

    /* renamed from: x */
    public final Object f30495x;

    /* renamed from: y */
    public boolean f30496y;

    /* renamed from: z */
    public int f30497z;

    /* renamed from: xe.a$a */
    /* loaded from: classes.dex */
    public class C0557a extends yd.a {
        public C0557a() {
            a.this = r1;
        }

        @Override // yd.a
        public final void a(BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic, byte[] bArr) {
            a.this.b(bluetoothGattCharacteristic, bArr);
        }

        @Override // yd.a
        public final void b(BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic, byte[] bArr, int i10) {
            a.this.c(bluetoothGattCharacteristic, bArr, i10);
        }

        @Override // yd.a
        public final void d(BluetoothGatt bluetoothGatt, int i10, int i11) {
            boolean z10;
            if (i10 == 0 && i11 == 0) {
                a aVar = a.this;
                if ((aVar.f30497z & DfuBaseService.ERROR_REMOTE_TYPE_LEGACY) == 256) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    aVar.h(2);
                    a.this.l();
                }
            }
        }

        @Override // yd.a
        public final void e(BluetoothGattDescriptor bluetoothGattDescriptor, int i10) {
            try {
                boolean z10 = a.this.f30474c;
                ge.b.o("onDescriptorWrite: " + i10, z10);
                synchronized (a.this.f30495x) {
                    a aVar = a.this;
                    aVar.f30496y = true;
                    aVar.f30495x.notifyAll();
                }
            } catch (Exception e10) {
                ge.b.p(e10.toString());
            }
        }
    }

    /* loaded from: classes.dex */
    public class b extends Thread {
        public b() {
            a.this = r1;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public final void run() {
            super.run();
            setName("AdapterXGBase-DeviceInfoThread");
            a.this.k();
        }
    }

    /* loaded from: classes.dex */
    public interface c {
    }

    /* JADX WARN: Removed duplicated region for block: B:54:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00bc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public a(int r5, p001if.b r6, java.lang.String r7, android.bluetooth.BluetoothGattService r8, android.bluetooth.BluetoothGattService r9, p001if.e.a r10) {
        /*
            Method dump skipped, instructions count: 252
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: xe.a.<init>(int, if.b, java.lang.String, android.bluetooth.BluetoothGattService, android.bluetooth.BluetoothGattService, if.e$a):void");
    }

    public final void a() {
        b bVar = this.f30493v;
        if (bVar != null) {
            bVar.interrupt();
            this.f30493v = null;
        }
        this.f30497z = 0;
        vd.c.f29212m.g(this.f30489r, this.f30494w);
    }

    public void b(BluetoothGattCharacteristic bluetoothGattCharacteristic, byte[] bArr) {
    }

    public abstract void c(BluetoothGattCharacteristic bluetoothGattCharacteristic, byte[] bArr, int i10);

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0010, code lost:
        if (r6.length > 0) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x001d, code lost:
        if (r6.length > 0) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x001f, code lost:
        r6 = r0.get();
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0024, code lost:
        r6 = 0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void d(byte[] r6) {
        /*
            r5 = this;
            java.nio.ByteBuffer r0 = java.nio.ByteBuffer.wrap(r6)
            java.nio.ByteOrder r1 = java.nio.ByteOrder.LITTLE_ENDIAN
            r0.order(r1)
            int r1 = r5.f30492u
            r2 = 0
            r3 = 1
            if (r1 != r3) goto L13
            int r6 = r6.length
            if (r6 <= 0) goto L24
            goto L1f
        L13:
            int r1 = r6.length
            r4 = 2
            if (r1 < r4) goto L1c
            short r6 = r0.getShort()
            goto L25
        L1c:
            int r6 = r6.length
            if (r6 <= 0) goto L24
        L1f:
            byte r6 = r0.get()
            goto L25
        L24:
            r6 = 0
        L25:
            boolean r0 = r5.f30473b
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r4 = "current battery: "
            r1.append(r4)
            r1.append(r6)
            java.lang.String r1 = r1.toString()
            ge.b.o(r1, r0)
            ze.j r0 = r5.g()
            r0.f32258h = r3
            r0.f32259i = r6
            r0.f32260j = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: xe.a.d(byte[]):void");
    }

    public final boolean e(BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic) {
        StringBuilder sb2;
        String str;
        boolean z10;
        int properties = bluetoothGattCharacteristic.getProperties();
        if ((properties & 16) == 0) {
            ge.b.p("check properties failed: " + properties);
            this.f30496y = false;
            return false;
        }
        if (this.f30472a) {
            sb2 = android.support.v4.media.d.a("setCharacteristicNotification() - uuid: ");
            sb2.append(bluetoothGattCharacteristic.getUuid());
            str = " enabled: ";
        } else {
            sb2 = new StringBuilder();
            str = "setCharacteristicNotification()  enabled: ";
        }
        sb2.append(str);
        sb2.append(true);
        ge.b.n(sb2.toString());
        bluetoothGatt.setCharacteristicNotification(bluetoothGattCharacteristic, true);
        BluetoothGattDescriptor descriptor = bluetoothGattCharacteristic.getDescriptor(m.O);
        if (descriptor != null) {
            if (descriptor.getValue() != null && descriptor.getValue().length == 2 && descriptor.getValue()[0] > 0 && descriptor.getValue()[1] == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            d4.b.b("current cccd state: ", z10, this.f30472a);
            if (z10) {
                this.f30496y = true;
                ge.b.p("cccd already enabled");
                return true;
            }
            vd.c cVar = vd.c.f29212m;
            byte[] bArr = BluetoothGattDescriptor.ENABLE_NOTIFICATION_VALUE;
            cVar.getClass();
            if (td.c.h(bluetoothGatt, descriptor, bArr)) {
                synchronized (this.f30495x) {
                    ge.b.e("wait write Characteristic Notification 15000ms", this.f30473b);
                    try {
                        this.f30496y = false;
                        this.f30495x.wait(30000L);
                    } catch (InterruptedException e10) {
                        ge.b.p("wait writeDescriptor interrupted: " + e10.toString());
                    }
                }
                return this.f30496y;
            }
        }
        return false;
    }

    public final boolean f(BluetoothGattCharacteristic bluetoothGattCharacteristic) {
        String str;
        if (this.f30476e == null) {
            str = "mBluetoothGatt is null maybe disconnected just now";
        } else if (bluetoothGattCharacteristic == null) {
            str = "characteristic can not be null";
        } else {
            if (this.f30472a) {
                ge.b.n(String.format(Locale.US, "readCharacteristic:(%d) %s", Integer.valueOf(bluetoothGattCharacteristic.getInstanceId()), bluetoothGattCharacteristic.getUuid().toString()));
            }
            if (this.f30476e.readCharacteristic(bluetoothGattCharacteristic)) {
                m();
                return this.f30497z != 2;
            }
            str = "readCharacteristic failed";
        }
        ge.b.p(str);
        return false;
    }

    public final ze.j g() {
        if (this.f30487p == null) {
            this.f30487p = new ze.j(this.f30475d);
        }
        return this.f30487p;
    }

    public final void h(int i10) {
        int i11;
        boolean z10 = false;
        ge.b.d(String.format("syncState: 0x%04X >> 0x%04X", Integer.valueOf(this.f30497z), Integer.valueOf(i10)));
        this.f30497z = i10;
        c cVar = this.f30490s;
        if (cVar != null) {
            e.a aVar = (e.a) cVar;
            if (p001if.e.this.b()) {
                if (i10 == 1) {
                    p001if.e eVar = p001if.e.this;
                    if ((eVar.f16802j & 2048) == 2048) {
                        z10 = true;
                    }
                    if (z10) {
                        i11 = 2074;
                    } else {
                        i11 = 527;
                    }
                    eVar.e(i11);
                    return;
                } else if (i10 == 2) {
                    p001if.e.this.f(new ne.a(5));
                    return;
                } else {
                    return;
                }
            }
            p001if.e eVar2 = p001if.e.this;
            ge.b.o(String.format("ignore, is not in preparing state: 0x%04X", Integer.valueOf(eVar2.f16802j)), eVar2.f16795c);
            return;
        }
        ge.b.o("no callback registered", this.f30474c);
    }

    public void i() {
        boolean z10;
        String str;
        if (this.f30484m == null) {
            this.f30485n = null;
            z10 = this.f30474c;
            StringBuilder a10 = android.support.v4.media.d.a("not find DFU_SERVICE_UUID = ");
            a10.append(df.g.f13019a);
            str = a10.toString();
        } else {
            boolean z11 = this.f30474c;
            StringBuilder a11 = android.support.v4.media.d.a("find DFU_SERVICE_UUID = ");
            a11.append(this.f30484m.getUuid());
            ge.b.o(a11.toString(), z11);
            BluetoothGattService bluetoothGattService = this.f30484m;
            UUID uuid = df.g.f13020b;
            BluetoothGattCharacteristic characteristic = bluetoothGattService.getCharacteristic(uuid);
            this.f30485n = characteristic;
            if (characteristic == null) {
                z10 = this.f30474c;
                str = "not found DFU_CONTROL_POINT_CHARACTERISTIC: " + uuid;
            } else {
                if (this.f30473b) {
                    ge.b.d("find DFU_CONTROL_POINT_CHARACTERISTIC: " + uuid);
                    ge.b.d(ae.b.b(this.f30485n.getProperties()));
                }
                this.f30485n.setWriteType(2);
                return;
            }
        }
        ge.b.o(str, z10);
    }

    public boolean j() {
        BluetoothGattService bluetoothGattService = this.f30479h;
        if (bluetoothGattService == null) {
            ge.b.q("mOtaService is null", this.f30473b);
            return false;
        }
        UUID uuid = cf.f.f4644a;
        BluetoothGattCharacteristic characteristic = bluetoothGattService.getCharacteristic(uuid);
        this.f30480i = characteristic;
        if (characteristic != null) {
            boolean z10 = this.f30473b;
            ge.b.o("find OTA_CONTROL_ENTER_OTA_MODE_CHARACTERISTIC = " + uuid, z10);
        } else if (this.f30473b) {
            ge.b.d("OTA_CONTROL_ENTER_OTA_MODE_CHARACTERISTIC not found");
        }
        BluetoothGattService bluetoothGattService2 = this.f30479h;
        UUID uuid2 = ye.f.f31448b;
        BluetoothGattCharacteristic characteristic2 = bluetoothGattService2.getCharacteristic(uuid2);
        this.f30482k = characteristic2;
        if (characteristic2 == null) {
            ge.b.d("OTA_DEVICE_MAC_CHARACTERISTIC_UUID not found");
        } else if (this.f30472a) {
            ge.b.n("find OTA_DEVICE_MAC_CHARACTERISTIC_UUID = " + uuid2);
            ge.b.n(ae.b.b(this.f30482k.getProperties()));
        }
        BluetoothGattService bluetoothGattService3 = this.f30479h;
        UUID uuid3 = ye.f.f31452f;
        BluetoothGattCharacteristic characteristic3 = bluetoothGattService3.getCharacteristic(uuid3);
        this.f30481j = characteristic3;
        if (characteristic3 == null) {
            if (this.f30472a) {
                ge.b.d("OTA_DEVICE_INFO_CHARACTERISTIC_UUID not found");
                return true;
            }
            return true;
        } else if (this.f30474c) {
            ge.b.n("find OTA_DEVICE_INFO_CHARACTERISTIC_UUID = " + uuid3);
            ge.b.n(ae.b.b(this.f30481j.getProperties()));
            return true;
        } else {
            return true;
        }
    }

    public abstract void k();

    public final void l() {
        synchronized (this.A) {
            this.A.notifyAll();
        }
    }

    public final void m() {
        synchronized (this.A) {
            try {
                this.A.wait(6000L);
            } catch (InterruptedException e10) {
                boolean z10 = this.f30473b;
                ge.b.e("wait sync data interrupted: " + e10.toString(), z10);
            }
        }
    }
}
