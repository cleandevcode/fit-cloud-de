package com.topstep.fitcloud.pro.model.dial;

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
public final class DialPacketJsonAdapter extends t<DialPacket> {

    /* renamed from: a */
    public final y.a f9662a;

    /* renamed from: b */
    public final t<Integer> f9663b;

    /* renamed from: c */
    public final t<String> f9664c;

    /* renamed from: d */
    public final t<String> f9665d;

    /* renamed from: e */
    public final t<Long> f9666e;

    /* renamed from: f */
    public volatile Constructor<DialPacket> f9667f;

    public DialPacketJsonAdapter(h0 h0Var) {
        l.f(h0Var, "moshi");
        this.f9662a = y.a.a("dialNum", "lcd", "toolVersion", "binVersion", "imgUrl", "deviceImgUrl", "binUrl", "name", "binSize", "downloadCount");
        Class cls = Integer.TYPE;
        u uVar = u.f28881a;
        this.f9663b = h0Var.c(cls, uVar, "dialNum");
        this.f9664c = h0Var.c(String.class, uVar, "toolVersion");
        this.f9665d = h0Var.c(String.class, uVar, "imgUrl");
        this.f9666e = h0Var.c(Long.TYPE, uVar, "binSize");
    }

    @Override // mf.t
    public final DialPacket b(y yVar) {
        String str;
        int i10;
        Class<String> cls = String.class;
        l.f(yVar, "reader");
        Long l10 = 0L;
        Integer num = 0;
        yVar.b();
        int i11 = -1;
        Integer num2 = null;
        Integer num3 = null;
        Integer num4 = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        while (true) {
            Class<String> cls2 = cls;
            if (!yVar.q()) {
                yVar.j();
                if (i11 == -945) {
                    if (num2 != null) {
                        int intValue = num2.intValue();
                        if (num3 != null) {
                            int intValue2 = num3.intValue();
                            if (str2 != null) {
                                if (num4 != null) {
                                    int intValue3 = num4.intValue();
                                    if (str5 != null) {
                                        return new DialPacket(intValue, intValue2, str2, intValue3, str3, str4, str5, str6, l10.longValue(), num.intValue());
                                    }
                                    throw b.g("binUrl", "binUrl", yVar);
                                }
                                throw b.g("binVersion", "binVersion", yVar);
                            }
                            throw b.g("toolVersion", "toolVersion", yVar);
                        }
                        throw b.g("lcd", "lcd", yVar);
                    }
                    throw b.g("dialNum", "dialNum", yVar);
                }
                Constructor<DialPacket> constructor = this.f9667f;
                if (constructor == null) {
                    str = "lcd";
                    Class cls3 = Integer.TYPE;
                    constructor = DialPacket.class.getDeclaredConstructor(cls3, cls3, cls2, cls3, cls2, cls2, cls2, cls2, Long.TYPE, cls3, cls3, b.f22341c);
                    this.f9667f = constructor;
                    l.e(constructor, "DialPacket::class.java.g…his.constructorRef = it }");
                } else {
                    str = "lcd";
                }
                Object[] objArr = new Object[12];
                if (num2 != null) {
                    objArr[0] = Integer.valueOf(num2.intValue());
                    if (num3 == null) {
                        String str7 = str;
                        throw b.g(str7, str7, yVar);
                    }
                    objArr[1] = Integer.valueOf(num3.intValue());
                    if (str2 != null) {
                        objArr[2] = str2;
                        if (num4 != null) {
                            objArr[3] = Integer.valueOf(num4.intValue());
                            objArr[4] = str3;
                            objArr[5] = str4;
                            if (str5 != null) {
                                objArr[6] = str5;
                                objArr[7] = str6;
                                objArr[8] = l10;
                                objArr[9] = num;
                                objArr[10] = Integer.valueOf(i11);
                                objArr[11] = null;
                                DialPacket newInstance = constructor.newInstance(objArr);
                                l.e(newInstance, "localConstructor.newInst…torMarker */ null\n      )");
                                return newInstance;
                            }
                            throw b.g("binUrl", "binUrl", yVar);
                        }
                        throw b.g("binVersion", "binVersion", yVar);
                    }
                    throw b.g("toolVersion", "toolVersion", yVar);
                }
                throw b.g("dialNum", "dialNum", yVar);
            }
            switch (yVar.L(this.f9662a)) {
                case -1:
                    yVar.R();
                    yVar.W();
                    continue;
                    cls = cls2;
                case 0:
                    num2 = this.f9663b.b(yVar);
                    if (num2 == null) {
                        throw b.m("dialNum", "dialNum", yVar);
                    }
                    continue;
                    cls = cls2;
                case 1:
                    num3 = this.f9663b.b(yVar);
                    if (num3 == null) {
                        throw b.m("lcd", "lcd", yVar);
                    }
                    continue;
                    cls = cls2;
                case 2:
                    str2 = this.f9664c.b(yVar);
                    if (str2 == null) {
                        throw b.m("toolVersion", "toolVersion", yVar);
                    }
                    continue;
                    cls = cls2;
                case 3:
                    num4 = this.f9663b.b(yVar);
                    if (num4 == null) {
                        throw b.m("binVersion", "binVersion", yVar);
                    }
                    continue;
                    cls = cls2;
                case 4:
                    str3 = this.f9665d.b(yVar);
                    i10 = i11 & (-17);
                    break;
                case 5:
                    str4 = this.f9665d.b(yVar);
                    i10 = i11 & (-33);
                    break;
                case 6:
                    str5 = this.f9664c.b(yVar);
                    if (str5 == null) {
                        throw b.m("binUrl", "binUrl", yVar);
                    }
                    continue;
                    cls = cls2;
                case 7:
                    str6 = this.f9665d.b(yVar);
                    i10 = i11 & (-129);
                    break;
                case 8:
                    Long b10 = this.f9666e.b(yVar);
                    if (b10 == null) {
                        throw b.m("binSize", "binSize", yVar);
                    }
                    i11 &= -257;
                    l10 = b10;
                    continue;
                    cls = cls2;
                case 9:
                    Integer b11 = this.f9663b.b(yVar);
                    if (b11 == null) {
                        throw b.m("downloadCount", "downloadCount", yVar);
                    }
                    num = b11;
                    i11 &= -513;
                    continue;
                    cls = cls2;
                default:
                    cls = cls2;
            }
            i11 = i10;
            cls = cls2;
        }
    }

