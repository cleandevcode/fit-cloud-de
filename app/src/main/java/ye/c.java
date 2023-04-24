package ye;

import android.bluetooth.BluetoothGatt;
import android.bluetooth.BluetoothGattCharacteristic;
import androidx.fragment.app.p;
import com.realsil.sdk.dfu.DfuService;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import java.util.UUID;
import xe.g;
import yb.y;
import ze.j;

/* loaded from: classes.dex */
public abstract class c extends g {
    public ArrayList P0;

    public c(DfuService dfuService, ze.e eVar, DfuService.c cVar) {
        super(dfuService, eVar, cVar);
    }

    public final void A0(int i10) {
        int i11 = this.f29224c0;
        if (i11 == 0) {
            i11 = 12;
        }
        u0(i10, i11);
        if (r().f32317b != this.f29224c0) {
            ge.b.o("mBytesSent != mImageUpdateOffset, reload image bin file", this.f29222b);
            K();
            h(this.f29224c0, false);
        }
        if (this.f29222b) {
            ge.b.n(r().toString());
        }
    }

    public final void B0(int i10) {
        ge.b.d("<< OPCODE_DFU_VALIDATE_FW_IMAGE (0x03)");
        P(this.M0, new byte[]{3, (byte) (i10 & 255), (byte) ((i10 >> 8) & 255)}, false);
        int i11 = 10000;
        if ((s().f32261k == 5 || s().f32261k == 9 || s().f32261k == 12) && r().f32316a > 2097152) {
            i11 = Math.max(((r().f32316a / 1048576) + 1) * 4 * 1000, 10000);
        }
        if (this.f29221a) {
            ge.b.d("... waiting DFU_VALIDATE_FW_IMAGE response for " + i11);
        }
        byte b10 = T(i11)[2];
        if (b10 == 1) {
            return;
        }
        if (b10 == 5) {
            throw b.a("0x%02X, Validate FW failed, CRC check error", new Object[]{Byte.valueOf(b10)}, "Validate FW failed", 517);
        }
        throw b.a("0x%02X(not supported), Validate FW failed", new Object[]{Byte.valueOf(b10)}, "Validate FW failed", 766);
    }

    public final void C0() {
        w0(new byte[]{4});
    }

