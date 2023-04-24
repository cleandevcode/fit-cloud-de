package com.topstep.fitcloud.pro.shared.data.bean.data;

import bi.z0;
import com.topstep.fitcloud.pro.model.utils.moshi.DateField;
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
public final class StepRecordBeanJsonAdapter extends t<StepRecordBean> {

    /* renamed from: a */
    public final y.a f10004a;

    /* renamed from: b */
    public final t<Date> f10005b;

    /* renamed from: c */
    public final t<String> f10006c;

    /* renamed from: d */
    public final t<Integer> f10007d;

    /* renamed from: e */
    public final t<Float> f10008e;

    /* renamed from: f */
    public final t<Long> f10009f;

    public StepRecordBeanJsonAdapter(h0 h0Var) {
        l.f(h0Var, "moshi");
        this.f10004a = y.a.a("date", "device", "step", "distance", "calorie", "lastModifyTime");
        this.f10005b = h0Var.c(Date.class, z0.o(new DateField() { // from class: com.topstep.fitcloud.pro.shared.data.bean.data.StepRecordBeanJsonAdapter.a
            @Override // java.lang.annotation.Annotation
            public final /* synthetic */ Class annotationType() {
                return DateField.class;
            }

            @Override // java.lang.annotation.Annotation
            public final boolean equals(Object obj) {
                if (obj instanceof DateField) {
                    DateField dateField = (DateField) obj;
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
                return "@com.topstep.fitcloud.pro.model.utils.moshi.DateField()";
            }
        }), "date");
        u uVar = u.f28881a;
        this.f10006c = h0Var.c(String.class, uVar, "device");
        this.f10007d = h0Var.c(Integer.TYPE, uVar, "step");
        this.f10008e = h0Var.c(Float.TYPE, uVar, "distance");
        this.f10009f = h0Var.c(Long.TYPE, uVar, "lastModifyTime");
    }

    @Override // mf.t
    public final StepRecordBean b(y yVar) {
        l.f(yVar, "reader");
        yVar.b();
        Integer num = null;
        Float f10 = null;
        Date date = null;
        Float f11 = null;
        Long l10 = null;
        String str = null;
        while (yVar.q()) {
            switch (yVar.L(this.f10004a)) {
                case -1:
                    yVar.R();
                    yVar.W();
                    break;
                case 0:
                    date = this.f10005b.b(yVar);
                    if (date != null) {
                        break;
                    } else {
                        throw b.m("date", "date", yVar);
                    }
                case 1:
                    str = this.f10006c.b(yVar);
                    break;
                case 2:
                    num = this.f10007d.b(yVar);
                    if (num != null) {
                        break;
                    } else {
                        throw b.m("step", "step", yVar);
                    }
                case 3:
                    f10 = this.f10008e.b(yVar);
                    if (f10 != null) {
                        break;
                    } else {
                        throw b.m("distance", "distance", yVar);
                    }
                case 4:
                    f11 = this.f10008e.b(yVar);
                    if (f11 != null) {
                        break;
                    } else {
                        throw b.m("calorie", "calorie", yVar);
                    }
                case 5:
                    l10 = this.f10009f.b(yVar);
                    if (l10 != null) {
                        break;
                    } else {
                        throw b.m("lastModifyTime", "lastModifyTime", yVar);
                    }
            }
        }
        yVar.j();
        if (date != null) {
            if (num != null) {
                int intValue = num.intValue();
                if (f10 != null) {
                    float floatValue = f10.floatValue();
                    if (f11 != null) {
                        float floatValue2 = f11.floatValue();
                        if (l10 != null) {
                            return new StepRecordBean(date, str, intValue, floatValue, floatValue2, l10.longValue());
                        }
                        throw b.g("lastModifyTime", "lastModifyTime", yVar);
                    }
                    throw b.g("calorie", "calorie", yVar);
                }
                throw b.g("distance", "distance", yVar);
            }
            throw b.g("step", "step", yVar);
        }
        throw b.g("date", "date", yVar);
    }

    @Override // mf.t
    public final void f(e0 e0Var, StepRecordBean stepRecordBean) {
        StepRecordBean stepRecordBean2 = stepRecordBean;
        l.f(e0Var, "writer");
        if (stepRecordBean2 != null) {
            e0Var.b();
            e0Var.s("date");
            this.f10005b.f(e0Var, stepRecordBean2.f9998a);
            e0Var.s("device");
            this.f10006c.f(e0Var, stepRecordBean2.f9999b);
            e0Var.s("step");
            fb.b.b(stepRecordBean2.f10000c, this.f10007d, e0Var, "distance");
            this.f10008e.f(e0Var, Float.valueOf(stepRecordBean2.f10001d));
            e0Var.s("calorie");
            this.f10008e.f(e0Var, Float.valueOf(stepRecordBean2.f10002e));
            e0Var.s("lastModifyTime");
            this.f10009f.f(e0Var, Long.valueOf(stepRecordBean2.f10003f));
            e0Var.k();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }

    public final String toString() {
        return "GeneratedJsonAdapter(StepRecordBean)";
    }
}
