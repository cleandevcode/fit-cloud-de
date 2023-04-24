package on;

import android.os.Parcel;
import android.os.Parcelable;
import pn.o;

/* loaded from: classes2.dex */
public final class m extends o implements Parcelable {
    public static final Parcelable.Creator<m> CREATOR = new a();

    /* renamed from: g */
    public String f23710g;

    /* loaded from: classes2.dex */
    public static class a implements Parcelable.Creator<m> {
        @Override // android.os.Parcelable.Creator
        public final m createFromParcel(Parcel parcel) {
            return new m(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final m[] newArray(int i10) {
            return new m[i10];
        }
    }

    public m(Parcel parcel) {
        super(parcel.createByteArray());
        this.f23710g = null;
        a(parcel.readInt());
        boolean[] createBooleanArray = parcel.createBooleanArray();
        boolean z10 = createBooleanArray[0];
        if (this.f24446a) {
            this.f24449d = z10;
            this.f24450e = createBooleanArray[1];
            this.f23710g = parcel.readString();
            return;
        }
        throw new IllegalStateException();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeByteArray(this.f24447b);
        parcel.writeInt(this.f24448c);
        parcel.writeBooleanArray(new boolean[]{this.f24449d, this.f24450e});
        parcel.writeString(this.f23710g);
    }

    public m(o oVar) {
        super(oVar.f24447b);
        this.f23710g = null;
        a(oVar.f24448c);
        boolean z10 = oVar.f24449d;
        if (this.f24446a) {
            this.f24449d = z10;
            this.f24450e = oVar.f24450e;
            return;
        }
        throw new IllegalStateException();
    }
}
