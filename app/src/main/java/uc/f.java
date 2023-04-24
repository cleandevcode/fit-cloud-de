package uc;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.widget.u0;

/* loaded from: classes.dex */
public final class f implements Parcelable {
    public static final Parcelable.Creator<f> CREATOR = new a();

    /* renamed from: a */
    public int f28674a;

    /* renamed from: b */
    public int f28675b;

    /* renamed from: c */
    public long f28676c;

    /* renamed from: d */
    public int f28677d;

    /* renamed from: e */
    public int f28678e;

    /* renamed from: f */
    public boolean f28679f;

    /* renamed from: g */
    public boolean f28680g;

    /* loaded from: classes.dex */
    public class a implements Parcelable.Creator<f> {
        @Override // android.os.Parcelable.Creator
        public final f createFromParcel(Parcel parcel) {
            return new f(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final f[] newArray(int i10) {
            return new f[i10];
        }
    }

    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a */
        public int f28681a = 0;

        /* renamed from: b */
        public int f28682b = 1;

        /* renamed from: c */
        public boolean f28683c = true;

        public final void a(int i10) {
            boolean z10 = true;
            if (i10 != 1 && i10 != 2 && i10 != 4 && i10 != 6) {
                z10 = false;
            }
            if (z10) {
                this.f28682b = i10;
                return;
            }
            throw new IllegalArgumentException(u0.a("invalid callback type - ", i10));
        }

        public final void b(int i10) {
            if (i10 >= -1 && i10 <= 2) {
                this.f28681a = i10;
                return;
            }
            throw new IllegalArgumentException(u0.a("invalid scan mode ", i10));
        }
    }

    public f(int i10, int i11, long j10, int i12, int i13, boolean z10, boolean z11) {
        this.f28674a = i10;
        this.f28675b = i11;
        this.f28676c = j10;
        this.f28678e = i13;
        this.f28677d = i12;
        this.f28679f = z10;
        this.f28680g = z11;
    }

    public f(Parcel parcel) {
        this.f28674a = parcel.readInt();
        this.f28675b = parcel.readInt();
        this.f28676c = parcel.readLong();
        this.f28677d = parcel.readInt();
        this.f28678e = parcel.readInt();
        this.f28679f = parcel.readInt() != 0;
        this.f28680g = parcel.readInt() != 0;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f28674a);
        parcel.writeInt(this.f28675b);
        parcel.writeLong(this.f28676c);
        parcel.writeInt(this.f28677d);
        parcel.writeInt(this.f28678e);
        parcel.writeInt(this.f28679f ? 1 : 0);
        parcel.writeInt(this.f28680g ? 1 : 0);
    }
}
