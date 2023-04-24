package x8;

import android.os.Parcel;

/* loaded from: classes.dex */
public abstract class n0 extends v8.b implements o0 {
    public n0() {
        super("com.google.android.gms.location.internal.IFusedLocationProviderCallback", 1);
    }

    @Override // v8.b
    public final boolean z0(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 == 1) {
            i.b(parcel);
            D((k0) i.a(parcel, k0.CREATOR));
        } else if (i10 != 2) {
            return false;
        } else {
            o();
        }
        return true;
    }
}
