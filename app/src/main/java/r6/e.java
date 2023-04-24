package r6;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class e implements Parcelable {
    public static final Parcelable.Creator<e> CREATOR = new b();

    /* renamed from: a */
    public final String f25365a;

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a */
        public String f25366a;

        public final e a() {
            return new e(this);
        }
    }

    /* loaded from: classes.dex */
    public static final class b implements Parcelable.Creator<e> {
        @Override // android.os.Parcelable.Creator
        public final e createFromParcel(Parcel parcel) {
            gm.l.f(parcel, "source");
            return new e(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final e[] newArray(int i10) {
            return new e[i10];
        }
    }

    public e(Parcel parcel) {
        gm.l.f(parcel, "parcel");
        this.f25365a = parcel.readString();
    }

    public e(a aVar) {
        this.f25365a = aVar.f25366a;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        gm.l.f(parcel, "dest");
        parcel.writeString(this.f25365a);
    }
}
