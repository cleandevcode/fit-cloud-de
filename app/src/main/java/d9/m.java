package d9;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import p8.b;

/* loaded from: classes.dex */
public final class m extends j8.a {
    public static final Parcelable.Creator<m> CREATOR = new x();

    /* renamed from: a */
    public final a f12914a;

    public m(IBinder iBinder) {
        this.f12914a = new a(b.a.a0(iBinder));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int F = o8.b.F(parcel, 20293);
        o8.b.y(parcel, 2, this.f12914a.f12867a.asBinder());
        o8.b.J(parcel, F);
    }
}
