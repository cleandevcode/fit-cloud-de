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
public final class OxygenRecordBeanJsonAdapter extends t<OxygenRecordBean> {

    /* renamed from: a */
    public final y.a f9965a;

    /* renamed from: b */
    public final t<Date> f9966b;

    /* renamed from: c */
    public final t<Integer> f9967c;

    /* renamed from: d */
    public final t<Long> f9968d;

    /* renamed from: e */
    public final t<List<OxygenItemBean>> f9969e;

    /* renamed from: f */
    public volatile Constructor<OxygenRecordBean> f9970f;

    public OxygenRecordBeanJsonAdapter(h0 h0Var) {
        l.f(h0Var, "moshi");
        this.f9965a = y.a.a("date", "avgOxygen", "lastModifyTime", "detail");
        this.f9966b = h0Var.c(Date.class, z0.o(new DateField() { // from class: com.topstep.fitcloud.pro.shared.data.bean.data.OxygenRecordBeanJsonAdapter.a
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
        this.f9967c = h0Var.c(cls, uVar, "avgOxygen");
        this.f9968d = h0Var.c(Long.TYPE, uVar, "lastModifyTime");
        this.f9969e = h0Var.c(l0.d(List.class, OxygenItemBean.class), uVar, "detail");
    }

    @Override // mf.t
    public final OxygenRecordBean b(y yVar) {
        l.f(yVar, "reader");
        yVar.b();
        int i10 = -1;
        Integer num = null;
        Date date = null;
        Long l10 = null;
        List<OxygenItemBean> list = null;
        while (yVar.q()) {
            int L = yVar.L(this.f9965a);
            if (L == -1) {
                yVar.R();
                yVar.W();
            } else if (L == 0) {
                date = this.f9966b.b(yVar);
                if (date == null) {
                    throw b.m("date", "date", yVar);
                }
            } else if (L == 1) {
                num = this.f9967c.b(yVar);
                if (num == null) {
                    throw b.m("avgOxygen", "avgOxygen", yVar);
                }
            } else if (L == 2) {
                l10 = this.f9968d.b(yVar);
                if (l10 == null) {
                    throw b.m("lastModifyTime", "lastModifyTime", yVar);
                }
            } else if (L == 3) {
                list = this.f9969e.b(yVar);
                i10 &= -9;
            }
        }
        yVar.j();
        if (i10 == -9) {
            if (date != null) {
                if (num != null) {
                    int intValue = num.intValue();
                    if (l10 != null) {
                        return new OxygenRecordBean(date, intValue, l10.longValue(), list);
                    }
                    throw b.g("lastModifyTime", "lastModifyTime", yVar);
                }
                throw b.g("avgOxygen", "avgOxygen", yVar);
            }
            throw b.g("date", "date", yVar);
        }
        Constructor<OxygenRecordBean> constructor = this.f9970f;
        if (constructor == null) {
            Class cls = Integer.TYPE;
            constructor = OxygenRecordBean.class.getDeclaredConstructor(Date.class, cls, Long.TYPE, List.class, cls, b.f22341c);
            this.f9970f = constructor;
            l.e(constructor, "OxygenRecordBean::class.…his.constructorRef = it }");
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
                    OxygenRecordBean newInstance = constructor.newInstance(objArr);
                    l.e(newInstance, "localConstructor.newInst…torMarker */ null\n      )");
                    return newInstance;
                }
                throw b.g("lastModifyTime", "lastModifyTime", yVar);
            }
            throw b.g("avgOxygen", "avgOxygen", yVar);
        }
        throw b.g("date", "date", yVar);
    }

    @Override // mf.t
    public final void f(e0 e0Var, OxygenRecordBean oxygenRecordBean) {
        OxygenRecordBean oxygenRecordBean2 = oxygenRecordBean;
        l.f(e0Var, "writer");
        if (oxygenRecordBean2 != null) {
            e0Var.b();
            e0Var.s("date");
            this.f9966b.f(e0Var, oxygenRecordBean2.f9961a);
            e0Var.s("avgOxygen");
            fb.b.b(oxygenRecordBean2.f9962b, this.f9967c, e0Var, "lastModifyTime");
            this.f9968d.f(e0Var, Long.valueOf(oxygenRecordBean2.f9963c));
            e0Var.s("detail");
            this.f9969e.f(e0Var, oxygenRecordBean2.f9964d);
            e0Var.k();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }

    public final String toString() {
        return "GeneratedJsonAdapter(OxygenRecordBean)";
    }
}
