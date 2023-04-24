package com.topstep.fitcloud.pro.shared.data.bean.data;

import bi.z0;
import com.topstep.fitcloud.pro.model.utils.moshi.DateField;
import gm.l;
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
public final class UploadBloodPressureRecordBeanJsonAdapter extends t<UploadBloodPressureRecordBean> {

    /* renamed from: a */
    public final y.a f10029a;

    /* renamed from: b */
    public final t<Date> f10030b;

    /* renamed from: c */
    public final t<List<BloodPressureItemBean>> f10031c;

    public UploadBloodPressureRecordBeanJsonAdapter(h0 h0Var) {
        l.f(h0Var, "moshi");
        this.f10029a = y.a.a("date", "detail");
        this.f10030b = h0Var.c(Date.class, z0.o(new DateField() { // from class: com.topstep.fitcloud.pro.shared.data.bean.data.UploadBloodPressureRecordBeanJsonAdapter.a
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
        this.f10031c = h0Var.c(l0.d(List.class, BloodPressureItemBean.class), u.f28881a, "detail");
    }

    @Override // mf.t
    public final UploadBloodPressureRecordBean b(y yVar) {
        l.f(yVar, "reader");
        yVar.b();
        Date date = null;
        List<BloodPressureItemBean> list = null;
        while (yVar.q()) {
            int L = yVar.L(this.f10029a);
            if (L == -1) {
                yVar.R();
                yVar.W();
            } else if (L == 0) {
                date = this.f10030b.b(yVar);
                if (date == null) {
                    throw b.m("date", "date", yVar);
                }
            } else if (L == 1 && (list = this.f10031c.b(yVar)) == null) {
                throw b.m("detail", "detail", yVar);
            }
        }
        yVar.j();
        if (date != null) {
            if (list != null) {
                return new UploadBloodPressureRecordBean(date, list);
            }
            throw b.g("detail", "detail", yVar);
        }
        throw b.g("date", "date", yVar);
    }

    @Override // mf.t
    public final void f(e0 e0Var, UploadBloodPressureRecordBean uploadBloodPressureRecordBean) {
        UploadBloodPressureRecordBean uploadBloodPressureRecordBean2 = uploadBloodPressureRecordBean;
        l.f(e0Var, "writer");
        if (uploadBloodPressureRecordBean2 != null) {
            e0Var.b();
            e0Var.s("date");
            this.f10030b.f(e0Var, uploadBloodPressureRecordBean2.f10027a);
            e0Var.s("detail");
            this.f10031c.f(e0Var, uploadBloodPressureRecordBean2.f10028b);
            e0Var.k();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }

    public final String toString() {
        return "GeneratedJsonAdapter(UploadBloodPressureRecordBean)";
    }
}
