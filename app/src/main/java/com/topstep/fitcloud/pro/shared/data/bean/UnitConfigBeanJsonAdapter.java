package com.topstep.fitcloud.pro.shared.data.bean;

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
public final class UnitConfigBeanJsonAdapter extends t<UnitConfigBean> {

    /* renamed from: a */
    public final y.a f9823a;

    /* renamed from: b */
    public final t<Integer> f9824b;

    /* renamed from: c */
    public final t<Long> f9825c;

    public UnitConfigBeanJsonAdapter(h0 h0Var) {
        l.f(h0Var, "moshi");
        this.f9823a = y.a.a("lengthUnit", "weightUnit", "temperatureUnit", "unitLastModifyTime");
        Class cls = Integer.TYPE;
        u uVar = u.f28881a;
        this.f9824b = h0Var.c(cls, uVar, "lengthUnit");
        this.f9825c = h0Var.c(Long.TYPE, uVar, "unitLastModifyTime");
    }

    @Override // mf.t
    public final UnitConfigBean b(y yVar) {
        l.f(yVar, "reader");
        yVar.b();
        Integer num = null;
        Integer num2 = null;
        Integer num3 = null;
        Long l10 = null;
        while (yVar.q()) {
            int L = yVar.L(this.f9823a);
            if (L == -1) {
                yVar.R();
                yVar.W();
            } else if (L == 0) {
                num = this.f9824b.b(yVar);
                if (num == null) {
                    throw b.m("lengthUnit", "lengthUnit", yVar);
                }
            } else if (L == 1) {
                num2 = this.f9824b.b(yVar);
                if (num2 == null) {
                    throw b.m("weightUnit", "weightUnit", yVar);
                }
            } else if (L == 2) {
                num3 = this.f9824b.b(yVar);
                if (num3 == null) {
                    throw b.m("temperatureUnit", "temperatureUnit", yVar);
                }
            } else if (L == 3 && (l10 = this.f9825c.b(yVar)) == null) {
                throw b.m("unitLastModifyTime", "unitLastModifyTime", yVar);
            }
        }
        yVar.j();
        if (num != null) {
            int intValue = num.intValue();
            if (num2 != null) {
                int intValue2 = num2.intValue();
                if (num3 != null) {
                    int intValue3 = num3.intValue();
                    if (l10 != null) {
                        return new UnitConfigBean(intValue, intValue2, intValue3, l10.longValue());
                    }
                    throw b.g("unitLastModifyTime", "unitLastModifyTime", yVar);
                }
                throw b.g("temperatureUnit", "temperatureUnit", yVar);
            }
            throw b.g("weightUnit", "weightUnit", yVar);
        }
        throw b.g("lengthUnit", "lengthUnit", yVar);
    }

    @Override // mf.t
    public final void f(e0 e0Var, UnitConfigBean unitConfigBean) {
        UnitConfigBean unitConfigBean2 = unitConfigBean;
        l.f(e0Var, "writer");
        if (unitConfigBean2 != null) {
            e0Var.b();
            e0Var.s("lengthUnit");
            fb.b.b(unitConfigBean2.f9819a, this.f9824b, e0Var, "weightUnit");
            fb.b.b(unitConfigBean2.f9820b, this.f9824b, e0Var, "temperatureUnit");
            fb.b.b(unitConfigBean2.f9821c, this.f9824b, e0Var, "unitLastModifyTime");
            this.f9825c.f(e0Var, Long.valueOf(unitConfigBean2.f9822d));
            e0Var.k();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }

    public final String toString() {
        return "GeneratedJsonAdapter(UnitConfigBean)";
    }
}
