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
public final class ExerciseGoalBeanJsonAdapter extends t<ExerciseGoalBean> {

    /* renamed from: a */
    public final y.a f9805a;

    /* renamed from: b */
    public final t<Integer> f9806b;

    /* renamed from: c */
    public final t<Float> f9807c;

    /* renamed from: d */
    public final t<Long> f9808d;

    public ExerciseGoalBeanJsonAdapter(h0 h0Var) {
        l.f(h0Var, "moshi");
        this.f9805a = y.a.a("stepTarget", "distanceTarget", "calorieTarget", "targetLastModifyTime");
        Class cls = Integer.TYPE;
        u uVar = u.f28881a;
        this.f9806b = h0Var.c(cls, uVar, "stepTarget");
        this.f9807c = h0Var.c(Float.TYPE, uVar, "distanceTarget");
        this.f9808d = h0Var.c(Long.TYPE, uVar, "targetLastModifyTime");
    }

    @Override // mf.t
    public final ExerciseGoalBean b(y yVar) {
        l.f(yVar, "reader");
        yVar.b();
        Integer num = null;
        Float f10 = null;
        Integer num2 = null;
        Long l10 = null;
        while (yVar.q()) {
            int L = yVar.L(this.f9805a);
            if (L == -1) {
                yVar.R();
                yVar.W();
            } else if (L == 0) {
                num = this.f9806b.b(yVar);
                if (num == null) {
                    throw b.m("stepTarget", "stepTarget", yVar);
                }
            } else if (L == 1) {
                f10 = this.f9807c.b(yVar);
                if (f10 == null) {
                    throw b.m("distanceTarget", "distanceTarget", yVar);
                }
            } else if (L == 2) {
                num2 = this.f9806b.b(yVar);
                if (num2 == null) {
                    throw b.m("calorieTarget", "calorieTarget", yVar);
                }
            } else if (L == 3 && (l10 = this.f9808d.b(yVar)) == null) {
                throw b.m("targetLastModifyTime", "targetLastModifyTime", yVar);
            }
        }
        yVar.j();
        if (num != null) {
            int intValue = num.intValue();
            if (f10 != null) {
                float floatValue = f10.floatValue();
                if (num2 != null) {
                    int intValue2 = num2.intValue();
                    if (l10 != null) {
                        return new ExerciseGoalBean(floatValue, intValue, intValue2, l10.longValue());
                    }
                    throw b.g("targetLastModifyTime", "targetLastModifyTime", yVar);
                }
                throw b.g("calorieTarget", "calorieTarget", yVar);
            }
            throw b.g("distanceTarget", "distanceTarget", yVar);
        }
        throw b.g("stepTarget", "stepTarget", yVar);
    }

    @Override // mf.t
    public final void f(e0 e0Var, ExerciseGoalBean exerciseGoalBean) {
        ExerciseGoalBean exerciseGoalBean2 = exerciseGoalBean;
        l.f(e0Var, "writer");
        if (exerciseGoalBean2 != null) {
            e0Var.b();
            e0Var.s("stepTarget");
            fb.b.b(exerciseGoalBean2.f9801a, this.f9806b, e0Var, "distanceTarget");
            this.f9807c.f(e0Var, Float.valueOf(exerciseGoalBean2.f9802b));
            e0Var.s("calorieTarget");
            fb.b.b(exerciseGoalBean2.f9803c, this.f9806b, e0Var, "targetLastModifyTime");
            this.f9808d.f(e0Var, Long.valueOf(exerciseGoalBean2.f9804d));
            e0Var.k();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }

    public final String toString() {
        return "GeneratedJsonAdapter(ExerciseGoalBean)";
    }
}
