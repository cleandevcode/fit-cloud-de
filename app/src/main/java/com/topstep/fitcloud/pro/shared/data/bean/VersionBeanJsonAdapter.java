package com.topstep.fitcloud.pro.shared.data.bean;

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
public final class VersionBeanJsonAdapter extends t<VersionBean> {

    /* renamed from: a */
    public final y.a f9856a;

    /* renamed from: b */
    public final t<String> f9857b;

    /* renamed from: c */
    public final t<Long> f9858c;

    /* renamed from: d */
    public final t<Boolean> f9859d;

    /* renamed from: e */
    public volatile Constructor<VersionBean> f9860e;

    public VersionBeanJsonAdapter(h0 h0Var) {
        l.f(h0Var, "moshi");
        this.f9856a = y.a.a("androidVersion", "androidRemark", "hardwareInfo", "hardwareRemark", "hardwareUrl", "hardwareType", "hardwareSize", "forceUpgrade", "uiVersionScope", "appNumScope");
        u uVar = u.f28881a;
        this.f9857b = h0Var.c(String.class, uVar, "androidVersion");
        this.f9858c = h0Var.c(Long.TYPE, uVar, "hardwareSize");
        this.f9859d = h0Var.c(Boolean.TYPE, uVar, "isHardwareForce");
    }

    @Override // mf.t
    public final VersionBean b(y yVar) {
        l.f(yVar, "reader");
        Long l10 = 0L;
        Boolean bool = Boolean.FALSE;
        yVar.b();
        int i10 = -1;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        String str8 = null;
        while (yVar.q()) {
            switch (yVar.L(this.f9856a)) {
                case -1:
                    yVar.R();
                    yVar.W();
                    break;
                case 0:
                    str = this.f9857b.b(yVar);
                    break;
                case 1:
                    str2 = this.f9857b.b(yVar);
                    break;
                case 2:
                    str3 = this.f9857b.b(yVar);
                    break;
                case 3:
                    str4 = this.f9857b.b(yVar);
                    break;
                case 4:
                    str5 = this.f9857b.b(yVar);
                    break;
                case 5:
                    str6 = this.f9857b.b(yVar);
                    break;
                case 6:
                    l10 = this.f9858c.b(yVar);
                    if (l10 != null) {
                        i10 &= -65;
                        break;
                    } else {
                        throw b.m("hardwareSize", "hardwareSize", yVar);
                    }
                case 7:
                    bool = this.f9859d.b(yVar);
                    if (bool != null) {
                        i10 &= -129;
                        break;
                    } else {
                        throw b.m("isHardwareForce", "forceUpgrade", yVar);
                    }
                case 8:
                    str7 = this.f9857b.b(yVar);
                    i10 &= -257;
                    break;
                case 9:
                    str8 = this.f9857b.b(yVar);
                    i10 &= -513;
                    break;
            }
        }
        yVar.j();
        if (i10 == -961) {
            return new VersionBean(str, str2, str3, str4, str5, str6, l10.longValue(), bool.booleanValue(), str7, str8);
        }
        Constructor<VersionBean> constructor = this.f9860e;
        if (constructor == null) {
            constructor = VersionBean.class.getDeclaredConstructor(String.class, String.class, String.class, String.class, String.class, String.class, Long.TYPE, Boolean.TYPE, String.class, String.class, Integer.TYPE, b.f22341c);
            this.f9860e = constructor;
            l.e(constructor, "VersionBean::class.java.…his.constructorRef = it }");
        }
        VersionBean newInstance = constructor.newInstance(str, str2, str3, str4, str5, str6, l10, bool, str7, str8, Integer.valueOf(i10), null);
        l.e(newInstance, "localConstructor.newInst…torMarker */ null\n      )");
        return newInstance;
    }

    @Override // mf.t
    public final void f(e0 e0Var, VersionBean versionBean) {
        VersionBean versionBean2 = versionBean;
        l.f(e0Var, "writer");
        if (versionBean2 != null) {
            e0Var.b();
            e0Var.s("androidVersion");
            this.f9857b.f(e0Var, versionBean2.f9846a);
            e0Var.s("androidRemark");
            this.f9857b.f(e0Var, versionBean2.f9847b);
            e0Var.s("hardwareInfo");
            this.f9857b.f(e0Var, versionBean2.f9848c);
            e0Var.s("hardwareRemark");
            this.f9857b.f(e0Var, versionBean2.f9849d);
            e0Var.s("hardwareUrl");
            this.f9857b.f(e0Var, versionBean2.f9850e);
            e0Var.s("hardwareType");
            this.f9857b.f(e0Var, versionBean2.f9851f);
            e0Var.s("hardwareSize");
            this.f9858c.f(e0Var, Long.valueOf(versionBean2.f9852g));
            e0Var.s("forceUpgrade");
            this.f9859d.f(e0Var, Boolean.valueOf(versionBean2.f9853h));
            e0Var.s("uiVersionScope");
            this.f9857b.f(e0Var, versionBean2.f9854i);
            e0Var.s("appNumScope");
            this.f9857b.f(e0Var, versionBean2.f9855j);
            e0Var.k();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }

    public final String toString() {
        return "GeneratedJsonAdapter(VersionBean)";
    }
}
