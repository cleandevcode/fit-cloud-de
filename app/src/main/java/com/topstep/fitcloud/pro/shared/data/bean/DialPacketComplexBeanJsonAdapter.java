package com.topstep.fitcloud.pro.shared.data.bean;

import com.topstep.fitcloud.pro.shared.data.bean.DialPacketComplexBean;
import gm.l;
import java.lang.reflect.Constructor;
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
public final class DialPacketComplexBeanJsonAdapter extends t<DialPacketComplexBean> {

    /* renamed from: a */
    public final y.a f9791a;

    /* renamed from: b */
    public final t<Integer> f9792b;

    /* renamed from: c */
    public final t<String> f9793c;

    /* renamed from: d */
    public final t<String> f9794d;

    /* renamed from: e */
    public final t<Long> f9795e;

    /* renamed from: f */
    public final t<List<DialPacketComplexBean.Component>> f9796f;

    /* renamed from: g */
    public volatile Constructor<DialPacketComplexBean> f9797g;

    public DialPacketComplexBeanJsonAdapter(h0 h0Var) {
        l.f(h0Var, "moshi");
        this.f9791a = y.a.a("dialNum", "lcd", "toolVersion", "binVersion", "imgUrl", "deviceImgUrl", "binUrl", "name", "binSize", "downloadCount", "hasComponent", "previewImgUrl", "components");
        Class cls = Integer.TYPE;
        u uVar = u.f28881a;
        this.f9792b = h0Var.c(cls, uVar, "dialNum");
        this.f9793c = h0Var.c(String.class, uVar, "toolVersion");
        this.f9794d = h0Var.c(String.class, uVar, "imgUrl");
        this.f9795e = h0Var.c(Long.TYPE, uVar, "binSize");
        this.f9796f = h0Var.c(l0.d(List.class, DialPacketComplexBean.Component.class), uVar, "components");
    }

