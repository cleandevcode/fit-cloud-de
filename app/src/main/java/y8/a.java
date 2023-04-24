package y8;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* loaded from: classes.dex */
public class a implements IInterface {

    /* renamed from: a */
    public final IBinder f31221a;

    /* renamed from: b */
    public final String f31222b;

    public a(String str, IBinder iBinder) {
        this.f31221a = iBinder;
        this.f31222b = str;
    }

    public final Parcel a0() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f31222b);
        return obtain;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f31221a;
    }

    public final void f0(Parcel parcel, int i10) {
        Parcel obtain = Parcel.obtain();
        try {
            this.f31221a.transact(i10, parcel, obtain, 0);
            obtain.readException();
        } finally {
            parcel.recycle();
            obtain.recycle();
        }
    }

    public final Parcel k(Parcel parcel, int i10) {
        Parcel obtain = Parcel.obtain();
        try {
            try {
                this.f31221a.transact(i10, parcel, obtain, 0);
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
