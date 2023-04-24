package com.topstep.fitcloud.pro.model.weather;

import com.huawei.hms.framework.common.hianalytics.CrashHianalyticsData;
import gm.l;
import java.lang.reflect.Constructor;
import java.util.List;
import kotlin.Metadata;
import mf.e0;
import mf.h0;
import mf.l0;
import mf.t;
import mf.y;
import nf.b;
import ul.u;

@Metadata
/* loaded from: classes2.dex */
public final class WeatherInfoJsonAdapter extends t<WeatherInfo> {

    /* renamed from: a */
    public final y.a f9745a;

    /* renamed from: b */
    public final t<Long> f9746b;

    /* renamed from: c */
    public final t<String> f9747c;

    /* renamed from: d */
    public final t<Integer> f9748d;

    /* renamed from: e */
    public final t<String> f9749e;

    /* renamed from: f */
    public final t<List<ForecastInfo>> f9750f;

    /* renamed from: g */
    public volatile Constructor<WeatherInfo> f9751g;

    public WeatherInfoJsonAdapter(h0 h0Var) {
        l.f(h0Var, "moshi");
        this.f9745a = y.a.a(CrashHianalyticsData.TIME, "cid", "locality", "tmp", "code", "codeText", "forecasts", "min", "max", "pressure", "windForce", "visibility");
        Class cls = Long.TYPE;
        u uVar = u.f28881a;
        this.f9746b = h0Var.c(cls, uVar, CrashHianalyticsData.TIME);
        this.f9747c = h0Var.c(String.class, uVar, "cid");
        this.f9748d = h0Var.c(Integer.TYPE, uVar, "tmp");
        this.f9749e = h0Var.c(String.class, uVar, "codeText");
        this.f9750f = h0Var.c(l0.d(List.class, ForecastInfo.class), uVar, "forecasts");
    }

