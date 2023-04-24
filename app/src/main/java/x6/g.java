package x6;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import y6.f;

/* loaded from: classes.dex */
public interface g extends IInterface {

    /* loaded from: classes.dex */
    public static abstract class a extends Binder implements g {

        /* renamed from: a */
        public static final /* synthetic */ int f30362a = 0;

        /* renamed from: x6.g$a$a */
        /* loaded from: classes.dex */
        public static class C0556a implements g {

            /* renamed from: a */
            public IBinder f30363a;

            public C0556a(IBinder iBinder) {
                this.f30363a = iBinder;
            }

            @Override // android.os.IInterface
            public final IBinder asBinder() {
                return this.f30363a;
            }

            @Override // x6.g
            public final void b(int i10) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.github.kilnn.sport.ISportServiceCallback");
                    obtain.writeInt(i10);
                    if (!this.f30363a.transact(1, obtain, obtain2, 0)) {
                        int i11 = a.f30362a;
                    }
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // x6.g
            public final void g(int i10) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.github.kilnn.sport.ISportServiceCallback");
                    obtain.writeInt(i10);
                    if (!this.f30363a.transact(4, obtain, obtain2, 0)) {
                        int i11 = a.f30362a;
                    }
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // x6.g
            public final void o0(y6.f fVar) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.github.kilnn.sport.ISportServiceCallback");
                    if (fVar != null) {
                        obtain.writeInt(1);
                        fVar.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (!this.f30363a.transact(5, obtain, obtain2, 0)) {
                        int i10 = a.f30362a;
                    }
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // x6.g
            public final void s0(int i10) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.github.kilnn.sport.ISportServiceCallback");
                    obtain.writeInt(i10);
                    if (!this.f30363a.transact(2, obtain, obtain2, 0)) {
                        int i11 = a.f30362a;
                    }
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // x6.g
            public final void y(double d10, double d11) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.github.kilnn.sport.ISportServiceCallback");
                    obtain.writeDouble(d10);
                    obtain.writeDouble(d11);
                    if (!this.f30363a.transact(3, obtain, obtain2, 0)) {
                        int i10 = a.f30362a;
                    }
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public a() {
            attachInterface(this, "com.github.kilnn.sport.ISportServiceCallback");
        }

        @Override // android.os.IInterface
        public final IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public final boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11) {
            y6.f fVar;
            if (i10 == 1) {
                parcel.enforceInterface("com.github.kilnn.sport.ISportServiceCallback");
                b(parcel.readInt());
            } else if (i10 == 2) {
                parcel.enforceInterface("com.github.kilnn.sport.ISportServiceCallback");
                s0(parcel.readInt());
            } else if (i10 == 3) {
                parcel.enforceInterface("com.github.kilnn.sport.ISportServiceCallback");
                y(parcel.readDouble(), parcel.readDouble());
            } else if (i10 == 4) {
                parcel.enforceInterface("com.github.kilnn.sport.ISportServiceCallback");
                g(parcel.readInt());
            } else if (i10 != 5) {
                if (i10 != 1598968902) {
                    return super.onTransact(i10, parcel, parcel2, i11);
                }
                parcel2.writeString("com.github.kilnn.sport.ISportServiceCallback");
                return true;
            } else {
                parcel.enforceInterface("com.github.kilnn.sport.ISportServiceCallback");
                if (parcel.readInt() != 0) {
                    y6.f.CREATOR.getClass();
                    fVar = f.a.a(parcel);
                } else {
                    fVar = null;
                }
                o0(fVar);
            }
            parcel2.writeNoException();
            return true;
        }
    }

    void b(int i10);

    void g(int i10);

    void o0(y6.f fVar);

    void s0(int i10);

    void y(double d10, double d11);
}
