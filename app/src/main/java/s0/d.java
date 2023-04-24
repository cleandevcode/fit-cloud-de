package s0;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import s0.c;
import t0.m;
import t0.o;
import t0.q;

/* loaded from: classes.dex */
public class d {
    public float A;
    public int B;
    public float C;
    public int[] D;
    public float E;
    public boolean F;
    public boolean G;
    public boolean H;
    public int I;
    public int J;
    public c K;
    public c L;
    public c M;
    public c N;
    public c O;
    public c P;
    public c Q;
    public c R;
    public c[] S;
    public ArrayList<c> T;
    public boolean[] U;
    public int[] V;
    public d W;
    public int X;
    public int Y;
    public float Z;

    /* renamed from: a0 */
    public int f26313a0;

    /* renamed from: b */
    public t0.c f26314b;

    /* renamed from: b0 */
    public int f26315b0;

    /* renamed from: c */
    public t0.c f26316c;

    /* renamed from: c0 */
    public int f26317c0;

    /* renamed from: d0 */
    public int f26319d0;

    /* renamed from: e0 */
    public int f26321e0;

    /* renamed from: f0 */
    public int f26323f0;

    /* renamed from: g0 */
    public float f26325g0;

    /* renamed from: h0 */
    public float f26327h0;

    /* renamed from: i0 */
    public Object f26329i0;

    /* renamed from: j0 */
    public int f26331j0;

    /* renamed from: k */
    public String f26332k;

    /* renamed from: k0 */
    public String f26333k0;

    /* renamed from: l */
    public boolean f26334l;

    /* renamed from: l0 */
    public int f26335l0;

    /* renamed from: m */
    public boolean f26336m;

    /* renamed from: m0 */
    public int f26337m0;

    /* renamed from: n */
    public boolean f26338n;

    /* renamed from: n0 */
    public float[] f26339n0;

    /* renamed from: o */
    public boolean f26340o;

    /* renamed from: o0 */
    public d[] f26341o0;

    /* renamed from: p */
    public int f26342p;

    /* renamed from: p0 */
    public d[] f26343p0;

    /* renamed from: q */
    public int f26344q;

    /* renamed from: q0 */
    public int f26345q0;

    /* renamed from: r */
    public int f26346r;

    /* renamed from: r0 */
    public int f26347r0;

    /* renamed from: s */
    public int f26348s;

    /* renamed from: t */
    public int f26349t;

    /* renamed from: u */
    public int[] f26350u;

    /* renamed from: v */
    public int f26351v;

    /* renamed from: w */
    public int f26352w;

    /* renamed from: x */
    public float f26353x;

    /* renamed from: y */
    public int f26354y;

    /* renamed from: z */
    public int f26355z;

    /* renamed from: a */
    public boolean f26312a = false;

    /* renamed from: d */
    public m f26318d = null;

    /* renamed from: e */
    public o f26320e = null;

    /* renamed from: f */
    public boolean[] f26322f = {true, true};

    /* renamed from: g */
    public boolean f26324g = true;

    /* renamed from: h */
    public boolean f26326h = true;

    /* renamed from: i */
    public int f26328i = -1;

    /* renamed from: j */
    public int f26330j = -1;

