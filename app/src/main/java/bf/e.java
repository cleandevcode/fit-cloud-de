package bf;

import android.bluetooth.BluetoothGatt;
import android.bluetooth.BluetoothGattCharacteristic;
import androidx.fragment.app.p;
import com.realsil.sdk.dfu.DfuService;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import java.util.UUID;
import xe.k;
import xe.l;
import xe.n;
import xe.o;
import yb.y;

/* loaded from: classes.dex */
public abstract class e extends xe.g {
    public ArrayList P0;
    public ArrayList Q0;

    public e(DfuService dfuService, ze.e eVar, DfuService.c cVar) {
        super(dfuService, eVar, cVar);
    }

    public final void A0(int i10) {
        int i11 = this.f29224c0;
        int i12 = s().f32262l;
        l lVar = new l(i10, i11);
        if (this.f29221a) {
            ge.b.d(lVar.toString());
        }
        P(this.M0, lVar.a(), false);
        int i13 = r().f32317b;
        int i14 = this.f29224c0;
        if (i13 != i14 && i14 != -1) {
            ge.b.o("mBytesSent != mImageUpdateOffset, reload image bin file", this.f29222b);
            K();
            h(this.f29224c0, false);
        }
    }

    public final void B0() {
        y0(new byte[]{4, 0});
    }

    public final void C0() {
        ArrayList arrayList = this.P0;
        if (arrayList != null && arrayList.size() > 0) {
            s().z(null);
            Iterator it = this.P0.iterator();
            while (it.hasNext()) {
                BluetoothGattCharacteristic bluetoothGattCharacteristic = (BluetoothGattCharacteristic) it.next();
                if (this.f29222b) {
                    StringBuilder a10 = android.support.v4.media.d.a("read image version : ");
                    a10.append(bluetoothGattCharacteristic.getUuid().toString());
                    ge.b.n(a10.toString());
                }
                byte[] Q = Q(bluetoothGattCharacteristic);
                if (Q != null) {
                    s().e(Q);
                }
            }
            return;
        }
        ge.b.e("no ImageVersionCharacteristics to read", this.f29221a);
        s().z(null);
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
        this.f30502r0.l();
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
        int i10 = 65504;
        while (true) {
            if (i10 >= 65519) {
                break;
            }
            UUID a10 = de.a.a(i10);
            BluetoothGattCharacteristic characteristic = this.E0.getCharacteristic(a10);
            if (characteristic == null) {
                if (this.f29222b) {
                    p.b(a10, android.support.v4.media.d.a("not found image version characteristic:"));
                }
            } else {
                if (this.f29222b) {
                    p.b(a10, android.support.v4.media.d.a("find image version characteristic: "));
                }
                this.P0.add(characteristic);
                i10++;
            }
        }
        this.Q0 = new ArrayList();
        for (int i11 = 65524; i11 < 65526; i11++) {
            UUID a11 = de.a.a(i11);
            BluetoothGattCharacteristic characteristic2 = this.E0.getCharacteristic(a11);
            if (characteristic2 == null) {
                if (this.f29221a) {
                    StringBuilder a12 = android.support.v4.media.d.a("not found image session size characteristic:");
                    a12.append(a11.toString());
                    ge.b.d(a12.toString());
                    return true;
                }
                return true;
            }
            if (this.f29222b) {
                StringBuilder a13 = android.support.v4.media.d.a("find image session size characteristic: ");
                a13.append(a11.toString());
                ge.b.d(a13.toString());
            }
            this.Q0.add(characteristic2);
        }
        return true;
    }

    public final boolean m0() {
        if (this.G0 == null) {
            return false;
        }
        if (this.f29221a) {
            ge.b.n("start to read remote device info");
        }
        byte[] Q = Q(this.G0);
        if (Q == null) {
            if (this.f29221a) {
                ge.b.n("read device info failed");
            }
            throw new ne.c("read remote device info failed", 270);
        }
        s().v(Q);
        b(s().D);
        return true;
    }

