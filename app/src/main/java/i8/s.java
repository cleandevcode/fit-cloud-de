package i8;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* loaded from: classes.dex */
public final class s extends j8.a {
    public static final Parcelable.Creator<s> CREATOR = new v();

    /* renamed from: a */
    public final int f16710a;

    /* renamed from: b */
    public List f16711b;

    public s(int i10, List list) {
        this.f16710a = i10;
        this.f16711b = list;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int F = o8.b.F(parcel, 20293);
        o8.b.z(parcel, 1, this.f16710a);
        o8.b.E(parcel, 2, this.f16711b);
        o8.b.J(parcel, F);
    }
}
