package c9;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import p8.b;

/* loaded from: classes.dex */
public final class g extends y8.a implements a {
    public g(IBinder iBinder) {
        super("com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate", iBinder);
    }

    @Override // c9.a
    public final p8.b b0(CameraPosition cameraPosition) {
        Parcel a02 = a0();
        y8.j.b(a02, cameraPosition);
        Parcel k10 = k(a02, 7);
        p8.b a03 = b.a.a0(k10.readStrongBinder());
        k10.recycle();
        return a03;
    }

    @Override // c9.a
    public final p8.b q0(LatLng latLng, float f10) {
        Parcel a02 = a0();
        y8.j.b(a02, latLng);
        a02.writeFloat(f10);
        Parcel k10 = k(a02, 9);
        p8.b a03 = b.a.a0(k10.readStrongBinder());
        k10.recycle();
        return a03;
    }
}
