package com.realsil.sdk.dfu;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import lf.a;
import ze.g;

/* loaded from: classes.dex */
public interface b extends IInterface {

    /* loaded from: classes.dex */
    public static abstract class a extends Binder implements b {

        /* renamed from: a */
        public static final /* synthetic */ int f9478a = 0;

        /* renamed from: com.realsil.sdk.dfu.b$a$a */
        /* loaded from: classes.dex */
        public static class C0118a implements b {

            /* renamed from: a */
            public IBinder f9479a;

            public C0118a(IBinder iBinder) {
                this.f9479a = iBinder;
            }

            @Override // com.realsil.sdk.dfu.b
            public final void A(g gVar) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.realsil.sdk.dfu.IRealsilDfuCallback");
                    if (gVar != null) {
                        obtain.writeInt(1);
                        gVar.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (!this.f9479a.transact(3, obtain, obtain2, 0)) {
                        int i10 = a.f9478a;
                    }
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.realsil.sdk.dfu.b
            public final void T(int i10) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.realsil.sdk.dfu.IRealsilDfuCallback");
                    obtain.writeInt(i10);
                    if (!this.f9479a.transact(1, obtain, obtain2, 0)) {
                        int i11 = a.f9478a;
                    }
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.realsil.sdk.dfu.b
            public final void a(int i10) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.realsil.sdk.dfu.IRealsilDfuCallback");
                    obtain.writeInt(i10);
                    if (!this.f9479a.transact(2, obtain, obtain2, 0)) {
                        int i11 = a.f9478a;
                    }
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public final IBinder asBinder() {
                return this.f9479a;
            }
        }

        public a() {
            attachInterface(this, "com.realsil.sdk.dfu.IRealsilDfuCallback");
        }

        @Override // android.os.IInterface
        public final IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public final boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11) {
            if (i10 == 1) {
                parcel.enforceInterface("com.realsil.sdk.dfu.IRealsilDfuCallback");
                ((a.BinderC0350a) this).T(parcel.readInt());
            } else if (i10 == 2) {
                parcel.enforceInterface("com.realsil.sdk.dfu.IRealsilDfuCallback");
                ((a.BinderC0350a) this).a(parcel.readInt());
            } else if (i10 != 3) {
                if (i10 != 1598968902) {
                    return super.onTransact(i10, parcel, parcel2, i11);
                }
                parcel2.writeString("com.realsil.sdk.dfu.IRealsilDfuCallback");
                return true;
            } else {
                parcel.enforceInterface("com.realsil.sdk.dfu.IRealsilDfuCallback");
                ((a.BinderC0350a) this).A(parcel.readInt() != 0 ? g.CREATOR.createFromParcel(parcel) : null);
            }
            parcel2.writeNoException();
            return true;
        }
    }

    void A(g gVar);

    void T(int i10);

    void a(int i10);
}
