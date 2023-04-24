package x8;

import android.location.Location;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;

/* loaded from: classes.dex */
public abstract class r0 extends v8.b {
    public r0() {
        super("com.google.android.gms.location.internal.ILocationStatusCallback", 1);
    }

    @Override // v8.b
    public final boolean z0(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 == 1) {
            i.b(parcel);
            b0.c.s((Status) i.a(parcel, Status.CREATOR), (Location) i.a(parcel, Location.CREATOR), ((l) this).f30426b);
            return true;
        }
        return false;
    }
}
