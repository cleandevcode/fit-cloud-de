package d9;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class g extends j8.a {
    public static final Parcelable.Creator<g> CREATOR = new u();

    /* renamed from: a */
    public final int f12889a;

    /* renamed from: b */
    public final Float f12890b;

    public g(int i10, Float f10) {
        boolean z10 = true;
        if (i10 != 1 && (f10 == null || f10.floatValue() < 0.0f)) {
            z10 = false;
        }
        i8.p.a("Invalid PatternItem: type=" + i10 + " length=" + f10, z10);
        this.f12889a = i10;
        this.f12890b = f10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof g) {
            g gVar = (g) obj;
            return this.f12889a == gVar.f12889a && i8.n.a(this.f12890b, gVar.f12890b);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f12889a), this.f12890b});
    }

    public final String toString() {
        int i10 = this.f12889a;
        Float f10 = this.f12890b;
        return "[PatternItem: type=" + i10 + " length=" + f10 + "]";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int F = o8.b.F(parcel, 20293);
        o8.b.z(parcel, 2, this.f12889a);
        o8.b.x(parcel, 3, this.f12890b);
        o8.b.J(parcel, F);
    }
}
