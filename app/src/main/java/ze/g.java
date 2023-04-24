package ze;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Locale;

/* loaded from: classes.dex */
public final class g implements Parcelable {
    public static final Parcelable.Creator<g> CREATOR = new a();

    /* renamed from: a */
    public int f32316a;

    /* renamed from: b */
    public int f32317b;

    /* renamed from: c */
    public int f32318c;

    /* renamed from: d */
    public int f32319d;

    /* renamed from: e */
    public int f32320e;

    /* renamed from: f */
    public int f32321f;

    /* renamed from: g */
    public int f32322g;

    /* renamed from: h */
    public int f32323h;

    /* renamed from: i */
    public int f32324i;

    /* renamed from: j */
    public int f32325j;

    /* renamed from: k */
    public int f32326k;

    /* renamed from: l */
    public int f32327l;

    /* renamed from: m */
    public long f32328m;

    /* renamed from: n */
    public long f32329n;

    /* renamed from: o */
    public long f32330o;

    /* renamed from: p */
    public long f32331p;

    /* renamed from: q */
    public l f32332q;

    /* renamed from: r */
    public boolean f32333r;

    /* loaded from: classes.dex */
    public class a implements Parcelable.Creator<g> {
        @Override // android.os.Parcelable.Creator
        public final g createFromParcel(Parcel parcel) {
            return new g(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final g[] newArray(int i10) {
            return new g[i10];
        }
    }

    public g() {
        this.f32318c = 0;
        this.f32319d = 0;
        this.f32320e = 0;
        this.f32321f = 0;
        this.f32322g = 0;
        this.f32317b = 0;
        this.f32333r = false;
    }

    public g(Parcel parcel) {
        this.f32318c = 0;
        this.f32319d = 0;
        this.f32320e = 0;
        this.f32321f = 0;
        this.f32322g = 0;
        this.f32316a = parcel.readInt();
        this.f32317b = parcel.readInt();
        this.f32318c = parcel.readInt();
        this.f32319d = parcel.readInt();
        this.f32320e = parcel.readInt();
        this.f32321f = parcel.readInt();
        this.f32322g = parcel.readInt();
        this.f32324i = parcel.readInt();
        this.f32325j = parcel.readInt();
        this.f32326k = parcel.readInt();
        this.f32327l = parcel.readInt();
        this.f32328m = parcel.readLong();
        this.f32329n = parcel.readLong();
        this.f32330o = parcel.readLong();
        this.f32331p = parcel.readLong();
        this.f32332q = (l) parcel.readParcelable(l.class.getClassLoader());
        this.f32333r = parcel.readByte() != 0;
    }

    public final void a(int i10) {
        h(this.f32317b + i10);
        this.f32326k += i10;
    }

    public final void b() {
        this.f32316a += 12;
    }

    public final void d(int i10, int i11, int i12, int i13, boolean z10) {
        this.f32323h = i10;
        this.f32324i = i11;
        this.f32325j = i12;
        this.f32316a = i13;
        this.f32333r = z10;
        h(0);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean e() {
        return this.f32317b >= this.f32316a;
    }

    public final boolean f() {
        return this.f32322g >= this.f32319d;
    }

    public final void g() {
        this.f32328m = System.currentTimeMillis();
        this.f32317b = this.f32316a;
        int i10 = this.f32320e;
        this.f32321f = i10;
        this.f32322g = i10 + 1;
        ge.b.n(toString());
    }

    public final void h(int i10) {
        this.f32317b = i10;
        this.f32318c = (int) ((i10 * 100.0f) / this.f32316a);
        long currentTimeMillis = System.currentTimeMillis();
        this.f32329n = currentTimeMillis;
        if (this.f32333r) {
            long max = Math.max(0L, currentTimeMillis - this.f32328m);
            float f10 = max > 0 ? (this.f32317b * 1000.0f) / ((float) max) : 0.0f;
            long currentTimeMillis2 = System.currentTimeMillis();
            long j10 = this.f32317b;
            long j11 = j10 - this.f32331p;
            long j12 = currentTimeMillis2 - this.f32330o;
            float f11 = j12 > 0 ? (((float) j11) * 1000.0f) / ((float) j12) : 0.0f;
            this.f32330o = currentTimeMillis2;
            this.f32331p = j10;
            l lVar = this.f32332q;
            if (lVar != null) {
                lVar.f32343c = max;
                lVar.f32344d = f10;
                lVar.f32345e = f11;
            }
        }
    }

    public final void i() {
        long currentTimeMillis = System.currentTimeMillis();
        this.f32328m = currentTimeMillis;
        this.f32329n = currentTimeMillis;
        this.f32330o = currentTimeMillis;
        this.f32331p = 0L;
        this.f32332q = this.f32333r ? new l(this.f32316a, this.f32317b) : null;
        ge.b.n(toString());
    }

    public final String toString() {
        double d10;
        StringBuilder sb2 = new StringBuilder();
        Locale locale = Locale.US;
        int i10 = 0;
        sb2.append(String.format(locale, "image: %d/%d", Integer.valueOf(this.f32320e + 1), Integer.valueOf(this.f32319d)));
        sb2.append(String.format(locale, "\t{binId=0x%04X, imageId=0x%04X, version=0x%04X}", Integer.valueOf(this.f32323h), Integer.valueOf(this.f32324i), Integer.valueOf(this.f32325j)));
        Object[] objArr = new Object[4];
        objArr[0] = Integer.valueOf(this.f32318c);
        objArr[1] = Integer.valueOf(this.f32317b);
        objArr[2] = Integer.valueOf(this.f32316a);
        int i11 = this.f32319d;
        if (i11 != 0) {
            double d11 = 100.0f / i11;
            int i12 = this.f32316a;
            if (i12 == 0) {
                d10 = 0.0d;
            } else {
                d10 = (this.f32317b * 1.0d) / i12;
            }
            double d12 = this.f32320e + d10;
            if (d12 < i11) {
                i10 = (int) (d12 * d11);
            } else {
                i10 = 100;
            }
        }
        objArr[3] = Integer.valueOf(i10);
        sb2.append(String.format(locale, "\tprogress: %d%%(%d/%d)--%d%%", objArr));
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f32316a);
        parcel.writeInt(this.f32317b);
        parcel.writeInt(this.f32318c);
        parcel.writeInt(this.f32319d);
        parcel.writeInt(this.f32320e);
        parcel.writeInt(this.f32321f);
        parcel.writeInt(this.f32322g);
        parcel.writeInt(this.f32324i);
        parcel.writeInt(this.f32325j);
        parcel.writeInt(this.f32326k);
        parcel.writeInt(this.f32327l);
        parcel.writeLong(this.f32328m);
        parcel.writeLong(this.f32329n);
        parcel.writeLong(this.f32330o);
        parcel.writeLong(this.f32331p);
        parcel.writeParcelable(this.f32332q, i10);
        parcel.writeByte(this.f32333r ? (byte) 1 : (byte) 0);
    }
}
