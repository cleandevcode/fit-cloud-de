package ze;

import cn.sharesdk.framework.Platform;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import no.nordicsemi.android.dfu.DfuBaseService;

/* loaded from: classes.dex */
public class d {
    public byte[] C;
    public byte[] F;
    public int G;
    public int H;
    public int I;
    public int J;
    public int K;
    public int L;
    public int M;
    public boolean P;
    public byte[] R;
    public ArrayList S;
    public byte[] T;
    public ArrayList U;
    public byte[] V;
    public ArrayList W;
    public int X;
    public int Y;
    public int Z;

    /* renamed from: b */
    public int f32252b;

    /* renamed from: c */
    public boolean f32253c;

    /* renamed from: d */
    public int f32254d;

    /* renamed from: e */
    public int f32255e;

    /* renamed from: f */
    public int f32256f;

    /* renamed from: g */
    public int f32257g;

    /* renamed from: h */
    public boolean f32258h;

    /* renamed from: i */
    public int f32259i;

    /* renamed from: j */
    public int f32260j;

    /* renamed from: m */
    public int f32263m;

    /* renamed from: q */
    public boolean f32267q;

    /* renamed from: r */
    public boolean f32268r;

    /* renamed from: t */
    public boolean f32270t;

    /* renamed from: w */
    public boolean f32273w;

    /* renamed from: a */
    public boolean f32250a = true;

    /* renamed from: k */
    public int f32261k = 3;

    /* renamed from: l */
    public int f32262l = 0;

    /* renamed from: n */
    public int f32264n = 0;

    /* renamed from: o */
    public int f32265o = 0;

    /* renamed from: p */
    public int f32266p = 2;

    /* renamed from: s */
    public int f32269s = 1;

    /* renamed from: u */
    public int f32271u = 0;

    /* renamed from: v */
    public boolean f32272v = true;

    /* renamed from: x */
    public int f32274x = 0;

    /* renamed from: y */
    public int f32275y = 0;

    /* renamed from: z */
    public int f32276z = 0;
    public boolean A = false;
    public boolean B = false;
    public int D = DfuBaseService.ERROR_REMOTE_TYPE_LEGACY;
    public int E = 0;
    public int N = 0;
    public int O = 1;
    public int Q = 0;

    /* renamed from: a0 */
    public boolean f32251a0 = false;

    public final void A(int i10) {
        this.f32266p = i10;
        this.f32267q = (i10 & 1) != 0;
        this.f32268r = ((i10 & 2) >> 1) != 0;
        this.f32269s = (i10 & 4) >> 2;
        this.f32270t = ((i10 & 8) >> 3) != 0;
        this.f32271u = (i10 & 16) >> 4;
        this.f32273w = ((i10 & 32) >> 5) != 0;
        h();
    }

    public final void B(int i10) {
        this.f32266p = i10;
        boolean z10 = false;
        this.f32267q = (i10 & 1) != 0;
        this.f32268r = ((i10 & 2) >> 1) != 0;
        this.f32269s = (i10 & 4) >> 2;
        this.f32270t = ((i10 & 8) >> 3) != 0;
        this.f32271u = (i10 & 16) >> 4;
        int i11 = this.f32262l;
        if (i11 >= 4) {
            if (((i10 & 32) >> 5) != 0) {
                z10 = true;
            }
        } else if (i11 == 3) {
            this.f32251a0 = true;
            h();
        }
        this.f32251a0 = z10;
        h();
    }

    public final void C(byte[] bArr) {
        if (bArr == null || bArr.length < 7) {
            this.f32253c = false;
            this.f32254d = 0;
            this.f32255e = 0;
            this.f32256f = 0;
            this.f32257g = 0;
            return;
        }
        ByteBuffer wrap = ByteBuffer.wrap(bArr);
        wrap.order(ByteOrder.LITTLE_ENDIAN);
        this.f32253c = true;
        this.f32254d = wrap.get() & 255;
        this.f32255e = wrap.getShort();
        this.f32256f = wrap.getShort();
        this.f32257g = wrap.getShort();
        this.f32256f &= Platform.CUSTOMER_ACTION_MASK;
    }

    public final void a() {
        if (!this.P) {
            if (this.f32271u != 1) {
                this.O = 1;
                return;
            } else if (this.E != 0) {
                this.O = 3;
                return;
            }
        }
        this.O = 2;
    }

    public final void b(int i10, byte[] bArr) {
        int length = bArr.length - i10;
        byte[] bArr2 = this.R;
        if (bArr2 == null || bArr2.length <= 0) {
            byte[] bArr3 = new byte[length];
            this.R = bArr3;
            System.arraycopy(bArr, i10, bArr3, 0, length);
        } else {
            byte[] bArr4 = new byte[bArr2.length + length];
            System.arraycopy(bArr2, 0, bArr4, 0, bArr2.length);
            System.arraycopy(bArr, i10, bArr4, this.R.length, length);
            this.R = bArr4;
        }
        i();
    }

    public final void c(int i10, byte[] bArr) {
        if (this.W == null) {
            this.W = new ArrayList();
        }
        this.W.add(new b(i10, bArr));
    }

    public final void d(byte[] bArr) {
        byte[] bArr2 = this.V;
        if (bArr2 == null || bArr2.length <= 0) {
            this.V = bArr;
        } else {
            byte[] bArr3 = new byte[bArr2.length + bArr.length];
            System.arraycopy(bArr2, 0, bArr3, 0, bArr2.length);
            System.arraycopy(bArr, 0, bArr3, this.V.length, bArr.length);
            this.V = bArr3;
        }
        i();
    }

