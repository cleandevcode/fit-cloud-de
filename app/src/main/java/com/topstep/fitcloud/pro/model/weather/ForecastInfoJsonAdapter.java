package com.topstep.fitcloud.pro.model.weather;

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
public final class ForecastInfoJsonAdapter extends t<ForecastInfo> {

    /* renamed from: a */
    public final y.a f9729a;

    /* renamed from: b */
    public final t<Integer> f9730b;

    /* renamed from: c */
    public final t<String> f9731c;

    /* renamed from: d */
    public volatile Constructor<ForecastInfo> f9732d;

    public ForecastInfoJsonAdapter(h0 h0Var) {
        l.f(h0Var, "moshi");
        this.f9729a = y.a.a("min", "max", "code", "codeText");
        Class cls = Integer.TYPE;
        u uVar = u.f28881a;
        this.f9730b = h0Var.c(cls, uVar, "min");
        this.f9731c = h0Var.c(String.class, uVar, "codeText");
    }

    @Override // mf.t
    public final ForecastInfo b(y yVar) {
        l.f(yVar, "reader");
        yVar.b();
        int i10 = -1;
        Integer num = null;
        Integer num2 = null;
        Integer num3 = null;
        String str = null;
        while (yVar.q()) {
            int L = yVar.L(this.f9729a);
            if (L == -1) {
                yVar.R();
                yVar.W();
            } else if (L == 0) {
                num = this.f9730b.b(yVar);
                if (num == null) {
                    throw b.m("min", "min", yVar);
                }
            } else if (L == 1) {
                num2 = this.f9730b.b(yVar);
                if (num2 == null) {
                    throw b.m("max", "max", yVar);
                }
            } else if (L == 2) {
                num3 = this.f9730b.b(yVar);
                if (num3 == null) {
                    throw b.m("code", "code", yVar);
                }
            } else if (L == 3) {
                str = this.f9731c.b(yVar);
                i10 &= -9;
            }
        }
        yVar.j();
        if (i10 == -9) {
            if (num != null) {
                int intValue = num.intValue();
                if (num2 != null) {
                    int intValue2 = num2.intValue();
                    if (num3 != null) {
                        return new ForecastInfo(intValue, str, intValue2, num3.intValue());
                    }
                    throw b.g("code", "code", yVar);
                }
                throw b.g("max", "max", yVar);
            }
            throw b.g("min", "min", yVar);
        }
        Constructor<ForecastInfo> constructor = this.f9732d;
        if (constructor == null) {
            Class cls = Integer.TYPE;
            constructor = ForecastInfo.class.getDeclaredConstructor(cls, cls, cls, String.class, cls, b.f22341c);
            this.f9732d = constructor;
            l.e(constructor, "ForecastInfo::class.java…his.constructorRef = it }");
        }
        Object[] objArr = new Object[6];
        if (num != null) {
            objArr[0] = Integer.valueOf(num.intValue());
            if (num2 != null) {
                objArr[1] = Integer.valueOf(num2.intValue());
                if (num3 != null) {
                    objArr[2] = Integer.valueOf(num3.intValue());
                    objArr[3] = str;
                    objArr[4] = Integer.valueOf(i10);
                    objArr[5] = null;
                    ForecastInfo newInstance = constructor.newInstance(objArr);
                    l.e(newInstance, "localConstructor.newInst…torMarker */ null\n      )");
                    return newInstance;
                }
                throw b.g("code", "code", yVar);
            }
            throw b.g("max", "max", yVar);
        }
        throw b.g("min", "min", yVar);
    }

    @Override // mf.t
    public final void f(e0 e0Var, ForecastInfo forecastInfo) {
        ForecastInfo forecastInfo2 = forecastInfo;
        l.f(e0Var, "writer");
        if (forecastInfo2 != null) {
            e0Var.b();
            e0Var.s("min");
            fb.b.b(forecastInfo2.f9725a, this.f9730b, e0Var, "max");
            fb.b.b(forecastInfo2.f9726b, this.f9730b, e0Var, "code");
            fb.b.b(forecastInfo2.f9727c, this.f9730b, e0Var, "codeText");
            this.f9731c.f(e0Var, forecastInfo2.f9728d);
            e0Var.k();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }

    public final String toString() {
        return "GeneratedJsonAdapter(ForecastInfo)";
    }
}
