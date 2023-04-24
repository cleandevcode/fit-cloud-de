package xe;

import android.bluetooth.BluetoothGatt;
import android.bluetooth.BluetoothGattCharacteristic;
import android.bluetooth.BluetoothGattDescriptor;
import android.bluetooth.BluetoothGattService;
import androidx.fragment.app.p;
import ce.a;
import com.realsil.sdk.dfu.DfuService;
import java.util.ArrayList;
import java.util.Locale;
import java.util.UUID;
import no.nordicsemi.android.dfu.DfuBaseService;

/* loaded from: classes.dex */
public abstract class g extends f {
    public UUID D0;
    public BluetoothGattService E0;
    public BluetoothGattCharacteristic F0;
    public BluetoothGattCharacteristic G0;
    public BluetoothGattCharacteristic H0;
    public UUID I0;
    public UUID J0;
    public UUID K0;
    public BluetoothGattService L0;
    public BluetoothGattCharacteristic M0;
    public BluetoothGattCharacteristic N0;
    public final a O0;

    /* loaded from: classes.dex */
    public class a extends yd.a {
        public a() {
            g.this = r1;
        }

        @Override // yd.a
        public final void a(BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic, byte[] bArr) {
            g gVar = g.this;
            synchronized (gVar) {
                if (bArr != null) {
                    if (bArr.length >= 2) {
                        int i10 = bArr[0] & 255;
                        int i11 = bArr[1] & 255;
                        if (gVar.f29222b) {
                            ge.b.n(String.format("responseType = %02X , requestOpCode = %02X", Integer.valueOf(i10), Integer.valueOf(i11)));
                        }
                        if (i10 == 16) {
                            gVar.d0(i11, bArr);
                        }
                    }
                }
                ge.b.p("notification data invalid");
            }
        }

        @Override // yd.a
        public final void b(BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic, byte[] bArr, int i10) {
            g gVar = g.this;
            if (i10 == 0) {
                gVar.f29246p = bArr;
            } else {
                gVar.D = i10 | DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                ge.b.p(String.format(Locale.US, "read Characteristic error:0x%04X", Integer.valueOf(g.this.D)));
            }
            g.this.y();
        }

        @Override // yd.a
        public final void c(BluetoothGattCharacteristic bluetoothGattCharacteristic, int i10) {
            if (i10 == 0) {
                g.this.f29250t = false;
                g.this.getClass();
                UUID uuid = g.this.J0;
                if (uuid != null && uuid.equals(bluetoothGattCharacteristic.getUuid()) && g.this.A0) {
                    g gVar = g.this;
                    byte[] value = bluetoothGattCharacteristic.getValue();
                    if (value == null) {
                        ge.b.q("value is null, exception", gVar.f29221a);
                    } else {
                        gVar.r().a(value.length);
                        gVar.x();
                    }
                }
            } else if (i10 != 257 && i10 != 143) {
                g.this.D = i10 | DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                ge.b.p(String.format("Characteristic write error: 0x%04X", Integer.valueOf(g.this.D)));
            } else {
                UUID uuid2 = g.this.J0;
                if (uuid2 != null && uuid2.equals(bluetoothGattCharacteristic.getUuid())) {
                    if (i10 == 143) {
                        g.this.f29250t = false;
                        if (g.this.A0) {
                            g gVar2 = g.this;
                            byte[] value2 = bluetoothGattCharacteristic.getValue();
                            if (value2 == null) {
                                ge.b.q("value is null, exception", gVar2.f29221a);
                            } else {
                                gVar2.r().a(value2.length);
                                gVar2.x();
                            }
                        }
                    } else {
                        g.this.f29250t = true;
                        if (g.this.f29221a) {
                            ge.b.d("write image packet error, status=" + i10 + ", please retry.");
                        }
                    }
                }
            }
            g.this.p();
        }

        @Override // yd.a
        public final void d(BluetoothGatt bluetoothGatt, int i10, int i11) {
            if (i10 == 0) {
                if (i11 == 2) {
                    g gVar = g.this;
                    if (gVar.f29233h) {
                        ge.b.p("task already aborted, ignore");
                        return;
                    } else if (gVar.f29243m == 256) {
                        ae.b.c(bluetoothGatt);
                        g gVar2 = g.this;
                        gVar2.B(513);
                        if (gVar2.B0 != null) {
                            ge.b.n(String.format(Locale.US, "delay to discover service for :%d ms ", 1600));
                            gVar2.B0.postDelayed(gVar2.C0, 1600L);
                            return;
                        }
                        gVar2.W();
                        return;
                    }
                } else if (i11 == 0) {
                    if (g.this.f29252v == 521) {
                        g.this.D = i10 | 2048;
                        g gVar3 = g.this;
                        if (gVar3.f29221a) {
                            ge.b.d(String.format("disconnect in OTA process, mErrorState: 0x%04X", Integer.valueOf(gVar3.D)));
                        }
                        g.this.p();
                    }
                    g.this.B(0);
                }
            } else {
                if (i11 == 0) {
                    g.this.B(0);
                }
                g.this.D = i10 | 2048;
            }
            g.this.w();
        }

