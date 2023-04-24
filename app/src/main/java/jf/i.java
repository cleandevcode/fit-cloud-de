package jf;

import a0.g2;
import android.bluetooth.BluetoothDevice;
import androidx.appcompat.widget.e2;
import com.realsil.sdk.dfu.DfuService;
import ff.a;
import ff.b;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import no.nordicsemi.android.dfu.DfuBaseService;
import yb.y;

/* loaded from: classes.dex */
public abstract class i extends gf.a {
    public boolean A0;
    public a B0;

    /* renamed from: z0 */
    public int f17658z0;

    /* loaded from: classes.dex */
    public class a extends ed.f {
        public a() {
            i.this = r1;
        }

        @Override // ed.f
        public final void a(ed.a aVar) {
            i iVar = i.this;
            iVar.getClass();
            short s10 = aVar.f13543a;
            byte b10 = aVar.f13544b;
            if (iVar.f15324x0.containsKey(Short.valueOf(s10))) {
                iVar.f15324x0.put(Short.valueOf(s10), aVar);
            }
            if (iVar.f29222b) {
                ge.b.n(String.format("decodeAckPacket:0x%04X", Short.valueOf(s10)));
            }
            if (s10 == 1536) {
                ge.b.n("ACK-CMD_OTA_GET_DEVICE_INFO");
                if (b10 == 2 || b10 == 1) {
                    ge.b.p("CMD_OTA_GET_DEVICE_INFO not support");
                    iVar.D = 281;
                    iVar.f29246p = null;
                    iVar.f15323w0.remove((short) 1536);
                    iVar.y();
                    return;
                }
                return;
            }
            switch (s10) {
                case 1538:
                case 1539:
                case 1540:
                case 1541:
                case 1542:
                case 1543:
                case 1544:
                case 1545:
                    break;
                default:
                    switch (s10) {
                        case 1551:
                        case 1552:
                        case 1553:
                        case 1554:
                        case 1555:
                            break;
                        default:
                            return;
                    }
            }
            byte b11 = aVar.f13544b;
            synchronized (iVar.f29247q) {
                iVar.f29250t = false;
                iVar.f29249s = b11;
                iVar.f29248r = true;
                iVar.f29247q.notifyAll();
            }
        }

        @Override // ed.f
        public final void b(BluetoothDevice bluetoothDevice, int i10) {
            ge.b.o(String.format("onConnectionStateChanged: newsTATE=0x%04X", Integer.valueOf(i10)), i.this.f29222b);
            if (i10 == 2) {
                i.this.B(515);
            } else if (i10 == 0) {
                if (i.this.f29252v == 521) {
                    i.this.D = 2048;
                    if (i.this.f29221a) {
                        g2.c(android.support.v4.media.d.a("disconnect in OTA process, mErrorState: "), i.this.D);
                    }
                }
                i.this.B(0);
                synchronized (i.this.f29244n) {
                    i.this.f29245o = false;
                    i.this.f29244n.notifyAll();
                }
            } else {
                return;
            }
            i.this.w();
            i.this.p();
        }

        @Override // ed.f
        public final void c(ed.g gVar) {
            i iVar = i.this;
            iVar.getClass();
            short s10 = gVar.f13581d;
            byte[] bArr = gVar.f13582e;
            switch (s10) {
                case 1536:
                case 1537:
                case 1544:
                case 1545:
                case 1549:
                    short s11 = (short) (s10 & 65535);
                    if (iVar.f15323w0.contains(Short.valueOf(s11))) {
                        iVar.f15323w0.remove(Short.valueOf(s11));
                        iVar.f29246p = bArr;
                        iVar.y();
                        return;
                    }
                    ge.b.d(String.format("not expect event: 0x%04X", Short.valueOf(s11)));
                    return;
                case 1538:
                case 1540:
                case 1541:
                case 1542:
                case 1543:
                case 1547:
                case 1550:
                case 1551:
                case 1552:
                case 1553:
                    synchronized (iVar.W) {
                        iVar.f15321u0 = bArr;
                        iVar.f15322v0 = true;
                        iVar.W.notifyAll();
                    }
                    return;
                case 1539:
                case 1546:
                case 1548:
                default:
                    return;
            }
        }
    }

    public i(DfuService dfuService, ze.e eVar, DfuService.c cVar) {
        super(dfuService, eVar, cVar);
        this.B0 = new a();
    }

    @Override // gf.a, ve.a
    public final void A() {
        super.A();
        ed.c cVar = this.f15325y0;
        if (cVar != null) {
            cVar.g(this.B0);
        }
    }

    public final void S() {
        ge.b.o(String.format("<< CMD_OTA_IMAGE_SECTION_SIZE_INFO (0x%04X)", (short) 1546), this.f29221a);
        s().y(d0((short) 1546, null));
    }

    public final void T() {
        if (s().f32262l <= 5) {
            ge.b.o(String.format("<< CMD_GET_INACTIVE_BANK_IMAGE_INFO (0x%04X)", (short) 1550), this.f29221a);
            byte[] d02 = d0((short) 1550, null);
            ze.j s10 = s();
            s10.T = d02;
            s10.k();
            return;
        }
        ge.b.o(String.format("<< CMD_OTA_GET_IMAGE_INFO (0x%04X), bank=0x01", (short) 1537), this.f29221a);
        s().z(d0((short) 1537, new byte[]{1}));
    }

