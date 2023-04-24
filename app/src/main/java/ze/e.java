package ze;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.appcompat.widget.u0;
import java.util.Locale;

/* loaded from: classes.dex */
public final class e implements Parcelable {
    public static final Parcelable.Creator<e> CREATOR = new a();
    public int A;
    public int B;
    public int C;
    public long D;
    public boolean E;
    public boolean F;
    public int H;
    public int L;
    public String M;
    public String Q;
    public String U;
    public String V;
    public c W;
    public String X;
    public int Y;
    public int Z;

    /* renamed from: a */
    public int f32277a;

    /* renamed from: b */
    public int f32278b;

    /* renamed from: c */
    public int f32279c;

    /* renamed from: c0 */
    public int f32280c0;

    /* renamed from: d */
    public int f32281d;

    /* renamed from: d0 */
    public int f32282d0;

    /* renamed from: e */
    public String f32283e;

    /* renamed from: e0 */
    public int f32284e0;

    /* renamed from: f */
    public int f32285f;

    /* renamed from: f0 */
    public boolean f32286f0;

    /* renamed from: g */
    public String f32287g;

    /* renamed from: g0 */
    public int f32288g0;

    /* renamed from: h */
    public String f32289h;

    /* renamed from: h0 */
    public boolean f32290h0;

    /* renamed from: i */
    public int f32291i;

    /* renamed from: i0 */
    public boolean f32292i0;

    /* renamed from: j */
    public int f32293j;

    /* renamed from: j0 */
    public boolean f32294j0;

    /* renamed from: k */
    public int f32295k;

    /* renamed from: k0 */
    public long f32296k0;

    /* renamed from: l */
    public boolean f32297l;

    /* renamed from: l0 */
    public int f32298l0;

    /* renamed from: m */
    public boolean f32299m;

    /* renamed from: m0 */
    public h f32300m0;

    /* renamed from: n */
    public boolean f32301n;

    /* renamed from: n0 */
    public f f32302n0;

    /* renamed from: o */
    public boolean f32303o;

    /* renamed from: p */
    public Long f32304p;

    /* renamed from: q */
    public int f32305q;

    /* renamed from: r */
    public int f32306r;

    /* renamed from: s */
    public byte[] f32307s;

    /* renamed from: t */
    public int f32308t;

    /* renamed from: u */
    public boolean f32309u;

    /* renamed from: v */
    public boolean f32310v;

    /* renamed from: w */
    public boolean f32311w;

    /* renamed from: x */
    public int f32312x;

    /* renamed from: y */
    public int f32313y;

    /* renamed from: z */
    public boolean f32314z;

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

    public e() {
        this.f32277a = 0;
        this.f32278b = 0;
        this.f32279c = 0;
        this.f32281d = 3;
        this.f32285f = 0;
        this.f32289h = "BIN";
        this.f32291i = -1;
        this.f32293j = 7;
        this.f32295k = 0;
        this.f32297l = true;
        this.f32299m = false;
        this.f32301n = false;
        this.f32303o = false;
        this.f32304p = 0L;
        this.f32305q = 0;
        this.f32306r = 7;
        this.f32308t = 20;
        this.f32309u = false;
        this.f32310v = true;
        this.f32311w = false;
        this.f32312x = 0;
        this.f32313y = 50;
        this.f32314z = false;
        this.A = 30;
        this.B = 0;
        this.C = 3;
        this.D = 32000L;
        this.E = false;
        this.F = true;
        this.H = 6;
        this.L = 93;
        this.M = "0000d0ff-3c17-d293-8e48-14fe2e4da212";
        this.Q = "00006287-3c17-d293-8e48-14fe2e4da212";
        this.U = "00006387-3c17-d293-8e48-14fe2e4da212";
        this.V = "00006487-3c17-d293-8e48-14fe2e4da212";
        this.Y = 130;
        this.Z = 2;
        this.f32280c0 = 2;
        this.f32282d0 = 0;
        this.f32284e0 = 6;
        this.f32286f0 = true;
        this.f32288g0 = 0;
        this.f32296k0 = 10000L;
        this.f32279c = 0;
        ge.b.n(String.format(Locale.US, "\tmaxInterval=%d(0x%04X),minInterval=%d(0x%04X),latency=%d(0x%04X),timeout=%d(0x%04X),\n", 17, 17, 6, 6, 0, 0, 500, 500));
        this.W = new c(17, 6, 0, 500);
        StringBuilder a10 = android.support.v4.media.d.a("init default:");
        a10.append(this.W.toString());
        ge.b.n(a10.toString());
        this.f32302n0 = new f(false);
        StringBuilder a11 = android.support.v4.media.d.a("init default:");
        a11.append(this.f32302n0.toString());
        ge.b.n(a11.toString());
    }

