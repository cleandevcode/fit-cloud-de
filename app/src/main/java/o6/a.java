package o6;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* loaded from: classes.dex */
public interface a extends IInterface {

    /* renamed from: o6.a$a */
    /* loaded from: classes.dex */
    public static abstract class AbstractBinderC0408a extends Binder implements a {

        /* renamed from: a */
        public static final /* synthetic */ int f22880a = 0;

        /* renamed from: o6.a$a$a */
        /* loaded from: classes.dex */
        public static class C0409a implements a {

            /* renamed from: a */
            public IBinder f22881a;

            public C0409a(IBinder iBinder) {
                this.f22881a = iBinder;
            }

            @Override // android.os.IInterface
            public final IBinder asBinder() {
                return this.f22881a;
            }

            @Override // o6.a
            public final int d(Bundle bundle) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.facebook.ppml.receiver.IReceiverService");
                    obtain.writeInt(1);
                    bundle.writeToParcel(obtain, 0);
                    if (!this.f22881a.transact(1, obtain, obtain2, 0)) {
                        int i10 = AbstractBinderC0408a.f22880a;
                    }
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public static a k(IBinder iBinder) {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.facebook.ppml.receiver.IReceiverService");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof a)) ? new C0409a(iBinder) : (a) queryLocalInterface;
        }
    }

    int d(Bundle bundle);
}
