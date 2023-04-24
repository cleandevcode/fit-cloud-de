package x8;

import android.location.Location;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.location.LocationRequest;
import i8.j1;
import i8.k;

/* loaded from: classes.dex */
public final class p0 extends a implements q0 {
    public p0(IBinder iBinder) {
        super("com.google.android.gms.location.internal.IGoogleLocationManagerService", iBinder);
    }

    @Override // x8.q0
    public final void G(v vVar, LocationRequest locationRequest, k kVar) {
        Parcel k10 = k();
        i.c(k10, vVar);
        i.c(k10, locationRequest);
        k10.writeStrongBinder(kVar);
        a0(k10, 88);
    }

    @Override // x8.q0
    public final void J(a9.b bVar, l lVar) {
        Parcel k10 = k();
        i.c(k10, bVar);
        k10.writeStrongBinder(lVar);
        a0(k10, 82);
    }

    @Override // x8.q0
    public final i8.k N(a9.a aVar, l lVar) {
        i8.k j1Var;
        Parcel k10 = k();
        i.c(k10, aVar);
        k10.writeStrongBinder(lVar);
        Parcel obtain = Parcel.obtain();
        try {
            try {
                this.f30396a.transact(87, k10, obtain, 0);
                obtain.readException();
                k10.recycle();
                IBinder readStrongBinder = obtain.readStrongBinder();
                int i10 = k.a.f16682a;
                if (readStrongBinder == null) {
                    j1Var = null;
                } else {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.common.internal.ICancelToken");
                    if (queryLocalInterface instanceof i8.k) {
                        j1Var = (i8.k) queryLocalInterface;
                    } else {
                        j1Var = new j1(readStrongBinder);
                    }
                }
                obtain.recycle();
                return j1Var;
            } catch (RuntimeException e10) {
                obtain.recycle();
                throw e10;
            }
        } catch (Throwable th2) {
            k10.recycle();
            throw th2;
        }
    }

    @Override // x8.q0
    public final void R(z zVar) {
        Parcel k10 = k();
        i.c(k10, zVar);
        a0(k10, 59);
    }

    @Override // x8.q0
    public final void c(v vVar, k kVar) {
        Parcel k10 = k();
        i.c(k10, vVar);
        k10.writeStrongBinder(kVar);
        a0(k10, 89);
    }

    @Override // x8.q0
    public final Location n() {
        Parcel k10 = k();
        Parcel obtain = Parcel.obtain();
        try {
            try {
                this.f30396a.transact(7, k10, obtain, 0);
                obtain.readException();
                k10.recycle();
                Location location = (Location) i.a(obtain, Location.CREATOR);
                obtain.recycle();
                return location;
            } catch (RuntimeException e10) {
                obtain.recycle();
                throw e10;
            }
        } catch (Throwable th2) {
            k10.recycle();
            throw th2;
        }
    }
}
