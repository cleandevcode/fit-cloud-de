package r6;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import r6.g;
import r6.g.a;

/* loaded from: classes.dex */
public abstract class g<M extends g<M, B>, B extends a<M, B>> implements Parcelable {

    /* renamed from: a */
    public final Bundle f25369a;

    /* loaded from: classes.dex */
    public static abstract class a<M extends g<M, B>, B extends a<M, B>> {

        /* renamed from: a */
        public Bundle f25370a = new Bundle();
    }

    /* loaded from: classes.dex */
    public enum b {
        PHOTO,
        VIDEO;

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static b[] valuesCustom() {
            return (b[]) Arrays.copyOf(values(), 2);
        }
    }

    public g(Parcel parcel) {
        gm.l.f(parcel, "parcel");
        Bundle readBundle = parcel.readBundle(getClass().getClassLoader());
        this.f25369a = readBundle == null ? new Bundle() : readBundle;
    }

    public g(a<M, B> aVar) {
        gm.l.f(aVar, "builder");
        this.f25369a = new Bundle(aVar.f25370a);
    }

    public abstract b a();

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        gm.l.f(parcel, "dest");
        parcel.writeBundle(this.f25369a);
    }
}
