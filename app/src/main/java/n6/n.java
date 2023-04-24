package n6;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class n extends z {
    public static final Parcelable.Creator<n> CREATOR = new a();

    /* renamed from: d */
    public final String f22102d;

    /* loaded from: classes.dex */
    public static final class a implements Parcelable.Creator<n> {
        @Override // android.os.Parcelable.Creator
        public final n createFromParcel(Parcel parcel) {
            gm.l.f(parcel, "source");
            return new n(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final n[] newArray(int i10) {
            return new n[i10];
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(Parcel parcel) {
        super(parcel);
        gm.l.f(parcel, "source");
        this.f22102d = "katana_proxy_auth";
    }

    public n(p pVar) {
        super(pVar);
        this.f22102d = "katana_proxy_auth";
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // n6.w
    public final String f() {
        return this.f22102d;
    }

    /* JADX WARN: Removed duplicated region for block: B:112:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x011d A[SYNTHETIC] */
    @Override // n6.w
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int o(n6.p.d r35) {
        /*
            Method dump skipped, instructions count: 288
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: n6.n.o(n6.p$d):int");
    }
}