    public d() {
        new HashMap();
        this.f26334l = false;
        this.f26336m = false;
        this.f26338n = false;
        this.f26340o = false;
        this.f26342p = -1;
        this.f26344q = -1;
        this.f26346r = 0;
        this.f26348s = 0;
        this.f26349t = 0;
        this.f26350u = new int[2];
        this.f26351v = 0;
        this.f26352w = 0;
        this.f26353x = 1.0f;
        this.f26354y = 0;
        this.f26355z = 0;
        this.A = 1.0f;
        this.B = -1;
        this.C = 1.0f;
        this.D = new int[]{Integer.MAX_VALUE, Integer.MAX_VALUE};
        this.E = 0.0f;
        this.F = false;
        this.H = false;
        this.I = 0;
        this.J = 0;
        c cVar = new c(this, c.a.LEFT);
        this.K = cVar;
        c cVar2 = new c(this, c.a.TOP);
        this.L = cVar2;
        c cVar3 = new c(this, c.a.RIGHT);
        this.M = cVar3;
        c cVar4 = new c(this, c.a.BOTTOM);
        this.N = cVar4;
        c cVar5 = new c(this, c.a.BASELINE);
        this.O = cVar5;
        this.P = new c(this, c.a.CENTER_X);
        this.Q = new c(this, c.a.CENTER_Y);
        c cVar6 = new c(this, c.a.CENTER);
        this.R = cVar6;
        this.S = new c[]{cVar, cVar3, cVar2, cVar4, cVar5, cVar6};
        ArrayList<c> arrayList = new ArrayList<>();
        this.T = arrayList;
        this.U = new boolean[2];
        this.V = new int[]{1, 1};
        this.W = null;
        this.X = 0;
        this.Y = 0;
        this.Z = 0.0f;
        this.f26313a0 = -1;
        this.f26315b0 = 0;
        this.f26317c0 = 0;
        this.f26319d0 = 0;
        this.f26325g0 = 0.5f;
        this.f26327h0 = 0.5f;
        this.f26331j0 = 0;
        this.f26333k0 = null;
        this.f26335l0 = 0;
        this.f26337m0 = 0;
        this.f26339n0 = new float[]{-1.0f, -1.0f};
        this.f26341o0 = new d[]{null, null};
        this.f26343p0 = new d[]{null, null};
        this.f26345q0 = -1;
        this.f26347r0 = -1;
        arrayList.add(this.K);
        this.T.add(this.L);
        this.T.add(this.M);
        this.T.add(this.N);
        this.T.add(this.P);
        this.T.add(this.Q);
        this.T.add(this.R);
        this.T.add(this.O);
    }

    public static void H(String str, int i10, int i11, StringBuilder sb2) {
        if (i10 == i11) {
            return;
        }
        sb2.append(str);
        sb2.append(" :   ");
        sb2.append(i10);
        sb2.append(",\n");
    }

    public static void I(StringBuilder sb2, String str, float f10, float f11) {
        if (f10 == f11) {
            return;
        }
        sb2.append(str);
        sb2.append(" :   ");
        sb2.append(f10);
        sb2.append(",\n");
    }

    public static void p(StringBuilder sb2, String str, int i10, int i11, int i12, int i13, int i14, float f10) {
        sb2.append(str);
        sb2.append(" :  {\n");
        H("      size", i10, 0, sb2);
        H("      min", i11, 0, sb2);
        H("      max", i12, Integer.MAX_VALUE, sb2);
        H("      matchMin", i13, 0, sb2);
        H("      matchDef", i14, 0, sb2);
        I(sb2, "      matchPercent", f10, 1.0f);
        sb2.append("    },\n");
    }

    public static void q(StringBuilder sb2, String str, c cVar) {
        if (cVar.f26299f == null) {
            return;
        }
        p0.a.a(sb2, "    ", str, " : [ '");
        sb2.append(cVar.f26299f);
        sb2.append("'");
        if (cVar.f26301h != Integer.MIN_VALUE || cVar.f26300g != 0) {
            sb2.append(",");
            sb2.append(cVar.f26300g);
            if (cVar.f26301h != Integer.MIN_VALUE) {
                sb2.append(",");
                sb2.append(cVar.f26301h);
                sb2.append(",");
            }
        }
        sb2.append(" ] ,\n");
    }

    public final boolean A() {
        return this.f26324g && this.f26331j0 != 8;
    }

    public boolean B() {
        if (!this.f26334l && (!this.K.f26296c || !this.M.f26296c)) {
            return false;
        }
        return true;
    }

    public boolean C() {
        if (!this.f26336m && (!this.L.f26296c || !this.N.f26296c)) {
            return false;
        }
        return true;
    }

