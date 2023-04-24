package h8;

import android.os.Parcel;
import com.google.android.gms.common.api.Status;

/* loaded from: classes.dex */
public abstract class e extends v8.b {
    public e() {
        super("com.google.android.gms.common.api.internal.IStatusCallback", 0);
    }

    @Override // v8.b
    public final boolean y0(int i10, Parcel parcel, Parcel parcel2) {
        if (i10 == 1) {
            v8.c.b(parcel);
            x8.k kVar = (x8.k) this;
            b0.c.s((Status) v8.c.a(parcel, Status.CREATOR), kVar.f30423b, kVar.f30424c);
            return true;
        }
        return false;
    }
}
