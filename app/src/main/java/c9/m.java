package c9;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.maps.GoogleMapOptions;

/* loaded from: classes.dex */
public final class m extends y8.a implements n {
    public m(IBinder iBinder) {
        super("com.google.android.gms.maps.internal.ICreator", iBinder);
    }

    @Override // c9.n
    public final void L(p8.c cVar) {
        Parcel a02 = a0();
        y8.j.c(a02, cVar);
        a02.writeInt(12451000);
        f0(a02, 6);
    }

    @Override // c9.n
    public final y8.m j0() {
        y8.m kVar;
        Parcel k10 = k(a0(), 5);
        IBinder readStrongBinder = k10.readStrongBinder();
        int i10 = y8.l.f31226a;
        if (readStrongBinder == null) {
            kVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.maps.model.internal.IBitmapDescriptorFactoryDelegate");
            if (queryLocalInterface instanceof y8.m) {
                kVar = (y8.m) queryLocalInterface;
            } else {
                kVar = new y8.k(readStrongBinder);
            }
        }
        k10.recycle();
        return kVar;
    }

    @Override // c9.n
    public final int n() {
        Parcel k10 = k(a0(), 9);
        int readInt = k10.readInt();
        k10.recycle();
        return readInt;
    }

    @Override // c9.n
    public final a o() {
        a gVar;
        Parcel k10 = k(a0(), 4);
        IBinder readStrongBinder = k10.readStrongBinder();
        if (readStrongBinder == null) {
            gVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate");
            gVar = queryLocalInterface instanceof a ? (a) queryLocalInterface : new g(readStrongBinder);
        }
        k10.recycle();
        return gVar;
    }

    @Override // c9.n
    public final void p0(p8.c cVar, int i10) {
        Parcel a02 = a0();
        y8.j.c(a02, cVar);
        a02.writeInt(i10);
        f0(a02, 10);
    }

    @Override // c9.n
    public final c q(p8.c cVar, GoogleMapOptions googleMapOptions) {
        c pVar;
        Parcel a02 = a0();
        y8.j.c(a02, cVar);
        y8.j.b(a02, googleMapOptions);
        Parcel k10 = k(a02, 3);
        IBinder readStrongBinder = k10.readStrongBinder();
        if (readStrongBinder == null) {
            pVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.maps.internal.IMapViewDelegate");
            pVar = queryLocalInterface instanceof c ? (c) queryLocalInterface : new p(readStrongBinder);
        }
        k10.recycle();
        return pVar;
    }
}
