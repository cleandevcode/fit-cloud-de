package i8;

import android.os.IBinder;
import android.os.Parcel;

/* loaded from: classes.dex */
public final class o0 implements l {

    /* renamed from: a */
    public final IBinder f16697a;

    public o0(IBinder iBinder) {
        this.f16697a = iBinder;
    }

    @Override // i8.l
    public final void Z(t0 t0Var, f fVar) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
            obtain.writeStrongBinder(t0Var);
            obtain.writeInt(1);
            a1.a(fVar, obtain, 0);
            this.f16697a.transact(46, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f16697a;
    }
}
