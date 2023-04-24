package com.huawei.hms.hmsscankit.api;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.huawei.hms.ml.scan.HmsScan;

/* loaded from: classes.dex */
public interface IOnResultCallback extends IInterface {

    /* loaded from: classes.dex */
    public static class Default implements IOnResultCallback {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // com.huawei.hms.hmsscankit.api.IOnResultCallback
        public void onResult(HmsScan[] hmsScanArr) {
        }
    }

    /* loaded from: classes.dex */
    public static abstract class Stub extends Binder implements IOnResultCallback {
        private static final String DESCRIPTOR = "com.huawei.hms.hmsscankit.api.IOnResultCallback";
        public static final int TRANSACTION_onResult = 1;

        /* loaded from: classes.dex */
        public static class Proxy implements IOnResultCallback {
            public static IOnResultCallback sDefaultImpl;
            private IBinder mRemote;

            public Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.mRemote;
            }

            public String getInterfaceDescriptor() {
                return Stub.DESCRIPTOR;
            }

            @Override // com.huawei.hms.hmsscankit.api.IOnResultCallback
            public void onResult(HmsScan[] hmsScanArr) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeTypedArray(hmsScanArr, 0);
                    if (this.mRemote.transact(1, obtain, obtain2, 0) || Stub.getDefaultImpl() == null) {
                        obtain2.readException();
                    } else {
                        Stub.getDefaultImpl().onResult(hmsScanArr);
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public Stub() {
            attachInterface(this, DESCRIPTOR);
        }

        public static IOnResultCallback asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(DESCRIPTOR);
            return (queryLocalInterface == null || !(queryLocalInterface instanceof IOnResultCallback)) ? new Proxy(iBinder) : (IOnResultCallback) queryLocalInterface;
        }

        public static IOnResultCallback getDefaultImpl() {
            return Proxy.sDefaultImpl;
        }

        public static boolean setDefaultImpl(IOnResultCallback iOnResultCallback) {
            if (Proxy.sDefaultImpl != null || iOnResultCallback == null) {
                return false;
            }
            Proxy.sDefaultImpl = iOnResultCallback;
            return true;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11) {
            if (i10 != 1) {
                if (i10 != 1598968902) {
                    return super.onTransact(i10, parcel, parcel2, i11);
                }
                parcel2.writeString(DESCRIPTOR);
                return true;
            }
            parcel.enforceInterface(DESCRIPTOR);
            onResult((HmsScan[]) parcel.createTypedArray(HmsScan.CREATOR));
            parcel2.writeNoException();
            return true;
        }
    }

    void onResult(HmsScan[] hmsScanArr);
}
