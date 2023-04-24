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
public final class UploadHeartRateRecordBeanJsonAdapter extends t<UploadHeartRateRecordBean> {

    /* renamed from: a */
    public final y.a f10034a;

    /* renamed from: b */
    public final t<Date> f10035b;

    /* renamed from: c */
    public final t<List<HeartRateItemBean>> f10036c;

    public UploadHeartRateRecordBeanJsonAdapter(h0 h0Var) {
        l.f(h0Var, "moshi");
        this.f10034a = y.a.a("date", "detail");
        this.f10035b = h0Var.c(Date.class, z0.o(new DateField() { // from class: com.topstep.fitcloud.pro.shared.data.bean.data.UploadHeartRateRecordBeanJsonAdapter.a
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
        this.f10036c = h0Var.c(l0.d(List.class, HeartRateItemBean.class), u.f28881a, "detail");
    }

    @Override // mf.t
    public final UploadHeartRateRecordBean b(y yVar) {
        l.f(yVar, "reader");
        yVar.b();
        Date date = null;
        List<HeartRateItemBean> list = null;
        while (yVar.q()) {
            int L = yVar.L(this.f10034a);
            if (L == -1) {
                yVar.R();
                yVar.W();
            } else if (L == 0) {
                date = this.f10035b.b(yVar);
                if (date == null) {
                    throw b.m("date", "date", yVar);
                }
            } else if (L == 1 && (list = this.f10036c.b(yVar)) == null) {
                throw b.m("detail", "detail", yVar);
            }
        }
        yVar.j();
        if (date != null) {
            if (list != null) {
                return new UploadHeartRateRecordBean(date, list);
            }
            throw b.g("detail", "detail", yVar);
        }
        throw b.g("date", "date", yVar);
    }

    @Override // mf.t
    public final void f(e0 e0Var, UploadHeartRateRecordBean uploadHeartRateRecordBean) {
        UploadHeartRateRecordBean uploadHeartRateRecordBean2 = uploadHeartRateRecordBean;
        l.f(e0Var, "writer");
        if (uploadHeartRateRecordBean2 != null) {
            e0Var.b();
            e0Var.s("date");
            this.f10035b.f(e0Var, uploadHeartRateRecordBean2.f10032a);
            e0Var.s("detail");
            this.f10036c.f(e0Var, uploadHeartRateRecordBean2.f10033b);
            e0Var.k();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }

    public final String toString() {
        return "GeneratedJsonAdapter(UploadHeartRateRecordBean)";
    }
}
