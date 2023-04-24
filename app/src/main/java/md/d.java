package md;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class d implements Parcelable {
    public static final Parcelable.Creator<d> CREATOR = new a();

    /* renamed from: a */
    public int f20470a;

    /* renamed from: b */
    public byte[] f20471b;

    /* loaded from: classes.dex */
    public class a implements Parcelable.Creator<d> {
        @Override // android.os.Parcelable.Creator
        public final d createFromParcel(Parcel parcel) {
            return new d(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final d[] newArray(int i10) {
            return new d[i10];
        }
    }

    public d(int i10, byte[] bArr) {
        this.f20470a = i10;
        this.f20471b = bArr;
    }

    public d(Parcel parcel) {
        this.f20470a = parcel.readInt();
        this.f20471b = parcel.createByteArray();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder a10 = android.support.v4.media.d.a("LlAptScenarioGroupInfo{");
        StringBuilder a11 = android.support.v4.media.d.a("\n\tgroupNum=");
        a11.append(this.f20470a);
        a10.append(a11.toString());
        a10.append("\n\tgroupScenario=" + he.a.a(this.f20471b));
        a10.append("\n}");
        return a10.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f20470a);
        parcel.writeByteArray(this.f20471b);
    }
}
