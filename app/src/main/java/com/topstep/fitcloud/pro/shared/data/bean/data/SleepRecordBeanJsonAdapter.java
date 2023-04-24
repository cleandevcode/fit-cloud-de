package com.topstep.fitcloud.pro.shared.data.bean.data;

import bi.z0;
import com.huawei.hms.framework.common.hianalytics.CrashHianalyticsData;
import com.topstep.fitcloud.pro.model.data.SleepItem;
import com.topstep.fitcloud.pro.model.utils.moshi.TimeField;
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
public final class SleepRecordBeanJsonAdapter extends t<SleepRecordBean> {

    /* renamed from: a */
    public final y.a f9992a;

    /* renamed from: b */
    public final t<Date> f9993b;

    /* renamed from: c */
    public final t<Integer> f9994c;

    /* renamed from: d */
    public final t<Long> f9995d;

    /* renamed from: e */
    public final t<List<SleepItem>> f9996e;

    /* renamed from: f */
    public volatile Constructor<SleepRecordBean> f9997f;

    public SleepRecordBeanJsonAdapter(h0 h0Var) {
        l.f(h0Var, "moshi");
        this.f9992a = y.a.a(CrashHianalyticsData.TIME, "deepSleep", "lightSleep", "soberSleep", "lastModifyTime", "detail");
        this.f9993b = h0Var.c(Date.class, z0.o(new TimeField() { // from class: com.topstep.fitcloud.pro.shared.data.bean.data.SleepRecordBeanJsonAdapter.a
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
        Class cls = Integer.TYPE;
        u uVar = u.f28881a;
        this.f9994c = h0Var.c(cls, uVar, "deepSleep");
        this.f9995d = h0Var.c(Long.TYPE, uVar, "lastModifyTime");
        this.f9996e = h0Var.c(l0.d(List.class, SleepItem.class), uVar, "detail");
    }

    @Override // mf.t
    public final SleepRecordBean b(y yVar) {
        String str;
        l.f(yVar, "reader");
        yVar.b();
        int i10 = -1;
        Integer num = null;
        Date date = null;
        Integer num2 = null;
        Integer num3 = null;
        Long l10 = null;
        List<SleepItem> list = null;
        while (yVar.q()) {
            switch (yVar.L(this.f9992a)) {
                case -1:
                    yVar.R();
                    yVar.W();
                    break;
                case 0:
                    date = this.f9993b.b(yVar);
                    if (date != null) {
                        break;
                    } else {
                        throw b.m(CrashHianalyticsData.TIME, CrashHianalyticsData.TIME, yVar);
                    }
                case 1:
                    num = this.f9994c.b(yVar);
                    if (num != null) {
                        break;
                    } else {
                        throw b.m("deepSleep", "deepSleep", yVar);
                    }
                case 2:
                    num2 = this.f9994c.b(yVar);
                    if (num2 != null) {
                        break;
                    } else {
                        throw b.m("lightSleep", "lightSleep", yVar);
                    }
                case 3:
                    num3 = this.f9994c.b(yVar);
                    if (num3 != null) {
                        break;
                    } else {
                        throw b.m("soberSleep", "soberSleep", yVar);
                    }
                case 4:
                    l10 = this.f9995d.b(yVar);
                    if (l10 != null) {
                        break;
                    } else {
                        throw b.m("lastModifyTime", "lastModifyTime", yVar);
                    }
                case 5:
                    list = this.f9996e.b(yVar);
                    i10 &= -33;
                    break;
            }
        }
        yVar.j();
        if (i10 == -33) {
            if (date != null) {
                if (num != null) {
                    int intValue = num.intValue();
                    if (num2 != null) {
                        int intValue2 = num2.intValue();
                        if (num3 != null) {
                            int intValue3 = num3.intValue();
                            if (l10 != null) {
                                return new SleepRecordBean(date, intValue, intValue2, intValue3, l10.longValue(), list);
                            }
                            throw b.g("lastModifyTime", "lastModifyTime", yVar);
                        }
                        throw b.g("soberSleep", "soberSleep", yVar);
                    }
                    throw b.g("lightSleep", "lightSleep", yVar);
                }
                throw b.g("deepSleep", "deepSleep", yVar);
            }
            throw b.g(CrashHianalyticsData.TIME, CrashHianalyticsData.TIME, yVar);
        }
        Constructor<SleepRecordBean> constructor = this.f9997f;
        if (constructor == null) {
            str = CrashHianalyticsData.TIME;
            Class cls = Integer.TYPE;
            constructor = SleepRecordBean.class.getDeclaredConstructor(Date.class, cls, cls, cls, Long.TYPE, List.class, cls, b.f22341c);
            this.f9997f = constructor;
            l.e(constructor, "SleepRecordBean::class.j…his.constructorRef = it }");
        } else {
            str = CrashHianalyticsData.TIME;
        }
        Object[] objArr = new Object[8];
        if (date == null) {
            String str2 = str;
            throw b.g(str2, str2, yVar);
        }
        objArr[0] = date;
        if (num != null) {
            objArr[1] = Integer.valueOf(num.intValue());
            if (num2 != null) {
                objArr[2] = Integer.valueOf(num2.intValue());
                if (num3 != null) {
                    objArr[3] = Integer.valueOf(num3.intValue());
                    if (l10 != null) {
                        objArr[4] = Long.valueOf(l10.longValue());
                        objArr[5] = list;
                        objArr[6] = Integer.valueOf(i10);
                        objArr[7] = null;
                        SleepRecordBean newInstance = constructor.newInstance(objArr);
                        l.e(newInstance, "localConstructor.newInst…torMarker */ null\n      )");
                        return newInstance;
                    }
                    throw b.g("lastModifyTime", "lastModifyTime", yVar);
                }
                throw b.g("soberSleep", "soberSleep", yVar);
            }
            throw b.g("lightSleep", "lightSleep", yVar);
        }
        throw b.g("deepSleep", "deepSleep", yVar);
    }

    @Override // mf.t
    public final void f(e0 e0Var, SleepRecordBean sleepRecordBean) {
        SleepRecordBean sleepRecordBean2 = sleepRecordBean;
        l.f(e0Var, "writer");
        if (sleepRecordBean2 != null) {
            e0Var.b();
            e0Var.s(CrashHianalyticsData.TIME);
            this.f9993b.f(e0Var, sleepRecordBean2.f9986a);
            e0Var.s("deepSleep");
            fb.b.b(sleepRecordBean2.f9987b, this.f9994c, e0Var, "lightSleep");
            fb.b.b(sleepRecordBean2.f9988c, this.f9994c, e0Var, "soberSleep");
            fb.b.b(sleepRecordBean2.f9989d, this.f9994c, e0Var, "lastModifyTime");
            this.f9995d.f(e0Var, Long.valueOf(sleepRecordBean2.f9990e));
            e0Var.s("detail");
            this.f9996e.f(e0Var, sleepRecordBean2.f9991f);
            e0Var.k();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }

    public final String toString() {
        return "GeneratedJsonAdapter(SleepRecordBean)";
    }
}
