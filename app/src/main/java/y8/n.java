package y8;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.maps.model.LatLng;

/* loaded from: classes.dex */
public final class n extends a implements b {
    public n(IBinder iBinder) {
        super("com.google.android.gms.maps.model.internal.IMarkerDelegate", iBinder);
    }

    @Override // y8.b
    public final int I() {
        Parcel k10 = k(a0(), 17);
        int readInt = k10.readInt();
        k10.recycle();
        return readInt;
    }

    @Override // y8.b
    public final boolean e0(b bVar) {
        boolean z10;
        Parcel a02 = a0();
        j.c(a02, bVar);
        Parcel k10 = k(a02, 16);
        if (k10.readInt() != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        k10.recycle();
        return z10;
    }

    @Override // y8.b
    public final void t0(LatLng latLng) {
        Parcel a02 = a0();
        j.b(a02, latLng);
        f0(a02, 3);
    }
}
