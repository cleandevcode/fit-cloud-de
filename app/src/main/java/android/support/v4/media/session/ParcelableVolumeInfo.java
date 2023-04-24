package android.support.v4.media.session;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;

@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes.dex */
public class ParcelableVolumeInfo implements Parcelable {
    public static final Parcelable.Creator<ParcelableVolumeInfo> CREATOR = new a();

    /* renamed from: a */
    public int f677a;

    /* renamed from: b */
    public int f678b;

    /* renamed from: c */
    public int f679c;

    /* renamed from: d */
    public int f680d;

    /* renamed from: e */
    public int f681e;

    /* loaded from: classes.dex */
    public class a implements Parcelable.Creator<ParcelableVolumeInfo> {
        @Override // android.os.Parcelable.Creator
        public final ParcelableVolumeInfo createFromParcel(Parcel parcel) {
            return new ParcelableVolumeInfo(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final ParcelableVolumeInfo[] newArray(int i10) {
            return new ParcelableVolumeInfo[i10];
        }
    }

    public ParcelableVolumeInfo(Parcel parcel) {
        this.f677a = parcel.readInt();
        this.f679c = parcel.readInt();
        this.f680d = parcel.readInt();
        this.f681e = parcel.readInt();
        this.f678b = parcel.readInt();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f677a);
        parcel.writeInt(this.f679c);
        parcel.writeInt(this.f680d);
        parcel.writeInt(this.f681e);
        parcel.writeInt(this.f678b);
    }
}
