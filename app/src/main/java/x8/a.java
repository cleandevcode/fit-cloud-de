package x8;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* loaded from: classes.dex */
public class a implements IInterface {

    /* renamed from: a */
    public final IBinder f30396a;

    /* renamed from: b */
    public final String f30397b;

    public a(String str, IBinder iBinder) {
        this.f30396a = iBinder;
        this.f30397b = str;
    }

    public final void a0(Parcel parcel, int i10) {
        Parcel obtain = Parcel.obtain();
        try {
            this.f30396a.transact(i10, parcel, obtain, 0);
            obtain.readException();
        } finally {
            parcel.recycle();
            obtain.recycle();
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f30396a;
    }

    public final Parcel k() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f30397b);
        return obtain;
    }
}
