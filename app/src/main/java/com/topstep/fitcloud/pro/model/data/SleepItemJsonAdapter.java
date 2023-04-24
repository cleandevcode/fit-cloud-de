package com.topstep.fitcloud.pro.model.data;

import bi.z0;
import com.topstep.fitcloud.pro.model.utils.moshi.TimeField;
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
public final class SleepItemJsonAdapter extends t<SleepItem> {

    /* renamed from: a */
    public final y.a f9603a;

    /* renamed from: b */
    public final t<Integer> f9604b;

    /* renamed from: c */
    public final t<Date> f9605c;

    public SleepItemJsonAdapter(h0 h0Var) {
        l.f(h0Var, "moshi");
        this.f9603a = y.a.a("status", "startTime", "endTime");
        this.f9604b = h0Var.c(Integer.TYPE, u.f28881a, "status");
        this.f9605c = h0Var.c(Date.class, z0.o(new TimeField() { // from class: com.topstep.fitcloud.pro.model.data.SleepItemJsonAdapter.a
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
        }), "startTime");
    }

    @Override // mf.t
    public final SleepItem b(y yVar) {
        l.f(yVar, "reader");
        yVar.b();
        Integer num = null;
        Date date = null;
        Date date2 = null;
        while (yVar.q()) {
            int L = yVar.L(this.f9603a);
            if (L == -1) {
                yVar.R();
                yVar.W();
            } else if (L == 0) {
                num = this.f9604b.b(yVar);
                if (num == null) {
                    throw b.m("status", "status", yVar);
                }
            } else if (L == 1) {
                date = this.f9605c.b(yVar);
                if (date == null) {
                    throw b.m("startTime", "startTime", yVar);
                }
            } else if (L == 2 && (date2 = this.f9605c.b(yVar)) == null) {
                throw b.m("endTime", "endTime", yVar);
            }
        }
        yVar.j();
        if (num != null) {
            int intValue = num.intValue();
            if (date != null) {
                if (date2 != null) {
                    return new SleepItem(intValue, date, date2);
                }
                throw b.g("endTime", "endTime", yVar);
            }
            throw b.g("startTime", "startTime", yVar);
        }
        throw b.g("status", "status", yVar);
    }

    @Override // mf.t
    public final void f(e0 e0Var, SleepItem sleepItem) {
        SleepItem sleepItem2 = sleepItem;
        l.f(e0Var, "writer");
        if (sleepItem2 != null) {
            e0Var.b();
            e0Var.s("status");
            fb.b.b(sleepItem2.f9600a, this.f9604b, e0Var, "startTime");
            this.f9605c.f(e0Var, sleepItem2.f9601b);
            e0Var.s("endTime");
            this.f9605c.f(e0Var, sleepItem2.f9602c);
            e0Var.k();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }

    public final String toString() {
        return "GeneratedJsonAdapter(SleepItem)";
    }
}