    @Override // mf.t
    public final WeatherInfo b(y yVar) {
        String str;
        Class<String> cls = String.class;
        l.f(yVar, "reader");
        yVar.b();
        int i10 = -1;
        Integer num = null;
        Integer num2 = null;
        Integer num3 = null;
        String str2 = null;
        String str3 = null;
        Integer num4 = null;
        Integer num5 = null;
        String str4 = null;
        List<ForecastInfo> list = null;
        Integer num6 = null;
        Long l10 = null;
        Integer num7 = null;
        while (true) {
            Class<String> cls2 = cls;
            List<ForecastInfo> list2 = list;
            String str5 = str4;
            Integer num8 = num;
            Integer num9 = num2;
            Integer num10 = num3;
            Integer num11 = num4;
            Integer num12 = num5;
            Integer num13 = num6;
            if (!yVar.q()) {
                String str6 = str3;
                yVar.j();
                if (i10 == -97) {
                    if (l10 != null) {
                        long longValue = l10.longValue();
                        if (str2 != null) {
                            if (str6 != null) {
                                if (num13 != null) {
                                    int intValue = num13.intValue();
                                    if (num12 != null) {
                                        int intValue2 = num12.intValue();
                                        if (num11 != null) {
                                            int intValue3 = num11.intValue();
                                            if (num10 != null) {
                                                int intValue4 = num10.intValue();
                                                if (num9 != null) {
                                                    int intValue5 = num9.intValue();
                                                    if (num8 != null) {
                                                        int intValue6 = num8.intValue();
                                                        if (num7 != null) {
                                                            return new WeatherInfo(longValue, str2, str6, intValue, intValue2, str5, list2, intValue3, intValue4, intValue5, intValue6, num7.intValue());
                                                        }
                                                        throw b.g("visibility", "visibility", yVar);
                                                    }
                                                    throw b.g("windForce", "windForce", yVar);
                                                }
                                                throw b.g("pressure", "pressure", yVar);
                                            }
                                            throw b.g("max", "max", yVar);
                                        }
                                        throw b.g("min", "min", yVar);
                                    }
                                    throw b.g("code", "code", yVar);
                                }
                                throw b.g("tmp", "tmp", yVar);
                            }
                            throw b.g("locality", "locality", yVar);
                        }
                        throw b.g("cid", "cid", yVar);
                    }
                    throw b.g(CrashHianalyticsData.TIME, CrashHianalyticsData.TIME, yVar);
                }
                Constructor<WeatherInfo> constructor = this.f9751g;
                if (constructor == null) {
                    str = "cid";
                    Class cls3 = Integer.TYPE;
                    constructor = WeatherInfo.class.getDeclaredConstructor(Long.TYPE, cls2, cls2, cls3, cls3, cls2, List.class, cls3, cls3, cls3, cls3, cls3, cls3, b.f22341c);
                    this.f9751g = constructor;
                    l.e(constructor, "WeatherInfo::class.java.…his.constructorRef = it }");
                } else {
                    str = "cid";
                }
                Object[] objArr = new Object[14];
                if (l10 != null) {
                    objArr[0] = Long.valueOf(l10.longValue());
                    if (str2 == null) {
                        String str7 = str;
                        throw b.g(str7, str7, yVar);
                    }
                    objArr[1] = str2;
                    if (str6 != null) {
                        objArr[2] = str6;
                        if (num13 != null) {
                            objArr[3] = Integer.valueOf(num13.intValue());
                            if (num12 != null) {
                                objArr[4] = Integer.valueOf(num12.intValue());
                                objArr[5] = str5;
                                objArr[6] = list2;
                                if (num11 != null) {
                                    objArr[7] = Integer.valueOf(num11.intValue());
                                    if (num10 != null) {
                                        objArr[8] = Integer.valueOf(num10.intValue());
                                        if (num9 != null) {
                                            objArr[9] = Integer.valueOf(num9.intValue());
                                            if (num8 != null) {
                                                objArr[10] = Integer.valueOf(num8.intValue());
                                                if (num7 != null) {
                                                    objArr[11] = Integer.valueOf(num7.intValue());
                                                    objArr[12] = Integer.valueOf(i10);
                                                    objArr[13] = null;
                                                    WeatherInfo newInstance = constructor.newInstance(objArr);
                                                    l.e(newInstance, "localConstructor.newInst…torMarker */ null\n      )");
                                                    return newInstance;
                                                }
                                                throw b.g("visibility", "visibility", yVar);
                                            }
                                            throw b.g("windForce", "windForce", yVar);
                                        }
                                        throw b.g("pressure", "pressure", yVar);
                                    }
                                    throw b.g("max", "max", yVar);
                                }
                                throw b.g("min", "min", yVar);
                            }
                            throw b.g("code", "code", yVar);
                        }
                        throw b.g("tmp", "tmp", yVar);
                    }
                    throw b.g("locality", "locality", yVar);
                }
                throw b.g(CrashHianalyticsData.TIME, CrashHianalyticsData.TIME, yVar);
            }
            String str8 = str3;
            switch (yVar.L(this.f9745a)) {
                case -1:
                    yVar.R();
                    yVar.W();
                    str3 = str8;
                    list = list2;
                    str4 = str5;
                    num = num8;
                    num2 = num9;
                    num3 = num10;
                    num4 = num11;
                    num5 = num12;
                    break;
                case 0:
                    l10 = this.f9746b.b(yVar);
                    if (l10 == null) {
                        throw b.m(CrashHianalyticsData.TIME, CrashHianalyticsData.TIME, yVar);
                    }
                    str3 = str8;
                    list = list2;
                    str4 = str5;
                    num = num8;
                    num2 = num9;
                    num3 = num10;
                    num4 = num11;
                    num5 = num12;
                    break;
                case 1:
                    str2 = this.f9747c.b(yVar);
                    if (str2 == null) {
                        throw b.m("cid", "cid", yVar);
                    }
                    str3 = str8;
                    list = list2;
                    str4 = str5;
                    num = num8;
                    num2 = num9;
                    num3 = num10;
                    num4 = num11;
                    num5 = num12;
                    break;
                case 2:
                    str3 = this.f9747c.b(yVar);
                    if (str3 == null) {
                        throw b.m("locality", "locality", yVar);
                    }
                    list = list2;
                    str4 = str5;
                    num = num8;
                    num2 = num9;
                    num3 = num10;
                    num4 = num11;
                    num5 = num12;
                    break;
                case 3:
                    num6 = this.f9748d.b(yVar);
                    if (num6 != null) {
                        str3 = str8;
                        cls = cls2;
                        list = list2;
                        str4 = str5;
                        num = num8;
                        num2 = num9;
                        num3 = num10;
                        num4 = num11;
                        num5 = num12;
                        continue;
                    } else {
                        throw b.m("tmp", "tmp", yVar);
                    }
                case 4:
                    Integer b10 = this.f9748d.b(yVar);
                    if (b10 != null) {
                        num5 = b10;
                        str3 = str8;
                        list = list2;
                        str4 = str5;
                        num = num8;
                        num2 = num9;
                        num3 = num10;
                        num4 = num11;
                        break;
                    } else {
                        throw b.m("code", "code", yVar);
                    }
                case 5:
                    str4 = this.f9749e.b(yVar);
                    i10 &= -33;
                    str3 = str8;
                    list = list2;
                    num = num8;
                    num2 = num9;
                    num3 = num10;
                    num4 = num11;
                    num5 = num12;
                    break;
                case 6:
                    list = this.f9750f.b(yVar);
                    i10 &= -65;
                    str3 = str8;
                    str4 = str5;
                    num = num8;
                    num2 = num9;
                    num3 = num10;
                    num4 = num11;
                    num5 = num12;
                    break;
                case 7:
                    num4 = this.f9748d.b(yVar);
                    if (num4 != null) {
                        str3 = str8;
                        list = list2;
                        str4 = str5;
                        num = num8;
                        num2 = num9;
                        num3 = num10;
                        num5 = num12;
                        break;
                    } else {
                        throw b.m("min", "min", yVar);
                    }
                case 8:
                    Integer b11 = this.f9748d.b(yVar);
                    if (b11 != null) {
                        num3 = b11;
                        str3 = str8;
                        list = list2;
                        str4 = str5;
                        num = num8;
                        num2 = num9;
                        num4 = num11;
                        num5 = num12;
                        break;
                    } else {
                        throw b.m("max", "max", yVar);
                    }
                case 9:
                    num2 = this.f9748d.b(yVar);
                    if (num2 != null) {
                        str3 = str8;
                        list = list2;
                        str4 = str5;
                        num = num8;
                        num3 = num10;
                        num4 = num11;
                        num5 = num12;
                        break;
                    } else {
                        throw b.m("pressure", "pressure", yVar);
                    }
                case 10:
                    num = this.f9748d.b(yVar);
                    if (num != null) {
                        str3 = str8;
                        list = list2;
                        str4 = str5;
                        num2 = num9;
                        num3 = num10;
                        num4 = num11;
                        num5 = num12;
                        break;
                    } else {
                        throw b.m("windForce", "windForce", yVar);
                    }
                case 11:
                    num7 = this.f9748d.b(yVar);
                    if (num7 == null) {
                        throw b.m("visibility", "visibility", yVar);
                    }
                    str3 = str8;
                    list = list2;
                    str4 = str5;
                    num = num8;
                    num2 = num9;
                    num3 = num10;
                    num4 = num11;
                    num5 = num12;
                    break;
                default:
                    str3 = str8;
                    list = list2;
                    str4 = str5;
                    num = num8;
                    num2 = num9;
                    num3 = num10;
                    num4 = num11;
                    num5 = num12;
                    break;
            }
            cls = cls2;
            num6 = num13;
        }
    }

