package d9;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class o extends j8.a {
    public static final Parcelable.Creator<o> CREATOR = new z();

    /* renamed from: a */
    public final n f12920a;

    /* renamed from: b */
    public final double f12921b;

    public o(n nVar, double d10) {
        if (d10 <= 0.0d) {
            throw new IllegalArgumentException("A style must be applied to some segments on a polyline.");
        }
        this.f12920a = nVar;
        this.f12921b = d10;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int F = o8.b.F(parcel, 20293);
        o8.b.B(parcel, 2, this.f12920a, i10);
        double d10 = this.f12921b;
        parcel.writeInt(524291);
        parcel.writeDouble(d10);
        o8.b.J(parcel, F);
    }
}