    public final boolean n0() {
        if (this.H0 == null) {
            return false;
        }
        if (this.f29221a) {
            ge.b.n("start to read remote dev Mac Addr info");
        }
        byte[] Q = Q(this.H0);
        if (Q != null) {
            if (Q.length >= 6) {
                byte[] bArr = new byte[6];
                System.arraycopy(Q, 0, bArr, 0, 6);
                s().F = bArr;
            }
            if (Q.length >= 12) {
                byte[] bArr2 = new byte[6];
                System.arraycopy(Q, 6, bArr2, 0, 6);
                s().C = bArr2;
                return true;
            }
            return true;
        }
        ge.b.p("Get remote dev Mac Addr info failed, do nothing.");
        throw new ne.c("remote dev Mac Addr info error", 277);
    }

    public final void o0() {
        ArrayList arrayList = this.Q0;
        byte[] bArr = null;
        if (arrayList != null && arrayList.size() > 0) {
            Iterator it = this.Q0.iterator();
            while (it.hasNext()) {
                BluetoothGattCharacteristic bluetoothGattCharacteristic = (BluetoothGattCharacteristic) it.next();
                if (this.f29222b) {
                    StringBuilder a10 = android.support.v4.media.d.a("read image section size : ");
                    a10.append(bluetoothGattCharacteristic.getUuid().toString());
                    ge.b.n(a10.toString());
                }
                byte[] Q = Q(bluetoothGattCharacteristic);
                if (Q != null) {
                    if (bArr == null) {
                        bArr = Q;
                    } else {
                        byte[] bArr2 = new byte[bArr.length + Q.length];
                        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
                        System.arraycopy(Q, 0, bArr2, bArr.length, Q.length);
                        bArr = bArr2;
                    }
                }
            }
            s().y(bArr);
            return;
        }
        ge.b.e("no ImageSectionCharacteristics to read", this.f29221a);
        s().y(null);
    }