    @Override // mf.t
    public final void f(e0 e0Var, WeatherInfo weatherInfo) {
        WeatherInfo weatherInfo2 = weatherInfo;
        l.f(e0Var, "writer");
        if (weatherInfo2 != null) {
            e0Var.b();
            e0Var.s(CrashHianalyticsData.TIME);
            this.f9746b.f(e0Var, Long.valueOf(weatherInfo2.f9733a));
            e0Var.s("cid");
            this.f9747c.f(e0Var, weatherInfo2.f9734b);
            e0Var.s("locality");
            this.f9747c.f(e0Var, weatherInfo2.f9735c);
            e0Var.s("tmp");
            fb.b.b(weatherInfo2.f9736d, this.f9748d, e0Var, "code");
            fb.b.b(weatherInfo2.f9737e, this.f9748d, e0Var, "codeText");
            this.f9749e.f(e0Var, weatherInfo2.f9738f);
            e0Var.s("forecasts");
            this.f9750f.f(e0Var, weatherInfo2.f9739g);
            e0Var.s("min");
            fb.b.b(weatherInfo2.f9740h, this.f9748d, e0Var, "max");
            fb.b.b(weatherInfo2.f9741i, this.f9748d, e0Var, "pressure");
            fb.b.b(weatherInfo2.f9742j, this.f9748d, e0Var, "windForce");
            fb.b.b(weatherInfo2.f9743k, this.f9748d, e0Var, "visibility");
            this.f9748d.f(e0Var, Integer.valueOf(weatherInfo2.f9744l));
            e0Var.k();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }

    public final String toString() {
        return "GeneratedJsonAdapter(WeatherInfo)";
    }
}
