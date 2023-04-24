package i8;

import android.os.IBinder;
import android.os.Parcel;

/* loaded from: classes.dex */
public final class j1 extends w8.a implements k {
    public j1(IBinder iBinder) {
        super("com.google.android.gms.common.internal.ICancelToken", iBinder);
    }

    @Override // i8.k
    public final void cancel() {
        Parcel a02 = a0();
        try {
            this.f29759a.transact(2, a02, null, 1);
        } finally {
            a02.recycle();
        }
    }
}