    @Override // mf.t
    public final DialPacketComplexBean b(y yVar) {
        String str;
        int i10;
        int i11;
        Class<String> cls = String.class;
        l.f(yVar, "reader");
        Long l10 = 0L;
        Integer num = 0;
        yVar.b();
        Integer num2 = num;
        int i12 = -1;
        Integer num3 = null;
        Integer num4 = null;
        Integer num5 = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        List<DialPacketComplexBean.Component> list = null;
        while (true) {
            Class<String> cls2 = cls;
            if (!yVar.q()) {
                yVar.j();
                if (i12 == -8113) {
                    if (num3 != null) {
                        int intValue = num3.intValue();
                        if (num4 != null) {
                            int intValue2 = num4.intValue();
                            if (str2 != null) {
                                if (num5 != null) {
                                    int intValue3 = num5.intValue();
                                    if (str5 != null) {
                                        return new DialPacketComplexBean(intValue, intValue2, str2, intValue3, str3, str4, str5, str6, l10.longValue(), num.intValue(), num2.intValue(), str7, list);
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
                Constructor<DialPacketComplexBean> constructor = this.f9797g;
                if (constructor == null) {
                    str = "lcd";
                    Class cls3 = Integer.TYPE;
                    constructor = DialPacketComplexBean.class.getDeclaredConstructor(cls3, cls3, cls2, cls3, cls2, cls2, cls2, cls2, Long.TYPE, cls3, cls3, cls2, List.class, cls3, b.f22341c);
                    this.f9797g = constructor;
                    l.e(constructor, "DialPacketComplexBean::c…his.constructorRef = it }");
                } else {
                    str = "lcd";
                }
                Object[] objArr = new Object[15];
                if (num3 != null) {
                    objArr[0] = Integer.valueOf(num3.intValue());
                    if (num4 == null) {
                        String str8 = str;
                        throw b.g(str8, str8, yVar);
                    }
                    objArr[1] = Integer.valueOf(num4.intValue());
                    if (str2 != null) {
                        objArr[2] = str2;
                        if (num5 != null) {
                            objArr[3] = Integer.valueOf(num5.intValue());
                            objArr[4] = str3;
                            objArr[5] = str4;
                            if (str5 != null) {
                                objArr[6] = str5;
                                objArr[7] = str6;
                                objArr[8] = l10;
                                objArr[9] = num;
                                objArr[10] = num2;
                                objArr[11] = str7;
                                objArr[12] = list;
                                objArr[13] = Integer.valueOf(i12);
                                objArr[14] = null;
                                DialPacketComplexBean newInstance = constructor.newInstance(objArr);
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
            switch (yVar.L(this.f9791a)) {
                case -1:
                    yVar.R();
                    yVar.W();
                    break;
                case 0:
                    num3 = this.f9792b.b(yVar);
                    if (num3 != null) {
                        break;
                    } else {
                        throw b.m("dialNum", "dialNum", yVar);
                    }
                case 1:
                    num4 = this.f9792b.b(yVar);
                    if (num4 != null) {
                        break;
                    } else {
                        throw b.m("lcd", "lcd", yVar);
                    }
                case 2:
                    str2 = this.f9793c.b(yVar);
                    if (str2 != null) {
                        break;
                    } else {
                        throw b.m("toolVersion", "toolVersion", yVar);
                    }
                case 3:
                    num5 = this.f9792b.b(yVar);
                    if (num5 != null) {
                        break;
                    } else {
                        throw b.m("binVersion", "binVersion", yVar);
                    }
                case 4:
                    str3 = this.f9794d.b(yVar);
                    i10 = i12 & (-17);
                    i12 = i10;
                    break;
                case 5:
                    str4 = this.f9794d.b(yVar);
                    i10 = i12 & (-33);
                    i12 = i10;
                    break;
                case 6:
                    str5 = this.f9793c.b(yVar);
                    if (str5 != null) {
                        break;
                    } else {
                        throw b.m("binUrl", "binUrl", yVar);
                    }
                case 7:
                    str6 = this.f9794d.b(yVar);
                    i10 = i12 & (-129);
                    i12 = i10;
                    break;
                case 8:
                    Long b10 = this.f9795e.b(yVar);
                    if (b10 != null) {
                        i12 &= -257;
                        l10 = b10;
                        break;
                    } else {
                        throw b.m("binSize", "binSize", yVar);
                    }
                case 9:
                    Integer b11 = this.f9792b.b(yVar);
                    if (b11 != null) {
                        i11 = i12 & (-513);
                        num = b11;
                        i12 = i11;
                        break;
                    } else {
                        throw b.m("downloadCount", "downloadCount", yVar);
                    }
                case 10:
                    Integer b12 = this.f9792b.b(yVar);
                    if (b12 != null) {
                        i11 = i12 & (-1025);
                        num2 = b12;
                        i12 = i11;
                        break;
                    } else {
                        throw b.m("hasComponent", "hasComponent", yVar);
                    }
                case 11:
                    str7 = this.f9794d.b(yVar);
                    i10 = i12 & (-2049);
                    i12 = i10;
                    break;
                case 12:
                    list = this.f9796f.b(yVar);
                    i10 = i12 & (-4097);
                    i12 = i10;
                    break;
            }
            cls = cls2;
        }
    }

    @Override // mf.t
    public final void f(e0 e0Var, DialPacketComplexBean dialPacketComplexBean) {
        DialPacketComplexBean dialPacketComplexBean2 = dialPacketComplexBean;
        l.f(e0Var, "writer");
        if (dialPacketComplexBean2 != null) {
            e0Var.b();
            e0Var.s("dialNum");
            fb.b.b(dialPacketComplexBean2.f9777a, this.f9792b, e0Var, "lcd");
            fb.b.b(dialPacketComplexBean2.f9778b, this.f9792b, e0Var, "toolVersion");
            this.f9793c.f(e0Var, dialPacketComplexBean2.f9779c);
            e0Var.s("binVersion");
            fb.b.b(dialPacketComplexBean2.f9780d, this.f9792b, e0Var, "imgUrl");
            this.f9794d.f(e0Var, dialPacketComplexBean2.f9781e);
            e0Var.s("deviceImgUrl");
            this.f9794d.f(e0Var, dialPacketComplexBean2.f9782f);
            e0Var.s("binUrl");
            this.f9793c.f(e0Var, dialPacketComplexBean2.f9783g);
            e0Var.s("name");
            this.f9794d.f(e0Var, dialPacketComplexBean2.f9784h);
            e0Var.s("binSize");
            this.f9795e.f(e0Var, Long.valueOf(dialPacketComplexBean2.f9785i));
            e0Var.s("downloadCount");
            fb.b.b(dialPacketComplexBean2.f9786j, this.f9792b, e0Var, "hasComponent");
            fb.b.b(dialPacketComplexBean2.f9787k, this.f9792b, e0Var, "previewImgUrl");
            this.f9794d.f(e0Var, dialPacketComplexBean2.f9788l);
            e0Var.s("components");
            this.f9796f.f(e0Var, dialPacketComplexBean2.f9789m);
            e0Var.k();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }

    public final String toString() {
        return "GeneratedJsonAdapter(DialPacketComplexBean)";
    }
}
