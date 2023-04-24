package com.topstep.fitcloud.pro.model.data;

import cn.sharesdk.framework.InnerShareParams;
import gm.l;
import kotlin.Metadata;
import mf.e0;
import mf.h0;
import mf.t;
import mf.y;
import nf.b;
import ul.u;

@Metadata
/* loaded from: classes2.dex */
public final class EcgReportJsonAdapter extends t<EcgReport> {

    /* renamed from: a */
    public final y.a f9578a;

    /* renamed from: b */
    public final t<String> f9579b;

    public EcgReportJsonAdapter(h0 h0Var) {
        l.f(h0Var, "moshi");
        this.f9578a = y.a.a("language", InnerShareParams.URL);
        this.f9579b = h0Var.c(String.class, u.f28881a, "language");
    }

    @Override // mf.t
    public final EcgReport b(y yVar) {
        l.f(yVar, "reader");
        yVar.b();
        String str = null;
        String str2 = null;
        while (yVar.q()) {
            int L = yVar.L(this.f9578a);
            if (L == -1) {
                yVar.R();
                yVar.W();
            } else if (L == 0) {
                str = this.f9579b.b(yVar);
                if (str == null) {
                    throw b.m("language", "language", yVar);
                }
            } else if (L == 1 && (str2 = this.f9579b.b(yVar)) == null) {
                throw b.m(InnerShareParams.URL, InnerShareParams.URL, yVar);
            }
        }
        yVar.j();
        if (str != null) {
            if (str2 != null) {
                return new EcgReport(str, str2);
            }
            throw b.g(InnerShareParams.URL, InnerShareParams.URL, yVar);
        }
        throw b.g("language", "language", yVar);
    }

    @Override // mf.t
    public final void f(e0 e0Var, EcgReport ecgReport) {
        EcgReport ecgReport2 = ecgReport;
        l.f(e0Var, "writer");
        if (ecgReport2 == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        e0Var.b();
        e0Var.s("language");
        this.f9579b.f(e0Var, ecgReport2.getLanguage());
        e0Var.s(InnerShareParams.URL);
        this.f9579b.f(e0Var, ecgReport2.getUrl());
        e0Var.k();
    }

    public final String toString() {
        return "GeneratedJsonAdapter(EcgReport)";
    }
}
