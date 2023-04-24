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
public final class SportLatLngJsonAdapter extends t<SportLatLng> {

    /* renamed from: a */
    public final y.a f9623a;

    /* renamed from: b */
    public final t<Double> f9624b;

    /* renamed from: c */
    public final t<Long> f9625c;

    /* renamed from: d */
    public final t<Integer> f9626d;

    public SportLatLngJsonAdapter(h0 h0Var) {
        l.f(h0Var, "moshi");
        this.f9623a = y.a.a("lat", "lng", "timestamp", "duration", "isRestart");
        Class cls = Double.TYPE;
        u uVar = u.f28881a;
        this.f9624b = h0Var.c(cls, uVar, "lat");
        this.f9625c = h0Var.c(Long.TYPE, uVar, "timestamp");
        this.f9626d = h0Var.c(Integer.TYPE, uVar, "duration");
    }

    @Override // mf.t
    public final SportLatLng b(y yVar) {
        l.f(yVar, "reader");
        yVar.b();
        Double d10 = null;
        Double d11 = null;
        Long l10 = null;
        Integer num = null;
        Integer num2 = null;
        while (yVar.q()) {
            int L = yVar.L(this.f9623a);
            if (L == -1) {
                yVar.R();
                yVar.W();
            } else if (L == 0) {
                d10 = this.f9624b.b(yVar);
                if (d10 == null) {
                    throw b.m("lat", "lat", yVar);
                }
            } else if (L == 1) {
                d11 = this.f9624b.b(yVar);
                if (d11 == null) {
                    throw b.m("lng", "lng", yVar);
                }
            } else if (L == 2) {
                l10 = this.f9625c.b(yVar);
                if (l10 == null) {
                    throw b.m("timestamp", "timestamp", yVar);
                }
            } else if (L == 3) {
                num = this.f9626d.b(yVar);
                if (num == null) {
                    throw b.m("duration", "duration", yVar);
                }
            } else if (L == 4 && (num2 = this.f9626d.b(yVar)) == null) {
                throw b.m("isRestart", "isRestart", yVar);
            }
        }
        yVar.j();
        if (d10 != null) {
            double doubleValue = d10.doubleValue();
            if (d11 != null) {
                double doubleValue2 = d11.doubleValue();
                if (l10 != null) {
                    long longValue = l10.longValue();
                    if (num != null) {
                        int intValue = num.intValue();
                        if (num2 != null) {
                            return new SportLatLng(doubleValue, doubleValue2, longValue, intValue, num2.intValue());
                        }
                        throw b.g("isRestart", "isRestart", yVar);
                    }
                    throw b.g("duration", "duration", yVar);
                }
                throw b.g("timestamp", "timestamp", yVar);
            }
            throw b.g("lng", "lng", yVar);
        }
        throw b.g("lat", "lat", yVar);
    }

    @Override // mf.t
    public final void f(e0 e0Var, SportLatLng sportLatLng) {
        SportLatLng sportLatLng2 = sportLatLng;
        l.f(e0Var, "writer");
        if (sportLatLng2 != null) {
            e0Var.b();
            e0Var.s("lat");
            this.f9624b.f(e0Var, Double.valueOf(sportLatLng2.f9618a));
            e0Var.s("lng");
            this.f9624b.f(e0Var, Double.valueOf(sportLatLng2.f9619b));
            e0Var.s("timestamp");
            this.f9625c.f(e0Var, Long.valueOf(sportLatLng2.f9620c));
            e0Var.s("duration");
            fb.b.b(sportLatLng2.f9621d, this.f9626d, e0Var, "isRestart");
            this.f9626d.f(e0Var, Integer.valueOf(sportLatLng2.f9622e));
            e0Var.k();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }

    public final String toString() {
        return "GeneratedJsonAdapter(SportLatLng)";
    }
}
