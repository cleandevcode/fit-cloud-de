package ad;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.d;

/* loaded from: classes.dex */
public final class a implements Parcelable {
    public static final Parcelable.Creator<a> CREATOR = new C0003a();

    /* renamed from: a */
    public int f454a;

    /* renamed from: b */
    public byte[] f455b;

    /* renamed from: ad.a$a */
    /* loaded from: classes.dex */
    public class C0003a implements Parcelable.Creator<a> {
        @Override // android.os.Parcelable.Creator
        public final a createFromParcel(Parcel parcel) {
            return new a(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final a[] newArray(int i10) {
            return new a[i10];
        }
    }

    public a(int i10, byte[] bArr) {
        this.f454a = i10;
        this.f455b = bArr;
    }

    public a(Parcel parcel) {
        this.f454a = parcel.readInt();
        this.f455b = parcel.createByteArray();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder a10 = d.a("LlAptScenarioGroupInfo{");
        StringBuilder a11 = d.a("\n\tgroupNum=");
        a11.append(this.f454a);
        a10.append(a11.toString());
        a10.append("\n\tgroupScenario=" + he.a.a(this.f455b));
        a10.append("\n}");
        return a10.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f454a);
        parcel.writeByteArray(this.f455b);
    }
}
