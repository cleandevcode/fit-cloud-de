package com.topstep.fitcloud.pro.model.data;

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
public final class SportHeartRateJsonAdapter extends t<SportHeartRate> {

    /* renamed from: a */
    public final y.a f9616a;

    /* renamed from: b */
    public final t<Integer> f9617b;

    public SportHeartRateJsonAdapter(h0 h0Var) {
        l.f(h0Var, "moshi");
        this.f9616a = y.a.a("duration", "value");
        this.f9617b = h0Var.c(Integer.TYPE, u.f28881a, "duration");
    }

    @Override // mf.t
    public final SportHeartRate b(y yVar) {
        l.f(yVar, "reader");
        yVar.b();
        Integer num = null;
        Integer num2 = null;
        while (yVar.q()) {
            int L = yVar.L(this.f9616a);
            if (L == -1) {
                yVar.R();
                yVar.W();
            } else if (L == 0) {
                num = this.f9617b.b(yVar);
                if (num == null) {
                    throw b.m("duration", "duration", yVar);
                }
            } else if (L == 1 && (num2 = this.f9617b.b(yVar)) == null) {
                throw b.m("value__", "value", yVar);
            }
        }
        yVar.j();
        if (num != null) {
            int intValue = num.intValue();
            if (num2 != null) {
                return new SportHeartRate(intValue, num2.intValue());
            }
            throw b.g("value__", "value", yVar);
        }
        throw b.g("duration", "duration", yVar);
    }

    @Override // mf.t
    public final void f(e0 e0Var, SportHeartRate sportHeartRate) {
        SportHeartRate sportHeartRate2 = sportHeartRate;
        l.f(e0Var, "writer");
        if (sportHeartRate2 != null) {
            e0Var.b();
            e0Var.s("duration");
            fb.b.b(sportHeartRate2.f9614a, this.f9617b, e0Var, "value");
            this.f9617b.f(e0Var, Integer.valueOf(sportHeartRate2.f9615b));
            e0Var.k();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }

    public final String toString() {
        return "GeneratedJsonAdapter(SportHeartRate)";
    }
}
