package com.huawei.hms.hmsscankit.api;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.huawei.hms.hmsscankit.api.IRemoteFrameDecoderDelegate;

/* loaded from: classes.dex */
public interface IRemoteDecoderCreator extends IInterface {

    /* loaded from: classes.dex */
    public static class Default implements IRemoteDecoderCreator {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // com.huawei.hms.hmsscankit.api.IRemoteDecoderCreator
        public IRemoteFrameDecoderDelegate newRemoteFrameDecoderDelegate() {
            return null;
        }
    }

    /* loaded from: classes.dex */
    public static abstract class Stub extends Binder implements IRemoteDecoderCreator {
        private static final String DESCRIPTOR = "com.huawei.hms.hmsscankit.api.IRemoteDecoderCreator";
        public static final int TRANSACTION_newRemoteFrameDecoderDelegate = 1;

        /* loaded from: classes.dex */
        public static class Proxy implements IRemoteDecoderCreator {
            public static IRemoteDecoderCreator sDefaultImpl;
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

            @Override // com.huawei.hms.hmsscankit.api.IRemoteDecoderCreator
            public IRemoteFrameDecoderDelegate newRemoteFrameDecoderDelegate() {
                IRemoteFrameDecoderDelegate asInterface;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (this.mRemote.transact(1, obtain, obtain2, 0) || Stub.getDefaultImpl() == null) {
                        obtain2.readException();
                        asInterface = IRemoteFrameDecoderDelegate.Stub.asInterface(obtain2.readStrongBinder());
                    } else {
                        asInterface = Stub.getDefaultImpl().newRemoteFrameDecoderDelegate();
                    }
                    return asInterface;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public Stub() {
            attachInterface(this, DESCRIPTOR);
        }

        public static IRemoteDecoderCreator asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(DESCRIPTOR);
            return (queryLocalInterface == null || !(queryLocalInterface instanceof IRemoteDecoderCreator)) ? new Proxy(iBinder) : (IRemoteDecoderCreator) queryLocalInterface;
        }

        public static IRemoteDecoderCreator getDefaultImpl() {
            return Proxy.sDefaultImpl;
        }

        public static boolean setDefaultImpl(IRemoteDecoderCreator iRemoteDecoderCreator) {
            if (Proxy.sDefaultImpl != null || iRemoteDecoderCreator == null) {
                return false;
            }
            Proxy.sDefaultImpl = iRemoteDecoderCreator;
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
            IRemoteFrameDecoderDelegate newRemoteFrameDecoderDelegate = newRemoteFrameDecoderDelegate();
            parcel2.writeNoException();
            parcel2.writeStrongBinder(newRemoteFrameDecoderDelegate != null ? newRemoteFrameDecoderDelegate.asBinder() : null);
            return true;
        }
    }

    IRemoteFrameDecoderDelegate newRemoteFrameDecoderDelegate();
}
