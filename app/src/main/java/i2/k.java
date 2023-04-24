package i2;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.lifecycle.k;

@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes.dex */
public final class k implements Parcelable {
    public static final Parcelable.Creator<k> CREATOR = new a();

    /* renamed from: a */
    public final String f16310a;

    /* renamed from: b */
    public final int f16311b;

    /* renamed from: c */
    public final Bundle f16312c;

    /* renamed from: d */
    public final Bundle f16313d;

    /* loaded from: classes.dex */
    public static final class a implements Parcelable.Creator<k> {
        @Override // android.os.Parcelable.Creator
        public final k createFromParcel(Parcel parcel) {
            gm.l.f(parcel, "inParcel");
            return new k(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final k[] newArray(int i10) {
            return new k[i10];
        }
    }

    public k(Parcel parcel) {
        gm.l.f(parcel, "inParcel");
        String readString = parcel.readString();
        gm.l.c(readString);
        this.f16310a = readString;
        this.f16311b = parcel.readInt();
        this.f16312c = parcel.readBundle(k.class.getClassLoader());
        Bundle readBundle = parcel.readBundle(k.class.getClassLoader());
        gm.l.c(readBundle);
        this.f16313d = readBundle;
    }

    public k(j jVar) {
        gm.l.f(jVar, "entry");
        this.f16310a = jVar.f16298f;
        this.f16311b = jVar.f16294b.f16410h;
        this.f16312c = jVar.f16295c;
        Bundle bundle = new Bundle();
        this.f16313d = bundle;
        jVar.f16301i.c(bundle);
    }

    public final j a(Context context, v vVar, k.c cVar, q qVar) {
        gm.l.f(context, "context");
        gm.l.f(cVar, "hostLifecycleState");
        Bundle bundle = this.f16312c;
        if (bundle != null) {
            bundle.setClassLoader(context.getClassLoader());
        } else {
            bundle = null;
        }
        String str = this.f16310a;
        Bundle bundle2 = this.f16313d;
        gm.l.f(str, "id");
        return new j(context, vVar, bundle, cVar, qVar, str, bundle2);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        gm.l.f(parcel, "parcel");
        parcel.writeString(this.f16310a);
        parcel.writeInt(this.f16311b);
        parcel.writeBundle(this.f16312c);
        parcel.writeBundle(this.f16313d);
    }
}
