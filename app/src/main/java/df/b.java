package df;

import android.bluetooth.BluetoothGatt;
import android.bluetooth.BluetoothGattCharacteristic;
import android.bluetooth.BluetoothGattService;
import androidx.appcompat.widget.u0;
import androidx.fragment.app.p;
import com.realsil.sdk.dfu.DfuService;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import java.util.UUID;
import s.p1;
import yb.y;

/* loaded from: classes.dex */
public abstract class b extends xe.g {
    public BluetoothGattCharacteristic P0;
    public BluetoothGattCharacteristic Q0;
    public BluetoothGattCharacteristic R0;
    public ArrayList S0;
    public byte T0;

    public b(DfuService dfuService, ze.e eVar, DfuService.c cVar) {
        super(dfuService, eVar, cVar);
        this.T0 = (byte) -1;
    }

    public final void A0() {
        v0(new byte[]{4});
    }

    public final void B0() {
        if (q().f32304p.longValue() > 0) {
            try {
                Thread.sleep(q().f32304p.longValue());
            } catch (InterruptedException unused) {
            }
        }
    }

    public final int C0() {
        byte[] T;
        if (this.M0 == null) {
            ge.b.p("no mControlPointCharacteristic found");
            return 0;
        }
        ge.b.d("<< OPCODE_DFU_ENABLE_BUFFER_CHECK_MODE(0x09)");
        P(this.M0, new byte[]{9}, false);
        try {
            if (this.f29222b) {
                ge.b.n("... Reading OPCODE_DFU_ENABLE_BUFFER_CHECK_MODE notification");
            }
            T = T(1600L);
        } catch (ie.a unused) {
            ge.b.p("Read OPCODE_DFU_ENABLE_BUFFER_CHECK_MODE exception, just think remote is normal function.");
            this.D = 0;
        }
        if (T[2] != 1) {
            ge.b.d("Read OPCODE_DFU_ENABLE_BUFFER_CHECK_MODE failed, just think remote is normal function.");
            return 0;
        }
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
            p0();
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
        byte b10;
        synchronized (this) {
        }
        boolean z10 = true;
        if (i10 != 7) {
            if (i10 != 8) {
                synchronized (this.W) {
                    this.f30507w0 = bArr;
                    this.f30509y0 = true;
                    this.W.notifyAll();
                }
            } else {
                if (bArr.length >= 3) {
                    b10 = bArr[2];
                } else {
                    b10 = 0;
                }
                boolean z11 = this.f29221a;
                ge.b.o("remote state changed, busyMode=" + ((int) b10), z11);
                synchronized (this.f29234h0) {
                    if (b10 != 1) {
                        z10 = false;
                    }
                    this.f29232g0 = z10;
                    this.f29234h0.notifyAll();
                }
            }
        } else {
            synchronized (this.W) {
                if (this.T0 == 7) {
                    this.f30507w0 = bArr;
                    this.f30509y0 = true;
                    this.W.notifyAll();
                } else {
                    ge.b.o("ignore connection parameters notification", this.f29222b);
                }
            }
        }
    }

    @Override // xe.g
    public final boolean i0(BluetoothGatt bluetoothGatt) {
        if (!super.i0(bluetoothGatt)) {
            return false;
        }
        BluetoothGattService bluetoothGattService = this.E0;
        UUID uuid = h.f13024c;
        BluetoothGattCharacteristic characteristic = bluetoothGattService.getCharacteristic(uuid);
        this.Q0 = characteristic;
        if (characteristic == null) {
            ge.b.d("OTA_READ_PATCH_CHARACTERISTIC_UUID not found:" + uuid);
        } else if (this.f29222b) {
            p.b(uuid, android.support.v4.media.d.a("find OTA_PATCH_VERSION_CHARACTERISTIC_UUID: "));
            ge.b.n(ae.b.b(this.Q0.getProperties()));
        }
        BluetoothGattService bluetoothGattService2 = this.E0;
        UUID uuid2 = h.f13025d;
        BluetoothGattCharacteristic characteristic2 = bluetoothGattService2.getCharacteristic(uuid2);
        this.P0 = characteristic2;
        if (characteristic2 == null) {
            ge.b.d("OTA_READ_APP_CHARACTERISTIC_UUID not found: " + uuid2);
        } else if (this.f29222b) {
            p.b(uuid2, android.support.v4.media.d.a("find OTA_APP_VERSION_CHARACTERISTIC_UUID: "));
            ge.b.n(ae.b.b(this.P0.getProperties()));
        }
        BluetoothGattService bluetoothGattService3 = this.E0;
        UUID uuid3 = h.f13026e;
        BluetoothGattCharacteristic characteristic3 = bluetoothGattService3.getCharacteristic(uuid3);
        this.R0 = characteristic3;
        if (characteristic3 == null) {
            ge.b.d("OTA_PATCH_EXTENSION_VERSION_CHARACTERISTIC_UUID not found:" + uuid3);
        } else if (this.f29222b) {
            p.b(uuid3, android.support.v4.media.d.a("find OTA_PATCH_EXTENSION_VERSION_CHARACTERISTIC_UUID: "));
            ge.b.n(ae.b.b(this.R0.getProperties()));
        }
        this.S0 = new ArrayList();
        for (int i10 = 65504; i10 < 65519; i10++) {
            UUID a10 = de.a.a(i10);
            BluetoothGattCharacteristic characteristic4 = this.E0.getCharacteristic(a10);
            if (characteristic4 == null) {
                if (this.f29222b) {
                    p.b(a10, android.support.v4.media.d.a("not found image version characteristic:"));
                    return true;
                }
                return true;
            }
            if (this.f29222b) {
                StringBuilder a11 = android.support.v4.media.d.a("find image version characteristic: ");
                a11.append(a10.toString());
                ge.b.n(a11.toString());
                ge.b.n(ae.b.b(characteristic4.getProperties()));
            }
            this.S0.add(characteristic4);
        }
        return true;
    }

