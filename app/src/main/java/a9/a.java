package a9;

import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.WorkSource;
import java.util.Arrays;
import x8.b0;
import x8.t;

/* loaded from: classes.dex */
public final class a extends j8.a {
    public static final Parcelable.Creator<a> CREATOR = new g();

    /* renamed from: a */
    public final long f411a;

    /* renamed from: b */
    public final int f412b;

    /* renamed from: c */
    public final int f413c;

    /* renamed from: d */
    public final long f414d;

    /* renamed from: e */
    public final boolean f415e;

    /* renamed from: f */
    public final int f416f;

    /* renamed from: g */
    public final String f417g;

    /* renamed from: h */
    public final WorkSource f418h;

    /* renamed from: i */
    public final t f419i;

    public a(long j10, int i10, int i11, long j11, boolean z10, int i12, String str, WorkSource workSource, t tVar) {
        if (!(Build.VERSION.SDK_INT < 30 || str == null)) {
            throw new IllegalArgumentException();
        }
        this.f411a = j10;
        this.f412b = i10;
        this.f413c = i11;
        this.f414d = j11;
        this.f415e = z10;
        this.f416f = i12;
        this.f417g = str;
        this.f418h = workSource;
        this.f419i = tVar;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof a) {
            a aVar = (a) obj;
            return this.f411a == aVar.f411a && this.f412b == aVar.f412b && this.f413c == aVar.f413c && this.f414d == aVar.f414d && this.f415e == aVar.f415e && this.f416f == aVar.f416f && i8.n.a(this.f417g, aVar.f417g) && i8.n.a(this.f418h, aVar.f418h) && i8.n.a(this.f419i, aVar.f419i);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.f411a), Integer.valueOf(this.f412b), Integer.valueOf(this.f413c), Long.valueOf(this.f414d)});
    }

    public final String toString() {
        String str;
        StringBuilder a10 = android.support.v4.media.d.a("CurrentLocationRequest[");
        a10.append(o8.b.I(this.f413c));
        if (this.f411a != Long.MAX_VALUE) {
            a10.append(", maxAge=");
            b0.a(this.f411a, a10);
        }
        if (this.f414d != Long.MAX_VALUE) {
            a10.append(", duration=");
            a10.append(this.f414d);
            a10.append("ms");
        }
        if (this.f412b != 0) {
            a10.append(", ");
            a10.append(tb.a.x(this.f412b));
        }
        if (this.f415e) {
            a10.append(", bypass");
        }
        if (this.f416f != 0) {
            a10.append(", ");
            int i10 = this.f416f;
            if (i10 != 0) {
                if (i10 != 1) {
                    if (i10 == 2) {
                        str = "THROTTLE_NEVER";
                    } else {
                        throw new IllegalArgumentException();
                    }
                } else {
                    str = "THROTTLE_ALWAYS";
                }
            } else {
                str = "THROTTLE_BACKGROUND";
            }
            a10.append(str);
        }
        if (this.f417g != null) {
            a10.append(", moduleId=");
            a10.append(this.f417g);
        }
        if (!n8.b.a(this.f418h)) {
            a10.append(", workSource=");
            a10.append(this.f418h);
        }
        if (this.f419i != null) {
            a10.append(", impersonation=");
            a10.append(this.f419i);
        }
        a10.append(']');
        return a10.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int F = o8.b.F(parcel, 20293);
        o8.b.A(parcel, 1, this.f411a);
        o8.b.z(parcel, 2, this.f412b);
        o8.b.z(parcel, 3, this.f413c);
        o8.b.A(parcel, 4, this.f414d);
        o8.b.t(parcel, 5, this.f415e);
        o8.b.B(parcel, 6, this.f418h, i10);
        o8.b.z(parcel, 7, this.f416f);
        o8.b.C(parcel, 8, this.f417g);
        o8.b.B(parcel, 9, this.f419i, i10);
        o8.b.J(parcel, F);
    }
}
