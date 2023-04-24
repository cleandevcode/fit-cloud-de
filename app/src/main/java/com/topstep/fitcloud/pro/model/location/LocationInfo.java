package com.topstep.fitcloud.pro.model.location;

import a0.a2;
import android.support.v4.media.d;
import gm.l;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mf.u;
import no.nordicsemi.android.dfu.DfuBaseService;

@Metadata
@u(generateAdapter = true)
/* loaded from: classes2.dex */
public final class LocationInfo {

    /* renamed from: a */
    public final double f9705a;

    /* renamed from: b */
    public final double f9706b;

    /* renamed from: c */
    public long f9707c;

    /* renamed from: d */
    public final String f9708d;

    /* renamed from: e */
    public final String f9709e;

    /* renamed from: f */
    public final String f9710f;

    /* renamed from: g */
    public final String f9711g;

    /* renamed from: h */
    public final String f9712h;

    /* renamed from: i */
    public final String f9713i;

    public LocationInfo(double d10, double d11, long j10, String str, String str2, String str3, String str4, String str5, String str6) {
        this.f9705a = d10;
        this.f9706b = d11;
        this.f9707c = j10;
        this.f9708d = str;
        this.f9709e = str2;
        this.f9710f = str3;
        this.f9711g = str4;
        this.f9712h = str5;
        this.f9713i = str6;
    }

    public /* synthetic */ LocationInfo(double d10, double d11, long j10, String str, String str2, String str3, String str4, String str5, String str6, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(d10, d11, j10, (i10 & 8) != 0 ? null : str, (i10 & 16) != 0 ? null : str2, (i10 & 32) != 0 ? null : str3, (i10 & 64) != 0 ? null : str4, (i10 & 128) != 0 ? null : str5, (i10 & DfuBaseService.ERROR_REMOTE_TYPE_LEGACY) != 0 ? null : str6);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof LocationInfo) {
            LocationInfo locationInfo = (LocationInfo) obj;
            return Double.compare(this.f9705a, locationInfo.f9705a) == 0 && Double.compare(this.f9706b, locationInfo.f9706b) == 0 && this.f9707c == locationInfo.f9707c && l.a(this.f9708d, locationInfo.f9708d) && l.a(this.f9709e, locationInfo.f9709e) && l.a(this.f9710f, locationInfo.f9710f) && l.a(this.f9711g, locationInfo.f9711g) && l.a(this.f9712h, locationInfo.f9712h) && l.a(this.f9713i, locationInfo.f9713i);
        }
        return false;
    }

    public final int hashCode() {
        long doubleToLongBits = Double.doubleToLongBits(this.f9705a);
        long doubleToLongBits2 = Double.doubleToLongBits(this.f9706b);
        long j10 = this.f9707c;
        int i10 = ((((((int) (doubleToLongBits ^ (doubleToLongBits >>> 32))) * 31) + ((int) (doubleToLongBits2 ^ (doubleToLongBits2 >>> 32)))) * 31) + ((int) (j10 ^ (j10 >>> 32)))) * 31;
        String str = this.f9708d;
        int hashCode = (i10 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f9709e;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f9710f;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f9711g;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f9712h;
        int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f9713i;
        return hashCode5 + (str6 != null ? str6.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder a10 = d.a("LocationInfo(lat=");
        a10.append(this.f9705a);
        a10.append(", lng=");
        a10.append(this.f9706b);
        a10.append(", time=");
        a10.append(this.f9707c);
        a10.append(", country=");
        a10.append(this.f9708d);
        a10.append(", adminArea=");
        a10.append(this.f9709e);
        a10.append(", subAdminArea=");
        a10.append(this.f9710f);
        a10.append(", locality=");
        a10.append(this.f9711g);
        a10.append(", subLocality=");
        a10.append(this.f9712h);
        a10.append(", address=");
        return a2.a(a10, this.f9713i, ')');
    }
}
