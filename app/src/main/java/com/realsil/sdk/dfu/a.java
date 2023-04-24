package com.realsil.sdk.dfu;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.realsil.sdk.dfu.DfuService;
import com.realsil.sdk.dfu.b;
import ze.e;
import ze.l;

/* loaded from: classes.dex */
public interface a extends IInterface {

    /* renamed from: com.realsil.sdk.dfu.a$a */
    /* loaded from: classes.dex */
    public static abstract class AbstractBinderC0116a extends Binder implements a {

        /* renamed from: a */
        public static final /* synthetic */ int f9476a = 0;

        /* renamed from: com.realsil.sdk.dfu.a$a$a */
        /* loaded from: classes.dex */
        public static class C0117a implements a {

            /* renamed from: a */
            public IBinder f9477a;

            public C0117a(IBinder iBinder) {
                this.f9477a = iBinder;
            }

            @Override // com.realsil.sdk.dfu.a
            public final boolean H(String str, e eVar) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.realsil.sdk.dfu.IRealsilDfu");
                    obtain.writeString(str);
                    if (eVar != null) {
                        obtain.writeInt(1);
                        eVar.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (!this.f9477a.transact(1, obtain, obtain2, 0)) {
                        int i10 = AbstractBinderC0116a.f9476a;
                    }
                    obtain2.readException();
                    return obtain2.readInt() != 0;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.realsil.sdk.dfu.a
            public final void P(String str, b bVar) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.realsil.sdk.dfu.IRealsilDfu");
                    obtain.writeString(str);
                    obtain.writeStrongBinder(bVar != null ? bVar.asBinder() : null);
                    if (!this.f9477a.transact(7, obtain, obtain2, 0)) {
                        int i10 = AbstractBinderC0116a.f9476a;
                    }
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.realsil.sdk.dfu.a
            public final boolean a() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.realsil.sdk.dfu.IRealsilDfu");
                    if (!this.f9477a.transact(3, obtain, obtain2, 0)) {
                        int i10 = AbstractBinderC0116a.f9476a;
                    }
                    obtain2.readException();
                    return obtain2.readInt() != 0;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public final IBinder asBinder() {
                return this.f9477a;
            }

            @Override // com.realsil.sdk.dfu.a
            public final boolean c0(String str, b bVar) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.realsil.sdk.dfu.IRealsilDfu");
                    obtain.writeString(str);
                    obtain.writeStrongBinder(bVar != null ? bVar.asBinder() : null);
                    if (!this.f9477a.transact(6, obtain, obtain2, 0)) {
                        int i10 = AbstractBinderC0116a.f9476a;
                    }
                    obtain2.readException();
                    return obtain2.readInt() != 0;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public AbstractBinderC0116a() {
            attachInterface(this, "com.realsil.sdk.dfu.IRealsilDfu");
        }

        @Override // android.os.IInterface
        public final IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public final boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11) {
            boolean z10;
            boolean z11;
            if (i10 != 1598968902) {
                int i12 = 0;
                e eVar = null;
                b bVar = null;
                b bVar2 = null;
                DfuService dfuService = null;
                switch (i10) {
                    case 1:
                        parcel.enforceInterface("com.realsil.sdk.dfu.IRealsilDfu");
                        String readString = parcel.readString();
                        if (parcel.readInt() != 0) {
                            eVar = e.CREATOR.createFromParcel(parcel);
                        }
                        boolean H = ((DfuService.d) this).H(readString, eVar);
                        parcel2.writeNoException();
                        parcel2.writeInt(H ? 1 : 0);
                        return true;
                    case 2:
                        parcel.enforceInterface("com.realsil.sdk.dfu.IRealsilDfu");
                        if (parcel.readInt() != 0) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        DfuService dfuService2 = ((DfuService.d) this).f9474b;
                        if (dfuService2 != null) {
                            dfuService = dfuService2;
                        }
                        if (dfuService != null) {
                            ve.a aVar = dfuService.f9462f;
                            if (aVar != null && aVar.g(z10)) {
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                            if (z11) {
                                i12 = 1;
                            }
                        }
                        parcel2.writeNoException();
                        parcel2.writeInt(i12);
                        return true;
                    case 3:
                        parcel.enforceInterface("com.realsil.sdk.dfu.IRealsilDfu");
                        boolean a10 = ((DfuService.d) this).a();
                        parcel2.writeNoException();
                        parcel2.writeInt(a10 ? 1 : 0);
                        return true;
                    case 4:
                        parcel.enforceInterface("com.realsil.sdk.dfu.IRealsilDfu");
                        int i13 = DfuService.this.f9466j;
                        parcel2.writeNoException();
                        parcel2.writeInt(i13);
                        return true;
                    case 5:
                        parcel.enforceInterface("com.realsil.sdk.dfu.IRealsilDfu");
                        l lVar = DfuService.this.f9467k;
                        parcel2.writeNoException();
                        if (lVar != null) {
                            parcel2.writeInt(1);
                            lVar.writeToParcel(parcel2, 1);
                        } else {
                            parcel2.writeInt(0);
                        }
                        return true;
                    case 6:
                        parcel.enforceInterface("com.realsil.sdk.dfu.IRealsilDfu");
                        String readString2 = parcel.readString();
                        IBinder readStrongBinder = parcel.readStrongBinder();
                        if (readStrongBinder != null) {
                            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.realsil.sdk.dfu.IRealsilDfuCallback");
                            if (queryLocalInterface != null && (queryLocalInterface instanceof b)) {
                                bVar2 = (b) queryLocalInterface;
                            } else {
                                bVar2 = new b.a.C0118a(readStrongBinder);
                            }
                        }
                        boolean c02 = ((DfuService.d) this).c0(readString2, bVar2);
                        parcel2.writeNoException();
                        parcel2.writeInt(c02 ? 1 : 0);
                        return true;
                    case 7:
                        parcel.enforceInterface("com.realsil.sdk.dfu.IRealsilDfu");
                        String readString3 = parcel.readString();
                        IBinder readStrongBinder2 = parcel.readStrongBinder();
                        if (readStrongBinder2 != null) {
                            IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.realsil.sdk.dfu.IRealsilDfuCallback");
                            if (queryLocalInterface2 != null && (queryLocalInterface2 instanceof b)) {
                                bVar = (b) queryLocalInterface2;
                            } else {
                                bVar = new b.a.C0118a(readStrongBinder2);
                            }
                        }
                        ((DfuService.d) this).P(readString3, bVar);
                        parcel2.writeNoException();
                        return true;
                    default:
                        return super.onTransact(i10, parcel, parcel2, i11);
                }
            }
            parcel2.writeString("com.realsil.sdk.dfu.IRealsilDfu");
            return true;
        }
    }

    boolean H(String str, e eVar);

    void P(String str, b bVar);

    boolean a();

    boolean c0(String str, b bVar);
}
