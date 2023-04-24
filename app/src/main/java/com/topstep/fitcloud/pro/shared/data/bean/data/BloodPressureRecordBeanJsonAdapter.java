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
public final class BloodPressureRecordBeanJsonAdapter extends t<BloodPressureRecordBean> {

    /* renamed from: a */
    public final y.a f9897a;

    /* renamed from: b */
    public final t<Date> f9898b;

    /* renamed from: c */
    public final t<Integer> f9899c;

    /* renamed from: d */
    public final t<Long> f9900d;

    /* renamed from: e */
    public final t<List<BloodPressureItemBean>> f9901e;

    /* renamed from: f */
    public volatile Constructor<BloodPressureRecordBean> f9902f;

    public BloodPressureRecordBeanJsonAdapter(h0 h0Var) {
        l.f(h0Var, "moshi");
        this.f9897a = y.a.a("date", "avgSbp", "avgDbp", "lastModifyTime", "detail");
        this.f9898b = h0Var.c(Date.class, z0.o(new DateField() { // from class: com.topstep.fitcloud.pro.shared.data.bean.data.BloodPressureRecordBeanJsonAdapter.a
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
        this.f9899c = h0Var.c(cls, uVar, "avgSbp");
        this.f9900d = h0Var.c(Long.TYPE, uVar, "lastModifyTime");
        this.f9901e = h0Var.c(l0.d(List.class, BloodPressureItemBean.class), uVar, "detail");
    }

    @Override // mf.t
    public final BloodPressureRecordBean b(y yVar) {
        l.f(yVar, "reader");
        yVar.b();
        int i10 = -1;
        Integer num = null;
        Date date = null;
        Integer num2 = null;
        Long l10 = null;
        List<BloodPressureItemBean> list = null;
        while (yVar.q()) {
            int L = yVar.L(this.f9897a);
            if (L == -1) {
                yVar.R();
                yVar.W();
            } else if (L == 0) {
                date = this.f9898b.b(yVar);
                if (date == null) {
                    throw b.m("date", "date", yVar);
                }
            } else if (L == 1) {
                num = this.f9899c.b(yVar);
                if (num == null) {
                    throw b.m("avgSbp", "avgSbp", yVar);
                }
            } else if (L == 2) {
                num2 = this.f9899c.b(yVar);
                if (num2 == null) {
                    throw b.m("avgDbp", "avgDbp", yVar);
                }
            } else if (L == 3) {
                l10 = this.f9900d.b(yVar);
                if (l10 == null) {
                    throw b.m("lastModifyTime", "lastModifyTime", yVar);
                }
            } else if (L == 4) {
                list = this.f9901e.b(yVar);
                i10 &= -17;
            }
        }
        yVar.j();
        if (i10 == -17) {
            if (date != null) {
                if (num != null) {
                    int intValue = num.intValue();
                    if (num2 != null) {
                        int intValue2 = num2.intValue();
                        if (l10 != null) {
                            return new BloodPressureRecordBean(date, intValue, intValue2, l10.longValue(), list);
                        }
                        throw b.g("lastModifyTime", "lastModifyTime", yVar);
                    }
                    throw b.g("avgDbp", "avgDbp", yVar);
                }
                throw b.g("avgSbp", "avgSbp", yVar);
            }
            throw b.g("date", "date", yVar);
        }
        Constructor<BloodPressureRecordBean> constructor = this.f9902f;
        if (constructor == null) {
            Class cls = Integer.TYPE;
            constructor = BloodPressureRecordBean.class.getDeclaredConstructor(Date.class, cls, cls, Long.TYPE, List.class, cls, b.f22341c);
            this.f9902f = constructor;
            l.e(constructor, "BloodPressureRecordBean:…his.constructorRef = it }");
        }
        Object[] objArr = new Object[7];
        if (date != null) {
            objArr[0] = date;
            if (num != null) {
                objArr[1] = Integer.valueOf(num.intValue());
                if (num2 != null) {
                    objArr[2] = Integer.valueOf(num2.intValue());
                    if (l10 != null) {
                        objArr[3] = Long.valueOf(l10.longValue());
                        objArr[4] = list;
                        objArr[5] = Integer.valueOf(i10);
                        objArr[6] = null;
                        BloodPressureRecordBean newInstance = constructor.newInstance(objArr);
                        l.e(newInstance, "localConstructor.newInst…torMarker */ null\n      )");
                        return newInstance;
                    }
                    throw b.g("lastModifyTime", "lastModifyTime", yVar);
                }
                throw b.g("avgDbp", "avgDbp", yVar);
            }
            throw b.g("avgSbp", "avgSbp", yVar);
        }
        throw b.g("date", "date", yVar);
    }

    @Override // mf.t
    public final void f(e0 e0Var, BloodPressureRecordBean bloodPressureRecordBean) {
        BloodPressureRecordBean bloodPressureRecordBean2 = bloodPressureRecordBean;
        l.f(e0Var, "writer");
        if (bloodPressureRecordBean2 != null) {
            e0Var.b();
            e0Var.s("date");
            this.f9898b.f(e0Var, bloodPressureRecordBean2.f9892a);
            e0Var.s("avgSbp");
            fb.b.b(bloodPressureRecordBean2.f9893b, this.f9899c, e0Var, "avgDbp");
            fb.b.b(bloodPressureRecordBean2.f9894c, this.f9899c, e0Var, "lastModifyTime");
            this.f9900d.f(e0Var, Long.valueOf(bloodPressureRecordBean2.f9895d));
            e0Var.s("detail");
            this.f9901e.f(e0Var, bloodPressureRecordBean2.f9896e);
            e0Var.k();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }

    public final String toString() {
        return "GeneratedJsonAdapter(BloodPressureRecordBean)";
    }
}
