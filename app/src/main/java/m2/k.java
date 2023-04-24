package m2;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import androidx.room.MultiInstanceInvalidationService;
import m2.j;

/* loaded from: classes.dex */
public interface k extends IInterface {

    /* loaded from: classes.dex */
    public static abstract class a extends Binder implements k {

        /* renamed from: a */
        public static final /* synthetic */ int f20213a = 0;

        /* renamed from: m2.k$a$a */
        /* loaded from: classes.dex */
        public static class C0369a implements k {

            /* renamed from: a */
            public IBinder f20214a;

            public C0369a(IBinder iBinder) {
                this.f20214a = iBinder;
            }

            @Override // android.os.IInterface
            public final IBinder asBinder() {
                return this.f20214a;
            }

            @Override // m2.k
            public final int h0(j jVar, String str) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("androidx.room.IMultiInstanceInvalidationService");
                    obtain.writeStrongBinder(jVar != null ? jVar.asBinder() : null);
                    obtain.writeString(str);
                    if (!this.f20214a.transact(1, obtain, obtain2, 0)) {
                        int i10 = a.f20213a;
                    }
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // m2.k
            public final void k0(String[] strArr, int i10) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("androidx.room.IMultiInstanceInvalidationService");
                    obtain.writeInt(i10);
                    obtain.writeStringArray(strArr);
                    if (!this.f20214a.transact(3, obtain, null, 1)) {
                        int i11 = a.f20213a;
                    }
                } finally {
                    obtain.recycle();
                }
            }
        }

        public a() {
            attachInterface(this, "androidx.room.IMultiInstanceInvalidationService");
        }

        @Override // android.os.IInterface
        public final IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public final boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11) {
            j jVar = null;
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        if (i10 != 1598968902) {
                            return super.onTransact(i10, parcel, parcel2, i11);
                        }
                        parcel2.writeString("androidx.room.IMultiInstanceInvalidationService");
                        return true;
                    }
                    parcel.enforceInterface("androidx.room.IMultiInstanceInvalidationService");
                    MultiInstanceInvalidationService.a aVar = (MultiInstanceInvalidationService.a) this;
                    aVar.k0(parcel.createStringArray(), parcel.readInt());
                    return true;
                }
                parcel.enforceInterface("androidx.room.IMultiInstanceInvalidationService");
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("androidx.room.IMultiInstanceInvalidationCallback");
                    if (queryLocalInterface != null && (queryLocalInterface instanceof j)) {
                        jVar = (j) queryLocalInterface;
                    } else {
                        jVar = new j.a.C0368a(readStrongBinder);
                    }
                }
                int readInt = parcel.readInt();
                gm.l.f(jVar, "callback");
                MultiInstanceInvalidationService multiInstanceInvalidationService = MultiInstanceInvalidationService.this;
                synchronized (multiInstanceInvalidationService.f3345c) {
                    multiInstanceInvalidationService.f3345c.unregister(jVar);
                    String str = (String) multiInstanceInvalidationService.f3344b.remove(Integer.valueOf(readInt));
                }
                parcel2.writeNoException();
                return true;
            }
            parcel.enforceInterface("androidx.room.IMultiInstanceInvalidationService");
            IBinder readStrongBinder2 = parcel.readStrongBinder();
            if (readStrongBinder2 != null) {
                IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("androidx.room.IMultiInstanceInvalidationCallback");
                if (queryLocalInterface2 != null && (queryLocalInterface2 instanceof j)) {
                    jVar = (j) queryLocalInterface2;
                } else {
                    jVar = new j.a.C0368a(readStrongBinder2);
                }
            }
            int h02 = ((MultiInstanceInvalidationService.a) this).h0(jVar, parcel.readString());
            parcel2.writeNoException();
            parcel2.writeInt(h02);
            return true;
        }
    }

    int h0(j jVar, String str);

    void k0(String[] strArr, int i10);
}