    public void D() {
        this.K.j();
        this.L.j();
        this.M.j();
        this.N.j();
        this.O.j();
        this.P.j();
        this.Q.j();
        this.R.j();
        this.W = null;
        this.E = 0.0f;
        this.X = 0;
        this.Y = 0;
        this.Z = 0.0f;
        this.f26313a0 = -1;
        this.f26315b0 = 0;
        this.f26317c0 = 0;
        this.f26319d0 = 0;
        this.f26321e0 = 0;
        this.f26323f0 = 0;
        this.f26325g0 = 0.5f;
        this.f26327h0 = 0.5f;
        int[] iArr = this.V;
        iArr[0] = 1;
        iArr[1] = 1;
        this.f26329i0 = null;
        this.f26331j0 = 0;
        this.f26335l0 = 0;
        this.f26337m0 = 0;
        float[] fArr = this.f26339n0;
        fArr[0] = -1.0f;
        fArr[1] = -1.0f;
        this.f26342p = -1;
        this.f26344q = -1;
        int[] iArr2 = this.D;
        iArr2[0] = Integer.MAX_VALUE;
        iArr2[1] = Integer.MAX_VALUE;
        this.f26348s = 0;
        this.f26349t = 0;
        this.f26353x = 1.0f;
        this.A = 1.0f;
        this.f26352w = Integer.MAX_VALUE;
        this.f26355z = Integer.MAX_VALUE;
        this.f26351v = 0;
        this.f26354y = 0;
        this.B = -1;
        this.C = 1.0f;
        boolean[] zArr = this.f26322f;
        zArr[0] = true;
        zArr[1] = true;
        this.H = false;
        boolean[] zArr2 = this.U;
        zArr2[0] = false;
        zArr2[1] = false;
        this.f26324g = true;
        int[] iArr3 = this.f26350u;
        iArr3[0] = 0;
        iArr3[1] = 0;
        this.f26328i = -1;
        this.f26330j = -1;
    }

