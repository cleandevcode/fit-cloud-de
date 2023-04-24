package t7;

import android.os.Parcel;
import android.os.ParcelFormatException;
import android.os.Parcelable;

/* loaded from: classes.dex */
public class k extends g implements Parcelable {
    public static final Parcelable.Creator<k> CREATOR = new a();

    /* renamed from: c */
    public float f27841c;

    /* loaded from: classes.dex */
    public static class a implements Parcelable.Creator<k> {
        @Override // android.os.Parcelable.Creator
        public final k createFromParcel(Parcel parcel) {
            return new k(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final k[] newArray(int i10) {
            return new k[i10];
        }
    }

    public k() {
        this.f27841c = 0.0f;
    }

    public k(float f10, float f11) {
        super(f11);
        this.f27841c = f10;
    }

    public k(Parcel parcel) {
        this.f27841c = 0.0f;
        this.f27841c = parcel.readFloat();
        this.f27821a = parcel.readFloat();
        if (parcel.readInt() == 1) {
            this.f27822b = parcel.readParcelable(Object.class.getClassLoader());
        }
    }

    public float b() {
        return this.f27841c;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder a10 = android.support.v4.media.d.a("Entry, x: ");
        a10.append(this.f27841c);
        a10.append(" y: ");
        a10.append(a());
        return a10.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeFloat(this.f27841c);
        parcel.writeFloat(a());
        Object obj = this.f27822b;
        if (obj != null) {
            if (obj instanceof Parcelable) {
                parcel.writeInt(1);
                parcel.writeParcelable((Parcelable) this.f27822b, i10);
                return;
            }
            throw new ParcelFormatException("Cannot parcel an Entry with non-parcelable data");
        }
        parcel.writeInt(0);
    }
}
