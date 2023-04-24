package com.topstep.fitcloud.pro.model.data;

import gm.l;
import java.lang.reflect.Constructor;
import kotlin.Metadata;
import mf.e0;
import mf.h0;
import mf.t;
import mf.y;
import nf.b;
import ul.u;

@Metadata
/* loaded from: classes2.dex */
public final class SportTotalJsonAdapter extends t<SportTotal> {

    /* renamed from: a */
    public final y.a f9648a;

    /* renamed from: b */
    public final t<Integer> f9649b;

    /* renamed from: c */
    public final t<Float> f9650c;

    /* renamed from: d */
    public volatile Constructor<SportTotal> f9651d;

    public SportTotalJsonAdapter(h0 h0Var) {
        l.f(h0Var, "moshi");
        this.f9648a = y.a.a("count", "distance");
        Class cls = Integer.TYPE;
        u uVar = u.f28881a;
        this.f9649b = h0Var.c(cls, uVar, "count");
        this.f9650c = h0Var.c(Float.TYPE, uVar, "distance");
    }

    @Override // mf.t
    public final SportTotal b(y yVar) {
        l.f(yVar, "reader");
        Integer num = 0;
        Float valueOf = Float.valueOf(0.0f);
        yVar.b();
        int i10 = -1;
        while (yVar.q()) {
            int L = yVar.L(this.f9648a);
            if (L == -1) {
                yVar.R();
                yVar.W();
            } else if (L == 0) {
                num = this.f9649b.b(yVar);
                if (num == null) {
                    throw b.m("count", "count", yVar);
                }
                i10 &= -2;
            } else if (L == 1) {
                valueOf = this.f9650c.b(yVar);
                if (valueOf == null) {
                    throw b.m("distance", "distance", yVar);
                }
                i10 &= -3;
            } else {
                continue;
            }
        }
        yVar.j();
        if (i10 == -4) {
            return new SportTotal(valueOf.floatValue(), num.intValue());
        }
        Constructor<SportTotal> constructor = this.f9651d;
        if (constructor == null) {
            Class cls = Integer.TYPE;
            constructor = SportTotal.class.getDeclaredConstructor(cls, Float.TYPE, cls, b.f22341c);
            this.f9651d = constructor;
            l.e(constructor, "SportTotal::class.java.g…his.constructorRef = it }");
        }
        SportTotal newInstance = constructor.newInstance(num, valueOf, Integer.valueOf(i10), null);
        l.e(newInstance, "localConstructor.newInst…torMarker */ null\n      )");
        return newInstance;
    }

    @Override // mf.t
    public final void f(e0 e0Var, SportTotal sportTotal) {
        SportTotal sportTotal2 = sportTotal;
        l.f(e0Var, "writer");
        if (sportTotal2 != null) {
            e0Var.b();
            e0Var.s("count");
            fb.b.b(sportTotal2.f9646a, this.f9649b, e0Var, "distance");
            this.f9650c.f(e0Var, Float.valueOf(sportTotal2.f9647b));
            e0Var.k();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }

    public final String toString() {
        return "GeneratedJsonAdapter(SportTotal)";
    }
}
