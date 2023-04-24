package r6;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class a implements Parcelable {
    public static final Parcelable.Creator<a> CREATOR = new b();

    /* renamed from: a */
    public final Bundle f25346a;

    /* renamed from: r6.a$a */
    /* loaded from: classes.dex */
    public static final class C0460a {

        /* renamed from: a */
        public final Bundle f25347a = new Bundle();
    }

    /* loaded from: classes.dex */
    public static final class b implements Parcelable.Creator<a> {
        @Override // android.os.Parcelable.Creator
        public final a createFromParcel(Parcel parcel) {
            gm.l.f(parcel, "parcel");
            return new a(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final a[] newArray(int i10) {
            return new a[i10];
        }
    }

    public a(Parcel parcel) {
        gm.l.f(parcel, "parcel");
        this.f25346a = parcel.readBundle(a.class.getClassLoader());
    }

    public a(C0460a c0460a) {
        this.f25346a = c0460a.f25347a;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        gm.l.f(parcel, "out");
        parcel.writeBundle(this.f25346a);
    }
}
