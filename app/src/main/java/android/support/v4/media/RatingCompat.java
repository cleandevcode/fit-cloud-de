package android.support.v4.media;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;

@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes.dex */
public final class RatingCompat implements Parcelable {
    public static final Parcelable.Creator<RatingCompat> CREATOR = new a();

    /* renamed from: a */
    public final int f653a;

    /* renamed from: b */
    public final float f654b;

    /* loaded from: classes.dex */
    public class a implements Parcelable.Creator<RatingCompat> {
        @Override // android.os.Parcelable.Creator
        public final RatingCompat createFromParcel(Parcel parcel) {
            return new RatingCompat(parcel.readFloat(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final RatingCompat[] newArray(int i10) {
            return new RatingCompat[i10];
        }
    }

    public RatingCompat(float f10, int i10) {
        this.f653a = i10;
        this.f654b = f10;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return this.f653a;
    }

    public final String toString() {
        String valueOf;
        StringBuilder a10 = d.a("Rating:style=");
        a10.append(this.f653a);
        a10.append(" rating=");
        float f10 = this.f654b;
        if (f10 < 0.0f) {
            valueOf = "unrated";
        } else {
            valueOf = String.valueOf(f10);
        }
        a10.append(valueOf);
        return a10.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f653a);
        parcel.writeFloat(this.f654b);
    }
}
