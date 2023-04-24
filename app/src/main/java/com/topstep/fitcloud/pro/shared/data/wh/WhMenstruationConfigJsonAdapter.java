package com.topstep.fitcloud.pro.shared.data.wh;

import bi.z0;
import com.topstep.fitcloud.pro.model.utils.moshi.DateField;
import gm.l;
import java.lang.reflect.Constructor;
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
public final class WhMenstruationConfigJsonAdapter extends t<WhMenstruationConfig> {

    /* renamed from: a */
    public final y.a f10107a;

    /* renamed from: b */
    public final t<Integer> f10108b;

    /* renamed from: c */
    public final t<Date> f10109c;

    /* renamed from: d */
    public volatile Constructor<WhMenstruationConfig> f10110d;

    public WhMenstruationConfigJsonAdapter(h0 h0Var) {
        l.f(h0Var, "moshi");
        this.f10107a = y.a.a("cycle", "duration", "latest");
        this.f10108b = h0Var.c(Integer.TYPE, u.f28881a, "cycle");
        this.f10109c = h0Var.c(Date.class, z0.o(new DateField() { // from class: com.topstep.fitcloud.pro.shared.data.wh.WhMenstruationConfigJsonAdapter.a
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
        }), "latest");
    }

    @Override // mf.t
    public final WhMenstruationConfig b(y yVar) {
        l.f(yVar, "reader");
        Integer num = 0;
        yVar.b();
        Integer num2 = num;
        Date date = null;
        int i10 = -1;
        while (yVar.q()) {
            int L = yVar.L(this.f10107a);
            if (L == -1) {
                yVar.R();
                yVar.W();
            } else if (L == 0) {
                num = this.f10108b.b(yVar);
                if (num == null) {
                    throw b.m("cycle", "cycle", yVar);
                }
                i10 &= -2;
            } else if (L == 1) {
                num2 = this.f10108b.b(yVar);
                if (num2 == null) {
                    throw b.m("duration", "duration", yVar);
                }
                i10 &= -3;
            } else if (L == 2) {
                date = this.f10109c.b(yVar);
                if (date == null) {
                    throw b.m("latest", "latest", yVar);
                }
                i10 &= -5;
            } else {
                continue;
            }
        }
        yVar.j();
        if (i10 == -8) {
            int intValue = num.intValue();
            int intValue2 = num2.intValue();
            l.d(date, "null cannot be cast to non-null type java.util.Date");
            return new WhMenstruationConfig(intValue, intValue2, date);
        }
        Constructor<WhMenstruationConfig> constructor = this.f10110d;
        if (constructor == null) {
            Class cls = Integer.TYPE;
            constructor = WhMenstruationConfig.class.getDeclaredConstructor(cls, cls, Date.class, cls, b.f22341c);
            this.f10110d = constructor;
            l.e(constructor, "WhMenstruationConfig::cl…his.constructorRef = it }");
        }
        WhMenstruationConfig newInstance = constructor.newInstance(num, num2, date, Integer.valueOf(i10), null);
        l.e(newInstance, "localConstructor.newInst…torMarker */ null\n      )");
        return newInstance;
    }

    @Override // mf.t
    public final void f(e0 e0Var, WhMenstruationConfig whMenstruationConfig) {
        WhMenstruationConfig whMenstruationConfig2 = whMenstruationConfig;
        l.f(e0Var, "writer");
        if (whMenstruationConfig2 != null) {
            e0Var.b();
            e0Var.s("cycle");
            fb.b.b(whMenstruationConfig2.f10104a, this.f10108b, e0Var, "duration");
            fb.b.b(whMenstruationConfig2.f10105b, this.f10108b, e0Var, "latest");
            this.f10109c.f(e0Var, whMenstruationConfig2.f10106c);
            e0Var.k();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }

    public final String toString() {
        return "GeneratedJsonAdapter(WhMenstruationConfig)";
    }
}
