package gd;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Locale;
import no.nordicsemi.android.dfu.DfuBaseService;

/* loaded from: classes.dex */
public final class a implements Parcelable {

    /* renamed from: a */
    public int f15223a;

    /* renamed from: b */
    public double f15224b;

    /* renamed from: c */
    public int f15225c;

    /* renamed from: d */
    public int f15226d;

    /* renamed from: e */
    public double[] f15227e;

    /* renamed from: f */
    public double[] f15228f;

    /* renamed from: g */
    public double[] f15229g;

    /* renamed from: h */
    public int[] f15230h;

    /* renamed from: i */
    public byte[] f15231i;

    /* renamed from: j */
    public static final double[] f15219j = {32.0d, 64.0d, 125.0d, 250.0d, 500.0d, 1000.0d, 2000.0d, 4000.0d, 8000.0d, 16000.0d};

    /* renamed from: k */
    public static final double[] f15220k = {2.0d, 2.0d, 2.0d, 2.0d, 2.0d, 2.0d, 2.0d, 2.0d, 2.0d, 2.0d};

    /* renamed from: l */
    public static final double[] f15221l = {0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d};

    /* renamed from: m */
    public static final int[] f15222m = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    public static final Parcelable.Creator<a> CREATOR = new C0271a();

    /* renamed from: gd.a$a */
    /* loaded from: classes.dex */
    public class C0271a implements Parcelable.Creator<a> {
        @Override // android.os.Parcelable.Creator
        public final a createFromParcel(Parcel parcel) {
            return new a(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final a[] newArray(int i10) {
            return new a[i10];
        }
    }

    public a() {
        this.f15223a = 10;
        this.f15224b = 0.0d;
        this.f15225c = 3;
        this.f15227e = f15219j;
        this.f15228f = f15220k;
        this.f15229g = f15221l;
        this.f15230h = f15222m;
    }

    public a(int i10, double d10, int i11, double[] dArr, double[] dArr2, double[] dArr3, int[] iArr) {
        this.f15223a = i10;
        this.f15224b = d10;
        this.f15225c = i11;
        this.f15226d = DfuBaseService.ERROR_CONNECTION_MASK;
        this.f15227e = dArr;
        this.f15228f = dArr2;
        this.f15229g = dArr3;
        this.f15230h = iArr;
        this.f15231i = null;
    }

    public a(Parcel parcel) {
        this.f15223a = 10;
        this.f15224b = 0.0d;
        this.f15225c = 3;
        this.f15227e = f15219j;
        this.f15228f = f15220k;
        this.f15229g = f15221l;
        this.f15230h = f15222m;
        this.f15223a = parcel.readInt();
        this.f15224b = parcel.readDouble();
        this.f15225c = parcel.readInt();
        this.f15226d = parcel.readInt();
        this.f15227e = parcel.createDoubleArray();
        this.f15228f = parcel.createDoubleArray();
        this.f15229g = parcel.createDoubleArray();
        this.f15230h = parcel.createIntArray();
        this.f15231i = parcel.createByteArray();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder a10 = android.support.v4.media.d.a("AudioEq {");
        byte[] bArr = this.f15231i;
        if (bArr != null) {
            a10.append(String.format(Locale.US, "\neqData=(%d)%s", Integer.valueOf(bArr.length), he.a.a(this.f15231i)));
        }
        a10.append(String.format(Locale.US, "\n\tStageNum=%d, globalGain=%f, sampleRate=%d, accuracy=%d", Integer.valueOf(this.f15223a), Double.valueOf(this.f15224b), Integer.valueOf(this.f15225c), Integer.valueOf(this.f15226d)));
        a10.append("\n\tFreq=" + Arrays.toString(this.f15227e));
        a10.append("\n\tGain=" + Arrays.toString(this.f15229g));
        a10.append("\n\tQ=" + Arrays.toString(this.f15228f));
        a10.append("\n\tbiquadType=" + Arrays.toString(this.f15230h));
        a10.append("\n}");
        return a10.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f15223a);
        parcel.writeDouble(this.f15224b);
        parcel.writeInt(this.f15225c);
        parcel.writeInt(this.f15226d);
        parcel.writeDoubleArray(this.f15227e);
        parcel.writeDoubleArray(this.f15228f);
        parcel.writeDoubleArray(this.f15229g);
        parcel.writeIntArray(this.f15230h);
        parcel.writeByteArray(this.f15231i);
    }
}
