package hf;

import a0.g2;
import android.bluetooth.BluetoothDevice;
import android.support.v4.media.d;
import androidx.appcompat.widget.e2;
import androidx.fragment.app.h1;
import com.realsil.sdk.dfu.DfuService;
import ed.c;
import ed.f;
import ed.g;
import java.util.Locale;
import no.nordicsemi.android.dfu.DfuBaseService;
import yb.y;
import ze.e;
import ze.j;

/* loaded from: classes.dex */
public final class b extends gf.a {

    /* renamed from: z0 */
    public final a f16091z0;

    /* loaded from: classes.dex */
    public class a extends f {
        public a() {
            b.this = r1;
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        @Override // ed.f
        public final void a(ed.a aVar) {
            b bVar = b.this;
            bVar.getClass();
            short s10 = aVar.f13543a;
            byte b10 = aVar.f13544b;
            if (bVar.f15324x0.containsKey(Short.valueOf(s10))) {
                bVar.f15324x0.put(Short.valueOf(s10), aVar);
            }
            switch (s10) {
                case 1536:
                    ge.b.n("ACK-CMD_OTA_GET_DEVICE_INFO");
                    if (b10 == 2 || b10 == 1) {
                        ge.b.p("CMD_OTA_GET_DEVICE_INFO not support");
                        bVar.D = 281;
                        bVar.f29246p = null;
                        bVar.f15323w0.remove((short) 1536);
                        bVar.y();
                        return;
                    }
                    return;
                case 1537:
                default:
                    return;
                case 1538:
                case 1540:
                case 1541:
                case 1542:
                case 1543:
                case 1544:
                case 1545:
                    byte b11 = aVar.f13544b;
                    synchronized (bVar.f29247q) {
                        bVar.f29250t = false;
                        bVar.f29249s = b11;
                        bVar.f29248r = true;
                        bVar.f29247q.notifyAll();
                        break;
                    }
                case 1539:
                    break;
            }
            if (aVar.f13544b != 0) {
                bVar.f29250t = true;
                bVar.p();
            }
        }

        @Override // ed.f
        public final void b(BluetoothDevice bluetoothDevice, int i10) {
            if (i10 == 2) {
                b.this.B(515);
            } else if (i10 == 0) {
                if (b.this.f29252v == 521) {
                    b.this.D = 2048;
                    b bVar = b.this;
                    if (bVar.f29221a) {
                        ge.b.p(String.format("disconnect in OTA process, mErrorState: 0x%04X", Integer.valueOf(bVar.D)));
                    }
                    b.this.p();
                }
                b.this.B(0);
            } else {
                return;
            }
            b.this.w();
        }

        @Override // ed.f
        public final void c(g gVar) {
            byte b10;
            b bVar = b.this;
            bVar.getClass();
            short s10 = gVar.f13581d;
            byte[] bArr = gVar.f13582e;
            switch (s10) {
                case 1536:
                case 1537:
                case 1544:
                case 1545:
                    short s11 = (short) (s10 & 65535);
                    if (bVar.f15323w0.contains(Short.valueOf(s11))) {
                        bVar.f15323w0.remove(Short.valueOf(s11));
                        bVar.f29246p = bArr;
                        bVar.y();
                        return;
                    }
                    ge.b.p(String.format("not expect event: 0x%04X", Short.valueOf(s11)));
                    return;
                case 1538:
                case 1540:
                case 1541:
                case 1542:
                case 1543:
                    synchronized (bVar.W) {
                        bVar.f15321u0 = bArr;
                        bVar.f15322v0 = true;
                        bVar.W.notifyAll();
                    }
                    return;
                case 1539:
                    if (bArr != null && bArr.length > 0) {
                        b10 = bArr[0];
                    } else {
                        b10 = 1;
                    }
                    if (b10 == 1) {
                        bVar.f29250t = false;
                    } else {
                        bVar.f29250t = true;
                    }
                    bVar.p();
                    return;
                default:
                    return;
            }
        }
    }