    public e(Parcel parcel) {
        this.f32277a = 0;
        this.f32278b = 0;
        this.f32279c = 0;
        this.f32281d = 3;
        this.f32285f = 0;
        this.f32289h = "BIN";
        this.f32291i = -1;
        this.f32293j = 7;
        this.f32295k = 0;
        this.f32297l = true;
        this.f32299m = false;
        this.f32301n = false;
        this.f32303o = false;
        this.f32304p = 0L;
        this.f32305q = 0;
        this.f32306r = 7;
        this.f32308t = 20;
        this.f32309u = false;
        this.f32310v = true;
        this.f32311w = false;
        this.f32312x = 0;
        this.f32313y = 50;
        this.f32314z = false;
        this.A = 30;
        this.B = 0;
        this.C = 3;
        this.D = 32000L;
        this.E = false;
        this.F = true;
        this.H = 6;
        this.L = 93;
        this.M = "0000d0ff-3c17-d293-8e48-14fe2e4da212";
        this.Q = "00006287-3c17-d293-8e48-14fe2e4da212";
        this.U = "00006387-3c17-d293-8e48-14fe2e4da212";
        this.V = "00006487-3c17-d293-8e48-14fe2e4da212";
        this.Y = 130;
        this.Z = 2;
        this.f32280c0 = 2;
        this.f32282d0 = 0;
        this.f32284e0 = 6;
        this.f32286f0 = true;
        this.f32288g0 = 0;
        this.f32296k0 = 10000L;
        this.f32277a = parcel.readInt();
        this.f32278b = parcel.readInt();
        this.f32279c = parcel.readInt();
        this.f32281d = parcel.readInt();
        this.f32283e = parcel.readString();
        this.f32285f = parcel.readInt();
        this.f32287g = parcel.readString();
        this.f32289h = parcel.readString();
        this.f32291i = parcel.readInt();
        this.f32293j = parcel.readInt();
        this.f32295k = parcel.readInt();
        this.f32297l = parcel.readByte() != 0;
        this.f32299m = parcel.readByte() != 0;
        this.f32301n = parcel.readByte() != 0;
        this.f32303o = parcel.readByte() != 0;
        this.f32304p = parcel.readByte() == 0 ? null : Long.valueOf(parcel.readLong());
        this.f32305q = parcel.readInt();
        this.f32306r = parcel.readInt();
        this.f32307s = parcel.createByteArray();
        this.f32308t = parcel.readInt();
        this.f32309u = parcel.readByte() != 0;
        this.f32310v = parcel.readByte() != 0;
        this.f32311w = parcel.readByte() != 0;
        this.f32312x = parcel.readInt();
        this.f32313y = parcel.readInt();
        this.f32314z = parcel.readByte() != 0;
        this.A = parcel.readInt();
        this.B = parcel.readInt();
        this.C = parcel.readInt();
        this.D = parcel.readLong();
        this.E = parcel.readByte() != 0;
        this.F = parcel.readByte() != 0;
        this.H = parcel.readInt();
        this.L = parcel.readInt();
        this.M = parcel.readString();
        this.Q = parcel.readString();
        this.U = parcel.readString();
        this.V = parcel.readString();
        this.W = (c) parcel.readParcelable(c.class.getClassLoader());
        this.X = parcel.readString();
        this.Y = parcel.readInt();
        this.Z = parcel.readInt();
        this.f32280c0 = parcel.readInt();
        this.f32282d0 = parcel.readInt();
        this.f32284e0 = parcel.readInt();
        this.f32286f0 = parcel.readByte() != 0;
        this.f32288g0 = parcel.readInt();
        this.f32290h0 = parcel.readByte() != 0;
        this.f32292i0 = parcel.readByte() != 0;
        this.f32294j0 = parcel.readByte() != 0;
        this.f32296k0 = parcel.readLong();
        this.f32298l0 = parcel.readInt();
        this.f32300m0 = (h) parcel.readParcelable(h.class.getClassLoader());
        this.f32302n0 = (f) parcel.readParcelable(f.class.getClassLoader());
    }

    public final long a() {
        return this.D;
    }

    public final String b() {
        return TextUtils.isEmpty(this.f32289h) ? "BIN" : this.f32289h;
    }

