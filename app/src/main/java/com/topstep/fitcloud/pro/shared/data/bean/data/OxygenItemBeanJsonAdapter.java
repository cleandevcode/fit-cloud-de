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
public final class OxygenItemBeanJsonAdapter extends t<OxygenItemBean> {

    /* renamed from: a */
    public final y.a f9958a;

    /* renamed from: b */
    public final t<Date> f9959b;

    /* renamed from: c */
    public final t<Integer> f9960c;

    public OxygenItemBeanJsonAdapter(h0 h0Var) {
        l.f(h0Var, "moshi");
        this.f9958a = y.a.a(CrashHianalyticsData.TIME, "oxygen");
        this.f9959b = h0Var.c(Date.class, z0.o(new TimeField() { // from class: com.topstep.fitcloud.pro.shared.data.bean.data.OxygenItemBeanJsonAdapter.a
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
        this.f9960c = h0Var.c(Integer.TYPE, u.f28881a, "oxygen");
    }

    @Override // mf.t
    public final OxygenItemBean b(y yVar) {
        l.f(yVar, "reader");
        yVar.b();
        Date date = null;
        Integer num = null;
        while (yVar.q()) {
            int L = yVar.L(this.f9958a);
            if (L == -1) {
                yVar.R();
                yVar.W();
            } else if (L == 0) {
                date = this.f9959b.b(yVar);
                if (date == null) {
                    throw b.m(CrashHianalyticsData.TIME, CrashHianalyticsData.TIME, yVar);
                }
            } else if (L == 1 && (num = this.f9960c.b(yVar)) == null) {
                throw b.m("oxygen", "oxygen", yVar);
            }
        }
        yVar.j();
        if (date != null) {
            if (num != null) {
                return new OxygenItemBean(num.intValue(), date);
            }
            throw b.g("oxygen", "oxygen", yVar);
        }
        throw b.g(CrashHianalyticsData.TIME, CrashHianalyticsData.TIME, yVar);
    }

    @Override // mf.t
    public final void f(e0 e0Var, OxygenItemBean oxygenItemBean) {
        OxygenItemBean oxygenItemBean2 = oxygenItemBean;
        l.f(e0Var, "writer");
        if (oxygenItemBean2 != null) {
            e0Var.b();
            e0Var.s(CrashHianalyticsData.TIME);
            this.f9959b.f(e0Var, oxygenItemBean2.f9956a);
            e0Var.s("oxygen");
            this.f9960c.f(e0Var, Integer.valueOf(oxygenItemBean2.f9957b));
            e0Var.k();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }

    public final String toString() {
        return "GeneratedJsonAdapter(OxygenItemBean)";
    }
}