    public b(DfuService dfuService, e eVar, DfuService.c cVar) {
        super(dfuService, eVar, cVar);
        this.f16091z0 = new a();
    }

    public final boolean S() {
        try {
            ge.b.e(String.format("<< CMD_OTA_RESET (0x%04X)", (short) 1541), this.f29221a);
            return N((short) 1541, null);
        } catch (ie.a e10) {
            ge.b.p(String.format("Send OPCODE_DFU_RESET_SYSTEM failed, ignore it, errorcode= 0x%04X", Integer.valueOf(e10.f16770b)));
            this.D = 0;
            return false;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:437:0x0523, code lost:
        r2 = true;
        r4 = 0;
        r5 = 2;
        r6 = r18;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:359:0x02cf A[Catch: IOException -> 0x055c, TryCatch #2 {IOException -> 0x055c, blocks: (B:351:0x02ba, B:353:0x02bf, B:359:0x02cf, B:360:0x02dc, B:362:0x02e0, B:367:0x032e, B:369:0x0332, B:370:0x0346, B:372:0x0351, B:374:0x035f, B:376:0x0375, B:378:0x0379, B:365:0x030b, B:366:0x031c), top: B:503:0x02ba }] */
    /* JADX WARN: Removed duplicated region for block: B:362:0x02e0 A[Catch: IOException -> 0x055c, TryCatch #2 {IOException -> 0x055c, blocks: (B:351:0x02ba, B:353:0x02bf, B:359:0x02cf, B:360:0x02dc, B:362:0x02e0, B:367:0x032e, B:369:0x0332, B:370:0x0346, B:372:0x0351, B:374:0x035f, B:376:0x0375, B:378:0x0379, B:365:0x030b, B:366:0x031c), top: B:503:0x02ba }] */
    /* JADX WARN: Removed duplicated region for block: B:363:0x0307  */
    /* JADX WARN: Removed duplicated region for block: B:369:0x0332 A[Catch: IOException -> 0x055c, TryCatch #2 {IOException -> 0x055c, blocks: (B:351:0x02ba, B:353:0x02bf, B:359:0x02cf, B:360:0x02dc, B:362:0x02e0, B:367:0x032e, B:369:0x0332, B:370:0x0346, B:372:0x0351, B:374:0x035f, B:376:0x0375, B:378:0x0379, B:365:0x030b, B:366:0x031c), top: B:503:0x02ba }] */
    /* JADX WARN: Removed duplicated region for block: B:372:0x0351 A[Catch: IOException -> 0x055c, TryCatch #2 {IOException -> 0x055c, blocks: (B:351:0x02ba, B:353:0x02bf, B:359:0x02cf, B:360:0x02dc, B:362:0x02e0, B:367:0x032e, B:369:0x0332, B:370:0x0346, B:372:0x0351, B:374:0x035f, B:376:0x0375, B:378:0x0379, B:365:0x030b, B:366:0x031c), top: B:503:0x02ba }] */
    /* JADX WARN: Removed duplicated region for block: B:386:0x03c5  */
    /* JADX WARN: Removed duplicated region for block: B:512:0x039a A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r2v10, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v42 */
    /* JADX WARN: Type inference failed for: r2v65 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean T() {
        /*
            Method dump skipped, instructions count: 1786
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: hf.b.T():boolean");
    }

    public final int U(String str, int i10) {
        int i11;
        int i12;
        int i13 = 0;
        while (!this.f29233h) {
            BluetoothDevice G = G(str);
            if (G == null) {
                i11 = 4112;
            } else {
                B(DfuBaseService.ERROR_REMOTE_TYPE_LEGACY);
                this.D = 0;
                this.f29239k = false;
                boolean z10 = this.f29221a;
                StringBuilder a10 = d.a("connecting to ");
                a10.append(p.b.m(str));
                ge.b.o(a10.toString(), z10);
                b0().b(this.f16091z0);
                c b02 = b0();
                b02.h(G, null, b02.f13553n, 0);
                try {
                    synchronized (this.f29241l) {
                        if (!this.f29239k && this.D == 0) {
                            boolean z11 = this.f29221a;
                            ge.b.e("wait for connect for " + q().D + " ms", z11);
                            this.f29241l.wait(q().D);
                        }
                    }
                } catch (InterruptedException e10) {
                    StringBuilder a11 = d.a("Sleeping interrupted : ");
                    a11.append(e10.toString());
                    ge.b.p(a11.toString());
                    this.D = 259;
                }
                if (this.D == 0) {
                    if (!this.f29239k) {
                        ge.b.p("wait for connect, but can not connect with no callback");
                        i12 = 260;
                    } else if (this.f29243m != 515) {
                        StringBuilder a12 = d.a("connect with some error, please check. mConnectionState");
                        a12.append(this.f29243m);
                        ge.b.p(a12.toString());
                        i12 = 264;
                    }
                    this.D = i12;
                }
                if (this.D != 0) {
                    if (this.f29243m == 256) {
                        B(0);
                    }
                } else {
                    ge.b.o("connected the device which going to upgrade", this.f29221a);
                }
                i11 = this.D;
            }
            if (i11 == 0) {
                return 0;
            }
            if ((i11 & (-2049)) != 133) {
                a0();
            } else if (this.f29221a) {
                ge.b.d("connect fail with GATT_ERROR, do not need disconnect");
            }
            B(1280);
            try {
                Thread.sleep(1600L);
            } catch (InterruptedException unused) {
            }
            i13++;
            if (i13 > i10) {
                return i11;
            }
        }
        return 4128;
    }

    /* JADX WARN: Removed duplicated region for block: B:66:0x003d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x003e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final byte[] V(short r5) {
        /*
            r4 = this;
            r0 = 0
            r4.D = r0
            r1 = 0
            r4.f29246p = r1
            r2 = 1536(0x600, float:2.152E-42)
            if (r5 == r2) goto L28
            r2 = 1537(0x601, float:2.154E-42)
            if (r5 == r2) goto L28
            r2 = 1546(0x60a, float:2.166E-42)
            if (r5 == r2) goto L1c
            r2 = 1547(0x60b, float:2.168E-42)
            if (r5 == r2) goto L17
            goto L31
        L17:
            java.util.HashSet r2 = r4.f15323w0
            r3 = 1545(0x609, float:2.165E-42)
            goto L20
        L1c:
            java.util.HashSet r2 = r4.f15323w0
            r3 = 1544(0x608, float:2.164E-42)
        L20:
            java.lang.Short r3 = java.lang.Short.valueOf(r3)
            r2.add(r3)
            goto L31
        L28:
            java.util.HashSet r3 = r4.f15323w0
            java.lang.Short r2 = java.lang.Short.valueOf(r2)
            r3.add(r2)
        L31:
            r4.f29245o = r0
            ed.c r0 = r4.b0()
            boolean r5 = r0.d(r5, r1)
            if (r5 != 0) goto L3e
            return r1
        L3e:
            java.lang.Object r5 = r4.f29244n
            monitor-enter(r5)
            int r0 = r4.D     // Catch: java.lang.Throwable -> L57 java.lang.InterruptedException -> L59
            if (r0 != 0) goto L72
            boolean r0 = r4.f29245o     // Catch: java.lang.Throwable -> L57 java.lang.InterruptedException -> L59
            if (r0 != 0) goto L72
            int r0 = r4.f29243m     // Catch: java.lang.Throwable -> L57 java.lang.InterruptedException -> L59
            r1 = 515(0x203, float:7.22E-43)
            if (r0 != r1) goto L72
            java.lang.Object r0 = r4.f29244n     // Catch: java.lang.Throwable -> L57 java.lang.InterruptedException -> L59
            r1 = 15000(0x3a98, double:7.411E-320)
            r0.wait(r1)     // Catch: java.lang.Throwable -> L57 java.lang.InterruptedException -> L59
            goto L72
        L57:
            r0 = move-exception
            goto L97
        L59:
            r0 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L57
            r1.<init>()     // Catch: java.lang.Throwable -> L57
            java.lang.String r2 = "mCharacteristicReadCalledLock Sleeping interrupted,e:"
            r1.append(r2)     // Catch: java.lang.Throwable -> L57
            r1.append(r0)     // Catch: java.lang.Throwable -> L57
            java.lang.String r0 = r1.toString()     // Catch: java.lang.Throwable -> L57
            ge.b.p(r0)     // Catch: java.lang.Throwable -> L57
            r0 = 259(0x103, float:3.63E-43)
            r4.D = r0     // Catch: java.lang.Throwable -> L57
        L72:
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L57
            int r5 = r4.D
            if (r5 != 0) goto L86
            boolean r5 = r4.f29245o
            if (r5 != 0) goto L86
            boolean r5 = r4.f29221a
            java.lang.String r0 = "read value but no callback"
            ge.b.e(r0, r5)
            r5 = 261(0x105, float:3.66E-43)
            r4.D = r5
        L86:
            int r5 = r4.D
            if (r5 != 0) goto L8d
            byte[] r5 = r4.f29246p
            return r5
        L8d:
            ne.c r5 = new ne.c
            int r0 = r4.D
            java.lang.String r1 = "Error while send command"
            r5.<init>(r1, r0)
            throw r5
        L97:
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L57
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: hf.b.V(short):byte[]");
    }

    public final boolean W(byte[] bArr) {
        int i10;
        z(524);
        boolean z10 = false;
        boolean z11 = true;
        try {
            if (this.f29221a) {
                ge.b.d(String.format("<< CMD_OTA_ACTIVE_RESET(0x%04X)", (short) 1542));
            }
            z11 = N((short) 1542, bArr);
        } catch (ie.a e10) {
            i10 = 4128;
            if (e10.f16770b != 4128) {
                if (!q().f32303o) {
                    ge.b.d("active cmd has no response, ignore");
                } else {
                    ge.b.p("active cmd has no response, notify error");
                    i10 = e10.f16770b;
                }
            }
        }
        z10 = z11;
        i10 = 0;
        if (z10) {
            ge.b.d("image active success");
            return z10;
        }
        throw new ne.c(i10);
    }

    public final void X(int i10) {
        int i11 = this.f29243m;
        if (i11 != 0 && i11 != 1280) {
            a0();
        }
        b0().j();
        b0().g(this.f16091z0);
        B(1280);
        if (this.f29221a) {
            ge.b.d(String.format("terminateConnection, error = 0x%04X", Integer.valueOf(i10)));
        }
    }

    public final void Y() {
        boolean z10;
        if (W(null)) {
            if (s().f32273w) {
                ge.b.n("RWS, no need to disconnect manully");
            } else {
                if ((this.f29243m & DfuBaseService.ERROR_REMOTE_TYPE_SECURE) == 512) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    D();
                } else {
                    ge.b.d("device already disconnected");
                }
                X(0);
            }
            n(this.f29254x);
        }
    }

    public final boolean Z() {
        String str = this.F;
        if (!this.f29233h) {
            z(516);
            int U = U(str, q().C);
            if (U != 0) {
                if (U != 4128) {
                    ge.b.d(String.format("connect failed:0x%04X", Integer.valueOf(U)));
                    be.d dVar = new be.d(32);
                    dVar.f4164h = 31000L;
                    F(dVar);
                    int U2 = U(str, q().C);
                    if (U2 != 0) {
                        if (U2 == 4128) {
                            throw new ne.c("aborted, connectRemoteDevice failed", U2);
                        }
                        throw new ne.c("connectRemoteDevice failed", U2);
                    }
                } else {
                    throw new ne.c("aborted, connectRemoteDevice failed", U);
                }
            }
            if (!this.f29235i) {
                this.f29235i = false;
                if (!(!this.f29233h)) {
                    c(4128, false);
                } else {
                    z(517);
                    try {
                        Thread.sleep(1500L);
                    } catch (InterruptedException unused) {
                    }
                    this.X = new j(this.f29225d);
                    ge.b.e(String.format("<< CMD_OTA_GET_DEVICE_INFO (0x%04X)", (short) 1536), this.f29221a);
                    byte[] V = V((short) 1536);
                    if (V != null) {
                        ge.b.n(he.a.a(V));
                        s().s(0, V);
                        b(s().D);
                        if (this.f29221a) {
                            ge.b.d(s().toString());
                        }
                        if (s().f32273w) {
                            ge.b.e(String.format("<< CMD_OTA_GET_OTHER_INFO (0x%04X)", (short) 1547), this.f29221a);
                            byte[] V2 = V((short) 1547);
                            if (V2 != null && V2.length > 0) {
                                s().f32275y = V2[0] & 1;
                            } else {
                                s().f32275y = 0;
                            }
                            if (s().f32275y != 0) {
                                throw new ne.c("rws state not ready", 282);
                            }
                        }
                        ge.b.e(String.format("<< CMD_OTA_GET_IMAGE_INFO (0x%04X)", (short) 1537), this.f29221a);
                        s().x(V((short) 1537));
                        if (this.f29221a) {
                            ge.b.d(s().toString());
                        }
                        K();
                        this.f29235i = true;
                        ge.b.d("Ota Environment prepared.");
                    } else {
                        ge.b.f("Get dev info failed");
                        throw new ne.c("get remote dev info failed", 270);
                    }
                }
            } else {
                J();
            }
            if (this.f29254x != null) {
                return true;
            }
            c(DfuBaseService.ERROR_FILE_NOT_FOUND, false);
            return false;
        }
        throw new ne.c("user aborted", 4128);
    }

    public final void a0() {
        int i10 = this.f29243m;
        if (i10 != 0 && i10 != 1280) {
            b0().j();
            D();
        } else if (this.f29221a) {
            ge.b.d("already disconnect");
        }
    }

    public final c b0() {
        if (this.f15325y0 == null) {
            c l10 = c.l();
            this.f15325y0 = l10;
            l10.b(this.f16091z0);
        }
        return this.f15325y0;
    }

    @Override // ve.a
    public final void c(int i10, boolean z10) {
        if (this.f29233h) {
            i10 = 4128;
        }
        if (i10 != 4128) {
            z(260);
        }
        if (this.f29221a) {
            ge.b.d(String.format("error = 0x%04X", Integer.valueOf(i10)));
        }
        if (z10) {
            S();
        }
        be.a aVar = this.f15318r0;
        if (aVar != null) {
            aVar.l();
        }
        if (q().e(1)) {
            X(i10);
        }
        n(this.f29254x);
        y yVar = this.f29229f;
        if (yVar != null) {
            yVar.z(i10);
        }
        this.f29233h = true;
    }

    public final boolean c0() {
        te.a aVar;
        boolean z10;
        boolean z11;
        boolean z12 = false;
        while (!this.f29233h) {
            try {
            } catch (ie.a e10) {
                h1.b(this.f29252v, new StringBuilder(), ", ", e10);
                int i10 = e10.f16770b;
                if (i10 == 4128) {
                    c(i10, true);
                } else if (i10 == 4097) {
                    c(i10, false);
                } else {
                    S();
                    c(i10, false);
                }
            }
            if (!Z() || !T()) {
                return false;
            }
            this.A += r().f32317b;
            if (r().f()) {
                ge.b.d("no pending image file to upload.");
                r().f32327l = this.A;
                z12 = true;
            } else {
                ge.b.d("has pending image file to upload");
                if (s().O == 1) {
                    this.F = this.H;
                    this.f29237j = true;
                    this.A = 0;
                    Y();
                } else if (s().O == 3 && (aVar = this.f29255y) != null) {
                    int i11 = this.A;
                    int i12 = s().E * 4096;
                    ge.b.o(String.format(Locale.US, "nextBinSize=%d, mBytesSentBuffer=%d, bufferSize=%d", Integer.valueOf(aVar.s()), Integer.valueOf(i11), Integer.valueOf(i12)), this.f29221a);
                    if (aVar.s() + i11 > i12) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (z10) {
                        ge.b.d("make device to enter the ota advertiser mode, and let the app continue update imae");
                        this.f29237j = true;
                        this.A = 0;
                        if (W(new byte[]{1})) {
                            if (s().f32273w) {
                                ge.b.n("RWS, no need to disconnect manully");
                            } else {
                                if ((this.f29243m & DfuBaseService.ERROR_REMOTE_TYPE_SECURE) == 512) {
                                    z11 = true;
                                } else {
                                    z11 = false;
                                }
                                if (z11) {
                                    D();
                                } else {
                                    ge.b.d("device already disconnected");
                                }
                                X(0);
                            }
                            n(this.f29254x);
                        }
                    }
                }
                t();
            }
            try {
                Thread.sleep(1000L);
                continue;
            } catch (InterruptedException unused) {
                continue;
            }
            if (z12) {
                return z12;
            }
        }
        c(4128, false);
        return false;
    }

    @Override // ve.a
    public final boolean g(boolean z10) {
        if (!super.g(z10)) {
            return false;
        }
        if (this.f29243m != 515) {
            if (this.f29221a) {
                g2.c(d.a("start to re-connect the RCU which going to active image, current state is: "), this.f29243m);
            }
            int U = U(this.F, q().C);
            if (U != 0) {
                StringBuilder a10 = e2.a("Something error in OTA process, errorCode: ", U, "mProcessState");
                a10.append(this.f29252v);
                ge.b.f(a10.toString());
                c(U, true);
                return false;
            }
        }
        if (z10) {
            try {
                Y();
                if (q().d()) {
                    vd.b.f29198l.c(this.f29798n0.getRemoteDevice(this.F));
                    vd.b.f29198l.d(this.F);
                }
                z(258);
            } catch (ie.a e10) {
                ge.b.p(e10.toString());
                c(e10.f16770b, false);
            }
        } else {
            S();
            c(274, true);
        }
        return true;
    }

    @Override // we.b, ve.a
    public final void o() {
        int v10;
        vd.b bVar;
        String str;
        try {
            setName("ProcessorXS0000");
            ge.b.d("ProcessorXS0000 running.");
            v10 = v();
        } catch (Exception e10) {
            ge.b.p(e10.toString());
            c(0, false);
        }
        if (v10 != 0) {
            c(v10, false);
            return;
        }
        z(514);
        this.F = this.H;
        this.f29237j = true;
        this.A = 0;
        if (c0()) {
            if (s().f32273w) {
                Y();
                z(522);
                this.f29237j = true;
                this.f29235i = false;
                this.A = 0;
                ge.b.e("wait master to handover ...", this.f29221a);
                try {
                    Thread.sleep(q().f32284e0 * 1000);
                } catch (InterruptedException unused) {
                }
                if (c0()) {
                    if (this.U) {
                        Y();
                        if (q().d()) {
                            vd.b.f29198l.c(this.f29798n0.getRemoteDevice(this.F));
                            bVar = vd.b.f29198l;
                            str = this.F;
                            bVar.d(str);
                        }
                        z(258);
                    } else {
                        z(523);
                    }
                }
            } else {
                if (this.U) {
                    Y();
                    if (q().d()) {
                        vd.b.f29198l.c(this.f29798n0.getRemoteDevice(this.F));
                        bVar = vd.b.f29198l;
                        str = this.F;
                        bVar.d(str);
                    }
                    z(258);
                }
                z(523);
            }
        }
        n(this.f29254x);
        if (this.f29221a) {
            ge.b.d("DfuThread stopped");
        }
        c cVar = this.f15325y0;
        if (cVar != null) {
            cVar.g(this.f16091z0);
        }
        if (this.f29252v == 525) {
            z(259);
        }
    }
}
