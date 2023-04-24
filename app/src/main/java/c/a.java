package c;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import c.b;

/* loaded from: classes.dex */
public interface a extends IInterface {

    /* renamed from: c.a$a */
    /* loaded from: classes.dex */
    public static abstract class AbstractBinderC0063a extends Binder implements a {

        /* renamed from: a */
        public static final /* synthetic */ int f4495a = 0;

        /* renamed from: c.a$a$a */
        /* loaded from: classes.dex */
        public static class C0064a implements a {

            /* renamed from: a */
            public IBinder f4496a;

            public C0064a(IBinder iBinder) {
                this.f4496a = iBinder;
            }

            @Override // android.os.IInterface
            public final IBinder asBinder() {
                return this.f4496a;
            }
        }

        public AbstractBinderC0063a() {
            attachInterface(this, "android.support.v4.os.IResultReceiver");
        }

        @Override // android.os.IInterface
        public final IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public final boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11) {
            Object obj;
            if (i10 >= 1 && i10 <= 16777215) {
                parcel.enforceInterface("android.support.v4.os.IResultReceiver");
            }
            if (i10 != 1598968902) {
                if (i10 != 1) {
                    return super.onTransact(i10, parcel, parcel2, i11);
                }
                int readInt = parcel.readInt();
                Parcelable.Creator creator = Bundle.CREATOR;
                if (parcel.readInt() != 0) {
                    obj = creator.createFromParcel(parcel);
                } else {
                    obj = null;
                }
                b.BinderC0065b binderC0065b = (b.BinderC0065b) this;
                b.this.getClass();
                b.this.a(readInt, (Bundle) obj);
                return true;
            }
            parcel2.writeString("android.support.v4.os.IResultReceiver");
            return true;
        }
    }
}
