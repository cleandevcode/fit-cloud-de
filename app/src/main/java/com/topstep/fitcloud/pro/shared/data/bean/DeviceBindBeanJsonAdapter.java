package com.topstep.fitcloud.pro.shared.data.bean;

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
public final class DeviceBindBeanJsonAdapter extends t<DeviceBindBean> {

    /* renamed from: a */
    public final y.a f9766a;

    /* renamed from: b */
    public final t<String> f9767b;

    /* renamed from: c */
    public final t<Integer> f9768c;

    /* renamed from: d */
    public final t<Long> f9769d;

    public DeviceBindBeanJsonAdapter(h0 h0Var) {
        l.f(h0Var, "moshi");
        this.f9766a = y.a.a("deviceAddress", "deviceName", "deviceHardwareInfo", "deviceBind", "deviceLastModifyTime");
        u uVar = u.f28881a;
        this.f9767b = h0Var.c(String.class, uVar, "deviceAddress");
        this.f9768c = h0Var.c(Integer.TYPE, uVar, "deviceBind");
        this.f9769d = h0Var.c(Long.TYPE, uVar, "deviceLastModifyTime");
    }

    @Override // mf.t
    public final DeviceBindBean b(y yVar) {
        l.f(yVar, "reader");
        yVar.b();
        Integer num = null;
        Long l10 = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        while (yVar.q()) {
            int L = yVar.L(this.f9766a);
            if (L == -1) {
                yVar.R();
                yVar.W();
            } else if (L == 0) {
                str = this.f9767b.b(yVar);
            } else if (L == 1) {
                str2 = this.f9767b.b(yVar);
            } else if (L == 2) {
                str3 = this.f9767b.b(yVar);
            } else if (L == 3) {
                num = this.f9768c.b(yVar);
                if (num == null) {
                    throw b.m("deviceBind", "deviceBind", yVar);
                }
            } else if (L == 4 && (l10 = this.f9769d.b(yVar)) == null) {
                throw b.m("deviceLastModifyTime", "deviceLastModifyTime", yVar);
            }
        }
        yVar.j();
        if (num != null) {
            int intValue = num.intValue();
            if (l10 != null) {
                return new DeviceBindBean(str, str2, str3, intValue, l10.longValue());
            }
            throw b.g("deviceLastModifyTime", "deviceLastModifyTime", yVar);
        }
        throw b.g("deviceBind", "deviceBind", yVar);
    }

    @Override // mf.t
    public final void f(e0 e0Var, DeviceBindBean deviceBindBean) {
        DeviceBindBean deviceBindBean2 = deviceBindBean;
        l.f(e0Var, "writer");
        if (deviceBindBean2 != null) {
            e0Var.b();
            e0Var.s("deviceAddress");
            this.f9767b.f(e0Var, deviceBindBean2.f9761a);
            e0Var.s("deviceName");
            this.f9767b.f(e0Var, deviceBindBean2.f9762b);
            e0Var.s("deviceHardwareInfo");
            this.f9767b.f(e0Var, deviceBindBean2.f9763c);
            e0Var.s("deviceBind");
            fb.b.b(deviceBindBean2.f9764d, this.f9768c, e0Var, "deviceLastModifyTime");
            this.f9769d.f(e0Var, Long.valueOf(deviceBindBean2.f9765e));
            e0Var.k();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }

    public final String toString() {
        return "GeneratedJsonAdapter(DeviceBindBean)";
    }
}