    public final boolean U() {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        boolean z16;
        boolean z17;
        boolean z18;
        ge.b.e(String.format("<< CMD_GET_TARGET_INFO (0x%04X)", (short) 1536), this.f29221a);
        byte[] d02 = d0((short) 1536, null);
        if (d02 != null) {
            ze.j s10 = s();
            s10.getClass();
            ByteBuffer wrap = ByteBuffer.wrap(d02);
            wrap.order(ByteOrder.LITTLE_ENDIAN);
            int remaining = wrap.remaining();
            if (remaining <= 0) {
                ge.b.n(String.format(Locale.US, "invalid offset:%d, len is %d", 0, Integer.valueOf(remaining)));
            } else {
                int i10 = remaining - 0;
                if (i10 >= 1) {
                    s10.f32261k = wrap.get(0) & 255;
                }
                if (i10 >= 2) {
                    s10.f32262l = (byte) (wrap.get(1) & 15);
                }
                if (s10.f32262l <= 5) {
                    if (i10 >= 3) {
                        s10.f32263m = wrap.get(2);
                    }
                    if (i10 >= 4) {
                        int i11 = wrap.get(3) & 255;
                        s10.f32266p = i11;
                        if ((i11 & 1) != 0) {
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                        s10.f32267q = z15;
                        if (((i11 & 2) >> 1) != 0) {
                            z16 = true;
                        } else {
                            z16 = false;
                        }
                        s10.f32268r = z16;
                        s10.f32269s = (i11 & 4) >> 2;
                        if (((i11 & 8) >> 3) != 0) {
                            z17 = true;
                        } else {
                            z17 = false;
                        }
                        s10.f32270t = z17;
                        s10.f32271u = (i11 & 16) >> 4;
                        if (((i11 & 32) >> 5) != 0) {
                            z18 = true;
                        } else {
                            z18 = false;
                        }
                        s10.f32273w = z18;
                        s10.f32274x = (i11 & 64) >> 6;
                    }
                    if (i10 >= 5) {
                        s10.f32276z = wrap.get(4) & 255 & 1;
                    }
                    if (i10 >= 7) {
                        s10.E = wrap.get(6) & 255;
                    }
                    if (i10 >= 12) {
                        s10.N = wrap.getInt(8);
                    }
                    if (s10.N == 0) {
                        s10.P = false;
                    } else {
                        s10.g();
                    }
                } else {
                    if (i10 >= 3) {
                        int i12 = wrap.get(2) & 255;
                        s10.f32266p = i12;
                        if ((i12 & 1) != 0) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        s10.f32267q = z11;
                        if (((i12 & 2) >> 1) != 0) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        s10.f32268r = z12;
                        s10.f32269s = (i12 & 4) >> 2;
                        s10.f32271u = (i12 & 8) >> 3;
                        int i13 = (i12 & 48) >> 4;
                        if (i13 == 1) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        s10.A = z13;
                        if (i13 == 2) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        s10.B = z14;
                    }
                    if (i10 >= 4) {
                        int i14 = wrap.get(3) & 255;
                        int i15 = i14 & 3;
                        s10.f32276z = i15;
                        s10.f32274x = (i14 & 12) >> 2;
                        if (i15 == 2) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        s10.f32273w = z10;
                    }
                    if (i10 >= 5) {
                        s10.E = wrap.get(4) & 255;
                    }
                    if (i10 >= 6) {
                        int i16 = wrap.get(5) & 255;
                        if (i16 == 0) {
                            s10.P = false;
                            s10.Q = 0;
                            s10.N = 3;
                        } else if (i16 == 1) {
                            s10.P = true;
                            s10.Q = 2;
                            s10.N = 1;
                        } else if (i16 == 2) {
                            s10.P = true;
                            s10.Q = 1;
                            s10.N = 2;
                        }
                    }
                    if (i10 >= 7) {
                        s10.X = wrap.getShort(6) & 65535;
                    }
                }
                s10.a();
            }
            return true;
        }
        ge.b.p("Get dev info failed");
        throw new ne.c("get remote dev info failed", 270);
    }

    public final boolean V() {
        try {
            if (this.f29221a) {
                ge.b.n(String.format("<< CMD_OTA_RESET (0x%04X)", (short) 1541));
            }
            return M(new ed.b(2, (short) 1541, (short) 0, new byte[]{(byte) 5, (byte) 6}), true);
        } catch (ie.a e10) {
            ge.b.p(String.format("Send OPCODE_DFU_RESET_SYSTEM failed, ignore it, errorcode= 0x%04X", Integer.valueOf(e10.f16770b)));
            this.D = 0;
            return false;
        }
    }

    public final int W(String str, int i10) {
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
                StringBuilder a10 = android.support.v4.media.d.a("connecting to ");
                a10.append(p.b.m(str));
                ge.b.o(a10.toString(), z10);
                s0().b(this.B0);
                ed.c s02 = s0();
                s02.h(G, null, s02.f13553n, 0);
                try {
                    synchronized (this.f29241l) {
                        if (!this.f29239k && this.D == 0) {
                            boolean z11 = this.f29221a;
                            ge.b.e("wait for connect for " + q().D + " ms", z11);
                            this.f29241l.wait(q().D);
                        }
                    }
                } catch (InterruptedException e10) {
                    StringBuilder a11 = android.support.v4.media.d.a("Sleeping interrupted : ");
                    a11.append(e10.toString());
                    ge.b.p(a11.toString());
                    this.D = 259;
                }
                if (this.D == 0) {
                    if (!this.f29239k) {
                        ge.b.p("wait for connect, but can not connect with no callback");
                        i12 = 260;
                    } else if (this.f29243m != 515) {
                        StringBuilder a12 = android.support.v4.media.d.a("connect with some error, please check. mConnectionState");
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
                    ge.b.o("connected the device which going to upgrade", this.f29222b);
                }
                i11 = this.D;
            }
            if (i11 == 0) {
                return 0;
            }
            if ((i11 & (-2049)) != 133) {
                p0();
            } else {
                ge.b.q("connect fail with GATT_ERROR, do not need disconnect", this.f29221a);
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

    public final void X(byte b10) {
        n nVar = new n(this.f29254x.f28066w, b10);
        if (s().f32268r) {
            byte[] a10 = this.C.a(nVar.h(), 0, 16);
            ge.b.o(nVar.toString(), this.f29221a);
            N((short) 1538, a10);
        } else {
            L(nVar);
        }
        ge.b.o("... Reading CMD_OTA_START notification", this.f29222b);
        byte b11 = R()[0];
        if (b11 == 1) {
            return;
        }
        throw ye.b.a("start dfu failed, status=0x%02X", new Object[]{Byte.valueOf(b11)}, "start dfu failed", 766);
    }

    public final void Y(boolean z10) {
        boolean z11;
        if (c0(null)) {
            if (z10) {
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
                m0(0);
            }
            n(this.f29254x);
        }
    }

    public final boolean Z(te.a aVar, int i10, int i11) {
        ge.b.o(String.format(Locale.US, "nextBinSize=%d, mBytesSentBuffer=%d, bufferSize=%d", Integer.valueOf(aVar.s()), Integer.valueOf(i10), Integer.valueOf(i11)), this.f29221a);
        return aVar.s() + i10 > i11;
    }

    public final void a0(byte b10, int i10) {
        byte[] bArr = {(byte) (i10 & 255), (byte) ((i10 >> 8) & 255), b10};
        ge.b.o(String.format("<< CMD_OTA_VALID (0x%04X)", (short) 1540), this.f29221a);
        if (N((short) 1540, bArr)) {
            ge.b.o("... waiting CMD_OTA_VALID response", this.f29222b);
            byte b11 = P(30000L)[0];
            if (b11 == 1) {
                ge.b.o("validate success", this.f29222b);
                return;
            } else if (b11 == 5) {
                throw ye.b.a("0x%02X, Validate FW failed", new Object[]{Byte.valueOf(b11)}, "Validate FW failed", 517);
            } else {
                throw ye.b.a("Validate FW failed, status=0x%02X", new Object[]{Byte.valueOf(b11)}, "Validate FW failed", 766);
            }
        }
        throw new ne.c("Validate FW failed", DfuBaseService.ERROR_REMOTE_TYPE_SECURE);
    }

    public final void b0() {
        boolean z10 = true;
        if (c0(new byte[]{1})) {
            if ((this.f29243m & DfuBaseService.ERROR_REMOTE_TYPE_SECURE) != 512) {
                z10 = false;
            }
            if (z10) {
                D();
            } else {
                ge.b.d("device already disconnected");
            }
            m0(0);
            n(this.f29254x);
        }
    }

    @Override // ve.a
    public final void c(int i10, boolean z10) {
        if (this.f29233h) {
            i10 = 4128;
        }
        if (this.f29221a) {
            ge.b.n(String.format("error = 0x%04X, needReset=%b", Integer.valueOf(i10), Boolean.valueOf(z10)));
        }
        if (i10 != 4128) {
            z(260);
        }
        if (z10) {
            V();
        }
        be.a aVar = this.f15318r0;
        if (aVar != null) {
            aVar.l();
        }
        if (q().e(1)) {
            m0(i10);
        }
        n(this.f29254x);
        y yVar = this.f29229f;
        if (yVar != null) {
            yVar.z(i10);
        }
        this.f29233h = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:70:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00aa  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean c0(byte[] r9) {
        /*
            r8 = this;
            r0 = 524(0x20c, float:7.34E-43)
            r8.z(r0)
            r0 = 1
            r1 = 0
            r2 = 4
            boolean r3 = r8.f29221a     // Catch: ie.a -> L22
            java.lang.String r4 = "<< CMD_OTA_ACTIVE_RESET(0x%04X)"
            java.lang.Object[] r5 = new java.lang.Object[r0]     // Catch: ie.a -> L22
            r6 = 1542(0x606, float:2.161E-42)
            java.lang.Short r7 = java.lang.Short.valueOf(r6)     // Catch: ie.a -> L22
            r5[r1] = r7     // Catch: ie.a -> L22
            java.lang.String r4 = java.lang.String.format(r4, r5)     // Catch: ie.a -> L22
            ge.b.e(r4, r3)     // Catch: ie.a -> L22
            boolean r9 = r8.N(r6, r9)     // Catch: ie.a -> L22
            goto L40
        L22:
            r9 = move-exception
            int r3 = r9.f16770b
            r4 = 4128(0x1020, float:5.785E-42)
            if (r3 != r4) goto L2a
            goto L5d
        L2a:
            ze.j r3 = r8.s()
            int r3 = r3.f32262l
            if (r3 >= r2) goto L48
            ze.e r3 = r8.q()
            boolean r3 = r3.f32303o
            if (r3 != 0) goto L42
            java.lang.String r9 = "active cmd has no response, ignore"
            ge.b.d(r9)
            r9 = 1
        L40:
            r4 = 0
            goto L5e
        L42:
            java.lang.String r3 = "active cmd has no response, notify error"
            ge.b.p(r3)
            goto L5b
        L48:
            java.lang.Object[] r3 = new java.lang.Object[r0]
            int r4 = r9.f16770b
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r3[r1] = r4
            java.lang.String r4 = "activeImageAndReset failed, errcode= 0x%04X"
            java.lang.String r3 = java.lang.String.format(r4, r3)
            ge.b.d(r3)
        L5b:
            int r4 = r9.f16770b
        L5d:
            r9 = 0
        L5e:
            if (r9 == 0) goto L7f
            ze.j r0 = r8.s()
            int r0 = r0.f32262l
            if (r0 < r2) goto La1
            boolean r0 = r8.f29221a     // Catch: ie.a -> L75
            java.lang.String r2 = "... Reading CMD_OTA_ACTIVE_RESET notification"
            ge.b.o(r2, r0)     // Catch: ie.a -> L75
            r2 = 1600(0x640, double:7.905E-321)
            r8.P(r2)     // Catch: ie.a -> L75
            goto La1
        L75:
            r9 = move-exception
            java.lang.String r0 = "Read CMD_OTA_ACTIVE_RESET notification failed"
            ge.b.p(r0)
            int r4 = r9.f16770b
            r0 = 0
            goto La2
        L7f:
            ed.c r2 = r8.s0()
            int r2 = r2.k()
            java.lang.Object[] r3 = new java.lang.Object[r0]
            java.lang.Integer r5 = java.lang.Integer.valueOf(r2)
            r3[r1] = r5
            java.lang.String r1 = "connectState=0x%04X"
            java.lang.String r1 = java.lang.String.format(r1, r3)
            ge.b.n(r1)
            r1 = 2
            if (r2 == r1) goto La1
            java.lang.String r9 = "connection maybe lost"
            ge.b.n(r9)
            goto La2
        La1:
            r0 = r9
        La2:
            if (r0 == 0) goto Laa
            java.lang.String r9 = "image active success"
            ge.b.d(r9)
            return r0
        Laa:
            ne.c r9 = new ne.c
            r9.<init>(r4)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: jf.i.c0(byte[]):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:72:0x0046 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0047  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final byte[] d0(short r5, byte[] r6) {
        /*
            r4 = this;
            r0 = 0
            r4.D = r0
            r1 = 0
            r4.f29246p = r1
            r2 = 1536(0x600, float:2.152E-42)
            if (r5 == r2) goto L31
            r2 = 1537(0x601, float:2.154E-42)
            if (r5 == r2) goto L31
            r2 = 1546(0x60a, float:2.166E-42)
            if (r5 == r2) goto L25
            r2 = 1547(0x60b, float:2.168E-42)
            if (r5 == r2) goto L20
            r2 = 1550(0x60e, float:2.172E-42)
            if (r5 == r2) goto L1b
            goto L3a
        L1b:
            java.util.HashSet r2 = r4.f15323w0
            r3 = 1549(0x60d, float:2.17E-42)
            goto L29
        L20:
            java.util.HashSet r2 = r4.f15323w0
            r3 = 1545(0x609, float:2.165E-42)
            goto L29
        L25:
            java.util.HashSet r2 = r4.f15323w0
            r3 = 1544(0x608, float:2.164E-42)
        L29:
            java.lang.Short r3 = java.lang.Short.valueOf(r3)
            r2.add(r3)
            goto L3a
        L31:
            java.util.HashSet r3 = r4.f15323w0
            java.lang.Short r2 = java.lang.Short.valueOf(r2)
            r3.add(r2)
        L3a:
            r4.f29245o = r0
            ed.c r0 = r4.s0()
            boolean r5 = r0.d(r5, r6)
            if (r5 != 0) goto L47
            return r1
        L47:
            java.lang.Object r5 = r4.f29244n
            monitor-enter(r5)
            int r6 = r4.D     // Catch: java.lang.Throwable -> L60 java.lang.InterruptedException -> L62
            if (r6 != 0) goto L7b
            boolean r6 = r4.f29245o     // Catch: java.lang.Throwable -> L60 java.lang.InterruptedException -> L62
            if (r6 != 0) goto L7b
            int r6 = r4.f29243m     // Catch: java.lang.Throwable -> L60 java.lang.InterruptedException -> L62
            r0 = 515(0x203, float:7.22E-43)
            if (r6 != r0) goto L7b
            java.lang.Object r6 = r4.f29244n     // Catch: java.lang.Throwable -> L60 java.lang.InterruptedException -> L62
            r0 = 15000(0x3a98, double:7.411E-320)
            r6.wait(r0)     // Catch: java.lang.Throwable -> L60 java.lang.InterruptedException -> L62
            goto L7b
        L60:
            r6 = move-exception
            goto La0
        L62:
            r6 = move-exception
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L60
            r0.<init>()     // Catch: java.lang.Throwable -> L60
            java.lang.String r1 = "sleeping interrupted:"
            r0.append(r1)     // Catch: java.lang.Throwable -> L60
            r0.append(r6)     // Catch: java.lang.Throwable -> L60
            java.lang.String r6 = r0.toString()     // Catch: java.lang.Throwable -> L60
            ge.b.p(r6)     // Catch: java.lang.Throwable -> L60
            r6 = 259(0x103, float:3.63E-43)
            r4.D = r6     // Catch: java.lang.Throwable -> L60
        L7b:
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L60
            int r5 = r4.D
            if (r5 != 0) goto L8f
            boolean r5 = r4.f29245o
            if (r5 != 0) goto L8f
            boolean r5 = r4.f29222b
            java.lang.String r6 = "read value but no callback"
            ge.b.e(r6, r5)
            r5 = 261(0x105, float:3.66E-43)
            r4.D = r5
        L8f:
            int r5 = r4.D
            if (r5 != 0) goto L96
            byte[] r5 = r4.f29246p
            return r5
        L96:
            ne.c r5 = new ne.c
            int r6 = r4.D
            java.lang.String r0 = "Error while send command"
            r5.<init>(r0, r6)
            throw r5
        La0:
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L60
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: jf.i.d0(short, byte[]):byte[]");
    }

    public final boolean e0(int i10, byte[] bArr) {
        int i11;
        short s10 = 0;
        for (int i12 = 0; i12 < i10; i12 += 2) {
            s10 = (short) (s10 ^ ((short) ((bArr[i12 + 1] << 8) | (bArr[i12] & 255))));
        }
        jf.a aVar = null;
        L(new b(i10, (short) (((s10 & 255) << 8) | ((65280 & s10) >> 8))));
        ge.b.o(String.format("... waiting EVENT_OTA_BUFFER_CHECK(0x%04X)response", (short) 1542), this.f29221a);
        byte[] R = R();
        if (R != null && R.length > 0) {
            int length = R.length;
            ByteBuffer wrap = ByteBuffer.wrap(R);
            wrap.order(ByteOrder.LITTLE_ENDIAN);
            byte b10 = R[0];
            if (length >= 5) {
                i11 = wrap.getInt(1);
            } else {
                i11 = 0;
            }
            aVar = new jf.a(b10, i11);
        }
        byte b11 = aVar.f17644a;
        if (b11 != 1) {
            if (b11 != 5 && b11 != 6 && b11 != 7) {
                if (b11 != 8) {
                    throw new ne.c("ERROR_OPCODE_RESPONSE_NOT_SUPPORTED", 766);
                }
                throw new ne.c("DFU_STATUS_FLASH_ERASE_ERROR", aVar.f17644a | 512);
            }
            ge.b.p(String.format("buffer check failed, status=0x%02X ", Byte.valueOf(b11)));
            return false;
        }
        int i13 = aVar.f17645b;
        this.f29224c0 = i13;
        ge.b.e(String.format(Locale.US, "mImageUpdateOffset=0x%08X(%d)", Integer.valueOf(i13), Integer.valueOf(this.f29224c0)), this.f29221a);
        return true;
    }

    public final void f0(String str) {
        if (!this.f29233h) {
            z(516);
            int W = W(str, q().C);
            if (W != 0) {
                if (W != 4128) {
                    ge.b.d(String.format("connect failed:0x%04X", Integer.valueOf(W)));
                    be.d dVar = new be.d(32);
                    dVar.f4164h = 31000L;
                    F(dVar);
                    int W2 = W(str, q().C);
                    if (W2 == 0) {
                        return;
                    }
                    if (W2 == 4128) {
                        throw new ne.c("aborted, connectRemoteDevice failed", W2);
                    }
                    throw new ne.c("connectRemoteDevice failed", W2);
                }
                throw new ne.c("aborted, connectRemoteDevice failed", W);
            }
            return;
        }
        throw new ne.c("user aborted", 4128);
    }

    @Override // ve.a
    public final boolean g(boolean z10) {
        if (!super.g(z10)) {
            return false;
        }
        if (this.f29243m != 515) {
            boolean z11 = this.f29221a;
            StringBuilder a10 = android.support.v4.media.d.a("start to re-connect the RCU which going to active image, current state is: ");
            a10.append(this.f29243m);
            ge.b.b(3, a10.toString(), ge.b.f15314a, z11);
            int W = W(this.F, q().C);
            if (W != 0) {
                StringBuilder a11 = e2.a("Something error in OTA process, errorCode: ", W, "mProcessState");
                a11.append(this.f29252v);
                ge.b.p(a11.toString());
                c(W, true);
                return false;
            }
        }
        if (z10) {
            try {
                Y(true);
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
            V();
            c(274, true);
        }
        A();
        return true;
    }

    public final boolean g0(int i10) {
        byte[] bArr = {(byte) (i10 & 255), (byte) ((i10 >> 8) & 255)};
        ge.b.o(String.format("<< CMD_COPY_IMAGE (0x%04X)", (short) 1551), this.f29221a);
        if (N((short) 1551, bArr)) {
            ge.b.o("... waiting CMD_COPY_IMAGE response", this.f29222b);
            byte b10 = P(30000L)[0];
            if (b10 == 1) {
                return true;
            }
            throw ye.b.a("copyImage failed, status=0x%02X", new Object[]{Byte.valueOf(b10)}, "copyImage failed", 288);
        }
        throw new ne.c("copyImage failed", DfuBaseService.ERROR_REMOTE_TYPE_SECURE);
    }

    public final boolean h0(int i10) {
        z(521);
        r().i();
        if (this.f29222b) {
            ge.b.n(String.format("forceCopyProcedure, imageId=0x%04X", Integer.valueOf(i10)));
            ge.b.n(r().toString());
        }
        g0(i10);
        r().g();
        x();
        return true;
    }

    public final int i0() {
        te.a aVar;
        z(521);
        r().i();
        if (this.f29221a) {
            ge.b.n("processCopyProcedure ...");
            ge.b.n(r().toString());
        }
        try {
            g0(r().f32324i);
            r().g();
            x();
            this.A += r().f32317b;
            if (r().f()) {
                ge.b.o("no pendding image file to upload", this.f29222b);
                r().f32327l = this.A;
                return 3;
            }
            ge.b.d("has pending image file to upload");
            if (s().O == 1) {
                this.F = this.H;
                this.f29237j = true;
                this.A = 0;
                Y(true);
            } else {
                if (s().O == 3 && (aVar = this.f29255y) != null && Z(aVar, this.A, s().E * 4096)) {
                    ge.b.d("make device to enter the ota advertiser mode, and let the app continue update image");
                    this.f29237j = true;
                    this.A = 0;
                    b0();
                }
                return 2;
            }
            int i10 = r().f32327l / 30;
            d(30000L);
            return 2;
        } catch (ie.a unused) {
            return 1;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:180:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:270:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x01d7  */
    /* JADX WARN: Removed duplicated region for block: B:289:0x021b  */
    /* JADX WARN: Removed duplicated region for block: B:290:0x021f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean j0(int r27) {
        /*
            Method dump skipped, instructions count: 616
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: jf.i.j0(int):boolean");
    }

    public final void k0(int i10) {
        L(new f(i10));
        ge.b.o("... Reading CMD_OTA_IMAGE_INFO notification", this.f29222b);
        g a10 = g.a(R());
        if (a10 != null && a10.f17654a == 1) {
            if (this.f29221a) {
                ge.b.n(a10.toString());
            }
            this.f29224c0 = a10.f17656c;
            this.f29226d0 = a10.f17657d;
            return;
        }
        throw ye.b.a("0x%02X, Get target image info failed", new Object[]{766}, "Get target image info failed", 766);
    }

    public final void l0(int i10) {
        boolean z10;
        if (this.f29224c0 == 0) {
            if (s().f32262l >= 3) {
                z10 = false;
            } else {
                z10 = true;
            }
            if (z10) {
                this.f29224c0 = 12;
            }
        }
        ge.b.e(String.format(Locale.US, "mImageUpdateOffset=0x%08X(%d)", Integer.valueOf(this.f29224c0), Integer.valueOf(this.f29224c0)), this.f29221a);
        int i11 = r().f32317b;
        int i12 = this.f29224c0;
        if (i11 != i12 && i12 != -1) {
            ge.b.o("mBytesSent != mImageUpdateOffset, reload image bin file", this.f29222b);
            K();
            h(this.f29224c0, false);
        }
    }

    public final void m0(int i10) {
        int i11 = this.f29243m;
        if (i11 != 0 && i11 != 1280) {
            p0();
        }
        ge.b.o("closeGatt", this.f29221a);
        s0().j();
        s0().g(this.B0);
        B(1280);
        ge.b.e(String.format("terminateConnection, error = 0x%04X", Integer.valueOf(i10)), this.f29221a);
    }

    /* JADX WARN: Removed duplicated region for block: B:157:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0059 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0030 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:178:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void n0() {
        /*
            Method dump skipped, instructions count: 348
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: jf.i.n0():void");
    }

    public final void o0() {
        int i10;
        if (s().f32262l < 8) {
            return;
        }
        ArrayList arrayList = this.f29253w;
        byte[] bArr = null;
        if (arrayList != null && arrayList.size() > 0) {
            bArr = new byte[this.f29253w.size() * 6];
            i10 = 0;
            for (te.a aVar : this.f29253w) {
                byte[] bArr2 = aVar.H;
                if (bArr2 != null && bArr2.length == 4) {
                    int i11 = i10 * 6;
                    int i12 = aVar.f28053j;
                    bArr[i11] = (byte) (i12 & 255);
                    bArr[i11 + 1] = (byte) ((i12 >> 8) & 255);
                    System.arraycopy(bArr2, 0, bArr, i11 + 2, 4);
                    i10++;
                }
            }
        } else {
            i10 = 0;
        }
        if (bArr != null && bArr.length > 0) {
            L(new c(i10, bArr));
            ge.b.o(String.format("... waiting EVENT_CHECK_PUBLIC_KEY_HASH(0x%04X) response", (short) 1553), this.f29221a);
            byte[] R = R();
            if (R != null && R.length > 0 && R[0] == 1) {
                return;
            }
            ge.b.p("check pub key failed");
            throw new ne.c("ERROR_DFU_PUB_KEYS_CONFLICT", 285);
        }
    }

    public final void p0() {
        int i10 = this.f29243m;
        if (i10 == 0 || i10 == 1280) {
            ge.b.e("already disconnect", this.f29221a);
            return;
        }
        s0().j();
        D();
    }

    /* JADX WARN: Removed duplicated region for block: B:57:0x0088 A[Catch: a -> 0x00a7, TryCatch #0 {a -> 0x00a7, blocks: (B:40:0x0024, B:42:0x0034, B:45:0x0038, B:47:0x0047, B:51:0x005d, B:53:0x0070, B:55:0x007b, B:57:0x0088, B:59:0x008c, B:61:0x0095, B:63:0x009e, B:62:0x009c, B:54:0x0076), top: B:67:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x008c A[Catch: a -> 0x00a7, TryCatch #0 {a -> 0x00a7, blocks: (B:40:0x0024, B:42:0x0034, B:45:0x0038, B:47:0x0047, B:51:0x005d, B:53:0x0070, B:55:0x007b, B:57:0x0088, B:59:0x008c, B:61:0x0095, B:63:0x009e, B:62:0x009c, B:54:0x0076), top: B:67:0x0024 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean q0() {
        /*
            r9 = this;
            boolean r0 = r9.f29221a
            r1 = 1
            java.lang.Object[] r2 = new java.lang.Object[r1]
            r3 = 1543(0x607, float:2.162E-42)
            java.lang.Short r4 = java.lang.Short.valueOf(r3)
            r5 = 0
            r2[r5] = r4
            java.lang.String r4 = "<< CMD_OTA_BUFFER_CHECK_ENABLE (0x%04X)"
            java.lang.String r2 = java.lang.String.format(r4, r2)
            ge.b.o(r2, r0)
            r0 = 0
            boolean r0 = r9.N(r3, r0)
            java.lang.String r2 = "enableBufferCheck failed"
            if (r0 != 0) goto L24
            ge.b.d(r2)
            return r5
        L24:
            boolean r0 = r9.f29221a     // Catch: ie.a -> La7
            java.lang.String r3 = "... Reading OPCODE_DFU_ENABLE_BUFFER_CHECK_MODE response"
            ge.b.o(r3, r0)     // Catch: ie.a -> La7
            r3 = 3000(0xbb8, double:1.482E-320)
            byte[] r0 = r9.P(r3)     // Catch: ie.a -> La7
            r3 = 2
            if (r0 == 0) goto L76
            int r4 = r0.length     // Catch: ie.a -> La7
            if (r4 >= r1) goto L38
            goto L76
        L38:
            int r4 = r0.length     // Catch: ie.a -> La7
            java.nio.ByteBuffer r6 = java.nio.ByteBuffer.wrap(r0)     // Catch: ie.a -> La7
            java.nio.ByteOrder r7 = java.nio.ByteOrder.LITTLE_ENDIAN     // Catch: ie.a -> La7
            r6.order(r7)     // Catch: ie.a -> La7
            r0 = r0[r5]     // Catch: ie.a -> La7
            r7 = 3
            if (r4 < r7) goto L59
            byte r3 = r6.get(r3)     // Catch: ie.a -> La7
            r3 = r3 & 255(0xff, float:3.57E-43)
            short r3 = (short) r3     // Catch: ie.a -> La7
            int r3 = r3 << 8
            byte r8 = r6.get(r1)     // Catch: ie.a -> La7
            r8 = r8 & 255(0xff, float:3.57E-43)
            short r8 = (short) r8     // Catch: ie.a -> La7
            r3 = r3 | r8
            goto L5a
        L59:
            r3 = 0
        L5a:
            r8 = 4
            if (r4 < r8) goto L6f
            byte r4 = r6.get(r8)     // Catch: ie.a -> La7
            r4 = r4 & 255(0xff, float:3.57E-43)
            short r4 = (short) r4     // Catch: ie.a -> La7
            int r4 = r4 << 8
            byte r6 = r6.get(r7)     // Catch: ie.a -> La7
            r6 = r6 & 255(0xff, float:3.57E-43)
            short r6 = (short) r6     // Catch: ie.a -> La7
            r4 = r4 | r6
            goto L70
        L6f:
            r4 = 0
        L70:
            jf.d r6 = new jf.d     // Catch: ie.a -> La7
            r6.<init>(r0, r3, r4)     // Catch: ie.a -> La7
            goto L7b
        L76:
            jf.d r6 = new jf.d     // Catch: ie.a -> La7
            r6.<init>(r3, r5, r5)     // Catch: ie.a -> La7
        L7b:
            boolean r0 = r9.f29221a     // Catch: ie.a -> La7
            java.lang.String r3 = r6.toString()     // Catch: ie.a -> La7
            ge.b.o(r3, r0)     // Catch: ie.a -> La7
            byte r0 = r6.f17650a     // Catch: ie.a -> La7
            if (r0 == r1) goto L8c
            ge.b.d(r2)     // Catch: ie.a -> La7
            return r5
        L8c:
            ze.j r0 = r9.s()     // Catch: ie.a -> La7
            int r0 = r0.f32262l     // Catch: ie.a -> La7
            r2 = 6
            if (r0 < r2) goto L9c
            ze.j r0 = r9.s()     // Catch: ie.a -> La7
            int r0 = r0.X     // Catch: ie.a -> La7
            goto L9e
        L9c:
            int r0 = r6.f17652c     // Catch: ie.a -> La7
        L9e:
            int r2 = r6.f17651b     // Catch: ie.a -> La7
            r9.b(r2)     // Catch: ie.a -> La7
            r9.Q(r0)     // Catch: ie.a -> La7
            return r1
        La7:
            java.lang.String r0 = "wait EnableBufferCheckRsp timeout"
            ge.b.p(r0)
            r0 = 284(0x11c, float:3.98E-43)
            r9.D = r0
            ne.c r1 = new ne.c
            java.lang.String r2 = "Unable to receive notification"
            r1.<init>(r2, r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: jf.i.q0():boolean");
    }

    public final int r0() {
        boolean z10;
        byte b10;
        int i10;
        boolean z11;
        a.C0251a c0251a;
        if (!s().P || s().f32262l < 5) {
            return 0;
        }
        ge.b.d(String.format(Locale.US, "binId=0x%04X, activeCompareVersionFlag=%d, inactiveCompareVersionFlag=%d", Integer.valueOf(this.f29254x.f28058o), Integer.valueOf(this.f29254x.A), Integer.valueOf(this.f29254x.B)));
        te.a aVar = this.f29254x;
        if ((aVar.f28052i != 11 || aVar.f28058o != 520) && aVar.A != 0 && aVar.B != 0) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (!z10) {
            return 0;
        }
        int i11 = r().f32324i;
        byte[] bArr = this.f29254x.f28067x;
        if (bArr != null && bArr.length == 32) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(new b.a(i11, bArr));
            new ArrayList();
            int size = arrayList.size();
            byte[] bArr2 = new byte[size * 34];
            Iterator it = arrayList.iterator();
            int i12 = 0;
            while (it.hasNext()) {
                b.a aVar2 = (b.a) it.next();
                ge.b.n(aVar2.toString());
                byte[] bArr3 = aVar2.f14258c;
                if (bArr3 != null && bArr3.length >= 34) {
                    System.arraycopy(bArr3, 0, bArr2, i12, 34);
                }
                i12 += 34;
            }
            ff.b bVar = new ff.b(size, bArr2);
            if (this.f29221a) {
                ge.b.n(String.format("CheckSha256Req(0x%04X) {", (short) 1552) + String.format(Locale.US, "\n\t%s", bVar.toString()) + "\n}");
            }
            if (N((short) 1552, bVar.a())) {
                ge.b.o("... waiting CMD_CHECK_IMAGE response", this.f29222b);
                ff.a a10 = ff.a.a(P(30000L));
                if (this.f29222b) {
                    ge.b.n(a10.toString());
                }
                List<a.C0251a> list = a10.f14251b;
                if (list != null && list.size() > 0) {
                    Iterator<a.C0251a> it2 = a10.f14251b.iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            c0251a = it2.next();
                            if (c0251a.f14252a == i11) {
                                break;
                            }
                        } else {
                            c0251a = new a.C0251a((byte) 0, i11);
                            break;
                        }
                    }
                } else {
                    c0251a = new a.C0251a((byte) 0, i11);
                }
                b10 = c0251a.f14253b;
            } else {
                throw new ne.c("checkImage failed", DfuBaseService.ERROR_REMOTE_TYPE_SECURE);
            }
        } else {
            StringBuilder a11 = android.support.v4.media.d.a("invalid sha256:");
            a11.append(he.a.a(bArr));
            ge.b.n(a11.toString());
            b10 = 0;
        }
        if ((b10 & 1) == 1) {
            ge.b.d("current image's sha256 is same as the inactive bank image, need to skip");
            i10 = 1;
        } else {
            i10 = 0;
        }
        if ((b10 & 2) == 2) {
            int i13 = r().f32323h;
            if (i13 != 1024 && i13 != 1040 && i13 != 1280 && i13 != 1538 && i13 != 2304) {
                z11 = false;
            } else {
                z11 = true;
            }
            if (z11) {
                ge.b.d("current image's sha256 is same as the active bank image, need to copy");
                return i10 | 2;
            }
            ge.b.n(String.format("0x%04X not support copy image", Integer.valueOf(r().f32323h)));
            return i10;
        }
        return i10;
    }

    public final ed.c s0() {
        if (this.f15325y0 == null) {
            ed.c l10 = ed.c.l();
            this.f15325y0 = l10;
            l10.b(this.B0);
        }
        return this.f15325y0;
    }

    public void t0() {
        if (j0(10132)) {
            h0(10132);
        }
        if (j0(10133)) {
            h0(10133);
        }
        if (j0(10134)) {
            h0(10134);
        }
        if (j0(10135)) {
            h0(10135);
        }
        if (j0(10136)) {
            h0(10136);
        }
        if (j0(10137)) {
            h0(10137);
        }
        if (j0(10138)) {
            h0(10138);
        }
    }

    public final void u0() {
        ge.b.o("processRoleSwapProcedure ...", this.f29222b);
        if (s().f32262l <= 5) {
            Y(false);
        } else {
            this.A0 = true;
            if (s().f32274x == 1) {
                this.f17658z0 = 2;
            } else {
                int i10 = s().f32274x;
                this.f17658z0 = 1;
            }
            byte[] bArr = {(byte) 0};
            ge.b.o(String.format("<< CMD_OTA_ROLE_SWAP (0x%04X)", (short) 1553), this.f29221a);
            if (N((short) 1553, bArr)) {
                ge.b.o("... waiting CMD_OTA_ROLE_SWAP response", this.f29222b);
                byte b10 = P(30000L)[0];
                if (b10 == 1) {
                    ge.b.e("role swap operation done", this.f29221a);
                } else {
                    ge.b.p(String.format("role swap failed, maybe b2b disconnect, status=0x%02X", Byte.valueOf(b10)));
                    throw new ne.c(String.format("roleSwap failed, status=0x%02X", Byte.valueOf(b10)), DfuBaseService.NOTIFICATION_ID);
                }
            } else {
                throw new ne.c("roleSwap failed", DfuBaseService.ERROR_REMOTE_TYPE_SECURE);
            }
        }
        z(522);
        ge.b.e("wait master to handover ...", this.f29221a);
        try {
            Thread.sleep(q().f32284e0 * 1000);
        } catch (InterruptedException unused) {
        }
    }

    public final void v0() {
        byte[] d02;
        if (s().f32262l <= 5) {
            ge.b.o(String.format("<< CMD_OTA_GET_IMAGE_INFO (0x%04X)", (short) 1537), this.f29221a);
            d02 = d0((short) 1537, null);
        } else {
            ge.b.o(String.format("<< CMD_OTA_GET_IMAGE_INFO (0x%04X), bank=0x00", (short) 1537), this.f29221a);
            d02 = d0((short) 1537, new byte[]{0});
        }
        s().z(d02);
    }
}
