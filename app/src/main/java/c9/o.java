package c9;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.maps.model.CameraPosition;

/* loaded from: classes.dex */
public final class o extends y8.a implements b {
    public o(IBinder iBinder) {
        super("com.google.android.gms.maps.internal.IGoogleMapDelegate", iBinder);
    }

    @Override // c9.b
    public final void C(p8.b bVar) {
        Parcel a02 = a0();
        y8.j.c(a02, bVar);
        f0(a02, 4);
    }

    @Override // c9.b
    public final y8.h M(d9.i iVar) {
        y8.h fVar;
        Parcel a02 = a0();
        y8.j.b(a02, iVar);
        Parcel k10 = k(a02, 9);
        IBinder readStrongBinder = k10.readStrongBinder();
        int i10 = y8.g.f31224a;
        if (readStrongBinder == null) {
            fVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.maps.model.internal.IPolylineDelegate");
            if (queryLocalInterface instanceof y8.h) {
                fVar = (y8.h) queryLocalInterface;
            } else {
                fVar = new y8.f(readStrongBinder);
            }
        }
        k10.recycle();
        return fVar;
    }

    @Override // c9.b
    public final y8.e O(d9.h hVar) {
        y8.e cVar;
        Parcel a02 = a0();
        y8.j.b(a02, hVar);
        Parcel k10 = k(a02, 10);
        IBinder readStrongBinder = k10.readStrongBinder();
        int i10 = y8.d.f31223a;
        if (readStrongBinder == null) {
            cVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.maps.model.internal.IPolygonDelegate");
            if (queryLocalInterface instanceof y8.e) {
                cVar = (y8.e) queryLocalInterface;
            } else {
                cVar = new y8.c(readStrongBinder);
            }
        }
        k10.recycle();
        return cVar;
    }

    @Override // c9.b
    public final e X() {
        e jVar;
        Parcel k10 = k(a0(), 25);
        IBinder readStrongBinder = k10.readStrongBinder();
        if (readStrongBinder == null) {
            jVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.maps.internal.IUiSettingsDelegate");
            jVar = queryLocalInterface instanceof e ? (e) queryLocalInterface : new j(readStrongBinder);
        }
        k10.recycle();
        return jVar;
    }

    @Override // c9.b
    public final void clear() {
        f0(a0(), 14);
    }

    @Override // c9.b
    public final y8.b d0(d9.f fVar) {
        y8.b nVar;
        Parcel a02 = a0();
        y8.j.b(a02, fVar);
        Parcel k10 = k(a02, 11);
        IBinder readStrongBinder = k10.readStrongBinder();
        int i10 = y8.o.f31227a;
        if (readStrongBinder == null) {
            nVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.maps.model.internal.IMarkerDelegate");
            if (queryLocalInterface instanceof y8.b) {
                nVar = (y8.b) queryLocalInterface;
            } else {
                nVar = new y8.n(readStrongBinder);
            }
        }
        k10.recycle();
        return nVar;
    }

    @Override // c9.b
    public final d i0() {
        d hVar;
        Parcel k10 = k(a0(), 26);
        IBinder readStrongBinder = k10.readStrongBinder();
        if (readStrongBinder == null) {
            hVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.maps.internal.IProjectionDelegate");
            hVar = queryLocalInterface instanceof d ? (d) queryLocalInterface : new h(readStrongBinder);
        }
        k10.recycle();
        return hVar;
    }

    @Override // c9.b
    public final float n0() {
        Parcel k10 = k(a0(), 2);
        float readFloat = k10.readFloat();
        k10.recycle();
        return readFloat;
    }

    @Override // c9.b
    public final float s() {
        Parcel k10 = k(a0(), 3);
        float readFloat = k10.readFloat();
        k10.recycle();
        return readFloat;
    }

    @Override // c9.b
    public final void v(b9.i iVar, p8.c cVar) {
        Parcel a02 = a0();
        y8.j.c(a02, iVar);
        y8.j.c(a02, cVar);
        f0(a02, 38);
    }

    @Override // c9.b
    public final CameraPosition w() {
        CameraPosition createFromParcel;
        Parcel k10 = k(a0(), 1);
        Parcelable.Creator<CameraPosition> creator = CameraPosition.CREATOR;
        int i10 = y8.j.f31225a;
        if (k10.readInt() == 0) {
            createFromParcel = null;
        } else {
            createFromParcel = creator.createFromParcel(k10);
        }
        CameraPosition cameraPosition = createFromParcel;
        k10.recycle();
        return cameraPosition;
    }
}