    /* JADX WARN: Code restructure failed: missing block: B:111:0x0066, code lost:
        r7 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x0067, code lost:
        if (r7 >= r3) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x0069, code lost:
        r6[r7 / 2] = (byte) ((java.lang.Character.digit(r0.charAt(r7), 16) << 4) + java.lang.Character.digit(r0.charAt(r7 + 1), 16));
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x0083, code lost:
        r7 = r7 + 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x0086, code lost:
        r5 = r6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void D0() {
        /*
            Method dump skipped, instructions count: 321
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ye.c.D0():void");
    }

    @Override // ve.a
    public final void c(int i10, boolean z10) {
        if (this.f29233h) {
            i10 = 4128;
        }
        if (i10 != 4128) {
            z(260);
        }
        ge.b.n(String.format("error = 0x%04X, needReset=%b", Integer.valueOf(i10), Boolean.valueOf(z10)));
        if (z10) {
            r0();
        }
        be.c cVar = this.f30502r0;
        if (cVar != null) {
            cVar.l();
        }
        n(this.f29254x);
        if (q().e(1)) {
            V(i10);
        }
        y yVar = this.f29229f;
        if (yVar != null) {
            yVar.z(i10);
        }
        this.f29233h = true;
    }

    @Override // xe.g
    public final synchronized void d0(int i10, byte[] bArr) {
        if (i10 == 7) {
            ge.b.e("ignore connection parameters notification", this.f29221a);
            synchronized (this.W) {
                this.f30507w0 = bArr;
                this.f30509y0 = true;
                this.W.notifyAll();
            }
        } else if (i10 != 8) {
            synchronized (this.W) {
                this.f30507w0 = bArr;
                this.f30509y0 = true;
                this.W.notifyAll();
            }
        } else {
            byte b10 = bArr.length >= 3 ? bArr[2] : (byte) 0;
            boolean z10 = this.f29221a;
            ge.b.e("remote state changed, busyMode=" + ((int) b10), z10);
            synchronized (this.f29234h0) {
                this.f29232g0 = b10 == 1;
                this.f29234h0.notifyAll();
            }
        }
    }

    @Override // xe.g
    public final boolean i0(BluetoothGatt bluetoothGatt) {
        if (!super.i0(bluetoothGatt)) {
            return false;
        }
        this.P0 = new ArrayList();
        for (int i10 = 65504; i10 < 65519; i10++) {
            UUID a10 = de.a.a(i10);
            BluetoothGattCharacteristic characteristic = this.E0.getCharacteristic(a10);
            if (characteristic == null) {
                if (this.f29222b) {
                    p.b(a10, android.support.v4.media.d.a("not found image version characteristic:"));
                    return true;
                }
                return true;
            }
            if (this.f29221a) {
                p.b(a10, android.support.v4.media.d.a("find image version characteristic: "));
            }
            ge.b.d(ae.b.b(characteristic.getProperties()));
            this.P0.add(characteristic);
        }
        return true;
    }

    public abstract boolean m0();

    public final void n0() {
        String str;
        this.f29235i = false;
        z(517);
        try {
            Thread.sleep(1500L);
        } catch (InterruptedException unused) {
        }
        this.X = new j(this.f29225d);
        if (this.G0 != null) {
            if (this.f29221a) {
                ge.b.n("start to read remote dev info");
            }
            byte[] Q = Q(this.G0);
            if (Q != null) {
                s().u(Q);
                b(s().D);
            } else {
                ge.b.p("Get dev info failed");
                throw new ne.c("get remote dev info failed", 270);
            }
        }
        if ((s().f32261k == 5 || s().f32261k == 9 || s().f32261k == 4 || s().f32261k == 6 || s().f32261k == 7 || s().f32261k == 8 || s().f32261k == 13 || s().f32261k == 10 || s().f32261k == 11 || s().f32261k == 12) && this.H0 != null) {
            if (this.f29221a) {
                ge.b.n("start to read remote dev Mac Addr info");
            }
            byte[] Q2 = Q(this.H0);
            if (Q2 != null && Q2.length >= 6) {
                byte[] bArr = new byte[6];
                System.arraycopy(Q2, 0, bArr, 0, 6);
                s().F = bArr;
            } else {
                ge.b.p("Get remote dev Mac Addr info failed, do nothing.");
                throw new ne.c("remote dev Mac Addr info error", 277);
            }
        }
        ArrayList arrayList = this.P0;
        byte[] bArr2 = null;
        if (arrayList != null && arrayList.size() > 0) {
            Iterator it = this.P0.iterator();
            while (it.hasNext()) {
                BluetoothGattCharacteristic bluetoothGattCharacteristic = (BluetoothGattCharacteristic) it.next();
                if (this.f29221a) {
                    StringBuilder a10 = android.support.v4.media.d.a("read image version : ");
                    a10.append(bluetoothGattCharacteristic.getUuid().toString());
                    str = a10.toString();
                } else {
                    str = "read image version";
                }
                ge.b.n(str);
                byte[] Q3 = Q(bluetoothGattCharacteristic);
                if (Q3 != null) {
                    if (bArr2 == null) {
                        bArr2 = Q3;
                    } else {
                        byte[] bArr3 = new byte[bArr2.length + Q3.length];
                        System.arraycopy(bArr2, 0, bArr3, 0, bArr2.length);
                        System.arraycopy(Q3, 0, bArr3, bArr2.length, Q3.length);
                        bArr2 = bArr3;
                    }
                }
            }
            s().z(bArr2);
        } else {
            s().z(null);
            ge.b.o("no ImageVersionCharacteristics to read", this.f29222b);
        }
        if (this.f29221a) {
            ge.b.d(s().toString());
        }
        K();
        this.f29235i = true;
        ge.b.d("Ota Environment prepared.");
    }

    @Override // xe.f, we.b, ve.a
    public final void o() {
        int v10;
        super.o();
        try {
            v10 = v();
        } catch (Exception e10) {
            ge.b.p(e10.toString());
            c(0, false);
        }
        if (v10 != 0) {
            c(v10, false);
            return;
        }
        m0();
        n(this.f29254x);
        if (this.f29221a) {
            ge.b.d("GattDfuTaskX0000 stopped");
        }
        if (this.f29252v == 525) {
            z(259);
        }
    }

    public final void o0() {
        ge.b.d("<<  OPCODE_DFU_REPORT_CURRENT_BUFFER_SIZE(0x0A)");
        P(this.M0, new byte[]{10}, false);
        if (this.f29221a) {
            ge.b.d("... Reading OPCODE_DFU_REPORT_CURRENT_BUFFER_SIZE notification");
        }
        byte[] Z = Z();
        byte b10 = Z[2];
        if (b10 != 1) {
            ge.b.p("Get remote buffer size info failed, status: " + ((int) b10));
            throw new ne.c("Get remote buffer size info failed", b10 | 512);
        }
        ByteBuffer wrap = ByteBuffer.wrap(Z);
        wrap.order(ByteOrder.LITTLE_ENDIAN);
        int i10 = wrap.getInt(3);
        ge.b.n(String.format(Locale.US, "maxBufferCheckSize=(0x%04X, %d)", Integer.valueOf(i10), Integer.valueOf(i10)));
        b(i10);
    }

    public final int p0() {
        if (this.M0 == null) {
            ge.b.p("no mControlPointCharacteristic found");
            return 0;
        }
        ge.b.d("<< OPCODE_DFU_ENABLE_BUFFER_CHECK_MODE(0x09)");
        P(this.M0, new byte[]{9}, false);
        try {
            if (this.f29221a) {
                ge.b.d("... Reading OPCODE_DFU_ENABLE_BUFFER_CHECK_MODE notification");
            }
            byte[] T = T(1600L);
            if (T[2] == 1) {
                ByteBuffer wrap = ByteBuffer.wrap(T);
                wrap.order(ByteOrder.LITTLE_ENDIAN);
                int i10 = (((short) (wrap.get(4) & 255)) << 8) | ((short) (wrap.get(3) & 255));
                int i11 = ((short) (wrap.get(5) & 255)) | (((short) (wrap.get(6) & 255)) << 8);
                if (this.f29221a) {
                    ge.b.n("maxBufferSize=" + i10 + ", bufferCheckMtuSize=" + i11);
                }
                b(i10);
                U(i11);
                return 1;
            }
        } catch (ie.a unused) {
            ge.b.p("Read DFU_REPORT_OTA_FUNCTION_VERSION failed, just think remote is normal function.");
            this.D = 0;
        }
        return 0;
    }

    public final int q0() {
        byte[] T;
        byte b10;
        if (this.M0 == null) {
            ge.b.p("no mControlPointCharacteristic found");
            return 0;
        }
        ge.b.o("<< OPCODE_DFU_REPORT_OTA_FUNCTION_VERSION(0x09)", this.f29221a);
        P(this.M0, new byte[]{9}, false);
        try {
            if (this.f29221a) {
                ge.b.d("Reading OPCODE_DFU_REPORT_OTA_FUNCTION_VERSION notification");
            }
            T = T(1600L);
            b10 = T[2];
        } catch (ie.a unused) {
            ge.b.p("Reading OPCODE_DFU_REPORT_OTA_FUNCTION_VERSION notification failed, just think remote is normal function.");
            this.D = 0;
        }
        if (b10 == 1) {
            ByteBuffer.wrap(T).order(ByteOrder.LITTLE_ENDIAN);
            return 1;
        }
        ge.b.p("reportOtaFunctionVersion failed, status: " + ((int) b10));
        return 0;
    }

    public final boolean r0() {
        try {
            ge.b.e("<< OPCODE_DFU_RESET_SYSTEM (0x05)", this.f29221a);
            return P(this.M0, new byte[]{5}, true);
        } catch (ie.a e10) {
            ge.b.p(String.format("Send OPCODE_DFU_RESET_SYSTEM failed, ignore it, errorcode= 0x%04X", Integer.valueOf(e10.f16770b)));
            this.D = 0;
            return false;
        }
    }

    public final void s0() {
        ge.b.n("<< OPCODE_DFU_START_DFU(0x01)");
        byte[] bArr = new byte[16];
        System.arraycopy(this.f29254x.f28066w, 0, bArr, 0, 12);
        byte[] bArr2 = new byte[17];
        bArr2[0] = 1;
        if (s().f32268r) {
            System.arraycopy(this.C.a(bArr, 0, 16), 0, bArr2, 1, 16);
        } else {
            System.arraycopy(bArr, 0, bArr2, 1, 16);
        }
        P(this.M0, bArr2, false);
        if (this.f29221a) {
            ge.b.n("... Reading OPCODE_DFU_START_DFU(0x01) notification");
        }
        byte b10 = Z()[2];
        if (b10 == 1) {
            return;
        }
        throw b.a("0x%02X(not supported), start dfu failed", new Object[]{Byte.valueOf(b10)}, "start dfu failed", 766);
    }

    /* JADX WARN: Code restructure failed: missing block: B:127:0x019b, code lost:
        r1 = r20;
     */
    /* JADX WARN: Removed duplicated region for block: B:122:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x01a5 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void t0(android.bluetooth.BluetoothGatt r18, android.bluetooth.BluetoothGattCharacteristic r19, te.a r20) {
        /*
            Method dump skipped, instructions count: 478
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ye.c.t0(android.bluetooth.BluetoothGatt, android.bluetooth.BluetoothGattCharacteristic, te.a):void");
    }

    public final void u0(int i10, int i11) {
        ge.b.d("<< OPCODE_DFU_RECEIVE_FW_IMAGE (0x02)");
        P(this.M0, new byte[]{2, (byte) (i10 & 255), (byte) ((i10 >> 8) & 255), (byte) (i11 & 255), (byte) ((i11 >> 8) & 255), (byte) ((i11 >> 16) & 255), (byte) ((i11 >> 24) & 255)}, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:147:0x0068 A[Catch: IOException -> 0x0339, TryCatch #0 {IOException -> 0x0339, blocks: (B:139:0x0054, B:141:0x0059, B:147:0x0068, B:148:0x0089, B:150:0x008d, B:152:0x00a0, B:153:0x00a5, B:156:0x00b7, B:158:0x00d1, B:160:0x00d5, B:161:0x00e8, B:163:0x00f3, B:165:0x0101, B:155:0x00af, B:157:0x00bf), top: B:234:0x0054 }] */
    /* JADX WARN: Removed duplicated region for block: B:150:0x008d A[Catch: IOException -> 0x0339, TryCatch #0 {IOException -> 0x0339, blocks: (B:139:0x0054, B:141:0x0059, B:147:0x0068, B:148:0x0089, B:150:0x008d, B:152:0x00a0, B:153:0x00a5, B:156:0x00b7, B:158:0x00d1, B:160:0x00d5, B:161:0x00e8, B:163:0x00f3, B:165:0x0101, B:155:0x00af, B:157:0x00bf), top: B:234:0x0054 }] */
    /* JADX WARN: Removed duplicated region for block: B:154:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x00d5 A[Catch: IOException -> 0x0339, TryCatch #0 {IOException -> 0x0339, blocks: (B:139:0x0054, B:141:0x0059, B:147:0x0068, B:148:0x0089, B:150:0x008d, B:152:0x00a0, B:153:0x00a5, B:156:0x00b7, B:158:0x00d1, B:160:0x00d5, B:161:0x00e8, B:163:0x00f3, B:165:0x0101, B:155:0x00af, B:157:0x00bf), top: B:234:0x0054 }] */
    /* JADX WARN: Removed duplicated region for block: B:163:0x00f3 A[Catch: IOException -> 0x0339, TryCatch #0 {IOException -> 0x0339, blocks: (B:139:0x0054, B:141:0x0059, B:147:0x0068, B:148:0x0089, B:150:0x008d, B:152:0x00a0, B:153:0x00a5, B:156:0x00b7, B:158:0x00d1, B:160:0x00d5, B:161:0x00e8, B:163:0x00f3, B:165:0x0101, B:155:0x00af, B:157:0x00bf), top: B:234:0x0054 }] */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x02eb  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x030a  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x030e A[EDGE_INSN: B:225:0x030e->B:243:0x000d ?: BREAK  , LOOP:1: B:134:0x0019->B:225:0x030e, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:236:0x0312 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:241:0x0126 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void v0(android.bluetooth.BluetoothGatt r17, android.bluetooth.BluetoothGattCharacteristic r18) {
        /*
            Method dump skipped, instructions count: 842
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ye.c.v0(android.bluetooth.BluetoothGatt, android.bluetooth.BluetoothGattCharacteristic):void");
    }

    public final void w0(byte[] bArr) {
        int i10;
        boolean z10;
        z(524);
        boolean z11 = false;
        try {
            ge.b.d("<< OPCODE_DFU_ACTIVE_IMAGE_RESET(0x04)");
            z10 = P(this.M0, bArr, false);
        } catch (ie.a e10) {
            i10 = 4128;
            if (e10.f16770b != 4128) {
                if (!q().f32303o) {
                    ge.b.d("active cmd has no response, ignore");
                    z10 = true;
                } else {
                    ge.b.p("active cmd has no response, notify error");
                    i10 = e10.f16770b;
                }
            }
        }
        z11 = z10;
        i10 = 0;
        if (z11) {
            ge.b.d("image active success");
            V(this.D);
            n(this.f29254x);
            return;
        }
        throw new ne.c(i10);
    }

    public final void x0(int i10) {
        ArrayList arrayList = this.f29253w;
        if (arrayList == null) {
            return;
        }
        te.a aVar = null;
        Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            te.a aVar2 = (te.a) it.next();
            if (aVar2.f28053j == i10) {
                aVar = aVar2;
                break;
            }
        }
        if (aVar == null) {
            return;
        }
        int i11 = aVar.f28053j;
        int i12 = aVar.f28055l;
        ge.b.n(String.format("<< OPCODE_DFU_CHECK_IMAGE(0x%02X)", (byte) 13));
        P(this.M0, new byte[]{13, (byte) (i11 & 255), (byte) ((i11 >> 8) & 255), (byte) (i12 & 255), (byte) ((i12 >> 8) & 255), (byte) ((i12 >> 16) & 255), (byte) ((i12 >> 24) & 255)}, false);
        if (this.f29221a) {
            ge.b.n("... Reading OPCODE_DFU_CHECK_IMAGE notification");
        }
        byte b10 = Z()[2];
        if (b10 == 1) {
            return;
        }
        throw b.a("0x%02X: check image failed", new Object[]{Byte.valueOf(b10)}, "check image failed", 766);
    }

    public final void y0(int i10) {
        int i11;
        int i12;
        int i13;
        if (this.f29221a) {
            ge.b.d("<< OPCODE_DFU_REPORT_TARGET_IMAGE_INFO(0x06)");
        }
        P(this.M0, new byte[]{6, (byte) (i10 & 255), (byte) ((i10 >> 8) & 255)}, false);
        if (this.f29221a) {
            ge.b.d("... Reading OPCODE_DFU_REPORT_TARGET_IMAGE_INFO(0x06) notification");
        }
        byte[] Z = Z();
        if (Z != null) {
            i11 = Z.length;
        } else {
            i11 = 0;
        }
        byte b10 = -2;
        if (i11 > 2) {
            b10 = Z[2];
        }
        if (b10 == 1) {
            ByteBuffer wrap = ByteBuffer.wrap(Z);
            wrap.order(ByteOrder.LITTLE_ENDIAN);
            if (i11 >= 11) {
                i12 = wrap.getShort(3) & 65535;
                i13 = 7;
            } else if (i11 >= 9) {
                i12 = wrap.getShort(3) & 65535;
                i13 = 5;
            } else {
                this.f29224c0 = 0;
                i12 = 0;
                ge.b.d(String.format(Locale.US, "mOriginalFwVersion=%d, mImageUpdateOffset=0x%08X(%d)", Integer.valueOf(i12), Integer.valueOf(this.f29224c0), Integer.valueOf(this.f29224c0)));
                return;
            }
            this.f29224c0 = wrap.getInt(i13);
            ge.b.d(String.format(Locale.US, "mOriginalFwVersion=%d, mImageUpdateOffset=0x%08X(%d)", Integer.valueOf(i12), Integer.valueOf(this.f29224c0), Integer.valueOf(this.f29224c0)));
            return;
        }
        throw b.a("0x%02X, Get target image info failed", new Object[]{766}, "Get target image info failed", 766);
    }

    public final void z0(int i10) {
        boolean z10;
        if (this.f29224c0 == 0) {
            if (s().f32262l >= 4) {
                z10 = false;
            } else {
                z10 = true;
            }
            if (z10) {
                this.f29224c0 = 12;
                if (this.f29222b) {
                    ge.b.n(String.format(Locale.US, "skip image header (%d)", 12));
                }
            }
        }
        u0(i10, this.f29224c0);
        if (this.f29221a) {
            ge.b.n(String.format(Locale.US, "mImageUpdateOffset=0x%08X(%d),sent=%d", Integer.valueOf(this.f29224c0), Integer.valueOf(this.f29224c0), Integer.valueOf(r().f32317b)));
        }
        int i11 = r().f32317b;
        int i12 = this.f29224c0;
        if (i11 != i12 && i12 != -1) {
            ge.b.o("mBytesSent != mImageUpdateOffset, reload image bin file", this.f29222b);
            K();
            h(this.f29224c0, false);
        }
        if (this.f29222b) {
            ge.b.n(r().toString());
        }
    }
}
