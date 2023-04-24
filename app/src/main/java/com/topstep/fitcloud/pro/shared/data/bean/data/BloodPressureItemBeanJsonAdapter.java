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
public final class BloodPressureItemBeanJsonAdapter extends t<BloodPressureItemBean> {

    /* renamed from: a */
    public final y.a f9889a;

    /* renamed from: b */
    public final t<Date> f9890b;

    /* renamed from: c */
    public final t<Integer> f9891c;

    public BloodPressureItemBeanJsonAdapter(h0 h0Var) {
        l.f(h0Var, "moshi");
        this.f9889a = y.a.a(CrashHianalyticsData.TIME, "sbp", "dbp");
        this.f9890b = h0Var.c(Date.class, z0.o(new TimeField() { // from class: com.topstep.fitcloud.pro.shared.data.bean.data.BloodPressureItemBeanJsonAdapter.a
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
        this.f9891c = h0Var.c(Integer.TYPE, u.f28881a, "sbp");
    }

    @Override // mf.t
    public final BloodPressureItemBean b(y yVar) {
        l.f(yVar, "reader");
        yVar.b();
        Date date = null;
        Integer num = null;
        Integer num2 = null;
        while (yVar.q()) {
            int L = yVar.L(this.f9889a);
            if (L == -1) {
                yVar.R();
                yVar.W();
            } else if (L == 0) {
                date = this.f9890b.b(yVar);
                if (date == null) {
                    throw b.m(CrashHianalyticsData.TIME, CrashHianalyticsData.TIME, yVar);
                }
            } else if (L == 1) {
                num = this.f9891c.b(yVar);
                if (num == null) {
                    throw b.m("sbp", "sbp", yVar);
                }
            } else if (L == 2 && (num2 = this.f9891c.b(yVar)) == null) {
                throw b.m("dbp", "dbp", yVar);
            }
        }
        yVar.j();
        if (date != null) {
            if (num != null) {
                int intValue = num.intValue();
                if (num2 != null) {
                    return new BloodPressureItemBean(intValue, num2.intValue(), date);
                }
                throw b.g("dbp", "dbp", yVar);
            }
            throw b.g("sbp", "sbp", yVar);
        }
        throw b.g(CrashHianalyticsData.TIME, CrashHianalyticsData.TIME, yVar);
    }

    @Override // mf.t
    public final void f(e0 e0Var, BloodPressureItemBean bloodPressureItemBean) {
        BloodPressureItemBean bloodPressureItemBean2 = bloodPressureItemBean;
        l.f(e0Var, "writer");
        if (bloodPressureItemBean2 != null) {
            e0Var.b();
            e0Var.s(CrashHianalyticsData.TIME);
            this.f9890b.f(e0Var, bloodPressureItemBean2.f9886a);
            e0Var.s("sbp");
            fb.b.b(bloodPressureItemBean2.f9887b, this.f9891c, e0Var, "dbp");
            this.f9891c.f(e0Var, Integer.valueOf(bloodPressureItemBean2.f9888c));
            e0Var.k();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }

    public final String toString() {
        return "GeneratedJsonAdapter(BloodPressureItemBean)";
    }
}
