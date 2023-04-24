package pl.droidsonroids.gif;

import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;

/* loaded from: classes2.dex */
public final class c extends View.BaseSavedState {
    public static final Parcelable.Creator<c> CREATOR = new a();

    /* renamed from: a */
    public final long[][] f24313a;

    /* loaded from: classes2.dex */
    public class a implements Parcelable.Creator<c> {
        @Override // android.os.Parcelable.Creator
        public final c createFromParcel(Parcel parcel) {
            return new c(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final c[] newArray(int i10) {
            return new c[i10];
        }
    }

    public c(Parcel parcel) {
        super(parcel);
        this.f24313a = new long[parcel.readInt()];
        int i10 = 0;
        while (true) {
            long[][] jArr = this.f24313a;
            if (i10 >= jArr.length) {
                return;
            }
            jArr[i10] = parcel.createLongArray();
            i10++;
        }
    }

    public c(Parcelable parcelable, Drawable... drawableArr) {
        super(parcelable);
        this.f24313a = new long[drawableArr.length];
        for (int i10 = 0; i10 < drawableArr.length; i10++) {
            Drawable drawable = drawableArr[i10];
            if (drawable instanceof b) {
                this.f24313a[i10] = ((b) drawable).f24299g.i();
            } else {
                this.f24313a[i10] = null;
            }
        }
    }

    @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        super.writeToParcel(parcel, i10);
        parcel.writeInt(this.f24313a.length);
        for (long[] jArr : this.f24313a) {
            parcel.writeLongArray(jArr);
        }
    }
}