    public final boolean d() {
        return (this.f32305q & 1) == 1;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean e(int i10) {
        return (this.f32306r & i10) == i10;
    }

    public final boolean f() {
        return (this.f32293j & 1) == 1;
    }

    public final boolean g() {
        return (this.f32293j & 4) == 4;
    }

    public final boolean h() {
        return (this.f32293j & 2) == 2;
    }

    public final String toString() {
        String a10;
        String format;
        String format2;
        StringBuilder a11 = android.support.v4.media.d.a("DfuConfig{");
        Object[] objArr = new Object[2];
        objArr[0] = Integer.valueOf(this.L);
        int i10 = this.f32281d;
        if (i10 <= 3) {
            a10 = "Bee1";
        } else if (i10 == 4) {
            a10 = "BBPro";
        } else if (i10 == 5) {
            a10 = "Bee2";
        } else if (i10 == 6) {
            a10 = "BBLite ANC";
        } else if (i10 == 7) {
            a10 = "BBPro2";
        } else if (i10 == 8) {
            a10 = "BBLite";
        } else if (i10 == 9) {
            a10 = "SBee2";
        } else if (i10 == 10) {
            a10 = "BBPro3";
        } else if (i10 == 11) {
            a10 = "BB2";
        } else if (i10 == 12) {
            a10 = "Bee3";
        } else if (i10 == 13) {
            a10 = "BBLITE_2";
        } else if (i10 == 15) {
            a10 = "BEE4";
        } else if (i10 == 16) {
            a10 = "BEE3_PLUS";
        } else {
            a10 = u0.a("Unknown ic ", i10);
        }
        objArr[1] = a10;
        a11.append(String.format("manufacturerId=0x%04X, primaryIcType=%s\n", objArr));
        a11.append(String.format("address==%s, localName=%s, isHid=%b\n", p.b.m(this.f32283e), this.X, Boolean.valueOf(this.f32290h0)));
        Locale locale = Locale.US;
        a11.append(String.format(locale, "logLevel=%d\n", Integer.valueOf(this.f32282d0)));
        a11.append(String.format("mProtocolType=0x%04X, mChannelType=0x%02x, workMode=0x%04X\n", Integer.valueOf(this.f32278b), Integer.valueOf(this.f32277a), Integer.valueOf(this.f32279c)));
        int i11 = this.f32277a;
        if (i11 == 0) {
            a11.append(String.format("\tOtaService=%s\n", this.M));
            a11.append(String.format("\tDfuService=%s\n", this.Q));
            a11.append(String.format("\tDfuData==%s\n", this.U));
            a11.append(String.format("\tDfuControlPoint=%s\n", this.V));
            c cVar = this.W;
            if (cVar != null) {
                format = String.format("\t%s\n", cVar.toString());
                a11.append(format);
            } else {
                ge.b.n("not set connectionParameters");
            }
        } else if (i11 == 2) {
            format = String.format("\tEndPointInAddr=0x%02X, EndPointOutAddr=0x%02X\n", Integer.valueOf(this.Y), Integer.valueOf(this.Z));
            a11.append(format);
        }
        if (this.f32279c == 24) {
            a11.append(String.format("\n\tvpId=0x%04X", Integer.valueOf(this.f32298l0)));
        }
        a11.append(String.format(locale, "handoverTimeout=%ds, notificationTimeout=%dms\n", Integer.valueOf(this.f32284e0), Long.valueOf(this.f32296k0)));
        a11.append(String.format(locale, "file location=%d, path==%s, suffix=%s\n", Integer.valueOf(this.f32285f), this.f32287g, this.f32289h));
        a11.append(String.format("\tfileIndicator=0x%08x, imageVerifyIndicator=0x%08x\n", Integer.valueOf(this.f32291i), Integer.valueOf(this.f32293j)));
        a11.append(String.format(locale, "\tversionCheck=%b, mode=%d, icCheck=%b, sectionSizeCheck=%b\n, batteryCheck=%b, connectBack=%b, checkOtaResult=%b\n", Boolean.valueOf(h()), Integer.valueOf(this.f32295k), Boolean.valueOf(f()), Boolean.valueOf(g()), Boolean.valueOf(this.f32314z), Boolean.valueOf(this.f32292i0), Boolean.valueOf(this.f32294j0)));
        a11.append(String.format(locale, "conParamUpdateLatency=%b, latencyTimeout=%d", Boolean.valueOf(this.F), Integer.valueOf(this.H)));
        boolean z10 = this.f32314z;
        if (z10) {
            format2 = String.format(locale, "\nlowBatteryThreshold=%d, batteryLevelFormat=%d", Integer.valueOf(this.A), Integer.valueOf(this.B));
        } else {
            format2 = String.format(locale, "batteryCheckEnabled=%b", Boolean.valueOf(z10));
        }
        a11.append(format2);
        a11.append(String.format(locale, "\nmtuUpdate=%b,bufferCheckMtuUpdateEnabled=%b,primaryMtuSize=%d", Boolean.valueOf(this.f32309u), Boolean.valueOf(this.f32310v), Integer.valueOf(this.f32308t)));
        a11.append(String.format("\nthroughput=%b, breakpointResume=%b,waitActiveCmdAck=%b, activeImageDelayTime=%d", Boolean.valueOf(this.f32299m), Boolean.valueOf(this.f32301n), Boolean.valueOf(this.f32303o), this.f32304p));
        if (this.f32311w) {
            a11.append(String.format(locale, ", flowControl: interval=%d, unit=%dms", Integer.valueOf(this.f32312x), Integer.valueOf(this.f32313y)));
        }
        a11.append(String.format("\ncompleteAction=0x%04X, ", Integer.valueOf(this.f32305q)));
        a11.append(String.format("\nerrorAction=0x%04X, ERROR_ACTION_DISCONNECT=%b, ERROR_ACTION_REFRESH_DEVICE=%b, EA_CLOSE_GATT=%b", Integer.valueOf(this.f32306r), Boolean.valueOf(e(1)), Boolean.valueOf(e(2)), Boolean.valueOf(e(4))));
        a11.append(String.format(locale, "\nretransConnectTimes=%d, connectionTimeout=%d", Integer.valueOf(this.C), Long.valueOf(this.D)));
        if (this.f32300m0 != null) {
            StringBuilder a12 = android.support.v4.media.d.a("\n\t");
            a12.append(this.f32300m0.toString());
            a11.append(a12.toString());
        }
        if (this.f32302n0 != null) {
            StringBuilder a13 = android.support.v4.media.d.a("\n\t");
            a13.append(this.f32302n0.toString());
            a11.append(a13.toString());
        }
        return a11.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f32277a);
        parcel.writeInt(this.f32278b);
        parcel.writeInt(this.f32279c);
        parcel.writeInt(this.f32281d);
        parcel.writeString(this.f32283e);
        parcel.writeInt(this.f32285f);
        parcel.writeString(this.f32287g);
        parcel.writeString(this.f32289h);
        parcel.writeInt(this.f32291i);
        parcel.writeInt(this.f32293j);
        parcel.writeInt(this.f32295k);
        parcel.writeByte(this.f32297l ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f32299m ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f32301n ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f32303o ? (byte) 1 : (byte) 0);
        if (this.f32304p == null) {
            parcel.writeByte((byte) 0);
        } else {
            parcel.writeByte((byte) 1);
            parcel.writeLong(this.f32304p.longValue());
        }
        parcel.writeInt(this.f32305q);
        parcel.writeInt(this.f32306r);
        parcel.writeByteArray(this.f32307s);
        parcel.writeInt(this.f32308t);
        parcel.writeByte(this.f32309u ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f32310v ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f32311w ? (byte) 1 : (byte) 0);
        parcel.writeInt(this.f32312x);
        parcel.writeInt(this.f32313y);
        parcel.writeByte(this.f32314z ? (byte) 1 : (byte) 0);
        parcel.writeInt(this.A);
        parcel.writeInt(this.B);
        parcel.writeInt(this.C);
        parcel.writeLong(this.D);
        parcel.writeByte(this.E ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.F ? (byte) 1 : (byte) 0);
        parcel.writeInt(this.H);
        parcel.writeInt(this.L);
        parcel.writeString(this.M);
        parcel.writeString(this.Q);
        parcel.writeString(this.U);
        parcel.writeString(this.V);
        parcel.writeParcelable(this.W, i10);
        parcel.writeString(this.X);
        parcel.writeInt(this.Y);
        parcel.writeInt(this.Z);
        parcel.writeInt(this.f32280c0);
        parcel.writeInt(this.f32282d0);
        parcel.writeInt(this.f32284e0);
        parcel.writeByte(this.f32286f0 ? (byte) 1 : (byte) 0);
        parcel.writeInt(this.f32288g0);
        parcel.writeByte(this.f32290h0 ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f32292i0 ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f32294j0 ? (byte) 1 : (byte) 0);
        parcel.writeLong(this.f32296k0);
        parcel.writeInt(this.f32298l0);
        parcel.writeParcelable(this.f32300m0, i10);
        parcel.writeParcelable(this.f32302n0, i10);
    }
}