    public final void m0() {
        String str;
        int i10;
        int i11;
        if (s().f32262l == 0) {
            if (this.Q0 != null) {
                ge.b.n("read patch version");
                byte[] Q = Q(this.Q0);
                if (Q != null) {
                    try {
                        ByteBuffer wrap = ByteBuffer.wrap(Q);
                        wrap.order(ByteOrder.LITTLE_ENDIAN);
                        if (s().f32261k > 3) {
                            if (s().f32261k != 5) {
                                if (s().f32261k != 9) {
                                    if (s().f32261k == 12) {
                                    }
                                }
                            }
                            i11 = wrap.getInt(0);
                            s().G = i11;
                        }
                        i11 = wrap.getShort(0) & 65535;
                        s().G = i11;
                    } catch (Exception e10) {
                        ge.b.p(e10.toString());
                    }
                }
            }
            if (this.P0 != null) {
                ge.b.n("read app version");
                byte[] Q2 = Q(this.P0);
                if (Q2 != null) {
                    try {
                        ByteBuffer wrap2 = ByteBuffer.wrap(Q2);
                        wrap2.order(ByteOrder.LITTLE_ENDIAN);
                        if (s().f32261k > 3) {
                            if (s().f32261k != 5) {
                                if (s().f32261k != 9) {
                                    if (s().f32261k == 12) {
                                    }
                                }
                            }
                            i10 = wrap2.getInt(0);
                            s().H = i10;
                        }
                        i10 = wrap2.getShort(0) & 65535;
                        s().H = i10;
                    } catch (Exception e11) {
                        ge.b.f(e11.toString());
                    }
                }
            }
            if (this.R0 != null) {
                ge.b.n("read patch extension version");
                byte[] Q3 = Q(this.R0);
                if (Q3 != null) {
                    ByteBuffer wrap3 = ByteBuffer.wrap(Q3);
                    wrap3.order(ByteOrder.LITTLE_ENDIAN);
                    s().I = wrap3.getShort(0) & 65535;
                    return;
                }
                return;
            }
            return;
        }
        ArrayList arrayList = this.S0;
        byte[] bArr = null;
        if (arrayList != null && arrayList.size() > 0) {
            Iterator it = this.S0.iterator();
            while (it.hasNext()) {
                BluetoothGattCharacteristic bluetoothGattCharacteristic = (BluetoothGattCharacteristic) it.next();
                if (this.f29222b) {
                    StringBuilder a10 = android.support.v4.media.d.a("read image version : ");
                    a10.append(bluetoothGattCharacteristic.getUuid().toString());
                    str = a10.toString();
                } else {
                    str = "read image version";
                }
                ge.b.n(str);
                byte[] Q4 = Q(bluetoothGattCharacteristic);
                if (Q4 != null) {
                    if (bArr == null) {
                        bArr = Q4;
                    } else {
                        byte[] bArr2 = new byte[bArr.length + Q4.length];
                        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
                        System.arraycopy(Q4, 0, bArr2, bArr.length, Q4.length);
                        bArr = bArr2;
                    }
                }
            }
            s().z(bArr);
            return;
        }
        s().z(null);
        ge.b.o("no ImageVersionCharacteristics to read", this.f29221a);
    }

