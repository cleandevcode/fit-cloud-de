package com.topstep.fitcloud.pro.model.sport.push;

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
public final class SportPacketJsonAdapter extends t<SportPacket> {

    /* renamed from: a */
    public final y.a f9719a;

    /* renamed from: b */
    public final t<Integer> f9720b;

    /* renamed from: c */
    public final t<String> f9721c;

    /* renamed from: d */
    public final t<String> f9722d;

    /* renamed from: e */
    public final t<Long> f9723e;

    /* renamed from: f */
    public volatile Constructor<SportPacket> f9724f;

    public SportPacketJsonAdapter(h0 h0Var) {
        l.f(h0Var, "moshi");
        this.f9719a = y.a.a("sportUiType", "iconUrl", "binUrl", "sportUiName", "sportUiNameCn", "createTime", "binSize");
        Class cls = Integer.TYPE;
        u uVar = u.f28881a;
        this.f9720b = h0Var.c(cls, uVar, "sportUiType");
        this.f9721c = h0Var.c(String.class, uVar, "iconUrl");
        this.f9722d = h0Var.c(String.class, uVar, "binUrl");
        this.f9723e = h0Var.c(Long.TYPE, uVar, "createTime");
    }

    @Override // mf.t
    public final SportPacket b(y yVar) {
        String str;
        l.f(yVar, "reader");
        Long l10 = 0L;
        yVar.b();
        Long l11 = l10;
        int i10 = -1;
        Integer num = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        while (yVar.q()) {
            switch (yVar.L(this.f9719a)) {
                case -1:
                    yVar.R();
                    yVar.W();
                    break;
                case 0:
                    num = this.f9720b.b(yVar);
                    if (num != null) {
                        break;
                    } else {
                        throw b.m("sportUiType", "sportUiType", yVar);
                    }
                case 1:
                    str2 = this.f9721c.b(yVar);
                    i10 &= -3;
                    break;
                case 2:
                    str3 = this.f9722d.b(yVar);
                    if (str3 != null) {
                        break;
                    } else {
                        throw b.m("binUrl", "binUrl", yVar);
                    }
                case 3:
                    str4 = this.f9722d.b(yVar);
                    if (str4 != null) {
                        break;
                    } else {
                        throw b.m("sportUiName", "sportUiName", yVar);
                    }
                case 4:
                    str5 = this.f9722d.b(yVar);
                    if (str5 != null) {
                        break;
                    } else {
                        throw b.m("sportUiNameCn", "sportUiNameCn", yVar);
                    }
                case 5:
                    l10 = this.f9723e.b(yVar);
                    if (l10 != null) {
                        i10 &= -33;
                        break;
                    } else {
                        throw b.m("createTime", "createTime", yVar);
                    }
                case 6:
                    l11 = this.f9723e.b(yVar);
                    if (l11 != null) {
                        i10 &= -65;
                        break;
                    } else {
                        throw b.m("binSize", "binSize", yVar);
                    }
            }
        }
        yVar.j();
        if (i10 == -99) {
            if (num != null) {
                int intValue = num.intValue();
                if (str3 != null) {
                    if (str4 != null) {
                        if (str5 != null) {
                            return new SportPacket(intValue, str2, str3, str4, str5, l10.longValue(), l11.longValue());
                        }
                        throw b.g("sportUiNameCn", "sportUiNameCn", yVar);
                    }
                    throw b.g("sportUiName", "sportUiName", yVar);
                }
                throw b.g("binUrl", "binUrl", yVar);
            }
            throw b.g("sportUiType", "sportUiType", yVar);
        }
        Constructor<SportPacket> constructor = this.f9724f;
        if (constructor == null) {
            str = "binUrl";
            Class cls = Integer.TYPE;
            Class cls2 = Long.TYPE;
            constructor = SportPacket.class.getDeclaredConstructor(cls, String.class, String.class, String.class, String.class, cls2, cls2, cls, b.f22341c);
            this.f9724f = constructor;
            l.e(constructor, "SportPacket::class.java.…his.constructorRef = it }");
        } else {
            str = "binUrl";
        }
        Object[] objArr = new Object[9];
        if (num != null) {
            objArr[0] = Integer.valueOf(num.intValue());
            objArr[1] = str2;
            if (str3 == null) {
                String str6 = str;
                throw b.g(str6, str6, yVar);
            }
            objArr[2] = str3;
            if (str4 != null) {
                objArr[3] = str4;
                if (str5 != null) {
                    objArr[4] = str5;
                    objArr[5] = l10;
                    objArr[6] = l11;
                    objArr[7] = Integer.valueOf(i10);
                    objArr[8] = null;
                    SportPacket newInstance = constructor.newInstance(objArr);
                    l.e(newInstance, "localConstructor.newInst…torMarker */ null\n      )");
                    return newInstance;
                }
                throw b.g("sportUiNameCn", "sportUiNameCn", yVar);
            }
            throw b.g("sportUiName", "sportUiName", yVar);
        }
        throw b.g("sportUiType", "sportUiType", yVar);
    }

    @Override // mf.t
    public final void f(e0 e0Var, SportPacket sportPacket) {
        SportPacket sportPacket2 = sportPacket;
        l.f(e0Var, "writer");
        if (sportPacket2 == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        e0Var.b();
        e0Var.s("sportUiType");
        this.f9720b.f(e0Var, Integer.valueOf(sportPacket2.getSportUiType()));
        e0Var.s("iconUrl");
        this.f9721c.f(e0Var, sportPacket2.getIconUrl());
        e0Var.s("binUrl");
        this.f9722d.f(e0Var, sportPacket2.getBinUrl());
        e0Var.s("sportUiName");
        this.f9722d.f(e0Var, sportPacket2.getSportUiName());
        e0Var.s("sportUiNameCn");
        this.f9722d.f(e0Var, sportPacket2.getSportUiNameCn());
        e0Var.s("createTime");
        this.f9723e.f(e0Var, Long.valueOf(sportPacket2.getCreateTime()));
        e0Var.s("binSize");
        this.f9723e.f(e0Var, Long.valueOf(sportPacket2.getBinSize()));
        e0Var.k();
    }

    public final String toString() {
        return "GeneratedJsonAdapter(SportPacket)";
    }
}
