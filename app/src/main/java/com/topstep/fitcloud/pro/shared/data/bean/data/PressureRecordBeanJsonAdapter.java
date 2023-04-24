package com.topstep.fitcloud.pro.shared.data.bean.data;

import bi.z0;
import com.topstep.fitcloud.pro.model.utils.moshi.DateField;
import gm.l;
import java.lang.reflect.Constructor;
import java.util.Date;
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
public final class PressureRecordBeanJsonAdapter extends t<PressureRecordBean> {

    /* renamed from: a */
    public final y.a f9980a;

    /* renamed from: b */
    public final t<Date> f9981b;

    /* renamed from: c */
    public final t<Integer> f9982c;

    /* renamed from: d */
    public final t<Long> f9983d;

    /* renamed from: e */
    public final t<List<PressureItemBean>> f9984e;

    /* renamed from: f */
    public volatile Constructor<PressureRecordBean> f9985f;

    public PressureRecordBeanJsonAdapter(h0 h0Var) {
        l.f(h0Var, "moshi");
        this.f9980a = y.a.a("date", "avgPressure", "lastModifyTime", "detail");
        this.f9981b = h0Var.c(Date.class, z0.o(new DateField() { // from class: com.topstep.fitcloud.pro.shared.data.bean.data.PressureRecordBeanJsonAdapter.a
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
        Class cls = Integer.TYPE;
        u uVar = u.f28881a;
        this.f9982c = h0Var.c(cls, uVar, "avgPressure");
        this.f9983d = h0Var.c(Long.TYPE, uVar, "lastModifyTime");
        this.f9984e = h0Var.c(l0.d(List.class, PressureItemBean.class), uVar, "detail");
    }

    @Override // mf.t
    public final PressureRecordBean b(y yVar) {
        l.f(yVar, "reader");
        yVar.b();
        int i10 = -1;
        Integer num = null;
        Date date = null;
        Long l10 = null;
        List<PressureItemBean> list = null;
        while (yVar.q()) {
            int L = yVar.L(this.f9980a);
            if (L == -1) {
                yVar.R();
                yVar.W();
            } else if (L == 0) {
                date = this.f9981b.b(yVar);
                if (date == null) {
                    throw b.m("date", "date", yVar);
                }
            } else if (L == 1) {
                num = this.f9982c.b(yVar);
                if (num == null) {
                    throw b.m("avgPressure", "avgPressure", yVar);
                }
            } else if (L == 2) {
                l10 = this.f9983d.b(yVar);
                if (l10 == null) {
                    throw b.m("lastModifyTime", "lastModifyTime", yVar);
                }
            } else if (L == 3) {
                list = this.f9984e.b(yVar);
                i10 &= -9;
            }
        }
        yVar.j();
        if (i10 == -9) {
            if (date != null) {
                if (num != null) {
                    int intValue = num.intValue();
                    if (l10 != null) {
                        return new PressureRecordBean(date, intValue, l10.longValue(), list);
                    }
                    throw b.g("lastModifyTime", "lastModifyTime", yVar);
                }
                throw b.g("avgPressure", "avgPressure", yVar);
            }
            throw b.g("date", "date", yVar);
        }
        Constructor<PressureRecordBean> constructor = this.f9985f;
        if (constructor == null) {
            Class cls = Integer.TYPE;
            constructor = PressureRecordBean.class.getDeclaredConstructor(Date.class, cls, Long.TYPE, List.class, cls, b.f22341c);
            this.f9985f = constructor;
            l.e(constructor, "PressureRecordBean::clas…his.constructorRef = it }");
        }
        Object[] objArr = new Object[6];
        if (date != null) {
            objArr[0] = date;
            if (num != null) {
                objArr[1] = Integer.valueOf(num.intValue());
                if (l10 != null) {
                    objArr[2] = Long.valueOf(l10.longValue());
                    objArr[3] = list;
                    objArr[4] = Integer.valueOf(i10);
                    objArr[5] = null;
                    PressureRecordBean newInstance = constructor.newInstance(objArr);
                    l.e(newInstance, "localConstructor.newInst…torMarker */ null\n      )");
                    return newInstance;
                }
                throw b.g("lastModifyTime", "lastModifyTime", yVar);
            }
            throw b.g("avgPressure", "avgPressure", yVar);
        }
        throw b.g("date", "date", yVar);
    }

    @Override // mf.t
    public final void f(e0 e0Var, PressureRecordBean pressureRecordBean) {
        PressureRecordBean pressureRecordBean2 = pressureRecordBean;
        l.f(e0Var, "writer");
        if (pressureRecordBean2 != null) {
            e0Var.b();
            e0Var.s("date");
            this.f9981b.f(e0Var, pressureRecordBean2.f9976a);
            e0Var.s("avgPressure");
            fb.b.b(pressureRecordBean2.f9977b, this.f9982c, e0Var, "lastModifyTime");
            this.f9983d.f(e0Var, Long.valueOf(pressureRecordBean2.f9978c));
            e0Var.s("detail");
            this.f9984e.f(e0Var, pressureRecordBean2.f9979d);
            e0Var.k();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }

    public final String toString() {
        return "GeneratedJsonAdapter(PressureRecordBean)";
    }
}
