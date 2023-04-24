package com.huawei.hms.feature.dynamic;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* loaded from: classes.dex */
public interface IObjectWrapper extends IInterface {

    /* loaded from: classes.dex */
    public static abstract class Stub extends Binder implements IObjectWrapper {

        /* renamed from: a */
        private static final String f6986a = "com.huawei.hms.feature.dynamic.IObjectWrapper";

        /* loaded from: classes.dex */
        public static class Proxy implements IObjectWrapper {

            /* renamed from: a */
            private IBinder f6987a;

            public Proxy(IBinder iBinder) {
                this.f6987a = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f6987a;
            }

            public String getInterfaceDescriptor() {
                return Stub.f6986a;
            }
        }

        public Stub() {
            attachInterface(this, f6986a);
        }

        public static IObjectWrapper asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(f6986a);
            return (queryLocalInterface == null || !(queryLocalInterface instanceof IObjectWrapper)) ? new Proxy(iBinder) : (IObjectWrapper) queryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11) {
            if (i10 != 1598968902) {
                return super.onTransact(i10, parcel, parcel2, i11);
            }
            parcel2.writeString(f6986a);
            return true;
        }
    }
}
