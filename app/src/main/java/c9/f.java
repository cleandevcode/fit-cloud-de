package c9;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* loaded from: classes.dex */
public abstract class f extends y8.i {
    public f() {
        super("com.google.android.gms.maps.internal.IOnMapReadyCallback");
    }

    @Override // y8.i
    public final boolean k(int i10, Parcel parcel, Parcel parcel2) {
        b oVar;
        if (i10 == 1) {
            IBinder readStrongBinder = parcel.readStrongBinder();
            if (readStrongBinder == null) {
                oVar = null;
            } else {
                IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                if (queryLocalInterface instanceof b) {
                    oVar = (b) queryLocalInterface;
                } else {
                    oVar = new o(readStrongBinder);
                }
            }
            y8.j.a(parcel);
            ((b9.f) this).f4044a.a(new b9.a(oVar));
            parcel2.writeNoException();
            return true;
        }
        return false;
    }
}
