package sj;

import android.os.Parcel;
import android.os.Parcelable;
import gm.l;
import jh.v;

/* loaded from: classes2.dex */
public final class e implements Parcelable {
    public static final Parcelable.Creator<e> CREATOR = new a();

    /* renamed from: a */
    public final int f27095a;

    /* renamed from: b */
    public final int f27096b;

    /* renamed from: c */
    public final int f27097c;

    /* renamed from: d */
    public int f27098d;

    /* loaded from: classes2.dex */
    public static final class a implements Parcelable.Creator<e> {
        @Override // android.os.Parcelable.Creator
        public final e createFromParcel(Parcel parcel) {
            l.f(parcel, "parcel");
            return new e(parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final e[] newArray(int i10) {
            return new e[i10];
        }
    }

    public e(int i10, int i11, int i12, int i13) {
        this.f27095a = i10;
        this.f27096b = i11;
        this.f27097c = i12;
        this.f27098d = i13;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof e) {
            e eVar = (e) obj;
            return this.f27095a == eVar.f27095a && this.f27096b == eVar.f27096b && this.f27097c == eVar.f27097c && this.f27098d == eVar.f27098d;
        }
        return false;
    }

    public final int hashCode() {
        int i10 = this.f27096b;
        int i11 = this.f27097c;
        return this.f27098d + ((i11 + ((i10 + (this.f27095a * 31)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder c10 = v.c("FcShape(shape=");
        c10.append(this.f27095a);
        c10.append(", width=");
        c10.append(this.f27096b);
        c10.append(", height=");
        c10.append(this.f27097c);
        c10.append(", corners=");
        return v.b(c10, this.f27098d, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        l.f(parcel, "parcel");
        parcel.writeInt(this.f27095a);
        parcel.writeInt(this.f27096b);
        parcel.writeInt(this.f27097c);
        parcel.writeInt(this.f27098d);
    }
}
