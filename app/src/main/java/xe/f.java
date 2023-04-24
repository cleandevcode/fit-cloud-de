package xe;

import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothGatt;
import android.bluetooth.BluetoothGattCharacteristic;
import android.os.Handler;
import android.os.Looper;
import androidx.fragment.app.a0;
import com.realsil.sdk.dfu.DfuService;
import java.util.ArrayList;
import java.util.Locale;
import no.nordicsemi.android.dfu.DfuBaseService;

/* loaded from: classes.dex */
public abstract class f extends we.b implements m {
    public volatile boolean A0;
    public final Handler B0;
    public final a C0;

    /* renamed from: r0 */
    public be.c f30502r0;

    /* renamed from: s0 */
    public volatile boolean f30503s0;

    /* renamed from: t0 */
    public b f30504t0;

    /* renamed from: u0 */
    public vd.c f30505u0;

    /* renamed from: v0 */
    public BluetoothGatt f30506v0;

    /* renamed from: w0 */
    public volatile byte[] f30507w0;

    /* renamed from: x0 */
    public volatile boolean f30508x0;

    /* renamed from: y0 */
    public volatile boolean f30509y0;

    /* renamed from: z0 */
    public volatile boolean f30510z0;

    /* loaded from: classes.dex */
    public class a implements Runnable {
        public a() {
            f.this = r1;
        }

        @Override // java.lang.Runnable
        public final void run() {
            BluetoothDevice G;
            f fVar = f.this;
            if (fVar.f29243m == 513) {
                String str = fVar.F;
                int i10 = 10;
                if (fVar.f29798n0 != null && (G = fVar.G(str)) != null) {
                    i10 = G.getBondState();
                }
                boolean z10 = f.this.f29221a;
                ge.b.o(">> mBondState: " + i10, z10);
                f.this.W();
            }
        }
    }

    /* loaded from: classes.dex */
    public class b extends a0 {
        public b() {
            f.this = r1;
        }

        @Override // androidx.fragment.app.a0
        public final void B(int i10) {
            if (f.this.f29222b) {
                ge.b.n("state= " + i10);
            }
        }

        @Override // androidx.fragment.app.a0
        public final void y(be.b bVar) {
            if (f.this.f30503s0) {
                f.this.N(bVar);
            } else if (f.this.f29221a) {
                ge.b.d("is already stop the scan, do nothing");
            }
        }
    }

    public f(DfuService dfuService, ze.e eVar, DfuService.c cVar) {
        super(dfuService, eVar, cVar);
        this.f30507w0 = null;
        this.f30508x0 = false;
        this.f30509y0 = false;
        this.f30510z0 = false;
        this.A0 = false;
        this.B0 = new Handler(Looper.getMainLooper());
        this.C0 = new a();
    }

    public static be.d Y() {
        be.d dVar = new be.d(17);
        dVar.f4164h = 31000L;
        return dVar;
    }

    @Override // ve.a
    public final void A() {
        this.f30503s0 = false;
        be.c cVar = this.f30502r0;
        if (cVar != null) {
            cVar.j();
        }
    }

    @Override // we.b
    public final void H(be.d dVar) {
        if (this.f29221a) {
            ge.b.n("start le scan");
        }
        this.f30503s0 = true;
        be.c cVar = this.f30502r0;
        if (cVar == null) {
            if (this.f30504t0 == null) {
                this.f30504t0 = new b();
            }
            this.f30502r0 = new be.c(this.f29223c, dVar, this.f30504t0);
        } else {
            cVar.f13586d = dVar;
        }
        this.f30502r0.k();
    }

    public final void L(BluetoothGatt bluetoothGatt) {
        if (bluetoothGatt != null) {
            BluetoothDevice device = bluetoothGatt.getDevice();
            boolean e10 = q().e(4);
            if (this.f29221a) {
                ge.b.n(String.format("close gatt connection: %s, closeClient=%b", p.b.m(device.getAddress()), Boolean.valueOf(e10)));
            }
            vd.c cVar = this.f30505u0;
            if (cVar != null) {
                cVar.b(device.getAddress(), e10);
            } else if (e10) {
                bluetoothGatt.close();
            }
        }
        B(1280);
    }

