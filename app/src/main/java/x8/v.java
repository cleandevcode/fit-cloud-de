package x8;

import android.app.PendingIntent;
import android.os.Build;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class v extends j8.a {
    public static final Parcelable.Creator<v> CREATOR = new w();

    /* renamed from: a */
    public final int f30442a;

    /* renamed from: b */
    public final IBinder f30443b;

    /* renamed from: c */
    public final IBinder f30444c;

    /* renamed from: d */
    public final PendingIntent f30445d;

    /* renamed from: e */
    public final String f30446e;

    /* renamed from: f */
    public final String f30447f;

    public v(int i10, IBinder iBinder, IBinder iBinder2, PendingIntent pendingIntent, String str, String str2) {
        this.f30442a = i10;
        this.f30443b = iBinder;
        this.f30444c = iBinder2;
        this.f30445d = pendingIntent;
        this.f30446e = Build.VERSION.SDK_INT >= 30 ? null : str;
        this.f30447f = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int F = o8.b.F(parcel, 20293);
        o8.b.z(parcel, 1, this.f30442a);
        o8.b.y(parcel, 2, this.f30443b);
        o8.b.y(parcel, 3, this.f30444c);
        o8.b.B(parcel, 4, this.f30445d, i10);
        o8.b.C(parcel, 5, this.f30446e);
        o8.b.C(parcel, 6, this.f30447f);
        o8.b.J(parcel, F);
    }
}
