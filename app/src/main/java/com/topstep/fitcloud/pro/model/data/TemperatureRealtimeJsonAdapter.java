package com.topstep.fitcloud.pro.model.data;

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
public final class TemperatureRealtimeJsonAdapter extends t<TemperatureRealtime> {

    /* renamed from: a */
    public final y.a f9655a;

    /* renamed from: b */
    public final t<Date> f9656b;

    /* renamed from: c */
    public final t<Float> f9657c;

    public TemperatureRealtimeJsonAdapter(h0 h0Var) {
        l.f(h0Var, "moshi");
        this.f9655a = y.a.a(CrashHianalyticsData.TIME, "avgBody", "avgWrist");
        this.f9656b = h0Var.c(Date.class, z0.o(new TimeField() { // from class: com.topstep.fitcloud.pro.model.data.TemperatureRealtimeJsonAdapter.a
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
        this.f9657c = h0Var.c(Float.TYPE, u.f28881a, "avgBody");
    }

    @Override // mf.t
    public final TemperatureRealtime b(y yVar) {
        l.f(yVar, "reader");
        yVar.b();
        Date date = null;
        Float f10 = null;
        Float f11 = null;
        while (yVar.q()) {
            int L = yVar.L(this.f9655a);
            if (L == -1) {
                yVar.R();
                yVar.W();
            } else if (L == 0) {
                date = this.f9656b.b(yVar);
                if (date == null) {
                    throw b.m(CrashHianalyticsData.TIME, CrashHianalyticsData.TIME, yVar);
                }
            } else if (L == 1) {
                f10 = this.f9657c.b(yVar);
                if (f10 == null) {
                    throw b.m("avgBody", "avgBody", yVar);
                }
            } else if (L == 2 && (f11 = this.f9657c.b(yVar)) == null) {
                throw b.m("avgWrist", "avgWrist", yVar);
            }
        }
        yVar.j();
        if (date != null) {
            if (f10 != null) {
                float floatValue = f10.floatValue();
                if (f11 != null) {
                    return new TemperatureRealtime(date, floatValue, f11.floatValue());
                }
                throw b.g("avgWrist", "avgWrist", yVar);
            }
            throw b.g("avgBody", "avgBody", yVar);
        }
        throw b.g(CrashHianalyticsData.TIME, CrashHianalyticsData.TIME, yVar);
    }

    @Override // mf.t
    public final void f(e0 e0Var, TemperatureRealtime temperatureRealtime) {
        TemperatureRealtime temperatureRealtime2 = temperatureRealtime;
        l.f(e0Var, "writer");
        if (temperatureRealtime2 != null) {
            e0Var.b();
            e0Var.s(CrashHianalyticsData.TIME);
            this.f9656b.f(e0Var, temperatureRealtime2.f9652a);
            e0Var.s("avgBody");
            this.f9657c.f(e0Var, Float.valueOf(temperatureRealtime2.f9653b));
            e0Var.s("avgWrist");
            this.f9657c.f(e0Var, Float.valueOf(temperatureRealtime2.f9654c));
            e0Var.k();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }

    public final String toString() {
        return "GeneratedJsonAdapter(TemperatureRealtime)";
    }
}
