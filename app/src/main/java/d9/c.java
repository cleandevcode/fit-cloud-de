package d9;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import java.util.Arrays;

/* loaded from: classes.dex */
public class c extends j8.a {

    /* renamed from: a */
    public final int f12869a;

    /* renamed from: b */
    public final a f12870b;

    /* renamed from: c */
    public final Float f12871c;

    /* renamed from: d */
    public static final String f12868d = c.class.getSimpleName();
    public static final Parcelable.Creator<c> CREATOR = new q();

    public c() {
        throw null;
    }

    public c(int i10, a aVar, Float f10) {
        boolean z10;
        boolean z11 = f10 != null && f10.floatValue() > 0.0f;
        if (i10 == 3) {
            if (aVar == null || !z11) {
                i10 = 3;
                z10 = false;
                i8.p.a(String.format("Invalid Cap: type=%s bitmapDescriptor=%s bitmapRefWidth=%s", Integer.valueOf(i10), aVar, f10), z10);
                this.f12869a = i10;
                this.f12870b = aVar;
                this.f12871c = f10;
            }
            i10 = 3;
        }
        z10 = true;
        i8.p.a(String.format("Invalid Cap: type=%s bitmapDescriptor=%s bitmapRefWidth=%s", Integer.valueOf(i10), aVar, f10), z10);
        this.f12869a = i10;
        this.f12870b = aVar;
        this.f12871c = f10;
    }

    public final c e() {
        int i10 = this.f12869a;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 == 3) {
                        i8.p.h("bitmapDescriptor must not be null", this.f12870b != null);
                        i8.p.h("bitmapRefWidth must not be null", this.f12871c != null);
                        return new d(this.f12870b, this.f12871c.floatValue());
                    }
                    String str = f12868d;
                    Log.w(str, "Unknown Cap type: " + i10);
                    return this;
                }
                return new j();
            }
            return new l();
        }
        return new b();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof c) {
            c cVar = (c) obj;
            return this.f12869a == cVar.f12869a && i8.n.a(this.f12870b, cVar.f12870b) && i8.n.a(this.f12871c, cVar.f12871c);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f12869a), this.f12870b, this.f12871c});
    }

    public String toString() {
        return androidx.activity.i.a("[Cap: type=", this.f12869a, "]");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        IBinder asBinder;
        int F = o8.b.F(parcel, 20293);
        o8.b.z(parcel, 2, this.f12869a);
        a aVar = this.f12870b;
        if (aVar == null) {
            asBinder = null;
        } else {
            asBinder = aVar.f12867a.asBinder();
        }
        o8.b.y(parcel, 3, asBinder);
        o8.b.x(parcel, 4, this.f12871c);
        o8.b.J(parcel, F);
    }
}
