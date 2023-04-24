package com.topstep.fitcloud.pro.model.device;

import gm.l;
import kotlin.Metadata;
import mf.e0;
import mf.h0;
import mf.t;
import mf.y;
import ul.u;

@Metadata
/* loaded from: classes2.dex */
public final class DeviceShellSpecifyJsonAdapter extends t<DeviceShellSpecify> {

    /* renamed from: a */
    public final y.a f9660a;

    /* renamed from: b */
    public final t<String> f9661b;

    public DeviceShellSpecifyJsonAdapter(h0 h0Var) {
        l.f(h0Var, "moshi");
        this.f9660a = y.a.a("deviceName", "imgUrl");
        this.f9661b = h0Var.c(String.class, u.f28881a, "deviceName");
    }

    @Override // mf.t
    public final DeviceShellSpecify b(y yVar) {
        l.f(yVar, "reader");
        yVar.b();
        String str = null;
        String str2 = null;
        while (yVar.q()) {
            int L = yVar.L(this.f9660a);
            if (L == -1) {
                yVar.R();
                yVar.W();
            } else if (L == 0) {
                str = this.f9661b.b(yVar);
            } else if (L == 1) {
                str2 = this.f9661b.b(yVar);
            }
        }
        yVar.j();
        return new DeviceShellSpecify(str, str2);
    }

    @Override // mf.t
    public final void f(e0 e0Var, DeviceShellSpecify deviceShellSpecify) {
        DeviceShellSpecify deviceShellSpecify2 = deviceShellSpecify;
        l.f(e0Var, "writer");
        if (deviceShellSpecify2 != null) {
            e0Var.b();
            e0Var.s("deviceName");
            this.f9661b.f(e0Var, deviceShellSpecify2.f9658a);
            e0Var.s("imgUrl");
            this.f9661b.f(e0Var, deviceShellSpecify2.f9659b);
            e0Var.k();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }

    public final String toString() {
        return "GeneratedJsonAdapter(DeviceShellSpecify)";
    }
}