    public final void p0() {
        int i10 = s().f32262l;
        k kVar = new k(r().f32324i, r().f32320e + 1, r().f32319d);
        if (this.f29221a) {
            ge.b.d(kVar.toString());
        }
        P(this.M0, kVar.a(), false);
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x0086  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void q0() {
        /*
            r5 = this;
            boolean r0 = r5.f29233h
            if (r0 != 0) goto La0
            boolean r0 = r5.f29221a
            java.lang.String r1 = "isBufferCheckEnabled="
            java.lang.StringBuilder r1 = android.support.v4.media.d.a(r1)
            ze.j r2 = r5.s()
            boolean r2 = r2.f32267q
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            ge.b.e(r1, r0)
            ze.j r0 = r5.s()
            boolean r0 = r0.f32267q
            r1 = 0
            if (r0 == 0) goto L89
            android.bluetooth.BluetoothGattCharacteristic r0 = r5.M0
            r2 = 1
            if (r0 != 0) goto L32
            boolean r0 = r5.f29221a
            java.lang.String r3 = "no mControlPointCharacteristic found"
            ge.b.q(r3, r0)
            goto L83
        L32:
            boolean r0 = r5.f29221a
            java.lang.String r3 = "<< OPCODE_DFU_ENABLE_BUFFER_CHECK_MODE(0x09)"
            ge.b.e(r3, r0)
            android.bluetooth.BluetoothGattCharacteristic r0 = r5.M0
            byte[] r3 = new byte[r2]
            r4 = 9
            r3[r1] = r4
            r5.P(r0, r3, r1)
            boolean r0 = r5.f29222b     // Catch: ie.a -> L7c
            java.lang.String r3 = "... Reading OPCODE_DFU_ENABLE_BUFFER_CHECK_MODE notification"
            ge.b.o(r3, r0)     // Catch: ie.a -> L7c
            r3 = 1600(0x640, double:7.905E-321)
            byte[] r0 = r5.T(r3)     // Catch: ie.a -> L7c
            ze.j r3 = r5.s()     // Catch: ie.a -> L7c
            int r3 = r3.f32252b     // Catch: ie.a -> L7c
            ze.j r4 = r5.s()     // Catch: ie.a -> L7c
            int r4 = r4.f32262l     // Catch: ie.a -> L7c
            xe.i r0 = xe.i.C(r0, r3, r4)     // Catch: ie.a -> L7c
            if (r0 == 0) goto L7a
            int r3 = r0.f30517d     // Catch: ie.a -> L7c
            if (r3 != r2) goto L69
            r3 = 1
            goto L6a
        L69:
            r3 = 0
        L6a:
            if (r3 == 0) goto L7a
            int r3 = r0.f30518e     // Catch: ie.a -> L7c
            r5.b(r3)     // Catch: ie.a -> L7c
            boolean r3 = r0.f30519f     // Catch: ie.a -> L7c
            if (r3 == 0) goto L7a
            int r0 = r0.f30520g     // Catch: ie.a -> L7c
            r5.U(r0)     // Catch: ie.a -> L7c
        L7a:
            r0 = 1
            goto L84
        L7c:
            java.lang.String r0 = "enableBufferCheck failed, just think remote is normal function."
            ge.b.p(r0)
            r5.D = r1
        L83:
            r0 = 0
        L84:
            if (r0 == 0) goto L89
            r5.Z = r2
            goto L8b
        L89:
            r5.Z = r1
        L8b:
            boolean r0 = r5.f29222b
            java.lang.String r1 = "mRemoteOtaFunctionInfo="
            java.lang.StringBuilder r1 = android.support.v4.media.d.a(r1)
            int r2 = r5.Z
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            ge.b.o(r1, r0)
            return
        La0:
            ne.c r0 = new ne.c
            r1 = 4128(0x1020, float:5.785E-42)
            java.lang.String r2 = "user aborted"
            r0.<init>(r2, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: bf.e.q0():void");
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
        byte[] bArr = new byte[16];
        System.arraycopy(this.f29254x.f28066w, 0, bArr, 0, 12);
        int i10 = s().f32262l;
        if (s().f32268r) {
            bArr = this.C.a(bArr, 0, 16);
        }
        n nVar = new n(bArr);
        if (this.f29221a) {
            ge.b.d(nVar.toString());
        }
        P(this.M0, nVar.a(), false);
        if (this.f29221a) {
            ge.b.n("... Reading OPCODE_DFU_START_DFU(0x01) notification");
        }
        byte b10 = Z()[2];
        if (b10 == 1) {
            return;
        }
        throw ye.b.a("0x%02X(not supported), start dfu failed", new Object[]{Byte.valueOf(b10)}, "start dfu failed", 766);
    }

    public final void t0(BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic, te.a aVar) {
        int q10;
        m();
        this.D = 0;
        this.f29251u = false;
        int i10 = this.V;
        byte[] bArr = new byte[i10];
        while (!this.f29251u) {
            if (!this.f29233h) {
                C();
                if (this.f29221a) {
                    ge.b.n(r().toString());
                }
                try {
                    if (r().f32317b == 0) {
                        int i11 = this.V;
                        byte[] bArr2 = new byte[i11];
                        aVar.q(i11 - 12, bArr2);
                        System.arraycopy(aVar.f28050g, 0, bArr, 0, 12);
                        System.arraycopy(bArr2, 0, bArr, 12, this.V - 12);
                        q10 = this.V;
                    } else {
                        q10 = aVar.q(i10, bArr);
                    }
                    ze.g r10 = r();
                    if (r10.f32316a - r10.f32317b < this.V) {
                        ge.b.n("reach the end of the file, only read some");
                        ze.g r11 = r();
                        q10 = r11.f32316a - r11.f32317b;
                    }
                    if (q10 <= 0) {
                        if (r().e()) {
                            ge.b.d("image file has already been send over");
                            return;
                        }
                        ge.b.p("Error while reading file with size: " + q10);
                        throw new ne.c("Error while reading file", 257);
                    }
                    if (s().f32268r) {
                        for (int i12 = q10; i12 > 0; i12 -= 16) {
                            if (i12 >= 16) {
                                int i13 = q10 - i12;
                                System.arraycopy(this.C.a(bArr, i13, 16), 0, bArr, i13, 16);
                                if (s().f32269s == 0) {
                                    break;
                                }
                            }
                        }
                    }
                    M(bluetoothGatt, bluetoothGattCharacteristic, bArr, q10);
                    I();
                    l();
                } catch (IOException unused) {
                    throw new ne.c("Error while reading file", 257);
                }
            } else {
                throw new ne.c("user aborted", 4128);
            }
        }
    }

    public final boolean u0(te.a aVar, int i10, int i11, int i12) {
        int i13;
        if (aVar.D == 0) {
            return false;
        }
        ge.b.o(String.format(Locale.US, "nextBinSize=%d, mBytesSentBuffer=%d, bufferSize=%d", Integer.valueOf(aVar.s()), Integer.valueOf(i11), Integer.valueOf(i12)), this.f29221a);
        if (aVar.D == 1) {
            i13 = aVar.s();
        } else if (i10 < 0 || i10 >= this.f29253w.size()) {
            i13 = 0;
        } else {
            int i14 = 0;
            for (int i15 = i10; i15 < this.f29253w.size(); i15++) {
                te.a aVar2 = (te.a) this.f29253w.get(i15);
                if (aVar2.D != aVar.D) {
                    break;
                }
                i14 += aVar2.s();
            }
            i13 = i14;
        }
        return i13 + i11 > i12;
    }

    public final void v0(byte b10, int i10) {
        o oVar = new o(s().f32252b, s().f32262l, i10, b10);
        if (this.f29221a) {
            ge.b.d(oVar.toString());
        }
        P(this.M0, oVar.a(), false);
        if (this.f29221a) {
            ge.b.n("... waiting DFU_VALIDATE_FW_IMAGE response");
        }
        byte b11 = Z()[2];
        if (b11 == 1) {
            return;
        }
        Object[] objArr = new Object[1];
        if (b11 == 5) {
            objArr[0] = Byte.valueOf(b11);
            throw ye.b.a("0x%02X, Validate FW failed, CRC check error", objArr, "Validate FW failed", 517);
        } else {
            objArr[0] = Byte.valueOf(b11);
            throw ye.b.a("0x%02X(not supported), Validate FW failed", objArr, "Validate FW failed", 766);
        }
    }

    public final void w0() {
        y0(new byte[]{4, 1});
    }

    /* JADX WARN: Code restructure failed: missing block: B:201:0x029c, code lost:
        r1 = true;
     */
    /* JADX WARN: Removed duplicated region for block: B:131:0x006d A[Catch: IOException -> 0x02c9, TryCatch #0 {IOException -> 0x02c9, blocks: (B:123:0x0059, B:125:0x005e, B:131:0x006d, B:132:0x007a, B:134:0x007e, B:136:0x0091, B:137:0x0096, B:140:0x00a8, B:142:0x00c2, B:144:0x00e0, B:139:0x00a0, B:141:0x00b0), top: B:210:0x0059 }] */
    /* JADX WARN: Removed duplicated region for block: B:134:0x007e A[Catch: IOException -> 0x02c9, TryCatch #0 {IOException -> 0x02c9, blocks: (B:123:0x0059, B:125:0x005e, B:131:0x006d, B:132:0x007a, B:134:0x007e, B:136:0x0091, B:137:0x0096, B:140:0x00a8, B:142:0x00c2, B:144:0x00e0, B:139:0x00a0, B:141:0x00b0), top: B:210:0x0059 }] */
    /* JADX WARN: Removed duplicated region for block: B:138:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x00e0 A[Catch: IOException -> 0x02c9, TRY_LEAVE, TryCatch #0 {IOException -> 0x02c9, blocks: (B:123:0x0059, B:125:0x005e, B:131:0x006d, B:132:0x007a, B:134:0x007e, B:136:0x0091, B:137:0x0096, B:140:0x00a8, B:142:0x00c2, B:144:0x00e0, B:139:0x00a0, B:141:0x00b0), top: B:210:0x0059 }] */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x0110 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v21 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void x0(android.bluetooth.BluetoothGatt r17, android.bluetooth.BluetoothGattCharacteristic r18) {
        /*
            Method dump skipped, instructions count: 730
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: bf.e.x0(android.bluetooth.BluetoothGatt, android.bluetooth.BluetoothGattCharacteristic):void");
    }

    public final void y0(byte[] bArr) {
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
            ge.b.k("image active success");
            V(this.D);
            n(this.f29254x);
            return;
        }
        throw new ne.c(i10);
    }

    public final void z0(int i10) {
        int i11;
        int i12;
        int i13;
        if (!this.f29233h) {
            ge.b.e("<< OPCODE_DFU_REPORT_TARGET_IMAGE_INFO(0x06)", this.f29221a);
            P(this.M0, new byte[]{6, (byte) (i10 & 255), (byte) ((i10 >> 8) & 255)}, false);
            ge.b.e("... Reading OPCODE_DFU_REPORT_TARGET_IMAGE_INFO(0x06) notification", this.f29221a);
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
            throw ye.b.a("0x%04X, Get target image info failed", new Object[]{766}, "Get target image info failed", 766);
        }
        throw new ne.c("user aborted", 4128);
    }
}