    public final void M(BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic, byte[] bArr, int i10) {
        S(bluetoothGatt, bluetoothGattCharacteristic, bArr, i10, false);
        if (this.A0) {
            return;
        }
        j(i10, bArr);
    }

    /* JADX WARN: Code restructure failed: missing block: B:139:0x00ee, code lost:
        if (r1.equals(r6.H) != false) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:168:0x019d, code lost:
        if (r1.equals(r0.getAddress()) != false) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:169:0x019f, code lost:
        r5 = true;
     */
    /* JADX WARN: Removed duplicated region for block: B:171:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x01de A[ORIG_RETURN, RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void N(be.b r7) {
        /*
            Method dump skipped, instructions count: 491
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: xe.f.N(be.b):void");
    }

    public final void O(boolean z10) {
        ce.a aVar;
        be.d Y = Y();
        ArrayList arrayList = new ArrayList();
        if (z10) {
            int i10 = q().L;
            byte[] bArr = s().F;
            if (bArr != null && i10 < 0) {
                throw new IllegalArgumentException("invalid manufacture id");
            }
            aVar = new ce.a(null, null, null, null, null, null, null, null, null, i10, bArr, null, 0, null);
        } else {
            int i11 = q().L;
            String str = this.H;
            byte[] bArr2 = new byte[6];
            if (str != null) {
                bArr2[5] = (byte) (Character.digit(str.charAt(16), 16) + (Character.digit(str.charAt(15), 16) * 16));
                bArr2[4] = (byte) (Character.digit(str.charAt(13), 16) + (Character.digit(str.charAt(12), 16) * 16));
                bArr2[3] = (byte) (Character.digit(str.charAt(10), 16) + (Character.digit(str.charAt(9), 16) * 16));
                bArr2[2] = (byte) (Character.digit(str.charAt(7), 16) + (Character.digit(str.charAt(6), 16) * 16));
                bArr2[1] = (byte) (Character.digit(str.charAt(4), 16) + (Character.digit(str.charAt(3), 16) * 16));
                bArr2[0] = (byte) (Character.digit(str.charAt(1), 16) + (Character.digit(str.charAt(0), 16) * 16));
            } else {
                bArr2[0] = 0;
                bArr2[1] = 0;
                bArr2[2] = 0;
                bArr2[3] = 0;
                bArr2[4] = 0;
                bArr2[5] = 0;
            }
            if (i11 >= 0) {
                aVar = new ce.a(null, null, null, null, null, null, null, null, null, i11, bArr2, null, 0, null);
            } else {
                throw new IllegalArgumentException("invalid manufacture id");
            }
        }
        arrayList.add(aVar);
        Y.f4172p = arrayList;
        if (!this.f29233h) {
            z(519);
            this.D = 0;
            this.f29800p0 = false;
            H(Y);
            try {
                synchronized (this.f29799o0) {
                    if (this.D == 0 && !this.f29800p0) {
                        this.f29799o0.wait(31000L);
                    }
                }
            } catch (InterruptedException e10) {
                StringBuilder a10 = android.support.v4.media.d.a("scanLeDevice interrupted, e = ");
                a10.append(e10.toString());
                ge.b.p(a10.toString());
                this.D = 259;
            }
            if (this.D == 0 && !this.f29800p0) {
                ge.b.p("didn't find the special device");
                this.D = 265;
            }
            if (this.D == 0) {
                return;
            }
            throw new ne.c("Error while scan remote ota device", this.D);
        }
        throw new ne.c("user aborted", 4128);
    }

    public final boolean P(BluetoothGattCharacteristic bluetoothGattCharacteristic, byte[] bArr, boolean z10) {
        return S(this.f30506v0, bluetoothGattCharacteristic, bArr, bArr != null ? bArr.length : -1, z10);
    }

    /* JADX WARN: Removed duplicated region for block: B:92:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x00a8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final byte[] Q(android.bluetooth.BluetoothGattCharacteristic r9) {
        /*
            r8 = this;
            android.bluetooth.BluetoothGatt r0 = r8.f30506v0
            boolean r1 = r8.f29233h
            if (r1 != 0) goto Lb2
            r1 = 0
            if (r0 != 0) goto Lc
            java.lang.String r9 = "gatt == null"
            goto L1b
        Lc:
            if (r9 != 0) goto L11
            java.lang.String r9 = "characteristic == null"
            goto L1b
        L11:
            int r2 = r9.getProperties()
            r3 = 2
            r2 = r2 & r3
            if (r2 != 0) goto L20
            java.lang.String r9 = "characteristic not support PROPERTY_READ"
        L1b:
            ge.b.p(r9)
            goto La7
        L20:
            boolean r2 = r8.f29221a
            java.util.Locale r4 = java.util.Locale.US
            java.lang.Object[] r3 = new java.lang.Object[r3]
            int r5 = r9.getInstanceId()
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r6 = 0
            r3[r6] = r5
            java.util.UUID r5 = r9.getUuid()
            java.lang.String r5 = r5.toString()
            r7 = 1
            r3[r7] = r5
            java.lang.String r5 = "readCharacteristic:(handler=%d) %s"
            java.lang.String r3 = java.lang.String.format(r4, r5, r3)
            ge.b.o(r3, r2)
            r8.D = r6
            r8.f29246p = r1
            r8.f29245o = r6
            boolean r9 = r0.readCharacteristic(r9)
            if (r9 == 0) goto L98
            java.lang.Object r9 = r8.f29244n
            monitor-enter(r9)
            int r0 = r8.D     // Catch: java.lang.Throwable -> L6a java.lang.InterruptedException -> L6c
            if (r0 != 0) goto L85
            boolean r0 = r8.f29245o     // Catch: java.lang.Throwable -> L6a java.lang.InterruptedException -> L6c
            if (r0 != 0) goto L85
            int r0 = r8.f29243m     // Catch: java.lang.Throwable -> L6a java.lang.InterruptedException -> L6c
            r1 = 515(0x203, float:7.22E-43)
            if (r0 != r1) goto L85
            java.lang.Object r0 = r8.f29244n     // Catch: java.lang.Throwable -> L6a java.lang.InterruptedException -> L6c
            r1 = 15000(0x3a98, double:7.411E-320)
            r0.wait(r1)     // Catch: java.lang.Throwable -> L6a java.lang.InterruptedException -> L6c
            goto L85
        L6a:
            r0 = move-exception
            goto L96
        L6c:
            r0 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L6a
            r1.<init>()     // Catch: java.lang.Throwable -> L6a
            java.lang.String r2 = "mCharacteristicReadCalledLock Sleeping interrupted,e:"
            r1.append(r2)     // Catch: java.lang.Throwable -> L6a
            r1.append(r0)     // Catch: java.lang.Throwable -> L6a
            java.lang.String r0 = r1.toString()     // Catch: java.lang.Throwable -> L6a
            ge.b.p(r0)     // Catch: java.lang.Throwable -> L6a
            r0 = 259(0x103, float:3.63E-43)
            r8.D = r0     // Catch: java.lang.Throwable -> L6a
        L85:
            monitor-exit(r9)     // Catch: java.lang.Throwable -> L6a
            int r9 = r8.D
            if (r9 != 0) goto La1
            boolean r9 = r8.f29245o
            if (r9 != 0) goto La1
            java.lang.String r9 = "read value but no callback"
            ge.b.p(r9)
            r9 = 261(0x105, float:3.66E-43)
            goto L9f
        L96:
            monitor-exit(r9)     // Catch: java.lang.Throwable -> L6a
            throw r0
        L98:
            java.lang.String r9 = "readCharacteristic failed"
            ge.b.d(r9)
            r9 = 279(0x117, float:3.91E-43)
        L9f:
            r8.D = r9
        La1:
            int r9 = r8.D
            if (r9 != 0) goto La8
            byte[] r1 = r8.f29246p
        La7:
            return r1
        La8:
            ne.c r9 = new ne.c
            int r0 = r8.D
            java.lang.String r1 = "Error while send command"
            r9.<init>(r1, r0)
            throw r9
        Lb2:
            ne.c r9 = new ne.c
            java.lang.String r0 = "user aborted"
            r1 = 4128(0x1020, float:5.785E-42)
            r9.<init>(r0, r1)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: xe.f.Q(android.bluetooth.BluetoothGattCharacteristic):byte[]");
    }

    public final void R(BluetoothGatt bluetoothGatt) {
        int i10 = this.f29243m;
        if (i10 == 0 || i10 == 1280) {
            if (this.f29221a) {
                ge.b.d("already disconnect");
            }
        } else if (bluetoothGatt == null) {
            if (this.f29221a) {
                ge.b.n("gatt == null");
            }
            B(0);
        } else {
            B(DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED);
            if (this.f29221a) {
                ge.b.n("disconnect()");
            }
            bluetoothGatt.disconnect();
            D();
        }
    }

    public final boolean S(BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic, byte[] bArr, int i10, boolean z10) {
        String str;
        byte[] bArr2;
        boolean a10;
        if (!z10 && this.f29233h) {
            throw new ne.c("user aborted", 4128);
        }
        if (bluetoothGattCharacteristic == null) {
            str = "characteristic == null";
        } else if (bArr != null && i10 >= 0) {
            this.f30507w0 = null;
            this.f29250t = true;
            boolean z11 = false;
            int i11 = 0;
            while (this.f29250t) {
                this.f29248r = false;
                if (i11 > 0) {
                    if (this.f29221a) {
                        ge.b.d("re-send command just wait a while");
                    }
                    try {
                        Thread.sleep(1000L);
                    } catch (InterruptedException unused) {
                    }
                    if (!z10 && this.f29233h) {
                        throw new ne.c("user aborted", 4128);
                    }
                }
                long j10 = 15000;
                if (bluetoothGattCharacteristic.getWriteType() == 2) {
                    j10 = 30000;
                }
                if (bluetoothGatt == null) {
                    ge.b.p("gatt == null");
                    a10 = false;
                } else {
                    if (bArr.length > i10) {
                        bArr2 = new byte[i10];
                        System.arraycopy(bArr, 0, bArr2, 0, i10);
                    } else {
                        bArr2 = bArr;
                    }
                    if (this.f29221a) {
                        ge.b.n(String.format(Locale.US, "[TX] WRITE_TYPE_0x%02X, (%d)%s << (%d)%s", Integer.valueOf(bluetoothGattCharacteristic.getWriteType()), Integer.valueOf(bluetoothGattCharacteristic.getInstanceId()), bluetoothGattCharacteristic.getUuid(), Integer.valueOf(bArr2.length), he.a.a(bArr2)));
                    }
                    a10 = wd.a.a(bluetoothGatt, bluetoothGattCharacteristic, bArr2);
                }
                if (a10) {
                    synchronized (this.f29247q) {
                        try {
                            if (!this.f29248r && this.f29243m == 515) {
                                this.f29247q.wait(j10);
                            } else if (this.f29222b) {
                                ge.b.n("writePacket success");
                            }
                        } catch (InterruptedException e10) {
                            ge.b.p("mWriteLock Sleeping interrupted,e:" + e10);
                            if (this.D == 0) {
                                this.D = 259;
                            }
                        }
                    }
                    if (this.D == 0 && !this.f29248r) {
                        ge.b.p("send command but no callback");
                        this.D = 261;
                    }
                    z11 = a10;
                } else {
                    ge.b.p("writePacket failed");
                    this.D = 267;
                    z11 = false;
                }
                if (this.D == 0 && i11 > 3) {
                    ge.b.p("send command reach max try time");
                    this.D = 268;
                } else {
                    i11++;
                }
                if (this.D != 0) {
                    throw new ne.c("Error while send command", this.D);
                }
            }
            return z11;
        } else {
            str = "value == null || size < 0";
        }
        ge.b.p(str);
        return false;
    }

    public final byte[] T(long j10) {
        this.D = 0;
        this.f30509y0 = true;
        try {
            synchronized (this.W) {
                if (this.D == 0 && this.f30507w0 == null && this.f29243m == 515) {
                    this.f30509y0 = false;
                    if (this.f29222b) {
                        ge.b.n("wait for notification, wait for " + j10 + "ms");
                    }
                    this.W.wait(j10);
                }
                if (this.D == 0 && !this.f30509y0) {
                    ge.b.p("wait for notification, but not come");
                    this.D = 767;
                }
            }
        } catch (InterruptedException e10) {
            StringBuilder a10 = android.support.v4.media.d.a("readNotificationResponse interrupted, ");
            a10.append(e10.toString());
            ge.b.p(a10.toString());
            this.D = 259;
        }
        if (this.D == 0) {
            return this.f30507w0;
        }
        throw new ne.c("Unable to receive notification", this.D);
    }

    public final void U(int i10) {
        if (!q().f32310v) {
            ge.b.d("not support update buffer check mtu size");
            return;
        }
        int i11 = 16;
        if (i10 - 3 > 16) {
            i11 = (i10 / 16) * 16;
        }
        this.f29230f0 = i11;
        zd.b.a(android.support.v4.media.d.a("> mBufferCheckMtuSize="), this.f29230f0);
    }

    public final void V(int i10) {
        try {
            Thread.sleep(1000L);
        } catch (InterruptedException unused) {
        }
        ge.b.e(String.format("terminateConnection, error = 0x%04X", Integer.valueOf(i10)), this.f29221a);
        BluetoothGatt bluetoothGatt = this.f30506v0;
        if (bluetoothGatt != null) {
            R(bluetoothGatt);
            BluetoothGatt bluetoothGatt2 = this.f30506v0;
            if (q().e(2) || bluetoothGatt2.getDevice().getBondState() == 10) {
                ae.b.c(bluetoothGatt2);
            }
            L(this.f30506v0);
        }
    }

    public final void W() {
        String str;
        if (this.f30506v0 == null) {
            ge.b.p("mBluetoothGatt == null");
            this.D = 258;
            w();
        } else if (this.f29233h) {
            ge.b.p("task already aborted, ignore");
            this.D = 4128;
        } else {
            if (this.f29221a) {
                ge.b.d("Attempting to start service discovery...");
            }
            boolean discoverServices = this.f30506v0.discoverServices();
            if (this.f29222b) {
                StringBuilder a10 = android.support.v4.media.d.a("discoverServices ");
                if (discoverServices) {
                    str = "succeed";
                } else {
                    str = "failed";
                }
                a10.append(str);
                ge.b.d(a10.toString());
            }
            if (!discoverServices) {
                this.D = 258;
                w();
            }
        }
    }

    public final void X() {
        O(s().f32261k > 3);
    }

    public final byte[] Z() {
        return T(q().f32296k0);
    }

    public final void a0() {
        this.f30503s0 = false;
        be.c cVar = this.f30502r0;
        if (cVar != null) {
            cVar.l();
        }
    }

    @Override // ve.a
    public final void f() {
        Handler handler = this.B0;
        if (handler != null) {
            handler.removeCallbacks(this.C0);
        }
        super.f();
    }

    @Override // we.b, ve.a
    public void o() {
        boolean z10;
        ze.f fVar = this.f29240k0;
        if (fVar != null) {
            z10 = fVar.f32315a;
        } else {
            z10 = true;
        }
        this.A0 = z10;
        if (this.f29222b) {
            StringBuilder a10 = android.support.v4.media.d.a("gattCharacteristicCacheValueEnabled=");
            a10.append(this.A0);
            ge.b.n(a10.toString());
        }
    }

    @Override // we.b, ve.a
    public void u() {
        super.u();
        this.f30505u0 = vd.c.f29212m;
        if (this.f30504t0 == null) {
            this.f30504t0 = new b();
        }
        this.f30502r0 = new be.c(this.f29223c, null, this.f30504t0);
    }
}
