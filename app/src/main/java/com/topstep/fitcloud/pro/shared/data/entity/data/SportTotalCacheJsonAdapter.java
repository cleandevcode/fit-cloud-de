package com.topstep.fitcloud.pro.shared.data.entity.data;

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
public final class SportTotalCacheJsonAdapter extends t<SportTotalCache> {

    /* renamed from: a */
    public final y.a f10083a;

    /* renamed from: b */
    public final t<Integer> f10084b;

    /* renamed from: c */
    public final t<Float> f10085c;

    /* renamed from: d */
    public final t<Long> f10086d;

    /* renamed from: e */
    public volatile Constructor<SportTotalCache> f10087e;

    public SportTotalCacheJsonAdapter(h0 h0Var) {
        l.f(h0Var, "moshi");
        this.f10083a = y.a.a("count", "distance", "dirty", "syncSuccessTime");
        Class cls = Integer.TYPE;
        u uVar = u.f28881a;
        this.f10084b = h0Var.c(cls, uVar, "count");
        this.f10085c = h0Var.c(Float.TYPE, uVar, "distance");
        this.f10086d = h0Var.c(Long.TYPE, uVar, "syncSuccessTime");
    }

    @Override // mf.t
    public final SportTotalCache b(y yVar) {
        l.f(yVar, "reader");
        Integer num = 0;
        Float valueOf = Float.valueOf(0.0f);
        yVar.b();
        int i10 = -1;
        Integer num2 = null;
        Long l10 = null;
        while (yVar.q()) {
            int L = yVar.L(this.f10083a);
            if (L == -1) {
                yVar.R();
                yVar.W();
            } else if (L == 0) {
                num = this.f10084b.b(yVar);
                if (num == null) {
                    throw b.m("count", "count", yVar);
                }
                i10 &= -2;
            } else if (L == 1) {
                valueOf = this.f10085c.b(yVar);
                if (valueOf == null) {
                    throw b.m("distance", "distance", yVar);
                }
                i10 &= -3;
            } else if (L == 2) {
                num2 = this.f10084b.b(yVar);
                if (num2 == null) {
                    throw b.m("dirty", "dirty", yVar);
                }
            } else if (L == 3 && (l10 = this.f10086d.b(yVar)) == null) {
                throw b.m("syncSuccessTime", "syncSuccessTime", yVar);
            }
        }
        yVar.j();
        if (i10 == -4) {
            int intValue = num.intValue();
            float floatValue = valueOf.floatValue();
            if (num2 != null) {
                int intValue2 = num2.intValue();
                if (l10 != null) {
                    return new SportTotalCache(floatValue, intValue, intValue2, l10.longValue());
                }
                throw b.g("syncSuccessTime", "syncSuccessTime", yVar);
            }
            throw b.g("dirty", "dirty", yVar);
        }
        Constructor<SportTotalCache> constructor = this.f10087e;
        if (constructor == null) {
            Class cls = Integer.TYPE;
            constructor = SportTotalCache.class.getDeclaredConstructor(cls, Float.TYPE, cls, Long.TYPE, cls, b.f22341c);
            this.f10087e = constructor;
            l.e(constructor, "SportTotalCache::class.j…his.constructorRef = it }");
        }
        Object[] objArr = new Object[6];
        objArr[0] = num;
        objArr[1] = valueOf;
        if (num2 != null) {
            objArr[2] = Integer.valueOf(num2.intValue());
            if (l10 != null) {
                objArr[3] = Long.valueOf(l10.longValue());
                objArr[4] = Integer.valueOf(i10);
                objArr[5] = null;
                SportTotalCache newInstance = constructor.newInstance(objArr);
                l.e(newInstance, "localConstructor.newInst…torMarker */ null\n      )");
                return newInstance;
            }
            throw b.g("syncSuccessTime", "syncSuccessTime", yVar);
        }
        throw b.g("dirty", "dirty", yVar);
    }

    @Override // mf.t
    public final void f(e0 e0Var, SportTotalCache sportTotalCache) {
        SportTotalCache sportTotalCache2 = sportTotalCache;
        l.f(e0Var, "writer");
        if (sportTotalCache2 != null) {
            e0Var.b();
            e0Var.s("count");
            fb.b.b(sportTotalCache2.f10079a, this.f10084b, e0Var, "distance");
            this.f10085c.f(e0Var, Float.valueOf(sportTotalCache2.f10080b));
            e0Var.s("dirty");
            fb.b.b(sportTotalCache2.f10081c, this.f10084b, e0Var, "syncSuccessTime");
            this.f10086d.f(e0Var, Long.valueOf(sportTotalCache2.f10082d));
            e0Var.k();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }

    public final String toString() {
        return "GeneratedJsonAdapter(SportTotalCache)";
    }
}
