package v8;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* loaded from: classes.dex */
public class b extends Binder implements IInterface {

    /* renamed from: a */
    public final /* synthetic */ int f29170a;

    public b(String str, int i10) {
        this.f29170a = i10;
        if (i10 != 1) {
            attachInterface(this, str);
        } else {
            attachInterface(this, str);
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11) {
        switch (this.f29170a) {
            case 0:
                if (i10 > 16777215) {
                    if (super.onTransact(i10, parcel, parcel2, i11)) {
                        return true;
                    }
                } else {
                    parcel.enforceInterface(getInterfaceDescriptor());
                }
                return y0(i10, parcel, parcel2);
            default:
                if (i10 > 16777215) {
                    if (super.onTransact(i10, parcel, parcel2, i11)) {
                        return true;
                    }
                } else {
                    parcel.enforceInterface(getInterfaceDescriptor());
                }
                return z0(i10, parcel, parcel2, i11);
        }
    }

    public boolean y0(int i10, Parcel parcel, Parcel parcel2) {
        throw null;
    }

    public boolean z0(int i10, Parcel parcel, Parcel parcel2, int i11) {
        throw null;
    }
}
