package com.topstep.fitcloud.pro.model.data;

import bi.z0;
import com.huawei.hms.framework.common.hianalytics.CrashHianalyticsData;
import com.topstep.fitcloud.pro.model.utils.moshi.TimeField;
import gm.l;
import java.lang.reflect.Constructor;
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
public final class BloodPressureRealtimeJsonAdapter extends t<BloodPressureRealtime> {

    /* renamed from: a */
    public final y.a f9573a;

    /* renamed from: b */
    public final t<Date> f9574b;

    /* renamed from: c */
    public final t<Integer> f9575c;

    /* renamed from: d */
    public final t<Boolean> f9576d;

    /* renamed from: e */
    public volatile Constructor<BloodPressureRealtime> f9577e;

    public BloodPressureRealtimeJsonAdapter(h0 h0Var) {
        l.f(h0Var, "moshi");
        this.f9573a = y.a.a(CrashHianalyticsData.TIME, "avgSbp", "avgDbp", "privateModel");
        this.f9574b = h0Var.c(Date.class, z0.o(new TimeField() { // from class: com.topstep.fitcloud.pro.model.data.BloodPressureRealtimeJsonAdapter.a
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
        this.f9575c = h0Var.c(cls, uVar, "avgSbp");
        this.f9576d = h0Var.c(Boolean.TYPE, uVar, "privateModel");
    }

    @Override // mf.t
    public final BloodPressureRealtime b(y yVar) {
        l.f(yVar, "reader");
        Boolean bool = Boolean.FALSE;
        yVar.b();
        int i10 = -1;
        Date date = null;
        Integer num = null;
        Integer num2 = null;
        while (yVar.q()) {
            int L = yVar.L(this.f9573a);
            if (L == -1) {
                yVar.R();
                yVar.W();
            } else if (L == 0) {
                date = this.f9574b.b(yVar);
                if (date == null) {
                    throw b.m(CrashHianalyticsData.TIME, CrashHianalyticsData.TIME, yVar);
                }
            } else if (L == 1) {
                num = this.f9575c.b(yVar);
                if (num == null) {
                    throw b.m("avgSbp", "avgSbp", yVar);
                }
            } else if (L == 2) {
                num2 = this.f9575c.b(yVar);
                if (num2 == null) {
                    throw b.m("avgDbp", "avgDbp", yVar);
                }
            } else if (L == 3) {
                bool = this.f9576d.b(yVar);
                if (bool == null) {
                    throw b.m("privateModel", "privateModel", yVar);
                }
                i10 &= -9;
            } else {
                continue;
            }
        }
        yVar.j();
        if (i10 == -9) {
            if (date != null) {
                if (num != null) {
                    int intValue = num.intValue();
                    if (num2 != null) {
                        return new BloodPressureRealtime(date, intValue, num2.intValue(), bool.booleanValue());
                    }
                    throw b.g("avgDbp", "avgDbp", yVar);
                }
                throw b.g("avgSbp", "avgSbp", yVar);
            }
            throw b.g(CrashHianalyticsData.TIME, CrashHianalyticsData.TIME, yVar);
        }
        Constructor<BloodPressureRealtime> constructor = this.f9577e;
        if (constructor == null) {
            Class cls = Integer.TYPE;
            constructor = BloodPressureRealtime.class.getDeclaredConstructor(Date.class, cls, cls, Boolean.TYPE, cls, b.f22341c);
            this.f9577e = constructor;
            l.e(constructor, "BloodPressureRealtime::c…his.constructorRef = it }");
        }
        Object[] objArr = new Object[6];
        if (date != null) {
            objArr[0] = date;
            if (num != null) {
                objArr[1] = Integer.valueOf(num.intValue());
                if (num2 != null) {
                    objArr[2] = Integer.valueOf(num2.intValue());
                    objArr[3] = bool;
                    objArr[4] = Integer.valueOf(i10);
                    objArr[5] = null;
                    BloodPressureRealtime newInstance = constructor.newInstance(objArr);
                    l.e(newInstance, "localConstructor.newInst…torMarker */ null\n      )");
                    return newInstance;
                }
                throw b.g("avgDbp", "avgDbp", yVar);
            }
            throw b.g("avgSbp", "avgSbp", yVar);
        }
        throw b.g(CrashHianalyticsData.TIME, CrashHianalyticsData.TIME, yVar);
    }

    @Override // mf.t
    public final void f(e0 e0Var, BloodPressureRealtime bloodPressureRealtime) {
        BloodPressureRealtime bloodPressureRealtime2 = bloodPressureRealtime;
        l.f(e0Var, "writer");
        if (bloodPressureRealtime2 != null) {
            e0Var.b();
            e0Var.s(CrashHianalyticsData.TIME);
            this.f9574b.f(e0Var, bloodPressureRealtime2.f9569a);
            e0Var.s("avgSbp");
            fb.b.b(bloodPressureRealtime2.f9570b, this.f9575c, e0Var, "avgDbp");
            fb.b.b(bloodPressureRealtime2.f9571c, this.f9575c, e0Var, "privateModel");
            this.f9576d.f(e0Var, Boolean.valueOf(bloodPressureRealtime2.f9572d));
            e0Var.k();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }

    public final String toString() {
        return "GeneratedJsonAdapter(BloodPressureRealtime)";
    }
}
