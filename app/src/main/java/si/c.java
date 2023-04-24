package si;

import android.os.Parcel;
import android.os.Parcelable;
import gm.l;

/* loaded from: classes2.dex */
public final class c implements Parcelable {
    public static final a CREATOR = new a();

    /* renamed from: a */
    public final String f27063a;

    /* renamed from: b */
    public final String f27064b;

    /* renamed from: c */
    public final d f27065c;

    /* loaded from: classes2.dex */
    public static final class a implements Parcelable.Creator<c> {
        @Override // android.os.Parcelable.Creator
        public final c createFromParcel(Parcel parcel) {
            l.f(parcel, "parcel");
            return new c(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final c[] newArray(int i10) {
            return new c[i10];
        }
    }

    public /* synthetic */ c() {
        throw null;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public c(android.os.Parcel r6) {
        /*
            r5 = this;
            java.lang.String r0 = "parcel"
            gm.l.f(r6, r0)
            java.lang.String r0 = r6.readString()
            gm.l.c(r0)
            java.lang.String r1 = r6.readString()
            gm.l.c(r1)
            java.lang.Class<si.d> r2 = si.d.class
            java.lang.ClassLoader r2 = r2.getClassLoader()
            int r3 = android.os.Build.VERSION.SDK_INT
            r4 = 33
            if (r3 < r4) goto L28
            java.lang.Class<si.d> r3 = si.d.class
            java.lang.Object r6 = r6.readParcelable(r2, r3)
            android.os.Parcelable r6 = (android.os.Parcelable) r6
            goto L2c
        L28:
            android.os.Parcelable r6 = r6.readParcelable(r2)
        L2c:
            si.d r6 = (si.d) r6
            r5.<init>(r0, r1, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: si.c.<init>(android.os.Parcel):void");
    }

    public c(String str, String str2, d dVar) {
        this.f27063a = str;
        this.f27064b = str2;
        this.f27065c = dVar;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        l.f(parcel, "parcel");
        parcel.writeString(this.f27063a);
        parcel.writeString(this.f27064b);
        parcel.writeParcelable(this.f27065c, i10);
    }
}
