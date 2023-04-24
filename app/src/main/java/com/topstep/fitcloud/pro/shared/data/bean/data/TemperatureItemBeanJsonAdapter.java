package com.topstep.fitcloud.pro.shared.data.bean.data;

import bi.z0;
import com.huawei.hms.framework.common.hianalytics.CrashHianalyticsData;
import com.topstep.fitcloud.pro.model.utils.moshi.TimeField;
import gm.l;
import java.util.Date;
import kotlin.Metadata;
import mf.e0;
import mf.h0;
import mf.t;
import mf.y;
import nf.b;
import ul.u;

@Metadata
/* loaded from: classes2.dex */
public final class TemperatureItemBeanJsonAdapter extends t<TemperatureItemBean> {

    /* renamed from: a */
    public final y.a f10013a;

    /* renamed from: b */
    public final t<Date> f10014b;

    /* renamed from: c */
    public final t<Float> f10015c;

    public TemperatureItemBeanJsonAdapter(h0 h0Var) {
        l.f(h0Var, "moshi");
        this.f10013a = y.a.a(CrashHianalyticsData.TIME, "body", "wrist");
        this.f10014b = h0Var.c(Date.class, z0.o(new TimeField() { // from class: com.topstep.fitcloud.pro.shared.data.bean.data.TemperatureItemBeanJsonAdapter.a
            @Override // java.lang.annotation.Annotation
            public final /* synthetic */ Class annotationType() {
                return TimeField.class;
            }

            @Override // java.lang.annotation.Annotation
            public final boolean equals(Object obj) {
                if (obj instanceof TimeField) {
                    TimeField timeField = (TimeField) obj;
                    return true;
                }
                return false;
            }

            @Override // java.lang.annotation.Annotation
            public final int hashCode() {
                return 0;
            }

            @Override // java.lang.annotation.Annotation
            public final String toString() {
                return "@com.topstep.fitcloud.pro.model.utils.moshi.TimeField()";
            }
        }), CrashHianalyticsData.TIME);
        this.f10015c = h0Var.c(Float.TYPE, u.f28881a, "body");
    }

    @Override // mf.t
    public final TemperatureItemBean b(y yVar) {
        l.f(yVar, "reader");
        yVar.b();
        Date date = null;
        Float f10 = null;
        Float f11 = null;
        while (yVar.q()) {
            int L = yVar.L(this.f10013a);
            if (L == -1) {
                yVar.R();
                yVar.W();
            } else if (L == 0) {
                date = this.f10014b.b(yVar);
                if (date == null) {
                    throw b.m(CrashHianalyticsData.TIME, CrashHianalyticsData.TIME, yVar);
                }
            } else if (L == 1) {
                f10 = this.f10015c.b(yVar);
                if (f10 == null) {
                    throw b.m("body", "body", yVar);
                }
            } else if (L == 2 && (f11 = this.f10015c.b(yVar)) == null) {
                throw b.m("wrist", "wrist", yVar);
            }
        }
        yVar.j();
        if (date != null) {
            if (f10 != null) {
                float floatValue = f10.floatValue();
                if (f11 != null) {
                    return new TemperatureItemBean(date, floatValue, f11.floatValue());
                }
                throw b.g("wrist", "wrist", yVar);
            }
            throw b.g("body", "body", yVar);
        }
        throw b.g(CrashHianalyticsData.TIME, CrashHianalyticsData.TIME, yVar);
    }

    @Override // mf.t
    public final void f(e0 e0Var, TemperatureItemBean temperatureItemBean) {
        TemperatureItemBean temperatureItemBean2 = temperatureItemBean;
        l.f(e0Var, "writer");
        if (temperatureItemBean2 != null) {
            e0Var.b();
            e0Var.s(CrashHianalyticsData.TIME);
            this.f10014b.f(e0Var, temperatureItemBean2.f10010a);
            e0Var.s("body");
            this.f10015c.f(e0Var, Float.valueOf(temperatureItemBean2.f10011b));
            e0Var.s("wrist");
            this.f10015c.f(e0Var, Float.valueOf(temperatureItemBean2.f10012c));
            e0Var.k();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }

    public final String toString() {
        return "GeneratedJsonAdapter(TemperatureItemBean)";
    }
}