    public final void E() {
        d dVar = this.W;
        if (dVar != null && (dVar instanceof e)) {
            ((e) dVar).getClass();
        }
        int size = this.T.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.T.get(i10).j();
        }
    }

    public final void F() {
        this.f26334l = false;
        this.f26336m = false;
        this.f26338n = false;
        this.f26340o = false;
        int size = this.T.size();
        for (int i10 = 0; i10 < size; i10++) {
            c cVar = this.T.get(i10);
            cVar.f26296c = false;
            cVar.f26295b = 0;
        }
    }

    public void G(p.g gVar) {
        this.K.k();
        this.L.k();
        this.M.k();
        this.N.k();
        this.O.k();
        this.R.k();
        this.P.k();
        this.Q.k();
    }

    public final void J(int i10, int i11) {
        if (this.f26334l) {
            return;
        }
        this.K.l(i10);
        this.M.l(i11);
        this.f26315b0 = i10;
        this.X = i11 - i10;
        this.f26334l = true;
    }

    public final void K(int i10, int i11) {
        if (this.f26336m) {
            return;
        }
        this.L.l(i10);
        this.N.l(i11);
        this.f26317c0 = i10;
        this.Y = i11 - i10;
        if (this.F) {
            this.O.l(i10 + this.f26319d0);
        }
        this.f26336m = true;
    }

    public final void L(int i10) {
        this.Y = i10;
        int i11 = this.f26323f0;
        if (i10 < i11) {
            this.Y = i11;
        }
    }

    public final void M(int i10) {
        this.V[0] = i10;
    }

    public final void N(int i10) {
        this.V[1] = i10;
    }

    public final void O(int i10) {
        this.X = i10;
        int i11 = this.f26321e0;
        if (i10 < i11) {
            this.X = i11;
        }
    }

    public void P(boolean z10, boolean z11) {
        int i10;
        int i11;
        m mVar = this.f26318d;
        boolean z12 = z10 & mVar.f27515g;
        o oVar = this.f26320e;
        boolean z13 = z11 & oVar.f27515g;
        int i12 = mVar.f27516h.f27490g;
        int i13 = oVar.f27516h.f27490g;
        int i14 = mVar.f27517i.f27490g;
        int i15 = oVar.f27517i.f27490g;
        int i16 = i15 - i13;
        if (i14 - i12 < 0 || i16 < 0 || i12 == Integer.MIN_VALUE || i12 == Integer.MAX_VALUE || i13 == Integer.MIN_VALUE || i13 == Integer.MAX_VALUE || i14 == Integer.MIN_VALUE || i14 == Integer.MAX_VALUE || i15 == Integer.MIN_VALUE || i15 == Integer.MAX_VALUE) {
            i14 = 0;
            i15 = 0;
            i12 = 0;
            i13 = 0;
        }
        int i17 = i14 - i12;
        int i18 = i15 - i13;
        if (z12) {
            this.f26315b0 = i12;
        }
        if (z13) {
            this.f26317c0 = i13;
        }
        if (this.f26331j0 == 8) {
            this.X = 0;
            this.Y = 0;
            return;
        }
        if (z12) {
            if (this.V[0] == 1 && i17 < (i11 = this.X)) {
                i17 = i11;
            }
            this.X = i17;
            int i19 = this.f26321e0;
            if (i17 < i19) {
                this.X = i19;
            }
        }
        if (z13) {
            if (this.V[1] == 1 && i18 < (i10 = this.Y)) {
                i18 = i10;
            }
            this.Y = i18;
            int i20 = this.f26323f0;
            if (i18 < i20) {
                this.Y = i20;
            }
        }
    }

    public void Q(q0.c cVar, boolean z10) {
        int i10;
        int i11;
        o oVar;
        m mVar;
        c cVar2 = this.K;
        cVar.getClass();
        int o10 = q0.c.o(cVar2);
        int o11 = q0.c.o(this.L);
        int o12 = q0.c.o(this.M);
        int o13 = q0.c.o(this.N);
        if (z10 && (mVar = this.f26318d) != null) {
            t0.g gVar = mVar.f27516h;
            if (gVar.f27493j) {
                t0.g gVar2 = mVar.f27517i;
                if (gVar2.f27493j) {
                    o10 = gVar.f27490g;
                    o12 = gVar2.f27490g;
                }
            }
        }
        if (z10 && (oVar = this.f26320e) != null) {
            t0.g gVar3 = oVar.f27516h;
            if (gVar3.f27493j) {
                t0.g gVar4 = oVar.f27517i;
                if (gVar4.f27493j) {
                    o11 = gVar3.f27490g;
                    o13 = gVar4.f27490g;
                }
            }
        }
        int i12 = o13 - o11;
        if (o12 - o10 < 0 || i12 < 0 || o10 == Integer.MIN_VALUE || o10 == Integer.MAX_VALUE || o11 == Integer.MIN_VALUE || o11 == Integer.MAX_VALUE || o12 == Integer.MIN_VALUE || o12 == Integer.MAX_VALUE || o13 == Integer.MIN_VALUE || o13 == Integer.MAX_VALUE) {
            o10 = 0;
            o11 = 0;
            o12 = 0;
            o13 = 0;
        }
        int i13 = o12 - o10;
        int i14 = o13 - o11;
        this.f26315b0 = o10;
        this.f26317c0 = o11;
        if (this.f26331j0 == 8) {
            this.X = 0;
            this.Y = 0;
            return;
        }
        int[] iArr = this.V;
        int i15 = iArr[0];
        if (i15 == 1 && i13 < (i11 = this.X)) {
            i13 = i11;
        }
        if (iArr[1] == 1 && i14 < (i10 = this.Y)) {
            i14 = i10;
        }
        this.X = i13;
        this.Y = i14;
        int i16 = this.f26323f0;
        if (i14 < i16) {
            this.Y = i16;
        }
        int i17 = this.f26321e0;
        if (i13 < i17) {
            this.X = i17;
        }
        int i18 = this.f26352w;
        if (i18 > 0 && i15 == 3) {
            this.X = Math.min(this.X, i18);
        }
        int i19 = this.f26355z;
        if (i19 > 0 && this.V[1] == 3) {
            this.Y = Math.min(this.Y, i19);
        }
        int i20 = this.X;
        if (i13 != i20) {
            this.f26328i = i20;
        }
        int i21 = this.Y;
        if (i14 != i21) {
            this.f26330j = i21;
        }
    }

    public final void b(e eVar, q0.c cVar, HashSet<d> hashSet, int i10, boolean z10) {
        if (z10) {
            if (!hashSet.contains(this)) {
                return;
            }
            j.c(eVar, cVar, this);
            hashSet.remove(this);
            c(cVar, eVar.W(64));
        }
        if (i10 == 0) {
            HashSet<c> hashSet2 = this.K.f26294a;
            if (hashSet2 != null) {
                Iterator<c> it = hashSet2.iterator();
                while (it.hasNext()) {
                    it.next().f26297d.b(eVar, cVar, hashSet, i10, true);
                }
            }
            HashSet<c> hashSet3 = this.M.f26294a;
            if (hashSet3 != null) {
                Iterator<c> it2 = hashSet3.iterator();
                while (it2.hasNext()) {
                    it2.next().f26297d.b(eVar, cVar, hashSet, i10, true);
                }
                return;
            }
            return;
        }
        HashSet<c> hashSet4 = this.L.f26294a;
        if (hashSet4 != null) {
            Iterator<c> it3 = hashSet4.iterator();
            while (it3.hasNext()) {
                it3.next().f26297d.b(eVar, cVar, hashSet, i10, true);
            }
        }
        HashSet<c> hashSet5 = this.N.f26294a;
        if (hashSet5 != null) {
            Iterator<c> it4 = hashSet5.iterator();
            while (it4.hasNext()) {
                it4.next().f26297d.b(eVar, cVar, hashSet, i10, true);
            }
        }
        HashSet<c> hashSet6 = this.O.f26294a;
        if (hashSet6 != null) {
            Iterator<c> it5 = hashSet6.iterator();
            while (it5.hasNext()) {
                it5.next().f26297d.b(eVar, cVar, hashSet, i10, true);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:432:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:456:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:479:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:529:0x01ea  */
    /* JADX WARN: Removed duplicated region for block: B:545:0x0225  */
    /* JADX WARN: Removed duplicated region for block: B:574:0x0292  */
    /* JADX WARN: Removed duplicated region for block: B:578:0x029d  */
    /* JADX WARN: Removed duplicated region for block: B:582:0x02a5  */
    /* JADX WARN: Removed duplicated region for block: B:585:0x02ac  */
    /* JADX WARN: Removed duplicated region for block: B:586:0x02af  */
    /* JADX WARN: Removed duplicated region for block: B:589:0x02b5  */
    /* JADX WARN: Removed duplicated region for block: B:590:0x02b8  */
    /* JADX WARN: Removed duplicated region for block: B:593:0x02d2  */
    /* JADX WARN: Removed duplicated region for block: B:655:0x038a  */
    /* JADX WARN: Removed duplicated region for block: B:682:0x03f0  */
    /* JADX WARN: Removed duplicated region for block: B:686:0x0406  */
    /* JADX WARN: Removed duplicated region for block: B:690:0x0410  */
    /* JADX WARN: Removed duplicated region for block: B:693:0x0415  */
    /* JADX WARN: Removed duplicated region for block: B:700:0x0429  */
    /* JADX WARN: Removed duplicated region for block: B:705:0x0432  */
    /* JADX WARN: Removed duplicated region for block: B:706:0x0435  */
    /* JADX WARN: Removed duplicated region for block: B:709:0x044e  */
    /* JADX WARN: Removed duplicated region for block: B:720:0x0467  */
    /* JADX WARN: Removed duplicated region for block: B:730:0x049d  */
    /* JADX WARN: Removed duplicated region for block: B:731:0x04a5  */
    /* JADX WARN: Removed duplicated region for block: B:734:0x04ab  */
    /* JADX WARN: Removed duplicated region for block: B:735:0x04b3  */
    /* JADX WARN: Removed duplicated region for block: B:738:0x04d5  */
    /* JADX WARN: Removed duplicated region for block: B:739:0x04d8  */
    /* JADX WARN: Removed duplicated region for block: B:743:0x0534  */
    /* JADX WARN: Removed duplicated region for block: B:760:0x0598  */
    /* JADX WARN: Removed duplicated region for block: B:764:0x05ac  */
    /* JADX WARN: Removed duplicated region for block: B:765:0x05ae  */
    /* JADX WARN: Removed duplicated region for block: B:767:0x05b1  */
    /* JADX WARN: Removed duplicated region for block: B:802:0x063d  */
    /* JADX WARN: Removed duplicated region for block: B:803:0x0640  */
    /* JADX WARN: Removed duplicated region for block: B:808:0x0689  */
    /* JADX WARN: Removed duplicated region for block: B:815:0x06ae  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void c(q0.c r50, boolean r51) {
        /*
            Method dump skipped, instructions count: 1901
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: s0.d.c(q0.c, boolean):void");
    }

    public boolean d() {
        return this.f26331j0 != 8;
    }

    /* JADX WARN: Removed duplicated region for block: B:412:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:423:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:587:0x033d A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:592:0x034c  */
    /* JADX WARN: Removed duplicated region for block: B:600:0x0393  */
    /* JADX WARN: Removed duplicated region for block: B:603:0x03a7  */
    /* JADX WARN: Removed duplicated region for block: B:613:0x03ba  */
    /* JADX WARN: Removed duplicated region for block: B:622:0x03dd  */
    /* JADX WARN: Removed duplicated region for block: B:624:0x03e3 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:635:0x03fe  */
    /* JADX WARN: Removed duplicated region for block: B:667:0x044d  */
    /* JADX WARN: Removed duplicated region for block: B:674:0x045f A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:687:0x0487 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:725:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void e(q0.c r32, boolean r33, boolean r34, boolean r35, boolean r36, q0.e r37, q0.e r38, int r39, boolean r40, s0.c r41, s0.c r42, int r43, int r44, int r45, int r46, float r47, boolean r48, boolean r49, boolean r50, boolean r51, boolean r52, int r53, int r54, int r55, int r56, float r57, boolean r58) {
        /*
            Method dump skipped, instructions count: 1259
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: s0.d.e(q0.c, boolean, boolean, boolean, boolean, q0.e, q0.e, int, boolean, s0.c, s0.c, int, int, int, int, float, boolean, boolean, boolean, boolean, boolean, int, int, int, int, float, boolean):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:158:0x013c, code lost:
        if (r13 != null) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:169:0x0163, code lost:
        if (r13.h() != false) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:178:0x018a, code lost:
        if (r13.h() != false) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:179:0x018c, code lost:
        r11.j();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void f(s0.c.a r11, s0.d r12, s0.c.a r13, int r14) {
        /*
            Method dump skipped, instructions count: 406
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: s0.d.f(s0.c$a, s0.d, s0.c$a, int):void");
    }

    public final void g(c cVar, c cVar2, int i10) {
        if (cVar.f26297d == this) {
            f(cVar.f26298e, cVar2.f26297d, cVar2.f26298e, i10);
        }
    }

    public final void h(q0.c cVar) {
        cVar.l(this.K);
        cVar.l(this.L);
        cVar.l(this.M);
        cVar.l(this.N);
        if (this.f26319d0 > 0) {
            cVar.l(this.O);
        }
    }

    public final void i() {
        if (this.f26318d == null) {
            this.f26318d = new m(this);
        }
        if (this.f26320e == null) {
            this.f26320e = new o(this);
        }
    }

    public c j(c.a aVar) {
        switch (aVar.ordinal()) {
            case 0:
                return null;
            case 1:
                return this.K;
            case 2:
                return this.L;
            case 3:
                return this.M;
            case 4:
                return this.N;
            case 5:
                return this.O;
            case 6:
                return this.R;
            case 7:
                return this.P;
            case 8:
                return this.Q;
            default:
                throw new AssertionError(aVar.name());
        }
    }

    public final int k(int i10) {
        if (i10 == 0) {
            return this.V[0];
        }
        if (i10 != 1) {
            return 0;
        }
        return this.V[1];
    }

    public final int l() {
        if (this.f26331j0 == 8) {
            return 0;
        }
        return this.Y;
    }

    public final d m(int i10) {
        c cVar;
        c cVar2;
        if (i10 != 0) {
            if (i10 == 1 && (cVar2 = (cVar = this.N).f26299f) != null && cVar2.f26299f == cVar) {
                return cVar2.f26297d;
            }
            return null;
        }
        c cVar3 = this.M;
        c cVar4 = cVar3.f26299f;
        if (cVar4 == null || cVar4.f26299f != cVar3) {
            return null;
        }
        return cVar4.f26297d;
    }

    public final q n(int i10) {
        if (i10 == 0) {
            return this.f26318d;
        }
        if (i10 == 1) {
            return this.f26320e;
        }
        return null;
    }

    public void o(StringBuilder sb2) {
        StringBuilder a10 = android.support.v4.media.d.a("  ");
        a10.append(this.f26332k);
        a10.append(":{\n");
        sb2.append(a10.toString());
        sb2.append("    actualWidth:" + this.X);
        sb2.append("\n");
        sb2.append("    actualHeight:" + this.Y);
        sb2.append("\n");
        sb2.append("    actualLeft:" + this.f26315b0);
        sb2.append("\n");
        sb2.append("    actualTop:" + this.f26317c0);
        sb2.append("\n");
        q(sb2, "left", this.K);
        q(sb2, "top", this.L);
        q(sb2, "right", this.M);
        q(sb2, "bottom", this.N);
        q(sb2, "baseline", this.O);
        q(sb2, "centerX", this.P);
        q(sb2, "centerY", this.Q);
        int i10 = this.X;
        int i11 = this.f26321e0;
        int i12 = this.D[0];
        int i13 = this.f26351v;
        int i14 = this.f26348s;
        float f10 = this.f26353x;
        float f11 = this.f26339n0[0];
        p(sb2, "    width", i10, i11, i12, i13, i14, f10);
        int i15 = this.Y;
        int i16 = this.f26323f0;
        int i17 = this.D[1];
        int i18 = this.f26354y;
        int i19 = this.f26349t;
        float f12 = this.A;
        float f13 = this.f26339n0[1];
        p(sb2, "    height", i15, i16, i17, i18, i19, f12);
        float f14 = this.Z;
        int i20 = this.f26313a0;
        if (f14 != 0.0f) {
            sb2.append("    dimensionRatio");
            sb2.append(" :  [");
            sb2.append(f14);
            sb2.append(",");
            sb2.append(i20);
            sb2.append("");
            sb2.append("],\n");
        }
        I(sb2, "    horizontalBias", this.f26325g0, 0.5f);
        I(sb2, "    verticalBias", this.f26327h0, 0.5f);
        H("    horizontalChainStyle", this.f26335l0, 0, sb2);
        H("    verticalChainStyle", this.f26337m0, 0, sb2);
        sb2.append("  }");
    }

    public final int r() {
        if (this.f26331j0 == 8) {
            return 0;
        }
        return this.X;
    }

    public final int s() {
        d dVar = this.W;
        return (dVar == null || !(dVar instanceof e)) ? this.f26315b0 : ((e) dVar).f26362z0 + this.f26315b0;
    }

    public final int t() {
        d dVar = this.W;
        return (dVar == null || !(dVar instanceof e)) ? this.f26317c0 : ((e) dVar).A0 + this.f26317c0;
    }

    public String toString() {
        String str = "";
        StringBuilder a10 = android.support.v4.media.d.a("");
        if (this.f26333k0 != null) {
            str = androidx.activity.e.b(android.support.v4.media.d.a("id: "), this.f26333k0, " ");
        }
        a10.append(str);
        a10.append("(");
        a10.append(this.f26315b0);
        a10.append(", ");
        a10.append(this.f26317c0);
        a10.append(") - (");
        a10.append(this.X);
        a10.append(" x ");
        return a0.q.b(a10, this.Y, ")");
    }

    public final boolean u(int i10) {
        if (i10 == 0) {
            return (this.K.f26299f != null ? 1 : 0) + (this.M.f26299f != null ? 1 : 0) < 2;
        }
        return ((this.L.f26299f != null ? 1 : 0) + (this.N.f26299f != null ? 1 : 0)) + (this.O.f26299f != null ? 1 : 0) < 2;
    }

    public final boolean v(int i10, int i11) {
        c cVar;
        c cVar2;
        if (i10 == 0) {
            c cVar3 = this.K.f26299f;
            if (cVar3 != null && cVar3.f26296c && (cVar2 = this.M.f26299f) != null && cVar2.f26296c) {
                if ((cVar2.d() - this.M.e()) - (this.K.e() + this.K.f26299f.d()) >= i11) {
                    return true;
                }
                return false;
            }
        } else {
            c cVar4 = this.L.f26299f;
            if (cVar4 != null && cVar4.f26296c && (cVar = this.N.f26299f) != null && cVar.f26296c) {
                if ((cVar.d() - this.N.e()) - (this.L.e() + this.L.f26299f.d()) >= i11) {
                    return true;
                }
                return false;
            }
        }
        return false;
    }

    public final void w(c.a aVar, d dVar, c.a aVar2, int i10, int i11) {
        j(aVar).b(dVar.j(aVar2), i10, i11, true);
    }

    public final boolean x(int i10) {
        c cVar;
        c cVar2;
        int i11 = i10 * 2;
        c[] cVarArr = this.S;
        c cVar3 = cVarArr[i11];
        c cVar4 = cVar3.f26299f;
        return (cVar4 == null || cVar4.f26299f == cVar3 || (cVar2 = (cVar = cVarArr[i11 + 1]).f26299f) == null || cVar2.f26299f != cVar) ? false : true;
    }

    public final boolean y() {
        c cVar = this.K;
        c cVar2 = cVar.f26299f;
        if (cVar2 == null || cVar2.f26299f != cVar) {
            c cVar3 = this.M;
            c cVar4 = cVar3.f26299f;
            return cVar4 != null && cVar4.f26299f == cVar3;
        }
        return true;
    }

    public final boolean z() {
        c cVar = this.L;
        c cVar2 = cVar.f26299f;
        if (cVar2 == null || cVar2.f26299f != cVar) {
            c cVar3 = this.N;
            c cVar4 = cVar3.f26299f;
            return cVar4 != null && cVar4.f26299f == cVar3;
        }
        return true;
    }
}
