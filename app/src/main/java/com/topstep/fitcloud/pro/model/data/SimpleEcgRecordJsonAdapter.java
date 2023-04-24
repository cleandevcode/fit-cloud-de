package com.topstep.fitcloud.pro.model.data;

import bi.z0;
import com.huawei.hms.framework.common.hianalytics.CrashHianalyticsData;
import com.topstep.fitcloud.pro.model.utils.moshi.TimeField;
import gm.l;
import java.util.Date;
import java.util.UUID;
import kotlin.Metadata;
import mf.e0;
import mf.h0;
import mf.t;
import mf.y;
import nf.b;
import ul.u;

@Metadata
/* loaded from: classes2.dex */
public final class SimpleEcgRecordJsonAdapter extends t<SimpleEcgRecord> {

    /* renamed from: a */
    public final y.a f9597a;

    /* renamed from: b */
    public final t<UUID> f9598b;

    /* renamed from: c */
    public final t<Date> f9599c;

    public SimpleEcgRecordJsonAdapter(h0 h0Var) {
        l.f(h0Var, "moshi");
        this.f9597a = y.a.a("ecgId", CrashHianalyticsData.TIME);
        this.f9598b = h0Var.c(UUID.class, u.f28881a, "ecgId");
        this.f9599c = h0Var.c(Date.class, z0.o(new TimeField() { // from class: com.topstep.fitcloud.pro.model.data.SimpleEcgRecordJsonAdapter.a
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
    }

    @Override // mf.t
    public final SimpleEcgRecord b(y yVar) {
        l.f(yVar, "reader");
        yVar.b();
        UUID uuid = null;
        Date date = null;
        while (yVar.q()) {
            int L = yVar.L(this.f9597a);
            if (L == -1) {
                yVar.R();
                yVar.W();
            } else if (L == 0) {
                uuid = this.f9598b.b(yVar);
                if (uuid == null) {
                    throw b.m("ecgId", "ecgId", yVar);
                }
            } else if (L == 1 && (date = this.f9599c.b(yVar)) == null) {
                throw b.m(CrashHianalyticsData.TIME, CrashHianalyticsData.TIME, yVar);
            }
        }
        yVar.j();
        if (uuid != null) {
            if (date != null) {
                return new SimpleEcgRecord(uuid, date);
            }
            throw b.g(CrashHianalyticsData.TIME, CrashHianalyticsData.TIME, yVar);
        }
        throw b.g("ecgId", "ecgId", yVar);
    }

    @Override // mf.t
    public final void f(e0 e0Var, SimpleEcgRecord simpleEcgRecord) {
        SimpleEcgRecord simpleEcgRecord2 = simpleEcgRecord;
        l.f(e0Var, "writer");
        if (simpleEcgRecord2 != null) {
            e0Var.b();
            e0Var.s("ecgId");
            this.f9598b.f(e0Var, simpleEcgRecord2.f9595a);
            e0Var.s(CrashHianalyticsData.TIME);
            this.f9599c.f(e0Var, simpleEcgRecord2.f9596b);
            e0Var.k();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }

    public final String toString() {
        return "GeneratedJsonAdapter(SimpleEcgRecord)";
    }
}
