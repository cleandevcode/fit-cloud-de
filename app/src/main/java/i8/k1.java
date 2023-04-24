package i8;

import android.os.Parcel;

/* loaded from: classes.dex */
public abstract class k1 extends w8.b implements m0 {
    public k1() {
        super("com.google.android.gms.common.internal.ICertData");
    }

    @Override // w8.b
    public final boolean k(int i10, Parcel parcel, Parcel parcel2) {
        if (i10 != 1) {
            if (i10 != 2) {
                return false;
            }
            int i11 = ((f8.q) this).f14189a;
            parcel2.writeNoException();
            parcel2.writeInt(i11);
        } else {
            p8.c n10 = ((f8.q) this).n();
            parcel2.writeNoException();
            w8.c.c(parcel2, n10);
        }
        return true;
    }
}
