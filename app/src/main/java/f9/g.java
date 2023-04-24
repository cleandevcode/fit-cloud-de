package f9;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class g extends j8.a implements g8.h {
    public static final Parcelable.Creator<g> CREATOR = new h();

    /* renamed from: a */
    public final List f14200a;

    /* renamed from: b */
    public final String f14201b;

    public g(String str, ArrayList arrayList) {
        this.f14200a = arrayList;
        this.f14201b = str;
    }

    @Override // g8.h
    public final Status d() {
        return this.f14201b != null ? Status.f6051f : Status.f6055j;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int F = o8.b.F(parcel, 20293);
        List<String> list = this.f14200a;
        if (list != null) {
            int F2 = o8.b.F(parcel, 1);
            parcel.writeStringList(list);
            o8.b.J(parcel, F2);
        }
        o8.b.C(parcel, 2, this.f14201b);
        o8.b.J(parcel, F);
    }
}
