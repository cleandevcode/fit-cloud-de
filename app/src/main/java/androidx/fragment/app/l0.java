package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.fragment.app.j0;
import java.util.ArrayList;

@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes.dex */
public final class l0 implements Parcelable {
    public static final Parcelable.Creator<l0> CREATOR = new a();

    /* renamed from: a */
    public ArrayList<String> f2443a;

    /* renamed from: b */
    public ArrayList<String> f2444b;

    /* renamed from: c */
    public b[] f2445c;

    /* renamed from: d */
    public int f2446d;

    /* renamed from: e */
    public String f2447e;

    /* renamed from: f */
    public ArrayList<String> f2448f;

    /* renamed from: g */
    public ArrayList<c> f2449g;

    /* renamed from: h */
    public ArrayList<j0.l> f2450h;

    /* loaded from: classes.dex */
    public class a implements Parcelable.Creator<l0> {
        @Override // android.os.Parcelable.Creator
        public final l0 createFromParcel(Parcel parcel) {
            return new l0(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final l0[] newArray(int i10) {
            return new l0[i10];
        }
    }

    public l0() {
        this.f2447e = null;
        this.f2448f = new ArrayList<>();
        this.f2449g = new ArrayList<>();
    }

    public l0(Parcel parcel) {
        this.f2447e = null;
        this.f2448f = new ArrayList<>();
        this.f2449g = new ArrayList<>();
        this.f2443a = parcel.createStringArrayList();
        this.f2444b = parcel.createStringArrayList();
        this.f2445c = (b[]) parcel.createTypedArray(b.CREATOR);
        this.f2446d = parcel.readInt();
        this.f2447e = parcel.readString();
        this.f2448f = parcel.createStringArrayList();
        this.f2449g = parcel.createTypedArrayList(c.CREATOR);
        this.f2450h = parcel.createTypedArrayList(j0.l.CREATOR);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeStringList(this.f2443a);
        parcel.writeStringList(this.f2444b);
        parcel.writeTypedArray(this.f2445c, i10);
        parcel.writeInt(this.f2446d);
        parcel.writeString(this.f2447e);
        parcel.writeStringList(this.f2448f);
        parcel.writeTypedList(this.f2449g);
        parcel.writeTypedList(this.f2450h);
    }
}
