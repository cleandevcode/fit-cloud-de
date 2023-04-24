package androidx.activity.result;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;

@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes.dex */
public final class a implements Parcelable {
    public static final Parcelable.Creator<a> CREATOR = new C0017a();

    /* renamed from: a */
    public final int f751a;

    /* renamed from: b */
    public final Intent f752b;

    /* renamed from: androidx.activity.result.a$a */
    /* loaded from: classes.dex */
    public class C0017a implements Parcelable.Creator<a> {
        @Override // android.os.Parcelable.Creator
        public final a createFromParcel(Parcel parcel) {
            return new a(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final a[] newArray(int i10) {
            return new a[i10];
        }
    }

    public a(Intent intent, int i10) {
        this.f751a = i10;
        this.f752b = intent;
    }

    public a(Parcel parcel) {
        this.f751a = parcel.readInt();
        this.f752b = parcel.readInt() == 0 ? null : (Intent) Intent.CREATOR.createFromParcel(parcel);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        String str;
        StringBuilder a10 = android.support.v4.media.d.a("ActivityResult{resultCode=");
        int i10 = this.f751a;
        if (i10 != -1) {
            if (i10 != 0) {
                str = String.valueOf(i10);
            } else {
                str = "RESULT_CANCELED";
            }
        } else {
            str = "RESULT_OK";
        }
        a10.append(str);
        a10.append(", data=");
        a10.append(this.f752b);
        a10.append('}');
        return a10.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f751a);
        parcel.writeInt(this.f752b == null ? 0 : 1);
        Intent intent = this.f752b;
        if (intent != null) {
            intent.writeToParcel(parcel, i10);
        }
    }
}
