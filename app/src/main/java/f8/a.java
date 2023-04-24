package f8;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.huawei.hms.framework.common.hianalytics.CrashHianalyticsData;
import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import com.huawei.hms.mlsdk.common.internal.client.event.MonitorResult;
import i8.n;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class a extends j8.a {

    /* renamed from: a */
    public final int f14169a;

    /* renamed from: b */
    public final int f14170b;

    /* renamed from: c */
    public final PendingIntent f14171c;

    /* renamed from: d */
    public final String f14172d;

    /* renamed from: e */
    public static final a f14168e = new a(0);
    public static final Parcelable.Creator<a> CREATOR = new k();

    public a() {
        throw null;
    }

    public a(int i10) {
        this(1, i10, null, null);
    }

    public a(int i10, int i11, PendingIntent pendingIntent, String str) {
        this.f14169a = i10;
        this.f14170b = i11;
        this.f14171c = pendingIntent;
        this.f14172d = str;
    }

    public static String e(int i10) {
        if (i10 != 99) {
            if (i10 != 1500) {
                switch (i10) {
                    case -1:
                        return GrsBaseInfo.CountryCodeSource.UNKNOWN;
                    case 0:
                        return MonitorResult.SUCCESS;
                    case 1:
                        return "SERVICE_MISSING";
                    case 2:
                        return "SERVICE_VERSION_UPDATE_REQUIRED";
                    case 3:
                        return "SERVICE_DISABLED";
                    case 4:
                        return "SIGN_IN_REQUIRED";
                    case 5:
                        return "INVALID_ACCOUNT";
                    case 6:
                        return "RESOLUTION_REQUIRED";
                    case 7:
                        return "NETWORK_ERROR";
                    case 8:
                        return "INTERNAL_ERROR";
                    case 9:
                        return "SERVICE_INVALID";
                    case 10:
                        return "DEVELOPER_ERROR";
                    case 11:
                        return "LICENSE_CHECK_FAILED";
                    default:
                        switch (i10) {
                            case 13:
                                return "CANCELED";
                            case 14:
                                return "TIMEOUT";
                            case 15:
                                return "INTERRUPTED";
                            case 16:
                                return "API_UNAVAILABLE";
                            case 17:
                                return "SIGN_IN_FAILED";
                            case 18:
                                return "SERVICE_UPDATING";
                            case 19:
                                return "SERVICE_MISSING_PERMISSION";
                            case 20:
                                return "RESTRICTED_PROFILE";
                            case 21:
                                return "API_VERSION_UPDATE_REQUIRED";
                            case 22:
                                return "RESOLUTION_ACTIVITY_NOT_FOUND";
                            case 23:
                                return "API_DISABLED";
                            case 24:
                                return "API_DISABLED_FOR_CONNECTION";
                            default:
                                return androidx.activity.i.a("UNKNOWN_ERROR_CODE(", i10, ")");
                        }
                }
            }
            return "DRIVE_EXTERNAL_STORAGE_REQUIRED";
        }
        return "UNFINISHED";
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            return this.f14170b == aVar.f14170b && i8.n.a(this.f14171c, aVar.f14171c) && i8.n.a(this.f14172d, aVar.f14172d);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f14170b), this.f14171c, this.f14172d});
    }

    public final String toString() {
        n.a aVar = new n.a(this);
        aVar.a(e(this.f14170b), "statusCode");
        aVar.a(this.f14171c, com.huawei.hms.feature.dynamic.b.f7007h);
        aVar.a(this.f14172d, CrashHianalyticsData.MESSAGE);
        return aVar.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int F = o8.b.F(parcel, 20293);
        o8.b.z(parcel, 1, this.f14169a);
        o8.b.z(parcel, 2, this.f14170b);
        o8.b.B(parcel, 3, this.f14171c, i10);
        o8.b.C(parcel, 4, this.f14172d);
        o8.b.J(parcel, F);
    }

    public a(int i10, PendingIntent pendingIntent) {
        this(1, i10, pendingIntent, null);
    }
}
