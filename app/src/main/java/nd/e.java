package nd;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Locale;

/* loaded from: classes.dex */
public final class e implements Parcelable {
    public static final Parcelable.Creator<e> CREATOR = new a();
    public int A;
    public int B;
    public int C;
    public int D;
    public int E;
    public int F;
    public int H;
    public int L;
    public int M;
    public int Q;
    public int U;
    public int V;
    public int W;
    public int X;
    public int Y;
    public int Z;

    /* renamed from: a */
    public int f22287a;

    /* renamed from: b */
    public int f22288b;

    /* renamed from: c */
    public int f22289c;

    /* renamed from: c0 */
    public int f22290c0;

    /* renamed from: d */
    public int f22291d;

    /* renamed from: d0 */
    public int f22292d0;

    /* renamed from: e */
    public int f22293e;

    /* renamed from: e0 */
    public int f22294e0;

    /* renamed from: f */
    public int f22295f;

    /* renamed from: f0 */
    public int f22296f0;

    /* renamed from: g */
    public int f22297g;

    /* renamed from: g0 */
    public int f22298g0;

    /* renamed from: h */
    public int f22299h;

    /* renamed from: h0 */
    public int f22300h0;

    /* renamed from: i */
    public int f22301i;

    /* renamed from: i0 */
    public int f22302i0;

    /* renamed from: j */
    public int f22303j;

    /* renamed from: j0 */
    public int f22304j0;

    /* renamed from: k */
    public int f22305k;

    /* renamed from: k0 */
    public int f22306k0;

    /* renamed from: l */
    public int f22307l;

    /* renamed from: l0 */
    public int f22308l0;

    /* renamed from: m */
    public int f22309m;

    /* renamed from: n */
    public int f22310n;

    /* renamed from: o */
    public int f22311o;

    /* renamed from: p */
    public int f22312p;

    /* renamed from: q */
    public int f22313q;

    /* renamed from: r */
    public int f22314r;

    /* renamed from: s */
    public int f22315s;

    /* renamed from: t */
    public int f22316t;

    /* renamed from: u */
    public int f22317u;

    /* renamed from: v */
    public int f22318v;

    /* renamed from: w */
    public int f22319w;

    /* renamed from: x */
    public int f22320x;

    /* renamed from: y */
    public int f22321y;

    /* renamed from: z */
    public int f22322z;

