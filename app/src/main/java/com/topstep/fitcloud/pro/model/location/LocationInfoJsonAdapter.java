package com.topstep.fitcloud.pro.model.location;

import cn.sharesdk.framework.InnerShareParams;
import com.huawei.hms.framework.common.hianalytics.CrashHianalyticsData;
import gm.l;
import java.lang.reflect.Constructor;
import kotlin.Metadata;
import mf.e0;
import mf.h0;
import mf.t;
import mf.y;
import nf.b;
import ul.u;

@Metadata
/* loaded from: classes2.dex */
public final class LocationInfoJsonAdapter extends t<LocationInfo> {

    /* renamed from: a */
    public final y.a f9714a;

    /* renamed from: b */
    public final t<Double> f9715b;

    /* renamed from: c */
    public final t<Long> f9716c;

    /* renamed from: d */
    public final t<String> f9717d;

    /* renamed from: e */
    public volatile Constructor<LocationInfo> f9718e;

    public LocationInfoJsonAdapter(h0 h0Var) {
        l.f(h0Var, "moshi");
        this.f9714a = y.a.a("lat", "lng", CrashHianalyticsData.TIME, "country", "adminArea", "subAdminArea", "locality", "subLocality", InnerShareParams.ADDRESS);
        Class cls = Double.TYPE;
        u uVar = u.f28881a;
        this.f9715b = h0Var.c(cls, uVar, "lat");
        this.f9716c = h0Var.c(Long.TYPE, uVar, CrashHianalyticsData.TIME);
        this.f9717d = h0Var.c(String.class, uVar, "country");
    }

    @Override // mf.t
    public final LocationInfo b(y yVar) {
        l.f(yVar, "reader");
        yVar.b();
        int i10 = -1;
        Double d10 = null;
        Double d11 = null;
        Long l10 = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        while (yVar.q()) {
            switch (yVar.L(this.f9714a)) {
                case -1:
                    yVar.R();
                    yVar.W();
                    break;
                case 0:
                    d10 = this.f9715b.b(yVar);
                    if (d10 != null) {
                        break;
                    } else {
                        throw b.m("lat", "lat", yVar);
                    }
                case 1:
                    d11 = this.f9715b.b(yVar);
                    if (d11 != null) {
                        break;
                    } else {
                        throw b.m("lng", "lng", yVar);
                    }
                case 2:
                    l10 = this.f9716c.b(yVar);
                    if (l10 != null) {
                        break;
                    } else {
                        throw b.m(CrashHianalyticsData.TIME, CrashHianalyticsData.TIME, yVar);
                    }
                case 3:
                    str = this.f9717d.b(yVar);
                    i10 &= -9;
                    break;
                case 4:
                    str2 = this.f9717d.b(yVar);
                    i10 &= -17;
                    break;
                case 5:
                    str3 = this.f9717d.b(yVar);
                    i10 &= -33;
                    break;
                case 6:
                    str4 = this.f9717d.b(yVar);
                    i10 &= -65;
                    break;
                case 7:
                    str5 = this.f9717d.b(yVar);
                    i10 &= -129;
                    break;
                case 8:
                    str6 = this.f9717d.b(yVar);
                    i10 &= -257;
                    break;
            }
        }
        yVar.j();
        if (i10 == -505) {
            if (d10 != null) {
                double doubleValue = d10.doubleValue();
                if (d11 != null) {
                    double doubleValue2 = d11.doubleValue();
                    if (l10 != null) {
                        return new LocationInfo(doubleValue, doubleValue2, l10.longValue(), str, str2, str3, str4, str5, str6);
                    }
                    throw b.g(CrashHianalyticsData.TIME, CrashHianalyticsData.TIME, yVar);
                }
                throw b.g("lng", "lng", yVar);
            }
            throw b.g("lat", "lat", yVar);
        }
        Constructor<LocationInfo> constructor = this.f9718e;
        if (constructor == null) {
            Class cls = Double.TYPE;
            constructor = LocationInfo.class.getDeclaredConstructor(cls, cls, Long.TYPE, String.class, String.class, String.class, String.class, String.class, String.class, Integer.TYPE, b.f22341c);
            this.f9718e = constructor;
            l.e(constructor, "LocationInfo::class.java…his.constructorRef = it }");
        }
        Object[] objArr = new Object[11];
        if (d10 != null) {
            objArr[0] = Double.valueOf(d10.doubleValue());
            if (d11 != null) {
                objArr[1] = Double.valueOf(d11.doubleValue());
                if (l10 != null) {
                    objArr[2] = Long.valueOf(l10.longValue());
                    objArr[3] = str;
                    objArr[4] = str2;
                    objArr[5] = str3;
                    objArr[6] = str4;
                    objArr[7] = str5;
                    objArr[8] = str6;
                    objArr[9] = Integer.valueOf(i10);
                    objArr[10] = null;
                    LocationInfo newInstance = constructor.newInstance(objArr);
                    l.e(newInstance, "localConstructor.newInst…torMarker */ null\n      )");
                    return newInstance;
                }
                throw b.g(CrashHianalyticsData.TIME, CrashHianalyticsData.TIME, yVar);
            }
            throw b.g("lng", "lng", yVar);
        }
        throw b.g("lat", "lat", yVar);
    }

    @Override // mf.t
    public final void f(e0 e0Var, LocationInfo locationInfo) {
        LocationInfo locationInfo2 = locationInfo;
        l.f(e0Var, "writer");
        if (locationInfo2 != null) {
            e0Var.b();
            e0Var.s("lat");
            this.f9715b.f(e0Var, Double.valueOf(locationInfo2.f9705a));
            e0Var.s("lng");
            this.f9715b.f(e0Var, Double.valueOf(locationInfo2.f9706b));
            e0Var.s(CrashHianalyticsData.TIME);
            this.f9716c.f(e0Var, Long.valueOf(locationInfo2.f9707c));
            e0Var.s("country");
            this.f9717d.f(e0Var, locationInfo2.f9708d);
            e0Var.s("adminArea");
            this.f9717d.f(e0Var, locationInfo2.f9709e);
            e0Var.s("subAdminArea");
            this.f9717d.f(e0Var, locationInfo2.f9710f);
            e0Var.s("locality");
            this.f9717d.f(e0Var, locationInfo2.f9711g);
            e0Var.s("subLocality");
            this.f9717d.f(e0Var, locationInfo2.f9712h);
            e0Var.s(InnerShareParams.ADDRESS);
            this.f9717d.f(e0Var, locationInfo2.f9713i);
            e0Var.k();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }

    public final String toString() {
        return "GeneratedJsonAdapter(LocationInfo)";
    }
}
