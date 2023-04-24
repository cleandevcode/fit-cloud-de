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
public final class SportGoalJsonAdapter extends t<SportGoal> {

    /* renamed from: a */
    public final y.a f9610a;

    /* renamed from: b */
    public final t<Integer> f9611b;

    /* renamed from: c */
    public final t<Float> f9612c;

    /* renamed from: d */
    public volatile Constructor<SportGoal> f9613d;

    public SportGoalJsonAdapter(h0 h0Var) {
        l.f(h0Var, "moshi");
        this.f9610a = y.a.a("sportType", "goalType", "goalDistance", "goalTime");
        Class cls = Integer.TYPE;
        u uVar = u.f28881a;
        this.f9611b = h0Var.c(cls, uVar, "sportType");
        this.f9612c = h0Var.c(Float.TYPE, uVar, "goalDistance");
    }

    @Override // mf.t
    public final SportGoal b(y yVar) {
        l.f(yVar, "reader");
        Integer num = 0;
        Float valueOf = Float.valueOf(0.0f);
        yVar.b();
        Float f10 = valueOf;
        int i10 = -1;
        Integer num2 = null;
        Integer num3 = num;
        while (yVar.q()) {
            int L = yVar.L(this.f9610a);
            if (L == -1) {
                yVar.R();
                yVar.W();
            } else if (L == 0) {
                num2 = this.f9611b.b(yVar);
                if (num2 == null) {
                    throw b.m("sportType", "sportType", yVar);
                }
            } else if (L == 1) {
                num = this.f9611b.b(yVar);
                if (num == null) {
                    throw b.m("goalType", "goalType", yVar);
                }
                i10 &= -3;
            } else if (L == 2) {
                f10 = this.f9612c.b(yVar);
                if (f10 == null) {
                    throw b.m("goalDistance", "goalDistance", yVar);
                }
                i10 &= -5;
            } else if (L == 3) {
                num3 = this.f9611b.b(yVar);
                if (num3 == null) {
                    throw b.m("goalTime", "goalTime", yVar);
                }
                i10 &= -9;
            } else {
                continue;
            }
        }
        yVar.j();
        if (i10 == -15) {
            if (num2 != null) {
                return new SportGoal(num2.intValue(), num.intValue(), num3.intValue(), f10.floatValue());
            }
            throw b.g("sportType", "sportType", yVar);
        }
        Constructor<SportGoal> constructor = this.f9613d;
        if (constructor == null) {
            Class cls = Integer.TYPE;
            constructor = SportGoal.class.getDeclaredConstructor(cls, cls, Float.TYPE, cls, cls, b.f22341c);
            this.f9613d = constructor;
            l.e(constructor, "SportGoal::class.java.ge…his.constructorRef = it }");
        }
        Object[] objArr = new Object[6];
        if (num2 != null) {
            objArr[0] = Integer.valueOf(num2.intValue());
            objArr[1] = num;
            objArr[2] = f10;
            objArr[3] = num3;
            objArr[4] = Integer.valueOf(i10);
            objArr[5] = null;
            SportGoal newInstance = constructor.newInstance(objArr);
            l.e(newInstance, "localConstructor.newInst…torMarker */ null\n      )");
            return newInstance;
        }
        throw b.g("sportType", "sportType", yVar);
    }

    @Override // mf.t
    public final void f(e0 e0Var, SportGoal sportGoal) {
        SportGoal sportGoal2 = sportGoal;
        l.f(e0Var, "writer");
        if (sportGoal2 != null) {
            e0Var.b();
            e0Var.s("sportType");
            fb.b.b(sportGoal2.f9606a, this.f9611b, e0Var, "goalType");
            fb.b.b(sportGoal2.f9607b, this.f9611b, e0Var, "goalDistance");
            this.f9612c.f(e0Var, Float.valueOf(sportGoal2.f9608c));
            e0Var.s("goalTime");
            this.f9611b.f(e0Var, Integer.valueOf(sportGoal2.f9609d));
            e0Var.k();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }

    public final String toString() {
        return "GeneratedJsonAdapter(SportGoal)";
    }
}
