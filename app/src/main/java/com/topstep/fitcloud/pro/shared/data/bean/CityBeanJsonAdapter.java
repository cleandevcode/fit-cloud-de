package com.topstep.fitcloud.pro.shared.data.bean;

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
public final class CityBeanJsonAdapter extends t<CityBean> {

    /* renamed from: a */
    public final y.a f9756a;

    /* renamed from: b */
    public final t<String> f9757b;

    /* renamed from: c */
    public final t<String> f9758c;

    /* renamed from: d */
    public final t<Double> f9759d;

    /* renamed from: e */
    public volatile Constructor<CityBean> f9760e;

    public CityBeanJsonAdapter(h0 h0Var) {
        l.f(h0Var, "moshi");
        this.f9756a = y.a.a("cid", "location", "lat", "lon");
        u uVar = u.f28881a;
        this.f9757b = h0Var.c(String.class, uVar, "cid");
        this.f9758c = h0Var.c(String.class, uVar, "location");
        this.f9759d = h0Var.c(Double.class, uVar, "lat");
    }

    @Override // mf.t
    public final CityBean b(y yVar) {
        l.f(yVar, "reader");
        yVar.b();
        int i10 = -1;
        String str = null;
        String str2 = null;
        Double d10 = null;
        Double d11 = null;
        while (yVar.q()) {
            int L = yVar.L(this.f9756a);
            if (L == -1) {
                yVar.R();
                yVar.W();
            } else if (L == 0) {
                str = this.f9757b.b(yVar);
                if (str == null) {
                    throw b.m("cid", "cid", yVar);
                }
            } else if (L == 1) {
                str2 = this.f9758c.b(yVar);
                i10 &= -3;
            } else if (L == 2) {
                d10 = this.f9759d.b(yVar);
                i10 &= -5;
            } else if (L == 3) {
                d11 = this.f9759d.b(yVar);
                i10 &= -9;
            }
        }
        yVar.j();
        if (i10 == -15) {
            if (str != null) {
                return new CityBean(str, str2, d10, d11);
            }
            throw b.g("cid", "cid", yVar);
        }
        Constructor<CityBean> constructor = this.f9760e;
        if (constructor == null) {
            constructor = CityBean.class.getDeclaredConstructor(String.class, String.class, Double.class, Double.class, Integer.TYPE, b.f22341c);
            this.f9760e = constructor;
            l.e(constructor, "CityBean::class.java.get…his.constructorRef = it }");
        }
        Object[] objArr = new Object[6];
        if (str != null) {
            objArr[0] = str;
            objArr[1] = str2;
            objArr[2] = d10;
            objArr[3] = d11;
            objArr[4] = Integer.valueOf(i10);
            objArr[5] = null;
            CityBean newInstance = constructor.newInstance(objArr);
            l.e(newInstance, "localConstructor.newInst…torMarker */ null\n      )");
            return newInstance;
        }
        throw b.g("cid", "cid", yVar);
    }

    @Override // mf.t
    public final void f(e0 e0Var, CityBean cityBean) {
        CityBean cityBean2 = cityBean;
        l.f(e0Var, "writer");
        if (cityBean2 != null) {
            e0Var.b();
            e0Var.s("cid");
            this.f9757b.f(e0Var, cityBean2.f9752a);
            e0Var.s("location");
            this.f9758c.f(e0Var, cityBean2.f9753b);
            e0Var.s("lat");
            this.f9759d.f(e0Var, cityBean2.f9754c);
            e0Var.s("lon");
            this.f9759d.f(e0Var, cityBean2.f9755d);
            e0Var.k();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }

    public final String toString() {
        return "GeneratedJsonAdapter(CityBean)";
    }
}
