package i8;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class c extends j8.a {
    public static final Parcelable.Creator<c> CREATOR = new u();

    /* renamed from: a */
    public final int f16605a;

    /* renamed from: b */
    public final String f16606b;

    public c(int i10, String str) {
        this.f16605a = i10;
        this.f16606b = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof c) {
            c cVar = (c) obj;
            return cVar.f16605a == this.f16605a && n.a(cVar.f16606b, this.f16606b);
        }
        return false;
    }

    public final int hashCode() {
        return this.f16605a;
    }

    public final String toString() {
        int i10 = this.f16605a;
        String str = this.f16606b;
        return i10 + ":" + str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int F = o8.b.F(parcel, 20293);
        o8.b.z(parcel, 1, this.f16605a);
        o8.b.C(parcel, 2, this.f16606b);
        o8.b.J(parcel, F);
    }
}
