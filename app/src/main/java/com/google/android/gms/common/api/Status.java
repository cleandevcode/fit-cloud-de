package com.google.android.gms.common.api;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.widget.u0;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.huawei.hms.feature.dynamic.b;
import com.huawei.hms.mlsdk.common.internal.client.event.MonitorResult;
import g8.h;
import g8.m;
import i8.n;
import j8.a;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class Status extends a implements h, ReflectedParcelable {
    public static final Parcelable.Creator<Status> CREATOR;

    /* renamed from: f */
    public static final Status f6051f;

    /* renamed from: g */
    public static final Status f6052g;

    /* renamed from: h */
    public static final Status f6053h;

    /* renamed from: i */
    public static final Status f6054i;

    /* renamed from: j */
    public static final Status f6055j;

    /* renamed from: a */
    public final int f6056a;

    /* renamed from: b */
    public final int f6057b;

    /* renamed from: c */
    public final String f6058c;

    /* renamed from: d */
    public final PendingIntent f6059d;

    /* renamed from: e */
    public final f8.a f6060e;

    static {
        new Status(-1, null);
        f6051f = new Status(0, null);
        f6052g = new Status(14, null);
        f6053h = new Status(8, null);
        f6054i = new Status(15, null);
        f6055j = new Status(16, null);
        new Status(17, null);
        new Status(18, null);
        CREATOR = new m();
    }

    public Status() {
        throw null;
    }

    public Status(int i10, int i11, String str, PendingIntent pendingIntent, f8.a aVar) {
        this.f6056a = i10;
        this.f6057b = i11;
        this.f6058c = str;
        this.f6059d = pendingIntent;
        this.f6060e = aVar;
    }

    public Status(int i10, String str) {
        this(1, i10, str, null, null);
    }

    @Override // g8.h
    @CanIgnoreReturnValue
    public final Status d() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof Status) {
            Status status = (Status) obj;
            return this.f6056a == status.f6056a && this.f6057b == status.f6057b && n.a(this.f6058c, status.f6058c) && n.a(this.f6059d, status.f6059d) && n.a(this.f6060e, status.f6060e);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f6056a), Integer.valueOf(this.f6057b), this.f6058c, this.f6059d, this.f6060e});
    }

    public final String toString() {
        n.a aVar = new n.a(this);
        String str = this.f6058c;
        if (str == null) {
            int i10 = this.f6057b;
            switch (i10) {
                case -1:
                    str = "SUCCESS_CACHE";
                    break;
                case 0:
                    str = MonitorResult.SUCCESS;
                    break;
                case 1:
                case 9:
                case 11:
                case 12:
                default:
                    str = u0.a("unknown status code: ", i10);
                    break;
                case 2:
                    str = "SERVICE_VERSION_UPDATE_REQUIRED";
                    break;
                case 3:
                    str = "SERVICE_DISABLED";
                    break;
                case 4:
                    str = "SIGN_IN_REQUIRED";
                    break;
                case 5:
                    str = "INVALID_ACCOUNT";
                    break;
                case 6:
                    str = "RESOLUTION_REQUIRED";
                    break;
                case 7:
                    str = "NETWORK_ERROR";
                    break;
                case 8:
                    str = "INTERNAL_ERROR";
                    break;
                case 10:
                    str = "DEVELOPER_ERROR";
                    break;
                case 13:
                    str = "ERROR";
                    break;
                case 14:
                    str = "INTERRUPTED";
                    break;
                case 15:
                    str = "TIMEOUT";
                    break;
                case 16:
                    str = "CANCELED";
                    break;
                case 17:
                    str = "API_NOT_CONNECTED";
                    break;
                case 18:
                    str = "DEAD_CLIENT";
                    break;
                case 19:
                    str = "REMOTE_EXCEPTION";
                    break;
                case 20:
                    str = "CONNECTION_SUSPENDED_DURING_CALL";
                    break;
                case 21:
                    str = "RECONNECTION_TIMED_OUT_DURING_UPDATE";
                    break;
                case 22:
                    str = "RECONNECTION_TIMED_OUT";
                    break;
            }
        }
        aVar.a(str, "statusCode");
        aVar.a(this.f6059d, b.f7007h);
        return aVar.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int F = o8.b.F(parcel, 20293);
        o8.b.z(parcel, 1, this.f6057b);
        o8.b.C(parcel, 2, this.f6058c);
        o8.b.B(parcel, 3, this.f6059d, i10);
        o8.b.B(parcel, 4, this.f6060e, i10);
        o8.b.z(parcel, 1000, this.f6056a);
        o8.b.J(parcel, F);
    }
}
