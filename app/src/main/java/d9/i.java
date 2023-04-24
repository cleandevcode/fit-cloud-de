package d9;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Pair;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class i extends j8.a {
    public static final Parcelable.Creator<i> CREATOR = new w();

    /* renamed from: a */
    public final List f12902a;

    /* renamed from: b */
    public float f12903b;

    /* renamed from: c */
    public int f12904c;

    /* renamed from: d */
    public float f12905d;

    /* renamed from: e */
    public boolean f12906e;

    /* renamed from: f */
    public boolean f12907f;

    /* renamed from: g */
    public boolean f12908g;

    /* renamed from: h */
    public c f12909h;

    /* renamed from: i */
    public c f12910i;

    /* renamed from: j */
    public int f12911j;

    /* renamed from: k */
    public List f12912k;

    /* renamed from: l */
    public List f12913l;

    public i() {
        this.f12903b = 10.0f;
        this.f12904c = -16777216;
        this.f12905d = 0.0f;
        this.f12906e = true;
        this.f12907f = false;
        this.f12908g = false;
        this.f12909h = new b();
        this.f12910i = new b();
        this.f12911j = 0;
        this.f12912k = null;
        this.f12913l = new ArrayList();
        this.f12902a = new ArrayList();
    }

    public i(ArrayList arrayList, float f10, int i10, float f11, boolean z10, boolean z11, boolean z12, c cVar, c cVar2, int i11, ArrayList arrayList2, ArrayList arrayList3) {
        this.f12903b = 10.0f;
        this.f12904c = -16777216;
        this.f12905d = 0.0f;
        this.f12906e = true;
        this.f12907f = false;
        this.f12908g = false;
        this.f12909h = new b();
        this.f12910i = new b();
        this.f12911j = 0;
        this.f12912k = null;
        this.f12913l = new ArrayList();
        this.f12902a = arrayList;
        this.f12903b = f10;
        this.f12904c = i10;
        this.f12905d = f11;
        this.f12906e = z10;
        this.f12907f = z11;
        this.f12908g = z12;
        if (cVar != null) {
            this.f12909h = cVar;
        }
        if (cVar2 != null) {
            this.f12910i = cVar2;
        }
        this.f12911j = i11;
        this.f12912k = arrayList2;
        if (arrayList3 != null) {
            this.f12913l = arrayList3;
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int F = o8.b.F(parcel, 20293);
        o8.b.E(parcel, 2, this.f12902a);
        o8.b.w(parcel, 3, this.f12903b);
        o8.b.z(parcel, 4, this.f12904c);
        o8.b.w(parcel, 5, this.f12905d);
        o8.b.t(parcel, 6, this.f12906e);
        o8.b.t(parcel, 7, this.f12907f);
        o8.b.t(parcel, 8, this.f12908g);
        o8.b.B(parcel, 9, this.f12909h.e(), i10);
        o8.b.B(parcel, 10, this.f12910i.e(), i10);
        o8.b.z(parcel, 11, this.f12911j);
        o8.b.E(parcel, 12, this.f12912k);
        ArrayList arrayList = new ArrayList(this.f12913l.size());
        for (o oVar : this.f12913l) {
            n nVar = oVar.f12920a;
            float f10 = nVar.f12915a;
            Pair pair = new Pair(Integer.valueOf(nVar.f12916b), Integer.valueOf(nVar.f12917c));
            arrayList.add(new o(new n(this.f12903b, ((Integer) pair.first).intValue(), ((Integer) pair.second).intValue(), this.f12906e, nVar.f12919e), oVar.f12921b));
        }
        o8.b.E(parcel, 13, arrayList);
        o8.b.J(parcel, F);
    }
}
