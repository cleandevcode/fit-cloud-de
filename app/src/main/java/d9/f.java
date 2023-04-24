package d9;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.maps.model.LatLng;
import p8.b;

/* loaded from: classes.dex */
public final class f extends j8.a {
    public static final Parcelable.Creator<f> CREATOR = new t();

    /* renamed from: a */
    public LatLng f12875a;

    /* renamed from: b */
    public String f12876b;

    /* renamed from: c */
    public String f12877c;

    /* renamed from: d */
    public a f12878d;

    /* renamed from: e */
    public float f12879e;

    /* renamed from: f */
    public float f12880f;

    /* renamed from: g */
    public boolean f12881g;

    /* renamed from: h */
    public boolean f12882h;

    /* renamed from: i */
    public boolean f12883i;

    /* renamed from: j */
    public float f12884j;

    /* renamed from: k */
    public float f12885k;

    /* renamed from: l */
    public float f12886l;

    /* renamed from: m */
    public float f12887m;

    /* renamed from: n */
    public float f12888n;

    public f() {
        this.f12879e = 0.5f;
        this.f12880f = 1.0f;
        this.f12882h = true;
        this.f12883i = false;
        this.f12884j = 0.0f;
        this.f12885k = 0.5f;
        this.f12886l = 0.0f;
        this.f12887m = 1.0f;
    }

    public f(LatLng latLng, String str, String str2, IBinder iBinder, float f10, float f11, boolean z10, boolean z11, boolean z12, float f12, float f13, float f14, float f15, float f16) {
        this.f12879e = 0.5f;
        this.f12880f = 1.0f;
        this.f12882h = true;
        this.f12883i = false;
        this.f12884j = 0.0f;
        this.f12885k = 0.5f;
        this.f12886l = 0.0f;
        this.f12887m = 1.0f;
        this.f12875a = latLng;
        this.f12876b = str;
        this.f12877c = str2;
        this.f12878d = iBinder == null ? null : new a(b.a.a0(iBinder));
        this.f12879e = f10;
        this.f12880f = f11;
        this.f12881g = z10;
        this.f12882h = z11;
        this.f12883i = z12;
        this.f12884j = f12;
        this.f12885k = f13;
        this.f12886l = f14;
        this.f12887m = f15;
        this.f12888n = f16;
    }

    public final void e(LatLng latLng) {
        if (latLng == null) {
            throw new IllegalArgumentException("latlng cannot be null - a position is required.");
        }
        this.f12875a = latLng;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        IBinder asBinder;
        int F = o8.b.F(parcel, 20293);
        o8.b.B(parcel, 2, this.f12875a, i10);
        o8.b.C(parcel, 3, this.f12876b);
        o8.b.C(parcel, 4, this.f12877c);
        a aVar = this.f12878d;
        if (aVar == null) {
            asBinder = null;
        } else {
            asBinder = aVar.f12867a.asBinder();
        }
        o8.b.y(parcel, 5, asBinder);
        o8.b.w(parcel, 6, this.f12879e);
        o8.b.w(parcel, 7, this.f12880f);
        o8.b.t(parcel, 8, this.f12881g);
        o8.b.t(parcel, 9, this.f12882h);
        o8.b.t(parcel, 10, this.f12883i);
        o8.b.w(parcel, 11, this.f12884j);
        o8.b.w(parcel, 12, this.f12885k);
        o8.b.w(parcel, 13, this.f12886l);
        o8.b.w(parcel, 14, this.f12887m);
        o8.b.w(parcel, 15, this.f12888n);
        o8.b.J(parcel, F);
    }
}
