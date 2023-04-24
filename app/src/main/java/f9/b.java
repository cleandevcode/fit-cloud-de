package f9;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;

/* loaded from: classes.dex */
public final class b extends j8.a implements g8.h {
    public static final Parcelable.Creator<b> CREATOR = new c();

    /* renamed from: a */
    public final int f14197a;

    /* renamed from: b */
    public int f14198b;

    /* renamed from: c */
    public Intent f14199c;

    public b() {
        this(2, 0, null);
    }

    public b(int i10, int i11, Intent intent) {
        this.f14197a = i10;
        this.f14198b = i11;
        this.f14199c = intent;
    }

    @Override // g8.h
    public final Status d() {
        return this.f14198b == 0 ? Status.f6051f : Status.f6055j;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int F = o8.b.F(parcel, 20293);
        o8.b.z(parcel, 1, this.f14197a);
        o8.b.z(parcel, 2, this.f14198b);
        o8.b.B(parcel, 3, this.f14199c, i10);
        o8.b.J(parcel, F);
    }
}
