package si;

import a0.a2;
import android.os.Parcel;
import android.os.Parcelable;
import gm.l;
import i2.t;

/* loaded from: classes2.dex */
public final class d implements Parcelable {
    public static final a CREATOR = new a();

    /* renamed from: a */
    public final String f27066a;

    /* renamed from: b */
    public final String f27067b;

    /* renamed from: c */
    public final String f27068c;

    /* loaded from: classes2.dex */
    public static final class a implements Parcelable.Creator<d> {
        @Override // android.os.Parcelable.Creator
        public final d createFromParcel(Parcel parcel) {
            l.f(parcel, "parcel");
            String readString = parcel.readString();
            l.c(readString);
            String readString2 = parcel.readString();
            l.c(readString2);
            String readString3 = parcel.readString();
            l.c(readString3);
            return new d(readString, readString2, readString3);
        }

        @Override // android.os.Parcelable.Creator
        public final d[] newArray(int i10) {
            return new d[i10];
        }
    }

    public d(String str, String str2, String str3) {
        this.f27066a = str;
        this.f27067b = str2;
        this.f27068c = str3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof d) {
            d dVar = (d) obj;
            return l.a(this.f27066a, dVar.f27066a) && l.a(this.f27067b, dVar.f27067b) && l.a(this.f27068c, dVar.f27068c);
        }
        return false;
    }

    public final int hashCode() {
        return this.f27068c.hashCode() + t.a(this.f27067b, this.f27066a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder a10 = android.support.v4.media.d.a("PermissionExplain(fullText=");
        a10.append(this.f27066a);
        a10.append(", linkText=");
        a10.append(this.f27067b);
        a10.append(", link=");
        return a2.a(a10, this.f27068c, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        l.f(parcel, "parcel");
        parcel.writeString(this.f27066a);
        parcel.writeString(this.f27067b);
        parcel.writeString(this.f27068c);
    }
}
