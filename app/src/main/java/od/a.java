package od;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.d;
import java.util.Locale;

/* loaded from: classes.dex */
public final class a implements Parcelable {
    public static final Parcelable.Creator<a> CREATOR = new C0411a();

    /* renamed from: a */
    public int f23079a;

    /* renamed from: od.a$a */
    /* loaded from: classes.dex */
    public class C0411a implements Parcelable.Creator<a> {
        @Override // android.os.Parcelable.Creator
        public final a createFromParcel(Parcel parcel) {
            return new a(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final a[] newArray(int i10) {
            return new a[i10];
        }
    }

    public a() {
    }

    public a(Parcel parcel) {
        this.f23079a = parcel.readInt();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return f3.a.a(Locale.US, "\n\tconnNum=%d", new Object[]{Integer.valueOf(this.f23079a)}, d.a("MultilinkInfo {"), "\n}");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f23079a);
    }
}
