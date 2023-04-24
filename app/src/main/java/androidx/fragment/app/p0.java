package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.lifecycle.k;

@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes.dex */
public final class p0 implements Parcelable {
    public static final Parcelable.Creator<p0> CREATOR = new a();

    /* renamed from: a */
    public final String f2487a;

    /* renamed from: b */
    public final String f2488b;

    /* renamed from: c */
    public final boolean f2489c;

    /* renamed from: d */
    public final int f2490d;

    /* renamed from: e */
    public final int f2491e;

    /* renamed from: f */
    public final String f2492f;

    /* renamed from: g */
    public final boolean f2493g;

    /* renamed from: h */
    public final boolean f2494h;

    /* renamed from: i */
    public final boolean f2495i;

    /* renamed from: j */
    public final Bundle f2496j;

    /* renamed from: k */
    public final boolean f2497k;

    /* renamed from: l */
    public final int f2498l;

    /* renamed from: m */
    public Bundle f2499m;

    /* loaded from: classes.dex */
    public class a implements Parcelable.Creator<p0> {
        @Override // android.os.Parcelable.Creator
        public final p0 createFromParcel(Parcel parcel) {
            return new p0(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final p0[] newArray(int i10) {
            return new p0[i10];
        }
    }

    public p0(Parcel parcel) {
        this.f2487a = parcel.readString();
        this.f2488b = parcel.readString();
        this.f2489c = parcel.readInt() != 0;
        this.f2490d = parcel.readInt();
        this.f2491e = parcel.readInt();
        this.f2492f = parcel.readString();
        this.f2493g = parcel.readInt() != 0;
        this.f2494h = parcel.readInt() != 0;
        this.f2495i = parcel.readInt() != 0;
        this.f2496j = parcel.readBundle();
        this.f2497k = parcel.readInt() != 0;
        this.f2499m = parcel.readBundle();
        this.f2498l = parcel.readInt();
    }

    public p0(r rVar) {
        this.f2487a = rVar.getClass().getName();
        this.f2488b = rVar.f2514e;
        this.f2489c = rVar.f2529n;
        this.f2490d = rVar.f2538w;
        this.f2491e = rVar.f2539x;
        this.f2492f = rVar.f2540y;
        this.f2493g = rVar.B;
        this.f2494h = rVar.f2527l;
        this.f2495i = rVar.A;
        this.f2496j = rVar.f2516f;
        this.f2497k = rVar.f2541z;
        this.f2498l = rVar.Y.ordinal();
    }

    public final r a(c0 c0Var, ClassLoader classLoader) {
        r a10 = c0Var.a(this.f2487a);
        Bundle bundle = this.f2496j;
        if (bundle != null) {
            bundle.setClassLoader(classLoader);
        }
        a10.Z0(this.f2496j);
        a10.f2514e = this.f2488b;
        a10.f2529n = this.f2489c;
        a10.f2531p = true;
        a10.f2538w = this.f2490d;
        a10.f2539x = this.f2491e;
        a10.f2540y = this.f2492f;
        a10.B = this.f2493g;
        a10.f2527l = this.f2494h;
        a10.A = this.f2495i;
        a10.f2541z = this.f2497k;
        a10.Y = k.c.values()[this.f2498l];
        Bundle bundle2 = this.f2499m;
        if (bundle2 == null) {
            bundle2 = new Bundle();
        }
        a10.f2509b = bundle2;
        return a10;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(128);
        sb2.append("FragmentState{");
        sb2.append(this.f2487a);
        sb2.append(" (");
        sb2.append(this.f2488b);
        sb2.append(")}:");
        if (this.f2489c) {
            sb2.append(" fromLayout");
        }
        if (this.f2491e != 0) {
            sb2.append(" id=0x");
            sb2.append(Integer.toHexString(this.f2491e));
        }
        String str = this.f2492f;
        if (str != null && !str.isEmpty()) {
            sb2.append(" tag=");
            sb2.append(this.f2492f);
        }
        if (this.f2493g) {
            sb2.append(" retainInstance");
        }
        if (this.f2494h) {
            sb2.append(" removing");
        }
        if (this.f2495i) {
            sb2.append(" detached");
        }
        if (this.f2497k) {
            sb2.append(" hidden");
        }
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f2487a);
        parcel.writeString(this.f2488b);
        parcel.writeInt(this.f2489c ? 1 : 0);
        parcel.writeInt(this.f2490d);
        parcel.writeInt(this.f2491e);
        parcel.writeString(this.f2492f);
        parcel.writeInt(this.f2493g ? 1 : 0);
        parcel.writeInt(this.f2494h ? 1 : 0);
        parcel.writeInt(this.f2495i ? 1 : 0);
        parcel.writeBundle(this.f2496j);
        parcel.writeInt(this.f2497k ? 1 : 0);
        parcel.writeBundle(this.f2499m);
        parcel.writeInt(this.f2498l);
    }
}
