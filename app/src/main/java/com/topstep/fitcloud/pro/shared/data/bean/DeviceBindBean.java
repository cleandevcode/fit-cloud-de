package com.topstep.fitcloud.pro.shared.data.bean;

import android.support.v4.media.d;
import d4.b;
import gm.l;
import kotlin.Metadata;
import mf.u;

@Metadata
@u(generateAdapter = true)
/* loaded from: classes2.dex */
public final class DeviceBindBean {

    /* renamed from: a */
    public final String f9761a;

    /* renamed from: b */
    public final String f9762b;

    /* renamed from: c */
    public final String f9763c;

    /* renamed from: d */
    public final int f9764d;

    /* renamed from: e */
    public final long f9765e;

    public DeviceBindBean(String str, String str2, String str3, int i10, long j10) {
        this.f9761a = str;
        this.f9762b = str2;
        this.f9763c = str3;
        this.f9764d = i10;
        this.f9765e = j10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof DeviceBindBean) {
            DeviceBindBean deviceBindBean = (DeviceBindBean) obj;
            return l.a(this.f9761a, deviceBindBean.f9761a) && l.a(this.f9762b, deviceBindBean.f9762b) && l.a(this.f9763c, deviceBindBean.f9763c) && this.f9764d == deviceBindBean.f9764d && this.f9765e == deviceBindBean.f9765e;
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f9761a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f9762b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f9763c;
        int hashCode3 = str3 != null ? str3.hashCode() : 0;
        long j10 = this.f9765e;
        return ((((hashCode2 + hashCode3) * 31) + this.f9764d) * 31) + ((int) (j10 ^ (j10 >>> 32)));
    }

    public final String toString() {
        StringBuilder a10 = d.a("DeviceBindBean(deviceAddress=");
        a10.append(this.f9761a);
        a10.append(", deviceName=");
        a10.append(this.f9762b);
        a10.append(", deviceHardwareInfo=");
        a10.append(this.f9763c);
        a10.append(", deviceBind=");
        a10.append(this.f9764d);
        a10.append(", deviceLastModifyTime=");
        return b.a(a10, this.f9765e, ')');
    }
}
