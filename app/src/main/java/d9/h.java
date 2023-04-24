package d9;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.maps.model.LatLng;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class h extends j8.a {
    public static final Parcelable.Creator<h> CREATOR = new v();

    /* renamed from: a */
    public final List f12891a;

    /* renamed from: b */
    public final List f12892b;

    /* renamed from: c */
    public float f12893c;

    /* renamed from: d */
    public int f12894d;

    /* renamed from: e */
    public int f12895e;

    /* renamed from: f */
    public float f12896f;

    /* renamed from: g */
    public boolean f12897g;

    /* renamed from: h */
    public boolean f12898h;

    /* renamed from: i */
    public boolean f12899i;

    /* renamed from: j */
    public int f12900j;

    /* renamed from: k */
    public List f12901k;

    public h() {
        this.f12893c = 10.0f;
        this.f12894d = -16777216;
        this.f12895e = 0;
        this.f12896f = 0.0f;
        this.f12897g = true;
        this.f12898h = false;
        this.f12899i = false;
        this.f12900j = 0;
        this.f12901k = null;
        this.f12891a = new ArrayList();
        this.f12892b = new ArrayList();
    }

    public h(ArrayList arrayList, ArrayList arrayList2, float f10, int i10, int i11, float f11, boolean z10, boolean z11, boolean z12, int i12, ArrayList arrayList3) {
        this.f12891a = arrayList;
        this.f12892b = arrayList2;
        this.f12893c = f10;
        this.f12894d = i10;
        this.f12895e = i11;
        this.f12896f = f11;
        this.f12897g = z10;
        this.f12898h = z11;
        this.f12899i = z12;
        this.f12900j = i12;
        this.f12901k = arrayList3;
    }

    public final void e(LatLng latLng) {
        this.f12891a.add(latLng);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int F = o8.b.F(parcel, 20293);
        o8.b.E(parcel, 2, this.f12891a);
        List list = this.f12892b;
        if (list != null) {
            int F2 = o8.b.F(parcel, 3);
            parcel.writeList(list);
            o8.b.J(parcel, F2);
        }
        o8.b.w(parcel, 4, this.f12893c);
        o8.b.z(parcel, 5, this.f12894d);
        o8.b.z(parcel, 6, this.f12895e);
        o8.b.w(parcel, 7, this.f12896f);
        o8.b.t(parcel, 8, this.f12897g);
        o8.b.t(parcel, 9, this.f12898h);
        o8.b.t(parcel, 10, this.f12899i);
        o8.b.z(parcel, 11, this.f12900j);
        o8.b.E(parcel, 12, this.f12901k);
        o8.b.J(parcel, F);
    }
}
