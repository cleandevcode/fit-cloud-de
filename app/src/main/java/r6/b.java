package r6;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class b implements Parcelable {
    public static final Parcelable.Creator<b> CREATOR = new C0461b();

    /* renamed from: a */
    public final Bundle f25348a;

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a */
        public final Bundle f25349a = new Bundle();
    }

    /* renamed from: r6.b$b */
    /* loaded from: classes.dex */
    public static final class C0461b implements Parcelable.Creator<b> {
        @Override // android.os.Parcelable.Creator
        public final b createFromParcel(Parcel parcel) {
            gm.l.f(parcel, "parcel");
            return new b(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final b[] newArray(int i10) {
            return new b[i10];
        }
    }

    public b(Parcel parcel) {
        gm.l.f(parcel, "parcel");
        this.f25348a = parcel.readBundle(b.class.getClassLoader());
    }

    public b(a aVar) {
        this.f25348a = aVar.f25349a;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        gm.l.f(parcel, "out");
        parcel.writeBundle(this.f25348a);
    }
}
