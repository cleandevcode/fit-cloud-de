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
public final class OxygenRealtimeJsonAdapter extends t<OxygenRealtime> {

    /* renamed from: a */
    public final y.a f9587a;

    /* renamed from: b */
    public final t<Date> f9588b;

    /* renamed from: c */
    public final t<Integer> f9589c;

    public OxygenRealtimeJsonAdapter(h0 h0Var) {
        l.f(h0Var, "moshi");
        this.f9587a = y.a.a(CrashHianalyticsData.TIME, "avg");
        this.f9588b = h0Var.c(Date.class, z0.o(new TimeField() { // from class: com.topstep.fitcloud.pro.model.data.OxygenRealtimeJsonAdapter.a
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
        this.f9589c = h0Var.c(Integer.TYPE, u.f28881a, "avg");
    }

    @Override // mf.t
    public final OxygenRealtime b(y yVar) {
        l.f(yVar, "reader");
        yVar.b();
        Date date = null;
        Integer num = null;
        while (yVar.q()) {
            int L = yVar.L(this.f9587a);
            if (L == -1) {
                yVar.R();
                yVar.W();
            } else if (L == 0) {
                date = this.f9588b.b(yVar);
                if (date == null) {
                    throw b.m(CrashHianalyticsData.TIME, CrashHianalyticsData.TIME, yVar);
                }
            } else if (L == 1 && (num = this.f9589c.b(yVar)) == null) {
                throw b.m("avg", "avg", yVar);
            }
        }
        yVar.j();
        if (date != null) {
            if (num != null) {
                return new OxygenRealtime(num.intValue(), date);
            }
            throw b.g("avg", "avg", yVar);
        }
        throw b.g(CrashHianalyticsData.TIME, CrashHianalyticsData.TIME, yVar);
    }

    @Override // mf.t
    public final void f(e0 e0Var, OxygenRealtime oxygenRealtime) {
        OxygenRealtime oxygenRealtime2 = oxygenRealtime;
        l.f(e0Var, "writer");
        if (oxygenRealtime2 != null) {
            e0Var.b();
            e0Var.s(CrashHianalyticsData.TIME);
            this.f9588b.f(e0Var, oxygenRealtime2.f9585a);
            e0Var.s("avg");
            this.f9589c.f(e0Var, Integer.valueOf(oxygenRealtime2.f9586b));
            e0Var.k();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }

    public final String toString() {
        return "GeneratedJsonAdapter(OxygenRealtime)";
    }
}
