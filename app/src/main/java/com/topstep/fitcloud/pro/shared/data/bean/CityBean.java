package com.topstep.fitcloud.pro.shared.data.bean;

import android.support.v4.media.d;
import com.topstep.fitcloud.pro.model.location.LocationInfo;
import gm.l;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mf.u;
import pg.b;

@Metadata
@u(generateAdapter = true)
/* loaded from: classes2.dex */
public final class CityBean {

    /* renamed from: a */
    public final String f9752a;

    /* renamed from: b */
    public final String f9753b;

    /* renamed from: c */
    public final Double f9754c;

    /* renamed from: d */
    public final Double f9755d;

    public CityBean(String str, String str2, Double d10, Double d11) {
        l.f(str, "cid");
        this.f9752a = str;
        this.f9753b = str2;
        this.f9754c = d10;
        this.f9755d = d11;
    }

    public /* synthetic */ CityBean(String str, String str2, Double d10, Double d11, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i10 & 2) != 0 ? null : str2, (i10 & 4) != 0 ? null : d10, (i10 & 8) != 0 ? null : d11);
    }

    public final b a(LocationInfo locationInfo) {
        boolean z10;
        boolean z11;
        String str;
        l.f(locationInfo, "locationInfo");
        String str2 = locationInfo.f9712h;
        boolean z12 = false;
        if (str2 != null && str2.length() != 0) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (!z10) {
            str = locationInfo.f9712h;
        } else {
            String str3 = locationInfo.f9711g;
            if (str3 != null && str3.length() != 0) {
                z11 = false;
            } else {
                z11 = true;
            }
            if (!z11) {
                str = locationInfo.f9711g;
            } else {
                String str4 = this.f9753b;
                if (!((str4 == null || str4.length() == 0) ? true : true)) {
                    str = this.f9753b;
                } else {
                    str = "";
                }
                return new b(this.f9752a, str, this.f9754c, this.f9755d, 0);
            }
        }
        l.c(str);
        return new b(this.f9752a, str, this.f9754c, this.f9755d, 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof CityBean) {
            CityBean cityBean = (CityBean) obj;
            return l.a(this.f9752a, cityBean.f9752a) && l.a(this.f9753b, cityBean.f9753b) && l.a(this.f9754c, cityBean.f9754c) && l.a(this.f9755d, cityBean.f9755d);
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.f9752a.hashCode() * 31;
        String str = this.f9753b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Double d10 = this.f9754c;
        int hashCode3 = (hashCode2 + (d10 == null ? 0 : d10.hashCode())) * 31;
        Double d11 = this.f9755d;
        return hashCode3 + (d11 != null ? d11.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder a10 = d.a("CityBean(cid=");
        a10.append(this.f9752a);
        a10.append(", location=");
        a10.append(this.f9753b);
        a10.append(", lat=");
        a10.append(this.f9754c);
        a10.append(", lon=");
        a10.append(this.f9755d);
        a10.append(')');
        return a10.toString();
    }
}
