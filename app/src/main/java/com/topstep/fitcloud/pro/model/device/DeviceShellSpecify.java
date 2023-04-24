package com.topstep.fitcloud.pro.model.device;

import a0.a2;
import android.support.v4.media.d;
import gm.l;
import kotlin.Metadata;
import mf.u;

@Metadata
@u(generateAdapter = true)
/* loaded from: classes2.dex */
public final class DeviceShellSpecify {

    /* renamed from: a */
    public final String f9658a;

    /* renamed from: b */
    public final String f9659b;

    public DeviceShellSpecify(String str, String str2) {
        this.f9658a = str;
        this.f9659b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof DeviceShellSpecify) {
            DeviceShellSpecify deviceShellSpecify = (DeviceShellSpecify) obj;
            return l.a(this.f9658a, deviceShellSpecify.f9658a) && l.a(this.f9659b, deviceShellSpecify.f9659b);
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f9658a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f9659b;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder a10 = d.a("DeviceShellSpecify(deviceName=");
        a10.append(this.f9658a);
        a10.append(", imgUrl=");
        return a2.a(a10, this.f9659b, ')');
    }
}
