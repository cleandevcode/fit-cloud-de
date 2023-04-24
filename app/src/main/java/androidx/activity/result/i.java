package androidx.activity.result;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Parcel;
import android.os.Parcelable;

@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes.dex */
public final class i implements Parcelable {
    public static final Parcelable.Creator<i> CREATOR = new a();

    /* renamed from: a */
    public final IntentSender f771a;

    /* renamed from: b */
    public final Intent f772b;

    /* renamed from: c */
    public final int f773c;

    /* renamed from: d */
    public final int f774d;

    /* loaded from: classes.dex */
    public class a implements Parcelable.Creator<i> {
        @Override // android.os.Parcelable.Creator
        public final i createFromParcel(Parcel parcel) {
            return new i(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final i[] newArray(int i10) {
            return new i[i10];
        }
    }

    public i(IntentSender intentSender, Intent intent, int i10, int i11) {
        this.f771a = intentSender;
        this.f772b = intent;
        this.f773c = i10;
        this.f774d = i11;
    }

    public i(Parcel parcel) {
        this.f771a = (IntentSender) parcel.readParcelable(IntentSender.class.getClassLoader());
        this.f772b = (Intent) parcel.readParcelable(Intent.class.getClassLoader());
        this.f773c = parcel.readInt();
        this.f774d = parcel.readInt();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeParcelable(this.f771a, i10);
        parcel.writeParcelable(this.f772b, i10);
        parcel.writeInt(this.f773c);
        parcel.writeInt(this.f774d);
    }
}
