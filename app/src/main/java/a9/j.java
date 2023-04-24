package a9;

import android.os.Parcel;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.location.LocationResult;
import x8.s;

/* loaded from: classes.dex */
public abstract class j extends v8.b implements k {

    /* renamed from: b */
    public static final /* synthetic */ int f434b = 0;

    public j() {
        super("com.google.android.gms.location.ILocationCallback", 1);
    }

    @Override // v8.b
    public final boolean z0(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    return false;
                }
                ((s) this).z();
            } else {
                x8.i.b(parcel);
                ((s) this).f30433c.c().a(new x8.q((LocationAvailability) x8.i.a(parcel, LocationAvailability.CREATOR)));
            }
        } else {
            x8.i.b(parcel);
            ((s) this).f30433c.c().a(new x8.p((LocationResult) x8.i.a(parcel, LocationResult.CREATOR)));
        }
        return true;
    }
}
