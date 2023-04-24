package com.topstep.fitcloud.pro.shared.data.entity.data;

import com.topstep.fitcloud.pro.model.data.SportGoal;
import gm.l;
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
public final class SportGoalCacheJsonAdapter extends t<SportGoalCache> {

    /* renamed from: a */
    public final y.a f10075a;

    /* renamed from: b */
    public final t<List<SportGoal>> f10076b;

    /* renamed from: c */
    public final t<Integer> f10077c;

    /* renamed from: d */
    public final t<Long> f10078d;

    public SportGoalCacheJsonAdapter(h0 h0Var) {
        l.f(h0Var, "moshi");
        this.f10075a = y.a.a("goals", "dirty", "syncSuccessTime");
        b.C0392b d10 = l0.d(List.class, SportGoal.class);
        u uVar = u.f28881a;
        this.f10076b = h0Var.c(d10, uVar, "goals");
        this.f10077c = h0Var.c(Integer.TYPE, uVar, "dirty");
        this.f10078d = h0Var.c(Long.TYPE, uVar, "syncSuccessTime");
    }

    @Override // mf.t
    public final SportGoalCache b(y yVar) {
        l.f(yVar, "reader");
        yVar.b();
        Integer num = null;
        Long l10 = null;
        List<SportGoal> list = null;
        while (yVar.q()) {
            int L = yVar.L(this.f10075a);
            if (L == -1) {
                yVar.R();
                yVar.W();
            } else if (L == 0) {
                list = this.f10076b.b(yVar);
            } else if (L == 1) {
                num = this.f10077c.b(yVar);
                if (num == null) {
                    throw b.m("dirty", "dirty", yVar);
                }
            } else if (L == 2 && (l10 = this.f10078d.b(yVar)) == null) {
                throw b.m("syncSuccessTime", "syncSuccessTime", yVar);
            }
        }
        yVar.j();
        if (num != null) {
            int intValue = num.intValue();
            if (l10 != null) {
                return new SportGoalCache(intValue, l10.longValue(), list);
            }
            throw b.g("syncSuccessTime", "syncSuccessTime", yVar);
        }
        throw b.g("dirty", "dirty", yVar);
    }

    @Override // mf.t
    public final void f(e0 e0Var, SportGoalCache sportGoalCache) {
        SportGoalCache sportGoalCache2 = sportGoalCache;
        l.f(e0Var, "writer");
        if (sportGoalCache2 != null) {
            e0Var.b();
            e0Var.s("goals");
            this.f10076b.f(e0Var, sportGoalCache2.f10072a);
            e0Var.s("dirty");
            fb.b.b(sportGoalCache2.f10073b, this.f10077c, e0Var, "syncSuccessTime");
            this.f10078d.f(e0Var, Long.valueOf(sportGoalCache2.f10074c));
            e0Var.k();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }

    public final String toString() {
        return "GeneratedJsonAdapter(SportGoalCache)";
    }
}
