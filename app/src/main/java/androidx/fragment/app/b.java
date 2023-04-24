package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import androidx.fragment.app.s0;
import androidx.lifecycle.k;
import java.util.ArrayList;

@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes.dex */
public final class b implements Parcelable {
    public static final Parcelable.Creator<b> CREATOR = new a();

    /* renamed from: a */
    public final int[] f2315a;

    /* renamed from: b */
    public final ArrayList<String> f2316b;

    /* renamed from: c */
    public final int[] f2317c;

    /* renamed from: d */
    public final int[] f2318d;

    /* renamed from: e */
    public final int f2319e;

    /* renamed from: f */
    public final String f2320f;

    /* renamed from: g */
    public final int f2321g;

    /* renamed from: h */
    public final int f2322h;

    /* renamed from: i */
    public final CharSequence f2323i;

    /* renamed from: j */
    public final int f2324j;

    /* renamed from: k */
    public final CharSequence f2325k;

    /* renamed from: l */
    public final ArrayList<String> f2326l;

    /* renamed from: m */
    public final ArrayList<String> f2327m;

    /* renamed from: n */
    public final boolean f2328n;

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

    public b(Parcel parcel) {
        this.f2315a = parcel.createIntArray();
        this.f2316b = parcel.createStringArrayList();
        this.f2317c = parcel.createIntArray();
        this.f2318d = parcel.createIntArray();
        this.f2319e = parcel.readInt();
        this.f2320f = parcel.readString();
        this.f2321g = parcel.readInt();
        this.f2322h = parcel.readInt();
        this.f2323i = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f2324j = parcel.readInt();
        this.f2325k = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f2326l = parcel.createStringArrayList();
        this.f2327m = parcel.createStringArrayList();
        this.f2328n = parcel.readInt() != 0;
    }

    public b(androidx.fragment.app.a aVar) {
        int size = aVar.f2563a.size();
        this.f2315a = new int[size * 6];
        if (!aVar.f2569g) {
            throw new IllegalStateException("Not on back stack");
        }
        this.f2316b = new ArrayList<>(size);
        this.f2317c = new int[size];
        this.f2318d = new int[size];
        int i10 = 0;
        int i11 = 0;
        while (i10 < size) {
            s0.a aVar2 = aVar.f2563a.get(i10);
            int i12 = i11 + 1;
            this.f2315a[i11] = aVar2.f2579a;
            ArrayList<String> arrayList = this.f2316b;
            r rVar = aVar2.f2580b;
            arrayList.add(rVar != null ? rVar.f2514e : null);
            int[] iArr = this.f2315a;
            int i13 = i12 + 1;
            iArr[i12] = aVar2.f2581c ? 1 : 0;
            int i14 = i13 + 1;
            iArr[i13] = aVar2.f2582d;
            int i15 = i14 + 1;
            iArr[i14] = aVar2.f2583e;
            int i16 = i15 + 1;
            iArr[i15] = aVar2.f2584f;
            iArr[i16] = aVar2.f2585g;
            this.f2317c[i10] = aVar2.f2586h.ordinal();
            this.f2318d[i10] = aVar2.f2587i.ordinal();
            i10++;
            i11 = i16 + 1;
        }
        this.f2319e = aVar.f2568f;
        this.f2320f = aVar.f2571i;
        this.f2321g = aVar.f2308s;
        this.f2322h = aVar.f2572j;
        this.f2323i = aVar.f2573k;
        this.f2324j = aVar.f2574l;
        this.f2325k = aVar.f2575m;
        this.f2326l = aVar.f2576n;
        this.f2327m = aVar.f2577o;
        this.f2328n = aVar.f2578p;
    }

    public final void a(androidx.fragment.app.a aVar) {
        int i10 = 0;
        int i11 = 0;
        while (true) {
            boolean z10 = true;
            if (i10 >= this.f2315a.length) {
                aVar.f2568f = this.f2319e;
                aVar.f2571i = this.f2320f;
                aVar.f2569g = true;
                aVar.f2572j = this.f2322h;
                aVar.f2573k = this.f2323i;
                aVar.f2574l = this.f2324j;
                aVar.f2575m = this.f2325k;
                aVar.f2576n = this.f2326l;
                aVar.f2577o = this.f2327m;
                aVar.f2578p = this.f2328n;
                return;
            }
            s0.a aVar2 = new s0.a();
            int i12 = i10 + 1;
            aVar2.f2579a = this.f2315a[i10];
            if (j0.J(2)) {
                Log.v("FragmentManager", "Instantiate " + aVar + " op #" + i11 + " base fragment #" + this.f2315a[i12]);
            }
            aVar2.f2586h = k.c.values()[this.f2317c[i11]];
            aVar2.f2587i = k.c.values()[this.f2318d[i11]];
            int[] iArr = this.f2315a;
            int i13 = i12 + 1;
            if (iArr[i12] == 0) {
                z10 = false;
            }
            aVar2.f2581c = z10;
            int i14 = i13 + 1;
            int i15 = iArr[i13];
            aVar2.f2582d = i15;
            int i16 = i14 + 1;
            int i17 = iArr[i14];
            aVar2.f2583e = i17;
            int i18 = i16 + 1;
            int i19 = iArr[i16];
            aVar2.f2584f = i19;
            int i20 = iArr[i18];
            aVar2.f2585g = i20;
            aVar.f2564b = i15;
            aVar.f2565c = i17;
            aVar.f2566d = i19;
            aVar.f2567e = i20;
            aVar.b(aVar2);
            i11++;
            i10 = i18 + 1;
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeIntArray(this.f2315a);
        parcel.writeStringList(this.f2316b);
        parcel.writeIntArray(this.f2317c);
        parcel.writeIntArray(this.f2318d);
        parcel.writeInt(this.f2319e);
        parcel.writeString(this.f2320f);
        parcel.writeInt(this.f2321g);
        parcel.writeInt(this.f2322h);
        TextUtils.writeToParcel(this.f2323i, parcel, 0);
        parcel.writeInt(this.f2324j);
        TextUtils.writeToParcel(this.f2325k, parcel, 0);
        parcel.writeStringList(this.f2326l);
        parcel.writeStringList(this.f2327m);
        parcel.writeInt(this.f2328n ? 1 : 0);
    }
}
