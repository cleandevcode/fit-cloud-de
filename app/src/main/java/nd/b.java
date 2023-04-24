package nd;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* loaded from: classes.dex */
public final class b implements Parcelable {
    public static final Parcelable.Creator<b> CREATOR = new a();
    public int A;
    public int B;
    public int C;
    public byte D;
    public byte E;
    public byte F;
    public byte H;
    public int L;
    public int M;
    public int Q;
    public byte U;
    public bd.a V;
    public boolean W;
    public int X;
    public byte Y;
    public nd.a Z;

    /* renamed from: a */
    public byte f22230a;

    /* renamed from: b */
    public byte f22231b;

    /* renamed from: c */
    public int f22232c;

    /* renamed from: c0 */
    public nd.a f22233c0;

    /* renamed from: d */
    public int f22234d;

    /* renamed from: d0 */
    public ad.a f22235d0;

    /* renamed from: e */
    public String f22236e;

    /* renamed from: e0 */
    public byte f22237e0;

    /* renamed from: f */
    public String f22238f;

    /* renamed from: f0 */
    public byte f22239f0;

    /* renamed from: g */
    public String f22240g;

    /* renamed from: g0 */
    public md.a f22241g0;

    /* renamed from: h */
    public String f22242h;

    /* renamed from: h0 */
    public md.d f22243h0;

    /* renamed from: i */
    public int f22244i;

    /* renamed from: i0 */
    public md.b f22245i0;

    /* renamed from: j */
    public int f22246j;

    /* renamed from: j0 */
    public int f22247j0;

    /* renamed from: k */
    public String f22248k;

    /* renamed from: k0 */
    public int f22249k0;

    /* renamed from: l */
    public String f22250l;

    /* renamed from: l0 */
    public byte f22251l0;

    /* renamed from: m */
    public String f22252m;

    /* renamed from: m0 */
    public qd.c f22253m0;

    /* renamed from: n */
    public d f22254n;

    /* renamed from: n0 */
    public boolean f22255n0;

    /* renamed from: o */
    public c f22256o;

    /* renamed from: o0 */
    public f f22257o0;

    /* renamed from: p */
    public e f22258p;

    /* renamed from: p0 */
    public byte f22259p0;

    /* renamed from: q */
    public byte[] f22260q;

    /* renamed from: r */
    public byte[] f22261r;

    /* renamed from: s */
    public byte[] f22262s;

    /* renamed from: t */
    public List<g> f22263t;

    /* renamed from: u */
    public List<g> f22264u;

    /* renamed from: v */
    public byte f22265v;

    /* renamed from: w */
    public byte f22266w;

    /* renamed from: x */
    public int f22267x;

    /* renamed from: y */
    public int f22268y;

    /* renamed from: z */
    public boolean f22269z;

