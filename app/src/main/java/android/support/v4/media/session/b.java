package android.support.v4.media.session;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.support.v4.media.session.a;

/* loaded from: classes.dex */
public interface b extends IInterface {

    /* loaded from: classes.dex */
    public static abstract class a extends Binder implements b {

        /* renamed from: a */
        public static final /* synthetic */ int f697a = 0;

        /* renamed from: android.support.v4.media.session.b$a$a */
        /* loaded from: classes.dex */
        public static class C0016a implements b {

            /* renamed from: a */
            public IBinder f698a;

            public C0016a(IBinder iBinder) {
                this.f698a = iBinder;
            }

            @Override // android.support.v4.media.session.b
            public final PlaybackStateCompat Y() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    if (!this.f698a.transact(28, obtain, obtain2, 0)) {
                        int i10 = a.f697a;
                    }
                    obtain2.readException();
                    return obtain2.readInt() != 0 ? PlaybackStateCompat.CREATOR.createFromParcel(obtain2) : null;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.support.v4.media.session.b
            public final void a(android.support.v4.media.session.a aVar) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    obtain.writeStrongBinder(aVar != null ? (a.AbstractBinderC0015a) aVar : null);
                    if (!this.f698a.transact(3, obtain, obtain2, 0)) {
                        int i10 = a.f697a;
                    }
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public final IBinder asBinder() {
                return this.f698a;
            }

            @Override // android.support.v4.media.session.b
            public final void m(android.support.v4.media.session.a aVar) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    obtain.writeStrongBinder(aVar != null ? (a.AbstractBinderC0015a) aVar : null);
                    if (!this.f698a.transact(4, obtain, obtain2, 0)) {
                        int i10 = a.f697a;
                    }
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }
    }

    PlaybackStateCompat Y();

    void a(android.support.v4.media.session.a aVar);

    void m(android.support.v4.media.session.a aVar);
}
