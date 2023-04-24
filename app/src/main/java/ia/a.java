package ia;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.d;
import o0.h;

/* loaded from: classes.dex */
public final class a extends q1.a {
    public static final Parcelable.Creator<a> CREATOR = new C0294a();

    /* renamed from: c */
    public final h<String, Bundle> f16759c;

    /* renamed from: ia.a$a */
    /* loaded from: classes.dex */
    public class C0294a implements Parcelable.ClassLoaderCreator<a> {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            return new a(parcel, null);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i10) {
            return new a[i10];
        }

        @Override // android.os.Parcelable.ClassLoaderCreator
        public final a createFromParcel(Parcel parcel, ClassLoader classLoader) {
            return new a(parcel, classLoader);
        }
    }

    public a(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        int readInt = parcel.readInt();
        String[] strArr = new String[readInt];
        parcel.readStringArray(strArr);
        Bundle[] bundleArr = new Bundle[readInt];
        parcel.readTypedArray(bundleArr, Bundle.CREATOR);
        this.f16759c = new h<>(readInt);
        for (int i10 = 0; i10 < readInt; i10++) {
            this.f16759c.put(strArr[i10], bundleArr[i10]);
        }
    }

    public a(Parcelable parcelable) {
        super(parcelable);
        this.f16759c = new h<>();
    }

    public final String toString() {
        StringBuilder a10 = d.a("ExtendableSavedState{");
        a10.append(Integer.toHexString(System.identityHashCode(this)));
        a10.append(" states=");
        a10.append(this.f16759c);
        a10.append("}");
        return a10.toString();
    }

    @Override // q1.a, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeParcelable(this.f24504a, i10);
        int size = this.f16759c.size();
        parcel.writeInt(size);
        String[] strArr = new String[size];
        Bundle[] bundleArr = new Bundle[size];
        for (int i11 = 0; i11 < size; i11++) {
            strArr[i11] = this.f16759c.i(i11);
            bundleArr[i11] = this.f16759c.m(i11);
        }
        parcel.writeStringArray(strArr);
        parcel.writeTypedArray(bundleArr, 0);
    }
}
