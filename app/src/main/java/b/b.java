package b;

import android.net.Uri;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import b.a;
import p.d;

/* loaded from: classes.dex */
public interface b extends IInterface {

    /* loaded from: classes.dex */
    public static abstract class a extends Binder implements b {

        /* renamed from: a */
        public static final /* synthetic */ int f3922a = 0;

        /* renamed from: b.b$a$a */
        /* loaded from: classes.dex */
        public static class C0046a implements b {

            /* renamed from: a */
            public IBinder f3923a;

            public C0046a(IBinder iBinder) {
                this.f3923a = iBinder;
            }

            @Override // b.b
            public final boolean B(b.a aVar, Uri uri) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.customtabs.ICustomTabsService");
                    obtain.writeStrongBinder(aVar != null ? (a.AbstractBinderC0045a) aVar : null);
                    obtain.writeInt(1);
                    uri.writeToParcel(obtain, 0);
                    obtain.writeInt(0);
                    obtain.writeTypedList(null);
                    this.f3923a.transact(4, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt() != 0;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // b.b
            public final boolean F(d dVar) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.customtabs.ICustomTabsService");
                    obtain.writeStrongBinder(dVar);
                    this.f3923a.transact(3, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt() != 0;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public final IBinder asBinder() {
                return this.f3923a;
            }

            @Override // b.b
            public final boolean u0() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.customtabs.ICustomTabsService");
                    obtain.writeLong(0L);
                    this.f3923a.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt() != 0;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }
    }

    boolean B(b.a aVar, Uri uri);

    boolean F(d dVar);

    boolean u0();
}
