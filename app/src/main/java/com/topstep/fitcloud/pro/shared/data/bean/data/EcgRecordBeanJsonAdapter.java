package com.topstep.fitcloud.pro.shared.data.bean.data;

import bi.z0;
import com.huawei.hms.framework.common.hianalytics.CrashHianalyticsData;
import com.topstep.fitcloud.pro.model.data.EcgReport;
import com.topstep.fitcloud.pro.model.utils.moshi.TimeField;
import gm.l;
import java.lang.reflect.Constructor;
import java.util.Date;
import java.util.List;
import java.util.UUID;
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
public final class EcgRecordBeanJsonAdapter extends t<EcgRecordBean> {

    /* renamed from: a */
    public final y.a f9912a;

    /* renamed from: b */
    public final t<UUID> f9913b;

    /* renamed from: c */
    public final t<Date> f9914c;

    /* renamed from: d */
    public final t<Integer> f9915d;

    /* renamed from: e */
    public final t<Long> f9916e;

    /* renamed from: f */
    public final t<String> f9917f;

    /* renamed from: g */
    public final t<List<Integer>> f9918g;

    /* renamed from: h */
    public final t<List<EcgReport>> f9919h;

    /* renamed from: i */
    public volatile Constructor<EcgRecordBean> f9920i;