    public final void n0() {
        ge.b.e("<<  OPCODE_DFU_REPORT_CURRENT_BUFFER_SIZE(0x0A)", this.f29221a);
        P(this.M0, new byte[]{10}, false);
        if (this.f29222b) {
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

    public final int o0() {
        byte[] T;
        byte b10;
        if (this.M0 == null) {
            ge.b.p("no mControlPointCharacteristic found");
            return 0;
        }
        ge.b.n("<< OPCODE_DFU_REPORT_OTA_FUNCTION_VERSION(0x09)");
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

    public final boolean p0() {
        try {
            ge.b.e("<< OPCODE_DFU_RESET_SYSTEM (0x05)", this.f29221a);
            return P(this.M0, new byte[]{5}, true);
        } catch (ie.a e10) {
            ge.b.p(String.format("Send OPCODE_DFU_RESET_SYSTEM failed, ignore it, errorcode= 0x%04X", Integer.valueOf(e10.f16770b)));
            this.D = 0;
            return false;
        }
    }

    public final void q0() {
        ge.b.n("<< OPCODE_DFU_START_DFU(0x01)");
        byte[] bArr = new byte[16];
        System.arraycopy(this.f29254x.f28050g, 0, bArr, 0, 12);
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
        ge.b.f(String.format("0x%02X(not supported), start dfu failed", Byte.valueOf(b10)));
        throw new ne.c("start dfu failed", 766);
    }

    public final void r0(int i10, int i11) {
        ge.b.e("<< OPCODE_DFU_RECEIVE_FW_IMAGE (0x02)", this.f29221a);
        P(this.M0, new byte[]{2, (byte) (i10 & 255), (byte) ((i10 >> 8) & 255), (byte) (i11 & 255), (byte) ((i11 >> 8) & 255), (byte) ((i11 >> 16) & 255), (byte) ((i11 >> 24) & 255)}, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:136:0x0064 A[Catch: IOException -> 0x02c7, TryCatch #0 {IOException -> 0x02c7, blocks: (B:128:0x0050, B:130:0x0055, B:136:0x0064, B:137:0x0071, B:139:0x0075, B:141:0x0088, B:142:0x008d, B:144:0x00ae, B:146:0x00b2, B:147:0x00c5, B:149:0x00d0, B:151:0x00de, B:143:0x009c), top: B:213:0x0050 }] */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0075 A[Catch: IOException -> 0x02c7, TryCatch #0 {IOException -> 0x02c7, blocks: (B:128:0x0050, B:130:0x0055, B:136:0x0064, B:137:0x0071, B:139:0x0075, B:141:0x0088, B:142:0x008d, B:144:0x00ae, B:146:0x00b2, B:147:0x00c5, B:149:0x00d0, B:151:0x00de, B:143:0x009c), top: B:213:0x0050 }] */
    /* JADX WARN: Removed duplicated region for block: B:143:0x009c A[Catch: IOException -> 0x02c7, TryCatch #0 {IOException -> 0x02c7, blocks: (B:128:0x0050, B:130:0x0055, B:136:0x0064, B:137:0x0071, B:139:0x0075, B:141:0x0088, B:142:0x008d, B:144:0x00ae, B:146:0x00b2, B:147:0x00c5, B:149:0x00d0, B:151:0x00de, B:143:0x009c), top: B:213:0x0050 }] */
    /* JADX WARN: Removed duplicated region for block: B:146:0x00b2 A[Catch: IOException -> 0x02c7, TryCatch #0 {IOException -> 0x02c7, blocks: (B:128:0x0050, B:130:0x0055, B:136:0x0064, B:137:0x0071, B:139:0x0075, B:141:0x0088, B:142:0x008d, B:144:0x00ae, B:146:0x00b2, B:147:0x00c5, B:149:0x00d0, B:151:0x00de, B:143:0x009c), top: B:213:0x0050 }] */
    /* JADX WARN: Removed duplicated region for block: B:149:0x00d0 A[Catch: IOException -> 0x02c7, TryCatch #0 {IOException -> 0x02c7, blocks: (B:128:0x0050, B:130:0x0055, B:136:0x0064, B:137:0x0071, B:139:0x0075, B:141:0x0088, B:142:0x008d, B:144:0x00ae, B:146:0x00b2, B:147:0x00c5, B:149:0x00d0, B:151:0x00de, B:143:0x009c), top: B:213:0x0050 }] */
    /* JADX WARN: Removed duplicated region for block: B:154:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x0103 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void s0(android.bluetooth.BluetoothGatt r17, android.bluetooth.BluetoothGattCharacteristic r18, te.a r19) {
        /*
            Method dump skipped, instructions count: 728
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: df.b.s0(android.bluetooth.BluetoothGatt, android.bluetooth.BluetoothGattCharacteristic, te.a):void");
    }

    public final void t0() {
        v0(new byte[]{4, 1});
    }

    public final void u0(boolean z10) {
        ge.b.d("<< OPCODE_DFU_ENSURE_CURRENT_BUFFER(0x0C)");
        P(this.M0, new byte[]{12, !z10 ? 1 : 0}, false);
    }

    public final void v0(byte[] bArr) {
        int i10;
        boolean z10;
        z(524);
        boolean z11 = false;
        try {
            ge.b.e("<< OPCODE_DFU_ACTIVE_IMAGE_RESET(0x04)", this.f29221a);
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
            ge.b.e("image active success", this.f29221a);
            V(this.D);
            n(this.f29254x);
            return;
        }
        throw new ne.c(i10);
    }

    public final boolean w0(int i10) {
        String a10;
        ge.b.d(String.format("<< OPCODE_DFU_CHECK_CURRENT_BUFFER(0x0B) , crc=0x%04X", Integer.valueOf(i10)));
        P(this.M0, new byte[]{11}, false);
        if (this.f29221a) {
            ge.b.d("... waiting CHECK_CURRENT_BUFFER response");
        }
        byte[] Z = Z();
        byte b10 = Z[2];
        if (b10 == 1) {
            int i11 = ((Z[4] << 8) & 65280) | (Z[3] & 255);
            if (i11 == i10) {
                return true;
            }
            a10 = p1.a("CRC check error, local: ", i10, ", remote : ", i11);
        } else {
            a10 = u0.a("check current buffer failed, status: ", b10);
        }
        ge.b.p(a10);
        return false;
    }

    public final void x0(int i10) {
        int i11;
        int i12;
        if (this.f29221a) {
            ge.b.d("<< OPCODE_DFU_REPORT_TARGET_IMAGE_INFO(0x06)");
        }
        P(this.M0, new byte[]{6, (byte) (i10 & 255), (byte) ((i10 >> 8) & 255)}, false);
        if (this.f29221a) {
            ge.b.n("... Reading OPCODE_DFU_REPORT_TARGET_IMAGE_INFO(0x06) notification");
        }
        byte[] Z = Z();
        int length = Z != null ? Z.length : 0;
        if ((length > 2 ? Z[2] : (byte) -2) != 1) {
            ge.b.f(String.format("0x%02X, Get target image info failed", 766));
            throw new ne.c("Get target image info failed", 766);
        }
        ByteBuffer wrap = ByteBuffer.wrap(Z);
        wrap.order(ByteOrder.LITTLE_ENDIAN);
        if (length >= 11) {
            i11 = wrap.getShort(3) & 65535;
            i12 = 7;
        } else if (length < 9) {
            this.f29224c0 = 0;
            i11 = 0;
            ge.b.d(String.format(Locale.US, "mOriginalFwVersion=%d, mImageUpdateOffset=0x%08X(%d)", Integer.valueOf(i11), Integer.valueOf(this.f29224c0), Integer.valueOf(this.f29224c0)));
        } else {
            i11 = wrap.getShort(3) & 65535;
            i12 = 5;
        }
        this.f29224c0 = wrap.getInt(i12);
        ge.b.d(String.format(Locale.US, "mOriginalFwVersion=%d, mImageUpdateOffset=0x%08X(%d)", Integer.valueOf(i11), Integer.valueOf(this.f29224c0), Integer.valueOf(this.f29224c0)));
    }

    public final void y0(int i10) {
        String format;
        int i11 = this.f29224c0;
        if (i11 == 0) {
            this.f29224c0 = 12;
            if (this.f29221a) {
                format = String.format(Locale.US, "First Packet, mImageUpdateOffset=0x%08X(%d)", 12, Integer.valueOf(this.f29224c0));
                ge.b.n(format);
            }
        } else if (this.f29221a) {
            format = String.format(Locale.US, "mImageUpdateOffset=0x%08X(%d)", Integer.valueOf(i11), Integer.valueOf(this.f29224c0));
            ge.b.n(format);
        }
        r0(i10, this.f29224c0);
        if (this.f29224c0 != r().f32317b + 12 && this.f29224c0 != -1) {
            if (this.f29221a) {
                ge.b.d(String.format(Locale.US, "mBytesSent(%d) != mImageUpdateOffset(%d), reload image bin file", Integer.valueOf(r().f32317b + 12), Integer.valueOf(this.f29224c0)));
            }
            K();
            h(this.f29224c0, false);
        }
    }

    public final void z0(int i10) {
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
            ge.b.f(String.format("0x%02X, Validate FW failed, CRC check error", Byte.valueOf(b10)));
            throw new ne.c("Validate FW failed", 517);
        } else {
            ge.b.f(String.format("0x%02X(not supported), Validate FW failed", Byte.valueOf(b10)));
            throw new ne.c("Validate FW failed", 766);
        }
    }
}