    /* loaded from: classes.dex */
    public class a implements Parcelable.Creator<e> {
        @Override // android.os.Parcelable.Creator
        public final e createFromParcel(Parcel parcel) {
            return new e(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final e[] newArray(int i10) {
            return new e[i10];
        }
    }

    public e(Parcel parcel) {
        this.f22287a = parcel.readInt();
        this.f22288b = parcel.readInt();
        this.f22289c = parcel.readInt();
        this.f22291d = parcel.readInt();
        this.f22293e = parcel.readInt();
        this.f22295f = parcel.readInt();
        this.f22297g = parcel.readInt();
        this.f22299h = parcel.readInt();
        this.f22301i = parcel.readInt();
        this.f22303j = parcel.readInt();
        this.f22305k = parcel.readInt();
        this.f22307l = parcel.readInt();
        this.f22309m = parcel.readInt();
        this.f22310n = parcel.readInt();
        this.f22311o = parcel.readInt();
        this.f22312p = parcel.readInt();
        this.f22313q = parcel.readInt();
        this.f22314r = parcel.readInt();
        this.f22315s = parcel.readInt();
        this.f22316t = parcel.readInt();
        this.f22317u = parcel.readInt();
        this.f22318v = parcel.readInt();
        this.f22319w = parcel.readInt();
        this.f22320x = parcel.readInt();
        this.f22321y = parcel.readInt();
        this.f22322z = parcel.readInt();
        this.A = parcel.readInt();
        this.B = parcel.readInt();
        this.C = parcel.readInt();
        this.D = parcel.readInt();
        this.E = parcel.readInt();
        this.F = parcel.readInt();
        this.H = parcel.readInt();
        this.L = parcel.readInt();
        this.M = parcel.readInt();
        this.Q = parcel.readInt();
        this.U = parcel.readInt();
        this.V = parcel.readInt();
        this.W = parcel.readInt();
        this.X = parcel.readInt();
        this.Y = parcel.readInt();
        this.Z = parcel.readInt();
        this.f22290c0 = parcel.readInt();
        this.f22292d0 = parcel.readInt();
        this.f22294e0 = parcel.readInt();
        this.f22296f0 = parcel.readInt();
        this.f22298g0 = parcel.readInt();
        this.f22300h0 = parcel.readInt();
        this.f22302i0 = parcel.readInt();
        this.f22304j0 = parcel.readInt();
        this.f22306k0 = parcel.readInt();
        this.f22308l0 = parcel.readInt();
    }

    public e(byte[] bArr) {
        if (bArr.length >= 1) {
            byte b10 = bArr[0];
            this.f22287a = b10 & 1;
            this.f22288b = (b10 & 2) >> 1;
            this.f22289c = (b10 & 4) >> 2;
            this.f22291d = (b10 & 8) >> 3;
            this.f22293e = (b10 & 16) >> 4;
            this.f22295f = (b10 & 32) >> 5;
        }
        if (bArr.length >= 2) {
            byte b11 = bArr[1];
            this.f22297g = b11 & 1;
            this.f22299h = (b11 & 2) >> 1;
            this.f22301i = (b11 & 4) >> 2;
            this.f22303j = (b11 & 8) >> 3;
            this.f22305k = (b11 & 16) >> 4;
            this.f22307l = (b11 & 32) >> 5;
            this.f22309m = (b11 & 64) >> 6;
            this.f22310n = (b11 & 128) >> 7;
        }
        if (bArr.length >= 3) {
            byte b12 = bArr[2];
            this.f22311o = b12 & 1;
            this.f22312p = (b12 & 2) >> 1;
            this.f22313q = (b12 & 4) >> 2;
            this.f22314r = (b12 & 8) >> 3;
            this.f22315s = (b12 & 16) >> 4;
            this.f22316t = (b12 & 32) >> 5;
            this.f22317u = (b12 & 64) >> 6;
            this.f22318v = (b12 & 128) >> 7;
        }
        if (bArr.length >= 4) {
            byte b13 = bArr[3];
            this.f22319w = b13 & 1;
            this.f22320x = (b13 & 2) >> 1;
            this.f22321y = (b13 & 4) >> 2;
            this.f22322z = (b13 & 8) >> 3;
            this.A = (b13 & 16) >> 4;
            this.B = (b13 & 32) >> 5;
            this.C = (b13 & 64) >> 6;
            this.D = (b13 & 128) >> 7;
        }
        if (bArr.length >= 5) {
            byte b14 = bArr[4];
            this.E = b14 & 1;
            this.F = (b14 & 2) >> 1;
            this.H = (b14 & 4) >> 2;
            this.L = (b14 & 8) >> 3;
            this.M = (b14 & 16) >> 4;
            this.Q = (b14 & 32) >> 5;
            this.U = (b14 & 64) >> 6;
            this.V = (b14 & 128) >> 7;
        }
        if (bArr.length >= 6) {
            byte b15 = bArr[5];
            this.W = b15 & 1;
            this.X = (b15 & 2) >> 1;
            this.Y = (b15 & 4) >> 2;
            this.Z = (b15 & 8) >> 3;
            this.f22290c0 = (b15 & 16) >> 4;
            this.f22292d0 = (b15 & 32) >> 5;
            this.f22294e0 = (b15 & 64) >> 6;
            this.f22296f0 = (b15 & 128) >> 7;
        }
        if (bArr.length >= 7) {
            byte b16 = bArr[6];
            this.f22298g0 = b16 & 1;
            this.f22300h0 = (b16 & 2) >> 1;
            this.f22302i0 = (b16 & 4) >> 2;
            this.f22304j0 = (b16 & 8) >> 3;
            this.f22306k0 = (b16 & 16) >> 4;
            this.f22308l0 = (b16 & 32) >> 5;
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder a10 = p.a.a("DspCapability:", "\n========================================================================================================");
        Locale locale = Locale.US;
        a10.append(String.format(locale, "\n|%d｜%d｜%d｜%d｜%d｜%d｜", Integer.valueOf(this.f22287a), Integer.valueOf(this.f22288b), Integer.valueOf(this.f22289c), Integer.valueOf(this.f22291d), Integer.valueOf(this.f22293e), Integer.valueOf(this.f22295f)));
        a10.append("\n--------------------------------------------------------------------------------------------------------");
        a10.append(String.format(locale, "\n|%d｜%d｜%d｜%d｜%d｜%d｜%d｜%d｜", Integer.valueOf(this.f22297g), Integer.valueOf(this.f22299h), Integer.valueOf(this.f22301i), Integer.valueOf(this.f22303j), Integer.valueOf(this.f22305k), Integer.valueOf(this.f22307l), Integer.valueOf(this.f22309m), Integer.valueOf(this.f22310n)));
        a10.append("\n--------------------------------------------------------------------------------------------------------");
        a10.append(String.format(locale, "\n|%d｜%d｜%d｜%d｜%d｜%d｜%d｜%d｜", Integer.valueOf(this.f22311o), Integer.valueOf(this.f22312p), Integer.valueOf(this.f22313q), Integer.valueOf(this.f22314r), Integer.valueOf(this.f22315s), Integer.valueOf(this.f22316t), Integer.valueOf(this.f22317u), Integer.valueOf(this.f22318v)));
        a10.append("\n--------------------------------------------------------------------------------------------------------");
        a10.append(String.format(locale, "\n|%d｜%d｜%d｜%d｜%d｜%d｜%d｜", Integer.valueOf(this.f22319w), Integer.valueOf(this.f22320x), Integer.valueOf(this.f22321y), Integer.valueOf(this.f22322z), Integer.valueOf(this.A), Integer.valueOf(this.B), Integer.valueOf(this.C)));
        a10.append("\n--------------------------------------------------------------------------------------------------------");
        a10.append(String.format(locale, "\n|%d｜%d｜%d｜%d｜%d｜%d｜%d｜%d｜", Integer.valueOf(this.E), Integer.valueOf(this.F), Integer.valueOf(this.H), Integer.valueOf(this.L), Integer.valueOf(this.M), Integer.valueOf(this.Q), Integer.valueOf(this.U), Integer.valueOf(this.V)));
        a10.append("\n--------------------------------------------------------------------------------------------------------");
        a10.append(String.format(locale, "\n|%d｜%d｜%d｜%d｜%d｜%d｜", Integer.valueOf(this.W), Integer.valueOf(this.X), Integer.valueOf(this.Y), Integer.valueOf(this.Z), Integer.valueOf(this.f22290c0), Integer.valueOf(this.f22292d0)));
        a10.append("\n--------------------------------------------------------------------------------------------------------");
        return f3.a.a(locale, "\n|%d｜%d｜%d｜%d｜%d｜%d｜", new Object[]{Integer.valueOf(this.f22298g0), Integer.valueOf(this.f22300h0), Integer.valueOf(this.f22302i0), Integer.valueOf(this.f22304j0), Integer.valueOf(this.f22306k0), Integer.valueOf(this.f22308l0)}, a10, "\n========================================================================================================");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f22287a);
        parcel.writeInt(this.f22288b);
        parcel.writeInt(this.f22289c);
        parcel.writeInt(this.f22291d);
        parcel.writeInt(this.f22293e);
        parcel.writeInt(this.f22295f);
        parcel.writeInt(this.f22297g);
        parcel.writeInt(this.f22299h);
        parcel.writeInt(this.f22301i);
        parcel.writeInt(this.f22303j);
        parcel.writeInt(this.f22305k);
        parcel.writeInt(this.f22307l);
        parcel.writeInt(this.f22309m);
        parcel.writeInt(this.f22310n);
        parcel.writeInt(this.f22311o);
        parcel.writeInt(this.f22312p);
        parcel.writeInt(this.f22313q);
        parcel.writeInt(this.f22314r);
        parcel.writeInt(this.f22315s);
        parcel.writeInt(this.f22316t);
        parcel.writeInt(this.f22317u);
        parcel.writeInt(this.f22318v);
        parcel.writeInt(this.f22319w);
        parcel.writeInt(this.f22320x);
        parcel.writeInt(this.f22321y);
        parcel.writeInt(this.f22322z);
        parcel.writeInt(this.A);
        parcel.writeInt(this.B);
        parcel.writeInt(this.C);
        parcel.writeInt(this.D);
        parcel.writeInt(this.E);
        parcel.writeInt(this.F);
        parcel.writeInt(this.H);
        parcel.writeInt(this.L);
        parcel.writeInt(this.M);
        parcel.writeInt(this.Q);
        parcel.writeInt(this.U);
        parcel.writeInt(this.V);
        parcel.writeInt(this.W);
        parcel.writeInt(this.X);
        parcel.writeInt(this.Y);
        parcel.writeInt(this.Z);
        parcel.writeInt(this.f22290c0);
        parcel.writeInt(this.f22292d0);
        parcel.writeInt(this.f22294e0);
        parcel.writeInt(this.f22296f0);
        parcel.writeInt(this.f22298g0);
        parcel.writeInt(this.f22300h0);
        parcel.writeInt(this.f22302i0);
        parcel.writeInt(this.f22304j0);
        parcel.writeInt(this.f22306k0);
        parcel.writeInt(this.f22308l0);
    }
}