        @Override // yd.a
        public final void e(BluetoothGattDescriptor bluetoothGattDescriptor, int i10) {
            if (i10 == 0) {
                if (m.O.equals(bluetoothGattDescriptor.getUuid())) {
                    g.this.f30508x0 = true;
                }
            } else {
                g.this.D = i10 | DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
            }
            g gVar = g.this;
            synchronized (gVar.W) {
                gVar.W.notifyAll();
            }
        }

        @Override // yd.a
        public final void f(int i10, int i11) {
            if (i11 == 0) {
                if (g.this.q().f32309u) {
                    g gVar = g.this;
                    int i12 = 16;
                    if (i10 - 3 > 16) {
                        gVar.getClass();
                        i12 = (i10 / 16) * 16;
                    }
                    gVar.V = i12;
                    zd.b.a(android.support.v4.media.d.a("> MAX_PACKET_SIZE="), gVar.V);
                }
                g.this.U(i10);
            }
            g.this.f30510z0 = true;
            g gVar2 = g.this;
            synchronized (gVar2.W) {
                gVar2.W.notifyAll();
            }
        }

        @Override // yd.a
        public final void g() {
            g gVar = g.this;
            ge.b.o(String.format("onPhyUpdate: mConnectionState=0x%04X", Integer.valueOf(gVar.f29243m)), gVar.f29222b);
        }

