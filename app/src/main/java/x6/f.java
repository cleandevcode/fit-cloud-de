package x6;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import java.util.ArrayList;
import x6.c;
import x6.g;
import y6.e;

/* loaded from: classes.dex */
public interface f extends IInterface {

    /* loaded from: classes.dex */
    public static abstract class a extends Binder implements f {

        /* renamed from: a */
        public static final /* synthetic */ int f30360a = 0;

        /* renamed from: x6.f$a$a */
        /* loaded from: classes.dex */
        public static class C0555a implements f {

            /* renamed from: a */
            public IBinder f30361a;

            public C0555a(IBinder iBinder) {
                this.f30361a = iBinder;
            }

            @Override // x6.f
            public final void W() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.github.kilnn.sport.ISportService");
                    if (!this.f30361a.transact(4, obtain, obtain2, 0)) {
                        int i10 = a.f30360a;
                    }
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public final IBinder asBinder() {
                return this.f30361a;
            }

            @Override // x6.f
            public final void e(g gVar) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.github.kilnn.sport.ISportService");
                    obtain.writeStrongBinder(gVar != null ? gVar.asBinder() : null);
                    if (!this.f30361a.transact(2, obtain, obtain2, 0)) {
                        int i10 = a.f30360a;
                    }
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // x6.f
            public final void g0(g gVar) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.github.kilnn.sport.ISportService");
                    obtain.writeStrongBinder(gVar != null ? gVar.asBinder() : null);
                    if (!this.f30361a.transact(1, obtain, obtain2, 0)) {
                        int i10 = a.f30360a;
                    }
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // x6.f
            public final ArrayList l0() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.github.kilnn.sport.ISportService");
                    if (!this.f30361a.transact(7, obtain, obtain2, 0)) {
                        int i10 = a.f30360a;
                    }
                    obtain2.readException();
                    return obtain2.createTypedArrayList(y6.f.CREATOR);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // x6.f
            public final y6.e r0() {
                y6.e eVar;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.github.kilnn.sport.ISportService");
                    if (!this.f30361a.transact(6, obtain, obtain2, 0)) {
                        int i10 = a.f30360a;
                    }
                    obtain2.readException();
                    if (obtain2.readInt() != 0) {
                        y6.e.CREATOR.getClass();
                        eVar = e.a.a(obtain2);
                    } else {
                        eVar = null;
                    }
                    return eVar;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // x6.f
            public final void t() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.github.kilnn.sport.ISportService");
                    if (!this.f30361a.transact(3, obtain, obtain2, 0)) {
                        int i10 = a.f30360a;
                    }
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // x6.f
            public final String u() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.github.kilnn.sport.ISportService");
                    if (!this.f30361a.transact(5, obtain, obtain2, 0)) {
                        int i10 = a.f30360a;
                    }
                    obtain2.readException();
                    return obtain2.readString();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public a() {
            attachInterface(this, "com.github.kilnn.sport.ISportService");
        }

        @Override // android.os.IInterface
        public final IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public final boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11) {
            if (i10 != 1598968902) {
                g gVar = null;
                switch (i10) {
                    case 1:
                        parcel.enforceInterface("com.github.kilnn.sport.ISportService");
                        IBinder readStrongBinder = parcel.readStrongBinder();
                        if (readStrongBinder != null) {
                            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.github.kilnn.sport.ISportServiceCallback");
                            if (queryLocalInterface != null && (queryLocalInterface instanceof g)) {
                                gVar = (g) queryLocalInterface;
                            } else {
                                gVar = new g.a.C0556a(readStrongBinder);
                            }
                        }
                        ((c.b) this).g0(gVar);
                        parcel2.writeNoException();
                        return true;
                    case 2:
                        parcel.enforceInterface("com.github.kilnn.sport.ISportService");
                        IBinder readStrongBinder2 = parcel.readStrongBinder();
                        if (readStrongBinder2 != null) {
                            IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.github.kilnn.sport.ISportServiceCallback");
                            if (queryLocalInterface2 != null && (queryLocalInterface2 instanceof g)) {
                                gVar = (g) queryLocalInterface2;
                            } else {
                                gVar = new g.a.C0556a(readStrongBinder2);
                            }
                        }
                        ((c.b) this).e(gVar);
                        parcel2.writeNoException();
                        return true;
                    case 3:
                        parcel.enforceInterface("com.github.kilnn.sport.ISportService");
                        ((c.b) this).t();
                        parcel2.writeNoException();
                        return true;
                    case 4:
                        parcel.enforceInterface("com.github.kilnn.sport.ISportService");
                        ((c.b) this).W();
                        parcel2.writeNoException();
                        return true;
                    case 5:
                        parcel.enforceInterface("com.github.kilnn.sport.ISportService");
                        String u10 = ((c.b) this).u();
                        parcel2.writeNoException();
                        parcel2.writeString(u10);
                        return true;
                    case 6:
                        parcel.enforceInterface("com.github.kilnn.sport.ISportService");
                        y6.e r02 = ((c.b) this).r0();
                        parcel2.writeNoException();
                        if (r02 != null) {
                            parcel2.writeInt(1);
                            r02.writeToParcel(parcel2, 1);
                        } else {
                            parcel2.writeInt(0);
                        }
                        return true;
                    case 7:
                        parcel.enforceInterface("com.github.kilnn.sport.ISportService");
                        ArrayList l02 = ((c.b) this).l0();
                        parcel2.writeNoException();
                        parcel2.writeTypedList(l02);
                        return true;
                    default:
                        return super.onTransact(i10, parcel, parcel2, i11);
                }
            }
            parcel2.writeString("com.github.kilnn.sport.ISportService");
            return true;
        }
    }

    void W();

    void e(g gVar);

    void g0(g gVar);

    ArrayList l0();

    y6.e r0();

    void t();

    String u();
}