    /* JADX WARN: Code restructure failed: missing block: B:63:0x001e, code lost:
        if (r5[0] == 0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0033, code lost:
        if (r5[0] == 0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0043, code lost:
        if (r5[0] == 0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0045, code lost:
        b(1, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0049, code lost:
        f(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x004c, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:?, code lost:
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void e(byte[] r5) {
        /*
            r4 = this;
            int r0 = r4.f32252b
            r1 = 0
            r2 = 1
            r3 = 20
            if (r0 == r3) goto L3b
            r3 = 21
            if (r0 != r3) goto Ld
            goto L3b
        Ld:
            r3 = 16
            if (r0 != r3) goto L22
            int r0 = r4.f32262l
            r3 = 4
            if (r0 < r3) goto L37
            if (r5 == 0) goto L21
            int r0 = r5.length
            if (r0 >= r2) goto L1c
            goto L21
        L1c:
            r0 = r5[r1]
            if (r0 != 0) goto L49
            goto L45
        L21:
            return
        L22:
            r3 = 17
            if (r0 != r3) goto L37
            int r0 = r4.f32262l
            r3 = 6
            if (r0 < r3) goto L37
            if (r5 == 0) goto L36
            int r0 = r5.length
            if (r0 >= r2) goto L31
            goto L36
        L31:
            r0 = r5[r1]
            if (r0 != 0) goto L49
            goto L45
        L36:
            return
        L37:
            r4.b(r1, r5)
            goto L4c
        L3b:
            if (r5 == 0) goto L4c
            int r0 = r5.length
            if (r0 >= r2) goto L41
            goto L4c
        L41:
            r0 = r5[r1]
            if (r0 != 0) goto L49
        L45:
            r4.b(r2, r5)
            goto L4c
        L49:
            r4.f(r5)
        L4c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ze.d.e(byte[]):void");
    }

    public final void f(byte[] bArr) {
        int length = bArr.length - 1;
        byte[] bArr2 = this.T;
        if (bArr2 == null || bArr2.length <= 0) {
            byte[] bArr3 = new byte[length];
            this.T = bArr3;
            System.arraycopy(bArr, 1, bArr3, 0, length);
        } else {
            byte[] bArr4 = new byte[bArr2.length + bArr.length];
            System.arraycopy(bArr2, 0, bArr4, 0, bArr2.length);
            System.arraycopy(bArr, 1, bArr4, this.T.length, bArr.length - 1);
            this.T = bArr4;
        }
        k();
    }

    public final void g() {
        this.Q = 0;
        for (int i10 = 0; i10 < 16; i10++) {
            int i11 = (this.N >> (i10 * 2)) & 3;
            if (i11 == 1) {
                if (this.Q == 0) {
                    this.Q = 2;
                }
            } else if (i11 == 2) {
                this.Q = 1;
            }
        }
        this.P = this.Q != 0;
        if (this.f32250a) {
            ge.b.n(String.format("imageVersionIndicator = 0x%08x, bankEnabled=%b, updateBankIndicator=0x%02X", Integer.valueOf(this.N), Boolean.valueOf(this.P), Integer.valueOf(this.Q)));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0008, code lost:
        if (r4.f32271u == 1) goto L5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x000a, code lost:
        r4.O = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0019, code lost:
        if (r4.E != 0) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x001b, code lost:
        r4.O = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0027, code lost:
        if (r4.E != 0) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x002a, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:?, code lost:
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void h() {
        /*
            r4 = this;
            int r0 = r4.f32262l
            r1 = 2
            r2 = 1
            if (r0 != 0) goto L10
            int r0 = r4.f32271u
            if (r0 != r2) goto Ld
        La:
            r4.O = r1
            goto L2a
        Ld:
            r4.O = r2
            goto L2a
        L10:
            r3 = 3
            if (r0 != r2) goto L1e
            int r0 = r4.f32271u
            if (r0 != r2) goto Ld
            int r0 = r4.E
            if (r0 == 0) goto La
        L1b:
            r4.O = r3
            goto L2a
        L1e:
            if (r0 != r1) goto L21
            goto Ld
        L21:
            int r0 = r4.f32271u
            if (r0 != r2) goto Ld
            int r0 = r4.E
            if (r0 == 0) goto La
            goto L1b
        L2a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ze.d.h():void");
    }

    public final void i() {
        int i10;
        int i11;
        i iVar;
        int i12;
        int i13;
        int i14;
        byte b10;
        int i15 = this.f32252b;
        if (i15 != 20 && i15 != 21) {
            int i16 = 17;
            if (i15 != 17 || this.f32262l < 6) {
                int i17 = 3;
                if (i15 != 16 || this.f32262l < 3) {
                    if (this.f32250a) {
                        ge.b.n(String.format("wrapperImageVersionWithBitNumber:indicator = 0x%08x, \nvalues = %s", Integer.valueOf(this.N), he.a.a(this.R)));
                    }
                    ArrayList arrayList = new ArrayList();
                    int i18 = 0;
                    int i19 = 0;
                    int i20 = 0;
                    while (i18 < 16) {
                        int i21 = (this.N >> (i18 * 2)) & i17;
                        if (i21 == 0) {
                            iVar = new i(i18, i21, -1, 0);
                            if (this.f32250a) {
                                ge.b.n(iVar.toString());
                            }
                        } else {
                            byte[] bArr = this.R;
                            if (bArr != null && (i13 = i19 + 3) < bArr.length) {
                                if (this.f32252b == i16) {
                                    if (this.f32262l >= 5) {
                                        if (i18 == 2) {
                                            i14 = ((bArr[i19] << 24) & (-16777216)) | ((bArr[i19 + 1] << 16) & 16711680) | ((bArr[i19 + 2] << 8) & 65280);
                                            b10 = bArr[i13];
                                        } else {
                                            i14 = ((bArr[i13] << 24) & (-16777216)) | ((bArr[i19 + 2] << 16) & 16711680) | ((bArr[i19 + 1] << 8) & 65280);
                                            b10 = bArr[i19];
                                        }
                                    } else {
                                        i14 = ((bArr[i13] << 24) & (-16777216)) | ((bArr[i19 + 2] << 16) & 16711680) | ((bArr[i19 + 1] << 8) & 65280);
                                        b10 = bArr[i19];
                                    }
                                } else {
                                    i14 = ((bArr[i13] << 24) & (-16777216)) | ((bArr[i19 + 2] << 16) & 16711680) | ((bArr[i19 + 1] << 8) & 65280);
                                    b10 = bArr[i19];
                                }
                                i10 = i14 | (b10 & 255);
                                i19 += 4;
                            } else {
                                if (this.f32250a) {
                                    ge.b.n("imageVersion loss, offset=" + i19);
                                }
                                i10 = 0;
                            }
                            byte[] bArr2 = this.V;
                            if (bArr2 != null && (i12 = i20 + 3) < bArr2.length) {
                                i11 = (bArr2[i20] & 255) | ((bArr2[i12] << 24) & (-16777216)) | (16711680 & (bArr2[i20 + 2] << 16)) | (65280 & (bArr2[i20 + 1] << 8));
                                i20 += 4;
                            } else {
                                i11 = 0;
                            }
                            iVar = new i(i18, i21, i10, i11);
                            if (this.f32250a) {
                                ge.b.n(iVar.toString());
                            }
                        }
                        arrayList.add(iVar);
                        i18++;
                        i16 = 17;
                        i17 = 3;
                    }
                    this.S = arrayList;
                    a();
                    return;
                }
            }
        }
        j();
    }

    public final void j() {
        int i10;
        int i11;
        if (this.f32250a) {
            ge.b.n(String.format("wrapperImageVersionWithImageId, indicator = 0x%08x, \nvalues = %s", Integer.valueOf(this.N), he.a.a(this.R)));
        }
        byte[] bArr = this.R;
        if (bArr == null || bArr.length <= 0) {
            if (this.f32250a) {
                ge.b.n("imageVersionValues is empty");
            }
            this.S = new ArrayList();
            return;
        }
        int i12 = bArr[0] & 255;
        if (this.f32250a) {
            ge.b.n("imageNum=" + i12);
        }
        ArrayList arrayList = new ArrayList();
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        int i13 = 1;
        for (int i14 = 0; i14 < i12; i14++) {
            byte[] bArr2 = this.R;
            if (bArr2 != null && (i11 = i13 + 5) < bArr2.length) {
                int i15 = (bArr2[i13] & 255) | ((bArr2[i13 + 1] << 8) & 65280);
                hashMap.put(Integer.valueOf(i15), Integer.valueOf(i15 == 10128 ? (bArr2[i11] & 255) | ((bArr2[i13 + 2] << 24) & (-16777216)) | ((bArr2[i13 + 3] << 16) & 16711680) | ((bArr2[i13 + 4] << 8) & 65280) : (bArr2[i13 + 2] & 255) | ((bArr2[i11] << 24) & (-16777216)) | ((bArr2[i13 + 4] << 16) & 16711680) | ((bArr2[i13 + 3] << 8) & 65280)));
            } else if (this.f32250a) {
                ge.b.n("ignore invalid imageVersionValues");
            }
            byte[] bArr3 = this.V;
            if (bArr3 != null && (i10 = i13 + 5) < bArr3.length) {
                hashMap2.put(Integer.valueOf(((bArr3[i13 + 1] << 8) & 65280) | (bArr3[i13] & 255)), Integer.valueOf((bArr3[i13 + 2] & 255) | ((bArr3[i10] << 24) & (-16777216)) | (16711680 & (bArr3[i13 + 4] << 16)) | ((bArr3[i13 + 3] << 8) & 65280)));
            }
            i13 += 6;
        }
        for (Integer num : hashMap.keySet()) {
            int intValue = num.intValue();
            int i16 = this.Q;
            arrayList.add(new i(i16 == 1 ? 2 : i16 == 2 ? 1 : 3, (!hashMap.containsKey(Integer.valueOf(intValue)) || hashMap.get(Integer.valueOf(intValue)) == null) ? 0 : ((Integer) hashMap.get(Integer.valueOf(intValue))).intValue(), (!hashMap2.containsKey(Integer.valueOf(intValue)) || hashMap2.get(Integer.valueOf(intValue)) == null) ? 0 : ((Integer) hashMap2.get(Integer.valueOf(intValue))).intValue(), intValue, 0));
        }
        this.S = arrayList;
        a();
    }

    public final void k() {
        int i10;
        int i11;
        i iVar;
        int i12;
        int i13;
        int i14;
        byte b10;
        int i15 = this.f32252b;
        if (i15 != 20 && i15 != 21) {
            int i16 = 17;
            if (i15 != 17 || this.f32262l < 6) {
                int i17 = 3;
                if (i15 != 16 || this.f32262l < 3) {
                    if (this.f32250a) {
                        ge.b.n(String.format("imageVersionIndicator = 0x%08x, \ninactiveImageVersionValues = %s", Integer.valueOf(this.N), he.a.a(this.T)));
                    }
                    ArrayList arrayList = new ArrayList();
                    int i18 = 0;
                    int i19 = 0;
                    int i20 = 0;
                    while (i18 < 16) {
                        int i21 = (this.N >> (i18 * 2)) & i17;
                        if (i21 == 0) {
                            iVar = new i(i18, i21, -1, 0);
                        } else {
                            byte[] bArr = this.T;
                            if (bArr != null && (i13 = i19 + 3) < bArr.length) {
                                if (this.f32252b == i16) {
                                    if (this.f32262l >= 5) {
                                        if (i18 == 2) {
                                            i14 = ((bArr[i19] << 24) & (-16777216)) | ((bArr[i19 + 1] << 16) & 16711680) | ((bArr[i19 + 2] << 8) & 65280);
                                            b10 = bArr[i13];
                                        } else {
                                            i14 = ((bArr[i13] << 24) & (-16777216)) | ((bArr[i19 + 2] << 16) & 16711680) | ((bArr[i19 + 1] << 8) & 65280);
                                            b10 = bArr[i19];
                                        }
                                    } else {
                                        i14 = ((bArr[i13] << 24) & (-16777216)) | ((bArr[i19 + 2] << 16) & 16711680) | ((bArr[i19 + 1] << 8) & 65280);
                                        b10 = bArr[i19];
                                    }
                                } else {
                                    i14 = ((bArr[i13] << 24) & (-16777216)) | ((bArr[i19 + 2] << 16) & 16711680) | ((bArr[i19 + 1] << 8) & 65280);
                                    b10 = bArr[i19];
                                }
                                i10 = i14 | (b10 & 255);
                                i19 += 4;
                            } else {
                                boolean z10 = this.f32250a;
                                ge.b.o("imageVersion loss, offset=" + i19, z10);
                                i10 = 0;
                            }
                            byte[] bArr2 = this.V;
                            if (bArr2 != null && (i12 = i20 + 3) < bArr2.length) {
                                i11 = (bArr2[i20] & 255) | ((bArr2[i12] << 24) & (-16777216)) | (16711680 & (bArr2[i20 + 2] << 16)) | (65280 & (bArr2[i20 + 1] << 8));
                                i20 += 4;
                            } else {
                                ge.b.o("section size loss, offset=" + i20, false);
                                i11 = 0;
                            }
                            iVar = new i(i18, i21, i10, i11);
                        }
                        arrayList.add(iVar);
                        i18++;
                        i16 = 17;
                        i17 = 3;
                    }
                    this.U = arrayList;
                    return;
                }
            }
        }
        r();
    }

    public final int l() {
        int i10 = this.Q;
        if (i10 == 1) {
            return 1;
        }
        return i10 == 2 ? 0 : 15;
    }

    public final i m(int i10) {
        ArrayList arrayList = this.S;
        if (arrayList == null || arrayList.size() <= 0) {
            return null;
        }
        Iterator it = this.S.iterator();
        while (it.hasNext()) {
            i iVar = (i) it.next();
            if (iVar.f32335a == i10) {
                return iVar;
            }
        }
        return null;
    }

    public final i n(int i10) {
        ArrayList arrayList = this.S;
        if (arrayList == null || arrayList.size() <= 0) {
            return null;
        }
        Iterator it = this.S.iterator();
        while (it.hasNext()) {
            i iVar = (i) it.next();
            if (iVar.f32336b == i10) {
                return iVar;
            }
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:116:0x007d, code lost:
        if (r0 != 10) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0029, code lost:
        if (r0 != 10) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int o() {
        /*
            r11 = this;
            int r0 = r11.f32252b
            r1 = 10
            r2 = 8
            r3 = 7
            r4 = 4
            r5 = 12
            r6 = 9
            r7 = 3
            r8 = 6
            r9 = 5
            r10 = 16
            if (r0 != r10) goto L2c
            int r0 = r11.f32261k
            if (r0 > r7) goto L19
            goto L84
        L19:
            if (r0 == r9) goto L7f
            if (r0 == r6) goto L7f
            if (r0 != r5) goto L21
            goto L7f
        L21:
            if (r0 == r4) goto L7f
            if (r0 == r8) goto L7f
            if (r0 == r3) goto L7f
            if (r0 == r2) goto L7f
            if (r0 != r1) goto L84
            goto L7f
        L2c:
            r10 = 17
            if (r0 != r10) goto L51
            int r0 = r11.f32261k
            if (r0 > r7) goto L35
            goto L84
        L35:
            if (r0 == r9) goto L7f
            if (r0 == r6) goto L7f
            if (r0 != r5) goto L3c
            goto L7f
        L3c:
            if (r0 == r4) goto L46
            if (r0 == r8) goto L46
            if (r0 == r3) goto L46
            if (r0 == r2) goto L46
            if (r0 != r1) goto L84
        L46:
            int r0 = r11.f32262l
            if (r0 < r8) goto L7f
            r0 = 10131(0x2793, float:1.4197E-41)
            ze.i r0 = r11.n(r0)
            goto L85
        L51:
            int r0 = r11.f32262l
            if (r0 != 0) goto L58
            int r0 = r11.H
            return r0
        L58:
            r10 = 1
            if (r0 < r10) goto L84
            int r0 = r11.f32261k
            if (r0 > r7) goto L6e
            int r0 = r11.Q
            r1 = 2
            if (r0 != r1) goto L69
            ze.i r0 = r11.m(r1)
            goto L85
        L69:
            ze.i r0 = r11.m(r10)
            goto L85
        L6e:
            if (r0 == r9) goto L7f
            if (r0 == r6) goto L7f
            if (r0 != r5) goto L75
            goto L7f
        L75:
            if (r0 == r4) goto L7f
            if (r0 == r8) goto L7f
            if (r0 == r3) goto L7f
            if (r0 == r2) goto L7f
            if (r0 != r1) goto L84
        L7f:
            ze.i r0 = r11.m(r9)
            goto L85
        L84:
            r0 = 0
        L85:
            if (r0 == 0) goto L8a
            int r0 = r0.f32338d
            return r0
        L8a:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ze.d.o():int");
    }

    public final i p(int i10) {
        ArrayList arrayList = this.U;
        if (arrayList == null || arrayList.size() <= 0) {
            return null;
        }
        Iterator it = this.U.iterator();
        while (it.hasNext()) {
            i iVar = (i) it.next();
            if (iVar.f32336b == i10) {
                return iVar;
            }
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:110:0x007d, code lost:
        if (r0 != 10) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0029, code lost:
        if (r0 != 10) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int q() {
        /*
            r13 = this;
            int r0 = r13.f32252b
            r1 = 0
            r2 = 16
            r3 = 10
            r4 = 8
            r5 = 7
            r6 = 12
            r7 = 9
            r8 = 5
            r9 = 6
            r10 = 4
            r11 = 3
            if (r0 != r2) goto L2c
            int r0 = r13.f32261k
            if (r0 > r11) goto L19
            goto L69
        L19:
            if (r0 == r8) goto L7f
            if (r0 == r7) goto L7f
            if (r0 != r6) goto L21
            goto L7f
        L21:
            if (r0 == r10) goto L7f
            if (r0 == r9) goto L7f
            if (r0 == r5) goto L7f
            if (r0 == r4) goto L7f
            if (r0 != r3) goto L92
            goto L7f
        L2c:
            r2 = 17
            if (r0 != r2) goto L51
            int r0 = r13.f32261k
            if (r0 > r11) goto L35
            goto L69
        L35:
            if (r0 == r8) goto L7f
            if (r0 == r7) goto L7f
            if (r0 != r6) goto L3c
            goto L7f
        L3c:
            if (r0 == r10) goto L46
            if (r0 == r9) goto L46
            if (r0 == r5) goto L46
            if (r0 == r4) goto L46
            if (r0 != r3) goto L92
        L46:
            int r0 = r13.f32262l
            if (r0 < r9) goto L7f
            r0 = 10130(0x2792, float:1.4195E-41)
            ze.i r0 = r13.n(r0)
            goto L93
        L51:
            int r0 = r13.f32262l
            r2 = 2
            if (r0 != 0) goto L62
            ze.i r0 = new ze.i
            int r2 = r13.N
            int r2 = r2 >> r1
            r2 = r2 & r11
            int r3 = r13.G
            r0.<init>(r1, r2, r3, r1)
            goto L93
        L62:
            r12 = 1
            if (r0 != r12) goto L84
            int r0 = r13.f32261k
            if (r0 > r11) goto L6e
        L69:
            ze.i r0 = r13.m(r1)
            goto L93
        L6e:
            if (r0 == r8) goto L7f
            if (r0 == r7) goto L7f
            if (r0 != r6) goto L75
            goto L7f
        L75:
            if (r0 == r10) goto L7f
            if (r0 == r9) goto L7f
            if (r0 == r5) goto L7f
            if (r0 == r4) goto L7f
            if (r0 != r3) goto L92
        L7f:
            ze.i r0 = r13.m(r10)
            goto L93
        L84:
            if (r0 != r2) goto L92
            ze.i r0 = new ze.i
            int r2 = r13.N
            int r2 = r2 >> r1
            r2 = r2 & r11
            int r3 = r13.G
            r0.<init>(r1, r2, r3, r1)
            goto L93
        L92:
            r0 = 0
        L93:
            if (r0 == 0) goto L98
            int r0 = r0.f32338d
            goto L99
        L98:
            r0 = -1
        L99:
            int r2 = r13.f32252b
            int r3 = r13.f32262l
            int r4 = r13.f32261k
            int r8 = r13.l()
            ue.a r1 = new ue.a
            r6 = 0
            r7 = 10130(0x2792, float:1.4195E-41)
            r5 = r0
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ze.d.q():int");
    }

    public final void r() {
        int i10;
        int i11;
        byte b10;
        if (this.f32250a) {
            ge.b.n(String.format("imageVersionIndicator = 0x%08x, \ninactiveImageVersionValues = %s", Integer.valueOf(this.N), he.a.a(this.T)));
        }
        byte[] bArr = this.T;
        if (bArr == null || bArr.length <= 0) {
            this.U = new ArrayList();
            return;
        }
        int i12 = bArr[0] & 255;
        ArrayList arrayList = new ArrayList();
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        int i13 = 1;
        for (int i14 = 0; i14 < i12; i14++) {
            byte[] bArr2 = this.T;
            if (bArr2 != null && (i10 = i13 + 5) < bArr2.length) {
                int i15 = ((bArr2[i13 + 1] << 8) & 65280) | (bArr2[i13] & 255);
                if (i15 == 10128) {
                    i11 = ((bArr2[i13 + 2] << 24) & (-16777216)) | ((bArr2[i13 + 3] << 16) & 16711680) | ((bArr2[i13 + 4] << 8) & 65280);
                    b10 = bArr2[i10];
                } else {
                    i11 = ((bArr2[i10] << 24) & (-16777216)) | ((bArr2[i13 + 4] << 16) & 16711680) | ((bArr2[i13 + 3] << 8) & 65280);
                    b10 = bArr2[i13 + 2];
                }
                hashMap.put(Integer.valueOf(i15), Integer.valueOf(i11 | (b10 & 255)));
            }
            byte[] bArr3 = this.V;
            if (bArr3 != null && (i13 * 4) + 3 < bArr3.length) {
                hashMap2.put(Integer.valueOf(((bArr3[i13 + 1] << 8) & 65280) | (bArr3[i13] & 255)), Integer.valueOf((bArr3[i13 + 2] & 255) | ((bArr3[i13 + 5] << 24) & (-16777216)) | ((bArr3[i13 + 4] << 16) & 16711680) | ((bArr3[i13 + 3] << 8) & 65280)));
            }
            i13 += 6;
        }
        for (Integer num : hashMap.keySet()) {
            int intValue = num.intValue();
            int i16 = this.Q;
            i iVar = new i(i16 == 1 ? 2 : i16 == 2 ? 1 : 3, (!hashMap.containsKey(Integer.valueOf(intValue)) || hashMap.get(Integer.valueOf(intValue)) == null) ? 0 : ((Integer) hashMap.get(Integer.valueOf(intValue))).intValue(), (!hashMap2.containsKey(Integer.valueOf(intValue)) || hashMap2.get(Integer.valueOf(intValue)) == null) ? 0 : ((Integer) hashMap2.get(Integer.valueOf(intValue))).intValue(), intValue, 0);
            if (this.f32250a) {
                ge.b.n(iVar.toString());
            }
            arrayList.add(iVar);
        }
        this.U = arrayList;
    }

    /* JADX WARN: Code restructure failed: missing block: B:144:0x0143, code lost:
        if (r12.N == 0) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x0145, code lost:
        r12.P = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x0148, code lost:
        g();
     */
    /* JADX WARN: Code restructure failed: missing block: B:159:0x0189, code lost:
        if (r12.N == 0) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:169:?, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:170:?, code lost:
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void s(int r13, byte[] r14) {
        /*
            Method dump skipped, instructions count: 405
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ze.d.s(int, byte[]):void");
    }

    public final void t(byte[] bArr) {
        if (bArr == null) {
            return;
        }
        ByteBuffer wrap = ByteBuffer.wrap(bArr);
        wrap.order(ByteOrder.LITTLE_ENDIAN);
        int remaining = wrap.remaining();
        if (remaining <= 0) {
            return;
        }
        int i10 = remaining - 0;
        try {
            this.f32261k = wrap.get(0) & 255;
            byte b10 = (byte) (wrap.get(1) & 15);
            this.f32262l = b10;
            if (b10 < 4) {
                if (i10 >= 3) {
                    this.f32263m = wrap.get(2) & 255;
                }
                if (i10 >= 4) {
                    int i11 = wrap.get(3) & 255;
                    this.f32266p = i11;
                    this.f32267q = (i11 & 1) != 0;
                    this.f32268r = ((i11 & 2) >> 1) != 0;
                    this.f32269s = (i11 & 4) >> 2;
                    this.f32270t = ((i11 & 8) >> 3) != 0;
                    this.f32271u = (i11 & 16) >> 4;
                    this.f32273w = ((i11 & 32) >> 5) != 0;
                    this.f32274x = (i11 & 64) >> 6;
                    this.f32275y = (i11 & 128) >> 7;
                }
                if (i10 >= 5) {
                    this.f32276z = 1 & wrap.get(4) & 255;
                }
                if (i10 >= 7) {
                    this.E = wrap.get(6) & 255;
                }
                if (i10 >= 12) {
                    this.N = wrap.getInt(8);
                }
            } else {
                if (i10 >= 3) {
                    int i12 = wrap.get(2) & 255;
                    this.f32266p = i12;
                    this.f32267q = (i12 & 1) != 0;
                    this.f32268r = ((i12 & 2) >> 1) != 0;
                    this.f32269s = (i12 & 4) >> 2;
                    this.f32271u = (i12 & 8) >> 3;
                    this.f32272v = ((i12 & 16) >> 4) == 1;
                    int i13 = (i12 & 96) >> 5;
                    this.A = i13 == 1;
                    this.B = i13 == 2;
                }
                if (i10 >= 4) {
                    int i14 = wrap.get(3) & 255;
                    int i15 = i14 & 3;
                    this.f32276z = i15;
                    this.f32274x = (i14 & 12) >> 2;
                    this.f32273w = i15 == 2;
                }
                if (i10 >= 5) {
                    this.E = wrap.get(4) & 255;
                }
                if (i10 >= 6) {
                    int i16 = wrap.get(5) & 255;
                    if (i16 == 0) {
                        this.P = false;
                        this.Q = 0;
                        this.N = 3;
                    } else if (i16 == 1) {
                        this.P = true;
                        this.Q = 2;
                        this.N = 1;
                    } else if (i16 == 2) {
                        this.P = true;
                        this.Q = 1;
                        this.N = 2;
                    }
                }
                if (i10 >= 7) {
                    this.X = wrap.getShort(6) & 65535;
                }
            }
        } catch (Exception e10) {
            ge.b.p(e10.toString());
        }
        if (this.N == 0) {
            this.P = false;
        } else {
            g();
        }
        a();
    }

    public final String toString() {
        String format;
        StringBuilder a10 = android.support.v4.media.d.a("DeviceInfo{");
        a10.append(String.format("\nIPV=%s", String.format("I%02XP%04XV%02XCID%02XPID%02X", Integer.valueOf(this.f32261k), Integer.valueOf(this.f32252b), Integer.valueOf(this.f32262l), (byte) 0, (byte) 0)));
        if (this.f32253c) {
            a10.append("\n\tDIS:");
            Locale locale = Locale.US;
            a10.append(String.format(locale, "\n\t\tVID=0x%04X(%d), PID=0x%04X(%d)", Integer.valueOf(this.f32255e), Integer.valueOf(this.f32255e), Integer.valueOf(this.f32256f), Integer.valueOf(this.f32256f)));
            if (this.f32250a) {
                a10.append(String.format(locale, "\n\t\tVIDSrc=0x%02X(%d), productVersion=0x%04X(%d)", Integer.valueOf(this.f32254d), Integer.valueOf(this.f32254d), Integer.valueOf(this.f32257g), Integer.valueOf(this.f32257g)));
            }
        }
        if (this.f32258h) {
            a10.append("\n\tBAS:");
            a10.append(String.format(Locale.US, "\npriBat=0x%02X(%d), secBat=0x%02X(%d)", Integer.valueOf(this.f32259i), Integer.valueOf(this.f32259i), Integer.valueOf(this.f32260j), Integer.valueOf(this.f32260j)));
        }
        a10.append(String.format("\nmode=0x%02X\n", Integer.valueOf(this.f32266p)));
        a10.append(String.format("\tbufferCheckEnabled=%b\n", Boolean.valueOf(this.f32267q)));
        if (this.f32267q) {
            a10.append(String.format(Locale.US, "\t\tmaxBufferCheckSize=0x%04X(%d)\n", Integer.valueOf(this.D), Integer.valueOf(this.D)));
        }
        a10.append(String.format("\taesEncryptEnabled=%b", Boolean.valueOf(this.f32268r)));
        if (this.f32268r) {
            a10.append(String.format("\t\taesEncryptMode=0x%02X\n", Integer.valueOf(this.f32269s)));
        }
        a10.append(String.format("\n\tcopyImageEnabled=%b\n", Boolean.valueOf(this.f32270t)));
        a10.append(String.format("\tupdateImageFlag=0x%02X\n", Integer.valueOf(this.f32271u)));
        a10.append(String.format("\trwsEnabled=%b, rwsMode=0x%02X, budRole: 0x%02X\n", Boolean.valueOf(this.f32273w), Integer.valueOf(this.f32276z), Integer.valueOf(this.f32274x)));
        if (this.f32273w) {
            a10.append(String.format("\t\trwsUpdateFlag:0x%02X, rwsBdAddr: %s\n", Integer.valueOf(this.f32275y), p.b.n(this.C, true)));
        }
        Locale locale2 = Locale.US;
        a10.append(String.format(locale2, "otaTempBufferSize=0x%04X(%d)\n", Integer.valueOf(this.E), Integer.valueOf(this.E)));
        a10.append(String.format("mUpdateMechanism=0x%02X\n", Integer.valueOf(this.O)));
        int i10 = this.f32252b;
        if (i10 == 0) {
            int i11 = this.f32262l;
            if (i11 == 0) {
                a10.append(String.format(locale2, "\tpatchVersion=0x%04X\n", Integer.valueOf(this.G)));
                a10.append(String.format(locale2, "\tpatchFreeBank=0x%02X\n", Integer.valueOf(this.f32265o)));
                a10.append(String.format(locale2, "\tappVersion=0x%04X\n", Integer.valueOf(this.H)));
                a10.append(String.format("\tappFreeBank=0x%02X\n", Integer.valueOf(this.f32264n)));
                a10.append(String.format(locale2, "\tpatchExtensionVersion=%d\n", Integer.valueOf(this.I)));
                if (this.f32261k > 3) {
                    a10.append(String.format(locale2, "\tappData0=%d\n", Integer.valueOf(this.J)));
                    a10.append(String.format(locale2, "\tappData1=%d\n", Integer.valueOf(this.K)));
                    a10.append(String.format(locale2, "\tappData2=%d\n", Integer.valueOf(this.L)));
                    format = String.format(locale2, "\tappData3=%d\n", Integer.valueOf(this.M));
                    a10.append(format);
                }
            } else {
                if (i11 == 1) {
                    a10.append(String.format(locale2, "\tsecureVersion=0x%04X(%d)\n", Integer.valueOf(this.f32263m), Integer.valueOf(this.f32263m)));
                    a10.append(String.format(locale2, "\timageVersionIndicator=0x%08X\n", Integer.valueOf(this.N)));
                    format = String.format(locale2, "\tupdateBankIndicator=0x%02X\n", Integer.valueOf(this.Q));
                } else if (i11 == 2) {
                    a10.append(String.format(locale2, "\tnoTempImageId=0x%04X\n", Integer.valueOf(this.Y)));
                    format = String.format(locale2, "\tpatchVersion=0x%04X\n", Integer.valueOf(this.G));
                }
                a10.append(format);
            }
        } else if (i10 == 17) {
            a10.append(String.format(locale2, "\tsecureVersion=0x%04X(%d)\n", Integer.valueOf(this.f32263m), Integer.valueOf(this.f32263m)));
            a10.append(String.format(locale2, "\timageVersionIndicator=0x%08X\n", Integer.valueOf(this.N)));
            a10.append(String.format(locale2, "\tupdateBankIndicator=0x%02X(%d)\n", Integer.valueOf(this.Q), Integer.valueOf(this.Q)));
            if (this.f32262l >= 6) {
                format = String.format(locale2, "\tmtu=0x%04X\n", Integer.valueOf(this.X));
                a10.append(format);
            }
        } else {
            if (i10 == 16) {
                a10.append(String.format(locale2, "\tsecureVersion=0x%04X(%d)\n", Integer.valueOf(this.f32263m), Integer.valueOf(this.f32263m)));
                a10.append(String.format(locale2, "\timageVersionIndicator=0x%08X\n", Integer.valueOf(this.N)));
                a10.append(String.format(locale2, "\tupdateBankIndicator=0x%02X(%d)\n", Integer.valueOf(this.Q), Integer.valueOf(this.Q)));
                if (this.f32262l > 4) {
                    format = String.format(locale2, "\tmtu=0x%04X\n", Integer.valueOf(this.X));
                }
            } else if (i10 == 20) {
                a10.append(String.format(locale2, "\tsecureVersion=0x%04X(%d)\n", Integer.valueOf(this.f32263m), Integer.valueOf(this.f32263m)));
                a10.append(String.format(locale2, "\timageVersionIndicator=0x%08X\n", Integer.valueOf(this.N)));
                a10.append(String.format(locale2, "\tupdateBankIndicator=0x%02X(%d)\n", Integer.valueOf(this.Q), Integer.valueOf(this.Q)));
                format = String.format(locale2, "\tmtu=0x%04X\n", Integer.valueOf(this.X));
            } else if (i10 == 21) {
                a10.append(String.format(locale2, "\tsecureVersion=0x%04X(%d)\n", Integer.valueOf(this.f32263m), Integer.valueOf(this.f32263m)));
                a10.append(String.format(locale2, "\timageVersionIndicator=0x%08X\n", Integer.valueOf(this.N)));
                a10.append(String.format(locale2, "\tupdateBankIndicator=0x%02X(%d)\n", Integer.valueOf(this.Q), Integer.valueOf(this.Q)));
                a10.append(String.format(locale2, "\tmtu=0x%04X\n", Integer.valueOf(this.X)));
                format = String.format(locale2, "\timageHeaderOffset=0x%04X(%d)\n", Integer.valueOf(this.Z), Integer.valueOf(this.Z));
            } else {
                a10.append(String.format(locale2, "\tsecureVersion=0x%04X(%d)\n", Integer.valueOf(this.f32263m), Integer.valueOf(this.f32263m)));
                a10.append(String.format(locale2, "\timageVersionIndicator=0x%08X\n", Integer.valueOf(this.N)));
                format = String.format(locale2, "\tupdateBankIndicator=0x%02X(%d)\n", Integer.valueOf(this.Q), Integer.valueOf(this.Q));
            }
            a10.append(format);
        }
        a10.append(String.format("bankEnabled=%b\n", Boolean.valueOf(this.P)));
        if (this.f32250a) {
            ArrayList arrayList = this.S;
            if (arrayList != null && arrayList.size() > 0) {
                a10.append("activeImages:\n");
                Iterator it = this.S.iterator();
                while (it.hasNext()) {
                    a10.append("\t");
                    a10.append(((i) it.next()).toString());
                    a10.append("\n");
                }
            }
            ArrayList arrayList2 = this.U;
            if (arrayList2 != null && arrayList2.size() > 0) {
                a10.append("inactiveImages:\n");
                Iterator it2 = this.U.iterator();
                while (it2.hasNext()) {
                    a10.append("\t");
                    a10.append(((i) it2.next()).toString());
                    a10.append("\n");
                }
            }
        }
        a10.append("}");
        return a10.toString();
    }

    public final void u(byte[] bArr) {
        if (bArr == null) {
            return;
        }
        ByteBuffer wrap = ByteBuffer.wrap(bArr);
        wrap.order(ByteOrder.LITTLE_ENDIAN);
        int remaining = wrap.remaining();
        if (remaining <= 0) {
            return;
        }
        int i10 = remaining - 0;
        try {
            if (i10 <= 1) {
                this.f32261k = 3;
                this.f32262l = 0;
                this.f32264n = (byte) (wrap.get(0) & 15);
                byte b10 = (byte) ((wrap.get(0) & 240) >> 4);
                this.f32265o = b10;
                int i11 = this.f32264n;
                if (i11 == 15 && b10 == 15) {
                    this.P = false;
                    this.Q = 0;
                } else {
                    this.P = true;
                    if (i11 != 1 && b10 != 1) {
                        this.Q = 1;
                    }
                    this.Q = 2;
                }
                B(2);
                return;
            }
            this.f32261k = wrap.get(0) & 255;
            this.f32262l = (byte) (15 & wrap.get(1));
            if (i10 >= 3) {
                this.f32263m = wrap.get(2) & 255;
            }
            if (i10 >= 4) {
                B(wrap.get(3));
            }
            if (i10 >= 5) {
                this.D = wrap.getShort(4) & 65535;
            }
            if (i10 >= 7) {
                this.E = wrap.get(6) & 255;
            }
            if (i10 >= 12) {
                this.N = wrap.getInt(8);
            }
            if (i10 >= 14 && this.f32262l >= 4) {
                this.Z = wrap.getShort(12);
            }
            h();
            if (this.N == 0) {
                this.P = false;
            } else {
                g();
            }
        } catch (Exception e10) {
            ge.b.p(e10.toString());
        }
    }

    public final void v(byte[] bArr) {
        if (bArr == null) {
            return;
        }
        ByteBuffer wrap = ByteBuffer.wrap(bArr);
        wrap.order(ByteOrder.LITTLE_ENDIAN);
        int remaining = wrap.remaining();
        if (remaining <= 0) {
            return;
        }
        int i10 = remaining - 0;
        try {
            this.f32261k = wrap.get(0) & 255;
            this.f32262l = (byte) (wrap.get(1) & 15);
            if (i10 >= 3) {
                int i11 = wrap.get(2) & 255;
                this.f32266p = i11;
                this.f32267q = (i11 & 1) != 0;
                this.f32268r = ((i11 & 2) >> 1) != 0;
                this.f32269s = (i11 & 4) >> 2;
                this.f32271u = (i11 & 8) >> 3;
                this.f32272v = ((i11 & 16) >> 4) == 1;
                int i12 = (i11 & 96) >> 5;
                this.A = i12 == 1;
                this.B = i12 == 2;
            }
            if (i10 >= 4) {
                int i13 = wrap.get(3) & 255;
                int i14 = i13 & 3;
                this.f32276z = i14;
                this.f32274x = (i13 & 12) >> 2;
                this.f32273w = i14 == 2;
            }
            if (i10 >= 6) {
                this.E = wrap.getShort(4) & 65535;
            }
            if (i10 >= 7) {
                int i15 = wrap.get(6) & 255;
                if (i15 == 0) {
                    this.P = false;
                    this.Q = 0;
                    this.N = 3;
                } else if (i15 == 1) {
                    this.P = true;
                    this.Q = 2;
                    this.N = 1;
                } else if (i15 == 2) {
                    this.P = true;
                    this.Q = 1;
                    this.N = 2;
                }
            }
            if (i10 >= 8) {
                this.X = wrap.getShort(7) & 65535;
            }
        } catch (Exception e10) {
            ge.b.p(e10.toString());
        }
        if (this.N == 0) {
            this.P = false;
        } else {
            g();
        }
        a();
    }

    public final void w(byte[] bArr) {
        if (bArr == null) {
            return;
        }
        ByteBuffer wrap = ByteBuffer.wrap(bArr);
        wrap.order(ByteOrder.LITTLE_ENDIAN);
        int remaining = wrap.remaining();
        if (remaining <= 0) {
            return;
        }
        int i10 = remaining - 0;
        if (i10 >= 2) {
            this.f32261k = wrap.get(0) & 255;
            this.f32262l = (byte) (wrap.get(1) & 15);
        }
        if (i10 >= 3) {
            int i11 = wrap.get(2) & 255;
            this.f32266p = i11;
            this.f32267q = (i11 & 1) != 0;
            this.f32268r = ((i11 & 2) >> 1) != 0;
            this.f32269s = (i11 & 4) >> 2;
            this.f32271u = (i11 & 8) >> 3;
        }
        if (i10 >= 6) {
            this.E = wrap.getShort(4) & 65535;
        }
        if (i10 >= 7) {
            int i12 = wrap.get(6) & 255;
            if (i12 == 0) {
                this.P = false;
                this.Q = 0;
                this.N = 3;
            } else if (i12 == 1) {
                this.P = true;
                this.Q = 2;
                this.N = 1;
            } else if (i12 == 2) {
                this.P = true;
                this.Q = 1;
                this.N = 2;
            }
        }
        if (i10 >= 11) {
            this.Z = wrap.getShort(9) & 65535;
        }
        if (this.N == 0) {
            this.P = false;
        } else {
            g();
        }
        a();
    }

    public final void x(byte[] bArr) {
        this.R = bArr;
        i();
    }

    public final void y(byte[] bArr) {
        this.V = bArr;
        i();
    }

    public final void z(byte[] bArr) {
        int i10 = this.f32252b;
        if (i10 != 20 && i10 != 21) {
            if (i10 == 16) {
                if (this.f32262l >= 4) {
                    if (bArr != null && bArr.length >= 1) {
                        byte b10 = bArr[0];
                        int length = bArr.length - 1;
                        byte[] bArr2 = new byte[length];
                        System.arraycopy(bArr, 1, bArr2, 0, length);
                        if (b10 == 0) {
                            x(bArr2);
                            return;
                        }
                        this.T = bArr2;
                    } else {
                        x(null);
                        return;
                    }
                }
                x(bArr);
                return;
            }
            if (i10 == 17 && this.f32262l >= 6) {
                if (bArr != null && bArr.length >= 1) {
                    byte b11 = bArr[0];
                    int length2 = bArr.length - 1;
                    byte[] bArr3 = new byte[length2];
                    System.arraycopy(bArr, 1, bArr3, 0, length2);
                    if (b11 == 0) {
                        x(bArr3);
                        return;
                    }
                    this.T = bArr3;
                } else {
                    x(null);
                    return;
                }
            }
            x(bArr);
            return;
        } else if (bArr != null && bArr.length >= 1) {
            byte b12 = bArr[0];
            int length3 = bArr.length - 1;
            byte[] bArr4 = new byte[length3];
            System.arraycopy(bArr, 1, bArr4, 0, length3);
            if (b12 == 0) {
                x(bArr4);
                return;
            }
            this.T = bArr4;
        } else {
            x(null);
            return;
        }
        k();
    }
}
