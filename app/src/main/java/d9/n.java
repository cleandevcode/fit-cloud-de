package d9;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class n extends j8.a {
    public static final Parcelable.Creator<n> CREATOR = new y();

    /* renamed from: a */
    public final float f12915a;

    /* renamed from: b */
    public final int f12916b;

    /* renamed from: c */
    public final int f12917c;

    /* renamed from: d */
    public final boolean f12918d;

    /* renamed from: e */
    public final m f12919e;

    public n(float f10, int i10, int i11, boolean z10, m mVar) {
        this.f12915a = f10;
        this.f12916b = i10;
        this.f12917c = i11;
        this.f12918d = z10;
        this.f12919e = mVar;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int F = o8.b.F(parcel, 20293);
        o8.b.w(parcel, 2, this.f12915a);
        o8.b.z(parcel, 3, this.f12916b);
        o8.b.z(parcel, 4, this.f12917c);
        o8.b.t(parcel, 5, this.f12918d);
        o8.b.B(parcel, 6, this.f12919e, i10);
        o8.b.J(parcel, F);
    }
}
