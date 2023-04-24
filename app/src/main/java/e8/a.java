package e8;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class a extends j8.a {
    public static final Parcelable.Creator<a> CREATOR = new c();

    /* renamed from: a */
    public final int f13485a;

    /* renamed from: b */
    public int f13486b;

    /* renamed from: c */
    public Bundle f13487c;

    public a(int i10, int i11, Bundle bundle) {
        this.f13485a = i10;
        this.f13486b = i11;
        this.f13487c = bundle;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int F = o8.b.F(parcel, 20293);
        o8.b.z(parcel, 1, this.f13485a);
        o8.b.z(parcel, 2, this.f13486b);
        o8.b.u(parcel, 3, this.f13487c);
        o8.b.J(parcel, F);
    }
}
