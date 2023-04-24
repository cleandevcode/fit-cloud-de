package gd;

import com.realsil.sdk.bbpro.DspConfig;
import com.realsil.sdk.bbpro.internal.BaseBeeProManager;
import java.util.Iterator;
import java.util.Locale;
import java.util.UUID;
import java.util.concurrent.CopyOnWriteArrayList;
import no.nordicsemi.android.dfu.DfuBaseService;

/* loaded from: classes.dex */
public class l extends kd.c<e> {

    /* renamed from: q */
    public static final UUID f15304q = de.a.a(769);

    /* renamed from: r */
    public static final UUID f15305r = de.a.a(770);

    /* renamed from: s */
    public static final UUID f15306s = de.a.a(771);

    /* renamed from: j */
    public DspConfig f15307j;

    /* renamed from: k */
    public d f15308k;

    /* renamed from: m */
    public byte[] f15310m;

    /* renamed from: l */
    public byte f15309l = 0;

    /* renamed from: n */
    public int f15311n = 1;

    /* renamed from: o */
    public int f15312o = 2;

    /* renamed from: p */
    public int f15313p = 0;

    public l() {
        if (this.f15307j == null) {
            this.f15307j = new DspConfig();
        }
    }

    @Override // kd.c
    public final void b(ed.a aVar) {
        b bVar;
        UUID uuid;
        String str;
        int t10 = t();
        if (t10 == 0) {
            n(aVar);
        } else if (t10 >= 1) {
            short s10 = aVar.f13543a;
            byte b10 = aVar.f13544b;
            if (s10 != 523) {
                if (s10 != 524) {
                    if (s10 != 528) {
                        if (s10 != 3587) {
                            switch (s10) {
                                case DfuBaseService.ERROR_REMOTE_TYPE_SECURE /* 512 */:
                                    if (b10 != 0) {
                                        int i10 = this.f15313p;
                                        int i11 = this.f15311n;
                                        if ((i10 & i11) == i11) {
                                            i(f15304q);
                                            j(b10, this.f15309l);
                                        }
                                        int i12 = this.f15313p;
                                        int i13 = this.f15312o;
                                        if ((i12 & i13) == i13) {
                                            i(f15304q);
                                            i(f15305r);
                                            p();
                                        }
                                    }
                                    this.f15313p = 0;
                                    return;
                                case 513:
                                    if (kd.c.f18444g) {
                                        ge.b.n(String.format("onEnableAudioEqResponse: 0x%02X", Byte.valueOf(b10)));
                                    }
                                    if (b10 == 0) {
                                        if (kd.c.f18444g) {
                                            str = "automate to query eq state after enable eq";
                                            ge.b.n(str);
                                        }
                                        u();
                                        return;
                                    }
                                    j(b10, this.f15309l);
                                    return;
                                case 514:
                                    if (kd.c.f18444g) {
                                        ge.b.n(String.format("onDisableAudioEqResponse: 0x%02X", Byte.valueOf(b10)));
                                    }
                                    if (b10 == 0) {
                                        if (kd.c.f18444g) {
                                            str = "automate to query eq state after disable eq";
                                            ge.b.n(str);
                                        }
                                        u();
                                        return;
                                    }
                                    j(b10, this.f15309l);
                                    return;
                                case 515:
                                    if (kd.c.f18444g) {
                                        ge.b.n(String.format("onSetAudioEqIndexParamsResponse: 0x%02X", Byte.valueOf(b10)));
                                    }
                                    uuid = f15306s;
                                    break;
                                case 516:
                                    if (b10 != 0) {
                                        m(b10, null);
                                        return;
                                    }
                                    return;
                                case 517:
                                    k(b10, 0);
                                    return;
                                case 518:
                                    if (b10 != 0) {
                                        if (kd.c.f18444g) {
                                            ge.b.n(String.format("onGetAudioEqIndexResponse: 0x%02X", Byte.valueOf(b10)));
                                        }
                                        i(f15304q);
                                        bVar = new b(0, 0, 0, 3);
                                        break;
                                    } else {
                                        return;
                                    }
                                default:
                                    return;
                            }
                        } else if (t() <= 3) {
                            if (b10 != 0) {
                                i(f15304q);
                                bVar = new b(0, 1, 0, 3);
                            } else {
                                return;
                            }
                        }
                    } else if (b10 != 0) {
                        if (kd.c.f18444g) {
                            ge.b.n(String.format("queryEqBasicInfo failed: 0x%02X", Byte.valueOf(b10)));
                        }
                        uuid = f15304q;
                    } else {
                        return;
                    }
                    i(uuid);
                    return;
                } else if (b10 != 0) {
                    i(f15305r);
                    bVar = new b(1, 0, 0, 3);
                } else {
                    return;
                }
                l(b10, bVar);
                return;
            }
            k(b10, 1);
        } else {
            n(aVar);
        }
    }

