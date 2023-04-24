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
public final class TemperatureRecordBeanJsonAdapter extends t<TemperatureRecordBean> {

    /* renamed from: a */
    public final y.a f10021a;

    /* renamed from: b */
    public final t<Date> f10022b;

    /* renamed from: c */
    public final t<Float> f10023c;

    /* renamed from: d */
    public final t<Long> f10024d;

    /* renamed from: e */
    public final t<List<TemperatureItemBean>> f10025e;

    /* renamed from: f */
    public volatile Constructor<TemperatureRecordBean> f10026f;

    public TemperatureRecordBeanJsonAdapter(h0 h0Var) {
        l.f(h0Var, "moshi");
        this.f10021a = y.a.a("date", "avgBody", "avgWrist", "lastModifyTime", "detail");
        this.f10022b = h0Var.c(Date.class, z0.o(new DateField() { // from class: com.topstep.fitcloud.pro.shared.data.bean.data.TemperatureRecordBeanJsonAdapter.a
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
        Class cls = Float.TYPE;
        u uVar = u.f28881a;
        this.f10023c = h0Var.c(cls, uVar, "avgBody");
        this.f10024d = h0Var.c(Long.TYPE, uVar, "lastModifyTime");
        this.f10025e = h0Var.c(l0.d(List.class, TemperatureItemBean.class), uVar, "detail");
    }

    @Override // mf.t
    public final TemperatureRecordBean b(y yVar) {
        l.f(yVar, "reader");
        yVar.b();
        int i10 = -1;
        Float f10 = null;
        Date date = null;
        Float f11 = null;
        Long l10 = null;
        List<TemperatureItemBean> list = null;
        while (yVar.q()) {
            int L = yVar.L(this.f10021a);
            if (L == -1) {
                yVar.R();
                yVar.W();
            } else if (L == 0) {
                date = this.f10022b.b(yVar);
                if (date == null) {
                    throw b.m("date", "date", yVar);
                }
            } else if (L == 1) {
                f10 = this.f10023c.b(yVar);
                if (f10 == null) {
                    throw b.m("avgBody", "avgBody", yVar);
                }
            } else if (L == 2) {
                f11 = this.f10023c.b(yVar);
                if (f11 == null) {
                    throw b.m("avgWrist", "avgWrist", yVar);
                }
            } else if (L == 3) {
                l10 = this.f10024d.b(yVar);
                if (l10 == null) {
                    throw b.m("lastModifyTime", "lastModifyTime", yVar);
                }
            } else if (L == 4) {
                list = this.f10025e.b(yVar);
                i10 &= -17;
            }
        }
        yVar.j();
        if (i10 == -17) {
            if (date != null) {
                if (f10 != null) {
                    float floatValue = f10.floatValue();
                    if (f11 != null) {
                        float floatValue2 = f11.floatValue();
                        if (l10 != null) {
                            return new TemperatureRecordBean(date, floatValue, floatValue2, l10.longValue(), list);
                        }
                        throw b.g("lastModifyTime", "lastModifyTime", yVar);
                    }
                    throw b.g("avgWrist", "avgWrist", yVar);
                }
                throw b.g("avgBody", "avgBody", yVar);
            }
            throw b.g("date", "date", yVar);
        }
        Constructor<TemperatureRecordBean> constructor = this.f10026f;
        if (constructor == null) {
            Class cls = Float.TYPE;
            constructor = TemperatureRecordBean.class.getDeclaredConstructor(Date.class, cls, cls, Long.TYPE, List.class, Integer.TYPE, b.f22341c);
            this.f10026f = constructor;
            l.e(constructor, "TemperatureRecordBean::c…his.constructorRef = it }");
        }
        Object[] objArr = new Object[7];
        if (date != null) {
            objArr[0] = date;
            if (f10 != null) {
                objArr[1] = Float.valueOf(f10.floatValue());
                if (f11 != null) {
                    objArr[2] = Float.valueOf(f11.floatValue());
                    if (l10 != null) {
                        objArr[3] = Long.valueOf(l10.longValue());
                        objArr[4] = list;
                        objArr[5] = Integer.valueOf(i10);
                        objArr[6] = null;
                        TemperatureRecordBean newInstance = constructor.newInstance(objArr);
                        l.e(newInstance, "localConstructor.newInst…torMarker */ null\n      )");
                        return newInstance;
                    }
                    throw b.g("lastModifyTime", "lastModifyTime", yVar);
                }
                throw b.g("avgWrist", "avgWrist", yVar);
            }
            throw b.g("avgBody", "avgBody", yVar);
        }
        throw b.g("date", "date", yVar);
    }

    @Override // mf.t
    public final void f(e0 e0Var, TemperatureRecordBean temperatureRecordBean) {
        TemperatureRecordBean temperatureRecordBean2 = temperatureRecordBean;
        l.f(e0Var, "writer");
        if (temperatureRecordBean2 != null) {
            e0Var.b();
            e0Var.s("date");
            this.f10022b.f(e0Var, temperatureRecordBean2.f10016a);
            e0Var.s("avgBody");
            this.f10023c.f(e0Var, Float.valueOf(temperatureRecordBean2.f10017b));
            e0Var.s("avgWrist");
            this.f10023c.f(e0Var, Float.valueOf(temperatureRecordBean2.f10018c));
            e0Var.s("lastModifyTime");
            this.f10024d.f(e0Var, Long.valueOf(temperatureRecordBean2.f10019d));
            e0Var.s("detail");
            this.f10025e.f(e0Var, temperatureRecordBean2.f10020e);
            e0Var.k();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }

    public final String toString() {
        return "GeneratedJsonAdapter(TemperatureRecordBean)";
    }
}
