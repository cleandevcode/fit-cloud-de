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
public final class WeatherBean_NowJsonAdapter extends t<WeatherBean.Now> {

    /* renamed from: a */
    public final y.a f9882a;

    /* renamed from: b */
    public final t<String> f9883b;

    /* renamed from: c */
    public final t<String> f9884c;

    /* renamed from: d */
    public volatile Constructor<WeatherBean.Now> f9885d;

    public WeatherBean_NowJsonAdapter(h0 h0Var) {
        l.f(h0Var, "moshi");
        this.f9882a = y.a.a("cond_type", "cond_txt", "tmp", "pres", "vis", "wind_sc");
        u uVar = u.f28881a;
        this.f9883b = h0Var.c(String.class, uVar, "cond_type");
        this.f9884c = h0Var.c(String.class, uVar, "cond_txt");
    }

    @Override // mf.t
    public final WeatherBean.Now b(y yVar) {
        l.f(yVar, "reader");
        yVar.b();
        int i10 = -1;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        while (yVar.q()) {
            switch (yVar.L(this.f9882a)) {
                case -1:
                    yVar.R();
                    yVar.W();
                    break;
                case 0:
                    str = this.f9883b.b(yVar);
                    if (str != null) {
                        break;
                    } else {
                        throw b.m("cond_type", "cond_type", yVar);
                    }
                case 1:
                    str2 = this.f9884c.b(yVar);
                    i10 &= -3;
                    break;
                case 2:
                    str3 = this.f9883b.b(yVar);
                    if (str3 != null) {
                        break;
                    } else {
                        throw b.m("tmp", "tmp", yVar);
                    }
                case 3:
                    str4 = this.f9884c.b(yVar);
                    break;
                case 4:
                    str5 = this.f9884c.b(yVar);
                    break;
                case 5:
                    str6 = this.f9884c.b(yVar);
                    break;
            }
        }
        yVar.j();
        if (i10 == -3) {
            if (str != null) {
                if (str3 != null) {
                    return new WeatherBean.Now(str, str2, str3, str4, str5, str6);
                }
                throw b.g("tmp", "tmp", yVar);
            }
            throw b.g("cond_type", "cond_type", yVar);
        }
        Constructor<WeatherBean.Now> constructor = this.f9885d;
        if (constructor == null) {
            constructor = WeatherBean.Now.class.getDeclaredConstructor(String.class, String.class, String.class, String.class, String.class, String.class, Integer.TYPE, b.f22341c);
            this.f9885d = constructor;
            l.e(constructor, "WeatherBean.Now::class.j…his.constructorRef = it }");
        }
        Object[] objArr = new Object[8];
        if (str != null) {
            objArr[0] = str;
            objArr[1] = str2;
            if (str3 != null) {
                objArr[2] = str3;
                objArr[3] = str4;
                objArr[4] = str5;
                objArr[5] = str6;
                objArr[6] = Integer.valueOf(i10);
                objArr[7] = null;
                WeatherBean.Now newInstance = constructor.newInstance(objArr);
                l.e(newInstance, "localConstructor.newInst…torMarker */ null\n      )");
                return newInstance;
            }
            throw b.g("tmp", "tmp", yVar);
        }
        throw b.g("cond_type", "cond_type", yVar);
    }

    @Override // mf.t
    public final void f(e0 e0Var, WeatherBean.Now now) {
        WeatherBean.Now now2 = now;
        l.f(e0Var, "writer");
        if (now2 != null) {
            e0Var.b();
            e0Var.s("cond_type");
            this.f9883b.f(e0Var, now2.f9868a);
            e0Var.s("cond_txt");
            this.f9884c.f(e0Var, now2.f9869b);
            e0Var.s("tmp");
            this.f9883b.f(e0Var, now2.f9870c);
            e0Var.s("pres");
            this.f9884c.f(e0Var, now2.f9871d);
            e0Var.s("vis");
            this.f9884c.f(e0Var, now2.f9872e);
            e0Var.s("wind_sc");
            this.f9884c.f(e0Var, now2.f9873f);
            e0Var.k();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }

    public final String toString() {
        return "GeneratedJsonAdapter(WeatherBean.Now)";
    }
}