    @Override // mf.t
    public final void f(e0 e0Var, DialPacket dialPacket) {
        DialPacket dialPacket2 = dialPacket;
        l.f(e0Var, "writer");
        if (dialPacket2 == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        e0Var.b();
        e0Var.s("dialNum");
        this.f9663b.f(e0Var, Integer.valueOf(dialPacket2.getDialNum()));
        e0Var.s("lcd");
        this.f9663b.f(e0Var, Integer.valueOf(dialPacket2.getLcd()));
        e0Var.s("toolVersion");
        this.f9664c.f(e0Var, dialPacket2.getToolVersion());
        e0Var.s("binVersion");
        this.f9663b.f(e0Var, Integer.valueOf(dialPacket2.getBinVersion()));
        e0Var.s("imgUrl");
        this.f9665d.f(e0Var, dialPacket2.getImgUrl());
        e0Var.s("deviceImgUrl");
        this.f9665d.f(e0Var, dialPacket2.getDeviceImgUrl());
        e0Var.s("binUrl");
        this.f9664c.f(e0Var, dialPacket2.getBinUrl());
        e0Var.s("name");
        this.f9665d.f(e0Var, dialPacket2.getName());
        e0Var.s("binSize");
        this.f9666e.f(e0Var, Long.valueOf(dialPacket2.getBinSize()));
        e0Var.s("downloadCount");
        this.f9663b.f(e0Var, Integer.valueOf(dialPacket2.getDownloadCount()));
        e0Var.k();
    }

    public final String toString() {
        return "GeneratedJsonAdapter(DialPacket)";
    }
}
