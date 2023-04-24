package x8;

import android.app.PendingIntent;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;

@Deprecated
/* loaded from: classes.dex */
public final class z extends j8.a {
    public static final Parcelable.Creator<z> CREATOR = new a0();

    /* renamed from: a */
    public final int f30449a;

    /* renamed from: b */
    public final x f30450b;

    /* renamed from: c */
    public final a9.n f30451c;

    /* renamed from: d */
    public final a9.k f30452d;

    /* renamed from: e */
    public final PendingIntent f30453e;

    /* renamed from: f */
    public final o0 f30454f;

    /* renamed from: g */
    public final String f30455g;

    public z(int i10, x xVar, IBinder iBinder, IBinder iBinder2, PendingIntent pendingIntent, IBinder iBinder3, String str) {
        a9.n nVar;
        a9.k kVar;
        this.f30449a = i10;
        this.f30450b = xVar;
        o0 o0Var = null;
        if (iBinder != null) {
            int i11 = a9.m.f435b;
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.location.ILocationListener");
            if (queryLocalInterface instanceof a9.n) {
                nVar = (a9.n) queryLocalInterface;
            } else {
                nVar = new a9.l(iBinder);
            }
        } else {
            nVar = null;
        }
        this.f30451c = nVar;
        this.f30453e = pendingIntent;
        if (iBinder2 != null) {
            int i12 = a9.j.f434b;
            IInterface queryLocalInterface2 = iBinder2.queryLocalInterface("com.google.android.gms.location.ILocationCallback");
            if (queryLocalInterface2 instanceof a9.k) {
                kVar = (a9.k) queryLocalInterface2;
            } else {
                kVar = new a9.i(iBinder2);
            }
        } else {
            kVar = null;
        }
        this.f30452d = kVar;
        if (iBinder3 != null) {
            IInterface queryLocalInterface3 = iBinder3.queryLocalInterface("com.google.android.gms.location.internal.IFusedLocationProviderCallback");
            if (queryLocalInterface3 instanceof o0) {
                o0Var = (o0) queryLocalInterface3;
            } else {
                o0Var = new m0(iBinder3);
            }
        }
        this.f30454f = o0Var;
        this.f30455g = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        IBinder asBinder;
        IBinder asBinder2;
        int F = o8.b.F(parcel, 20293);
        o8.b.z(parcel, 1, this.f30449a);
        o8.b.B(parcel, 2, this.f30450b, i10);
        a9.n nVar = this.f30451c;
        IBinder iBinder = null;
        if (nVar == null) {
            asBinder = null;
        } else {
            asBinder = nVar.asBinder();
        }
        o8.b.y(parcel, 3, asBinder);
        o8.b.B(parcel, 4, this.f30453e, i10);
        a9.k kVar = this.f30452d;
        if (kVar == null) {
            asBinder2 = null;
        } else {
            asBinder2 = kVar.asBinder();
        }
        o8.b.y(parcel, 5, asBinder2);
        o0 o0Var = this.f30454f;
        if (o0Var != null) {
            iBinder = o0Var.asBinder();
        }
        o8.b.y(parcel, 6, iBinder);
        o8.b.C(parcel, 8, this.f30455g);
        o8.b.J(parcel, F);
    }
}
