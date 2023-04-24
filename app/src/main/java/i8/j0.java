package i8;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import i8.j;

/* loaded from: classes.dex */
public final class j0 extends j8.a {
    public static final Parcelable.Creator<j0> CREATOR = new k0();

    /* renamed from: a */
    public final int f16677a;

    /* renamed from: b */
    public final IBinder f16678b;

    /* renamed from: c */
    public final f8.a f16679c;

    /* renamed from: d */
    public final boolean f16680d;

    /* renamed from: e */
    public final boolean f16681e;

    public j0(int i10, IBinder iBinder, f8.a aVar, boolean z10, boolean z11) {
        this.f16677a = i10;
        this.f16678b = iBinder;
        this.f16679c = aVar;
        this.f16680d = z10;
        this.f16681e = z11;
    }

    public final boolean equals(Object obj) {
        Object i1Var;
        Object i1Var2;
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j0)) {
            return false;
        }
        j0 j0Var = (j0) obj;
        if (this.f16679c.equals(j0Var.f16679c)) {
            IBinder iBinder = this.f16678b;
            Object obj2 = null;
            if (iBinder == null) {
                i1Var = null;
            } else {
                int i10 = j.a.f16676a;
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
                if (queryLocalInterface instanceof j) {
                    i1Var = (j) queryLocalInterface;
                } else {
                    i1Var = new i1(iBinder);
                }
            }
            IBinder iBinder2 = j0Var.f16678b;
            if (iBinder2 != null) {
                int i11 = j.a.f16676a;
                IInterface queryLocalInterface2 = iBinder2.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
                if (queryLocalInterface2 instanceof j) {
                    i1Var2 = (j) queryLocalInterface2;
                } else {
                    i1Var2 = new i1(iBinder2);
                }
                obj2 = i1Var2;
            }
            if (n.a(i1Var, obj2)) {
                return true;
            }
        }
        return false;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int F = o8.b.F(parcel, 20293);
        o8.b.z(parcel, 1, this.f16677a);
        o8.b.y(parcel, 2, this.f16678b);
        o8.b.B(parcel, 3, this.f16679c, i10);
        o8.b.t(parcel, 4, this.f16680d);
        o8.b.t(parcel, 5, this.f16681e);
        o8.b.J(parcel, F);
    }
}