    @Override // kd.c
    public final void c(int i10, nd.b bVar) {
        boolean z10;
        if (i10 == 21) {
            if (s().f15253j != bVar.f22269z) {
                z10 = true;
            } else {
                z10 = false;
            }
            s().f15253j = bVar.f22269z;
            i(f15304q);
            if (z10) {
                ge.b.o(String.format("dispatchGamingModeStateChanged:%b", Boolean.valueOf(bVar.f22269z)), kd.c.f18444g);
                CopyOnWriteArrayList copyOnWriteArrayList = this.f18448b;
                if (copyOnWriteArrayList != null && copyOnWriteArrayList.size() > 0) {
                    Iterator it = this.f18448b.iterator();
                    while (it.hasNext()) {
                        ((e) it.next()).getClass();
                    }
                } else if (kd.c.f18444g) {
                    ge.b.n("no callback registered");
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:481:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:482:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:666:0x06a6  */
    /* JADX WARN: Removed duplicated region for block: B:678:0x06f3  */
    /* JADX WARN: Removed duplicated region for block: B:686:0x070d  */
    @Override // kd.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void d(ed.g r34) {
        /*
            Method dump skipped, instructions count: 2492
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: gd.l.d(ed.g):void");
    }

    public final void j(byte b10, byte b11) {
        ge.b.o(String.format("dispatchAudioEqStateChanged: 0x%02X, state=0x%02X", Byte.valueOf(b10), Byte.valueOf(b11)), kd.c.f18443f);
        CopyOnWriteArrayList copyOnWriteArrayList = this.f18448b;
        if (copyOnWriteArrayList == null || copyOnWriteArrayList.size() <= 0) {
            if (kd.c.f18444g) {
                ge.b.n("no callback registered");
                return;
            }
            return;
        }
        Iterator it = this.f18448b.iterator();
        while (it.hasNext()) {
            ((e) it.next()).getClass();
        }
    }

    public final void k(byte b10, int i10) {
        if (kd.c.f18444g) {
            ge.b.n(String.format(Locale.US, "dispatchSetAudioEqIndexResponse: 0x%02X, eqType=%02X", Byte.valueOf(b10), Integer.valueOf(i10)));
        }
        CopyOnWriteArrayList copyOnWriteArrayList = this.f18448b;
        if (copyOnWriteArrayList == null || copyOnWriteArrayList.size() <= 0) {
            if (kd.c.f18444g) {
                ge.b.n("no callback registered");
                return;
            }
            return;
        }
        Iterator it = this.f18448b.iterator();
        while (it.hasNext()) {
            ((e) it.next()).getClass();
        }
    }

    public final void l(byte b10, b bVar) {
        if (kd.c.f18444g) {
            ge.b.n(String.format(Locale.US, "dispatchAudioEqEntryIndexChanged: 0x%02X, %s", Byte.valueOf(b10), bVar.toString()));
        }
        CopyOnWriteArrayList copyOnWriteArrayList = this.f18448b;
        if (copyOnWriteArrayList == null || copyOnWriteArrayList.size() <= 0) {
            if (kd.c.f18444g) {
                ge.b.n("no callback registered");
                return;
            }
            return;
        }
        Iterator it = this.f18448b.iterator();
        while (it.hasNext()) {
            ((e) it.next()).getClass();
        }
    }

    public final void m(byte b10, c cVar) {
        if (kd.c.f18444g) {
            Object[] objArr = new Object[2];
            objArr[0] = Byte.valueOf(b10);
            objArr[1] = cVar != null ? cVar.toString() : "";
            ge.b.n(String.format("dispatchAudioEqIndexParamsReport: 0x%02X, %s", objArr));
        }
        CopyOnWriteArrayList copyOnWriteArrayList = this.f18448b;
        if (copyOnWriteArrayList == null || copyOnWriteArrayList.size() <= 0) {
            if (kd.c.f18444g) {
                ge.b.n("no callback registered");
                return;
            }
            return;
        }
        Iterator it = this.f18448b.iterator();
        while (it.hasNext()) {
            ((e) it.next()).getClass();
        }
    }

    public final boolean n(ed.a aVar) {
        short s10 = aVar.f13543a;
        byte b10 = aVar.f13544b;
        if (s10 != 532) {
            switch (s10) {
                case 516:
                    if (kd.c.f18444g) {
                        ge.b.n(String.format("onSetAudioEqIndexParamsResponse: 0x%02X", Byte.valueOf(b10)));
                    }
                    i(f15306s);
                    return true;
                case 517:
                    if (b10 != 0) {
                        if (kd.c.f18444g) {
                            ge.b.n(String.format("onGetAudioEqResponse: 0x%02X", Byte.valueOf(b10)));
                        }
                        q();
                    }
                    return true;
                case 518:
                    if (kd.c.f18444g) {
                        ge.b.n(String.format("onClearAudioEqResponse: 0x%02X", Byte.valueOf(b10)));
                    }
                    CopyOnWriteArrayList copyOnWriteArrayList = this.f18448b;
                    if (copyOnWriteArrayList != null && copyOnWriteArrayList.size() > 0) {
                        Iterator it = this.f18448b.iterator();
                        while (it.hasNext()) {
                            ((e) it.next()).getClass();
                        }
                    } else if (kd.c.f18444g) {
                        ge.b.n("no callback registered");
                    }
                    return true;
                case 519:
                    if (b10 != 0) {
                        CopyOnWriteArrayList copyOnWriteArrayList2 = this.f18448b;
                        if (copyOnWriteArrayList2 != null && copyOnWriteArrayList2.size() > 0) {
                            if (kd.c.f18444g) {
                                ge.b.n("not support eq index for old framework, just use realtime eq as default");
                            }
                            Iterator it2 = this.f18448b.iterator();
                            while (it2.hasNext()) {
                                ((e) it2.next()).getClass();
                            }
                        } else {
                            ge.b.o("no callback registered", kd.c.f18444g);
                        }
                    }
                    return true;
                case 520:
                    k(b10, 0);
                    return true;
                default:
                    return false;
            }
        }
        if (kd.c.f18444g) {
            ge.b.n(String.format(Locale.US, "dispatchResetAudioEqIndexResponse: 0x%02X", Byte.valueOf(b10)));
        }
        CopyOnWriteArrayList copyOnWriteArrayList3 = this.f18448b;
        if (copyOnWriteArrayList3 != null && copyOnWriteArrayList3.size() > 0) {
            Iterator it3 = this.f18448b.iterator();
            while (it3.hasNext()) {
                ((e) it3.next()).getClass();
            }
        } else if (kd.c.f18444g) {
            ge.b.n("no callback registered");
        }
        return true;
    }

    public final boolean o(ed.g gVar) {
        boolean z10;
        byte[] bArr;
        boolean z11;
        short s10 = gVar.f13581d;
        byte[] bArr2 = gVar.f13582e;
        byte[] bArr3 = gVar.f13580c;
        boolean z12 = false;
        dd.b bVar = null;
        switch (s10) {
            case 513:
                if (bArr2 != null && bArr2.length > 0) {
                    if (kd.c.f18444g) {
                        ge.b.n(">> EVENT_DSP_STATUS");
                    }
                    CopyOnWriteArrayList copyOnWriteArrayList = this.f18448b;
                    if (copyOnWriteArrayList != null && copyOnWriteArrayList.size() > 0) {
                        Iterator it = this.f18448b.iterator();
                        while (it.hasNext()) {
                            byte b10 = bArr2[0];
                            ((e) it.next()).getClass();
                        }
                    } else if (kd.c.f18444g) {
                        ge.b.n("no callback registered");
                    }
                }
                return true;
            case 514:
            default:
                return false;
            case 515:
                if (bArr2 != null && bArr2.length > 18) {
                    if (kd.c.f18444g) {
                        ge.b.d(">> EVENT_DSP_REPORT_PARAM");
                    }
                    if (bArr2.length > 18) {
                        byte b11 = bArr2[0];
                        byte b12 = bArr2[1];
                        byte b13 = bArr2[5];
                        byte b14 = bArr2[4];
                        byte b15 = bArr2[3];
                        byte b16 = bArr2[2];
                        byte b17 = bArr2[9];
                        byte b18 = bArr2[8];
                        byte b19 = bArr2[7];
                        byte b20 = bArr2[6];
                        byte b21 = bArr2[13];
                        byte b22 = bArr2[12];
                        byte b23 = bArr2[11];
                        byte b24 = bArr2[10];
                        byte b25 = bArr2[17];
                        byte b26 = bArr2[16];
                        byte b27 = bArr2[15];
                        byte b28 = bArr2[14];
                    }
                    CopyOnWriteArrayList copyOnWriteArrayList2 = this.f18448b;
                    if (copyOnWriteArrayList2 != null && copyOnWriteArrayList2.size() > 0) {
                        Iterator it2 = this.f18448b.iterator();
                        while (it2.hasNext()) {
                            ((e) it2.next()).getClass();
                        }
                    } else if (kd.c.f18444g) {
                        ge.b.n("no callback registered");
                    }
                }
                return true;
            case 516:
                if (kd.c.f18444g) {
                    ge.b.n(">> EVENT_DSP_REPORT_AUDIO_EQ");
                }
                dd.a aVar = new dd.a();
                if (bArr2 != null && bArr2.length >= 3) {
                    byte b29 = bArr2[0];
                    byte b30 = bArr2[1];
                    aVar.f13009a = bArr2[2];
                    int length = bArr2.length - 3;
                    aVar.f13011c = length;
                    if (length > 0) {
                        byte[] bArr4 = new byte[length];
                        aVar.f13010b = bArr4;
                        System.arraycopy(bArr2, 3, bArr4, 0, length);
                    }
                    z10 = true;
                } else {
                    StringBuilder a10 = android.support.v4.media.d.a("invalid AudioEq:");
                    a10.append(he.a.a(bArr2));
                    ge.b.p(a10.toString());
                    z10 = false;
                }
                if (!z10) {
                    aVar = null;
                }
                if (aVar != null) {
                    byte b31 = aVar.f13009a;
                    if (b31 != -1) {
                        if (b31 != 1) {
                            if (b31 != 2) {
                                if (b31 == 3) {
                                    byte[] bArr5 = this.f15310m;
                                    if (bArr5 != null) {
                                        int length2 = bArr5.length;
                                        byte[] bArr6 = new byte[aVar.f13011c + length2];
                                        System.arraycopy(bArr5, 0, bArr6, 0, length2);
                                        System.arraycopy(aVar.f13010b, 0, bArr6, length2, aVar.f13011c);
                                    }
                                    q();
                                }
                            } else {
                                byte[] bArr7 = this.f15310m;
                                if (bArr7 == null) {
                                    bArr = aVar.f13010b;
                                } else {
                                    int length3 = bArr7.length;
                                    byte[] bArr8 = new byte[aVar.f13011c + length3];
                                    System.arraycopy(bArr7, 0, bArr8, 0, length3);
                                    System.arraycopy(aVar.f13010b, 0, bArr8, length3, aVar.f13011c);
                                    bArr = bArr8;
                                }
                                this.f15310m = bArr;
                            }
                        } else {
                            this.f15310m = aVar.f13010b;
                        }
                    } else {
                        this.f15310m = null;
                        q();
                    }
                    return true;
                }
                this.f15310m = null;
                return true;
            case 517:
                dd.b bVar2 = new dd.b();
                if (bArr3 != null && bArr3.length >= 2) {
                    byte b32 = bArr3[1];
                    byte b33 = bArr3[0];
                    int length4 = bArr3.length - 2;
                    bVar2.f13012a = length4;
                    if (length4 > 0) {
                        byte[] bArr9 = new byte[length4];
                        bVar2.f13013b = bArr9;
                        System.arraycopy(bArr3, 2, bArr9, 0, length4);
                    } else {
                        bVar2.f13013b = null;
                    }
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (z11) {
                    int i10 = bVar2.f13012a;
                    if (i10 > 1) {
                        byte[] bArr10 = bVar2.f13013b;
                        bVar2.f13014c = (short) ((bArr10[0] & 255) | ((bArr10[1] << 8) & 65280));
                    }
                    if (i10 > 1) {
                        byte[] bArr11 = bVar2.f13013b;
                        bVar2.f13015d = (short) (((bArr11[3] << 8) & 65280) | (bArr11[2] & 255));
                    }
                    z12 = true;
                }
                if (z12) {
                    bVar = bVar2;
                }
                if (bVar != null) {
                    ge.b.o(bVar.toString(), kd.c.f18443f);
                    CopyOnWriteArrayList copyOnWriteArrayList3 = this.f18448b;
                    if (copyOnWriteArrayList3 != null && copyOnWriteArrayList3.size() > 0) {
                        Iterator it3 = this.f18448b.iterator();
                        while (it3.hasNext()) {
                            ((e) it3.next()).getClass();
                        }
                    } else if (kd.c.f18444g) {
                        ge.b.n("no callback registered");
                    }
                }
                return true;
        }
    }

    public final void p() {
        CopyOnWriteArrayList copyOnWriteArrayList = this.f18448b;
        if (copyOnWriteArrayList == null || copyOnWriteArrayList.size() <= 0) {
            if (kd.c.f18444g) {
                ge.b.n("no callback registered");
                return;
            }
            return;
        }
        Iterator it = this.f18448b.iterator();
        while (it.hasNext()) {
            ((e) it.next()).getClass();
        }
    }

    public final void q() {
        CopyOnWriteArrayList copyOnWriteArrayList = this.f18448b;
        if (copyOnWriteArrayList == null || copyOnWriteArrayList.size() <= 0) {
            if (kd.c.f18444g) {
                ge.b.n("no callback registered");
                return;
            }
            return;
        }
        Iterator it = this.f18448b.iterator();
        while (it.hasNext()) {
            ((e) it.next()).getClass();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0065 A[Catch: Exception -> 0x0073, TryCatch #0 {Exception -> 0x0073, blocks: (B:49:0x0061, B:51:0x0065, B:52:0x006c, B:53:0x0072), top: B:58:0x0061 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void r(byte r10, byte[] r11) {
        /*
            r9 = this;
            int r0 = r11.length
            com.realsil.sdk.bbpro.internal.BaseBeeProManager r1 = r9.f18447a
            if (r1 != 0) goto L9
            java.lang.String r10 = "please call setup(BaseBeeProManager) method first"
            goto L78
        L9:
            r1 = 1
            r2 = 2
            r3 = 0
            int r4 = r11.length
            if (r4 >= r0) goto L26
            java.util.Locale r0 = java.util.Locale.US
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.Byte r10 = java.lang.Byte.valueOf(r10)
            r2[r3] = r10
            java.lang.String r10 = he.a.a(r11)
            r2[r1] = r10
            java.lang.String r10 = "invalid eqSampleRate=0x%02x, eqData=%s"
            java.lang.String r10 = java.lang.String.format(r0, r10, r2)
            goto L78
        L26:
            r4 = 6
            r5 = 3
            r6 = 4
            if (r10 != r5) goto L2c
            goto L38
        L2c:
            if (r10 != r6) goto L32
            r10 = 48000(0xbb80, float:6.7262E-41)
            goto L3b
        L32:
            if (r10 != r4) goto L38
            r10 = 96000(0x17700, float:1.34525E-40)
            goto L3b
        L38:
            r10 = 44100(0xac44, float:6.1797E-41)
        L3b:
            int r7 = r0 + 8
            byte[] r7 = new byte[r7]
            r7[r3] = r3
            r7[r1] = r3
            int r1 = r0 + 4
            r8 = r1 & 255(0xff, float:3.57E-43)
            byte r8 = (byte) r8
            r7[r2] = r8
            r2 = 8
            int r1 = r1 >> r2
            r1 = r1 & 255(0xff, float:3.57E-43)
            byte r1 = (byte) r1
            r7[r5] = r1
            r7[r6] = r3
            r1 = 5
            r7[r1] = r3
            r7[r4] = r3
            r1 = 7
            r7[r1] = r3
            if (r0 <= 0) goto L61
            java.lang.System.arraycopy(r11, r3, r7, r2, r0)
        L61:
            com.realsil.sdk.bbpro.DspConfig r11 = r9.f15307j     // Catch: java.lang.Exception -> L73
            if (r11 != 0) goto L6c
            com.realsil.sdk.bbpro.DspConfig r11 = new com.realsil.sdk.bbpro.DspConfig     // Catch: java.lang.Exception -> L73
            r11.<init>()     // Catch: java.lang.Exception -> L73
            r9.f15307j = r11     // Catch: java.lang.Exception -> L73
        L6c:
            com.realsil.sdk.bbpro.DspConfig r11 = r9.f15307j     // Catch: java.lang.Exception -> L73
            r11.parseEq(r7, r10)     // Catch: java.lang.Exception -> L73
            r10 = 0
            throw r10     // Catch: java.lang.Exception -> L73
        L73:
            r10 = move-exception
            java.lang.String r10 = r10.toString()
        L78:
            ge.b.p(r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: gd.l.r(byte, byte[]):void");
    }

    public final d s() {
        if (this.f15308k == null) {
            this.f15308k = new d();
        }
        return this.f15308k;
    }

    public final int t() {
        nd.b k10;
        BaseBeeProManager baseBeeProManager = this.f18447a;
        if (baseBeeProManager == null) {
            k10 = null;
        } else {
            k10 = baseBeeProManager.k();
        }
        if (k10 == null) {
            return 0;
        }
        return k10.f22234d;
    }

    public final void u() {
        this.f15313p |= this.f15311n;
        f(new i((byte) 0));
    }
}
