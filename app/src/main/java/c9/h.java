package c9;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.maps.model.LatLng;
import p8.b;

/* loaded from: classes.dex */
public final class h extends y8.a implements d {
    public h(IBinder iBinder) {
        super("com.google.android.gms.maps.internal.IProjectionDelegate", iBinder);
    }

    @Override // c9.d
    public final p8.b l(LatLng latLng) {
        Parcel a02 = a0();
        y8.j.b(a02, latLng);
        Parcel k10 = k(a02, 2);
        p8.b a03 = b.a.a0(k10.readStrongBinder());
        k10.recycle();
        return a03;
    }

    @Override // c9.d
    public final LatLng x(p8.c cVar) {
        LatLng createFromParcel;
        Parcel a02 = a0();
        y8.j.c(a02, cVar);
        Parcel k10 = k(a02, 1);
        Parcelable.Creator<LatLng> creator = LatLng.CREATOR;
        if (k10.readInt() == 0) {
            createFromParcel = null;
        } else {
            createFromParcel = creator.createFromParcel(k10);
        }
        LatLng latLng = createFromParcel;
        k10.recycle();
        return latLng;
    }
}