    /* loaded from: classes.dex */
    public class a implements Parcelable.Creator<b> {
        @Override // android.os.Parcelable.Creator
        public final b createFromParcel(Parcel parcel) {
            return new b(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final b[] newArray(int i10) {
            return new b[i10];
        }
    }

    public b() {
        this.f22232c = 0;
        this.f22234d = 0;
        this.f22236e = "";
        this.f22238f = "";
        this.f22240g = "";
        this.f22242h = "";
        this.f22244i = 0;
        this.f22246j = 0;
        this.f22248k = "";
        this.f22250l = "";
        this.f22252m = "";
        this.f22265v = (byte) 0;
        this.f22266w = (byte) 0;
        this.f22269z = false;
        this.A = 0;
        this.B = -1;
        this.C = -1;
        this.D = (byte) 0;
        this.E = (byte) 0;
        this.F = (byte) 0;
        this.H = (byte) 0;
        this.f22237e0 = (byte) 0;
        this.f22247j0 = 0;
        this.f22249k0 = 0;
        this.f22251l0 = (byte) 0;
    }

    public b(Parcel parcel) {
        this.f22232c = 0;
        this.f22234d = 0;
        this.f22236e = "";
        this.f22238f = "";
        this.f22240g = "";
        this.f22242h = "";
        this.f22244i = 0;
        this.f22246j = 0;
        this.f22248k = "";
        this.f22250l = "";
        this.f22252m = "";
        this.f22265v = (byte) 0;
        this.f22266w = (byte) 0;
        this.f22269z = false;
        this.A = 0;
        this.B = -1;
        this.C = -1;
        this.D = (byte) 0;
        this.E = (byte) 0;
        this.F = (byte) 0;
        this.H = (byte) 0;
        this.f22237e0 = (byte) 0;
        this.f22247j0 = 0;
        this.f22249k0 = 0;
        this.f22251l0 = (byte) 0;
        this.f22230a = parcel.readByte();
        this.f22231b = parcel.readByte();
        this.f22232c = parcel.readInt();
        this.f22234d = parcel.readInt();
        this.f22236e = parcel.readString();
        this.f22238f = parcel.readString();
        this.f22240g = parcel.readString();
        this.f22242h = parcel.readString();
        this.f22244i = parcel.readInt();
        this.f22246j = parcel.readInt();
        this.f22248k = parcel.readString();
        this.f22250l = parcel.readString();
        this.f22252m = parcel.readString();
        this.f22254n = (d) parcel.readParcelable(d.class.getClassLoader());
        this.f22256o = (c) parcel.readParcelable(c.class.getClassLoader());
        this.f22258p = (e) parcel.readParcelable(e.class.getClassLoader());
        this.f22260q = parcel.createByteArray();
        this.f22261r = parcel.createByteArray();
        this.f22262s = parcel.createByteArray();
        Parcelable.Creator<g> creator = g.CREATOR;
        this.f22263t = parcel.createTypedArrayList(creator);
        this.f22264u = parcel.createTypedArrayList(creator);
        this.f22265v = parcel.readByte();
        this.f22266w = parcel.readByte();
        this.f22267x = parcel.readInt();
        this.f22268y = parcel.readInt();
        this.f22269z = parcel.readByte() != 0;
        this.A = parcel.readInt();
        this.B = parcel.readInt();
        this.C = parcel.readInt();
        this.D = parcel.readByte();
        this.E = parcel.readByte();
        this.F = parcel.readByte();
        this.H = parcel.readByte();
        this.L = parcel.readInt();
        this.M = parcel.readInt();
        this.Q = parcel.readInt();
        this.U = parcel.readByte();
        this.V = (bd.a) parcel.readParcelable(bd.a.class.getClassLoader());
        this.W = parcel.readByte() != 0;
        this.X = parcel.readInt();
        this.Y = parcel.readByte();
        this.Z = (nd.a) parcel.readParcelable(nd.a.class.getClassLoader());
        this.f22235d0 = (ad.a) parcel.readParcelable(ad.a.class.getClassLoader());
        this.f22237e0 = parcel.readByte();
        this.f22239f0 = parcel.readByte();
        this.f22241g0 = (md.a) parcel.readParcelable(md.a.class.getClassLoader());
        this.f22243h0 = (md.d) parcel.readParcelable(md.d.class.getClassLoader());
        this.f22245i0 = (md.b) parcel.readParcelable(md.b.class.getClassLoader());
        this.f22247j0 = parcel.readInt();
        this.f22249k0 = parcel.readInt();
        this.f22251l0 = parcel.readByte();
        this.f22253m0 = (qd.c) parcel.readParcelable(qd.c.class.getClassLoader());
        this.f22255n0 = parcel.readByte() != 0;
        this.f22257o0 = (f) parcel.readParcelable(f.class.getClassLoader());
        this.f22259p0 = parcel.readByte();
    }

    public final d a() {
        if (this.f22254n == null) {
            this.f22254n = new d();
        }
        return this.f22254n;
    }

    public final boolean b() {
        return this.D == 1;
    }

    public final void d(e eVar) {
        boolean z10;
        this.f22258p = eVar;
        boolean z11 = false;
        if (eVar != null) {
            ge.b.n(eVar.toString());
            int i10 = 1;
            if (eVar.f22301i == 1) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!z10) {
                if (eVar.f22309m == 1) {
                    z11 = true;
                }
                if (!z11) {
                    i10 = 255;
                }
                this.f22247j0 = i10;
                return;
            }
        }
        this.f22247j0 = 0;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final void e(md.c cVar) {
        short s10;
        md.b bVar = this.f22245i0;
        if (bVar != null) {
            boolean z10 = cVar.f20469e;
            bVar.f20464h = z10;
            if (z10) {
                byte b10 = cVar.f20465a;
                if (b10 != -1) {
                    bVar.f20458b = b10;
                    bVar.f20459c = b10;
                } else {
                    byte b11 = cVar.f20466b;
                    bVar.f20458b = b11;
                    bVar.f20459c = b11;
                }
                if (b10 != -1) {
                    s10 = cVar.f20467c;
                } else {
                    s10 = cVar.f20468d;
                }
                bVar.f20461e = s10;
            } else {
                byte b12 = cVar.f20465a;
                if (b12 != -1) {
                    bVar.f20458b = b12;
                }
                byte b13 = cVar.f20466b;
                if (b13 != -1) {
                    bVar.f20459c = b13;
                }
                short s11 = cVar.f20467c;
                if (s11 != -1) {
                    bVar.f20461e = s11;
                }
                s10 = cVar.f20468d;
                if (s10 == -1) {
                    return;
                }
            }
            bVar.f20462f = s10;
        }
    }

    public final void f(md.a aVar) {
        this.f22241g0 = aVar;
        if (aVar != null) {
            this.f22239f0 = aVar.f20453b;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:53:0x0037, code lost:
        if (r0 != null) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0043, code lost:
        if (r0 != null) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0045, code lost:
        r0.d(r5.f16768b);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void g(id.a r5) {
        /*
            r4 = this;
            byte r0 = r5.f16767a
            r4.f22251l0 = r0
            r1 = 1
            r2 = 0
            r3 = 3
            if (r0 != r3) goto L29
            r4.f22237e0 = r2
            r4.Y = r2
            r4.f22239f0 = r1
            md.a r0 = r4.f22241g0
            if (r0 == 0) goto L51
            int r5 = r5.f16768b
            r1 = r5 & 255(0xff, float:3.57E-43)
            byte r1 = (byte) r1
            r2 = -1
            if (r1 == r2) goto L1e
            r0.f20454c = r5
            goto L25
        L1e:
            byte[] r5 = r0.f20456e
            if (r5 == 0) goto L51
            int r5 = r5.length
            if (r5 <= 0) goto L51
        L25:
            r0.a()
            goto L51
        L29:
            if (r0 != r1) goto L2e
            r4.f22237e0 = r1
            goto L4d
        L2e:
            r3 = 2
            if (r0 != r3) goto L3a
            r4.f22237e0 = r2
            r4.Y = r1
            nd.a r0 = r4.Z
            if (r0 == 0) goto L4f
            goto L45
        L3a:
            r3 = 4
            if (r0 != r3) goto L4b
            r4.f22237e0 = r1
            r4.Y = r1
            nd.a r0 = r4.f22233c0
            if (r0 == 0) goto L4f
        L45:
            int r5 = r5.f16768b
            r0.d(r5)
            goto L4f
        L4b:
            r4.f22237e0 = r2
        L4d:
            r4.Y = r2
        L4f:
            r4.f22239f0 = r2
        L51:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: nd.b.g(id.a):void");
    }

    public final void h(fd.a aVar) {
        this.f22269z = aVar.f14232a;
        this.A = aVar.f14233b;
        this.B = aVar.f14234c;
        this.C = aVar.f14235d;
    }

    /* JADX WARN: Code restructure failed: missing block: B:324:0x0120, code lost:
        if (r3 != false) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:421:0x02d2, code lost:
        if (r1.f22280c == 1) goto L132;
     */
    /* JADX WARN: Code restructure failed: missing block: B:425:0x02dc, code lost:
        if (r1.f22280c == 1) goto L139;
     */
    /* JADX WARN: Code restructure failed: missing block: B:428:0x02ee, code lost:
        if (r1.f22280c == 1) goto L132;
     */
    /* JADX WARN: Code restructure failed: missing block: B:434:0x0308, code lost:
        if (r1.f22280c == 1) goto L149;
     */
    /* JADX WARN: Code restructure failed: missing block: B:443:0x0333, code lost:
        if (r1.f22280c == 1) goto L149;
     */
    /* JADX WARN: Code restructure failed: missing block: B:444:0x0335, code lost:
        r2 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:445:0x0337, code lost:
        r2 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:455:0x035b, code lost:
        if (r1.f22280c == 1) goto L139;
     */
    /* JADX WARN: Code restructure failed: missing block: B:456:0x035d, code lost:
        r2 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:457:0x035f, code lost:
        r2 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:458:0x0360, code lost:
        r7.f22332e = r2;
        r7.f22330c = r1.f22284g;
        r7.f22331d = r1.f22286i;
        r7.f22335h = true;
        r2 = r1.f22282e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:461:0x0381, code lost:
        if (r1.f22280c == 1) goto L132;
     */
    /* JADX WARN: Code restructure failed: missing block: B:462:0x0383, code lost:
        r2 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:463:0x0385, code lost:
        r2 = false;
     */
    /* JADX WARN: Removed duplicated region for block: B:329:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:356:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:369:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:372:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:373:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:376:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:377:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:381:0x023e  */
    /* JADX WARN: Removed duplicated region for block: B:386:0x0247  */
    /* JADX WARN: Removed duplicated region for block: B:402:0x0291  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String toString() {
        /*
            Method dump skipped, instructions count: 940
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: nd.b.toString():java.lang.String");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeByte(this.f22230a);
        parcel.writeByte(this.f22231b);
        parcel.writeInt(this.f22232c);
        parcel.writeInt(this.f22234d);
        parcel.writeString(this.f22236e);
        parcel.writeString(this.f22238f);
        parcel.writeString(this.f22240g);
        parcel.writeString(this.f22242h);
        parcel.writeInt(this.f22244i);
        parcel.writeInt(this.f22246j);
        parcel.writeString(this.f22248k);
        parcel.writeString(this.f22250l);
        parcel.writeString(this.f22252m);
        parcel.writeParcelable(this.f22254n, i10);
        parcel.writeParcelable(this.f22256o, i10);
        parcel.writeParcelable(this.f22258p, i10);
        parcel.writeByteArray(this.f22260q);
        parcel.writeByteArray(this.f22261r);
        parcel.writeByteArray(this.f22262s);
        parcel.writeTypedList(this.f22263t);
        parcel.writeTypedList(this.f22264u);
        parcel.writeByte(this.f22265v);
        parcel.writeByte(this.f22266w);
        parcel.writeInt(this.f22267x);
        parcel.writeInt(this.f22268y);
        parcel.writeByte(this.f22269z ? (byte) 1 : (byte) 0);
        parcel.writeInt(this.A);
        parcel.writeInt(this.B);
        parcel.writeInt(this.C);
        parcel.writeByte(this.D);
        parcel.writeByte(this.E);
        parcel.writeByte(this.F);
        parcel.writeByte(this.H);
        parcel.writeInt(this.L);
        parcel.writeInt(this.M);
        parcel.writeInt(this.Q);
        parcel.writeByte(this.U);
        parcel.writeParcelable(this.V, i10);
        parcel.writeByte(this.W ? (byte) 1 : (byte) 0);
        parcel.writeInt(this.X);
        parcel.writeByte(this.Y);
        parcel.writeParcelable(this.Z, i10);
        parcel.writeParcelable(this.f22235d0, i10);
        parcel.writeByte(this.f22237e0);
        parcel.writeByte(this.f22239f0);
        parcel.writeParcelable(this.f22241g0, i10);
        parcel.writeParcelable(this.f22243h0, i10);
        parcel.writeParcelable(this.f22245i0, i10);
        parcel.writeInt(this.f22247j0);
        parcel.writeInt(this.f22249k0);
        parcel.writeByte(this.f22251l0);
        parcel.writeParcelable(this.f22253m0, i10);
        parcel.writeByte(this.f22255n0 ? (byte) 1 : (byte) 0);
        parcel.writeParcelable(this.f22257o0, i10);
        parcel.writeByte(this.f22259p0);
    }
}
