package w8;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* loaded from: classes.dex */
public class a implements IInterface {

    /* renamed from: a */
    public final IBinder f29759a;

    /* renamed from: b */
    public final String f29760b;

    public a(String str, IBinder iBinder) {
        this.f29759a = iBinder;
        this.f29760b = str;
    }

    public final Parcel a0() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f29760b);
        return obtain;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f29759a;
    }

    public final Parcel k(Parcel parcel, int i10) {
        Parcel obtain = Parcel.obtain();
        try {
            try {
                this.f29759a.transact(i10, parcel, obtain, 0);
                obtain.readException();
                return obtain;
            } catch (RuntimeException e10) {
                obtain.recycle();
                throw e10;
            }
        } finally {
            parcel.recycle();
        }
    }
}
