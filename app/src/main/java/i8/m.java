package i8;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class m extends j8.a {
    public static final Parcelable.Creator<m> CREATOR = new e0();

    /* renamed from: a */
    public final int f16686a;

    /* renamed from: b */
    public final int f16687b;

    /* renamed from: c */
    public final int f16688c;

    /* renamed from: d */
    public final long f16689d;

    /* renamed from: e */
    public final long f16690e;

    /* renamed from: f */
    public final String f16691f;

    /* renamed from: g */
    public final String f16692g;

    /* renamed from: h */
    public final int f16693h;

    /* renamed from: i */
    public final int f16694i;

    public m(int i10, int i11, int i12, long j10, long j11, String str, String str2, int i13, int i14) {
        this.f16686a = i10;
        this.f16687b = i11;
        this.f16688c = i12;
        this.f16689d = j10;
        this.f16690e = j11;
        this.f16691f = str;
        this.f16692g = str2;
        this.f16693h = i13;
        this.f16694i = i14;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int F = o8.b.F(parcel, 20293);
        o8.b.z(parcel, 1, this.f16686a);
        o8.b.z(parcel, 2, this.f16687b);
        o8.b.z(parcel, 3, this.f16688c);
        o8.b.A(parcel, 4, this.f16689d);
        o8.b.A(parcel, 5, this.f16690e);
        o8.b.C(parcel, 6, this.f16691f);
        o8.b.C(parcel, 7, this.f16692g);
        o8.b.z(parcel, 8, this.f16693h);
        o8.b.z(parcel, 9, this.f16694i);
        o8.b.J(parcel, F);
    }
}
