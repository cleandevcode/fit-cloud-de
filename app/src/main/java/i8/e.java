package i8;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class e extends j8.a {
    public static final Parcelable.Creator<e> CREATOR = new z0();

    /* renamed from: a */
    public final r f16630a;

    /* renamed from: b */
    public final boolean f16631b;

    /* renamed from: c */
    public final boolean f16632c;

    /* renamed from: d */
    public final int[] f16633d;

    /* renamed from: e */
    public final int f16634e;

    /* renamed from: f */
    public final int[] f16635f;

    public e(r rVar, boolean z10, boolean z11, int[] iArr, int i10, int[] iArr2) {
        this.f16630a = rVar;
        this.f16631b = z10;
        this.f16632c = z11;
        this.f16633d = iArr;
        this.f16634e = i10;
        this.f16635f = iArr2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int F = o8.b.F(parcel, 20293);
        o8.b.B(parcel, 1, this.f16630a, i10);
        o8.b.t(parcel, 2, this.f16631b);
        o8.b.t(parcel, 3, this.f16632c);
        int[] iArr = this.f16633d;
        if (iArr != null) {
            int F2 = o8.b.F(parcel, 4);
            parcel.writeIntArray(iArr);
            o8.b.J(parcel, F2);
        }
        o8.b.z(parcel, 5, this.f16634e);
        int[] iArr2 = this.f16635f;
        if (iArr2 != null) {
            int F3 = o8.b.F(parcel, 6);
            parcel.writeIntArray(iArr2);
            o8.b.J(parcel, F3);
        }
        o8.b.J(parcel, F);
    }
}
