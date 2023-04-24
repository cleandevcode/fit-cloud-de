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
public final class HeartRateRecordBeanJsonAdapter extends t<HeartRateRecordBean> {

    /* renamed from: a */
    public final y.a f9950a;

    /* renamed from: b */
    public final t<Date> f9951b;

    /* renamed from: c */
    public final t<Integer> f9952c;

    /* renamed from: d */
    public final t<Long> f9953d;

    /* renamed from: e */
    public final t<List<HeartRateItemBean>> f9954e;

    /* renamed from: f */
    public volatile Constructor<HeartRateRecordBean> f9955f;

    public HeartRateRecordBeanJsonAdapter(h0 h0Var) {
        l.f(h0Var, "moshi");
        this.f9950a = y.a.a("date", "avgHeartRate", "lastModifyTime", "detail");
        this.f9951b = h0Var.c(Date.class, z0.o(new DateField() { // from class: com.topstep.fitcloud.pro.shared.data.bean.data.HeartRateRecordBeanJsonAdapter.a
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
        this.f9952c = h0Var.c(cls, uVar, "avgHeartRate");
        this.f9953d = h0Var.c(Long.TYPE, uVar, "lastModifyTime");
        this.f9954e = h0Var.c(l0.d(List.class, HeartRateItemBean.class), uVar, "detail");
    }

    @Override // mf.t
    public final HeartRateRecordBean b(y yVar) {
        l.f(yVar, "reader");
        yVar.b();
        int i10 = -1;
        Integer num = null;
        Date date = null;
        Long l10 = null;
        List<HeartRateItemBean> list = null;
        while (yVar.q()) {
            int L = yVar.L(this.f9950a);
            if (L == -1) {
                yVar.R();
                yVar.W();
            } else if (L == 0) {
                date = this.f9951b.b(yVar);
                if (date == null) {
                    throw b.m("date", "date", yVar);
                }
            } else if (L == 1) {
                num = this.f9952c.b(yVar);
                if (num == null) {
                    throw b.m("avgHeartRate", "avgHeartRate", yVar);
                }
            } else if (L == 2) {
                l10 = this.f9953d.b(yVar);
                if (l10 == null) {
                    throw b.m("lastModifyTime", "lastModifyTime", yVar);
                }
            } else if (L == 3) {
                list = this.f9954e.b(yVar);
                i10 &= -9;
            }
        }
        yVar.j();
        if (i10 == -9) {
            if (date != null) {
                if (num != null) {
                    int intValue = num.intValue();
                    if (l10 != null) {
                        return new HeartRateRecordBean(date, intValue, l10.longValue(), list);
                    }
                    throw b.g("lastModifyTime", "lastModifyTime", yVar);
                }
                throw b.g("avgHeartRate", "avgHeartRate", yVar);
            }
            throw b.g("date", "date", yVar);
        }
        Constructor<HeartRateRecordBean> constructor = this.f9955f;
        if (constructor == null) {
            Class cls = Integer.TYPE;
            constructor = HeartRateRecordBean.class.getDeclaredConstructor(Date.class, cls, Long.TYPE, List.class, cls, b.f22341c);
            this.f9955f = constructor;
            l.e(constructor, "HeartRateRecordBean::cla…his.constructorRef = it }");
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
                    HeartRateRecordBean newInstance = constructor.newInstance(objArr);
                    l.e(newInstance, "localConstructor.newInst…torMarker */ null\n      )");
                    return newInstance;
                }
                throw b.g("lastModifyTime", "lastModifyTime", yVar);
            }
            throw b.g("avgHeartRate", "avgHeartRate", yVar);
        }
        throw b.g("date", "date", yVar);
    }

    @Override // mf.t
    public final void f(e0 e0Var, HeartRateRecordBean heartRateRecordBean) {
        HeartRateRecordBean heartRateRecordBean2 = heartRateRecordBean;
        l.f(e0Var, "writer");
        if (heartRateRecordBean2 != null) {
            e0Var.b();
            e0Var.s("date");
            this.f9951b.f(e0Var, heartRateRecordBean2.f9946a);
            e0Var.s("avgHeartRate");
            fb.b.b(heartRateRecordBean2.f9947b, this.f9952c, e0Var, "lastModifyTime");
            this.f9953d.f(e0Var, Long.valueOf(heartRateRecordBean2.f9948c));
            e0Var.s("detail");
            this.f9954e.f(e0Var, heartRateRecordBean2.f9949d);
            e0Var.k();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }

    public final String toString() {
        return "GeneratedJsonAdapter(HeartRateRecordBean)";
    }
}
