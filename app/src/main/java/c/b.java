package c;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import c.a;

@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes.dex */
public class b implements Parcelable {
    public static final Parcelable.Creator<b> CREATOR = new a();

    /* renamed from: a */
    public c.a f4497a;

    /* loaded from: classes.dex */
    public class a implements Parcelable.Creator<b> {
        @Override // android.os.Parcelable.Creator
        public final b createFromParcel(Parcel parcel) {
            return new b(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final b[] newArray(int i10) {
            return new b[i10];
        }
    }

    /* renamed from: c.b$b */
    /* loaded from: classes.dex */
    public class BinderC0065b extends a.AbstractBinderC0063a {
        public BinderC0065b() {
            b.this = r1;
        }
    }

    public b(Parcel parcel) {
        c.a c0064a;
        IBinder readStrongBinder = parcel.readStrongBinder();
        int i10 = a.AbstractBinderC0063a.f4495a;
        if (readStrongBinder == null) {
            c0064a = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("android.support.v4.os.IResultReceiver");
            if (queryLocalInterface != null && (queryLocalInterface instanceof c.a)) {
                c0064a = (c.a) queryLocalInterface;
            } else {
                c0064a = new a.AbstractBinderC0063a.C0064a(readStrongBinder);
            }
        }
        this.f4497a = c0064a;
    }

    public void a(int i10, Bundle bundle) {
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        synchronized (this) {
            if (this.f4497a == null) {
                this.f4497a = new BinderC0065b();
            }
            parcel.writeStrongBinder(this.f4497a.asBinder());
        }
    }
}
