package com.topstep.fitcloud.pro.shared.data.bean;

import com.topstep.fitcloud.pro.shared.data.bean.WeatherBean;
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
public final class WeatherBeanJsonAdapter extends t<WeatherBean> {

    /* renamed from: a */
    public final y.a f9874a;

    /* renamed from: b */
    public final t<WeatherBean.Now> f9875b;

    /* renamed from: c */
    public final t<List<WeatherBean.Day>> f9876c;

    /* renamed from: d */
    public volatile Constructor<WeatherBean> f9877d;

    public WeatherBeanJsonAdapter(h0 h0Var) {
        l.f(h0Var, "moshi");
        this.f9874a = y.a.a("now", "daily");
        u uVar = u.f28881a;
        this.f9875b = h0Var.c(WeatherBean.Now.class, uVar, "now");
        this.f9876c = h0Var.c(l0.d(List.class, WeatherBean.Day.class), uVar, "daily");
    }

    @Override // mf.t
    public final WeatherBean b(y yVar) {
        l.f(yVar, "reader");
        yVar.b();
        WeatherBean.Now now = null;
        List<WeatherBean.Day> list = null;
        int i10 = -1;
        while (yVar.q()) {
            int L = yVar.L(this.f9874a);
            if (L == -1) {
                yVar.R();
                yVar.W();
            } else if (L == 0) {
                now = this.f9875b.b(yVar);
                i10 &= -2;
            } else if (L == 1) {
                list = this.f9876c.b(yVar);
                i10 &= -3;
            }
        }
        yVar.j();
        if (i10 == -4) {
            return new WeatherBean(now, list);
        }
        Constructor<WeatherBean> constructor = this.f9877d;
        if (constructor == null) {
            constructor = WeatherBean.class.getDeclaredConstructor(WeatherBean.Now.class, List.class, Integer.TYPE, b.f22341c);
            this.f9877d = constructor;
            l.e(constructor, "WeatherBean::class.java.…his.constructorRef = it }");
        }
        WeatherBean newInstance = constructor.newInstance(now, list, Integer.valueOf(i10), null);
        l.e(newInstance, "localConstructor.newInst…torMarker */ null\n      )");
        return newInstance;
    }

    @Override // mf.t
    public final void f(e0 e0Var, WeatherBean weatherBean) {
        WeatherBean weatherBean2 = weatherBean;
        l.f(e0Var, "writer");
        if (weatherBean2 != null) {
            e0Var.b();
            e0Var.s("now");
            this.f9875b.f(e0Var, weatherBean2.f9861a);
            e0Var.s("daily");
            this.f9876c.f(e0Var, weatherBean2.f9862b);
            e0Var.k();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }

    public final String toString() {
        return "GeneratedJsonAdapter(WeatherBean)";
    }
}
