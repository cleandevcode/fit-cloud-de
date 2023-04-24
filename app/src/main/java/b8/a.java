package b8;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* loaded from: classes.dex */
public interface a extends IInterface {

    /* renamed from: b8.a$a */
    /* loaded from: classes.dex */
    public static abstract class AbstractBinderC0052a extends Binder implements a {

        /* renamed from: a */
        public static final /* synthetic */ int f4034a = 0;

        /* renamed from: b8.a$a$a */
        /* loaded from: classes.dex */
        public static class C0053a implements a {

            /* renamed from: a */
            public IBinder f4035a;

            public C0053a(IBinder iBinder) {
                this.f4035a = iBinder;
            }

            @Override // b8.a
            public final Bundle E(Bundle bundle) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
                    obtain.writeInt(1);
                    bundle.writeToParcel(obtain, 0);
                    this.f4035a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(obtain2) : null;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public final IBinder asBinder() {
                return this.f4035a;
            }
        }
    }

    Bundle E(Bundle bundle);
}