        /* JADX WARN: Removed duplicated region for block: B:100:0x0101  */
        /* JADX WARN: Removed duplicated region for block: B:103:0x010d  */
        /* JADX WARN: Removed duplicated region for block: B:117:0x0152 A[Catch: all -> 0x0176, TRY_ENTER, TryCatch #1 {Exception -> 0x0179, blocks: (B:115:0x014f, B:116:0x0151, B:117:0x0152, B:119:0x015b, B:120:0x016f, B:121:0x0174), top: B:130:0x014f }] */
        @Override // yd.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void h(android.bluetooth.BluetoothGatt r5, int r6) {
            /*
                Method dump skipped, instructions count: 396
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: xe.g.a.h(android.bluetooth.BluetoothGatt, int):void");
        }
    }

    public g(DfuService dfuService, ze.e eVar, DfuService.c cVar) {
        super(dfuService, eVar, cVar);
        this.D0 = m.P;
        this.I0 = m.S;
        this.J0 = m.T;
        this.K0 = m.f30530a0;
        this.O0 = new a();
    }

    public final int b0(String str, int i10) {
        int i11;
        int i12 = 0;
        while (!this.f29233h) {
            a aVar = this.O0;
            if (G(str) == null) {
                i11 = 264;
            } else {
                B(DfuBaseService.ERROR_REMOTE_TYPE_LEGACY);
                this.D = 0;
                this.f29239k = false;
                if (this.f29221a) {
                    ge.b.n(String.format("Connecting to device:%s, isConnectedCallbackCome=%b", p.b.m(str), Boolean.valueOf(this.f29239k)));
                }
                this.f30505u0.g(str, aVar);
                this.f30505u0.c(str, aVar);
                BluetoothGatt bluetoothGatt = this.f30505u0.f28036f.get(str);
                this.f30506v0 = bluetoothGatt;
                synchronized (this.f29241l) {
                    if (this.f29222b) {
                        ge.b.n(String.format("isConnectedCallbackCome=%b, mErrorState=0x%04X", Boolean.valueOf(this.f29239k), Integer.valueOf(this.D)));
                    }
                    if (!this.f29239k && this.D == 0) {
                        if (this.f29221a) {
                            ge.b.d("wait for connect gatt for " + q().D + " ms");
                        }
                        try {
                            this.f29241l.wait(q().D);
                        } catch (InterruptedException e10) {
                            ge.b.d("connect interrupted : " + e10.toString());
                            this.D = 259;
                        }
                    }
                }
                if (this.D == 0) {
                    if (!this.f29239k) {
                        ge.b.p("wait for connect, but no callback");
                        this.D = 260;
                    } else if (bluetoothGatt == null || this.f29243m != 515) {
                        StringBuilder a10 = android.support.v4.media.d.a("connect with some error, please check. mConnectionState=");
                        a10.append(this.f29243m);
                        ge.b.p(a10.toString());
                        this.D = 264;
                    }
                }
                if (this.D == 0 && this.f29222b) {
                    ge.b.n("connected the device which going to upgrade");
                }
                i11 = this.D;
            }
            if (i11 == 0) {
                return 0;
            }
            if ((i11 & (-2049)) != 133) {
                R(this.f30506v0);
            } else {
                ge.b.p("connect fail with GATT_ERROR, do not need disconnect");
            }
            L(this.f30506v0);
            try {
                Thread.sleep(1600L);
            } catch (InterruptedException unused) {
            }
            i12++;
            boolean z10 = this.f29222b;
            ge.b.e("tryConnectTime=" + i12, z10);
            if (i12 > i10) {
                return i11;
            }
        }
        return 4128;
    }

    public final void c0(byte b10) {
        if (!this.f29233h) {
            byte[] bArr = new byte[8];
            ze.c cVar = q().W;
            if (cVar != null) {
                int i10 = cVar.f32247b;
                bArr[0] = (byte) (i10 & 255);
                bArr[1] = (byte) ((i10 >> 8) & 255);
                int i11 = cVar.f32246a;
                bArr[2] = (byte) (i11 & 255);
                bArr[3] = (byte) ((i11 >> 8) & 255);
                int i12 = cVar.f32248c;
                bArr[4] = (byte) (i12 & 255);
                bArr[5] = (byte) ((i12 >> 8) & 255);
                int i13 = cVar.f32249d;
                bArr[6] = (byte) (i13 & 255);
                bArr[7] = (byte) ((i13 >> 8) & 255);
            }
            BluetoothGattCharacteristic bluetoothGattCharacteristic = this.M0;
            byte[] bArr2 = new byte[9];
            bArr2[0] = 7;
            System.arraycopy(bArr, 0, bArr2, 1, 8);
            P(bluetoothGattCharacteristic, bArr2, false);
            boolean z10 = this.f29221a;
            ge.b.e(String.format("BleDfuCmd(0x%02X) {", (byte) 7) + String.format(Locale.US, "\n\tparams=%s", he.a.a(bArr)) + "\n}", z10);
            try {
                ge.b.o("... waiting updateConnectionParameters response", this.f29222b);
                Z();
                return;
            } catch (ie.a e10) {
                StringBuilder a10 = android.support.v4.media.d.a("ignore connection parameters update exception: ");
                a10.append(e10.getMessage());
                ge.b.p(a10.toString());
                this.D = 0;
                return;
            }
        }
        throw new ne.c("user aborted", 4128);
    }

    public abstract void d0(int i10, byte[] bArr);

    public final boolean e0(te.a aVar, int i10, int i11) {
        ge.b.o(String.format(Locale.US, "nextBinSize=%d, mBytesSentBuffer=%d, bufferSize=%d", Integer.valueOf(aVar.s()), Integer.valueOf(i10), Integer.valueOf(i11)), this.f29221a);
        return aVar.s() + i10 > i11;
    }

    public final boolean f0(byte[] bArr) {
        boolean z10;
        if (!this.f29233h) {
            if (this.F0 == null) {
                return false;
            }
            boolean z11 = true;
            z(518);
            ge.b.e("<< enable device to enter OTA mode", this.f29221a);
            try {
                z10 = P(this.F0, bArr, false);
            } catch (ie.a e10) {
                if (e10.f16770b == 267) {
                    z11 = false;
                }
                StringBuilder a10 = android.support.v4.media.d.a("<< enter ota mode failed, ignore it: ");
                a10.append(e10.getMessage());
                ge.b.d(a10.toString());
                this.D = 0;
                z10 = z11;
            }
            try {
                Thread.sleep(1000L);
            } catch (InterruptedException unused) {
            }
            if (z10 && q().f32286f0) {
                D();
            }
            L(this.f30506v0);
            return z10;
        }
        throw new ne.c("user aborted", 4128);
    }

    public final void g0(String str) {
        if (!this.f29233h) {
            z(520);
            int b02 = b0(str, q().C);
            if (b02 == 0) {
                return;
            }
            if (b02 == 4128) {
                throw new ne.c("aborted, connectRemoteDevice failed", b02);
            }
            throw new ne.c("connectOtaRemoteDevice failed", b02);
        }
        throw new ne.c("user aborted", 4128);
    }

    public final void h0(String str) {
        if (!this.f29233h) {
            z(516);
            int b02 = b0(str, q().C);
            if (b02 != 0) {
                if (b02 != 4128) {
                    be.d Y = f.Y();
                    ArrayList arrayList = new ArrayList();
                    a.b bVar = new a.b();
                    if (str == null) {
                        bVar.f4631b = str;
                    } else {
                        bVar.a(str, 0, null);
                    }
                    arrayList.add(bVar.b());
                    Y.f4172p = arrayList;
                    Y.f4162f = str;
                    F(Y);
                    if (!this.f29233h) {
                        int b03 = b0(str, q().C);
                        if (b03 == 0) {
                            return;
                        }
                        if (b03 == 4128) {
                            throw new ne.c("aborted, connectRemoteDevice failed", b03);
                        }
                        throw new ne.c("connectRemoteDevice failed", b03);
                    }
                    throw new ne.c("user aborted", 4128);
                }
                throw new ne.c("aborted, connectRemoteDevice failed", b02);
            }
            return;
        }
        throw new ne.c("user aborted", 4128);
    }

    public boolean i0(BluetoothGatt bluetoothGatt) {
        BluetoothGattService service = bluetoothGatt.getService(this.D0);
        this.E0 = service;
        if (service == null) {
            StringBuilder a10 = android.support.v4.media.d.a("OTA_SERVICE not found: ");
            a10.append(this.D0.toString());
            ge.b.p(a10.toString());
            return false;
        }
        if (this.f29221a) {
            StringBuilder a11 = android.support.v4.media.d.a("find OTA_SERVICE: ");
            a11.append(this.D0.toString());
            ge.b.d(a11.toString());
        }
        BluetoothGattService bluetoothGattService = this.E0;
        UUID uuid = df.h.f13022a;
        BluetoothGattCharacteristic characteristic = bluetoothGattService.getCharacteristic(uuid);
        this.F0 = characteristic;
        if (characteristic == null) {
            ge.b.d("OTA_CONTROL_ENTER_OTA_MODE_CHARACTERISTIC not found: " + uuid);
        } else {
            if (this.f29222b) {
                ge.b.n("find OTA_CONTROL_ENTER_OTA_MODE_CHARACTERISTIC = " + uuid);
                ge.b.n(ae.b.b(this.F0.getProperties()));
            }
            this.F0.setWriteType(1);
        }
        BluetoothGattService bluetoothGattService2 = this.E0;
        UUID uuid2 = df.h.f13023b;
        BluetoothGattCharacteristic characteristic2 = bluetoothGattService2.getCharacteristic(uuid2);
        this.H0 = characteristic2;
        if (characteristic2 == null) {
            ge.b.d("OTA_MAC_ADDR_CHARACTERISTIC_UUID not found:" + uuid2);
        } else if (this.f29222b) {
            ge.b.n("find OTA_MAC_ADDR_CHARACTERISTIC_UUID = " + uuid2);
            ge.b.n(ae.b.b(this.F0.getProperties()));
        }
        BluetoothGattService bluetoothGattService3 = this.E0;
        UUID uuid3 = df.h.f13027f;
        BluetoothGattCharacteristic characteristic3 = bluetoothGattService3.getCharacteristic(uuid3);
        this.G0 = characteristic3;
        if (characteristic3 == null) {
            ge.b.d("OTA_DEVICE_INFO_CHARACTERISTIC_UUID not found:" + uuid3);
        } else if (this.f29222b) {
            ge.b.n("find OTA_DEVICE_INFO_CHARACTERISTIC_UUID: " + uuid3);
            ge.b.n(ae.b.b(this.G0.getProperties()));
        }
        return true;
    }

    public final int j0() {
        if (this.L0 != null) {
            if (this.M0 != null) {
                if (this.N0 != null) {
                    if (this.f29222b) {
                        StringBuilder a10 = android.support.v4.media.d.a("find DFU_CONTROL_POINT_UUID: ");
                        a10.append(this.K0.toString());
                        ge.b.n(a10.toString());
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("find DFU_DATA_UUID: ");
                        p.b(this.J0, sb2);
                        return 0;
                    }
                    return 0;
                }
                StringBuilder a11 = android.support.v4.media.d.a("not found DFU_DATA_UUID :");
                a11.append(this.J0.toString());
                ge.b.p(a11.toString());
                throw new ne.c("load dfu service failed", 263);
            }
            StringBuilder a12 = android.support.v4.media.d.a("not found DFU_CONTROL_POINT_UUID : ");
            a12.append(this.K0.toString());
            ge.b.p(a12.toString());
            throw new ne.c("load dfu service failed", 263);
        }
        StringBuilder a13 = android.support.v4.media.d.a("DFU_SERVICE not found:");
        a13.append(this.I0.toString());
        ge.b.p(a13.toString());
        throw new ne.c("load dfu service failed", 262);
    }

    public final void k0() {
        try {
            this.D0 = UUID.fromString(q().M);
            this.I0 = UUID.fromString(q().Q);
            this.J0 = UUID.fromString(q().U);
            this.K0 = UUID.fromString(q().V);
        } catch (Exception e10) {
            ge.b.p(e10.toString());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:209:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x01a2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean l0() {
        /*
            Method dump skipped, instructions count: 573
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: xe.g.l0():boolean");
    }

    @Override // xe.f, we.b, ve.a
    public final void u() {
        super.u();
        k0();
        this.f29231g = true;
    }
}
