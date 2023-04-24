package i8;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class r extends j8.a {
    public static final Parcelable.Creator<r> CREATOR = new q0();

    /* renamed from: a */
    public final int f16704a;

    /* renamed from: b */
    public final boolean f16705b;

    /* renamed from: c */
    public final boolean f16706c;

    /* renamed from: d */
    public final int f16707d;

    /* renamed from: e */
    public final int f16708e;

    public r(int i10, int i11, int i12, boolean z10, boolean z11) {
        this.f16704a = i10;
        this.f16705b = z10;
        this.f16706c = z11;
        this.f16707d = i11;
        this.f16708e = i12;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int F = o8.b.F(parcel, 20293);
        o8.b.z(parcel, 1, this.f16704a);
        o8.b.t(parcel, 2, this.f16705b);
        o8.b.t(parcel, 3, this.f16706c);
        o8.b.z(parcel, 4, this.f16707d);
        o8.b.z(parcel, 5, this.f16708e);
        o8.b.J(parcel, F);
    }
}
