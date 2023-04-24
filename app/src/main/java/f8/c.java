package f8;

import android.os.Parcel;
import android.os.Parcelable;
import com.huawei.hms.framework.common.hianalytics.WiseOpenHianalyticsData;
import i8.n;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class c extends j8.a {
    public static final Parcelable.Creator<c> CREATOR = new l();

    /* renamed from: a */
    public final String f14176a;
    @Deprecated

    /* renamed from: b */
    public final int f14177b;

    /* renamed from: c */
    public final long f14178c;

    public c(int i10, long j10, String str) {
        this.f14176a = str;
        this.f14177b = i10;
        this.f14178c = j10;
    }

    public c(long j10, String str) {
        this.f14176a = str;
        this.f14178c = j10;
        this.f14177b = -1;
    }

    public final long e() {
        long j10 = this.f14178c;
        return j10 == -1 ? this.f14177b : j10;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof c) {
            c cVar = (c) obj;
            String str = this.f14176a;
            if (((str != null && str.equals(cVar.f14176a)) || (this.f14176a == null && cVar.f14176a == null)) && e() == cVar.e()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f14176a, Long.valueOf(e())});
    }

    public final String toString() {
        n.a aVar = new n.a(this);
        aVar.a(this.f14176a, "name");
        aVar.a(Long.valueOf(e()), WiseOpenHianalyticsData.UNION_VERSION);
        return aVar.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int F = o8.b.F(parcel, 20293);
        o8.b.C(parcel, 1, this.f14176a);
        o8.b.z(parcel, 2, this.f14177b);
        o8.b.A(parcel, 3, e());
        o8.b.J(parcel, F);
    }
}