    public EcgRecordBeanJsonAdapter(h0 h0Var) {
        l.f(h0Var, "moshi");
        this.f9912a = y.a.a("ecgId", CrashHianalyticsData.TIME, "type", "sampleBase", "scaleValue", "lastModifyTime", "deviceAddress", "detail", "reports");
        u uVar = u.f28881a;
        this.f9913b = h0Var.c(UUID.class, uVar, "ecgId");
        this.f9914c = h0Var.c(Date.class, z0.o(new TimeField() { // from class: com.topstep.fitcloud.pro.shared.data.bean.data.EcgRecordBeanJsonAdapter.a
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
        this.f9915d = h0Var.c(Integer.TYPE, uVar, "type");
        this.f9916e = h0Var.c(Long.TYPE, uVar, "lastModifyTime");
        this.f9917f = h0Var.c(String.class, uVar, "deviceAddress");
        this.f9918g = h0Var.c(l0.d(List.class, Integer.class), uVar, "detail");
        this.f9919h = h0Var.c(l0.d(List.class, EcgReport.class), uVar, "reports");
    }

    @Override // mf.t
    public final EcgRecordBean b(y yVar) {
        String str;
        l.f(yVar, "reader");
        yVar.b();
        int i10 = -1;
        Integer num = null;
        UUID uuid = null;
        Date date = null;
        Integer num2 = null;
        Integer num3 = null;
        Long l10 = null;
        String str2 = null;
        List<Integer> list = null;
        List<EcgReport> list2 = null;
        while (true) {
            List<EcgReport> list3 = list2;
            List<Integer> list4 = list;
            String str3 = str2;
            if (!yVar.q()) {
                yVar.j();
                if (i10 == -449) {
                    if (uuid != null) {
                        if (date != null) {
                            if (num != null) {
                                int intValue = num.intValue();
                                if (num2 != null) {
                                    int intValue2 = num2.intValue();
                                    if (num3 != null) {
                                        int intValue3 = num3.intValue();
                                        if (l10 != null) {
                                            return new EcgRecordBean(uuid, date, intValue, intValue2, intValue3, l10.longValue(), str3, list4, list3);
                                        }
                                        throw b.g("lastModifyTime", "lastModifyTime", yVar);
                                    }
                                    throw b.g("scaleValue", "scaleValue", yVar);
                                }
                                throw b.g("sampleBase", "sampleBase", yVar);
                            }
                            throw b.g("type", "type", yVar);
                        }
                        throw b.g(CrashHianalyticsData.TIME, CrashHianalyticsData.TIME, yVar);
                    }
                    throw b.g("ecgId", "ecgId", yVar);
                }
                Constructor<EcgRecordBean> constructor = this.f9920i;
                if (constructor == null) {
                    str = CrashHianalyticsData.TIME;
                    Class cls = Integer.TYPE;
                    constructor = EcgRecordBean.class.getDeclaredConstructor(UUID.class, Date.class, cls, cls, cls, Long.TYPE, String.class, List.class, List.class, cls, b.f22341c);
                    this.f9920i = constructor;
                    l.e(constructor, "EcgRecordBean::class.jav…his.constructorRef = it }");
                } else {
                    str = CrashHianalyticsData.TIME;
                }
                Object[] objArr = new Object[11];
                if (uuid != null) {
                    objArr[0] = uuid;
                    if (date == null) {
                        String str4 = str;
                        throw b.g(str4, str4, yVar);
                    }
                    objArr[1] = date;
                    if (num != null) {
                        objArr[2] = Integer.valueOf(num.intValue());
                        if (num2 != null) {
                            objArr[3] = Integer.valueOf(num2.intValue());
                            if (num3 != null) {
                                objArr[4] = Integer.valueOf(num3.intValue());
                                if (l10 != null) {
                                    objArr[5] = Long.valueOf(l10.longValue());
                                    objArr[6] = str3;
                                    objArr[7] = list4;
                                    objArr[8] = list3;
                                    objArr[9] = Integer.valueOf(i10);
                                    objArr[10] = null;
                                    EcgRecordBean newInstance = constructor.newInstance(objArr);
                                    l.e(newInstance, "localConstructor.newInst…torMarker */ null\n      )");
                                    return newInstance;
                                }
                                throw b.g("lastModifyTime", "lastModifyTime", yVar);
                            }
                            throw b.g("scaleValue", "scaleValue", yVar);
                        }
                        throw b.g("sampleBase", "sampleBase", yVar);
                    }
                    throw b.g("type", "type", yVar);
                }
                throw b.g("ecgId", "ecgId", yVar);
            }
            switch (yVar.L(this.f9912a)) {
                case -1:
                    yVar.R();
                    yVar.W();
                    list2 = list3;
                    list = list4;
                    break;
                case 0:
                    uuid = this.f9913b.b(yVar);
                    if (uuid == null) {
                        throw b.m("ecgId", "ecgId", yVar);
                    }
                    list2 = list3;
                    list = list4;
                    break;
                case 1:
                    date = this.f9914c.b(yVar);
                    if (date == null) {
                        throw b.m(CrashHianalyticsData.TIME, CrashHianalyticsData.TIME, yVar);
                    }
                    list2 = list3;
                    list = list4;
                    break;
                case 2:
                    num = this.f9915d.b(yVar);
                    if (num == null) {
                        throw b.m("type", "type", yVar);
                    }
                    list2 = list3;
                    list = list4;
                    break;
                case 3:
                    num2 = this.f9915d.b(yVar);
                    if (num2 == null) {
                        throw b.m("sampleBase", "sampleBase", yVar);
                    }
                    list2 = list3;
                    list = list4;
                    break;
                case 4:
                    num3 = this.f9915d.b(yVar);
                    if (num3 == null) {
                        throw b.m("scaleValue", "scaleValue", yVar);
                    }
                    list2 = list3;
                    list = list4;
                    break;
                case 5:
                    l10 = this.f9916e.b(yVar);
                    if (l10 == null) {
                        throw b.m("lastModifyTime", "lastModifyTime", yVar);
                    }
                    list2 = list3;
                    list = list4;
                    break;
                case 6:
                    str2 = this.f9917f.b(yVar);
                    i10 &= -65;
                    list2 = list3;
                    list = list4;
                    continue;
                case 7:
                    list = this.f9918g.b(yVar);
                    i10 &= -129;
                    list2 = list3;
                    break;
                case 8:
                    list2 = this.f9919h.b(yVar);
                    i10 &= -257;
                    list = list4;
                    break;
                default:
                    list2 = list3;
                    list = list4;
                    break;
            }
            str2 = str3;
        }
    }

    @Override // mf.t
    public final void f(e0 e0Var, EcgRecordBean ecgRecordBean) {
        EcgRecordBean ecgRecordBean2 = ecgRecordBean;
        l.f(e0Var, "writer");
        if (ecgRecordBean2 != null) {
            e0Var.b();
            e0Var.s("ecgId");
            this.f9913b.f(e0Var, ecgRecordBean2.f9903a);
            e0Var.s(CrashHianalyticsData.TIME);
            this.f9914c.f(e0Var, ecgRecordBean2.f9904b);
            e0Var.s("type");
            fb.b.b(ecgRecordBean2.f9905c, this.f9915d, e0Var, "sampleBase");
            fb.b.b(ecgRecordBean2.f9906d, this.f9915d, e0Var, "scaleValue");
            fb.b.b(ecgRecordBean2.f9907e, this.f9915d, e0Var, "lastModifyTime");
            this.f9916e.f(e0Var, Long.valueOf(ecgRecordBean2.f9908f));
            e0Var.s("deviceAddress");
            this.f9917f.f(e0Var, ecgRecordBean2.f9909g);
            e0Var.s("detail");
            this.f9918g.f(e0Var, ecgRecordBean2.f9910h);
            e0Var.s("reports");
            this.f9919h.f(e0Var, ecgRecordBean2.f9911i);
            e0Var.k();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }

    public final String toString() {
        return "GeneratedJsonAdapter(EcgRecordBean)";
    }
}
