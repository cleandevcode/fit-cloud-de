package x8;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;

/* loaded from: classes.dex */
public final class k0 extends j8.a implements g8.h {
    public static final Parcelable.Creator<k0> CREATOR;

    /* renamed from: a */
    public final Status f30425a;

    static {
        new k0(Status.f6051f);
        CREATOR = new l0();
    }

    public k0(Status status) {
        this.f30425a = status;
    }

    @Override // g8.h
    public final Status d() {
        return this.f30425a;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int F = o8.b.F(parcel, 20293);
        o8.b.B(parcel, 1, this.f30425a, i10);
        o8.b.J(parcel, F);
    }
}
