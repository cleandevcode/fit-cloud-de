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
public final class UploadOxygenRecordBeanJsonAdapter extends t<UploadOxygenRecordBean> {

    /* renamed from: a */
    public final y.a f10039a;

    /* renamed from: b */
    public final t<Date> f10040b;

    /* renamed from: c */
    public final t<List<OxygenItemBean>> f10041c;

    public UploadOxygenRecordBeanJsonAdapter(h0 h0Var) {
        l.f(h0Var, "moshi");
        this.f10039a = y.a.a("date", "detail");
        this.f10040b = h0Var.c(Date.class, z0.o(new DateField() { // from class: com.topstep.fitcloud.pro.shared.data.bean.data.UploadOxygenRecordBeanJsonAdapter.a
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
        this.f10041c = h0Var.c(l0.d(List.class, OxygenItemBean.class), u.f28881a, "detail");
    }

    @Override // mf.t
    public final UploadOxygenRecordBean b(y yVar) {
        l.f(yVar, "reader");
        yVar.b();
        Date date = null;
        List<OxygenItemBean> list = null;
        while (yVar.q()) {
            int L = yVar.L(this.f10039a);
            if (L == -1) {
                yVar.R();
                yVar.W();
            } else if (L == 0) {
                date = this.f10040b.b(yVar);
                if (date == null) {
                    throw b.m("date", "date", yVar);
                }
            } else if (L == 1 && (list = this.f10041c.b(yVar)) == null) {
                throw b.m("detail", "detail", yVar);
            }
        }
        yVar.j();
        if (date != null) {
            if (list != null) {
                return new UploadOxygenRecordBean(date, list);
            }
            throw b.g("detail", "detail", yVar);
        }
        throw b.g("date", "date", yVar);
    }

    @Override // mf.t
    public final void f(e0 e0Var, UploadOxygenRecordBean uploadOxygenRecordBean) {
        UploadOxygenRecordBean uploadOxygenRecordBean2 = uploadOxygenRecordBean;
        l.f(e0Var, "writer");
        if (uploadOxygenRecordBean2 != null) {
            e0Var.b();
            e0Var.s("date");
            this.f10040b.f(e0Var, uploadOxygenRecordBean2.f10037a);
            e0Var.s("detail");
            this.f10041c.f(e0Var, uploadOxygenRecordBean2.f10038b);
            e0Var.k();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }

    public final String toString() {
        return "GeneratedJsonAdapter(UploadOxygenRecordBean)";
    }
}
