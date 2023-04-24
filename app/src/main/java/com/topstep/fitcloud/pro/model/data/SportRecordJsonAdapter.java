package com.topstep.fitcloud.pro.model.data;

import bi.z0;
import com.huawei.hms.framework.common.hianalytics.CrashHianalyticsData;
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
public final class SportRecordJsonAdapter extends t<SportRecord> {

    /* renamed from: a */
    public final y.a f9638a;

    /* renamed from: b */
    public final t<UUID> f9639b;

    /* renamed from: c */
    public final t<Date> f9640c;

    /* renamed from: d */
    public final t<Integer> f9641d;

    /* renamed from: e */
    public final t<Float> f9642e;

    /* renamed from: f */
    public final t<List<SportLatLng>> f9643f;

    /* renamed from: g */
    public final t<List<SportHeartRate>> f9644g;

    /* renamed from: h */
    public volatile Constructor<SportRecord> f9645h;

    public SportRecordJsonAdapter(h0 h0Var) {
        l.f(h0Var, "moshi");
        this.f9638a = y.a.a("sportId", CrashHianalyticsData.TIME, "duration", "distance", "calorie", "step", "climb", "locationType", "sportType", "latLngs", "heartRates");
        u uVar = u.f28881a;
        this.f9639b = h0Var.c(UUID.class, uVar, "sportId");
        this.f9640c = h0Var.c(Date.class, z0.o(new TimeField() { // from class: com.topstep.fitcloud.pro.model.data.SportRecordJsonAdapter.a
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
        this.f9641d = h0Var.c(Integer.TYPE, uVar, "duration");
        this.f9642e = h0Var.c(Float.TYPE, uVar, "distance");
        this.f9643f = h0Var.c(l0.d(List.class, SportLatLng.class), uVar, "latLngs");
        this.f9644g = h0Var.c(l0.d(List.class, SportHeartRate.class), uVar, "heartRates");
    }

    @Override // mf.t
    public final SportRecord b(y yVar) {
        String str;
        l.f(yVar, "reader");
        yVar.b();
        int i10 = -1;
        Integer num = null;
        UUID uuid = null;
        Date date = null;
        Integer num2 = null;
        Float f10 = null;
        Integer num3 = null;
        Float f11 = null;
        Float f12 = null;
        Integer num4 = null;
        List<SportLatLng> list = null;
        List<SportHeartRate> list2 = null;
        while (true) {
            List<SportHeartRate> list3 = list2;
            List<SportLatLng> list4 = list;
            Integer num5 = num;
            Integer num6 = num2;
            Float f13 = f10;
            Integer num7 = num3;
            Float f14 = f11;
            Float f15 = f12;
            if (!yVar.q()) {
                yVar.j();
                if (i10 == -1537) {
                    if (uuid != null) {
                        if (date != null) {
                            if (num4 != null) {
                                int intValue = num4.intValue();
                                if (f15 != null) {
                                    float floatValue = f15.floatValue();
                                    if (f14 != null) {
                                        float floatValue2 = f14.floatValue();
                                        if (num7 != null) {
                                            int intValue2 = num7.intValue();
                                            if (f13 != null) {
                                                float floatValue3 = f13.floatValue();
                                                if (num6 != null) {
                                                    int intValue3 = num6.intValue();
                                                    if (num5 != null) {
                                                        return new SportRecord(uuid, date, intValue, floatValue, floatValue2, intValue2, floatValue3, intValue3, num5.intValue(), list4, list3);
                                                    }
                                                    throw b.g("sportType", "sportType", yVar);
                                                }
                                                throw b.g("locationType", "locationType", yVar);
                                            }
                                            throw b.g("climb", "climb", yVar);
                                        }
                                        throw b.g("step", "step", yVar);
                                    }
                                    throw b.g("calorie", "calorie", yVar);
                                }
                                throw b.g("distance", "distance", yVar);
                            }
                            throw b.g("duration", "duration", yVar);
                        }
                        throw b.g(CrashHianalyticsData.TIME, CrashHianalyticsData.TIME, yVar);
                    }
                    throw b.g("sportId", "sportId", yVar);
                }
                Constructor<SportRecord> constructor = this.f9645h;
                if (constructor == null) {
                    str = CrashHianalyticsData.TIME;
                    Class cls = Integer.TYPE;
                    Class cls2 = Float.TYPE;
                    constructor = SportRecord.class.getDeclaredConstructor(UUID.class, Date.class, cls, cls2, cls2, cls, cls2, cls, cls, List.class, List.class, cls, b.f22341c);
                    this.f9645h = constructor;
                    l.e(constructor, "SportRecord::class.java.…his.constructorRef = it }");
                } else {
                    str = CrashHianalyticsData.TIME;
                }
                Object[] objArr = new Object[13];
                if (uuid != null) {
                    objArr[0] = uuid;
                    if (date == null) {
                        String str2 = str;
                        throw b.g(str2, str2, yVar);
                    }
                    objArr[1] = date;
                    if (num4 != null) {
                        objArr[2] = Integer.valueOf(num4.intValue());
                        if (f15 != null) {
                            objArr[3] = Float.valueOf(f15.floatValue());
                            if (f14 != null) {
                                objArr[4] = Float.valueOf(f14.floatValue());
                                if (num7 != null) {
                                    objArr[5] = Integer.valueOf(num7.intValue());
                                    if (f13 != null) {
                                        objArr[6] = Float.valueOf(f13.floatValue());
                                        if (num6 != null) {
                                            objArr[7] = Integer.valueOf(num6.intValue());
                                            if (num5 != null) {
                                                objArr[8] = Integer.valueOf(num5.intValue());
                                                objArr[9] = list4;
                                                objArr[10] = list3;
                                                objArr[11] = Integer.valueOf(i10);
                                                objArr[12] = null;
                                                SportRecord newInstance = constructor.newInstance(objArr);
                                                l.e(newInstance, "localConstructor.newInst…torMarker */ null\n      )");
                                                return newInstance;
                                            }
                                            throw b.g("sportType", "sportType", yVar);
                                        }
                                        throw b.g("locationType", "locationType", yVar);
                                    }
                                    throw b.g("climb", "climb", yVar);
                                }
                                throw b.g("step", "step", yVar);
                            }
                            throw b.g("calorie", "calorie", yVar);
                        }
                        throw b.g("distance", "distance", yVar);
                    }
                    throw b.g("duration", "duration", yVar);
                }
                throw b.g("sportId", "sportId", yVar);
            }
            switch (yVar.L(this.f9638a)) {
                case -1:
                    yVar.R();
                    yVar.W();
                    list2 = list3;
                    list = list4;
                    num = num5;
                    num2 = num6;
                    f10 = f13;
                    num3 = num7;
                    f11 = f14;
                    break;
                case 0:
                    uuid = this.f9639b.b(yVar);
                    if (uuid == null) {
                        throw b.m("sportId", "sportId", yVar);
                    }
                    list2 = list3;
                    list = list4;
                    num = num5;
                    num2 = num6;
                    f10 = f13;
                    num3 = num7;
                    f11 = f14;
                    break;
                case 1:
                    date = this.f9640c.b(yVar);
                    if (date == null) {
                        throw b.m(CrashHianalyticsData.TIME, CrashHianalyticsData.TIME, yVar);
                    }
                    list2 = list3;
                    list = list4;
                    num = num5;
                    num2 = num6;
                    f10 = f13;
                    num3 = num7;
                    f11 = f14;
                    break;
                case 2:
                    num4 = this.f9641d.b(yVar);
                    if (num4 == null) {
                        throw b.m("duration", "duration", yVar);
                    }
                    list2 = list3;
                    list = list4;
                    num = num5;
                    num2 = num6;
                    f10 = f13;
                    num3 = num7;
                    f11 = f14;
                    break;
                case 3:
                    f12 = this.f9642e.b(yVar);
                    if (f12 != null) {
                        list2 = list3;
                        list = list4;
                        num = num5;
                        num2 = num6;
                        f10 = f13;
                        num3 = num7;
                        f11 = f14;
                        continue;
                    } else {
                        throw b.m("distance", "distance", yVar);
                    }
                case 4:
                    Float b10 = this.f9642e.b(yVar);
                    if (b10 != null) {
                        f11 = b10;
                        list2 = list3;
                        list = list4;
                        num = num5;
                        num2 = num6;
                        f10 = f13;
                        num3 = num7;
                        break;
                    } else {
                        throw b.m("calorie", "calorie", yVar);
                    }
                case 5:
                    num3 = this.f9641d.b(yVar);
                    if (num3 != null) {
                        list2 = list3;
                        list = list4;
                        num = num5;
                        num2 = num6;
                        f10 = f13;
                        f11 = f14;
                        break;
                    } else {
                        throw b.m("step", "step", yVar);
                    }
                case 6:
                    Float b11 = this.f9642e.b(yVar);
                    if (b11 != null) {
                        f10 = b11;
                        list2 = list3;
                        list = list4;
                        num = num5;
                        num2 = num6;
                        num3 = num7;
                        f11 = f14;
                        break;
                    } else {
                        throw b.m("climb", "climb", yVar);
                    }
                case 7:
                    num2 = this.f9641d.b(yVar);
                    if (num2 != null) {
                        list2 = list3;
                        list = list4;
                        num = num5;
                        f10 = f13;
                        num3 = num7;
                        f11 = f14;
                        break;
                    } else {
                        throw b.m("locationType", "locationType", yVar);
                    }
                case 8:
                    num = this.f9641d.b(yVar);
                    if (num != null) {
                        list2 = list3;
                        list = list4;
                        num2 = num6;
                        f10 = f13;
                        num3 = num7;
                        f11 = f14;
                        break;
                    } else {
                        throw b.m("sportType", "sportType", yVar);
                    }
                case 9:
                    list = this.f9643f.b(yVar);
                    i10 &= -513;
                    list2 = list3;
                    num = num5;
                    num2 = num6;
                    f10 = f13;
                    num3 = num7;
                    f11 = f14;
                    break;
                case 10:
                    list2 = this.f9644g.b(yVar);
                    i10 &= -1025;
                    list = list4;
                    num = num5;
                    num2 = num6;
                    f10 = f13;
                    num3 = num7;
                    f11 = f14;
                    break;
                default:
                    list2 = list3;
                    list = list4;
                    num = num5;
                    num2 = num6;
                    f10 = f13;
                    num3 = num7;
                    f11 = f14;
                    break;
            }
            f12 = f15;
        }
    }

    @Override // mf.t
    public final void f(e0 e0Var, SportRecord sportRecord) {
        SportRecord sportRecord2 = sportRecord;
        l.f(e0Var, "writer");
        if (sportRecord2 != null) {
            e0Var.b();
            e0Var.s("sportId");
            this.f9639b.f(e0Var, sportRecord2.f9627a);
            e0Var.s(CrashHianalyticsData.TIME);
            this.f9640c.f(e0Var, sportRecord2.f9628b);
            e0Var.s("duration");
            fb.b.b(sportRecord2.f9629c, this.f9641d, e0Var, "distance");
            this.f9642e.f(e0Var, Float.valueOf(sportRecord2.f9630d));
            e0Var.s("calorie");
            this.f9642e.f(e0Var, Float.valueOf(sportRecord2.f9631e));
            e0Var.s("step");
            fb.b.b(sportRecord2.f9632f, this.f9641d, e0Var, "climb");
            this.f9642e.f(e0Var, Float.valueOf(sportRecord2.f9633g));
            e0Var.s("locationType");
            fb.b.b(sportRecord2.f9634h, this.f9641d, e0Var, "sportType");
            fb.b.b(sportRecord2.f9635i, this.f9641d, e0Var, "latLngs");
            this.f9643f.f(e0Var, sportRecord2.f9636j);
            e0Var.s("heartRates");
            this.f9644g.f(e0Var, sportRecord2.f9637k);
            e0Var.k();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }

    public final String toString() {
        return "GeneratedJsonAdapter(SportRecord)";
    }
}
