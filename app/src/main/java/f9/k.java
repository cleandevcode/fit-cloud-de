package f9;

import android.os.Parcel;
import android.os.Parcelable;
import i8.j0;

/* loaded from: classes.dex */
public final class k extends j8.a {
    public static final Parcelable.Creator<k> CREATOR = new l();

    /* renamed from: a */
    public final int f14204a;

    /* renamed from: b */
    public final f8.a f14205b;

    /* renamed from: c */
    public final j0 f14206c;

    public k(int i10, f8.a aVar, j0 j0Var) {
        this.f14204a = i10;
        this.f14205b = aVar;
        this.f14206c = j0Var;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int F = o8.b.F(parcel, 20293);
        o8.b.z(parcel, 1, this.f14204a);
        o8.b.B(parcel, 2, this.f14205b, i10);
        o8.b.B(parcel, 3, this.f14206c, i10);
        o8.b.J(parcel, F);
    }
}
