package f9;

import android.os.Parcel;
import android.os.Parcelable;
import i8.h0;

/* loaded from: classes.dex */
public final class i extends j8.a {
    public static final Parcelable.Creator<i> CREATOR = new j();

    /* renamed from: a */
    public final int f14202a;

    /* renamed from: b */
    public final h0 f14203b;

    public i(int i10, h0 h0Var) {
        this.f14202a = i10;
        this.f14203b = h0Var;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int F = o8.b.F(parcel, 20293);
        o8.b.z(parcel, 1, this.f14202a);
        o8.b.B(parcel, 2, this.f14203b, i10);
        o8.b.J(parcel, F);
    }
}
