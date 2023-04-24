package a9;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

@Deprecated
/* loaded from: classes.dex */
public final class e extends j8.a {
    public static final Parcelable.Creator<e> CREATOR = new f();

    /* renamed from: a */
    public final int f426a;

    /* renamed from: b */
    public final int f427b;

    /* renamed from: c */
    public final long f428c;

    /* renamed from: d */
    public final long f429d;

    public e(int i10, int i11, long j10, long j11) {
        this.f426a = i10;
        this.f427b = i11;
        this.f428c = j10;
        this.f429d = j11;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof e) {
            e eVar = (e) obj;
            if (this.f426a == eVar.f426a && this.f427b == eVar.f427b && this.f428c == eVar.f428c && this.f429d == eVar.f429d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f427b), Integer.valueOf(this.f426a), Long.valueOf(this.f429d), Long.valueOf(this.f428c)});
    }

    public final String toString() {
        int i10 = this.f426a;
        int i11 = this.f427b;
        long j10 = this.f429d;
        long j11 = this.f428c;
        StringBuilder a10 = w1.h.a("NetworkLocationStatus: Wifi status: ", i10, " Cell status: ", i11, " elapsed time NS: ");
        a10.append(j10);
        a10.append(" system time ms: ");
        a10.append(j11);
        return a10.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int F = o8.b.F(parcel, 20293);
        o8.b.z(parcel, 1, this.f426a);
        o8.b.z(parcel, 2, this.f427b);
        o8.b.A(parcel, 3, this.f428c);
        o8.b.A(parcel, 4, this.f429d);
        o8.b.J(parcel, F);
    }
}
