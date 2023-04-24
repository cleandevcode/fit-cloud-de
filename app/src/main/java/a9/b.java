package a9;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import x8.b0;
import x8.t;

/* loaded from: classes.dex */
public final class b extends j8.a {
    public static final Parcelable.Creator<b> CREATOR = new o();

    /* renamed from: a */
    public final long f420a;

    /* renamed from: b */
    public final int f421b;

    /* renamed from: c */
    public final boolean f422c;

    /* renamed from: d */
    public final String f423d;

    /* renamed from: e */
    public final t f424e;

    public b(long j10, int i10, boolean z10, String str, t tVar) {
        this.f420a = j10;
        this.f421b = i10;
        this.f422c = z10;
        this.f423d = str;
        this.f424e = tVar;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof b) {
            b bVar = (b) obj;
            return this.f420a == bVar.f420a && this.f421b == bVar.f421b && this.f422c == bVar.f422c && i8.n.a(this.f423d, bVar.f423d) && i8.n.a(this.f424e, bVar.f424e);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.f420a), Integer.valueOf(this.f421b), Boolean.valueOf(this.f422c)});
    }

    public final String toString() {
        StringBuilder a10 = android.support.v4.media.d.a("LastLocationRequest[");
        if (this.f420a != Long.MAX_VALUE) {
            a10.append("maxAge=");
            b0.a(this.f420a, a10);
        }
        if (this.f421b != 0) {
            a10.append(", ");
            a10.append(tb.a.x(this.f421b));
        }
        if (this.f422c) {
            a10.append(", bypass");
        }
        if (this.f423d != null) {
            a10.append(", moduleId=");
            a10.append(this.f423d);
        }
        if (this.f424e != null) {
            a10.append(", impersonation=");
            a10.append(this.f424e);
        }
        a10.append(']');
        return a10.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int F = o8.b.F(parcel, 20293);
        o8.b.A(parcel, 1, this.f420a);
        o8.b.z(parcel, 2, this.f421b);
        o8.b.t(parcel, 3, this.f422c);
        o8.b.C(parcel, 4, this.f423d);
        o8.b.B(parcel, 5, this.f424e, i10);
        o8.b.J(parcel, F);
    }
}
