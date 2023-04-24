package i8;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class x0 extends j8.a {
    public static final Parcelable.Creator<x0> CREATOR = new y0();

    /* renamed from: a */
    public Bundle f16726a;

    /* renamed from: b */
    public f8.c[] f16727b;

    /* renamed from: c */
    public int f16728c;

    /* renamed from: d */
    public e f16729d;

    public x0() {
    }

    public x0(Bundle bundle, f8.c[] cVarArr, int i10, e eVar) {
        this.f16726a = bundle;
        this.f16727b = cVarArr;
        this.f16728c = i10;
        this.f16729d = eVar;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int F = o8.b.F(parcel, 20293);
        o8.b.u(parcel, 1, this.f16726a);
        o8.b.D(parcel, 2, this.f16727b, i10);
        o8.b.z(parcel, 3, this.f16728c);
        o8.b.B(parcel, 4, this.f16729d, i10);
        o8.b.J(parcel, F);
    }
}
