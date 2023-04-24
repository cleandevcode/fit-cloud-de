package m2;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import m2.o;

/* loaded from: classes.dex */
public interface j extends IInterface {

    /* loaded from: classes.dex */
    public static abstract class a extends Binder implements j {

        /* renamed from: a */
        public static final /* synthetic */ int f20211a = 0;

        /* renamed from: m2.j$a$a */
        /* loaded from: classes.dex */
        public static class C0368a implements j {

            /* renamed from: a */
            public IBinder f20212a;

            public C0368a(IBinder iBinder) {
                this.f20212a = iBinder;
            }

            @Override // android.os.IInterface
            public final IBinder asBinder() {
                return this.f20212a;
            }

            @Override // m2.j
            public final void f(String[] strArr) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("androidx.room.IMultiInstanceInvalidationCallback");
                    obtain.writeStringArray(strArr);
                    if (!this.f20212a.transact(1, obtain, null, 1)) {
                        int i10 = a.f20211a;
                    }
                } finally {
                    obtain.recycle();
                }
            }
        }

        public a() {
            attachInterface(this, "androidx.room.IMultiInstanceInvalidationCallback");
        }

        @Override // android.os.IInterface
        public final IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public final boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11) {
            if (i10 != 1) {
                if (i10 != 1598968902) {
                    return super.onTransact(i10, parcel, parcel2, i11);
                }
                parcel2.writeString("androidx.room.IMultiInstanceInvalidationCallback");
                return true;
            }
            parcel.enforceInterface("androidx.room.IMultiInstanceInvalidationCallback");
            ((o.b) this).f(parcel.createStringArray());
            return true;
        }
    }

    void f(String[] strArr);
}
