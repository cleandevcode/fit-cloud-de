package com.topstep.fitcloud.pro.shared.data.bean;

import com.topstep.fitcloud.pro.shared.data.bean.WeatherBean;
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
public final class WeatherBean_DayJsonAdapter extends t<WeatherBean.Day> {

    /* renamed from: a */
    public final y.a f9878a;

    /* renamed from: b */
    public final t<String> f9879b;

    /* renamed from: c */
    public final t<String> f9880c;

    /* renamed from: d */
    public volatile Constructor<WeatherBean.Day> f9881d;

    public WeatherBean_DayJsonAdapter(h0 h0Var) {
        l.f(h0Var, "moshi");
        this.f9878a = y.a.a("fxDate", "weatherDayType", "textDay", "tempMin", "tempMax");
        u uVar = u.f28881a;
        this.f9879b = h0Var.c(String.class, uVar, "fxDate");
        this.f9880c = h0Var.c(String.class, uVar, "textDay");
    }

    @Override // mf.t
    public final WeatherBean.Day b(y yVar) {
        l.f(yVar, "reader");
        yVar.b();
        int i10 = -1;
        int i11 = -1;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        while (yVar.q()) {
            int L = yVar.L(this.f9878a);
            if (L == i10) {
                yVar.R();
                yVar.W();
            } else if (L == 0) {
                str = this.f9879b.b(yVar);
                if (str == null) {
                    throw b.m("fxDate", "fxDate", yVar);
                }
            } else if (L == 1) {
                str2 = this.f9879b.b(yVar);
                if (str2 == null) {
                    throw b.m("weatherDayType", "weatherDayType", yVar);
                }
            } else if (L == 2) {
                str3 = this.f9880c.b(yVar);
                i11 &= -5;
            } else if (L == 3) {
                str4 = this.f9879b.b(yVar);
                if (str4 == null) {
                    throw b.m("tempMin", "tempMin", yVar);
                }
            } else if (L == 4 && (str5 = this.f9879b.b(yVar)) == null) {
                throw b.m("tempMax", "tempMax", yVar);
            }
            i10 = -1;
        }
        yVar.j();
        if (i11 == -5) {
            if (str != null) {
                if (str2 != null) {
                    if (str4 != null) {
                        if (str5 != null) {
                            return new WeatherBean.Day(str, str2, str3, str4, str5);
                        }
                        throw b.g("tempMax", "tempMax", yVar);
                    }
                    throw b.g("tempMin", "tempMin", yVar);
                }
                throw b.g("weatherDayType", "weatherDayType", yVar);
            }
            throw b.g("fxDate", "fxDate", yVar);
        }
        Constructor<WeatherBean.Day> constructor = this.f9881d;
        if (constructor == null) {
            constructor = WeatherBean.Day.class.getDeclaredConstructor(String.class, String.class, String.class, String.class, String.class, Integer.TYPE, b.f22341c);
            this.f9881d = constructor;
            l.e(constructor, "WeatherBean.Day::class.j…his.constructorRef = it }");
        }
        Object[] objArr = new Object[7];
        if (str != null) {
            objArr[0] = str;
            if (str2 != null) {
                objArr[1] = str2;
                objArr[2] = str3;
                if (str4 != null) {
                    objArr[3] = str4;
                    if (str5 != null) {
                        objArr[4] = str5;
                        objArr[5] = Integer.valueOf(i11);
                        objArr[6] = null;
                        WeatherBean.Day newInstance = constructor.newInstance(objArr);
                        l.e(newInstance, "localConstructor.newInst…torMarker */ null\n      )");
                        return newInstance;
                    }
                    throw b.g("tempMax", "tempMax", yVar);
                }
                throw b.g("tempMin", "tempMin", yVar);
            }
            throw b.g("weatherDayType", "weatherDayType", yVar);
        }
        throw b.g("fxDate", "fxDate", yVar);
    }

    @Override // mf.t
    public final void f(e0 e0Var, WeatherBean.Day day) {
        WeatherBean.Day day2 = day;
        l.f(e0Var, "writer");
        if (day2 != null) {
            e0Var.b();
            e0Var.s("fxDate");
            this.f9879b.f(e0Var, day2.f9863a);
            e0Var.s("weatherDayType");
            this.f9879b.f(e0Var, day2.f9864b);
            e0Var.s("textDay");
            this.f9880c.f(e0Var, day2.f9865c);
            e0Var.s("tempMin");
            this.f9879b.f(e0Var, day2.f9866d);
            e0Var.s("tempMax");
            this.f9879b.f(e0Var, day2.f9867e);
            e0Var.k();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }

    public final String toString() {
        return "GeneratedJsonAdapter(WeatherBean.Day)";
    }
}
